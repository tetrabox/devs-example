/**
 */
package org.tetrabox.example.devs.event.devsevent.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.executionframework.event.model.event.Event;

import org.tetrabox.example.devs.event.devsevent.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage
 * @generated
 */
public class DevseventSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevseventPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevseventSwitch() {
		if (modelPackage == null) {
			modelPackage = DevseventPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DevseventPackage.DEVS_DSL_EVENT: {
				DevsDSLEvent devsDSLEvent = (DevsDSLEvent)theEObject;
				T result = caseDevsDSLEvent(devsDSLEvent);
				if (result == null) result = caseEvent(devsDSLEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.ATOMIC_MODEL_EVENT: {
				AtomicModelEvent atomicModelEvent = (AtomicModelEvent)theEObject;
				T result = caseAtomicModelEvent(atomicModelEvent);
				if (result == null) result = caseDevsDSLEvent(atomicModelEvent);
				if (result == null) result = caseEvent(atomicModelEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT: {
				AtomicModelReceiveXEvent atomicModelReceiveXEvent = (AtomicModelReceiveXEvent)theEObject;
				T result = caseAtomicModelReceiveXEvent(atomicModelReceiveXEvent);
				if (result == null) result = caseAtomicModelEvent(atomicModelReceiveXEvent);
				if (result == null) result = caseDevsDSLEvent(atomicModelReceiveXEvent);
				if (result == null) result = caseEvent(atomicModelReceiveXEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_EVENT: {
				CoupledModelEvent coupledModelEvent = (CoupledModelEvent)theEObject;
				T result = caseCoupledModelEvent(coupledModelEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelEvent);
				if (result == null) result = caseEvent(coupledModelEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_RECEIVE_XEVENT: {
				CoupledModelReceiveXEvent coupledModelReceiveXEvent = (CoupledModelReceiveXEvent)theEObject;
				T result = caseCoupledModelReceiveXEvent(coupledModelReceiveXEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelReceiveXEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelReceiveXEvent);
				if (result == null) result = caseEvent(coupledModelReceiveXEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.ATOMIC_MODEL_SEND_DONE_EVENT: {
				AtomicModelSendDoneEvent atomicModelSendDoneEvent = (AtomicModelSendDoneEvent)theEObject;
				T result = caseAtomicModelSendDoneEvent(atomicModelSendDoneEvent);
				if (result == null) result = caseAtomicModelEvent(atomicModelSendDoneEvent);
				if (result == null) result = caseDevsDSLEvent(atomicModelSendDoneEvent);
				if (result == null) result = caseEvent(atomicModelSendDoneEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_INIT_EVENT: {
				AtomicModelReceiveInitEvent atomicModelReceiveInitEvent = (AtomicModelReceiveInitEvent)theEObject;
				T result = caseAtomicModelReceiveInitEvent(atomicModelReceiveInitEvent);
				if (result == null) result = caseAtomicModelEvent(atomicModelReceiveInitEvent);
				if (result == null) result = caseDevsDSLEvent(atomicModelReceiveInitEvent);
				if (result == null) result = caseEvent(atomicModelReceiveInitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_RECEIVE_STAR_EVENT: {
				CoupledModelReceiveStarEvent coupledModelReceiveStarEvent = (CoupledModelReceiveStarEvent)theEObject;
				T result = caseCoupledModelReceiveStarEvent(coupledModelReceiveStarEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelReceiveStarEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelReceiveStarEvent);
				if (result == null) result = caseEvent(coupledModelReceiveStarEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_RECEIVE_YEVENT: {
				CoupledModelReceiveYEvent coupledModelReceiveYEvent = (CoupledModelReceiveYEvent)theEObject;
				T result = caseCoupledModelReceiveYEvent(coupledModelReceiveYEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelReceiveYEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelReceiveYEvent);
				if (result == null) result = caseEvent(coupledModelReceiveYEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.ATOMIC_MODEL_SEND_YEVENT: {
				AtomicModelSendYEvent atomicModelSendYEvent = (AtomicModelSendYEvent)theEObject;
				T result = caseAtomicModelSendYEvent(atomicModelSendYEvent);
				if (result == null) result = caseAtomicModelEvent(atomicModelSendYEvent);
				if (result == null) result = caseDevsDSLEvent(atomicModelSendYEvent);
				if (result == null) result = caseEvent(atomicModelSendYEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_STAR_EVENT: {
				AtomicModelReceiveStarEvent atomicModelReceiveStarEvent = (AtomicModelReceiveStarEvent)theEObject;
				T result = caseAtomicModelReceiveStarEvent(atomicModelReceiveStarEvent);
				if (result == null) result = caseAtomicModelEvent(atomicModelReceiveStarEvent);
				if (result == null) result = caseDevsDSLEvent(atomicModelReceiveStarEvent);
				if (result == null) result = caseEvent(atomicModelReceiveStarEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_RECEIVE_DONE_EVENT: {
				CoupledModelReceiveDoneEvent coupledModelReceiveDoneEvent = (CoupledModelReceiveDoneEvent)theEObject;
				T result = caseCoupledModelReceiveDoneEvent(coupledModelReceiveDoneEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelReceiveDoneEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelReceiveDoneEvent);
				if (result == null) result = caseEvent(coupledModelReceiveDoneEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_SEND_YEVENT: {
				CoupledModelSendYEvent coupledModelSendYEvent = (CoupledModelSendYEvent)theEObject;
				T result = caseCoupledModelSendYEvent(coupledModelSendYEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelSendYEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelSendYEvent);
				if (result == null) result = caseEvent(coupledModelSendYEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_SEND_STAR_EVENT: {
				CoupledModelSendStarEvent coupledModelSendStarEvent = (CoupledModelSendStarEvent)theEObject;
				T result = caseCoupledModelSendStarEvent(coupledModelSendStarEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelSendStarEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelSendStarEvent);
				if (result == null) result = caseEvent(coupledModelSendStarEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_SEND_INIT_EVENT: {
				CoupledModelSendInitEvent coupledModelSendInitEvent = (CoupledModelSendInitEvent)theEObject;
				T result = caseCoupledModelSendInitEvent(coupledModelSendInitEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelSendInitEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelSendInitEvent);
				if (result == null) result = caseEvent(coupledModelSendInitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_RECEIVE_INIT_EVENT: {
				CoupledModelReceiveInitEvent coupledModelReceiveInitEvent = (CoupledModelReceiveInitEvent)theEObject;
				T result = caseCoupledModelReceiveInitEvent(coupledModelReceiveInitEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelReceiveInitEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelReceiveInitEvent);
				if (result == null) result = caseEvent(coupledModelReceiveInitEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_SEND_DONE_EVENT: {
				CoupledModelSendDoneEvent coupledModelSendDoneEvent = (CoupledModelSendDoneEvent)theEObject;
				T result = caseCoupledModelSendDoneEvent(coupledModelSendDoneEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelSendDoneEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelSendDoneEvent);
				if (result == null) result = caseEvent(coupledModelSendDoneEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DevseventPackage.COUPLED_MODEL_SEND_XEVENT: {
				CoupledModelSendXEvent coupledModelSendXEvent = (CoupledModelSendXEvent)theEObject;
				T result = caseCoupledModelSendXEvent(coupledModelSendXEvent);
				if (result == null) result = caseCoupledModelEvent(coupledModelSendXEvent);
				if (result == null) result = caseDevsDSLEvent(coupledModelSendXEvent);
				if (result == null) result = caseEvent(coupledModelSendXEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Devs DSL Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Devs DSL Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevsDSLEvent(DevsDSLEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelEvent(AtomicModelEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Receive XEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Receive XEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelReceiveXEvent(AtomicModelReceiveXEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelEvent(CoupledModelEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Receive XEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Receive XEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelReceiveXEvent(CoupledModelReceiveXEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Send Done Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Send Done Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelSendDoneEvent(AtomicModelSendDoneEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Receive Init Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Receive Init Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelReceiveInitEvent(AtomicModelReceiveInitEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Receive Star Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Receive Star Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelReceiveStarEvent(CoupledModelReceiveStarEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Receive YEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Receive YEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelReceiveYEvent(CoupledModelReceiveYEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Send YEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Send YEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelSendYEvent(AtomicModelSendYEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Receive Star Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Receive Star Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelReceiveStarEvent(AtomicModelReceiveStarEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Receive Done Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Receive Done Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelReceiveDoneEvent(CoupledModelReceiveDoneEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Send YEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Send YEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelSendYEvent(CoupledModelSendYEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Send Star Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Send Star Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelSendStarEvent(CoupledModelSendStarEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Send Init Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Send Init Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelSendInitEvent(CoupledModelSendInitEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Receive Init Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Receive Init Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelReceiveInitEvent(CoupledModelReceiveInitEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Send Done Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Send Done Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelSendDoneEvent(CoupledModelSendDoneEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupled Model Send XEvent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupled Model Send XEvent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupledModelSendXEvent(CoupledModelSendXEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DevseventSwitch
