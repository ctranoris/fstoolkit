package gr.upatras.ece.wcl.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import gr.upatras.ece.wcl.services.RadlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRadlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import service'", "'Resource Adapter'", "'implements'", "'Configuration Parameters'", "'{'", "'}'", "'Binding Parameters'", "'Supported Child Types'", "'Allowed Types'", "'On Update'", "'ProcessOnAllConfigurationParametersComplete'", "'='", "'YES'", "'NO'", "';'", "'RAProtocol'", "'description'", "'String'", "'Integer'", "'Boolean'", "'Enum'", "'REFERENCE'", "'SSH'", "'Remote Machine'", "'RPort'", "'RUsername'", "'RPassword'", "'RExecute'", "'RExecuteDelete'", "'Java'", "'('", "','", "')'", "'JExecute'", "'JAssign'", "'<<'", "'>>'", "'HTTP'", "'RemoteMachine'", "'HttpURL'", "'HttpMethod'", "'GET'", "'POST'", "'HttpAuth'", "'Method'", "'AuthUsername'", "'AuthPassword'", "'PostBody'", "'XML-RPC'", "'ServerURL'", "'HttpBasicAuth'", "'BasicAuthUsername'", "'BasicAuthPassword'", "'RPCMethod'", "'parameters'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalRadlParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g"; }



     	private RadlGrammarAccess grammarAccess;
     	
        public InternalRadlParser(TokenStream input, IAstFactory factory, RadlGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RADL";	
       	}
       	
       	@Override
       	protected RadlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleRADL
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:77:1: entryRuleRADL returns [EObject current=null] : iv_ruleRADL= ruleRADL EOF ;
    public final EObject entryRuleRADL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRADL = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:78:2: (iv_ruleRADL= ruleRADL EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:79:2: iv_ruleRADL= ruleRADL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRADLRule(), currentNode); 
            pushFollow(FOLLOW_ruleRADL_in_entryRuleRADL75);
            iv_ruleRADL=ruleRADL();
            _fsp--;

             current =iv_ruleRADL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRADL85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRADL


    // $ANTLR start ruleRADL
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:86:1: ruleRADL returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) ) ) ;
    public final EObject ruleRADL() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_resourceAdapter_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:91:6: ( ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:92:1: ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:92:1: ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:92:2: ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:92:2: ( (lv_imports_0_0= ruleImport ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:93:1: (lv_imports_0_0= ruleImport )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:93:1: (lv_imports_0_0= ruleImport )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:94:3: lv_imports_0_0= ruleImport
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRADLAccess().getImportsImportParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleImport_in_ruleRADL131);
                    lv_imports_0_0=ruleImport();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRADLRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"imports",
                    	        		lv_imports_0_0, 
                    	        		"Import", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:116:3: ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:117:1: (lv_resourceAdapter_1_0= ruleResourceAdapter )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:117:1: (lv_resourceAdapter_1_0= ruleResourceAdapter )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:118:3: lv_resourceAdapter_1_0= ruleResourceAdapter
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRADLAccess().getResourceAdapterResourceAdapterParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleResourceAdapter_in_ruleRADL153);
            lv_resourceAdapter_1_0=ruleResourceAdapter();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRADLRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"resourceAdapter",
            	        		lv_resourceAdapter_1_0, 
            	        		"ResourceAdapter", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRADL


    // $ANTLR start entryRuleImport
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:148:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:149:2: (iv_ruleImport= ruleImport EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:150:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport189);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:157:1: ruleImport returns [EObject current=null] : ( 'import service' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:162:6: ( ( 'import service' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:163:1: ( 'import service' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:163:1: ( 'import service' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:163:3: 'import service' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,11,FOLLOW_11_in_ruleImport234); 

                    createLeafNode(grammarAccess.getImportAccess().getImportServiceKeyword_0(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:167:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:168:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:168:1: (lv_importURI_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:169:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport251); 

            			createLeafNode(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"importURI",
            	        		lv_importURI_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleResourceAdapter
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:199:1: entryRuleResourceAdapter returns [EObject current=null] : iv_ruleResourceAdapter= ruleResourceAdapter EOF ;
    public final EObject entryRuleResourceAdapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAdapter = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:200:2: (iv_ruleResourceAdapter= ruleResourceAdapter EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:201:2: iv_ruleResourceAdapter= ruleResourceAdapter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceAdapterRule(), currentNode); 
            pushFollow(FOLLOW_ruleResourceAdapter_in_entryRuleResourceAdapter292);
            iv_ruleResourceAdapter=ruleResourceAdapter();
            _fsp--;

             current =iv_ruleResourceAdapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAdapter302); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleResourceAdapter


    // $ANTLR start ruleResourceAdapter
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:208:1: ruleResourceAdapter returns [EObject current=null] : ( 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) ( 'implements' ( ( RULE_STRING ) ) )? ( 'Configuration Parameters' '{' ( (lv_confParams_6_0= ruleConfigurationParam ) )* '}' )? ( 'Binding Parameters' '{' ( (lv_bindParams_10_0= ruleBindingParam ) )* '}' )? ( 'Supported Child Types' '{' ( (lv_childParams_14_0= ruleSupportedChildType ) )* '}' )? ( 'Allowed Types' '{' ( (lv_allowParams_18_0= ruleAllowedType ) )* '}' )? ( 'On Update' '{' 'ProcessOnAllConfigurationParametersComplete' '=' ( ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) ) ) ';' 'RAProtocol' ( (lv_protocol_27_0= ruleProtocol ) ) '}' )? ) ;
    public final EObject ruleResourceAdapter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_ConfComplete_24_1=null;
        Token lv_ConfComplete_24_2=null;
        EObject lv_confParams_6_0 = null;

        EObject lv_bindParams_10_0 = null;

        EObject lv_childParams_14_0 = null;

        EObject lv_allowParams_18_0 = null;

        EObject lv_protocol_27_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:213:6: ( ( 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) ( 'implements' ( ( RULE_STRING ) ) )? ( 'Configuration Parameters' '{' ( (lv_confParams_6_0= ruleConfigurationParam ) )* '}' )? ( 'Binding Parameters' '{' ( (lv_bindParams_10_0= ruleBindingParam ) )* '}' )? ( 'Supported Child Types' '{' ( (lv_childParams_14_0= ruleSupportedChildType ) )* '}' )? ( 'Allowed Types' '{' ( (lv_allowParams_18_0= ruleAllowedType ) )* '}' )? ( 'On Update' '{' 'ProcessOnAllConfigurationParametersComplete' '=' ( ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) ) ) ';' 'RAProtocol' ( (lv_protocol_27_0= ruleProtocol ) ) '}' )? ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:214:1: ( 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) ( 'implements' ( ( RULE_STRING ) ) )? ( 'Configuration Parameters' '{' ( (lv_confParams_6_0= ruleConfigurationParam ) )* '}' )? ( 'Binding Parameters' '{' ( (lv_bindParams_10_0= ruleBindingParam ) )* '}' )? ( 'Supported Child Types' '{' ( (lv_childParams_14_0= ruleSupportedChildType ) )* '}' )? ( 'Allowed Types' '{' ( (lv_allowParams_18_0= ruleAllowedType ) )* '}' )? ( 'On Update' '{' 'ProcessOnAllConfigurationParametersComplete' '=' ( ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) ) ) ';' 'RAProtocol' ( (lv_protocol_27_0= ruleProtocol ) ) '}' )? )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:214:1: ( 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) ( 'implements' ( ( RULE_STRING ) ) )? ( 'Configuration Parameters' '{' ( (lv_confParams_6_0= ruleConfigurationParam ) )* '}' )? ( 'Binding Parameters' '{' ( (lv_bindParams_10_0= ruleBindingParam ) )* '}' )? ( 'Supported Child Types' '{' ( (lv_childParams_14_0= ruleSupportedChildType ) )* '}' )? ( 'Allowed Types' '{' ( (lv_allowParams_18_0= ruleAllowedType ) )* '}' )? ( 'On Update' '{' 'ProcessOnAllConfigurationParametersComplete' '=' ( ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) ) ) ';' 'RAProtocol' ( (lv_protocol_27_0= ruleProtocol ) ) '}' )? )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:214:3: 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) ( 'implements' ( ( RULE_STRING ) ) )? ( 'Configuration Parameters' '{' ( (lv_confParams_6_0= ruleConfigurationParam ) )* '}' )? ( 'Binding Parameters' '{' ( (lv_bindParams_10_0= ruleBindingParam ) )* '}' )? ( 'Supported Child Types' '{' ( (lv_childParams_14_0= ruleSupportedChildType ) )* '}' )? ( 'Allowed Types' '{' ( (lv_allowParams_18_0= ruleAllowedType ) )* '}' )? ( 'On Update' '{' 'ProcessOnAllConfigurationParametersComplete' '=' ( ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) ) ) ';' 'RAProtocol' ( (lv_protocol_27_0= ruleProtocol ) ) '}' )?
            {
            match(input,12,FOLLOW_12_in_ruleResourceAdapter337); 

                    createLeafNode(grammarAccess.getResourceAdapterAccess().getResourceAdapterKeyword_0(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:218:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:219:1: (lv_name_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:219:1: (lv_name_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:220:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAdapter354); 

            			createLeafNode(grammarAccess.getResourceAdapterAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:242:2: ( 'implements' ( ( RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:242:4: 'implements' ( ( RULE_STRING ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleResourceAdapter370); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getImplementsKeyword_2_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:246:1: ( ( RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:247:1: ( RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:247:1: ( RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:248:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAdapter388); 

                    		createLeafNode(grammarAccess.getResourceAdapterAccess().getImplnameOfferedServiceCrossReference_2_1_0(), "implname"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:260:4: ( 'Configuration Parameters' '{' ( (lv_confParams_6_0= ruleConfigurationParam ) )* '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:260:6: 'Configuration Parameters' '{' ( (lv_confParams_6_0= ruleConfigurationParam ) )* '}'
                    {
                    match(input,14,FOLLOW_14_in_ruleResourceAdapter401); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getConfigurationParametersKeyword_3_0(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruleResourceAdapter411); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_3_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:268:1: ( (lv_confParams_6_0= ruleConfigurationParam ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||(LA3_0>=28 && LA3_0<=32)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:269:1: (lv_confParams_6_0= ruleConfigurationParam )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:269:1: (lv_confParams_6_0= ruleConfigurationParam )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:270:3: lv_confParams_6_0= ruleConfigurationParam
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getResourceAdapterAccess().getConfParamsConfigurationParamParserRuleCall_3_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConfigurationParam_in_ruleResourceAdapter432);
                    	    lv_confParams_6_0=ruleConfigurationParam();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"confParams",
                    	    	        		lv_confParams_6_0, 
                    	    	        		"ConfigurationParam", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleResourceAdapter443); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_3_3(), null); 
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:296:3: ( 'Binding Parameters' '{' ( (lv_bindParams_10_0= ruleBindingParam ) )* '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:296:5: 'Binding Parameters' '{' ( (lv_bindParams_10_0= ruleBindingParam ) )* '}'
                    {
                    match(input,17,FOLLOW_17_in_ruleResourceAdapter456); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getBindingParametersKeyword_4_0(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruleResourceAdapter466); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_4_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:304:1: ( (lv_bindParams_10_0= ruleBindingParam ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=28 && LA5_0<=32)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:305:1: (lv_bindParams_10_0= ruleBindingParam )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:305:1: (lv_bindParams_10_0= ruleBindingParam )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:306:3: lv_bindParams_10_0= ruleBindingParam
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getResourceAdapterAccess().getBindParamsBindingParamParserRuleCall_4_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBindingParam_in_ruleResourceAdapter487);
                    	    lv_bindParams_10_0=ruleBindingParam();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"bindParams",
                    	    	        		lv_bindParams_10_0, 
                    	    	        		"BindingParam", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleResourceAdapter498); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_4_3(), null); 
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:332:3: ( 'Supported Child Types' '{' ( (lv_childParams_14_0= ruleSupportedChildType ) )* '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:332:5: 'Supported Child Types' '{' ( (lv_childParams_14_0= ruleSupportedChildType ) )* '}'
                    {
                    match(input,18,FOLLOW_18_in_ruleResourceAdapter511); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getSupportedChildTypesKeyword_5_0(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruleResourceAdapter521); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:340:1: ( (lv_childParams_14_0= ruleSupportedChildType ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||(LA7_0>=28 && LA7_0<=32)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:341:1: (lv_childParams_14_0= ruleSupportedChildType )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:341:1: (lv_childParams_14_0= ruleSupportedChildType )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:342:3: lv_childParams_14_0= ruleSupportedChildType
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getResourceAdapterAccess().getChildParamsSupportedChildTypeParserRuleCall_5_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSupportedChildType_in_ruleResourceAdapter542);
                    	    lv_childParams_14_0=ruleSupportedChildType();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"childParams",
                    	    	        		lv_childParams_14_0, 
                    	    	        		"SupportedChildType", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleResourceAdapter553); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_5_3(), null); 
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:368:3: ( 'Allowed Types' '{' ( (lv_allowParams_18_0= ruleAllowedType ) )* '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:368:5: 'Allowed Types' '{' ( (lv_allowParams_18_0= ruleAllowedType ) )* '}'
                    {
                    match(input,19,FOLLOW_19_in_ruleResourceAdapter566); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getAllowedTypesKeyword_6_0(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruleResourceAdapter576); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_6_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:376:1: ( (lv_allowParams_18_0= ruleAllowedType ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||(LA9_0>=28 && LA9_0<=32)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:377:1: (lv_allowParams_18_0= ruleAllowedType )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:377:1: (lv_allowParams_18_0= ruleAllowedType )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:378:3: lv_allowParams_18_0= ruleAllowedType
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getResourceAdapterAccess().getAllowParamsAllowedTypeParserRuleCall_6_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAllowedType_in_ruleResourceAdapter597);
                    	    lv_allowParams_18_0=ruleAllowedType();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"allowParams",
                    	    	        		lv_allowParams_18_0, 
                    	    	        		"AllowedType", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_ruleResourceAdapter608); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_6_3(), null); 
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:404:3: ( 'On Update' '{' 'ProcessOnAllConfigurationParametersComplete' '=' ( ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) ) ) ';' 'RAProtocol' ( (lv_protocol_27_0= ruleProtocol ) ) '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:404:5: 'On Update' '{' 'ProcessOnAllConfigurationParametersComplete' '=' ( ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) ) ) ';' 'RAProtocol' ( (lv_protocol_27_0= ruleProtocol ) ) '}'
                    {
                    match(input,20,FOLLOW_20_in_ruleResourceAdapter621); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getOnUpdateKeyword_7_0(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruleResourceAdapter631); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleResourceAdapter641); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getProcessOnAllConfigurationParametersCompleteKeyword_7_2(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleResourceAdapter651); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getEqualsSignKeyword_7_3(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:420:1: ( ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:421:1: ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:421:1: ( (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:422:1: (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:422:1: (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==23) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==24) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("422:1: (lv_ConfComplete_24_1= 'YES' | lv_ConfComplete_24_2= 'NO' )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:423:3: lv_ConfComplete_24_1= 'YES'
                            {
                            lv_ConfComplete_24_1=(Token)input.LT(1);
                            match(input,23,FOLLOW_23_in_ruleResourceAdapter671); 

                                    createLeafNode(grammarAccess.getResourceAdapterAccess().getConfCompleteYESKeyword_7_4_0_0(), "ConfComplete"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "ConfComplete", lv_ConfComplete_24_1, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;
                        case 2 :
                            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:441:8: lv_ConfComplete_24_2= 'NO'
                            {
                            lv_ConfComplete_24_2=(Token)input.LT(1);
                            match(input,24,FOLLOW_24_in_ruleResourceAdapter700); 

                                    createLeafNode(grammarAccess.getResourceAdapterAccess().getConfCompleteNOKeyword_7_4_0_1(), "ConfComplete"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "ConfComplete", lv_ConfComplete_24_2, null, lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }
                            break;

                    }


                    }


                    }

                    match(input,25,FOLLOW_25_in_ruleResourceAdapter726); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getSemicolonKeyword_7_5(), null); 
                        
                    match(input,26,FOLLOW_26_in_ruleResourceAdapter736); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getRAProtocolKeyword_7_6(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:470:1: ( (lv_protocol_27_0= ruleProtocol ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:471:1: (lv_protocol_27_0= ruleProtocol )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:471:1: (lv_protocol_27_0= ruleProtocol )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:472:3: lv_protocol_27_0= ruleProtocol
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getResourceAdapterAccess().getProtocolProtocolParserRuleCall_7_7_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleProtocol_in_ruleResourceAdapter757);
                    lv_protocol_27_0=ruleProtocol();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceAdapterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"protocol",
                    	        		lv_protocol_27_0, 
                    	        		"Protocol", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleResourceAdapter767); 

                            createLeafNode(grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_7_8(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleResourceAdapter


    // $ANTLR start entryRuleConfigurationParam
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:506:1: entryRuleConfigurationParam returns [EObject current=null] : iv_ruleConfigurationParam= ruleConfigurationParam EOF ;
    public final EObject entryRuleConfigurationParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParam = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:507:2: (iv_ruleConfigurationParam= ruleConfigurationParam EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:508:2: iv_ruleConfigurationParam= ruleConfigurationParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConfigurationParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleConfigurationParam_in_entryRuleConfigurationParam805);
            iv_ruleConfigurationParam=ruleConfigurationParam();
            _fsp--;

             current =iv_ruleConfigurationParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationParam815); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConfigurationParam


    // $ANTLR start ruleConfigurationParam
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:515:1: ruleConfigurationParam returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'implements' ( ( RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_9_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleConfigurationParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_defValue_4_0=null;
        Token lv_descriptionValue_9_0=null;
        EObject lv_paramType_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:520:6: ( ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'implements' ( ( RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_9_0= RULE_STRING ) ) )? ';' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:521:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'implements' ( ( RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_9_0= RULE_STRING ) ) )? ';' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:521:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'implements' ( ( RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_9_0= RULE_STRING ) ) )? ';' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:521:2: () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'implements' ( ( RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_9_0= RULE_STRING ) ) )? ';'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:521:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:522:5: 
            {
             
                    temp=factory.create(grammarAccess.getConfigurationParamAccess().getConfigurationParamAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getConfigurationParamAccess().getConfigurationParamAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:532:2: ( (lv_paramType_1_0= ruleParameterType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=28 && LA13_0<=32)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:533:1: (lv_paramType_1_0= ruleParameterType )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:533:1: (lv_paramType_1_0= ruleParameterType )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:534:3: lv_paramType_1_0= ruleParameterType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConfigurationParamAccess().getParamTypeParameterTypeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleConfigurationParam870);
                    lv_paramType_1_0=ruleParameterType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConfigurationParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paramType",
                    	        		lv_paramType_1_0, 
                    	        		"ParameterType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:556:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:557:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:557:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:558:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:558:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("558:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:559:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationParam890); 

                    			createLeafNode(grammarAccess.getConfigurationParamAccess().getNameIDTerminalRuleCall_2_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConfigurationParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_1, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:580:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationParam910); 

                    			createLeafNode(grammarAccess.getConfigurationParamAccess().getNameSTRINGTerminalRuleCall_2_0_1(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConfigurationParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_2, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:604:2: ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:604:4: '=' ( (lv_defValue_4_0= RULE_STRING ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleConfigurationParam929); 

                            createLeafNode(grammarAccess.getConfigurationParamAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:608:1: ( (lv_defValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:609:1: (lv_defValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:609:1: (lv_defValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:610:3: lv_defValue_4_0= RULE_STRING
                    {
                    lv_defValue_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationParam946); 

                    			createLeafNode(grammarAccess.getConfigurationParamAccess().getDefValueSTRINGTerminalRuleCall_3_1_0(), "defValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConfigurationParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defValue",
                    	        		lv_defValue_4_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:632:4: ( 'implements' ( ( RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:632:6: 'implements' ( ( RULE_STRING ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleConfigurationParam964); 

                            createLeafNode(grammarAccess.getConfigurationParamAccess().getImplementsKeyword_4_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:636:1: ( ( RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:637:1: ( RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:637:1: ( RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:638:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getConfigurationParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationParam982); 

                    		createLeafNode(grammarAccess.getConfigurationParamAccess().getServsettingServiceSettingCrossReference_4_1_0(), "servsetting"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:650:4: ( 'description' '=' ( (lv_descriptionValue_9_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:650:6: 'description' '=' ( (lv_descriptionValue_9_0= RULE_STRING ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleConfigurationParam995); 

                            createLeafNode(grammarAccess.getConfigurationParamAccess().getDescriptionKeyword_5_0(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleConfigurationParam1005); 

                            createLeafNode(grammarAccess.getConfigurationParamAccess().getEqualsSignKeyword_5_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:658:1: ( (lv_descriptionValue_9_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:659:1: (lv_descriptionValue_9_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:659:1: (lv_descriptionValue_9_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:660:3: lv_descriptionValue_9_0= RULE_STRING
                    {
                    lv_descriptionValue_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationParam1022); 

                    			createLeafNode(grammarAccess.getConfigurationParamAccess().getDescriptionValueSTRINGTerminalRuleCall_5_2_0(), "descriptionValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConfigurationParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"descriptionValue",
                    	        		lv_descriptionValue_9_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ruleConfigurationParam1039); 

                    createLeafNode(grammarAccess.getConfigurationParamAccess().getSemicolonKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConfigurationParam


    // $ANTLR start entryRuleBindingParam
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:694:1: entryRuleBindingParam returns [EObject current=null] : iv_ruleBindingParam= ruleBindingParam EOF ;
    public final EObject entryRuleBindingParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingParam = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:695:2: (iv_ruleBindingParam= ruleBindingParam EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:696:2: iv_ruleBindingParam= ruleBindingParam EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindingParamRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindingParam_in_entryRuleBindingParam1075);
            iv_ruleBindingParam=ruleBindingParam();
            _fsp--;

             current =iv_ruleBindingParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingParam1085); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBindingParam


    // $ANTLR start ruleBindingParam
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:703:1: ruleBindingParam returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleBindingParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_defValue_4_0=null;
        Token lv_descriptionValue_7_0=null;
        EObject lv_paramType_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:708:6: ( ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? ';' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:709:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? ';' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:709:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? ';' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:709:2: () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ( 'description' '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? ';'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:709:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:710:5: 
            {
             
                    temp=factory.create(grammarAccess.getBindingParamAccess().getBindingParamAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getBindingParamAccess().getBindingParamAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:720:2: ( (lv_paramType_1_0= ruleParameterType ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=28 && LA18_0<=32)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:721:1: (lv_paramType_1_0= ruleParameterType )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:721:1: (lv_paramType_1_0= ruleParameterType )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:722:3: lv_paramType_1_0= ruleParameterType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getBindingParamAccess().getParamTypeParameterTypeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleBindingParam1140);
                    lv_paramType_1_0=ruleParameterType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paramType",
                    	        		lv_paramType_1_0, 
                    	        		"ParameterType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:744:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:745:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:745:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:746:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:746:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("746:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:747:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingParam1160); 

                    			createLeafNode(grammarAccess.getBindingParamAccess().getNameIDTerminalRuleCall_2_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_1, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:768:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBindingParam1180); 

                    			createLeafNode(grammarAccess.getBindingParamAccess().getNameSTRINGTerminalRuleCall_2_0_1(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_2, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:792:2: ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:792:4: '=' ( (lv_defValue_4_0= RULE_STRING ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleBindingParam1199); 

                            createLeafNode(grammarAccess.getBindingParamAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:796:1: ( (lv_defValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:797:1: (lv_defValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:797:1: (lv_defValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:798:3: lv_defValue_4_0= RULE_STRING
                    {
                    lv_defValue_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBindingParam1216); 

                    			createLeafNode(grammarAccess.getBindingParamAccess().getDefValueSTRINGTerminalRuleCall_3_1_0(), "defValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defValue",
                    	        		lv_defValue_4_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:820:4: ( 'description' '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:820:6: 'description' '=' ( (lv_descriptionValue_7_0= RULE_STRING ) )
                    {
                    match(input,27,FOLLOW_27_in_ruleBindingParam1234); 

                            createLeafNode(grammarAccess.getBindingParamAccess().getDescriptionKeyword_4_0(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleBindingParam1244); 

                            createLeafNode(grammarAccess.getBindingParamAccess().getEqualsSignKeyword_4_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:828:1: ( (lv_descriptionValue_7_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:829:1: (lv_descriptionValue_7_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:829:1: (lv_descriptionValue_7_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:830:3: lv_descriptionValue_7_0= RULE_STRING
                    {
                    lv_descriptionValue_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBindingParam1261); 

                    			createLeafNode(grammarAccess.getBindingParamAccess().getDescriptionValueSTRINGTerminalRuleCall_4_2_0(), "descriptionValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getBindingParamRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"descriptionValue",
                    	        		lv_descriptionValue_7_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ruleBindingParam1278); 

                    createLeafNode(grammarAccess.getBindingParamAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBindingParam


    // $ANTLR start entryRuleSupportedChildType
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:864:1: entryRuleSupportedChildType returns [EObject current=null] : iv_ruleSupportedChildType= ruleSupportedChildType EOF ;
    public final EObject entryRuleSupportedChildType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportedChildType = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:865:2: (iv_ruleSupportedChildType= ruleSupportedChildType EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:866:2: iv_ruleSupportedChildType= ruleSupportedChildType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSupportedChildTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleSupportedChildType_in_entryRuleSupportedChildType1314);
            iv_ruleSupportedChildType=ruleSupportedChildType();
            _fsp--;

             current =iv_ruleSupportedChildType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupportedChildType1324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSupportedChildType


    // $ANTLR start ruleSupportedChildType
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:873:1: ruleSupportedChildType returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleSupportedChildType() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_defValue_4_0=null;
        EObject lv_paramType_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:878:6: ( ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:879:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:879:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:879:2: () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:879:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:880:5: 
            {
             
                    temp=factory.create(grammarAccess.getSupportedChildTypeAccess().getSupportedChildTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getSupportedChildTypeAccess().getSupportedChildTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:890:2: ( (lv_paramType_1_0= ruleParameterType ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=28 && LA22_0<=32)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:891:1: (lv_paramType_1_0= ruleParameterType )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:891:1: (lv_paramType_1_0= ruleParameterType )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:892:3: lv_paramType_1_0= ruleParameterType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSupportedChildTypeAccess().getParamTypeParameterTypeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleSupportedChildType1379);
                    lv_paramType_1_0=ruleParameterType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSupportedChildTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paramType",
                    	        		lv_paramType_1_0, 
                    	        		"ParameterType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:914:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:915:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:915:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:916:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:916:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("916:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:917:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSupportedChildType1399); 

                    			createLeafNode(grammarAccess.getSupportedChildTypeAccess().getNameIDTerminalRuleCall_2_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSupportedChildTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_1, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:938:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSupportedChildType1419); 

                    			createLeafNode(grammarAccess.getSupportedChildTypeAccess().getNameSTRINGTerminalRuleCall_2_0_1(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSupportedChildTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_2, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:962:2: ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:962:4: '=' ( (lv_defValue_4_0= RULE_STRING ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleSupportedChildType1438); 

                            createLeafNode(grammarAccess.getSupportedChildTypeAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:966:1: ( (lv_defValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:967:1: (lv_defValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:967:1: (lv_defValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:968:3: lv_defValue_4_0= RULE_STRING
                    {
                    lv_defValue_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSupportedChildType1455); 

                    			createLeafNode(grammarAccess.getSupportedChildTypeAccess().getDefValueSTRINGTerminalRuleCall_3_1_0(), "defValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSupportedChildTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defValue",
                    	        		lv_defValue_4_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ruleSupportedChildType1472); 

                    createLeafNode(grammarAccess.getSupportedChildTypeAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSupportedChildType


    // $ANTLR start entryRuleAllowedType
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1002:1: entryRuleAllowedType returns [EObject current=null] : iv_ruleAllowedType= ruleAllowedType EOF ;
    public final EObject entryRuleAllowedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedType = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1003:2: (iv_ruleAllowedType= ruleAllowedType EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1004:2: iv_ruleAllowedType= ruleAllowedType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAllowedTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleAllowedType_in_entryRuleAllowedType1508);
            iv_ruleAllowedType=ruleAllowedType();
            _fsp--;

             current =iv_ruleAllowedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowedType1518); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAllowedType


    // $ANTLR start ruleAllowedType
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1011:1: ruleAllowedType returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleAllowedType() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_defValue_4_0=null;
        EObject lv_paramType_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1016:6: ( ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1017:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1017:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1017:2: () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? ';'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1017:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1018:5: 
            {
             
                    temp=factory.create(grammarAccess.getAllowedTypeAccess().getAllowedTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAllowedTypeAccess().getAllowedTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1028:2: ( (lv_paramType_1_0= ruleParameterType ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=28 && LA25_0<=32)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1029:1: (lv_paramType_1_0= ruleParameterType )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1029:1: (lv_paramType_1_0= ruleParameterType )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1030:3: lv_paramType_1_0= ruleParameterType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAllowedTypeAccess().getParamTypeParameterTypeParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleAllowedType1573);
                    lv_paramType_1_0=ruleParameterType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllowedTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"paramType",
                    	        		lv_paramType_1_0, 
                    	        		"ParameterType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1052:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1053:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1053:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1054:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1054:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_STRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1054:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1055:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAllowedType1593); 

                    			createLeafNode(grammarAccess.getAllowedTypeAccess().getNameIDTerminalRuleCall_2_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllowedTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_1, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1076:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllowedType1613); 

                    			createLeafNode(grammarAccess.getAllowedTypeAccess().getNameSTRINGTerminalRuleCall_2_0_1(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllowedTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_2, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1100:2: ( '=' ( (lv_defValue_4_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1100:4: '=' ( (lv_defValue_4_0= RULE_STRING ) )
                    {
                    match(input,22,FOLLOW_22_in_ruleAllowedType1632); 

                            createLeafNode(grammarAccess.getAllowedTypeAccess().getEqualsSignKeyword_3_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1104:1: ( (lv_defValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1105:1: (lv_defValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1105:1: (lv_defValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1106:3: lv_defValue_4_0= RULE_STRING
                    {
                    lv_defValue_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllowedType1649); 

                    			createLeafNode(grammarAccess.getAllowedTypeAccess().getDefValueSTRINGTerminalRuleCall_3_1_0(), "defValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAllowedTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defValue",
                    	        		lv_defValue_4_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ruleAllowedType1666); 

                    createLeafNode(grammarAccess.getAllowedTypeAccess().getSemicolonKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAllowedType


    // $ANTLR start entryRuleProtocol
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1140:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1141:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1142:2: iv_ruleProtocol= ruleProtocol EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProtocolRule(), currentNode); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol1702);
            iv_ruleProtocol=ruleProtocol();
            _fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol1712); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProtocol


    // $ANTLR start ruleProtocol
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1149:1: ruleProtocol returns [EObject current=null] : (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject this_ruleSSH_0 = null;

        EObject this_ruleHTTP_1 = null;

        EObject this_ruleXMLRPC_2 = null;

        EObject this_ruleJavaWrapper_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1154:6: ( (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1155:1: (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1155:1: (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt28=1;
                }
                break;
            case 48:
                {
                alt28=2;
                }
                break;
            case 59:
                {
                alt28=3;
                }
                break;
            case 40:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1155:1: (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1156:5: this_ruleSSH_0= ruleruleSSH
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getRuleSSHParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleruleSSH_in_ruleProtocol1759);
                    this_ruleSSH_0=ruleruleSSH();
                    _fsp--;

                     
                            current = this_ruleSSH_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1166:5: this_ruleHTTP_1= ruleruleHTTP
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getRuleHTTPParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleruleHTTP_in_ruleProtocol1786);
                    this_ruleHTTP_1=ruleruleHTTP();
                    _fsp--;

                     
                            current = this_ruleHTTP_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1176:5: this_ruleXMLRPC_2= ruleruleXMLRPC
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getRuleXMLRPCParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleruleXMLRPC_in_ruleProtocol1813);
                    this_ruleXMLRPC_2=ruleruleXMLRPC();
                    _fsp--;

                     
                            current = this_ruleXMLRPC_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1186:5: this_ruleJavaWrapper_3= ruleruleJavaWrapper
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getProtocolAccess().getRuleJavaWrapperParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleruleJavaWrapper_in_ruleProtocol1840);
                    this_ruleJavaWrapper_3=ruleruleJavaWrapper();
                    _fsp--;

                     
                            current = this_ruleJavaWrapper_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProtocol


    // $ANTLR start entryRuleParameterType
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1202:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1203:2: (iv_ruleParameterType= ruleParameterType EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1204:2: iv_ruleParameterType= ruleParameterType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParameterTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType1875);
            iv_ruleParameterType=ruleParameterType();
            _fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType1885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleParameterType


    // $ANTLR start ruleParameterType
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1211:1: ruleParameterType returns [EObject current=null] : ( () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) ) ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        Token lv_pName_1_1=null;
        Token lv_pName_1_2=null;
        Token lv_pName_1_3=null;
        Token lv_pName_1_4=null;
        Token lv_pName_1_5=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1216:6: ( ( () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1217:1: ( () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1217:1: ( () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1217:2: () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1217:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1218:5: 
            {
             
                    temp=factory.create(grammarAccess.getParameterTypeAccess().getParameterTypeAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getParameterTypeAccess().getParameterTypeAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1228:2: ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1229:1: ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1229:1: ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1230:1: (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1230:1: (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt29=1;
                }
                break;
            case 29:
                {
                alt29=2;
                }
                break;
            case 30:
                {
                alt29=3;
                }
                break;
            case 31:
                {
                alt29=4;
                }
                break;
            case 32:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1230:1: (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1231:3: lv_pName_1_1= 'String'
                    {
                    lv_pName_1_1=(Token)input.LT(1);
                    match(input,28,FOLLOW_28_in_ruleParameterType1939); 

                            createLeafNode(grammarAccess.getParameterTypeAccess().getPNameStringKeyword_1_0_0(), "pName"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "pName", lv_pName_1_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1249:8: lv_pName_1_2= 'Integer'
                    {
                    lv_pName_1_2=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleParameterType1968); 

                            createLeafNode(grammarAccess.getParameterTypeAccess().getPNameIntegerKeyword_1_0_1(), "pName"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "pName", lv_pName_1_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 3 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1267:8: lv_pName_1_3= 'Boolean'
                    {
                    lv_pName_1_3=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleParameterType1997); 

                            createLeafNode(grammarAccess.getParameterTypeAccess().getPNameBooleanKeyword_1_0_2(), "pName"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "pName", lv_pName_1_3, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 4 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1285:8: lv_pName_1_4= 'Enum'
                    {
                    lv_pName_1_4=(Token)input.LT(1);
                    match(input,31,FOLLOW_31_in_ruleParameterType2026); 

                            createLeafNode(grammarAccess.getParameterTypeAccess().getPNameEnumKeyword_1_0_3(), "pName"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "pName", lv_pName_1_4, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 5 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1303:8: lv_pName_1_5= 'REFERENCE'
                    {
                    lv_pName_1_5=(Token)input.LT(1);
                    match(input,32,FOLLOW_32_in_ruleParameterType2055); 

                            createLeafNode(grammarAccess.getParameterTypeAccess().getPNameREFERENCEKeyword_1_0_4(), "pName"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getParameterTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "pName", lv_pName_1_5, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleParameterType


    // $ANTLR start entryRuleruleSSH
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1332:1: entryRuleruleSSH returns [EObject current=null] : iv_ruleruleSSH= ruleruleSSH EOF ;
    public final EObject entryRuleruleSSH() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleSSH = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1333:2: (iv_ruleruleSSH= ruleruleSSH EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1334:2: iv_ruleruleSSH= ruleruleSSH EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleSSHRule(), currentNode); 
            pushFollow(FOLLOW_ruleruleSSH_in_entryRuleruleSSH2107);
            iv_ruleruleSSH=ruleruleSSH();
            _fsp--;

             current =iv_ruleruleSSH; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleSSH2117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleruleSSH


    // $ANTLR start ruleruleSSH
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1341:1: ruleruleSSH returns [EObject current=null] : ( () 'SSH' '{' 'Remote Machine' '=' ( ( RULE_STRING ) ) ';' 'RPort' '=' ( ( RULE_STRING ) ) ';' 'RUsername' '=' ( ( RULE_STRING ) ) ';' 'RPassword' '=' ( ( RULE_STRING ) ) ';' 'RExecute' '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* '}' 'RExecuteDelete' '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* '}' '}' ) ;
    public final EObject ruleruleSSH() throws RecognitionException {
        EObject current = null;

        EObject lv_commands_21_0 = null;

        EObject lv_commandsDelete_25_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1346:6: ( ( () 'SSH' '{' 'Remote Machine' '=' ( ( RULE_STRING ) ) ';' 'RPort' '=' ( ( RULE_STRING ) ) ';' 'RUsername' '=' ( ( RULE_STRING ) ) ';' 'RPassword' '=' ( ( RULE_STRING ) ) ';' 'RExecute' '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* '}' 'RExecuteDelete' '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* '}' '}' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1347:1: ( () 'SSH' '{' 'Remote Machine' '=' ( ( RULE_STRING ) ) ';' 'RPort' '=' ( ( RULE_STRING ) ) ';' 'RUsername' '=' ( ( RULE_STRING ) ) ';' 'RPassword' '=' ( ( RULE_STRING ) ) ';' 'RExecute' '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* '}' 'RExecuteDelete' '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* '}' '}' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1347:1: ( () 'SSH' '{' 'Remote Machine' '=' ( ( RULE_STRING ) ) ';' 'RPort' '=' ( ( RULE_STRING ) ) ';' 'RUsername' '=' ( ( RULE_STRING ) ) ';' 'RPassword' '=' ( ( RULE_STRING ) ) ';' 'RExecute' '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* '}' 'RExecuteDelete' '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* '}' '}' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1347:2: () 'SSH' '{' 'Remote Machine' '=' ( ( RULE_STRING ) ) ';' 'RPort' '=' ( ( RULE_STRING ) ) ';' 'RUsername' '=' ( ( RULE_STRING ) ) ';' 'RPassword' '=' ( ( RULE_STRING ) ) ';' 'RExecute' '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* '}' 'RExecuteDelete' '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* '}' '}'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1347:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1348:5: 
            {
             
                    temp=factory.create(grammarAccess.getRuleSSHAccess().getRuleSSHAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRuleSSHAccess().getRuleSSHAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,33,FOLLOW_33_in_ruleruleSSH2161); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getSSHKeyword_1(), null); 
                
            match(input,15,FOLLOW_15_in_ruleruleSSH2171); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,34,FOLLOW_34_in_ruleruleSSH2181); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRemoteMachineKeyword_3(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleSSH2191); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getEqualsSignKeyword_4(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1374:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1375:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1375:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1376:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRuleSSHRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleSSH2209); 

            		createLeafNode(grammarAccess.getRuleSSHAccess().getRemoteMachineScriptParamCrossReference_5_0(), "remoteMachine"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleruleSSH2219); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getSemicolonKeyword_6(), null); 
                
            match(input,35,FOLLOW_35_in_ruleruleSSH2229); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRPortKeyword_7(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleSSH2239); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getEqualsSignKeyword_8(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1400:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1401:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1401:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1402:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRuleSSHRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleSSH2257); 

            		createLeafNode(grammarAccess.getRuleSSHAccess().getRPortScriptParamCrossReference_9_0(), "RPort"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleruleSSH2267); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getSemicolonKeyword_10(), null); 
                
            match(input,36,FOLLOW_36_in_ruleruleSSH2277); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRUsernameKeyword_11(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleSSH2287); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getEqualsSignKeyword_12(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1426:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1427:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1427:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1428:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRuleSSHRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleSSH2305); 

            		createLeafNode(grammarAccess.getRuleSSHAccess().getUsernameScriptParamCrossReference_13_0(), "username"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleruleSSH2315); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getSemicolonKeyword_14(), null); 
                
            match(input,37,FOLLOW_37_in_ruleruleSSH2325); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRPasswordKeyword_15(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleSSH2335); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getEqualsSignKeyword_16(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1452:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1453:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1453:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1454:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRuleSSHRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleSSH2353); 

            		createLeafNode(grammarAccess.getRuleSSHAccess().getPasswordScriptParamCrossReference_17_0(), "password"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleruleSSH2363); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getSemicolonKeyword_18(), null); 
                
            match(input,38,FOLLOW_38_in_ruleruleSSH2373); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRExecuteKeyword_19(), null); 
                
            match(input,15,FOLLOW_15_in_ruleruleSSH2383); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getLeftCurlyBracketKeyword_20(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1478:1: ( (lv_commands_21_0= rulerulSSH_commands ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1479:1: (lv_commands_21_0= rulerulSSH_commands )
            	    {
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1479:1: (lv_commands_21_0= rulerulSSH_commands )
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1480:3: lv_commands_21_0= rulerulSSH_commands
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRuleSSHAccess().getCommandsRulSSH_commandsParserRuleCall_21_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulerulSSH_commands_in_ruleruleSSH2404);
            	    lv_commands_21_0=rulerulSSH_commands();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRuleSSHRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"commands",
            	    	        		lv_commands_21_0, 
            	    	        		"rulSSH_commands", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleruleSSH2415); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRightCurlyBracketKeyword_22(), null); 
                
            match(input,39,FOLLOW_39_in_ruleruleSSH2425); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRExecuteDeleteKeyword_23(), null); 
                
            match(input,15,FOLLOW_15_in_ruleruleSSH2435); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getLeftCurlyBracketKeyword_24(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1514:1: ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1515:1: (lv_commandsDelete_25_0= rulerulSSH_commands )
            	    {
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1515:1: (lv_commandsDelete_25_0= rulerulSSH_commands )
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1516:3: lv_commandsDelete_25_0= rulerulSSH_commands
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRuleSSHAccess().getCommandsDeleteRulSSH_commandsParserRuleCall_25_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulerulSSH_commands_in_ruleruleSSH2456);
            	    lv_commandsDelete_25_0=rulerulSSH_commands();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRuleSSHRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"commandsDelete",
            	    	        		lv_commandsDelete_25_0, 
            	    	        		"rulSSH_commands", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleruleSSH2467); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRightCurlyBracketKeyword_26(), null); 
                
            match(input,16,FOLLOW_16_in_ruleruleSSH2477); 

                    createLeafNode(grammarAccess.getRuleSSHAccess().getRightCurlyBracketKeyword_27(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleruleSSH


    // $ANTLR start entryRuleruleJavaWrapper
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1554:1: entryRuleruleJavaWrapper returns [EObject current=null] : iv_ruleruleJavaWrapper= ruleruleJavaWrapper EOF ;
    public final EObject entryRuleruleJavaWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleJavaWrapper = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1555:2: (iv_ruleruleJavaWrapper= ruleruleJavaWrapper EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1556:2: iv_ruleruleJavaWrapper= ruleruleJavaWrapper EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleJavaWrapperRule(), currentNode); 
            pushFollow(FOLLOW_ruleruleJavaWrapper_in_entryRuleruleJavaWrapper2513);
            iv_ruleruleJavaWrapper=ruleruleJavaWrapper();
            _fsp--;

             current =iv_ruleruleJavaWrapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleJavaWrapper2523); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleruleJavaWrapper


    // $ANTLR start ruleruleJavaWrapper
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1563:1: ruleruleJavaWrapper returns [EObject current=null] : ( () 'Java' ( (lv_classname_2_0= RULE_ID ) ) '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) ( ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? ')' '{' ( (lv_commands_9_0= ruleCommand ) )* '}' ) ;
    public final EObject ruleruleJavaWrapper() throws RecognitionException {
        EObject current = null;

        Token lv_classname_2_0=null;
        EObject lv_constructorParams_4_0 = null;

        EObject lv_constructorParams_6_0 = null;

        EObject lv_commands_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1568:6: ( ( () 'Java' ( (lv_classname_2_0= RULE_ID ) ) '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) ( ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? ')' '{' ( (lv_commands_9_0= ruleCommand ) )* '}' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1569:1: ( () 'Java' ( (lv_classname_2_0= RULE_ID ) ) '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) ( ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? ')' '{' ( (lv_commands_9_0= ruleCommand ) )* '}' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1569:1: ( () 'Java' ( (lv_classname_2_0= RULE_ID ) ) '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) ( ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? ')' '{' ( (lv_commands_9_0= ruleCommand ) )* '}' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1569:2: () 'Java' ( (lv_classname_2_0= RULE_ID ) ) '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) ( ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? ')' '{' ( (lv_commands_9_0= ruleCommand ) )* '}'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1569:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1570:5: 
            {
             
                    temp=factory.create(grammarAccess.getRuleJavaWrapperAccess().getRuleJavaWrapperAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRuleJavaWrapperAccess().getRuleJavaWrapperAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,40,FOLLOW_40_in_ruleruleJavaWrapper2567); 

                    createLeafNode(grammarAccess.getRuleJavaWrapperAccess().getJavaKeyword_1(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1584:1: ( (lv_classname_2_0= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1585:1: (lv_classname_2_0= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1585:1: (lv_classname_2_0= RULE_ID )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1586:3: lv_classname_2_0= RULE_ID
            {
            lv_classname_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleJavaWrapper2584); 

            			createLeafNode(grammarAccess.getRuleJavaWrapperAccess().getClassnameIDTerminalRuleCall_2_0(), "classname"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRuleJavaWrapperRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"classname",
            	        		lv_classname_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,41,FOLLOW_41_in_ruleruleJavaWrapper2599); 

                    createLeafNode(grammarAccess.getRuleJavaWrapperAccess().getLeftParenthesisKeyword_3(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1612:1: ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) ( ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_INT)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1612:2: ( (lv_constructorParams_4_0= rulerulJava_param ) ) ( ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )*
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1612:2: ( (lv_constructorParams_4_0= rulerulJava_param ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1613:1: (lv_constructorParams_4_0= rulerulJava_param )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1613:1: (lv_constructorParams_4_0= rulerulJava_param )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1614:3: lv_constructorParams_4_0= rulerulJava_param
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRuleJavaWrapperAccess().getConstructorParamsRulJava_paramParserRuleCall_4_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulerulJava_param_in_ruleruleJavaWrapper2621);
                    lv_constructorParams_4_0=rulerulJava_param();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleJavaWrapperRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"constructorParams",
                    	        		lv_constructorParams_4_0, 
                    	        		"rulJava_param", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1636:2: ( ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==42) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1636:4: ',' ( (lv_constructorParams_6_0= rulerulJava_param ) )
                    	    {
                    	    match(input,42,FOLLOW_42_in_ruleruleJavaWrapper2632); 

                    	            createLeafNode(grammarAccess.getRuleJavaWrapperAccess().getCommaKeyword_4_1_0(), null); 
                    	        
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1640:1: ( (lv_constructorParams_6_0= rulerulJava_param ) )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1641:1: (lv_constructorParams_6_0= rulerulJava_param )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1641:1: (lv_constructorParams_6_0= rulerulJava_param )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1642:3: lv_constructorParams_6_0= rulerulJava_param
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRuleJavaWrapperAccess().getConstructorParamsRulJava_paramParserRuleCall_4_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulerulJava_param_in_ruleruleJavaWrapper2653);
                    	    lv_constructorParams_6_0=rulerulJava_param();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRuleJavaWrapperRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"constructorParams",
                    	    	        		lv_constructorParams_6_0, 
                    	    	        		"rulJava_param", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_ruleruleJavaWrapper2667); 

                    createLeafNode(grammarAccess.getRuleJavaWrapperAccess().getRightParenthesisKeyword_5(), null); 
                
            match(input,15,FOLLOW_15_in_ruleruleJavaWrapper2677); 

                    createLeafNode(grammarAccess.getRuleJavaWrapperAccess().getLeftCurlyBracketKeyword_6(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1672:1: ( (lv_commands_9_0= ruleCommand ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=44 && LA34_0<=45)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1673:1: (lv_commands_9_0= ruleCommand )
            	    {
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1673:1: (lv_commands_9_0= ruleCommand )
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1674:3: lv_commands_9_0= ruleCommand
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRuleJavaWrapperAccess().getCommandsCommandParserRuleCall_7_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleruleJavaWrapper2698);
            	    lv_commands_9_0=ruleCommand();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRuleJavaWrapperRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"commands",
            	    	        		lv_commands_9_0, 
            	    	        		"Command", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            match(input,16,FOLLOW_16_in_ruleruleJavaWrapper2709); 

                    createLeafNode(grammarAccess.getRuleJavaWrapperAccess().getRightCurlyBracketKeyword_8(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleruleJavaWrapper


    // $ANTLR start entryRuleCommand
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1708:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1709:2: (iv_ruleCommand= ruleCommand EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1710:2: iv_ruleCommand= ruleCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand2745);
            iv_ruleCommand=ruleCommand();
            _fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand2755); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCommand


    // $ANTLR start ruleCommand
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1717:1: ruleCommand returns [EObject current=null] : (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_entryCommand_0 = null;

        EObject this_assignCommand_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1722:6: ( (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1723:1: (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1723:1: (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            else if ( (LA35_0==45) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1723:1: (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand )", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1724:5: this_entryCommand_0= ruleentryCommand
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getEntryCommandParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleentryCommand_in_ruleCommand2802);
                    this_entryCommand_0=ruleentryCommand();
                    _fsp--;

                     
                            current = this_entryCommand_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1734:5: this_assignCommand_1= ruleassignCommand
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getAssignCommandParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleassignCommand_in_ruleCommand2829);
                    this_assignCommand_1=ruleassignCommand();
                    _fsp--;

                     
                            current = this_assignCommand_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCommand


    // $ANTLR start entryRuleentryCommand
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1750:1: entryRuleentryCommand returns [EObject current=null] : iv_ruleentryCommand= ruleentryCommand EOF ;
    public final EObject entryRuleentryCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentryCommand = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1751:2: (iv_ruleentryCommand= ruleentryCommand EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1752:2: iv_ruleentryCommand= ruleentryCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntryCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleentryCommand_in_entryRuleentryCommand2864);
            iv_ruleentryCommand=ruleentryCommand();
            _fsp--;

             current =iv_ruleentryCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentryCommand2874); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleentryCommand


    // $ANTLR start ruleentryCommand
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1759:1: ruleentryCommand returns [EObject current=null] : ( 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) ( ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? ')' ) ;
    public final EObject ruleentryCommand() throws RecognitionException {
        EObject current = null;

        Token lv_javaFunctionName_1_0=null;
        EObject lv_commands_3_0 = null;

        EObject lv_commands_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1764:6: ( ( 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) ( ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? ')' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1765:1: ( 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) ( ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? ')' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1765:1: ( 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) ( ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? ')' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1765:3: 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) ( ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? ')'
            {
            match(input,44,FOLLOW_44_in_ruleentryCommand2909); 

                    createLeafNode(grammarAccess.getEntryCommandAccess().getJExecuteKeyword_0(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1769:1: ( (lv_javaFunctionName_1_0= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1770:1: (lv_javaFunctionName_1_0= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1770:1: (lv_javaFunctionName_1_0= RULE_ID )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1771:3: lv_javaFunctionName_1_0= RULE_ID
            {
            lv_javaFunctionName_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleentryCommand2926); 

            			createLeafNode(grammarAccess.getEntryCommandAccess().getJavaFunctionNameIDTerminalRuleCall_1_0(), "javaFunctionName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntryCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"javaFunctionName",
            	        		lv_javaFunctionName_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,41,FOLLOW_41_in_ruleentryCommand2941); 

                    createLeafNode(grammarAccess.getEntryCommandAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1797:1: ( ( (lv_commands_3_0= rulerulJava_param ) ) ( ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_INT)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1797:2: ( (lv_commands_3_0= rulerulJava_param ) ) ( ',' ( (lv_commands_5_0= rulerulJava_param ) ) )*
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1797:2: ( (lv_commands_3_0= rulerulJava_param ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1798:1: (lv_commands_3_0= rulerulJava_param )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1798:1: (lv_commands_3_0= rulerulJava_param )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1799:3: lv_commands_3_0= rulerulJava_param
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEntryCommandAccess().getCommandsRulJava_paramParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulerulJava_param_in_ruleentryCommand2963);
                    lv_commands_3_0=rulerulJava_param();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEntryCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"commands",
                    	        		lv_commands_3_0, 
                    	        		"rulJava_param", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1821:2: ( ',' ( (lv_commands_5_0= rulerulJava_param ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==42) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1821:4: ',' ( (lv_commands_5_0= rulerulJava_param ) )
                    	    {
                    	    match(input,42,FOLLOW_42_in_ruleentryCommand2974); 

                    	            createLeafNode(grammarAccess.getEntryCommandAccess().getCommaKeyword_3_1_0(), null); 
                    	        
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1825:1: ( (lv_commands_5_0= rulerulJava_param ) )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1826:1: (lv_commands_5_0= rulerulJava_param )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1826:1: (lv_commands_5_0= rulerulJava_param )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1827:3: lv_commands_5_0= rulerulJava_param
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getEntryCommandAccess().getCommandsRulJava_paramParserRuleCall_3_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulerulJava_param_in_ruleentryCommand2995);
                    	    lv_commands_5_0=rulerulJava_param();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getEntryCommandRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"commands",
                    	    	        		lv_commands_5_0, 
                    	    	        		"rulJava_param", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_ruleentryCommand3009); 

                    createLeafNode(grammarAccess.getEntryCommandAccess().getRightParenthesisKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleentryCommand


    // $ANTLR start entryRulerulJava_param
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1861:1: entryRulerulJava_param returns [EObject current=null] : iv_rulerulJava_param= rulerulJava_param EOF ;
    public final EObject entryRulerulJava_param() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulJava_param = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1862:2: (iv_rulerulJava_param= rulerulJava_param EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1863:2: iv_rulerulJava_param= rulerulJava_param EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRulJava_paramRule(), currentNode); 
            pushFollow(FOLLOW_rulerulJava_param_in_entryRulerulJava_param3045);
            iv_rulerulJava_param=rulerulJava_param();
            _fsp--;

             current =iv_rulerulJava_param; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulJava_param3055); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulerulJava_param


    // $ANTLR start rulerulJava_param
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1870:1: rulerulJava_param returns [EObject current=null] : (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript ) ;
    public final EObject rulerulJava_param() throws RecognitionException {
        EObject current = null;

        EObject this_rulJava_paramString_0 = null;

        EObject this_rulJava_paramInt_1 = null;

        EObject this_rulJava_paraScript_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1875:6: ( (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1876:1: (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1876:1: (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt38=1;
                }
                break;
            case RULE_INT:
                {
                alt38=2;
                }
                break;
            case RULE_ID:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1876:1: (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1877:5: this_rulJava_paramString_0= rulerulJava_paramString
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRulJava_paramAccess().getRulJava_paramStringParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulerulJava_paramString_in_rulerulJava_param3102);
                    this_rulJava_paramString_0=rulerulJava_paramString();
                    _fsp--;

                     
                            current = this_rulJava_paramString_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1887:5: this_rulJava_paramInt_1= rulerulJava_paramInt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRulJava_paramAccess().getRulJava_paramIntParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulerulJava_paramInt_in_rulerulJava_param3129);
                    this_rulJava_paramInt_1=rulerulJava_paramInt();
                    _fsp--;

                     
                            current = this_rulJava_paramInt_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1897:5: this_rulJava_paraScript_2= rulerulJava_paraScript
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRulJava_paramAccess().getRulJava_paraScriptParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_rulerulJava_paraScript_in_rulerulJava_param3156);
                    this_rulJava_paraScript_2=rulerulJava_paraScript();
                    _fsp--;

                     
                            current = this_rulJava_paraScript_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulerulJava_param


    // $ANTLR start entryRulerulJava_paramString
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1913:1: entryRulerulJava_paramString returns [EObject current=null] : iv_rulerulJava_paramString= rulerulJava_paramString EOF ;
    public final EObject entryRulerulJava_paramString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulJava_paramString = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1914:2: (iv_rulerulJava_paramString= rulerulJava_paramString EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1915:2: iv_rulerulJava_paramString= rulerulJava_paramString EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRulJava_paramStringRule(), currentNode); 
            pushFollow(FOLLOW_rulerulJava_paramString_in_entryRulerulJava_paramString3191);
            iv_rulerulJava_paramString=rulerulJava_paramString();
            _fsp--;

             current =iv_rulerulJava_paramString; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulJava_paramString3201); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulerulJava_paramString


    // $ANTLR start rulerulJava_paramString
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1922:1: rulerulJava_paramString returns [EObject current=null] : ( (lv_stringValue_0_0= RULE_STRING ) ) ;
    public final EObject rulerulJava_paramString() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1927:6: ( ( (lv_stringValue_0_0= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1928:1: ( (lv_stringValue_0_0= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1928:1: ( (lv_stringValue_0_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1929:1: (lv_stringValue_0_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1929:1: (lv_stringValue_0_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1930:3: lv_stringValue_0_0= RULE_STRING
            {
            lv_stringValue_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulerulJava_paramString3242); 

            			createLeafNode(grammarAccess.getRulJava_paramStringAccess().getStringValueSTRINGTerminalRuleCall_0(), "stringValue"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRulJava_paramStringRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"stringValue",
            	        		lv_stringValue_0_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulerulJava_paramString


    // $ANTLR start entryRulerulJava_paramInt
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1960:1: entryRulerulJava_paramInt returns [EObject current=null] : iv_rulerulJava_paramInt= rulerulJava_paramInt EOF ;
    public final EObject entryRulerulJava_paramInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulJava_paramInt = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1961:2: (iv_rulerulJava_paramInt= rulerulJava_paramInt EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1962:2: iv_rulerulJava_paramInt= rulerulJava_paramInt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRulJava_paramIntRule(), currentNode); 
            pushFollow(FOLLOW_rulerulJava_paramInt_in_entryRulerulJava_paramInt3282);
            iv_rulerulJava_paramInt=rulerulJava_paramInt();
            _fsp--;

             current =iv_rulerulJava_paramInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulJava_paramInt3292); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulerulJava_paramInt


    // $ANTLR start rulerulJava_paramInt
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1969:1: rulerulJava_paramInt returns [EObject current=null] : ( (lv_intValue_0_0= RULE_INT ) ) ;
    public final EObject rulerulJava_paramInt() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1974:6: ( ( (lv_intValue_0_0= RULE_INT ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1975:1: ( (lv_intValue_0_0= RULE_INT ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1975:1: ( (lv_intValue_0_0= RULE_INT ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1976:1: (lv_intValue_0_0= RULE_INT )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1976:1: (lv_intValue_0_0= RULE_INT )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:1977:3: lv_intValue_0_0= RULE_INT
            {
            lv_intValue_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulerulJava_paramInt3333); 

            			createLeafNode(grammarAccess.getRulJava_paramIntAccess().getIntValueINTTerminalRuleCall_0(), "intValue"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRulJava_paramIntRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"intValue",
            	        		lv_intValue_0_0, 
            	        		"INT", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulerulJava_paramInt


    // $ANTLR start entryRulerulJava_paraScript
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2007:1: entryRulerulJava_paraScript returns [EObject current=null] : iv_rulerulJava_paraScript= rulerulJava_paraScript EOF ;
    public final EObject entryRulerulJava_paraScript() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulJava_paraScript = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2008:2: (iv_rulerulJava_paraScript= rulerulJava_paraScript EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2009:2: iv_rulerulJava_paraScript= rulerulJava_paraScript EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRulJava_paraScriptRule(), currentNode); 
            pushFollow(FOLLOW_rulerulJava_paraScript_in_entryRulerulJava_paraScript3373);
            iv_rulerulJava_paraScript=rulerulJava_paraScript();
            _fsp--;

             current =iv_rulerulJava_paraScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulJava_paraScript3383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulerulJava_paraScript


    // $ANTLR start rulerulJava_paraScript
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2016:1: rulerulJava_paraScript returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject rulerulJava_paraScript() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2021:6: ( ( ( RULE_ID ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2022:1: ( ( RULE_ID ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2022:1: ( ( RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2023:1: ( RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2023:1: ( RULE_ID )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2024:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRulJava_paraScriptRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulerulJava_paraScript3425); 

            		createLeafNode(grammarAccess.getRulJava_paraScriptAccess().getScriptparamValueScriptParamCrossReference_0(), "scriptparamValue"); 
            	

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulerulJava_paraScript


    // $ANTLR start entryRuleassignCommand
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2044:1: entryRuleassignCommand returns [EObject current=null] : iv_ruleassignCommand= ruleassignCommand EOF ;
    public final EObject entryRuleassignCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignCommand = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2045:2: (iv_ruleassignCommand= ruleassignCommand EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2046:2: iv_ruleassignCommand= ruleassignCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleassignCommand_in_entryRuleassignCommand3460);
            iv_ruleassignCommand=ruleassignCommand();
            _fsp--;

             current =iv_ruleassignCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignCommand3470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleassignCommand


    // $ANTLR start ruleassignCommand
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2053:1: ruleassignCommand returns [EObject current=null] : ( () 'JAssign' ( ( RULE_ID ) ) '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) ( ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? ')' ) ;
    public final EObject ruleassignCommand() throws RecognitionException {
        EObject current = null;

        Token lv_javaFunctionName_4_0=null;
        EObject lv_commands_6_0 = null;

        EObject lv_commands_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2058:6: ( ( () 'JAssign' ( ( RULE_ID ) ) '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) ( ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? ')' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2059:1: ( () 'JAssign' ( ( RULE_ID ) ) '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) ( ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? ')' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2059:1: ( () 'JAssign' ( ( RULE_ID ) ) '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) ( ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? ')' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2059:2: () 'JAssign' ( ( RULE_ID ) ) '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) ( ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? ')'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2059:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2060:5: 
            {
             
                    temp=factory.create(grammarAccess.getAssignCommandAccess().getAssignCommandAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getAssignCommandAccess().getAssignCommandAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,45,FOLLOW_45_in_ruleassignCommand3514); 

                    createLeafNode(grammarAccess.getAssignCommandAccess().getJAssignKeyword_1(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2074:1: ( ( RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2075:1: ( RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2075:1: ( RULE_ID )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2076:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getAssignCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleassignCommand3532); 

            		createLeafNode(grammarAccess.getAssignCommandAccess().getScriptParamScriptParamCrossReference_2_0(), "scriptParam"); 
            	

            }


            }

            match(input,22,FOLLOW_22_in_ruleassignCommand3542); 

                    createLeafNode(grammarAccess.getAssignCommandAccess().getEqualsSignKeyword_3(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2092:1: ( (lv_javaFunctionName_4_0= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2093:1: (lv_javaFunctionName_4_0= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2093:1: (lv_javaFunctionName_4_0= RULE_ID )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2094:3: lv_javaFunctionName_4_0= RULE_ID
            {
            lv_javaFunctionName_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleassignCommand3559); 

            			createLeafNode(grammarAccess.getAssignCommandAccess().getJavaFunctionNameIDTerminalRuleCall_4_0(), "javaFunctionName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignCommandRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"javaFunctionName",
            	        		lv_javaFunctionName_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,41,FOLLOW_41_in_ruleassignCommand3574); 

                    createLeafNode(grammarAccess.getAssignCommandAccess().getLeftParenthesisKeyword_5(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2120:1: ( ( (lv_commands_6_0= rulerulJava_param ) ) ( ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_INT)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2120:2: ( (lv_commands_6_0= rulerulJava_param ) ) ( ',' ( (lv_commands_8_0= rulerulJava_param ) ) )*
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2120:2: ( (lv_commands_6_0= rulerulJava_param ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2121:1: (lv_commands_6_0= rulerulJava_param )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2121:1: (lv_commands_6_0= rulerulJava_param )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2122:3: lv_commands_6_0= rulerulJava_param
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAssignCommandAccess().getCommandsRulJava_paramParserRuleCall_6_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulerulJava_param_in_ruleassignCommand3596);
                    lv_commands_6_0=rulerulJava_param();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAssignCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"commands",
                    	        		lv_commands_6_0, 
                    	        		"rulJava_param", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2144:2: ( ',' ( (lv_commands_8_0= rulerulJava_param ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==42) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2144:4: ',' ( (lv_commands_8_0= rulerulJava_param ) )
                    	    {
                    	    match(input,42,FOLLOW_42_in_ruleassignCommand3607); 

                    	            createLeafNode(grammarAccess.getAssignCommandAccess().getCommaKeyword_6_1_0(), null); 
                    	        
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2148:1: ( (lv_commands_8_0= rulerulJava_param ) )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2149:1: (lv_commands_8_0= rulerulJava_param )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2149:1: (lv_commands_8_0= rulerulJava_param )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2150:3: lv_commands_8_0= rulerulJava_param
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAssignCommandAccess().getCommandsRulJava_paramParserRuleCall_6_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulerulJava_param_in_ruleassignCommand3628);
                    	    lv_commands_8_0=rulerulJava_param();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAssignCommandRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"commands",
                    	    	        		lv_commands_8_0, 
                    	    	        		"rulJava_param", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,43,FOLLOW_43_in_ruleassignCommand3642); 

                    createLeafNode(grammarAccess.getAssignCommandAccess().getRightParenthesisKeyword_7(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleassignCommand


    // $ANTLR start entryRulerulSSH_commands
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2186:1: entryRulerulSSH_commands returns [EObject current=null] : iv_rulerulSSH_commands= rulerulSSH_commands EOF ;
    public final EObject entryRulerulSSH_commands() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulSSH_commands = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2187:2: (iv_rulerulSSH_commands= rulerulSSH_commands EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2188:2: iv_rulerulSSH_commands= rulerulSSH_commands EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRulSSH_commandsRule(), currentNode); 
            pushFollow(FOLLOW_rulerulSSH_commands_in_entryRulerulSSH_commands3680);
            iv_rulerulSSH_commands=rulerulSSH_commands();
            _fsp--;

             current =iv_rulerulSSH_commands; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulSSH_commands3690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulerulSSH_commands


    // $ANTLR start rulerulSSH_commands
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2195:1: rulerulSSH_commands returns [EObject current=null] : ( () ( (lv_remoteCommand_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )? ) ;
    public final EObject rulerulSSH_commands() throws RecognitionException {
        EObject current = null;

        Token lv_remoteCommand_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2200:6: ( ( () ( (lv_remoteCommand_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )? ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2201:1: ( () ( (lv_remoteCommand_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )? )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2201:1: ( () ( (lv_remoteCommand_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )? )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2201:2: () ( (lv_remoteCommand_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )?
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2201:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2202:5: 
            {
             
                    temp=factory.create(grammarAccess.getRulSSH_commandsAccess().getRulSSH_commandsAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRulSSH_commandsAccess().getRulSSH_commandsAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2212:2: ( (lv_remoteCommand_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2213:1: (lv_remoteCommand_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2213:1: (lv_remoteCommand_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2214:3: lv_remoteCommand_1_0= RULE_STRING
            {
            lv_remoteCommand_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulerulSSH_commands3741); 

            			createLeafNode(grammarAccess.getRulSSH_commandsAccess().getRemoteCommandSTRINGTerminalRuleCall_1_0(), "remoteCommand"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRulSSH_commandsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"remoteCommand",
            	        		lv_remoteCommand_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2236:2: ( '<<' ( ( RULE_STRING ) )* '>>' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2236:4: '<<' ( ( RULE_STRING ) )* '>>'
                    {
                    match(input,46,FOLLOW_46_in_rulerulSSH_commands3757); 

                            createLeafNode(grammarAccess.getRulSSH_commandsAccess().getLessThanSignLessThanSignKeyword_2_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2240:1: ( ( RULE_STRING ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_STRING) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2241:1: ( RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2241:1: ( RULE_STRING )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2242:3: RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRulSSH_commandsRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulerulSSH_commands3775); 

                    	    		createLeafNode(grammarAccess.getRulSSH_commandsAccess().getScriptparamsScriptParamCrossReference_2_1_0(), "scriptparams"); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    match(input,47,FOLLOW_47_in_rulerulSSH_commands3786); 

                            createLeafNode(grammarAccess.getRulSSH_commandsAccess().getGreaterThanSignGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulerulSSH_commands


    // $ANTLR start entryRuleruleHTTP
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2266:1: entryRuleruleHTTP returns [EObject current=null] : iv_ruleruleHTTP= ruleruleHTTP EOF ;
    public final EObject entryRuleruleHTTP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleHTTP = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2267:2: (iv_ruleruleHTTP= ruleruleHTTP EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2268:2: iv_ruleruleHTTP= ruleruleHTTP EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleHTTPRule(), currentNode); 
            pushFollow(FOLLOW_ruleruleHTTP_in_entryRuleruleHTTP3824);
            iv_ruleruleHTTP=ruleruleHTTP();
            _fsp--;

             current =iv_ruleruleHTTP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleHTTP3834); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleruleHTTP


    // $ANTLR start ruleruleHTTP
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2275:1: ruleruleHTTP returns [EObject current=null] : ( () 'HTTP' '{' 'RemoteMachine' '=' ( ( RULE_STRING ) ) ';' 'HttpURL' '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* ';' 'HttpMethod' '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) ';' ( 'HttpAuth' '{' 'Method' '=' ( ( RULE_STRING ) ) ';' 'AuthUsername' '=' ( ( RULE_STRING ) ) ';' 'AuthPassword' '=' ( ( RULE_STRING ) ) ';' '}' )? ( 'PostBody' '=' ( ( RULE_STRING ) ) ';' ) '}' ) ;
    public final EObject ruleruleHTTP() throws RecognitionException {
        EObject current = null;

        Token lv_HMethod_13_1=null;
        Token lv_HMethod_13_2=null;
        EObject lv_httpURL_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2280:6: ( ( () 'HTTP' '{' 'RemoteMachine' '=' ( ( RULE_STRING ) ) ';' 'HttpURL' '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* ';' 'HttpMethod' '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) ';' ( 'HttpAuth' '{' 'Method' '=' ( ( RULE_STRING ) ) ';' 'AuthUsername' '=' ( ( RULE_STRING ) ) ';' 'AuthPassword' '=' ( ( RULE_STRING ) ) ';' '}' )? ( 'PostBody' '=' ( ( RULE_STRING ) ) ';' ) '}' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2281:1: ( () 'HTTP' '{' 'RemoteMachine' '=' ( ( RULE_STRING ) ) ';' 'HttpURL' '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* ';' 'HttpMethod' '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) ';' ( 'HttpAuth' '{' 'Method' '=' ( ( RULE_STRING ) ) ';' 'AuthUsername' '=' ( ( RULE_STRING ) ) ';' 'AuthPassword' '=' ( ( RULE_STRING ) ) ';' '}' )? ( 'PostBody' '=' ( ( RULE_STRING ) ) ';' ) '}' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2281:1: ( () 'HTTP' '{' 'RemoteMachine' '=' ( ( RULE_STRING ) ) ';' 'HttpURL' '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* ';' 'HttpMethod' '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) ';' ( 'HttpAuth' '{' 'Method' '=' ( ( RULE_STRING ) ) ';' 'AuthUsername' '=' ( ( RULE_STRING ) ) ';' 'AuthPassword' '=' ( ( RULE_STRING ) ) ';' '}' )? ( 'PostBody' '=' ( ( RULE_STRING ) ) ';' ) '}' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2281:2: () 'HTTP' '{' 'RemoteMachine' '=' ( ( RULE_STRING ) ) ';' 'HttpURL' '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* ';' 'HttpMethod' '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) ';' ( 'HttpAuth' '{' 'Method' '=' ( ( RULE_STRING ) ) ';' 'AuthUsername' '=' ( ( RULE_STRING ) ) ';' 'AuthPassword' '=' ( ( RULE_STRING ) ) ';' '}' )? ( 'PostBody' '=' ( ( RULE_STRING ) ) ';' ) '}'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2281:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2282:5: 
            {
             
                    temp=factory.create(grammarAccess.getRuleHTTPAccess().getRuleHTTPAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRuleHTTPAccess().getRuleHTTPAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,48,FOLLOW_48_in_ruleruleHTTP3878); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getHTTPKeyword_1(), null); 
                
            match(input,15,FOLLOW_15_in_ruleruleHTTP3888); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,49,FOLLOW_49_in_ruleruleHTTP3898); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getRemoteMachineKeyword_3(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleHTTP3908); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_4(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2308:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2309:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2309:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2310:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRuleHTTPRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP3926); 

            		createLeafNode(grammarAccess.getRuleHTTPAccess().getRemoteMachineScriptParamCrossReference_5_0(), "remoteMachine"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleruleHTTP3936); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_6(), null); 
                
            match(input,50,FOLLOW_50_in_ruleruleHTTP3946); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getHttpURLKeyword_7(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleHTTP3956); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_8(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2334:1: ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_STRING) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2335:1: (lv_httpURL_9_0= ruleruleHTTP_URL )
            	    {
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2335:1: (lv_httpURL_9_0= ruleruleHTTP_URL )
            	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2336:3: lv_httpURL_9_0= ruleruleHTTP_URL
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRuleHTTPAccess().getHttpURLRuleHTTP_URLParserRuleCall_9_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleruleHTTP_URL_in_ruleruleHTTP3977);
            	    lv_httpURL_9_0=ruleruleHTTP_URL();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRuleHTTPRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"httpURL",
            	    	        		lv_httpURL_9_0, 
            	    	        		"ruleHTTP_URL", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            match(input,25,FOLLOW_25_in_ruleruleHTTP3988); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_10(), null); 
                
            match(input,51,FOLLOW_51_in_ruleruleHTTP3998); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getHttpMethodKeyword_11(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleHTTP4008); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_12(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2370:1: ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2371:1: ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2371:1: ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2372:1: (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2372:1: (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==52) ) {
                alt44=1;
            }
            else if ( (LA44_0==53) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2372:1: (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2373:3: lv_HMethod_13_1= 'GET'
                    {
                    lv_HMethod_13_1=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleruleHTTP4028); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getHMethodGETKeyword_13_0_0(), "HMethod"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleHTTPRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "HMethod", lv_HMethod_13_1, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2391:8: lv_HMethod_13_2= 'POST'
                    {
                    lv_HMethod_13_2=(Token)input.LT(1);
                    match(input,53,FOLLOW_53_in_ruleruleHTTP4057); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getHMethodPOSTKeyword_13_0_1(), "HMethod"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleHTTPRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "HMethod", lv_HMethod_13_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }


            }


            }

            match(input,25,FOLLOW_25_in_ruleruleHTTP4083); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_14(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2416:1: ( 'HttpAuth' '{' 'Method' '=' ( ( RULE_STRING ) ) ';' 'AuthUsername' '=' ( ( RULE_STRING ) ) ';' 'AuthPassword' '=' ( ( RULE_STRING ) ) ';' '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2416:3: 'HttpAuth' '{' 'Method' '=' ( ( RULE_STRING ) ) ';' 'AuthUsername' '=' ( ( RULE_STRING ) ) ';' 'AuthPassword' '=' ( ( RULE_STRING ) ) ';' '}'
                    {
                    match(input,54,FOLLOW_54_in_ruleruleHTTP4094); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getHttpAuthKeyword_15_0(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruleruleHTTP4104); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getLeftCurlyBracketKeyword_15_1(), null); 
                        
                    match(input,55,FOLLOW_55_in_ruleruleHTTP4114); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getMethodKeyword_15_2(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleruleHTTP4124); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_15_3(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2432:1: ( ( RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2433:1: ( RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2433:1: ( RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2434:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleHTTPRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4142); 

                    		createLeafNode(grammarAccess.getRuleHTTPAccess().getAuthMethodScriptParamCrossReference_15_4_0(), "AuthMethod"); 
                    	

                    }


                    }

                    match(input,25,FOLLOW_25_in_ruleruleHTTP4152); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_15_5(), null); 
                        
                    match(input,56,FOLLOW_56_in_ruleruleHTTP4162); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getAuthUsernameKeyword_15_6(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleruleHTTP4172); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_15_7(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2458:1: ( ( RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2459:1: ( RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2459:1: ( RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2460:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleHTTPRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4190); 

                    		createLeafNode(grammarAccess.getRuleHTTPAccess().getUsernameScriptParamCrossReference_15_8_0(), "username"); 
                    	

                    }


                    }

                    match(input,25,FOLLOW_25_in_ruleruleHTTP4200); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_15_9(), null); 
                        
                    match(input,57,FOLLOW_57_in_ruleruleHTTP4210); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getAuthPasswordKeyword_15_10(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleruleHTTP4220); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_15_11(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2484:1: ( ( RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2485:1: ( RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2485:1: ( RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2486:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleHTTPRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4238); 

                    		createLeafNode(grammarAccess.getRuleHTTPAccess().getPasswordScriptParamCrossReference_15_12_0(), "password"); 
                    	

                    }


                    }

                    match(input,25,FOLLOW_25_in_ruleruleHTTP4248); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_15_13(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleruleHTTP4258); 

                            createLeafNode(grammarAccess.getRuleHTTPAccess().getRightCurlyBracketKeyword_15_14(), null); 
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2506:3: ( 'PostBody' '=' ( ( RULE_STRING ) ) ';' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2506:5: 'PostBody' '=' ( ( RULE_STRING ) ) ';'
            {
            match(input,58,FOLLOW_58_in_ruleruleHTTP4271); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getPostBodyKeyword_16_0(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleHTTP4281); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_16_1(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2514:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2515:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2515:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2516:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRuleHTTPRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4299); 

            		createLeafNode(grammarAccess.getRuleHTTPAccess().getPostBodyScriptParamCrossReference_16_2_0(), "postBody"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleruleHTTP4309); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_16_3(), null); 
                

            }

            match(input,16,FOLLOW_16_in_ruleruleHTTP4320); 

                    createLeafNode(grammarAccess.getRuleHTTPAccess().getRightCurlyBracketKeyword_17(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleruleHTTP


    // $ANTLR start entryRuleruleHTTP_URL
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2544:1: entryRuleruleHTTP_URL returns [EObject current=null] : iv_ruleruleHTTP_URL= ruleruleHTTP_URL EOF ;
    public final EObject entryRuleruleHTTP_URL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleHTTP_URL = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2545:2: (iv_ruleruleHTTP_URL= ruleruleHTTP_URL EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2546:2: iv_ruleruleHTTP_URL= ruleruleHTTP_URL EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleHTTP_URLRule(), currentNode); 
            pushFollow(FOLLOW_ruleruleHTTP_URL_in_entryRuleruleHTTP_URL4356);
            iv_ruleruleHTTP_URL=ruleruleHTTP_URL();
            _fsp--;

             current =iv_ruleruleHTTP_URL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleHTTP_URL4366); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleruleHTTP_URL


    // $ANTLR start ruleruleHTTP_URL
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2553:1: ruleruleHTTP_URL returns [EObject current=null] : ( () ( (lv_remoteURL_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )? ) ;
    public final EObject ruleruleHTTP_URL() throws RecognitionException {
        EObject current = null;

        Token lv_remoteURL_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2558:6: ( ( () ( (lv_remoteURL_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )? ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2559:1: ( () ( (lv_remoteURL_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )? )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2559:1: ( () ( (lv_remoteURL_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )? )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2559:2: () ( (lv_remoteURL_1_0= RULE_STRING ) ) ( '<<' ( ( RULE_STRING ) )* '>>' )?
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2559:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2560:5: 
            {
             
                    temp=factory.create(grammarAccess.getRuleHTTP_URLAccess().getRuleHTTP_URLAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRuleHTTP_URLAccess().getRuleHTTP_URLAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2570:2: ( (lv_remoteURL_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2571:1: (lv_remoteURL_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2571:1: (lv_remoteURL_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2572:3: lv_remoteURL_1_0= RULE_STRING
            {
            lv_remoteURL_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP_URL4417); 

            			createLeafNode(grammarAccess.getRuleHTTP_URLAccess().getRemoteURLSTRINGTerminalRuleCall_1_0(), "remoteURL"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRuleHTTP_URLRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"remoteURL",
            	        		lv_remoteURL_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2594:2: ( '<<' ( ( RULE_STRING ) )* '>>' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2594:4: '<<' ( ( RULE_STRING ) )* '>>'
                    {
                    match(input,46,FOLLOW_46_in_ruleruleHTTP_URL4433); 

                            createLeafNode(grammarAccess.getRuleHTTP_URLAccess().getLessThanSignLessThanSignKeyword_2_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2598:1: ( ( RULE_STRING ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_STRING) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2599:1: ( RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2599:1: ( RULE_STRING )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2600:3: RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRuleHTTP_URLRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP_URL4451); 

                    	    		createLeafNode(grammarAccess.getRuleHTTP_URLAccess().getScriptparamsScriptParamCrossReference_2_1_0(), "scriptparams"); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    match(input,47,FOLLOW_47_in_ruleruleHTTP_URL4462); 

                            createLeafNode(grammarAccess.getRuleHTTP_URLAccess().getGreaterThanSignGreaterThanSignKeyword_2_2(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleruleHTTP_URL


    // $ANTLR start entryRuleruleXMLRPC
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2624:1: entryRuleruleXMLRPC returns [EObject current=null] : iv_ruleruleXMLRPC= ruleruleXMLRPC EOF ;
    public final EObject entryRuleruleXMLRPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleXMLRPC = null;


        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2625:2: (iv_ruleruleXMLRPC= ruleruleXMLRPC EOF )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2626:2: iv_ruleruleXMLRPC= ruleruleXMLRPC EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRuleXMLRPCRule(), currentNode); 
            pushFollow(FOLLOW_ruleruleXMLRPC_in_entryRuleruleXMLRPC4500);
            iv_ruleruleXMLRPC=ruleruleXMLRPC();
            _fsp--;

             current =iv_ruleruleXMLRPC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleXMLRPC4510); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleruleXMLRPC


    // $ANTLR start ruleruleXMLRPC
    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2633:1: ruleruleXMLRPC returns [EObject current=null] : ( () 'XML-RPC' '{' 'ServerURL' '=' ( ( RULE_ID ) ) ';' ( 'HttpBasicAuth' '{' 'BasicAuthUsername' '=' ( ( RULE_ID ) ) ';' 'BasicAuthPassword' '=' ( ( RULE_ID ) ) ';' '}' )? 'RPCMethod' '=' ( ( RULE_ID ) ) ';' ( 'parameters' '=' ( ( RULE_STRING ) )* )? '}' ) ;
    public final EObject ruleruleXMLRPC() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2638:6: ( ( () 'XML-RPC' '{' 'ServerURL' '=' ( ( RULE_ID ) ) ';' ( 'HttpBasicAuth' '{' 'BasicAuthUsername' '=' ( ( RULE_ID ) ) ';' 'BasicAuthPassword' '=' ( ( RULE_ID ) ) ';' '}' )? 'RPCMethod' '=' ( ( RULE_ID ) ) ';' ( 'parameters' '=' ( ( RULE_STRING ) )* )? '}' ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2639:1: ( () 'XML-RPC' '{' 'ServerURL' '=' ( ( RULE_ID ) ) ';' ( 'HttpBasicAuth' '{' 'BasicAuthUsername' '=' ( ( RULE_ID ) ) ';' 'BasicAuthPassword' '=' ( ( RULE_ID ) ) ';' '}' )? 'RPCMethod' '=' ( ( RULE_ID ) ) ';' ( 'parameters' '=' ( ( RULE_STRING ) )* )? '}' )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2639:1: ( () 'XML-RPC' '{' 'ServerURL' '=' ( ( RULE_ID ) ) ';' ( 'HttpBasicAuth' '{' 'BasicAuthUsername' '=' ( ( RULE_ID ) ) ';' 'BasicAuthPassword' '=' ( ( RULE_ID ) ) ';' '}' )? 'RPCMethod' '=' ( ( RULE_ID ) ) ';' ( 'parameters' '=' ( ( RULE_STRING ) )* )? '}' )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2639:2: () 'XML-RPC' '{' 'ServerURL' '=' ( ( RULE_ID ) ) ';' ( 'HttpBasicAuth' '{' 'BasicAuthUsername' '=' ( ( RULE_ID ) ) ';' 'BasicAuthPassword' '=' ( ( RULE_ID ) ) ';' '}' )? 'RPCMethod' '=' ( ( RULE_ID ) ) ';' ( 'parameters' '=' ( ( RULE_STRING ) )* )? '}'
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2639:2: ()
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2640:5: 
            {
             
                    temp=factory.create(grammarAccess.getRuleXMLRPCAccess().getRuleXMLRPCAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRuleXMLRPCAccess().getRuleXMLRPCAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,59,FOLLOW_59_in_ruleruleXMLRPC4554); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getXMLRPCKeyword_1(), null); 
                
            match(input,15,FOLLOW_15_in_ruleruleXMLRPC4564); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            match(input,60,FOLLOW_60_in_ruleruleXMLRPC4574); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getServerURLKeyword_3(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleXMLRPC4584); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_4(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2666:1: ( ( RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2667:1: ( RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2667:1: ( RULE_ID )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2668:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRuleXMLRPCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleXMLRPC4602); 

            		createLeafNode(grammarAccess.getRuleXMLRPCAccess().getRemoteMachineBindingParamCrossReference_5_0(), "remoteMachine"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleruleXMLRPC4612); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getSemicolonKeyword_6(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2684:1: ( 'HttpBasicAuth' '{' 'BasicAuthUsername' '=' ( ( RULE_ID ) ) ';' 'BasicAuthPassword' '=' ( ( RULE_ID ) ) ';' '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==61) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2684:3: 'HttpBasicAuth' '{' 'BasicAuthUsername' '=' ( ( RULE_ID ) ) ';' 'BasicAuthPassword' '=' ( ( RULE_ID ) ) ';' '}'
                    {
                    match(input,61,FOLLOW_61_in_ruleruleXMLRPC4623); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getHttpBasicAuthKeyword_7_0(), null); 
                        
                    match(input,15,FOLLOW_15_in_ruleruleXMLRPC4633); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                        
                    match(input,62,FOLLOW_62_in_ruleruleXMLRPC4643); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getBasicAuthUsernameKeyword_7_2(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleruleXMLRPC4653); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_7_3(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2700:1: ( ( RULE_ID ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2701:1: ( RULE_ID )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2701:1: ( RULE_ID )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2702:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleXMLRPCRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleXMLRPC4671); 

                    		createLeafNode(grammarAccess.getRuleXMLRPCAccess().getUsernameBindingParamCrossReference_7_4_0(), "username"); 
                    	

                    }


                    }

                    match(input,25,FOLLOW_25_in_ruleruleXMLRPC4681); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getSemicolonKeyword_7_5(), null); 
                        
                    match(input,63,FOLLOW_63_in_ruleruleXMLRPC4691); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getBasicAuthPasswordKeyword_7_6(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleruleXMLRPC4701); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_7_7(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2726:1: ( ( RULE_ID ) )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2727:1: ( RULE_ID )
                    {
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2727:1: ( RULE_ID )
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2728:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getRuleXMLRPCRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleXMLRPC4719); 

                    		createLeafNode(grammarAccess.getRuleXMLRPCAccess().getPasswordBindingParamCrossReference_7_8_0(), "password"); 
                    	

                    }


                    }

                    match(input,25,FOLLOW_25_in_ruleruleXMLRPC4729); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getSemicolonKeyword_7_9(), null); 
                        
                    match(input,16,FOLLOW_16_in_ruleruleXMLRPC4739); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getRightCurlyBracketKeyword_7_10(), null); 
                        

                    }
                    break;

            }

            match(input,64,FOLLOW_64_in_ruleruleXMLRPC4751); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getRPCMethodKeyword_8(), null); 
                
            match(input,22,FOLLOW_22_in_ruleruleXMLRPC4761); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_9(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2756:1: ( ( RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2757:1: ( RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2757:1: ( RULE_ID )
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2758:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRuleXMLRPCRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleXMLRPC4779); 

            		createLeafNode(grammarAccess.getRuleXMLRPCAccess().getRPCMethodBindingParamCrossReference_10_0(), "RPCMethod"); 
            	

            }


            }

            match(input,25,FOLLOW_25_in_ruleruleXMLRPC4789); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getSemicolonKeyword_11(), null); 
                
            // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2774:1: ( 'parameters' '=' ( ( RULE_STRING ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==65) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2774:3: 'parameters' '=' ( ( RULE_STRING ) )*
                    {
                    match(input,65,FOLLOW_65_in_ruleruleXMLRPC4800); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getParametersKeyword_12_0(), null); 
                        
                    match(input,22,FOLLOW_22_in_ruleruleXMLRPC4810); 

                            createLeafNode(grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_12_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2782:1: ( ( RULE_STRING ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==RULE_STRING) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2783:1: ( RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2783:1: ( RULE_STRING )
                    	    // ../gr.upatras.ece.wcl.radl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalRadl.g:2784:3: RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRuleXMLRPCRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleXMLRPC4828); 

                    	    		createLeafNode(grammarAccess.getRuleXMLRPCAccess().getURLparamsConfigurationParamCrossReference_12_2_0(), "URLparams"); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleruleXMLRPC4841); 

                    createLeafNode(grammarAccess.getRuleXMLRPCAccess().getRightCurlyBracketKeyword_13(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleruleXMLRPC


 

    public static final BitSet FOLLOW_ruleRADL_in_entryRuleRADL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRADL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleRADL131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleResourceAdapter_in_ruleRADL153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAdapter_in_entryRuleResourceAdapter292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAdapter302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleResourceAdapter337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAdapter354 = new BitSet(new long[]{0x00000000001E6002L});
    public static final BitSet FOLLOW_13_in_ruleResourceAdapter370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAdapter388 = new BitSet(new long[]{0x00000000001E4002L});
    public static final BitSet FOLLOW_14_in_ruleResourceAdapter401 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResourceAdapter411 = new BitSet(new long[]{0x00000001F0010030L});
    public static final BitSet FOLLOW_ruleConfigurationParam_in_ruleResourceAdapter432 = new BitSet(new long[]{0x00000001F0010030L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter443 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_17_in_ruleResourceAdapter456 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResourceAdapter466 = new BitSet(new long[]{0x00000001F0010030L});
    public static final BitSet FOLLOW_ruleBindingParam_in_ruleResourceAdapter487 = new BitSet(new long[]{0x00000001F0010030L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter498 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_18_in_ruleResourceAdapter511 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResourceAdapter521 = new BitSet(new long[]{0x00000001F0010030L});
    public static final BitSet FOLLOW_ruleSupportedChildType_in_ruleResourceAdapter542 = new BitSet(new long[]{0x00000001F0010030L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter553 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_19_in_ruleResourceAdapter566 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResourceAdapter576 = new BitSet(new long[]{0x00000001F0010030L});
    public static final BitSet FOLLOW_ruleAllowedType_in_ruleResourceAdapter597 = new BitSet(new long[]{0x00000001F0010030L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter608 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleResourceAdapter621 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResourceAdapter631 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResourceAdapter641 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleResourceAdapter651 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleResourceAdapter671 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24_in_ruleResourceAdapter700 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleResourceAdapter726 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResourceAdapter736 = new BitSet(new long[]{0x0801010200000000L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleResourceAdapter757 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationParam_in_entryRuleConfigurationParam805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationParam815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleConfigurationParam870 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationParam890 = new BitSet(new long[]{0x000000000A402000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationParam910 = new BitSet(new long[]{0x000000000A402000L});
    public static final BitSet FOLLOW_22_in_ruleConfigurationParam929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationParam946 = new BitSet(new long[]{0x000000000A002000L});
    public static final BitSet FOLLOW_13_in_ruleConfigurationParam964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationParam982 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_27_in_ruleConfigurationParam995 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleConfigurationParam1005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationParam1022 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConfigurationParam1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingParam_in_entryRuleBindingParam1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingParam1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleBindingParam1140 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingParam1160 = new BitSet(new long[]{0x000000000A400000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBindingParam1180 = new BitSet(new long[]{0x000000000A400000L});
    public static final BitSet FOLLOW_22_in_ruleBindingParam1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBindingParam1216 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_27_in_ruleBindingParam1234 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBindingParam1244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBindingParam1261 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBindingParam1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedChildType_in_entryRuleSupportedChildType1314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupportedChildType1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleSupportedChildType1379 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSupportedChildType1399 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSupportedChildType1419 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleSupportedChildType1438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSupportedChildType1455 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSupportedChildType1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowedType_in_entryRuleAllowedType1508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowedType1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleAllowedType1573 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAllowedType1593 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllowedType1613 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleAllowedType1632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllowedType1649 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAllowedType1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol1702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleSSH_in_ruleProtocol1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleHTTP_in_ruleProtocol1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleXMLRPC_in_ruleProtocol1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleJavaWrapper_in_ruleProtocol1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleParameterType1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleParameterType1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleParameterType1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleParameterType2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParameterType2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleSSH_in_entryRuleruleSSH2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleSSH2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleruleSSH2161 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleruleSSH2171 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleruleSSH2181 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleSSH2191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleSSH2209 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleSSH2219 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleruleSSH2229 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleSSH2239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleSSH2257 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleSSH2267 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleruleSSH2277 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleSSH2287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleSSH2305 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleSSH2315 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleruleSSH2325 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleSSH2335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleSSH2353 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleSSH2363 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleruleSSH2373 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleruleSSH2383 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rulerulSSH_commands_in_ruleruleSSH2404 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleruleSSH2415 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleruleSSH2425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleruleSSH2435 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rulerulSSH_commands_in_ruleruleSSH2456 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleruleSSH2467 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleSSH2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleJavaWrapper_in_entryRuleruleJavaWrapper2513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleJavaWrapper2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleruleJavaWrapper2567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleJavaWrapper2584 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleruleJavaWrapper2599 = new BitSet(new long[]{0x0000080000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleruleJavaWrapper2621 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleruleJavaWrapper2632 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleruleJavaWrapper2653 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_ruleruleJavaWrapper2667 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleruleJavaWrapper2677 = new BitSet(new long[]{0x0000300000010000L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleruleJavaWrapper2698 = new BitSet(new long[]{0x0000300000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleJavaWrapper2709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand2745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentryCommand_in_ruleCommand2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignCommand_in_ruleCommand2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentryCommand_in_entryRuleentryCommand2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentryCommand2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleentryCommand2909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleentryCommand2926 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleentryCommand2941 = new BitSet(new long[]{0x0000080000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleentryCommand2963 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleentryCommand2974 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleentryCommand2995 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_ruleentryCommand3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_param_in_entryRulerulJava_param3045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulJava_param3055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paramString_in_rulerulJava_param3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paramInt_in_rulerulJava_param3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paraScript_in_rulerulJava_param3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paramString_in_entryRulerulJava_paramString3191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulJava_paramString3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulerulJava_paramString3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paramInt_in_entryRulerulJava_paramInt3282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulJava_paramInt3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulerulJava_paramInt3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paraScript_in_entryRulerulJava_paraScript3373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulJava_paraScript3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulerulJava_paraScript3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignCommand_in_entryRuleassignCommand3460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignCommand3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleassignCommand3514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleassignCommand3532 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleassignCommand3542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleassignCommand3559 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleassignCommand3574 = new BitSet(new long[]{0x0000080000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleassignCommand3596 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleassignCommand3607 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleassignCommand3628 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43_in_ruleassignCommand3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulSSH_commands_in_entryRulerulSSH_commands3680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulSSH_commands3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulerulSSH_commands3741 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_rulerulSSH_commands3757 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulerulSSH_commands3775 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_47_in_rulerulSSH_commands3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleHTTP_in_entryRuleruleHTTP3824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleHTTP3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleruleHTTP3878 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleruleHTTP3888 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleruleHTTP3898 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleHTTP3908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP3926 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleHTTP3936 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleruleHTTP3946 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleHTTP3956 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleruleHTTP_URL_in_ruleruleHTTP3977 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleruleHTTP3988 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleruleHTTP3998 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleHTTP4008 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_ruleruleHTTP4028 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_53_in_ruleruleHTTP4057 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleHTTP4083 = new BitSet(new long[]{0x0440000000000000L});
    public static final BitSet FOLLOW_54_in_ruleruleHTTP4094 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleruleHTTP4104 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleruleHTTP4114 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleHTTP4124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4142 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleHTTP4152 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleruleHTTP4162 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleHTTP4172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4190 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleHTTP4200 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleruleHTTP4210 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleHTTP4220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4238 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleHTTP4248 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleHTTP4258 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleruleHTTP4271 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleHTTP4281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4299 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleHTTP4309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleHTTP4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleHTTP_URL_in_entryRuleruleHTTP_URL4356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleHTTP_URL4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP_URL4417 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleruleHTTP_URL4433 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP_URL4451 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_47_in_ruleruleHTTP_URL4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleXMLRPC_in_entryRuleruleXMLRPC4500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleXMLRPC4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleruleXMLRPC4554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleruleXMLRPC4564 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleruleXMLRPC4574 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleXMLRPC4584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleXMLRPC4602 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleXMLRPC4612 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_61_in_ruleruleXMLRPC4623 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleruleXMLRPC4633 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_ruleruleXMLRPC4643 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleXMLRPC4653 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleXMLRPC4671 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleXMLRPC4681 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleruleXMLRPC4691 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleXMLRPC4701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleXMLRPC4719 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleXMLRPC4729 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleXMLRPC4739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleruleXMLRPC4751 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleXMLRPC4761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleXMLRPC4779 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleruleXMLRPC4789 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleruleXMLRPC4800 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleruleXMLRPC4810 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleXMLRPC4828 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleruleXMLRPC4841 = new BitSet(new long[]{0x0000000000000002L});

}