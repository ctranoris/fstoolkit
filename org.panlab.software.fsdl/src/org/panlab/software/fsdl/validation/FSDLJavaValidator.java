package org.panlab.software.fsdl.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

import FederationOffice.FederationOfficePackage;
import FederationOffice.federationscenarios.InfrastructureRequest;
import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;
import FederationOffice.federationscenarios.ServiceRequest;
import FederationOffice.federationscenarios.ServiceSettingInstance;
import FederationOffice.federationscenarios.ServicesRequest;
import FederationOffice.federationscenarios.SettingInstance;
import FederationOffice.resources.Resource;
import FederationOffice.services.AbstractSetting;
import FederationOffice.services.Service;
 

public class FSDLJavaValidator extends AbstractFSDLJavaValidator {

//	@Check
//	public void checkTypeNameStartsWithCapital(Type type) {
//		if (!Character.isUpperCase(type.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.TYPE__NAME);
//		}
//	}
	
	@Override
    protected List<EPackage> getEPackages() {
        List<EPackage> result = new ArrayList<EPackage>();
        result.add(FederationOfficePackage.eINSTANCE);
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
//							FederationOffice.federationscenarios.FederationscenariosPackage.SERVICE_SETTING_INSTANCE__STATIC_VALUE  );
//	}
	
	@Check
	public void checkTODOvalue( ServiceSettingInstance e ){
		//System.out.println("Check checkTODOvalue");
		if ( ( e.getStaticValue()!=null ) && (e.getStaticValue().contains("TODO:")) ){
			warning("Set here either a static value or \n or use the keyword 'assign' instead of = in order to assign a value from another setting", 
					FederationOffice.federationscenarios.FederationscenariosPackage.SERVICE_SETTING_INSTANCE__STATIC_VALUE  );
				
			
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
					msg += "A \""+ e.getName()+ "\" service, requests also service "+requiredService.getName() +" to be present in the scenario. Please add it.\n";
				}
			}
		}
		
		if (! "".equals(msg)){
			error(msg, 
					FederationOffice.federationscenarios.FederationscenariosPackage.SERVICE_REQUEST__NAME  );
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
				error(msg, 
						FederationOffice.federationscenarios.FederationscenariosPackage.SERVICE_SETTING_INSTANCE__NAME  );
			}
		}
	}
	
	
	@Check
	public void checkServiceSettingReadable( ServiceSettingInstance e ){
		if ( (e.getRefServiceSetting()!=null)&&(!e.getRefServiceSetting().isWritable() )){
			if ( (e.getStaticValue()!=null) || (e.getAssignSetting().size()>0) )
				error("Setting is Read only. It cannot be set by user and its value is available after provisioning. " +
						"It can be assigned to other services. " +
						"Please remove all static or assigned values", 
					FederationOffice.federationscenarios.FederationscenariosPackage.SERVICE_SETTING_INSTANCE__NAME  );
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
					msg += "A \""+ e.getName()+ "\" resource, requests also resource "+requiredResource.getName() +" to be present in the scenario. Please add it.\n";
				}
			}
		}
		
		if (! "".equals(msg)){
			error(msg, 
					FederationOffice.federationscenarios.FederationscenariosPackage.RESOURCE_REQUEST__NAME   );
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
				error(msg, 
						FederationOffice.federationscenarios.FederationscenariosPackage.RESOURCE_SETTING_INSTANCE__NAME  );
			}
		}
	}
	
	
	@Check
	public void checkResourceSettingReadable( ResourceSettingInstance e ){
		if ( (e.getRefResourceSetting()!=null)&&(!e.getRefResourceSetting().isWritable() )){
			if ( (e.getStaticValue()!=null) || (e.getAssignSetting().size()>0) )
				error("Setting is Read only. It cannot be set by user and its value is available after provisioning. " +
						"It can be assigned to other resources. " +
						"Please remove all static or assigned values", 
					FederationOffice.federationscenarios.FederationscenariosPackage.RESOURCE_SETTING_INSTANCE__NAME  );
			}
	}
}
