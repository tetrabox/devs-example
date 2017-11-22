/**
 */
package devs.impl;

import devs.AtomicModel;
import devs.DevsPackage;
import devs.ExternalTransition;
import devs.InternalTransition;
import devs.Lambda;
import devs.State;
import devs.TimeAdvance;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.AtomicModelImpl#getStates <em>States</em>}</li>
 *   <li>{@link devs.impl.AtomicModelImpl#getDeltInt <em>Delt Int</em>}</li>
 *   <li>{@link devs.impl.AtomicModelImpl#getDeltExt <em>Delt Ext</em>}</li>
 *   <li>{@link devs.impl.AtomicModelImpl#getTimeAdvance <em>Time Advance</em>}</li>
 *   <li>{@link devs.impl.AtomicModelImpl#getLambda <em>Lambda</em>}</li>
 *   <li>{@link devs.impl.AtomicModelImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicModelImpl extends DEVSModelImpl implements AtomicModel {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getDeltInt() <em>Delt Int</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltInt()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalTransition> deltInt;

	/**
	 * The cached value of the '{@link #getDeltExt() <em>Delt Ext</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltExt()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalTransition> deltExt;

	/**
	 * The cached value of the '{@link #getTimeAdvance() <em>Time Advance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAdvance()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeAdvance> timeAdvance;

	/**
	 * The cached value of the '{@link #getLambda() <em>Lambda</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLambda()
	 * @generated
	 * @ordered
	 */
	protected EList<Lambda> lambda;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsPackage.Literals.ATOMIC_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, DevsPackage.ATOMIC_MODEL__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalTransition> getDeltInt() {
		if (deltInt == null) {
			deltInt = new EObjectContainmentEList<InternalTransition>(InternalTransition.class, this, DevsPackage.ATOMIC_MODEL__DELT_INT);
		}
		return deltInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalTransition> getDeltExt() {
		if (deltExt == null) {
			deltExt = new EObjectContainmentEList<ExternalTransition>(ExternalTransition.class, this, DevsPackage.ATOMIC_MODEL__DELT_EXT);
		}
		return deltExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeAdvance> getTimeAdvance() {
		if (timeAdvance == null) {
			timeAdvance = new EObjectContainmentEList<TimeAdvance>(TimeAdvance.class, this, DevsPackage.ATOMIC_MODEL__TIME_ADVANCE);
		}
		return timeAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lambda> getLambda() {
		if (lambda == null) {
			lambda = new EObjectContainmentEList<Lambda>(Lambda.class, this, DevsPackage.ATOMIC_MODEL__LAMBDA);
		}
		return lambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (State)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsPackage.ATOMIC_MODEL__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(State newInitialState) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.ATOMIC_MODEL__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveInit(String source, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveStar(String target, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveX(String target, String x, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendY(String source, String y, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendDone(String source, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevsPackage.ATOMIC_MODEL__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case DevsPackage.ATOMIC_MODEL__DELT_INT:
				return ((InternalEList<?>)getDeltInt()).basicRemove(otherEnd, msgs);
			case DevsPackage.ATOMIC_MODEL__DELT_EXT:
				return ((InternalEList<?>)getDeltExt()).basicRemove(otherEnd, msgs);
			case DevsPackage.ATOMIC_MODEL__TIME_ADVANCE:
				return ((InternalEList<?>)getTimeAdvance()).basicRemove(otherEnd, msgs);
			case DevsPackage.ATOMIC_MODEL__LAMBDA:
				return ((InternalEList<?>)getLambda()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevsPackage.ATOMIC_MODEL__STATES:
				return getStates();
			case DevsPackage.ATOMIC_MODEL__DELT_INT:
				return getDeltInt();
			case DevsPackage.ATOMIC_MODEL__DELT_EXT:
				return getDeltExt();
			case DevsPackage.ATOMIC_MODEL__TIME_ADVANCE:
				return getTimeAdvance();
			case DevsPackage.ATOMIC_MODEL__LAMBDA:
				return getLambda();
			case DevsPackage.ATOMIC_MODEL__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevsPackage.ATOMIC_MODEL__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case DevsPackage.ATOMIC_MODEL__DELT_INT:
				getDeltInt().clear();
				getDeltInt().addAll((Collection<? extends InternalTransition>)newValue);
				return;
			case DevsPackage.ATOMIC_MODEL__DELT_EXT:
				getDeltExt().clear();
				getDeltExt().addAll((Collection<? extends ExternalTransition>)newValue);
				return;
			case DevsPackage.ATOMIC_MODEL__TIME_ADVANCE:
				getTimeAdvance().clear();
				getTimeAdvance().addAll((Collection<? extends TimeAdvance>)newValue);
				return;
			case DevsPackage.ATOMIC_MODEL__LAMBDA:
				getLambda().clear();
				getLambda().addAll((Collection<? extends Lambda>)newValue);
				return;
			case DevsPackage.ATOMIC_MODEL__INITIAL_STATE:
				setInitialState((State)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DevsPackage.ATOMIC_MODEL__STATES:
				getStates().clear();
				return;
			case DevsPackage.ATOMIC_MODEL__DELT_INT:
				getDeltInt().clear();
				return;
			case DevsPackage.ATOMIC_MODEL__DELT_EXT:
				getDeltExt().clear();
				return;
			case DevsPackage.ATOMIC_MODEL__TIME_ADVANCE:
				getTimeAdvance().clear();
				return;
			case DevsPackage.ATOMIC_MODEL__LAMBDA:
				getLambda().clear();
				return;
			case DevsPackage.ATOMIC_MODEL__INITIAL_STATE:
				setInitialState((State)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DevsPackage.ATOMIC_MODEL__STATES:
				return states != null && !states.isEmpty();
			case DevsPackage.ATOMIC_MODEL__DELT_INT:
				return deltInt != null && !deltInt.isEmpty();
			case DevsPackage.ATOMIC_MODEL__DELT_EXT:
				return deltExt != null && !deltExt.isEmpty();
			case DevsPackage.ATOMIC_MODEL__TIME_ADVANCE:
				return timeAdvance != null && !timeAdvance.isEmpty();
			case DevsPackage.ATOMIC_MODEL__LAMBDA:
				return lambda != null && !lambda.isEmpty();
			case DevsPackage.ATOMIC_MODEL__INITIAL_STATE:
				return initialState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DevsPackage.ATOMIC_MODEL___RECEIVE_INIT__STRING_FLOAT:
				receiveInit((String)arguments.get(0), (Float)arguments.get(1));
				return null;
			case DevsPackage.ATOMIC_MODEL___RECEIVE_STAR__STRING_FLOAT:
				receiveStar((String)arguments.get(0), (Float)arguments.get(1));
				return null;
			case DevsPackage.ATOMIC_MODEL___RECEIVE_X__STRING_STRING_FLOAT:
				receiveX((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2));
				return null;
			case DevsPackage.ATOMIC_MODEL___SEND_Y__STRING_STRING_FLOAT:
				sendY((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2));
				return null;
			case DevsPackage.ATOMIC_MODEL___SEND_DONE__STRING_FLOAT:
				sendDone((String)arguments.get(0), (Float)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AtomicModelImpl
