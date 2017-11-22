/**
 */
package org.tetrabox.example.devs.event.devsevent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.devs.event.devsevent.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevseventFactoryImpl extends EFactoryImpl implements DevseventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DevseventFactory init() {
		try {
			DevseventFactory theDevseventFactory = (DevseventFactory)EPackage.Registry.INSTANCE.getEFactory(DevseventPackage.eNS_URI);
			if (theDevseventFactory != null) {
				return theDevseventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevseventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevseventFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT: return createAtomicModelReceiveXEvent();
			case DevseventPackage.COUPLED_MODEL_RECEIVE_XEVENT: return createCoupledModelReceiveXEvent();
			case DevseventPackage.ATOMIC_MODEL_SEND_DONE_EVENT: return createAtomicModelSendDoneEvent();
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_INIT_EVENT: return createAtomicModelReceiveInitEvent();
			case DevseventPackage.COUPLED_MODEL_RECEIVE_STAR_EVENT: return createCoupledModelReceiveStarEvent();
			case DevseventPackage.COUPLED_MODEL_RECEIVE_YEVENT: return createCoupledModelReceiveYEvent();
			case DevseventPackage.ATOMIC_MODEL_SEND_YEVENT: return createAtomicModelSendYEvent();
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_STAR_EVENT: return createAtomicModelReceiveStarEvent();
			case DevseventPackage.COUPLED_MODEL_RECEIVE_DONE_EVENT: return createCoupledModelReceiveDoneEvent();
			case DevseventPackage.COUPLED_MODEL_SEND_YEVENT: return createCoupledModelSendYEvent();
			case DevseventPackage.COUPLED_MODEL_SEND_STAR_EVENT: return createCoupledModelSendStarEvent();
			case DevseventPackage.COUPLED_MODEL_SEND_INIT_EVENT: return createCoupledModelSendInitEvent();
			case DevseventPackage.COUPLED_MODEL_RECEIVE_INIT_EVENT: return createCoupledModelReceiveInitEvent();
			case DevseventPackage.COUPLED_MODEL_SEND_DONE_EVENT: return createCoupledModelSendDoneEvent();
			case DevseventPackage.COUPLED_MODEL_SEND_XEVENT: return createCoupledModelSendXEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelReceiveXEvent createAtomicModelReceiveXEvent() {
		AtomicModelReceiveXEventImpl atomicModelReceiveXEvent = new AtomicModelReceiveXEventImpl();
		return atomicModelReceiveXEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelReceiveXEvent createCoupledModelReceiveXEvent() {
		CoupledModelReceiveXEventImpl coupledModelReceiveXEvent = new CoupledModelReceiveXEventImpl();
		return coupledModelReceiveXEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelSendDoneEvent createAtomicModelSendDoneEvent() {
		AtomicModelSendDoneEventImpl atomicModelSendDoneEvent = new AtomicModelSendDoneEventImpl();
		return atomicModelSendDoneEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelReceiveInitEvent createAtomicModelReceiveInitEvent() {
		AtomicModelReceiveInitEventImpl atomicModelReceiveInitEvent = new AtomicModelReceiveInitEventImpl();
		return atomicModelReceiveInitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelReceiveStarEvent createCoupledModelReceiveStarEvent() {
		CoupledModelReceiveStarEventImpl coupledModelReceiveStarEvent = new CoupledModelReceiveStarEventImpl();
		return coupledModelReceiveStarEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelReceiveYEvent createCoupledModelReceiveYEvent() {
		CoupledModelReceiveYEventImpl coupledModelReceiveYEvent = new CoupledModelReceiveYEventImpl();
		return coupledModelReceiveYEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelSendYEvent createAtomicModelSendYEvent() {
		AtomicModelSendYEventImpl atomicModelSendYEvent = new AtomicModelSendYEventImpl();
		return atomicModelSendYEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelReceiveStarEvent createAtomicModelReceiveStarEvent() {
		AtomicModelReceiveStarEventImpl atomicModelReceiveStarEvent = new AtomicModelReceiveStarEventImpl();
		return atomicModelReceiveStarEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelReceiveDoneEvent createCoupledModelReceiveDoneEvent() {
		CoupledModelReceiveDoneEventImpl coupledModelReceiveDoneEvent = new CoupledModelReceiveDoneEventImpl();
		return coupledModelReceiveDoneEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelSendYEvent createCoupledModelSendYEvent() {
		CoupledModelSendYEventImpl coupledModelSendYEvent = new CoupledModelSendYEventImpl();
		return coupledModelSendYEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelSendStarEvent createCoupledModelSendStarEvent() {
		CoupledModelSendStarEventImpl coupledModelSendStarEvent = new CoupledModelSendStarEventImpl();
		return coupledModelSendStarEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelSendInitEvent createCoupledModelSendInitEvent() {
		CoupledModelSendInitEventImpl coupledModelSendInitEvent = new CoupledModelSendInitEventImpl();
		return coupledModelSendInitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelReceiveInitEvent createCoupledModelReceiveInitEvent() {
		CoupledModelReceiveInitEventImpl coupledModelReceiveInitEvent = new CoupledModelReceiveInitEventImpl();
		return coupledModelReceiveInitEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelSendDoneEvent createCoupledModelSendDoneEvent() {
		CoupledModelSendDoneEventImpl coupledModelSendDoneEvent = new CoupledModelSendDoneEventImpl();
		return coupledModelSendDoneEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModelSendXEvent createCoupledModelSendXEvent() {
		CoupledModelSendXEventImpl coupledModelSendXEvent = new CoupledModelSendXEventImpl();
		return coupledModelSendXEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevseventPackage getDevseventPackage() {
		return (DevseventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DevseventPackage getPackage() {
		return DevseventPackage.eINSTANCE;
	}

} //DevseventFactoryImpl
