package org.panlab.software.fstoolkit.plc;

import java.util.ArrayList;
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
	private ResourceContext amazon;
		
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

	public List<Office> loadPLCOfficeDescription(String string, String string2) {
		FCICredentials cred =FederationOffice.fcielements.FcielementsFactory.eINSTANCE.createFCICredentials();
		cred.setUsername( string );
		cred.setPassword( string2 );
		FCI fci = FCI.getInstance();
		AuthorizationKey authKey = fci.createAuthorizationKey(cred);
		amazon = fci.createResourceContext("amazon", authKey);		
		Office plcOffice = amazon.getOfficeModel();
		plcOffice.setName("PLCName-test");
		
		this.plcOffices.add(plcOffice);
		
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		if (plcOffices!=null){
			return plcOffices;
		}
		return null;
	}

}
