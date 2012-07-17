/**
 */
package brokermodel.services.impl;

import brokermodel.BrokerPackage;

import brokermodel.availabilityContract.AvailabilityContractPackage;

import brokermodel.availabilityContract.impl.AvailabilityContractPackageImpl;

import brokermodel.experimentRuntime.ExperimentRuntimePackage;

import brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl;

import brokermodel.extensionInterfaces.ExtensionInterfacesPackage;

import brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl;

import brokermodel.fcielements.FcielementsPackage;

import brokermodel.fcielements.impl.FcielementsPackageImpl;

import brokermodel.federationscenarios.FederationscenariosPackage;

import brokermodel.federationscenarios.impl.FederationscenariosPackageImpl;

import brokermodel.impl.BrokerPackageImpl;

import brokermodel.networkelements.NetworkelementsPackage;

import brokermodel.networkelements.impl.NetworkelementsPackageImpl;

import brokermodel.providersite.ProvidersitePackage;

import brokermodel.providersite.impl.ProvidersitePackageImpl;

import brokermodel.resources.ResourcesPackage;

import brokermodel.resources.impl.ResourcesPackageImpl;

import brokermodel.services.AbstractSetting;
import brokermodel.services.OfferedService;
import brokermodel.services.Service;
import brokermodel.services.ServiceComposition;
import brokermodel.services.ServiceResourceOperation;
import brokermodel.services.ServiceSetting;
import brokermodel.services.ServicesFactory;
import brokermodel.services.ServicesPackage;
import brokermodel.services.SettingConstraint;
import brokermodel.services.SettingType;
import brokermodel.services.Taxonomy;
import brokermodel.services.brTypeEnum;
import brokermodel.services.brTypeEnumItem;
import brokermodel.services.brTypeList;
import brokermodel.services.brTypeString;
import brokermodel.services.brTypeTideElement;

import brokermodel.slareservations.SlareservationsPackage;

import brokermodel.slareservations.impl.SlareservationsPackageImpl;

import brokermodel.uiObjects.UiObjectsPackage;

import brokermodel.uiObjects.impl.UiObjectsPackageImpl;

import brokermodel.users.UsersPackage;

