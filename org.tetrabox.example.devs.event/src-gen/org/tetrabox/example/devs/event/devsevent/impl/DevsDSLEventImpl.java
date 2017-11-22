/**
 */
package org.tetrabox.example.devs.event.devsevent.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gemoc.executionframework.event.model.event.impl.EventImpl;

import org.tetrabox.example.devs.event.devsevent.DevsDSLEvent;
import org.tetrabox.example.devs.event.devsevent.DevseventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Devs DSL Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DevsDSLEventImpl extends EventImpl implements DevsDSLEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevsDSLEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevseventPackage.Literals.DEVS_DSL_EVENT;
	}

} //DevsDSLEventImpl
