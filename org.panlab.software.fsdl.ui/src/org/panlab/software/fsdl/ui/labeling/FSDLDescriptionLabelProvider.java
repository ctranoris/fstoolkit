/*
* generated by Xtext
*/
package org.panlab.software.fsdl.ui.labeling;

import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

import FederationOffice.services.ServiceSetting;

/**
 * Provides labels for a IEObjectDescriptions and IResourceDescriptions.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class FSDLDescriptionLabelProvider extends DefaultDescriptionLabelProvider {
	
	
	public String text(ServiceSetting ele) {
		  return "my ServiceSettingDesc = "+ele.toString();
		}
	
/*
	//Labels and icons can be computed like this:
	
	String text(IEObjectDescription ele) {
	  return "my "+ele.getName();
	}
	 
    String image(IEObjectDescription ele) {
      return ele.getEClass().getName() + ".gif";
    }	 
*/

}
