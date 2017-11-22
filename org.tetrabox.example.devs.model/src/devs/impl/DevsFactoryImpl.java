/**
 */
package devs.impl;

import devs.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevsFactoryImpl extends EFactoryImpl implements DevsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DevsFactory init() {
		try {
			DevsFactory theDevsFactory = (DevsFactory)EPackage.Registry.INSTANCE.getEFactory(DevsPackage.eNS_URI);
			if (theDevsFactory != null) {
				return theDevsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DevsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsFactoryImpl() {
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
			case DevsPackage.DEVS_MODEL: return createDEVSModel();
			case DevsPackage.ATOMIC_MODEL: return createAtomicModel();
			case DevsPackage.COUPLED_MODEL: return createCoupledModel();
			case DevsPackage.STATE: return createState();
			case DevsPackage.TIME_ADVANCE: return createTimeAdvance();
			case DevsPackage.LAMBDA: return createLambda();
			case DevsPackage.OUT_PORT: return createOutPort();
			case DevsPackage.IN_PORT: return createInPort();
			case DevsPackage.INTERNAL_TRANSITION: return createInternalTransition();
			case DevsPackage.EXTERNAL_TRANSITION: return createExternalTransition();
			case DevsPackage.EXTERNAL_INPUT_COUPLING: return createExternalInputCoupling();
			case DevsPackage.INTERNAL_COUPLING: return createInternalCoupling();
			case DevsPackage.OUTPUT_COUPLING: return createOutputCoupling();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEVSModel createDEVSModel() {
		DEVSModelImpl devsModel = new DEVSModelImpl();
		return devsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModel createAtomicModel() {
		AtomicModelImpl atomicModel = new AtomicModelImpl();
		return atomicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModel createCoupledModel() {
		CoupledModelImpl coupledModel = new CoupledModelImpl();
		return coupledModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvance createTimeAdvance() {
		TimeAdvanceImpl timeAdvance = new TimeAdvanceImpl();
		return timeAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lambda createLambda() {
		LambdaImpl lambda = new LambdaImpl();
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort createOutPort() {
		OutPortImpl outPort = new OutPortImpl();
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort createInPort() {
		InPortImpl inPort = new InPortImpl();
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalTransition createInternalTransition() {
		InternalTransitionImpl internalTransition = new InternalTransitionImpl();
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalTransition createExternalTransition() {
		ExternalTransitionImpl externalTransition = new ExternalTransitionImpl();
		return externalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalInputCoupling createExternalInputCoupling() {
		ExternalInputCouplingImpl externalInputCoupling = new ExternalInputCouplingImpl();
		return externalInputCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalCoupling createInternalCoupling() {
		InternalCouplingImpl internalCoupling = new InternalCouplingImpl();
		return internalCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputCoupling createOutputCoupling() {
		OutputCouplingImpl outputCoupling = new OutputCouplingImpl();
		return outputCoupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsPackage getDevsPackage() {
		return (DevsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DevsPackage getPackage() {
		return DevsPackage.eINSTANCE;
	}

} //DevsFactoryImpl
