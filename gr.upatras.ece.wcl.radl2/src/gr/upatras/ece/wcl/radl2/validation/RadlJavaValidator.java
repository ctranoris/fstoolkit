package gr.upatras.ece.wcl.radl2.validation;

import gr.upatras.ece.wcl.radl2.radl.ConfigurationParam;
import gr.upatras.ece.wcl.radl2.radl.RadlPackage;
import gr.upatras.ece.wcl.radl2.radl.ResourceAdapter;

import java.util.Iterator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import brokermodel.Broker;
import brokermodel.services.ServiceSetting;
 

public class RadlJavaValidator extends AbstractRadlJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
public static final String INVALID_CheckResourceAdapterImplements = "INVALID_CheckResourceAdapterImplements";
	
	@Check
	public void checkResourceAdapterImplements(ResourceAdapter  type) {
		System.out.println("checkResourceAdapterImplements");
		boolean allExists=true;
		String forQFix="";
		if (type.getImplname()!=null){
			//System.out.println("checkMainRule type.getName()="+type.getImplname().getName()  );
			brokermodel.services.OfferedService ofserv = type.getImplname();
			for (Iterator<ServiceSetting> iterator = ofserv.getServiceSettings().iterator(); iterator.hasNext();) {
				ServiceSetting servsetting = (ServiceSetting) iterator.next();				
				//System.out.println("servsetting.getName() ="+servsetting.getName()  );
				if (!checkForImplementedServiceSetting( servsetting.getName(), type )){
					allExists = false ;
					 
					Broker tBroker= (Broker) type.getImplname().eContainer();
					String fullName = tBroker.getName() +"." + type.getImplname().getName() +"." +servsetting.getName();
					forQFix += "\t\""+servsetting.getName() +"\"" +" implements \""+ fullName +"\";"+
							"\n";
				}
			}
			 
			if ( !allExists  ) {		
				EStructuralFeature feature =  RadlPackage.Literals.RESOURCE_ADAPTER.getEStructuralFeature("name");		
				error( "Please implement all service settings of "+ type.getImplname().getName(), feature , INVALID_CheckResourceAdapterImplements, forQFix );
				
			}
		}		
	}
	
	private boolean checkForImplementedServiceSetting(String srvsettingName, ResourceAdapter  type){
		for (Iterator<ConfigurationParam> iterator = type.getConfParams().iterator(); iterator.hasNext();) {
			ConfigurationParam confParam = (ConfigurationParam) iterator.next();				
			System.out.println("checkForImplementedServiceSetting  ="+confParam.getName() +" for srvsettingName="+srvsettingName );
//			if (confParam.getServsetting()!=null)
//				if ( confParam.getServsetting().getName().equals(  srvsettingName ) )
//						return true;
		}		
		return false;
	}


}
