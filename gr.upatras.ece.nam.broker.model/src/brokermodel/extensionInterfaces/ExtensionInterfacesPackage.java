/**
 */
package brokermodel.extensionInterfaces;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see brokermodel.extensionInterfaces.ExtensionInterfacesFactory
 * @model kind="package"
 * @generated
 */
public interface ExtensionInterfacesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "extensionInterfaces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker/model/extensionInterfaces";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker.model.extensionInterfaces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExtensionInterfacesPackage eINSTANCE = brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.extensionInterfaces.IBrokerRepository <em>IBroker Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.extensionInterfaces.IBrokerRepository
	 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIBrokerRepository()
	 * @generated
	 */
	int IBROKER_REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>IBroker Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBROKER_REPOSITORY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link brokermodel.extensionInterfaces.IBrokerRepositoryListener <em>IBroker Repository Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.extensionInterfaces.IBrokerRepositoryListener
	 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIBrokerRepositoryListener()
	 * @generated
	 */
	int IBROKER_REPOSITORY_LISTENER = 1;

	/**
	 * The number of structural features of the '<em>IBroker Repository Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBROKER_REPOSITORY_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link brokermodel.extensionInterfaces.IProvisionResource <em>IProvision Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.extensionInterfaces.IProvisionResource
	 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIProvisionResource()
	 * @generated
	 */
	int IPROVISION_RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>IProvision Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROVISION_RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link brokermodel.extensionInterfaces.IWorkflowEngine <em>IWorkflow Engine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.extensionInterfaces.IWorkflowEngine
	 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIWorkflowEngine()
	 * @generated
	 */
	int IWORKFLOW_ENGINE = 3;

	/**
	 * The number of structural features of the '<em>IWorkflow Engine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IWORKFLOW_ENGINE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link brokermodel.extensionInterfaces.IProvisioningJobListener <em>IProvisioning Job Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.extensionInterfaces.IProvisioningJobListener
	 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIProvisioningJobListener()
	 * @generated
	 */
	int IPROVISIONING_JOB_LISTENER = 4;

	/**
	 * The number of structural features of the '<em>IProvisioning Job Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROVISIONING_JOB_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link brokermodel.extensionInterfaces.IProvisioningJobEvent <em>IProvisioning Job Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.extensionInterfaces.IProvisioningJobEvent
	 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIProvisioningJobEvent()
	 * @generated
	 */
	int IPROVISIONING_JOB_EVENT = 5;

	/**
	 * The number of structural features of the '<em>IProvisioning Job Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROVISIONING_JOB_EVENT_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link brokermodel.extensionInterfaces.IBrokerRepository <em>IBroker Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBroker Repository</em>'.
	 * @see brokermodel.extensionInterfaces.IBrokerRepository
	 * @generated
	 */
	EClass getIBrokerRepository();

	/**
	 * Returns the meta object for class '{@link brokermodel.extensionInterfaces.IBrokerRepositoryListener <em>IBroker Repository Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBroker Repository Listener</em>'.
	 * @see brokermodel.extensionInterfaces.IBrokerRepositoryListener
	 * @generated
	 */
	EClass getIBrokerRepositoryListener();

	/**
	 * Returns the meta object for class '{@link brokermodel.extensionInterfaces.IProvisionResource <em>IProvision Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProvision Resource</em>'.
	 * @see brokermodel.extensionInterfaces.IProvisionResource
	 * @generated
	 */
	EClass getIProvisionResource();

	/**
	 * Returns the meta object for class '{@link brokermodel.extensionInterfaces.IWorkflowEngine <em>IWorkflow Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IWorkflow Engine</em>'.
	 * @see brokermodel.extensionInterfaces.IWorkflowEngine
	 * @generated
	 */
	EClass getIWorkflowEngine();

	/**
	 * Returns the meta object for class '{@link brokermodel.extensionInterfaces.IProvisioningJobListener <em>IProvisioning Job Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProvisioning Job Listener</em>'.
	 * @see brokermodel.extensionInterfaces.IProvisioningJobListener
	 * @generated
	 */
	EClass getIProvisioningJobListener();

	/**
	 * Returns the meta object for class '{@link brokermodel.extensionInterfaces.IProvisioningJobEvent <em>IProvisioning Job Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProvisioning Job Event</em>'.
	 * @see brokermodel.extensionInterfaces.IProvisioningJobEvent
	 * @generated
	 */
	EClass getIProvisioningJobEvent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExtensionInterfacesFactory getExtensionInterfacesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link brokermodel.extensionInterfaces.IBrokerRepository <em>IBroker Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.extensionInterfaces.IBrokerRepository
		 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIBrokerRepository()
		 * @generated
		 */
		EClass IBROKER_REPOSITORY = eINSTANCE.getIBrokerRepository();

		/**
		 * The meta object literal for the '{@link brokermodel.extensionInterfaces.IBrokerRepositoryListener <em>IBroker Repository Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.extensionInterfaces.IBrokerRepositoryListener
		 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIBrokerRepositoryListener()
		 * @generated
		 */
		EClass IBROKER_REPOSITORY_LISTENER = eINSTANCE.getIBrokerRepositoryListener();

		/**
		 * The meta object literal for the '{@link brokermodel.extensionInterfaces.IProvisionResource <em>IProvision Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.extensionInterfaces.IProvisionResource
		 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIProvisionResource()
		 * @generated
		 */
		EClass IPROVISION_RESOURCE = eINSTANCE.getIProvisionResource();

		/**
		 * The meta object literal for the '{@link brokermodel.extensionInterfaces.IWorkflowEngine <em>IWorkflow Engine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.extensionInterfaces.IWorkflowEngine
		 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIWorkflowEngine()
		 * @generated
		 */
		EClass IWORKFLOW_ENGINE = eINSTANCE.getIWorkflowEngine();

		/**
		 * The meta object literal for the '{@link brokermodel.extensionInterfaces.IProvisioningJobListener <em>IProvisioning Job Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.extensionInterfaces.IProvisioningJobListener
		 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIProvisioningJobListener()
		 * @generated
		 */
		EClass IPROVISIONING_JOB_LISTENER = eINSTANCE.getIProvisioningJobListener();

		/**
		 * The meta object literal for the '{@link brokermodel.extensionInterfaces.IProvisioningJobEvent <em>IProvisioning Job Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.extensionInterfaces.IProvisioningJobEvent
		 * @see brokermodel.extensionInterfaces.impl.ExtensionInterfacesPackageImpl#getIProvisioningJobEvent()
		 * @generated
		 */
		EClass IPROVISIONING_JOB_EVENT = eINSTANCE.getIProvisioningJobEvent();

	}

} //ExtensionInterfacesPackage
