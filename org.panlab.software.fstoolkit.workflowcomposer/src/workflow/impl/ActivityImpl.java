/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package workflow.impl;

import FederationOffice.federationscenarios.ResourceRequest;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import workflow.Activity;
import workflow.TASK_STATUS;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.ActivityImpl#getDependsFrom <em>Depends From</em>}</li>
 *   <li>{@link workflow.impl.ActivityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link workflow.impl.ActivityImpl#getResourceRequest <em>Resource Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends workflowElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getDependsFrom() <em>Depends From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> dependsFrom;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final TASK_STATUS STATUS_EDEFAULT = TASK_STATUS.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected TASK_STATUS status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResourceRequest() <em>Resource Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRequest()
	 * @generated
	 * @ordered
	 */
	protected ResourceRequest resourceRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getDependsFrom() {
		if (dependsFrom == null) {
			dependsFrom = new EObjectResolvingEList<Activity>(Activity.class, this, WorkflowPackage.ACTIVITY__DEPENDS_FROM);
		}
		return dependsFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TASK_STATUS getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(TASK_STATUS newStatus) {
		TASK_STATUS oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequest getResourceRequest() {
		if (resourceRequest != null && resourceRequest.eIsProxy()) {
			InternalEObject oldResourceRequest = (InternalEObject)resourceRequest;
			resourceRequest = (ResourceRequest)eResolveProxy(oldResourceRequest);
			if (resourceRequest != oldResourceRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ACTIVITY__RESOURCE_REQUEST, oldResourceRequest, resourceRequest));
			}
		}
		return resourceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRequest basicGetResourceRequest() {
		return resourceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRequest(ResourceRequest newResourceRequest) {
		ResourceRequest oldResourceRequest = resourceRequest;
		resourceRequest = newResourceRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY__RESOURCE_REQUEST, oldResourceRequest, resourceRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.ACTIVITY__DEPENDS_FROM:
				return getDependsFrom();
			case WorkflowPackage.ACTIVITY__STATUS:
				return getStatus();
			case WorkflowPackage.ACTIVITY__RESOURCE_REQUEST:
				if (resolve) return getResourceRequest();
				return basicGetResourceRequest();
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
			case WorkflowPackage.ACTIVITY__DEPENDS_FROM:
				getDependsFrom().clear();
				getDependsFrom().addAll((Collection<? extends Activity>)newValue);
				return;
			case WorkflowPackage.ACTIVITY__STATUS:
				setStatus((TASK_STATUS)newValue);
				return;
			case WorkflowPackage.ACTIVITY__RESOURCE_REQUEST:
				setResourceRequest((ResourceRequest)newValue);
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
			case WorkflowPackage.ACTIVITY__DEPENDS_FROM:
				getDependsFrom().clear();
				return;
			case WorkflowPackage.ACTIVITY__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case WorkflowPackage.ACTIVITY__RESOURCE_REQUEST:
				setResourceRequest((ResourceRequest)null);
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
			case WorkflowPackage.ACTIVITY__DEPENDS_FROM:
				return dependsFrom != null && !dependsFrom.isEmpty();
			case WorkflowPackage.ACTIVITY__STATUS:
				return status != STATUS_EDEFAULT;
			case WorkflowPackage.ACTIVITY__RESOURCE_REQUEST:
				return resourceRequest != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
