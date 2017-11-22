/**
 */
package devs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.AtomicModel#getStates <em>States</em>}</li>
 *   <li>{@link devs.AtomicModel#getDeltInt <em>Delt Int</em>}</li>
 *   <li>{@link devs.AtomicModel#getDeltExt <em>Delt Ext</em>}</li>
 *   <li>{@link devs.AtomicModel#getTimeAdvance <em>Time Advance</em>}</li>
 *   <li>{@link devs.AtomicModel#getLambda <em>Lambda</em>}</li>
 *   <li>{@link devs.AtomicModel#getInitialState <em>Initial State</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getAtomicModel()
 * @model
 * @generated
 */
public interface AtomicModel extends DEVSModel {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link devs.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see devs.DevsPackage#getAtomicModel_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Delt Int</b></em>' containment reference list.
	 * The list contents are of type {@link devs.InternalTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delt Int</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delt Int</em>' containment reference list.
	 * @see devs.DevsPackage#getAtomicModel_DeltInt()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalTransition> getDeltInt();

	/**
	 * Returns the value of the '<em><b>Delt Ext</b></em>' containment reference list.
	 * The list contents are of type {@link devs.ExternalTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delt Ext</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delt Ext</em>' containment reference list.
	 * @see devs.DevsPackage#getAtomicModel_DeltExt()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalTransition> getDeltExt();

	/**
	 * Returns the value of the '<em><b>Time Advance</b></em>' containment reference list.
	 * The list contents are of type {@link devs.TimeAdvance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Advance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Advance</em>' containment reference list.
	 * @see devs.DevsPackage#getAtomicModel_TimeAdvance()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeAdvance> getTimeAdvance();

	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' containment reference list.
	 * The list contents are of type {@link devs.Lambda}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lambda</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' containment reference list.
	 * @see devs.DevsPackage#getAtomicModel_Lambda()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lambda> getLambda();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see devs.DevsPackage#getAtomicModel_InitialState()
	 * @model
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link devs.AtomicModel#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" timeRequired="true"
	 * @generated
	 */
	void receiveInit(String source, float time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" timeRequired="true"
	 * @generated
	 */
	void receiveStar(String target, float time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" xRequired="true" timeRequired="true"
	 * @generated
	 */
	void receiveX(String target, String x, float time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" yRequired="true" timeRequired="true"
	 * @generated
	 */
	void sendY(String source, String y, float time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" timeRequired="true"
	 * @generated
	 */
	void sendDone(String source, float time);

} // AtomicModel
