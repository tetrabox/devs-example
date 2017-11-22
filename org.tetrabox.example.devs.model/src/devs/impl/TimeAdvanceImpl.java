/**
 */
package devs.impl;

import devs.DevsPackage;
import devs.State;
import devs.TimeAdvance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Advance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.TimeAdvanceImpl#getState <em>State</em>}</li>
 *   <li>{@link devs.impl.TimeAdvanceImpl#getLifetime <em>Lifetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeAdvanceImpl extends MinimalEObjectImpl.Container implements TimeAdvance {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * The default value of the '{@link #getLifetime() <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetime()
	 * @generated
	 * @ordered
	 */
	protected static final float LIFETIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLifetime() <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetime()
	 * @generated
	 * @ordered
	 */
	protected float lifetime = LIFETIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeAdvanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsPackage.Literals.TIME_ADVANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (State)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsPackage.TIME_ADVANCE__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(State newState) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.TIME_ADVANCE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLifetime() {
		return lifetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifetime(float newLifetime) {
		float oldLifetime = lifetime;
		lifetime = newLifetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.TIME_ADVANCE__LIFETIME, oldLifetime, lifetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevsPackage.TIME_ADVANCE__STATE:
				if (resolve) return getState();
				return basicGetState();
			case DevsPackage.TIME_ADVANCE__LIFETIME:
				return getLifetime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevsPackage.TIME_ADVANCE__STATE:
				setState((State)newValue);
				return;
			case DevsPackage.TIME_ADVANCE__LIFETIME:
				setLifetime((Float)newValue);
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
			case DevsPackage.TIME_ADVANCE__STATE:
				setState((State)null);
				return;
			case DevsPackage.TIME_ADVANCE__LIFETIME:
				setLifetime(LIFETIME_EDEFAULT);
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
			case DevsPackage.TIME_ADVANCE__STATE:
				return state != null;
			case DevsPackage.TIME_ADVANCE__LIFETIME:
				return lifetime != LIFETIME_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lifetime: ");
		result.append(lifetime);
		result.append(')');
		return result.toString();
	}

} //TimeAdvanceImpl
