/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.ruleHTTP;
import gr.upatras.ece.wcl.radl2.radl.ruleHTTP_URL;
import gr.upatras.ece.wcl.radl2.radl.scriptParam;

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
 * An implementation of the model object '<em><b>rule HTTP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTPImpl#getRemoteMachine <em>Remote Machine</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTPImpl#getHttpURL <em>Http URL</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTPImpl#getHMethod <em>HMethod</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTPImpl#getAuthMethod <em>Auth Method</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTPImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTPImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleHTTPImpl#getPostBody <em>Post Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ruleHTTPImpl extends ProtocolImpl implements ruleHTTP
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
   * The cached value of the '{@link #getHttpURL() <em>Http URL</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttpURL()
   * @generated
   * @ordered
   */
  protected EList<ruleHTTP_URL> httpURL;

  /**
   * The default value of the '{@link #getHMethod() <em>HMethod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHMethod()
   * @generated
   * @ordered
   */
  protected static final String HMETHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHMethod() <em>HMethod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHMethod()
   * @generated
   * @ordered
   */
  protected String hMethod = HMETHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getAuthMethod() <em>Auth Method</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthMethod()
   * @generated
   * @ordered
   */
  protected scriptParam authMethod;

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
   * The cached value of the '{@link #getPostBody() <em>Post Body</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostBody()
   * @generated
   * @ordered
   */
  protected scriptParam postBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ruleHTTPImpl()
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
    return RadlPackage.Literals.RULE_HTTP;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_HTTP__REMOTE_MACHINE, oldRemoteMachine, remoteMachine));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_HTTP__REMOTE_MACHINE, oldRemoteMachine, remoteMachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ruleHTTP_URL> getHttpURL()
  {
    if (httpURL == null)
    {
      httpURL = new EObjectContainmentEList<ruleHTTP_URL>(ruleHTTP_URL.class, this, RadlPackage.RULE_HTTP__HTTP_URL);
    }
    return httpURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHMethod()
  {
    return hMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHMethod(String newHMethod)
  {
    String oldHMethod = hMethod;
    hMethod = newHMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_HTTP__HMETHOD, oldHMethod, hMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam getAuthMethod()
  {
    if (authMethod != null && authMethod.eIsProxy())
    {
      InternalEObject oldAuthMethod = (InternalEObject)authMethod;
      authMethod = (scriptParam)eResolveProxy(oldAuthMethod);
      if (authMethod != oldAuthMethod)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_HTTP__AUTH_METHOD, oldAuthMethod, authMethod));
      }
    }
    return authMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam basicGetAuthMethod()
  {
    return authMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthMethod(scriptParam newAuthMethod)
  {
    scriptParam oldAuthMethod = authMethod;
    authMethod = newAuthMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_HTTP__AUTH_METHOD, oldAuthMethod, authMethod));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_HTTP__USERNAME, oldUsername, username));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_HTTP__USERNAME, oldUsername, username));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_HTTP__PASSWORD, oldPassword, password));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_HTTP__PASSWORD, oldPassword, password));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam getPostBody()
  {
    if (postBody != null && postBody.eIsProxy())
    {
      InternalEObject oldPostBody = (InternalEObject)postBody;
      postBody = (scriptParam)eResolveProxy(oldPostBody);
      if (postBody != oldPostBody)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RULE_HTTP__POST_BODY, oldPostBody, postBody));
      }
    }
    return postBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam basicGetPostBody()
  {
    return postBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostBody(scriptParam newPostBody)
  {
    scriptParam oldPostBody = postBody;
    postBody = newPostBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_HTTP__POST_BODY, oldPostBody, postBody));
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
      case RadlPackage.RULE_HTTP__HTTP_URL:
        return ((InternalEList<?>)getHttpURL()).basicRemove(otherEnd, msgs);
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
      case RadlPackage.RULE_HTTP__REMOTE_MACHINE:
        if (resolve) return getRemoteMachine();
        return basicGetRemoteMachine();
      case RadlPackage.RULE_HTTP__HTTP_URL:
        return getHttpURL();
      case RadlPackage.RULE_HTTP__HMETHOD:
        return getHMethod();
      case RadlPackage.RULE_HTTP__AUTH_METHOD:
        if (resolve) return getAuthMethod();
        return basicGetAuthMethod();
      case RadlPackage.RULE_HTTP__USERNAME:
        if (resolve) return getUsername();
        return basicGetUsername();
      case RadlPackage.RULE_HTTP__PASSWORD:
        if (resolve) return getPassword();
        return basicGetPassword();
      case RadlPackage.RULE_HTTP__POST_BODY:
        if (resolve) return getPostBody();
        return basicGetPostBody();
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
      case RadlPackage.RULE_HTTP__REMOTE_MACHINE:
        setRemoteMachine((scriptParam)newValue);
        return;
      case RadlPackage.RULE_HTTP__HTTP_URL:
        getHttpURL().clear();
        getHttpURL().addAll((Collection<? extends ruleHTTP_URL>)newValue);
        return;
      case RadlPackage.RULE_HTTP__HMETHOD:
        setHMethod((String)newValue);
        return;
      case RadlPackage.RULE_HTTP__AUTH_METHOD:
        setAuthMethod((scriptParam)newValue);
        return;
      case RadlPackage.RULE_HTTP__USERNAME:
        setUsername((scriptParam)newValue);
        return;
      case RadlPackage.RULE_HTTP__PASSWORD:
        setPassword((scriptParam)newValue);
        return;
      case RadlPackage.RULE_HTTP__POST_BODY:
        setPostBody((scriptParam)newValue);
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
      case RadlPackage.RULE_HTTP__REMOTE_MACHINE:
        setRemoteMachine((scriptParam)null);
        return;
      case RadlPackage.RULE_HTTP__HTTP_URL:
        getHttpURL().clear();
        return;
      case RadlPackage.RULE_HTTP__HMETHOD:
        setHMethod(HMETHOD_EDEFAULT);
        return;
      case RadlPackage.RULE_HTTP__AUTH_METHOD:
        setAuthMethod((scriptParam)null);
        return;
      case RadlPackage.RULE_HTTP__USERNAME:
        setUsername((scriptParam)null);
        return;
      case RadlPackage.RULE_HTTP__PASSWORD:
        setPassword((scriptParam)null);
        return;
      case RadlPackage.RULE_HTTP__POST_BODY:
        setPostBody((scriptParam)null);
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
      case RadlPackage.RULE_HTTP__REMOTE_MACHINE:
        return remoteMachine != null;
      case RadlPackage.RULE_HTTP__HTTP_URL:
        return httpURL != null && !httpURL.isEmpty();
      case RadlPackage.RULE_HTTP__HMETHOD:
        return HMETHOD_EDEFAULT == null ? hMethod != null : !HMETHOD_EDEFAULT.equals(hMethod);
      case RadlPackage.RULE_HTTP__AUTH_METHOD:
        return authMethod != null;
      case RadlPackage.RULE_HTTP__USERNAME:
        return username != null;
      case RadlPackage.RULE_HTTP__PASSWORD:
        return password != null;
      case RadlPackage.RULE_HTTP__POST_BODY:
        return postBody != null;
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
    result.append(" (HMethod: ");
    result.append(hMethod);
    result.append(')');
    return result.toString();
  }

} //ruleHTTPImpl
