package gr.upatras.ece.nam.fstoolkit.uop.preferences;


import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import gr.upatras.ece.nam.fstoolkit.uop.Activator;

public class UoPPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public UoPPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		
//		ImageDescriptor imageDesc = new ;
		setImageDescriptor( AbstractUIPlugin.imageDescriptorFromPlugin( "gr.upatras.ece.nam.fstoolkit.uop",  "icons/uop_logo.gif") );
		setDescription("Please fill your credentials for UoP office");
	}



	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub

	}


	@Override
	protected void createFieldEditors() {
		addField( new StringFieldEditor(UoPBrokerPreferenceConstants.P_UOPUSERNAME, "UoP username:", getFieldEditorParent()));
		addField( new PasswordFieldEditor(UoPBrokerPreferenceConstants.P_UOPPASSWORD, "UoP password:", getFieldEditorParent()) );
		
		
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