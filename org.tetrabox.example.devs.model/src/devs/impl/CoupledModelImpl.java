/**
 */
package devs.impl;

import devs.CoupledModel;
import devs.DevsPackage;
import devs.ExternalInputCoupling;
import devs.InternalCoupling;
import devs.OutputCoupling;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coupled Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devs.impl.CoupledModelImpl#getExternalInputCouplings <em>External Input Couplings</em>}</li>
 *   <li>{@link devs.impl.CoupledModelImpl#getInternalCouplings <em>Internal Couplings</em>}</li>
 *   <li>{@link devs.impl.CoupledModelImpl#getOutputCouplings <em>Output Couplings</em>}</li>
 *   <li>{@link devs.impl.CoupledModelImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoupledModelImpl extends DEVSModelImpl implements CoupledModel {
	/**
	 * The cached value of the '{@link #getExternalInputCouplings() <em>External Input Couplings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInputCouplings()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInputCoupling> externalInputCouplings;

	/**
	 * The cached value of the '{@link #getInternalCouplings() <em>Internal Couplings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalCouplings()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalCoupling> internalCouplings;

	/**
	 * The cached value of the '{@link #getOutputCouplings() <em>Output Couplings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputCouplings()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputCoupling> outputCouplings;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<String> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoupledModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevsPackage.Literals.COUPLED_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInputCoupling> getExternalInputCouplings() {
		if (externalInputCouplings == null) {
			externalInputCouplings = new EObjectContainmentEList<ExternalInputCoupling>(ExternalInputCoupling.class, this, DevsPackage.COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS);
		}
		return externalInputCouplings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalCoupling> getInternalCouplings() {
		if (internalCouplings == null) {
			internalCouplings = new EObjectContainmentEList<InternalCoupling>(InternalCoupling.class, this, DevsPackage.COUPLED_MODEL__INTERNAL_COUPLINGS);
		}
		return internalCouplings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputCoupling> getOutputCouplings() {
		if (outputCouplings == null) {
			outputCouplings = new EObjectContainmentEList<OutputCoupling>(OutputCoupling.class, this, DevsPackage.COUPLED_MODEL__OUTPUT_COUPLINGS);
		}
		return outputCouplings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getChildren() {
		if (children == null) {
			children = new EDataTypeUniqueEList<String>(String.class, this, DevsPackage.COUPLED_MODEL__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveInit(String source, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveStar(String target, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveX(String target, String x, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveY(String source, String y, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void receiveDone(String source, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendInit(String source, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendStar(String target, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendX(String target, String x, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendY(String source, String y, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendDone(String source, float time) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DevsPackage.COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS:
				return ((InternalEList<?>)getExternalInputCouplings()).basicRemove(otherEnd, msgs);
			case DevsPackage.COUPLED_MODEL__INTERNAL_COUPLINGS:
				return ((InternalEList<?>)getInternalCouplings()).basicRemove(otherEnd, msgs);
			case DevsPackage.COUPLED_MODEL__OUTPUT_COUPLINGS:
				return ((InternalEList<?>)getOutputCouplings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevsPackage.COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS:
				return getExternalInputCouplings();
			case DevsPackage.COUPLED_MODEL__INTERNAL_COUPLINGS:
				return getInternalCouplings();
			case DevsPackage.COUPLED_MODEL__OUTPUT_COUPLINGS:
				return getOutputCouplings();
			case DevsPackage.COUPLED_MODEL__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevsPackage.COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS:
				getExternalInputCouplings().clear();
				getExternalInputCouplings().addAll((Collection<? extends ExternalInputCoupling>)newValue);
				return;
			case DevsPackage.COUPLED_MODEL__INTERNAL_COUPLINGS:
				getInternalCouplings().clear();
				getInternalCouplings().addAll((Collection<? extends InternalCoupling>)newValue);
				return;
			case DevsPackage.COUPLED_MODEL__OUTPUT_COUPLINGS:
				getOutputCouplings().clear();
				getOutputCouplings().addAll((Collection<? extends OutputCoupling>)newValue);
				return;
			case DevsPackage.COUPLED_MODEL__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DevsPackage.COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS:
				getExternalInputCouplings().clear();
				return;
			case DevsPackage.COUPLED_MODEL__INTERNAL_COUPLINGS:
				getInternalCouplings().clear();
				return;
			case DevsPackage.COUPLED_MODEL__OUTPUT_COUPLINGS:
				getOutputCouplings().clear();
				return;
			case DevsPackage.COUPLED_MODEL__CHILDREN:
				getChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DevsPackage.COUPLED_MODEL__EXTERNAL_INPUT_COUPLINGS:
				return externalInputCouplings != null && !externalInputCouplings.isEmpty();
			case DevsPackage.COUPLED_MODEL__INTERNAL_COUPLINGS:
				return internalCouplings != null && !internalCouplings.isEmpty();
			case DevsPackage.COUPLED_MODEL__OUTPUT_COUPLINGS:
				return outputCouplings != null && !outputCouplings.isEmpty();
			case DevsPackage.COUPLED_MODEL__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DevsPackage.COUPLED_MODEL___RECEIVE_INIT__STRING_FLOAT:
				receiveInit((String)arguments.get(0), (Float)arguments.get(1));
				return null;
			case DevsPackage.COUPLED_MODEL___RECEIVE_STAR__STRING_FLOAT:
				receiveStar((String)arguments.get(0), (Float)arguments.get(1));
				return null;
			case DevsPackage.COUPLED_MODEL___RECEIVE_X__STRING_STRING_FLOAT:
				receiveX((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2));
				return null;
			case DevsPackage.COUPLED_MODEL___RECEIVE_Y__STRING_STRING_FLOAT:
				receiveY((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2));
				return null;
			case DevsPackage.COUPLED_MODEL___RECEIVE_DONE__STRING_FLOAT:
				receiveDone((String)arguments.get(0), (Float)arguments.get(1));
				return null;
			case DevsPackage.COUPLED_MODEL___SEND_INIT__STRING_FLOAT:
				sendInit((String)arguments.get(0), (Float)arguments.get(1));
				return null;
			case DevsPackage.COUPLED_MODEL___SEND_STAR__STRING_FLOAT:
				sendStar((String)arguments.get(0), (Float)arguments.get(1));
				return null;
			case DevsPackage.COUPLED_MODEL___SEND_X__STRING_STRING_FLOAT:
				sendX((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2));
				return null;
			case DevsPackage.COUPLED_MODEL___SEND_Y__STRING_STRING_FLOAT:
				sendY((String)arguments.get(0), (String)arguments.get(1), (Float)arguments.get(2));
				return null;
			case DevsPackage.COUPLED_MODEL___SEND_DONE__STRING_FLOAT:
				sendDone((String)arguments.get(0), (Float)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (children: ");
		result.append(children);
		result.append(')');
		return result.toString();
	}

} //CoupledModelImpl
