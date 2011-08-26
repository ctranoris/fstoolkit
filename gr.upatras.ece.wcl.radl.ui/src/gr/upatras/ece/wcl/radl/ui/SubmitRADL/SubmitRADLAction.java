package gr.upatras.ece.wcl.radl.ui.SubmitRADL;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;


public class SubmitRADLAction implements IWorkbenchWindowActionDelegate {

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		
		IEditorPart editor = page.getActiveEditor();
		
		if (editor!=null){
			final IFile modelFile = (IFile) editor.getEditorInput().getAdapter(IFile.class);
			if (modelFile != null) {
				//System.out.println("ESKAS LoadModel()" + modelFile.getLocation().toString() );
				action.setEnabled( modelFile.getLocation().toString().contains( ".radl") );
			}
		}

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub

	}

}
