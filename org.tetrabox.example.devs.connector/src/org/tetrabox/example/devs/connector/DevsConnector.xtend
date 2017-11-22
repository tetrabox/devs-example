package org.tetrabox.example.devs.connector

import devs.AtomicModel
import devs.CoupledModel
import devs.DEVSModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.gemoc.executionframework.event.connector.AbstractBidirirectionalConnector
import org.eclipse.gemoc.executionframework.event.model.event.Event
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine
import org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent
import org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent
import org.tetrabox.example.devs.event.devsevent.DevsDSLEvent
import org.tetrabox.example.devs.event.devsevent.DevseventFactory
import org.tetrabox.example.devs.event.devsevent.DevseventPackage

class DevsConnector extends AbstractBidirirectionalConnector {
	private val factory = DevseventFactory::eINSTANCE
	
	public new(IExecutionEngine engineA, IExecutionEngine engineB) {
		super(engineA, engineB)
	}
	
	override protected DevsDSLEvent translateEvent(Event event, Resource target) {
		if (event instanceof DevsDSLEvent) {
			val int classifierID = event.eClass().getClassifierID();
			switch (classifierID) {
			case DevseventPackage::ATOMIC_MODEL_SEND_DONE_EVENT:
				return translateEvent(event as AtomicModelSendDoneEvent, target)
			case DevseventPackage::ATOMIC_MODEL_SEND_YEVENT:
				return translateEvent(event as AtomicModelSendYEvent, target)
			case DevseventPackage::COUPLED_MODEL_SEND_DONE_EVENT:
				return translateEvent(event as CoupledModelSendDoneEvent, target)
			case DevseventPackage::COUPLED_MODEL_SEND_INIT_EVENT:
				return translateEvent(event as CoupledModelSendInitEvent, target)
			case DevseventPackage::COUPLED_MODEL_SEND_STAR_EVENT:
				return translateEvent(event as CoupledModelSendStarEvent, target)
			case DevseventPackage::COUPLED_MODEL_SEND_XEVENT:
				return translateEvent(event as CoupledModelSendXEvent, target)
			case DevseventPackage::COUPLED_MODEL_SEND_YEVENT:
				return translateEvent(event as CoupledModelSendYEvent, target)
			}
		}
		return null;
	}
	
	def private DevsDSLEvent translateEvent(AtomicModelSendDoneEvent event, Resource target) {
		val targetObject = target.allContents.filter(DEVSModel).findFirst[true]
		if (targetObject instanceof CoupledModel) {
			val result = factory.createCoupledModelReceiveDoneEvent
			result.coupledModel = targetObject
			result.source = event.source
			result.time = event.time
			return result
		}
		return null;
	}
	
	def private DevsDSLEvent translateEvent(AtomicModelSendYEvent event, Resource target) {
		val targetObject = target.allContents.filter(DEVSModel).findFirst[true]
		if (targetObject instanceof CoupledModel) {
			val result = factory.createCoupledModelReceiveYEvent
			result.coupledModel = targetObject
			result.source = event.source
			result.time = event.time
			result.y = event.y
			return result
		}
		return null;
	}
	
	def private DevsDSLEvent translateEvent(CoupledModelSendDoneEvent event, Resource target) {
		val targetObject = target.allContents.filter(DEVSModel).findFirst[true]
		if (targetObject instanceof CoupledModel) {
			val result = factory.createCoupledModelReceiveDoneEvent
			result.coupledModel = targetObject
			result.source = event.source
			result.time = event.time
			return result
		}
		return null;
	}
	
	def private DevsDSLEvent translateEvent(CoupledModelSendInitEvent event, Resource target) {
		val targetObject = target.allContents.filter(DEVSModel).findFirst[true]
		if (targetObject instanceof CoupledModel) {
			val result = factory.createCoupledModelReceiveInitEvent
			result.coupledModel = targetObject
			result.source = event.source
			result.time = event.time
			return result
		} else if (targetObject instanceof AtomicModel) {
			val result = factory.createAtomicModelReceiveInitEvent
			result.atomicModel = targetObject
			result.source = event.source
			result.time = event.time
			return result
		}
		return null;
	}
	
	def private DevsDSLEvent translateEvent(CoupledModelSendStarEvent event, Resource target) {
		val targetObject = target.allContents.filter(DEVSModel).findFirst[true]
		if (targetObject instanceof CoupledModel) {
			val result = factory.createCoupledModelReceiveStarEvent
			result.coupledModel = targetObject
			result.target = event.target
			result.time = event.time
			return result
		} else if (targetObject instanceof AtomicModel) {
			val result = factory.createAtomicModelReceiveStarEvent
			result.atomicModel = targetObject
			result.target = event.target
			result.time = event.time
			return result
		}
		return null;
	}
	
	def private DevsDSLEvent translateEvent(CoupledModelSendXEvent event, Resource target) {
		val targetObject = target.allContents.filter(DEVSModel).findFirst[true]
		if (targetObject instanceof CoupledModel) {
			val result = factory.createCoupledModelReceiveXEvent
			result.coupledModel = targetObject
			result.target = event.target
			result.time = event.time
			result.x = event.x
			return result
		} else if (targetObject instanceof AtomicModel) {
			val result = factory.createAtomicModelReceiveXEvent
			result.atomicModel = targetObject
			result.target = event.target
			result.time = event.time
			result.x = event.x
			return result
		}
		return null;
	}
	
	def private DevsDSLEvent translateEvent(CoupledModelSendYEvent event, Resource target) {
		val targetObject = target.allContents.filter(DEVSModel).findFirst[true]
		if (targetObject instanceof CoupledModel) {
			val result = factory.createCoupledModelReceiveYEvent
			result.coupledModel = targetObject
			result.source = event.source
			result.time = event.time
			result.y = event.y
			return result
		}
		return null;
	}
}