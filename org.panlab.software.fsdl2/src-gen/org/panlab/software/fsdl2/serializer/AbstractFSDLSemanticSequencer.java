package org.panlab.software.fsdl2.serializer;

import FederationOffice.federationscenarios.Credentials;
import FederationOffice.federationscenarios.FederationscenariosPackage;
import FederationOffice.federationscenarios.Import;
import FederationOffice.federationscenarios.InfrastructureRequest;
import FederationOffice.federationscenarios.RequestedFederationScenario;
import FederationOffice.federationscenarios.ResourceGroup;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;
import FederationOffice.federationscenarios.ScheduledPlan;
import FederationOffice.federationscenarios.ServiceRequest;
import FederationOffice.federationscenarios.ServiceSettingInstance;
import FederationOffice.federationscenarios.ServicesRequest;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.panlab.software.fsdl2.services.FSDLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractFSDLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected FSDLGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
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
	 *
	 * Features:
	 *    name[1, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    username[0, 1]
	 *    password[0, 1]
	 */
	protected void sequence_Credentials(EObject context, Credentials semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 *
	 * Features:
	 *    importURI[1, 1]
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
	 *
	 * Features:
	 *    reqOfferedResources[0, *]
	 *    resourceGroups[0, *]
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
	 *
	 * Features:
	 *    name[1, 1]
	 *    description[0, 1]
	 *    isShared[0, 1]
	 *    VTCredentials[0, 1]
	 *    servicesRequest[0, 1]
	 *    infrastructureRequest[0, 1]
	 *    scheduledPlan[0, 1]
	 *    imports[0, *]
	 */
	protected void sequence_RequestedFederationScenario(EObject context, RequestedFederationScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (groupedResources+=[ResourceRequest|STRING] groupedResources+=[ResourceRequest|STRING]*)?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    groupedResources[0, *]
	 */
	protected void sequence_ResourceGroup(EObject context, ResourceGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refOfferedResource=[OfferedResource|STRING] name=ID reqResourceSettings+=ResourceSettingInstance*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    refOfferedResource[1, 1]
	 *    reqResourceSettings[0, *]
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
	 *
	 * Features:
	 *    name[0, 2]
	 *    staticValue[0, 1]
	 *    assignSetting[0, *]
	 *    refResourceSetting[1, 1]
	 */
	protected void sequence_ResourceSettingInstance(EObject context, ResourceSettingInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ValidFrom=EDate? ValidUntil=EDate?)
	 *
	 * Features:
	 *    ValidFrom[0, 1]
	 *    ValidUntil[0, 1]
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
	 *
	 * Features:
	 *    name[1, 1]
	 *    refService[1, 1]
	 *    OfferedByProviders[0, 1]
	 *    reqServiceSettings[0, *]
	 *    numOfServices[0, 1]
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
	 *
	 * Features:
	 *    name[0, 2]
	 *    staticValue[0, 1]
	 *    assignSetting[0, *]
	 *    refServiceSetting[1, 1]
	 */
	protected void sequence_ServiceSettingInstance(EObject context, ServiceSettingInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (serviceRequestList+=ServiceRequest*)
	 *
	 * Features:
	 *    serviceRequestList[0, *]
	 */
	protected void sequence_ServicesRequest(EObject context, ServicesRequest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
