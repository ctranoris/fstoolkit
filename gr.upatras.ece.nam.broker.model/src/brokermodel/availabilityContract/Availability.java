/**
 */
package brokermodel.availabilityContract;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.availabilityContract.Availability#getFromTime <em>From Time</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.Availability#getToTime <em>To Time</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.Availability#getCost <em>Cost</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.Availability#getFromDate <em>From Date</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.Availability#getToDate <em>To Date</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.Availability#getRepeatability <em>Repeatability</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.Availability#isRepeat <em>Repeat</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.Availability#getRepeatUntil <em>Repeat Until</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability()
 * @model
 * @generated
 */
public interface Availability extends EObject {
	/**
	 * Returns the value of the '<em><b>From Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Time</em>' attribute.
	 * @see #setFromTime(Date)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability_FromTime()
	 * @model
	 * @generated
	 */
	Date getFromTime();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Availability#getFromTime <em>From Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Time</em>' attribute.
	 * @see #getFromTime()
	 * @generated
	 */
	void setFromTime(Date value);

	/**
	 * Returns the value of the '<em><b>To Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Time</em>' attribute.
	 * @see #setToTime(Date)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability_ToTime()
	 * @model
	 * @generated
	 */
	Date getToTime();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Availability#getToTime <em>To Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Time</em>' attribute.
	 * @see #getToTime()
	 * @generated
	 */
	void setToTime(Date value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference.
	 * @see #setCost(Cost)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability_Cost()
	 * @model containment="true"
	 * @generated
	 */
	Cost getCost();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Availability#getCost <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' containment reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Cost value);

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability_FromDate()
	 * @model
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Availability#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' attribute.
	 * @see #setToDate(Date)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability_ToDate()
	 * @model
	 * @generated
	 */
	Date getToDate();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Availability#getToDate <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' attribute.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(Date value);

	/**
	 * Returns the value of the '<em><b>Repeatability</b></em>' attribute.
	 * The literals are from the enumeration {@link brokermodel.availabilityContract.RepatabilityScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeatability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeatability</em>' attribute.
	 * @see brokermodel.availabilityContract.RepatabilityScheme
	 * @see #setRepeatability(RepatabilityScheme)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability_Repeatability()
	 * @model
	 * @generated
	 */
	RepatabilityScheme getRepeatability();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Availability#getRepeatability <em>Repeatability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeatability</em>' attribute.
	 * @see brokermodel.availabilityContract.RepatabilityScheme
	 * @see #getRepeatability()
	 * @generated
	 */
	void setRepeatability(RepatabilityScheme value);

	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #setRepeat(boolean)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability_Repeat()
	 * @model
	 * @generated
	 */
	boolean isRepeat();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Availability#isRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #isRepeat()
	 * @generated
	 */
	void setRepeat(boolean value);

	/**
	 * Returns the value of the '<em><b>Repeat Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Until</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Until</em>' attribute.
	 * @see #setRepeatUntil(Date)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getAvailability_RepeatUntil()
	 * @model
	 * @generated
	 */
	Date getRepeatUntil();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Availability#getRepeatUntil <em>Repeat Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Until</em>' attribute.
	 * @see #getRepeatUntil()
	 * @generated
	 */
	void setRepeatUntil(Date value);

} // Availability
