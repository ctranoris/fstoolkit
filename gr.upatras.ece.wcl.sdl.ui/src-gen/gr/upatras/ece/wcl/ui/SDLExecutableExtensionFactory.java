
/*
 * generated by Xtext
 */
 
package gr.upatras.ece.wcl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class SDLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return gr.upatras.ece.wcl.ui.internal.SDLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return gr.upatras.ece.wcl.ui.internal.SDLActivator.getInstance().getInjector("gr.upatras.ece.wcl.SDL");
	}
	
}
