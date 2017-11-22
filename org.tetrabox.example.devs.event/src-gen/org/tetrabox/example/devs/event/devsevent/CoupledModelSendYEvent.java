/**
 */
package org.tetrabox.example.devs.event.devsevent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupled Model Send YEvent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getSource <em>Source</em>}</li>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getY <em>Y</em>}</li>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelSendYEvent()
 * @model
 * @generated
 */
public interface CoupledModelSendYEvent extends CoupledModelEvent {
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
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelSendYEvent_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(String)
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelSendYEvent_Y()
	 * @model required="true"
	 * @generated
	 */
	String getY();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(String value);

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
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelSendYEvent_Time()
	 * @model required="true"
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelSendYEvent#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);

} // CoupledModelSendYEvent
