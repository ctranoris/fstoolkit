/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.rulSSH_commands;
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
 * An implementation of the model object '<em><b>rul SSH commands</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.rulSSH_commandsImpl#getRemoteCommand <em>Remote Command</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.rulSSH_commandsImpl#getScriptparams <em>Scriptparams</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class rulSSH_commandsImpl extends MinimalEObjectImpl.Container implements rulSSH_commands
{
  /**
   * The default value of the '{@link #getRemoteCommand() <em>Remote Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteCommand()
   * @generated
   * @ordered
   */
  protected static final String REMOTE_COMMAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemoteCommand() <em>Remote Command</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteCommand()
   * @generated
   * @ordered
   */
  protected String remoteCommand = REMOTE_COMMAND_EDEFAULT;

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
  protected rulSSH_commandsImpl()
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
    return RadlPackage.Literals.RUL_SSH_COMMANDS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRemoteCommand()
  {
    return remoteCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoteCommand(String newRemoteCommand)
  {
    String oldRemoteCommand = remoteCommand;
    remoteCommand = newRemoteCommand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RUL_SSH_COMMANDS__REMOTE_COMMAND, oldRemoteCommand, remoteCommand));
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
      scriptparams = new EObjectResolvingEList<scriptParam>(scriptParam.class, this, RadlPackage.RUL_SSH_COMMANDS__SCRIPTPARAMS);
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
      case RadlPackage.RUL_SSH_COMMANDS__REMOTE_COMMAND:
        return getRemoteCommand();
      case RadlPackage.RUL_SSH_COMMANDS__SCRIPTPARAMS:
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
      case RadlPackage.RUL_SSH_COMMANDS__REMOTE_COMMAND:
        setRemoteCommand((String)newValue);
        return;
      case RadlPackage.RUL_SSH_COMMANDS__SCRIPTPARAMS:
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
      case RadlPackage.RUL_SSH_COMMANDS__REMOTE_COMMAND:
        setRemoteCommand(REMOTE_COMMAND_EDEFAULT);
        return;
      case RadlPackage.RUL_SSH_COMMANDS__SCRIPTPARAMS:
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
      case RadlPackage.RUL_SSH_COMMANDS__REMOTE_COMMAND:
        return REMOTE_COMMAND_EDEFAULT == null ? remoteCommand != null : !REMOTE_COMMAND_EDEFAULT.equals(remoteCommand);
      case RadlPackage.RUL_SSH_COMMANDS__SCRIPTPARAMS:
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
    result.append(" (remoteCommand: ");
    result.append(remoteCommand);
    result.append(')');
    return result.toString();
  }

} //rulSSH_commandsImpl
