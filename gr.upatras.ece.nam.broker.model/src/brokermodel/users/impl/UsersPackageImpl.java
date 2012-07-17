/**
 */
package brokermodel.users.impl;

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

import brokermodel.services.ServicesPackage;

import brokermodel.services.impl.ServicesPackageImpl;

import brokermodel.slareservations.SlareservationsPackage;

import brokermodel.slareservations.impl.SlareservationsPackageImpl;

import brokermodel.uiObjects.UiObjectsPackage;

import brokermodel.uiObjects.impl.UiObjectsPackageImpl;

import brokermodel.users.Account;
import brokermodel.users.Admin;
import brokermodel.users.BrokerCustomer;
import brokermodel.users.BrokerPersonel;
import brokermodel.users.BrokerUser;
import brokermodel.users.ResourcesProvider;
import brokermodel.users.TestbedDesigner;
import brokermodel.users.UsersFactory;
import brokermodel.users.UsersPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsersPackageImpl extends EPackageImpl implements UsersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testbedDesignerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokerCustomerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokerUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokerPersonelEClass = null;

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
	 * @see brokermodel.users.UsersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsersPackageImpl() {
		super(eNS_URI, UsersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UsersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsersPackage init() {
		if (isInited) return (UsersPackage)EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI);

		// Obtain or create and register package
		UsersPackageImpl theUsersPackage = (UsersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BrokerPackageImpl theBrokerPackage = (BrokerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrokerPackage.eNS_URI) instanceof BrokerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrokerPackage.eNS_URI) : BrokerPackage.eINSTANCE);
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
		theUsersPackage.createPackageContents();
		theBrokerPackage.createPackageContents();
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
		theUsersPackage.initializePackageContents();
		theBrokerPackage.initializePackageContents();
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
		theUsersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsersPackage.eNS_URI, theUsersPackage);
		return theUsersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Password() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Username() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_AuthorizationKey() {
		return (EReference)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcesProvider() {
		return resourcesProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcesProvider_OfferedSiteList() {
		return (EReference)resourcesProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestbedDesigner() {
		return testbedDesignerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestbedDesigner_DesignsVirtualTestbeds() {
		return (EReference)testbedDesignerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrokerCustomer() {
		return brokerCustomerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrokerCustomer_UtilizesVirtualTestbed() {
		return (EReference)brokerCustomerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrokerCustomer_HasTestbedDesigner() {
		return (EReference)brokerCustomerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrokerUser() {
		return brokerUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBrokerUser_HasAccount() {
		return (EReference)brokerUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerUser_Organization() {
		return (EAttribute)brokerUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerUser_Address() {
		return (EAttribute)brokerUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrokerUser_Telephone() {
		return (EAttribute)brokerUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrokerPersonel() {
		return brokerPersonelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsersFactory getUsersFactory() {
		return (UsersFactory)getEFactoryInstance();
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
		accountEClass = createEClass(ACCOUNT);
		createEAttribute(accountEClass, ACCOUNT__PASSWORD);
		createEAttribute(accountEClass, ACCOUNT__USERNAME);
		createEReference(accountEClass, ACCOUNT__AUTHORIZATION_KEY);

		resourcesProviderEClass = createEClass(RESOURCES_PROVIDER);
		createEReference(resourcesProviderEClass, RESOURCES_PROVIDER__OFFERED_SITE_LIST);

		testbedDesignerEClass = createEClass(TESTBED_DESIGNER);
		createEReference(testbedDesignerEClass, TESTBED_DESIGNER__DESIGNS_VIRTUAL_TESTBEDS);

		adminEClass = createEClass(ADMIN);

		brokerCustomerEClass = createEClass(BROKER_CUSTOMER);
		createEReference(brokerCustomerEClass, BROKER_CUSTOMER__UTILIZES_VIRTUAL_TESTBED);
		createEReference(brokerCustomerEClass, BROKER_CUSTOMER__HAS_TESTBED_DESIGNER);

		brokerUserEClass = createEClass(BROKER_USER);
		createEReference(brokerUserEClass, BROKER_USER__HAS_ACCOUNT);
		createEAttribute(brokerUserEClass, BROKER_USER__ORGANIZATION);
		createEAttribute(brokerUserEClass, BROKER_USER__ADDRESS);
		createEAttribute(brokerUserEClass, BROKER_USER__TELEPHONE);

		brokerPersonelEClass = createEClass(BROKER_PERSONEL);
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
		FcielementsPackage theFcielementsPackage = (FcielementsPackage)EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI);
		ProvidersitePackage theProvidersitePackage = (ProvidersitePackage)EPackage.Registry.INSTANCE.getEPackage(ProvidersitePackage.eNS_URI);
		FederationscenariosPackage theFederationscenariosPackage = (FederationscenariosPackage)EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accountEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());
		resourcesProviderEClass.getESuperTypes().add(this.getBrokerUser());
		testbedDesignerEClass.getESuperTypes().add(this.getBrokerUser());
		adminEClass.getESuperTypes().add(this.getBrokerPersonel());
		brokerCustomerEClass.getESuperTypes().add(this.getBrokerUser());
		brokerUserEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());
		brokerPersonelEClass.getESuperTypes().add(this.getBrokerUser());

		// Initialize classes and features; add operations and parameters
		initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccount_Password(), ecorePackage.getEString(), "password", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_Username(), ecorePackage.getEString(), "username", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_AuthorizationKey(), theFcielementsPackage.getAuthorizationKey(), null, "authorizationKey", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesProviderEClass, ResourcesProvider.class, "ResourcesProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcesProvider_OfferedSiteList(), theProvidersitePackage.getSite(), theProvidersitePackage.getSite_BelongsToProvider(), "offeredSiteList", null, 0, -1, ResourcesProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testbedDesignerEClass, TestbedDesigner.class, "TestbedDesigner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestbedDesigner_DesignsVirtualTestbeds(), theFederationscenariosPackage.getRequestedFederationScenario(), null, "designsVirtualTestbeds", null, 0, -1, TestbedDesigner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(brokerCustomerEClass, BrokerCustomer.class, "BrokerCustomer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBrokerCustomer_UtilizesVirtualTestbed(), theFederationscenariosPackage.getRequestedFederationScenario(), null, "utilizesVirtualTestbed", null, 0, -1, BrokerCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBrokerCustomer_HasTestbedDesigner(), this.getTestbedDesigner(), null, "hasTestbedDesigner", null, 0, 1, BrokerCustomer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brokerUserEClass, BrokerUser.class, "BrokerUser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBrokerUser_HasAccount(), this.getAccount(), null, "hasAccount", null, 0, 1, BrokerUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrokerUser_Organization(), ecorePackage.getEString(), "organization", null, 0, 1, BrokerUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrokerUser_Address(), ecorePackage.getEString(), "address", null, 0, 1, BrokerUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrokerUser_Telephone(), ecorePackage.getEString(), "telephone", null, 0, 1, BrokerUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brokerPersonelEClass, BrokerPersonel.class, "BrokerPersonel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (getTestbedDesigner_DesignsVirtualTestbeds(), 
		   source, 
		   new String[] {
		   });
	}

} //UsersPackageImpl
