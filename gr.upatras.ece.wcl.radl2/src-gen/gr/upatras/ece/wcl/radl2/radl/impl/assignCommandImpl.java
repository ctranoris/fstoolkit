/**
 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.assignCommand;
import gr.upatras.ece.wcl.radl2.radl.scriptParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>assign Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.assignCommandImpl#getScriptParam <em>Script Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class assignCommandImpl extends CommandImpl implements assignCommand
{
  /**
   * The cached value of the '{@link #getScriptParam() <em>Script Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptParam()
   * @generated
   * @ordered
   */
  protected scriptParam scriptParam;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected assignCommandImpl()
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
    return RadlPackage.Literals.ASSIGN_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam getScriptParam()
  {
    if (scriptParam != null && scriptParam.eIsProxy())
    {
      InternalEObject oldScriptParam = (InternalEObject)scriptParam;
      scriptParam = (scriptParam)eResolveProxy(oldScriptParam);
      if (scriptParam != oldScriptParam)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.ASSIGN_COMMAND__SCRIPT_PARAM, oldScriptParam, scriptParam));
      }
    }
    return scriptParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam basicGetScriptParam()
  {
    return scriptParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScriptParam(scriptParam newScriptParam)
  {
    scriptParam oldScriptParam = scriptParam;
    scriptParam = newScriptParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.ASSIGN_COMMAND__SCRIPT_PARAM, oldScriptParam, scriptParam));
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
      case RadlPackage.ASSIGN_COMMAND__SCRIPT_PARAM:
        if (resolve) return getScriptParam();
        return basicGetScriptParam();
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
      case RadlPackage.ASSIGN_COMMAND__SCRIPT_PARAM:
        setScriptParam((scriptParam)newValue);
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
      case RadlPackage.ASSIGN_COMMAND__SCRIPT_PARAM:
        setScriptParam((scriptParam)null);
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
      case RadlPackage.ASSIGN_COMMAND__SCRIPT_PARAM:
        return scriptParam != null;
    }
    return super.eIsSet(featureID);
  }

} //assignCommandImpl
