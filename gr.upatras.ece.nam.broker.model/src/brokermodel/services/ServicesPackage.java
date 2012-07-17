/**
 */
package brokermodel.services;

import brokermodel.BrokermodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see brokermodel.services.ServicesFactory
 * @model kind="package"
 * @generated
 */
public interface ServicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "services";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker/model/services";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker.model.services";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicesPackage eINSTANCE = brokermodel.services.impl.ServicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.ServiceImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Service Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_SETTINGS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REQUIRES_SERVICES = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.AbstractSettingImpl <em>Abstract Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.AbstractSettingImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getAbstractSetting()
	 * @generated
	 */
	int ABSTRACT_SETTING = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Setting Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__SETTING_TYPE = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Exposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__USER_EXPOSED = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__USER_EDITABLE = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Can Be Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__CAN_BE_PUBLISHED = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__READABLE = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__WRITABLE = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Setting Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__SETTING_CONSTRAINTS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Requires Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__REQUIRES_PARAMS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING__OPTIONAL = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Abstract Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SETTING_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.ServiceSettingImpl <em>Service Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.ServiceSettingImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getServiceSetting()
	 * @generated
	 */
	int SERVICE_SETTING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__NAME = ABSTRACT_SETTING__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__ID = ABSTRACT_SETTING__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__DESCRIPTION = ABSTRACT_SETTING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__UNIQUE_ID = ABSTRACT_SETTING__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Setting Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__SETTING_TYPE = ABSTRACT_SETTING__SETTING_TYPE;

	/**
	 * The feature id for the '<em><b>User Exposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__USER_EXPOSED = ABSTRACT_SETTING__USER_EXPOSED;

	/**
	 * The feature id for the '<em><b>User Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__USER_EDITABLE = ABSTRACT_SETTING__USER_EDITABLE;

	/**
	 * The feature id for the '<em><b>Can Be Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__CAN_BE_PUBLISHED = ABSTRACT_SETTING__CAN_BE_PUBLISHED;

	/**
	 * The feature id for the '<em><b>Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__READABLE = ABSTRACT_SETTING__READABLE;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__WRITABLE = ABSTRACT_SETTING__WRITABLE;

	/**
	 * The feature id for the '<em><b>Setting Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__SETTING_CONSTRAINTS = ABSTRACT_SETTING__SETTING_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Requires Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__REQUIRES_PARAMS = ABSTRACT_SETTING__REQUIRES_PARAMS;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__OPTIONAL = ABSTRACT_SETTING__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Mapped To Resource Settings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__MAPPED_TO_RESOURCE_SETTINGS = ABSTRACT_SETTING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided By Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING__PROVIDED_BY_RESOURCES = ABSTRACT_SETTING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SETTING_FEATURE_COUNT = ABSTRACT_SETTING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.OfferedServiceImpl <em>Offered Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.OfferedServiceImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getOfferedService()
	 * @generated
	 */
	int OFFERED_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERED_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERED_SERVICE__ID = SERVICE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERED_SERVICE__DESCRIPTION = SERVICE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERED_SERVICE__UNIQUE_ID = SERVICE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Service Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERED_SERVICE__SERVICE_SETTINGS = SERVICE__SERVICE_SETTINGS;

	/**
	 * The feature id for the '<em><b>Requires Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERED_SERVICE__REQUIRES_SERVICES = SERVICE__REQUIRES_SERVICES;

	/**
	 * The number of structural features of the '<em>Offered Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFERED_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.ServiceCompositionImpl <em>Service Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.ServiceCompositionImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getServiceComposition()
	 * @generated
	 */
	int SERVICE_COMPOSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Has Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION__HAS_SERVICES = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPOSITION_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.SettingTypeImpl <em>Setting Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.SettingTypeImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getSettingType()
	 * @generated
	 */
	int SETTING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Setting Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.brTypeStringImpl <em>br Type String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.brTypeStringImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeString()
	 * @generated
	 */
	int BR_TYPE_STRING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_STRING__NAME = SETTING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_STRING__ID = SETTING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_STRING__DESCRIPTION = SETTING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_STRING__UNIQUE_ID = SETTING_TYPE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_STRING__DEFAULT_VALUE = SETTING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>br Type String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_STRING_FEATURE_COUNT = SETTING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.brTypeEnumImpl <em>br Type Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.brTypeEnumImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeEnum()
	 * @generated
	 */
	int BR_TYPE_ENUM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM__NAME = SETTING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM__ID = SETTING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM__DESCRIPTION = SETTING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM__UNIQUE_ID = SETTING_TYPE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Tide Enumlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM__TIDE_ENUMLIST = SETTING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM__DEFAULT_VALUE = SETTING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>br Type Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM_FEATURE_COUNT = SETTING_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.brTypeListImpl <em>br Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.brTypeListImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeList()
	 * @generated
	 */
	int BR_TYPE_LIST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_LIST__NAME = SETTING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_LIST__ID = SETTING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_LIST__DESCRIPTION = SETTING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_LIST__UNIQUE_ID = SETTING_TYPE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Contains Elements Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_LIST__CONTAINS_ELEMENTS_OF = SETTING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>br Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_LIST_FEATURE_COUNT = SETTING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.brTypeEnumItemImpl <em>br Type Enum Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.brTypeEnumItemImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeEnumItem()
	 * @generated
	 */
	int BR_TYPE_ENUM_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM_ITEM__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM_ITEM__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>br Type Enum Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_ENUM_ITEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.brTypeTideElementImpl <em>br Type Tide Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.brTypeTideElementImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeTideElement()
	 * @generated
	 */
	int BR_TYPE_TIDE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_TIDE_ELEMENT__NAME = SETTING_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_TIDE_ELEMENT__ID = SETTING_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_TIDE_ELEMENT__DESCRIPTION = SETTING_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_TIDE_ELEMENT__UNIQUE_ID = SETTING_TYPE__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Of Tide Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT = SETTING_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>br Type Tide Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_TIDE_ELEMENT_FEATURE_COUNT = SETTING_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.TaxonomyImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getTaxonomy()
	 * @generated
	 */
	int TAXONOMY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Taxonomies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__TAXONOMIES = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__CATEGORIES = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__HAS_SCENARIOS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__HAS_SERVICES = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link brokermodel.services.impl.SettingConstraintImpl <em>Setting Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.impl.SettingConstraintImpl
	 * @see brokermodel.services.impl.ServicesPackageImpl#getSettingConstraint()
	 * @generated
	 */
	int SETTING_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_CONSTRAINT__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_CONSTRAINT__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_CONSTRAINT__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_CONSTRAINT__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>For Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_CONSTRAINT__FOR_OPERATION = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available After Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_CONSTRAINT__AVAILABLE_AFTER_OPERATION = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Before Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_CONSTRAINT__REQUIRED_BEFORE_OPERATION = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Setting Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_CONSTRAINT_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link brokermodel.services.ServiceResourceOperation <em>Service Resource Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.services.ServiceResourceOperation
	 * @see brokermodel.services.impl.ServicesPackageImpl#getServiceResourceOperation()
	 * @generated
	 */
	int SERVICE_RESOURCE_OPERATION = 13;


	/**
	 * Returns the meta object for class '{@link brokermodel.services.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see brokermodel.services.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.services.Service#getServiceSettings <em>Service Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Settings</em>'.
	 * @see brokermodel.services.Service#getServiceSettings()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceSettings();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.services.Service#getRequiresServices <em>Requires Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires Services</em>'.
	 * @see brokermodel.services.Service#getRequiresServices()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_RequiresServices();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.ServiceSetting <em>Service Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Setting</em>'.
	 * @see brokermodel.services.ServiceSetting
	 * @generated
	 */
	EClass getServiceSetting();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.services.ServiceSetting#getMappedToResourceSettings <em>Mapped To Resource Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapped To Resource Settings</em>'.
	 * @see brokermodel.services.ServiceSetting#getMappedToResourceSettings()
	 * @see #getServiceSetting()
	 * @generated
	 */
	EReference getServiceSetting_MappedToResourceSettings();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.services.ServiceSetting#getProvidedByResources <em>Provided By Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided By Resources</em>'.
	 * @see brokermodel.services.ServiceSetting#getProvidedByResources()
	 * @see #getServiceSetting()
	 * @generated
	 */
	EReference getServiceSetting_ProvidedByResources();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.OfferedService <em>Offered Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offered Service</em>'.
	 * @see brokermodel.services.OfferedService
	 * @generated
	 */
	EClass getOfferedService();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.ServiceComposition <em>Service Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Composition</em>'.
	 * @see brokermodel.services.ServiceComposition
	 * @generated
	 */
	EClass getServiceComposition();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.services.ServiceComposition#getHasServices <em>Has Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Services</em>'.
	 * @see brokermodel.services.ServiceComposition#getHasServices()
	 * @see #getServiceComposition()
	 * @generated
	 */
	EReference getServiceComposition_HasServices();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.SettingType <em>Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting Type</em>'.
	 * @see brokermodel.services.SettingType
	 * @generated
	 */
	EClass getSettingType();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.brTypeString <em>br Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>br Type String</em>'.
	 * @see brokermodel.services.brTypeString
	 * @generated
	 */
	EClass getbrTypeString();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.brTypeString#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see brokermodel.services.brTypeString#getDefaultValue()
	 * @see #getbrTypeString()
	 * @generated
	 */
	EAttribute getbrTypeString_DefaultValue();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.brTypeEnum <em>br Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>br Type Enum</em>'.
	 * @see brokermodel.services.brTypeEnum
	 * @generated
	 */
	EClass getbrTypeEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.services.brTypeEnum#getTideEnumlist <em>Tide Enumlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tide Enumlist</em>'.
	 * @see brokermodel.services.brTypeEnum#getTideEnumlist()
	 * @see #getbrTypeEnum()
	 * @generated
	 */
	EReference getbrTypeEnum_TideEnumlist();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.services.brTypeEnum#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see brokermodel.services.brTypeEnum#getDefaultValue()
	 * @see #getbrTypeEnum()
	 * @generated
	 */
	EReference getbrTypeEnum_DefaultValue();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.brTypeList <em>br Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>br Type List</em>'.
	 * @see brokermodel.services.brTypeList
	 * @generated
	 */
	EClass getbrTypeList();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.services.brTypeList#getContainsElementsOf <em>Contains Elements Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contains Elements Of</em>'.
	 * @see brokermodel.services.brTypeList#getContainsElementsOf()
	 * @see #getbrTypeList()
	 * @generated
	 */
	EReference getbrTypeList_ContainsElementsOf();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.brTypeEnumItem <em>br Type Enum Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>br Type Enum Item</em>'.
	 * @see brokermodel.services.brTypeEnumItem
	 * @generated
	 */
	EClass getbrTypeEnumItem();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.brTypeEnumItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see brokermodel.services.brTypeEnumItem#getValue()
	 * @see #getbrTypeEnumItem()
	 * @generated
	 */
	EAttribute getbrTypeEnumItem_Value();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.brTypeEnumItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see brokermodel.services.brTypeEnumItem#getDescription()
	 * @see #getbrTypeEnumItem()
	 * @generated
	 */
	EAttribute getbrTypeEnumItem_Description();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.brTypeTideElement <em>br Type Tide Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>br Type Tide Element</em>'.
	 * @see brokermodel.services.brTypeTideElement
	 * @generated
	 */
	EClass getbrTypeTideElement();

	/**
	 * Returns the meta object for the reference '{@link brokermodel.services.brTypeTideElement#getOfTideElement <em>Of Tide Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Of Tide Element</em>'.
	 * @see brokermodel.services.brTypeTideElement#getOfTideElement()
	 * @see #getbrTypeTideElement()
	 * @generated
	 */
	EReference getbrTypeTideElement_OfTideElement();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taxonomy</em>'.
	 * @see brokermodel.services.Taxonomy
	 * @generated
	 */
	EClass getTaxonomy();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.services.Taxonomy#getTaxonomies <em>Taxonomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taxonomies</em>'.
	 * @see brokermodel.services.Taxonomy#getTaxonomies()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Taxonomies();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.services.Taxonomy#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see brokermodel.services.Taxonomy#getCategories()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Categories();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.services.Taxonomy#getHasScenarios <em>Has Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Scenarios</em>'.
	 * @see brokermodel.services.Taxonomy#getHasScenarios()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_HasScenarios();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.services.Taxonomy#getHasServices <em>Has Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Services</em>'.
	 * @see brokermodel.services.Taxonomy#getHasServices()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_HasServices();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.AbstractSetting <em>Abstract Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Setting</em>'.
	 * @see brokermodel.services.AbstractSetting
	 * @generated
	 */
	EClass getAbstractSetting();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.services.AbstractSetting#getSettingType <em>Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setting Type</em>'.
	 * @see brokermodel.services.AbstractSetting#getSettingType()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EReference getAbstractSetting_SettingType();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.AbstractSetting#isUserExposed <em>User Exposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Exposed</em>'.
	 * @see brokermodel.services.AbstractSetting#isUserExposed()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EAttribute getAbstractSetting_UserExposed();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.AbstractSetting#isUserEditable <em>User Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Editable</em>'.
	 * @see brokermodel.services.AbstractSetting#isUserEditable()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EAttribute getAbstractSetting_UserEditable();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.AbstractSetting#isCanBePublished <em>Can Be Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Be Published</em>'.
	 * @see brokermodel.services.AbstractSetting#isCanBePublished()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EAttribute getAbstractSetting_CanBePublished();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.AbstractSetting#isReadable <em>Readable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readable</em>'.
	 * @see brokermodel.services.AbstractSetting#isReadable()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EAttribute getAbstractSetting_Readable();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.AbstractSetting#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see brokermodel.services.AbstractSetting#isWritable()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EAttribute getAbstractSetting_Writable();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.services.AbstractSetting#getSettingConstraints <em>Setting Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting Constraints</em>'.
	 * @see brokermodel.services.AbstractSetting#getSettingConstraints()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EReference getAbstractSetting_SettingConstraints();

	/**
	 * Returns the meta object for the reference list '{@link brokermodel.services.AbstractSetting#getRequiresParams <em>Requires Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires Params</em>'.
	 * @see brokermodel.services.AbstractSetting#getRequiresParams()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EReference getAbstractSetting_RequiresParams();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.AbstractSetting#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see brokermodel.services.AbstractSetting#isOptional()
	 * @see #getAbstractSetting()
	 * @generated
	 */
	EAttribute getAbstractSetting_Optional();

	/**
	 * Returns the meta object for class '{@link brokermodel.services.SettingConstraint <em>Setting Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting Constraint</em>'.
	 * @see brokermodel.services.SettingConstraint
	 * @generated
	 */
	EClass getSettingConstraint();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.SettingConstraint#getForOperation <em>For Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>For Operation</em>'.
	 * @see brokermodel.services.SettingConstraint#getForOperation()
	 * @see #getSettingConstraint()
	 * @generated
	 */
	EAttribute getSettingConstraint_ForOperation();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.SettingConstraint#isAvailableAfterOperation <em>Available After Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available After Operation</em>'.
	 * @see brokermodel.services.SettingConstraint#isAvailableAfterOperation()
	 * @see #getSettingConstraint()
	 * @generated
	 */
	EAttribute getSettingConstraint_AvailableAfterOperation();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.services.SettingConstraint#isRequiredBeforeOperation <em>Required Before Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Before Operation</em>'.
	 * @see brokermodel.services.SettingConstraint#isRequiredBeforeOperation()
	 * @see #getSettingConstraint()
	 * @generated
	 */
	EAttribute getSettingConstraint_RequiredBeforeOperation();

	/**
	 * Returns the meta object for enum '{@link brokermodel.services.ServiceResourceOperation <em>Service Resource Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Resource Operation</em>'.
	 * @see brokermodel.services.ServiceResourceOperation
	 * @generated
	 */
	EEnum getServiceResourceOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicesFactory getServicesFactory();

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
		 * The meta object literal for the '{@link brokermodel.services.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.ServiceImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_SETTINGS = eINSTANCE.getService_ServiceSettings();

		/**
		 * The meta object literal for the '<em><b>Requires Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__REQUIRES_SERVICES = eINSTANCE.getService_RequiresServices();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.ServiceSettingImpl <em>Service Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.ServiceSettingImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getServiceSetting()
		 * @generated
		 */
		EClass SERVICE_SETTING = eINSTANCE.getServiceSetting();

		/**
		 * The meta object literal for the '<em><b>Mapped To Resource Settings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SETTING__MAPPED_TO_RESOURCE_SETTINGS = eINSTANCE.getServiceSetting_MappedToResourceSettings();

		/**
		 * The meta object literal for the '<em><b>Provided By Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_SETTING__PROVIDED_BY_RESOURCES = eINSTANCE.getServiceSetting_ProvidedByResources();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.OfferedServiceImpl <em>Offered Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.OfferedServiceImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getOfferedService()
		 * @generated
		 */
		EClass OFFERED_SERVICE = eINSTANCE.getOfferedService();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.ServiceCompositionImpl <em>Service Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.ServiceCompositionImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getServiceComposition()
		 * @generated
		 */
		EClass SERVICE_COMPOSITION = eINSTANCE.getServiceComposition();

		/**
		 * The meta object literal for the '<em><b>Has Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPOSITION__HAS_SERVICES = eINSTANCE.getServiceComposition_HasServices();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.SettingTypeImpl <em>Setting Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.SettingTypeImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getSettingType()
		 * @generated
		 */
		EClass SETTING_TYPE = eINSTANCE.getSettingType();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.brTypeStringImpl <em>br Type String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.brTypeStringImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeString()
		 * @generated
		 */
		EClass BR_TYPE_STRING = eINSTANCE.getbrTypeString();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE_STRING__DEFAULT_VALUE = eINSTANCE.getbrTypeString_DefaultValue();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.brTypeEnumImpl <em>br Type Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.brTypeEnumImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeEnum()
		 * @generated
		 */
		EClass BR_TYPE_ENUM = eINSTANCE.getbrTypeEnum();

		/**
		 * The meta object literal for the '<em><b>Tide Enumlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BR_TYPE_ENUM__TIDE_ENUMLIST = eINSTANCE.getbrTypeEnum_TideEnumlist();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BR_TYPE_ENUM__DEFAULT_VALUE = eINSTANCE.getbrTypeEnum_DefaultValue();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.brTypeListImpl <em>br Type List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.brTypeListImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeList()
		 * @generated
		 */
		EClass BR_TYPE_LIST = eINSTANCE.getbrTypeList();

		/**
		 * The meta object literal for the '<em><b>Contains Elements Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BR_TYPE_LIST__CONTAINS_ELEMENTS_OF = eINSTANCE.getbrTypeList_ContainsElementsOf();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.brTypeEnumItemImpl <em>br Type Enum Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.brTypeEnumItemImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeEnumItem()
		 * @generated
		 */
		EClass BR_TYPE_ENUM_ITEM = eINSTANCE.getbrTypeEnumItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE_ENUM_ITEM__VALUE = eINSTANCE.getbrTypeEnumItem_Value();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE_ENUM_ITEM__DESCRIPTION = eINSTANCE.getbrTypeEnumItem_Description();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.brTypeTideElementImpl <em>br Type Tide Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.brTypeTideElementImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getbrTypeTideElement()
		 * @generated
		 */
		EClass BR_TYPE_TIDE_ELEMENT = eINSTANCE.getbrTypeTideElement();

		/**
		 * The meta object literal for the '<em><b>Of Tide Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BR_TYPE_TIDE_ELEMENT__OF_TIDE_ELEMENT = eINSTANCE.getbrTypeTideElement_OfTideElement();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.TaxonomyImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getTaxonomy()
		 * @generated
		 */
		EClass TAXONOMY = eINSTANCE.getTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Taxonomies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__TAXONOMIES = eINSTANCE.getTaxonomy_Taxonomies();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__CATEGORIES = eINSTANCE.getTaxonomy_Categories();

		/**
		 * The meta object literal for the '<em><b>Has Scenarios</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__HAS_SCENARIOS = eINSTANCE.getTaxonomy_HasScenarios();

		/**
		 * The meta object literal for the '<em><b>Has Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__HAS_SERVICES = eINSTANCE.getTaxonomy_HasServices();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.AbstractSettingImpl <em>Abstract Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.AbstractSettingImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getAbstractSetting()
		 * @generated
		 */
		EClass ABSTRACT_SETTING = eINSTANCE.getAbstractSetting();

		/**
		 * The meta object literal for the '<em><b>Setting Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SETTING__SETTING_TYPE = eINSTANCE.getAbstractSetting_SettingType();

		/**
		 * The meta object literal for the '<em><b>User Exposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SETTING__USER_EXPOSED = eINSTANCE.getAbstractSetting_UserExposed();

		/**
		 * The meta object literal for the '<em><b>User Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SETTING__USER_EDITABLE = eINSTANCE.getAbstractSetting_UserEditable();

		/**
		 * The meta object literal for the '<em><b>Can Be Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SETTING__CAN_BE_PUBLISHED = eINSTANCE.getAbstractSetting_CanBePublished();

		/**
		 * The meta object literal for the '<em><b>Readable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SETTING__READABLE = eINSTANCE.getAbstractSetting_Readable();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SETTING__WRITABLE = eINSTANCE.getAbstractSetting_Writable();

		/**
		 * The meta object literal for the '<em><b>Setting Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SETTING__SETTING_CONSTRAINTS = eINSTANCE.getAbstractSetting_SettingConstraints();

		/**
		 * The meta object literal for the '<em><b>Requires Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SETTING__REQUIRES_PARAMS = eINSTANCE.getAbstractSetting_RequiresParams();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SETTING__OPTIONAL = eINSTANCE.getAbstractSetting_Optional();

		/**
		 * The meta object literal for the '{@link brokermodel.services.impl.SettingConstraintImpl <em>Setting Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.impl.SettingConstraintImpl
		 * @see brokermodel.services.impl.ServicesPackageImpl#getSettingConstraint()
		 * @generated
		 */
		EClass SETTING_CONSTRAINT = eINSTANCE.getSettingConstraint();

		/**
		 * The meta object literal for the '<em><b>For Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING_CONSTRAINT__FOR_OPERATION = eINSTANCE.getSettingConstraint_ForOperation();

		/**
		 * The meta object literal for the '<em><b>Available After Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING_CONSTRAINT__AVAILABLE_AFTER_OPERATION = eINSTANCE.getSettingConstraint_AvailableAfterOperation();

		/**
		 * The meta object literal for the '<em><b>Required Before Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING_CONSTRAINT__REQUIRED_BEFORE_OPERATION = eINSTANCE.getSettingConstraint_RequiredBeforeOperation();

		/**
		 * The meta object literal for the '{@link brokermodel.services.ServiceResourceOperation <em>Service Resource Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.services.ServiceResourceOperation
		 * @see brokermodel.services.impl.ServicesPackageImpl#getServiceResourceOperation()
		 * @generated
		 */
		EEnum SERVICE_RESOURCE_OPERATION = eINSTANCE.getServiceResourceOperation();

	}

} //ServicesPackage
