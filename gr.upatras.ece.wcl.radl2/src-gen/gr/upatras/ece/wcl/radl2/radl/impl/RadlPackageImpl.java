/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl.impl;

import FederationOffice.FederationOfficePackage;

import FederationOffice.services.ServicesPackage;

import gr.upatras.ece.wcl.radl2.radl.AllowedType;
import gr.upatras.ece.wcl.radl2.radl.BindingParam;
import gr.upatras.ece.wcl.radl2.radl.Command;
import gr.upatras.ece.wcl.radl2.radl.ConfigurationParam;
import gr.upatras.ece.wcl.radl2.radl.Import;
import gr.upatras.ece.wcl.radl2.radl.ParameterType;
import gr.upatras.ece.wcl.radl2.radl.Protocol;
import gr.upatras.ece.wcl.radl2.radl.RadlFactory;
import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.ResourceAdapter;
import gr.upatras.ece.wcl.radl2.radl.SupportedChildType;
import gr.upatras.ece.wcl.radl2.radl.assignCommand;
import gr.upatras.ece.wcl.radl2.radl.entryCommand;
import gr.upatras.ece.wcl.radl2.radl.rulJava_paraScript;
import gr.upatras.ece.wcl.radl2.radl.rulJava_param;
import gr.upatras.ece.wcl.radl2.radl.rulJava_paramInt;
import gr.upatras.ece.wcl.radl2.radl.rulJava_paramString;
import gr.upatras.ece.wcl.radl2.radl.rulSSH_commands;
import gr.upatras.ece.wcl.radl2.radl.ruleHTTP;
import gr.upatras.ece.wcl.radl2.radl.ruleHTTP_URL;
import gr.upatras.ece.wcl.radl2.radl.ruleJavaWrapper;
import gr.upatras.ece.wcl.radl2.radl.ruleSSH;
import gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC;
import gr.upatras.ece.wcl.radl2.radl.scriptParam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RadlPackageImpl extends EPackageImpl implements RadlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass radlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resourceAdapterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supportedChildTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allowedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass protocolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleSSHEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleJavaWrapperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entryCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulJava_paramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulJava_paramStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulJava_paramIntEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulJava_paraScriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptParamEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rulSSH_commandsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleHTTPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleHTTP_URLEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleXMLRPCEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RadlPackageImpl()
  {
    super(eNS_URI, RadlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RadlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RadlPackage init()
  {
    if (isInited) return (RadlPackage)EPackage.Registry.INSTANCE.getEPackage(RadlPackage.eNS_URI);

    // Obtain or create and register package
    RadlPackageImpl theRadlPackage = (RadlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RadlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RadlPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    FederationOfficePackage.eINSTANCE.eClass();
    ServicesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theRadlPackage.createPackageContents();

    // Initialize created meta-data
    theRadlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRadlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RadlPackage.eNS_URI, theRadlPackage);
    return theRadlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRADL()
  {
    return radlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRADL_Imports()
  {
    return (EReference)radlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRADL_ResourceAdapter()
  {
    return (EReference)radlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportURI()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResourceAdapter()
  {
    return resourceAdapterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAdapter_Name()
  {
    return (EAttribute)resourceAdapterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceAdapter_Implname()
  {
    return (EReference)resourceAdapterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceAdapter_Byoffice()
  {
    return (EReference)resourceAdapterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceAdapter_ConfParams()
  {
    return (EReference)resourceAdapterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceAdapter_BindParams()
  {
    return (EReference)resourceAdapterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceAdapter_ChildParams()
  {
    return (EReference)resourceAdapterEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceAdapter_AllowParams()
  {
    return (EReference)resourceAdapterEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResourceAdapter_ConfComplete()
  {
    return (EAttribute)resourceAdapterEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResourceAdapter_Protocol()
  {
    return (EReference)resourceAdapterEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurationParam()
  {
    return configurationParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindingParam()
  {
    return bindingParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSupportedChildType()
  {
    return supportedChildTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSupportedChildType_ParamType()
  {
    return (EReference)supportedChildTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSupportedChildType_Name()
  {
    return (EAttribute)supportedChildTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSupportedChildType_DefValue()
  {
    return (EAttribute)supportedChildTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAllowedType()
  {
    return allowedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAllowedType_ParamType()
  {
    return (EReference)allowedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllowedType_Name()
  {
    return (EAttribute)allowedTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAllowedType_DefValue()
  {
    return (EAttribute)allowedTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProtocol()
  {
    return protocolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterType()
  {
    return parameterTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameterType_PName()
  {
    return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getruleSSH()
  {
    return ruleSSHEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleSSH_RemoteMachine()
  {
    return (EReference)ruleSSHEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleSSH_RPort()
  {
    return (EReference)ruleSSHEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleSSH_Username()
  {
    return (EReference)ruleSSHEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleSSH_Password()
  {
    return (EReference)ruleSSHEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleSSH_Commands()
  {
    return (EReference)ruleSSHEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleSSH_CommandsDelete()
  {
    return (EReference)ruleSSHEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getruleJavaWrapper()
  {
    return ruleJavaWrapperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getruleJavaWrapper_Classname()
  {
    return (EAttribute)ruleJavaWrapperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleJavaWrapper_ConstructorParams()
  {
    return (EReference)ruleJavaWrapperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleJavaWrapper_Commands()
  {
    return (EReference)ruleJavaWrapperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCommand_JavaFunctionName()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCommand_Commands()
  {
    return (EReference)commandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getentryCommand()
  {
    return entryCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrulJava_param()
  {
    return rulJava_paramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrulJava_paramString()
  {
    return rulJava_paramStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrulJava_paramString_StringValue()
  {
    return (EAttribute)rulJava_paramStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrulJava_paramInt()
  {
    return rulJava_paramIntEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrulJava_paramInt_IntValue()
  {
    return (EAttribute)rulJava_paramIntEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrulJava_paraScript()
  {
    return rulJava_paraScriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrulJava_paraScript_ScriptparamValue()
  {
    return (EReference)rulJava_paraScriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getassignCommand()
  {
    return assignCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getassignCommand_ScriptParam()
  {
    return (EReference)assignCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getscriptParam()
  {
    return scriptParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getscriptParam_ParamType()
  {
    return (EReference)scriptParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getscriptParam_Name()
  {
    return (EAttribute)scriptParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getscriptParam_DefValue()
  {
    return (EAttribute)scriptParamEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getscriptParam_DescriptionValue()
  {
    return (EAttribute)scriptParamEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrulSSH_commands()
  {
    return rulSSH_commandsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrulSSH_commands_RemoteCommand()
  {
    return (EAttribute)rulSSH_commandsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getrulSSH_commands_Scriptparams()
  {
    return (EReference)rulSSH_commandsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getruleHTTP()
  {
    return ruleHTTPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleHTTP_RemoteMachine()
  {
    return (EReference)ruleHTTPEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleHTTP_HttpURL()
  {
    return (EReference)ruleHTTPEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getruleHTTP_HMethod()
  {
    return (EAttribute)ruleHTTPEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleHTTP_AuthMethod()
  {
    return (EReference)ruleHTTPEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleHTTP_Username()
  {
    return (EReference)ruleHTTPEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleHTTP_Password()
  {
    return (EReference)ruleHTTPEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleHTTP_PostBody()
  {
    return (EReference)ruleHTTPEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getruleHTTP_URL()
  {
    return ruleHTTP_URLEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getruleHTTP_URL_RemoteURL()
  {
    return (EAttribute)ruleHTTP_URLEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleHTTP_URL_Scriptparams()
  {
    return (EReference)ruleHTTP_URLEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getruleXMLRPC()
  {
    return ruleXMLRPCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleXMLRPC_RemoteMachine()
  {
    return (EReference)ruleXMLRPCEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleXMLRPC_Username()
  {
    return (EReference)ruleXMLRPCEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleXMLRPC_Password()
  {
    return (EReference)ruleXMLRPCEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleXMLRPC_RPCMethod()
  {
    return (EReference)ruleXMLRPCEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getruleXMLRPC_URLparams()
  {
    return (EReference)ruleXMLRPCEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadlFactory getRadlFactory()
  {
    return (RadlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    radlEClass = createEClass(RADL);
    createEReference(radlEClass, RADL__IMPORTS);
    createEReference(radlEClass, RADL__RESOURCE_ADAPTER);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORT_URI);

    resourceAdapterEClass = createEClass(RESOURCE_ADAPTER);
    createEAttribute(resourceAdapterEClass, RESOURCE_ADAPTER__NAME);
    createEReference(resourceAdapterEClass, RESOURCE_ADAPTER__IMPLNAME);
    createEReference(resourceAdapterEClass, RESOURCE_ADAPTER__BYOFFICE);
    createEReference(resourceAdapterEClass, RESOURCE_ADAPTER__CONF_PARAMS);
    createEReference(resourceAdapterEClass, RESOURCE_ADAPTER__BIND_PARAMS);
    createEReference(resourceAdapterEClass, RESOURCE_ADAPTER__CHILD_PARAMS);
    createEReference(resourceAdapterEClass, RESOURCE_ADAPTER__ALLOW_PARAMS);
    createEAttribute(resourceAdapterEClass, RESOURCE_ADAPTER__CONF_COMPLETE);
    createEReference(resourceAdapterEClass, RESOURCE_ADAPTER__PROTOCOL);

    configurationParamEClass = createEClass(CONFIGURATION_PARAM);

    bindingParamEClass = createEClass(BINDING_PARAM);

    supportedChildTypeEClass = createEClass(SUPPORTED_CHILD_TYPE);
    createEReference(supportedChildTypeEClass, SUPPORTED_CHILD_TYPE__PARAM_TYPE);
    createEAttribute(supportedChildTypeEClass, SUPPORTED_CHILD_TYPE__NAME);
    createEAttribute(supportedChildTypeEClass, SUPPORTED_CHILD_TYPE__DEF_VALUE);

    allowedTypeEClass = createEClass(ALLOWED_TYPE);
    createEReference(allowedTypeEClass, ALLOWED_TYPE__PARAM_TYPE);
    createEAttribute(allowedTypeEClass, ALLOWED_TYPE__NAME);
    createEAttribute(allowedTypeEClass, ALLOWED_TYPE__DEF_VALUE);

    protocolEClass = createEClass(PROTOCOL);

    parameterTypeEClass = createEClass(PARAMETER_TYPE);
    createEAttribute(parameterTypeEClass, PARAMETER_TYPE__PNAME);

    ruleSSHEClass = createEClass(RULE_SSH);
    createEReference(ruleSSHEClass, RULE_SSH__REMOTE_MACHINE);
    createEReference(ruleSSHEClass, RULE_SSH__RPORT);
    createEReference(ruleSSHEClass, RULE_SSH__USERNAME);
    createEReference(ruleSSHEClass, RULE_SSH__PASSWORD);
    createEReference(ruleSSHEClass, RULE_SSH__COMMANDS);
    createEReference(ruleSSHEClass, RULE_SSH__COMMANDS_DELETE);

    ruleJavaWrapperEClass = createEClass(RULE_JAVA_WRAPPER);
    createEAttribute(ruleJavaWrapperEClass, RULE_JAVA_WRAPPER__CLASSNAME);
    createEReference(ruleJavaWrapperEClass, RULE_JAVA_WRAPPER__CONSTRUCTOR_PARAMS);
    createEReference(ruleJavaWrapperEClass, RULE_JAVA_WRAPPER__COMMANDS);

    commandEClass = createEClass(COMMAND);
    createEAttribute(commandEClass, COMMAND__JAVA_FUNCTION_NAME);
    createEReference(commandEClass, COMMAND__COMMANDS);

    entryCommandEClass = createEClass(ENTRY_COMMAND);

    rulJava_paramEClass = createEClass(RUL_JAVA_PARAM);

    rulJava_paramStringEClass = createEClass(RUL_JAVA_PARAM_STRING);
    createEAttribute(rulJava_paramStringEClass, RUL_JAVA_PARAM_STRING__STRING_VALUE);

    rulJava_paramIntEClass = createEClass(RUL_JAVA_PARAM_INT);
    createEAttribute(rulJava_paramIntEClass, RUL_JAVA_PARAM_INT__INT_VALUE);

    rulJava_paraScriptEClass = createEClass(RUL_JAVA_PARA_SCRIPT);
    createEReference(rulJava_paraScriptEClass, RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE);

    assignCommandEClass = createEClass(ASSIGN_COMMAND);
    createEReference(assignCommandEClass, ASSIGN_COMMAND__SCRIPT_PARAM);

    scriptParamEClass = createEClass(SCRIPT_PARAM);
    createEReference(scriptParamEClass, SCRIPT_PARAM__PARAM_TYPE);
    createEAttribute(scriptParamEClass, SCRIPT_PARAM__NAME);
    createEAttribute(scriptParamEClass, SCRIPT_PARAM__DEF_VALUE);
    createEAttribute(scriptParamEClass, SCRIPT_PARAM__DESCRIPTION_VALUE);

    rulSSH_commandsEClass = createEClass(RUL_SSH_COMMANDS);
    createEAttribute(rulSSH_commandsEClass, RUL_SSH_COMMANDS__REMOTE_COMMAND);
    createEReference(rulSSH_commandsEClass, RUL_SSH_COMMANDS__SCRIPTPARAMS);

    ruleHTTPEClass = createEClass(RULE_HTTP);
    createEReference(ruleHTTPEClass, RULE_HTTP__REMOTE_MACHINE);
    createEReference(ruleHTTPEClass, RULE_HTTP__HTTP_URL);
    createEAttribute(ruleHTTPEClass, RULE_HTTP__HMETHOD);
    createEReference(ruleHTTPEClass, RULE_HTTP__AUTH_METHOD);
    createEReference(ruleHTTPEClass, RULE_HTTP__USERNAME);
    createEReference(ruleHTTPEClass, RULE_HTTP__PASSWORD);
    createEReference(ruleHTTPEClass, RULE_HTTP__POST_BODY);

    ruleHTTP_URLEClass = createEClass(RULE_HTTP_URL);
    createEAttribute(ruleHTTP_URLEClass, RULE_HTTP_URL__REMOTE_URL);
    createEReference(ruleHTTP_URLEClass, RULE_HTTP_URL__SCRIPTPARAMS);

    ruleXMLRPCEClass = createEClass(RULE_XMLRPC);
    createEReference(ruleXMLRPCEClass, RULE_XMLRPC__REMOTE_MACHINE);
    createEReference(ruleXMLRPCEClass, RULE_XMLRPC__USERNAME);
    createEReference(ruleXMLRPCEClass, RULE_XMLRPC__PASSWORD);
    createEReference(ruleXMLRPCEClass, RULE_XMLRPC__RPC_METHOD);
    createEReference(ruleXMLRPCEClass, RULE_XMLRPC__UR_LPARAMS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    ServicesPackage theServicesPackage = (ServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI);
    FederationOfficePackage theFederationOfficePackage = (FederationOfficePackage)EPackage.Registry.INSTANCE.getEPackage(FederationOfficePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    configurationParamEClass.getESuperTypes().add(this.getscriptParam());
    bindingParamEClass.getESuperTypes().add(this.getscriptParam());
    ruleSSHEClass.getESuperTypes().add(this.getProtocol());
    ruleJavaWrapperEClass.getESuperTypes().add(this.getProtocol());
    entryCommandEClass.getESuperTypes().add(this.getCommand());
    rulJava_paramStringEClass.getESuperTypes().add(this.getrulJava_param());
    rulJava_paramIntEClass.getESuperTypes().add(this.getrulJava_param());
    rulJava_paraScriptEClass.getESuperTypes().add(this.getrulJava_param());
    assignCommandEClass.getESuperTypes().add(this.getCommand());
    ruleHTTPEClass.getESuperTypes().add(this.getProtocol());
    ruleXMLRPCEClass.getESuperTypes().add(this.getProtocol());

    // Initialize classes and features; add operations and parameters
    initEClass(radlEClass, gr.upatras.ece.wcl.radl2.radl.RADL.class, "RADL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRADL_Imports(), this.getImport(), null, "imports", null, 0, 1, gr.upatras.ece.wcl.radl2.radl.RADL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRADL_ResourceAdapter(), this.getResourceAdapter(), null, "resourceAdapter", null, 0, 1, gr.upatras.ece.wcl.radl2.radl.RADL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourceAdapterEClass, ResourceAdapter.class, "ResourceAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResourceAdapter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAdapter_Implname(), theServicesPackage.getOfferedService(), null, "implname", null, 0, 1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAdapter_Byoffice(), theFederationOfficePackage.getOffice(), null, "byoffice", null, 0, 1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAdapter_ConfParams(), this.getConfigurationParam(), null, "confParams", null, 0, -1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAdapter_BindParams(), this.getBindingParam(), null, "bindParams", null, 0, -1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAdapter_ChildParams(), this.getSupportedChildType(), null, "childParams", null, 0, -1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAdapter_AllowParams(), this.getAllowedType(), null, "allowParams", null, 0, -1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getResourceAdapter_ConfComplete(), ecorePackage.getEString(), "ConfComplete", null, 0, 1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResourceAdapter_Protocol(), this.getProtocol(), null, "protocol", null, 0, 1, ResourceAdapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationParamEClass, ConfigurationParam.class, "ConfigurationParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bindingParamEClass, BindingParam.class, "BindingParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(supportedChildTypeEClass, SupportedChildType.class, "SupportedChildType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSupportedChildType_ParamType(), this.getParameterType(), null, "paramType", null, 0, 1, SupportedChildType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSupportedChildType_Name(), ecorePackage.getEString(), "name", null, 0, 1, SupportedChildType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSupportedChildType_DefValue(), ecorePackage.getEString(), "defValue", null, 0, 1, SupportedChildType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(allowedTypeEClass, AllowedType.class, "AllowedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAllowedType_ParamType(), this.getParameterType(), null, "paramType", null, 0, 1, AllowedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllowedType_Name(), ecorePackage.getEString(), "name", null, 0, 1, AllowedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAllowedType_DefValue(), ecorePackage.getEString(), "defValue", null, 0, 1, AllowedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameterType_PName(), ecorePackage.getEString(), "pName", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleSSHEClass, ruleSSH.class, "ruleSSH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getruleSSH_RemoteMachine(), this.getscriptParam(), null, "remoteMachine", null, 0, 1, ruleSSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleSSH_RPort(), this.getscriptParam(), null, "RPort", null, 0, 1, ruleSSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleSSH_Username(), this.getscriptParam(), null, "username", null, 0, 1, ruleSSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleSSH_Password(), this.getscriptParam(), null, "password", null, 0, 1, ruleSSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleSSH_Commands(), this.getrulSSH_commands(), null, "commands", null, 0, -1, ruleSSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleSSH_CommandsDelete(), this.getrulSSH_commands(), null, "commandsDelete", null, 0, -1, ruleSSH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleJavaWrapperEClass, ruleJavaWrapper.class, "ruleJavaWrapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getruleJavaWrapper_Classname(), ecorePackage.getEString(), "classname", null, 0, 1, ruleJavaWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleJavaWrapper_ConstructorParams(), this.getrulJava_param(), null, "constructorParams", null, 0, -1, ruleJavaWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleJavaWrapper_Commands(), this.getCommand(), null, "commands", null, 0, -1, ruleJavaWrapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommand_JavaFunctionName(), ecorePackage.getEString(), "javaFunctionName", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCommand_Commands(), this.getrulJava_param(), null, "commands", null, 0, -1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entryCommandEClass, entryCommand.class, "entryCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rulJava_paramEClass, rulJava_param.class, "rulJava_param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rulJava_paramStringEClass, rulJava_paramString.class, "rulJava_paramString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrulJava_paramString_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, rulJava_paramString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rulJava_paramIntEClass, rulJava_paramInt.class, "rulJava_paramInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrulJava_paramInt_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, rulJava_paramInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rulJava_paraScriptEClass, rulJava_paraScript.class, "rulJava_paraScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getrulJava_paraScript_ScriptparamValue(), this.getscriptParam(), null, "scriptparamValue", null, 0, 1, rulJava_paraScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignCommandEClass, assignCommand.class, "assignCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getassignCommand_ScriptParam(), this.getscriptParam(), null, "scriptParam", null, 0, 1, assignCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptParamEClass, scriptParam.class, "scriptParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getscriptParam_ParamType(), this.getParameterType(), null, "paramType", null, 0, 1, scriptParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getscriptParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, scriptParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getscriptParam_DefValue(), ecorePackage.getEString(), "defValue", null, 0, 1, scriptParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getscriptParam_DescriptionValue(), ecorePackage.getEString(), "descriptionValue", null, 0, 1, scriptParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rulSSH_commandsEClass, rulSSH_commands.class, "rulSSH_commands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrulSSH_commands_RemoteCommand(), ecorePackage.getEString(), "remoteCommand", null, 0, 1, rulSSH_commands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getrulSSH_commands_Scriptparams(), this.getscriptParam(), null, "scriptparams", null, 0, -1, rulSSH_commands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleHTTPEClass, ruleHTTP.class, "ruleHTTP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getruleHTTP_RemoteMachine(), this.getscriptParam(), null, "remoteMachine", null, 0, 1, ruleHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleHTTP_HttpURL(), this.getruleHTTP_URL(), null, "httpURL", null, 0, -1, ruleHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getruleHTTP_HMethod(), ecorePackage.getEString(), "HMethod", null, 0, 1, ruleHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleHTTP_AuthMethod(), this.getscriptParam(), null, "AuthMethod", null, 0, 1, ruleHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleHTTP_Username(), this.getscriptParam(), null, "username", null, 0, 1, ruleHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleHTTP_Password(), this.getscriptParam(), null, "password", null, 0, 1, ruleHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleHTTP_PostBody(), this.getscriptParam(), null, "postBody", null, 0, 1, ruleHTTP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleHTTP_URLEClass, ruleHTTP_URL.class, "ruleHTTP_URL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getruleHTTP_URL_RemoteURL(), ecorePackage.getEString(), "remoteURL", null, 0, 1, ruleHTTP_URL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleHTTP_URL_Scriptparams(), this.getscriptParam(), null, "scriptparams", null, 0, -1, ruleHTTP_URL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleXMLRPCEClass, ruleXMLRPC.class, "ruleXMLRPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getruleXMLRPC_RemoteMachine(), this.getBindingParam(), null, "remoteMachine", null, 0, 1, ruleXMLRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleXMLRPC_Username(), this.getBindingParam(), null, "username", null, 0, 1, ruleXMLRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleXMLRPC_Password(), this.getBindingParam(), null, "password", null, 0, 1, ruleXMLRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleXMLRPC_RPCMethod(), this.getBindingParam(), null, "RPCMethod", null, 0, 1, ruleXMLRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getruleXMLRPC_URLparams(), this.getConfigurationParam(), null, "URLparams", null, 0, -1, ruleXMLRPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RadlPackageImpl
