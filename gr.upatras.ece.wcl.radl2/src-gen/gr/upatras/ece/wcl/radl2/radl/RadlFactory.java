/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl2.radl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gr.upatras.ece.wcl.radl2.radl.RadlPackage
 * @generated
 */
public interface RadlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RadlFactory eINSTANCE = gr.upatras.ece.wcl.radl2.radl.impl.RadlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>RADL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RADL</em>'.
   * @generated
   */
  RADL createRADL();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Resource Adapter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Adapter</em>'.
   * @generated
   */
  ResourceAdapter createResourceAdapter();

  /**
   * Returns a new object of class '<em>Configuration Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration Param</em>'.
   * @generated
   */
  ConfigurationParam createConfigurationParam();

  /**
   * Returns a new object of class '<em>Binding Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binding Param</em>'.
   * @generated
   */
  BindingParam createBindingParam();

  /**
   * Returns a new object of class '<em>Supported Child Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supported Child Type</em>'.
   * @generated
   */
  SupportedChildType createSupportedChildType();

  /**
   * Returns a new object of class '<em>Allowed Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allowed Type</em>'.
   * @generated
   */
  AllowedType createAllowedType();

  /**
   * Returns a new object of class '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Protocol</em>'.
   * @generated
   */
  Protocol createProtocol();

  /**
   * Returns a new object of class '<em>Parameter Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Type</em>'.
   * @generated
   */
  ParameterType createParameterType();

  /**
   * Returns a new object of class '<em>rule SSH</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule SSH</em>'.
   * @generated
   */
  ruleSSH createruleSSH();

  /**
   * Returns a new object of class '<em>rule Java Wrapper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule Java Wrapper</em>'.
   * @generated
   */
  ruleJavaWrapper createruleJavaWrapper();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>entry Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>entry Command</em>'.
   * @generated
   */
  entryCommand createentryCommand();

  /**
   * Returns a new object of class '<em>rul Java param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rul Java param</em>'.
   * @generated
   */
  rulJava_param createrulJava_param();

  /**
   * Returns a new object of class '<em>rul Java param String</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rul Java param String</em>'.
   * @generated
   */
  rulJava_paramString createrulJava_paramString();

  /**
   * Returns a new object of class '<em>rul Java param Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rul Java param Int</em>'.
   * @generated
   */
  rulJava_paramInt createrulJava_paramInt();

  /**
   * Returns a new object of class '<em>rul Java para Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rul Java para Script</em>'.
   * @generated
   */
  rulJava_paraScript createrulJava_paraScript();

  /**
   * Returns a new object of class '<em>assign Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>assign Command</em>'.
   * @generated
   */
  assignCommand createassignCommand();

  /**
   * Returns a new object of class '<em>script Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>script Param</em>'.
   * @generated
   */
  scriptParam createscriptParam();

  /**
   * Returns a new object of class '<em>rul SSH commands</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rul SSH commands</em>'.
   * @generated
   */
  rulSSH_commands createrulSSH_commands();

  /**
   * Returns a new object of class '<em>rule HTTP</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule HTTP</em>'.
   * @generated
   */
  ruleHTTP createruleHTTP();

  /**
   * Returns a new object of class '<em>rule HTTP URL</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule HTTP URL</em>'.
   * @generated
   */
  ruleHTTP_URL createruleHTTP_URL();

  /**
   * Returns a new object of class '<em>rule XMLRPC</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>rule XMLRPC</em>'.
   * @generated
   */
  ruleXMLRPC createruleXMLRPC();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RadlPackage getRadlPackage();

} //RadlFactory
