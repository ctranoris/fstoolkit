/**
 */
package brokermodel.users;

import brokermodel.BrokerPackage;

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
 * @see brokermodel.users.UsersFactory
 * @model kind="package"
 * @generated
 */
public interface UsersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "users";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker/model/users";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker.model.users";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsersPackage eINSTANCE = brokermodel.users.impl.UsersPackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.users.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.users.impl.AccountImpl
	 * @see brokermodel.users.impl.UsersPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = BrokerPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ID = BrokerPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__DESCRIPTION = BrokerPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__UNIQUE_ID = BrokerPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PASSWORD = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__USERNAME = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authorization Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__AUTHORIZATION_KEY = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link brokermodel.users.impl.BrokerUserImpl <em>Broker User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.users.impl.BrokerUserImpl
	 * @see brokermodel.users.impl.UsersPackageImpl#getBrokerUser()
	 * @generated
	 */
	int BROKER_USER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER__NAME = BrokerPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER__ID = BrokerPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER__DESCRIPTION = BrokerPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER__UNIQUE_ID = BrokerPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Has Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER__HAS_ACCOUNT = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER__ORGANIZATION = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER__ADDRESS = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER__TELEPHONE = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Broker User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_USER_FEATURE_COUNT = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link brokermodel.users.impl.ResourcesProviderImpl <em>Resources Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.users.impl.ResourcesProviderImpl
	 * @see brokermodel.users.impl.UsersPackageImpl#getResourcesProvider()
	 * @generated
	 */
	int RESOURCES_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__NAME = BROKER_USER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__ID = BROKER_USER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__DESCRIPTION = BROKER_USER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__UNIQUE_ID = BROKER_USER__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Has Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__HAS_ACCOUNT = BROKER_USER__HAS_ACCOUNT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__ORGANIZATION = BROKER_USER__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__ADDRESS = BROKER_USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__TELEPHONE = BROKER_USER__TELEPHONE;

	/**
	 * The feature id for the '<em><b>Offered Site List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER__OFFERED_SITE_LIST = BROKER_USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resources Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_PROVIDER_FEATURE_COUNT = BROKER_USER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.users.impl.TestbedDesignerImpl <em>Testbed Designer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.users.impl.TestbedDesignerImpl
	 * @see brokermodel.users.impl.UsersPackageImpl#getTestbedDesigner()
	 * @generated
	 */
	int TESTBED_DESIGNER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__NAME = BROKER_USER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__ID = BROKER_USER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__DESCRIPTION = BROKER_USER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__UNIQUE_ID = BROKER_USER__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Has Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__HAS_ACCOUNT = BROKER_USER__HAS_ACCOUNT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__ORGANIZATION = BROKER_USER__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__ADDRESS = BROKER_USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__TELEPHONE = BROKER_USER__TELEPHONE;

	/**
	 * The feature id for the '<em><b>Designs Virtual Testbeds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER__DESIGNS_VIRTUAL_TESTBEDS = BROKER_USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Testbed Designer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTBED_DESIGNER_FEATURE_COUNT = BROKER_USER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.users.impl.BrokerPersonelImpl <em>Broker Personel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.users.impl.BrokerPersonelImpl
	 * @see brokermodel.users.impl.UsersPackageImpl#getBrokerPersonel()
	 * @generated
	 */
	int BROKER_PERSONEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL__NAME = BROKER_USER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL__ID = BROKER_USER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL__DESCRIPTION = BROKER_USER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL__UNIQUE_ID = BROKER_USER__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Has Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL__HAS_ACCOUNT = BROKER_USER__HAS_ACCOUNT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL__ORGANIZATION = BROKER_USER__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL__ADDRESS = BROKER_USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL__TELEPHONE = BROKER_USER__TELEPHONE;

	/**
	 * The number of structural features of the '<em>Broker Personel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_PERSONEL_FEATURE_COUNT = BROKER_USER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link brokermodel.users.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.users.impl.AdminImpl
	 * @see brokermodel.users.impl.UsersPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__NAME = BROKER_PERSONEL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ID = BROKER_PERSONEL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__DESCRIPTION = BROKER_PERSONEL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__UNIQUE_ID = BROKER_PERSONEL__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Has Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__HAS_ACCOUNT = BROKER_PERSONEL__HAS_ACCOUNT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ORGANIZATION = BROKER_PERSONEL__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ADDRESS = BROKER_PERSONEL__ADDRESS;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__TELEPHONE = BROKER_PERSONEL__TELEPHONE;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = BROKER_PERSONEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link brokermodel.users.impl.BrokerCustomerImpl <em>Broker Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.users.impl.BrokerCustomerImpl
	 * @see brokermodel.users.impl.UsersPackageImpl#getBrokerCustomer()
	 * @generated
	 */
	int BROKER_CUSTOMER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__NAME = BROKER_USER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__ID = BROKER_USER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__DESCRIPTION = BROKER_USER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__UNIQUE_ID = BROKER_USER__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Has Account</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__HAS_ACCOUNT = BROKER_USER__HAS_ACCOUNT;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__ORGANIZATION = BROKER_USER__ORGANIZATION;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__ADDRESS = BROKER_USER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__TELEPHONE = BROKER_USER__TELEPHONE;

	/**
	 * The feature id for the '<em><b>Utilizes Virtual Testbed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__UTILIZES_VIRTUAL_TESTBED = BROKER_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Testbed Designer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER__HAS_TESTBED_DESIGNER = BROKER_USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Broker Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_CUSTOMER_FEATURE_COUNT = BROKER_USER_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link brokermodel.users.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see brokermodel.users.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.users.Account#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see brokermodel.users.Account#getPassword()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Password();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.users.Account#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see brokermodel.users.Account#getUsername()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Username();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.users.Account#getAuthorizationKey <em>Authorization Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorization Key</em>'.
	 * @see brokermodel.users.Account#getAuthorizationKey()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_AuthorizationKey();

	/**
	 * Returns the meta object for class '{@link brokermodel.users.ResourcesProvider <em>Resources Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources Provider</em>'.
	 * @see brokermodel.users.ResourcesProvider
	 * @generated
	 */
	EClass getResourcesProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.users.ResourcesProvider#getOfferedSiteList <em>Offered Site List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Site List</em>'.
	 * @see brokermodel.users.ResourcesProvider#getOfferedSiteList()
	 * @see #getResourcesProvider()
	 * @generated
	 */
	EReference getResourcesProvider_OfferedSiteList();

	/**
	 * Returns the meta object for class '{@link brokermodel.users.TestbedDesigner <em>Testbed Designer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testbed Designer</em>'.
	 * @see brokermodel.users.TestbedDesigner
	 * @generated
	 */
	EClass getTestbedDesigner();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.users.TestbedDesigner#getDesignsVirtualTestbeds <em>Designs Virtual Testbeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Designs Virtual Testbeds</em>'.
	 * @see brokermodel.users.TestbedDesigner#getDesignsVirtualTestbeds()
	 * @see #getTestbedDesigner()
	 * @generated
	 */
	EReference getTestbedDesigner_DesignsVirtualTestbeds();

	/**
	 * Returns the meta object for class '{@link brokermodel.users.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see brokermodel.users.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for class '{@link brokermodel.users.BrokerCustomer <em>Broker Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broker Customer</em>'.
	 * @see brokermodel.users.BrokerCustomer
	 * @generated
	 */
	EClass getBrokerCustomer();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.users.BrokerCustomer#getUtilizesVirtualTestbed <em>Utilizes Virtual Testbed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Utilizes Virtual Testbed</em>'.
	 * @see brokermodel.users.BrokerCustomer#getUtilizesVirtualTestbed()
	 * @see #getBrokerCustomer()
	 * @generated
	 */
	EReference getBrokerCustomer_UtilizesVirtualTestbed();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.users.BrokerCustomer#getHasTestbedDesigner <em>Has Testbed Designer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Testbed Designer</em>'.
	 * @see brokermodel.users.BrokerCustomer#getHasTestbedDesigner()
	 * @see #getBrokerCustomer()
	 * @generated
	 */
	EReference getBrokerCustomer_HasTestbedDesigner();

	/**
	 * Returns the meta object for class '{@link brokermodel.users.BrokerUser <em>Broker User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broker User</em>'.
	 * @see brokermodel.users.BrokerUser
	 * @generated
	 */
	EClass getBrokerUser();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.users.BrokerUser#getHasAccount <em>Has Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Account</em>'.
	 * @see brokermodel.users.BrokerUser#getHasAccount()
	 * @see #getBrokerUser()
	 * @generated
	 */
	EReference getBrokerUser_HasAccount();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.users.BrokerUser#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see brokermodel.users.BrokerUser#getOrganization()
	 * @see #getBrokerUser()
	 * @generated
	 */
	EAttribute getBrokerUser_Organization();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.users.BrokerUser#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see brokermodel.users.BrokerUser#getAddress()
	 * @see #getBrokerUser()
	 * @generated
	 */
	EAttribute getBrokerUser_Address();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.users.BrokerUser#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see brokermodel.users.BrokerUser#getTelephone()
	 * @see #getBrokerUser()
	 * @generated
	 */
	EAttribute getBrokerUser_Telephone();

	/**
	 * Returns the meta object for class '{@link brokermodel.users.BrokerPersonel <em>Broker Personel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broker Personel</em>'.
	 * @see brokermodel.users.BrokerPersonel
	 * @generated
	 */
	EClass getBrokerPersonel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsersFactory getUsersFactory();

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
		 * The meta object literal for the '{@link brokermodel.users.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.users.impl.AccountImpl
		 * @see brokermodel.users.impl.UsersPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PASSWORD = eINSTANCE.getAccount_Password();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__USERNAME = eINSTANCE.getAccount_Username();

		/**
		 * The meta object literal for the '<em><b>Authorization Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__AUTHORIZATION_KEY = eINSTANCE.getAccount_AuthorizationKey();

		/**
		 * The meta object literal for the '{@link brokermodel.users.impl.ResourcesProviderImpl <em>Resources Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.users.impl.ResourcesProviderImpl
		 * @see brokermodel.users.impl.UsersPackageImpl#getResourcesProvider()
		 * @generated
		 */
		EClass RESOURCES_PROVIDER = eINSTANCE.getResourcesProvider();

		/**
		 * The meta object literal for the '<em><b>Offered Site List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES_PROVIDER__OFFERED_SITE_LIST = eINSTANCE.getResourcesProvider_OfferedSiteList();

		/**
		 * The meta object literal for the '{@link brokermodel.users.impl.TestbedDesignerImpl <em>Testbed Designer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.users.impl.TestbedDesignerImpl
		 * @see brokermodel.users.impl.UsersPackageImpl#getTestbedDesigner()
		 * @generated
		 */
		EClass TESTBED_DESIGNER = eINSTANCE.getTestbedDesigner();

		/**
		 * The meta object literal for the '<em><b>Designs Virtual Testbeds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTBED_DESIGNER__DESIGNS_VIRTUAL_TESTBEDS = eINSTANCE.getTestbedDesigner_DesignsVirtualTestbeds();

		/**
		 * The meta object literal for the '{@link brokermodel.users.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.users.impl.AdminImpl
		 * @see brokermodel.users.impl.UsersPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '{@link brokermodel.users.impl.BrokerCustomerImpl <em>Broker Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.users.impl.BrokerCustomerImpl
		 * @see brokermodel.users.impl.UsersPackageImpl#getBrokerCustomer()
		 * @generated
		 */
		EClass BROKER_CUSTOMER = eINSTANCE.getBrokerCustomer();

		/**
		 * The meta object literal for the '<em><b>Utilizes Virtual Testbed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER_CUSTOMER__UTILIZES_VIRTUAL_TESTBED = eINSTANCE.getBrokerCustomer_UtilizesVirtualTestbed();

		/**
		 * The meta object literal for the '<em><b>Has Testbed Designer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER_CUSTOMER__HAS_TESTBED_DESIGNER = eINSTANCE.getBrokerCustomer_HasTestbedDesigner();

		/**
		 * The meta object literal for the '{@link brokermodel.users.impl.BrokerUserImpl <em>Broker User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.users.impl.BrokerUserImpl
		 * @see brokermodel.users.impl.UsersPackageImpl#getBrokerUser()
		 * @generated
		 */
		EClass BROKER_USER = eINSTANCE.getBrokerUser();

		/**
		 * The meta object literal for the '<em><b>Has Account</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER_USER__HAS_ACCOUNT = eINSTANCE.getBrokerUser_HasAccount();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_USER__ORGANIZATION = eINSTANCE.getBrokerUser_Organization();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_USER__ADDRESS = eINSTANCE.getBrokerUser_Address();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER_USER__TELEPHONE = eINSTANCE.getBrokerUser_Telephone();

		/**
		 * The meta object literal for the '{@link brokermodel.users.impl.BrokerPersonelImpl <em>Broker Personel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.users.impl.BrokerPersonelImpl
		 * @see brokermodel.users.impl.UsersPackageImpl#getBrokerPersonel()
		 * @generated
		 */
		EClass BROKER_PERSONEL = eINSTANCE.getBrokerPersonel();

	}

} //UsersPackage
