/**
 */
package brokermodel.extensionInterfaces;

import brokermodel.Broker;

import brokermodel.federationscenarios.RequestedFederationScenario;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBroker Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see brokermodel.extensionInterfaces.ExtensionInterfacesPackage#getIBrokerRepository()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBrokerRepository extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void LoadScenario(RequestedFederationScenario fedScenario);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerBrokerRepositoryListener(IBrokerRepositoryListener listener);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Broker> loadBrokers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Broker> getBrokers();

} // IBrokerRepository
