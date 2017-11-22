/**
 */
package org.tetrabox.example.devs.event.devsevent.impl;

import devs.DevsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.executionframework.event.model.event.EventPackage;

import org.tetrabox.example.devs.event.devsevent.AtomicModelEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent;
import org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent;
import org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent;
import org.tetrabox.example.devs.event.devsevent.DevsDSLEvent;
import org.tetrabox.example.devs.event.devsevent.DevseventFactory;
import org.tetrabox.example.devs.event.devsevent.DevseventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevseventPackageImpl extends EPackageImpl implements DevseventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devsDSLEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicModelEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicModelReceiveXEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelReceiveXEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicModelSendDoneEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicModelReceiveInitEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelReceiveStarEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelReceiveYEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicModelSendYEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicModelReceiveStarEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelReceiveDoneEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelSendYEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelSendStarEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelSendInitEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelReceiveInitEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelSendDoneEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coupledModelSendXEventEClass = null;

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
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevseventPackageImpl() {
		super(eNS_URI, DevseventFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DevseventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DevseventPackage init() {
		if (isInited) return (DevseventPackage)EPackage.Registry.INSTANCE.getEPackage(DevseventPackage.eNS_URI);

		// Obtain or create and register package
		DevseventPackageImpl theDevseventPackage = (DevseventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DevseventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DevseventPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EventPackage.eINSTANCE.eClass();
		DevsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDevseventPackage.createPackageContents();

		// Initialize created meta-data
		theDevseventPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevseventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DevseventPackage.eNS_URI, theDevseventPackage);
		return theDevseventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevsDSLEvent() {
		return devsDSLEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicModelEvent() {
		return atomicModelEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicModelEvent_AtomicModel() {
		return (EReference)atomicModelEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicModelReceiveXEvent() {
		return atomicModelReceiveXEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelReceiveXEvent_Target() {
		return (EAttribute)atomicModelReceiveXEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelReceiveXEvent_X() {
		return (EAttribute)atomicModelReceiveXEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelReceiveXEvent_Time() {
		return (EAttribute)atomicModelReceiveXEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelEvent() {
		return coupledModelEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupledModelEvent_CoupledModel() {
		return (EReference)coupledModelEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelReceiveXEvent() {
		return coupledModelReceiveXEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveXEvent_Target() {
		return (EAttribute)coupledModelReceiveXEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveXEvent_X() {
		return (EAttribute)coupledModelReceiveXEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveXEvent_Time() {
		return (EAttribute)coupledModelReceiveXEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicModelSendDoneEvent() {
		return atomicModelSendDoneEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelSendDoneEvent_Source() {
		return (EAttribute)atomicModelSendDoneEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelSendDoneEvent_Time() {
		return (EAttribute)atomicModelSendDoneEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicModelReceiveInitEvent() {
		return atomicModelReceiveInitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelReceiveInitEvent_Source() {
		return (EAttribute)atomicModelReceiveInitEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelReceiveInitEvent_Time() {
		return (EAttribute)atomicModelReceiveInitEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelReceiveStarEvent() {
		return coupledModelReceiveStarEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveStarEvent_Target() {
		return (EAttribute)coupledModelReceiveStarEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveStarEvent_Time() {
		return (EAttribute)coupledModelReceiveStarEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelReceiveYEvent() {
		return coupledModelReceiveYEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveYEvent_Source() {
		return (EAttribute)coupledModelReceiveYEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveYEvent_Y() {
		return (EAttribute)coupledModelReceiveYEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveYEvent_Time() {
		return (EAttribute)coupledModelReceiveYEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicModelSendYEvent() {
		return atomicModelSendYEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelSendYEvent_Source() {
		return (EAttribute)atomicModelSendYEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelSendYEvent_Y() {
		return (EAttribute)atomicModelSendYEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelSendYEvent_Time() {
		return (EAttribute)atomicModelSendYEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicModelReceiveStarEvent() {
		return atomicModelReceiveStarEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelReceiveStarEvent_Target() {
		return (EAttribute)atomicModelReceiveStarEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicModelReceiveStarEvent_Time() {
		return (EAttribute)atomicModelReceiveStarEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelReceiveDoneEvent() {
		return coupledModelReceiveDoneEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveDoneEvent_Source() {
		return (EAttribute)coupledModelReceiveDoneEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveDoneEvent_Time() {
		return (EAttribute)coupledModelReceiveDoneEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelSendYEvent() {
		return coupledModelSendYEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendYEvent_Source() {
		return (EAttribute)coupledModelSendYEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendYEvent_Y() {
		return (EAttribute)coupledModelSendYEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendYEvent_Time() {
		return (EAttribute)coupledModelSendYEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelSendStarEvent() {
		return coupledModelSendStarEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendStarEvent_Target() {
		return (EAttribute)coupledModelSendStarEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendStarEvent_Time() {
		return (EAttribute)coupledModelSendStarEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelSendInitEvent() {
		return coupledModelSendInitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendInitEvent_Source() {
		return (EAttribute)coupledModelSendInitEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendInitEvent_Time() {
		return (EAttribute)coupledModelSendInitEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelReceiveInitEvent() {
		return coupledModelReceiveInitEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveInitEvent_Source() {
		return (EAttribute)coupledModelReceiveInitEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelReceiveInitEvent_Time() {
		return (EAttribute)coupledModelReceiveInitEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelSendDoneEvent() {
		return coupledModelSendDoneEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendDoneEvent_Source() {
		return (EAttribute)coupledModelSendDoneEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendDoneEvent_Time() {
		return (EAttribute)coupledModelSendDoneEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupledModelSendXEvent() {
		return coupledModelSendXEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendXEvent_Target() {
		return (EAttribute)coupledModelSendXEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendXEvent_X() {
		return (EAttribute)coupledModelSendXEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupledModelSendXEvent_Time() {
		return (EAttribute)coupledModelSendXEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevseventFactory getDevseventFactory() {
		return (DevseventFactory)getEFactoryInstance();
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
		devsDSLEventEClass = createEClass(DEVS_DSL_EVENT);

		atomicModelEventEClass = createEClass(ATOMIC_MODEL_EVENT);
		createEReference(atomicModelEventEClass, ATOMIC_MODEL_EVENT__ATOMIC_MODEL);

		atomicModelReceiveXEventEClass = createEClass(ATOMIC_MODEL_RECEIVE_XEVENT);
		createEAttribute(atomicModelReceiveXEventEClass, ATOMIC_MODEL_RECEIVE_XEVENT__TARGET);
		createEAttribute(atomicModelReceiveXEventEClass, ATOMIC_MODEL_RECEIVE_XEVENT__X);
		createEAttribute(atomicModelReceiveXEventEClass, ATOMIC_MODEL_RECEIVE_XEVENT__TIME);

		coupledModelEventEClass = createEClass(COUPLED_MODEL_EVENT);
		createEReference(coupledModelEventEClass, COUPLED_MODEL_EVENT__COUPLED_MODEL);

		coupledModelReceiveXEventEClass = createEClass(COUPLED_MODEL_RECEIVE_XEVENT);
		createEAttribute(coupledModelReceiveXEventEClass, COUPLED_MODEL_RECEIVE_XEVENT__TARGET);
		createEAttribute(coupledModelReceiveXEventEClass, COUPLED_MODEL_RECEIVE_XEVENT__X);
		createEAttribute(coupledModelReceiveXEventEClass, COUPLED_MODEL_RECEIVE_XEVENT__TIME);

		atomicModelSendDoneEventEClass = createEClass(ATOMIC_MODEL_SEND_DONE_EVENT);
		createEAttribute(atomicModelSendDoneEventEClass, ATOMIC_MODEL_SEND_DONE_EVENT__SOURCE);
		createEAttribute(atomicModelSendDoneEventEClass, ATOMIC_MODEL_SEND_DONE_EVENT__TIME);

		atomicModelReceiveInitEventEClass = createEClass(ATOMIC_MODEL_RECEIVE_INIT_EVENT);
		createEAttribute(atomicModelReceiveInitEventEClass, ATOMIC_MODEL_RECEIVE_INIT_EVENT__SOURCE);
		createEAttribute(atomicModelReceiveInitEventEClass, ATOMIC_MODEL_RECEIVE_INIT_EVENT__TIME);

		coupledModelReceiveStarEventEClass = createEClass(COUPLED_MODEL_RECEIVE_STAR_EVENT);
		createEAttribute(coupledModelReceiveStarEventEClass, COUPLED_MODEL_RECEIVE_STAR_EVENT__TARGET);
		createEAttribute(coupledModelReceiveStarEventEClass, COUPLED_MODEL_RECEIVE_STAR_EVENT__TIME);

		coupledModelReceiveYEventEClass = createEClass(COUPLED_MODEL_RECEIVE_YEVENT);
		createEAttribute(coupledModelReceiveYEventEClass, COUPLED_MODEL_RECEIVE_YEVENT__SOURCE);
		createEAttribute(coupledModelReceiveYEventEClass, COUPLED_MODEL_RECEIVE_YEVENT__Y);
		createEAttribute(coupledModelReceiveYEventEClass, COUPLED_MODEL_RECEIVE_YEVENT__TIME);

		atomicModelSendYEventEClass = createEClass(ATOMIC_MODEL_SEND_YEVENT);
		createEAttribute(atomicModelSendYEventEClass, ATOMIC_MODEL_SEND_YEVENT__SOURCE);
		createEAttribute(atomicModelSendYEventEClass, ATOMIC_MODEL_SEND_YEVENT__Y);
		createEAttribute(atomicModelSendYEventEClass, ATOMIC_MODEL_SEND_YEVENT__TIME);

		atomicModelReceiveStarEventEClass = createEClass(ATOMIC_MODEL_RECEIVE_STAR_EVENT);
		createEAttribute(atomicModelReceiveStarEventEClass, ATOMIC_MODEL_RECEIVE_STAR_EVENT__TARGET);
		createEAttribute(atomicModelReceiveStarEventEClass, ATOMIC_MODEL_RECEIVE_STAR_EVENT__TIME);

		coupledModelReceiveDoneEventEClass = createEClass(COUPLED_MODEL_RECEIVE_DONE_EVENT);
		createEAttribute(coupledModelReceiveDoneEventEClass, COUPLED_MODEL_RECEIVE_DONE_EVENT__SOURCE);
		createEAttribute(coupledModelReceiveDoneEventEClass, COUPLED_MODEL_RECEIVE_DONE_EVENT__TIME);

		coupledModelSendYEventEClass = createEClass(COUPLED_MODEL_SEND_YEVENT);
		createEAttribute(coupledModelSendYEventEClass, COUPLED_MODEL_SEND_YEVENT__SOURCE);
		createEAttribute(coupledModelSendYEventEClass, COUPLED_MODEL_SEND_YEVENT__Y);
		createEAttribute(coupledModelSendYEventEClass, COUPLED_MODEL_SEND_YEVENT__TIME);

		coupledModelSendStarEventEClass = createEClass(COUPLED_MODEL_SEND_STAR_EVENT);
		createEAttribute(coupledModelSendStarEventEClass, COUPLED_MODEL_SEND_STAR_EVENT__TARGET);
		createEAttribute(coupledModelSendStarEventEClass, COUPLED_MODEL_SEND_STAR_EVENT__TIME);

		coupledModelSendInitEventEClass = createEClass(COUPLED_MODEL_SEND_INIT_EVENT);
		createEAttribute(coupledModelSendInitEventEClass, COUPLED_MODEL_SEND_INIT_EVENT__SOURCE);
		createEAttribute(coupledModelSendInitEventEClass, COUPLED_MODEL_SEND_INIT_EVENT__TIME);

		coupledModelReceiveInitEventEClass = createEClass(COUPLED_MODEL_RECEIVE_INIT_EVENT);
		createEAttribute(coupledModelReceiveInitEventEClass, COUPLED_MODEL_RECEIVE_INIT_EVENT__SOURCE);
		createEAttribute(coupledModelReceiveInitEventEClass, COUPLED_MODEL_RECEIVE_INIT_EVENT__TIME);

		coupledModelSendDoneEventEClass = createEClass(COUPLED_MODEL_SEND_DONE_EVENT);
		createEAttribute(coupledModelSendDoneEventEClass, COUPLED_MODEL_SEND_DONE_EVENT__SOURCE);
		createEAttribute(coupledModelSendDoneEventEClass, COUPLED_MODEL_SEND_DONE_EVENT__TIME);

		coupledModelSendXEventEClass = createEClass(COUPLED_MODEL_SEND_XEVENT);
		createEAttribute(coupledModelSendXEventEClass, COUPLED_MODEL_SEND_XEVENT__TARGET);
		createEAttribute(coupledModelSendXEventEClass, COUPLED_MODEL_SEND_XEVENT__X);
		createEAttribute(coupledModelSendXEventEClass, COUPLED_MODEL_SEND_XEVENT__TIME);
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

		// Obtain other dependent packages
		EventPackage theEventPackage = (EventPackage)EPackage.Registry.INSTANCE.getEPackage(EventPackage.eNS_URI);
		DevsPackage theDevsPackage = (DevsPackage)EPackage.Registry.INSTANCE.getEPackage(DevsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		devsDSLEventEClass.getESuperTypes().add(theEventPackage.getEvent());
		atomicModelEventEClass.getESuperTypes().add(this.getDevsDSLEvent());
		atomicModelReceiveXEventEClass.getESuperTypes().add(this.getAtomicModelEvent());
		coupledModelEventEClass.getESuperTypes().add(this.getDevsDSLEvent());
		coupledModelReceiveXEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		atomicModelSendDoneEventEClass.getESuperTypes().add(this.getAtomicModelEvent());
		atomicModelReceiveInitEventEClass.getESuperTypes().add(this.getAtomicModelEvent());
		coupledModelReceiveStarEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		coupledModelReceiveYEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		atomicModelSendYEventEClass.getESuperTypes().add(this.getAtomicModelEvent());
		atomicModelReceiveStarEventEClass.getESuperTypes().add(this.getAtomicModelEvent());
		coupledModelReceiveDoneEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		coupledModelSendYEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		coupledModelSendStarEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		coupledModelSendInitEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		coupledModelReceiveInitEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		coupledModelSendDoneEventEClass.getESuperTypes().add(this.getCoupledModelEvent());
		coupledModelSendXEventEClass.getESuperTypes().add(this.getCoupledModelEvent());

		// Initialize classes and features; add operations and parameters
		initEClass(devsDSLEventEClass, DevsDSLEvent.class, "DevsDSLEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicModelEventEClass, AtomicModelEvent.class, "AtomicModelEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicModelEvent_AtomicModel(), theDevsPackage.getAtomicModel(), null, "atomicModel", null, 1, 1, AtomicModelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicModelReceiveXEventEClass, AtomicModelReceiveXEvent.class, "AtomicModelReceiveXEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicModelReceiveXEvent_Target(), ecorePackage.getEString(), "target", null, 1, 1, AtomicModelReceiveXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicModelReceiveXEvent_X(), ecorePackage.getEString(), "x", null, 1, 1, AtomicModelReceiveXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicModelReceiveXEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, AtomicModelReceiveXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelEventEClass, CoupledModelEvent.class, "CoupledModelEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoupledModelEvent_CoupledModel(), theDevsPackage.getCoupledModel(), null, "coupledModel", null, 1, 1, CoupledModelEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelReceiveXEventEClass, CoupledModelReceiveXEvent.class, "CoupledModelReceiveXEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelReceiveXEvent_Target(), ecorePackage.getEString(), "target", null, 1, 1, CoupledModelReceiveXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelReceiveXEvent_X(), ecorePackage.getEString(), "x", null, 1, 1, CoupledModelReceiveXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelReceiveXEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelReceiveXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicModelSendDoneEventEClass, AtomicModelSendDoneEvent.class, "AtomicModelSendDoneEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicModelSendDoneEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, AtomicModelSendDoneEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicModelSendDoneEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, AtomicModelSendDoneEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicModelReceiveInitEventEClass, AtomicModelReceiveInitEvent.class, "AtomicModelReceiveInitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicModelReceiveInitEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, AtomicModelReceiveInitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicModelReceiveInitEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, AtomicModelReceiveInitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelReceiveStarEventEClass, CoupledModelReceiveStarEvent.class, "CoupledModelReceiveStarEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelReceiveStarEvent_Target(), ecorePackage.getEString(), "target", null, 1, 1, CoupledModelReceiveStarEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelReceiveStarEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelReceiveStarEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelReceiveYEventEClass, CoupledModelReceiveYEvent.class, "CoupledModelReceiveYEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelReceiveYEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, CoupledModelReceiveYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelReceiveYEvent_Y(), ecorePackage.getEString(), "y", null, 1, 1, CoupledModelReceiveYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelReceiveYEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelReceiveYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicModelSendYEventEClass, AtomicModelSendYEvent.class, "AtomicModelSendYEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicModelSendYEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, AtomicModelSendYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicModelSendYEvent_Y(), ecorePackage.getEString(), "y", null, 1, 1, AtomicModelSendYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicModelSendYEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, AtomicModelSendYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicModelReceiveStarEventEClass, AtomicModelReceiveStarEvent.class, "AtomicModelReceiveStarEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicModelReceiveStarEvent_Target(), ecorePackage.getEString(), "target", null, 1, 1, AtomicModelReceiveStarEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicModelReceiveStarEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, AtomicModelReceiveStarEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelReceiveDoneEventEClass, CoupledModelReceiveDoneEvent.class, "CoupledModelReceiveDoneEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelReceiveDoneEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, CoupledModelReceiveDoneEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelReceiveDoneEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelReceiveDoneEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelSendYEventEClass, CoupledModelSendYEvent.class, "CoupledModelSendYEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelSendYEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, CoupledModelSendYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelSendYEvent_Y(), ecorePackage.getEString(), "y", null, 1, 1, CoupledModelSendYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelSendYEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelSendYEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelSendStarEventEClass, CoupledModelSendStarEvent.class, "CoupledModelSendStarEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelSendStarEvent_Target(), ecorePackage.getEString(), "target", null, 1, 1, CoupledModelSendStarEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelSendStarEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelSendStarEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelSendInitEventEClass, CoupledModelSendInitEvent.class, "CoupledModelSendInitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelSendInitEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, CoupledModelSendInitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelSendInitEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelSendInitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelReceiveInitEventEClass, CoupledModelReceiveInitEvent.class, "CoupledModelReceiveInitEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelReceiveInitEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, CoupledModelReceiveInitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelReceiveInitEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelReceiveInitEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelSendDoneEventEClass, CoupledModelSendDoneEvent.class, "CoupledModelSendDoneEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelSendDoneEvent_Source(), ecorePackage.getEString(), "source", null, 1, 1, CoupledModelSendDoneEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelSendDoneEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelSendDoneEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coupledModelSendXEventEClass, CoupledModelSendXEvent.class, "CoupledModelSendXEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupledModelSendXEvent_Target(), ecorePackage.getEString(), "target", null, 1, 1, CoupledModelSendXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelSendXEvent_X(), ecorePackage.getEString(), "x", null, 1, 1, CoupledModelSendXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoupledModelSendXEvent_Time(), ecorePackage.getEFloat(), "time", null, 1, 1, CoupledModelSendXEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DevseventPackageImpl
