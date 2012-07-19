package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class OfferedResourcesTabbedPropertySheetPage extends TabbedPropertySheetPage {
	protected OfferedResourcesView editor;
	

	/**
	 * Contructor for this property sheet page.
	 * 
	 * @param tabbedPropertySheetPageContributor
	 *            the editor contributor of the property sheet page.
	 */
	public OfferedResourcesTabbedPropertySheetPage(OfferedResourcesView editor) {
		super(editor);
		this.editor = editor;
	}

	/**
	 * Get the EMF AdapterFactory for this editor.
	 * 
	 * @return the EMF AdapterFactory for this editor.
	 */
	public OfferedResourcesView getEditor() {
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
