/**
 */
package brokermodel;

import brokermodel.availabilityContract.ResourceServiceContract;

import brokermodel.federationscenarios.RequestedFederationScenario;

import brokermodel.services.OfferedService;
import brokermodel.services.ServiceComposition;
import brokermodel.services.Taxonomy;

import brokermodel.slareservations.SLA;

import brokermodel.users.BrokerUser;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Broker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class representing a resource/service broker. Usually will be a singleton class
 * It could be also from NDL: Administrative Domain, the organization that actually controls and provisions the resources, such as network resources and computing resources. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.Broker#getRegisteredUsers <em>Registered Users</em>}</li>
 *   <li>{@link brokermodel.Broker#getContributedTaxonomies <em>Contributed Taxonomies</em>}</li>
 *   <li>{@link brokermodel.Broker#getOfferedServices <em>Offered Services</em>}</li>
 *   <li>{@link brokermodel.Broker#getAvailableFederationScenarios <em>Available Federation Scenarios</em>}</li>
 *   <li>{@link brokermodel.Broker#getOfferedServiceCompositions <em>Offered Service Compositions</em>}</li>
 *   <li>{@link brokermodel.Broker#getResourceServiceContracts <em>Resource Service Contracts</em>}</li>
 *   <li>{@link brokermodel.Broker#getSLAs <em>SL As</em>}</li>
 *   <li>{@link brokermodel.Broker#getResourceURI <em>Resource URI</em>}</li>
 *   <li>{@link brokermodel.Broker#getAPIGateway <em>API Gateway</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.BrokerPackage#getBroker()
 * @model
 * @generated
 */
public interface Broker extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Registered Users</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.users.BrokerUser}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registered Users</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Users</em>' containment reference list.
	 * @see brokermodel.BrokerPackage#getBroker_RegisteredUsers()
	 * @model containment="true"
	 * @generated
	 */
	EList<BrokerUser> getRegisteredUsers();

	/**
	 * Returns the value of the '<em><b>Contributed Taxonomies</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.services.Taxonomy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributed Taxonomies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributed Taxonomies</em>' containment reference list.
	 * @see brokermodel.BrokerPackage#getBroker_ContributedTaxonomies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Taxonomy> getContributedTaxonomies();

	/**
	 * Returns the value of the '<em><b>Offered Services</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.services.OfferedService}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Services</em>' containment reference list.
	 * @see brokermodel.BrokerPackage#getBroker_OfferedServices()
	 * @model containment="true"
	 * @generated
	 */
	EList<OfferedService> getOfferedServices();

	/**
	 * Returns the value of the '<em><b>Available Federation Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.RequestedFederationScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Federation Scenarios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Federation Scenarios</em>' containment reference list.
	 * @see brokermodel.BrokerPackage#getBroker_AvailableFederationScenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequestedFederationScenario> getAvailableFederationScenarios();

	/**
	 * Returns the value of the '<em><b>Offered Service Compositions</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.services.ServiceComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Service Compositions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Service Compositions</em>' containment reference list.
	 * @see brokermodel.BrokerPackage#getBroker_OfferedServiceCompositions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceComposition> getOfferedServiceCompositions();

	/**
	 * Returns the value of the '<em><b>Resource Service Contracts</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.availabilityContract.ResourceServiceContract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Service Contracts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Service Contracts</em>' containment reference list.
	 * @see brokermodel.BrokerPackage#getBroker_ResourceServiceContracts()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceServiceContract> getResourceServiceContracts();

	/**
	 * Returns the value of the '<em><b>SL As</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.slareservations.SLA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SL As</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SL As</em>' containment reference list.
	 * @see brokermodel.BrokerPackage#getBroker_SLAs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SLA> getSLAs();

	/**
	 * Returns the value of the '<em><b>Resource URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource URI</em>' attribute.
	 * @see #setResourceURI(String)
	 * @see brokermodel.BrokerPackage#getBroker_ResourceURI()
	 * @model
	 * @generated
	 */
	String getResourceURI();

	/**
	 * Sets the value of the '{@link brokermodel.Broker#getResourceURI <em>Resource URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource URI</em>' attribute.
	 * @see #getResourceURI()
	 * @generated
	 */
	void setResourceURI(String value);

	/**
	 * Returns the value of the '<em><b>API Gateway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>API Gateway</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>API Gateway</em>' attribute.
	 * @see #setAPIGateway(String)
	 * @see brokermodel.BrokerPackage#getBroker_APIGateway()
	 * @model
	 * @generated
	 */
	String getAPIGateway();

	/**
	 * Sets the value of the '{@link brokermodel.Broker#getAPIGateway <em>API Gateway</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>API Gateway</em>' attribute.
	 * @see #getAPIGateway()
	 * @generated
	 */
	void setAPIGateway(String value);

} // Broker
