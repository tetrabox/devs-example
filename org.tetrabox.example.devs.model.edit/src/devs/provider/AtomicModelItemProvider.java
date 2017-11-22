/**
 */
package devs.provider;


import devs.AtomicModel;
import devs.DevsFactory;
import devs.DevsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link devs.AtomicModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicModelItemProvider extends DEVSModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInitialStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initial State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AtomicModel_initialState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AtomicModel_initialState_feature", "_UI_AtomicModel_type"),
				 DevsPackage.Literals.ATOMIC_MODEL__INITIAL_STATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DevsPackage.Literals.ATOMIC_MODEL__STATES);
			childrenFeatures.add(DevsPackage.Literals.ATOMIC_MODEL__DELT_INT);
			childrenFeatures.add(DevsPackage.Literals.ATOMIC_MODEL__DELT_EXT);
			childrenFeatures.add(DevsPackage.Literals.ATOMIC_MODEL__TIME_ADVANCE);
			childrenFeatures.add(DevsPackage.Literals.ATOMIC_MODEL__LAMBDA);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AtomicModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AtomicModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AtomicModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AtomicModel_type") :
			getString("_UI_AtomicModel_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AtomicModel.class)) {
			case DevsPackage.ATOMIC_MODEL__STATES:
			case DevsPackage.ATOMIC_MODEL__DELT_INT:
			case DevsPackage.ATOMIC_MODEL__DELT_EXT:
			case DevsPackage.ATOMIC_MODEL__TIME_ADVANCE:
			case DevsPackage.ATOMIC_MODEL__LAMBDA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DevsPackage.Literals.ATOMIC_MODEL__STATES,
				 DevsFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(DevsPackage.Literals.ATOMIC_MODEL__DELT_INT,
				 DevsFactory.eINSTANCE.createInternalTransition()));

		newChildDescriptors.add
			(createChildParameter
				(DevsPackage.Literals.ATOMIC_MODEL__DELT_EXT,
				 DevsFactory.eINSTANCE.createExternalTransition()));

		newChildDescriptors.add
			(createChildParameter
				(DevsPackage.Literals.ATOMIC_MODEL__TIME_ADVANCE,
				 DevsFactory.eINSTANCE.createTimeAdvance()));

		newChildDescriptors.add
			(createChildParameter
				(DevsPackage.Literals.ATOMIC_MODEL__LAMBDA,
				 DevsFactory.eINSTANCE.createLambda()));
	}

}
