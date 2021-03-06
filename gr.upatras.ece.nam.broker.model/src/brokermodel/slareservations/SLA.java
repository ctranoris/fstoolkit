/**
 */
package brokermodel.slareservations;

import brokermodel.NamedElement;

import brokermodel.federationscenarios.RequestedFederationScenario;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SLA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link brokermodel.slareservations.SLA#getReservedRsources <em>Reserved Rsources</em>}</li>
 *   <li>{@link brokermodel.slareservations.SLA#getForVT <em>For VT</em>}</li>
 *   <li>{@link brokermodel.slareservations.SLA#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link brokermodel.slareservations.SLA#getValidUntil <em>Valid Until</em>}</li>
 * </ul>
 * </p>
 *
 * @see brokermodel.slareservations.SlareservationsPackage#getSLA()
 * @model
 * @generated
 */
public interface SLA extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Reserved Rsources</b></em>' containment reference list.
	 * The list contents are of type {@link brokermodel.slareservations.ReservedResourceContract}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved Rsources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Rsources</em>' containment reference list.
	 * @see brokermodel.slareservations.SlareservationsPackage#getSLA_ReservedRsources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReservedResourceContract> getReservedRsources();

	/**
	 * Returns the value of the '<em><b>For VT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For VT</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For VT</em>' reference.
	 * @see #setForVT(RequestedFederationScenario)
	 * @see brokermodel.slareservations.SlareservationsPackage#getSLA_ForVT()
	 * @model
	 * @generated
	 */
	RequestedFederationScenario getForVT();

	/**
	 * Sets the value of the '{@link brokermodel.slareservations.SLA#getForVT <em>For VT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For VT</em>' reference.
	 * @see #getForVT()
	 * @generated
	 */
	void setForVT(RequestedFederationScenario value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Date)
	 * @see brokermodel.slareservations.SlareservationsPackage#getSLA_ValidFrom()
	 * @model
	 * @generated
	 */
	Date getValidFrom();

	/**
	 * Sets the value of the '{@link brokermodel.slareservations.SLA#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Date value);

	/**
	 * Returns the value of the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid Until</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid Until</em>' attribute.
	 * @see #setValidUntil(Date)
	 * @see brokermodel.slareservations.SlareservationsPackage#getSLA_ValidUntil()
	 * @model
	 * @generated
	 */
	Date getValidUntil();

	/**
	 * Sets the value of the '{@link brokermodel.slareservations.SLA#getValidUntil <em>Valid Until</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid Until</em>' attribute.
	 * @see #getValidUntil()
	 * @generated
	 */
	void setValidUntil(Date value);

} // SLA
