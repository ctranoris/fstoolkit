/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl.impl;

import gr.upatras.ece.wcl.radl.Command;
import gr.upatras.ece.wcl.radl.RadlPackage;
import gr.upatras.ece.wcl.radl.rulJava_param;

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
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.CommandImpl#getJavaFunctionName <em>Java Function Name</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.CommandImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends MinimalEObjectImpl.Container implements Command
{
  /**
   * The default value of the '{@link #getJavaFunctionName() <em>Java Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaFunctionName()
   * @generated
   * @ordered
   */
  protected static final String JAVA_FUNCTION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavaFunctionName() <em>Java Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaFunctionName()
   * @generated
   * @ordered
   */
  protected String javaFunctionName = JAVA_FUNCTION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<rulJava_param> commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommandImpl()
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
    return RadlPackage.Literals.COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJavaFunctionName()
  {
    return javaFunctionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaFunctionName(String newJavaFunctionName)
  {
    String oldJavaFunctionName = javaFunctionName;
    javaFunctionName = newJavaFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.COMMAND__JAVA_FUNCTION_NAME, oldJavaFunctionName, javaFunctionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rulJava_param> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<rulJava_param>(rulJava_param.class, this, RadlPackage.COMMAND__COMMANDS);
    }
    return commands;
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
      case RadlPackage.COMMAND__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
      case RadlPackage.COMMAND__JAVA_FUNCTION_NAME:
        return getJavaFunctionName();
      case RadlPackage.COMMAND__COMMANDS:
        return getCommands();
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
      case RadlPackage.COMMAND__JAVA_FUNCTION_NAME:
        setJavaFunctionName((String)newValue);
        return;
      case RadlPackage.COMMAND__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends rulJava_param>)newValue);
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
      case RadlPackage.COMMAND__JAVA_FUNCTION_NAME:
        setJavaFunctionName(JAVA_FUNCTION_NAME_EDEFAULT);
        return;
      case RadlPackage.COMMAND__COMMANDS:
        getCommands().clear();
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
      case RadlPackage.COMMAND__JAVA_FUNCTION_NAME:
        return JAVA_FUNCTION_NAME_EDEFAULT == null ? javaFunctionName != null : !JAVA_FUNCTION_NAME_EDEFAULT.equals(javaFunctionName);
      case RadlPackage.COMMAND__COMMANDS:
        return commands != null && !commands.isEmpty();
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
    result.append(" (javaFunctionName: ");
    result.append(javaFunctionName);
    result.append(')');
    return result.toString();
  }

} //CommandImpl
