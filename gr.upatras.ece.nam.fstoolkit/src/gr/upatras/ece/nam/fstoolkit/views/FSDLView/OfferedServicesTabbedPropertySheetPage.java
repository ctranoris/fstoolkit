package gr.upatras.ece.nam.fstoolkit.views.FSDLView;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class OfferedServicesTabbedPropertySheetPage extends TabbedPropertySheetPage {
	protected OfferedServicesView editor;
	

	/**
	 * Contructor for this property sheet page.
	 * 
	 * @param tabbedPropertySheetPageContributor
	 *            the editor contributor of the property sheet page.
	 */
	public OfferedServicesTabbedPropertySheetPage(OfferedServicesView editor) {
		super(editor);
		this.editor = editor;
	}

	/**
	 * Get the EMF AdapterFactory for this editor.
	 * 
	 * @return the EMF AdapterFactory for this editor.
	 */
	public OfferedServicesView getEditor() {
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
