/**
 */
package devs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see devs.DevsPackage
 * @generated
 */
public interface DevsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevsFactory eINSTANCE = devs.impl.DevsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DEVS Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DEVS Model</em>'.
	 * @generated
	 */
	DEVSModel createDEVSModel();

	/**
	 * Returns a new object of class '<em>Atomic Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Model</em>'.
	 * @generated
	 */
	AtomicModel createAtomicModel();

	/**
	 * Returns a new object of class '<em>Coupled Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupled Model</em>'.
	 * @generated
	 */
	CoupledModel createCoupledModel();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Time Advance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Advance</em>'.
	 * @generated
	 */
	TimeAdvance createTimeAdvance();

	/**
	 * Returns a new object of class '<em>Lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lambda</em>'.
	 * @generated
	 */
	Lambda createLambda();

	/**
	 * Returns a new object of class '<em>Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Port</em>'.
	 * @generated
	 */
	OutPort createOutPort();

	/**
	 * Returns a new object of class '<em>In Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Port</em>'.
	 * @generated
	 */
	InPort createInPort();

	/**
	 * Returns a new object of class '<em>Internal Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Transition</em>'.
	 * @generated
	 */
	InternalTransition createInternalTransition();

	/**
	 * Returns a new object of class '<em>External Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Transition</em>'.
	 * @generated
	 */
	ExternalTransition createExternalTransition();

	/**
	 * Returns a new object of class '<em>External Input Coupling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Input Coupling</em>'.
	 * @generated
	 */
	ExternalInputCoupling createExternalInputCoupling();

	/**
	 * Returns a new object of class '<em>Internal Coupling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Coupling</em>'.
	 * @generated
	 */
	InternalCoupling createInternalCoupling();

	/**
	 * Returns a new object of class '<em>Output Coupling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Coupling</em>'.
	 * @generated
	 */
	OutputCoupling createOutputCoupling();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevsPackage getDevsPackage();

} //DevsFactory
