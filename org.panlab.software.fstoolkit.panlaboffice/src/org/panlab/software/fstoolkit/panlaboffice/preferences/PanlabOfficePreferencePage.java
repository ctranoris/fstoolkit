package org.panlab.software.fstoolkit.panlaboffice.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.panlab.software.fstoolkit.panlaboffice.Activator;

public class PanlabOfficePreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public PanlabOfficePreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		
//		ImageDescriptor imageDesc = new ;
		setImageDescriptor( AbstractUIPlugin.imageDescriptorFromPlugin( "org.panlab.software.fstoolkit.panlaboffice",  "icons/panlab_logo.gif") );
		setDescription("Please fill your credentials for Panlab office");
	}

	@Override
	public void init(IWorkbench workbench) {
		
	}

	@Override
	protected void createFieldEditors() {
		addField( new StringFieldEditor(PanlabOfficePreferenceConstants.P_PANLABUSERNAME, "Panlab username:", getFieldEditorParent()));
		addField( new PasswordFieldEditor(PanlabOfficePreferenceConstants.P_PANLABPASSWORD, "Panlab password:", getFieldEditorParent()) );
		
		
	}

	public class PasswordFieldEditor extends StringFieldEditor {
	    public PasswordFieldEditor(String name,
	            String label, Composite parent) {
	        super(name, label, parent);
	    }


	    protected void doFillIntoGrid(Composite parent, int numColumns)
	    {
	        // Creates the text control
	        super.doFillIntoGrid(parent, numColumns);


	        // Now we can set the echo character
	        getTextControl().setEchoChar('*');
	    }
	}
}
