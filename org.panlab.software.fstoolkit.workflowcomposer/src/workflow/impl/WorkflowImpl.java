/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.Activity;
import workflow.Fork;
import workflow.Join;
import workflow.Workflow;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.WorkflowImpl#getHasActivities <em>Has Activities</em>}</li>
 *   <li>{@link workflow.impl.WorkflowImpl#getHasForks <em>Has Forks</em>}</li>
 *   <li>{@link workflow.impl.WorkflowImpl#getHasJoins <em>Has Joins</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends EObjectImpl implements Workflow {
	/**
	 * The cached value of the '{@link #getHasActivities() <em>Has Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> hasActivities;

	/**
	 * The cached value of the '{@link #getHasForks() <em>Has Forks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForks()
	 * @generated
	 * @ordered
	 */
	protected EList<Fork> hasForks;

	/**
	 * The cached value of the '{@link #getHasJoins() <em>Has Joins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJoins()
	 * @generated
	 * @ordered
	 */
	protected EList<Join> hasJoins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getHasActivities() {
		if (hasActivities == null) {
			hasActivities = new EObjectContainmentEList<Activity>(Activity.class, this, WorkflowPackage.WORKFLOW__HAS_ACTIVITIES);
		}
		return hasActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Fork> getHasForks() {
		if (hasForks == null) {
			hasForks = new EObjectContainmentEList<Fork>(Fork.class, this, WorkflowPackage.WORKFLOW__HAS_FORKS);
		}
		return hasForks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Join> getHasJoins() {
		if (hasJoins == null) {
			hasJoins = new EObjectContainmentEList<Join>(Join.class, this, WorkflowPackage.WORKFLOW__HAS_JOINS);
		}
		return hasJoins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__HAS_ACTIVITIES:
				return ((InternalEList<?>)getHasActivities()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW__HAS_FORKS:
				return ((InternalEList<?>)getHasForks()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW__HAS_JOINS:
				return ((InternalEList<?>)getHasJoins()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__HAS_ACTIVITIES:
				return getHasActivities();
			case WorkflowPackage.WORKFLOW__HAS_FORKS:
				return getHasForks();
			case WorkflowPackage.WORKFLOW__HAS_JOINS:
				return getHasJoins();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__HAS_ACTIVITIES:
				getHasActivities().clear();
				getHasActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case WorkflowPackage.WORKFLOW__HAS_FORKS:
				getHasForks().clear();
				getHasForks().addAll((Collection<? extends Fork>)newValue);
				return;
			case WorkflowPackage.WORKFLOW__HAS_JOINS:
				getHasJoins().clear();
				getHasJoins().addAll((Collection<? extends Join>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__HAS_ACTIVITIES:
				getHasActivities().clear();
				return;
			case WorkflowPackage.WORKFLOW__HAS_FORKS:
				getHasForks().clear();
				return;
			case WorkflowPackage.WORKFLOW__HAS_JOINS:
				getHasJoins().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowPackage.WORKFLOW__HAS_ACTIVITIES:
				return hasActivities != null && !hasActivities.isEmpty();
			case WorkflowPackage.WORKFLOW__HAS_FORKS:
				return hasForks != null && !hasForks.isEmpty();
			case WorkflowPackage.WORKFLOW__HAS_JOINS:
				return hasJoins != null && !hasJoins.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowImpl
