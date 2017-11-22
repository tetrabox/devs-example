/**
 */
package devs.impl;

import devs.AtomicModel;
import devs.CoupledModel;
import devs.DEVSModel;
import devs.DevsFactory;
import devs.DevsPackage;
import devs.ExternalInputCoupling;
import devs.ExternalTransition;
import devs.InPort;
import devs.InternalCoupling;
import devs.InternalTransition;
import devs.Lambda;
import devs.OutPort;
import devs.OutputCoupling;
import devs.State;
import devs.TimeAdvance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevsPackageImpl extends EPackageImpl implements DevsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeAdvanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalInputCouplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalCouplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputCouplingEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see devs.DevsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevsPackageImpl() {
		super(eNS_URI, DevsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DevsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DevsPackage init() {
		if (isInited) return (DevsPackage)EPackage.Registry.INSTANCE.getEPackage(DevsPackage.eNS_URI);

		// Obtain or create and register package
		DevsPackageImpl theDevsPackage = (DevsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDevsPackage.createPackageContents();

		// Initialize created meta-data
		theDevsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DevsPackage.eNS_URI, theDevsPackage);
		return theDevsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEVSModel() {
		return devsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEVSModel_Name() {
		return (EAttribute)devsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEVSModel_InPorts() {
		return (EReference)devsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEVSModel_OutPorts() {
		return (EReference)devsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicModel() {
		return atomicModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModel_States() {
		return (EReference)atomicModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModel_DeltInt() {
		return (EReference)atomicModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModel_DeltExt() {
		return (EReference)atomicModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModel_TimeAdvance() {
		return (EReference)atomicModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModel_Lambda() {
		return (EReference)atomicModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModel_InitialState() {
		return (EReference)atomicModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicModel__ReceiveInit__String_float() {
		return atomicModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicModel__ReceiveStar__String_float() {
		return atomicModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicModel__ReceiveX__String_String_float() {
		return atomicModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicModel__SendY__String_String_float() {
		return atomicModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAtomicModel__SendDone__String_float() {
		return atomicModelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModel() {
		return coupledModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupledModel_ExternalInputCouplings() {
		return (EReference)coupledModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupledModel_InternalCouplings() {
		return (EReference)coupledModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupledModel_OutputCouplings() {
		return (EReference)coupledModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModel_Children() {
		return (EAttribute)coupledModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__ReceiveInit__String_float() {
		return coupledModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__ReceiveStar__String_float() {
		return coupledModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__ReceiveX__String_String_float() {
		return coupledModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__ReceiveY__String_String_float() {
		return coupledModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__ReceiveDone__String_float() {
		return coupledModelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__SendInit__String_float() {
		return coupledModelEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__SendStar__String_float() {
		return coupledModelEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__SendX__String_String_float() {
		return coupledModelEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__SendY__String_String_float() {
		return coupledModelEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCoupledModel__SendDone__String_float() {
		return coupledModelEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAdvance() {
		return timeAdvanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeAdvance_State() {
		return (EReference)timeAdvanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvance_Lifetime() {
		return (EAttribute)timeAdvanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambda() {
		return lambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambda_State() {
		return (EReference)lambdaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambda_OutPort() {
		return (EReference)lambdaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutPort() {
		return outPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutPort_Name() {
		return (EAttribute)outPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInPort() {
		return inPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInPort_Name() {
		return (EAttribute)inPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalTransition() {
		return internalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalTransition_SourceState() {
		return (EReference)internalTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalTransition_TargetState() {
		return (EReference)internalTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalTransition() {
		return externalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalTransition_InPort() {
		return (EReference)externalTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalTransition_SourceState() {
		return (EReference)externalTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalTransition_TargetState() {
		return (EReference)externalTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalInputCoupling() {
		return externalInputCouplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalInputCoupling_Dest() {
		return (EAttribute)externalInputCouplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalInputCoupling_OutPort() {
		return (EAttribute)externalInputCouplingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalInputCoupling_InPort() {
		return (EAttribute)externalInputCouplingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalCoupling() {
		return internalCouplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalCoupling_Src() {
		return (EAttribute)internalCouplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalCoupling_OutPort() {
		return (EAttribute)internalCouplingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalCoupling_Dest() {
		return (EAttribute)internalCouplingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalCoupling_InPort() {
		return (EAttribute)internalCouplingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputCoupling() {
		return outputCouplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputCoupling_Src() {
		return (EAttribute)outputCouplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputCoupling_OutPort() {
		return (EAttribute)outputCouplingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputCoupling_InPort() {
		return (EAttribute)outputCouplingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsFactory getDevsFactory() {
		return (DevsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		devsModelEClass = createEClass(DEVS_MODEL);
		createEAttribute(devsModelEClass, DEVS_MODEL__NAME);
		createEReference(devsModelEClass, DEVS_MODEL__IN_PORTS);
		createEReference(devsModelEClass, DEVS_MODEL__OUT_PORTS);

		atomicModelEClass = createEClass(ATOMIC_MODEL);
		createEReference(atomicModelEClass, ATOMIC_MODEL__STATES);
		createEReference(atomicModelEClass, ATOMIC_MODEL__DELT_INT);
		createEReference(atomicModelEClass, ATOMIC_MODEL__DELT_EXT);
		createEReference(atomicModelEClass, ATOMIC_MODEL__TIME_ADVANCE);
		createEReference(atomicModelEClass, ATOMIC_MODEL__LAMBDA);
		createEReference(atomicModelEClass, ATOMIC_MODEL__INITIAL_STATE);
		createEOperation(atomicModelEClass, ATOMIC_MODEL___RECEIVE_INIT__STRING_FLOAT);
		createEOperation(atomicModelEClass, ATOMIC_MODEL___RECEIVE_STAR__STRING_FLOAT);
		createEOperation(atomicModelEClass, ATOMIC_MODEL___RECEIVE_X__STRING_STRING_FLOAT);
		createEOperation(atomicModelEClass, ATOMIC_MODEL___SEND_Y__STRING_STRING_FLOAT);
		createEOperation(atomicModelEClass, ATOMIC_MODEL___SEND_DONE__STRING_FLOAT);

		coupledModelEClass = createEClass(COUPLED_MODEL);
		createEReference(coupledModelEClass, COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS);
		createEReference(coupledModelEClass, COUPLED_MODEL__INTERNAL_COUPLINGS);
		createEReference(coupledModelEClass, COUPLED_MODEL__OUTPUT_COUPLINGS);
		createEAttribute(coupledModelEClass, COUPLED_MODEL__CHILDREN);
		createEOperation(coupledModelEClass, COUPLED_MODEL___RECEIVE_INIT__STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___RECEIVE_STAR__STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___RECEIVE_X__STRING_STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___RECEIVE_Y__STRING_STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___RECEIVE_DONE__STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___SEND_INIT__STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___SEND_STAR__STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___SEND_X__STRING_STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___SEND_Y__STRING_STRING_FLOAT);
		createEOperation(coupledModelEClass, COUPLED_MODEL___SEND_DONE__STRING_FLOAT);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__NAME);

		timeAdvanceEClass = createEClass(TIME_ADVANCE);
		createEReference(timeAdvanceEClass, TIME_ADVANCE__STATE);
		createEAttribute(timeAdvanceEClass, TIME_ADVANCE__LIFETIME);

		lambdaEClass = createEClass(LAMBDA);
		createEReference(lambdaEClass, LAMBDA__STATE);
		createEReference(lambdaEClass, LAMBDA__OUT_PORT);

		outPortEClass = createEClass(OUT_PORT);
		createEAttribute(outPortEClass, OUT_PORT__NAME);

		inPortEClass = createEClass(IN_PORT);
		createEAttribute(inPortEClass, IN_PORT__NAME);

		internalTransitionEClass = createEClass(INTERNAL_TRANSITION);
		createEReference(internalTransitionEClass, INTERNAL_TRANSITION__SOURCE_STATE);
		createEReference(internalTransitionEClass, INTERNAL_TRANSITION__TARGET_STATE);

		externalTransitionEClass = createEClass(EXTERNAL_TRANSITION);
		createEReference(externalTransitionEClass, EXTERNAL_TRANSITION__IN_PORT);
		createEReference(externalTransitionEClass, EXTERNAL_TRANSITION__SOURCE_STATE);
		createEReference(externalTransitionEClass, EXTERNAL_TRANSITION__TARGET_STATE);

		externalInputCouplingEClass = createEClass(EXTERNAL_INPUT_COUPLING);
		createEAttribute(externalInputCouplingEClass, EXTERNAL_INPUT_COUPLING__DEST);
		createEAttribute(externalInputCouplingEClass, EXTERNAL_INPUT_COUPLING__OUT_PORT);
		createEAttribute(externalInputCouplingEClass, EXTERNAL_INPUT_COUPLING__IN_PORT);

		internalCouplingEClass = createEClass(INTERNAL_COUPLING);
		createEAttribute(internalCouplingEClass, INTERNAL_COUPLING__SRC);
		createEAttribute(internalCouplingEClass, INTERNAL_COUPLING__OUT_PORT);
		createEAttribute(internalCouplingEClass, INTERNAL_COUPLING__DEST);
		createEAttribute(internalCouplingEClass, INTERNAL_COUPLING__IN_PORT);

		outputCouplingEClass = createEClass(OUTPUT_COUPLING);
		createEAttribute(outputCouplingEClass, OUTPUT_COUPLING__SRC);
		createEAttribute(outputCouplingEClass, OUTPUT_COUPLING__OUT_PORT);
		createEAttribute(outputCouplingEClass, OUTPUT_COUPLING__IN_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atomicModelEClass.getESuperTypes().add(this.getDEVSModel());
		coupledModelEClass.getESuperTypes().add(this.getDEVSModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(devsModelEClass, DEVSModel.class, "DEVSModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEVSModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, DEVSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEVSModel_InPorts(), this.getInPort(), null, "inPorts", null, 0, -1, DEVSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEVSModel_OutPorts(), this.getOutPort(), null, "outPorts", null, 0, -1, DEVSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicModelEClass, AtomicModel.class, "AtomicModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicModel_States(), this.getState(), null, "states", null, 1, -1, AtomicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModel_DeltInt(), this.getInternalTransition(), null, "deltInt", null, 0, -1, AtomicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModel_DeltExt(), this.getExternalTransition(), null, "deltExt", null, 0, -1, AtomicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModel_TimeAdvance(), this.getTimeAdvance(), null, "timeAdvance", null, 0, -1, AtomicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModel_Lambda(), this.getLambda(), null, "lambda", null, 0, -1, AtomicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicModel_InitialState(), this.getState(), null, "initialState", null, 0, 1, AtomicModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAtomicModel__ReceiveInit__String_float(), null, "receiveInit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtomicModel__ReceiveStar__String_float(), null, "receiveStar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtomicModel__ReceiveX__String_String_float(), null, "receiveX", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtomicModel__SendY__String_String_float(), null, "sendY", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtomicModel__SendDone__String_float(), null, "sendDone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coupledModelEClass, CoupledModel.class, "CoupledModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoupledModel_ExternalInputCouplings(), this.getExternalInputCoupling(), null, "externalInputCouplings", null, 0, -1, CoupledModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoupledModel_InternalCouplings(), this.getInternalCoupling(), null, "internalCouplings", null, 0, -1, CoupledModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoupledModel_OutputCouplings(), this.getOutputCoupling(), null, "outputCouplings", null, 0, -1, CoupledModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModel_Children(), ecorePackage.getEString(), "children", null, 0, -1, CoupledModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCoupledModel__ReceiveInit__String_float(), null, "receiveInit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__ReceiveStar__String_float(), null, "receiveStar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__ReceiveX__String_String_float(), null, "receiveX", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__ReceiveY__String_String_float(), null, "receiveY", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__ReceiveDone__String_float(), null, "receiveDone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__SendInit__String_float(), null, "sendInit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__SendStar__String_float(), null, "sendStar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__SendX__String_String_float(), null, "sendX", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "target", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__SendY__String_String_float(), null, "sendY", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "y", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCoupledModel__SendDone__String_float(), null, "sendDone", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEFloat(), "time", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeAdvanceEClass, TimeAdvance.class, "TimeAdvance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeAdvance_State(), this.getState(), null, "state", null, 1, 1, TimeAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeAdvance_Lifetime(), ecorePackage.getEFloat(), "lifetime", null, 1, 1, TimeAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaEClass, Lambda.class, "Lambda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambda_State(), this.getState(), null, "state", null, 1, 1, Lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambda_OutPort(), this.getOutPort(), null, "outPort", null, 1, 1, Lambda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outPortEClass, OutPort.class, "OutPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutPort_Name(), ecorePackage.getEString(), "name", null, 1, 1, OutPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inPortEClass, InPort.class, "InPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInPort_Name(), ecorePackage.getEString(), "name", null, 1, 1, InPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalTransitionEClass, InternalTransition.class, "InternalTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalTransition_SourceState(), this.getState(), null, "sourceState", null, 1, 1, InternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalTransition_TargetState(), this.getState(), null, "targetState", null, 1, 1, InternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalTransitionEClass, ExternalTransition.class, "ExternalTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalTransition_InPort(), this.getInPort(), null, "inPort", null, 0, 1, ExternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalTransition_SourceState(), this.getState(), null, "sourceState", null, 1, 1, ExternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExternalTransition_TargetState(), this.getState(), null, "targetState", null, 1, 1, ExternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalInputCouplingEClass, ExternalInputCoupling.class, "ExternalInputCoupling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalInputCoupling_Dest(), ecorePackage.getEString(), "dest", null, 0, 1, ExternalInputCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalInputCoupling_OutPort(), ecorePackage.getEString(), "outPort", null, 0, 1, ExternalInputCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalInputCoupling_InPort(), ecorePackage.getEString(), "inPort", null, 0, 1, ExternalInputCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalCouplingEClass, InternalCoupling.class, "InternalCoupling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalCoupling_Src(), ecorePackage.getEString(), "src", null, 0, 1, InternalCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalCoupling_OutPort(), ecorePackage.getEString(), "outPort", null, 0, 1, InternalCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalCoupling_Dest(), ecorePackage.getEString(), "dest", null, 0, 1, InternalCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalCoupling_InPort(), ecorePackage.getEString(), "inPort", null, 0, 1, InternalCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputCouplingEClass, OutputCoupling.class, "OutputCoupling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputCoupling_Src(), ecorePackage.getEString(), "src", null, 0, 1, OutputCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputCoupling_OutPort(), ecorePackage.getEString(), "outPort", null, 0, 1, OutputCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputCoupling_InPort(), ecorePackage.getEString(), "inPort", null, 0, 1, OutputCoupling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DevsPackageImpl
