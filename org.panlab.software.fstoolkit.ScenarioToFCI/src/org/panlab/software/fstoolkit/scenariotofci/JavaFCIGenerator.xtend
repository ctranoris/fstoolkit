package org.panlab.software.fstoolkit.scenariotofci

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject
import com.google.inject.Inject

import static extension org.eclipse.xtext.xtend2.lib.ResourceExtensions.*
import FederationOffice.federationscenarios.RequestedFederationScenario
import org.eclipse.xtext.naming.IQualifiedNameProvider

class JavaFCIGenerator  implements IGenerator {


	@Inject extension IQualifiedNameProvider nameProvider 
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		System::out.println( "resource="+resource.toString )
		for(EObject e: resource.allContentsIterable.filter(typeof( RequestedFederationScenario ))) {
			e.compile(fsa)
			
			
    	}
    	
	}

//	def dispatch void compile(RequestedFederationScenario m, IFileSystemAccess fsa) {
//		
//		for (e : m.infrastructureRequest.reqOfferedResources ) {
//		System::out.println( "compile1="+e.toString )
//			e.compile(fsa)
//		}
//	}

	def dispatch compile(RequestedFederationScenario e, IFileSystemAccess fsa) {
		System::out.println( "compile2="+e.toString )
		fsa.generateFile(e.name + ".java", '''
		this is element «e.name»
		''')
	}

	def dispatch void compile(EObject m, IFileSystemAccess fsa) { }

}
	