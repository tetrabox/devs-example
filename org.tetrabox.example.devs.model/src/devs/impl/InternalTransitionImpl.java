/**
 */
package devs.impl;

import devs.DevsPackage;
import devs.InternalTransition;
import devs.State;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.InternalTransitionImpl#getSourceState <em>Source State</em>}</li>
 *   <li>{@link devs.impl.InternalTransitionImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalTransitionImpl extends MinimalEObjectImpl.Container implements InternalTransition {
	/**
	 * The cached value of the '{@link #getSourceState() <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceState()
	 * @generated
	 * @ordered
	 */
	protected State sourceState;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected State targetState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsPackage.Literals.INTERNAL_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSourceState() {
		if (sourceState != null && sourceState.eIsProxy()) {
			InternalEObject oldSourceState = (InternalEObject)sourceState;
			sourceState = (State)eResolveProxy(oldSourceState);
			if (sourceState != oldSourceState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsPackage.INTERNAL_TRANSITION__SOURCE_STATE, oldSourceState, sourceState));
			}
		}
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSourceState() {
		return sourceState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceState(State newSourceState) {
		State oldSourceState = sourceState;
		sourceState = newSourceState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.INTERNAL_TRANSITION__SOURCE_STATE, oldSourceState, sourceState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject)targetState;
			targetState = (State)eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevsPackage.INTERNAL_TRANSITION__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(State newTargetState) {
		State oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.INTERNAL_TRANSITION__TARGET_STATE, oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevsPackage.INTERNAL_TRANSITION__SOURCE_STATE:
				if (resolve) return getSourceState();
				return basicGetSourceState();
			case DevsPackage.INTERNAL_TRANSITION__TARGET_STATE:
				if (resolve) return getTargetState();
				return basicGetTargetState();
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
			case DevsPackage.INTERNAL_TRANSITION__SOURCE_STATE:
				setSourceState((State)newValue);
				return;
			case DevsPackage.INTERNAL_TRANSITION__TARGET_STATE:
				setTargetState((State)newValue);
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
			case DevsPackage.INTERNAL_TRANSITION__SOURCE_STATE:
				setSourceState((State)null);
				return;
			case DevsPackage.INTERNAL_TRANSITION__TARGET_STATE:
				setTargetState((State)null);
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
			case DevsPackage.INTERNAL_TRANSITION__SOURCE_STATE:
				return sourceState != null;
			case DevsPackage.INTERNAL_TRANSITION__TARGET_STATE:
				return targetState != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalTransitionImpl
