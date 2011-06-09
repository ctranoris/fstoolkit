package org.panlab.software.fstoolkit.localprovisioningengine;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import FederationOffice.extensionInterfaces.IProvisionResource;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.panlab.software.fstoolkit.localprovisioningengine"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	//available provisioning plugins
	private ArrayList<IProvisionResource> provisionPlugins;
	
	/**
	 * @return the provisionPlugins
	 */
	public ArrayList<IProvisionResource> getProvisionPlugins() {
		return provisionPlugins;
	}

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		this.provisionPlugins = new ArrayList<IProvisionResource>();
		runProvisionResourceExtension(this.provisionPlugins);
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
	
	
	// This is the ID from your extension point
	private static final String IPROVISIONRESOURCE_ID = "org.panlab.software.fstoolkit.provisionresource";

	
	private void runProvisionResourceExtension(final ArrayList<IProvisionResource> provisionPlugins) {
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(IPROVISIONRESOURCE_ID);
		
		try {
			for (IConfigurationElement e : config) {
				System.out.println("Evaluating extension "+IPROVISIONRESOURCE_ID);
				final Object o = e.createExecutableExtension("class");
				if (o instanceof IProvisionResource) {
					ISafeRunnable runnable = new ISafeRunnable() {
						@Override
						public void handleException(Throwable exception) {
							System.out.println("Exception in client");
						}

						@Override
						public void run() throws Exception {
							provisionPlugins.add( (IProvisionResource) o );
						}
					};
					SafeRunner.run(runnable);
				}
			}
		} catch (CoreException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
