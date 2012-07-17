/**
 */
package brokermodel.experimentRuntime;

import brokermodel.federationscenarios.RequestedFederationScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Running Scenarios</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.experimentRuntime.RunningScenarios#getRequestedScenarios <em>Requested Scenarios</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.experimentRuntime.ExperimentRuntimePackage#getRunningScenarios()
 * @model
 * @generated
 */
public interface RunningScenarios extends EObject {
	/**
	 * Returns the value of the '<em><b>Requested Scenarios</b></em>' reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.RequestedFederationScenario}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requested Scenarios</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requested Scenarios</em>' reference list.
	 * @see brokermodel.experimentRuntime.ExperimentRuntimePackage#getRunningScenarios_RequestedScenarios()
	 * @model
	 * @generated
	 */
	EList<RequestedFederationScenario> getRequestedScenarios();

} // RunningScenarios
