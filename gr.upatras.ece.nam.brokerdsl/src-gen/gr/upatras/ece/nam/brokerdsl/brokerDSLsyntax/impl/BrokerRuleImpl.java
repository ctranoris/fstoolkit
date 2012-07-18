/**
 */
package gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl;

import brokermodel.Broker;

import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage;
import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerRule;
import gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.ImportBroker;

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
 * An implementation of the model object '<em><b>Broker Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerRuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.impl.BrokerRuleImpl#getTestbedBrokerv <em>Testbed Brokerv</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrokerRuleImpl extends MinimalEObjectImpl.Container implements BrokerRule
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportBroker> imports;

  /**
   * The cached value of the '{@link #getTestbedBrokerv() <em>Testbed Brokerv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestbedBrokerv()
   * @generated
   * @ordered
   */
  protected Broker testbedBrokerv;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BrokerRuleImpl()
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
    return BrokerDSLsyntaxPackage.Literals.BROKER_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportBroker> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportBroker>(ImportBroker.class, this, BrokerDSLsyntaxPackage.BROKER_RULE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Broker getTestbedBrokerv()
  {
    return testbedBrokerv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTestbedBrokerv(Broker newTestbedBrokerv, NotificationChain msgs)
  {
    Broker oldTestbedBrokerv = testbedBrokerv;
    testbedBrokerv = newTestbedBrokerv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV, oldTestbedBrokerv, newTestbedBrokerv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestbedBrokerv(Broker newTestbedBrokerv)
  {
    if (newTestbedBrokerv != testbedBrokerv)
    {
      NotificationChain msgs = null;
      if (testbedBrokerv != null)
        msgs = ((InternalEObject)testbedBrokerv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV, null, msgs);
      if (newTestbedBrokerv != null)
        msgs = ((InternalEObject)newTestbedBrokerv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV, null, msgs);
      msgs = basicSetTestbedBrokerv(newTestbedBrokerv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV, newTestbedBrokerv, newTestbedBrokerv));
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
      case BrokerDSLsyntaxPackage.BROKER_RULE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV:
        return basicSetTestbedBrokerv(null, msgs);
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
      case BrokerDSLsyntaxPackage.BROKER_RULE__IMPORTS:
        return getImports();
      case BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV:
        return getTestbedBrokerv();
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
      case BrokerDSLsyntaxPackage.BROKER_RULE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportBroker>)newValue);
        return;
      case BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV:
        setTestbedBrokerv((Broker)newValue);
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
      case BrokerDSLsyntaxPackage.BROKER_RULE__IMPORTS:
        getImports().clear();
        return;
      case BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV:
        setTestbedBrokerv((Broker)null);
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
      case BrokerDSLsyntaxPackage.BROKER_RULE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case BrokerDSLsyntaxPackage.BROKER_RULE__TESTBED_BROKERV:
        return testbedBrokerv != null;
    }
    return super.eIsSet(featureID);
  }

} //BrokerRuleImpl
