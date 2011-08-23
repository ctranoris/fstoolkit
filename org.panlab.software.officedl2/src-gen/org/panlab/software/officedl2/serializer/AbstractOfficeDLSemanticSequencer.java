package org.panlab.software.officedl2.serializer;

import FederationOffice.FederationOfficePackage;
import FederationOffice.Office;
import FederationOffice.availabilityContract.Availability;
import FederationOffice.availabilityContract.AvailabilityContractPackage;
import FederationOffice.availabilityContract.Cost;
import FederationOffice.availabilityContract.ResourceServiceContract;
import FederationOffice.providersite.IGW;
import FederationOffice.providersite.PTM;
import FederationOffice.providersite.ProvidersitePackage;
import FederationOffice.providersite.Site;
import FederationOffice.providersite.SiteLocation;
import FederationOffice.resources.OfferedResource;
import FederationOffice.resources.Resource;
import FederationOffice.resources.ResourceCategory;
import FederationOffice.resources.ResourceSetting;
import FederationOffice.resources.ResourcesPackage;
import FederationOffice.services.AbstractSetting;
import FederationOffice.services.OfferedService;
import FederationOffice.services.Service;
import FederationOffice.services.ServiceComposition;
import FederationOffice.services.ServiceSetting;
import FederationOffice.services.ServicesPackage;
import FederationOffice.services.SettingConstraint;
import FederationOffice.services.Taxonomy;
import FederationOffice.services.tideTypeEnum;
import FederationOffice.services.tideTypeEnumItem;
import FederationOffice.services.tideTypeList;
import FederationOffice.services.tideTypeString;
import FederationOffice.services.tideTypeTideElement;
import FederationOffice.slareservations.ReservedResourceContract;
import FederationOffice.slareservations.SLA;
import FederationOffice.slareservations.SlareservationsPackage;
import FederationOffice.users.Account;
import FederationOffice.users.Admin;
import FederationOffice.users.OfficeCustomer;
import FederationOffice.users.OfficePersonel;
import FederationOffice.users.ResourcesProvider;
import FederationOffice.users.TestbedDesigner;
import FederationOffice.users.UsersPackage;
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
import org.panlab.software.officedl2.officeDL.ImportOffice;
import org.panlab.software.officedl2.officeDL.OfficeDLPackage;
import org.panlab.software.officedl2.officeDL.OfficeRule;
import org.panlab.software.officedl2.services.OfficeDLGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractOfficeDLSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected OfficeDLGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == FederationOfficePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FederationOfficePackage.OFFICE:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getOfficeRule()) {
					sequence_Office(context, (Office) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == AvailabilityContractPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AvailabilityContractPackage.AVAILABILITY:
				if(context == grammarAccess.getAvailabilityRule()) {
					sequence_Availability(context, (Availability) semanticObject); 
					return; 
				}
				else break;
			case AvailabilityContractPackage.COST:
				if(context == grammarAccess.getCostRule()) {
					sequence_Cost(context, (Cost) semanticObject); 
					return; 
				}
				else break;
			case AvailabilityContractPackage.RESOURCE_SERVICE_CONTRACT:
				if(context == grammarAccess.getResourceServiceContractRule()) {
					sequence_ResourceServiceContract(context, (ResourceServiceContract) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == OfficeDLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case OfficeDLPackage.IMPORT_OFFICE:
				if(context == grammarAccess.getImportOfficeRule()) {
					sequence_ImportOffice(context, (ImportOffice) semanticObject); 
					return; 
				}
				else break;
			case OfficeDLPackage.OFFICE_RULE:
				if(context == grammarAccess.getOfficeRuleRule()) {
					sequence_OfficeRule(context, (OfficeRule) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ProvidersitePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ProvidersitePackage.IGW:
				if(context == grammarAccess.getIGWRule()) {
					sequence_IGW(context, (IGW) semanticObject); 
					return; 
				}
				else break;
			case ProvidersitePackage.PTM:
				if(context == grammarAccess.getPTMRule()) {
					sequence_PTM(context, (PTM) semanticObject); 
					return; 
				}
				else break;
			case ProvidersitePackage.SITE:
				if(context == grammarAccess.getSiteRule()) {
					sequence_Site(context, (Site) semanticObject); 
					return; 
				}
				else break;
			case ProvidersitePackage.SITE_LOCATION:
				if(context == grammarAccess.getSiteLocationRule()) {
					sequence_SiteLocation(context, (SiteLocation) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ResourcesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ResourcesPackage.OFFERED_RESOURCE:
				if(context == grammarAccess.getOfferedResourceRule() ||
				   context == grammarAccess.getResourceRule()) {
					sequence_OfferedResource(context, (OfferedResource) semanticObject); 
					return; 
				}
				else break;
			case ResourcesPackage.RESOURCE:
				if(context == grammarAccess.getResourceRule() ||
				   context == grammarAccess.getResource_ImplRule()) {
					sequence_Resource_Impl(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			case ResourcesPackage.RESOURCE_CATEGORY:
				if(context == grammarAccess.getResourceCategoryRule()) {
					sequence_ResourceCategory(context, (ResourceCategory) semanticObject); 
					return; 
				}
				else break;
			case ResourcesPackage.RESOURCE_SETTING:
				if(context == grammarAccess.getResourceSettingRule()) {
					sequence_ResourceSetting(context, (ResourceSetting) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ServicesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ServicesPackage.ABSTRACT_SETTING:
				if(context == grammarAccess.getAbstractSettingRule() ||
				   context == grammarAccess.getAbstractSetting_ImplRule()) {
					sequence_AbstractSetting_Impl(context, (AbstractSetting) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.OFFERED_SERVICE:
				if(context == grammarAccess.getOfferedServiceRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_OfferedService(context, (OfferedService) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.SERVICE:
				if(context == grammarAccess.getServiceRule() ||
				   context == grammarAccess.getService_ImplRule()) {
					sequence_Service_Impl(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.SERVICE_COMPOSITION:
				if(context == grammarAccess.getServiceCompositionRule()) {
					sequence_ServiceComposition(context, (ServiceComposition) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.SERVICE_SETTING:
				if(context == grammarAccess.getAbstractSettingRule() ||
				   context == grammarAccess.getServiceSettingRule()) {
					sequence_ServiceSetting(context, (ServiceSetting) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.SETTING_CONSTRAINT:
				if(context == grammarAccess.getSettingConstraintRule()) {
					sequence_SettingConstraint(context, (SettingConstraint) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.TAXONOMY:
				if(context == grammarAccess.getTaxonomyRule()) {
					sequence_Taxonomy(context, (Taxonomy) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.TIDE_TYPE_ENUM:
				if(context == grammarAccess.getSettingTypeRule() ||
				   context == grammarAccess.getTideTypeEnumRule()) {
					sequence_tideTypeEnum(context, (tideTypeEnum) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.TIDE_TYPE_ENUM_ITEM:
				if(context == grammarAccess.getTideTypeEnumItemRule()) {
					sequence_tideTypeEnumItem(context, (tideTypeEnumItem) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.TIDE_TYPE_LIST:
				if(context == grammarAccess.getSettingTypeRule() ||
				   context == grammarAccess.getTideTypeListRule()) {
					sequence_tideTypeList(context, (tideTypeList) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.TIDE_TYPE_STRING:
				if(context == grammarAccess.getSettingTypeRule() ||
				   context == grammarAccess.getTideTypeStringRule()) {
					sequence_tideTypeString(context, (tideTypeString) semanticObject); 
					return; 
				}
				else break;
			case ServicesPackage.TIDE_TYPE_TIDE_ELEMENT:
				if(context == grammarAccess.getSettingTypeRule() ||
				   context == grammarAccess.getTideTypeTideElementRule()) {
					sequence_tideTypeTideElement(context, (tideTypeTideElement) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SlareservationsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SlareservationsPackage.RESERVED_RESOURCE_CONTRACT:
				if(context == grammarAccess.getReservedResourceContractRule()) {
					sequence_ReservedResourceContract(context, (ReservedResourceContract) semanticObject); 
					return; 
				}
				else break;
			case SlareservationsPackage.SLA:
				if(context == grammarAccess.getSLARule()) {
					sequence_SLA(context, (SLA) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == UsersPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case UsersPackage.ACCOUNT:
				if(context == grammarAccess.getAccountRule()) {
					sequence_Account(context, (Account) semanticObject); 
					return; 
				}
				else break;
			case UsersPackage.ADMIN:
				if(context == grammarAccess.getAdminRule() ||
				   context == grammarAccess.getOfficeUserRule()) {
					sequence_Admin(context, (Admin) semanticObject); 
					return; 
				}
				else break;
			case UsersPackage.OFFICE_CUSTOMER:
				if(context == grammarAccess.getOfficeCustomerRule() ||
				   context == grammarAccess.getOfficeUserRule()) {
					sequence_OfficeCustomer(context, (OfficeCustomer) semanticObject); 
					return; 
				}
				else break;
			case UsersPackage.OFFICE_PERSONEL:
				if(context == grammarAccess.getOfficePersonel_ImplRule() ||
				   context == grammarAccess.getOfficeUserRule()) {
					sequence_OfficePersonel_Impl(context, (OfficePersonel) semanticObject); 
					return; 
				}
				else break;
			case UsersPackage.RESOURCES_PROVIDER:
				if(context == grammarAccess.getOfficeUserRule() ||
				   context == grammarAccess.getResourcesProvider_ImplRule()) {
					sequence_ResourcesProvider_Impl(context, (ResourcesProvider) semanticObject); 
					return; 
				}
				else break;
			case UsersPackage.TESTBED_DESIGNER:
				if(context == grammarAccess.getOfficeUserRule() ||
				   context == grammarAccess.getTestbedDesignerRule()) {
					sequence_TestbedDesigner(context, (TestbedDesigner) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         userExposed?='userExposed'? 
	 *         userEditable?='userEditable'? 
	 *         canBePublished?='canBePublished'? 
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         Readable?='Readable'? 
	 *         Writable?='Writable'? 
	 *         (requiresParams+=[AbstractSetting|STRING] requiresParams+=[AbstractSetting|STRING]*)? 
	 *         settingType=SettingType? 
	 *         (settingConstraints+=SettingConstraint settingConstraints+=SettingConstraint*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    settingType[0, 1]
	 *    userExposed[0, 1]
	 *    userEditable[0, 1]
	 *    canBePublished[0, 1]
	 *    Readable[0, 1]
	 *    Writable[0, 1]
	 *    settingConstraints[0, *]
	 *    requiresParams[0, *]
	 */
	protected void sequence_AbstractSetting_Impl(EObject context, AbstractSetting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         password=STRING? 
	 *         username=STRING?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    password[0, 1]
	 *    username[0, 1]
	 */
	protected void sequence_Account(EObject context, Account semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         organization=STRING? 
	 *         address=STRING? 
	 *         telephone=STRING? 
	 *         hasAccount=Account?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    hasAccount[0, 1]
	 *    organization[0, 1]
	 *    address[0, 1]
	 *    telephone[0, 1]
	 */
	protected void sequence_Admin(EObject context, Admin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         Repeat?='Repeat'? 
	 *         FromTime=EDate? 
	 *         ToTime=EDate? 
	 *         FromDate=EDate? 
	 *         ToDate=EDate? 
	 *         Repeatability=RepatabilityScheme? 
	 *         RepeatUntil=EDate? 
	 *         cost=Cost?
	 *     )
	 *
	 * Features:
	 *    FromTime[0, 1]
	 *    ToTime[0, 1]
	 *    cost[0, 1]
	 *    FromDate[0, 1]
	 *    ToDate[0, 1]
	 *    Repeatability[0, 1]
	 *    Repeat[0, 1]
	 *    RepeatUntil[0, 1]
	 */
	protected void sequence_Availability(EObject context, Availability semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (perUnit=costUnit? Amount=EDoubleObject?)
	 *
	 * Features:
	 *    perUnit[0, 1]
	 *    Amount[0, 1]
	 */
	protected void sequence_Cost(EObject context, Cost semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uniqueID=STRING name=STRING? id=EInt? description=STRING? IP=STRING?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    IP[0, 1]
	 */
	protected void sequence_IGW(EObject context, IGW semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 *
	 * Features:
	 *    importURI[1, 1]
	 */
	protected void sequence_ImportOffice(EObject context, ImportOffice semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, OfficeDLPackage.Literals.IMPORT_OFFICE__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, OfficeDLPackage.Literals.IMPORT_OFFICE__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportOfficeAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         resourceType=ResourceType? 
	 *         multitonMaxOccur=EInt? 
	 *         (contributesToCategories+=[ResourceCategory|STRING] contributesToCategories+=[ResourceCategory|STRING]*)? 
	 *         (requiresResources+=[Resource|STRING] requiresResources+=[Resource|STRING]*)? 
	 *         implOfferedService=[Service|STRING]? 
	 *         (resourceSettings+=ResourceSetting resourceSettings+=ResourceSetting*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    resourceSettings[0, *]
	 *    contributesToCategories[0, *]
	 *    requiresResources[0, *]
	 *    resourceType[0, 1]
	 *    implOfferedService[0, 1]
	 *    multitonMaxOccur[0, 1]
	 */
	protected void sequence_OfferedResource(EObject context, OfferedResource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         (requiresServices+=[Service|STRING] requiresServices+=[Service|STRING]*)? 
	 *         (serviceSettings+=ServiceSetting serviceSettings+=ServiceSetting*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    serviceSettings[0, *]
	 *    requiresServices[0, *]
	 */
	protected void sequence_OfferedService(EObject context, OfferedService semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         organization=STRING? 
	 *         address=STRING? 
	 *         telephone=STRING? 
	 *         (utilizesVirtualTestbed+=[RequestedFederationScenario|STRING] utilizesVirtualTestbed+=[RequestedFederationScenario|STRING]*)? 
	 *         hasTestbedDesigner=[TestbedDesigner|STRING]? 
	 *         hasAccount=Account?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    hasAccount[0, 1]
	 *    organization[0, 1]
	 *    address[0, 1]
	 *    telephone[0, 1]
	 *    utilizesVirtualTestbed[0, *]
	 *    hasTestbedDesigner[0, 1]
	 */
	protected void sequence_OfficeCustomer(EObject context, OfficeCustomer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         organization=STRING? 
	 *         address=STRING? 
	 *         telephone=STRING? 
	 *         hasAccount=Account?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    hasAccount[0, 1]
	 *    organization[0, 1]
	 *    address[0, 1]
	 *    telephone[0, 1]
	 */
	protected void sequence_OfficePersonel_Impl(EObject context, OfficePersonel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=ImportOffice* testbedOfficev=Office)
	 *
	 * Features:
	 *    imports[0, *]
	 *    testbedOfficev[1, 1]
	 */
	protected void sequence_OfficeRule(EObject context, OfficeRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         resourceURI=STRING? 
	 *         APIGateway=STRING? 
	 *         (registeredUsers+=OfficeUser registeredUsers+=OfficeUser*)? 
	 *         (contributedTaxonomies+=Taxonomy contributedTaxonomies+=Taxonomy*)? 
	 *         (offeredServices+=OfferedService offeredServices+=OfferedService*)? 
	 *         (offeredServiceCompositions+=ServiceComposition offeredServiceCompositions+=ServiceComposition*)? 
	 *         (ResourceServiceContracts+=ResourceServiceContract ResourceServiceContracts+=ResourceServiceContract*)? 
	 *         (SLAs+=SLA SLAs+=SLA*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    registeredUsers[0, *]
	 *    contributedTaxonomies[0, *]
	 *    offeredServices[0, *]
	 *    offeredServiceCompositions[0, *]
	 *    ResourceServiceContracts[0, *]
	 *    SLAs[0, *]
	 *    resourceURI[0, 1]
	 *    APIGateway[0, 1]
	 */
	protected void sequence_Office(EObject context, Office semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uniqueID=STRING name=STRING? id=EInt? description=STRING? IP=STRING?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    IP[0, 1]
	 */
	protected void sequence_PTM(EObject context, PTM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         ValidFrom=EDate? 
	 *         ValidUntil=EDate? 
	 *         forResource=[OfferedResource|STRING]?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    ValidFrom[0, 1]
	 *    forResource[0, 1]
	 *    ValidUntil[0, 1]
	 */
	protected void sequence_ReservedResourceContract(EObject context, ReservedResourceContract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uniqueID=STRING name=STRING? id=EInt? description=STRING? (resourcelist+=[Resource|STRING] resourcelist+=[Resource|STRING]*)?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    resourcelist[0, *]
	 */
	protected void sequence_ResourceCategory(EObject context, ResourceCategory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         StartDate=EDate 
	 *         EndDate=EDate 
	 *         forOfferedService=[Service|STRING] 
	 *         forOfferedResource=[OfferedResource|STRING] 
	 *         availability=Availability?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    forOfferedService[1, 1]
	 *    forOfferedResource[1, 1]
	 *    StartDate[1, 1]
	 *    EndDate[1, 1]
	 *    availability[0, 1]
	 */
	protected void sequence_ResourceServiceContract(EObject context, ResourceServiceContract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         userExposed?='userExposed'? 
	 *         userEditable?='userEditable'? 
	 *         canBePublished?='canBePublished'? 
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         Readable?='Readable'? 
	 *         Writable?='Writable'? 
	 *         (requiresParams+=[AbstractSetting|STRING] requiresParams+=[AbstractSetting|STRING]*)? 
	 *         (OnlyConfiguredByResources+=[Resource|STRING] OnlyConfiguredByResources+=[Resource|STRING]*)? 
	 *         implServiceSetting=[ServiceSetting|STRING]? 
	 *         settingType=SettingType? 
	 *         (settingConstraints+=SettingConstraint settingConstraints+=SettingConstraint*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    settingType[0, 1]
	 *    userExposed[0, 1]
	 *    userEditable[0, 1]
	 *    canBePublished[0, 1]
	 *    Readable[0, 1]
	 *    Writable[0, 1]
	 *    settingConstraints[0, *]
	 *    requiresParams[0, *]
	 *    OnlyConfiguredByResources[0, *]
	 *    implServiceSetting[0, 1]
	 */
	protected void sequence_ResourceSetting(EObject context, ResourceSetting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         (contributesToCategories+=[ResourceCategory|STRING] contributesToCategories+=[ResourceCategory|STRING]*)? 
	 *         (requiresResources+=[Resource|STRING] requiresResources+=[Resource|STRING]*)? 
	 *         (resourceSettings+=ResourceSetting resourceSettings+=ResourceSetting*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    resourceSettings[0, *]
	 *    contributesToCategories[0, *]
	 *    requiresResources[0, *]
	 */
	protected void sequence_Resource_Impl(EObject context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         organization=STRING? 
	 *         address=STRING? 
	 *         telephone=STRING? 
	 *         hasAccount=Account? 
	 *         (offeredSiteList+=Site offeredSiteList+=Site*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    hasAccount[0, 1]
	 *    organization[0, 1]
	 *    address[0, 1]
	 *    telephone[0, 1]
	 *    offeredSiteList[0, *]
	 */
	protected void sequence_ResourcesProvider_Impl(EObject context, ResourcesProvider semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         ValidFrom=EDate? 
	 *         ValidUntil=EDate? 
	 *         forVT=[RequestedFederationScenario|STRING]? 
	 *         (ReservedRsources+=ReservedResourceContract ReservedRsources+=ReservedResourceContract*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    ReservedRsources[0, *]
	 *    forVT[0, 1]
	 *    ValidFrom[0, 1]
	 *    ValidUntil[0, 1]
	 */
	protected void sequence_SLA(EObject context, SLA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uniqueID=STRING name=STRING? id=EInt? description=STRING? (hasServices+=[Service|STRING] hasServices+=[Service|STRING]*)?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    hasServices[0, *]
	 */
	protected void sequence_ServiceComposition(EObject context, ServiceComposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         userExposed?='userExposed'? 
	 *         userEditable?='userEditable'? 
	 *         canBePublished?='canBePublished'? 
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         Readable?='Readable'? 
	 *         Writable?='Writable'? 
	 *         (requiresParams+=[AbstractSetting|STRING] requiresParams+=[AbstractSetting|STRING]*)? 
	 *         (mappedToResourceSettings+=[ResourceSetting|STRING] mappedToResourceSettings+=[ResourceSetting|STRING]*)? 
	 *         (providedByResources+=[Resource|STRING] providedByResources+=[Resource|STRING]*)? 
	 *         settingType=SettingType? 
	 *         (settingConstraints+=SettingConstraint settingConstraints+=SettingConstraint*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    settingType[0, 1]
	 *    userExposed[0, 1]
	 *    userEditable[0, 1]
	 *    canBePublished[0, 1]
	 *    Readable[0, 1]
	 *    Writable[0, 1]
	 *    settingConstraints[0, *]
	 *    requiresParams[0, *]
	 *    mappedToResourceSettings[0, *]
	 *    providedByResources[0, *]
	 */
	protected void sequence_ServiceSetting(EObject context, ServiceSetting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         (requiresServices+=[Service|STRING] requiresServices+=[Service|STRING]*)? 
	 *         (serviceSettings+=ServiceSetting serviceSettings+=ServiceSetting*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    serviceSettings[0, *]
	 *    requiresServices[0, *]
	 */
	protected void sequence_Service_Impl(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         AvailableAfterOperation?='AvailableAfterOperation'? 
	 *         RequiredBeforeOperation?='RequiredBeforeOperation'? 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         ForOperation=ServiceResourceOperation?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    ForOperation[0, 1]
	 *    AvailableAfterOperation[0, 1]
	 *    RequiredBeforeOperation[0, 1]
	 */
	protected void sequence_SettingConstraint(EObject context, SettingConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         address=STRING? 
	 *         geocoords=STRING?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    address[0, 1]
	 *    geocoords[0, 1]
	 */
	protected void sequence_SiteLocation(EObject context, SiteLocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         ptm=PTM 
	 *         igwlist+=IGW 
	 *         igwlist+=IGW* 
	 *         locatedAt=SiteLocation 
	 *         (offeredResourcesList+=OfferedResource offeredResourcesList+=OfferedResource*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    ptm[1, 1]
	 *    igwlist[1, *]
	 *    locatedAt[1, 1]
	 *    offeredResourcesList[0, *]
	 */
	protected void sequence_Site(EObject context, Site semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         (hasScenarios+=[RequestedFederationScenario|STRING] hasScenarios+=[RequestedFederationScenario|STRING]*)? 
	 *         (hasServices+=[Service|STRING] hasServices+=[Service|STRING]*)? 
	 *         (taxonomies+=Taxonomy taxonomies+=Taxonomy*)? 
	 *         (categories+=ResourceCategory categories+=ResourceCategory*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    taxonomies[0, *]
	 *    categories[0, *]
	 *    hasScenarios[0, *]
	 *    hasServices[0, *]
	 */
	protected void sequence_Taxonomy(EObject context, Taxonomy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         organization=STRING? 
	 *         address=STRING? 
	 *         telephone=STRING? 
	 *         (designsVirtualTestbeds+=[RequestedFederationScenario|STRING] designsVirtualTestbeds+=[RequestedFederationScenario|STRING]*)? 
	 *         hasAccount=Account?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    hasAccount[0, 1]
	 *    organization[0, 1]
	 *    address[0, 1]
	 *    telephone[0, 1]
	 *    designsVirtualTestbeds[0, *]
	 */
	protected void sequence_TestbedDesigner(EObject context, TestbedDesigner semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING? description=STRING?)
	 *
	 * Features:
	 *    value[0, 1]
	 *    description[0, 1]
	 */
	protected void sequence_tideTypeEnumItem(EObject context, tideTypeEnumItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         uniqueID=STRING 
	 *         name=STRING? 
	 *         id=EInt? 
	 *         description=STRING? 
	 *         defaultValue=[tideTypeEnumItem|STRING]? 
	 *         (tideEnumlist+=tideTypeEnumItem tideEnumlist+=tideTypeEnumItem*)?
	 *     )
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    tideEnumlist[0, *]
	 *    defaultValue[0, 1]
	 */
	protected void sequence_tideTypeEnum(EObject context, tideTypeEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uniqueID=STRING name=STRING? id=EInt? description=STRING? ContainsElementsOf=[NamedElement|STRING]?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    ContainsElementsOf[0, 1]
	 */
	protected void sequence_tideTypeList(EObject context, tideTypeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uniqueID=STRING name=STRING? id=EInt? description=STRING? defaultValue=STRING?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    defaultValue[0, 1]
	 */
	protected void sequence_tideTypeString(EObject context, tideTypeString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uniqueID=STRING name=STRING? id=EInt? description=STRING? ofTideElement=[NamedElement|STRING]?)
	 *
	 * Features:
	 *    name[0, 1]
	 *    id[0, 1]
	 *    description[0, 1]
	 *    uniqueID[1, 1]
	 *    ofTideElement[0, 1]
	 */
	protected void sequence_tideTypeTideElement(EObject context, tideTypeTideElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