import brokermodel.users.impl.UsersPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicesPackageImpl extends EPackageImpl implements ServicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offeredServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceCompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brTypeEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brTypeListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brTypeEnumItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brTypeTideElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxonomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceResourceOperationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see brokermodel.services.ServicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicesPackageImpl() {
		super(eNS_URI, ServicesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ServicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicesPackage init() {
		if (isInited) return (ServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI);

		// Obtain or create and register package
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BrokerPackageImpl theBrokerPackage = (BrokerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrokerPackage.eNS_URI) instanceof BrokerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrokerPackage.eNS_URI) : BrokerPackage.eINSTANCE);
		UsersPackageImpl theUsersPackage = (UsersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI) instanceof UsersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI) : UsersPackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);
		NetworkelementsPackageImpl theNetworkelementsPackage = (NetworkelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkelementsPackage.eNS_URI) instanceof NetworkelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkelementsPackage.eNS_URI) : NetworkelementsPackage.eINSTANCE);
		ProvidersitePackageImpl theProvidersitePackage = (ProvidersitePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProvidersitePackage.eNS_URI) instanceof ProvidersitePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProvidersitePackage.eNS_URI) : ProvidersitePackage.eINSTANCE);
		SlareservationsPackageImpl theSlareservationsPackage = (SlareservationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SlareservationsPackage.eNS_URI) instanceof SlareservationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SlareservationsPackage.eNS_URI) : SlareservationsPackage.eINSTANCE);
		FederationscenariosPackageImpl theFederationscenariosPackage = (FederationscenariosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI) instanceof FederationscenariosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI) : FederationscenariosPackage.eINSTANCE);
		AvailabilityContractPackageImpl theAvailabilityContractPackage = (AvailabilityContractPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvailabilityContractPackage.eNS_URI) instanceof AvailabilityContractPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvailabilityContractPackage.eNS_URI) : AvailabilityContractPackage.eINSTANCE);
		UiObjectsPackageImpl theUiObjectsPackage = (UiObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiObjectsPackage.eNS_URI) instanceof UiObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiObjectsPackage.eNS_URI) : UiObjectsPackage.eINSTANCE);
		ExperimentRuntimePackageImpl theExperimentRuntimePackage = (ExperimentRuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentRuntimePackage.eNS_URI) instanceof ExperimentRuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentRuntimePackage.eNS_URI) : ExperimentRuntimePackage.eINSTANCE);
		ExtensionInterfacesPackageImpl theExtensionInterfacesPackage = (ExtensionInterfacesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionInterfacesPackage.eNS_URI) instanceof ExtensionInterfacesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionInterfacesPackage.eNS_URI) : ExtensionInterfacesPackage.eINSTANCE);
		FcielementsPackageImpl theFcielementsPackage = (FcielementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI) instanceof FcielementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI) : FcielementsPackage.eINSTANCE);

		// Create package meta-data objects
		theServicesPackage.createPackageContents();
		theBrokerPackage.createPackageContents();
		theUsersPackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theNetworkelementsPackage.createPackageContents();
		theProvidersitePackage.createPackageContents();
		theSlareservationsPackage.createPackageContents();
		theFederationscenariosPackage.createPackageContents();
		theAvailabilityContractPackage.createPackageContents();
		theUiObjectsPackage.createPackageContents();
		theExperimentRuntimePackage.createPackageContents();
		theExtensionInterfacesPackage.createPackageContents();
		theFcielementsPackage.createPackageContents();

		// Initialize created meta-data
		theServicesPackage.initializePackageContents();
		theBrokerPackage.initializePackageContents();
		theUsersPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theNetworkelementsPackage.initializePackageContents();
		theProvidersitePackage.initializePackageContents();
		theSlareservationsPackage.initializePackageContents();
		theFederationscenariosPackage.initializePackageContents();
		theAvailabilityContractPackage.initializePackageContents();
		theUiObjectsPackage.initializePackageContents();
		theExperimentRuntimePackage.initializePackageContents();
		theExtensionInterfacesPackage.initializePackageContents();
		theFcielementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicesPackage.eNS_URI, theServicesPackage);
		return theServicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_ServiceSettings() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_RequiresServices() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceSetting() {
		return serviceSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceSetting_MappedToResourceSettings() {
		return (EReference)serviceSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceSetting_ProvidedByResources() {
		return (EReference)serviceSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfferedService() {
		return offeredServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceComposition() {
		return serviceCompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceComposition_HasServices() {
		return (EReference)serviceCompositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingType() {
		return settingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbrTypeString() {
		return brTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getbrTypeString_DefaultValue() {
		return (EAttribute)brTypeStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbrTypeEnum() {
		return brTypeEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbrTypeEnum_TideEnumlist() {
		return (EReference)brTypeEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbrTypeEnum_DefaultValue() {
		return (EReference)brTypeEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbrTypeList() {
		return brTypeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbrTypeList_ContainsElementsOf() {
		return (EReference)brTypeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbrTypeEnumItem() {
		return brTypeEnumItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getbrTypeEnumItem_Value() {
		return (EAttribute)brTypeEnumItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getbrTypeEnumItem_Description() {
		return (EAttribute)brTypeEnumItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbrTypeTideElement() {
		return brTypeTideElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getbrTypeTideElement_OfTideElement() {
		return (EReference)brTypeTideElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxonomy() {
		return taxonomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomy_Taxonomies() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomy_Categories() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomy_HasScenarios() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomy_HasServices() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSetting() {
		return abstractSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSetting_SettingType() {
		return (EReference)abstractSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSetting_UserExposed() {
		return (EAttribute)abstractSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSetting_UserEditable() {
		return (EAttribute)abstractSettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSetting_CanBePublished() {
		return (EAttribute)abstractSettingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSetting_Readable() {
		return (EAttribute)abstractSettingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSetting_Writable() {
		return (EAttribute)abstractSettingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSetting_SettingConstraints() {
		return (EReference)abstractSettingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSetting_RequiresParams() {
		return (EReference)abstractSettingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSetting_Optional() {
		return (EAttribute)abstractSettingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingConstraint() {
		return settingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingConstraint_ForOperation() {
		return (EAttribute)settingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingConstraint_AvailableAfterOperation() {
		return (EAttribute)settingConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingConstraint_RequiredBeforeOperation() {
		return (EAttribute)settingConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceResourceOperation() {
		return serviceResourceOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesFactory getServicesFactory() {
		return (ServicesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__SERVICE_SETTINGS);
		createEReference(serviceEClass, SERVICE__REQUIRES_SERVICES);

		serviceSettingEClass = createEClass(SERVICE_SETTING);
		createEReference(serviceSettingEClass, SERVICE_SETTING__MAPPED_TO_RESOURCE_SETTINGS);
		createEReference(serviceSettingEClass, SERVICE_SETTING__PROVIDED_BY_RESOURCES);

		offeredServiceEClass = createEClass(OFFERED_SERVICE);

		serviceCompositionEClass = createEClass(SERVICE_COMPOSITION);
		createEReference(serviceCompositionEClass, SERVICE_COMPOSITION__HAS_SERVICES);

		settingTypeEClass = createEClass(SETTING_TYPE);

		brTypeStringEClass = createEClass(BR_TYPE_STRING);
		createEAttribute(brTypeStringEClass, BR_TYPE_STRING__DEFAULT_VALUE);

		brTypeEnumEClass = createEClass(BR_TYPE_ENUM);
		createEReference(brTypeEnumEClass, BR_TYPE_ENUM__TIDE_ENUMLIST);
		createEReference(brTypeEnumEClass, BR_TYPE_ENUM__DEFAULT_VALUE);

		brTypeListEClass = createEClass(BR_TYPE_LIST);
		createEReference(brTypeListEClass, BR_TYPE_LIST__CONTAINS_ELEMENTS_OF);

		brTypeEnumItemEClass = createEClass(BR_TYPE_ENUM_ITEM);
		createEAttribute(brTypeEnumItemEClass, BR_TYPE_ENUM_ITEM__VALUE);
		createEAttribute(brTypeEnumItemEClass, BR_TYPE_ENUM_ITEM__DESCRIPTION);

		brTypeTideElementEClass = createEClass(BR_TYPE_TIDE_ELEMENT);
		createEReference(brTypeTideElementEClass, BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT);

		taxonomyEClass = createEClass(TAXONOMY);
		createEReference(taxonomyEClass, TAXONOMY__TAXONOMIES);
		createEReference(taxonomyEClass, TAXONOMY__CATEGORIES);
		createEReference(taxonomyEClass, TAXONOMY__HAS_SCENARIOS);
		createEReference(taxonomyEClass, TAXONOMY__HAS_SERVICES);

		abstractSettingEClass = createEClass(ABSTRACT_SETTING);
		createEReference(abstractSettingEClass, ABSTRACT_SETTING__SETTING_TYPE);
		createEAttribute(abstractSettingEClass, ABSTRACT_SETTING__USER_EXPOSED);
		createEAttribute(abstractSettingEClass, ABSTRACT_SETTING__USER_EDITABLE);
		createEAttribute(abstractSettingEClass, ABSTRACT_SETTING__CAN_BE_PUBLISHED);
		createEAttribute(abstractSettingEClass, ABSTRACT_SETTING__READABLE);
		createEAttribute(abstractSettingEClass, ABSTRACT_SETTING__WRITABLE);
		createEReference(abstractSettingEClass, ABSTRACT_SETTING__SETTING_CONSTRAINTS);
		createEReference(abstractSettingEClass, ABSTRACT_SETTING__REQUIRES_PARAMS);
		createEAttribute(abstractSettingEClass, ABSTRACT_SETTING__OPTIONAL);

		settingConstraintEClass = createEClass(SETTING_CONSTRAINT);
		createEAttribute(settingConstraintEClass, SETTING_CONSTRAINT__FOR_OPERATION);
		createEAttribute(settingConstraintEClass, SETTING_CONSTRAINT__AVAILABLE_AFTER_OPERATION);
		createEAttribute(settingConstraintEClass, SETTING_CONSTRAINT__REQUIRED_BEFORE_OPERATION);

		// Create enums
		serviceResourceOperationEEnum = createEEnum(SERVICE_RESOURCE_OPERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BrokerPackage theBrokerPackage = (BrokerPackage)EPackage.Registry.INSTANCE.getEPackage(BrokerPackage.eNS_URI);
		ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		FederationscenariosPackage theFederationscenariosPackage = (FederationscenariosPackage)EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());
		serviceSettingEClass.getESuperTypes().add(this.getAbstractSetting());
		offeredServiceEClass.getESuperTypes().add(this.getService());
		serviceCompositionEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());
		settingTypeEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());
		brTypeStringEClass.getESuperTypes().add(this.getSettingType());
		brTypeEnumEClass.getESuperTypes().add(this.getSettingType());
		brTypeListEClass.getESuperTypes().add(this.getSettingType());
		brTypeTideElementEClass.getESuperTypes().add(this.getSettingType());
		taxonomyEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());
		abstractSettingEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());
		settingConstraintEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_ServiceSettings(), this.getServiceSetting(), null, "serviceSettings", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_RequiresServices(), this.getService(), null, "requiresServices", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSettingEClass, ServiceSetting.class, "ServiceSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceSetting_MappedToResourceSettings(), theResourcesPackage.getResourceSetting(), null, "mappedToResourceSettings", null, 0, -1, ServiceSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceSetting_ProvidedByResources(), theResourcesPackage.getResource(), null, "providedByResources", null, 0, -1, ServiceSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offeredServiceEClass, OfferedService.class, "OfferedService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceCompositionEClass, ServiceComposition.class, "ServiceComposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceComposition_HasServices(), this.getService(), null, "hasServices", null, 0, -1, ServiceComposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingTypeEClass, SettingType.class, "SettingType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(brTypeStringEClass, brTypeString.class, "brTypeString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getbrTypeString_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, brTypeString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brTypeEnumEClass, brTypeEnum.class, "brTypeEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getbrTypeEnum_TideEnumlist(), this.getbrTypeEnumItem(), null, "tideEnumlist", null, 0, -1, brTypeEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getbrTypeEnum_DefaultValue(), this.getbrTypeEnumItem(), null, "defaultValue", null, 0, 1, brTypeEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brTypeListEClass, brTypeList.class, "brTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getbrTypeList_ContainsElementsOf(), theBrokerPackage.getNamedElement(), null, "ContainsElementsOf", null, 0, 1, brTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brTypeEnumItemEClass, brTypeEnumItem.class, "brTypeEnumItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getbrTypeEnumItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, brTypeEnumItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getbrTypeEnumItem_Description(), ecorePackage.getEString(), "description", null, 0, 1, brTypeEnumItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brTypeTideElementEClass, brTypeTideElement.class, "brTypeTideElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getbrTypeTideElement_OfTideElement(), theBrokerPackage.getNamedElement(), null, "ofTideElement", null, 0, 1, brTypeTideElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taxonomyEClass, Taxonomy.class, "Taxonomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaxonomy_Taxonomies(), this.getTaxonomy(), null, "taxonomies", null, 0, -1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomy_Categories(), theResourcesPackage.getResourceCategory(), null, "categories", null, 0, -1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomy_HasScenarios(), theFederationscenariosPackage.getRequestedFederationScenario(), null, "hasScenarios", null, 0, -1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomy_HasServices(), this.getService(), null, "hasServices", null, 0, -1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSettingEClass, AbstractSetting.class, "AbstractSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSetting_SettingType(), this.getSettingType(), null, "settingType", null, 0, 1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSetting_UserExposed(), ecorePackage.getEBoolean(), "userExposed", null, 0, 1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSetting_UserEditable(), ecorePackage.getEBoolean(), "userEditable", null, 0, 1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSetting_CanBePublished(), ecorePackage.getEBoolean(), "canBePublished", null, 0, 1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSetting_Readable(), ecorePackage.getEBoolean(), "Readable", "false", 0, 1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSetting_Writable(), ecorePackage.getEBoolean(), "Writable", "false", 0, 1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSetting_SettingConstraints(), this.getSettingConstraint(), null, "settingConstraints", null, 0, -1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSetting_RequiresParams(), this.getAbstractSetting(), null, "requiresParams", null, 0, -1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractSetting_Optional(), ecorePackage.getEBoolean(), "Optional", null, 0, 1, AbstractSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingConstraintEClass, SettingConstraint.class, "SettingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSettingConstraint_ForOperation(), this.getServiceResourceOperation(), "ForOperation", null, 0, 1, SettingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingConstraint_AvailableAfterOperation(), ecorePackage.getEBoolean(), "AvailableAfterOperation", null, 0, 1, SettingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingConstraint_RequiredBeforeOperation(), ecorePackage.getEBoolean(), "RequiredBeforeOperation", null, 0, 1, SettingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(serviceResourceOperationEEnum, ServiceResourceOperation.class, "ServiceResourceOperation");
		addEEnumLiteral(serviceResourceOperationEEnum, ServiceResourceOperation.OP_CREATE);
		addEEnumLiteral(serviceResourceOperationEEnum, ServiceResourceOperation.OP_READ);
		addEEnumLiteral(serviceResourceOperationEEnum, ServiceResourceOperation.OP_UPDATE);
		addEEnumLiteral(serviceResourceOperationEEnum, ServiceResourceOperation.OP_DELETE);
	}

} //ServicesPackageImpl
