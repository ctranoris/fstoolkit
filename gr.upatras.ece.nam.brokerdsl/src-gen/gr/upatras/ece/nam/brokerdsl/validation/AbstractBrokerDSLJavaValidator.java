package gr.upatras.ece.nam.brokerdsl.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class, org.eclipse.xtext.validation.NamesAreUniqueValidator.class})
public class AbstractBrokerDSLJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(gr.upatras.ece.nam.brokerdsl.brokerDSLsyntax.BrokerDSLsyntaxPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker/model/users"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker/model/services"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker/model/resources"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker/model/federationscenarios"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker/model/availabilitycontract"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker/model/slareservations"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker/model/providersite"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://nam.ece.upatras.gr/broker/model/experimentRuntime"));
		return result;
	}

}
