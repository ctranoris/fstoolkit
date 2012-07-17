/**
 */
package brokermodel.impl;

import brokermodel.Broker;
import brokermodel.BrokerFactory;
import brokermodel.BrokerPackage;
import brokermodel.NamedElement;
import brokermodel.ScenarioStatus;

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

import brokermodel.networkelements.NetworkelementsPackage;

import brokermodel.networkelements.impl.NetworkelementsPackageImpl;

import brokermodel.providersite.ProvidersitePackage;

import brokermodel.providersite.impl.ProvidersitePackageImpl;

import brokermodel.resources.ResourcesPackage;

import brokermodel.resources.impl.ResourcesPackageImpl;

import brokermodel.services.ServicesPackage;

import brokermodel.services.impl.ServicesPackageImpl;

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
public class BrokerPackageImpl extends EPackageImpl implements BrokerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scenarioStatusEEnum = null;

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
	 * @see brokermodel.BrokerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BrokerPackageImpl() {
		super(eNS_URI, BrokerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BrokerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BrokerPackage init() {
		if (isInited) return (BrokerPackage)EPackage.Registry.INSTANCE.getEPackage(BrokerPackage.eNS_URI);

		// Obtain or create and register package
		BrokerPackageImpl theBrokerPackage = (BrokerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BrokerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BrokerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UsersPackageImpl theUsersPackage = (UsersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI) instanceof UsersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI) : UsersPackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);
		NetworkelementsPackageImpl theNetworkelementsPackage = (NetworkelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkelementsPackage.eNS_URI) instanceof NetworkelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkelementsPackage.eNS_URI) : NetworkelementsPackage.eINSTANCE);
		ProvidersitePackageImpl theProvidersitePackage = (ProvidersitePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProvidersitePackage.eNS_URI) instanceof ProvidersitePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProvidersitePackage.eNS_URI) : ProvidersitePackage.eINSTANCE);
		SlareservationsPackageImpl theSlareservationsPackage = (SlareservationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SlareservationsPackage.eNS_URI) instanceof SlareservationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SlareservationsPackage.eNS_URI) : SlareservationsPackage.eINSTANCE);
		FederationscenariosPackageImpl theFederationscenariosPackage = (FederationscenariosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI) instanceof FederationscenariosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI) : FederationscenariosPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		AvailabilityContractPackageImpl theAvailabilityContractPackage = (AvailabilityContractPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvailabilityContractPackage.eNS_URI) instanceof AvailabilityContractPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvailabilityContractPackage.eNS_URI) : AvailabilityContractPackage.eINSTANCE);
		UiObjectsPackageImpl theUiObjectsPackage = (UiObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiObjectsPackage.eNS_URI) instanceof UiObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiObjectsPackage.eNS_URI) : UiObjectsPackage.eINSTANCE);
		ExperimentRuntimePackageImpl theExperimentRuntimePackage = (ExperimentRuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentRuntimePackage.eNS_URI) instanceof ExperimentRuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentRuntimePackage.eNS_URI) : ExperimentRuntimePackage.eINSTANCE);
		ExtensionInterfacesPackageImpl theExtensionInterfacesPackage = (ExtensionInterfacesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionInterfacesPackage.eNS_URI) instanceof ExtensionInterfacesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionInterfacesPackage.eNS_URI) : ExtensionInterfacesPackage.eINSTANCE);
		FcielementsPackageImpl theFcielementsPackage = (FcielementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI) instanceof FcielementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI) : FcielementsPackage.eINSTANCE);

		// Create package meta-data objects
		theBrokerPackage.createPackageContents();
		theUsersPackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theNetworkelementsPackage.createPackageContents();
		theProvidersitePackage.createPackageContents();
		theSlareservationsPackage.createPackageContents();
		theFederationscenariosPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theAvailabilityContractPackage.createPackageContents();
		theUiObjectsPackage.createPackageContents();
		theExperimentRuntimePackage.createPackageContents();
		theExtensionInterfacesPackage.createPackageContents();
		theFcielementsPackage.createPackageContents();

		// Initialize created meta-data
		theBrokerPackage.initializePackageContents();
		theUsersPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theNetworkelementsPackage.initializePackageContents();
		theProvidersitePackage.initializePackageContents();
		theSlareservationsPackage.initializePackageContents();
		theFederationscenariosPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theAvailabilityContractPackage.initializePackageContents();
		theUiObjectsPackage.initializePackageContents();
		theExperimentRuntimePackage.initializePackageContents();
		theExtensionInterfacesPackage.initializePackageContents();
		theFcielementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBrokerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BrokerPackage.eNS_URI, theBrokerPackage);
		return theBrokerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroker() {
		return brokerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroker_RegisteredUsers() {
		return (EReference)brokerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroker_ContributedTaxonomies() {
		return (EReference)brokerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroker_OfferedServices() {
		return (EReference)brokerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroker_AvailableFederationScenarios() {
		return (EReference)brokerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroker_OfferedServiceCompositions() {
		return (EReference)brokerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroker_ResourceServiceContracts() {
		return (EReference)brokerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroker_SLAs() {
		return (EReference)brokerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBroker_ResourceURI() {
		return (EAttribute)brokerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBroker_APIGateway() {
		return (EAttribute)brokerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Id() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Description() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_UniqueID() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScenarioStatus() {
		return scenarioStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokerFactory getBrokerFactory() {
		return (BrokerFactory)getEFactoryInstance();
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
		brokerEClass = createEClass(BROKER);
		createEReference(brokerEClass, BROKER__REGISTERED_USERS);
		createEReference(brokerEClass, BROKER__CONTRIBUTED_TAXONOMIES);
		createEReference(brokerEClass, BROKER__OFFERED_SERVICES);
		createEReference(brokerEClass, BROKER__AVAILABLE_FEDERATION_SCENARIOS);
		createEReference(brokerEClass, BROKER__OFFERED_SERVICE_COMPOSITIONS);
		createEReference(brokerEClass, BROKER__RESOURCE_SERVICE_CONTRACTS);
		createEReference(brokerEClass, BROKER__SL_AS);
		createEAttribute(brokerEClass, BROKER__RESOURCE_URI);
		createEAttribute(brokerEClass, BROKER__API_GATEWAY);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__ID);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__UNIQUE_ID);

		// Create enums
		scenarioStatusEEnum = createEEnum(SCENARIO_STATUS);
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
		UsersPackage theUsersPackage = (UsersPackage)EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI);
		ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		NetworkelementsPackage theNetworkelementsPackage = (NetworkelementsPackage)EPackage.Registry.INSTANCE.getEPackage(NetworkelementsPackage.eNS_URI);
		ProvidersitePackage theProvidersitePackage = (ProvidersitePackage)EPackage.Registry.INSTANCE.getEPackage(ProvidersitePackage.eNS_URI);
		SlareservationsPackage theSlareservationsPackage = (SlareservationsPackage)EPackage.Registry.INSTANCE.getEPackage(SlareservationsPackage.eNS_URI);
		FederationscenariosPackage theFederationscenariosPackage = (FederationscenariosPackage)EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI);
		ServicesPackage theServicesPackage = (ServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI);
		AvailabilityContractPackage theAvailabilityContractPackage = (AvailabilityContractPackage)EPackage.Registry.INSTANCE.getEPackage(AvailabilityContractPackage.eNS_URI);
		UiObjectsPackage theUiObjectsPackage = (UiObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(UiObjectsPackage.eNS_URI);
		ExperimentRuntimePackage theExperimentRuntimePackage = (ExperimentRuntimePackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentRuntimePackage.eNS_URI);
		ExtensionInterfacesPackage theExtensionInterfacesPackage = (ExtensionInterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionInterfacesPackage.eNS_URI);
		FcielementsPackage theFcielementsPackage = (FcielementsPackage)EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theUsersPackage);
		getESubpackages().add(theResourcesPackage);
		getESubpackages().add(theNetworkelementsPackage);
		getESubpackages().add(theProvidersitePackage);
		getESubpackages().add(theSlareservationsPackage);
		getESubpackages().add(theFederationscenariosPackage);
		getESubpackages().add(theServicesPackage);
		getESubpackages().add(theAvailabilityContractPackage);
		getESubpackages().add(theUiObjectsPackage);
		getESubpackages().add(theExperimentRuntimePackage);
		getESubpackages().add(theExtensionInterfacesPackage);
		getESubpackages().add(theFcielementsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		brokerEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(brokerEClass, Broker.class, "Broker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroker_RegisteredUsers(), theUsersPackage.getBrokerUser(), null, "registeredUsers", null, 0, -1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBroker_ContributedTaxonomies(), theServicesPackage.getTaxonomy(), null, "contributedTaxonomies", null, 0, -1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBroker_OfferedServices(), theServicesPackage.getOfferedService(), null, "offeredServices", null, 0, -1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBroker_AvailableFederationScenarios(), theFederationscenariosPackage.getRequestedFederationScenario(), null, "availableFederationScenarios", null, 0, -1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBroker_OfferedServiceCompositions(), theServicesPackage.getServiceComposition(), null, "offeredServiceCompositions", null, 0, -1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBroker_ResourceServiceContracts(), theAvailabilityContractPackage.getResourceServiceContract(), null, "ResourceServiceContracts", null, 0, -1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBroker_SLAs(), theSlareservationsPackage.getSLA(), null, "SLAs", null, 0, -1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBroker_ResourceURI(), ecorePackage.getEString(), "resourceURI", null, 0, 1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBroker_APIGateway(), ecorePackage.getEString(), "APIGateway", null, 0, 1, Broker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_UniqueID(), ecorePackage.getEString(), "uniqueID", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scenarioStatusEEnum, ScenarioStatus.class, "ScenarioStatus");
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.NEW);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.REQUESTED);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.SCHEDULED_PROVISIONING);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.MODIFIED);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.REJECTED);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.RUNNING);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.PROVISIONING);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.SHUT_DOWN);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.DELETED);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.SHUTTING_DOWN);
		addEEnumLiteral(scenarioStatusEEnum, ScenarioStatus.SCHEDULED_SHUT_DOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //BrokerPackageImpl
