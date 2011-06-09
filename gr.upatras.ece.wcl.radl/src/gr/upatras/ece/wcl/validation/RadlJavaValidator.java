package gr.upatras.ece.wcl.validation;

import java.util.Iterator;

import gr.upatras.ece.wcl.radl.ConfigurationParam;
import gr.upatras.ece.wcl.radl.RadlPackage;
import gr.upatras.ece.wcl.radl.ResourceAdapter;

import org.eclipse.xtext.validation.Check;

import FederationOffice.Office;
import FederationOffice.services.ServiceSetting;

 

public class RadlJavaValidator extends AbstractRadlJavaValidator {


	public static final String INVALID_CheckResourceAdapterImplements = "INVALID_CheckResourceAdapterImplements";
	
	@Check
	public void checkResourceAdapterImplements(ResourceAdapter  type) {
		System.out.println("checkResourceAdapterImplements");
		boolean allExists=true;
		String forQFix="";
		if (type.getImplname()!=null){
			//System.out.println("checkMainRule type.getName()="+type.getImplname().getName()  );
			FederationOffice.services.OfferedService ofserv = type.getImplname();
			for (Iterator<ServiceSetting> iterator = ofserv.getServiceSettings().iterator(); iterator.hasNext();) {
				ServiceSetting servsetting = (ServiceSetting) iterator.next();				
				//System.out.println("servsetting.getName() ="+servsetting.getName()  );
				if (!checkForImplementedServiceSetting( servsetting.getName(), type )){
					allExists = false ;
					 
					Office toffice= (Office) type.getImplname().eContainer();
					String fullName = toffice.getName() +"." + type.getImplname().getName() +"." +servsetting.getName();
					forQFix += "\t\""+servsetting.getName() +"\"" +" implements \""+ fullName +"\";"+
							"\n";
				}
			}
			 
			if ( !allExists  ) {
				error( "Please implement all service settings of "+ type.getImplname().getName(), RadlPackage.RESOURCE_ADAPTER__IMPLNAME  , INVALID_CheckResourceAdapterImplements, forQFix );
				
			}
		}		
	}
	
	private boolean checkForImplementedServiceSetting(String srvsettingName, ResourceAdapter  type){
		for (Iterator<ConfigurationParam> iterator = type.getConfParams().iterator(); iterator.hasNext();) {
			ConfigurationParam confParam = (ConfigurationParam) iterator.next();				
			//System.out.println("checkForImplementedServiceSetting  ="+confParam.getName() +" for srvsettingName="+srvsettingName );
			if (confParam.getServsetting()!=null)
				if ( confParam.getServsetting().getName().equals(  srvsettingName ) )
						return true;
		}		
		return false;
	}

}
