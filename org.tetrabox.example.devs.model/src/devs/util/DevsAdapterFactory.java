/**
 */
package devs.util;

import devs.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see devs.DevsPackage
 * @generated
 */
public class DevsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DevsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsSwitch<Adapter> modelSwitch =
		new DevsSwitch<Adapter>() {
			@Override
			public Adapter caseDEVSModel(DEVSModel object) {
				return createDEVSModelAdapter();
			}
			@Override
			public Adapter caseAtomicModel(AtomicModel object) {
				return createAtomicModelAdapter();
			}
			@Override
			public Adapter caseCoupledModel(CoupledModel object) {
				return createCoupledModelAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseTimeAdvance(TimeAdvance object) {
				return createTimeAdvanceAdapter();
			}
			@Override
			public Adapter caseLambda(Lambda object) {
				return createLambdaAdapter();
			}
			@Override
			public Adapter caseOutPort(OutPort object) {
				return createOutPortAdapter();
			}
			@Override
			public Adapter caseInPort(InPort object) {
				return createInPortAdapter();
			}
			@Override
			public Adapter caseInternalTransition(InternalTransition object) {
				return createInternalTransitionAdapter();
			}
			@Override
			public Adapter caseExternalTransition(ExternalTransition object) {
				return createExternalTransitionAdapter();
			}
			@Override
			public Adapter caseExternalInputCoupling(ExternalInputCoupling object) {
				return createExternalInputCouplingAdapter();
			}
			@Override
			public Adapter caseInternalCoupling(InternalCoupling object) {
				return createInternalCouplingAdapter();
			}
			@Override
			public Adapter caseOutputCoupling(OutputCoupling object) {
				return createOutputCouplingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link devs.DEVSModel <em>DEVS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.DEVSModel
	 * @generated
	 */
	public Adapter createDEVSModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.AtomicModel <em>Atomic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.AtomicModel
	 * @generated
	 */
	public Adapter createAtomicModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.CoupledModel <em>Coupled Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.CoupledModel
	 * @generated
	 */
	public Adapter createCoupledModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.TimeAdvance <em>Time Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.TimeAdvance
	 * @generated
	 */
	public Adapter createTimeAdvanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.Lambda
	 * @generated
	 */
	public Adapter createLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.OutPort
	 * @generated
	 */
	public Adapter createOutPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.InPort
	 * @generated
	 */
	public Adapter createInPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.InternalTransition
	 * @generated
	 */
	public Adapter createInternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.ExternalTransition <em>External Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.ExternalTransition
	 * @generated
	 */
	public Adapter createExternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.ExternalInputCoupling <em>External Input Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.ExternalInputCoupling
	 * @generated
	 */
	public Adapter createExternalInputCouplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.InternalCoupling <em>Internal Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.InternalCoupling
	 * @generated
	 */
	public Adapter createInternalCouplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link devs.OutputCoupling <em>Output Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see devs.OutputCoupling
	 * @generated
	 */
	public Adapter createOutputCouplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DevsAdapterFactory
