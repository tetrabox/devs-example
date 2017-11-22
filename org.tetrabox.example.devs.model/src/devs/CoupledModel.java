/**
 */
package devs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupled Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devs.CoupledModel#getExternalInputCouplings <em>External Input Couplings</em>}</li>
 *   <li>{@link devs.CoupledModel#getInternalCouplings <em>Internal Couplings</em>}</li>
 *   <li>{@link devs.CoupledModel#getOutputCouplings <em>Output Couplings</em>}</li>
 *   <li>{@link devs.CoupledModel#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see devs.DevsPackage#getCoupledModel()
 * @model
 * @generated
 */
public interface CoupledModel extends DEVSModel {
	/**
	 * Returns the value of the '<em><b>External Input Couplings</b></em>' containment reference list.
	 * The list contents are of type {@link devs.ExternalInputCoupling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Input Couplings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Input Couplings</em>' containment reference list.
	 * @see devs.DevsPackage#getCoupledModel_ExternalInputCouplings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInputCoupling> getExternalInputCouplings();

	/**
	 * Returns the value of the '<em><b>Internal Couplings</b></em>' containment reference list.
	 * The list contents are of type {@link devs.InternalCoupling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Couplings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Couplings</em>' containment reference list.
	 * @see devs.DevsPackage#getCoupledModel_InternalCouplings()
	 * @model containment="true"
	 * @generated
	 */
	EList<InternalCoupling> getInternalCouplings();

	/**
	 * Returns the value of the '<em><b>Output Couplings</b></em>' containment reference list.
	 * The list contents are of type {@link devs.OutputCoupling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Couplings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Couplings</em>' containment reference list.
	 * @see devs.DevsPackage#getCoupledModel_OutputCouplings()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputCoupling> getOutputCouplings();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute list.
	 * @see devs.DevsPackage#getCoupledModel_Children()
	 * @model
	 * @generated
	 */
	EList<String> getChildren();

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
	void receiveY(String source, String y, float time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" timeRequired="true"
	 * @generated
	 */
	void receiveDone(String source, float time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sourceRequired="true" timeRequired="true"
	 * @generated
	 */
	void sendInit(String source, float time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" timeRequired="true"
	 * @generated
	 */
	void sendStar(String target, float time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model targetRequired="true" xRequired="true" timeRequired="true"
	 * @generated
	 */
	void sendX(String target, String x, float time);

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

} // CoupledModel
