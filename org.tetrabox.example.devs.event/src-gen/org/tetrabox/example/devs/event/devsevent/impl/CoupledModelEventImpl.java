/**
 */
package org.tetrabox.example.devs.event.devsevent.impl;

import devs.CoupledModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.devs.event.devsevent.CoupledModelEvent;
import org.tetrabox.example.devs.event.devsevent.DevseventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coupled Model Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.impl.CoupledModelEventImpl#getCoupledModel <em>Coupled Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CoupledModelEventImpl extends DevsDSLEventImpl implements CoupledModelEvent {
	/**
	 * The cached value of the '{@link #getCoupledModel() <em>Coupled Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoupledModel()
	 * @generated
	 * @ordered
	 */
	protected CoupledModel coupledModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoupledModelEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevseventPackage.Literals.COUPLED_MODEL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModel getCoupledModel() {
		if (coupledModel != null && coupledModel.eIsProxy()) {
			InternalEObject oldCoupledModel = (InternalEObject)coupledModel;
			coupledModel = (CoupledModel)eResolveProxy(oldCoupledModel);
			if (coupledModel != oldCoupledModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevseventPackage.COUPLED_MODEL_EVENT__COUPLED_MODEL, oldCoupledModel, coupledModel));
			}
		}
		return coupledModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoupledModel basicGetCoupledModel() {
		return coupledModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoupledModel(CoupledModel newCoupledModel) {
		CoupledModel oldCoupledModel = coupledModel;
		coupledModel = newCoupledModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevseventPackage.COUPLED_MODEL_EVENT__COUPLED_MODEL, oldCoupledModel, coupledModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevseventPackage.COUPLED_MODEL_EVENT__COUPLED_MODEL:
				if (resolve) return getCoupledModel();
				return basicGetCoupledModel();
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
			case DevseventPackage.COUPLED_MODEL_EVENT__COUPLED_MODEL:
				setCoupledModel((CoupledModel)newValue);
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
			case DevseventPackage.COUPLED_MODEL_EVENT__COUPLED_MODEL:
				setCoupledModel((CoupledModel)null);
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
			case DevseventPackage.COUPLED_MODEL_EVENT__COUPLED_MODEL:
				return coupledModel != null;
		}
		return super.eIsSet(featureID);
	}

} //CoupledModelEventImpl
