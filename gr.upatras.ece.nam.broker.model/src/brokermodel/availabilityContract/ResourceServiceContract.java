/**
 */
package brokermodel.availabilityContract;

import brokermodel.NamedElement;

import brokermodel.resources.OfferedResource;

import brokermodel.services.Service;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Service Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.availabilityContract.ResourceServiceContract#getForOfferedService <em>For Offered Service</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.ResourceServiceContract#getForOfferedResource <em>For Offered Resource</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.ResourceServiceContract#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.ResourceServiceContract#getEndDate <em>End Date</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.ResourceServiceContract#getAvailability <em>Availability</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getResourceServiceContract()
 * @model
 * @generated
 */
public interface ResourceServiceContract extends NamedElement {
	/**
	 * Returns the value of the '<em><b>For Offered Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Offered Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Offered Service</em>' reference.
	 * @see #setForOfferedService(Service)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getResourceServiceContract_ForOfferedService()
	 * @model required="true"
	 * @generated
	 */
	Service getForOfferedService();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.ResourceServiceContract#getForOfferedService <em>For Offered Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Offered Service</em>' reference.
	 * @see #getForOfferedService()
	 * @generated
	 */
	void setForOfferedService(Service value);

	/**
	 * Returns the value of the '<em><b>For Offered Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Offered Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Offered Resource</em>' reference.
	 * @see #setForOfferedResource(OfferedResource)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getResourceServiceContract_ForOfferedResource()
	 * @model required="true"
	 * @generated
	 */
	OfferedResource getForOfferedResource();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.ResourceServiceContract#getForOfferedResource <em>For Offered Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Offered Resource</em>' reference.
	 * @see #getForOfferedResource()
	 * @generated
	 */
	void setForOfferedResource(OfferedResource value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getResourceServiceContract_StartDate()
	 * @model required="true"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.ResourceServiceContract#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getResourceServiceContract_EndDate()
	 * @model required="true"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.ResourceServiceContract#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' containment reference.
	 * @see #setAvailability(Availability)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getResourceServiceContract_Availability()
	 * @model containment="true"
	 * @generated
	 */
	Availability getAvailability();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.ResourceServiceContract#getAvailability <em>Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' containment reference.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Availability value);

} // ResourceServiceContract
