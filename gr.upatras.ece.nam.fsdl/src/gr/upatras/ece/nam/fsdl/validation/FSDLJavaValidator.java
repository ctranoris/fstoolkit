package gr.upatras.ece.nam.fsdl.validation;
 

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import brokermodel.BrokermodelPackage;
import brokermodel.federationscenarios.InfrastructureRequest;
import brokermodel.federationscenarios.ResourceRequest;
import brokermodel.federationscenarios.ResourceSettingInstance;
import brokermodel.federationscenarios.ServiceRequest;
import brokermodel.federationscenarios.ServiceSettingInstance;
import brokermodel.federationscenarios.ServicesRequest;
import brokermodel.federationscenarios.SettingInstance;
import brokermodel.resources.Resource;
import brokermodel.services.AbstractSetting;
import brokermodel.services.Service;
 

public class FSDLJavaValidator extends AbstractFSDLJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

	@Override
    protected List<EPackage> getEPackages() {
        List<EPackage> result = new ArrayList<EPackage>();
        result.add(BrokermodelPackage.eINSTANCE);
//        result.add(org.panlab.virtualTestbedDL.VirtualTestbedDLPackage.eINSTANCE);
//        result.add(tide.virtualtestbed.VirtualtestbedPackage.eINSTANCE);
        return result;
    }
	
