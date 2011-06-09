/*
 * generated by Xtext
 */
package gr.upatras.ece.wcl.scoping;

import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class RadlScopeProvider extends AbstractDeclarativeScopeProvider {
	
	
	IScope scope_ConfigurationParam_servsetting(FederationOffice.services.ServiceSetting ctx, EReference ref)
    {
		//gia na doulepsei to scoping prepei na ksanabalw sto mwe arxeio to
		//<fragment class="org.eclipse.xtext.generator.scoping.ImportNamespacesScopingFragment"/>
		//OMWS ean to balw tote den doulevei kala to import twn allwn montelwn
		//kai den doulevei kai o resource advisor....
		
		
		
//		tide.virtualtestbed.OfferedResourceInstance offeredResourceInstance =  (tide.virtualtestbed.OfferedResourceInstance) ctx.eContainer() ;
//		tide.resources.OfferedResource offeredResource = offeredResourceInstance.getRefOfferedResource();
//		
//		EList<tide.resources.ResourceSetting> features= offeredResource.getResourceSettings();		
//		return scopeFor(Iterables.filter(features, rResSets));
		
		System.out.println(">>>>>>>>> scopeConfigurationParam_servsetting");
		return IScope.NULLSCOPE;
    }
	
	IScope scope_ResourceAdapter_implname(FederationOffice.services.OfferedService ctx, EReference ref)
    {
		//gia na doulepsei to scoping prepei na ksanabalw sto mwe arxeio to
		//<fragment class="org.eclipse.xtext.generator.scoping.ImportNamespacesScopingFragment"/>
		//OMWS ean to balw tote den doulevei kala to import twn allwn montelwn
		//kai den doulevei kai o resource advisor....
		
		
		
//		tide.virtualtestbed.OfferedResourceInstance offeredResourceInstance =  (tide.virtualtestbed.OfferedResourceInstance) ctx.eContainer() ;
//		tide.resources.OfferedResource offeredResource = offeredResourceInstance.getRefOfferedResource();
//		
//		EList<tide.resources.ResourceSetting> features= offeredResource.getResourceSettings();		
//		return scopeFor(Iterables.filter(features, rResSets));
		
		System.out.println(">>>>>>>>> scope_ResourceAdapter_implname");
		return IScope.NULLSCOPE;
    }
	
	protected Predicate<FederationOffice.resources.ResourceSetting> rResSets = new Predicate<FederationOffice.resources.ResourceSetting>(){
		public boolean  apply(FederationOffice.resources.ResourceSetting input) { 
			return true ; 
			//return input.getName().length()==6;
		}
	};
}
