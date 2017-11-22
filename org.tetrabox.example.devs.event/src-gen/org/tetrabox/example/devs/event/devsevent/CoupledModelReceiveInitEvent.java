/**
 */
package org.tetrabox.example.devs.event.devsevent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupled Model Receive Init Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelReceiveInitEvent()
 * @model
 * @generated
 */
public interface CoupledModelReceiveInitEvent extends CoupledModelEvent {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelReceiveInitEvent_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(float)
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelReceiveInitEvent_Time()
	 * @model required="true"
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveInitEvent#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

} // CoupledModelReceiveInitEvent
