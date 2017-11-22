package org.tetrabox.example.devs.eventinterpreter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gemoc.executionframework.event.manager.IBehavioralAPI;
import org.eclipse.gemoc.executionframework.event.model.event.Event;
import org.tetrabox.example.devs.event.devsevent.DevseventPackage;
import org.tetrabox.example.devs.event.devsevent.DevseventFactory;
import org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent;
import devs.AtomicModel;
import devs.CoupledModel;
import devs.DevsPackage;
import org.tetrabox.example.devs.k3dsa.AtomicModelAspect;
import org.tetrabox.example.devs.k3dsa.CoupledModelAspect;

public class DevsBehavioralAPI implements IBehavioralAPI {

	private final Set<EClass> eventClasses = new HashSet<>();
	private final Set<EClass> startEventClasses = new HashSet<>();
	private final Set<EClass> interruptibleEventClasses = new HashSet<>();
	
	public DevsBehavioralAPI() {
		eventClasses.add(DevseventPackage.eINSTANCE.getAtomicModelReceiveInitEvent());
		eventClasses.add(DevseventPackage.eINSTANCE.getCoupledModelReceiveYEvent());
		eventClasses.add(DevseventPackage.eINSTANCE.getCoupledModelReceiveStarEvent());
		eventClasses.add(DevseventPackage.eINSTANCE.getAtomicModelReceiveXEvent());
		eventClasses.add(DevseventPackage.eINSTANCE.getCoupledModelReceiveDoneEvent());
		eventClasses.add(DevseventPackage.eINSTANCE.getAtomicModelReceiveStarEvent());
		eventClasses.add(DevseventPackage.eINSTANCE.getCoupledModelReceiveXEvent());
		eventClasses.add(DevseventPackage.eINSTANCE.getCoupledModelReceiveInitEvent());
		startEventClasses.add(DevseventPackage.eINSTANCE.getCoupledModelReceiveInitEvent());
	}
	
