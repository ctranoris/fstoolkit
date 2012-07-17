/**
 */
package brokermodel.federationscenarios;

import brokermodel.NamedElement;
import brokermodel.ScenarioStatus;

import brokermodel.experimentRuntime.RuntimeElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requested Federation Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Just an offering of the broker. A collection of VT that  VT designers can implement but always the broker owns
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.federationscenarios.RequestedFederationScenario#isIsShared <em>Is Shared</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.RequestedFederationScenario#getStatus <em>Status</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.RequestedFederationScenario#getVTCredentials <em>VT Credentials</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.RequestedFederationScenario#getServicesRequest <em>Services Request</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.RequestedFederationScenario#getInfrastructureRequest <em>Infrastructure Request</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.RequestedFederationScenario#getScheduledPlan <em>Scheduled Plan</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.RequestedFederationScenario#getImports <em>Imports</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.RequestedFederationScenario#getRuntimeInfo <em>Runtime Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario()
 * @model
 * @generated
 */
public interface RequestedFederationScenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Shared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Shared</em>' attribute.
	 * @see #setIsShared(boolean)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario_IsShared()
	 * @model
	 * @generated
	 */
	boolean isIsShared();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.RequestedFederationScenario#isIsShared <em>Is Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Shared</em>' attribute.
	 * @see #isIsShared()
	 * @generated
	 */
	void setIsShared(boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link brokermodel.ScenarioStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see brokermodel.ScenarioStatus
	 * @see #setStatus(ScenarioStatus)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario_Status()
	 * @model
	 * @generated
	 */
	ScenarioStatus getStatus();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.RequestedFederationScenario#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see brokermodel.ScenarioStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ScenarioStatus value);

	/**
	 * Returns the value of the '<em><b>VT Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VT Credentials</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VT Credentials</em>' containment reference.
	 * @see #setVTCredentials(Credentials)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario_VTCredentials()
	 * @model containment="true"
	 * @generated
	 */
	Credentials getVTCredentials();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.RequestedFederationScenario#getVTCredentials <em>VT Credentials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VT Credentials</em>' containment reference.
	 * @see #getVTCredentials()
	 * @generated
	 */
	void setVTCredentials(Credentials value);

	/**
	 * Returns the value of the '<em><b>Services Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services Request</em>' containment reference.
	 * @see #setServicesRequest(ServicesRequest)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario_ServicesRequest()
	 * @model containment="true"
	 * @generated
	 */
	ServicesRequest getServicesRequest();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.RequestedFederationScenario#getServicesRequest <em>Services Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services Request</em>' containment reference.
	 * @see #getServicesRequest()
	 * @generated
	 */
	void setServicesRequest(ServicesRequest value);

	/**
	 * Returns the value of the '<em><b>Infrastructure Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Request</em>' containment reference.
	 * @see #setInfrastructureRequest(InfrastructureRequest)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario_InfrastructureRequest()
	 * @model containment="true"
	 * @generated
	 */
	InfrastructureRequest getInfrastructureRequest();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.RequestedFederationScenario#getInfrastructureRequest <em>Infrastructure Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infrastructure Request</em>' containment reference.
	 * @see #getInfrastructureRequest()
	 * @generated
	 */
	void setInfrastructureRequest(InfrastructureRequest value);

	/**
	 * Returns the value of the '<em><b>Scheduled Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Plan</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Plan</em>' containment reference.
	 * @see #setScheduledPlan(ScheduledPlan)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario_ScheduledPlan()
	 * @model containment="true"
	 * @generated
	 */
	ScheduledPlan getScheduledPlan();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.RequestedFederationScenario#getScheduledPlan <em>Scheduled Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Plan</em>' containment reference.
	 * @see #getScheduledPlan()
	 * @generated
	 */
	void setScheduledPlan(ScheduledPlan value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Runtime Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Info</em>' containment reference.
	 * @see #setRuntimeInfo(RuntimeElement)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getRequestedFederationScenario_RuntimeInfo()
	 * @model containment="true"
	 * @generated
	 */
	RuntimeElement getRuntimeInfo();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.RequestedFederationScenario#getRuntimeInfo <em>Runtime Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Info</em>' containment reference.
	 * @see #getRuntimeInfo()
	 * @generated
	 */
	void setRuntimeInfo(RuntimeElement value);

} // RequestedFederationScenario
