/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.officeSDL.impl;

import FederationOffice.services.OfferedService;

import gr.upatras.ece.wcl.officeSDL.Import;
import gr.upatras.ece.wcl.officeSDL.OfficeSDLPackage;
import gr.upatras.ece.wcl.officeSDL.ServiceRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.officeSDL.impl.ServiceRuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.officeSDL.impl.ServiceRuleImpl#getOfferedService <em>Offered Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceRuleImpl extends MinimalEObjectImpl.Container implements ServiceRule
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getOfferedService() <em>Offered Service</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOfferedService()
   * @generated
   * @ordered
   */
  protected OfferedService offeredService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OfficeSDLPackage.Literals.SERVICE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, OfficeSDLPackage.SERVICE_RULE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfferedService getOfferedService()
  {
    return offeredService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOfferedService(OfferedService newOfferedService, NotificationChain msgs)
  {
    OfferedService oldOfferedService = offeredService;
    offeredService = newOfferedService;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE, oldOfferedService, newOfferedService);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOfferedService(OfferedService newOfferedService)
  {
    if (newOfferedService != offeredService)
    {
      NotificationChain msgs = null;
      if (offeredService != null)
        msgs = ((InternalEObject)offeredService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE, null, msgs);
      if (newOfferedService != null)
        msgs = ((InternalEObject)newOfferedService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE, null, msgs);
      msgs = basicSetOfferedService(newOfferedService, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE, newOfferedService, newOfferedService));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OfficeSDLPackage.SERVICE_RULE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE:
        return basicSetOfferedService(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OfficeSDLPackage.SERVICE_RULE__IMPORTS:
        return getImports();
      case OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE:
        return getOfferedService();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OfficeSDLPackage.SERVICE_RULE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE:
        setOfferedService((OfferedService)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OfficeSDLPackage.SERVICE_RULE__IMPORTS:
        getImports().clear();
        return;
      case OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE:
        setOfferedService((OfferedService)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OfficeSDLPackage.SERVICE_RULE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case OfficeSDLPackage.SERVICE_RULE__OFFERED_SERVICE:
        return offeredService != null;
    }
    return super.eIsSet(featureID);
  }

} //ServiceRuleImpl
