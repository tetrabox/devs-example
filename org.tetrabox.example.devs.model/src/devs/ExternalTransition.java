/**
 */
package devs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.ExternalTransition#getInPort <em>In Port</em>}</li>
 *   <li>{@link devs.ExternalTransition#getSourceState <em>Source State</em>}</li>
 *   <li>{@link devs.ExternalTransition#getTargetState <em>Target State</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getExternalTransition()
 * @model
 * @generated
 */
public interface ExternalTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>In Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Port</em>' reference.
	 * @see #setInPort(InPort)
	 * @see devs.DevsPackage#getExternalTransition_InPort()
	 * @model
	 * @generated
	 */
	InPort getInPort();

	/**
	 * Sets the value of the '{@link devs.ExternalTransition#getInPort <em>In Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Port</em>' reference.
	 * @see #getInPort()
	 * @generated
	 */
	void setInPort(InPort value);

	/**
	 * Returns the value of the '<em><b>Source State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source State</em>' reference.
	 * @see #setSourceState(State)
	 * @see devs.DevsPackage#getExternalTransition_SourceState()
	 * @model required="true"
	 * @generated
	 */
	State getSourceState();

	/**
	 * Sets the value of the '{@link devs.ExternalTransition#getSourceState <em>Source State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source State</em>' reference.
	 * @see #getSourceState()
	 * @generated
	 */
	void setSourceState(State value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see devs.DevsPackage#getExternalTransition_TargetState()
	 * @model required="true"
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link devs.ExternalTransition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

} // ExternalTransition
