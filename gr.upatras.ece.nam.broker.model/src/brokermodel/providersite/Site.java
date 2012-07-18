/**
 */
package brokermodel.providersite;

import brokermodel.NamedElement;

import brokermodel.resources.OfferedResource;

import brokermodel.users.ResourcesProvider;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.providersite.Site#getDomainManager <em>Domain Manager</em>}</li>
 *   <li>{@link brokermodel.providersite.Site#getLocatedAt <em>Located At</em>}</li>
 *   <li>{@link brokermodel.providersite.Site#getOfferedResourcesList <em>Offered Resources List</em>}</li>
 *   <li>{@link brokermodel.providersite.Site#getBelongsToProvider <em>Belongs To Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.providersite.ProvidersitePackage#getSite()
 * @model
 * @generated
 */
public interface Site extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Domain Manager</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link brokermodel.providersite.DomainManager#getBelongsToSite <em>Belongs To Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Manager</em>' containment reference.
	 * @see #setDomainManager(DomainManager)
	 * @see brokermodel.providersite.ProvidersitePackage#getSite_DomainManager()
	 * @see brokermodel.providersite.DomainManager#getBelongsToSite
	 * @model opposite="belongsToSite" containment="true" required="true"
	 * @generated
	 */
	DomainManager getDomainManager();

	/**
	 * Sets the value of the '{@link brokermodel.providersite.Site#getDomainManager <em>Domain Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Manager</em>' containment reference.
	 * @see #getDomainManager()
	 * @generated
	 */
	void setDomainManager(DomainManager value);

	/**
	 * Returns the value of the '<em><b>Located At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Located At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located At</em>' containment reference.
	 * @see #setLocatedAt(SiteLocation)
	 * @see brokermodel.providersite.ProvidersitePackage#getSite_LocatedAt()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SiteLocation getLocatedAt();

	/**
	 * Sets the value of the '{@link brokermodel.providersite.Site#getLocatedAt <em>Located At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located At</em>' containment reference.
	 * @see #getLocatedAt()
	 * @generated
	 */
	void setLocatedAt(SiteLocation value);

	/**
	 * Returns the value of the '<em><b>Offered Resources List</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.resources.OfferedResource}.
	 * It is bidirectional and its opposite is '{@link brokermodel.resources.OfferedResource#getBelongsToSite <em>Belongs To Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offered Resources List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Resources List</em>' containment reference list.
	 * @see brokermodel.providersite.ProvidersitePackage#getSite_OfferedResourcesList()
	 * @see brokermodel.resources.OfferedResource#getBelongsToSite
	 * @model opposite="belongsToSite" containment="true"
	 * @generated
	 */
	EList<OfferedResource> getOfferedResourcesList();

	/**
	 * Returns the value of the '<em><b>Belongs To Provider</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link brokermodel.users.ResourcesProvider#getOfferedSiteList <em>Offered Site List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Provider</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Provider</em>' container reference.
	 * @see #setBelongsToProvider(ResourcesProvider)
	 * @see brokermodel.providersite.ProvidersitePackage#getSite_BelongsToProvider()
	 * @see brokermodel.users.ResourcesProvider#getOfferedSiteList
	 * @model opposite="offeredSiteList" transient="false"
	 * @generated
	 */
	ResourcesProvider getBelongsToProvider();

	/**
	 * Sets the value of the '{@link brokermodel.providersite.Site#getBelongsToProvider <em>Belongs To Provider</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Provider</em>' container reference.
	 * @see #getBelongsToProvider()
	 * @generated
	 */
	void setBelongsToProvider(ResourcesProvider value);

} // Site
