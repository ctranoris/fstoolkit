/*
 * generated by Xtext
 */
package org.panlab.software.fsdl2.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import FederationOffice.federationscenarios.ResourceRequest;
import FederationOffice.federationscenarios.ResourceSettingInstance;
import FederationOffice.federationscenarios.ServiceRequest;
import FederationOffice.federationscenarios.ServiceSettingInstance;
import FederationOffice.federationscenarios.SettingInstance;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class FSDLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public FSDLLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// @Override
	// protected Object doGetText(Object element) {
	// System.out.println("doGetText = " + element.toString());
	// return super.doGetText(element);
	// }


	String text(ServiceRequest sr) {
//		return "Request "+ sr.getNumOfServices()+", "+sr.getName();
		if (sr.getNumOfServices() > 0)
			return sr.getName() + " of [" + sr.getNumOfServices()+"] " + sr.getRefService().getName();
		else
			return sr.getName() + " of "  + sr.getRefService().getName();
	}
	
	String text(ServiceSettingInstance ele) {
		String assigns= "" ;
		
		if ( (ele.getAssignSetting() != null) && (ele.getAssignSetting().size()>0) ){
			for(int ixAssignedSettings=0; ixAssignedSettings< ele.getAssignSetting().size();ixAssignedSettings++){
				SettingInstance assignedSetting = ele.getAssignSetting().get(ixAssignedSettings) ;
				assigns += "\""+  
							((ServiceRequest)assignedSetting.eContainer()).getName()  + //hardcode here the _1 . A more sofisticated way should be implemented.eg now we suppose that a group of services is connected to 1 setting... maybe we have more complex scenarios 
							assignedSetting.getName()+"\",";							//Assignments work differently from VCT tool. in vct tool the arrows are references.. where assign means that the assigned value is the source and the element is the target
			}
			assigns = assigns.substring(0, assigns.length()-1);
			return ele.getName()+" <- "+ assigns;
			
		}else{
			return ele.getName()+" = \""+ ele.getStaticValue() +"\"";						
		}
		
	}
	
	String text(ResourceRequest sr) {
//		return "Request "+ sr.getNumOfServices()+", "+sr.getName();
		return sr.getName() + " of "  + sr.getRefOfferedResource().getName();
	}
	
	String text(ResourceSettingInstance ele) {
		String assigns= "" ;
		
		if ( (ele.getAssignSetting() != null) && (ele.getAssignSetting().size()>0) ){
			for(int ixAssignedSettings=0; ixAssignedSettings< ele.getAssignSetting().size();ixAssignedSettings++){
				SettingInstance assignedSetting = ele.getAssignSetting().get(ixAssignedSettings) ;
				assigns += "\""+  
							((ResourceRequest)assignedSetting.eContainer()).getName()  + //hardcode here the _1 . A more sofisticated way should be implemented.eg now we suppose that a group of services is connected to 1 setting... maybe we have more complex scenarios 
							assignedSetting.getName()+"\",";							//Assignments work differently from VCT tool. in vct tool the arrows are references.. where assign means that the assigned value is the source and the element is the target
			}
			assigns = assigns.substring(0, assigns.length()-1);
			return ele.getName()+" <- "+ assigns;
			
		}else{
			return ele.getName()+" = \""+ ele.getStaticValue() +"\"";						
		}
	}
	
	
	//
	// String image(ServiceSetting ele) {
	// return "16x16_fstoolkit.gif";
	// }
	//
	//
	// public String text(myServiceSettingInstance ele) {
	// return "setting = "+ele.getStaticValue() ;
	// }

	/*
	 * //Labels and icons can be computed like this:
	 * 
	 * String text(MyModel ele) { return "my "+ele.getName(); }
	 * 
	 * String image(MyModel ele) { return "MyModel.gif"; }
	 */
}
