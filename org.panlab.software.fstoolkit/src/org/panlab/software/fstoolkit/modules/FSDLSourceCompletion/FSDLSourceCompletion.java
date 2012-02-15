package org.panlab.software.fstoolkit.modules.FSDLSourceCompletion;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.AbstractTextEditor;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;

import FederationOffice.Office;
import FederationOffice.services.Service;

public class FSDLSourceCompletion {

	private ITextEditor editor;
	private IDocument document;

	public FSDLSourceCompletion() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();

		IEditorPart part = page.getActiveEditor();
		if (!(part instanceof AbstractTextEditor))
			return;
		editor = (ITextEditor) part;

		IDocumentProvider dp = editor.getDocumentProvider();
		document = dp.getDocument(editor.getEditorInput());

	}

	@SuppressWarnings("deprecation")
	public void AddOfferedService(Office office, Service obj) {
		// Kalytera to Inject na ginetai apo allo antikeimeno sto workbench pou
		// na upologizei tin swsti 8esi..kai mipws bazei kai olokliro template
		String InjectString = "\"" + obj.getName()  + "." + office.getName()+ "\"";
		InjectString =  "\n\tService "+InjectString+" as my"+obj.getName()+ " settings{" +
			"//" + obj.getDescription()+
			"\n";
		for (int i = 0; i < obj.getServiceSettings().size(); i++) {
			InjectString += "\t\tSetting \""+  obj.getServiceSettings().get(i).getName()  +"\" : "+
							obj.getServiceSettings().get(i).getName().toLowerCase().replace(' ', '_');
			
			if (obj.getServiceSettings().get(i).isWritable() )
				InjectString += " = \"TODO: (assign) value\" ";
			
			InjectString += " //"+ obj.getServiceSettings().get(i).getDescription();
			InjectString += "\n ";
		}
		InjectString +=	"\t}\n";

		//String importURI = office.eResource().getURI().toString();

		AddImportURI( office.getResourceURI() );
		
		int offset = 0;
		//find the offset of section
		try {
			if ( (offset = document.search(0, "RequestServices", true, false, true))>=0 ){
				offset = document.search(offset, "{", true, false, false);
				//System.out.println("============offset: " + offset);
				InjectStringToOffset(offset+1,InjectString );
			}
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		ISelection txtselection = editor.getSelectionProvider().getSelection();
//		if (txtselection instanceof ITextSelection) {
//			offset = ((ITextSelection) txtselection).getOffset();//if selection is inside RequestServices section the leave it (??)
//		}
		
		
		
	}

	@SuppressWarnings("deprecation")
	private void AddImportURI(String importURI) {
		int offset = 0;
		// first find if the uri is already imported
		try {
			offset = document.search(0, importURI, true, false, true);
			
			
			if (offset <0) { // not found in doc

				offset = document.search(0, "ScheduledPlan", true, false, true) - 2;
				
				if (offset <0)
					offset = document.search(0, "RequestServices", true, false, true);

				if (offset >=0)
					InjectStringToOffset(offset, "\nimport office \"" + importURI	+ "\"; \n");
			}
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void InjectStringToOffset(int offset, String injectString) {
		try {
			document.replace(offset, 0, injectString);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
