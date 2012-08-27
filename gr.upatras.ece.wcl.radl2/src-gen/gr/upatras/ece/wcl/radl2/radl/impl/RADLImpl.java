/**
 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.Import;
import gr.upatras.ece.wcl.radl2.radl.RADL;
import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.ResourceAdapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RADL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.RADLImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.RADLImpl#getResourceAdapter <em>Resource Adapter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RADLImpl extends MinimalEObjectImpl.Container implements RADL
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected Import imports;

  /**
   * The cached value of the '{@link #getResourceAdapter() <em>Resource Adapter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResourceAdapter()
   * @generated
   * @ordered
   */
  protected ResourceAdapter resourceAdapter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RADLImpl()
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
    return RadlPackage.Literals.RADL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getImports()
  {
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImports(Import newImports, NotificationChain msgs)
  {
    Import oldImports = imports;
    imports = newImports;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RadlPackage.RADL__IMPORTS, oldImports, newImports);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImports(Import newImports)
  {
    if (newImports != imports)
    {
      NotificationChain msgs = null;
      if (imports != null)
        msgs = ((InternalEObject)imports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RadlPackage.RADL__IMPORTS, null, msgs);
      if (newImports != null)
        msgs = ((InternalEObject)newImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RadlPackage.RADL__IMPORTS, null, msgs);
      msgs = basicSetImports(newImports, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RADL__IMPORTS, newImports, newImports));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAdapter getResourceAdapter()
  {
    return resourceAdapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResourceAdapter(ResourceAdapter newResourceAdapter, NotificationChain msgs)
  {
    ResourceAdapter oldResourceAdapter = resourceAdapter;
    resourceAdapter = newResourceAdapter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RadlPackage.RADL__RESOURCE_ADAPTER, oldResourceAdapter, newResourceAdapter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResourceAdapter(ResourceAdapter newResourceAdapter)
  {
    if (newResourceAdapter != resourceAdapter)
    {
      NotificationChain msgs = null;
      if (resourceAdapter != null)
        msgs = ((InternalEObject)resourceAdapter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RadlPackage.RADL__RESOURCE_ADAPTER, null, msgs);
      if (newResourceAdapter != null)
        msgs = ((InternalEObject)newResourceAdapter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RadlPackage.RADL__RESOURCE_ADAPTER, null, msgs);
      msgs = basicSetResourceAdapter(newResourceAdapter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RADL__RESOURCE_ADAPTER, newResourceAdapter, newResourceAdapter));
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
      case RadlPackage.RADL__IMPORTS:
        return basicSetImports(null, msgs);
      case RadlPackage.RADL__RESOURCE_ADAPTER:
        return basicSetResourceAdapter(null, msgs);
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
      case RadlPackage.RADL__IMPORTS:
        return getImports();
      case RadlPackage.RADL__RESOURCE_ADAPTER:
        return getResourceAdapter();
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
      case RadlPackage.RADL__IMPORTS:
        setImports((Import)newValue);
        return;
      case RadlPackage.RADL__RESOURCE_ADAPTER:
        setResourceAdapter((ResourceAdapter)newValue);
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
      case RadlPackage.RADL__IMPORTS:
        setImports((Import)null);
        return;
      case RadlPackage.RADL__RESOURCE_ADAPTER:
        setResourceAdapter((ResourceAdapter)null);
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
      case RadlPackage.RADL__IMPORTS:
        return imports != null;
      case RadlPackage.RADL__RESOURCE_ADAPTER:
        return resourceAdapter != null;
    }
    return super.eIsSet(featureID);
  }

} //RADLImpl
