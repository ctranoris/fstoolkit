/**
 */
package brokermodel.availabilityContract;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.availabilityContract.Cost#getPerUnit <em>Per Unit</em>}</li>
 *   <li>{@link brokermodel.availabilityContract.Cost#getAmount <em>Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getCost()
 * @model
 * @generated
 */
public interface Cost extends EObject {
	/**
	 * Returns the value of the '<em><b>Per Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link brokermodel.availabilityContract.costUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Per Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Unit</em>' attribute.
	 * @see brokermodel.availabilityContract.costUnit
	 * @see #setPerUnit(costUnit)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getCost_PerUnit()
	 * @model
	 * @generated
	 */
	costUnit getPerUnit();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Cost#getPerUnit <em>Per Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Unit</em>' attribute.
	 * @see brokermodel.availabilityContract.costUnit
	 * @see #getPerUnit()
	 * @generated
	 */
	void setPerUnit(costUnit value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(Double)
	 * @see brokermodel.availabilityContract.AvailabilityContractPackage#getCost_Amount()
	 * @model
	 * @generated
	 */
	Double getAmount();

	/**
	 * Sets the value of the '{@link brokermodel.availabilityContract.Cost#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(Double value);

} // Cost
