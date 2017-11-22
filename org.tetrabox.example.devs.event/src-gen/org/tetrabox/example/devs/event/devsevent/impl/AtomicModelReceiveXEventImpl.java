/**
 */
package org.tetrabox.example.devs.event.devsevent.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.devs.event.devsevent.AtomicModelReceiveXEvent;
import org.tetrabox.example.devs.event.devsevent.DevseventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Model Receive XEvent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveXEventImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveXEventImpl#getX <em>X</em>}</li>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelReceiveXEventImpl#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicModelReceiveXEventImpl extends AtomicModelEventImpl implements AtomicModelReceiveXEvent {
	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected String x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected float time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicModelReceiveXEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevseventPackage.Literals.ATOMIC_MODEL_RECEIVE_XEVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		String oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(float newTime) {
		float oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TARGET:
				return getTarget();
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__X:
				return getX();
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TIME:
				return getTime();
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
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TARGET:
				setTarget((String)newValue);
				return;
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__X:
				setX((String)newValue);
				return;
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TIME:
				setTime((Float)newValue);
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
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__X:
				setX(X_EDEFAULT);
				return;
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TIME:
				setTime(TIME_EDEFAULT);
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
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case DevseventPackage.ATOMIC_MODEL_RECEIVE_XEVENT__TIME:
				return time != TIME_EDEFAULT;
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
		result.append(" (target: ");
		result.append(target);
		result.append(", x: ");
		result.append(x);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //AtomicModelReceiveXEventImpl
