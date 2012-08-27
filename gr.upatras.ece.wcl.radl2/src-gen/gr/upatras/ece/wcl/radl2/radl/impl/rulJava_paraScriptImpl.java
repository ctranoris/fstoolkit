/**
 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.rulJava_paraScript;
import gr.upatras.ece.wcl.radl2.radl.scriptParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rul Java para Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.rulJava_paraScriptImpl#getScriptparamValue <em>Scriptparam Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class rulJava_paraScriptImpl extends rulJava_paramImpl implements rulJava_paraScript
{
  /**
   * The cached value of the '{@link #getScriptparamValue() <em>Scriptparam Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScriptparamValue()
   * @generated
   * @ordered
   */
  protected scriptParam scriptparamValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected rulJava_paraScriptImpl()
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
    return RadlPackage.Literals.RUL_JAVA_PARA_SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam getScriptparamValue()
  {
    if (scriptparamValue != null && scriptparamValue.eIsProxy())
    {
      InternalEObject oldScriptparamValue = (InternalEObject)scriptparamValue;
      scriptparamValue = (scriptParam)eResolveProxy(oldScriptparamValue);
      if (scriptparamValue != oldScriptparamValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE, oldScriptparamValue, scriptparamValue));
      }
    }
    return scriptparamValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam basicGetScriptparamValue()
  {
    return scriptparamValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScriptparamValue(scriptParam newScriptparamValue)
  {
    scriptParam oldScriptparamValue = scriptparamValue;
    scriptparamValue = newScriptparamValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE, oldScriptparamValue, scriptparamValue));
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
      case RadlPackage.RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE:
        if (resolve) return getScriptparamValue();
        return basicGetScriptparamValue();
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
      case RadlPackage.RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE:
        setScriptparamValue((scriptParam)newValue);
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
      case RadlPackage.RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE:
        setScriptparamValue((scriptParam)null);
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
      case RadlPackage.RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE:
        return scriptparamValue != null;
    }
    return super.eIsSet(featureID);
  }

} //rulJava_paraScriptImpl
