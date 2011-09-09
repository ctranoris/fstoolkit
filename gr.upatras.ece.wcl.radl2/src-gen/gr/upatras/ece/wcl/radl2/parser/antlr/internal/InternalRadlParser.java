package gr.upatras.ece.wcl.radl2.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gr.upatras.ece.wcl.radl2.services.RadlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRadlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import service'", "'Resource Adapter'", "'implements'", "'by office'", "'Configuration Parameters'", "'{'", "'}'", "'Binding Parameters'", "'Supported Child Types'", "'Allowed Types'", "'On Update'", "'ProcessOnAllConfigurationParametersComplete'", "'='", "'YES'", "'NO'", "';'", "'RAProtocol'", "'description'", "'String'", "'Integer'", "'Boolean'", "'Enum'", "'REFERENCE'", "'SSH'", "'Remote Machine'", "'RPort'", "'RUsername'", "'RPassword'", "'RExecute'", "'RExecuteDelete'", "'Java'", "'('", "','", "')'", "'JExecute'", "'JAssign'", "'<<'", "'>>'", "'HTTP'", "'RemoteMachine'", "'HttpURL'", "'HttpMethod'", "'GET'", "'POST'", "'HttpAuth'", "'Method'", "'AuthUsername'", "'AuthPassword'", "'PostBody'", "'XML-RPC'", "'ServerURL'", "'HttpBasicAuth'", "'BasicAuthUsername'", "'BasicAuthPassword'", "'RPCMethod'", "'parameters'"
    };
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRadlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRadlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRadlParser.tokenNames; }
    public String getGrammarFileName() { return "../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g"; }



     	private RadlGrammarAccess grammarAccess;
     	
        public InternalRadlParser(TokenStream input, RadlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RADL";	
       	}
       	
       	@Override
       	protected RadlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRADL"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:67:1: entryRuleRADL returns [EObject current=null] : iv_ruleRADL= ruleRADL EOF ;
    public final EObject entryRuleRADL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRADL = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:68:2: (iv_ruleRADL= ruleRADL EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:69:2: iv_ruleRADL= ruleRADL EOF
            {
             newCompositeNode(grammarAccess.getRADLRule()); 
            pushFollow(FOLLOW_ruleRADL_in_entryRuleRADL75);
            iv_ruleRADL=ruleRADL();

            state._fsp--;

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
    // $ANTLR end "entryRuleRADL"


    // $ANTLR start "ruleRADL"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:76:1: ruleRADL returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) ) ) ;
    public final EObject ruleRADL() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_resourceAdapter_1_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:79:28: ( ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:80:1: ( ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:80:2: ( (lv_imports_0_0= ruleImport ) )? ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:80:2: ( (lv_imports_0_0= ruleImport ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:81:1: (lv_imports_0_0= ruleImport )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:81:1: (lv_imports_0_0= ruleImport )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:82:3: lv_imports_0_0= ruleImport
                    {
                     
                    	        newCompositeNode(grammarAccess.getRADLAccess().getImportsImportParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImport_in_ruleRADL131);
                    lv_imports_0_0=ruleImport();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRADLRule());
                    	        }
                           		set(
                           			current, 
                           			"imports",
                            		lv_imports_0_0, 
                            		"Import");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:98:3: ( (lv_resourceAdapter_1_0= ruleResourceAdapter ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:99:1: (lv_resourceAdapter_1_0= ruleResourceAdapter )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:99:1: (lv_resourceAdapter_1_0= ruleResourceAdapter )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:100:3: lv_resourceAdapter_1_0= ruleResourceAdapter
            {
             
            	        newCompositeNode(grammarAccess.getRADLAccess().getResourceAdapterResourceAdapterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleResourceAdapter_in_ruleRADL153);
            lv_resourceAdapter_1_0=ruleResourceAdapter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRADLRule());
            	        }
                   		set(
                   			current, 
                   			"resourceAdapter",
                    		lv_resourceAdapter_1_0, 
                    		"ResourceAdapter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRADL"


    // $ANTLR start "entryRuleImport"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:124:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:125:2: (iv_ruleImport= ruleImport EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:126:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport189);
            iv_ruleImport=ruleImport();

            state._fsp--;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:133:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import service' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:136:28: ( (otherlv_0= 'import service' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:137:1: (otherlv_0= 'import service' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:137:1: (otherlv_0= 'import service' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:137:3: otherlv_0= 'import service' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport236); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportServiceKeyword_0());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:141:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:142:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:142:1: (lv_importURI_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:143:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport253); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleResourceAdapter"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:167:1: entryRuleResourceAdapter returns [EObject current=null] : iv_ruleResourceAdapter= ruleResourceAdapter EOF ;
    public final EObject entryRuleResourceAdapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceAdapter = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:168:2: (iv_ruleResourceAdapter= ruleResourceAdapter EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:169:2: iv_ruleResourceAdapter= ruleResourceAdapter EOF
            {
             newCompositeNode(grammarAccess.getResourceAdapterRule()); 
            pushFollow(FOLLOW_ruleResourceAdapter_in_entryRuleResourceAdapter294);
            iv_ruleResourceAdapter=ruleResourceAdapter();

            state._fsp--;

             current =iv_ruleResourceAdapter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceAdapter304); 

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
    // $ANTLR end "entryRuleResourceAdapter"


    // $ANTLR start "ruleResourceAdapter"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:176:1: ruleResourceAdapter returns [EObject current=null] : (otherlv_0= 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'by office' ( (otherlv_5= RULE_STRING ) ) )? (otherlv_6= 'Configuration Parameters' otherlv_7= '{' ( (lv_confParams_8_0= ruleConfigurationParam ) )* otherlv_9= '}' )? (otherlv_10= 'Binding Parameters' otherlv_11= '{' ( (lv_bindParams_12_0= ruleBindingParam ) )* otherlv_13= '}' )? (otherlv_14= 'Supported Child Types' otherlv_15= '{' ( (lv_childParams_16_0= ruleSupportedChildType ) )* otherlv_17= '}' )? (otherlv_18= 'Allowed Types' otherlv_19= '{' ( (lv_allowParams_20_0= ruleAllowedType ) )* otherlv_21= '}' )? (otherlv_22= 'On Update' otherlv_23= '{' otherlv_24= 'ProcessOnAllConfigurationParametersComplete' otherlv_25= '=' ( ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) ) ) otherlv_27= ';' otherlv_28= 'RAProtocol' ( (lv_protocol_29_0= ruleProtocol ) ) otherlv_30= '}' )? ) ;
    public final EObject ruleResourceAdapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_ConfComplete_26_1=null;
        Token lv_ConfComplete_26_2=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        EObject lv_confParams_8_0 = null;

        EObject lv_bindParams_12_0 = null;

        EObject lv_childParams_16_0 = null;

        EObject lv_allowParams_20_0 = null;

        EObject lv_protocol_29_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:179:28: ( (otherlv_0= 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'by office' ( (otherlv_5= RULE_STRING ) ) )? (otherlv_6= 'Configuration Parameters' otherlv_7= '{' ( (lv_confParams_8_0= ruleConfigurationParam ) )* otherlv_9= '}' )? (otherlv_10= 'Binding Parameters' otherlv_11= '{' ( (lv_bindParams_12_0= ruleBindingParam ) )* otherlv_13= '}' )? (otherlv_14= 'Supported Child Types' otherlv_15= '{' ( (lv_childParams_16_0= ruleSupportedChildType ) )* otherlv_17= '}' )? (otherlv_18= 'Allowed Types' otherlv_19= '{' ( (lv_allowParams_20_0= ruleAllowedType ) )* otherlv_21= '}' )? (otherlv_22= 'On Update' otherlv_23= '{' otherlv_24= 'ProcessOnAllConfigurationParametersComplete' otherlv_25= '=' ( ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) ) ) otherlv_27= ';' otherlv_28= 'RAProtocol' ( (lv_protocol_29_0= ruleProtocol ) ) otherlv_30= '}' )? ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:180:1: (otherlv_0= 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'by office' ( (otherlv_5= RULE_STRING ) ) )? (otherlv_6= 'Configuration Parameters' otherlv_7= '{' ( (lv_confParams_8_0= ruleConfigurationParam ) )* otherlv_9= '}' )? (otherlv_10= 'Binding Parameters' otherlv_11= '{' ( (lv_bindParams_12_0= ruleBindingParam ) )* otherlv_13= '}' )? (otherlv_14= 'Supported Child Types' otherlv_15= '{' ( (lv_childParams_16_0= ruleSupportedChildType ) )* otherlv_17= '}' )? (otherlv_18= 'Allowed Types' otherlv_19= '{' ( (lv_allowParams_20_0= ruleAllowedType ) )* otherlv_21= '}' )? (otherlv_22= 'On Update' otherlv_23= '{' otherlv_24= 'ProcessOnAllConfigurationParametersComplete' otherlv_25= '=' ( ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) ) ) otherlv_27= ';' otherlv_28= 'RAProtocol' ( (lv_protocol_29_0= ruleProtocol ) ) otherlv_30= '}' )? )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:180:1: (otherlv_0= 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'by office' ( (otherlv_5= RULE_STRING ) ) )? (otherlv_6= 'Configuration Parameters' otherlv_7= '{' ( (lv_confParams_8_0= ruleConfigurationParam ) )* otherlv_9= '}' )? (otherlv_10= 'Binding Parameters' otherlv_11= '{' ( (lv_bindParams_12_0= ruleBindingParam ) )* otherlv_13= '}' )? (otherlv_14= 'Supported Child Types' otherlv_15= '{' ( (lv_childParams_16_0= ruleSupportedChildType ) )* otherlv_17= '}' )? (otherlv_18= 'Allowed Types' otherlv_19= '{' ( (lv_allowParams_20_0= ruleAllowedType ) )* otherlv_21= '}' )? (otherlv_22= 'On Update' otherlv_23= '{' otherlv_24= 'ProcessOnAllConfigurationParametersComplete' otherlv_25= '=' ( ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) ) ) otherlv_27= ';' otherlv_28= 'RAProtocol' ( (lv_protocol_29_0= ruleProtocol ) ) otherlv_30= '}' )? )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:180:3: otherlv_0= 'Resource Adapter' ( (lv_name_1_0= RULE_STRING ) ) (otherlv_2= 'implements' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'by office' ( (otherlv_5= RULE_STRING ) ) )? (otherlv_6= 'Configuration Parameters' otherlv_7= '{' ( (lv_confParams_8_0= ruleConfigurationParam ) )* otherlv_9= '}' )? (otherlv_10= 'Binding Parameters' otherlv_11= '{' ( (lv_bindParams_12_0= ruleBindingParam ) )* otherlv_13= '}' )? (otherlv_14= 'Supported Child Types' otherlv_15= '{' ( (lv_childParams_16_0= ruleSupportedChildType ) )* otherlv_17= '}' )? (otherlv_18= 'Allowed Types' otherlv_19= '{' ( (lv_allowParams_20_0= ruleAllowedType ) )* otherlv_21= '}' )? (otherlv_22= 'On Update' otherlv_23= '{' otherlv_24= 'ProcessOnAllConfigurationParametersComplete' otherlv_25= '=' ( ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) ) ) otherlv_27= ';' otherlv_28= 'RAProtocol' ( (lv_protocol_29_0= ruleProtocol ) ) otherlv_30= '}' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleResourceAdapter341); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAdapterAccess().getResourceAdapterKeyword_0());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:184:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:185:1: (lv_name_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:185:1: (lv_name_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:186:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAdapter358); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAdapterAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceAdapterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:202:2: (otherlv_2= 'implements' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'by office' ( (otherlv_5= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:202:4: otherlv_2= 'implements' ( (otherlv_3= RULE_STRING ) ) otherlv_4= 'by office' ( (otherlv_5= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleResourceAdapter376); 

                        	newLeafNode(otherlv_2, grammarAccess.getResourceAdapterAccess().getImplementsKeyword_2_0());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:206:1: ( (otherlv_3= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:207:1: (otherlv_3= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:207:1: (otherlv_3= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:208:3: otherlv_3= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceAdapterRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAdapter396); 

                    		newLeafNode(otherlv_3, grammarAccess.getResourceAdapterAccess().getImplnameOfferedServiceCrossReference_2_1_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleResourceAdapter408); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceAdapterAccess().getByOfficeKeyword_2_2());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:223:1: ( (otherlv_5= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:224:1: (otherlv_5= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:224:1: (otherlv_5= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:225:3: otherlv_5= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceAdapterRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceAdapter428); 

                    		newLeafNode(otherlv_5, grammarAccess.getResourceAdapterAccess().getByofficeOfficeCrossReference_2_3_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:236:4: (otherlv_6= 'Configuration Parameters' otherlv_7= '{' ( (lv_confParams_8_0= ruleConfigurationParam ) )* otherlv_9= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:236:6: otherlv_6= 'Configuration Parameters' otherlv_7= '{' ( (lv_confParams_8_0= ruleConfigurationParam ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleResourceAdapter443); 

                        	newLeafNode(otherlv_6, grammarAccess.getResourceAdapterAccess().getConfigurationParametersKeyword_3_0());
                        
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleResourceAdapter455); 

                        	newLeafNode(otherlv_7, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:244:1: ( (lv_confParams_8_0= ruleConfigurationParam ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||(LA3_0>=29 && LA3_0<=33)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:245:1: (lv_confParams_8_0= ruleConfigurationParam )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:245:1: (lv_confParams_8_0= ruleConfigurationParam )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:246:3: lv_confParams_8_0= ruleConfigurationParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAdapterAccess().getConfParamsConfigurationParamParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConfigurationParam_in_ruleResourceAdapter476);
                    	    lv_confParams_8_0=ruleConfigurationParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceAdapterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"confParams",
                    	            		lv_confParams_8_0, 
                    	            		"ConfigurationParam");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleResourceAdapter489); 

                        	newLeafNode(otherlv_9, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:266:3: (otherlv_10= 'Binding Parameters' otherlv_11= '{' ( (lv_bindParams_12_0= ruleBindingParam ) )* otherlv_13= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:266:5: otherlv_10= 'Binding Parameters' otherlv_11= '{' ( (lv_bindParams_12_0= ruleBindingParam ) )* otherlv_13= '}'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleResourceAdapter504); 

                        	newLeafNode(otherlv_10, grammarAccess.getResourceAdapterAccess().getBindingParametersKeyword_4_0());
                        
                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleResourceAdapter516); 

                        	newLeafNode(otherlv_11, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:274:1: ( (lv_bindParams_12_0= ruleBindingParam ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=29 && LA5_0<=33)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:275:1: (lv_bindParams_12_0= ruleBindingParam )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:275:1: (lv_bindParams_12_0= ruleBindingParam )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:276:3: lv_bindParams_12_0= ruleBindingParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAdapterAccess().getBindParamsBindingParamParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBindingParam_in_ruleResourceAdapter537);
                    	    lv_bindParams_12_0=ruleBindingParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceAdapterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"bindParams",
                    	            		lv_bindParams_12_0, 
                    	            		"BindingParam");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleResourceAdapter550); 

                        	newLeafNode(otherlv_13, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:296:3: (otherlv_14= 'Supported Child Types' otherlv_15= '{' ( (lv_childParams_16_0= ruleSupportedChildType ) )* otherlv_17= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:296:5: otherlv_14= 'Supported Child Types' otherlv_15= '{' ( (lv_childParams_16_0= ruleSupportedChildType ) )* otherlv_17= '}'
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleResourceAdapter565); 

                        	newLeafNode(otherlv_14, grammarAccess.getResourceAdapterAccess().getSupportedChildTypesKeyword_5_0());
                        
                    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleResourceAdapter577); 

                        	newLeafNode(otherlv_15, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:304:1: ( (lv_childParams_16_0= ruleSupportedChildType ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||(LA7_0>=29 && LA7_0<=33)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:305:1: (lv_childParams_16_0= ruleSupportedChildType )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:305:1: (lv_childParams_16_0= ruleSupportedChildType )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:306:3: lv_childParams_16_0= ruleSupportedChildType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAdapterAccess().getChildParamsSupportedChildTypeParserRuleCall_5_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSupportedChildType_in_ruleResourceAdapter598);
                    	    lv_childParams_16_0=ruleSupportedChildType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceAdapterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"childParams",
                    	            		lv_childParams_16_0, 
                    	            		"SupportedChildType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleResourceAdapter611); 

                        	newLeafNode(otherlv_17, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:326:3: (otherlv_18= 'Allowed Types' otherlv_19= '{' ( (lv_allowParams_20_0= ruleAllowedType ) )* otherlv_21= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:326:5: otherlv_18= 'Allowed Types' otherlv_19= '{' ( (lv_allowParams_20_0= ruleAllowedType ) )* otherlv_21= '}'
                    {
                    otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleResourceAdapter626); 

                        	newLeafNode(otherlv_18, grammarAccess.getResourceAdapterAccess().getAllowedTypesKeyword_6_0());
                        
                    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleResourceAdapter638); 

                        	newLeafNode(otherlv_19, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:334:1: ( (lv_allowParams_20_0= ruleAllowedType ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||(LA9_0>=29 && LA9_0<=33)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:335:1: (lv_allowParams_20_0= ruleAllowedType )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:335:1: (lv_allowParams_20_0= ruleAllowedType )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:336:3: lv_allowParams_20_0= ruleAllowedType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAdapterAccess().getAllowParamsAllowedTypeParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAllowedType_in_ruleResourceAdapter659);
                    	    lv_allowParams_20_0=ruleAllowedType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceAdapterRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"allowParams",
                    	            		lv_allowParams_20_0, 
                    	            		"AllowedType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleResourceAdapter672); 

                        	newLeafNode(otherlv_21, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:356:3: (otherlv_22= 'On Update' otherlv_23= '{' otherlv_24= 'ProcessOnAllConfigurationParametersComplete' otherlv_25= '=' ( ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) ) ) otherlv_27= ';' otherlv_28= 'RAProtocol' ( (lv_protocol_29_0= ruleProtocol ) ) otherlv_30= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:356:5: otherlv_22= 'On Update' otherlv_23= '{' otherlv_24= 'ProcessOnAllConfigurationParametersComplete' otherlv_25= '=' ( ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) ) ) otherlv_27= ';' otherlv_28= 'RAProtocol' ( (lv_protocol_29_0= ruleProtocol ) ) otherlv_30= '}'
                    {
                    otherlv_22=(Token)match(input,21,FOLLOW_21_in_ruleResourceAdapter687); 

                        	newLeafNode(otherlv_22, grammarAccess.getResourceAdapterAccess().getOnUpdateKeyword_7_0());
                        
                    otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleResourceAdapter699); 

                        	newLeafNode(otherlv_23, grammarAccess.getResourceAdapterAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    otherlv_24=(Token)match(input,22,FOLLOW_22_in_ruleResourceAdapter711); 

                        	newLeafNode(otherlv_24, grammarAccess.getResourceAdapterAccess().getProcessOnAllConfigurationParametersCompleteKeyword_7_2());
                        
                    otherlv_25=(Token)match(input,23,FOLLOW_23_in_ruleResourceAdapter723); 

                        	newLeafNode(otherlv_25, grammarAccess.getResourceAdapterAccess().getEqualsSignKeyword_7_3());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:372:1: ( ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:373:1: ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:373:1: ( (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:374:1: (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:374:1: (lv_ConfComplete_26_1= 'YES' | lv_ConfComplete_26_2= 'NO' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==25) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:375:3: lv_ConfComplete_26_1= 'YES'
                            {
                            lv_ConfComplete_26_1=(Token)match(input,24,FOLLOW_24_in_ruleResourceAdapter743); 

                                    newLeafNode(lv_ConfComplete_26_1, grammarAccess.getResourceAdapterAccess().getConfCompleteYESKeyword_7_4_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getResourceAdapterRule());
                            	        }
                                   		setWithLastConsumed(current, "ConfComplete", lv_ConfComplete_26_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:387:8: lv_ConfComplete_26_2= 'NO'
                            {
                            lv_ConfComplete_26_2=(Token)match(input,25,FOLLOW_25_in_ruleResourceAdapter772); 

                                    newLeafNode(lv_ConfComplete_26_2, grammarAccess.getResourceAdapterAccess().getConfCompleteNOKeyword_7_4_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getResourceAdapterRule());
                            	        }
                                   		setWithLastConsumed(current, "ConfComplete", lv_ConfComplete_26_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_27=(Token)match(input,26,FOLLOW_26_in_ruleResourceAdapter800); 

                        	newLeafNode(otherlv_27, grammarAccess.getResourceAdapterAccess().getSemicolonKeyword_7_5());
                        
                    otherlv_28=(Token)match(input,27,FOLLOW_27_in_ruleResourceAdapter812); 

                        	newLeafNode(otherlv_28, grammarAccess.getResourceAdapterAccess().getRAProtocolKeyword_7_6());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:410:1: ( (lv_protocol_29_0= ruleProtocol ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:411:1: (lv_protocol_29_0= ruleProtocol )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:411:1: (lv_protocol_29_0= ruleProtocol )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:412:3: lv_protocol_29_0= ruleProtocol
                    {
                     
                    	        newCompositeNode(grammarAccess.getResourceAdapterAccess().getProtocolProtocolParserRuleCall_7_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProtocol_in_ruleResourceAdapter833);
                    lv_protocol_29_0=ruleProtocol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResourceAdapterRule());
                    	        }
                           		set(
                           			current, 
                           			"protocol",
                            		lv_protocol_29_0, 
                            		"Protocol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_30=(Token)match(input,17,FOLLOW_17_in_ruleResourceAdapter845); 

                        	newLeafNode(otherlv_30, grammarAccess.getResourceAdapterAccess().getRightCurlyBracketKeyword_7_8());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResourceAdapter"


    // $ANTLR start "entryRuleConfigurationParam"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:440:1: entryRuleConfigurationParam returns [EObject current=null] : iv_ruleConfigurationParam= ruleConfigurationParam EOF ;
    public final EObject entryRuleConfigurationParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationParam = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:441:2: (iv_ruleConfigurationParam= ruleConfigurationParam EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:442:2: iv_ruleConfigurationParam= ruleConfigurationParam EOF
            {
             newCompositeNode(grammarAccess.getConfigurationParamRule()); 
            pushFollow(FOLLOW_ruleConfigurationParam_in_entryRuleConfigurationParam883);
            iv_ruleConfigurationParam=ruleConfigurationParam();

            state._fsp--;

             current =iv_ruleConfigurationParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConfigurationParam893); 

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
    // $ANTLR end "entryRuleConfigurationParam"


    // $ANTLR start "ruleConfigurationParam"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:449:1: ruleConfigurationParam returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleConfigurationParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token lv_defValue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_descriptionValue_7_0=null;
        Token otherlv_8=null;
        EObject lv_paramType_1_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:452:28: ( ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:453:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:453:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:453:2: () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:453:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:454:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConfigurationParamAccess().getConfigurationParamAction_0(),
                        current);
                

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:459:2: ( (lv_paramType_1_0= ruleParameterType ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=29 && LA13_0<=33)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:460:1: (lv_paramType_1_0= ruleParameterType )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:460:1: (lv_paramType_1_0= ruleParameterType )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:461:3: lv_paramType_1_0= ruleParameterType
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationParamAccess().getParamTypeParameterTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleConfigurationParam948);
                    lv_paramType_1_0=ruleParameterType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationParamRule());
                    	        }
                           		set(
                           			current, 
                           			"paramType",
                            		lv_paramType_1_0, 
                            		"ParameterType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:477:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:478:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:478:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:479:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:479:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
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
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:480:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConfigurationParam968); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getConfigurationParamAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigurationParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:495:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationParam988); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getConfigurationParamAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigurationParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:513:2: (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:513:4: otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleConfigurationParam1009); 

                        	newLeafNode(otherlv_3, grammarAccess.getConfigurationParamAccess().getEqualsSignKeyword_3_0());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:517:1: ( (lv_defValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:518:1: (lv_defValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:518:1: (lv_defValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:519:3: lv_defValue_4_0= RULE_STRING
                    {
                    lv_defValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationParam1026); 

                    			newLeafNode(lv_defValue_4_0, grammarAccess.getConfigurationParamAccess().getDefValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigurationParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defValue",
                            		lv_defValue_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:535:4: (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:535:6: otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleConfigurationParam1046); 

                        	newLeafNode(otherlv_5, grammarAccess.getConfigurationParamAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleConfigurationParam1058); 

                        	newLeafNode(otherlv_6, grammarAccess.getConfigurationParamAccess().getEqualsSignKeyword_4_1());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:543:1: ( (lv_descriptionValue_7_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:544:1: (lv_descriptionValue_7_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:544:1: (lv_descriptionValue_7_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:545:3: lv_descriptionValue_7_0= RULE_STRING
                    {
                    lv_descriptionValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConfigurationParam1075); 

                    			newLeafNode(lv_descriptionValue_7_0, grammarAccess.getConfigurationParamAccess().getDescriptionValueSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigurationParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"descriptionValue",
                            		lv_descriptionValue_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleConfigurationParam1094); 

                	newLeafNode(otherlv_8, grammarAccess.getConfigurationParamAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationParam"


    // $ANTLR start "entryRuleBindingParam"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:573:1: entryRuleBindingParam returns [EObject current=null] : iv_ruleBindingParam= ruleBindingParam EOF ;
    public final EObject entryRuleBindingParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingParam = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:574:2: (iv_ruleBindingParam= ruleBindingParam EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:575:2: iv_ruleBindingParam= ruleBindingParam EOF
            {
             newCompositeNode(grammarAccess.getBindingParamRule()); 
            pushFollow(FOLLOW_ruleBindingParam_in_entryRuleBindingParam1130);
            iv_ruleBindingParam=ruleBindingParam();

            state._fsp--;

             current =iv_ruleBindingParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingParam1140); 

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
    // $ANTLR end "entryRuleBindingParam"


    // $ANTLR start "ruleBindingParam"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:582:1: ruleBindingParam returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleBindingParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token lv_defValue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_descriptionValue_7_0=null;
        Token otherlv_8=null;
        EObject lv_paramType_1_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:585:28: ( ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:586:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:586:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:586:2: () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )? otherlv_8= ';'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:586:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:587:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBindingParamAccess().getBindingParamAction_0(),
                        current);
                

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:592:2: ( (lv_paramType_1_0= ruleParameterType ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=29 && LA17_0<=33)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:593:1: (lv_paramType_1_0= ruleParameterType )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:593:1: (lv_paramType_1_0= ruleParameterType )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:594:3: lv_paramType_1_0= ruleParameterType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBindingParamAccess().getParamTypeParameterTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleBindingParam1195);
                    lv_paramType_1_0=ruleParameterType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBindingParamRule());
                    	        }
                           		set(
                           			current, 
                           			"paramType",
                            		lv_paramType_1_0, 
                            		"ParameterType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:610:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:611:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:611:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:612:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:612:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:613:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingParam1215); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getBindingParamAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBindingParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:628:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBindingParam1235); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getBindingParamAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBindingParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:646:2: (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==23) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:646:4: otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleBindingParam1256); 

                        	newLeafNode(otherlv_3, grammarAccess.getBindingParamAccess().getEqualsSignKeyword_3_0());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:650:1: ( (lv_defValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:651:1: (lv_defValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:651:1: (lv_defValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:652:3: lv_defValue_4_0= RULE_STRING
                    {
                    lv_defValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBindingParam1273); 

                    			newLeafNode(lv_defValue_4_0, grammarAccess.getBindingParamAccess().getDefValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBindingParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defValue",
                            		lv_defValue_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:668:4: (otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:668:6: otherlv_5= 'description' otherlv_6= '=' ( (lv_descriptionValue_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleBindingParam1293); 

                        	newLeafNode(otherlv_5, grammarAccess.getBindingParamAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleBindingParam1305); 

                        	newLeafNode(otherlv_6, grammarAccess.getBindingParamAccess().getEqualsSignKeyword_4_1());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:676:1: ( (lv_descriptionValue_7_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:677:1: (lv_descriptionValue_7_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:677:1: (lv_descriptionValue_7_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:678:3: lv_descriptionValue_7_0= RULE_STRING
                    {
                    lv_descriptionValue_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBindingParam1322); 

                    			newLeafNode(lv_descriptionValue_7_0, grammarAccess.getBindingParamAccess().getDescriptionValueSTRINGTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBindingParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"descriptionValue",
                            		lv_descriptionValue_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleBindingParam1341); 

                	newLeafNode(otherlv_8, grammarAccess.getBindingParamAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingParam"


    // $ANTLR start "entryRuleSupportedChildType"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:706:1: entryRuleSupportedChildType returns [EObject current=null] : iv_ruleSupportedChildType= ruleSupportedChildType EOF ;
    public final EObject entryRuleSupportedChildType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportedChildType = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:707:2: (iv_ruleSupportedChildType= ruleSupportedChildType EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:708:2: iv_ruleSupportedChildType= ruleSupportedChildType EOF
            {
             newCompositeNode(grammarAccess.getSupportedChildTypeRule()); 
            pushFollow(FOLLOW_ruleSupportedChildType_in_entryRuleSupportedChildType1377);
            iv_ruleSupportedChildType=ruleSupportedChildType();

            state._fsp--;

             current =iv_ruleSupportedChildType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupportedChildType1387); 

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
    // $ANTLR end "entryRuleSupportedChildType"


    // $ANTLR start "ruleSupportedChildType"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:715:1: ruleSupportedChildType returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleSupportedChildType() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token lv_defValue_4_0=null;
        Token otherlv_5=null;
        EObject lv_paramType_1_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:718:28: ( ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:719:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:719:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:719:2: () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:719:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:720:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSupportedChildTypeAccess().getSupportedChildTypeAction_0(),
                        current);
                

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:725:2: ( (lv_paramType_1_0= ruleParameterType ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=29 && LA21_0<=33)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:726:1: (lv_paramType_1_0= ruleParameterType )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:726:1: (lv_paramType_1_0= ruleParameterType )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:727:3: lv_paramType_1_0= ruleParameterType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSupportedChildTypeAccess().getParamTypeParameterTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleSupportedChildType1442);
                    lv_paramType_1_0=ruleParameterType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSupportedChildTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"paramType",
                            		lv_paramType_1_0, 
                            		"ParameterType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:743:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:744:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:744:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:745:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:745:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_STRING) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:746:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSupportedChildType1462); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getSupportedChildTypeAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSupportedChildTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:761:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSupportedChildType1482); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getSupportedChildTypeAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSupportedChildTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:779:2: (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:779:4: otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleSupportedChildType1503); 

                        	newLeafNode(otherlv_3, grammarAccess.getSupportedChildTypeAccess().getEqualsSignKeyword_3_0());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:783:1: ( (lv_defValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:784:1: (lv_defValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:784:1: (lv_defValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:785:3: lv_defValue_4_0= RULE_STRING
                    {
                    lv_defValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSupportedChildType1520); 

                    			newLeafNode(lv_defValue_4_0, grammarAccess.getSupportedChildTypeAccess().getDefValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSupportedChildTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defValue",
                            		lv_defValue_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleSupportedChildType1539); 

                	newLeafNode(otherlv_5, grammarAccess.getSupportedChildTypeAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupportedChildType"


    // $ANTLR start "entryRuleAllowedType"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:813:1: entryRuleAllowedType returns [EObject current=null] : iv_ruleAllowedType= ruleAllowedType EOF ;
    public final EObject entryRuleAllowedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllowedType = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:814:2: (iv_ruleAllowedType= ruleAllowedType EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:815:2: iv_ruleAllowedType= ruleAllowedType EOF
            {
             newCompositeNode(grammarAccess.getAllowedTypeRule()); 
            pushFollow(FOLLOW_ruleAllowedType_in_entryRuleAllowedType1575);
            iv_ruleAllowedType=ruleAllowedType();

            state._fsp--;

             current =iv_ruleAllowedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAllowedType1585); 

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
    // $ANTLR end "entryRuleAllowedType"


    // $ANTLR start "ruleAllowedType"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:822:1: ruleAllowedType returns [EObject current=null] : ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleAllowedType() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token otherlv_3=null;
        Token lv_defValue_4_0=null;
        Token otherlv_5=null;
        EObject lv_paramType_1_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:825:28: ( ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:826:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:826:1: ( () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:826:2: () ( (lv_paramType_1_0= ruleParameterType ) )? ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )? otherlv_5= ';'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:826:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:827:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAllowedTypeAccess().getAllowedTypeAction_0(),
                        current);
                

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:832:2: ( (lv_paramType_1_0= ruleParameterType ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=29 && LA24_0<=33)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:833:1: (lv_paramType_1_0= ruleParameterType )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:833:1: (lv_paramType_1_0= ruleParameterType )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:834:3: lv_paramType_1_0= ruleParameterType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllowedTypeAccess().getParamTypeParameterTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterType_in_ruleAllowedType1640);
                    lv_paramType_1_0=ruleParameterType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAllowedTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"paramType",
                            		lv_paramType_1_0, 
                            		"ParameterType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:850:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:851:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:851:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:852:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:852:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:853:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAllowedType1660); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getAllowedTypeAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllowedTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:868:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllowedType1680); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getAllowedTypeAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllowedTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:886:2: (otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:886:4: otherlv_3= '=' ( (lv_defValue_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAllowedType1701); 

                        	newLeafNode(otherlv_3, grammarAccess.getAllowedTypeAccess().getEqualsSignKeyword_3_0());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:890:1: ( (lv_defValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:891:1: (lv_defValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:891:1: (lv_defValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:892:3: lv_defValue_4_0= RULE_STRING
                    {
                    lv_defValue_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAllowedType1718); 

                    			newLeafNode(lv_defValue_4_0, grammarAccess.getAllowedTypeAccess().getDefValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAllowedTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"defValue",
                            		lv_defValue_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleAllowedType1737); 

                	newLeafNode(otherlv_5, grammarAccess.getAllowedTypeAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAllowedType"


    // $ANTLR start "entryRuleProtocol"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:920:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:921:2: (iv_ruleProtocol= ruleProtocol EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:922:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_ruleProtocol_in_entryRuleProtocol1773);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtocol1783); 

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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:929:1: ruleProtocol returns [EObject current=null] : (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        EObject this_ruleSSH_0 = null;

        EObject this_ruleHTTP_1 = null;

        EObject this_ruleXMLRPC_2 = null;

        EObject this_ruleJavaWrapper_3 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:932:28: ( (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:933:1: (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:933:1: (this_ruleSSH_0= ruleruleSSH | this_ruleHTTP_1= ruleruleHTTP | this_ruleXMLRPC_2= ruleruleXMLRPC | this_ruleJavaWrapper_3= ruleruleJavaWrapper )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt27=1;
                }
                break;
            case 49:
                {
                alt27=2;
                }
                break;
            case 60:
                {
                alt27=3;
                }
                break;
            case 41:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:934:5: this_ruleSSH_0= ruleruleSSH
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getRuleSSHParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleruleSSH_in_ruleProtocol1830);
                    this_ruleSSH_0=ruleruleSSH();

                    state._fsp--;

                     
                            current = this_ruleSSH_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:944:5: this_ruleHTTP_1= ruleruleHTTP
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getRuleHTTPParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleruleHTTP_in_ruleProtocol1857);
                    this_ruleHTTP_1=ruleruleHTTP();

                    state._fsp--;

                     
                            current = this_ruleHTTP_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:954:5: this_ruleXMLRPC_2= ruleruleXMLRPC
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getRuleXMLRPCParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleruleXMLRPC_in_ruleProtocol1884);
                    this_ruleXMLRPC_2=ruleruleXMLRPC();

                    state._fsp--;

                     
                            current = this_ruleXMLRPC_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:964:5: this_ruleJavaWrapper_3= ruleruleJavaWrapper
                    {
                     
                            newCompositeNode(grammarAccess.getProtocolAccess().getRuleJavaWrapperParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleruleJavaWrapper_in_ruleProtocol1911);
                    this_ruleJavaWrapper_3=ruleruleJavaWrapper();

                    state._fsp--;

                     
                            current = this_ruleJavaWrapper_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleParameterType"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:980:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:981:2: (iv_ruleParameterType= ruleParameterType EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:982:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_ruleParameterType_in_entryRuleParameterType1946);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterType1956); 

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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:989:1: ruleParameterType returns [EObject current=null] : ( () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) ) ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        Token lv_pName_1_1=null;
        Token lv_pName_1_2=null;
        Token lv_pName_1_3=null;
        Token lv_pName_1_4=null;
        Token lv_pName_1_5=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:992:28: ( ( () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:993:1: ( () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:993:1: ( () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:993:2: () ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:993:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:994:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterTypeAccess().getParameterTypeAction_0(),
                        current);
                

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:999:2: ( ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1000:1: ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1000:1: ( (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1001:1: (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1001:1: (lv_pName_1_1= 'String' | lv_pName_1_2= 'Integer' | lv_pName_1_3= 'Boolean' | lv_pName_1_4= 'Enum' | lv_pName_1_5= 'REFERENCE' )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt28=1;
                }
                break;
            case 30:
                {
                alt28=2;
                }
                break;
            case 31:
                {
                alt28=3;
                }
                break;
            case 32:
                {
                alt28=4;
                }
                break;
            case 33:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1002:3: lv_pName_1_1= 'String'
                    {
                    lv_pName_1_1=(Token)match(input,29,FOLLOW_29_in_ruleParameterType2010); 

                            newLeafNode(lv_pName_1_1, grammarAccess.getParameterTypeAccess().getPNameStringKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterTypeRule());
                    	        }
                           		setWithLastConsumed(current, "pName", lv_pName_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1014:8: lv_pName_1_2= 'Integer'
                    {
                    lv_pName_1_2=(Token)match(input,30,FOLLOW_30_in_ruleParameterType2039); 

                            newLeafNode(lv_pName_1_2, grammarAccess.getParameterTypeAccess().getPNameIntegerKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterTypeRule());
                    	        }
                           		setWithLastConsumed(current, "pName", lv_pName_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1026:8: lv_pName_1_3= 'Boolean'
                    {
                    lv_pName_1_3=(Token)match(input,31,FOLLOW_31_in_ruleParameterType2068); 

                            newLeafNode(lv_pName_1_3, grammarAccess.getParameterTypeAccess().getPNameBooleanKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterTypeRule());
                    	        }
                           		setWithLastConsumed(current, "pName", lv_pName_1_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1038:8: lv_pName_1_4= 'Enum'
                    {
                    lv_pName_1_4=(Token)match(input,32,FOLLOW_32_in_ruleParameterType2097); 

                            newLeafNode(lv_pName_1_4, grammarAccess.getParameterTypeAccess().getPNameEnumKeyword_1_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterTypeRule());
                    	        }
                           		setWithLastConsumed(current, "pName", lv_pName_1_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1050:8: lv_pName_1_5= 'REFERENCE'
                    {
                    lv_pName_1_5=(Token)match(input,33,FOLLOW_33_in_ruleParameterType2126); 

                            newLeafNode(lv_pName_1_5, grammarAccess.getParameterTypeAccess().getPNameREFERENCEKeyword_1_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterTypeRule());
                    	        }
                           		setWithLastConsumed(current, "pName", lv_pName_1_5, null);
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleruleSSH"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1073:1: entryRuleruleSSH returns [EObject current=null] : iv_ruleruleSSH= ruleruleSSH EOF ;
    public final EObject entryRuleruleSSH() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleSSH = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1074:2: (iv_ruleruleSSH= ruleruleSSH EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1075:2: iv_ruleruleSSH= ruleruleSSH EOF
            {
             newCompositeNode(grammarAccess.getRuleSSHRule()); 
            pushFollow(FOLLOW_ruleruleSSH_in_entryRuleruleSSH2178);
            iv_ruleruleSSH=ruleruleSSH();

            state._fsp--;

             current =iv_ruleruleSSH; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleSSH2188); 

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
    // $ANTLR end "entryRuleruleSSH"


    // $ANTLR start "ruleruleSSH"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1082:1: ruleruleSSH returns [EObject current=null] : ( () otherlv_1= 'SSH' otherlv_2= '{' otherlv_3= 'Remote Machine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'RPort' otherlv_8= '=' ( (otherlv_9= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'RUsername' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'RPassword' otherlv_16= '=' ( (otherlv_17= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'RExecute' otherlv_20= '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* otherlv_22= '}' otherlv_23= 'RExecuteDelete' otherlv_24= '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* otherlv_26= '}' otherlv_27= '}' ) ;
    public final EObject ruleruleSSH() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_commands_21_0 = null;

        EObject lv_commandsDelete_25_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1085:28: ( ( () otherlv_1= 'SSH' otherlv_2= '{' otherlv_3= 'Remote Machine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'RPort' otherlv_8= '=' ( (otherlv_9= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'RUsername' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'RPassword' otherlv_16= '=' ( (otherlv_17= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'RExecute' otherlv_20= '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* otherlv_22= '}' otherlv_23= 'RExecuteDelete' otherlv_24= '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* otherlv_26= '}' otherlv_27= '}' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1086:1: ( () otherlv_1= 'SSH' otherlv_2= '{' otherlv_3= 'Remote Machine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'RPort' otherlv_8= '=' ( (otherlv_9= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'RUsername' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'RPassword' otherlv_16= '=' ( (otherlv_17= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'RExecute' otherlv_20= '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* otherlv_22= '}' otherlv_23= 'RExecuteDelete' otherlv_24= '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* otherlv_26= '}' otherlv_27= '}' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1086:1: ( () otherlv_1= 'SSH' otherlv_2= '{' otherlv_3= 'Remote Machine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'RPort' otherlv_8= '=' ( (otherlv_9= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'RUsername' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'RPassword' otherlv_16= '=' ( (otherlv_17= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'RExecute' otherlv_20= '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* otherlv_22= '}' otherlv_23= 'RExecuteDelete' otherlv_24= '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* otherlv_26= '}' otherlv_27= '}' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1086:2: () otherlv_1= 'SSH' otherlv_2= '{' otherlv_3= 'Remote Machine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'RPort' otherlv_8= '=' ( (otherlv_9= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'RUsername' otherlv_12= '=' ( (otherlv_13= RULE_STRING ) ) otherlv_14= ';' otherlv_15= 'RPassword' otherlv_16= '=' ( (otherlv_17= RULE_STRING ) ) otherlv_18= ';' otherlv_19= 'RExecute' otherlv_20= '{' ( (lv_commands_21_0= rulerulSSH_commands ) )* otherlv_22= '}' otherlv_23= 'RExecuteDelete' otherlv_24= '{' ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )* otherlv_26= '}' otherlv_27= '}'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1086:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleSSHAccess().getRuleSSHAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleruleSSH2234); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleSSHAccess().getSSHKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleruleSSH2246); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleSSHAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleruleSSH2258); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleSSHAccess().getRemoteMachineKeyword_3());
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleruleSSH2270); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleSSHAccess().getEqualsSignKeyword_4());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1108:1: ( (otherlv_5= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1109:1: (otherlv_5= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1109:1: (otherlv_5= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1110:3: otherlv_5= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleSSHRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleSSH2290); 

            		newLeafNode(otherlv_5, grammarAccess.getRuleSSHAccess().getRemoteMachineScriptParamCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleruleSSH2302); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleSSHAccess().getSemicolonKeyword_6());
                
            otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleruleSSH2314); 

                	newLeafNode(otherlv_7, grammarAccess.getRuleSSHAccess().getRPortKeyword_7());
                
            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleruleSSH2326); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleSSHAccess().getEqualsSignKeyword_8());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1133:1: ( (otherlv_9= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1134:1: (otherlv_9= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1134:1: (otherlv_9= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1135:3: otherlv_9= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleSSHRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleSSH2346); 

            		newLeafNode(otherlv_9, grammarAccess.getRuleSSHAccess().getRPortScriptParamCrossReference_9_0()); 
            	

            }


            }

            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleruleSSH2358); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleSSHAccess().getSemicolonKeyword_10());
                
            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleruleSSH2370); 

                	newLeafNode(otherlv_11, grammarAccess.getRuleSSHAccess().getRUsernameKeyword_11());
                
            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleruleSSH2382); 

                	newLeafNode(otherlv_12, grammarAccess.getRuleSSHAccess().getEqualsSignKeyword_12());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1158:1: ( (otherlv_13= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1159:1: (otherlv_13= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1159:1: (otherlv_13= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1160:3: otherlv_13= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleSSHRule());
            	        }
                    
            otherlv_13=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleSSH2402); 

            		newLeafNode(otherlv_13, grammarAccess.getRuleSSHAccess().getUsernameScriptParamCrossReference_13_0()); 
            	

            }


            }

            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleruleSSH2414); 

                	newLeafNode(otherlv_14, grammarAccess.getRuleSSHAccess().getSemicolonKeyword_14());
                
            otherlv_15=(Token)match(input,38,FOLLOW_38_in_ruleruleSSH2426); 

                	newLeafNode(otherlv_15, grammarAccess.getRuleSSHAccess().getRPasswordKeyword_15());
                
            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleruleSSH2438); 

                	newLeafNode(otherlv_16, grammarAccess.getRuleSSHAccess().getEqualsSignKeyword_16());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1183:1: ( (otherlv_17= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1184:1: (otherlv_17= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1184:1: (otherlv_17= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1185:3: otherlv_17= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleSSHRule());
            	        }
                    
            otherlv_17=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleSSH2458); 

            		newLeafNode(otherlv_17, grammarAccess.getRuleSSHAccess().getPasswordScriptParamCrossReference_17_0()); 
            	

            }


            }

            otherlv_18=(Token)match(input,26,FOLLOW_26_in_ruleruleSSH2470); 

                	newLeafNode(otherlv_18, grammarAccess.getRuleSSHAccess().getSemicolonKeyword_18());
                
            otherlv_19=(Token)match(input,39,FOLLOW_39_in_ruleruleSSH2482); 

                	newLeafNode(otherlv_19, grammarAccess.getRuleSSHAccess().getRExecuteKeyword_19());
                
            otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleruleSSH2494); 

                	newLeafNode(otherlv_20, grammarAccess.getRuleSSHAccess().getLeftCurlyBracketKeyword_20());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1208:1: ( (lv_commands_21_0= rulerulSSH_commands ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_STRING) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1209:1: (lv_commands_21_0= rulerulSSH_commands )
            	    {
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1209:1: (lv_commands_21_0= rulerulSSH_commands )
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1210:3: lv_commands_21_0= rulerulSSH_commands
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSSHAccess().getCommandsRulSSH_commandsParserRuleCall_21_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulerulSSH_commands_in_ruleruleSSH2515);
            	    lv_commands_21_0=rulerulSSH_commands();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleSSHRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_21_0, 
            	            		"rulSSH_commands");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_22=(Token)match(input,17,FOLLOW_17_in_ruleruleSSH2528); 

                	newLeafNode(otherlv_22, grammarAccess.getRuleSSHAccess().getRightCurlyBracketKeyword_22());
                
            otherlv_23=(Token)match(input,40,FOLLOW_40_in_ruleruleSSH2540); 

                	newLeafNode(otherlv_23, grammarAccess.getRuleSSHAccess().getRExecuteDeleteKeyword_23());
                
            otherlv_24=(Token)match(input,16,FOLLOW_16_in_ruleruleSSH2552); 

                	newLeafNode(otherlv_24, grammarAccess.getRuleSSHAccess().getLeftCurlyBracketKeyword_24());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1238:1: ( (lv_commandsDelete_25_0= rulerulSSH_commands ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1239:1: (lv_commandsDelete_25_0= rulerulSSH_commands )
            	    {
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1239:1: (lv_commandsDelete_25_0= rulerulSSH_commands )
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1240:3: lv_commandsDelete_25_0= rulerulSSH_commands
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleSSHAccess().getCommandsDeleteRulSSH_commandsParserRuleCall_25_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulerulSSH_commands_in_ruleruleSSH2573);
            	    lv_commandsDelete_25_0=rulerulSSH_commands();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleSSHRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commandsDelete",
            	            		lv_commandsDelete_25_0, 
            	            		"rulSSH_commands");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_26=(Token)match(input,17,FOLLOW_17_in_ruleruleSSH2586); 

                	newLeafNode(otherlv_26, grammarAccess.getRuleSSHAccess().getRightCurlyBracketKeyword_26());
                
            otherlv_27=(Token)match(input,17,FOLLOW_17_in_ruleruleSSH2598); 

                	newLeafNode(otherlv_27, grammarAccess.getRuleSSHAccess().getRightCurlyBracketKeyword_27());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleruleSSH"


    // $ANTLR start "entryRuleruleJavaWrapper"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1272:1: entryRuleruleJavaWrapper returns [EObject current=null] : iv_ruleruleJavaWrapper= ruleruleJavaWrapper EOF ;
    public final EObject entryRuleruleJavaWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleJavaWrapper = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1273:2: (iv_ruleruleJavaWrapper= ruleruleJavaWrapper EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1274:2: iv_ruleruleJavaWrapper= ruleruleJavaWrapper EOF
            {
             newCompositeNode(grammarAccess.getRuleJavaWrapperRule()); 
            pushFollow(FOLLOW_ruleruleJavaWrapper_in_entryRuleruleJavaWrapper2634);
            iv_ruleruleJavaWrapper=ruleruleJavaWrapper();

            state._fsp--;

             current =iv_ruleruleJavaWrapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleJavaWrapper2644); 

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
    // $ANTLR end "entryRuleruleJavaWrapper"


    // $ANTLR start "ruleruleJavaWrapper"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1281:1: ruleruleJavaWrapper returns [EObject current=null] : ( () otherlv_1= 'Java' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) (otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_commands_9_0= ruleCommand ) )* otherlv_10= '}' ) ;
    public final EObject ruleruleJavaWrapper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_classname_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_constructorParams_4_0 = null;

        EObject lv_constructorParams_6_0 = null;

        EObject lv_commands_9_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1284:28: ( ( () otherlv_1= 'Java' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) (otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_commands_9_0= ruleCommand ) )* otherlv_10= '}' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1285:1: ( () otherlv_1= 'Java' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) (otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_commands_9_0= ruleCommand ) )* otherlv_10= '}' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1285:1: ( () otherlv_1= 'Java' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) (otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_commands_9_0= ruleCommand ) )* otherlv_10= '}' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1285:2: () otherlv_1= 'Java' ( (lv_classname_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) (otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )? otherlv_7= ')' otherlv_8= '{' ( (lv_commands_9_0= ruleCommand ) )* otherlv_10= '}'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1285:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1286:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleJavaWrapperAccess().getRuleJavaWrapperAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleruleJavaWrapper2690); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleJavaWrapperAccess().getJavaKeyword_1());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1295:1: ( (lv_classname_2_0= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1296:1: (lv_classname_2_0= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1296:1: (lv_classname_2_0= RULE_ID )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1297:3: lv_classname_2_0= RULE_ID
            {
            lv_classname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleJavaWrapper2707); 

            			newLeafNode(lv_classname_2_0, grammarAccess.getRuleJavaWrapperAccess().getClassnameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleJavaWrapperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"classname",
                    		lv_classname_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleruleJavaWrapper2724); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleJavaWrapperAccess().getLeftParenthesisKeyword_3());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1317:1: ( ( (lv_constructorParams_4_0= rulerulJava_param ) ) (otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_INT)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1317:2: ( (lv_constructorParams_4_0= rulerulJava_param ) ) (otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )*
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1317:2: ( (lv_constructorParams_4_0= rulerulJava_param ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1318:1: (lv_constructorParams_4_0= rulerulJava_param )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1318:1: (lv_constructorParams_4_0= rulerulJava_param )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1319:3: lv_constructorParams_4_0= rulerulJava_param
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleJavaWrapperAccess().getConstructorParamsRulJava_paramParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulerulJava_param_in_ruleruleJavaWrapper2746);
                    lv_constructorParams_4_0=rulerulJava_param();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleJavaWrapperRule());
                    	        }
                           		add(
                           			current, 
                           			"constructorParams",
                            		lv_constructorParams_4_0, 
                            		"rulJava_param");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1335:2: (otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==43) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1335:4: otherlv_5= ',' ( (lv_constructorParams_6_0= rulerulJava_param ) )
                    	    {
                    	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleruleJavaWrapper2759); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRuleJavaWrapperAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1339:1: ( (lv_constructorParams_6_0= rulerulJava_param ) )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1340:1: (lv_constructorParams_6_0= rulerulJava_param )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1340:1: (lv_constructorParams_6_0= rulerulJava_param )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1341:3: lv_constructorParams_6_0= rulerulJava_param
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRuleJavaWrapperAccess().getConstructorParamsRulJava_paramParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulerulJava_param_in_ruleruleJavaWrapper2780);
                    	    lv_constructorParams_6_0=rulerulJava_param();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRuleJavaWrapperRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"constructorParams",
                    	            		lv_constructorParams_6_0, 
                    	            		"rulJava_param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleruleJavaWrapper2796); 

                	newLeafNode(otherlv_7, grammarAccess.getRuleJavaWrapperAccess().getRightParenthesisKeyword_5());
                
            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleruleJavaWrapper2808); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleJavaWrapperAccess().getLeftCurlyBracketKeyword_6());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1365:1: ( (lv_commands_9_0= ruleCommand ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=45 && LA33_0<=46)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1366:1: (lv_commands_9_0= ruleCommand )
            	    {
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1366:1: (lv_commands_9_0= ruleCommand )
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1367:3: lv_commands_9_0= ruleCommand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleJavaWrapperAccess().getCommandsCommandParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommand_in_ruleruleJavaWrapper2829);
            	    lv_commands_9_0=ruleCommand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleJavaWrapperRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"commands",
            	            		lv_commands_9_0, 
            	            		"Command");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleruleJavaWrapper2842); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleJavaWrapperAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleruleJavaWrapper"


    // $ANTLR start "entryRuleCommand"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1395:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1396:2: (iv_ruleCommand= ruleCommand EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1397:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand2878);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand2888); 

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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1404:1: ruleCommand returns [EObject current=null] : (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_entryCommand_0 = null;

        EObject this_assignCommand_1 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1407:28: ( (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1408:1: (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1408:1: (this_entryCommand_0= ruleentryCommand | this_assignCommand_1= ruleassignCommand )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            else if ( (LA34_0==46) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1409:5: this_entryCommand_0= ruleentryCommand
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getEntryCommandParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleentryCommand_in_ruleCommand2935);
                    this_entryCommand_0=ruleentryCommand();

                    state._fsp--;

                     
                            current = this_entryCommand_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1419:5: this_assignCommand_1= ruleassignCommand
                    {
                     
                            newCompositeNode(grammarAccess.getCommandAccess().getAssignCommandParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleassignCommand_in_ruleCommand2962);
                    this_assignCommand_1=ruleassignCommand();

                    state._fsp--;

                     
                            current = this_assignCommand_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleentryCommand"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1435:1: entryRuleentryCommand returns [EObject current=null] : iv_ruleentryCommand= ruleentryCommand EOF ;
    public final EObject entryRuleentryCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleentryCommand = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1436:2: (iv_ruleentryCommand= ruleentryCommand EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1437:2: iv_ruleentryCommand= ruleentryCommand EOF
            {
             newCompositeNode(grammarAccess.getEntryCommandRule()); 
            pushFollow(FOLLOW_ruleentryCommand_in_entryRuleentryCommand2997);
            iv_ruleentryCommand=ruleentryCommand();

            state._fsp--;

             current =iv_ruleentryCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleentryCommand3007); 

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
    // $ANTLR end "entryRuleentryCommand"


    // $ANTLR start "ruleentryCommand"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1444:1: ruleentryCommand returns [EObject current=null] : (otherlv_0= 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) (otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleentryCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_javaFunctionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_commands_3_0 = null;

        EObject lv_commands_5_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1447:28: ( (otherlv_0= 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) (otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? otherlv_6= ')' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1448:1: (otherlv_0= 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) (otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? otherlv_6= ')' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1448:1: (otherlv_0= 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) (otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? otherlv_6= ')' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1448:3: otherlv_0= 'JExecute' ( (lv_javaFunctionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_commands_3_0= rulerulJava_param ) ) (otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleentryCommand3044); 

                	newLeafNode(otherlv_0, grammarAccess.getEntryCommandAccess().getJExecuteKeyword_0());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1452:1: ( (lv_javaFunctionName_1_0= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1453:1: (lv_javaFunctionName_1_0= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1453:1: (lv_javaFunctionName_1_0= RULE_ID )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1454:3: lv_javaFunctionName_1_0= RULE_ID
            {
            lv_javaFunctionName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleentryCommand3061); 

            			newLeafNode(lv_javaFunctionName_1_0, grammarAccess.getEntryCommandAccess().getJavaFunctionNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntryCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"javaFunctionName",
                    		lv_javaFunctionName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleentryCommand3078); 

                	newLeafNode(otherlv_2, grammarAccess.getEntryCommandAccess().getLeftParenthesisKeyword_2());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1474:1: ( ( (lv_commands_3_0= rulerulJava_param ) ) (otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) ) )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=RULE_STRING && LA36_0<=RULE_INT)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1474:2: ( (lv_commands_3_0= rulerulJava_param ) ) (otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) ) )*
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1474:2: ( (lv_commands_3_0= rulerulJava_param ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1475:1: (lv_commands_3_0= rulerulJava_param )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1475:1: (lv_commands_3_0= rulerulJava_param )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1476:3: lv_commands_3_0= rulerulJava_param
                    {
                     
                    	        newCompositeNode(grammarAccess.getEntryCommandAccess().getCommandsRulJava_paramParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulerulJava_param_in_ruleentryCommand3100);
                    lv_commands_3_0=rulerulJava_param();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEntryCommandRule());
                    	        }
                           		add(
                           			current, 
                           			"commands",
                            		lv_commands_3_0, 
                            		"rulJava_param");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1492:2: (otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==43) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1492:4: otherlv_4= ',' ( (lv_commands_5_0= rulerulJava_param ) )
                    	    {
                    	    otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleentryCommand3113); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEntryCommandAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1496:1: ( (lv_commands_5_0= rulerulJava_param ) )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1497:1: (lv_commands_5_0= rulerulJava_param )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1497:1: (lv_commands_5_0= rulerulJava_param )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1498:3: lv_commands_5_0= rulerulJava_param
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEntryCommandAccess().getCommandsRulJava_paramParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulerulJava_param_in_ruleentryCommand3134);
                    	    lv_commands_5_0=rulerulJava_param();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEntryCommandRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"commands",
                    	            		lv_commands_5_0, 
                    	            		"rulJava_param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,44,FOLLOW_44_in_ruleentryCommand3150); 

                	newLeafNode(otherlv_6, grammarAccess.getEntryCommandAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleentryCommand"


    // $ANTLR start "entryRulerulJava_param"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1526:1: entryRulerulJava_param returns [EObject current=null] : iv_rulerulJava_param= rulerulJava_param EOF ;
    public final EObject entryRulerulJava_param() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulJava_param = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1527:2: (iv_rulerulJava_param= rulerulJava_param EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1528:2: iv_rulerulJava_param= rulerulJava_param EOF
            {
             newCompositeNode(grammarAccess.getRulJava_paramRule()); 
            pushFollow(FOLLOW_rulerulJava_param_in_entryRulerulJava_param3186);
            iv_rulerulJava_param=rulerulJava_param();

            state._fsp--;

             current =iv_rulerulJava_param; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulJava_param3196); 

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
    // $ANTLR end "entryRulerulJava_param"


    // $ANTLR start "rulerulJava_param"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1535:1: rulerulJava_param returns [EObject current=null] : (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript ) ;
    public final EObject rulerulJava_param() throws RecognitionException {
        EObject current = null;

        EObject this_rulJava_paramString_0 = null;

        EObject this_rulJava_paramInt_1 = null;

        EObject this_rulJava_paraScript_2 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1538:28: ( (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1539:1: (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1539:1: (this_rulJava_paramString_0= rulerulJava_paramString | this_rulJava_paramInt_1= rulerulJava_paramInt | this_rulJava_paraScript_2= rulerulJava_paraScript )
            int alt37=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt37=1;
                }
                break;
            case RULE_INT:
                {
                alt37=2;
                }
                break;
            case RULE_ID:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1540:5: this_rulJava_paramString_0= rulerulJava_paramString
                    {
                     
                            newCompositeNode(grammarAccess.getRulJava_paramAccess().getRulJava_paramStringParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulerulJava_paramString_in_rulerulJava_param3243);
                    this_rulJava_paramString_0=rulerulJava_paramString();

                    state._fsp--;

                     
                            current = this_rulJava_paramString_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1550:5: this_rulJava_paramInt_1= rulerulJava_paramInt
                    {
                     
                            newCompositeNode(grammarAccess.getRulJava_paramAccess().getRulJava_paramIntParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulerulJava_paramInt_in_rulerulJava_param3270);
                    this_rulJava_paramInt_1=rulerulJava_paramInt();

                    state._fsp--;

                     
                            current = this_rulJava_paramInt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1560:5: this_rulJava_paraScript_2= rulerulJava_paraScript
                    {
                     
                            newCompositeNode(grammarAccess.getRulJava_paramAccess().getRulJava_paraScriptParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulerulJava_paraScript_in_rulerulJava_param3297);
                    this_rulJava_paraScript_2=rulerulJava_paraScript();

                    state._fsp--;

                     
                            current = this_rulJava_paraScript_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerulJava_param"


    // $ANTLR start "entryRulerulJava_paramString"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1576:1: entryRulerulJava_paramString returns [EObject current=null] : iv_rulerulJava_paramString= rulerulJava_paramString EOF ;
    public final EObject entryRulerulJava_paramString() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulJava_paramString = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1577:2: (iv_rulerulJava_paramString= rulerulJava_paramString EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1578:2: iv_rulerulJava_paramString= rulerulJava_paramString EOF
            {
             newCompositeNode(grammarAccess.getRulJava_paramStringRule()); 
            pushFollow(FOLLOW_rulerulJava_paramString_in_entryRulerulJava_paramString3332);
            iv_rulerulJava_paramString=rulerulJava_paramString();

            state._fsp--;

             current =iv_rulerulJava_paramString; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulJava_paramString3342); 

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
    // $ANTLR end "entryRulerulJava_paramString"


    // $ANTLR start "rulerulJava_paramString"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1585:1: rulerulJava_paramString returns [EObject current=null] : ( (lv_stringValue_0_0= RULE_STRING ) ) ;
    public final EObject rulerulJava_paramString() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1588:28: ( ( (lv_stringValue_0_0= RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1589:1: ( (lv_stringValue_0_0= RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1589:1: ( (lv_stringValue_0_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1590:1: (lv_stringValue_0_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1590:1: (lv_stringValue_0_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1591:3: lv_stringValue_0_0= RULE_STRING
            {
            lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulerulJava_paramString3383); 

            			newLeafNode(lv_stringValue_0_0, grammarAccess.getRulJava_paramStringAccess().getStringValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRulJava_paramStringRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"stringValue",
                    		lv_stringValue_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerulJava_paramString"


    // $ANTLR start "entryRulerulJava_paramInt"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1615:1: entryRulerulJava_paramInt returns [EObject current=null] : iv_rulerulJava_paramInt= rulerulJava_paramInt EOF ;
    public final EObject entryRulerulJava_paramInt() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulJava_paramInt = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1616:2: (iv_rulerulJava_paramInt= rulerulJava_paramInt EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1617:2: iv_rulerulJava_paramInt= rulerulJava_paramInt EOF
            {
             newCompositeNode(grammarAccess.getRulJava_paramIntRule()); 
            pushFollow(FOLLOW_rulerulJava_paramInt_in_entryRulerulJava_paramInt3423);
            iv_rulerulJava_paramInt=rulerulJava_paramInt();

            state._fsp--;

             current =iv_rulerulJava_paramInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulJava_paramInt3433); 

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
    // $ANTLR end "entryRulerulJava_paramInt"


    // $ANTLR start "rulerulJava_paramInt"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1624:1: rulerulJava_paramInt returns [EObject current=null] : ( (lv_intValue_0_0= RULE_INT ) ) ;
    public final EObject rulerulJava_paramInt() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1627:28: ( ( (lv_intValue_0_0= RULE_INT ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1628:1: ( (lv_intValue_0_0= RULE_INT ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1628:1: ( (lv_intValue_0_0= RULE_INT ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1629:1: (lv_intValue_0_0= RULE_INT )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1629:1: (lv_intValue_0_0= RULE_INT )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1630:3: lv_intValue_0_0= RULE_INT
            {
            lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulerulJava_paramInt3474); 

            			newLeafNode(lv_intValue_0_0, grammarAccess.getRulJava_paramIntAccess().getIntValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRulJava_paramIntRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"intValue",
                    		lv_intValue_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerulJava_paramInt"


    // $ANTLR start "entryRulerulJava_paraScript"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1654:1: entryRulerulJava_paraScript returns [EObject current=null] : iv_rulerulJava_paraScript= rulerulJava_paraScript EOF ;
    public final EObject entryRulerulJava_paraScript() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulJava_paraScript = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1655:2: (iv_rulerulJava_paraScript= rulerulJava_paraScript EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1656:2: iv_rulerulJava_paraScript= rulerulJava_paraScript EOF
            {
             newCompositeNode(grammarAccess.getRulJava_paraScriptRule()); 
            pushFollow(FOLLOW_rulerulJava_paraScript_in_entryRulerulJava_paraScript3514);
            iv_rulerulJava_paraScript=rulerulJava_paraScript();

            state._fsp--;

             current =iv_rulerulJava_paraScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulJava_paraScript3524); 

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
    // $ANTLR end "entryRulerulJava_paraScript"


    // $ANTLR start "rulerulJava_paraScript"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1663:1: rulerulJava_paraScript returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulerulJava_paraScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1666:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1667:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1667:1: ( (otherlv_0= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1668:1: (otherlv_0= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1668:1: (otherlv_0= RULE_ID )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1669:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRulJava_paraScriptRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulerulJava_paraScript3568); 

            		newLeafNode(otherlv_0, grammarAccess.getRulJava_paraScriptAccess().getScriptparamValueScriptParamCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerulJava_paraScript"


    // $ANTLR start "entryRuleassignCommand"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1688:1: entryRuleassignCommand returns [EObject current=null] : iv_ruleassignCommand= ruleassignCommand EOF ;
    public final EObject entryRuleassignCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignCommand = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1689:2: (iv_ruleassignCommand= ruleassignCommand EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1690:2: iv_ruleassignCommand= ruleassignCommand EOF
            {
             newCompositeNode(grammarAccess.getAssignCommandRule()); 
            pushFollow(FOLLOW_ruleassignCommand_in_entryRuleassignCommand3603);
            iv_ruleassignCommand=ruleassignCommand();

            state._fsp--;

             current =iv_ruleassignCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignCommand3613); 

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
    // $ANTLR end "entryRuleassignCommand"


    // $ANTLR start "ruleassignCommand"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1697:1: ruleassignCommand returns [EObject current=null] : ( () otherlv_1= 'JAssign' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) (otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? otherlv_9= ')' ) ;
    public final EObject ruleassignCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_javaFunctionName_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_commands_6_0 = null;

        EObject lv_commands_8_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1700:28: ( ( () otherlv_1= 'JAssign' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) (otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? otherlv_9= ')' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1701:1: ( () otherlv_1= 'JAssign' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) (otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? otherlv_9= ')' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1701:1: ( () otherlv_1= 'JAssign' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) (otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? otherlv_9= ')' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1701:2: () otherlv_1= 'JAssign' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_javaFunctionName_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_commands_6_0= rulerulJava_param ) ) (otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )? otherlv_9= ')'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1701:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1702:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAssignCommandAccess().getAssignCommandAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleassignCommand3659); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignCommandAccess().getJAssignKeyword_1());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1711:1: ( (otherlv_2= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1712:1: (otherlv_2= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1712:1: (otherlv_2= RULE_ID )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1713:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignCommandRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleassignCommand3679); 

            		newLeafNode(otherlv_2, grammarAccess.getAssignCommandAccess().getScriptParamScriptParamCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleassignCommand3691); 

                	newLeafNode(otherlv_3, grammarAccess.getAssignCommandAccess().getEqualsSignKeyword_3());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1728:1: ( (lv_javaFunctionName_4_0= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1729:1: (lv_javaFunctionName_4_0= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1729:1: (lv_javaFunctionName_4_0= RULE_ID )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1730:3: lv_javaFunctionName_4_0= RULE_ID
            {
            lv_javaFunctionName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleassignCommand3708); 

            			newLeafNode(lv_javaFunctionName_4_0, grammarAccess.getAssignCommandAccess().getJavaFunctionNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignCommandRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"javaFunctionName",
                    		lv_javaFunctionName_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleassignCommand3725); 

                	newLeafNode(otherlv_5, grammarAccess.getAssignCommandAccess().getLeftParenthesisKeyword_5());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1750:1: ( ( (lv_commands_6_0= rulerulJava_param ) ) (otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_INT)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1750:2: ( (lv_commands_6_0= rulerulJava_param ) ) (otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) ) )*
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1750:2: ( (lv_commands_6_0= rulerulJava_param ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1751:1: (lv_commands_6_0= rulerulJava_param )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1751:1: (lv_commands_6_0= rulerulJava_param )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1752:3: lv_commands_6_0= rulerulJava_param
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignCommandAccess().getCommandsRulJava_paramParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulerulJava_param_in_ruleassignCommand3747);
                    lv_commands_6_0=rulerulJava_param();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignCommandRule());
                    	        }
                           		add(
                           			current, 
                           			"commands",
                            		lv_commands_6_0, 
                            		"rulJava_param");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1768:2: (otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==43) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1768:4: otherlv_7= ',' ( (lv_commands_8_0= rulerulJava_param ) )
                    	    {
                    	    otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleassignCommand3760); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAssignCommandAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1772:1: ( (lv_commands_8_0= rulerulJava_param ) )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1773:1: (lv_commands_8_0= rulerulJava_param )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1773:1: (lv_commands_8_0= rulerulJava_param )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1774:3: lv_commands_8_0= rulerulJava_param
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssignCommandAccess().getCommandsRulJava_paramParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulerulJava_param_in_ruleassignCommand3781);
                    	    lv_commands_8_0=rulerulJava_param();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssignCommandRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"commands",
                    	            		lv_commands_8_0, 
                    	            		"rulJava_param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleassignCommand3797); 

                	newLeafNode(otherlv_9, grammarAccess.getAssignCommandAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassignCommand"


    // $ANTLR start "entryRulerulSSH_commands"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1804:1: entryRulerulSSH_commands returns [EObject current=null] : iv_rulerulSSH_commands= rulerulSSH_commands EOF ;
    public final EObject entryRulerulSSH_commands() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerulSSH_commands = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1805:2: (iv_rulerulSSH_commands= rulerulSSH_commands EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1806:2: iv_rulerulSSH_commands= rulerulSSH_commands EOF
            {
             newCompositeNode(grammarAccess.getRulSSH_commandsRule()); 
            pushFollow(FOLLOW_rulerulSSH_commands_in_entryRulerulSSH_commands3835);
            iv_rulerulSSH_commands=rulerulSSH_commands();

            state._fsp--;

             current =iv_rulerulSSH_commands; 
            match(input,EOF,FOLLOW_EOF_in_entryRulerulSSH_commands3845); 

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
    // $ANTLR end "entryRulerulSSH_commands"


    // $ANTLR start "rulerulSSH_commands"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1813:1: rulerulSSH_commands returns [EObject current=null] : ( () ( (lv_remoteCommand_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )? ) ;
    public final EObject rulerulSSH_commands() throws RecognitionException {
        EObject current = null;

        Token lv_remoteCommand_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1816:28: ( ( () ( (lv_remoteCommand_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )? ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1817:1: ( () ( (lv_remoteCommand_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )? )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1817:1: ( () ( (lv_remoteCommand_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )? )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1817:2: () ( (lv_remoteCommand_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )?
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1817:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1818:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRulSSH_commandsAccess().getRulSSH_commandsAction_0(),
                        current);
                

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1823:2: ( (lv_remoteCommand_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1824:1: (lv_remoteCommand_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1824:1: (lv_remoteCommand_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1825:3: lv_remoteCommand_1_0= RULE_STRING
            {
            lv_remoteCommand_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulerulSSH_commands3896); 

            			newLeafNode(lv_remoteCommand_1_0, grammarAccess.getRulSSH_commandsAccess().getRemoteCommandSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRulSSH_commandsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"remoteCommand",
                    		lv_remoteCommand_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1841:2: (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1841:4: otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_rulerulSSH_commands3914); 

                        	newLeafNode(otherlv_2, grammarAccess.getRulSSH_commandsAccess().getLessThanSignLessThanSignKeyword_2_0());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1845:1: ( (otherlv_3= RULE_STRING ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_STRING) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1846:1: (otherlv_3= RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1846:1: (otherlv_3= RULE_STRING )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1847:3: otherlv_3= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRulSSH_commandsRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulerulSSH_commands3934); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getRulSSH_commandsAccess().getScriptparamsScriptParamCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_rulerulSSH_commands3947); 

                        	newLeafNode(otherlv_4, grammarAccess.getRulSSH_commandsAccess().getGreaterThanSignGreaterThanSignKeyword_2_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerulSSH_commands"


    // $ANTLR start "entryRuleruleHTTP"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1870:1: entryRuleruleHTTP returns [EObject current=null] : iv_ruleruleHTTP= ruleruleHTTP EOF ;
    public final EObject entryRuleruleHTTP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleHTTP = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1871:2: (iv_ruleruleHTTP= ruleruleHTTP EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1872:2: iv_ruleruleHTTP= ruleruleHTTP EOF
            {
             newCompositeNode(grammarAccess.getRuleHTTPRule()); 
            pushFollow(FOLLOW_ruleruleHTTP_in_entryRuleruleHTTP3985);
            iv_ruleruleHTTP=ruleruleHTTP();

            state._fsp--;

             current =iv_ruleruleHTTP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleHTTP3995); 

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
    // $ANTLR end "entryRuleruleHTTP"


    // $ANTLR start "ruleruleHTTP"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1879:1: ruleruleHTTP returns [EObject current=null] : ( () otherlv_1= 'HTTP' otherlv_2= '{' otherlv_3= 'RemoteMachine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'HttpURL' otherlv_8= '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* otherlv_10= ';' otherlv_11= 'HttpMethod' otherlv_12= '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) otherlv_14= ';' (otherlv_15= 'HttpAuth' otherlv_16= '{' otherlv_17= 'Method' otherlv_18= '=' ( (otherlv_19= RULE_STRING ) ) otherlv_20= ';' otherlv_21= 'AuthUsername' otherlv_22= '=' ( (otherlv_23= RULE_STRING ) ) otherlv_24= ';' otherlv_25= 'AuthPassword' otherlv_26= '=' ( (otherlv_27= RULE_STRING ) ) otherlv_28= ';' otherlv_29= '}' )? (otherlv_30= 'PostBody' otherlv_31= '=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= ';' ) otherlv_34= '}' ) ;
    public final EObject ruleruleHTTP() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_HMethod_13_1=null;
        Token lv_HMethod_13_2=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        EObject lv_httpURL_9_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1882:28: ( ( () otherlv_1= 'HTTP' otherlv_2= '{' otherlv_3= 'RemoteMachine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'HttpURL' otherlv_8= '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* otherlv_10= ';' otherlv_11= 'HttpMethod' otherlv_12= '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) otherlv_14= ';' (otherlv_15= 'HttpAuth' otherlv_16= '{' otherlv_17= 'Method' otherlv_18= '=' ( (otherlv_19= RULE_STRING ) ) otherlv_20= ';' otherlv_21= 'AuthUsername' otherlv_22= '=' ( (otherlv_23= RULE_STRING ) ) otherlv_24= ';' otherlv_25= 'AuthPassword' otherlv_26= '=' ( (otherlv_27= RULE_STRING ) ) otherlv_28= ';' otherlv_29= '}' )? (otherlv_30= 'PostBody' otherlv_31= '=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= ';' ) otherlv_34= '}' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1883:1: ( () otherlv_1= 'HTTP' otherlv_2= '{' otherlv_3= 'RemoteMachine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'HttpURL' otherlv_8= '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* otherlv_10= ';' otherlv_11= 'HttpMethod' otherlv_12= '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) otherlv_14= ';' (otherlv_15= 'HttpAuth' otherlv_16= '{' otherlv_17= 'Method' otherlv_18= '=' ( (otherlv_19= RULE_STRING ) ) otherlv_20= ';' otherlv_21= 'AuthUsername' otherlv_22= '=' ( (otherlv_23= RULE_STRING ) ) otherlv_24= ';' otherlv_25= 'AuthPassword' otherlv_26= '=' ( (otherlv_27= RULE_STRING ) ) otherlv_28= ';' otherlv_29= '}' )? (otherlv_30= 'PostBody' otherlv_31= '=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= ';' ) otherlv_34= '}' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1883:1: ( () otherlv_1= 'HTTP' otherlv_2= '{' otherlv_3= 'RemoteMachine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'HttpURL' otherlv_8= '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* otherlv_10= ';' otherlv_11= 'HttpMethod' otherlv_12= '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) otherlv_14= ';' (otherlv_15= 'HttpAuth' otherlv_16= '{' otherlv_17= 'Method' otherlv_18= '=' ( (otherlv_19= RULE_STRING ) ) otherlv_20= ';' otherlv_21= 'AuthUsername' otherlv_22= '=' ( (otherlv_23= RULE_STRING ) ) otherlv_24= ';' otherlv_25= 'AuthPassword' otherlv_26= '=' ( (otherlv_27= RULE_STRING ) ) otherlv_28= ';' otherlv_29= '}' )? (otherlv_30= 'PostBody' otherlv_31= '=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= ';' ) otherlv_34= '}' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1883:2: () otherlv_1= 'HTTP' otherlv_2= '{' otherlv_3= 'RemoteMachine' otherlv_4= '=' ( (otherlv_5= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'HttpURL' otherlv_8= '=' ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )* otherlv_10= ';' otherlv_11= 'HttpMethod' otherlv_12= '=' ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) ) otherlv_14= ';' (otherlv_15= 'HttpAuth' otherlv_16= '{' otherlv_17= 'Method' otherlv_18= '=' ( (otherlv_19= RULE_STRING ) ) otherlv_20= ';' otherlv_21= 'AuthUsername' otherlv_22= '=' ( (otherlv_23= RULE_STRING ) ) otherlv_24= ';' otherlv_25= 'AuthPassword' otherlv_26= '=' ( (otherlv_27= RULE_STRING ) ) otherlv_28= ';' otherlv_29= '}' )? (otherlv_30= 'PostBody' otherlv_31= '=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= ';' ) otherlv_34= '}'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1883:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1884:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleHTTPAccess().getRuleHTTPAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleruleHTTP4041); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleHTTPAccess().getHTTPKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleruleHTTP4053); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleHTTPAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleruleHTTP4065); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleHTTPAccess().getRemoteMachineKeyword_3());
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleruleHTTP4077); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_4());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1905:1: ( (otherlv_5= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1906:1: (otherlv_5= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1906:1: (otherlv_5= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1907:3: otherlv_5= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleHTTPRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4097); 

            		newLeafNode(otherlv_5, grammarAccess.getRuleHTTPAccess().getRemoteMachineScriptParamCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleruleHTTP4109); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_6());
                
            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleruleHTTP4121); 

                	newLeafNode(otherlv_7, grammarAccess.getRuleHTTPAccess().getHttpURLKeyword_7());
                
            otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleruleHTTP4133); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_8());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1930:1: ( (lv_httpURL_9_0= ruleruleHTTP_URL ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_STRING) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1931:1: (lv_httpURL_9_0= ruleruleHTTP_URL )
            	    {
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1931:1: (lv_httpURL_9_0= ruleruleHTTP_URL )
            	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1932:3: lv_httpURL_9_0= ruleruleHTTP_URL
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleHTTPAccess().getHttpURLRuleHTTP_URLParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleruleHTTP_URL_in_ruleruleHTTP4154);
            	    lv_httpURL_9_0=ruleruleHTTP_URL();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleHTTPRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"httpURL",
            	            		lv_httpURL_9_0, 
            	            		"ruleHTTP_URL");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleruleHTTP4167); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_10());
                
            otherlv_11=(Token)match(input,52,FOLLOW_52_in_ruleruleHTTP4179); 

                	newLeafNode(otherlv_11, grammarAccess.getRuleHTTPAccess().getHttpMethodKeyword_11());
                
            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleruleHTTP4191); 

                	newLeafNode(otherlv_12, grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_12());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1960:1: ( ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1961:1: ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1961:1: ( (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1962:1: (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1962:1: (lv_HMethod_13_1= 'GET' | lv_HMethod_13_2= 'POST' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            else if ( (LA43_0==54) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1963:3: lv_HMethod_13_1= 'GET'
                    {
                    lv_HMethod_13_1=(Token)match(input,53,FOLLOW_53_in_ruleruleHTTP4211); 

                            newLeafNode(lv_HMethod_13_1, grammarAccess.getRuleHTTPAccess().getHMethodGETKeyword_13_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleHTTPRule());
                    	        }
                           		setWithLastConsumed(current, "HMethod", lv_HMethod_13_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1975:8: lv_HMethod_13_2= 'POST'
                    {
                    lv_HMethod_13_2=(Token)match(input,54,FOLLOW_54_in_ruleruleHTTP4240); 

                            newLeafNode(lv_HMethod_13_2, grammarAccess.getRuleHTTPAccess().getHMethodPOSTKeyword_13_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleHTTPRule());
                    	        }
                           		setWithLastConsumed(current, "HMethod", lv_HMethod_13_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleruleHTTP4268); 

                	newLeafNode(otherlv_14, grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_14());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1994:1: (otherlv_15= 'HttpAuth' otherlv_16= '{' otherlv_17= 'Method' otherlv_18= '=' ( (otherlv_19= RULE_STRING ) ) otherlv_20= ';' otherlv_21= 'AuthUsername' otherlv_22= '=' ( (otherlv_23= RULE_STRING ) ) otherlv_24= ';' otherlv_25= 'AuthPassword' otherlv_26= '=' ( (otherlv_27= RULE_STRING ) ) otherlv_28= ';' otherlv_29= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==55) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:1994:3: otherlv_15= 'HttpAuth' otherlv_16= '{' otherlv_17= 'Method' otherlv_18= '=' ( (otherlv_19= RULE_STRING ) ) otherlv_20= ';' otherlv_21= 'AuthUsername' otherlv_22= '=' ( (otherlv_23= RULE_STRING ) ) otherlv_24= ';' otherlv_25= 'AuthPassword' otherlv_26= '=' ( (otherlv_27= RULE_STRING ) ) otherlv_28= ';' otherlv_29= '}'
                    {
                    otherlv_15=(Token)match(input,55,FOLLOW_55_in_ruleruleHTTP4281); 

                        	newLeafNode(otherlv_15, grammarAccess.getRuleHTTPAccess().getHttpAuthKeyword_15_0());
                        
                    otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleruleHTTP4293); 

                        	newLeafNode(otherlv_16, grammarAccess.getRuleHTTPAccess().getLeftCurlyBracketKeyword_15_1());
                        
                    otherlv_17=(Token)match(input,56,FOLLOW_56_in_ruleruleHTTP4305); 

                        	newLeafNode(otherlv_17, grammarAccess.getRuleHTTPAccess().getMethodKeyword_15_2());
                        
                    otherlv_18=(Token)match(input,23,FOLLOW_23_in_ruleruleHTTP4317); 

                        	newLeafNode(otherlv_18, grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_15_3());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2010:1: ( (otherlv_19= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2011:1: (otherlv_19= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2011:1: (otherlv_19= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2012:3: otherlv_19= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleHTTPRule());
                    	        }
                            
                    otherlv_19=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4337); 

                    		newLeafNode(otherlv_19, grammarAccess.getRuleHTTPAccess().getAuthMethodScriptParamCrossReference_15_4_0()); 
                    	

                    }


                    }

                    otherlv_20=(Token)match(input,26,FOLLOW_26_in_ruleruleHTTP4349); 

                        	newLeafNode(otherlv_20, grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_15_5());
                        
                    otherlv_21=(Token)match(input,57,FOLLOW_57_in_ruleruleHTTP4361); 

                        	newLeafNode(otherlv_21, grammarAccess.getRuleHTTPAccess().getAuthUsernameKeyword_15_6());
                        
                    otherlv_22=(Token)match(input,23,FOLLOW_23_in_ruleruleHTTP4373); 

                        	newLeafNode(otherlv_22, grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_15_7());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2035:1: ( (otherlv_23= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2036:1: (otherlv_23= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2036:1: (otherlv_23= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2037:3: otherlv_23= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleHTTPRule());
                    	        }
                            
                    otherlv_23=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4393); 

                    		newLeafNode(otherlv_23, grammarAccess.getRuleHTTPAccess().getUsernameScriptParamCrossReference_15_8_0()); 
                    	

                    }


                    }

                    otherlv_24=(Token)match(input,26,FOLLOW_26_in_ruleruleHTTP4405); 

                        	newLeafNode(otherlv_24, grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_15_9());
                        
                    otherlv_25=(Token)match(input,58,FOLLOW_58_in_ruleruleHTTP4417); 

                        	newLeafNode(otherlv_25, grammarAccess.getRuleHTTPAccess().getAuthPasswordKeyword_15_10());
                        
                    otherlv_26=(Token)match(input,23,FOLLOW_23_in_ruleruleHTTP4429); 

                        	newLeafNode(otherlv_26, grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_15_11());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2060:1: ( (otherlv_27= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2061:1: (otherlv_27= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2061:1: (otherlv_27= RULE_STRING )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2062:3: otherlv_27= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleHTTPRule());
                    	        }
                            
                    otherlv_27=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4449); 

                    		newLeafNode(otherlv_27, grammarAccess.getRuleHTTPAccess().getPasswordScriptParamCrossReference_15_12_0()); 
                    	

                    }


                    }

                    otherlv_28=(Token)match(input,26,FOLLOW_26_in_ruleruleHTTP4461); 

                        	newLeafNode(otherlv_28, grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_15_13());
                        
                    otherlv_29=(Token)match(input,17,FOLLOW_17_in_ruleruleHTTP4473); 

                        	newLeafNode(otherlv_29, grammarAccess.getRuleHTTPAccess().getRightCurlyBracketKeyword_15_14());
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2081:3: (otherlv_30= 'PostBody' otherlv_31= '=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= ';' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2081:5: otherlv_30= 'PostBody' otherlv_31= '=' ( (otherlv_32= RULE_STRING ) ) otherlv_33= ';'
            {
            otherlv_30=(Token)match(input,59,FOLLOW_59_in_ruleruleHTTP4488); 

                	newLeafNode(otherlv_30, grammarAccess.getRuleHTTPAccess().getPostBodyKeyword_16_0());
                
            otherlv_31=(Token)match(input,23,FOLLOW_23_in_ruleruleHTTP4500); 

                	newLeafNode(otherlv_31, grammarAccess.getRuleHTTPAccess().getEqualsSignKeyword_16_1());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2089:1: ( (otherlv_32= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2090:1: (otherlv_32= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2090:1: (otherlv_32= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2091:3: otherlv_32= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleHTTPRule());
            	        }
                    
            otherlv_32=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP4520); 

            		newLeafNode(otherlv_32, grammarAccess.getRuleHTTPAccess().getPostBodyScriptParamCrossReference_16_2_0()); 
            	

            }


            }

            otherlv_33=(Token)match(input,26,FOLLOW_26_in_ruleruleHTTP4532); 

                	newLeafNode(otherlv_33, grammarAccess.getRuleHTTPAccess().getSemicolonKeyword_16_3());
                

            }

            otherlv_34=(Token)match(input,17,FOLLOW_17_in_ruleruleHTTP4545); 

                	newLeafNode(otherlv_34, grammarAccess.getRuleHTTPAccess().getRightCurlyBracketKeyword_17());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleruleHTTP"


    // $ANTLR start "entryRuleruleHTTP_URL"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2118:1: entryRuleruleHTTP_URL returns [EObject current=null] : iv_ruleruleHTTP_URL= ruleruleHTTP_URL EOF ;
    public final EObject entryRuleruleHTTP_URL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleHTTP_URL = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2119:2: (iv_ruleruleHTTP_URL= ruleruleHTTP_URL EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2120:2: iv_ruleruleHTTP_URL= ruleruleHTTP_URL EOF
            {
             newCompositeNode(grammarAccess.getRuleHTTP_URLRule()); 
            pushFollow(FOLLOW_ruleruleHTTP_URL_in_entryRuleruleHTTP_URL4581);
            iv_ruleruleHTTP_URL=ruleruleHTTP_URL();

            state._fsp--;

             current =iv_ruleruleHTTP_URL; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleHTTP_URL4591); 

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
    // $ANTLR end "entryRuleruleHTTP_URL"


    // $ANTLR start "ruleruleHTTP_URL"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2127:1: ruleruleHTTP_URL returns [EObject current=null] : ( () ( (lv_remoteURL_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )? ) ;
    public final EObject ruleruleHTTP_URL() throws RecognitionException {
        EObject current = null;

        Token lv_remoteURL_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2130:28: ( ( () ( (lv_remoteURL_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )? ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2131:1: ( () ( (lv_remoteURL_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )? )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2131:1: ( () ( (lv_remoteURL_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )? )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2131:2: () ( (lv_remoteURL_1_0= RULE_STRING ) ) (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )?
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2131:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2132:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleHTTP_URLAccess().getRuleHTTP_URLAction_0(),
                        current);
                

            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2137:2: ( (lv_remoteURL_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2138:1: (lv_remoteURL_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2138:1: (lv_remoteURL_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2139:3: lv_remoteURL_1_0= RULE_STRING
            {
            lv_remoteURL_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP_URL4642); 

            			newLeafNode(lv_remoteURL_1_0, grammarAccess.getRuleHTTP_URLAccess().getRemoteURLSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleHTTP_URLRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"remoteURL",
                    		lv_remoteURL_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2155:2: (otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2155:4: otherlv_2= '<<' ( (otherlv_3= RULE_STRING ) )* otherlv_4= '>>'
                    {
                    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleruleHTTP_URL4660); 

                        	newLeafNode(otherlv_2, grammarAccess.getRuleHTTP_URLAccess().getLessThanSignLessThanSignKeyword_2_0());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2159:1: ( (otherlv_3= RULE_STRING ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==RULE_STRING) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2160:1: (otherlv_3= RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2160:1: (otherlv_3= RULE_STRING )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2161:3: otherlv_3= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRuleHTTP_URLRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleHTTP_URL4680); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getRuleHTTP_URLAccess().getScriptparamsScriptParamCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleruleHTTP_URL4693); 

                        	newLeafNode(otherlv_4, grammarAccess.getRuleHTTP_URLAccess().getGreaterThanSignGreaterThanSignKeyword_2_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleruleHTTP_URL"


    // $ANTLR start "entryRuleruleXMLRPC"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2184:1: entryRuleruleXMLRPC returns [EObject current=null] : iv_ruleruleXMLRPC= ruleruleXMLRPC EOF ;
    public final EObject entryRuleruleXMLRPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleruleXMLRPC = null;


        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2185:2: (iv_ruleruleXMLRPC= ruleruleXMLRPC EOF )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2186:2: iv_ruleruleXMLRPC= ruleruleXMLRPC EOF
            {
             newCompositeNode(grammarAccess.getRuleXMLRPCRule()); 
            pushFollow(FOLLOW_ruleruleXMLRPC_in_entryRuleruleXMLRPC4731);
            iv_ruleruleXMLRPC=ruleruleXMLRPC();

            state._fsp--;

             current =iv_ruleruleXMLRPC; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleruleXMLRPC4741); 

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
    // $ANTLR end "entryRuleruleXMLRPC"


    // $ANTLR start "ruleruleXMLRPC"
    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2193:1: ruleruleXMLRPC returns [EObject current=null] : ( () otherlv_1= 'XML-RPC' otherlv_2= '{' otherlv_3= 'ServerURL' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' (otherlv_7= 'HttpBasicAuth' otherlv_8= '{' otherlv_9= 'BasicAuthUsername' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'BasicAuthPassword' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' otherlv_17= '}' )? otherlv_18= 'RPCMethod' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' (otherlv_22= 'parameters' otherlv_23= '=' ( (otherlv_24= RULE_STRING ) )* )? otherlv_25= '}' ) ;
    public final EObject ruleruleXMLRPC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2196:28: ( ( () otherlv_1= 'XML-RPC' otherlv_2= '{' otherlv_3= 'ServerURL' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' (otherlv_7= 'HttpBasicAuth' otherlv_8= '{' otherlv_9= 'BasicAuthUsername' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'BasicAuthPassword' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' otherlv_17= '}' )? otherlv_18= 'RPCMethod' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' (otherlv_22= 'parameters' otherlv_23= '=' ( (otherlv_24= RULE_STRING ) )* )? otherlv_25= '}' ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2197:1: ( () otherlv_1= 'XML-RPC' otherlv_2= '{' otherlv_3= 'ServerURL' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' (otherlv_7= 'HttpBasicAuth' otherlv_8= '{' otherlv_9= 'BasicAuthUsername' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'BasicAuthPassword' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' otherlv_17= '}' )? otherlv_18= 'RPCMethod' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' (otherlv_22= 'parameters' otherlv_23= '=' ( (otherlv_24= RULE_STRING ) )* )? otherlv_25= '}' )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2197:1: ( () otherlv_1= 'XML-RPC' otherlv_2= '{' otherlv_3= 'ServerURL' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' (otherlv_7= 'HttpBasicAuth' otherlv_8= '{' otherlv_9= 'BasicAuthUsername' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'BasicAuthPassword' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' otherlv_17= '}' )? otherlv_18= 'RPCMethod' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' (otherlv_22= 'parameters' otherlv_23= '=' ( (otherlv_24= RULE_STRING ) )* )? otherlv_25= '}' )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2197:2: () otherlv_1= 'XML-RPC' otherlv_2= '{' otherlv_3= 'ServerURL' otherlv_4= '=' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' (otherlv_7= 'HttpBasicAuth' otherlv_8= '{' otherlv_9= 'BasicAuthUsername' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'BasicAuthPassword' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' otherlv_17= '}' )? otherlv_18= 'RPCMethod' otherlv_19= '=' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' (otherlv_22= 'parameters' otherlv_23= '=' ( (otherlv_24= RULE_STRING ) )* )? otherlv_25= '}'
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2197:2: ()
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2198:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleXMLRPCAccess().getRuleXMLRPCAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleruleXMLRPC4787); 

                	newLeafNode(otherlv_1, grammarAccess.getRuleXMLRPCAccess().getXMLRPCKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleruleXMLRPC4799); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleXMLRPCAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,61,FOLLOW_61_in_ruleruleXMLRPC4811); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleXMLRPCAccess().getServerURLKeyword_3());
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleruleXMLRPC4823); 

                	newLeafNode(otherlv_4, grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_4());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2219:1: ( (otherlv_5= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2220:1: (otherlv_5= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2220:1: (otherlv_5= RULE_ID )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2221:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleXMLRPCRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleXMLRPC4843); 

            		newLeafNode(otherlv_5, grammarAccess.getRuleXMLRPCAccess().getRemoteMachineBindingParamCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleruleXMLRPC4855); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleXMLRPCAccess().getSemicolonKeyword_6());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2236:1: (otherlv_7= 'HttpBasicAuth' otherlv_8= '{' otherlv_9= 'BasicAuthUsername' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'BasicAuthPassword' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' otherlv_17= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==62) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2236:3: otherlv_7= 'HttpBasicAuth' otherlv_8= '{' otherlv_9= 'BasicAuthUsername' otherlv_10= '=' ( (otherlv_11= RULE_ID ) ) otherlv_12= ';' otherlv_13= 'BasicAuthPassword' otherlv_14= '=' ( (otherlv_15= RULE_ID ) ) otherlv_16= ';' otherlv_17= '}'
                    {
                    otherlv_7=(Token)match(input,62,FOLLOW_62_in_ruleruleXMLRPC4868); 

                        	newLeafNode(otherlv_7, grammarAccess.getRuleXMLRPCAccess().getHttpBasicAuthKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleruleXMLRPC4880); 

                        	newLeafNode(otherlv_8, grammarAccess.getRuleXMLRPCAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    otherlv_9=(Token)match(input,63,FOLLOW_63_in_ruleruleXMLRPC4892); 

                        	newLeafNode(otherlv_9, grammarAccess.getRuleXMLRPCAccess().getBasicAuthUsernameKeyword_7_2());
                        
                    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleruleXMLRPC4904); 

                        	newLeafNode(otherlv_10, grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_7_3());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2252:1: ( (otherlv_11= RULE_ID ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2253:1: (otherlv_11= RULE_ID )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2253:1: (otherlv_11= RULE_ID )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2254:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleXMLRPCRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleXMLRPC4924); 

                    		newLeafNode(otherlv_11, grammarAccess.getRuleXMLRPCAccess().getUsernameBindingParamCrossReference_7_4_0()); 
                    	

                    }


                    }

                    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleruleXMLRPC4936); 

                        	newLeafNode(otherlv_12, grammarAccess.getRuleXMLRPCAccess().getSemicolonKeyword_7_5());
                        
                    otherlv_13=(Token)match(input,64,FOLLOW_64_in_ruleruleXMLRPC4948); 

                        	newLeafNode(otherlv_13, grammarAccess.getRuleXMLRPCAccess().getBasicAuthPasswordKeyword_7_6());
                        
                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleruleXMLRPC4960); 

                        	newLeafNode(otherlv_14, grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_7_7());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2277:1: ( (otherlv_15= RULE_ID ) )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2278:1: (otherlv_15= RULE_ID )
                    {
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2278:1: (otherlv_15= RULE_ID )
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2279:3: otherlv_15= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRuleXMLRPCRule());
                    	        }
                            
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleXMLRPC4980); 

                    		newLeafNode(otherlv_15, grammarAccess.getRuleXMLRPCAccess().getPasswordBindingParamCrossReference_7_8_0()); 
                    	

                    }


                    }

                    otherlv_16=(Token)match(input,26,FOLLOW_26_in_ruleruleXMLRPC4992); 

                        	newLeafNode(otherlv_16, grammarAccess.getRuleXMLRPCAccess().getSemicolonKeyword_7_9());
                        
                    otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleruleXMLRPC5004); 

                        	newLeafNode(otherlv_17, grammarAccess.getRuleXMLRPCAccess().getRightCurlyBracketKeyword_7_10());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,65,FOLLOW_65_in_ruleruleXMLRPC5018); 

                	newLeafNode(otherlv_18, grammarAccess.getRuleXMLRPCAccess().getRPCMethodKeyword_8());
                
            otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleruleXMLRPC5030); 

                	newLeafNode(otherlv_19, grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_9());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2306:1: ( (otherlv_20= RULE_ID ) )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2307:1: (otherlv_20= RULE_ID )
            {
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2307:1: (otherlv_20= RULE_ID )
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2308:3: otherlv_20= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleXMLRPCRule());
            	        }
                    
            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleruleXMLRPC5050); 

            		newLeafNode(otherlv_20, grammarAccess.getRuleXMLRPCAccess().getRPCMethodBindingParamCrossReference_10_0()); 
            	

            }


            }

            otherlv_21=(Token)match(input,26,FOLLOW_26_in_ruleruleXMLRPC5062); 

                	newLeafNode(otherlv_21, grammarAccess.getRuleXMLRPCAccess().getSemicolonKeyword_11());
                
            // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2323:1: (otherlv_22= 'parameters' otherlv_23= '=' ( (otherlv_24= RULE_STRING ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==66) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2323:3: otherlv_22= 'parameters' otherlv_23= '=' ( (otherlv_24= RULE_STRING ) )*
                    {
                    otherlv_22=(Token)match(input,66,FOLLOW_66_in_ruleruleXMLRPC5075); 

                        	newLeafNode(otherlv_22, grammarAccess.getRuleXMLRPCAccess().getParametersKeyword_12_0());
                        
                    otherlv_23=(Token)match(input,23,FOLLOW_23_in_ruleruleXMLRPC5087); 

                        	newLeafNode(otherlv_23, grammarAccess.getRuleXMLRPCAccess().getEqualsSignKeyword_12_1());
                        
                    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2331:1: ( (otherlv_24= RULE_STRING ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_STRING) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2332:1: (otherlv_24= RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2332:1: (otherlv_24= RULE_STRING )
                    	    // ../gr.upatras.ece.wcl.radl2/src-gen/gr/upatras/ece/wcl/radl2/parser/antlr/internal/InternalRadl.g:2333:3: otherlv_24= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRuleXMLRPCRule());
                    	    	        }
                    	            
                    	    otherlv_24=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleruleXMLRPC5107); 

                    	    		newLeafNode(otherlv_24, grammarAccess.getRuleXMLRPCAccess().getURLparamsConfigurationParamCrossReference_12_2_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,17,FOLLOW_17_in_ruleruleXMLRPC5122); 

                	newLeafNode(otherlv_25, grammarAccess.getRuleXMLRPCAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleruleXMLRPC"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRADL_in_entryRuleRADL75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRADL85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleRADL131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleResourceAdapter_in_ruleRADL153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceAdapter_in_entryRuleResourceAdapter294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceAdapter304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleResourceAdapter341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAdapter358 = new BitSet(new long[]{0x00000000003CA002L});
    public static final BitSet FOLLOW_13_in_ruleResourceAdapter376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAdapter396 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResourceAdapter408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceAdapter428 = new BitSet(new long[]{0x00000000003C8002L});
    public static final BitSet FOLLOW_15_in_ruleResourceAdapter443 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter455 = new BitSet(new long[]{0x00000003E0020030L});
    public static final BitSet FOLLOW_ruleConfigurationParam_in_ruleResourceAdapter476 = new BitSet(new long[]{0x00000003E0020030L});
    public static final BitSet FOLLOW_17_in_ruleResourceAdapter489 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_18_in_ruleResourceAdapter504 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter516 = new BitSet(new long[]{0x00000003E0020030L});
    public static final BitSet FOLLOW_ruleBindingParam_in_ruleResourceAdapter537 = new BitSet(new long[]{0x00000003E0020030L});
    public static final BitSet FOLLOW_17_in_ruleResourceAdapter550 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_19_in_ruleResourceAdapter565 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter577 = new BitSet(new long[]{0x00000003E0020030L});
    public static final BitSet FOLLOW_ruleSupportedChildType_in_ruleResourceAdapter598 = new BitSet(new long[]{0x00000003E0020030L});
    public static final BitSet FOLLOW_17_in_ruleResourceAdapter611 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_20_in_ruleResourceAdapter626 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter638 = new BitSet(new long[]{0x00000003E0020030L});
    public static final BitSet FOLLOW_ruleAllowedType_in_ruleResourceAdapter659 = new BitSet(new long[]{0x00000003E0020030L});
    public static final BitSet FOLLOW_17_in_ruleResourceAdapter672 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleResourceAdapter687 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceAdapter699 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleResourceAdapter711 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleResourceAdapter723 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleResourceAdapter743 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25_in_ruleResourceAdapter772 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResourceAdapter800 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleResourceAdapter812 = new BitSet(new long[]{0x1002020400000000L});
    public static final BitSet FOLLOW_ruleProtocol_in_ruleResourceAdapter833 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResourceAdapter845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConfigurationParam_in_entryRuleConfigurationParam883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConfigurationParam893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleConfigurationParam948 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConfigurationParam968 = new BitSet(new long[]{0x0000000014800000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationParam988 = new BitSet(new long[]{0x0000000014800000L});
    public static final BitSet FOLLOW_23_in_ruleConfigurationParam1009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationParam1026 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_28_in_ruleConfigurationParam1046 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleConfigurationParam1058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConfigurationParam1075 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleConfigurationParam1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingParam_in_entryRuleBindingParam1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingParam1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleBindingParam1195 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingParam1215 = new BitSet(new long[]{0x0000000014800000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBindingParam1235 = new BitSet(new long[]{0x0000000014800000L});
    public static final BitSet FOLLOW_23_in_ruleBindingParam1256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBindingParam1273 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_28_in_ruleBindingParam1293 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBindingParam1305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBindingParam1322 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBindingParam1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedChildType_in_entryRuleSupportedChildType1377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupportedChildType1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleSupportedChildType1442 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSupportedChildType1462 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSupportedChildType1482 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_23_in_ruleSupportedChildType1503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSupportedChildType1520 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSupportedChildType1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAllowedType_in_entryRuleAllowedType1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAllowedType1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_ruleAllowedType1640 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAllowedType1660 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllowedType1680 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_23_in_ruleAllowedType1701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAllowedType1718 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAllowedType1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtocol_in_entryRuleProtocol1773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtocol1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleSSH_in_ruleProtocol1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleHTTP_in_ruleProtocol1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleXMLRPC_in_ruleProtocol1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleJavaWrapper_in_ruleProtocol1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterType_in_entryRuleParameterType1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterType1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleParameterType2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleParameterType2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleParameterType2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParameterType2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleParameterType2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleSSH_in_entryRuleruleSSH2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleSSH2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleruleSSH2234 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleSSH2246 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleruleSSH2258 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleSSH2270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleSSH2290 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleSSH2302 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleruleSSH2314 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleSSH2326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleSSH2346 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleSSH2358 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleruleSSH2370 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleSSH2382 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleSSH2402 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleSSH2414 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleruleSSH2426 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleSSH2438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleSSH2458 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleSSH2470 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleruleSSH2482 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleSSH2494 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rulerulSSH_commands_in_ruleruleSSH2515 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleruleSSH2528 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleruleSSH2540 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleSSH2552 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rulerulSSH_commands_in_ruleruleSSH2573 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleruleSSH2586 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleruleSSH2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleJavaWrapper_in_entryRuleruleJavaWrapper2634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleJavaWrapper2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleruleJavaWrapper2690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleJavaWrapper2707 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleruleJavaWrapper2724 = new BitSet(new long[]{0x0000100000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleruleJavaWrapper2746 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_ruleruleJavaWrapper2759 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleruleJavaWrapper2780 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_44_in_ruleruleJavaWrapper2796 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleJavaWrapper2808 = new BitSet(new long[]{0x0000600000020000L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleruleJavaWrapper2829 = new BitSet(new long[]{0x0000600000020000L});
    public static final BitSet FOLLOW_17_in_ruleruleJavaWrapper2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand2878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentryCommand_in_ruleCommand2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignCommand_in_ruleCommand2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleentryCommand_in_entryRuleentryCommand2997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleentryCommand3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleentryCommand3044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleentryCommand3061 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleentryCommand3078 = new BitSet(new long[]{0x0000100000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleentryCommand3100 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_ruleentryCommand3113 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleentryCommand3134 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_44_in_ruleentryCommand3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_param_in_entryRulerulJava_param3186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulJava_param3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paramString_in_rulerulJava_param3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paramInt_in_rulerulJava_param3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paraScript_in_rulerulJava_param3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paramString_in_entryRulerulJava_paramString3332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulJava_paramString3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulerulJava_paramString3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paramInt_in_entryRulerulJava_paramInt3423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulJava_paramInt3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulerulJava_paramInt3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulJava_paraScript_in_entryRulerulJava_paraScript3514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulJava_paraScript3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulerulJava_paraScript3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignCommand_in_entryRuleassignCommand3603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignCommand3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleassignCommand3659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleassignCommand3679 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleassignCommand3691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleassignCommand3708 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleassignCommand3725 = new BitSet(new long[]{0x0000100000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleassignCommand3747 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_43_in_ruleassignCommand3760 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rulerulJava_param_in_ruleassignCommand3781 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_44_in_ruleassignCommand3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerulSSH_commands_in_entryRulerulSSH_commands3835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerulSSH_commands3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulerulSSH_commands3896 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_rulerulSSH_commands3914 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulerulSSH_commands3934 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_rulerulSSH_commands3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleHTTP_in_entryRuleruleHTTP3985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleHTTP3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleruleHTTP4041 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleHTTP4053 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleruleHTTP4065 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleHTTP4077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4097 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleHTTP4109 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleruleHTTP4121 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleHTTP4133 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleruleHTTP_URL_in_ruleruleHTTP4154 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_26_in_ruleruleHTTP4167 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleruleHTTP4179 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleHTTP4191 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_ruleruleHTTP4211 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_54_in_ruleruleHTTP4240 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleHTTP4268 = new BitSet(new long[]{0x0880000000000000L});
    public static final BitSet FOLLOW_55_in_ruleruleHTTP4281 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleHTTP4293 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleruleHTTP4305 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleHTTP4317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4337 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleHTTP4349 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleruleHTTP4361 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleHTTP4373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4393 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleHTTP4405 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ruleruleHTTP4417 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleHTTP4429 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4449 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleHTTP4461 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleruleHTTP4473 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleruleHTTP4488 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleHTTP4500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP4520 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleHTTP4532 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleruleHTTP4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleHTTP_URL_in_entryRuleruleHTTP_URL4581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleHTTP_URL4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP_URL4642 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleruleHTTP_URL4660 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleHTTP_URL4680 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_48_in_ruleruleHTTP_URL4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleruleXMLRPC_in_entryRuleruleXMLRPC4731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleruleXMLRPC4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleruleXMLRPC4787 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleXMLRPC4799 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleruleXMLRPC4811 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleXMLRPC4823 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleXMLRPC4843 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleXMLRPC4855 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleruleXMLRPC4868 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleruleXMLRPC4880 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleruleXMLRPC4892 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleXMLRPC4904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleXMLRPC4924 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleXMLRPC4936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleruleXMLRPC4948 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleXMLRPC4960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleXMLRPC4980 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleXMLRPC4992 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleruleXMLRPC5004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleruleXMLRPC5018 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleXMLRPC5030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleruleXMLRPC5050 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleruleXMLRPC5062 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleruleXMLRPC5075 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleruleXMLRPC5087 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleruleXMLRPC5107 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleruleXMLRPC5122 = new BitSet(new long[]{0x0000000000000002L});

}