/**
 */
package brokermodel.extensionInterfaces.impl;

import brokermodel.BrokermodelPackage;

import brokermodel.availabilityContract.AvailabilityContractPackage;

import brokermodel.availabilityContract.impl.AvailabilityContractPackageImpl;

import brokermodel.experimentRuntime.ExperimentRuntimePackage;

import brokermodel.experimentRuntime.impl.ExperimentRuntimePackageImpl;

import brokermodel.extensionInterfaces.ExtensionInterfacesFactory;
import brokermodel.extensionInterfaces.ExtensionInterfacesPackage;
import brokermodel.extensionInterfaces.IBrokerRepository;
import brokermodel.extensionInterfaces.IBrokerRepositoryListener;
import brokermodel.extensionInterfaces.IProvisionResource;
import brokermodel.extensionInterfaces.IProvisioningJobEvent;
import brokermodel.extensionInterfaces.IProvisioningJobListener;
import brokermodel.extensionInterfaces.IWorkflowEngine;

import brokermodel.fcielements.FcielementsPackage;

import brokermodel.fcielements.impl.FcielementsPackageImpl;

import brokermodel.federationscenarios.FederationscenariosPackage;

import brokermodel.federationscenarios.impl.FederationscenariosPackageImpl;

import brokermodel.impl.BrokermodelPackageImpl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionInterfacesPackageImpl extends EPackageImpl implements ExtensionInterfacesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBrokerRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBrokerRepositoryListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProvisionResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iWorkflowEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProvisioningJobListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProvisioningJobEventEClass = null;

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
	 * @see brokermodel.extensionInterfaces.ExtensionInterfacesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtensionInterfacesPackageImpl() {
		super(eNS_URI, ExtensionInterfacesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtensionInterfacesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtensionInterfacesPackage init() {
		if (isInited) return (ExtensionInterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(ExtensionInterfacesPackage.eNS_URI);

		// Obtain or create and register package
		ExtensionInterfacesPackageImpl theExtensionInterfacesPackage = (ExtensionInterfacesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtensionInterfacesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtensionInterfacesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BrokermodelPackageImpl theBrokermodelPackage = (BrokermodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BrokermodelPackage.eNS_URI) instanceof BrokermodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BrokermodelPackage.eNS_URI) : BrokermodelPackage.eINSTANCE);
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
		FcielementsPackageImpl theFcielementsPackage = (FcielementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI) instanceof FcielementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FcielementsPackage.eNS_URI) : FcielementsPackage.eINSTANCE);

		// Create package meta-data objects
		theExtensionInterfacesPackage.createPackageContents();
		theBrokermodelPackage.createPackageContents();
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
		theFcielementsPackage.createPackageContents();

		// Initialize created meta-data
		theExtensionInterfacesPackage.initializePackageContents();
		theBrokermodelPackage.initializePackageContents();
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
		theFcielementsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtensionInterfacesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtensionInterfacesPackage.eNS_URI, theExtensionInterfacesPackage);
		return theExtensionInterfacesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBrokerRepository() {
		return iBrokerRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBrokerRepositoryListener() {
		return iBrokerRepositoryListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProvisionResource() {
		return iProvisionResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIWorkflowEngine() {
		return iWorkflowEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProvisioningJobListener() {
		return iProvisioningJobListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProvisioningJobEvent() {
		return iProvisioningJobEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionInterfacesFactory getExtensionInterfacesFactory() {
		return (ExtensionInterfacesFactory)getEFactoryInstance();
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
		iBrokerRepositoryEClass = createEClass(IBROKER_REPOSITORY);

		iBrokerRepositoryListenerEClass = createEClass(IBROKER_REPOSITORY_LISTENER);

		iProvisionResourceEClass = createEClass(IPROVISION_RESOURCE);

		iWorkflowEngineEClass = createEClass(IWORKFLOW_ENGINE);

		iProvisioningJobListenerEClass = createEClass(IPROVISIONING_JOB_LISTENER);

		iProvisioningJobEventEClass = createEClass(IPROVISIONING_JOB_EVENT);
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
		FederationscenariosPackage theFederationscenariosPackage = (FederationscenariosPackage)EPackage.Registry.INSTANCE.getEPackage(FederationscenariosPackage.eNS_URI);
		BrokermodelPackage theBrokermodelPackage = (BrokermodelPackage)EPackage.Registry.INSTANCE.getEPackage(BrokermodelPackage.eNS_URI);
		ExperimentRuntimePackage theExperimentRuntimePackage = (ExperimentRuntimePackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentRuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(iBrokerRepositoryEClass, IBrokerRepository.class, "IBrokerRepository", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iBrokerRepositoryEClass, ecorePackage.getEString(), "getName", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(iBrokerRepositoryEClass, null, "LoadScenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "fedScenario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iBrokerRepositoryEClass, null, "registerBrokerRepositoryListener", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIBrokerRepositoryListener(), "listener", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iBrokerRepositoryEClass, theBrokermodelPackage.getBroker(), "loadBrokers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iBrokerRepositoryEClass, theBrokermodelPackage.getBroker(), "getBrokers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(iBrokerRepositoryListenerEClass, IBrokerRepositoryListener.class, "IBrokerRepositoryListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iBrokerRepositoryListenerEClass, null, "RepositoryChanged", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iProvisionResourceEClass, IProvisionResource.class, "IProvisionResource", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iProvisionResourceEClass, ecorePackage.getEString(), "provisionResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "brokerName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProvisionResourceEClass, ecorePackage.getEBoolean(), "supportsBroker", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "brokerName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProvisionResourceEClass, ecorePackage.getEString(), "getSupportedBrokerName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProvisionResourceEClass, ecorePackage.getEString(), "deleteResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "brokerName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProvisionResourceEClass, ecorePackage.getEString(), "updateResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "brokerName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceSettingInstance(), "assignedSetting", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProvisionResourceEClass, ecorePackage.getEString(), "readResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "brokerName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceSettingInstance(), "assignedSetting", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "forceUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iWorkflowEngineEClass, IWorkflowEngine.class, "IWorkflowEngine", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iWorkflowEngineEClass, ecorePackage.getEString(), "getEngineName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iWorkflowEngineEClass, theExperimentRuntimePackage.getRunningScenarios(), "getRunningScenarios", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowEngineEClass, null, "ScheduleScenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowEngineEClass, null, "ShutDownScenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowEngineEClass, null, "DeletePermanentlyScenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowEngineEClass, ecorePackage.getEString(), "ShutDownResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowEngineEClass, ecorePackage.getEString(), "UpdateResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceSettingInstance(), "assignedSetting", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iWorkflowEngineEClass, ecorePackage.getEString(), "ReadResource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getRequestedFederationScenario(), "scenario", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceRequest(), "resourceReq", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theFederationscenariosPackage.getResourceSettingInstance(), "assignedSetting", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "forceUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iProvisioningJobListenerEClass, IProvisioningJobListener.class, "IProvisioningJobListener", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(iProvisioningJobListenerEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(iProvisioningJobListenerEClass, null, "eventOccured", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProvisioningJobEvent(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProvisioningJobListenerEClass, null, "terminate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iProvisioningJobEventEClass, IProvisioningJobEvent.class, "IProvisioningJobEvent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(iProvisioningJobEventEClass, theFederationscenariosPackage.getRequestedFederationScenario(), "statusChangedOnScenario", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(iProvisioningJobEventEClass, theFederationscenariosPackage.getResourceRequest(), "statusChangedOnResource", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //ExtensionInterfacesPackageImpl
