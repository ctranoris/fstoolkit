/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import FederationOffice.FederationOfficePackage;
import FederationOffice.Office;
import FederationOffice.availabilityContract.AvailabilityContractFactory;
import FederationOffice.federationscenarios.FederationscenariosFactory;
import FederationOffice.services.ServicesFactory;
import FederationOffice.slareservations.SlareservationsFactory;
import FederationOffice.users.UsersFactory;

/**
 * This is the item provider adapter for a {@link FederationOffice.Office} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OfficeItemProvider
	extends NamedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfficeItemProvider(AdapterFactory adapterFactory) {
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

			addResourceURIPropertyDescriptor(object);
			addAPIGatewayPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resource URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_resourceURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_resourceURI_feature", "_UI_Office_type"),
				 FederationOfficePackage.Literals.OFFICE__RESOURCE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the API Gateway feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAPIGatewayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Office_APIGateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Office_APIGateway_feature", "_UI_Office_type"),
				 FederationOfficePackage.Literals.OFFICE__API_GATEWAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(FederationOfficePackage.Literals.OFFICE__REGISTERED_USERS);
			childrenFeatures.add(FederationOfficePackage.Literals.OFFICE__CONTRIBUTED_TAXONOMIES);
			childrenFeatures.add(FederationOfficePackage.Literals.OFFICE__OFFERED_SERVICES);
			childrenFeatures.add(FederationOfficePackage.Literals.OFFICE__AVAILABLE_FEDERATION_SCENARIOS);
			childrenFeatures.add(FederationOfficePackage.Literals.OFFICE__OFFERED_SERVICE_COMPOSITIONS);
			childrenFeatures.add(FederationOfficePackage.Literals.OFFICE__RESOURCE_SERVICE_CONTRACTS);
			childrenFeatures.add(FederationOfficePackage.Literals.OFFICE__SL_AS);
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
	 * This returns Office.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Office"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Office)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Office_type") :
			getString("_UI_Office_type") + " " + label;
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

		switch (notification.getFeatureID(Office.class)) {
			case FederationOfficePackage.OFFICE__RESOURCE_URI:
			case FederationOfficePackage.OFFICE__API_GATEWAY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FederationOfficePackage.OFFICE__REGISTERED_USERS:
			case FederationOfficePackage.OFFICE__CONTRIBUTED_TAXONOMIES:
			case FederationOfficePackage.OFFICE__OFFERED_SERVICES:
			case FederationOfficePackage.OFFICE__AVAILABLE_FEDERATION_SCENARIOS:
			case FederationOfficePackage.OFFICE__OFFERED_SERVICE_COMPOSITIONS:
			case FederationOfficePackage.OFFICE__RESOURCE_SERVICE_CONTRACTS:
			case FederationOfficePackage.OFFICE__SL_AS:
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
				(FederationOfficePackage.Literals.OFFICE__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createResourcesProvider()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createTestbedDesigner()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createOfficePersonel()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createAdmin()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createOfficeCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__CONTRIBUTED_TAXONOMIES,
				 ServicesFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__OFFERED_SERVICES,
				 ServicesFactory.eINSTANCE.createOfferedService()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__AVAILABLE_FEDERATION_SCENARIOS,
				 FederationscenariosFactory.eINSTANCE.createRequestedFederationScenario()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__OFFERED_SERVICE_COMPOSITIONS,
				 ServicesFactory.eINSTANCE.createServiceComposition()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__RESOURCE_SERVICE_CONTRACTS,
				 AvailabilityContractFactory.eINSTANCE.createResourceServiceContract()));

		newChildDescriptors.add
			(createChildParameter
				(FederationOfficePackage.Literals.OFFICE__SL_AS,
				 SlareservationsFactory.eINSTANCE.createSLA()));
	}

}
