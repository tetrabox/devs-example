/**
 */
package org.tetrabox.example.devs.event.devsevent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gemoc.executionframework.event.model.event.EventPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.devs.event.devsevent.DevseventFactory
 * @model kind="package"
 * @generated
 */
public interface DevseventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devsevent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.tetrabox.example.devs/modelevent/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devsevent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DevseventPackage eINSTANCE = org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.DevsDSLEventImpl <em>Devs DSL Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevsDSLEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getDevsDSLEvent()
	 * @generated
	 */
	int DEVS_DSL_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Devs DSL Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVS_DSL_EVENT_FEATURE_COUNT = EventPackage.EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelEventImpl <em>Atomic Model Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelEvent()
	 * @generated
	 */
	int ATOMIC_MODEL_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Atomic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_EVENT__ATOMIC_MODEL = DEVS_DSL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Model Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_EVENT_FEATURE_COUNT = DEVS_DSL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveXEventImpl <em>Atomic Model Receive XEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveXEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelReceiveXEvent()
	 * @generated
	 */
	int ATOMIC_MODEL_RECEIVE_XEVENT = 2;

	/**
	 * The feature id for the '<em><b>Atomic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_XEVENT__ATOMIC_MODEL = ATOMIC_MODEL_EVENT__ATOMIC_MODEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_XEVENT__TARGET = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_XEVENT__X = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_XEVENT__TIME = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atomic Model Receive XEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_XEVENT_FEATURE_COUNT = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelEventImpl <em>Coupled Model Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelEvent()
	 * @generated
	 */
	int COUPLED_MODEL_EVENT = 3;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_EVENT__COUPLED_MODEL = DEVS_DSL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coupled Model Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_EVENT_FEATURE_COUNT = DEVS_DSL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveXEventImpl <em>Coupled Model Receive XEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveXEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveXEvent()
	 * @generated
	 */
	int COUPLED_MODEL_RECEIVE_XEVENT = 4;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_XEVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_XEVENT__TARGET = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_XEVENT__X = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_XEVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coupled Model Receive XEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_XEVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelSendDoneEventImpl <em>Atomic Model Send Done Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelSendDoneEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelSendDoneEvent()
	 * @generated
	 */
	int ATOMIC_MODEL_SEND_DONE_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Atomic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_DONE_EVENT__ATOMIC_MODEL = ATOMIC_MODEL_EVENT__ATOMIC_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_DONE_EVENT__SOURCE = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_DONE_EVENT__TIME = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Model Send Done Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_DONE_EVENT_FEATURE_COUNT = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveInitEventImpl <em>Atomic Model Receive Init Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveInitEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelReceiveInitEvent()
	 * @generated
	 */
	int ATOMIC_MODEL_RECEIVE_INIT_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Atomic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_INIT_EVENT__ATOMIC_MODEL = ATOMIC_MODEL_EVENT__ATOMIC_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_INIT_EVENT__SOURCE = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_INIT_EVENT__TIME = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Model Receive Init Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_INIT_EVENT_FEATURE_COUNT = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveStarEventImpl <em>Coupled Model Receive Star Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveStarEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveStarEvent()
	 * @generated
	 */
	int COUPLED_MODEL_RECEIVE_STAR_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_STAR_EVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_STAR_EVENT__TARGET = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_STAR_EVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coupled Model Receive Star Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_STAR_EVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveYEventImpl <em>Coupled Model Receive YEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveYEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveYEvent()
	 * @generated
	 */
	int COUPLED_MODEL_RECEIVE_YEVENT = 8;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_YEVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_YEVENT__SOURCE = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_YEVENT__Y = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_YEVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coupled Model Receive YEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_YEVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelSendYEventImpl <em>Atomic Model Send YEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelSendYEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelSendYEvent()
	 * @generated
	 */
	int ATOMIC_MODEL_SEND_YEVENT = 9;

	/**
	 * The feature id for the '<em><b>Atomic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_YEVENT__ATOMIC_MODEL = ATOMIC_MODEL_EVENT__ATOMIC_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_YEVENT__SOURCE = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_YEVENT__Y = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_YEVENT__TIME = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atomic Model Send YEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_SEND_YEVENT_FEATURE_COUNT = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveStarEventImpl <em>Atomic Model Receive Star Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveStarEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelReceiveStarEvent()
	 * @generated
	 */
	int ATOMIC_MODEL_RECEIVE_STAR_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Atomic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_STAR_EVENT__ATOMIC_MODEL = ATOMIC_MODEL_EVENT__ATOMIC_MODEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_STAR_EVENT__TARGET = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_STAR_EVENT__TIME = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Atomic Model Receive Star Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_MODEL_RECEIVE_STAR_EVENT_FEATURE_COUNT = ATOMIC_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveDoneEventImpl <em>Coupled Model Receive Done Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveDoneEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveDoneEvent()
	 * @generated
	 */
	int COUPLED_MODEL_RECEIVE_DONE_EVENT = 11;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_DONE_EVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_DONE_EVENT__SOURCE = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_DONE_EVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coupled Model Receive Done Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_DONE_EVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendYEventImpl <em>Coupled Model Send YEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendYEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendYEvent()
	 * @generated
	 */
	int COUPLED_MODEL_SEND_YEVENT = 12;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_YEVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_YEVENT__SOURCE = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_YEVENT__Y = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_YEVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coupled Model Send YEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_YEVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendStarEventImpl <em>Coupled Model Send Star Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendStarEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendStarEvent()
	 * @generated
	 */
	int COUPLED_MODEL_SEND_STAR_EVENT = 13;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_STAR_EVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_STAR_EVENT__TARGET = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_STAR_EVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coupled Model Send Star Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_STAR_EVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendInitEventImpl <em>Coupled Model Send Init Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendInitEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendInitEvent()
	 * @generated
	 */
	int COUPLED_MODEL_SEND_INIT_EVENT = 14;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_INIT_EVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_INIT_EVENT__SOURCE = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_INIT_EVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coupled Model Send Init Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_INIT_EVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveInitEventImpl <em>Coupled Model Receive Init Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveInitEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveInitEvent()
	 * @generated
	 */
	int COUPLED_MODEL_RECEIVE_INIT_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_INIT_EVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_INIT_EVENT__SOURCE = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_INIT_EVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coupled Model Receive Init Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_RECEIVE_INIT_EVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendDoneEventImpl <em>Coupled Model Send Done Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendDoneEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendDoneEvent()
	 * @generated
	 */
	int COUPLED_MODEL_SEND_DONE_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_DONE_EVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_DONE_EVENT__SOURCE = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_DONE_EVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coupled Model Send Done Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_DONE_EVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendXEventImpl <em>Coupled Model Send XEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendXEventImpl
	 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendXEvent()
	 * @generated
	 */
	int COUPLED_MODEL_SEND_XEVENT = 17;

	/**
	 * The feature id for the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_XEVENT__COUPLED_MODEL = COUPLED_MODEL_EVENT__COUPLED_MODEL;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_XEVENT__TARGET = COUPLED_MODEL_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_XEVENT__X = COUPLED_MODEL_EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_XEVENT__TIME = COUPLED_MODEL_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Coupled Model Send XEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLED_MODEL_SEND_XEVENT_FEATURE_COUNT = COUPLED_MODEL_EVENT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.DevsDSLEvent <em>Devs DSL Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devs DSL Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.DevsDSLEvent
	 * @generated
	 */
	EClass getDevsDSLEvent();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelEvent <em>Atomic Model Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Model Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelEvent
	 * @generated
	 */
	EClass getAtomicModelEvent();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelEvent#getAtomicModel <em>Atomic Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Atomic Model</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelEvent#getAtomicModel()
	 * @see #getAtomicModelEvent()
	 * @generated
	 */
	EReference getAtomicModelEvent_AtomicModel();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent <em>Atomic Model Receive XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Model Receive XEvent</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent
	 * @generated
	 */
	EClass getAtomicModelReceiveXEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent#getTarget()
	 * @see #getAtomicModelReceiveXEvent()
	 * @generated
	 */
	EAttribute getAtomicModelReceiveXEvent_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent#getX()
	 * @see #getAtomicModelReceiveXEvent()
	 * @generated
	 */
	EAttribute getAtomicModelReceiveXEvent_X();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent#getTime()
	 * @see #getAtomicModelReceiveXEvent()
	 * @generated
	 */
	EAttribute getAtomicModelReceiveXEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelEvent <em>Coupled Model Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelEvent
	 * @generated
	 */
	EClass getCoupledModelEvent();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelEvent#getCoupledModel <em>Coupled Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coupled Model</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelEvent#getCoupledModel()
	 * @see #getCoupledModelEvent()
	 * @generated
	 */
	EReference getCoupledModelEvent_CoupledModel();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent <em>Coupled Model Receive XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Receive XEvent</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent
	 * @generated
	 */
	EClass getCoupledModelReceiveXEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent#getTarget()
	 * @see #getCoupledModelReceiveXEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveXEvent_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent#getX()
	 * @see #getCoupledModelReceiveXEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveXEvent_X();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveXEvent#getTime()
	 * @see #getCoupledModelReceiveXEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveXEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent <em>Atomic Model Send Done Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Model Send Done Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent
	 * @generated
	 */
	EClass getAtomicModelSendDoneEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent#getSource()
	 * @see #getAtomicModelSendDoneEvent()
	 * @generated
	 */
	EAttribute getAtomicModelSendDoneEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendDoneEvent#getTime()
	 * @see #getAtomicModelSendDoneEvent()
	 * @generated
	 */
	EAttribute getAtomicModelSendDoneEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent <em>Atomic Model Receive Init Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Model Receive Init Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent
	 * @generated
	 */
	EClass getAtomicModelReceiveInitEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent#getSource()
	 * @see #getAtomicModelReceiveInitEvent()
	 * @generated
	 */
	EAttribute getAtomicModelReceiveInitEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveInitEvent#getTime()
	 * @see #getAtomicModelReceiveInitEvent()
	 * @generated
	 */
	EAttribute getAtomicModelReceiveInitEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent <em>Coupled Model Receive Star Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Receive Star Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent
	 * @generated
	 */
	EClass getCoupledModelReceiveStarEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent#getTarget()
	 * @see #getCoupledModelReceiveStarEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveStarEvent_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent#getTime()
	 * @see #getCoupledModelReceiveStarEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveStarEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent <em>Coupled Model Receive YEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Receive YEvent</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent
	 * @generated
	 */
	EClass getCoupledModelReceiveYEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent#getSource()
	 * @see #getCoupledModelReceiveYEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveYEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent#getY()
	 * @see #getCoupledModelReceiveYEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveYEvent_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveYEvent#getTime()
	 * @see #getCoupledModelReceiveYEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveYEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent <em>Atomic Model Send YEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Model Send YEvent</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent
	 * @generated
	 */
	EClass getAtomicModelSendYEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent#getSource()
	 * @see #getAtomicModelSendYEvent()
	 * @generated
	 */
	EAttribute getAtomicModelSendYEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent#getY()
	 * @see #getAtomicModelSendYEvent()
	 * @generated
	 */
	EAttribute getAtomicModelSendYEvent_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelSendYEvent#getTime()
	 * @see #getAtomicModelSendYEvent()
	 * @generated
	 */
	EAttribute getAtomicModelSendYEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent <em>Atomic Model Receive Star Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Model Receive Star Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent
	 * @generated
	 */
	EClass getAtomicModelReceiveStarEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent#getTarget()
	 * @see #getAtomicModelReceiveStarEvent()
	 * @generated
	 */
	EAttribute getAtomicModelReceiveStarEvent_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveStarEvent#getTime()
	 * @see #getAtomicModelReceiveStarEvent()
	 * @generated
	 */
	EAttribute getAtomicModelReceiveStarEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent <em>Coupled Model Receive Done Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Receive Done Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent
	 * @generated
	 */
	EClass getCoupledModelReceiveDoneEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent#getSource()
	 * @see #getCoupledModelReceiveDoneEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveDoneEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveDoneEvent#getTime()
	 * @see #getCoupledModelReceiveDoneEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveDoneEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent <em>Coupled Model Send YEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Send YEvent</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent
	 * @generated
	 */
	EClass getCoupledModelSendYEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getSource()
	 * @see #getCoupledModelSendYEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendYEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getY()
	 * @see #getCoupledModelSendYEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendYEvent_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getTime()
	 * @see #getCoupledModelSendYEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendYEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent <em>Coupled Model Send Star Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Send Star Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent
	 * @generated
	 */
	EClass getCoupledModelSendStarEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent#getTarget()
	 * @see #getCoupledModelSendStarEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendStarEvent_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendStarEvent#getTime()
	 * @see #getCoupledModelSendStarEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendStarEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent <em>Coupled Model Send Init Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Send Init Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent
	 * @generated
	 */
	EClass getCoupledModelSendInitEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent#getSource()
	 * @see #getCoupledModelSendInitEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendInitEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendInitEvent#getTime()
	 * @see #getCoupledModelSendInitEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendInitEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent <em>Coupled Model Receive Init Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Receive Init Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent
	 * @generated
	 */
	EClass getCoupledModelReceiveInitEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent#getSource()
	 * @see #getCoupledModelReceiveInitEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveInitEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent#getTime()
	 * @see #getCoupledModelReceiveInitEvent()
	 * @generated
	 */
	EAttribute getCoupledModelReceiveInitEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent <em>Coupled Model Send Done Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Send Done Event</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent
	 * @generated
	 */
	EClass getCoupledModelSendDoneEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent#getSource()
	 * @see #getCoupledModelSendDoneEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendDoneEvent_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendDoneEvent#getTime()
	 * @see #getCoupledModelSendDoneEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendDoneEvent_Time();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent <em>Coupled Model Send XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupled Model Send XEvent</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent
	 * @generated
	 */
	EClass getCoupledModelSendXEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent#getTarget()
	 * @see #getCoupledModelSendXEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendXEvent_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent#getX()
	 * @see #getCoupledModelSendXEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendXEvent_X();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.tetrabox.example.devs.event.devsevent.CoupledModelSendXEvent#getTime()
	 * @see #getCoupledModelSendXEvent()
	 * @generated
	 */
	EAttribute getCoupledModelSendXEvent_Time();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DevseventFactory getDevseventFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.DevsDSLEventImpl <em>Devs DSL Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevsDSLEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getDevsDSLEvent()
		 * @generated
		 */
		EClass DEVS_DSL_EVENT = eINSTANCE.getDevsDSLEvent();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelEventImpl <em>Atomic Model Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelEvent()
		 * @generated
		 */
		EClass ATOMIC_MODEL_EVENT = eINSTANCE.getAtomicModelEvent();

		/**
		 * The meta object literal for the '<em><b>Atomic Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_MODEL_EVENT__ATOMIC_MODEL = eINSTANCE.getAtomicModelEvent_AtomicModel();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveXEventImpl <em>Atomic Model Receive XEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveXEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelReceiveXEvent()
		 * @generated
		 */
		EClass ATOMIC_MODEL_RECEIVE_XEVENT = eINSTANCE.getAtomicModelReceiveXEvent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_RECEIVE_XEVENT__TARGET = eINSTANCE.getAtomicModelReceiveXEvent_Target();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_RECEIVE_XEVENT__X = eINSTANCE.getAtomicModelReceiveXEvent_X();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_RECEIVE_XEVENT__TIME = eINSTANCE.getAtomicModelReceiveXEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelEventImpl <em>Coupled Model Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_EVENT = eINSTANCE.getCoupledModelEvent();

		/**
		 * The meta object literal for the '<em><b>Coupled Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLED_MODEL_EVENT__COUPLED_MODEL = eINSTANCE.getCoupledModelEvent_CoupledModel();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveXEventImpl <em>Coupled Model Receive XEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveXEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveXEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_RECEIVE_XEVENT = eINSTANCE.getCoupledModelReceiveXEvent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_XEVENT__TARGET = eINSTANCE.getCoupledModelReceiveXEvent_Target();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_XEVENT__X = eINSTANCE.getCoupledModelReceiveXEvent_X();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_XEVENT__TIME = eINSTANCE.getCoupledModelReceiveXEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelSendDoneEventImpl <em>Atomic Model Send Done Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelSendDoneEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelSendDoneEvent()
		 * @generated
		 */
		EClass ATOMIC_MODEL_SEND_DONE_EVENT = eINSTANCE.getAtomicModelSendDoneEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_SEND_DONE_EVENT__SOURCE = eINSTANCE.getAtomicModelSendDoneEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_SEND_DONE_EVENT__TIME = eINSTANCE.getAtomicModelSendDoneEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveInitEventImpl <em>Atomic Model Receive Init Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveInitEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelReceiveInitEvent()
		 * @generated
		 */
		EClass ATOMIC_MODEL_RECEIVE_INIT_EVENT = eINSTANCE.getAtomicModelReceiveInitEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_RECEIVE_INIT_EVENT__SOURCE = eINSTANCE.getAtomicModelReceiveInitEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_RECEIVE_INIT_EVENT__TIME = eINSTANCE.getAtomicModelReceiveInitEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveStarEventImpl <em>Coupled Model Receive Star Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveStarEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveStarEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_RECEIVE_STAR_EVENT = eINSTANCE.getCoupledModelReceiveStarEvent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_STAR_EVENT__TARGET = eINSTANCE.getCoupledModelReceiveStarEvent_Target();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_STAR_EVENT__TIME = eINSTANCE.getCoupledModelReceiveStarEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveYEventImpl <em>Coupled Model Receive YEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveYEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveYEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_RECEIVE_YEVENT = eINSTANCE.getCoupledModelReceiveYEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_YEVENT__SOURCE = eINSTANCE.getCoupledModelReceiveYEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_YEVENT__Y = eINSTANCE.getCoupledModelReceiveYEvent_Y();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_YEVENT__TIME = eINSTANCE.getCoupledModelReceiveYEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelSendYEventImpl <em>Atomic Model Send YEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelSendYEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelSendYEvent()
		 * @generated
		 */
		EClass ATOMIC_MODEL_SEND_YEVENT = eINSTANCE.getAtomicModelSendYEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_SEND_YEVENT__SOURCE = eINSTANCE.getAtomicModelSendYEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_SEND_YEVENT__Y = eINSTANCE.getAtomicModelSendYEvent_Y();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_SEND_YEVENT__TIME = eINSTANCE.getAtomicModelSendYEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveStarEventImpl <em>Atomic Model Receive Star Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveStarEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getAtomicModelReceiveStarEvent()
		 * @generated
		 */
		EClass ATOMIC_MODEL_RECEIVE_STAR_EVENT = eINSTANCE.getAtomicModelReceiveStarEvent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_RECEIVE_STAR_EVENT__TARGET = eINSTANCE.getAtomicModelReceiveStarEvent_Target();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_MODEL_RECEIVE_STAR_EVENT__TIME = eINSTANCE.getAtomicModelReceiveStarEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveDoneEventImpl <em>Coupled Model Receive Done Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveDoneEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveDoneEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_RECEIVE_DONE_EVENT = eINSTANCE.getCoupledModelReceiveDoneEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_DONE_EVENT__SOURCE = eINSTANCE.getCoupledModelReceiveDoneEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_DONE_EVENT__TIME = eINSTANCE.getCoupledModelReceiveDoneEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendYEventImpl <em>Coupled Model Send YEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendYEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendYEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_SEND_YEVENT = eINSTANCE.getCoupledModelSendYEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_YEVENT__SOURCE = eINSTANCE.getCoupledModelSendYEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_YEVENT__Y = eINSTANCE.getCoupledModelSendYEvent_Y();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_YEVENT__TIME = eINSTANCE.getCoupledModelSendYEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendStarEventImpl <em>Coupled Model Send Star Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendStarEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendStarEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_SEND_STAR_EVENT = eINSTANCE.getCoupledModelSendStarEvent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_STAR_EVENT__TARGET = eINSTANCE.getCoupledModelSendStarEvent_Target();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_STAR_EVENT__TIME = eINSTANCE.getCoupledModelSendStarEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendInitEventImpl <em>Coupled Model Send Init Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendInitEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendInitEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_SEND_INIT_EVENT = eINSTANCE.getCoupledModelSendInitEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_INIT_EVENT__SOURCE = eINSTANCE.getCoupledModelSendInitEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_INIT_EVENT__TIME = eINSTANCE.getCoupledModelSendInitEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveInitEventImpl <em>Coupled Model Receive Init Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelReceiveInitEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelReceiveInitEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_RECEIVE_INIT_EVENT = eINSTANCE.getCoupledModelReceiveInitEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_INIT_EVENT__SOURCE = eINSTANCE.getCoupledModelReceiveInitEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_RECEIVE_INIT_EVENT__TIME = eINSTANCE.getCoupledModelReceiveInitEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendDoneEventImpl <em>Coupled Model Send Done Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendDoneEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendDoneEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_SEND_DONE_EVENT = eINSTANCE.getCoupledModelSendDoneEvent();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_DONE_EVENT__SOURCE = eINSTANCE.getCoupledModelSendDoneEvent_Source();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_DONE_EVENT__TIME = eINSTANCE.getCoupledModelSendDoneEvent_Time();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendXEventImpl <em>Coupled Model Send XEvent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.devs.event.devsevent.impl.CoupledModelSendXEventImpl
		 * @see org.tetrabox.example.devs.event.devsevent.impl.DevseventPackageImpl#getCoupledModelSendXEvent()
		 * @generated
		 */
		EClass COUPLED_MODEL_SEND_XEVENT = eINSTANCE.getCoupledModelSendXEvent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_XEVENT__TARGET = eINSTANCE.getCoupledModelSendXEvent_Target();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_XEVENT__X = eINSTANCE.getCoupledModelSendXEvent_X();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLED_MODEL_SEND_XEVENT__TIME = eINSTANCE.getCoupledModelSendXEvent_Time();

	}

} //DevseventPackage
