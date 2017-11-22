/**
 */
package devs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Advance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.TimeAdvance#getState <em>State</em>}</li>
 *   <li>{@link devs.TimeAdvance#getLifetime <em>Lifetime</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getTimeAdvance()
 * @model
 * @generated
 */
public interface TimeAdvance extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(State)
	 * @see devs.DevsPackage#getTimeAdvance_State()
	 * @model required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link devs.TimeAdvance#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Lifetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifetime</em>' attribute.
	 * @see #setLifetime(float)
	 * @see devs.DevsPackage#getTimeAdvance_Lifetime()
	 * @model required="true"
	 * @generated
	 */
	float getLifetime();

	/**
	 * Sets the value of the '{@link devs.TimeAdvance#getLifetime <em>Lifetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifetime</em>' attribute.
	 * @see #getLifetime()
	 * @generated
	 */
	void setLifetime(float value);

} // TimeAdvance
