/**
 */
package org.tetrabox.example.devs.event.devsevent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage
 * @generated
 */
public interface DevseventFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevseventFactory eINSTANCE = org.tetrabox.example.devs.event.devsevent.impl.DevseventFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Atomic Model Receive XEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model Receive XEvent</em>'.
	 * @generated
	 */
	AtomicModelReceiveXEvent createAtomicModelReceiveXEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Receive XEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Receive XEvent</em>'.
	 * @generated
	 */
	CoupledModelReceiveXEvent createCoupledModelReceiveXEvent();

	/**
	 * Returns a new object of class '<em>Atomic Model Send Done Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model Send Done Event</em>'.
	 * @generated
	 */
	AtomicModelSendDoneEvent createAtomicModelSendDoneEvent();

	/**
	 * Returns a new object of class '<em>Atomic Model Receive Init Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model Receive Init Event</em>'.
	 * @generated
	 */
	AtomicModelReceiveInitEvent createAtomicModelReceiveInitEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Receive Star Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Receive Star Event</em>'.
	 * @generated
	 */
	CoupledModelReceiveStarEvent createCoupledModelReceiveStarEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Receive YEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Receive YEvent</em>'.
	 * @generated
	 */
	CoupledModelReceiveYEvent createCoupledModelReceiveYEvent();

	/**
	 * Returns a new object of class '<em>Atomic Model Send YEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model Send YEvent</em>'.
	 * @generated
	 */
	AtomicModelSendYEvent createAtomicModelSendYEvent();

	/**
	 * Returns a new object of class '<em>Atomic Model Receive Star Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model Receive Star Event</em>'.
	 * @generated
	 */
	AtomicModelReceiveStarEvent createAtomicModelReceiveStarEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Receive Done Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Receive Done Event</em>'.
	 * @generated
	 */
	CoupledModelReceiveDoneEvent createCoupledModelReceiveDoneEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Send YEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Send YEvent</em>'.
	 * @generated
	 */
	CoupledModelSendYEvent createCoupledModelSendYEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Send Star Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Send Star Event</em>'.
	 * @generated
	 */
	CoupledModelSendStarEvent createCoupledModelSendStarEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Send Init Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Send Init Event</em>'.
	 * @generated
	 */
	CoupledModelSendInitEvent createCoupledModelSendInitEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Receive Init Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Receive Init Event</em>'.
	 * @generated
	 */
	CoupledModelReceiveInitEvent createCoupledModelReceiveInitEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Send Done Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Send Done Event</em>'.
	 * @generated
	 */
	CoupledModelSendDoneEvent createCoupledModelSendDoneEvent();

	/**
	 * Returns a new object of class '<em>Coupled Model Send XEvent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model Send XEvent</em>'.
	 * @generated
	 */
	CoupledModelSendXEvent createCoupledModelSendXEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevseventPackage getDevseventPackage();

} //DevseventFactory
