/**
 */
package org.tetrabox.example.devs.event.devsevent;

import devs.CoupledModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupled Model Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.CoupledModelEvent#getCoupledModel <em>Coupled Model</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelEvent()
 * @model abstract="true"
 * @generated
 */
public interface CoupledModelEvent extends DevsDSLEvent {
	/**
	 * Returns the value of the '<em><b>Coupled Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupled Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupled Model</em>' reference.
	 * @see #setCoupledModel(CoupledModel)
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getCoupledModelEvent_CoupledModel()
	 * @model required="true"
	 * @generated
	 */
	CoupledModel getCoupledModel();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.CoupledModelEvent#getCoupledModel <em>Coupled Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coupled Model</em>' reference.
	 * @see #getCoupledModel()
	 * @generated
	 */
	void setCoupledModel(CoupledModel value);

} // CoupledModelEvent
