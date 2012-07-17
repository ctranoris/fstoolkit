/**
 */
package brokermodel;

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
 * @see brokermodel.BrokermodelFactory
 * @model kind="package"
 * @generated
 */
public interface BrokermodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "brokermodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nam.ece.upatras.gr/broker";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gr.upatras.ece.nam.broker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BrokermodelPackage eINSTANCE = brokermodel.impl.BrokermodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link brokermodel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.impl.NamedElementImpl
	 * @see brokermodel.impl.BrokermodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__UNIQUE_ID = 3;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link brokermodel.impl.BrokerImpl <em>Broker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.impl.BrokerImpl
	 * @see brokermodel.impl.BrokermodelPackageImpl#getBroker()
	 * @generated
	 */
	int BROKER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__UNIQUE_ID = NAMED_ELEMENT__UNIQUE_ID;

	/**
	 * The feature id for the '<em><b>Registered Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__REGISTERED_USERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contributed Taxonomies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__CONTRIBUTED_TAXONOMIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offered Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__OFFERED_SERVICES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Available Federation Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__AVAILABLE_FEDERATION_SCENARIOS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Offered Service Compositions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__OFFERED_SERVICE_COMPOSITIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resource Service Contracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__RESOURCE_SERVICE_CONTRACTS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>SL As</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__SL_AS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__RESOURCE_URI = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>API Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER__API_GATEWAY = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Broker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link brokermodel.ScenarioStatus <em>Scenario Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see brokermodel.ScenarioStatus
	 * @see brokermodel.impl.BrokermodelPackageImpl#getScenarioStatus()
	 * @generated
	 */
	int SCENARIO_STATUS = 2;


	/**
	 * Returns the meta object for class '{@link brokermodel.Broker <em>Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broker</em>'.
	 * @see brokermodel.Broker
	 * @generated
	 */
	EClass getBroker();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.Broker#getRegisteredUsers <em>Registered Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registered Users</em>'.
	 * @see brokermodel.Broker#getRegisteredUsers()
	 * @see #getBroker()
	 * @generated
	 */
	EReference getBroker_RegisteredUsers();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.Broker#getContributedTaxonomies <em>Contributed Taxonomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributed Taxonomies</em>'.
	 * @see brokermodel.Broker#getContributedTaxonomies()
	 * @see #getBroker()
	 * @generated
	 */
	EReference getBroker_ContributedTaxonomies();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.Broker#getOfferedServices <em>Offered Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Services</em>'.
	 * @see brokermodel.Broker#getOfferedServices()
	 * @see #getBroker()
	 * @generated
	 */
	EReference getBroker_OfferedServices();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.Broker#getAvailableFederationScenarios <em>Available Federation Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Federation Scenarios</em>'.
	 * @see brokermodel.Broker#getAvailableFederationScenarios()
	 * @see #getBroker()
	 * @generated
	 */
	EReference getBroker_AvailableFederationScenarios();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.Broker#getOfferedServiceCompositions <em>Offered Service Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Service Compositions</em>'.
	 * @see brokermodel.Broker#getOfferedServiceCompositions()
	 * @see #getBroker()
	 * @generated
	 */
	EReference getBroker_OfferedServiceCompositions();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.Broker#getResourceServiceContracts <em>Resource Service Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Service Contracts</em>'.
	 * @see brokermodel.Broker#getResourceServiceContracts()
	 * @see #getBroker()
	 * @generated
	 */
	EReference getBroker_ResourceServiceContracts();

	/**
	 * Returns the meta object for the containment reference list '{@link brokermodel.Broker#getSLAs <em>SL As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SL As</em>'.
	 * @see brokermodel.Broker#getSLAs()
	 * @see #getBroker()
	 * @generated
	 */
	EReference getBroker_SLAs();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.Broker#getResourceURI <em>Resource URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource URI</em>'.
	 * @see brokermodel.Broker#getResourceURI()
	 * @see #getBroker()
	 * @generated
	 */
	EAttribute getBroker_ResourceURI();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.Broker#getAPIGateway <em>API Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>API Gateway</em>'.
	 * @see brokermodel.Broker#getAPIGateway()
	 * @see #getBroker()
	 * @generated
	 */
	EAttribute getBroker_APIGateway();

	/**
	 * Returns the meta object for class '{@link brokermodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see brokermodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see brokermodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.NamedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see brokermodel.NamedElement#getId()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see brokermodel.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link brokermodel.NamedElement#getUniqueID <em>Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique ID</em>'.
	 * @see brokermodel.NamedElement#getUniqueID()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_UniqueID();

	/**
	 * Returns the meta object for enum '{@link brokermodel.ScenarioStatus <em>Scenario Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scenario Status</em>'.
	 * @see brokermodel.ScenarioStatus
	 * @generated
	 */
	EEnum getScenarioStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BrokermodelFactory getBrokermodelFactory();

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
		 * The meta object literal for the '{@link brokermodel.impl.BrokerImpl <em>Broker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.impl.BrokerImpl
		 * @see brokermodel.impl.BrokermodelPackageImpl#getBroker()
		 * @generated
		 */
		EClass BROKER = eINSTANCE.getBroker();

		/**
		 * The meta object literal for the '<em><b>Registered Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER__REGISTERED_USERS = eINSTANCE.getBroker_RegisteredUsers();

		/**
		 * The meta object literal for the '<em><b>Contributed Taxonomies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER__CONTRIBUTED_TAXONOMIES = eINSTANCE.getBroker_ContributedTaxonomies();

		/**
		 * The meta object literal for the '<em><b>Offered Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER__OFFERED_SERVICES = eINSTANCE.getBroker_OfferedServices();

		/**
		 * The meta object literal for the '<em><b>Available Federation Scenarios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER__AVAILABLE_FEDERATION_SCENARIOS = eINSTANCE.getBroker_AvailableFederationScenarios();

		/**
		 * The meta object literal for the '<em><b>Offered Service Compositions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER__OFFERED_SERVICE_COMPOSITIONS = eINSTANCE.getBroker_OfferedServiceCompositions();

		/**
		 * The meta object literal for the '<em><b>Resource Service Contracts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER__RESOURCE_SERVICE_CONTRACTS = eINSTANCE.getBroker_ResourceServiceContracts();

		/**
		 * The meta object literal for the '<em><b>SL As</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROKER__SL_AS = eINSTANCE.getBroker_SLAs();

		/**
		 * The meta object literal for the '<em><b>Resource URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER__RESOURCE_URI = eINSTANCE.getBroker_ResourceURI();

		/**
		 * The meta object literal for the '<em><b>API Gateway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BROKER__API_GATEWAY = eINSTANCE.getBroker_APIGateway();

		/**
		 * The meta object literal for the '{@link brokermodel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.impl.NamedElementImpl
		 * @see brokermodel.impl.BrokermodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__ID = eINSTANCE.getNamedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '<em><b>Unique ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__UNIQUE_ID = eINSTANCE.getNamedElement_UniqueID();

		/**
		 * The meta object literal for the '{@link brokermodel.ScenarioStatus <em>Scenario Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see brokermodel.ScenarioStatus
		 * @see brokermodel.impl.BrokermodelPackageImpl#getScenarioStatus()
		 * @generated
		 */
		EEnum SCENARIO_STATUS = eINSTANCE.getScenarioStatus();

	}

} //BrokermodelPackage
