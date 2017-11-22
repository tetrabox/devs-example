/**
 */
package devs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Coupling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.InternalCoupling#getSrc <em>Src</em>}</li>
 *   <li>{@link devs.InternalCoupling#getOutPort <em>Out Port</em>}</li>
 *   <li>{@link devs.InternalCoupling#getDest <em>Dest</em>}</li>
 *   <li>{@link devs.InternalCoupling#getInPort <em>In Port</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getInternalCoupling()
 * @model
 * @generated
 */
public interface InternalCoupling extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see devs.DevsPackage#getInternalCoupling_Src()
	 * @model
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link devs.InternalCoupling#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Port</em>' attribute.
	 * @see #setOutPort(String)
	 * @see devs.DevsPackage#getInternalCoupling_OutPort()
	 * @model
	 * @generated
	 */
	String getOutPort();

	/**
	 * Sets the value of the '{@link devs.InternalCoupling#getOutPort <em>Out Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Port</em>' attribute.
	 * @see #getOutPort()
	 * @generated
	 */
	void setOutPort(String value);

	/**
	 * Returns the value of the '<em><b>Dest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' attribute.
	 * @see #setDest(String)
	 * @see devs.DevsPackage#getInternalCoupling_Dest()
	 * @model
	 * @generated
	 */
	String getDest();

	/**
	 * Sets the value of the '{@link devs.InternalCoupling#getDest <em>Dest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' attribute.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(String value);

	/**
	 * Returns the value of the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' attribute.
	 * @see #setInPort(String)
	 * @see devs.DevsPackage#getInternalCoupling_InPort()
	 * @model
	 * @generated
	 */
	String getInPort();

	/**
	 * Sets the value of the '{@link devs.InternalCoupling#getInPort <em>In Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' attribute.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(String value);

} // InternalCoupling
