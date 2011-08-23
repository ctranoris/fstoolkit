/**
 * <copyright>
 * </copyright>
 *

 */
package org.panlab.software.officedl2.officeDL.impl;

import FederationOffice.Office;

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

import org.panlab.software.officedl2.officeDL.ImportOffice;
import org.panlab.software.officedl2.officeDL.OfficeDLPackage;
import org.panlab.software.officedl2.officeDL.OfficeRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Office Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.panlab.software.officedl2.officeDL.impl.OfficeRuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.panlab.software.officedl2.officeDL.impl.OfficeRuleImpl#getTestbedOfficev <em>Testbed Officev</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OfficeRuleImpl extends MinimalEObjectImpl.Container implements OfficeRule
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportOffice> imports;

  /**
   * The cached value of the '{@link #getTestbedOfficev() <em>Testbed Officev</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestbedOfficev()
   * @generated
   * @ordered
   */
  protected Office testbedOfficev;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OfficeRuleImpl()
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
    return OfficeDLPackage.Literals.OFFICE_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportOffice> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportOffice>(ImportOffice.class, this, OfficeDLPackage.OFFICE_RULE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Office getTestbedOfficev()
  {
    return testbedOfficev;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestbedOfficev(Office newTestbedOfficev, NotificationChain msgs)
  {
    Office oldTestbedOfficev = testbedOfficev;
    testbedOfficev = newTestbedOfficev;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV, oldTestbedOfficev, newTestbedOfficev);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestbedOfficev(Office newTestbedOfficev)
  {
    if (newTestbedOfficev != testbedOfficev)
    {
      NotificationChain msgs = null;
      if (testbedOfficev != null)
        msgs = ((InternalEObject)testbedOfficev).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV, null, msgs);
      if (newTestbedOfficev != null)
        msgs = ((InternalEObject)newTestbedOfficev).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV, null, msgs);
      msgs = basicSetTestbedOfficev(newTestbedOfficev, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV, newTestbedOfficev, newTestbedOfficev));
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
      case OfficeDLPackage.OFFICE_RULE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV:
        return basicSetTestbedOfficev(null, msgs);
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
      case OfficeDLPackage.OFFICE_RULE__IMPORTS:
        return getImports();
      case OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV:
        return getTestbedOfficev();
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
      case OfficeDLPackage.OFFICE_RULE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportOffice>)newValue);
        return;
      case OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV:
        setTestbedOfficev((Office)newValue);
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
      case OfficeDLPackage.OFFICE_RULE__IMPORTS:
        getImports().clear();
        return;
      case OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV:
        setTestbedOfficev((Office)null);
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
      case OfficeDLPackage.OFFICE_RULE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case OfficeDLPackage.OFFICE_RULE__TESTBED_OFFICEV:
        return testbedOfficev != null;
    }
    return super.eIsSet(featureID);
  }

} //OfficeRuleImpl
