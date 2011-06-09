/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl.impl;

import gr.upatras.ece.wcl.radl.RadlPackage;
import gr.upatras.ece.wcl.radl.rulSSH_commands;
import gr.upatras.ece.wcl.radl.ruleSSH;
import gr.upatras.ece.wcl.radl.scriptParam;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rule SSH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.ruleSSHImpl#getRemoteMachine <em>Remote Machine</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.ruleSSHImpl#getRPort <em>RPort</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.ruleSSHImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.ruleSSHImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.ruleSSHImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl.impl.ruleSSHImpl#getCommandsDelete <em>Commands Delete</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ruleSSHImpl extends ProtocolImpl implements ruleSSH
{
  /**
   * The cached value of the '{@link #getRemoteMachine() <em>Remote Machine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteMachine()
   * @generated
   * @ordered
   */
  protected scriptParam remoteMachine;

  /**
   * The cached value of the '{@link #getRPort() <em>RPort</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRPort()
   * @generated
   * @ordered
   */
  protected scriptParam rPort;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected scriptParam username;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected scriptParam password;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<rulSSH_commands> commands;

  /**
   * The cached value of the '{@link #getCommandsDelete() <em>Commands Delete</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommandsDelete()
   * @generated
   * @ordered
   */
  protected EList<rulSSH_commands> commandsDelete;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ruleSSHImpl()
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
    return RadlPackage.Literals.RULE_SSH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam getRemoteMachine()
  {
    if (remoteMachine != null && remoteMachine.eIsProxy())
    {
      InternalEObject oldRemoteMachine = (InternalEObject)remoteMachine;
      remoteMachine = (scriptParam)eResolveProxy(oldRemoteMachine);
      if (remoteMachine != oldRemoteMachine)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_SSH__REMOTE_MACHINE, oldRemoteMachine, remoteMachine));
      }
    }
    return remoteMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam basicGetRemoteMachine()
  {
    return remoteMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoteMachine(scriptParam newRemoteMachine)
  {
    scriptParam oldRemoteMachine = remoteMachine;
    remoteMachine = newRemoteMachine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_SSH__REMOTE_MACHINE, oldRemoteMachine, remoteMachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam getRPort()
  {
    if (rPort != null && rPort.eIsProxy())
    {
      InternalEObject oldRPort = (InternalEObject)rPort;
      rPort = (scriptParam)eResolveProxy(oldRPort);
      if (rPort != oldRPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_SSH__RPORT, oldRPort, rPort));
      }
    }
    return rPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam basicGetRPort()
  {
    return rPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRPort(scriptParam newRPort)
  {
    scriptParam oldRPort = rPort;
    rPort = newRPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_SSH__RPORT, oldRPort, rPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam getUsername()
  {
    if (username != null && username.eIsProxy())
    {
      InternalEObject oldUsername = (InternalEObject)username;
      username = (scriptParam)eResolveProxy(oldUsername);
      if (username != oldUsername)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_SSH__USERNAME, oldUsername, username));
      }
    }
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam basicGetUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsername(scriptParam newUsername)
  {
    scriptParam oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_SSH__USERNAME, oldUsername, username));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam getPassword()
  {
    if (password != null && password.eIsProxy())
    {
      InternalEObject oldPassword = (InternalEObject)password;
      password = (scriptParam)eResolveProxy(oldPassword);
      if (password != oldPassword)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_SSH__PASSWORD, oldPassword, password));
      }
    }
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam basicGetPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(scriptParam newPassword)
  {
    scriptParam oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_SSH__PASSWORD, oldPassword, password));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rulSSH_commands> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<rulSSH_commands>(rulSSH_commands.class, this, RadlPackage.RULE_SSH__COMMANDS);
    }
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rulSSH_commands> getCommandsDelete()
  {
    if (commandsDelete == null)
    {
      commandsDelete = new EObjectContainmentEList<rulSSH_commands>(rulSSH_commands.class, this, RadlPackage.RULE_SSH__COMMANDS_DELETE);
    }
    return commandsDelete;
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
      case RadlPackage.RULE_SSH__COMMANDS:
        return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
      case RadlPackage.RULE_SSH__COMMANDS_DELETE:
        return ((InternalEList<?>)getCommandsDelete()).basicRemove(otherEnd, msgs);
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
      case RadlPackage.RULE_SSH__REMOTE_MACHINE:
        if (resolve) return getRemoteMachine();
        return basicGetRemoteMachine();
      case RadlPackage.RULE_SSH__RPORT:
        if (resolve) return getRPort();
        return basicGetRPort();
      case RadlPackage.RULE_SSH__USERNAME:
        if (resolve) return getUsername();
        return basicGetUsername();
      case RadlPackage.RULE_SSH__PASSWORD:
        if (resolve) return getPassword();
        return basicGetPassword();
      case RadlPackage.RULE_SSH__COMMANDS:
        return getCommands();
      case RadlPackage.RULE_SSH__COMMANDS_DELETE:
        return getCommandsDelete();
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
      case RadlPackage.RULE_SSH__REMOTE_MACHINE:
        setRemoteMachine((scriptParam)newValue);
        return;
      case RadlPackage.RULE_SSH__RPORT:
        setRPort((scriptParam)newValue);
        return;
      case RadlPackage.RULE_SSH__USERNAME:
        setUsername((scriptParam)newValue);
        return;
      case RadlPackage.RULE_SSH__PASSWORD:
        setPassword((scriptParam)newValue);
        return;
      case RadlPackage.RULE_SSH__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends rulSSH_commands>)newValue);
        return;
      case RadlPackage.RULE_SSH__COMMANDS_DELETE:
        getCommandsDelete().clear();
        getCommandsDelete().addAll((Collection<? extends rulSSH_commands>)newValue);
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
      case RadlPackage.RULE_SSH__REMOTE_MACHINE:
        setRemoteMachine((scriptParam)null);
        return;
      case RadlPackage.RULE_SSH__RPORT:
        setRPort((scriptParam)null);
        return;
      case RadlPackage.RULE_SSH__USERNAME:
        setUsername((scriptParam)null);
        return;
      case RadlPackage.RULE_SSH__PASSWORD:
        setPassword((scriptParam)null);
        return;
      case RadlPackage.RULE_SSH__COMMANDS:
        getCommands().clear();
        return;
      case RadlPackage.RULE_SSH__COMMANDS_DELETE:
        getCommandsDelete().clear();
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
      case RadlPackage.RULE_SSH__REMOTE_MACHINE:
        return remoteMachine != null;
      case RadlPackage.RULE_SSH__RPORT:
        return rPort != null;
      case RadlPackage.RULE_SSH__USERNAME:
        return username != null;
      case RadlPackage.RULE_SSH__PASSWORD:
        return password != null;
      case RadlPackage.RULE_SSH__COMMANDS:
        return commands != null && !commands.isEmpty();
      case RadlPackage.RULE_SSH__COMMANDS_DELETE:
        return commandsDelete != null && !commandsDelete.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ruleSSHImpl
