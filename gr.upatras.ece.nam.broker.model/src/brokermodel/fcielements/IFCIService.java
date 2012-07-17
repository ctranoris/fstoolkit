/**
 */
package brokermodel.fcielements;

import brokermodel.Broker;

import brokermodel.federationscenarios.ResourceRequest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFCI Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.fcielements.IFCIService#getBroker <em>Broker</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.fcielements.FcielementsPackage#getIFCIService()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IFCIService extends EObject {
	/**
	 * Returns the value of the '<em><b>Broker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker</em>' reference.
	 * @see #setBroker(Broker)
	 * @see brokermodel.fcielements.FcielementsPackage#getIFCIService_Broker()
	 * @model
	 * @generated
	 */
	Broker getBroker();

	/**
	 * Sets the value of the '{@link brokermodel.fcielements.IFCIService#getBroker <em>Broker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker</em>' reference.
	 * @see #getBroker()
	 * @generated
	 */
	void setBroker(Broker value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Broker getBroker(String username, String password, boolean forceRefresh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String CreateResource(String scenario, String providerAlias, String resourceTypeName, ResourceRequest resourceReq);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String UpdateResource(String scenario, String providerAlias, String resourceTypeName, String runtimeID, ResourceRequest resourceReq);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String DeleteResource(String scenario, String providerAlias, String resourceTypeName, String runtimeID, ResourceRequest resourceReq);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getParameterValueOfResource(String scenario, String providerAlias, String runtimeID, String paramName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Broker getBroker(AuthorizationKey authorizationKey, boolean forceRefresh);

} // IFCIService
