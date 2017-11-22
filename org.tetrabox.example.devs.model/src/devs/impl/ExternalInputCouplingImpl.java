/**
 */
package devs.impl;

import devs.DevsPackage;
import devs.ExternalInputCoupling;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Input Coupling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.ExternalInputCouplingImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link devs.impl.ExternalInputCouplingImpl#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link devs.impl.ExternalInputCouplingImpl#getInPort <em>In Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalInputCouplingImpl extends MinimalEObjectImpl.Container implements ExternalInputCoupling {
	/**
	 * The default value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected static final String DEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDest() <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDest()
	 * @generated
	 * @ordered
	 */
	protected String dest = DEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutPort() <em>Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected static final String OUT_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutPort()
	 * @generated
	 * @ordered
	 */
	protected String outPort = OUT_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInPort() <em>In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected static final String IN_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInPort() <em>In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInPort()
	 * @generated
	 * @ordered
	 */
	protected String inPort = IN_PORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalInputCouplingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsPackage.Literals.EXTERNAL_INPUT_COUPLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDest() {
		return dest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDest(String newDest) {
		String oldDest = dest;
		dest = newDest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.EXTERNAL_INPUT_COUPLING__DEST, oldDest, dest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutPort() {
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutPort(String newOutPort) {
		String oldOutPort = outPort;
		outPort = newOutPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.EXTERNAL_INPUT_COUPLING__OUT_PORT, oldOutPort, outPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInPort() {
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInPort(String newInPort) {
		String oldInPort = inPort;
		inPort = newInPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevsPackage.EXTERNAL_INPUT_COUPLING__IN_PORT, oldInPort, inPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevsPackage.EXTERNAL_INPUT_COUPLING__DEST:
				return getDest();
			case DevsPackage.EXTERNAL_INPUT_COUPLING__OUT_PORT:
				return getOutPort();
			case DevsPackage.EXTERNAL_INPUT_COUPLING__IN_PORT:
				return getInPort();
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
			case DevsPackage.EXTERNAL_INPUT_COUPLING__DEST:
				setDest((String)newValue);
				return;
			case DevsPackage.EXTERNAL_INPUT_COUPLING__OUT_PORT:
				setOutPort((String)newValue);
				return;
			case DevsPackage.EXTERNAL_INPUT_COUPLING__IN_PORT:
				setInPort((String)newValue);
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
			case DevsPackage.EXTERNAL_INPUT_COUPLING__DEST:
				setDest(DEST_EDEFAULT);
				return;
			case DevsPackage.EXTERNAL_INPUT_COUPLING__OUT_PORT:
				setOutPort(OUT_PORT_EDEFAULT);
				return;
			case DevsPackage.EXTERNAL_INPUT_COUPLING__IN_PORT:
				setInPort(IN_PORT_EDEFAULT);
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
			case DevsPackage.EXTERNAL_INPUT_COUPLING__DEST:
				return DEST_EDEFAULT == null ? dest != null : !DEST_EDEFAULT.equals(dest);
			case DevsPackage.EXTERNAL_INPUT_COUPLING__OUT_PORT:
				return OUT_PORT_EDEFAULT == null ? outPort != null : !OUT_PORT_EDEFAULT.equals(outPort);
			case DevsPackage.EXTERNAL_INPUT_COUPLING__IN_PORT:
				return IN_PORT_EDEFAULT == null ? inPort != null : !IN_PORT_EDEFAULT.equals(inPort);
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
		result.append(" (dest: ");
		result.append(dest);
		result.append(", outPort: ");
		result.append(outPort);
		result.append(", inPort: ");
		result.append(inPort);
		result.append(')');
		return result.toString();
	}

} //ExternalInputCouplingImpl
