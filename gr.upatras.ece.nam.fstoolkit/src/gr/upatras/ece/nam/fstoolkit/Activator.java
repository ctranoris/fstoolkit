package gr.upatras.ece.nam.fstoolkit;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import gr.upatras.ece.nam.fstoolkit.views.FSDLView.OfferedServicesView;
import gr.upatras.ece.nam.fstoolkit.views.FSDLView.RunningScenariosView;
import gr.upatras.ece.nam.fstoolkit.views.FSDLView.ScenariosView;

import brokermodel.BrokermodelPackage;
import brokermodel.Broker;
import brokermodel.extensionInterfaces.IBrokerRepository;
import brokermodel.extensionInterfaces.IBrokerRepositoryListener;
import brokermodel.federationscenarios.RequestedFederationScenario;
import brokermodel.uiObjects.BrokerManager;
import brokermodel.uiObjects.UiObjectsFactory;
/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "gr.upatras.ece.nam.fstoolkit"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
		
		//The Broker manager
		private BrokerManager BrokerManager;

		protected IBrokerRepositoryListener BrokerRepositoryListener ;

		
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
			CreateTaxonomyModel();
		}
		

		public void ReloadModelsAndViews(){
			CreateTaxonomyModel();
//			//find view org.panlab.software.fstoolkit.views.OfferedServicesView and then  initializeOfferedServicesDomain()
			IViewPart view_part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(OfferedServicesView.ID);
			if (view_part!=null){
				(  (OfferedServicesView)view_part).initializeOfferedServicesDomain();
			}

			view_part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(ScenariosView.ID);
			if (view_part!=null){
				(  (ScenariosView)view_part).initializeScenariosDomain();
			}

			view_part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(RunningScenariosView.ID);
			if (view_part!=null){
				(  (RunningScenariosView)view_part).initializeRunningResourcesDomain();
			}
			
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

		/**
		 * Returns an image descriptor for the image file at the given
		 * plug-in relative path
		 *
		 * @param path the path
		 * @return the image descriptor
		 */
		public static ImageDescriptor getImageDescriptor(String path) {
			return imageDescriptorFromPlugin(PLUGIN_ID, path);
		}
		
		// This is the ID from our extension point
		private static final String IBrokerREPOSITORY_ID = "org.panlab.software.fstoolkit.extensionpoint.Brokerrepository";
		
		public void CreateTaxonomyModel(){
			System.out.println("============CreateTaxonomyModel================");
					
			// Initialize the model
			BrokermodelPackage.eINSTANCE.eClass();		
			BrokerManager = UiObjectsFactory.eINSTANCE.createBrokerManager();

			runBrokerReposityExtension();
			
			
//			BasicEMap<String,Object>  BrokerImportURIMap = new BasicEMap<String, Object>();
//			// Obtain a new resource set
			ResourceSet resSet = new ResourceSetImpl();
//			// Get the resource
			
//			Resource resource = resSet.getResource(URI.createURI("http://localhost:8081/org.panlab.software.ws.repos.m2m/repo/panlab.Broker"), true);
//			Resource resource = resSet.getResource( URI.createFileURI("C:\\Users\\ctranoris\\Desktop\\panlab.Broker" ), true);

//			Resource resource = resSet.getResource(URI.createURI("platform:/resource/myProject/src/another.federationBroker"), true);
//			Broker of = (Broker) resource.getContents().get(0);
//			of.setResourceURI( resource.getURI().toString() );
//			BrokerManager.getBrokersRef().add( (Broker) resource.getContents().get(0) );
//			
		//		resource = resSet.getResource(URI.createURI("platform:/resource/myProject/src/Amazon.Brokerdl"), true);	
//			BrokerRule = (BrokerRule) resource.getContents().get(0);
//			BrokerRule.getTestbedBrokerv().setResourceURI( resource.getURI().toString() );
//			BrokerManager.getBrokersRef().add( BrokerRule.getTestbedBrokerv() );
//			
		
//			Resource resource = resSet.getResource(URI.createURI("platform:/resource/org.panlab.software.fstoolkit.scenarios.p2nerLargeScale/scenarios/small.Brokerdl"), true);		
//			BrokerRule BrokerRule = (BrokerRule) resource.getContents().get(0);
//			BrokerRule.getTestbedBrokerv().setResourceURI( resource.getURI().toString() );
//			BrokerManager.getBrokersRef().add( BrokerRule.getTestbedBrokerv() );
		}
		
		private void runBrokerReposityExtension() {
			IConfigurationElement[] config = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(IBrokerREPOSITORY_ID);
				try {
					for (IConfigurationElement e : config) {
						System.out.println("Evaluating extension "+IBrokerREPOSITORY_ID);
						final Object o = e.createExecutableExtension("class");
						if (o instanceof IBrokerRepository) {
							ISafeRunnable runnable = new ISafeRunnable() {
								@Override
								public void handleException(Throwable exception) {
									System.out.println("Exception in client");
								}
				
								@Override
								public void run() throws Exception {		
									
									
									List<Broker> Brokers = ((IBrokerRepository) o).loadBrokers( );								
									
									registerRepositoryListener((IBrokerRepository) o);
									
									for (Iterator iterator = Brokers.iterator(); iterator.hasNext();) {
										Broker Broker = (Broker) iterator.next();

										if (Broker!=null)
											BrokerManager.getBrokersRef().add( Broker  );
									}
									
								}
							};
							SafeRunner.run(runnable);
						}
					}
				} catch (CoreException ex) {
					System.out.println(ex.getMessage());
				}
			
		}

		protected void registerRepositoryListener(IBrokerRepository o) {
			if (BrokerRepositoryListener==null){
				BrokerRepositoryListener = new BrokerRepositoryListener();
				o.registerBrokerRepositoryListener(BrokerRepositoryListener );
			}
		}

		/**
		 * Returns the shared BrokerManager instance
		 *
		 * @return the shared BrokerManager instance
		 */
		public BrokerManager getBrokerManager() {
			return BrokerManager;
		}
		
		
		public void LoadScenarioFromBroker(final RequestedFederationScenario fedScenario) {
			final Broker tempof = (Broker)fedScenario.eContainer();
			
			if (fedScenario.getInfrastructureRequest() !=null){
				return;//it is already loaded
			}
			
			//System.out.println("Container = "+fedScenario.eContainer());
			//PanlabServices.getInstance().LoadFSbyVCT(fedScenario);
			//ask now all plugins if they can load it
			IConfigurationElement[] config = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(IBrokerREPOSITORY_ID);
				try {
					for (IConfigurationElement e : config) {
						System.out.println("Evaluating extension "+IBrokerREPOSITORY_ID);
						final Object o = e.createExecutableExtension("class");
						if (o instanceof IBrokerRepository) {
							ISafeRunnable runnable = new ISafeRunnable() {
								@Override
								public void handleException(Throwable exception) {
									System.out.println("Exception in client");
								}
				
								@Override
								public void run() throws Exception {		
									
									
									List<Broker> Brokers = ((IBrokerRepository) o).getBrokers( );
									for (Iterator iterator = Brokers.iterator(); iterator
											.hasNext();) {
										Broker Broker = (Broker) iterator.next();
										if (Broker!=null)
											if (Broker.getName().equalsIgnoreCase( tempof.getName() ) ) //don;t compare objects..they may not be the same. for example the Broker can be an BrokerProxy and the other one an BrokerImpl
												((IBrokerRepository) o).LoadScenario(fedScenario);
									}
									
									
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