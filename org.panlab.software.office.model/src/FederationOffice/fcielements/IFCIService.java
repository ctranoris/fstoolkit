/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package FederationOffice.fcielements;

import FederationOffice.Office;

import FederationOffice.federationscenarios.ResourceRequest;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFCI Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FederationOffice.fcielements.IFCIService#getOffice <em>Office</em>}</li>
 *   <li>{@link FederationOffice.fcielements.IFCIService#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see FederationOffice.fcielements.FcielementsPackage#getIFCIService()
 * @model
 * @generated
 */
public interface IFCIService extends EObject {
	/**
	 * Returns the value of the '<em><b>Office</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Office</em>' reference.
	 * @see #setOffice(Office)
	 * @see FederationOffice.fcielements.FcielementsPackage#getIFCIService_Office()
	 * @model
	 * @generated
	 */
	Office getOffice();

	/**
	 * Sets the value of the '{@link FederationOffice.fcielements.IFCIService#getOffice <em>Office</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Office</em>' reference.
	 * @see #getOffice()
	 * @generated
	 */
	void setOffice(Office value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #isSetInstance()
	 * @see FederationOffice.fcielements.FcielementsPackage#getIFCIService_Instance()
	 * @model unsettable="true" changeable="false"
	 * @generated
	 */
	IFCIService getInstance();

	/**
	 * Returns whether the value of the '{@link FederationOffice.fcielements.IFCIService#getInstance <em>Instance</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance</em>' reference is set.
	 * @see #getInstance()
	 * @generated
	 */
	boolean isSetInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Office getOffice(String username, String password, boolean forceRefresh);

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

} // IFCIService
