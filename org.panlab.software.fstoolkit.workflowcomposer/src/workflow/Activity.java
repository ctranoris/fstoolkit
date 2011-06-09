/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workflow;

import FederationOffice.federationscenarios.ResourceRequest;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Activity#getDependsFrom <em>Depends From</em>}</li>
 *   <li>{@link workflow.Activity#getStatus <em>Status</em>}</li>
 *   <li>{@link workflow.Activity#getResourceRequest <em>Resource Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends workflowElement {
	/**
	 * Returns the value of the '<em><b>Depends From</b></em>' reference list.
	 * The list contents are of type {@link workflow.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends From</em>' reference list.
	 * @see workflow.WorkflowPackage#getActivity_DependsFrom()
	 * @model
	 * @generated
	 */
	EList<Activity> getDependsFrom();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"UNKNOWN"</code>.
	 * The literals are from the enumeration {@link workflow.TASK_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see workflow.TASK_STATUS
	 * @see #setStatus(TASK_STATUS)
	 * @see workflow.WorkflowPackage#getActivity_Status()
	 * @model default="UNKNOWN"
	 * @generated
	 */
	TASK_STATUS getStatus();

	/**
	 * Sets the value of the '{@link workflow.Activity#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see workflow.TASK_STATUS
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(TASK_STATUS value);

	/**
	 * Returns the value of the '<em><b>Resource Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Request</em>' reference.
	 * @see #setResourceRequest(ResourceRequest)
	 * @see workflow.WorkflowPackage#getActivity_ResourceRequest()
	 * @model
	 * @generated
	 */
	ResourceRequest getResourceRequest();

	/**
	 * Sets the value of the '{@link workflow.Activity#getResourceRequest <em>Resource Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Request</em>' reference.
	 * @see #getResourceRequest()
	 * @generated
	 */
	void setResourceRequest(ResourceRequest value);

} // Activity
