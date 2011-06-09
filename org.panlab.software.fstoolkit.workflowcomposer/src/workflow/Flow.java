/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Flow#getSource <em>Source</em>}</li>
 *   <li>{@link workflow.Flow#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends workflowElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(workflowElement)
	 * @see workflow.WorkflowPackage#getFlow_Source()
	 * @model containment="true"
	 * @generated
	 */
	workflowElement getSource();

	/**
	 * Sets the value of the '{@link workflow.Flow#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(workflowElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(workflowElement)
	 * @see workflow.WorkflowPackage#getFlow_Target()
	 * @model containment="true"
	 * @generated
	 */
	workflowElement getTarget();

	/**
	 * Sets the value of the '{@link workflow.Flow#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(workflowElement value);

} // Flow
