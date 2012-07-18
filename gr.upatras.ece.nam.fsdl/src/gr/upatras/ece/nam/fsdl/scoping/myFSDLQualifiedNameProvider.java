package gr.upatras.ece.nam.fsdl.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import brokermodel.federationscenarios.ServiceRequest;
import brokermodel.federationscenarios.ServiceSettingInstance;

public class myFSDLQualifiedNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

//	@Override
//	public String getQualifiedName(EObject obj) {
//		System.out.println("myFSDLQualifiedNameProvider getQualifiedName = "+obj.toString());
//		return super.getQualifiedName(obj);
//	}
	
	
// WARNING: For the FederationOffice qualified Names, please see the OfficeDL module, where it is possible to have also there qualified names
	//see MyOfficeDLQualifiedNameProvider on OfficeDL2 module
	
	
	public String qualifiedName(brokermodel.resources.OfferedResource obj) {

		System.out.println(">>>qualifiedName>>>="+ obj.toString() );
		//return obj.getFullQualifiedName();
		return obj.getName() ;
	}
	
	
	public QualifiedName qualifiedName( ServiceSettingInstance obj) {
		//System.out.println(">>>qualifiedName ServiceSettingInstance>>>="+ obj.toString() );
		String n =  ( (ServiceRequest)obj.eContainer()).getName()  + "." + obj.getName();
		QualifiedName qualifiedNameFromConverter = getConverter().toQualifiedName(n);
		return qualifiedNameFromConverter;
		
	}
}
