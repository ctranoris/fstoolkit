package org.panlab.software.fstoolkit.plc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.panlab.software.fci.core.FCI;
import org.panlab.software.fci.core.ResourceContext;

import FederationOffice.Office;
import FederationOffice.fcielements.AuthorizationKey;
import FederationOffice.fcielements.FCICredentials;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.panlab.software.fstoolkit.plc"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	private ArrayList<Office> plcOffices;
		
	/**
	 * The constructor
	 */
	public Activator() {
		this.plcOffices  = new ArrayList<Office>();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	
	
	public List<Office> getOffices() {
		return plcOffices;
	}

	public List<Office> loadPLCOfficeDescription(List<FCICredentials> creds) {
		this.plcOffices.clear();
		
		FCI fci = FCI.getInstance();
		
		for (Iterator<FCICredentials> iterator = creds.iterator(); iterator.hasNext();) {
			FCICredentials cred = (FCICredentials) iterator.next();
			AuthorizationKey authKey = fci.createAuthorizationKey(cred);
//			ResourceContext sfa = fci.createResourceContext("plc", authKey);
//			Office sfaOffice  = sfa.getOfficeModel();
//			
//			if (sfaOffice instanceof SFAOfficeProxy)
//				if ( !((SFAOfficeProxy)sfaOffice).officeLoaded() ){
//					sfaOffice = FederationOffice.FederationOfficeFactory.eINSTANCE.createOffice();
//					sfaOffice.setName(
//							authKey.getCredentials().getCredoptions().get(SFAUtils.AUTHORITY ) +
//							" (error loading)");
//				}
			
			Office plcOffice = FederationOffice.FederationOfficeFactory.eINSTANCE.createOffice();
			plcOffice.setName( authKey.getCredentials().getCredoptions().get( "PLCNAME") + " (m2m not implemented)");
			this.plcOffices.add(plcOffice);
			
		}

		if (plcOffices!=null){
			return this.plcOffices;
		}
		return null;
	}

}
