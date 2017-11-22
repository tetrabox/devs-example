/**
 */
package devs.impl;

import devs.DEVSModel;
import devs.DevsPackage;
import devs.InPort;
import devs.OutPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEVS Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.DEVSModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link devs.impl.DEVSModelImpl#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link devs.impl.DEVSModelImpl#getOutPorts <em>Out Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DEVSModelImpl extends MinimalEObjectImpl.Container implements DEVSModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInPorts() <em>In Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InPort> inPorts;

	/**
	 * The cached value of the '{@link #getOutPorts() <em>Out Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<OutPort> outPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEVSModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsPackage.Literals.DEVS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.DEVS_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InPort> getInPorts() {
		if (inPorts == null) {
			inPorts = new EObjectContainmentEList<InPort>(InPort.class, this, DevsPackage.DEVS_MODEL__IN_PORTS);
		}
		return inPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutPort> getOutPorts() {
		if (outPorts == null) {
			outPorts = new EObjectContainmentEList<OutPort>(OutPort.class, this, DevsPackage.DEVS_MODEL__OUT_PORTS);
		}
		return outPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevsPackage.DEVS_MODEL__IN_PORTS:
				return ((InternalEList<?>)getInPorts()).basicRemove(otherEnd, msgs);
			case DevsPackage.DEVS_MODEL__OUT_PORTS:
				return ((InternalEList<?>)getOutPorts()).basicRemove(otherEnd, msgs);
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
			case DevsPackage.DEVS_MODEL__NAME:
				return getName();
			case DevsPackage.DEVS_MODEL__IN_PORTS:
				return getInPorts();
			case DevsPackage.DEVS_MODEL__OUT_PORTS:
				return getOutPorts();
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
			case DevsPackage.DEVS_MODEL__NAME:
				setName((String)newValue);
				return;
			case DevsPackage.DEVS_MODEL__IN_PORTS:
				getInPorts().clear();
				getInPorts().addAll((Collection<? extends InPort>)newValue);
				return;
			case DevsPackage.DEVS_MODEL__OUT_PORTS:
				getOutPorts().clear();
				getOutPorts().addAll((Collection<? extends OutPort>)newValue);
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
			case DevsPackage.DEVS_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DevsPackage.DEVS_MODEL__IN_PORTS:
				getInPorts().clear();
				return;
			case DevsPackage.DEVS_MODEL__OUT_PORTS:
				getOutPorts().clear();
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
			case DevsPackage.DEVS_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DevsPackage.DEVS_MODEL__IN_PORTS:
				return inPorts != null && !inPorts.isEmpty();
			case DevsPackage.DEVS_MODEL__OUT_PORTS:
				return outPorts != null && !outPorts.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DEVSModelImpl
