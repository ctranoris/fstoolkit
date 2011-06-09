/**
 * <copyright>
 * </copyright>
 *

 */
package gr.upatras.ece.wcl.radl.util;

import gr.upatras.ece.wcl.radl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gr.upatras.ece.wcl.radl.RadlPackage
 * @generated
 */
public class RadlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RadlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RadlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RadlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadlSwitch<Adapter> modelSwitch =
    new RadlSwitch<Adapter>()
    {
      @Override
      public Adapter caseRADL(RADL object)
      {
        return createRADLAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseResourceAdapter(ResourceAdapter object)
      {
        return createResourceAdapterAdapter();
      }
      @Override
      public Adapter caseConfigurationParam(ConfigurationParam object)
      {
        return createConfigurationParamAdapter();
      }
      @Override
      public Adapter caseBindingParam(BindingParam object)
      {
        return createBindingParamAdapter();
      }
      @Override
      public Adapter caseSupportedChildType(SupportedChildType object)
      {
        return createSupportedChildTypeAdapter();
      }
      @Override
      public Adapter caseAllowedType(AllowedType object)
      {
        return createAllowedTypeAdapter();
      }
      @Override
      public Adapter caseProtocol(Protocol object)
      {
        return createProtocolAdapter();
      }
      @Override
      public Adapter caseParameterType(ParameterType object)
      {
        return createParameterTypeAdapter();
      }
      @Override
      public Adapter caseruleSSH(ruleSSH object)
      {
        return createruleSSHAdapter();
      }
      @Override
      public Adapter caseruleJavaWrapper(ruleJavaWrapper object)
      {
        return createruleJavaWrapperAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseentryCommand(entryCommand object)
      {
        return createentryCommandAdapter();
      }
      @Override
      public Adapter caserulJava_param(rulJava_param object)
      {
        return createrulJava_paramAdapter();
      }
      @Override
      public Adapter caserulJava_paramString(rulJava_paramString object)
      {
        return createrulJava_paramStringAdapter();
      }
      @Override
      public Adapter caserulJava_paramInt(rulJava_paramInt object)
      {
        return createrulJava_paramIntAdapter();
      }
      @Override
      public Adapter caserulJava_paraScript(rulJava_paraScript object)
      {
        return createrulJava_paraScriptAdapter();
      }
      @Override
      public Adapter caseassignCommand(assignCommand object)
      {
        return createassignCommandAdapter();
      }
      @Override
      public Adapter casescriptParam(scriptParam object)
      {
        return createscriptParamAdapter();
      }
      @Override
      public Adapter caserulSSH_commands(rulSSH_commands object)
      {
        return createrulSSH_commandsAdapter();
      }
      @Override
      public Adapter caseruleHTTP(ruleHTTP object)
      {
        return createruleHTTPAdapter();
      }
      @Override
      public Adapter caseruleHTTP_URL(ruleHTTP_URL object)
      {
        return createruleHTTP_URLAdapter();
      }
      @Override
      public Adapter caseruleXMLRPC(ruleXMLRPC object)
      {
        return createruleXMLRPCAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.RADL <em>RADL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.RADL
   * @generated
   */
  public Adapter createRADLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.ResourceAdapter <em>Resource Adapter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.ResourceAdapter
   * @generated
   */
  public Adapter createResourceAdapterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.ConfigurationParam <em>Configuration Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.ConfigurationParam
   * @generated
   */
  public Adapter createConfigurationParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.BindingParam <em>Binding Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.BindingParam
   * @generated
   */
  public Adapter createBindingParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.SupportedChildType <em>Supported Child Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.SupportedChildType
   * @generated
   */
  public Adapter createSupportedChildTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.AllowedType <em>Allowed Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.AllowedType
   * @generated
   */
  public Adapter createAllowedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.Protocol
   * @generated
   */
  public Adapter createProtocolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.ParameterType <em>Parameter Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.ParameterType
   * @generated
   */
  public Adapter createParameterTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.ruleSSH <em>rule SSH</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.ruleSSH
   * @generated
   */
  public Adapter createruleSSHAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.ruleJavaWrapper <em>rule Java Wrapper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.ruleJavaWrapper
   * @generated
   */
  public Adapter createruleJavaWrapperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.entryCommand <em>entry Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.entryCommand
   * @generated
   */
  public Adapter createentryCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.rulJava_param <em>rul Java param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.rulJava_param
   * @generated
   */
  public Adapter createrulJava_paramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.rulJava_paramString <em>rul Java param String</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.rulJava_paramString
   * @generated
   */
  public Adapter createrulJava_paramStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.rulJava_paramInt <em>rul Java param Int</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.rulJava_paramInt
   * @generated
   */
  public Adapter createrulJava_paramIntAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.rulJava_paraScript <em>rul Java para Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.rulJava_paraScript
   * @generated
   */
  public Adapter createrulJava_paraScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.assignCommand <em>assign Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.assignCommand
   * @generated
   */
  public Adapter createassignCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.scriptParam <em>script Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.scriptParam
   * @generated
   */
  public Adapter createscriptParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.rulSSH_commands <em>rul SSH commands</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.rulSSH_commands
   * @generated
   */
  public Adapter createrulSSH_commandsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.ruleHTTP <em>rule HTTP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP
   * @generated
   */
  public Adapter createruleHTTPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.ruleHTTP_URL <em>rule HTTP URL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.ruleHTTP_URL
   * @generated
   */
  public Adapter createruleHTTP_URLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gr.upatras.ece.wcl.radl.ruleXMLRPC <em>rule XMLRPC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gr.upatras.ece.wcl.radl.ruleXMLRPC
   * @generated
   */
  public Adapter createruleXMLRPCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RadlAdapterFactory
