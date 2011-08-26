package gr.upatras.ece.wcl.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;



public class MySemanticHighlightingConfiguration extends DefaultHighlightingConfiguration  {

	 // provide an id string for the highlighting calculator
	  public static final String DUMMYHL = "CrossReference";

	  
/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration#configure(org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor)
	 */
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(DUMMYHL, "Configuration Parameters", dummytype());	
		super.configure(acceptor);
	}



	// method for calculating an actual text styles
	  public TextStyle dummytype() {
	    TextStyle textStyle = new TextStyle();
	    //textStyle.setBackgroundColor(new RGB(155, 55, 255));
	    textStyle.setColor(new RGB(5, 155, 5));
	    textStyle.setStyle(SWT.BOLD);
	    return textStyle;
	  }


}
