
package gr.upatras.ece.wcl.ui.quickfix;

import gr.upatras.ece.wcl.validation.RadlJavaValidator;

import javax.swing.text.BadLocationException;

import org.eclipse.jface.text.FindReplaceDocumentAdapter;
import org.eclipse.jface.text.IRegion;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.validation.Issue;

public class RadlQuickfixProvider extends DefaultQuickfixProvider {

	
	@Fix(RadlJavaValidator.INVALID_CheckResourceAdapterImplements )
	public void capitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Implement Service Settings", "Implement Service Settings of offered Service", "icons/alt_window_16.gif", new IModification() {
			public void apply(IModificationContext context) throws BadLocationException {
				IXtextDocument xtextDocument = context.getXtextDocument();
				String firstLetter;
				try {
					firstLetter = xtextDocument.get(issue.getOffset()+1, 1);
					//xtextDocument.replace(issue.getOffset()+1, 1, Strings.toFirstUpper(firstLetter));
//					xtextDocument.search(issue.getOffset()+1, "Configuration Parameters", true, false, false);
					FindReplaceDocumentAdapter fd = new FindReplaceDocumentAdapter( xtextDocument );
					IRegion of1 = fd.find(issue.getOffset()+1, "Configuration Parameters", true, false, false, false);
					IRegion of2 = fd.find( of1.getOffset() +1, "{", true, false, false, false);
					xtextDocument.replace( of2.getOffset()+1, 1, "\n"+issue.getData()[0].toString() );
					
					
				} catch (org.eclipse.jface.text.BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	

}
