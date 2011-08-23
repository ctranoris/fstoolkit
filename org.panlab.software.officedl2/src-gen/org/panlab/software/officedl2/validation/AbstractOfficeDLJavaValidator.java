package org.panlab.software.officedl2.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class, org.eclipse.xtext.validation.NamesAreUniqueValidator.class})
public class AbstractOfficeDLJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.panlab.software.officedl2.officeDL.OfficeDLPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.panlab.org/FederationOffice"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.panlab.org/FederationOffice/model/users"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.panlab.org/FederationOffice/model/services"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.panlab.org/FederationOffice/model/resources"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.panlab.org/FederationOffice/model/availabilitycontract"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.panlab.org/FederationOffice/model/slareservations"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.panlab.org/FederationOffice/model/providersite"));
		return result;
	}

}
