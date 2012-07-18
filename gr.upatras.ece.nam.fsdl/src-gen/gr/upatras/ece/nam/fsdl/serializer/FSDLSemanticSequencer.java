package gr.upatras.ece.nam.fsdl.serializer;

import brokermodel.federationscenarios.Credentials;
import brokermodel.federationscenarios.FederationscenariosPackage;
import brokermodel.federationscenarios.Import;
import brokermodel.federationscenarios.InfrastructureRequest;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.federationscenarios.ResourceGroup;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;
import brokermodel.federationscenarios.ScheduledPlan;
import brokermodel.federationscenarios.ServiceRequest;
import brokermodel.federationscenarios.ServiceSettingInstance;
import brokermodel.federationscenarios.ServicesRequest;
import com.google.inject.Inject;
import com.google.inject.Provider;
import gr.upatras.ece.nam.fsdl.services.FSDLGrammarAccess;
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
public class FSDLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FSDLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FederationscenariosPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FederationscenariosPackage.CREDENTIALS:
				if(context == grammarAccess.getCredentialsRule()) {
					sequence_Credentials(context, (Credentials) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.INFRASTRUCTURE_REQUEST:
				if(context == grammarAccess.getInfrastructureRequestRule()) {
					sequence_InfrastructureRequest(context, (InfrastructureRequest) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.REQUESTED_FEDERATION_SCENARIO:
				if(context == grammarAccess.getRequestedFederationScenarioRule()) {
					sequence_RequestedFederationScenario(context, (RequestedFederationScenario) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.RESOURCE_GROUP:
				if(context == grammarAccess.getResourceGroupRule()) {
					sequence_ResourceGroup(context, (ResourceGroup) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.RESOURCE_REQUEST:
				if(context == grammarAccess.getResourceRequestRule()) {
					sequence_ResourceRequest(context, (ResourceRequest) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.RESOURCE_SETTING_INSTANCE:
				if(context == grammarAccess.getResourceSettingInstanceRule()) {
					sequence_ResourceSettingInstance(context, (ResourceSettingInstance) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.SCHEDULED_PLAN:
				if(context == grammarAccess.getScheduledPlanRule()) {
					sequence_ScheduledPlan(context, (ScheduledPlan) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.SERVICE_REQUEST:
				if(context == grammarAccess.getServiceRequestRule()) {
					sequence_ServiceRequest(context, (ServiceRequest) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.SERVICE_SETTING_INSTANCE:
				if(context == grammarAccess.getServiceSettingInstanceRule()) {
					sequence_ServiceSettingInstance(context, (ServiceSettingInstance) semanticObject); 
					return; 
				}
				else break;
			case FederationscenariosPackage.SERVICES_REQUEST:
				if(context == grammarAccess.getServicesRequestRule()) {
					sequence_ServicesRequest(context, (ServicesRequest) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=STRING id=INT? description=STRING? username=STRING? password=STRING?)
	 */
	protected void sequence_Credentials(EObject context, Credentials semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FederationscenariosPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FederationscenariosPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (reqOfferedResources+=ResourceRequest* resourceGroups+=ResourceGroup*)
	 */
	protected void sequence_InfrastructureRequest(EObject context, InfrastructureRequest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         imports+=Import* 
	 *         isShared?='isShared'? 
	 *         description=STRING? 
	 *         VTCredentials=Credentials? 
	 *         scheduledPlan=ScheduledPlan? 
	 *         servicesRequest=ServicesRequest? 
	 *         infrastructureRequest=InfrastructureRequest?
	 *     )
	 */
	protected void sequence_RequestedFederationScenario(EObject context, RequestedFederationScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (groupedResources+=[ResourceRequest|STRING] groupedResources+=[ResourceRequest|STRING]*)?)
	 */
	protected void sequence_ResourceGroup(EObject context, ResourceGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refOfferedResource=[OfferedResource|STRING] name=ID reqResourceSettings+=ResourceSettingInstance*)
	 */
	protected void sequence_ResourceRequest(EObject context, ResourceRequest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         refResourceSetting=[ResourceSetting|STRING] 
	 *         (name=ID | name=STRING) 
	 *         staticValue=STRING? 
	 *         (assignSetting+=[SettingInstance|STRING] assignSetting+=[SettingInstance|STRING]*)?
	 *     )
	 */
	protected void sequence_ResourceSettingInstance(EObject context, ResourceSettingInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ValidFrom=EDate? ValidUntil=EDate?)
	 */
	protected void sequence_ScheduledPlan(EObject context, ScheduledPlan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         refService=[Service|STRING] 
	 *         name=ID 
	 *         numOfServices=INT? 
	 *         OfferedByProviders=[ResourcesProvider|STRING]? 
	 *         reqServiceSettings+=ServiceSettingInstance*
	 *     )
	 */
	protected void sequence_ServiceRequest(EObject context, ServiceRequest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         refServiceSetting=[ServiceSetting|STRING] 
	 *         (name=ID | name=STRING) 
	 *         staticValue=STRING? 
	 *         (assignSetting+=[SettingInstance|STRING] assignSetting+=[SettingInstance|STRING]*)?
	 *     )
	 */
	protected void sequence_ServiceSettingInstance(EObject context, ServiceSettingInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (serviceRequestList+=ServiceRequest*)
	 */
	protected void sequence_ServicesRequest(EObject context, ServicesRequest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
