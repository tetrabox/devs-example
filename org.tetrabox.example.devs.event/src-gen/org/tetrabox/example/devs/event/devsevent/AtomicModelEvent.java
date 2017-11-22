/**
 */
package org.tetrabox.example.devs.event.devsevent;

import devs.AtomicModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Model Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.devs.event.devsevent.AtomicModelEvent#getAtomicModel <em>Atomic Model</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getAtomicModelEvent()
 * @model abstract="true"
 * @generated
 */
public interface AtomicModelEvent extends DevsDSLEvent {
	/**
	 * Returns the value of the '<em><b>Atomic Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atomic Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomic Model</em>' reference.
	 * @see #setAtomicModel(AtomicModel)
	 * @see org.tetrabox.example.devs.event.devsevent.DevseventPackage#getAtomicModelEvent_AtomicModel()
	 * @model required="true"
	 * @generated
	 */
	AtomicModel getAtomicModel();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.devs.event.devsevent.AtomicModelEvent#getAtomicModel <em>Atomic Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomic Model</em>' reference.
	 * @see #getAtomicModel()
	 * @generated
	 */
	void setAtomicModel(AtomicModel value);

} // AtomicModelEvent
