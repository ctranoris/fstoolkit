/**
 */
package brokermodel.providersite;

import brokermodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.providersite.DomainManager#getIP <em>IP</em>}</li>
 *   <li>{@link brokermodel.providersite.DomainManager#getBelongsToSite <em>Belongs To Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.providersite.ProvidersitePackage#getDomainManager()
 * @model
 * @generated
 */
public interface DomainManager extends NamedElement {
	/**
	 * Returns the value of the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP</em>' attribute.
	 * @see #setIP(String)
	 * @see brokermodel.providersite.ProvidersitePackage#getDomainManager_IP()
	 * @model
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link brokermodel.providersite.DomainManager#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To Site</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link brokermodel.providersite.Site#getPtm <em>Ptm</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Site</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Site</em>' container reference.
	 * @see #setBelongsToSite(Site)
	 * @see brokermodel.providersite.ProvidersitePackage#getDomainManager_BelongsToSite()
	 * @see brokermodel.providersite.Site#getPtm
	 * @model opposite="ptm" transient="false"
	 * @generated
	 */
	Site getBelongsToSite();

	/**
	 * Sets the value of the '{@link brokermodel.providersite.DomainManager#getBelongsToSite <em>Belongs To Site</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Site</em>' container reference.
	 * @see #getBelongsToSite()
	 * @generated
	 */
	void setBelongsToSite(Site value);

} // DomainManager
