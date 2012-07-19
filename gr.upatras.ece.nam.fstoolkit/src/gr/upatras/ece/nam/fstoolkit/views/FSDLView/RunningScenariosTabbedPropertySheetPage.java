package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class RunningScenariosTabbedPropertySheetPage extends TabbedPropertySheetPage {
	protected RunningScenariosView editor;
	

	/**
	 * Contructor for this property sheet page.
	 * 
	 * @param tabbedPropertySheetPageContributor
	 *            the editor contributor of the property sheet page.
	 */
	public RunningScenariosTabbedPropertySheetPage(RunningScenariosView runningScenariosView) {
		super(runningScenariosView);
		this.editor = runningScenariosView;
	}

	/**
	 * Get the EMF AdapterFactory for this editor.
	 * 
	 * @return the EMF AdapterFactory for this editor.
	 */
	public RunningScenariosView getEditor() {
		return editor;
	}

	/**
	 * Get the EMF AdapterFactory for this editor.
	 * 
	 * @return the EMF AdapterFactory for this editor.
	 */
	public AdapterFactory getAdapterFactory() {
		return editor.getAdapterFactory();
	}

}