	@Override
	public boolean canSendEvent(Event _event) {
		if (_event instanceof AtomicModelReceiveInitEvent) {
			return true;
		} else
		if (_event instanceof CoupledModelReceiveYEvent) {
			return true;
		} else
		if (_event instanceof CoupledModelReceiveStarEvent) {
			return true;
		} else
		if (_event instanceof AtomicModelReceiveXEvent) {
			return true;
		} else
		if (_event instanceof CoupledModelReceiveDoneEvent) {
			return true;
		} else
		if (_event instanceof AtomicModelReceiveStarEvent) {
			return true;
		} else
		if (_event instanceof CoupledModelReceiveXEvent) {
			return true;
		} else
		if (_event instanceof CoupledModelReceiveInitEvent) {
			return true;
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		return eventClasses;
	}
	
	@Override
	public Set<EClass> getStartEventClasses() {
		final Set<EClass> eventClasses = new HashSet<>();
		eventClasses.add(DevseventPackage.eINSTANCE.getCoupledModelReceiveInitEvent());
		return eventClasses;
	}
	
	@Override
	public boolean isInterruptible(EClass eventClass) {
		return interruptibleEventClasses.contains(eventClass);
	}
	
	@Override
	public void dispatchEvent(Event _event) {
		if (_event instanceof AtomicModelReceiveInitEvent) {
			handleAtomicModelReceiveInitEvent((AtomicModelReceiveInitEvent) _event);
		} else
		if (_event instanceof CoupledModelReceiveYEvent) {
			handleCoupledModelReceiveYEvent((CoupledModelReceiveYEvent) _event);
		} else
		if (_event instanceof CoupledModelReceiveStarEvent) {
			handleCoupledModelReceiveStarEvent((CoupledModelReceiveStarEvent) _event);
		} else
		if (_event instanceof AtomicModelReceiveXEvent) {
			handleAtomicModelReceiveXEvent((AtomicModelReceiveXEvent) _event);
		} else
		if (_event instanceof CoupledModelReceiveDoneEvent) {
			handleCoupledModelReceiveDoneEvent((CoupledModelReceiveDoneEvent) _event);
		} else
		if (_event instanceof AtomicModelReceiveStarEvent) {
			handleAtomicModelReceiveStarEvent((AtomicModelReceiveStarEvent) _event);
		} else
		if (_event instanceof CoupledModelReceiveXEvent) {
			handleCoupledModelReceiveXEvent((CoupledModelReceiveXEvent) _event);
		} else
		if (_event instanceof CoupledModelReceiveInitEvent) {
			handleCoupledModelReceiveInitEvent((CoupledModelReceiveInitEvent) _event);
		}
	}
	
	private void handleAtomicModelReceiveInitEvent(AtomicModelReceiveInitEvent _event) {
		final AtomicModel atomicModel = _event.getAtomicModel();
		final String source = _event.getSource();
		final float time = _event.getTime();
		AtomicModelAspect.receiveInit(atomicModel, source, time);
	}
	
	private void handleCoupledModelReceiveYEvent(CoupledModelReceiveYEvent _event) {
		final CoupledModel coupledModel = _event.getCoupledModel();
		final String source = _event.getSource();
		final String y = _event.getY();
		final float time = _event.getTime();
		CoupledModelAspect.receiveY(coupledModel, source, y, time);
	}
	
	private void handleCoupledModelReceiveStarEvent(CoupledModelReceiveStarEvent _event) {
		final CoupledModel coupledModel = _event.getCoupledModel();
		final String target = _event.getTarget();
		final float time = _event.getTime();
		CoupledModelAspect.receiveStar(coupledModel, target, time);
	}
	
	private void handleAtomicModelReceiveXEvent(AtomicModelReceiveXEvent _event) {
		final AtomicModel atomicModel = _event.getAtomicModel();
		final String target = _event.getTarget();
		final String x = _event.getX();
		final float time = _event.getTime();
		AtomicModelAspect.receiveX(atomicModel, target, x, time);
	}
	
	private void handleCoupledModelReceiveDoneEvent(CoupledModelReceiveDoneEvent _event) {
		final CoupledModel coupledModel = _event.getCoupledModel();
		final String source = _event.getSource();
		final float time = _event.getTime();
		CoupledModelAspect.receiveDone(coupledModel, source, time);
	}
	
	private void handleAtomicModelReceiveStarEvent(AtomicModelReceiveStarEvent _event) {
		final AtomicModel atomicModel = _event.getAtomicModel();
		final String target = _event.getTarget();
		final float time = _event.getTime();
		AtomicModelAspect.receiveStar(atomicModel, target, time);
	}
	
	private void handleCoupledModelReceiveXEvent(CoupledModelReceiveXEvent _event) {
		final CoupledModel coupledModel = _event.getCoupledModel();
		final String target = _event.getTarget();
		final String x = _event.getX();
		final float time = _event.getTime();
		CoupledModelAspect.receiveX(coupledModel, target, x, time);
	}
	
	private void handleCoupledModelReceiveInitEvent(CoupledModelReceiveInitEvent _event) {
		final CoupledModel coupledModel = _event.getCoupledModel();
		final String source = _event.getSource();
		final float time = _event.getTime();
		CoupledModelAspect.receiveInit(coupledModel, source, time);
	}
	
	@Override
	public Event getOutputEvent(EOperation operation, EObject caller, List<Object> parameters) {
		if (operation.getName().equals("sendInit") && caller instanceof CoupledModel) {
			return getCoupledModelSendInitEvent((CoupledModel) caller, (String) parameters.get(0), (float) parameters.get(1));
		} else
		if (operation.getName().equals("sendDone") && caller instanceof AtomicModel) {
			return getAtomicModelSendDoneEvent((AtomicModel) caller, (String) parameters.get(0), (float) parameters.get(1));
		} else
		if (operation.getName().equals("sendDone") && caller instanceof CoupledModel) {
			return getCoupledModelSendDoneEvent((CoupledModel) caller, (String) parameters.get(0), (float) parameters.get(1));
		} else
		if (operation.getName().equals("sendY") && caller instanceof CoupledModel) {
			return getCoupledModelSendYEvent((CoupledModel) caller, (String) parameters.get(0), (String) parameters.get(1), (float) parameters.get(2));
		} else
		if (operation.getName().equals("sendY") && caller instanceof AtomicModel) {
			return getAtomicModelSendYEvent((AtomicModel) caller, (String) parameters.get(0), (String) parameters.get(1), (float) parameters.get(2));
		} else
		if (operation.getName().equals("sendStar") && caller instanceof CoupledModel) {
			return getCoupledModelSendStarEvent((CoupledModel) caller, (String) parameters.get(0), (float) parameters.get(1));
		} else
		if (operation.getName().equals("sendX") && caller instanceof CoupledModel) {
			return getCoupledModelSendXEvent((CoupledModel) caller, (String) parameters.get(0), (String) parameters.get(1), (float) parameters.get(2));
		}
		return null;
	}
	
	private Event getCoupledModelSendInitEvent(CoupledModel caller, String source, float time) {
		final CoupledModelSendInitEvent _event = DevseventFactory.eINSTANCE.createCoupledModelSendInitEvent();
		_event.setCoupledModel(caller);
		_event.setSource(source);
		_event.setTime(time);
		return _event;
	}
	
	private Event getAtomicModelSendDoneEvent(AtomicModel caller, String source, float time) {
		final AtomicModelSendDoneEvent _event = DevseventFactory.eINSTANCE.createAtomicModelSendDoneEvent();
		_event.setAtomicModel(caller);
		_event.setSource(source);
		_event.setTime(time);
		return _event;
	}
	
	private Event getCoupledModelSendDoneEvent(CoupledModel caller, String source, float time) {
		final CoupledModelSendDoneEvent _event = DevseventFactory.eINSTANCE.createCoupledModelSendDoneEvent();
		_event.setCoupledModel(caller);
		_event.setSource(source);
		_event.setTime(time);
		return _event;
	}
	
	private Event getCoupledModelSendYEvent(CoupledModel caller, String source, String y, float time) {
		final CoupledModelSendYEvent _event = DevseventFactory.eINSTANCE.createCoupledModelSendYEvent();
		_event.setCoupledModel(caller);
		_event.setSource(source);
		_event.setY(y);
		_event.setTime(time);
		return _event;
	}
	
	private Event getAtomicModelSendYEvent(AtomicModel caller, String source, String y, float time) {
		final AtomicModelSendYEvent _event = DevseventFactory.eINSTANCE.createAtomicModelSendYEvent();
		_event.setAtomicModel(caller);
		_event.setSource(source);
		_event.setY(y);
		_event.setTime(time);
		return _event;
	}
	
	private Event getCoupledModelSendStarEvent(CoupledModel caller, String target, float time) {
		final CoupledModelSendStarEvent _event = DevseventFactory.eINSTANCE.createCoupledModelSendStarEvent();
		_event.setCoupledModel(caller);
		_event.setTarget(target);
		_event.setTime(time);
		return _event;
	}
	
	private Event getCoupledModelSendXEvent(CoupledModel caller, String target, String x, float time) {
		final CoupledModelSendXEvent _event = DevseventFactory.eINSTANCE.createCoupledModelSendXEvent();
		_event.setCoupledModel(caller);
		_event.setTarget(target);
		_event.setX(x);
		_event.setTime(time);
		return _event;
	}
	
	@Override
	public boolean canHandle(EPackage pkg) {
		return pkg == DevsPackage.eINSTANCE;
	}
	
}
