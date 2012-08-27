package gr.upatras.ece.wcl.radl2.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import gr.upatras.ece.wcl.radl2.radl.AllowedType;
import gr.upatras.ece.wcl.radl2.radl.BindingParam;
import gr.upatras.ece.wcl.radl2.radl.ConfigurationParam;
import gr.upatras.ece.wcl.radl2.radl.Import;
import gr.upatras.ece.wcl.radl2.radl.ParameterType;
import gr.upatras.ece.wcl.radl2.radl.RADL;
import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.ResourceAdapter;
import gr.upatras.ece.wcl.radl2.radl.SupportedChildType;
import gr.upatras.ece.wcl.radl2.radl.assignCommand;
import gr.upatras.ece.wcl.radl2.radl.entryCommand;
import gr.upatras.ece.wcl.radl2.radl.rulJava_paraScript;
import gr.upatras.ece.wcl.radl2.radl.rulJava_paramInt;
import gr.upatras.ece.wcl.radl2.radl.rulJava_paramString;
import gr.upatras.ece.wcl.radl2.radl.rulSSH_commands;
import gr.upatras.ece.wcl.radl2.radl.ruleHTTP;
import gr.upatras.ece.wcl.radl2.radl.ruleHTTP_URL;
import gr.upatras.ece.wcl.radl2.radl.ruleJavaWrapper;
import gr.upatras.ece.wcl.radl2.radl.ruleSSH;
import gr.upatras.ece.wcl.radl2.radl.ruleXMLRPC;
import gr.upatras.ece.wcl.radl2.services.RadlGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractRadlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RadlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RadlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RadlPackage.ALLOWED_TYPE:
				if(context == grammarAccess.getAllowedTypeRule()) {
					sequence_AllowedType(context, (AllowedType) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.BINDING_PARAM:
				if(context == grammarAccess.getBindingParamRule() ||
				   context == grammarAccess.getScriptParamRule()) {
					sequence_BindingParam(context, (BindingParam) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.CONFIGURATION_PARAM:
				if(context == grammarAccess.getConfigurationParamRule() ||
				   context == grammarAccess.getScriptParamRule()) {
					sequence_ConfigurationParam(context, (ConfigurationParam) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.PARAMETER_TYPE:
				if(context == grammarAccess.getParameterTypeRule()) {
					sequence_ParameterType(context, (ParameterType) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RADL:
				if(context == grammarAccess.getRADLRule()) {
					sequence_RADL(context, (RADL) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RESOURCE_ADAPTER:
				if(context == grammarAccess.getResourceAdapterRule()) {
					sequence_ResourceAdapter(context, (ResourceAdapter) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.SUPPORTED_CHILD_TYPE:
				if(context == grammarAccess.getSupportedChildTypeRule()) {
					sequence_SupportedChildType(context, (SupportedChildType) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.ASSIGN_COMMAND:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getAssignCommandRule()) {
					sequence_assignCommand(context, (assignCommand) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.ENTRY_COMMAND:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getEntryCommandRule()) {
					sequence_entryCommand(context, (entryCommand) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RUL_JAVA_PARA_SCRIPT:
				if(context == grammarAccess.getRulJava_paraScriptRule() ||
				   context == grammarAccess.getRulJava_paramRule()) {
					sequence_rulJava_paraScript(context, (rulJava_paraScript) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RUL_JAVA_PARAM_INT:
				if(context == grammarAccess.getRulJava_paramRule() ||
				   context == grammarAccess.getRulJava_paramIntRule()) {
					sequence_rulJava_paramInt(context, (rulJava_paramInt) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RUL_JAVA_PARAM_STRING:
				if(context == grammarAccess.getRulJava_paramRule() ||
				   context == grammarAccess.getRulJava_paramStringRule()) {
					sequence_rulJava_paramString(context, (rulJava_paramString) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RUL_SSH_COMMANDS:
				if(context == grammarAccess.getRulSSH_commandsRule()) {
					sequence_rulSSH_commands(context, (rulSSH_commands) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RULE_HTTP:
				if(context == grammarAccess.getProtocolRule() ||
				   context == grammarAccess.getRuleHTTPRule()) {
					sequence_ruleHTTP(context, (ruleHTTP) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RULE_HTTP_URL:
				if(context == grammarAccess.getRuleHTTP_URLRule()) {
					sequence_ruleHTTP_URL(context, (ruleHTTP_URL) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RULE_JAVA_WRAPPER:
				if(context == grammarAccess.getProtocolRule() ||
				   context == grammarAccess.getRuleJavaWrapperRule()) {
					sequence_ruleJavaWrapper(context, (ruleJavaWrapper) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RULE_SSH:
				if(context == grammarAccess.getProtocolRule() ||
				   context == grammarAccess.getRuleSSHRule()) {
					sequence_ruleSSH(context, (ruleSSH) semanticObject); 
					return; 
				}
				else break;
			case RadlPackage.RULE_XMLRPC:
				if(context == grammarAccess.getProtocolRule() ||
				   context == grammarAccess.getRuleXMLRPCRule()) {
					sequence_ruleXMLRPC(context, (ruleXMLRPC) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (paramType=ParameterType? (name=ID | name=STRING) defValue=STRING?)
	 */
	protected void sequence_AllowedType(EObject context, AllowedType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (paramType=ParameterType? (name=ID | name=STRING) defValue=STRING? descriptionValue=STRING?)
	 */
	protected void sequence_BindingParam(EObject context, BindingParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (paramType=ParameterType? (name=ID | name=STRING) defValue=STRING? descriptionValue=STRING?)
	 */
	protected void sequence_ConfigurationParam(EObject context, ConfigurationParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RadlPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RadlPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pName='String' | pName='Integer' | pName='Boolean' | pName='Enum' | pName='REFERENCE')
	 */
	protected void sequence_ParameterType(EObject context, ParameterType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports=Import? resourceAdapter=ResourceAdapter)
	 */
	protected void sequence_RADL(EObject context, RADL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (implname=[OfferedService|STRING] byoffice=[Broker|STRING])? 
	 *         confParams+=ConfigurationParam* 
	 *         bindParams+=BindingParam* 
	 *         childParams+=SupportedChildType* 
	 *         allowParams+=AllowedType* 
	 *         ((ConfComplete='YES' | ConfComplete='NO') protocol=Protocol)?
	 *     )
	 */
	protected void sequence_ResourceAdapter(EObject context, ResourceAdapter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (paramType=ParameterType? (name=ID | name=STRING) defValue=STRING?)
	 */
	protected void sequence_SupportedChildType(EObject context, SupportedChildType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scriptParam=[scriptParam|ID] javaFunctionName=ID (commands+=rulJava_param commands+=rulJava_param*)?)
	 */
	protected void sequence_assignCommand(EObject context, assignCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (javaFunctionName=ID (commands+=rulJava_param commands+=rulJava_param*)?)
	 */
	protected void sequence_entryCommand(EObject context, entryCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     scriptparamValue=[scriptParam|ID]
	 */
	protected void sequence_rulJava_paraScript(EObject context, rulJava_paraScript semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RadlPackage.Literals.RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RadlPackage.Literals.RUL_JAVA_PARA_SCRIPT__SCRIPTPARAM_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRulJava_paraScriptAccess().getScriptparamValueScriptParamIDTerminalRuleCall_0_1(), semanticObject.getScriptparamValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     intValue=INT
	 */
	protected void sequence_rulJava_paramInt(EObject context, rulJava_paramInt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RadlPackage.Literals.RUL_JAVA_PARAM_INT__INT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RadlPackage.Literals.RUL_JAVA_PARAM_INT__INT_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRulJava_paramIntAccess().getIntValueINTTerminalRuleCall_0(), semanticObject.getIntValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     stringValue=STRING
	 */
	protected void sequence_rulJava_paramString(EObject context, rulJava_paramString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RadlPackage.Literals.RUL_JAVA_PARAM_STRING__STRING_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RadlPackage.Literals.RUL_JAVA_PARAM_STRING__STRING_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRulJava_paramStringAccess().getStringValueSTRINGTerminalRuleCall_0(), semanticObject.getStringValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (remoteCommand=STRING scriptparams+=[scriptParam|STRING]*)
	 */
	protected void sequence_rulSSH_commands(EObject context, rulSSH_commands semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (remoteURL=STRING scriptparams+=[scriptParam|STRING]*)
	 */
	protected void sequence_ruleHTTP_URL(EObject context, ruleHTTP_URL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         remoteMachine=[scriptParam|STRING] 
	 *         httpURL+=ruleHTTP_URL* 
	 *         (HMethod='GET' | HMethod='POST') 
	 *         (AuthMethod=[scriptParam|STRING] username=[scriptParam|STRING] password=[scriptParam|STRING])? 
	 *         postBody=[scriptParam|STRING]
	 *     )
	 */
	protected void sequence_ruleHTTP(EObject context, ruleHTTP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classname=ID (constructorParams+=rulJava_param constructorParams+=rulJava_param*)? commands+=Command*)
	 */
	protected void sequence_ruleJavaWrapper(EObject context, ruleJavaWrapper semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         remoteMachine=[scriptParam|STRING] 
	 *         RPort=[scriptParam|STRING] 
	 *         username=[scriptParam|STRING] 
	 *         password=[scriptParam|STRING] 
	 *         commands+=rulSSH_commands* 
	 *         commandsDelete+=rulSSH_commands*
	 *     )
	 */
	protected void sequence_ruleSSH(EObject context, ruleSSH semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         remoteMachine=[BindingParam|ID] 
	 *         (username=[BindingParam|ID] password=[BindingParam|ID])? 
	 *         RPCMethod=[BindingParam|ID] 
	 *         URLparams+=[ConfigurationParam|STRING]*
	 *     )
	 */
	protected void sequence_ruleXMLRPC(EObject context, ruleXMLRPC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
