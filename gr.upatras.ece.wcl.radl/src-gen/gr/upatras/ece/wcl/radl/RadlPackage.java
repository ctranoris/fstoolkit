/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gr.upatras.ece.wcl.radl.RadlFactory
 * @model kind="package"
 * @generated
 */
public interface RadlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "radl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.upatras.gr/ece/wcl/Radl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "radl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RadlPackage eINSTANCE = gr.upatras.ece.wcl.radl.impl.RadlPackageImpl.init();

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.RADLImpl <em>RADL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.RADLImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getRADL()
   * @generated
   */
  int RADL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Resource Adapter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADL__RESOURCE_ADAPTER = 1;

  /**
   * The number of structural features of the '<em>RADL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ImportImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ResourceAdapterImpl <em>Resource Adapter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ResourceAdapterImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getResourceAdapter()
   * @generated
   */
  int RESOURCE_ADAPTER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER__NAME = 0;

  /**
   * The feature id for the '<em><b>Implname</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER__IMPLNAME = 1;

  /**
   * The feature id for the '<em><b>Conf Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER__CONF_PARAMS = 2;

  /**
   * The feature id for the '<em><b>Bind Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER__BIND_PARAMS = 3;

  /**
   * The feature id for the '<em><b>Child Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER__CHILD_PARAMS = 4;

  /**
   * The feature id for the '<em><b>Allow Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER__ALLOW_PARAMS = 5;

  /**
   * The feature id for the '<em><b>Conf Complete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER__CONF_COMPLETE = 6;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER__PROTOCOL = 7;

  /**
   * The number of structural features of the '<em>Resource Adapter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_ADAPTER_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.scriptParamImpl <em>script Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.scriptParamImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getscriptParam()
   * @generated
   */
  int SCRIPT_PARAM = 18;

  /**
   * The feature id for the '<em><b>Param Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARAM__PARAM_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARAM__NAME = 1;

  /**
   * The feature id for the '<em><b>Def Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARAM__DEF_VALUE = 2;

  /**
   * The feature id for the '<em><b>Description Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARAM__DESCRIPTION_VALUE = 3;

  /**
   * The number of structural features of the '<em>script Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_PARAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ConfigurationParamImpl <em>Configuration Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ConfigurationParamImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getConfigurationParam()
   * @generated
   */
  int CONFIGURATION_PARAM = 3;

  /**
   * The feature id for the '<em><b>Param Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAM__PARAM_TYPE = SCRIPT_PARAM__PARAM_TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAM__NAME = SCRIPT_PARAM__NAME;

  /**
   * The feature id for the '<em><b>Def Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAM__DEF_VALUE = SCRIPT_PARAM__DEF_VALUE;

  /**
   * The feature id for the '<em><b>Description Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAM__DESCRIPTION_VALUE = SCRIPT_PARAM__DESCRIPTION_VALUE;

  /**
   * The feature id for the '<em><b>Servsetting</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAM__SERVSETTING = SCRIPT_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Configuration Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_PARAM_FEATURE_COUNT = SCRIPT_PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.BindingParamImpl <em>Binding Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.BindingParamImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getBindingParam()
   * @generated
   */
  int BINDING_PARAM = 4;

  /**
   * The feature id for the '<em><b>Param Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_PARAM__PARAM_TYPE = SCRIPT_PARAM__PARAM_TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_PARAM__NAME = SCRIPT_PARAM__NAME;

  /**
   * The feature id for the '<em><b>Def Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_PARAM__DEF_VALUE = SCRIPT_PARAM__DEF_VALUE;

  /**
   * The feature id for the '<em><b>Description Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_PARAM__DESCRIPTION_VALUE = SCRIPT_PARAM__DESCRIPTION_VALUE;

  /**
   * The number of structural features of the '<em>Binding Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_PARAM_FEATURE_COUNT = SCRIPT_PARAM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.SupportedChildTypeImpl <em>Supported Child Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.SupportedChildTypeImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getSupportedChildType()
   * @generated
   */
  int SUPPORTED_CHILD_TYPE = 5;

  /**
   * The feature id for the '<em><b>Param Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTED_CHILD_TYPE__PARAM_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTED_CHILD_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Def Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTED_CHILD_TYPE__DEF_VALUE = 2;

  /**
   * The number of structural features of the '<em>Supported Child Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTED_CHILD_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.AllowedTypeImpl <em>Allowed Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.AllowedTypeImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getAllowedType()
   * @generated
   */
  int ALLOWED_TYPE = 6;

  /**
   * The feature id for the '<em><b>Param Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOWED_TYPE__PARAM_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOWED_TYPE__NAME = 1;

  /**
   * The feature id for the '<em><b>Def Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOWED_TYPE__DEF_VALUE = 2;

  /**
   * The number of structural features of the '<em>Allowed Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOWED_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ProtocolImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 7;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ParameterTypeImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getParameterType()
   * @generated
   */
  int PARAMETER_TYPE = 8;

  /**
   * The feature id for the '<em><b>PName</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE__PNAME = 0;

  /**
   * The number of structural features of the '<em>Parameter Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ruleSSHImpl <em>rule SSH</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ruleSSHImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleSSH()
   * @generated
   */
  int RULE_SSH = 9;

  /**
   * The feature id for the '<em><b>Remote Machine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SSH__REMOTE_MACHINE = PROTOCOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>RPort</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SSH__RPORT = PROTOCOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Username</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SSH__USERNAME = PROTOCOL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Password</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SSH__PASSWORD = PROTOCOL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SSH__COMMANDS = PROTOCOL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Commands Delete</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SSH__COMMANDS_DELETE = PROTOCOL_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>rule SSH</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SSH_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ruleJavaWrapperImpl <em>rule Java Wrapper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ruleJavaWrapperImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleJavaWrapper()
   * @generated
   */
  int RULE_JAVA_WRAPPER = 10;

  /**
   * The feature id for the '<em><b>Classname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_JAVA_WRAPPER__CLASSNAME = PROTOCOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constructor Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS = PROTOCOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_JAVA_WRAPPER__COMMANDS = PROTOCOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>rule Java Wrapper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_JAVA_WRAPPER_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.CommandImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 11;

  /**
   * The feature id for the '<em><b>Java Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__JAVA_FUNCTION_NAME = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__COMMANDS = 1;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.entryCommandImpl <em>entry Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.entryCommandImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getentryCommand()
   * @generated
   */
  int ENTRY_COMMAND = 12;

  /**
   * The feature id for the '<em><b>Java Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_COMMAND__JAVA_FUNCTION_NAME = COMMAND__JAVA_FUNCTION_NAME;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_COMMAND__COMMANDS = COMMAND__COMMANDS;

  /**
   * The number of structural features of the '<em>entry Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.rulJava_paramImpl <em>rul Java param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.rulJava_paramImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulJava_param()
   * @generated
   */
  int RUL_JAVA_PARAM = 13;

  /**
   * The number of structural features of the '<em>rul Java param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_JAVA_PARAM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.rulJava_paramStringImpl <em>rul Java param String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.rulJava_paramStringImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulJava_paramString()
   * @generated
   */
  int RUL_JAVA_PARAM_STRING = 14;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_JAVA_PARAM_STRING__STRING_VALUE = RUL_JAVA_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>rul Java param String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_JAVA_PARAM_STRING_FEATURE_COUNT = RUL_JAVA_PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.rulJava_paramIntImpl <em>rul Java param Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.rulJava_paramIntImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulJava_paramInt()
   * @generated
   */
  int RUL_JAVA_PARAM_INT = 15;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_JAVA_PARAM_INT__INT_VALUE = RUL_JAVA_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>rul Java param Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_JAVA_PARAM_INT_FEATURE_COUNT = RUL_JAVA_PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.rulJava_paraScriptImpl <em>rul Java para Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.rulJava_paraScriptImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulJava_paraScript()
   * @generated
   */
  int RUL_JAVA_PARA_SCRIPT = 16;

  /**
   * The feature id for the '<em><b>Scriptparam Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE = RUL_JAVA_PARAM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>rul Java para Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_JAVA_PARA_SCRIPT_FEATURE_COUNT = RUL_JAVA_PARAM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.assignCommandImpl <em>assign Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.assignCommandImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getassignCommand()
   * @generated
   */
  int ASSIGN_COMMAND = 17;

  /**
   * The feature id for the '<em><b>Java Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_COMMAND__JAVA_FUNCTION_NAME = COMMAND__JAVA_FUNCTION_NAME;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_COMMAND__COMMANDS = COMMAND__COMMANDS;

  /**
   * The feature id for the '<em><b>Script Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_COMMAND__SCRIPT_PARAM = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>assign Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGN_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.rulSSH_commandsImpl <em>rul SSH commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.rulSSH_commandsImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulSSH_commands()
   * @generated
   */
  int RUL_SSH_COMMANDS = 19;

  /**
   * The feature id for the '<em><b>Remote Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_SSH_COMMANDS__REMOTE_COMMAND = 0;

  /**
   * The feature id for the '<em><b>Scriptparams</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_SSH_COMMANDS__SCRIPTPARAMS = 1;

  /**
   * The number of structural features of the '<em>rul SSH commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RUL_SSH_COMMANDS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ruleHTTPImpl <em>rule HTTP</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ruleHTTPImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleHTTP()
   * @generated
   */
  int RULE_HTTP = 20;

  /**
   * The feature id for the '<em><b>Remote Machine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP__REMOTE_MACHINE = PROTOCOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Http URL</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP__HTTP_URL = PROTOCOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>HMethod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP__HMETHOD = PROTOCOL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Auth Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP__AUTH_METHOD = PROTOCOL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Username</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP__USERNAME = PROTOCOL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Password</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP__PASSWORD = PROTOCOL_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Post Body</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP__POST_BODY = PROTOCOL_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>rule HTTP</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ruleHTTP_URLImpl <em>rule HTTP URL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ruleHTTP_URLImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleHTTP_URL()
   * @generated
   */
  int RULE_HTTP_URL = 21;

  /**
   * The feature id for the '<em><b>Remote URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP_URL__REMOTE_URL = 0;

  /**
   * The feature id for the '<em><b>Scriptparams</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP_URL__SCRIPTPARAMS = 1;

  /**
   * The number of structural features of the '<em>rule HTTP URL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_HTTP_URL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gr.upatras.ece.wcl.radl.impl.ruleXMLRPCImpl <em>rule XMLRPC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gr.upatras.ece.wcl.radl.impl.ruleXMLRPCImpl
   * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleXMLRPC()
   * @generated
   */
  int RULE_XMLRPC = 22;

  /**
   * The feature id for the '<em><b>Remote Machine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_XMLRPC__REMOTE_MACHINE = PROTOCOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Username</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_XMLRPC__USERNAME = PROTOCOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Password</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_XMLRPC__PASSWORD = PROTOCOL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>RPC Method</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_XMLRPC__RPC_METHOD = PROTOCOL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>UR Lparams</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_XMLRPC__UR_LPARAMS = PROTOCOL_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>rule XMLRPC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_XMLRPC_FEATURE_COUNT = PROTOCOL_FEATURE_COUNT + 5;


  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.RADL <em>RADL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RADL</em>'.
   * @see gr.upatras.ece.wcl.radl.RADL
   * @generated
   */
  EClass getRADL();

  /**
   * Returns the meta object for the containment reference '{@link gr.upatras.ece.wcl.radl.RADL#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see gr.upatras.ece.wcl.radl.RADL#getImports()
   * @see #getRADL()
   * @generated
   */
  EReference getRADL_Imports();

  /**
   * Returns the meta object for the containment reference '{@link gr.upatras.ece.wcl.radl.RADL#getResourceAdapter <em>Resource Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Resource Adapter</em>'.
   * @see gr.upatras.ece.wcl.radl.RADL#getResourceAdapter()
   * @see #getRADL()
   * @generated
   */
  EReference getRADL_ResourceAdapter();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see gr.upatras.ece.wcl.radl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see gr.upatras.ece.wcl.radl.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.ResourceAdapter <em>Resource Adapter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Adapter</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter
   * @generated
   */
  EClass getResourceAdapter();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.ResourceAdapter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter#getName()
   * @see #getResourceAdapter()
   * @generated
   */
  EAttribute getResourceAdapter_Name();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ResourceAdapter#getImplname <em>Implname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Implname</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter#getImplname()
   * @see #getResourceAdapter()
   * @generated
   */
  EReference getResourceAdapter_Implname();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ResourceAdapter#getConfParams <em>Conf Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conf Params</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter#getConfParams()
   * @see #getResourceAdapter()
   * @generated
   */
  EReference getResourceAdapter_ConfParams();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ResourceAdapter#getBindParams <em>Bind Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bind Params</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter#getBindParams()
   * @see #getResourceAdapter()
   * @generated
   */
  EReference getResourceAdapter_BindParams();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ResourceAdapter#getChildParams <em>Child Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child Params</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter#getChildParams()
   * @see #getResourceAdapter()
   * @generated
   */
  EReference getResourceAdapter_ChildParams();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ResourceAdapter#getAllowParams <em>Allow Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Allow Params</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter#getAllowParams()
   * @see #getResourceAdapter()
   * @generated
   */
  EReference getResourceAdapter_AllowParams();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.ResourceAdapter#getConfComplete <em>Conf Complete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Conf Complete</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter#getConfComplete()
   * @see #getResourceAdapter()
   * @generated
   */
  EAttribute getResourceAdapter_ConfComplete();

  /**
   * Returns the meta object for the containment reference '{@link gr.upatras.ece.wcl.radl.ResourceAdapter#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Protocol</em>'.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter#getProtocol()
   * @see #getResourceAdapter()
   * @generated
   */
  EReference getResourceAdapter_Protocol();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.ConfigurationParam <em>Configuration Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Param</em>'.
   * @see gr.upatras.ece.wcl.radl.ConfigurationParam
   * @generated
   */
  EClass getConfigurationParam();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ConfigurationParam#getServsetting <em>Servsetting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Servsetting</em>'.
   * @see gr.upatras.ece.wcl.radl.ConfigurationParam#getServsetting()
   * @see #getConfigurationParam()
   * @generated
   */
  EReference getConfigurationParam_Servsetting();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.BindingParam <em>Binding Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding Param</em>'.
   * @see gr.upatras.ece.wcl.radl.BindingParam
   * @generated
   */
  EClass getBindingParam();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.SupportedChildType <em>Supported Child Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supported Child Type</em>'.
   * @see gr.upatras.ece.wcl.radl.SupportedChildType
   * @generated
   */
  EClass getSupportedChildType();

  /**
   * Returns the meta object for the containment reference '{@link gr.upatras.ece.wcl.radl.SupportedChildType#getParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param Type</em>'.
   * @see gr.upatras.ece.wcl.radl.SupportedChildType#getParamType()
   * @see #getSupportedChildType()
   * @generated
   */
  EReference getSupportedChildType_ParamType();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.SupportedChildType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gr.upatras.ece.wcl.radl.SupportedChildType#getName()
   * @see #getSupportedChildType()
   * @generated
   */
  EAttribute getSupportedChildType_Name();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.SupportedChildType#getDefValue <em>Def Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def Value</em>'.
   * @see gr.upatras.ece.wcl.radl.SupportedChildType#getDefValue()
   * @see #getSupportedChildType()
   * @generated
   */
  EAttribute getSupportedChildType_DefValue();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.AllowedType <em>Allowed Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allowed Type</em>'.
   * @see gr.upatras.ece.wcl.radl.AllowedType
   * @generated
   */
  EClass getAllowedType();

  /**
   * Returns the meta object for the containment reference '{@link gr.upatras.ece.wcl.radl.AllowedType#getParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param Type</em>'.
   * @see gr.upatras.ece.wcl.radl.AllowedType#getParamType()
   * @see #getAllowedType()
   * @generated
   */
  EReference getAllowedType_ParamType();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.AllowedType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gr.upatras.ece.wcl.radl.AllowedType#getName()
   * @see #getAllowedType()
   * @generated
   */
  EAttribute getAllowedType_Name();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.AllowedType#getDefValue <em>Def Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def Value</em>'.
   * @see gr.upatras.ece.wcl.radl.AllowedType#getDefValue()
   * @see #getAllowedType()
   * @generated
   */
  EAttribute getAllowedType_DefValue();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see gr.upatras.ece.wcl.radl.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Type</em>'.
   * @see gr.upatras.ece.wcl.radl.ParameterType
   * @generated
   */
  EClass getParameterType();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.ParameterType#getPName <em>PName</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>PName</em>'.
   * @see gr.upatras.ece.wcl.radl.ParameterType#getPName()
   * @see #getParameterType()
   * @generated
   */
  EAttribute getParameterType_PName();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.ruleSSH <em>rule SSH</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule SSH</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleSSH
   * @generated
   */
  EClass getruleSSH();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleSSH#getRemoteMachine <em>Remote Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Remote Machine</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleSSH#getRemoteMachine()
   * @see #getruleSSH()
   * @generated
   */
  EReference getruleSSH_RemoteMachine();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleSSH#getRPort <em>RPort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>RPort</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleSSH#getRPort()
   * @see #getruleSSH()
   * @generated
   */
  EReference getruleSSH_RPort();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleSSH#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Username</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleSSH#getUsername()
   * @see #getruleSSH()
   * @generated
   */
  EReference getruleSSH_Username();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleSSH#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Password</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleSSH#getPassword()
   * @see #getruleSSH()
   * @generated
   */
  EReference getruleSSH_Password();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ruleSSH#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleSSH#getCommands()
   * @see #getruleSSH()
   * @generated
   */
  EReference getruleSSH_Commands();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ruleSSH#getCommandsDelete <em>Commands Delete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands Delete</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleSSH#getCommandsDelete()
   * @see #getruleSSH()
   * @generated
   */
  EReference getruleSSH_CommandsDelete();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.ruleJavaWrapper <em>rule Java Wrapper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule Java Wrapper</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleJavaWrapper
   * @generated
   */
  EClass getruleJavaWrapper();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.ruleJavaWrapper#getClassname <em>Classname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Classname</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleJavaWrapper#getClassname()
   * @see #getruleJavaWrapper()
   * @generated
   */
  EAttribute getruleJavaWrapper_Classname();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ruleJavaWrapper#getConstructorParams <em>Constructor Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructor Params</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleJavaWrapper#getConstructorParams()
   * @see #getruleJavaWrapper()
   * @generated
   */
  EReference getruleJavaWrapper_ConstructorParams();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ruleJavaWrapper#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleJavaWrapper#getCommands()
   * @see #getruleJavaWrapper()
   * @generated
   */
  EReference getruleJavaWrapper_Commands();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see gr.upatras.ece.wcl.radl.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.Command#getJavaFunctionName <em>Java Function Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Function Name</em>'.
   * @see gr.upatras.ece.wcl.radl.Command#getJavaFunctionName()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_JavaFunctionName();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.Command#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see gr.upatras.ece.wcl.radl.Command#getCommands()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_Commands();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.entryCommand <em>entry Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>entry Command</em>'.
   * @see gr.upatras.ece.wcl.radl.entryCommand
   * @generated
   */
  EClass getentryCommand();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.rulJava_param <em>rul Java param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rul Java param</em>'.
   * @see gr.upatras.ece.wcl.radl.rulJava_param
   * @generated
   */
  EClass getrulJava_param();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.rulJava_paramString <em>rul Java param String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rul Java param String</em>'.
   * @see gr.upatras.ece.wcl.radl.rulJava_paramString
   * @generated
   */
  EClass getrulJava_paramString();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.rulJava_paramString#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see gr.upatras.ece.wcl.radl.rulJava_paramString#getStringValue()
   * @see #getrulJava_paramString()
   * @generated
   */
  EAttribute getrulJava_paramString_StringValue();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.rulJava_paramInt <em>rul Java param Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rul Java param Int</em>'.
   * @see gr.upatras.ece.wcl.radl.rulJava_paramInt
   * @generated
   */
  EClass getrulJava_paramInt();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.rulJava_paramInt#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see gr.upatras.ece.wcl.radl.rulJava_paramInt#getIntValue()
   * @see #getrulJava_paramInt()
   * @generated
   */
  EAttribute getrulJava_paramInt_IntValue();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.rulJava_paraScript <em>rul Java para Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rul Java para Script</em>'.
   * @see gr.upatras.ece.wcl.radl.rulJava_paraScript
   * @generated
   */
  EClass getrulJava_paraScript();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.rulJava_paraScript#getScriptparamValue <em>Scriptparam Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scriptparam Value</em>'.
   * @see gr.upatras.ece.wcl.radl.rulJava_paraScript#getScriptparamValue()
   * @see #getrulJava_paraScript()
   * @generated
   */
  EReference getrulJava_paraScript_ScriptparamValue();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.assignCommand <em>assign Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assign Command</em>'.
   * @see gr.upatras.ece.wcl.radl.assignCommand
   * @generated
   */
  EClass getassignCommand();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.assignCommand#getScriptParam <em>Script Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Script Param</em>'.
   * @see gr.upatras.ece.wcl.radl.assignCommand#getScriptParam()
   * @see #getassignCommand()
   * @generated
   */
  EReference getassignCommand_ScriptParam();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.scriptParam <em>script Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>script Param</em>'.
   * @see gr.upatras.ece.wcl.radl.scriptParam
   * @generated
   */
  EClass getscriptParam();

  /**
   * Returns the meta object for the containment reference '{@link gr.upatras.ece.wcl.radl.scriptParam#getParamType <em>Param Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param Type</em>'.
   * @see gr.upatras.ece.wcl.radl.scriptParam#getParamType()
   * @see #getscriptParam()
   * @generated
   */
  EReference getscriptParam_ParamType();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.scriptParam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gr.upatras.ece.wcl.radl.scriptParam#getName()
   * @see #getscriptParam()
   * @generated
   */
  EAttribute getscriptParam_Name();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.scriptParam#getDefValue <em>Def Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def Value</em>'.
   * @see gr.upatras.ece.wcl.radl.scriptParam#getDefValue()
   * @see #getscriptParam()
   * @generated
   */
  EAttribute getscriptParam_DefValue();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.scriptParam#getDescriptionValue <em>Description Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description Value</em>'.
   * @see gr.upatras.ece.wcl.radl.scriptParam#getDescriptionValue()
   * @see #getscriptParam()
   * @generated
   */
  EAttribute getscriptParam_DescriptionValue();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.rulSSH_commands <em>rul SSH commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rul SSH commands</em>'.
   * @see gr.upatras.ece.wcl.radl.rulSSH_commands
   * @generated
   */
  EClass getrulSSH_commands();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.rulSSH_commands#getRemoteCommand <em>Remote Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remote Command</em>'.
   * @see gr.upatras.ece.wcl.radl.rulSSH_commands#getRemoteCommand()
   * @see #getrulSSH_commands()
   * @generated
   */
  EAttribute getrulSSH_commands_RemoteCommand();

  /**
   * Returns the meta object for the reference list '{@link gr.upatras.ece.wcl.radl.rulSSH_commands#getScriptparams <em>Scriptparams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Scriptparams</em>'.
   * @see gr.upatras.ece.wcl.radl.rulSSH_commands#getScriptparams()
   * @see #getrulSSH_commands()
   * @generated
   */
  EReference getrulSSH_commands_Scriptparams();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.ruleHTTP <em>rule HTTP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule HTTP</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP
   * @generated
   */
  EClass getruleHTTP();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleHTTP#getRemoteMachine <em>Remote Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Remote Machine</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP#getRemoteMachine()
   * @see #getruleHTTP()
   * @generated
   */
  EReference getruleHTTP_RemoteMachine();

  /**
   * Returns the meta object for the containment reference list '{@link gr.upatras.ece.wcl.radl.ruleHTTP#getHttpURL <em>Http URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Http URL</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP#getHttpURL()
   * @see #getruleHTTP()
   * @generated
   */
  EReference getruleHTTP_HttpURL();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.ruleHTTP#getHMethod <em>HMethod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>HMethod</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP#getHMethod()
   * @see #getruleHTTP()
   * @generated
   */
  EAttribute getruleHTTP_HMethod();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleHTTP#getAuthMethod <em>Auth Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Auth Method</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP#getAuthMethod()
   * @see #getruleHTTP()
   * @generated
   */
  EReference getruleHTTP_AuthMethod();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleHTTP#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Username</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP#getUsername()
   * @see #getruleHTTP()
   * @generated
   */
  EReference getruleHTTP_Username();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleHTTP#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Password</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP#getPassword()
   * @see #getruleHTTP()
   * @generated
   */
  EReference getruleHTTP_Password();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleHTTP#getPostBody <em>Post Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Post Body</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP#getPostBody()
   * @see #getruleHTTP()
   * @generated
   */
  EReference getruleHTTP_PostBody();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.ruleHTTP_URL <em>rule HTTP URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule HTTP URL</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP_URL
   * @generated
   */
  EClass getruleHTTP_URL();

  /**
   * Returns the meta object for the attribute '{@link gr.upatras.ece.wcl.radl.ruleHTTP_URL#getRemoteURL <em>Remote URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remote URL</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP_URL#getRemoteURL()
   * @see #getruleHTTP_URL()
   * @generated
   */
  EAttribute getruleHTTP_URL_RemoteURL();

  /**
   * Returns the meta object for the reference list '{@link gr.upatras.ece.wcl.radl.ruleHTTP_URL#getScriptparams <em>Scriptparams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Scriptparams</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP_URL#getScriptparams()
   * @see #getruleHTTP_URL()
   * @generated
   */
  EReference getruleHTTP_URL_Scriptparams();

  /**
   * Returns the meta object for class '{@link gr.upatras.ece.wcl.radl.ruleXMLRPC <em>rule XMLRPC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rule XMLRPC</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleXMLRPC
   * @generated
   */
  EClass getruleXMLRPC();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleXMLRPC#getRemoteMachine <em>Remote Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Remote Machine</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleXMLRPC#getRemoteMachine()
   * @see #getruleXMLRPC()
   * @generated
   */
  EReference getruleXMLRPC_RemoteMachine();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleXMLRPC#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Username</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleXMLRPC#getUsername()
   * @see #getruleXMLRPC()
   * @generated
   */
  EReference getruleXMLRPC_Username();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleXMLRPC#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Password</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleXMLRPC#getPassword()
   * @see #getruleXMLRPC()
   * @generated
   */
  EReference getruleXMLRPC_Password();

  /**
   * Returns the meta object for the reference '{@link gr.upatras.ece.wcl.radl.ruleXMLRPC#getRPCMethod <em>RPC Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>RPC Method</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleXMLRPC#getRPCMethod()
   * @see #getruleXMLRPC()
   * @generated
   */
  EReference getruleXMLRPC_RPCMethod();

  /**
   * Returns the meta object for the reference list '{@link gr.upatras.ece.wcl.radl.ruleXMLRPC#getURLparams <em>UR Lparams</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>UR Lparams</em>'.
   * @see gr.upatras.ece.wcl.radl.ruleXMLRPC#getURLparams()
   * @see #getruleXMLRPC()
   * @generated
   */
  EReference getruleXMLRPC_URLparams();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RadlFactory getRadlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.RADLImpl <em>RADL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.RADLImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getRADL()
     * @generated
     */
    EClass RADL = eINSTANCE.getRADL();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADL__IMPORTS = eINSTANCE.getRADL_Imports();

    /**
     * The meta object literal for the '<em><b>Resource Adapter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RADL__RESOURCE_ADAPTER = eINSTANCE.getRADL_ResourceAdapter();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ImportImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ResourceAdapterImpl <em>Resource Adapter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ResourceAdapterImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getResourceAdapter()
     * @generated
     */
    EClass RESOURCE_ADAPTER = eINSTANCE.getResourceAdapter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_ADAPTER__NAME = eINSTANCE.getResourceAdapter_Name();

    /**
     * The meta object literal for the '<em><b>Implname</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_ADAPTER__IMPLNAME = eINSTANCE.getResourceAdapter_Implname();

    /**
     * The meta object literal for the '<em><b>Conf Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_ADAPTER__CONF_PARAMS = eINSTANCE.getResourceAdapter_ConfParams();

    /**
     * The meta object literal for the '<em><b>Bind Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_ADAPTER__BIND_PARAMS = eINSTANCE.getResourceAdapter_BindParams();

    /**
     * The meta object literal for the '<em><b>Child Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_ADAPTER__CHILD_PARAMS = eINSTANCE.getResourceAdapter_ChildParams();

    /**
     * The meta object literal for the '<em><b>Allow Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_ADAPTER__ALLOW_PARAMS = eINSTANCE.getResourceAdapter_AllowParams();

    /**
     * The meta object literal for the '<em><b>Conf Complete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESOURCE_ADAPTER__CONF_COMPLETE = eINSTANCE.getResourceAdapter_ConfComplete();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESOURCE_ADAPTER__PROTOCOL = eINSTANCE.getResourceAdapter_Protocol();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ConfigurationParamImpl <em>Configuration Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ConfigurationParamImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getConfigurationParam()
     * @generated
     */
    EClass CONFIGURATION_PARAM = eINSTANCE.getConfigurationParam();

    /**
     * The meta object literal for the '<em><b>Servsetting</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION_PARAM__SERVSETTING = eINSTANCE.getConfigurationParam_Servsetting();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.BindingParamImpl <em>Binding Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.BindingParamImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getBindingParam()
     * @generated
     */
    EClass BINDING_PARAM = eINSTANCE.getBindingParam();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.SupportedChildTypeImpl <em>Supported Child Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.SupportedChildTypeImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getSupportedChildType()
     * @generated
     */
    EClass SUPPORTED_CHILD_TYPE = eINSTANCE.getSupportedChildType();

    /**
     * The meta object literal for the '<em><b>Param Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPPORTED_CHILD_TYPE__PARAM_TYPE = eINSTANCE.getSupportedChildType_ParamType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPPORTED_CHILD_TYPE__NAME = eINSTANCE.getSupportedChildType_Name();

    /**
     * The meta object literal for the '<em><b>Def Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUPPORTED_CHILD_TYPE__DEF_VALUE = eINSTANCE.getSupportedChildType_DefValue();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.AllowedTypeImpl <em>Allowed Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.AllowedTypeImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getAllowedType()
     * @generated
     */
    EClass ALLOWED_TYPE = eINSTANCE.getAllowedType();

    /**
     * The meta object literal for the '<em><b>Param Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALLOWED_TYPE__PARAM_TYPE = eINSTANCE.getAllowedType_ParamType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLOWED_TYPE__NAME = eINSTANCE.getAllowedType_Name();

    /**
     * The meta object literal for the '<em><b>Def Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLOWED_TYPE__DEF_VALUE = eINSTANCE.getAllowedType_DefValue();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ProtocolImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ParameterTypeImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getParameterType()
     * @generated
     */
    EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

    /**
     * The meta object literal for the '<em><b>PName</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_TYPE__PNAME = eINSTANCE.getParameterType_PName();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ruleSSHImpl <em>rule SSH</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ruleSSHImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleSSH()
     * @generated
     */
    EClass RULE_SSH = eINSTANCE.getruleSSH();

    /**
     * The meta object literal for the '<em><b>Remote Machine</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SSH__REMOTE_MACHINE = eINSTANCE.getruleSSH_RemoteMachine();

    /**
     * The meta object literal for the '<em><b>RPort</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SSH__RPORT = eINSTANCE.getruleSSH_RPort();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SSH__USERNAME = eINSTANCE.getruleSSH_Username();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SSH__PASSWORD = eINSTANCE.getruleSSH_Password();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SSH__COMMANDS = eINSTANCE.getruleSSH_Commands();

    /**
     * The meta object literal for the '<em><b>Commands Delete</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SSH__COMMANDS_DELETE = eINSTANCE.getruleSSH_CommandsDelete();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ruleJavaWrapperImpl <em>rule Java Wrapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ruleJavaWrapperImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleJavaWrapper()
     * @generated
     */
    EClass RULE_JAVA_WRAPPER = eINSTANCE.getruleJavaWrapper();

    /**
     * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_JAVA_WRAPPER__CLASSNAME = eINSTANCE.getruleJavaWrapper_Classname();

    /**
     * The meta object literal for the '<em><b>Constructor Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS = eINSTANCE.getruleJavaWrapper_ConstructorParams();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_JAVA_WRAPPER__COMMANDS = eINSTANCE.getruleJavaWrapper_Commands();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.CommandImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Java Function Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__JAVA_FUNCTION_NAME = eINSTANCE.getCommand_JavaFunctionName();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__COMMANDS = eINSTANCE.getCommand_Commands();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.entryCommandImpl <em>entry Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.entryCommandImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getentryCommand()
     * @generated
     */
    EClass ENTRY_COMMAND = eINSTANCE.getentryCommand();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.rulJava_paramImpl <em>rul Java param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.rulJava_paramImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulJava_param()
     * @generated
     */
    EClass RUL_JAVA_PARAM = eINSTANCE.getrulJava_param();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.rulJava_paramStringImpl <em>rul Java param String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.rulJava_paramStringImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulJava_paramString()
     * @generated
     */
    EClass RUL_JAVA_PARAM_STRING = eINSTANCE.getrulJava_paramString();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUL_JAVA_PARAM_STRING__STRING_VALUE = eINSTANCE.getrulJava_paramString_StringValue();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.rulJava_paramIntImpl <em>rul Java param Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.rulJava_paramIntImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulJava_paramInt()
     * @generated
     */
    EClass RUL_JAVA_PARAM_INT = eINSTANCE.getrulJava_paramInt();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUL_JAVA_PARAM_INT__INT_VALUE = eINSTANCE.getrulJava_paramInt_IntValue();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.rulJava_paraScriptImpl <em>rul Java para Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.rulJava_paraScriptImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulJava_paraScript()
     * @generated
     */
    EClass RUL_JAVA_PARA_SCRIPT = eINSTANCE.getrulJava_paraScript();

    /**
     * The meta object literal for the '<em><b>Scriptparam Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE = eINSTANCE.getrulJava_paraScript_ScriptparamValue();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.assignCommandImpl <em>assign Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.assignCommandImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getassignCommand()
     * @generated
     */
    EClass ASSIGN_COMMAND = eINSTANCE.getassignCommand();

    /**
     * The meta object literal for the '<em><b>Script Param</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGN_COMMAND__SCRIPT_PARAM = eINSTANCE.getassignCommand_ScriptParam();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.scriptParamImpl <em>script Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.scriptParamImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getscriptParam()
     * @generated
     */
    EClass SCRIPT_PARAM = eINSTANCE.getscriptParam();

    /**
     * The meta object literal for the '<em><b>Param Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT_PARAM__PARAM_TYPE = eINSTANCE.getscriptParam_ParamType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_PARAM__NAME = eINSTANCE.getscriptParam_Name();

    /**
     * The meta object literal for the '<em><b>Def Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_PARAM__DEF_VALUE = eINSTANCE.getscriptParam_DefValue();

    /**
     * The meta object literal for the '<em><b>Description Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT_PARAM__DESCRIPTION_VALUE = eINSTANCE.getscriptParam_DescriptionValue();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.rulSSH_commandsImpl <em>rul SSH commands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.rulSSH_commandsImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getrulSSH_commands()
     * @generated
     */
    EClass RUL_SSH_COMMANDS = eINSTANCE.getrulSSH_commands();

    /**
     * The meta object literal for the '<em><b>Remote Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RUL_SSH_COMMANDS__REMOTE_COMMAND = eINSTANCE.getrulSSH_commands_RemoteCommand();

    /**
     * The meta object literal for the '<em><b>Scriptparams</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RUL_SSH_COMMANDS__SCRIPTPARAMS = eINSTANCE.getrulSSH_commands_Scriptparams();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ruleHTTPImpl <em>rule HTTP</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ruleHTTPImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleHTTP()
     * @generated
     */
    EClass RULE_HTTP = eINSTANCE.getruleHTTP();

    /**
     * The meta object literal for the '<em><b>Remote Machine</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_HTTP__REMOTE_MACHINE = eINSTANCE.getruleHTTP_RemoteMachine();

    /**
     * The meta object literal for the '<em><b>Http URL</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_HTTP__HTTP_URL = eINSTANCE.getruleHTTP_HttpURL();

    /**
     * The meta object literal for the '<em><b>HMethod</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_HTTP__HMETHOD = eINSTANCE.getruleHTTP_HMethod();

    /**
     * The meta object literal for the '<em><b>Auth Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_HTTP__AUTH_METHOD = eINSTANCE.getruleHTTP_AuthMethod();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_HTTP__USERNAME = eINSTANCE.getruleHTTP_Username();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_HTTP__PASSWORD = eINSTANCE.getruleHTTP_Password();

    /**
     * The meta object literal for the '<em><b>Post Body</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_HTTP__POST_BODY = eINSTANCE.getruleHTTP_PostBody();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ruleHTTP_URLImpl <em>rule HTTP URL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ruleHTTP_URLImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleHTTP_URL()
     * @generated
     */
    EClass RULE_HTTP_URL = eINSTANCE.getruleHTTP_URL();

    /**
     * The meta object literal for the '<em><b>Remote URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_HTTP_URL__REMOTE_URL = eINSTANCE.getruleHTTP_URL_RemoteURL();

    /**
     * The meta object literal for the '<em><b>Scriptparams</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_HTTP_URL__SCRIPTPARAMS = eINSTANCE.getruleHTTP_URL_Scriptparams();

    /**
     * The meta object literal for the '{@link gr.upatras.ece.wcl.radl.impl.ruleXMLRPCImpl <em>rule XMLRPC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gr.upatras.ece.wcl.radl.impl.ruleXMLRPCImpl
     * @see gr.upatras.ece.wcl.radl.impl.RadlPackageImpl#getruleXMLRPC()
     * @generated
     */
    EClass RULE_XMLRPC = eINSTANCE.getruleXMLRPC();

    /**
     * The meta object literal for the '<em><b>Remote Machine</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_XMLRPC__REMOTE_MACHINE = eINSTANCE.getruleXMLRPC_RemoteMachine();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_XMLRPC__USERNAME = eINSTANCE.getruleXMLRPC_Username();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_XMLRPC__PASSWORD = eINSTANCE.getruleXMLRPC_Password();

    /**
     * The meta object literal for the '<em><b>RPC Method</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_XMLRPC__RPC_METHOD = eINSTANCE.getruleXMLRPC_RPCMethod();

    /**
     * The meta object literal for the '<em><b>UR Lparams</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_XMLRPC__UR_LPARAMS = eINSTANCE.getruleXMLRPC_URLparams();

  }

} //RadlPackage
