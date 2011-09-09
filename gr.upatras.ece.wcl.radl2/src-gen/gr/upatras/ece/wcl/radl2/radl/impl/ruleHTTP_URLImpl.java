/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.ruleHTTP_URL;
import gr.upatras.ece.wcl.radl2.radl.scriptParam;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rule HTTP URL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTP_URLImpl#getRemoteURL <em>Remote URL</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTP_URLImpl#getScriptparams <em>Scriptparams</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ruleHTTP_URLImpl extends MinimalEObjectImpl.Container implements ruleHTTP_URL
{
  /**
   * The default value of the '{@link #getRemoteURL() <em>Remote URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteURL()
   * @generated
   * @ordered
   */
  protected static final String REMOTE_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemoteURL() <em>Remote URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteURL()
   * @generated
   * @ordered
   */
  protected String remoteURL = REMOTE_URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getScriptparams() <em>Scriptparams</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptparams()
   * @generated
   * @ordered
   */
  protected EList<scriptParam> scriptparams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ruleHTTP_URLImpl()
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
    return RadlPackage.Literals.RULE_HTTP_URL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRemoteURL()
  {
    return remoteURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoteURL(String newRemoteURL)
  {
    String oldRemoteURL = remoteURL;
    remoteURL = newRemoteURL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_HTTP_URL__REMOTE_URL, oldRemoteURL, remoteURL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<scriptParam> getScriptparams()
  {
    if (scriptparams == null)
    {
      scriptparams = new EObjectResolvingEList<scriptParam>(scriptParam.class, this, RadlPackage.RULE_HTTP_URL__SCRIPTPARAMS);
    }
    return scriptparams;
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
      case RadlPackage.RULE_HTTP_URL__REMOTE_URL:
        return getRemoteURL();
      case RadlPackage.RULE_HTTP_URL__SCRIPTPARAMS:
        return getScriptparams();
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
      case RadlPackage.RULE_HTTP_URL__REMOTE_URL:
        setRemoteURL((String)newValue);
        return;
      case RadlPackage.RULE_HTTP_URL__SCRIPTPARAMS:
        getScriptparams().clear();
        getScriptparams().addAll((Collection<? extends scriptParam>)newValue);
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
      case RadlPackage.RULE_HTTP_URL__REMOTE_URL:
        setRemoteURL(REMOTE_URL_EDEFAULT);
        return;
      case RadlPackage.RULE_HTTP_URL__SCRIPTPARAMS:
        getScriptparams().clear();
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
      case RadlPackage.RULE_HTTP_URL__REMOTE_URL:
        return REMOTE_URL_EDEFAULT == null ? remoteURL != null : !REMOTE_URL_EDEFAULT.equals(remoteURL);
      case RadlPackage.RULE_HTTP_URL__SCRIPTPARAMS:
        return scriptparams != null && !scriptparams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (remoteURL: ");
    result.append(remoteURL);
    result.append(')');
    return result.toString();
  }

} //ruleHTTP_URLImpl
