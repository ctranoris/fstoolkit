/*
 * generated by Xtext
 */
package gr.upatras.ece.wcl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class RadlUiModule extends gr.upatras.ece.wcl.ui.AbstractRadlUiModule {
	public RadlUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends IHighlightingConfiguration> bindSemanticConfig() {
		return MySemanticHighlightingConfiguration.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator>	bindSemanticHighlightingCalculator() {
		return MySemanticHighlightingCalculator.class;
	}




}
