package org.panlab.software.fstoolkit.amazon.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.panlab.software.fstoolkit.amazon.Activator;

public class AmazonPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public AmazonPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		
//		ImageDescriptor imageDesc = new ;
		setImageDescriptor( AbstractUIPlugin.imageDescriptorFromPlugin( "org.panlab.software.fstoolkit.amazon",  "icons/amazon_logo.gif") );
		setDescription("Please fill your preferences for Amazon office");
	}

	

	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createFieldEditors() {
		addField( new StringFieldEditor(AmazonPreferenceConstants.P_ACCESSKEYID, "ACCESS KEY ID:", getFieldEditorParent()));
		addField( new PasswordFieldEditor(AmazonPreferenceConstants.P_SECRETACCESSKEY, "SECRET ACCESS KEY:", getFieldEditorParent()) );
		
		
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
