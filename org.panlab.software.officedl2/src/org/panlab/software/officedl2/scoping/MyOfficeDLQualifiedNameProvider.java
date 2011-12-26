package org.panlab.software.officedl2.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import FederationOffice.Office;
import FederationOffice.federationscenarios.ServiceRequest;
import FederationOffice.federationscenarios.ServiceSettingInstance;

public class MyOfficeDLQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

//	@Override
//	public String getQualifiedName(EObject obj) {
//		System.out.println("MyOfficeDLQualifiedNameProvider getQualifiedName = "+obj.toString());
//		return super.getQualifiedName(obj);
//	}
	
	
//	public String qualifiedName(FederationOffice.resources.OfferedResource obj) {
//		return obj.getName();
//	}
	
//	public String qualifiedName(FederationOffice.resources.OfferedResource obj) {
//		return ( obj.getName() ); 
//	}
	
	
//	Qualified Name should be the same in the proposal Name
	
	public QualifiedName qualifiedName( FederationOffice.resources.OfferedResource obj) {
		//System.out.println(">>>qualifiedName ServiceSettingInstance>>>="+ obj.toString() );
		String n = obj.getName() ;//obj.getFullQualifiedName();
		QualifiedName qualifiedNameFromConverter = getConverter().toQualifiedName(n);
		return qualifiedNameFromConverter;
		
	}
	

	public QualifiedName qualifiedName( FederationOffice.services.OfferedService  obj) {
		//System.out.println(">>>qualifiedName ServiceSettingInstance>>>="+ obj.toString() );
		String n =  obj.getName()+"."+((Office)obj.eContainer()).getName();
		QualifiedName qualifiedNameFromConverter = getConverter().toQualifiedName(n);
		return qualifiedNameFromConverter;
		
	}
}
