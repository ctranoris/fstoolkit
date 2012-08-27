/**
 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import gr.upatras.ece.wcl.radl2.radl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RadlFactoryImpl extends EFactoryImpl implements RadlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RadlFactory init()
  {
    try
    {
      RadlFactory theRadlFactory = (RadlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.upatras.gr/ece/wcl/radl2/Radl"); 
      if (theRadlFactory != null)
      {
        return theRadlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RadlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RadlPackage.RADL: return createRADL();
      case RadlPackage.IMPORT: return createImport();
      case RadlPackage.RESOURCE_ADAPTER: return createResourceAdapter();
      case RadlPackage.CONFIGURATION_PARAM: return createConfigurationParam();
      case RadlPackage.BINDING_PARAM: return createBindingParam();
      case RadlPackage.SUPPORTED_CHILD_TYPE: return createSupportedChildType();
      case RadlPackage.ALLOWED_TYPE: return createAllowedType();
      case RadlPackage.PROTOCOL: return createProtocol();
      case RadlPackage.PARAMETER_TYPE: return createParameterType();
      case RadlPackage.RULE_SSH: return createruleSSH();
      case RadlPackage.RULE_JAVA_WRAPPER: return createruleJavaWrapper();
      case RadlPackage.COMMAND: return createCommand();
      case RadlPackage.ENTRY_COMMAND: return createentryCommand();
      case RadlPackage.RUL_JAVA_PARAM: return createrulJava_param();
      case RadlPackage.RUL_JAVA_PARAM_STRING: return createrulJava_paramString();
      case RadlPackage.RUL_JAVA_PARAM_INT: return createrulJava_paramInt();
      case RadlPackage.RUL_JAVA_PARA_SCRIPT: return createrulJava_paraScript();
      case RadlPackage.ASSIGN_COMMAND: return createassignCommand();
      case RadlPackage.SCRIPT_PARAM: return createscriptParam();
      case RadlPackage.RUL_SSH_COMMANDS: return createrulSSH_commands();
      case RadlPackage.RULE_HTTP: return createruleHTTP();
      case RadlPackage.RULE_HTTP_URL: return createruleHTTP_URL();
      case RadlPackage.RULE_XMLRPC: return createruleXMLRPC();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RADL createRADL()
  {
    RADLImpl radl = new RADLImpl();
    return radl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceAdapter createResourceAdapter()
  {
    ResourceAdapterImpl resourceAdapter = new ResourceAdapterImpl();
    return resourceAdapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationParam createConfigurationParam()
  {
    ConfigurationParamImpl configurationParam = new ConfigurationParamImpl();
    return configurationParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingParam createBindingParam()
  {
    BindingParamImpl bindingParam = new BindingParamImpl();
    return bindingParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportedChildType createSupportedChildType()
  {
    SupportedChildTypeImpl supportedChildType = new SupportedChildTypeImpl();
    return supportedChildType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllowedType createAllowedType()
  {
    AllowedTypeImpl allowedType = new AllowedTypeImpl();
    return allowedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType createParameterType()
  {
    ParameterTypeImpl parameterType = new ParameterTypeImpl();
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ruleSSH createruleSSH()
  {
    ruleSSHImpl ruleSSH = new ruleSSHImpl();
    return ruleSSH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ruleJavaWrapper createruleJavaWrapper()
  {
    ruleJavaWrapperImpl ruleJavaWrapper = new ruleJavaWrapperImpl();
    return ruleJavaWrapper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public entryCommand createentryCommand()
  {
    entryCommandImpl entryCommand = new entryCommandImpl();
    return entryCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rulJava_param createrulJava_param()
  {
    rulJava_paramImpl rulJava_param = new rulJava_paramImpl();
    return rulJava_param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rulJava_paramString createrulJava_paramString()
  {
    rulJava_paramStringImpl rulJava_paramString = new rulJava_paramStringImpl();
    return rulJava_paramString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rulJava_paramInt createrulJava_paramInt()
  {
    rulJava_paramIntImpl rulJava_paramInt = new rulJava_paramIntImpl();
    return rulJava_paramInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rulJava_paraScript createrulJava_paraScript()
  {
    rulJava_paraScriptImpl rulJava_paraScript = new rulJava_paraScriptImpl();
    return rulJava_paraScript;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignCommand createassignCommand()
  {
    assignCommandImpl assignCommand = new assignCommandImpl();
    return assignCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public scriptParam createscriptParam()
  {
    scriptParamImpl scriptParam = new scriptParamImpl();
    return scriptParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rulSSH_commands createrulSSH_commands()
  {
    rulSSH_commandsImpl rulSSH_commands = new rulSSH_commandsImpl();
    return rulSSH_commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ruleHTTP createruleHTTP()
  {
    ruleHTTPImpl ruleHTTP = new ruleHTTPImpl();
    return ruleHTTP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ruleHTTP_URL createruleHTTP_URL()
  {
    ruleHTTP_URLImpl ruleHTTP_URL = new ruleHTTP_URLImpl();
    return ruleHTTP_URL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ruleXMLRPC createruleXMLRPC()
  {
    ruleXMLRPCImpl ruleXMLRPC = new ruleXMLRPCImpl();
    return ruleXMLRPC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadlPackage getRadlPackage()
  {
    return (RadlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RadlPackage getPackage()
  {
    return RadlPackage.eINSTANCE;
  }

} //RadlFactoryImpl
