/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.fcielements.impl;

import FederationOffice.FederationOfficePackage;

import FederationOffice.availabilityContract.AvailabilityContractPackage;

import FederationOffice.availabilityContract.impl.AvailabilityContractPackageImpl;

import FederationOffice.experimentRuntime.ExperimentRuntimePackage;

import FederationOffice.experimentRuntime.impl.ExperimentRuntimePackageImpl;

import FederationOffice.extensionInterfaces.ExtensionInterfacesPackage;

import FederationOffice.extensionInterfaces.impl.ExtensionInterfacesPackageImpl;

import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.FCICredentials;
import FederationOffice.fcielements.FcielementsFactory;
import FederationOffice.fcielements.FcielementsPackage;
import FederationOffice.fcielements.IFCIService;

import FederationOffice.federationscenarios.FederationscenariosPackage;

import FederationOffice.federationscenarios.impl.FederationscenariosPackageImpl;

import FederationOffice.impl.FederationOfficePackageImpl;

import FederationOffice.networkelements.NetworkelementsPackage;

import FederationOffice.networkelements.impl.NetworkelementsPackageImpl;

import FederationOffice.providersite.ProvidersitePackage;

import FederationOffice.providersite.impl.ProvidersitePackageImpl;

import FederationOffice.resources.ResourcesPackage;

import FederationOffice.resources.impl.ResourcesPackageImpl;

import FederationOffice.services.ServicesPackage;

import FederationOffice.services.impl.ServicesPackageImpl;

import FederationOffice.slareservations.SlareservationsPackage;

import FederationOffice.slareservations.impl.SlareservationsPackageImpl;

import FederationOffice.uiObjects.UiObjectsPackage;

import FederationOffice.uiObjects.impl.UiObjectsPackageImpl;

import FederationOffice.users.UsersPackage;

import FederationOffice.users.impl.UsersPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FcielementsPackageImpl extends EPackageImpl implements FcielementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifciServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fciCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationKeyEClass = null;

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
	 * @see FederationOffice.fcielements.FcielementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FcielementsPackageImpl() {
		super(eNS_URI, FcielementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FcielementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FcielementsPackage init() {
		if (isInited) return (FcielementsPackage)EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI);

		// Obtain or create and register package
		FcielementsPackageImpl theFcielementsPackage = (FcielementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FcielementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FcielementsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FederationOfficePackageImpl theFederationOfficePackage = (FederationOfficePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FederationOfficePackage.eNS_URI) instanceof FederationOfficePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FederationOfficePackage.eNS_URI) : FederationOfficePackage.eINSTANCE);
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

		// Create package meta-data objects
		theFcielementsPackage.createPackageContents();
		theFederationOfficePackage.createPackageContents();
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

		// Initialize created meta-data
		theFcielementsPackage.initializePackageContents();
		theFederationOfficePackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theFcielementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FcielementsPackage.eNS_URI, theFcielementsPackage);
		return theFcielementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIFCIService() {
		return ifciServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFCIService_Office() {
		return (EReference)ifciServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIFCIService_Instance() {
		return (EReference)ifciServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFCICredentials() {
		return fciCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFCICredentials_Username() {
		return (EAttribute)fciCredentialsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFCICredentials_Password() {
		return (EAttribute)fciCredentialsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationKey() {
		return authorizationKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationKey_Username() {
		return (EAttribute)authorizationKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizationKey_Password() {
		return (EAttribute)authorizationKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FcielementsFactory getFcielementsFactory() {
		return (FcielementsFactory)getEFactoryInstance();
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
		ifciServiceEClass = createEClass(IFCI_SERVICE);
		createEReference(ifciServiceEClass, IFCI_SERVICE__OFFICE);
		createEReference(ifciServiceEClass, IFCI_SERVICE__INSTANCE);

		fciCredentialsEClass = createEClass(FCI_CREDENTIALS);
		createEAttribute(fciCredentialsEClass, FCI_CREDENTIALS__USERNAME);
		createEAttribute(fciCredentialsEClass, FCI_CREDENTIALS__PASSWORD);

		authorizationKeyEClass = createEClass(AUTHORIZATION_KEY);
		createEAttribute(authorizationKeyEClass, AUTHORIZATION_KEY__USERNAME);
		createEAttribute(authorizationKeyEClass, AUTHORIZATION_KEY__PASSWORD);
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
		FederationOfficePackage theFederationOfficePackage = (FederationOfficePackage)EPackage.Registry.INSTANCE.getEPackage(FederationOfficePackage.eNS_URI);
		FederationscenariosPackage theFederationscenariosPackage = (FederationscenariosPackage)EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(ifciServiceEClass, IFCIService.class, "IFCIService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIFCIService_Office(), theFederationOfficePackage.getOffice(), null, "office", null, 0, 1, IFCIService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIFCIService_Instance(), this.getIFCIService(), null, "instance", null, 0, 1, IFCIService.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(ifciServiceEClass, theFederationOfficePackage.getOffice(), "getOffice", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "forceRefresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ifciServiceEClass, ecorePackage.getEString(), "CreateResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "providerAlias", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resourceTypeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ifciServiceEClass, ecorePackage.getEString(), "UpdateResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "providerAlias", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resourceTypeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "runtimeID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ifciServiceEClass, ecorePackage.getEString(), "DeleteResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "providerAlias", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "resourceTypeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "runtimeID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ifciServiceEClass, ecorePackage.getEString(), "getParameterValueOfResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "providerAlias", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "runtimeID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "paramName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fciCredentialsEClass, FCICredentials.class, "FCICredentials", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFCICredentials_Username(), ecorePackage.getEString(), "username", null, 0, 1, FCICredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFCICredentials_Password(), ecorePackage.getEString(), "password", null, 0, 1, FCICredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationKeyEClass, AuthorizationKey.class, "AuthorizationKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizationKey_Username(), ecorePackage.getEString(), "username", null, 0, 1, AuthorizationKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizationKey_Password(), ecorePackage.getEString(), "password", null, 0, 1, AuthorizationKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //FcielementsPackageImpl
