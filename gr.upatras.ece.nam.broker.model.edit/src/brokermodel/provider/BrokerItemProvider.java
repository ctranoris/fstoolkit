/**
 */
package brokermodel.provider;


import brokermodel.Broker;
import brokermodel.BrokermodelPackage;

import brokermodel.availabilityContract.AvailabilityContractFactory;

import brokermodel.federationscenarios.FederationscenariosFactory;

import brokermodel.services.ServicesFactory;

import brokermodel.slareservations.SlareservationsFactory;

import brokermodel.users.UsersFactory;

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

/**
 * This is the item provider adapter for a {@link brokermodel.Broker} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BrokerItemProvider
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
	public BrokerItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Broker_resourceURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Broker_resourceURI_feature", "_UI_Broker_type"),
				 BrokermodelPackage.Literals.BROKER__RESOURCE_URI,
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
				 getString("_UI_Broker_APIGateway_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Broker_APIGateway_feature", "_UI_Broker_type"),
				 BrokermodelPackage.Literals.BROKER__API_GATEWAY,
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
			childrenFeatures.add(BrokermodelPackage.Literals.BROKER__REGISTERED_USERS);
			childrenFeatures.add(BrokermodelPackage.Literals.BROKER__CONTRIBUTED_TAXONOMIES);
			childrenFeatures.add(BrokermodelPackage.Literals.BROKER__OFFERED_SERVICES);
			childrenFeatures.add(BrokermodelPackage.Literals.BROKER__AVAILABLE_FEDERATION_SCENARIOS);
			childrenFeatures.add(BrokermodelPackage.Literals.BROKER__OFFERED_SERVICE_COMPOSITIONS);
			childrenFeatures.add(BrokermodelPackage.Literals.BROKER__RESOURCE_SERVICE_CONTRACTS);
			childrenFeatures.add(BrokermodelPackage.Literals.BROKER__SL_AS);
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
	 * This returns Broker.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Broker"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Broker)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Broker_type") :
			getString("_UI_Broker_type") + " " + label;
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

		switch (notification.getFeatureID(Broker.class)) {
			case BrokermodelPackage.BROKER__RESOURCE_URI:
			case BrokermodelPackage.BROKER__API_GATEWAY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BrokermodelPackage.BROKER__REGISTERED_USERS:
			case BrokermodelPackage.BROKER__CONTRIBUTED_TAXONOMIES:
			case BrokermodelPackage.BROKER__OFFERED_SERVICES:
			case BrokermodelPackage.BROKER__AVAILABLE_FEDERATION_SCENARIOS:
			case BrokermodelPackage.BROKER__OFFERED_SERVICE_COMPOSITIONS:
			case BrokermodelPackage.BROKER__RESOURCE_SERVICE_CONTRACTS:
			case BrokermodelPackage.BROKER__SL_AS:
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
				(BrokermodelPackage.Literals.BROKER__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createResourcesProvider()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createTestbedDesigner()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createBrokerPersonel()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createAdmin()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__REGISTERED_USERS,
				 UsersFactory.eINSTANCE.createBrokerCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__CONTRIBUTED_TAXONOMIES,
				 ServicesFactory.eINSTANCE.createTaxonomy()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__OFFERED_SERVICES,
				 ServicesFactory.eINSTANCE.createOfferedService()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__AVAILABLE_FEDERATION_SCENARIOS,
				 FederationscenariosFactory.eINSTANCE.createRequestedFederationScenario()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__OFFERED_SERVICE_COMPOSITIONS,
				 ServicesFactory.eINSTANCE.createServiceComposition()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__RESOURCE_SERVICE_CONTRACTS,
				 AvailabilityContractFactory.eINSTANCE.createResourceServiceContract()));

		newChildDescriptors.add
			(createChildParameter
				(BrokermodelPackage.Literals.BROKER__SL_AS,
				 SlareservationsFactory.eINSTANCE.createSLA()));
	}

}
