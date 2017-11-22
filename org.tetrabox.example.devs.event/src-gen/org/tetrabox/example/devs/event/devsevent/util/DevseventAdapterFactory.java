/**
 */
package org.tetrabox.example.devs.event.devsevent.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.executionframework.event.model.event.Event;

import org.tetrabox.example.devs.event.devsevent.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage
 * @generated
 */
public class DevseventAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevseventPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevseventAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DevseventPackage.eINSTANCE;
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
	protected DevseventSwitch<Adapter> modelSwitch =
		new DevseventSwitch<Adapter>() {
			@Override
			public Adapter caseDevsDSLEvent(DevsDSLEvent object) {
				return createDevsDSLEventAdapter();
			}
			@Override
			public Adapter caseAtomicModelEvent(AtomicModelEvent object) {
				return createAtomicModelEventAdapter();
			}
			@Override
			public Adapter caseAtomicModelReceiveXEvent(AtomicModelReceiveXEvent object) {
				return createAtomicModelReceiveXEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelEvent(CoupledModelEvent object) {
				return createCoupledModelEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelReceiveXEvent(CoupledModelReceiveXEvent object) {
				return createCoupledModelReceiveXEventAdapter();
			}
			@Override
			public Adapter caseAtomicModelSendDoneEvent(AtomicModelSendDoneEvent object) {
				return createAtomicModelSendDoneEventAdapter();
			}
			@Override
			public Adapter caseAtomicModelReceiveInitEvent(AtomicModelReceiveInitEvent object) {
				return createAtomicModelReceiveInitEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelReceiveStarEvent(CoupledModelReceiveStarEvent object) {
				return createCoupledModelReceiveStarEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelReceiveYEvent(CoupledModelReceiveYEvent object) {
				return createCoupledModelReceiveYEventAdapter();
			}
			@Override
			public Adapter caseAtomicModelSendYEvent(AtomicModelSendYEvent object) {
				return createAtomicModelSendYEventAdapter();
			}
			@Override
			public Adapter caseAtomicModelReceiveStarEvent(AtomicModelReceiveStarEvent object) {
				return createAtomicModelReceiveStarEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelReceiveDoneEvent(CoupledModelReceiveDoneEvent object) {
				return createCoupledModelReceiveDoneEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelSendYEvent(CoupledModelSendYEvent object) {
				return createCoupledModelSendYEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelSendStarEvent(CoupledModelSendStarEvent object) {
				return createCoupledModelSendStarEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelSendInitEvent(CoupledModelSendInitEvent object) {
				return createCoupledModelSendInitEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelReceiveInitEvent(CoupledModelReceiveInitEvent object) {
				return createCoupledModelReceiveInitEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelSendDoneEvent(CoupledModelSendDoneEvent object) {
				return createCoupledModelSendDoneEventAdapter();
			}
			@Override
			public Adapter caseCoupledModelSendXEvent(CoupledModelSendXEvent object) {
				return createCoupledModelSendXEventAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.DevsDSLEvent <em>Devs DSL Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.DevsDSLEvent
	 * @generated
	 */
	public Adapter createDevsDSLEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelEvent <em>Atomic Model Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelEvent
	 * @generated
	 */
	public Adapter createAtomicModelEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent <em>Atomic Model Receive XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent
	 * @generated
	 */
	public Adapter createAtomicModelReceiveXEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelEvent <em>Coupled Model Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelEvent
	 * @generated
	 */
	public Adapter createCoupledModelEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent <em>Coupled Model Receive XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent
	 * @generated
	 */
	public Adapter createCoupledModelReceiveXEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent <em>Atomic Model Send Done Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent
	 * @generated
	 */
	public Adapter createAtomicModelSendDoneEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent <em>Atomic Model Receive Init Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent
	 * @generated
	 */
	public Adapter createAtomicModelReceiveInitEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent <em>Coupled Model Receive Star Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent
	 * @generated
	 */
	public Adapter createCoupledModelReceiveStarEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent <em>Coupled Model Receive YEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent
	 * @generated
	 */
	public Adapter createCoupledModelReceiveYEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent <em>Atomic Model Send YEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent
	 * @generated
	 */
	public Adapter createAtomicModelSendYEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent <em>Atomic Model Receive Star Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent
	 * @generated
	 */
	public Adapter createAtomicModelReceiveStarEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent <em>Coupled Model Receive Done Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent
	 * @generated
	 */
	public Adapter createCoupledModelReceiveDoneEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent <em>Coupled Model Send YEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent
	 * @generated
	 */
	public Adapter createCoupledModelSendYEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent <em>Coupled Model Send Star Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent
	 * @generated
	 */
	public Adapter createCoupledModelSendStarEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent <em>Coupled Model Send Init Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent
	 * @generated
	 */
	public Adapter createCoupledModelSendInitEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent <em>Coupled Model Receive Init Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent
	 * @generated
	 */
	public Adapter createCoupledModelReceiveInitEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent <em>Coupled Model Send Done Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent
	 * @generated
	 */
	public Adapter createCoupledModelSendDoneEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent <em>Coupled Model Send XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent
	 * @generated
	 */
	public Adapter createCoupledModelSendXEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.executionframework.event.model.event.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.executionframework.event.model.event.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
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

} //DevseventAdapterFactory
