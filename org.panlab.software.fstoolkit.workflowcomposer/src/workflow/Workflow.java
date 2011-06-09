/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Workflow#getHasActivities <em>Has Activities</em>}</li>
 *   <li>{@link workflow.Workflow#getHasForks <em>Has Forks</em>}</li>
 *   <li>{@link workflow.Workflow#getHasJoins <em>Has Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Activities</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Activities</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getWorkflow_HasActivities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getHasActivities();

	/**
	 * Returns the value of the '<em><b>Has Forks</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Fork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Forks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Forks</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getWorkflow_HasForks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Fork> getHasForks();

	/**
	 * Returns the value of the '<em><b>Has Joins</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Join}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Joins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Joins</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getWorkflow_HasJoins()
	 * @model containment="true"
	 * @generated
	 */
	EList<Join> getHasJoins();

} // Workflow
