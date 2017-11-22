package org.tetrabox.example.devs.k3dsa

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.Map
import java.util.Set
import org.eclipse.gemoc.executionframework.engine.annotations.EventEmitter
import org.eclipse.gemoc.executionframework.engine.annotations.EventHandler
import org.eclipse.gemoc.executionframework.engine.annotations.Start
import devs.AtomicModel
import devs.CoupledModel
import devs.DEVSModel
import devs.State
import java.util.List

@Aspect(className=DEVSModel)
class DEVSModelAspect {
	protected var float last = -1
	protected var float next = Float.MAX_VALUE
}

@Aspect(className=AtomicModel)
class AtomicModelAspect extends DEVSModelAspect {
	public var State state

	@Step
	@EventHandler
	public def void receiveInit(String source, float time) {
		println(_self.name + ".receiveInit("+source+", "+time+")")
		_self.state = _self.initialState
		_self.last = time
		val lifetime = _self.timeAdvance.findFirst[state == _self.state].lifetime
		if (lifetime < 0) {
			_self.next = Float.MAX_VALUE
		} else {
			_self.next = time + lifetime
		}
		sendDone(_self, _self.name, _self.next)
	}

	@Step
	@EventHandler
	public def void receiveStar(String target, float time) {
		println(_self.name + ".receiveStar("+target+", "+time+")")
		if (target == _self.name) {
			if (_self.next < Float.MAX_VALUE && time != _self.next) {
				throw new IllegalArgumentException(
					"bad synchronization: time expected to be " + _self.next + ", given " + time)
			}
			val y = _self.lambda.findFirst[state == _self.state]?.outPort
			val newState = _self.deltInt.findFirst[sourceState == _self.state]?.targetState
			if (newState !== null) {
				_self.state = newState
				_self.last = time
				val lifetime = _self.timeAdvance.findFirst[state == _self.state].lifetime
				if (lifetime < 0) {
					_self.next = Float.MAX_VALUE
				} else {
					_self.next = time + lifetime
				}
				if (y !== null) {
					sendY(_self, _self.name, y.name, time)
				}
			}
			sendDone(_self, _self.name, _self.next)
		}
	}

	@Step
	@EventHandler
	public def void receiveX(String target, String x, float time) {
		println(_self.name + ".receiveX("+target+", "+x+", "+time+")")
		if (target == _self.name) {
			if (_self.last > time || (time > _self.next && _self.next < Float.MAX_VALUE)) {
				throw new IllegalArgumentException(
					"bad synchronization: time expected to be between " + _self.last + " and " + _self.next +
						", given " + time)
			}
			val newState = _self.deltExt.findFirst[sourceState == _self.state && inPort.name == x]?.targetState
			if (newState !== null) {
				_self.state = newState
				_self.last = time
				val lifetime = _self.timeAdvance.findFirst[state == _self.state].lifetime
				if (lifetime < 0) {
					_self.next = Float.MAX_VALUE
				} else {
					_self.next = time + lifetime
				}
			}
			sendDone(_self, _self.name, _self.next)
		}
	}

	@Step
	@EventEmitter
	public def void sendY(String source, String y, float time) {}

	@Step
	@EventEmitter
	public def void sendDone(String source, float time) {
		println(_self.name + ".sendDone("+source+", "+time+")")
	}
}

@Aspect(className=CoupledModel)
class CoupledModelAspect extends DEVSModelAspect {

	private var boolean root = false
	private val Set<String> activeChildrenIDs = newHashSet
	private val Map<String, Float> eventsToProcess = newHashMap
	private val List<Float> nextList = newArrayList

	@Step
	@Start(interruptible=false)
	public def void receiveInit(String source, float time) {
		println(_self.name + ".receiveInit("+source+", "+time+")")
		if (source === null || source.empty) {
			_self.root = true
		}
		_self.last = time
		_self.activeChildrenIDs.addAll(_self.children)
		sendInit(_self, _self.name, time)
	}

	@Step
	@EventHandler
	public def void receiveStar(String target, float time) {
		println(_self.name + ".receiveStar("+target+", "+time+")")
		if (target == _self.name) {
			val imminentList = _self.eventsToProcess.entrySet.filter[e|e.value == time].map[e|e.key]
			val name = imminentList.head // TODO select function
			_self.activeChildrenIDs.add(name)
			_self.eventsToProcess.remove(name)
			_self.last = time
			sendStar(_self, name, time)
		}
	}

	@Step
	@EventHandler
	public def void receiveX(String target, String x, float time) {
		println(_self.name + ".receiveX("+target+", "+x+", "+time+")")
		if (target == _self.name) {
			val iicouplings = _self.externalInputCouplings.filter[c|c.outPort == x]
			_self.activeChildrenIDs.addAll(iicouplings.map[c|c.dest])
			if (!iicouplings.empty) {
				iicouplings.forEach[c|sendX(_self, c.dest, c.inPort, time)]
			}
			_self.last = time
		}
	}

	@Step
	@EventHandler
	public def void receiveY(String source, String y, float time) {
		println(_self.name + ".receiveY("+source+", "+y+", "+time+")")
		val iocouplings = _self.internalCouplings.filter[c|c.src == source && c.outPort == y]
		_self.activeChildrenIDs.addAll(iocouplings.map[c|c.dest])
		if (!iocouplings.empty) {
			iocouplings.forEach[c|sendX(_self, c.dest, c.inPort, time)]
		}
		val oocouplings = _self.outputCouplings.filter[c|c.src == source && c.outPort == y]
		if (!oocouplings.empty) {
			oocouplings.forEach[c|sendY(_self, _self.name, c.inPort, time)]
		}
	}

	@Step
	@EventHandler
	public def void receiveDone(String source, float time) {
		println(_self.name + ".receiveDone("+source+", "+time+")")
		_self.eventsToProcess.put(source, time)
		_self.nextList.add(time)

		_self.activeChildrenIDs.remove(source)

		if (_self.activeChildrenIDs.empty) {
			_self.next = _self.nextList.min
			_self.nextList.clear
			if (_self.root) {
				receiveStar(_self, _self.name, _self.next)
			} else {
				sendDone(_self, _self.name, _self.next)
			}
		}
	}

	@Step
	@EventEmitter
	public def void sendInit(String source, float time) {}

	@Step
	@EventEmitter
	public def void sendStar(String target, float time) {}

	@Step
	@EventEmitter
	public def void sendX(String target, String x, float time) {}

	@Step
	@EventEmitter
	public def void sendY(String source, String y, float time) {}

	@Step
	@EventEmitter
	public def void sendDone(String source, float time) {}
}
