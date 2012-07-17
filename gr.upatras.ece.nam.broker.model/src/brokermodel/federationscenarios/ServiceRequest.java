/**
 */
package brokermodel.federationscenarios;

import brokermodel.NamedElement;

import brokermodel.services.Service;

import brokermodel.users.ResourcesProvider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.federationscenarios.ServiceRequest#getRefService <em>Ref Service</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.ServiceRequest#getOfferedByProviders <em>Offered By Providers</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.ServiceRequest#getReqServiceSettings <em>Req Service Settings</em>}</li>
 *   <li>{@link brokermodel.federationscenarios.ServiceRequest#getNumOfServices <em>Num Of Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.federationscenarios.FederationscenariosPackage#getServiceRequest()
 * @model
 * @generated
 */
public interface ServiceRequest extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ref Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Service</em>' reference.
	 * @see #setRefService(Service)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getServiceRequest_RefService()
	 * @model required="true"
	 *        extendedMetaData="namespace=''"
	 * @generated
	 */
	Service getRefService();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.ServiceRequest#getRefService <em>Ref Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Service</em>' reference.
	 * @see #getRefService()
	 * @generated
	 */
	void setRefService(Service value);

	/**
	 * Returns the value of the '<em><b>Offered By Providers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered By Providers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered By Providers</em>' reference.
	 * @see #setOfferedByProviders(ResourcesProvider)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getServiceRequest_OfferedByProviders()
	 * @model
	 * @generated
	 */
	ResourcesProvider getOfferedByProviders();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.ServiceRequest#getOfferedByProviders <em>Offered By Providers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offered By Providers</em>' reference.
	 * @see #getOfferedByProviders()
	 * @generated
	 */
	void setOfferedByProviders(ResourcesProvider value);

	/**
	 * Returns the value of the '<em><b>Req Service Settings</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.federationscenarios.ServiceSettingInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Service Settings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Service Settings</em>' containment reference list.
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getServiceRequest_ReqServiceSettings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceSettingInstance> getReqServiceSettings();

	/**
	 * Returns the value of the '<em><b>Num Of Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Services</em>' attribute.
	 * @see #setNumOfServices(int)
	 * @see brokermodel.federationscenarios.FederationscenariosPackage#getServiceRequest_NumOfServices()
	 * @model
	 * @generated
	 */
	int getNumOfServices();

	/**
	 * Sets the value of the '{@link brokermodel.federationscenarios.ServiceRequest#getNumOfServices <em>Num Of Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Services</em>' attribute.
	 * @see #getNumOfServices()
	 * @generated
	 */
	void setNumOfServices(int value);

} // ServiceRequest
