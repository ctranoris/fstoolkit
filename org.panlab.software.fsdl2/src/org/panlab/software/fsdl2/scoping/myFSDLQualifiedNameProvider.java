package org.panlab.software.fsdl2.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;

import FederationOffice.federationscenarios.ServiceRequest;
import FederationOffice.federationscenarios.ServiceSettingInstance;

public class myFSDLQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

//	@Override
//	public String getQualifiedName(EObject obj) {
//		System.out.println("myFSDLQualifiedNameProvider getQualifiedName = "+obj.toString());
//		return super.getQualifiedName(obj);
//	}
	
	
// WARNING: For the FederationOffice.resources.OfferedResource qualified Names, please see the OfficeDL module, where it is possible to have also there qualified names
	public String qualifiedName(FederationOffice.resources.OfferedResource obj) {

		System.out.println(">>>qualifiedName>>>="+ obj.toString() );
		return obj.getFullQualifiedName();
	}
	
	
	public String qualifiedName( ServiceSettingInstance obj) {
		System.out.println(">>>qualifiedName ServiceSettingInstance>>>="+ obj.toString() );
		return  ( (ServiceRequest)obj.eContainer()).getName()  + "." + obj.getName();
	}
}
