/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl.impl;

import FederationOffice.services.ServiceSetting;

import gr.upatras.ece.wcl.radl.ConfigurationParam;
import gr.upatras.ece.wcl.radl.RadlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.ConfigurationParamImpl#getServsetting <em>Servsetting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationParamImpl extends scriptParamImpl implements ConfigurationParam
{
  /**
   * The cached value of the '{@link #getServsetting() <em>Servsetting</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServsetting()
   * @generated
   * @ordered
   */
  protected ServiceSetting servsetting;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationParamImpl()
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
    return RadlPackage.Literals.CONFIGURATION_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceSetting getServsetting()
  {
    if (servsetting != null && servsetting.eIsProxy())
    {
      InternalEObject oldServsetting = (InternalEObject)servsetting;
      servsetting = (ServiceSetting)eResolveProxy(oldServsetting);
      if (servsetting != oldServsetting)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.CONFIGURATION_PARAM__SERVSETTING, oldServsetting, servsetting));
      }
    }
    return servsetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceSetting basicGetServsetting()
  {
    return servsetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServsetting(ServiceSetting newServsetting)
  {
    ServiceSetting oldServsetting = servsetting;
    servsetting = newServsetting;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.CONFIGURATION_PARAM__SERVSETTING, oldServsetting, servsetting));
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
      case RadlPackage.CONFIGURATION_PARAM__SERVSETTING:
        if (resolve) return getServsetting();
        return basicGetServsetting();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RadlPackage.CONFIGURATION_PARAM__SERVSETTING:
        setServsetting((ServiceSetting)newValue);
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
      case RadlPackage.CONFIGURATION_PARAM__SERVSETTING:
        setServsetting((ServiceSetting)null);
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
      case RadlPackage.CONFIGURATION_PARAM__SERVSETTING:
        return servsetting != null;
    }
    return super.eIsSet(featureID);
  }

} //ConfigurationParamImpl
