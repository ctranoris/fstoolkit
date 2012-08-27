/*
 * generated by Xtext
 */
package gr.upatras.ece.wcl.radl2.scoping;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.common.base.Predicate;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class RadlScopeProvider extends AbstractDeclarativeScopeProvider {
	IScope scope_ConfigurationParam_servsetting(brokermodel.services.ServiceSetting ctx, EReference ref)
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
	
	IScope scope_ResourceAdapter_implname(brokermodel.services.OfferedService ctx, EReference ref)
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
	
	protected Predicate<brokermodel.resources.ResourceSetting> rResSets = new Predicate<brokermodel.resources.ResourceSetting>(){
		public boolean  apply(brokermodel.resources.ResourceSetting input) { 
			return true ; 
			//return input.getName().length()==6;
		}
	};
}
