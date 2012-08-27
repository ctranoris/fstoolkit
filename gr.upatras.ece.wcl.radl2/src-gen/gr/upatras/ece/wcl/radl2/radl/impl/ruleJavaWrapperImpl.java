/**
 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.Command;
import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.rulJava_param;
import gr.upatras.ece.wcl.radl2.radl.ruleJavaWrapper;

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
 * An implementation of the model object '<em><b>rule Java Wrapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleJavaWrapperImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleJavaWrapperImpl#getConstructorParams <em>Constructor Params</em>}</li>
 *   <li>{@link gr.upatras.ece.wcl.radl2.radl.impl.ruleJavaWrapperImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ruleJavaWrapperImpl extends ProtocolImpl implements ruleJavaWrapper
{
  /**
   * The default value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected static final String CLASSNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassname() <em>Classname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassname()
   * @generated
   * @ordered
   */
  protected String classname = CLASSNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getConstructorParams() <em>Constructor Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructorParams()
   * @generated
   * @ordered
   */
  protected EList<rulJava_param> constructorParams;

  /**
   * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCommands()
   * @generated
   * @ordered
   */
  protected EList<Command> commands;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ruleJavaWrapperImpl()
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
    return RadlPackage.Literals.RULE_JAVA_WRAPPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassname()
  {
    return classname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassname(String newClassname)
  {
    String oldClassname = classname;
    classname = newClassname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RadlPackage.RULE_JAVA_WRAPPER__CLASSNAME, oldClassname, classname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<rulJava_param> getConstructorParams()
  {
    if (constructorParams == null)
    {
      constructorParams = new EObjectContainmentEList<rulJava_param>(rulJava_param.class, this, RadlPackage.RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS);
    }
    return constructorParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Command> getCommands()
  {
    if (commands == null)
    {
      commands = new EObjectContainmentEList<Command>(Command.class, this, RadlPackage.RULE_JAVA_WRAPPER__COMMANDS);
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
      case RadlPackage.RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS:
        return ((InternalEList<?>)getConstructorParams()).basicRemove(otherEnd, msgs);
      case RadlPackage.RULE_JAVA_WRAPPER__COMMANDS:
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
      case RadlPackage.RULE_JAVA_WRAPPER__CLASSNAME:
        return getClassname();
      case RadlPackage.RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS:
        return getConstructorParams();
      case RadlPackage.RULE_JAVA_WRAPPER__COMMANDS:
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
      case RadlPackage.RULE_JAVA_WRAPPER__CLASSNAME:
        setClassname((String)newValue);
        return;
      case RadlPackage.RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS:
        getConstructorParams().clear();
        getConstructorParams().addAll((Collection<? extends rulJava_param>)newValue);
        return;
      case RadlPackage.RULE_JAVA_WRAPPER__COMMANDS:
        getCommands().clear();
        getCommands().addAll((Collection<? extends Command>)newValue);
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
      case RadlPackage.RULE_JAVA_WRAPPER__CLASSNAME:
        setClassname(CLASSNAME_EDEFAULT);
        return;
      case RadlPackage.RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS:
        getConstructorParams().clear();
        return;
      case RadlPackage.RULE_JAVA_WRAPPER__COMMANDS:
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
      case RadlPackage.RULE_JAVA_WRAPPER__CLASSNAME:
        return CLASSNAME_EDEFAULT == null ? classname != null : !CLASSNAME_EDEFAULT.equals(classname);
      case RadlPackage.RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS:
        return constructorParams != null && !constructorParams.isEmpty();
      case RadlPackage.RULE_JAVA_WRAPPER__COMMANDS:
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
    result.append(" (classname: ");
    result.append(classname);
    result.append(')');
    return result.toString();
  }

} //ruleJavaWrapperImpl
