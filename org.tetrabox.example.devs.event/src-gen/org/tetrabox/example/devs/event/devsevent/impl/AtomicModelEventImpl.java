/**
 */
package org.tetrabox.example.devs.event.devsevent.impl;

import devs.AtomicModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.devs.event.devsevent.AtomicModelEvent;
import org.tetrabox.example.devs.event.devsevent.DevseventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Model Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.impl.AtomicModelEventImpl#getAtomicModel <em>Atomic Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AtomicModelEventImpl extends DevsDSLEventImpl implements AtomicModelEvent {
	/**
	 * The cached value of the '{@link #getAtomicModel() <em>Atomic Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicModel()
	 * @generated
	 * @ordered
	 */
	protected AtomicModel atomicModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicModelEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevseventPackage.Literals.ATOMIC_MODEL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModel getAtomicModel() {
		if (atomicModel != null && atomicModel.eIsProxy()) {
			InternalEObject oldAtomicModel = (InternalEObject)atomicModel;
			atomicModel = (AtomicModel)eResolveProxy(oldAtomicModel);
			if (atomicModel != oldAtomicModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevseventPackage.ATOMIC_MODEL_EVENT__ATOMIC_MODEL, oldAtomicModel, atomicModel));
			}
		}
		return atomicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModel basicGetAtomicModel() {
		return atomicModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomicModel(AtomicModel newAtomicModel) {
		AtomicModel oldAtomicModel = atomicModel;
		atomicModel = newAtomicModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevseventPackage.ATOMIC_MODEL_EVENT__ATOMIC_MODEL, oldAtomicModel, atomicModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevseventPackage.ATOMIC_MODEL_EVENT__ATOMIC_MODEL:
				if (resolve) return getAtomicModel();
				return basicGetAtomicModel();
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
			case DevseventPackage.ATOMIC_MODEL_EVENT__ATOMIC_MODEL:
				setAtomicModel((AtomicModel)newValue);
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
			case DevseventPackage.ATOMIC_MODEL_EVENT__ATOMIC_MODEL:
				setAtomicModel((AtomicModel)null);
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
			case DevseventPackage.ATOMIC_MODEL_EVENT__ATOMIC_MODEL:
				return atomicModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AtomicModelEventImpl
