/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl.util;

import gr.upatras.ece.wcl.radl2.radl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage
 * @generated
 */
public class RadlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RadlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RadlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RadlPackage.RADL:
      {
        RADL radl = (RADL)theEObject;
        T result = caseRADL(radl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RESOURCE_ADAPTER:
      {
        ResourceAdapter resourceAdapter = (ResourceAdapter)theEObject;
        T result = caseResourceAdapter(resourceAdapter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.CONFIGURATION_PARAM:
      {
        ConfigurationParam configurationParam = (ConfigurationParam)theEObject;
        T result = caseConfigurationParam(configurationParam);
        if (result == null) result = casescriptParam(configurationParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.BINDING_PARAM:
      {
        BindingParam bindingParam = (BindingParam)theEObject;
        T result = caseBindingParam(bindingParam);
        if (result == null) result = casescriptParam(bindingParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.SUPPORTED_CHILD_TYPE:
      {
        SupportedChildType supportedChildType = (SupportedChildType)theEObject;
        T result = caseSupportedChildType(supportedChildType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.ALLOWED_TYPE:
      {
        AllowedType allowedType = (AllowedType)theEObject;
        T result = caseAllowedType(allowedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.PROTOCOL:
      {
        Protocol protocol = (Protocol)theEObject;
        T result = caseProtocol(protocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.PARAMETER_TYPE:
      {
        ParameterType parameterType = (ParameterType)theEObject;
        T result = caseParameterType(parameterType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RULE_SSH:
      {
        ruleSSH ruleSSH = (ruleSSH)theEObject;
        T result = caseruleSSH(ruleSSH);
        if (result == null) result = caseProtocol(ruleSSH);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RULE_JAVA_WRAPPER:
      {
        ruleJavaWrapper ruleJavaWrapper = (ruleJavaWrapper)theEObject;
        T result = caseruleJavaWrapper(ruleJavaWrapper);
        if (result == null) result = caseProtocol(ruleJavaWrapper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.ENTRY_COMMAND:
      {
        entryCommand entryCommand = (entryCommand)theEObject;
        T result = caseentryCommand(entryCommand);
        if (result == null) result = caseCommand(entryCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RUL_JAVA_PARAM:
      {
        rulJava_param rulJava_param = (rulJava_param)theEObject;
        T result = caserulJava_param(rulJava_param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RUL_JAVA_PARAM_STRING:
      {
        rulJava_paramString rulJava_paramString = (rulJava_paramString)theEObject;
        T result = caserulJava_paramString(rulJava_paramString);
        if (result == null) result = caserulJava_param(rulJava_paramString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RUL_JAVA_PARAM_INT:
      {
        rulJava_paramInt rulJava_paramInt = (rulJava_paramInt)theEObject;
        T result = caserulJava_paramInt(rulJava_paramInt);
        if (result == null) result = caserulJava_param(rulJava_paramInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RUL_JAVA_PARA_SCRIPT:
      {
        rulJava_paraScript rulJava_paraScript = (rulJava_paraScript)theEObject;
        T result = caserulJava_paraScript(rulJava_paraScript);
        if (result == null) result = caserulJava_param(rulJava_paraScript);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.ASSIGN_COMMAND:
      {
        assignCommand assignCommand = (assignCommand)theEObject;
        T result = caseassignCommand(assignCommand);
        if (result == null) result = caseCommand(assignCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.SCRIPT_PARAM:
      {
        scriptParam scriptParam = (scriptParam)theEObject;
        T result = casescriptParam(scriptParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RUL_SSH_COMMANDS:
      {
        rulSSH_commands rulSSH_commands = (rulSSH_commands)theEObject;
        T result = caserulSSH_commands(rulSSH_commands);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RULE_HTTP:
      {
        ruleHTTP ruleHTTP = (ruleHTTP)theEObject;
        T result = caseruleHTTP(ruleHTTP);
        if (result == null) result = caseProtocol(ruleHTTP);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RULE_HTTP_URL:
      {
        ruleHTTP_URL ruleHTTP_URL = (ruleHTTP_URL)theEObject;
        T result = caseruleHTTP_URL(ruleHTTP_URL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RadlPackage.RULE_XMLRPC:
      {
        ruleXMLRPC ruleXMLRPC = (ruleXMLRPC)theEObject;
        T result = caseruleXMLRPC(ruleXMLRPC);
        if (result == null) result = caseProtocol(ruleXMLRPC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RADL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RADL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRADL(RADL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Adapter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Adapter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceAdapter(ResourceAdapter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigurationParam(ConfigurationParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBindingParam(BindingParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supported Child Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supported Child Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupportedChildType(SupportedChildType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allowed Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allowed Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllowedType(AllowedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocol(Protocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterType(ParameterType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule SSH</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule SSH</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseruleSSH(ruleSSH object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule Java Wrapper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule Java Wrapper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseruleJavaWrapper(ruleJavaWrapper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>entry Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>entry Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseentryCommand(entryCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rul Java param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rul Java param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserulJava_param(rulJava_param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rul Java param String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rul Java param String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserulJava_paramString(rulJava_paramString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rul Java param Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rul Java param Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserulJava_paramInt(rulJava_paramInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rul Java para Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rul Java para Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserulJava_paraScript(rulJava_paraScript object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assign Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assign Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassignCommand(assignCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>script Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>script Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casescriptParam(scriptParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rul SSH commands</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rul SSH commands</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserulSSH_commands(rulSSH_commands object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule HTTP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule HTTP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseruleHTTP(ruleHTTP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule HTTP URL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule HTTP URL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseruleHTTP_URL(ruleHTTP_URL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rule XMLRPC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rule XMLRPC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseruleXMLRPC(ruleXMLRPC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RadlSwitch
