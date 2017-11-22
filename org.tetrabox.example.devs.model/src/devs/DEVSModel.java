/**
 */
package devs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEVS Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.DEVSModel#getName <em>Name</em>}</li>
 *   <li>{@link devs.DEVSModel#getInPorts <em>In Ports</em>}</li>
 *   <li>{@link devs.DEVSModel#getOutPorts <em>Out Ports</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getDEVSModel()
 * @model
 * @generated
 */
public interface DEVSModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see devs.DevsPackage#getDEVSModel_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link devs.DEVSModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Ports</b></em>' containment reference list.
	 * The list contents are of type {@link devs.InPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ports</em>' containment reference list.
	 * @see devs.DevsPackage#getDEVSModel_InPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<InPort> getInPorts();

	/**
	 * Returns the value of the '<em><b>Out Ports</b></em>' containment reference list.
	 * The list contents are of type {@link devs.OutPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ports</em>' containment reference list.
	 * @see devs.DevsPackage#getDEVSModel_OutPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutPort> getOutPorts();

} // DEVSModel
