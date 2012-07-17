/**
 */
package brokermodel.services.provider;


import brokermodel.provider.BrokerEditPlugin;
import brokermodel.provider.NamedElementItemProvider;

import brokermodel.services.AbstractSetting;
import brokermodel.services.ServicesFactory;
import brokermodel.services.ServicesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link brokermodel.services.AbstractSetting} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractSettingItemProvider
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
	public AbstractSettingItemProvider(AdapterFactory adapterFactory) {
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

			addUserExposedPropertyDescriptor(object);
			addUserEditablePropertyDescriptor(object);
			addCanBePublishedPropertyDescriptor(object);
			addReadablePropertyDescriptor(object);
			addWritablePropertyDescriptor(object);
			addRequiresParamsPropertyDescriptor(object);
			addOptionalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the User Exposed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserExposedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractSetting_userExposed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractSetting_userExposed_feature", "_UI_AbstractSetting_type"),
				 ServicesPackage.Literals.ABSTRACT_SETTING__USER_EXPOSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractSetting_userEditable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractSetting_userEditable_feature", "_UI_AbstractSetting_type"),
				 ServicesPackage.Literals.ABSTRACT_SETTING__USER_EDITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Can Be Published feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCanBePublishedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractSetting_canBePublished_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractSetting_canBePublished_feature", "_UI_AbstractSetting_type"),
				 ServicesPackage.Literals.ABSTRACT_SETTING__CAN_BE_PUBLISHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Readable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractSetting_Readable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractSetting_Readable_feature", "_UI_AbstractSetting_type"),
				 ServicesPackage.Literals.ABSTRACT_SETTING__READABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Writable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWritablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractSetting_Writable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractSetting_Writable_feature", "_UI_AbstractSetting_type"),
				 ServicesPackage.Literals.ABSTRACT_SETTING__WRITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requires Params feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresParamsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractSetting_requiresParams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractSetting_requiresParams_feature", "_UI_AbstractSetting_type"),
				 ServicesPackage.Literals.ABSTRACT_SETTING__REQUIRES_PARAMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractSetting_Optional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractSetting_Optional_feature", "_UI_AbstractSetting_type"),
				 ServicesPackage.Literals.ABSTRACT_SETTING__OPTIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(ServicesPackage.Literals.ABSTRACT_SETTING__SETTING_TYPE);
			childrenFeatures.add(ServicesPackage.Literals.ABSTRACT_SETTING__SETTING_CONSTRAINTS);
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
	 * This returns AbstractSetting.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbstractSetting"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractSetting)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractSetting_type") :
			getString("_UI_AbstractSetting_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractSetting.class)) {
			case ServicesPackage.ABSTRACT_SETTING__USER_EXPOSED:
			case ServicesPackage.ABSTRACT_SETTING__USER_EDITABLE:
			case ServicesPackage.ABSTRACT_SETTING__CAN_BE_PUBLISHED:
			case ServicesPackage.ABSTRACT_SETTING__READABLE:
			case ServicesPackage.ABSTRACT_SETTING__WRITABLE:
			case ServicesPackage.ABSTRACT_SETTING__OPTIONAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicesPackage.ABSTRACT_SETTING__SETTING_TYPE:
			case ServicesPackage.ABSTRACT_SETTING__SETTING_CONSTRAINTS:
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
				(ServicesPackage.Literals.ABSTRACT_SETTING__SETTING_TYPE,
				 ServicesFactory.eINSTANCE.createbrTypeString()));

		newChildDescriptors.add
			(createChildParameter
				(ServicesPackage.Literals.ABSTRACT_SETTING__SETTING_TYPE,
				 ServicesFactory.eINSTANCE.createbrTypeEnum()));

		newChildDescriptors.add
			(createChildParameter
				(ServicesPackage.Literals.ABSTRACT_SETTING__SETTING_TYPE,
				 ServicesFactory.eINSTANCE.createbrTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(ServicesPackage.Literals.ABSTRACT_SETTING__SETTING_TYPE,
				 ServicesFactory.eINSTANCE.createbrTypeTideElement()));

		newChildDescriptors.add
			(createChildParameter
				(ServicesPackage.Literals.ABSTRACT_SETTING__SETTING_CONSTRAINTS,
				 ServicesFactory.eINSTANCE.createSettingConstraint()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BrokerEditPlugin.INSTANCE;
	}

}
