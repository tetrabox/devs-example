/**
 */
package devs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see devs.DevsFactory
 * @model kind="package"
 * @generated
 */
public interface DevsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.devs/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevsPackage eINSTANCE = devs.impl.DevsPackageImpl.init();

	/**
	 * The meta object id for the '{@link devs.impl.DEVSModelImpl <em>DEVS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.DEVSModelImpl
	 * @see devs.impl.DevsPackageImpl#getDEVSModel()
	 * @generated
	 */
	int DEVS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL__IN_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL__OUT_PORTS = 2;

	/**
	 * The number of structural features of the '<em>DEVS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DEVS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.AtomicModelImpl <em>Atomic Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.AtomicModelImpl
	 * @see devs.impl.DevsPackageImpl#getAtomicModel()
	 * @generated
	 */
	int ATOMIC_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__NAME = DEVS_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__IN_PORTS = DEVS_MODEL__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__OUT_PORTS = DEVS_MODEL__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__STATES = DEVS_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delt Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__DELT_INT = DEVS_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delt Ext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__DELT_EXT = DEVS_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Advance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__TIME_ADVANCE = DEVS_MODEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__LAMBDA = DEVS_MODEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL__INITIAL_STATE = DEVS_MODEL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Atomic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_FEATURE_COUNT = DEVS_MODEL_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Receive Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL___RECEIVE_INIT__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Receive Star</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL___RECEIVE_STAR__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Receive X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL___RECEIVE_X__STRING_STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Send Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL___SEND_Y__STRING_STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Send Done</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL___SEND_DONE__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Atomic Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_OPERATION_COUNT = DEVS_MODEL_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link devs.impl.CoupledModelImpl <em>Coupled Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.CoupledModelImpl
	 * @see devs.impl.DevsPackageImpl#getCoupledModel()
	 * @generated
	 */
	int COUPLED_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL__NAME = DEVS_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>In Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL__IN_PORTS = DEVS_MODEL__IN_PORTS;

	/**
	 * The feature id for the '<em><b>Out Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL__OUT_PORTS = DEVS_MODEL__OUT_PORTS;

	/**
	 * The feature id for the '<em><b>External Input Couplings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS = DEVS_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Internal Couplings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL__INTERNAL_COUPLINGS = DEVS_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Couplings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL__OUTPUT_COUPLINGS = DEVS_MODEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL__CHILDREN = DEVS_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coupled Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_FEATURE_COUNT = DEVS_MODEL_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Receive Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___RECEIVE_INIT__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Receive Star</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___RECEIVE_STAR__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Receive X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___RECEIVE_X__STRING_STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Receive Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___RECEIVE_Y__STRING_STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Receive Done</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___RECEIVE_DONE__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Send Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___SEND_INIT__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Send Star</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___SEND_STAR__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Send X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___SEND_X__STRING_STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Send Y</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___SEND_Y__STRING_STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Send Done</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL___SEND_DONE__STRING_FLOAT = DEVS_MODEL_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Coupled Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_OPERATION_COUNT = DEVS_MODEL_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link devs.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.StateImpl
	 * @see devs.impl.DevsPackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.TimeAdvanceImpl <em>Time Advance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.TimeAdvanceImpl
	 * @see devs.impl.DevsPackageImpl#getTimeAdvance()
	 * @generated
	 */
	int TIME_ADVANCE = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADVANCE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADVANCE__LIFETIME = 1;

	/**
	 * The number of structural features of the '<em>Time Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADVANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Advance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_ADVANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.LambdaImpl <em>Lambda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.LambdaImpl
	 * @see devs.impl.DevsPackageImpl#getLambda()
	 * @generated
	 */
	int LAMBDA = 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__STATE = 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__OUT_PORT = 1;

	/**
	 * The number of structural features of the '<em>Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.OutPortImpl
	 * @see devs.impl.DevsPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.InPortImpl
	 * @see devs.impl.DevsPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__NAME = 0;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.InternalTransitionImpl
	 * @see devs.impl.DevsPackageImpl#getInternalTransition()
	 * @generated
	 */
	int INTERNAL_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__SOURCE_STATE = 0;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__TARGET_STATE = 1;

	/**
	 * The number of structural features of the '<em>Internal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Internal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.ExternalTransitionImpl <em>External Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.ExternalTransitionImpl
	 * @see devs.impl.DevsPackageImpl#getExternalTransition()
	 * @generated
	 */
	int EXTERNAL_TRANSITION = 9;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__IN_PORT = 0;

	/**
	 * The feature id for the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__SOURCE_STATE = 1;

	/**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__TARGET_STATE = 2;

	/**
	 * The number of structural features of the '<em>External Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>External Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.ExternalInputCouplingImpl <em>External Input Coupling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.ExternalInputCouplingImpl
	 * @see devs.impl.DevsPackageImpl#getExternalInputCoupling()
	 * @generated
	 */
	int EXTERNAL_INPUT_COUPLING = 10;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT_COUPLING__DEST = 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT_COUPLING__OUT_PORT = 1;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT_COUPLING__IN_PORT = 2;

	/**
	 * The number of structural features of the '<em>External Input Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT_COUPLING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>External Input Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_INPUT_COUPLING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.InternalCouplingImpl <em>Internal Coupling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.InternalCouplingImpl
	 * @see devs.impl.DevsPackageImpl#getInternalCoupling()
	 * @generated
	 */
	int INTERNAL_COUPLING = 11;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COUPLING__SRC = 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COUPLING__OUT_PORT = 1;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COUPLING__DEST = 2;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COUPLING__IN_PORT = 3;

	/**
	 * The number of structural features of the '<em>Internal Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COUPLING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Internal Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_COUPLING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devs.impl.OutputCouplingImpl <em>Output Coupling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devs.impl.OutputCouplingImpl
	 * @see devs.impl.DevsPackageImpl#getOutputCoupling()
	 * @generated
	 */
	int OUTPUT_COUPLING = 12;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COUPLING__SRC = 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COUPLING__OUT_PORT = 1;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COUPLING__IN_PORT = 2;

	/**
	 * The number of structural features of the '<em>Output Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COUPLING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Output Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_COUPLING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link devs.DEVSModel <em>DEVS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEVS Model</em>'.
	 * @see devs.DEVSModel
	 * @generated
	 */
	EClass getDEVSModel();

	/**
	 * Returns the meta object for the attribute '{@link devs.DEVSModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devs.DEVSModel#getName()
	 * @see #getDEVSModel()
	 * @generated
	 */
	EAttribute getDEVSModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.DEVSModel#getInPorts <em>In Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Ports</em>'.
	 * @see devs.DEVSModel#getInPorts()
	 * @see #getDEVSModel()
	 * @generated
	 */
	EReference getDEVSModel_InPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.DEVSModel#getOutPorts <em>Out Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Ports</em>'.
	 * @see devs.DEVSModel#getOutPorts()
	 * @see #getDEVSModel()
	 * @generated
	 */
	EReference getDEVSModel_OutPorts();

	/**
	 * Returns the meta object for class '{@link devs.AtomicModel <em>Atomic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Model</em>'.
	 * @see devs.AtomicModel
	 * @generated
	 */
	EClass getAtomicModel();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.AtomicModel#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see devs.AtomicModel#getStates()
	 * @see #getAtomicModel()
	 * @generated
	 */
	EReference getAtomicModel_States();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.AtomicModel#getDeltInt <em>Delt Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delt Int</em>'.
	 * @see devs.AtomicModel#getDeltInt()
	 * @see #getAtomicModel()
	 * @generated
	 */
	EReference getAtomicModel_DeltInt();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.AtomicModel#getDeltExt <em>Delt Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delt Ext</em>'.
	 * @see devs.AtomicModel#getDeltExt()
	 * @see #getAtomicModel()
	 * @generated
	 */
	EReference getAtomicModel_DeltExt();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.AtomicModel#getTimeAdvance <em>Time Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Advance</em>'.
	 * @see devs.AtomicModel#getTimeAdvance()
	 * @see #getAtomicModel()
	 * @generated
	 */
	EReference getAtomicModel_TimeAdvance();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.AtomicModel#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lambda</em>'.
	 * @see devs.AtomicModel#getLambda()
	 * @see #getAtomicModel()
	 * @generated
	 */
	EReference getAtomicModel_Lambda();

	/**
	 * Returns the meta object for the reference '{@link devs.AtomicModel#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see devs.AtomicModel#getInitialState()
	 * @see #getAtomicModel()
	 * @generated
	 */
	EReference getAtomicModel_InitialState();

	/**
	 * Returns the meta object for the '{@link devs.AtomicModel#receiveInit(java.lang.String, float) <em>Receive Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Init</em>' operation.
	 * @see devs.AtomicModel#receiveInit(java.lang.String, float)
	 * @generated
	 */
	EOperation getAtomicModel__ReceiveInit__String_float();

	/**
	 * Returns the meta object for the '{@link devs.AtomicModel#receiveStar(java.lang.String, float) <em>Receive Star</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Star</em>' operation.
	 * @see devs.AtomicModel#receiveStar(java.lang.String, float)
	 * @generated
	 */
	EOperation getAtomicModel__ReceiveStar__String_float();

	/**
	 * Returns the meta object for the '{@link devs.AtomicModel#receiveX(java.lang.String, java.lang.String, float) <em>Receive X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive X</em>' operation.
	 * @see devs.AtomicModel#receiveX(java.lang.String, java.lang.String, float)
	 * @generated
	 */
	EOperation getAtomicModel__ReceiveX__String_String_float();

	/**
	 * Returns the meta object for the '{@link devs.AtomicModel#sendY(java.lang.String, java.lang.String, float) <em>Send Y</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Y</em>' operation.
	 * @see devs.AtomicModel#sendY(java.lang.String, java.lang.String, float)
	 * @generated
	 */
	EOperation getAtomicModel__SendY__String_String_float();

	/**
	 * Returns the meta object for the '{@link devs.AtomicModel#sendDone(java.lang.String, float) <em>Send Done</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Done</em>' operation.
	 * @see devs.AtomicModel#sendDone(java.lang.String, float)
	 * @generated
	 */
	EOperation getAtomicModel__SendDone__String_float();

	/**
	 * Returns the meta object for class '{@link devs.CoupledModel <em>Coupled Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model</em>'.
	 * @see devs.CoupledModel
	 * @generated
	 */
	EClass getCoupledModel();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.CoupledModel#getExternalInputCouplings <em>External Input Couplings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Input Couplings</em>'.
	 * @see devs.CoupledModel#getExternalInputCouplings()
	 * @see #getCoupledModel()
	 * @generated
	 */
	EReference getCoupledModel_ExternalInputCouplings();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.CoupledModel#getInternalCouplings <em>Internal Couplings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Couplings</em>'.
	 * @see devs.CoupledModel#getInternalCouplings()
	 * @see #getCoupledModel()
	 * @generated
	 */
	EReference getCoupledModel_InternalCouplings();

	/**
	 * Returns the meta object for the containment reference list '{@link devs.CoupledModel#getOutputCouplings <em>Output Couplings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Couplings</em>'.
	 * @see devs.CoupledModel#getOutputCouplings()
	 * @see #getCoupledModel()
	 * @generated
	 */
	EReference getCoupledModel_OutputCouplings();

	/**
	 * Returns the meta object for the attribute list '{@link devs.CoupledModel#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Children</em>'.
	 * @see devs.CoupledModel#getChildren()
	 * @see #getCoupledModel()
	 * @generated
	 */
	EAttribute getCoupledModel_Children();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#receiveInit(java.lang.String, float) <em>Receive Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Init</em>' operation.
	 * @see devs.CoupledModel#receiveInit(java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__ReceiveInit__String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#receiveStar(java.lang.String, float) <em>Receive Star</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Star</em>' operation.
	 * @see devs.CoupledModel#receiveStar(java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__ReceiveStar__String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#receiveX(java.lang.String, java.lang.String, float) <em>Receive X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive X</em>' operation.
	 * @see devs.CoupledModel#receiveX(java.lang.String, java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__ReceiveX__String_String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#receiveY(java.lang.String, java.lang.String, float) <em>Receive Y</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Y</em>' operation.
	 * @see devs.CoupledModel#receiveY(java.lang.String, java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__ReceiveY__String_String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#receiveDone(java.lang.String, float) <em>Receive Done</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Done</em>' operation.
	 * @see devs.CoupledModel#receiveDone(java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__ReceiveDone__String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#sendInit(java.lang.String, float) <em>Send Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Init</em>' operation.
	 * @see devs.CoupledModel#sendInit(java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__SendInit__String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#sendStar(java.lang.String, float) <em>Send Star</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Star</em>' operation.
	 * @see devs.CoupledModel#sendStar(java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__SendStar__String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#sendX(java.lang.String, java.lang.String, float) <em>Send X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send X</em>' operation.
	 * @see devs.CoupledModel#sendX(java.lang.String, java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__SendX__String_String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#sendY(java.lang.String, java.lang.String, float) <em>Send Y</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Y</em>' operation.
	 * @see devs.CoupledModel#sendY(java.lang.String, java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__SendY__String_String_float();

	/**
	 * Returns the meta object for the '{@link devs.CoupledModel#sendDone(java.lang.String, float) <em>Send Done</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Done</em>' operation.
	 * @see devs.CoupledModel#sendDone(java.lang.String, float)
	 * @generated
	 */
	EOperation getCoupledModel__SendDone__String_float();

	/**
	 * Returns the meta object for class '{@link devs.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see devs.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link devs.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devs.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link devs.TimeAdvance <em>Time Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Advance</em>'.
	 * @see devs.TimeAdvance
	 * @generated
	 */
	EClass getTimeAdvance();

	/**
	 * Returns the meta object for the reference '{@link devs.TimeAdvance#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see devs.TimeAdvance#getState()
	 * @see #getTimeAdvance()
	 * @generated
	 */
	EReference getTimeAdvance_State();

	/**
	 * Returns the meta object for the attribute '{@link devs.TimeAdvance#getLifetime <em>Lifetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifetime</em>'.
	 * @see devs.TimeAdvance#getLifetime()
	 * @see #getTimeAdvance()
	 * @generated
	 */
	EAttribute getTimeAdvance_Lifetime();

	/**
	 * Returns the meta object for class '{@link devs.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda</em>'.
	 * @see devs.Lambda
	 * @generated
	 */
	EClass getLambda();

	/**
	 * Returns the meta object for the reference '{@link devs.Lambda#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see devs.Lambda#getState()
	 * @see #getLambda()
	 * @generated
	 */
	EReference getLambda_State();

	/**
	 * Returns the meta object for the reference '{@link devs.Lambda#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Port</em>'.
	 * @see devs.Lambda#getOutPort()
	 * @see #getLambda()
	 * @generated
	 */
	EReference getLambda_OutPort();

	/**
	 * Returns the meta object for class '{@link devs.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see devs.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for the attribute '{@link devs.OutPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devs.OutPort#getName()
	 * @see #getOutPort()
	 * @generated
	 */
	EAttribute getOutPort_Name();

	/**
	 * Returns the meta object for class '{@link devs.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see devs.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for the attribute '{@link devs.InPort#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see devs.InPort#getName()
	 * @see #getInPort()
	 * @generated
	 */
	EAttribute getInPort_Name();

	/**
	 * Returns the meta object for class '{@link devs.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Transition</em>'.
	 * @see devs.InternalTransition
	 * @generated
	 */
	EClass getInternalTransition();

	/**
	 * Returns the meta object for the reference '{@link devs.InternalTransition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source State</em>'.
	 * @see devs.InternalTransition#getSourceState()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EReference getInternalTransition_SourceState();

	/**
	 * Returns the meta object for the reference '{@link devs.InternalTransition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see devs.InternalTransition#getTargetState()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EReference getInternalTransition_TargetState();

	/**
	 * Returns the meta object for class '{@link devs.ExternalTransition <em>External Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Transition</em>'.
	 * @see devs.ExternalTransition
	 * @generated
	 */
	EClass getExternalTransition();

	/**
	 * Returns the meta object for the reference '{@link devs.ExternalTransition#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Port</em>'.
	 * @see devs.ExternalTransition#getInPort()
	 * @see #getExternalTransition()
	 * @generated
	 */
	EReference getExternalTransition_InPort();

	/**
	 * Returns the meta object for the reference '{@link devs.ExternalTransition#getSourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source State</em>'.
	 * @see devs.ExternalTransition#getSourceState()
	 * @see #getExternalTransition()
	 * @generated
	 */
	EReference getExternalTransition_SourceState();

	/**
	 * Returns the meta object for the reference '{@link devs.ExternalTransition#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target State</em>'.
	 * @see devs.ExternalTransition#getTargetState()
	 * @see #getExternalTransition()
	 * @generated
	 */
	EReference getExternalTransition_TargetState();

	/**
	 * Returns the meta object for class '{@link devs.ExternalInputCoupling <em>External Input Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Input Coupling</em>'.
	 * @see devs.ExternalInputCoupling
	 * @generated
	 */
	EClass getExternalInputCoupling();

	/**
	 * Returns the meta object for the attribute '{@link devs.ExternalInputCoupling#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see devs.ExternalInputCoupling#getDest()
	 * @see #getExternalInputCoupling()
	 * @generated
	 */
	EAttribute getExternalInputCoupling_Dest();

	/**
	 * Returns the meta object for the attribute '{@link devs.ExternalInputCoupling#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Port</em>'.
	 * @see devs.ExternalInputCoupling#getOutPort()
	 * @see #getExternalInputCoupling()
	 * @generated
	 */
	EAttribute getExternalInputCoupling_OutPort();

	/**
	 * Returns the meta object for the attribute '{@link devs.ExternalInputCoupling#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Port</em>'.
	 * @see devs.ExternalInputCoupling#getInPort()
	 * @see #getExternalInputCoupling()
	 * @generated
	 */
	EAttribute getExternalInputCoupling_InPort();

	/**
	 * Returns the meta object for class '{@link devs.InternalCoupling <em>Internal Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Coupling</em>'.
	 * @see devs.InternalCoupling
	 * @generated
	 */
	EClass getInternalCoupling();

	/**
	 * Returns the meta object for the attribute '{@link devs.InternalCoupling#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see devs.InternalCoupling#getSrc()
	 * @see #getInternalCoupling()
	 * @generated
	 */
	EAttribute getInternalCoupling_Src();

	/**
	 * Returns the meta object for the attribute '{@link devs.InternalCoupling#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Port</em>'.
	 * @see devs.InternalCoupling#getOutPort()
	 * @see #getInternalCoupling()
	 * @generated
	 */
	EAttribute getInternalCoupling_OutPort();

	/**
	 * Returns the meta object for the attribute '{@link devs.InternalCoupling#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dest</em>'.
	 * @see devs.InternalCoupling#getDest()
	 * @see #getInternalCoupling()
	 * @generated
	 */
	EAttribute getInternalCoupling_Dest();

	/**
	 * Returns the meta object for the attribute '{@link devs.InternalCoupling#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Port</em>'.
	 * @see devs.InternalCoupling#getInPort()
	 * @see #getInternalCoupling()
	 * @generated
	 */
	EAttribute getInternalCoupling_InPort();

	/**
	 * Returns the meta object for class '{@link devs.OutputCoupling <em>Output Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Coupling</em>'.
	 * @see devs.OutputCoupling
	 * @generated
	 */
	EClass getOutputCoupling();

	/**
	 * Returns the meta object for the attribute '{@link devs.OutputCoupling#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see devs.OutputCoupling#getSrc()
	 * @see #getOutputCoupling()
	 * @generated
	 */
	EAttribute getOutputCoupling_Src();

	/**
	 * Returns the meta object for the attribute '{@link devs.OutputCoupling#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Port</em>'.
	 * @see devs.OutputCoupling#getOutPort()
	 * @see #getOutputCoupling()
	 * @generated
	 */
	EAttribute getOutputCoupling_OutPort();

	/**
	 * Returns the meta object for the attribute '{@link devs.OutputCoupling#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Port</em>'.
	 * @see devs.OutputCoupling#getInPort()
	 * @see #getOutputCoupling()
	 * @generated
	 */
	EAttribute getOutputCoupling_InPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevsFactory getDevsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link devs.impl.DEVSModelImpl <em>DEVS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.DEVSModelImpl
		 * @see devs.impl.DevsPackageImpl#getDEVSModel()
		 * @generated
		 */
		EClass DEVS_MODEL = eINSTANCE.getDEVSModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVS_MODEL__NAME = eINSTANCE.getDEVSModel_Name();

		/**
		 * The meta object literal for the '<em><b>In Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_MODEL__IN_PORTS = eINSTANCE.getDEVSModel_InPorts();

		/**
		 * The meta object literal for the '<em><b>Out Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVS_MODEL__OUT_PORTS = eINSTANCE.getDEVSModel_OutPorts();

		/**
		 * The meta object literal for the '{@link devs.impl.AtomicModelImpl <em>Atomic Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.AtomicModelImpl
		 * @see devs.impl.DevsPackageImpl#getAtomicModel()
		 * @generated
		 */
		EClass ATOMIC_MODEL = eINSTANCE.getAtomicModel();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL__STATES = eINSTANCE.getAtomicModel_States();

		/**
		 * The meta object literal for the '<em><b>Delt Int</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL__DELT_INT = eINSTANCE.getAtomicModel_DeltInt();

		/**
		 * The meta object literal for the '<em><b>Delt Ext</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL__DELT_EXT = eINSTANCE.getAtomicModel_DeltExt();

		/**
		 * The meta object literal for the '<em><b>Time Advance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL__TIME_ADVANCE = eINSTANCE.getAtomicModel_TimeAdvance();

		/**
		 * The meta object literal for the '<em><b>Lambda</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL__LAMBDA = eINSTANCE.getAtomicModel_Lambda();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL__INITIAL_STATE = eINSTANCE.getAtomicModel_InitialState();

		/**
		 * The meta object literal for the '<em><b>Receive Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_MODEL___RECEIVE_INIT__STRING_FLOAT = eINSTANCE.getAtomicModel__ReceiveInit__String_float();

		/**
		 * The meta object literal for the '<em><b>Receive Star</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_MODEL___RECEIVE_STAR__STRING_FLOAT = eINSTANCE.getAtomicModel__ReceiveStar__String_float();

		/**
		 * The meta object literal for the '<em><b>Receive X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_MODEL___RECEIVE_X__STRING_STRING_FLOAT = eINSTANCE.getAtomicModel__ReceiveX__String_String_float();

		/**
		 * The meta object literal for the '<em><b>Send Y</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_MODEL___SEND_Y__STRING_STRING_FLOAT = eINSTANCE.getAtomicModel__SendY__String_String_float();

		/**
		 * The meta object literal for the '<em><b>Send Done</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATOMIC_MODEL___SEND_DONE__STRING_FLOAT = eINSTANCE.getAtomicModel__SendDone__String_float();

		/**
		 * The meta object literal for the '{@link devs.impl.CoupledModelImpl <em>Coupled Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.CoupledModelImpl
		 * @see devs.impl.DevsPackageImpl#getCoupledModel()
		 * @generated
		 */
		EClass COUPLED_MODEL = eINSTANCE.getCoupledModel();

		/**
		 * The meta object literal for the '<em><b>External Input Couplings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS = eINSTANCE.getCoupledModel_ExternalInputCouplings();

		/**
		 * The meta object literal for the '<em><b>Internal Couplings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLED_MODEL__INTERNAL_COUPLINGS = eINSTANCE.getCoupledModel_InternalCouplings();

		/**
		 * The meta object literal for the '<em><b>Output Couplings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLED_MODEL__OUTPUT_COUPLINGS = eINSTANCE.getCoupledModel_OutputCouplings();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL__CHILDREN = eINSTANCE.getCoupledModel_Children();

		/**
		 * The meta object literal for the '<em><b>Receive Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___RECEIVE_INIT__STRING_FLOAT = eINSTANCE.getCoupledModel__ReceiveInit__String_float();

		/**
		 * The meta object literal for the '<em><b>Receive Star</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___RECEIVE_STAR__STRING_FLOAT = eINSTANCE.getCoupledModel__ReceiveStar__String_float();

		/**
		 * The meta object literal for the '<em><b>Receive X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___RECEIVE_X__STRING_STRING_FLOAT = eINSTANCE.getCoupledModel__ReceiveX__String_String_float();

		/**
		 * The meta object literal for the '<em><b>Receive Y</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___RECEIVE_Y__STRING_STRING_FLOAT = eINSTANCE.getCoupledModel__ReceiveY__String_String_float();

		/**
		 * The meta object literal for the '<em><b>Receive Done</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___RECEIVE_DONE__STRING_FLOAT = eINSTANCE.getCoupledModel__ReceiveDone__String_float();

		/**
		 * The meta object literal for the '<em><b>Send Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___SEND_INIT__STRING_FLOAT = eINSTANCE.getCoupledModel__SendInit__String_float();

		/**
		 * The meta object literal for the '<em><b>Send Star</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___SEND_STAR__STRING_FLOAT = eINSTANCE.getCoupledModel__SendStar__String_float();

		/**
		 * The meta object literal for the '<em><b>Send X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___SEND_X__STRING_STRING_FLOAT = eINSTANCE.getCoupledModel__SendX__String_String_float();

		/**
		 * The meta object literal for the '<em><b>Send Y</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___SEND_Y__STRING_STRING_FLOAT = eINSTANCE.getCoupledModel__SendY__String_String_float();

		/**
		 * The meta object literal for the '<em><b>Send Done</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUPLED_MODEL___SEND_DONE__STRING_FLOAT = eINSTANCE.getCoupledModel__SendDone__String_float();

		/**
		 * The meta object literal for the '{@link devs.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.StateImpl
		 * @see devs.impl.DevsPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link devs.impl.TimeAdvanceImpl <em>Time Advance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.TimeAdvanceImpl
		 * @see devs.impl.DevsPackageImpl#getTimeAdvance()
		 * @generated
		 */
		EClass TIME_ADVANCE = eINSTANCE.getTimeAdvance();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_ADVANCE__STATE = eINSTANCE.getTimeAdvance_State();

		/**
		 * The meta object literal for the '<em><b>Lifetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_ADVANCE__LIFETIME = eINSTANCE.getTimeAdvance_Lifetime();

		/**
		 * The meta object literal for the '{@link devs.impl.LambdaImpl <em>Lambda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.LambdaImpl
		 * @see devs.impl.DevsPackageImpl#getLambda()
		 * @generated
		 */
		EClass LAMBDA = eINSTANCE.getLambda();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA__STATE = eINSTANCE.getLambda_State();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA__OUT_PORT = eINSTANCE.getLambda_OutPort();

		/**
		 * The meta object literal for the '{@link devs.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.OutPortImpl
		 * @see devs.impl.DevsPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT_PORT__NAME = eINSTANCE.getOutPort_Name();

		/**
		 * The meta object literal for the '{@link devs.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.InPortImpl
		 * @see devs.impl.DevsPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IN_PORT__NAME = eINSTANCE.getInPort_Name();

		/**
		 * The meta object literal for the '{@link devs.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.InternalTransitionImpl
		 * @see devs.impl.DevsPackageImpl#getInternalTransition()
		 * @generated
		 */
		EClass INTERNAL_TRANSITION = eINSTANCE.getInternalTransition();

		/**
		 * The meta object literal for the '<em><b>Source State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_TRANSITION__SOURCE_STATE = eINSTANCE.getInternalTransition_SourceState();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_TRANSITION__TARGET_STATE = eINSTANCE.getInternalTransition_TargetState();

		/**
		 * The meta object literal for the '{@link devs.impl.ExternalTransitionImpl <em>External Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.ExternalTransitionImpl
		 * @see devs.impl.DevsPackageImpl#getExternalTransition()
		 * @generated
		 */
		EClass EXTERNAL_TRANSITION = eINSTANCE.getExternalTransition();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TRANSITION__IN_PORT = eINSTANCE.getExternalTransition_InPort();

		/**
		 * The meta object literal for the '<em><b>Source State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TRANSITION__SOURCE_STATE = eINSTANCE.getExternalTransition_SourceState();

		/**
		 * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_TRANSITION__TARGET_STATE = eINSTANCE.getExternalTransition_TargetState();

		/**
		 * The meta object literal for the '{@link devs.impl.ExternalInputCouplingImpl <em>External Input Coupling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.ExternalInputCouplingImpl
		 * @see devs.impl.DevsPackageImpl#getExternalInputCoupling()
		 * @generated
		 */
		EClass EXTERNAL_INPUT_COUPLING = eINSTANCE.getExternalInputCoupling();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_INPUT_COUPLING__DEST = eINSTANCE.getExternalInputCoupling_Dest();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_INPUT_COUPLING__OUT_PORT = eINSTANCE.getExternalInputCoupling_OutPort();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_INPUT_COUPLING__IN_PORT = eINSTANCE.getExternalInputCoupling_InPort();

		/**
		 * The meta object literal for the '{@link devs.impl.InternalCouplingImpl <em>Internal Coupling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.InternalCouplingImpl
		 * @see devs.impl.DevsPackageImpl#getInternalCoupling()
		 * @generated
		 */
		EClass INTERNAL_COUPLING = eINSTANCE.getInternalCoupling();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_COUPLING__SRC = eINSTANCE.getInternalCoupling_Src();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_COUPLING__OUT_PORT = eINSTANCE.getInternalCoupling_OutPort();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_COUPLING__DEST = eINSTANCE.getInternalCoupling_Dest();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_COUPLING__IN_PORT = eINSTANCE.getInternalCoupling_InPort();

		/**
		 * The meta object literal for the '{@link devs.impl.OutputCouplingImpl <em>Output Coupling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devs.impl.OutputCouplingImpl
		 * @see devs.impl.DevsPackageImpl#getOutputCoupling()
		 * @generated
		 */
		EClass OUTPUT_COUPLING = eINSTANCE.getOutputCoupling();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_COUPLING__SRC = eINSTANCE.getOutputCoupling_Src();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_COUPLING__OUT_PORT = eINSTANCE.getOutputCoupling_OutPort();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_COUPLING__IN_PORT = eINSTANCE.getOutputCoupling_InPort();

	}

} //DevsPackage
