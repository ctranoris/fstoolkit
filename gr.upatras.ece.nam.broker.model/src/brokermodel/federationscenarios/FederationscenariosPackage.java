/**
 */
package brokermodel.federationscenarios;

import brokermodel.BrokermodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see brokermodel.federationscenarios.FederationscenariosFactory
 * @model kind="package"
 * @generated
 */
public interface FederationscenariosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "federationscenarios";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker/model/federationscenarios";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker.model.federationscenarios";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FederationscenariosPackage eINSTANCE = brokermodel.federationscenarios.impl.FederationscenariosPackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.RequestedFederationScenarioImpl <em>Requested Federation Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.RequestedFederationScenarioImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getRequestedFederationScenario()
	 * @generated
	 */
	int REQUESTED_FEDERATION_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Is Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__IS_SHARED = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__STATUS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VT Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__VT_CREDENTIALS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Services Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__SERVICES_REQUEST = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Infrastructure Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__INFRASTRUCTURE_REQUEST = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scheduled Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__SCHEDULED_PLAN = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__IMPORTS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO__RUNTIME_INFO = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Requested Federation Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_FEDERATION_SCENARIO_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.ServiceRequestImpl <em>Service Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.ServiceRequestImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getServiceRequest()
	 * @generated
	 */
	int SERVICE_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Ref Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__REF_SERVICE = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offered By Providers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__OFFERED_BY_PROVIDERS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Req Service Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__REQ_SERVICE_SETTINGS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Num Of Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST__NUM_OF_SERVICES = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REQUEST_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.ResourceRequestImpl <em>Resource Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.ResourceRequestImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getResourceRequest()
	 * @generated
	 */
	int RESOURCE_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUEST__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUEST__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUEST__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUEST__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Ref Offered Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUEST__REF_OFFERED_RESOURCE = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Req Resource Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUEST__REQ_RESOURCE_SETTINGS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUEST__RUNTIME_INFO = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REQUEST_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.SettingInstanceImpl <em>Setting Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.SettingInstanceImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getSettingInstance()
	 * @generated
	 */
	int SETTING_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_INSTANCE__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_INSTANCE__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_INSTANCE__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_INSTANCE__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Static Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_INSTANCE__STATIC_VALUE = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assign Setting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_INSTANCE__ASSIGN_SETTING = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Setting Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_INSTANCE_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.ServiceSettingInstanceImpl <em>Service Setting Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.ServiceSettingInstanceImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getServiceSettingInstance()
	 * @generated
	 */
	int SERVICE_SETTING_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_INSTANCE__NAME = SETTING_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_INSTANCE__ID = SETTING_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_INSTANCE__DESCRIPTION = SETTING_INSTANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_INSTANCE__UNIQUE_ID = SETTING_INSTANCE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Static Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_INSTANCE__STATIC_VALUE = SETTING_INSTANCE__STATIC_VALUE;

	/**
	 * The feature id for the '<em><b>Assign Setting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_INSTANCE__ASSIGN_SETTING = SETTING_INSTANCE__ASSIGN_SETTING;

	/**
	 * The feature id for the '<em><b>Ref Service Setting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_INSTANCE__REF_SERVICE_SETTING = SETTING_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Setting Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_INSTANCE_FEATURE_COUNT = SETTING_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.ResourceSettingInstanceImpl <em>Resource Setting Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.ResourceSettingInstanceImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getResourceSettingInstance()
	 * @generated
	 */
	int RESOURCE_SETTING_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SETTING_INSTANCE__NAME = SETTING_INSTANCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SETTING_INSTANCE__ID = SETTING_INSTANCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SETTING_INSTANCE__DESCRIPTION = SETTING_INSTANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SETTING_INSTANCE__UNIQUE_ID = SETTING_INSTANCE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Static Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SETTING_INSTANCE__STATIC_VALUE = SETTING_INSTANCE__STATIC_VALUE;

	/**
	 * The feature id for the '<em><b>Assign Setting</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SETTING_INSTANCE__ASSIGN_SETTING = SETTING_INSTANCE__ASSIGN_SETTING;

	/**
	 * The feature id for the '<em><b>Ref Resource Setting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SETTING_INSTANCE__REF_RESOURCE_SETTING = SETTING_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Setting Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SETTING_INSTANCE_FEATURE_COUNT = SETTING_INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.CredentialsImpl <em>Credentials</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.CredentialsImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getCredentials()
	 * @generated
	 */
	int CREDENTIALS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__USERNAME = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS__PASSWORD = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Credentials</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDENTIALS_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.ServicesRequestImpl <em>Services Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.ServicesRequestImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getServicesRequest()
	 * @generated
	 */
	int SERVICES_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_REQUEST__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_REQUEST__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_REQUEST__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_REQUEST__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Service Request List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_REQUEST__SERVICE_REQUEST_LIST = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Services Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_REQUEST_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.InfrastructureRequestImpl <em>Infrastructure Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.InfrastructureRequestImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getInfrastructureRequest()
	 * @generated
	 */
	int INFRASTRUCTURE_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUEST__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUEST__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUEST__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUEST__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Req Offered Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUEST__REQ_OFFERED_RESOURCES = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUEST__RESOURCE_GROUPS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Infrastructure Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_REQUEST_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.ScheduledPlanImpl <em>Scheduled Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.ScheduledPlanImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getScheduledPlan()
	 * @generated
	 */
	int SCHEDULED_PLAN = 9;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_PLAN__VALID_FROM = 0;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_PLAN__VALID_UNTIL = 1;

	/**
	 * The number of structural features of the '<em>Scheduled Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_PLAN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.ImportImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 10;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link brokermodel.federationscenarios.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.federationscenarios.impl.ResourceGroupImpl
	 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getResourceGroup()
	 * @generated
	 */
	int RESOURCE_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Grouped Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP__GROUPED_RESOURCES = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_GROUP_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.RequestedFederationScenario <em>Requested Federation Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requested Federation Scenario</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario
	 * @generated
	 */
	EClass getRequestedFederationScenario();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.RequestedFederationScenario#isIsShared <em>Is Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Shared</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario#isIsShared()
	 * @see #getRequestedFederationScenario()
	 * @generated
	 */
	EAttribute getRequestedFederationScenario_IsShared();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.RequestedFederationScenario#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario#getStatus()
	 * @see #getRequestedFederationScenario()
	 * @generated
	 */
	EAttribute getRequestedFederationScenario_Status();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.federationscenarios.RequestedFederationScenario#getVTCredentials <em>VT Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VT Credentials</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario#getVTCredentials()
	 * @see #getRequestedFederationScenario()
	 * @generated
	 */
	EReference getRequestedFederationScenario_VTCredentials();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.federationscenarios.RequestedFederationScenario#getServicesRequest <em>Services Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services Request</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario#getServicesRequest()
	 * @see #getRequestedFederationScenario()
	 * @generated
	 */
	EReference getRequestedFederationScenario_ServicesRequest();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.federationscenarios.RequestedFederationScenario#getInfrastructureRequest <em>Infrastructure Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Infrastructure Request</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario#getInfrastructureRequest()
	 * @see #getRequestedFederationScenario()
	 * @generated
	 */
	EReference getRequestedFederationScenario_InfrastructureRequest();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.federationscenarios.RequestedFederationScenario#getScheduledPlan <em>Scheduled Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduled Plan</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario#getScheduledPlan()
	 * @see #getRequestedFederationScenario()
	 * @generated
	 */
	EReference getRequestedFederationScenario_ScheduledPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.federationscenarios.RequestedFederationScenario#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario#getImports()
	 * @see #getRequestedFederationScenario()
	 * @generated
	 */
	EReference getRequestedFederationScenario_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.federationscenarios.RequestedFederationScenario#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Info</em>'.
	 * @see brokermodel.federationscenarios.RequestedFederationScenario#getRuntimeInfo()
	 * @see #getRequestedFederationScenario()
	 * @generated
	 */
	EReference getRequestedFederationScenario_RuntimeInfo();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.ServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Request</em>'.
	 * @see brokermodel.federationscenarios.ServiceRequest
	 * @generated
	 */
	EClass getServiceRequest();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.federationscenarios.ServiceRequest#getRefService <em>Ref Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Service</em>'.
	 * @see brokermodel.federationscenarios.ServiceRequest#getRefService()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EReference getServiceRequest_RefService();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.federationscenarios.ServiceRequest#getOfferedByProviders <em>Offered By Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offered By Providers</em>'.
	 * @see brokermodel.federationscenarios.ServiceRequest#getOfferedByProviders()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EReference getServiceRequest_OfferedByProviders();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.federationscenarios.ServiceRequest#getReqServiceSettings <em>Req Service Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Req Service Settings</em>'.
	 * @see brokermodel.federationscenarios.ServiceRequest#getReqServiceSettings()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EReference getServiceRequest_ReqServiceSettings();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.ServiceRequest#getNumOfServices <em>Num Of Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Services</em>'.
	 * @see brokermodel.federationscenarios.ServiceRequest#getNumOfServices()
	 * @see #getServiceRequest()
	 * @generated
	 */
	EAttribute getServiceRequest_NumOfServices();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.ResourceRequest <em>Resource Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Request</em>'.
	 * @see brokermodel.federationscenarios.ResourceRequest
	 * @generated
	 */
	EClass getResourceRequest();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.federationscenarios.ResourceRequest#getRefOfferedResource <em>Ref Offered Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Offered Resource</em>'.
	 * @see brokermodel.federationscenarios.ResourceRequest#getRefOfferedResource()
	 * @see #getResourceRequest()
	 * @generated
	 */
	EReference getResourceRequest_RefOfferedResource();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.federationscenarios.ResourceRequest#getReqResourceSettings <em>Req Resource Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Req Resource Settings</em>'.
	 * @see brokermodel.federationscenarios.ResourceRequest#getReqResourceSettings()
	 * @see #getResourceRequest()
	 * @generated
	 */
	EReference getResourceRequest_ReqResourceSettings();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.federationscenarios.ResourceRequest#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runtime Info</em>'.
	 * @see brokermodel.federationscenarios.ResourceRequest#getRuntimeInfo()
	 * @see #getResourceRequest()
	 * @generated
	 */
	EReference getResourceRequest_RuntimeInfo();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.SettingInstance <em>Setting Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting Instance</em>'.
	 * @see brokermodel.federationscenarios.SettingInstance
	 * @generated
	 */
	EClass getSettingInstance();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.SettingInstance#getStaticValue <em>Static Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Value</em>'.
	 * @see brokermodel.federationscenarios.SettingInstance#getStaticValue()
	 * @see #getSettingInstance()
	 * @generated
	 */
	EAttribute getSettingInstance_StaticValue();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.federationscenarios.SettingInstance#getAssignSetting <em>Assign Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assign Setting</em>'.
	 * @see brokermodel.federationscenarios.SettingInstance#getAssignSetting()
	 * @see #getSettingInstance()
	 * @generated
	 */
	EReference getSettingInstance_AssignSetting();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.ServiceSettingInstance <em>Service Setting Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Setting Instance</em>'.
	 * @see brokermodel.federationscenarios.ServiceSettingInstance
	 * @generated
	 */
	EClass getServiceSettingInstance();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.federationscenarios.ServiceSettingInstance#getRefServiceSetting <em>Ref Service Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Service Setting</em>'.
	 * @see brokermodel.federationscenarios.ServiceSettingInstance#getRefServiceSetting()
	 * @see #getServiceSettingInstance()
	 * @generated
	 */
	EReference getServiceSettingInstance_RefServiceSetting();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.ResourceSettingInstance <em>Resource Setting Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Setting Instance</em>'.
	 * @see brokermodel.federationscenarios.ResourceSettingInstance
	 * @generated
	 */
	EClass getResourceSettingInstance();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.federationscenarios.ResourceSettingInstance#getRefResourceSetting <em>Ref Resource Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Resource Setting</em>'.
	 * @see brokermodel.federationscenarios.ResourceSettingInstance#getRefResourceSetting()
	 * @see #getResourceSettingInstance()
	 * @generated
	 */
	EReference getResourceSettingInstance_RefResourceSetting();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.Credentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credentials</em>'.
	 * @see brokermodel.federationscenarios.Credentials
	 * @generated
	 */
	EClass getCredentials();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.Credentials#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see brokermodel.federationscenarios.Credentials#getUsername()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_Username();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.Credentials#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see brokermodel.federationscenarios.Credentials#getPassword()
	 * @see #getCredentials()
	 * @generated
	 */
	EAttribute getCredentials_Password();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.ServicesRequest <em>Services Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services Request</em>'.
	 * @see brokermodel.federationscenarios.ServicesRequest
	 * @generated
	 */
	EClass getServicesRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.federationscenarios.ServicesRequest#getServiceRequestList <em>Service Request List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Request List</em>'.
	 * @see brokermodel.federationscenarios.ServicesRequest#getServiceRequestList()
	 * @see #getServicesRequest()
	 * @generated
	 */
	EReference getServicesRequest_ServiceRequestList();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.InfrastructureRequest <em>Infrastructure Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Request</em>'.
	 * @see brokermodel.federationscenarios.InfrastructureRequest
	 * @generated
	 */
	EClass getInfrastructureRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.federationscenarios.InfrastructureRequest#getReqOfferedResources <em>Req Offered Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Req Offered Resources</em>'.
	 * @see brokermodel.federationscenarios.InfrastructureRequest#getReqOfferedResources()
	 * @see #getInfrastructureRequest()
	 * @generated
	 */
	EReference getInfrastructureRequest_ReqOfferedResources();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.federationscenarios.InfrastructureRequest#getResourceGroups <em>Resource Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Groups</em>'.
	 * @see brokermodel.federationscenarios.InfrastructureRequest#getResourceGroups()
	 * @see #getInfrastructureRequest()
	 * @generated
	 */
	EReference getInfrastructureRequest_ResourceGroups();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.ScheduledPlan <em>Scheduled Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Plan</em>'.
	 * @see brokermodel.federationscenarios.ScheduledPlan
	 * @generated
	 */
	EClass getScheduledPlan();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.ScheduledPlan#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see brokermodel.federationscenarios.ScheduledPlan#getValidFrom()
	 * @see #getScheduledPlan()
	 * @generated
	 */
	EAttribute getScheduledPlan_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.ScheduledPlan#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see brokermodel.federationscenarios.ScheduledPlan#getValidUntil()
	 * @see #getScheduledPlan()
	 * @generated
	 */
	EAttribute getScheduledPlan_ValidUntil();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see brokermodel.federationscenarios.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.federationscenarios.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see brokermodel.federationscenarios.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link brokermodel.federationscenarios.ResourceGroup <em>Resource Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Group</em>'.
	 * @see brokermodel.federationscenarios.ResourceGroup
	 * @generated
	 */
	EClass getResourceGroup();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.federationscenarios.ResourceGroup#getGroupedResources <em>Grouped Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grouped Resources</em>'.
	 * @see brokermodel.federationscenarios.ResourceGroup#getGroupedResources()
	 * @see #getResourceGroup()
	 * @generated
	 */
	EReference getResourceGroup_GroupedResources();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FederationscenariosFactory getFederationscenariosFactory();

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
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.RequestedFederationScenarioImpl <em>Requested Federation Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.RequestedFederationScenarioImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getRequestedFederationScenario()
		 * @generated
		 */
		EClass REQUESTED_FEDERATION_SCENARIO = eINSTANCE.getRequestedFederationScenario();

		/**
		 * The meta object literal for the '<em><b>Is Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTED_FEDERATION_SCENARIO__IS_SHARED = eINSTANCE.getRequestedFederationScenario_IsShared();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUESTED_FEDERATION_SCENARIO__STATUS = eINSTANCE.getRequestedFederationScenario_Status();

		/**
		 * The meta object literal for the '<em><b>VT Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTED_FEDERATION_SCENARIO__VT_CREDENTIALS = eINSTANCE.getRequestedFederationScenario_VTCredentials();

		/**
		 * The meta object literal for the '<em><b>Services Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTED_FEDERATION_SCENARIO__SERVICES_REQUEST = eINSTANCE.getRequestedFederationScenario_ServicesRequest();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTED_FEDERATION_SCENARIO__INFRASTRUCTURE_REQUEST = eINSTANCE.getRequestedFederationScenario_InfrastructureRequest();

		/**
		 * The meta object literal for the '<em><b>Scheduled Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTED_FEDERATION_SCENARIO__SCHEDULED_PLAN = eINSTANCE.getRequestedFederationScenario_ScheduledPlan();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTED_FEDERATION_SCENARIO__IMPORTS = eINSTANCE.getRequestedFederationScenario_Imports();

		/**
		 * The meta object literal for the '<em><b>Runtime Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUESTED_FEDERATION_SCENARIO__RUNTIME_INFO = eINSTANCE.getRequestedFederationScenario_RuntimeInfo();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.ServiceRequestImpl <em>Service Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.ServiceRequestImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getServiceRequest()
		 * @generated
		 */
		EClass SERVICE_REQUEST = eINSTANCE.getServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Ref Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REQUEST__REF_SERVICE = eINSTANCE.getServiceRequest_RefService();

		/**
		 * The meta object literal for the '<em><b>Offered By Providers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REQUEST__OFFERED_BY_PROVIDERS = eINSTANCE.getServiceRequest_OfferedByProviders();

		/**
		 * The meta object literal for the '<em><b>Req Service Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_REQUEST__REQ_SERVICE_SETTINGS = eINSTANCE.getServiceRequest_ReqServiceSettings();

		/**
		 * The meta object literal for the '<em><b>Num Of Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_REQUEST__NUM_OF_SERVICES = eINSTANCE.getServiceRequest_NumOfServices();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.ResourceRequestImpl <em>Resource Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.ResourceRequestImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getResourceRequest()
		 * @generated
		 */
		EClass RESOURCE_REQUEST = eINSTANCE.getResourceRequest();

		/**
		 * The meta object literal for the '<em><b>Ref Offered Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUEST__REF_OFFERED_RESOURCE = eINSTANCE.getResourceRequest_RefOfferedResource();

		/**
		 * The meta object literal for the '<em><b>Req Resource Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUEST__REQ_RESOURCE_SETTINGS = eINSTANCE.getResourceRequest_ReqResourceSettings();

		/**
		 * The meta object literal for the '<em><b>Runtime Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REQUEST__RUNTIME_INFO = eINSTANCE.getResourceRequest_RuntimeInfo();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.SettingInstanceImpl <em>Setting Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.SettingInstanceImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getSettingInstance()
		 * @generated
		 */
		EClass SETTING_INSTANCE = eINSTANCE.getSettingInstance();

		/**
		 * The meta object literal for the '<em><b>Static Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING_INSTANCE__STATIC_VALUE = eINSTANCE.getSettingInstance_StaticValue();

		/**
		 * The meta object literal for the '<em><b>Assign Setting</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTING_INSTANCE__ASSIGN_SETTING = eINSTANCE.getSettingInstance_AssignSetting();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.ServiceSettingInstanceImpl <em>Service Setting Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.ServiceSettingInstanceImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getServiceSettingInstance()
		 * @generated
		 */
		EClass SERVICE_SETTING_INSTANCE = eINSTANCE.getServiceSettingInstance();

		/**
		 * The meta object literal for the '<em><b>Ref Service Setting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SETTING_INSTANCE__REF_SERVICE_SETTING = eINSTANCE.getServiceSettingInstance_RefServiceSetting();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.ResourceSettingInstanceImpl <em>Resource Setting Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.ResourceSettingInstanceImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getResourceSettingInstance()
		 * @generated
		 */
		EClass RESOURCE_SETTING_INSTANCE = eINSTANCE.getResourceSettingInstance();

		/**
		 * The meta object literal for the '<em><b>Ref Resource Setting</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SETTING_INSTANCE__REF_RESOURCE_SETTING = eINSTANCE.getResourceSettingInstance_RefResourceSetting();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.CredentialsImpl <em>Credentials</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.CredentialsImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getCredentials()
		 * @generated
		 */
		EClass CREDENTIALS = eINSTANCE.getCredentials();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__USERNAME = eINSTANCE.getCredentials_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDENTIALS__PASSWORD = eINSTANCE.getCredentials_Password();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.ServicesRequestImpl <em>Services Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.ServicesRequestImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getServicesRequest()
		 * @generated
		 */
		EClass SERVICES_REQUEST = eINSTANCE.getServicesRequest();

		/**
		 * The meta object literal for the '<em><b>Service Request List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES_REQUEST__SERVICE_REQUEST_LIST = eINSTANCE.getServicesRequest_ServiceRequestList();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.InfrastructureRequestImpl <em>Infrastructure Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.InfrastructureRequestImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getInfrastructureRequest()
		 * @generated
		 */
		EClass INFRASTRUCTURE_REQUEST = eINSTANCE.getInfrastructureRequest();

		/**
		 * The meta object literal for the '<em><b>Req Offered Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_REQUEST__REQ_OFFERED_RESOURCES = eINSTANCE.getInfrastructureRequest_ReqOfferedResources();

		/**
		 * The meta object literal for the '<em><b>Resource Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_REQUEST__RESOURCE_GROUPS = eINSTANCE.getInfrastructureRequest_ResourceGroups();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.ScheduledPlanImpl <em>Scheduled Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.ScheduledPlanImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getScheduledPlan()
		 * @generated
		 */
		EClass SCHEDULED_PLAN = eINSTANCE.getScheduledPlan();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_PLAN__VALID_FROM = eINSTANCE.getScheduledPlan_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_PLAN__VALID_UNTIL = eINSTANCE.getScheduledPlan_ValidUntil();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.ImportImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link brokermodel.federationscenarios.impl.ResourceGroupImpl <em>Resource Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.federationscenarios.impl.ResourceGroupImpl
		 * @see brokermodel.federationscenarios.impl.FederationscenariosPackageImpl#getResourceGroup()
		 * @generated
		 */
		EClass RESOURCE_GROUP = eINSTANCE.getResourceGroup();

		/**
		 * The meta object literal for the '<em><b>Grouped Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_GROUP__GROUPED_RESOURCES = eINSTANCE.getResourceGroup_GroupedResources();

	}

} //FederationscenariosPackage
