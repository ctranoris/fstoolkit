/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import FederationOffice.Office;

import FederationOffice.services.OfferedService;

import gr.upatras.ece.wcl.radl2.radl.AllowedType;
import gr.upatras.ece.wcl.radl2.radl.BindingParam;
import gr.upatras.ece.wcl.radl2.radl.ConfigurationParam;
import gr.upatras.ece.wcl.radl2.radl.Protocol;
import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.ResourceAdapter;
import gr.upatras.ece.wcl.radl2.radl.SupportedChildType;

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
 * An implementation of the model object '<em><b>Resource Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getImplname <em>Implname</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getByoffice <em>Byoffice</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getConfParams <em>Conf Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getBindParams <em>Bind Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getChildParams <em>Child Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getAllowParams <em>Allow Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getConfComplete <em>Conf Complete</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ResourceAdapterImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceAdapterImpl extends MinimalEObjectImpl.Container implements ResourceAdapter
{
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
   * The cached value of the '{@link #getImplname() <em>Implname</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplname()
   * @generated
   * @ordered
   */
  protected OfferedService implname;

  /**
   * The cached value of the '{@link #getByoffice() <em>Byoffice</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getByoffice()
   * @generated
   * @ordered
   */
  protected Office byoffice;

  /**
   * The cached value of the '{@link #getConfParams() <em>Conf Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfParams()
   * @generated
   * @ordered
   */
  protected EList<ConfigurationParam> confParams;

  /**
   * The cached value of the '{@link #getBindParams() <em>Bind Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBindParams()
   * @generated
   * @ordered
   */
  protected EList<BindingParam> bindParams;

  /**
   * The cached value of the '{@link #getChildParams() <em>Child Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildParams()
   * @generated
   * @ordered
   */
  protected EList<SupportedChildType> childParams;

  /**
   * The cached value of the '{@link #getAllowParams() <em>Allow Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllowParams()
   * @generated
   * @ordered
   */
  protected EList<AllowedType> allowParams;

  /**
   * The default value of the '{@link #getConfComplete() <em>Conf Complete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfComplete()
   * @generated
   * @ordered
   */
  protected static final String CONF_COMPLETE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConfComplete() <em>Conf Complete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfComplete()
   * @generated
   * @ordered
   */
  protected String confComplete = CONF_COMPLETE_EDEFAULT;

  /**
   * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocol()
   * @generated
   * @ordered
   */
  protected Protocol protocol;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceAdapterImpl()
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
    return RadlPackage.Literals.RESOURCE_ADAPTER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RESOURCE_ADAPTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfferedService getImplname()
  {
    if (implname != null && implname.eIsProxy())
    {
      InternalEObject oldImplname = (InternalEObject)implname;
      implname = (OfferedService)eResolveProxy(oldImplname);
      if (implname != oldImplname)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RESOURCE_ADAPTER__IMPLNAME, oldImplname, implname));
      }
    }
    return implname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OfferedService basicGetImplname()
  {
    return implname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImplname(OfferedService newImplname)
  {
    OfferedService oldImplname = implname;
    implname = newImplname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RESOURCE_ADAPTER__IMPLNAME, oldImplname, implname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Office getByoffice()
  {
    if (byoffice != null && byoffice.eIsProxy())
    {
      InternalEObject oldByoffice = (InternalEObject)byoffice;
      byoffice = (Office)eResolveProxy(oldByoffice);
      if (byoffice != oldByoffice)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RadlPackage.RESOURCE_ADAPTER__BYOFFICE, oldByoffice, byoffice));
      }
    }
    return byoffice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Office basicGetByoffice()
  {
    return byoffice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByoffice(Office newByoffice)
  {
    Office oldByoffice = byoffice;
    byoffice = newByoffice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RESOURCE_ADAPTER__BYOFFICE, oldByoffice, byoffice));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConfigurationParam> getConfParams()
  {
    if (confParams == null)
    {
      confParams = new EObjectContainmentEList<ConfigurationParam>(ConfigurationParam.class, this, RadlPackage.RESOURCE_ADAPTER__CONF_PARAMS);
    }
    return confParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BindingParam> getBindParams()
  {
    if (bindParams == null)
    {
      bindParams = new EObjectContainmentEList<BindingParam>(BindingParam.class, this, RadlPackage.RESOURCE_ADAPTER__BIND_PARAMS);
    }
    return bindParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SupportedChildType> getChildParams()
  {
    if (childParams == null)
    {
      childParams = new EObjectContainmentEList<SupportedChildType>(SupportedChildType.class, this, RadlPackage.RESOURCE_ADAPTER__CHILD_PARAMS);
    }
    return childParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AllowedType> getAllowParams()
  {
    if (allowParams == null)
    {
      allowParams = new EObjectContainmentEList<AllowedType>(AllowedType.class, this, RadlPackage.RESOURCE_ADAPTER__ALLOW_PARAMS);
    }
    return allowParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConfComplete()
  {
    return confComplete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfComplete(String newConfComplete)
  {
    String oldConfComplete = confComplete;
    confComplete = newConfComplete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RESOURCE_ADAPTER__CONF_COMPLETE, oldConfComplete, confComplete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol getProtocol()
  {
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProtocol(Protocol newProtocol, NotificationChain msgs)
  {
    Protocol oldProtocol = protocol;
    protocol = newProtocol;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RadlPackage.RESOURCE_ADAPTER__PROTOCOL, oldProtocol, newProtocol);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProtocol(Protocol newProtocol)
  {
    if (newProtocol != protocol)
    {
      NotificationChain msgs = null;
      if (protocol != null)
        msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RadlPackage.RESOURCE_ADAPTER__PROTOCOL, null, msgs);
      if (newProtocol != null)
        msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RadlPackage.RESOURCE_ADAPTER__PROTOCOL, null, msgs);
      msgs = basicSetProtocol(newProtocol, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RESOURCE_ADAPTER__PROTOCOL, newProtocol, newProtocol));
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
      case RadlPackage.RESOURCE_ADAPTER__CONF_PARAMS:
        return ((InternalEList<?>)getConfParams()).basicRemove(otherEnd, msgs);
      case RadlPackage.RESOURCE_ADAPTER__BIND_PARAMS:
        return ((InternalEList<?>)getBindParams()).basicRemove(otherEnd, msgs);
      case RadlPackage.RESOURCE_ADAPTER__CHILD_PARAMS:
        return ((InternalEList<?>)getChildParams()).basicRemove(otherEnd, msgs);
      case RadlPackage.RESOURCE_ADAPTER__ALLOW_PARAMS:
        return ((InternalEList<?>)getAllowParams()).basicRemove(otherEnd, msgs);
      case RadlPackage.RESOURCE_ADAPTER__PROTOCOL:
        return basicSetProtocol(null, msgs);
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
      case RadlPackage.RESOURCE_ADAPTER__NAME:
        return getName();
      case RadlPackage.RESOURCE_ADAPTER__IMPLNAME:
        if (resolve) return getImplname();
        return basicGetImplname();
      case RadlPackage.RESOURCE_ADAPTER__BYOFFICE:
        if (resolve) return getByoffice();
        return basicGetByoffice();
      case RadlPackage.RESOURCE_ADAPTER__CONF_PARAMS:
        return getConfParams();
      case RadlPackage.RESOURCE_ADAPTER__BIND_PARAMS:
        return getBindParams();
      case RadlPackage.RESOURCE_ADAPTER__CHILD_PARAMS:
        return getChildParams();
      case RadlPackage.RESOURCE_ADAPTER__ALLOW_PARAMS:
        return getAllowParams();
      case RadlPackage.RESOURCE_ADAPTER__CONF_COMPLETE:
        return getConfComplete();
      case RadlPackage.RESOURCE_ADAPTER__PROTOCOL:
        return getProtocol();
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
      case RadlPackage.RESOURCE_ADAPTER__NAME:
        setName((String)newValue);
        return;
      case RadlPackage.RESOURCE_ADAPTER__IMPLNAME:
        setImplname((OfferedService)newValue);
        return;
      case RadlPackage.RESOURCE_ADAPTER__BYOFFICE:
        setByoffice((Office)newValue);
        return;
      case RadlPackage.RESOURCE_ADAPTER__CONF_PARAMS:
        getConfParams().clear();
        getConfParams().addAll((Collection<? extends ConfigurationParam>)newValue);
        return;
      case RadlPackage.RESOURCE_ADAPTER__BIND_PARAMS:
        getBindParams().clear();
        getBindParams().addAll((Collection<? extends BindingParam>)newValue);
        return;
      case RadlPackage.RESOURCE_ADAPTER__CHILD_PARAMS:
        getChildParams().clear();
        getChildParams().addAll((Collection<? extends SupportedChildType>)newValue);
        return;
      case RadlPackage.RESOURCE_ADAPTER__ALLOW_PARAMS:
        getAllowParams().clear();
        getAllowParams().addAll((Collection<? extends AllowedType>)newValue);
        return;
      case RadlPackage.RESOURCE_ADAPTER__CONF_COMPLETE:
        setConfComplete((String)newValue);
        return;
      case RadlPackage.RESOURCE_ADAPTER__PROTOCOL:
        setProtocol((Protocol)newValue);
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
      case RadlPackage.RESOURCE_ADAPTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RadlPackage.RESOURCE_ADAPTER__IMPLNAME:
        setImplname((OfferedService)null);
        return;
      case RadlPackage.RESOURCE_ADAPTER__BYOFFICE:
        setByoffice((Office)null);
        return;
      case RadlPackage.RESOURCE_ADAPTER__CONF_PARAMS:
        getConfParams().clear();
        return;
      case RadlPackage.RESOURCE_ADAPTER__BIND_PARAMS:
        getBindParams().clear();
        return;
      case RadlPackage.RESOURCE_ADAPTER__CHILD_PARAMS:
        getChildParams().clear();
        return;
      case RadlPackage.RESOURCE_ADAPTER__ALLOW_PARAMS:
        getAllowParams().clear();
        return;
      case RadlPackage.RESOURCE_ADAPTER__CONF_COMPLETE:
        setConfComplete(CONF_COMPLETE_EDEFAULT);
        return;
      case RadlPackage.RESOURCE_ADAPTER__PROTOCOL:
        setProtocol((Protocol)null);
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
      case RadlPackage.RESOURCE_ADAPTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RadlPackage.RESOURCE_ADAPTER__IMPLNAME:
        return implname != null;
      case RadlPackage.RESOURCE_ADAPTER__BYOFFICE:
        return byoffice != null;
      case RadlPackage.RESOURCE_ADAPTER__CONF_PARAMS:
        return confParams != null && !confParams.isEmpty();
      case RadlPackage.RESOURCE_ADAPTER__BIND_PARAMS:
        return bindParams != null && !bindParams.isEmpty();
      case RadlPackage.RESOURCE_ADAPTER__CHILD_PARAMS:
        return childParams != null && !childParams.isEmpty();
      case RadlPackage.RESOURCE_ADAPTER__ALLOW_PARAMS:
        return allowParams != null && !allowParams.isEmpty();
      case RadlPackage.RESOURCE_ADAPTER__CONF_COMPLETE:
        return CONF_COMPLETE_EDEFAULT == null ? confComplete != null : !CONF_COMPLETE_EDEFAULT.equals(confComplete);
      case RadlPackage.RESOURCE_ADAPTER__PROTOCOL:
        return protocol != null;
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
    result.append(", ConfComplete: ");
    result.append(confComplete);
    result.append(')');
    return result.toString();
  }

} //ResourceAdapterImpl