//	@Check
//	public void checkIPSetting( ServiceSettingInstance e ){
//		//System.out.println("Check checkIPSetting");
//		if (e.getName().toUpperCase().equals("IP"))
//			if ( ( (ServiceRequest)e.eContainer() ).getNumOfServices()>1 )
//				if ( !e.getStaticValue().contains("->")  )
//					warning("The IP should be in the form XXX.XXX.XXX.XXX -> XXX.XXX.XXX.YYY", 
//							brokermodel.federationscenarios.FederationscenariosPackage.SERVICE_SETTING_INSTANCE__STATIC_VALUE  );
//	}
	
	@Check
	public void checkTODOvalue( ServiceSettingInstance e ){
		//System.out.println("Check checkTODOvalue");
		if ( ( e.getStaticValue()!=null ) && (e.getStaticValue().contains("TODO:")) ){
			EStructuralFeature feature =   
					brokermodel.federationscenarios.FederationscenariosPackage.Literals.SETTING_INSTANCE.getEIDAttribute()  ;			
			warning("Set here either a static value or \n or use the keyword 'assign' instead of = " +
					"in order to assign a value from another setting",
					feature  );
				
			
		}
	}
	
	@Check
	public void checkRequiresService( ServiceRequest e ){
		//System.out.println("Check checkIPSetting");
		String msg="";
		if ( (e.getRefService()!=null)&&(e.getRefService().getRequiresServices().size()>0  )){
			ServicesRequest sr = (ServicesRequest)e.eContainer();
			for (Service requiredService : e.getRefService().getRequiresServices()) {
				boolean serviceExistInRequest=false;
				for (ServiceRequest reqService : sr.getServiceRequestList() ) {
					if (reqService.getRefService().getName().equals( requiredService.getName() ) ){
						serviceExistInRequest = true;
					}
				}				
				if (!serviceExistInRequest){
					msg += "A \""+ e.getRefService().getName()+ "\" service, requests also service "+requiredService.getName() +" to be present in the scenario. Please add it.\n";
				}
			}
		}
		
		if (! "".equals(msg)){
			EStructuralFeature feature =  brokermodel.federationscenarios.FederationscenariosPackage.Literals.SERVICE_REQUEST.getEStructuralFeature("name");
			error(msg, feature );
		}
		
	}
	
	@Check
	public void checkRequiresServiceSetting( ServiceSettingInstance e ){
		//System.out.println("Check checkIPSetting");
		String msg="";
		if ( (e.getRefServiceSetting()!=null)&&(e.getRefServiceSetting().getRequiresParams().size()>0  )){
				for (AbstractSetting reqSetting : e.getRefServiceSetting().getRequiresParams()) {
					boolean settingExists=false;
					for (SettingInstance settingInstance : e.getAssignSetting()){ //if we have already some assignments, then check if contain the correct
						if (settingInstance instanceof ServiceSettingInstance)
							if ( ((ServiceSettingInstance)settingInstance).getRefServiceSetting().equals(reqSetting) ){
								settingExists = true;
							}						
					}
					if ( ! settingExists ){				
						msg += "Setting "+e.getName()+ " requests also setting "+ reqSetting.getName()
						+" of service "+  ((Service)reqSetting.eContainer()).getName() +" to be assigned. Please assign it.\n";
					}
				}
			
			if (! "".equals(msg)){
				EStructuralFeature feature =  brokermodel.federationscenarios.FederationscenariosPackage.Literals.SERVICE_SETTING_INSTANCE.getEStructuralFeature("name") ;	
				error(msg, feature );
			}
		}
	}
	
	
	@Check
	public void checkServiceSettingReadable( ServiceSettingInstance e ){
		if ( (e.getRefServiceSetting()!=null)&&(!e.getRefServiceSetting().isWritable() )){
			if ( (e.getStaticValue()!=null) || (e.getAssignSetting().size()>0) ){
				EStructuralFeature feature =  brokermodel.federationscenarios.FederationscenariosPackage.Literals.SERVICE_SETTING_INSTANCE.getEStructuralFeature("name");	
				error("Setting is Read only. It cannot be set by user and its value is available after provisioning. " +
						"It can be assigned to other services. " +
						"Please remove all static or assigned values", feature  );
			}
		}
	}
	
	
	@Check
	public void checkRequiresResource( ResourceRequest e ){
		//System.out.println("Check checkIPSetting");
		String msg="";
		if ( (e.getRefOfferedResource()!=null)&&(e.getRefOfferedResource().getRequiresResources().size()>0  )){
			InfrastructureRequest sr = (InfrastructureRequest)e.eContainer();
			for (Resource requiredResource : e.getRefOfferedResource().getRequiresResources()) {
				boolean resourceExistInRequest=false;
				for (ResourceRequest reqResource : sr.getReqOfferedResources() ) {
					if (reqResource.getRefOfferedResource().getName().equals( requiredResource.getName() ) ){
						resourceExistInRequest = true;
					}
				}				
				if (!resourceExistInRequest){
					msg += "A \""+ e.getRefOfferedResource().getName()+ "\" resource, requests also resource "+requiredResource.getName() +" to be present in the scenario. Please add it.\n";
				}
			}
		}
		
		if (! "".equals(msg)){
			EStructuralFeature feature =  brokermodel.federationscenarios.FederationscenariosPackage.Literals.RESOURCE_REQUEST.getEStructuralFeature("name");	
			error(msg, feature);
		}
		
	}

	@Check
	public void checkRequiresResourceSetting( ResourceSettingInstance e ){
		//System.out.println("Check checkIPSetting");
		String msg="";
		if ( (e.getRefResourceSetting()!=null)&&(e.getRefResourceSetting().getRequiresParams().size()>0  )){
				for (AbstractSetting reqSetting : e.getRefResourceSetting().getRequiresParams()) {
					boolean settingExists=false;
					for (SettingInstance settingInstance : e.getAssignSetting()){ //if we have already some assignments, then check if contain the correct
						if (settingInstance instanceof ResourceSettingInstance)
							if ( ((ResourceSettingInstance)settingInstance).getRefResourceSetting().equals(reqSetting) ){
								settingExists = true;
							}						
					}
					if ( ! settingExists ){				
						msg += "Setting "+e.getName()+ " requests also setting "+ reqSetting.getName()
						+" of resource "+  ((Resource)reqSetting.eContainer()).getName() +" to be assigned. Please assign it.\n";
					}
				}
			
			if (! "".equals(msg)){
				EStructuralFeature feature =  brokermodel.federationscenarios.FederationscenariosPackage.Literals.RESOURCE_SETTING_INSTANCE.getEStructuralFeature("name");	
				error(msg, feature  );
			}
		}
	}
	
	
	@Check
	public void checkResourceSettingReadable( ResourceSettingInstance e ){
		if ( (e.getRefResourceSetting()!=null)&&(!e.getRefResourceSetting().isWritable() )){
			if ( (e.getStaticValue()!=null) || (e.getAssignSetting().size()>0) ){
				EStructuralFeature feature =  brokermodel.federationscenarios.FederationscenariosPackage.Literals.RESOURCE_SETTING_INSTANCE.getEStructuralFeature("name");	
				error("Setting is Read only. It cannot be set by user and its value is available after provisioning. " +
						"It can be assigned to other resources. " +
						"Please remove all static or assigned values", feature  );
			}
		}
	}
}

