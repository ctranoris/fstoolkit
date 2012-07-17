/**
 */
package brokermodel.resources;

import brokermodel.providersite.Site;

import brokermodel.services.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offered Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.resources.OfferedResource#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link brokermodel.resources.OfferedResource#getBelongsToSite <em>Belongs To Site</em>}</li>
 *   <li>{@link brokermodel.resources.OfferedResource#getImplOfferedService <em>Impl Offered Service</em>}</li>
 *   <li>{@link brokermodel.resources.OfferedResource#getMultitonMaxOccur <em>Multiton Max Occur</em>}</li>
 *   <li>{@link brokermodel.resources.OfferedResource#getGeocoords <em>Geocoords</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.resources.ResourcesPackage#getOfferedResource()
 * @model
 * @generated
 */
public interface OfferedResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute.
	 * The default value is <code>"SINGLETON"</code>.
	 * The literals are from the enumeration {@link brokermodel.resources.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * resourceType can be SINGLETON or MULTITON
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute.
	 * @see brokermodel.resources.ResourceType
	 * @see #setResourceType(ResourceType)
	 * @see brokermodel.resources.ResourcesPackage#getOfferedResource_ResourceType()
	 * @model default="SINGLETON"
	 * @generated
	 */
	ResourceType getResourceType();

	/**
	 * Sets the value of the '{@link brokermodel.resources.OfferedResource#getResourceType <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type</em>' attribute.
	 * @see brokermodel.resources.ResourceType
	 * @see #getResourceType()
	 * @generated
	 */
	void setResourceType(ResourceType value);

	/**
	 * Returns the value of the '<em><b>Belongs To Site</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link brokermodel.providersite.Site#getOfferedResourcesList <em>Offered Resources List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Site</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Site</em>' container reference.
	 * @see #setBelongsToSite(Site)
	 * @see brokermodel.resources.ResourcesPackage#getOfferedResource_BelongsToSite()
	 * @see brokermodel.providersite.Site#getOfferedResourcesList
	 * @model opposite="offeredResourcesList" transient="false"
	 * @generated
	 */
	Site getBelongsToSite();

	/**
	 * Sets the value of the '{@link brokermodel.resources.OfferedResource#getBelongsToSite <em>Belongs To Site</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Site</em>' container reference.
	 * @see #getBelongsToSite()
	 * @generated
	 */
	void setBelongsToSite(Site value);

	/**
	 * Returns the value of the '<em><b>Impl Offered Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Offered Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Offered Service</em>' reference.
	 * @see #setImplOfferedService(Service)
	 * @see brokermodel.resources.ResourcesPackage#getOfferedResource_ImplOfferedService()
	 * @model
	 * @generated
	 */
	Service getImplOfferedService();

	/**
	 * Sets the value of the '{@link brokermodel.resources.OfferedResource#getImplOfferedService <em>Impl Offered Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Offered Service</em>' reference.
	 * @see #getImplOfferedService()
	 * @generated
	 */
	void setImplOfferedService(Service value);

	/**
	 * Returns the value of the '<em><b>Multiton Max Occur</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If MULTITON type then this value has a meaning. For example
	 * suppose that UoP has a Dynamic Resource that can offer until 20 Virtual Machines. So this Offered Resource might be instantiated until 20 times
	 * Default will be -1 which means unlimited instances
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiton Max Occur</em>' attribute.
	 * @see #setMultitonMaxOccur(int)
	 * @see brokermodel.resources.ResourcesPackage#getOfferedResource_MultitonMaxOccur()
	 * @model default="-1"
	 * @generated
	 */
	int getMultitonMaxOccur();

	/**
	 * Sets the value of the '{@link brokermodel.resources.OfferedResource#getMultitonMaxOccur <em>Multiton Max Occur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiton Max Occur</em>' attribute.
	 * @see #getMultitonMaxOccur()
	 * @generated
	 */
	void setMultitonMaxOccur(int value);

	/**
	 * Returns the value of the '<em><b>Geocoords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geocoords</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geocoords</em>' attribute.
	 * @see #setGeocoords(String)
	 * @see brokermodel.resources.ResourcesPackage#getOfferedResource_Geocoords()
	 * @model
	 * @generated
	 */
	String getGeocoords();

	/**
	 * Sets the value of the '{@link brokermodel.resources.OfferedResource#getGeocoords <em>Geocoords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geocoords</em>' attribute.
	 * @see #getGeocoords()
	 * @generated
	 */
	void setGeocoords(String value);

} // OfferedResource
