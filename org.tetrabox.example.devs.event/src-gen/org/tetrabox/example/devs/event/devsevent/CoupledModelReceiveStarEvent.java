/**
 */
package org.tetrabox.example.devs.event.devsevent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupled Model Receive Star Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent#getTarget <em>Target</em>}</li>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelReceiveStarEvent()
 * @model
 * @generated
 */
public interface CoupledModelReceiveStarEvent extends CoupledModelEvent {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelReceiveStarEvent_Target()
	 * @model required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

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
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelReceiveStarEvent_Time()
	 * @model required="true"
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelReceiveStarEvent#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

} // CoupledModelReceiveStarEvent
