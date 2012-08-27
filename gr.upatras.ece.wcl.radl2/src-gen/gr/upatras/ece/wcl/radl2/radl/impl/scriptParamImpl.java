/**
 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.ParameterType;
import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.scriptParam;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>script Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.scriptParamImpl#getParamType <em>Param Type</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.scriptParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.scriptParamImpl#getDefValue <em>Def Value</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.scriptParamImpl#getDescriptionValue <em>Description Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class scriptParamImpl extends MinimalEObjectImpl.Container implements scriptParam
{
  /**
   * The cached value of the '{@link #getParamType() <em>Param Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamType()
   * @generated
   * @ordered
   */
  protected ParameterType paramType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDefValue() <em>Def Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefValue()
   * @generated
   * @ordered
   */
  protected static final String DEF_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefValue() <em>Def Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefValue()
   * @generated
   * @ordered
   */
  protected String defValue = DEF_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescriptionValue() <em>Description Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptionValue()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescriptionValue() <em>Description Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescriptionValue()
   * @generated
   * @ordered
   */
  protected String descriptionValue = DESCRIPTION_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected scriptParamImpl()
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
    return RadlPackage.Literals.SCRIPT_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType getParamType()
  {
    return paramType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamType(ParameterType newParamType, NotificationChain msgs)
  {
    ParameterType oldParamType = paramType;
    paramType = newParamType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RadlPackage.SCRIPT_PARAM__PARAM_TYPE, oldParamType, newParamType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamType(ParameterType newParamType)
  {
    if (newParamType != paramType)
    {
      NotificationChain msgs = null;
      if (paramType != null)
        msgs = ((InternalEObject)paramType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RadlPackage.SCRIPT_PARAM__PARAM_TYPE, null, msgs);
      if (newParamType != null)
        msgs = ((InternalEObject)newParamType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RadlPackage.SCRIPT_PARAM__PARAM_TYPE, null, msgs);
      msgs = basicSetParamType(newParamType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.SCRIPT_PARAM__PARAM_TYPE, newParamType, newParamType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.SCRIPT_PARAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefValue()
  {
    return defValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefValue(String newDefValue)
  {
    String oldDefValue = defValue;
    defValue = newDefValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.SCRIPT_PARAM__DEF_VALUE, oldDefValue, defValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescriptionValue()
  {
    return descriptionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescriptionValue(String newDescriptionValue)
  {
    String oldDescriptionValue = descriptionValue;
    descriptionValue = newDescriptionValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.SCRIPT_PARAM__DESCRIPTION_VALUE, oldDescriptionValue, descriptionValue));
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
      case RadlPackage.SCRIPT_PARAM__PARAM_TYPE:
        return basicSetParamType(null, msgs);
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
      case RadlPackage.SCRIPT_PARAM__PARAM_TYPE:
        return getParamType();
      case RadlPackage.SCRIPT_PARAM__NAME:
        return getName();
      case RadlPackage.SCRIPT_PARAM__DEF_VALUE:
        return getDefValue();
      case RadlPackage.SCRIPT_PARAM__DESCRIPTION_VALUE:
        return getDescriptionValue();
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
      case RadlPackage.SCRIPT_PARAM__PARAM_TYPE:
        setParamType((ParameterType)newValue);
        return;
      case RadlPackage.SCRIPT_PARAM__NAME:
        setName((String)newValue);
        return;
      case RadlPackage.SCRIPT_PARAM__DEF_VALUE:
        setDefValue((String)newValue);
        return;
      case RadlPackage.SCRIPT_PARAM__DESCRIPTION_VALUE:
        setDescriptionValue((String)newValue);
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
      case RadlPackage.SCRIPT_PARAM__PARAM_TYPE:
        setParamType((ParameterType)null);
        return;
      case RadlPackage.SCRIPT_PARAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RadlPackage.SCRIPT_PARAM__DEF_VALUE:
        setDefValue(DEF_VALUE_EDEFAULT);
        return;
      case RadlPackage.SCRIPT_PARAM__DESCRIPTION_VALUE:
        setDescriptionValue(DESCRIPTION_VALUE_EDEFAULT);
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
      case RadlPackage.SCRIPT_PARAM__PARAM_TYPE:
        return paramType != null;
      case RadlPackage.SCRIPT_PARAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RadlPackage.SCRIPT_PARAM__DEF_VALUE:
        return DEF_VALUE_EDEFAULT == null ? defValue != null : !DEF_VALUE_EDEFAULT.equals(defValue);
      case RadlPackage.SCRIPT_PARAM__DESCRIPTION_VALUE:
        return DESCRIPTION_VALUE_EDEFAULT == null ? descriptionValue != null : !DESCRIPTION_VALUE_EDEFAULT.equals(descriptionValue);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", defValue: ");
    result.append(defValue);
    result.append(", descriptionValue: ");
    result.append(descriptionValue);
    result.append(')');
    return result.toString();
  }

} //scriptParamImpl
