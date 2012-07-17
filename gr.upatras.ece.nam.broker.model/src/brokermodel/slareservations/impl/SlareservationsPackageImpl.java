/**
 */
package brokermodel.slareservations.impl;

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

import brokermodel.slareservations.ReservedResourceContract;
import brokermodel.slareservations.SlareservationsFactory;
import brokermodel.slareservations.SlareservationsPackage;

import brokermodel.uiObjects.UiObjectsPackage;

import brokermodel.uiObjects.impl.UiObjectsPackageImpl;

import brokermodel.users.UsersPackage;

import brokermodel.users.impl.UsersPackageImpl;

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
public class SlareservationsPackageImpl extends EPackageImpl implements SlareservationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservedResourceContractEClass = null;

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
	 * @see brokermodel.slareservations.SlareservationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SlareservationsPackageImpl() {
		super(eNS_URI, SlareservationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SlareservationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SlareservationsPackage init() {
		if (isInited) return (SlareservationsPackage)EPackage.Registry.INSTANCE.getEPackage(SlareservationsPackage.eNS_URI);

		// Obtain or create and register package
		SlareservationsPackageImpl theSlareservationsPackage = (SlareservationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SlareservationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SlareservationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BrokerPackageImpl theBrokerPackage = (BrokerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrokerPackage.eNS_URI) instanceof BrokerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrokerPackage.eNS_URI) : BrokerPackage.eINSTANCE);
		UsersPackageImpl theUsersPackage = (UsersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI) instanceof UsersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UsersPackage.eNS_URI) : UsersPackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);
		NetworkelementsPackageImpl theNetworkelementsPackage = (NetworkelementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkelementsPackage.eNS_URI) instanceof NetworkelementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkelementsPackage.eNS_URI) : NetworkelementsPackage.eINSTANCE);
		ProvidersitePackageImpl theProvidersitePackage = (ProvidersitePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ProvidersitePackage.eNS_URI) instanceof ProvidersitePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ProvidersitePackage.eNS_URI) : ProvidersitePackage.eINSTANCE);
		FederationscenariosPackageImpl theFederationscenariosPackage = (FederationscenariosPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI) instanceof FederationscenariosPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI) : FederationscenariosPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		AvailabilityContractPackageImpl theAvailabilityContractPackage = (AvailabilityContractPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AvailabilityContractPackage.eNS_URI) instanceof AvailabilityContractPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AvailabilityContractPackage.eNS_URI) : AvailabilityContractPackage.eINSTANCE);
		UiObjectsPackageImpl theUiObjectsPackage = (UiObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiObjectsPackage.eNS_URI) instanceof UiObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiObjectsPackage.eNS_URI) : UiObjectsPackage.eINSTANCE);
		ExperimentRuntimePackageImpl theExperimentRuntimePackage = (ExperimentRuntimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentRuntimePackage.eNS_URI) instanceof ExperimentRuntimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentRuntimePackage.eNS_URI) : ExperimentRuntimePackage.eINSTANCE);
		ExtensionInterfacesPackageImpl theExtensionInterfacesPackage = (ExtensionInterfacesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExtensionInterfacesPackage.eNS_URI) instanceof ExtensionInterfacesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExtensionInterfacesPackage.eNS_URI) : ExtensionInterfacesPackage.eINSTANCE);
		FcielementsPackageImpl theFcielementsPackage = (FcielementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI) instanceof FcielementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI) : FcielementsPackage.eINSTANCE);

		// Create package meta-data objects
		theSlareservationsPackage.createPackageContents();
		theBrokerPackage.createPackageContents();
		theUsersPackage.createPackageContents();
		theResourcesPackage.createPackageContents();
		theNetworkelementsPackage.createPackageContents();
		theProvidersitePackage.createPackageContents();
		theFederationscenariosPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theAvailabilityContractPackage.createPackageContents();
		theUiObjectsPackage.createPackageContents();
		theExperimentRuntimePackage.createPackageContents();
		theExtensionInterfacesPackage.createPackageContents();
		theFcielementsPackage.createPackageContents();

		// Initialize created meta-data
		theSlareservationsPackage.initializePackageContents();
		theBrokerPackage.initializePackageContents();
		theUsersPackage.initializePackageContents();
		theResourcesPackage.initializePackageContents();
		theNetworkelementsPackage.initializePackageContents();
		theProvidersitePackage.initializePackageContents();
		theFederationscenariosPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theAvailabilityContractPackage.initializePackageContents();
		theUiObjectsPackage.initializePackageContents();
		theExperimentRuntimePackage.initializePackageContents();
		theExtensionInterfacesPackage.initializePackageContents();
		theFcielementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSlareservationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SlareservationsPackage.eNS_URI, theSlareservationsPackage);
		return theSlareservationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSLA() {
		return slaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLA_ReservedRsources() {
		return (EReference)slaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSLA_ForVT() {
		return (EReference)slaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLA_ValidFrom() {
		return (EAttribute)slaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSLA_ValidUntil() {
		return (EAttribute)slaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservedResourceContract() {
		return reservedResourceContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservedResourceContract_ValidFrom() {
		return (EAttribute)reservedResourceContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservedResourceContract_ForResource() {
		return (EReference)reservedResourceContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservedResourceContract_ValidUntil() {
		return (EAttribute)reservedResourceContractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlareservationsFactory getSlareservationsFactory() {
		return (SlareservationsFactory)getEFactoryInstance();
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
		slaEClass = createEClass(SLA);
		createEReference(slaEClass, SLA__RESERVED_RSOURCES);
		createEReference(slaEClass, SLA__FOR_VT);
		createEAttribute(slaEClass, SLA__VALID_FROM);
		createEAttribute(slaEClass, SLA__VALID_UNTIL);

		reservedResourceContractEClass = createEClass(RESERVED_RESOURCE_CONTRACT);
		createEAttribute(reservedResourceContractEClass, RESERVED_RESOURCE_CONTRACT__VALID_FROM);
		createEReference(reservedResourceContractEClass, RESERVED_RESOURCE_CONTRACT__FOR_RESOURCE);
		createEAttribute(reservedResourceContractEClass, RESERVED_RESOURCE_CONTRACT__VALID_UNTIL);
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
		FederationscenariosPackage theFederationscenariosPackage = (FederationscenariosPackage)EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI);
		ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		slaEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());
		reservedResourceContractEClass.getESuperTypes().add(theBrokerPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(slaEClass, brokermodel.slareservations.SLA.class, "SLA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSLA_ReservedRsources(), this.getReservedResourceContract(), null, "ReservedRsources", null, 0, -1, brokermodel.slareservations.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSLA_ForVT(), theFederationscenariosPackage.getRequestedFederationScenario(), null, "forVT", null, 0, 1, brokermodel.slareservations.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSLA_ValidFrom(), ecorePackage.getEDate(), "ValidFrom", null, 0, 1, brokermodel.slareservations.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSLA_ValidUntil(), ecorePackage.getEDate(), "ValidUntil", null, 0, 1, brokermodel.slareservations.SLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reservedResourceContractEClass, ReservedResourceContract.class, "ReservedResourceContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservedResourceContract_ValidFrom(), ecorePackage.getEDate(), "ValidFrom", null, 0, 1, ReservedResourceContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReservedResourceContract_ForResource(), theResourcesPackage.getOfferedResource(), null, "forResource", null, 0, 1, ReservedResourceContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReservedResourceContract_ValidUntil(), ecorePackage.getEDate(), "ValidUntil", null, 0, 1, ReservedResourceContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //SlareservationsPackageImpl
