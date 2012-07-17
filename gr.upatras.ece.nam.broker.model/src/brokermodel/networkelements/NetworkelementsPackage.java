/**
 */
package brokermodel.networkelements;

import brokermodel.BrokerPackage;

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
 * @see brokermodel.networkelements.NetworkelementsFactory
 * @model kind="package"
 * @generated
 */
public interface NetworkelementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "networkelements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker/model/networkelements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker.model.networkelements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NetworkelementsPackage eINSTANCE = brokermodel.networkelements.impl.NetworkelementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.networkelements.impl.NetworkElementImpl <em>Network Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.networkelements.impl.NetworkElementImpl
	 * @see brokermodel.networkelements.impl.NetworkelementsPackageImpl#getNetworkElement()
	 * @generated
	 */
	int NETWORK_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ELEMENT__NAME = BrokerPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ELEMENT__ID = BrokerPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ELEMENT__DESCRIPTION = BrokerPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ELEMENT__UNIQUE_ID = BrokerPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Network Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_ELEMENT_FEATURE_COUNT = BrokerPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link brokermodel.networkelements.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.networkelements.impl.DeviceImpl
	 * @see brokermodel.networkelements.impl.NetworkelementsPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = NETWORK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = NETWORK_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DESCRIPTION = NETWORK_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__UNIQUE_ID = NETWORK_ELEMENT__UNIQUE_ID;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = NETWORK_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link brokermodel.networkelements.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see brokermodel.networkelements.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for class '{@link brokermodel.networkelements.NetworkElement <em>Network Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Element</em>'.
	 * @see brokermodel.networkelements.NetworkElement
	 * @generated
	 */
	EClass getNetworkElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NetworkelementsFactory getNetworkelementsFactory();

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
		 * The meta object literal for the '{@link brokermodel.networkelements.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.networkelements.impl.DeviceImpl
		 * @see brokermodel.networkelements.impl.NetworkelementsPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '{@link brokermodel.networkelements.impl.NetworkElementImpl <em>Network Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.networkelements.impl.NetworkElementImpl
		 * @see brokermodel.networkelements.impl.NetworkelementsPackageImpl#getNetworkElement()
		 * @generated
		 */
		EClass NETWORK_ELEMENT = eINSTANCE.getNetworkElement();

	}

} //NetworkelementsPackage
