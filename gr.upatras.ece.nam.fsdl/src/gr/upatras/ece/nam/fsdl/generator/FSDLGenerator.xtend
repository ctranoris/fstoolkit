/*
 * generated by Xtext
 */
package gr.upatras.ece.nam.fsdl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject



import org.eclipse.xtext.naming.IQualifiedNameProvider
import brokermodel.federationscenarios.RequestedFederationScenario

class FSDLGenerator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider nameProvider 
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(e: resource.allContents.toIterable.filter(typeof( RequestedFederationScenario ))) {
			fsa.generateFile(
            	e.fullyQualifiedName.toString.replace(".", "/") + ".java",
            	e.compile )	
			
    	}
	}
	
	def compile(RequestedFederationScenario e) '''
    �IF e.eContainer != null�
        package �e.eContainer.fullyQualifiedName�;
    �ENDIF�
    
    public class �e.name� {
    }
'''
	
}
