package gr.upatras.ece.nam.brokerdsl.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import brokermodel.Broker;
import brokermodel.federationscenarios.ServiceRequest;
import brokermodel.federationscenarios.ServiceSettingInstance;

public class MyBrokerDSLQualifiedNameProvider extends
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
	
	public QualifiedName qualifiedName( brokermodel.resources.OfferedResource obj) {
		//System.out.println(">>>qualifiedName ServiceSettingInstance>>>="+ obj.toString() );
		String n = obj. getName() ;//obj.getFullQualifiedName();
		QualifiedName qualifiedNameFromConverter = getConverter().toQualifiedName(n);
		//System.out.println(">>>qualifiedNameFromConverter>>>="+ qualifiedNameFromConverter );
		return qualifiedNameFromConverter;
		
	}
	

	public QualifiedName qualifiedName( brokermodel.services.OfferedService  obj) {
		//System.out.println(">>>qualifiedName ServiceSettingInstance>>>="+ obj.toString() );
		String n =  obj.getName()+"."+((Broker)obj.eContainer()).getName();
		QualifiedName qualifiedNameFromConverter = getConverter().toQualifiedName(n);
		//System.out.println(">>>qualifiedNameFromConverter>>>="+ qualifiedNameFromConverter );
		return qualifiedNameFromConverter;
		
	}
}
