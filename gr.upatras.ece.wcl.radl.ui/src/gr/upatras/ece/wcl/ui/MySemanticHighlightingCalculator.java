package gr.upatras.ece.wcl.ui;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import gr.upatras.ece.wcl.radl.ConfigurationParam;
import gr.upatras.ece.wcl.radl.RADL;
import gr.upatras.ece.wcl.radl.RadlPackage;
import gr.upatras.ece.wcl.radl.ResourceAdapter;
import gr.upatras.ece.wcl.radl.rulSSH_commands;
import gr.upatras.ece.wcl.radl.ruleHTTP;
import gr.upatras.ece.wcl.radl.ruleSSH;
import gr.upatras.ece.wcl.radl.scriptParam;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;



public class MySemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	// Dummy-Highlighting
	  // of each block of 10 characters the last 5 are to be highlighted
	  // this is not semantic but very briefly illustrates what kind of
	  // information is processed

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		
		//System.out.println("provideHighlightingFor");
		
		if (resource == null)
			return;
			
		if (resource.getContents().size() > 0) {
			// fetch the model
			RADL mradl = (RADL) resource.getContents().get(0);
			ResourceAdapter m =mradl.getResourceAdapter();
			//List<ConfigurationParam> confParams = m.getConfParams();
			
			if (m.getProtocol() instanceof ruleSSH){
				ruleSSH rs = (ruleSSH)m.getProtocol();
				if (rs==null)
					return;
				EList<rulSSH_commands> rulSSHs = rs.getCommands();

				for (rulSSH_commands  sshs: rulSSHs){

					List<scriptParam> scriptParams = sshs.getScriptparams();
					for ( scriptParam sparam : scriptParams) {
						//System.out.println("provideHighlightingFor sparam="+ sparam.getName());
						String highlightID = MySemanticHighlightingConfiguration.DUMMYHL;
						highlightFirstFeature(sparam, sparam.getName(), highlightID, acceptor);
					}

					//System.out.println("provideHighlightingFor sparam="+ sshs);
					String highlightID = MySemanticHighlightingConfiguration.DUMMYHL;
					getSSHFeatureNode(sshs, highlightID, acceptor);

				}
			}
			
			if (m.getProtocol() instanceof ruleHTTP){
				ruleHTTP rs = (ruleHTTP)m.getProtocol();
				if (rs==null)
					return;
				
				NodeAdapter adapter = NodeUtil.getNodeAdapter(m);
				  //System.out.println("adapter not null adapter="+adapter );
				  if (adapter != null) {
					  //System.out.println("adapter not null ="+adapter );
					  CompositeNode node = adapter.getParserNode();
					  if (node != null) {
						  //System.out.println("node not null ="+node );
						  
						  for (AbstractNode child : node.getChildren()) {
							  //System.out.println("child ="+child );
							  if (child instanceof LeafNode) {
								  if ( ("scriptparams".equals(((LeafNode) child).getFeature()  ))) {
									  LeafNode nodetohighlight =(LeafNode) child;
									  acceptor.addPosition(nodetohighlight.getOffset(), nodetohighlight.getLength(), MySemanticHighlightingConfiguration.DUMMYHL);
							    	
									  //return (LeafNode) child;
								  }
							  }
						  }
					  }
				  }
			}
		}
	}
	
	public LeafNode getSSHFeatureNode(rulSSH_commands semantic, String highlightID,IHighlightedPositionAcceptor acceptor ) {
		  NodeAdapter adapter = NodeUtil.getNodeAdapter(semantic);
		  //System.out.println("adapter not null adapter="+adapter );
		  if (adapter != null) {
			  //System.out.println("adapter not null ="+adapter );
			  CompositeNode node = adapter.getParserNode();
			  if (node != null) {
				  //System.out.println("node not null ="+node );
				  
				  for (AbstractNode child : node.getChildren()) {
					  //System.out.println("child ="+child );
					  if (child instanceof LeafNode) {
						  if ("scriptparams".equals(((LeafNode) child).getFeature()  )) {
							  LeafNode nodetohighlight =(LeafNode) child;
							  acceptor.addPosition(nodetohighlight.getOffset(), nodetohighlight.getLength(), highlightID);
					    	
							  //return (LeafNode) child;
						  }
					  }
				  }
			  }
		  }
		  return null;
	  }
	


	  //helper method that takes care of highlighting the first feature element
	  //of a semantic object using a given text style ID
	  private void highlightFirstFeature(EObject semobject, String featurename,
	      String highlightID, IHighlightedPositionAcceptor acceptor) {
		    //System.out.println("highlightFirstFeature featurename=" + featurename);
		    getFirstFeatureNode(semobject, featurename, highlightID, acceptor);
	    
	  }


	// adapted from Sebastian Zarnekow's semantic highlighting implementation
	  // navigate to the parse node corresponding to the semantic object and
	  // fetch the leaf node that corresponds to the first feature with the given
	  // name
	  public LeafNode getFirstFeatureNode(EObject semantic, String feature, String highlightID,IHighlightedPositionAcceptor acceptor ) {
		  NodeAdapter adapter = NodeUtil.getNodeAdapter(semantic);
		  //System.out.println("adapter not null adapter="+adapter );
		  if (adapter != null) {
			  //System.out.println("adapter not null ="+adapter );
			  CompositeNode node = adapter.getParserNode();
			  if (node != null) {
				  //System.out.println("node not null ="+node );
				  if (feature == null)
					  return null;
				  for (AbstractNode child : node.getChildren()) {
					  //System.out.println("child ="+child );
					  if (child instanceof LeafNode) {
						  if (feature.equals(((LeafNode) child).getText() )  ||
								  ((LeafNode) child).getText().equals(  "\""+ feature +"\"" ) 
								  ) {
							  LeafNode nodetohighlight =(LeafNode) child;
							  acceptor.addPosition(nodetohighlight.getOffset(), nodetohighlight.getLength(), highlightID);
							  //return (LeafNode) child;
						  }
					  }
				  }
			  }
		  }
		  return null;
	  }

	  
	  


}
