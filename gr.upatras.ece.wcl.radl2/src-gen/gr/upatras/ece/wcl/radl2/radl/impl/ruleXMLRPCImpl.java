/**
 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.BindingParam;
import gr.upatras.ece.wcl.radl2.radl.ConfigurationParam;
import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>rule XMLRPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleXMLRPCImpl#getRemoteMachine <em>Remote Machine</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleXMLRPCImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleXMLRPCImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleXMLRPCImpl#getRPCMethod <em>RPC Method</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleXMLRPCImpl#getURLparams <em>UR Lparams</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ruleXMLRPCImpl extends ProtocolImpl implements ruleXMLRPC
{
  /**
   * The cached value of the '{@link #getRemoteMachine() <em>Remote Machine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteMachine()
   * @generated
   * @ordered
   */
  protected BindingParam remoteMachine;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected BindingParam username;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected BindingParam password;

  /**
   * The cached value of the '{@link #getRPCMethod() <em>RPC Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRPCMethod()
   * @generated
   * @ordered
   */
  protected BindingParam rpcMethod;

  /**
   * The cached value of the '{@link #getURLparams() <em>UR Lparams</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getURLparams()
   * @generated
   * @ordered
   */
  protected EList<ConfigurationParam> urLparams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ruleXMLRPCImpl()
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
    return RadlPackage.Literals.RULE_XMLRPC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam getRemoteMachine()
  {
    if (remoteMachine != null && remoteMachine.eIsProxy())
    {
      InternalEObject oldRemoteMachine = (InternalEObject)remoteMachine;
      remoteMachine = (BindingParam)eResolveProxy(oldRemoteMachine);
      if (remoteMachine != oldRemoteMachine)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_XMLRPC__REMOTE_MACHINE, oldRemoteMachine, remoteMachine));
      }
    }
    return remoteMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam basicGetRemoteMachine()
  {
    return remoteMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoteMachine(BindingParam newRemoteMachine)
  {
    BindingParam oldRemoteMachine = remoteMachine;
    remoteMachine = newRemoteMachine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_XMLRPC__REMOTE_MACHINE, oldRemoteMachine, remoteMachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam getUsername()
  {
    if (username != null && username.eIsProxy())
    {
      InternalEObject oldUsername = (InternalEObject)username;
      username = (BindingParam)eResolveProxy(oldUsername);
      if (username != oldUsername)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_XMLRPC__USERNAME, oldUsername, username));
      }
    }
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam basicGetUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUsername(BindingParam newUsername)
  {
    BindingParam oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_XMLRPC__USERNAME, oldUsername, username));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam getPassword()
  {
    if (password != null && password.eIsProxy())
    {
      InternalEObject oldPassword = (InternalEObject)password;
      password = (BindingParam)eResolveProxy(oldPassword);
      if (password != oldPassword)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_XMLRPC__PASSWORD, oldPassword, password));
      }
    }
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam basicGetPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassword(BindingParam newPassword)
  {
    BindingParam oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_XMLRPC__PASSWORD, oldPassword, password));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam getRPCMethod()
  {
    if (rpcMethod != null && rpcMethod.eIsProxy())
    {
      InternalEObject oldRPCMethod = (InternalEObject)rpcMethod;
      rpcMethod = (BindingParam)eResolveProxy(oldRPCMethod);
      if (rpcMethod != oldRPCMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_XMLRPC__RPC_METHOD, oldRPCMethod, rpcMethod));
      }
    }
    return rpcMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam basicGetRPCMethod()
  {
    return rpcMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRPCMethod(BindingParam newRPCMethod)
  {
    BindingParam oldRPCMethod = rpcMethod;
    rpcMethod = newRPCMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_XMLRPC__RPC_METHOD, oldRPCMethod, rpcMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConfigurationParam> getURLparams()
  {
    if (urLparams == null)
    {
      urLparams = new EObjectResolvingEList<ConfigurationParam>(ConfigurationParam.class, this, RadlPackage.RULE_XMLRPC__UR_LPARAMS);
    }
    return urLparams;
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
      case RadlPackage.RULE_XMLRPC__REMOTE_MACHINE:
        if (resolve) return getRemoteMachine();
        return basicGetRemoteMachine();
      case RadlPackage.RULE_XMLRPC__USERNAME:
        if (resolve) return getUsername();
        return basicGetUsername();
      case RadlPackage.RULE_XMLRPC__PASSWORD:
        if (resolve) return getPassword();
        return basicGetPassword();
      case RadlPackage.RULE_XMLRPC__RPC_METHOD:
        if (resolve) return getRPCMethod();
        return basicGetRPCMethod();
      case RadlPackage.RULE_XMLRPC__UR_LPARAMS:
        return getURLparams();
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
      case RadlPackage.RULE_XMLRPC__REMOTE_MACHINE:
        setRemoteMachine((BindingParam)newValue);
        return;
      case RadlPackage.RULE_XMLRPC__USERNAME:
        setUsername((BindingParam)newValue);
        return;
      case RadlPackage.RULE_XMLRPC__PASSWORD:
        setPassword((BindingParam)newValue);
        return;
      case RadlPackage.RULE_XMLRPC__RPC_METHOD:
        setRPCMethod((BindingParam)newValue);
        return;
      case RadlPackage.RULE_XMLRPC__UR_LPARAMS:
        getURLparams().clear();
        getURLparams().addAll((Collection<? extends ConfigurationParam>)newValue);
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
      case RadlPackage.RULE_XMLRPC__REMOTE_MACHINE:
        setRemoteMachine((BindingParam)null);
        return;
      case RadlPackage.RULE_XMLRPC__USERNAME:
        setUsername((BindingParam)null);
        return;
      case RadlPackage.RULE_XMLRPC__PASSWORD:
        setPassword((BindingParam)null);
        return;
      case RadlPackage.RULE_XMLRPC__RPC_METHOD:
        setRPCMethod((BindingParam)null);
        return;
      case RadlPackage.RULE_XMLRPC__UR_LPARAMS:
        getURLparams().clear();
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
      case RadlPackage.RULE_XMLRPC__REMOTE_MACHINE:
        return remoteMachine != null;
      case RadlPackage.RULE_XMLRPC__USERNAME:
        return username != null;
      case RadlPackage.RULE_XMLRPC__PASSWORD:
        return password != null;
      case RadlPackage.RULE_XMLRPC__RPC_METHOD:
        return rpcMethod != null;
      case RadlPackage.RULE_XMLRPC__UR_LPARAMS:
        return urLparams != null && !urLparams.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ruleXMLRPCImpl
