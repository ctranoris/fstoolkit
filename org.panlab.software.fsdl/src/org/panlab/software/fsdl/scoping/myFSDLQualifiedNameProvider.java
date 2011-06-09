package org.panlab.software.fsdl.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;

import FederationOffice.Office;
import FederationOffice.federationscenarios.ServiceRequest;
import FederationOffice.federationscenarios.ServiceSettingInstance;
import FederationOffice.providersite.Site;
import FederationOffice.users.ResourcesProvider;

public class myFSDLQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

//	@Override
//	public String getQualifiedName(EObject obj) {
//		System.out.println("myFSDLQualifiedNameProvider getQualifiedName = "+obj.toString());
//		return super.getQualifiedName(obj);
//	}
	
	
// WARNING: For the FederationOffice.resources.OfferedResource qualified Names, please see the OfficeDL module, where it is possible to have also there qualified names
	public String qualifiedName(FederationOffice.resources.OfferedResource obj) {
				
		return obj.getFullQualifiedName();
	}
	
	
	public String qualifiedName( ServiceSettingInstance obj) {
		return  ( (ServiceRequest)obj.eContainer()).getName()  + "." + obj.getName();
	}
}
