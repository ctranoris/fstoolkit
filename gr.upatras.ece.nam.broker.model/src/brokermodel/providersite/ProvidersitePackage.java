/**
 */
package brokermodel.providersite;

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
 * @see brokermodel.providersite.ProvidersiteFactory
 * @model kind="package"
 * @generated
 */
public interface ProvidersitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "providersite";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker/model/providersite";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker.model.providersite";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProvidersitePackage eINSTANCE = brokermodel.providersite.impl.ProvidersitePackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.providersite.impl.DomainManagerImpl <em>Domain Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.providersite.impl.DomainManagerImpl
	 * @see brokermodel.providersite.impl.ProvidersitePackageImpl#getDomainManager()
	 * @generated
	 */
	int DOMAIN_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER__IP = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Belongs To Site</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER__BELONGS_TO_SITE = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MANAGER_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link brokermodel.providersite.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.providersite.impl.SiteImpl
	 * @see brokermodel.providersite.impl.ProvidersitePackageImpl#getSite()
	 * @generated
	 */
	int SITE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Ptm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__PTM = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Located At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__LOCATED_AT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offered Resources List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__OFFERED_RESOURCES_LIST = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Belongs To Provider</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__BELONGS_TO_PROVIDER = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link brokermodel.providersite.impl.SiteLocationImpl <em>Site Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.providersite.impl.SiteLocationImpl
	 * @see brokermodel.providersite.impl.ProvidersitePackageImpl#getSiteLocation()
	 * @generated
	 */
	int SITE_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION__NAME = BrokermodelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION__ID = BrokermodelPackage.NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION__DESCRIPTION = BrokermodelPackage.NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION__UNIQUE_ID = BrokermodelPackage.NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION__ADDRESS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geocoords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION__GEOCOORDS = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Site Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_LOCATION_FEATURE_COUNT = BrokermodelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link brokermodel.providersite.DomainManager <em>Domain Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Manager</em>'.
	 * @see brokermodel.providersite.DomainManager
	 * @generated
	 */
	EClass getDomainManager();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.providersite.DomainManager#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see brokermodel.providersite.DomainManager#getIP()
	 * @see #getDomainManager()
	 * @generated
	 */
	EAttribute getDomainManager_IP();

	/**
	 * Returns the meta object for the container reference '{@link brokermodel.providersite.DomainManager#getBelongsToSite <em>Belongs To Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To Site</em>'.
	 * @see brokermodel.providersite.DomainManager#getBelongsToSite()
	 * @see #getDomainManager()
	 * @generated
	 */
	EReference getDomainManager_BelongsToSite();

	/**
	 * Returns the meta object for class '{@link brokermodel.providersite.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see brokermodel.providersite.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.providersite.Site#getPtm <em>Ptm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ptm</em>'.
	 * @see brokermodel.providersite.Site#getPtm()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Ptm();

	/**
	 * Returns the meta object for the containment reference '{@link brokermodel.providersite.Site#getLocatedAt <em>Located At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Located At</em>'.
	 * @see brokermodel.providersite.Site#getLocatedAt()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_LocatedAt();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.providersite.Site#getOfferedResourcesList <em>Offered Resources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Resources List</em>'.
	 * @see brokermodel.providersite.Site#getOfferedResourcesList()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_OfferedResourcesList();

	/**
	 * Returns the meta object for the container reference '{@link brokermodel.providersite.Site#getBelongsToProvider <em>Belongs To Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Belongs To Provider</em>'.
	 * @see brokermodel.providersite.Site#getBelongsToProvider()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_BelongsToProvider();

	/**
	 * Returns the meta object for class '{@link brokermodel.providersite.SiteLocation <em>Site Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site Location</em>'.
	 * @see brokermodel.providersite.SiteLocation
	 * @generated
	 */
	EClass getSiteLocation();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.providersite.SiteLocation#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see brokermodel.providersite.SiteLocation#getAddress()
	 * @see #getSiteLocation()
	 * @generated
	 */
	EAttribute getSiteLocation_Address();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.providersite.SiteLocation#getGeocoords <em>Geocoords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geocoords</em>'.
	 * @see brokermodel.providersite.SiteLocation#getGeocoords()
	 * @see #getSiteLocation()
	 * @generated
	 */
	EAttribute getSiteLocation_Geocoords();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProvidersiteFactory getProvidersiteFactory();

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
		 * The meta object literal for the '{@link brokermodel.providersite.impl.DomainManagerImpl <em>Domain Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.providersite.impl.DomainManagerImpl
		 * @see brokermodel.providersite.impl.ProvidersitePackageImpl#getDomainManager()
		 * @generated
		 */
		EClass DOMAIN_MANAGER = eINSTANCE.getDomainManager();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MANAGER__IP = eINSTANCE.getDomainManager_IP();

		/**
		 * The meta object literal for the '<em><b>Belongs To Site</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MANAGER__BELONGS_TO_SITE = eINSTANCE.getDomainManager_BelongsToSite();

		/**
		 * The meta object literal for the '{@link brokermodel.providersite.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.providersite.impl.SiteImpl
		 * @see brokermodel.providersite.impl.ProvidersitePackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Ptm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__PTM = eINSTANCE.getSite_Ptm();

		/**
		 * The meta object literal for the '<em><b>Located At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__LOCATED_AT = eINSTANCE.getSite_LocatedAt();

		/**
		 * The meta object literal for the '<em><b>Offered Resources List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__OFFERED_RESOURCES_LIST = eINSTANCE.getSite_OfferedResourcesList();

		/**
		 * The meta object literal for the '<em><b>Belongs To Provider</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__BELONGS_TO_PROVIDER = eINSTANCE.getSite_BelongsToProvider();

		/**
		 * The meta object literal for the '{@link brokermodel.providersite.impl.SiteLocationImpl <em>Site Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.providersite.impl.SiteLocationImpl
		 * @see brokermodel.providersite.impl.ProvidersitePackageImpl#getSiteLocation()
		 * @generated
		 */
		EClass SITE_LOCATION = eINSTANCE.getSiteLocation();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_LOCATION__ADDRESS = eINSTANCE.getSiteLocation_Address();

		/**
		 * The meta object literal for the '<em><b>Geocoords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE_LOCATION__GEOCOORDS = eINSTANCE.getSiteLocation_Geocoords();

	}

} //ProvidersitePackage
