package gr.upatras.ece.nam.fsdl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import gr.upatras.ece.nam.fsdl.services.FSDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RequestedFederationScenario'", "'isShared'", "'Description'", "'Credentials'", "'import'", "';'", "'RequestServices'", "'{'", "'}'", "'Service'", "'as'", "'[1..'", "']'", "'offered by'", "'optional'", "'settings'", "'ScheduledPlan'", "'ValidFrom'", "'ValidUntil'", "'id'", "'description'", "'UserName'", "'PassWord'", "'Setting'", "':'", "'='", "'assign'", "','", "'RequestInfrastructure'", "'Resource'", "'ResourceGroup'", "'refersResources'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFSDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFSDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFSDLParser.tokenNames; }
    public String getGrammarFileName() { return "../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g"; }



     	private FSDLGrammarAccess grammarAccess;
     	
        public InternalFSDLParser(TokenStream input, FSDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RequestedFederationScenario";	
       	}
       	
       	@Override
       	protected FSDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRequestedFederationScenario"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:67:1: entryRuleRequestedFederationScenario returns [EObject current=null] : iv_ruleRequestedFederationScenario= ruleRequestedFederationScenario EOF ;
    public final EObject entryRuleRequestedFederationScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestedFederationScenario = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:68:2: (iv_ruleRequestedFederationScenario= ruleRequestedFederationScenario EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:69:2: iv_ruleRequestedFederationScenario= ruleRequestedFederationScenario EOF
            {
             newCompositeNode(grammarAccess.getRequestedFederationScenarioRule()); 
            pushFollow(FOLLOW_ruleRequestedFederationScenario_in_entryRuleRequestedFederationScenario75);
            iv_ruleRequestedFederationScenario=ruleRequestedFederationScenario();

            state._fsp--;

             current =iv_ruleRequestedFederationScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestedFederationScenario85); 

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
    // $ANTLR end "entryRuleRequestedFederationScenario"


    // $ANTLR start "ruleRequestedFederationScenario"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:76:1: ruleRequestedFederationScenario returns [EObject current=null] : ( () otherlv_1= 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )? ) ;
    public final EObject ruleRequestedFederationScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_isShared_4_0=null;
        Token otherlv_5=null;
        Token lv_description_6_0=null;
        Token otherlv_7=null;
        EObject lv_imports_3_0 = null;

        EObject lv_VTCredentials_8_0 = null;

        EObject lv_scheduledPlan_9_0 = null;

        EObject lv_servicesRequest_10_0 = null;

        EObject lv_infrastructureRequest_11_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:79:28: ( ( () otherlv_1= 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )? ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:80:1: ( () otherlv_1= 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )? )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:80:1: ( () otherlv_1= 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )? )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:80:2: () otherlv_1= 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? (otherlv_7= 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )?
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:80:2: ()
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleRequestedFederationScenario131); 

                	newLeafNode(otherlv_1, grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioKeyword_1());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:90:1: ( (lv_name_2_0= RULE_ID ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:91:1: (lv_name_2_0= RULE_ID )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:91:1: (lv_name_2_0= RULE_ID )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:92:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestedFederationScenario148); 

            			newLeafNode(lv_name_2_0, grammarAccess.getRequestedFederationScenarioAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequestedFederationScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:108:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:109:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:109:1: (lv_imports_3_0= ruleImport )
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:110:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getImportsImportParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleRequestedFederationScenario174);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequestedFederationScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_3_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:126:3: ( (lv_isShared_4_0= 'isShared' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:127:1: (lv_isShared_4_0= 'isShared' )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:127:1: (lv_isShared_4_0= 'isShared' )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:128:3: lv_isShared_4_0= 'isShared'
                    {
                    lv_isShared_4_0=(Token)match(input,12,FOLLOW_12_in_ruleRequestedFederationScenario193); 

                            newLeafNode(lv_isShared_4_0, grammarAccess.getRequestedFederationScenarioAccess().getIsSharedIsSharedKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequestedFederationScenarioRule());
                    	        }
                           		setWithLastConsumed(current, "isShared", true, "isShared");
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:141:3: (otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:141:5: otherlv_5= 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleRequestedFederationScenario220); 

                        	newLeafNode(otherlv_5, grammarAccess.getRequestedFederationScenarioAccess().getDescriptionKeyword_5_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:145:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:146:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:146:1: (lv_description_6_0= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:147:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequestedFederationScenario237); 

                    			newLeafNode(lv_description_6_0, grammarAccess.getRequestedFederationScenarioAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequestedFederationScenarioRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:163:4: (otherlv_7= 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:163:6: otherlv_7= 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) )
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleRequestedFederationScenario257); 

                        	newLeafNode(otherlv_7, grammarAccess.getRequestedFederationScenarioAccess().getCredentialsKeyword_6_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:167:1: ( (lv_VTCredentials_8_0= ruleCredentials ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:168:1: (lv_VTCredentials_8_0= ruleCredentials )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:168:1: (lv_VTCredentials_8_0= ruleCredentials )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:169:3: lv_VTCredentials_8_0= ruleCredentials
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getVTCredentialsCredentialsParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCredentials_in_ruleRequestedFederationScenario278);
                    lv_VTCredentials_8_0=ruleCredentials();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequestedFederationScenarioRule());
                    	        }
                           		set(
                           			current, 
                           			"VTCredentials",
                            		lv_VTCredentials_8_0, 
                            		"Credentials");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:185:4: ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:186:1: (lv_scheduledPlan_9_0= ruleScheduledPlan )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:186:1: (lv_scheduledPlan_9_0= ruleScheduledPlan )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:187:3: lv_scheduledPlan_9_0= ruleScheduledPlan
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getScheduledPlanScheduledPlanParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScheduledPlan_in_ruleRequestedFederationScenario301);
                    lv_scheduledPlan_9_0=ruleScheduledPlan();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequestedFederationScenarioRule());
                    	        }
                           		set(
                           			current, 
                           			"scheduledPlan",
                            		lv_scheduledPlan_9_0, 
                            		"ScheduledPlan");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:203:3: ( (lv_servicesRequest_10_0= ruleServicesRequest ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:204:1: (lv_servicesRequest_10_0= ruleServicesRequest )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:204:1: (lv_servicesRequest_10_0= ruleServicesRequest )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:205:3: lv_servicesRequest_10_0= ruleServicesRequest
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getServicesRequestServicesRequestParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleServicesRequest_in_ruleRequestedFederationScenario323);
                    lv_servicesRequest_10_0=ruleServicesRequest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequestedFederationScenarioRule());
                    	        }
                           		set(
                           			current, 
                           			"servicesRequest",
                            		lv_servicesRequest_10_0, 
                            		"ServicesRequest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:221:3: ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:222:1: (lv_infrastructureRequest_11_0= ruleInfrastructureRequest )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:222:1: (lv_infrastructureRequest_11_0= ruleInfrastructureRequest )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:223:3: lv_infrastructureRequest_11_0= ruleInfrastructureRequest
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getInfrastructureRequestInfrastructureRequestParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInfrastructureRequest_in_ruleRequestedFederationScenario345);
                    lv_infrastructureRequest_11_0=ruleInfrastructureRequest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequestedFederationScenarioRule());
                    	        }
                           		set(
                           			current, 
                           			"infrastructureRequest",
                            		lv_infrastructureRequest_11_0, 
                            		"InfrastructureRequest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleRequestedFederationScenario"


    // $ANTLR start "entryRuleImport"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:247:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:248:2: (iv_ruleImport= ruleImport EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:249:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport382);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport392); 

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
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:256:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:259:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:260:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:260:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:260:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleImport429); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:264:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:265:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:265:1: (lv_importURI_1_0= RULE_STRING )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:266:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport446); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleImport463); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                

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


    // $ANTLR start "entryRuleServicesRequest"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:294:1: entryRuleServicesRequest returns [EObject current=null] : iv_ruleServicesRequest= ruleServicesRequest EOF ;
    public final EObject entryRuleServicesRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicesRequest = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:295:2: (iv_ruleServicesRequest= ruleServicesRequest EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:296:2: iv_ruleServicesRequest= ruleServicesRequest EOF
            {
             newCompositeNode(grammarAccess.getServicesRequestRule()); 
            pushFollow(FOLLOW_ruleServicesRequest_in_entryRuleServicesRequest499);
            iv_ruleServicesRequest=ruleServicesRequest();

            state._fsp--;

             current =iv_ruleServicesRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicesRequest509); 

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
    // $ANTLR end "entryRuleServicesRequest"


    // $ANTLR start "ruleServicesRequest"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:303:1: ruleServicesRequest returns [EObject current=null] : ( () otherlv_1= 'RequestServices' otherlv_2= '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* otherlv_4= '}' ) ;
    public final EObject ruleServicesRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_serviceRequestList_3_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:306:28: ( ( () otherlv_1= 'RequestServices' otherlv_2= '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* otherlv_4= '}' ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:307:1: ( () otherlv_1= 'RequestServices' otherlv_2= '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* otherlv_4= '}' )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:307:1: ( () otherlv_1= 'RequestServices' otherlv_2= '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* otherlv_4= '}' )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:307:2: () otherlv_1= 'RequestServices' otherlv_2= '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* otherlv_4= '}'
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:307:2: ()
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:308:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getServicesRequestAccess().getServicesRequestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleServicesRequest555); 

                	newLeafNode(otherlv_1, grammarAccess.getServicesRequestAccess().getRequestServicesKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleServicesRequest567); 

                	newLeafNode(otherlv_2, grammarAccess.getServicesRequestAccess().getLeftCurlyBracketKeyword_2());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:321:1: ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:322:1: (lv_serviceRequestList_3_0= ruleServiceRequest )
            	    {
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:322:1: (lv_serviceRequestList_3_0= ruleServiceRequest )
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:323:3: lv_serviceRequestList_3_0= ruleServiceRequest
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServicesRequestAccess().getServiceRequestListServiceRequestParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceRequest_in_ruleServicesRequest588);
            	    lv_serviceRequestList_3_0=ruleServiceRequest();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServicesRequestRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"serviceRequestList",
            	            		lv_serviceRequestList_3_0, 
            	            		"ServiceRequest");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleServicesRequest601); 

                	newLeafNode(otherlv_4, grammarAccess.getServicesRequestAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleServicesRequest"


    // $ANTLR start "entryRuleServiceRequest"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:351:1: entryRuleServiceRequest returns [EObject current=null] : iv_ruleServiceRequest= ruleServiceRequest EOF ;
    public final EObject entryRuleServiceRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRequest = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:352:2: (iv_ruleServiceRequest= ruleServiceRequest EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:353:2: iv_ruleServiceRequest= ruleServiceRequest EOF
            {
             newCompositeNode(grammarAccess.getServiceRequestRule()); 
            pushFollow(FOLLOW_ruleServiceRequest_in_entryRuleServiceRequest637);
            iv_ruleServiceRequest=ruleServiceRequest();

            state._fsp--;

             current =iv_ruleServiceRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceRequest647); 

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
    // $ANTLR end "entryRuleServiceRequest"


    // $ANTLR start "ruleServiceRequest"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:360:1: ruleServiceRequest returns [EObject current=null] : ( () otherlv_1= 'Service' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) otherlv_7= ']' )? (otherlv_8= 'offered by' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'optional' )? )? (otherlv_11= 'settings' otherlv_12= '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleServiceRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token lv_numOfServices_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_reqServiceSettings_13_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:363:28: ( ( () otherlv_1= 'Service' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) otherlv_7= ']' )? (otherlv_8= 'offered by' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'optional' )? )? (otherlv_11= 'settings' otherlv_12= '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* otherlv_14= '}' )? ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:364:1: ( () otherlv_1= 'Service' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) otherlv_7= ']' )? (otherlv_8= 'offered by' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'optional' )? )? (otherlv_11= 'settings' otherlv_12= '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* otherlv_14= '}' )? )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:364:1: ( () otherlv_1= 'Service' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) otherlv_7= ']' )? (otherlv_8= 'offered by' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'optional' )? )? (otherlv_11= 'settings' otherlv_12= '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* otherlv_14= '}' )? )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:364:2: () otherlv_1= 'Service' ( (otherlv_2= RULE_STRING ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) otherlv_7= ']' )? (otherlv_8= 'offered by' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'optional' )? )? (otherlv_11= 'settings' otherlv_12= '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* otherlv_14= '}' )?
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:364:2: ()
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:365:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getServiceRequestAccess().getServiceRequestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleServiceRequest693); 

                	newLeafNode(otherlv_1, grammarAccess.getServiceRequestAccess().getServiceKeyword_1());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:374:1: ( (otherlv_2= RULE_STRING ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:375:1: (otherlv_2= RULE_STRING )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:375:1: (otherlv_2= RULE_STRING )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:376:3: otherlv_2= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRequestRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceRequest713); 

            		newLeafNode(otherlv_2, grammarAccess.getServiceRequestAccess().getRefServiceServiceCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleServiceRequest725); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceRequestAccess().getAsKeyword_3());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:391:1: ( (lv_name_4_0= RULE_ID ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:392:1: (lv_name_4_0= RULE_ID )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:392:1: (lv_name_4_0= RULE_ID )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:393:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceRequest742); 

            			newLeafNode(lv_name_4_0, grammarAccess.getServiceRequestAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRequestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:409:2: (otherlv_5= '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) otherlv_7= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:409:4: otherlv_5= '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleServiceRequest760); 

                        	newLeafNode(otherlv_5, grammarAccess.getServiceRequestAccess().getLeftSquareBracketDigitOneFullStopFullStopKeyword_5_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:413:1: ( (lv_numOfServices_6_0= RULE_INT ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:414:1: (lv_numOfServices_6_0= RULE_INT )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:414:1: (lv_numOfServices_6_0= RULE_INT )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:415:3: lv_numOfServices_6_0= RULE_INT
                    {
                    lv_numOfServices_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceRequest777); 

                    			newLeafNode(lv_numOfServices_6_0, grammarAccess.getServiceRequestAccess().getNumOfServicesINTTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRequestRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"numOfServices",
                            		lv_numOfServices_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleServiceRequest794); 

                        	newLeafNode(otherlv_7, grammarAccess.getServiceRequestAccess().getRightSquareBracketKeyword_5_2());
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:435:3: (otherlv_8= 'offered by' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'optional' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:435:5: otherlv_8= 'offered by' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= 'optional' )?
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleServiceRequest809); 

                        	newLeafNode(otherlv_8, grammarAccess.getServiceRequestAccess().getOfferedByKeyword_6_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:439:1: ( (otherlv_9= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:440:1: (otherlv_9= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:440:1: (otherlv_9= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:441:3: otherlv_9= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceRequestRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceRequest829); 

                    		newLeafNode(otherlv_9, grammarAccess.getServiceRequestAccess().getOfferedByProvidersResourcesProviderCrossReference_6_1_0()); 
                    	

                    }


                    }

                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:452:2: (otherlv_10= 'optional' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:452:4: otherlv_10= 'optional'
                            {
                            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleServiceRequest842); 

                                	newLeafNode(otherlv_10, grammarAccess.getServiceRequestAccess().getOptionalKeyword_6_2());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:456:5: (otherlv_11= 'settings' otherlv_12= '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* otherlv_14= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:456:7: otherlv_11= 'settings' otherlv_12= '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleServiceRequest859); 

                        	newLeafNode(otherlv_11, grammarAccess.getServiceRequestAccess().getSettingsKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleServiceRequest871); 

                        	newLeafNode(otherlv_12, grammarAccess.getServiceRequestAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:464:1: ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==34) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:465:1: (lv_reqServiceSettings_13_0= ruleServiceSettingInstance )
                    	    {
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:465:1: (lv_reqServiceSettings_13_0= ruleServiceSettingInstance )
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:466:3: lv_reqServiceSettings_13_0= ruleServiceSettingInstance
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getServiceRequestAccess().getReqServiceSettingsServiceSettingInstanceParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServiceSettingInstance_in_ruleServiceRequest892);
                    	    lv_reqServiceSettings_13_0=ruleServiceSettingInstance();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getServiceRequestRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reqServiceSettings",
                    	            		lv_reqServiceSettings_13_0, 
                    	            		"ServiceSettingInstance");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleServiceRequest905); 

                        	newLeafNode(otherlv_14, grammarAccess.getServiceRequestAccess().getRightCurlyBracketKeyword_7_3());
                        

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
    // $ANTLR end "ruleServiceRequest"


    // $ANTLR start "entryRuleScheduledPlan"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:494:1: entryRuleScheduledPlan returns [EObject current=null] : iv_ruleScheduledPlan= ruleScheduledPlan EOF ;
    public final EObject entryRuleScheduledPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduledPlan = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:495:2: (iv_ruleScheduledPlan= ruleScheduledPlan EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:496:2: iv_ruleScheduledPlan= ruleScheduledPlan EOF
            {
             newCompositeNode(grammarAccess.getScheduledPlanRule()); 
            pushFollow(FOLLOW_ruleScheduledPlan_in_entryRuleScheduledPlan943);
            iv_ruleScheduledPlan=ruleScheduledPlan();

            state._fsp--;

             current =iv_ruleScheduledPlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheduledPlan953); 

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
    // $ANTLR end "entryRuleScheduledPlan"


    // $ANTLR start "ruleScheduledPlan"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:503:1: ruleScheduledPlan returns [EObject current=null] : ( () otherlv_1= 'ScheduledPlan' otherlv_2= '{' (otherlv_3= 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? (otherlv_5= 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleScheduledPlan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ValidFrom_4_0 = null;

        AntlrDatatypeRuleToken lv_ValidUntil_6_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:506:28: ( ( () otherlv_1= 'ScheduledPlan' otherlv_2= '{' (otherlv_3= 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? (otherlv_5= 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? otherlv_7= '}' ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:507:1: ( () otherlv_1= 'ScheduledPlan' otherlv_2= '{' (otherlv_3= 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? (otherlv_5= 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? otherlv_7= '}' )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:507:1: ( () otherlv_1= 'ScheduledPlan' otherlv_2= '{' (otherlv_3= 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? (otherlv_5= 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? otherlv_7= '}' )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:507:2: () otherlv_1= 'ScheduledPlan' otherlv_2= '{' (otherlv_3= 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? (otherlv_5= 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? otherlv_7= '}'
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:507:2: ()
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:508:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getScheduledPlanAccess().getScheduledPlanAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleScheduledPlan999); 

                	newLeafNode(otherlv_1, grammarAccess.getScheduledPlanAccess().getScheduledPlanKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleScheduledPlan1011); 

                	newLeafNode(otherlv_2, grammarAccess.getScheduledPlanAccess().getLeftCurlyBracketKeyword_2());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:521:1: (otherlv_3= 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:521:3: otherlv_3= 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleScheduledPlan1024); 

                        	newLeafNode(otherlv_3, grammarAccess.getScheduledPlanAccess().getValidFromKeyword_3_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:525:1: ( (lv_ValidFrom_4_0= ruleEDate ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:526:1: (lv_ValidFrom_4_0= ruleEDate )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:526:1: (lv_ValidFrom_4_0= ruleEDate )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:527:3: lv_ValidFrom_4_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getScheduledPlanAccess().getValidFromEDateParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEDate_in_ruleScheduledPlan1045);
                    lv_ValidFrom_4_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScheduledPlanRule());
                    	        }
                           		set(
                           			current, 
                           			"ValidFrom",
                            		lv_ValidFrom_4_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:543:4: (otherlv_5= 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:543:6: otherlv_5= 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleScheduledPlan1060); 

                        	newLeafNode(otherlv_5, grammarAccess.getScheduledPlanAccess().getValidUntilKeyword_4_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:547:1: ( (lv_ValidUntil_6_0= ruleEDate ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:548:1: (lv_ValidUntil_6_0= ruleEDate )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:548:1: (lv_ValidUntil_6_0= ruleEDate )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:549:3: lv_ValidUntil_6_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getScheduledPlanAccess().getValidUntilEDateParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEDate_in_ruleScheduledPlan1081);
                    lv_ValidUntil_6_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScheduledPlanRule());
                    	        }
                           		set(
                           			current, 
                           			"ValidUntil",
                            		lv_ValidUntil_6_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleScheduledPlan1095); 

                	newLeafNode(otherlv_7, grammarAccess.getScheduledPlanAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleScheduledPlan"


    // $ANTLR start "entryRuleCredentials"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:577:1: entryRuleCredentials returns [EObject current=null] : iv_ruleCredentials= ruleCredentials EOF ;
    public final EObject entryRuleCredentials() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCredentials = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:578:2: (iv_ruleCredentials= ruleCredentials EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:579:2: iv_ruleCredentials= ruleCredentials EOF
            {
             newCompositeNode(grammarAccess.getCredentialsRule()); 
            pushFollow(FOLLOW_ruleCredentials_in_entryRuleCredentials1131);
            iv_ruleCredentials=ruleCredentials();

            state._fsp--;

             current =iv_ruleCredentials; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCredentials1141); 

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
    // $ANTLR end "entryRuleCredentials"


    // $ANTLR start "ruleCredentials"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:586:1: ruleCredentials returns [EObject current=null] : ( () otherlv_1= 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? (otherlv_10= 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleCredentials() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token lv_username_9_0=null;
        Token otherlv_10=null;
        Token lv_password_11_0=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:589:28: ( ( () otherlv_1= 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? (otherlv_10= 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:590:1: ( () otherlv_1= 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? (otherlv_10= 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:590:1: ( () otherlv_1= 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? (otherlv_10= 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:590:2: () otherlv_1= 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' (otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? (otherlv_10= 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:590:2: ()
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:591:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCredentialsAccess().getCredentialsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCredentials1187); 

                	newLeafNode(otherlv_1, grammarAccess.getCredentialsAccess().getCredentialsKeyword_1());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:600:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:601:1: (lv_name_2_0= RULE_STRING )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:601:1: (lv_name_2_0= RULE_STRING )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:602:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCredentials1204); 

            			newLeafNode(lv_name_2_0, grammarAccess.getCredentialsAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCredentialsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleCredentials1221); 

                	newLeafNode(otherlv_3, grammarAccess.getCredentialsAccess().getLeftCurlyBracketKeyword_3());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:622:1: (otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:622:3: otherlv_4= 'id' ( (lv_id_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleCredentials1234); 

                        	newLeafNode(otherlv_4, grammarAccess.getCredentialsAccess().getIdKeyword_4_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:626:1: ( (lv_id_5_0= RULE_INT ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:627:1: (lv_id_5_0= RULE_INT )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:627:1: (lv_id_5_0= RULE_INT )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:628:3: lv_id_5_0= RULE_INT
                    {
                    lv_id_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCredentials1251); 

                    			newLeafNode(lv_id_5_0, grammarAccess.getCredentialsAccess().getIdINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCredentialsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:644:4: (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:644:6: otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleCredentials1271); 

                        	newLeafNode(otherlv_6, grammarAccess.getCredentialsAccess().getDescriptionKeyword_5_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:648:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:649:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:649:1: (lv_description_7_0= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:650:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCredentials1288); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getCredentialsAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCredentialsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:666:4: (otherlv_8= 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:666:6: otherlv_8= 'UserName' ( (lv_username_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_32_in_ruleCredentials1308); 

                        	newLeafNode(otherlv_8, grammarAccess.getCredentialsAccess().getUserNameKeyword_6_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:670:1: ( (lv_username_9_0= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:671:1: (lv_username_9_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:671:1: (lv_username_9_0= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:672:3: lv_username_9_0= RULE_STRING
                    {
                    lv_username_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCredentials1325); 

                    			newLeafNode(lv_username_9_0, grammarAccess.getCredentialsAccess().getUsernameSTRINGTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCredentialsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"username",
                            		lv_username_9_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:688:4: (otherlv_10= 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:688:6: otherlv_10= 'PassWord' ( (lv_password_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_33_in_ruleCredentials1345); 

                        	newLeafNode(otherlv_10, grammarAccess.getCredentialsAccess().getPassWordKeyword_7_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:692:1: ( (lv_password_11_0= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:693:1: (lv_password_11_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:693:1: (lv_password_11_0= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:694:3: lv_password_11_0= RULE_STRING
                    {
                    lv_password_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCredentials1362); 

                    			newLeafNode(lv_password_11_0, grammarAccess.getCredentialsAccess().getPasswordSTRINGTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCredentialsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"password",
                            		lv_password_11_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleCredentials1381); 

                	newLeafNode(otherlv_12, grammarAccess.getCredentialsAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleCredentials"


    // $ANTLR start "entryRuleServiceSettingInstance"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:722:1: entryRuleServiceSettingInstance returns [EObject current=null] : iv_ruleServiceSettingInstance= ruleServiceSettingInstance EOF ;
    public final EObject entryRuleServiceSettingInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSettingInstance = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:723:2: (iv_ruleServiceSettingInstance= ruleServiceSettingInstance EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:724:2: iv_ruleServiceSettingInstance= ruleServiceSettingInstance EOF
            {
             newCompositeNode(grammarAccess.getServiceSettingInstanceRule()); 
            pushFollow(FOLLOW_ruleServiceSettingInstance_in_entryRuleServiceSettingInstance1417);
            iv_ruleServiceSettingInstance=ruleServiceSettingInstance();

            state._fsp--;

             current =iv_ruleServiceSettingInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceSettingInstance1427); 

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
    // $ANTLR end "entryRuleServiceSettingInstance"


    // $ANTLR start "ruleServiceSettingInstance"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:731:1: ruleServiceSettingInstance returns [EObject current=null] : (otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? ) ;
    public final EObject ruleServiceSettingInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token otherlv_4=null;
        Token lv_staticValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:734:28: ( (otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:735:1: (otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:735:1: (otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:735:3: otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleServiceSettingInstance1464); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceSettingInstanceAccess().getSettingKeyword_0());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:739:1: ( (otherlv_1= RULE_STRING ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:740:1: (otherlv_1= RULE_STRING )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:740:1: (otherlv_1= RULE_STRING )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:741:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceSettingInstanceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1484); 

            		newLeafNode(otherlv_1, grammarAccess.getServiceSettingInstanceAccess().getRefServiceSettingServiceSettingCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleServiceSettingInstance1496); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceSettingInstanceAccess().getColonKeyword_2());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:756:1: ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:757:1: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:757:1: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:758:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:758:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:759:3: lv_name_3_1= RULE_ID
                    {
                    lv_name_3_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceSettingInstance1515); 

                    			newLeafNode(lv_name_3_1, grammarAccess.getServiceSettingInstanceAccess().getNameIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceSettingInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:774:8: lv_name_3_2= RULE_STRING
                    {
                    lv_name_3_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1535); 

                    			newLeafNode(lv_name_3_2, grammarAccess.getServiceSettingInstanceAccess().getNameSTRINGTerminalRuleCall_3_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceSettingInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:792:2: (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:792:4: otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleServiceSettingInstance1556); 

                        	newLeafNode(otherlv_4, grammarAccess.getServiceSettingInstanceAccess().getEqualsSignKeyword_4_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:796:1: ( (lv_staticValue_5_0= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:797:1: (lv_staticValue_5_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:797:1: (lv_staticValue_5_0= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:798:3: lv_staticValue_5_0= RULE_STRING
                    {
                    lv_staticValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1573); 

                    			newLeafNode(lv_staticValue_5_0, grammarAccess.getServiceSettingInstanceAccess().getStaticValueSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceSettingInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"staticValue",
                            		lv_staticValue_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:814:4: (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:814:6: otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleServiceSettingInstance1593); 

                        	newLeafNode(otherlv_6, grammarAccess.getServiceSettingInstanceAccess().getAssignKeyword_5_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:818:1: ( (otherlv_7= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:819:1: (otherlv_7= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:819:1: (otherlv_7= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:820:3: otherlv_7= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceSettingInstanceRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1613); 

                    		newLeafNode(otherlv_7, grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_1_0()); 
                    	

                    }


                    }

                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:831:2: (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==38) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:831:4: otherlv_8= ',' ( (otherlv_9= RULE_STRING ) )
                    	    {
                    	    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleServiceSettingInstance1626); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getServiceSettingInstanceAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:835:1: ( (otherlv_9= RULE_STRING ) )
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:836:1: (otherlv_9= RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:836:1: (otherlv_9= RULE_STRING )
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:837:3: otherlv_9= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getServiceSettingInstanceRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1646); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


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
    // $ANTLR end "ruleServiceSettingInstance"


    // $ANTLR start "entryRuleInfrastructureRequest"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:856:1: entryRuleInfrastructureRequest returns [EObject current=null] : iv_ruleInfrastructureRequest= ruleInfrastructureRequest EOF ;
    public final EObject entryRuleInfrastructureRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructureRequest = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:857:2: (iv_ruleInfrastructureRequest= ruleInfrastructureRequest EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:858:2: iv_ruleInfrastructureRequest= ruleInfrastructureRequest EOF
            {
             newCompositeNode(grammarAccess.getInfrastructureRequestRule()); 
            pushFollow(FOLLOW_ruleInfrastructureRequest_in_entryRuleInfrastructureRequest1686);
            iv_ruleInfrastructureRequest=ruleInfrastructureRequest();

            state._fsp--;

             current =iv_ruleInfrastructureRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfrastructureRequest1696); 

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
    // $ANTLR end "entryRuleInfrastructureRequest"


    // $ANTLR start "ruleInfrastructureRequest"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:865:1: ruleInfrastructureRequest returns [EObject current=null] : ( () otherlv_1= 'RequestInfrastructure' otherlv_2= '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* otherlv_5= '}' ) ;
    public final EObject ruleInfrastructureRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_reqOfferedResources_3_0 = null;

        EObject lv_resourceGroups_4_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:868:28: ( ( () otherlv_1= 'RequestInfrastructure' otherlv_2= '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* otherlv_5= '}' ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:869:1: ( () otherlv_1= 'RequestInfrastructure' otherlv_2= '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* otherlv_5= '}' )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:869:1: ( () otherlv_1= 'RequestInfrastructure' otherlv_2= '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* otherlv_5= '}' )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:869:2: () otherlv_1= 'RequestInfrastructure' otherlv_2= '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* otherlv_5= '}'
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:869:2: ()
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:870:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInfrastructureRequestAccess().getInfrastructureRequestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleInfrastructureRequest1742); 

                	newLeafNode(otherlv_1, grammarAccess.getInfrastructureRequestAccess().getRequestInfrastructureKeyword_1());
                
            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleInfrastructureRequest1754); 

                	newLeafNode(otherlv_2, grammarAccess.getInfrastructureRequestAccess().getLeftCurlyBracketKeyword_2());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:883:1: ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:884:1: (lv_reqOfferedResources_3_0= ruleResourceRequest )
            	    {
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:884:1: (lv_reqOfferedResources_3_0= ruleResourceRequest )
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:885:3: lv_reqOfferedResources_3_0= ruleResourceRequest
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInfrastructureRequestAccess().getReqOfferedResourcesResourceRequestParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceRequest_in_ruleInfrastructureRequest1775);
            	    lv_reqOfferedResources_3_0=ruleResourceRequest();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInfrastructureRequestRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"reqOfferedResources",
            	            		lv_reqOfferedResources_3_0, 
            	            		"ResourceRequest");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:901:3: ( (lv_resourceGroups_4_0= ruleResourceGroup ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:902:1: (lv_resourceGroups_4_0= ruleResourceGroup )
            	    {
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:902:1: (lv_resourceGroups_4_0= ruleResourceGroup )
            	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:903:3: lv_resourceGroups_4_0= ruleResourceGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInfrastructureRequestAccess().getResourceGroupsResourceGroupParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceGroup_in_ruleInfrastructureRequest1797);
            	    lv_resourceGroups_4_0=ruleResourceGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInfrastructureRequestRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resourceGroups",
            	            		lv_resourceGroups_4_0, 
            	            		"ResourceGroup");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleInfrastructureRequest1810); 

                	newLeafNode(otherlv_5, grammarAccess.getInfrastructureRequestAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleInfrastructureRequest"


    // $ANTLR start "entryRuleResourceRequest"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:931:1: entryRuleResourceRequest returns [EObject current=null] : iv_ruleResourceRequest= ruleResourceRequest EOF ;
    public final EObject entryRuleResourceRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRequest = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:932:2: (iv_ruleResourceRequest= ruleResourceRequest EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:933:2: iv_ruleResourceRequest= ruleResourceRequest EOF
            {
             newCompositeNode(grammarAccess.getResourceRequestRule()); 
            pushFollow(FOLLOW_ruleResourceRequest_in_entryRuleResourceRequest1846);
            iv_ruleResourceRequest=ruleResourceRequest();

            state._fsp--;

             current =iv_ruleResourceRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceRequest1856); 

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
    // $ANTLR end "entryRuleResourceRequest"


    // $ANTLR start "ruleResourceRequest"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:940:1: ruleResourceRequest returns [EObject current=null] : (otherlv_0= 'Resource' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'settings' otherlv_5= '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleResourceRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_reqResourceSettings_6_0 = null;


         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:943:28: ( (otherlv_0= 'Resource' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'settings' otherlv_5= '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* otherlv_7= '}' )? ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:944:1: (otherlv_0= 'Resource' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'settings' otherlv_5= '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* otherlv_7= '}' )? )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:944:1: (otherlv_0= 'Resource' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'settings' otherlv_5= '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* otherlv_7= '}' )? )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:944:3: otherlv_0= 'Resource' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'settings' otherlv_5= '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* otherlv_7= '}' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleResourceRequest1893); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceRequestAccess().getResourceKeyword_0());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:948:1: ( (otherlv_1= RULE_STRING ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:949:1: (otherlv_1= RULE_STRING )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:949:1: (otherlv_1= RULE_STRING )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:950:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRequestRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceRequest1913); 

            		newLeafNode(otherlv_1, grammarAccess.getResourceRequestAccess().getRefOfferedResourceOfferedResourceCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleResourceRequest1925); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceRequestAccess().getAsKeyword_2());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:965:1: ( (lv_name_3_0= RULE_ID ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:966:1: (lv_name_3_0= RULE_ID )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:966:1: (lv_name_3_0= RULE_ID )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:967:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceRequest1942); 

            			newLeafNode(lv_name_3_0, grammarAccess.getResourceRequestAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRequestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:983:2: (otherlv_4= 'settings' otherlv_5= '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* otherlv_7= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:983:4: otherlv_4= 'settings' otherlv_5= '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleResourceRequest1960); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceRequestAccess().getSettingsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleResourceRequest1972); 

                        	newLeafNode(otherlv_5, grammarAccess.getResourceRequestAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:991:1: ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==34) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:992:1: (lv_reqResourceSettings_6_0= ruleResourceSettingInstance )
                    	    {
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:992:1: (lv_reqResourceSettings_6_0= ruleResourceSettingInstance )
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:993:3: lv_reqResourceSettings_6_0= ruleResourceSettingInstance
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceRequestAccess().getReqResourceSettingsResourceSettingInstanceParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResourceSettingInstance_in_ruleResourceRequest1993);
                    	    lv_reqResourceSettings_6_0=ruleResourceSettingInstance();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceRequestRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"reqResourceSettings",
                    	            		lv_reqResourceSettings_6_0, 
                    	            		"ResourceSettingInstance");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleResourceRequest2006); 

                        	newLeafNode(otherlv_7, grammarAccess.getResourceRequestAccess().getRightCurlyBracketKeyword_4_3());
                        

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
    // $ANTLR end "ruleResourceRequest"


    // $ANTLR start "entryRuleResourceGroup"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1021:1: entryRuleResourceGroup returns [EObject current=null] : iv_ruleResourceGroup= ruleResourceGroup EOF ;
    public final EObject entryRuleResourceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceGroup = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1022:2: (iv_ruleResourceGroup= ruleResourceGroup EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1023:2: iv_ruleResourceGroup= ruleResourceGroup EOF
            {
             newCompositeNode(grammarAccess.getResourceGroupRule()); 
            pushFollow(FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup2044);
            iv_ruleResourceGroup=ruleResourceGroup();

            state._fsp--;

             current =iv_ruleResourceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceGroup2054); 

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
    // $ANTLR end "entryRuleResourceGroup"


    // $ANTLR start "ruleResourceGroup"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1030:1: ruleResourceGroup returns [EObject current=null] : ( () otherlv_1= 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'refersResources' otherlv_4= '{' ( ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleResourceGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1033:28: ( ( () otherlv_1= 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'refersResources' otherlv_4= '{' ( ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* )? otherlv_8= '}' ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1034:1: ( () otherlv_1= 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'refersResources' otherlv_4= '{' ( ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* )? otherlv_8= '}' )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1034:1: ( () otherlv_1= 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'refersResources' otherlv_4= '{' ( ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* )? otherlv_8= '}' )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1034:2: () otherlv_1= 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'refersResources' otherlv_4= '{' ( ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* )? otherlv_8= '}'
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1034:2: ()
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1035:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResourceGroupAccess().getResourceGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleResourceGroup2100); 

                	newLeafNode(otherlv_1, grammarAccess.getResourceGroupAccess().getResourceGroupKeyword_1());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1044:1: ( (lv_name_2_0= RULE_ID ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1045:1: (lv_name_2_0= RULE_ID )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1045:1: (lv_name_2_0= RULE_ID )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1046:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceGroup2117); 

            			newLeafNode(lv_name_2_0, grammarAccess.getResourceGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleResourceGroup2134); 

                	newLeafNode(otherlv_3, grammarAccess.getResourceGroupAccess().getRefersResourcesKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleResourceGroup2146); 

                	newLeafNode(otherlv_4, grammarAccess.getResourceGroupAccess().getLeftCurlyBracketKeyword_4());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1070:1: ( ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1070:2: ( (otherlv_5= RULE_STRING ) ) (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )*
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1070:2: ( (otherlv_5= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1071:1: (otherlv_5= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1071:1: (otherlv_5= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1072:3: otherlv_5= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceGroupRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceGroup2167); 

                    		newLeafNode(otherlv_5, grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestCrossReference_5_0_0()); 
                    	

                    }


                    }

                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1083:2: (otherlv_6= ',' ( (otherlv_7= RULE_STRING ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==38) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1083:4: otherlv_6= ',' ( (otherlv_7= RULE_STRING ) )
                    	    {
                    	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleResourceGroup2180); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getResourceGroupAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1087:1: ( (otherlv_7= RULE_STRING ) )
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1088:1: (otherlv_7= RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1088:1: (otherlv_7= RULE_STRING )
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1089:3: otherlv_7= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getResourceGroupRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceGroup2200); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestCrossReference_5_1_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleResourceGroup2216); 

                	newLeafNode(otherlv_8, grammarAccess.getResourceGroupAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleResourceGroup"


    // $ANTLR start "entryRuleResourceSettingInstance"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1112:1: entryRuleResourceSettingInstance returns [EObject current=null] : iv_ruleResourceSettingInstance= ruleResourceSettingInstance EOF ;
    public final EObject entryRuleResourceSettingInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceSettingInstance = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1113:2: (iv_ruleResourceSettingInstance= ruleResourceSettingInstance EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1114:2: iv_ruleResourceSettingInstance= ruleResourceSettingInstance EOF
            {
             newCompositeNode(grammarAccess.getResourceSettingInstanceRule()); 
            pushFollow(FOLLOW_ruleResourceSettingInstance_in_entryRuleResourceSettingInstance2252);
            iv_ruleResourceSettingInstance=ruleResourceSettingInstance();

            state._fsp--;

             current =iv_ruleResourceSettingInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceSettingInstance2262); 

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
    // $ANTLR end "entryRuleResourceSettingInstance"


    // $ANTLR start "ruleResourceSettingInstance"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1121:1: ruleResourceSettingInstance returns [EObject current=null] : (otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? ) ;
    public final EObject ruleResourceSettingInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token otherlv_4=null;
        Token lv_staticValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1124:28: ( (otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1125:1: (otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1125:1: (otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )? )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1125:3: otherlv_0= 'Setting' ( (otherlv_1= RULE_STRING ) ) otherlv_2= ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleResourceSettingInstance2299); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceSettingInstanceAccess().getSettingKeyword_0());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1129:1: ( (otherlv_1= RULE_STRING ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1130:1: (otherlv_1= RULE_STRING )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1130:1: (otherlv_1= RULE_STRING )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1131:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceSettingInstanceRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2319); 

            		newLeafNode(otherlv_1, grammarAccess.getResourceSettingInstanceAccess().getRefResourceSettingResourceSettingCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleResourceSettingInstance2331); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceSettingInstanceAccess().getColonKeyword_2());
                
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1146:1: ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1147:1: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1147:1: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1148:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1148:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_STRING) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1149:3: lv_name_3_1= RULE_ID
                    {
                    lv_name_3_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceSettingInstance2350); 

                    			newLeafNode(lv_name_3_1, grammarAccess.getResourceSettingInstanceAccess().getNameIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceSettingInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1164:8: lv_name_3_2= RULE_STRING
                    {
                    lv_name_3_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2370); 

                    			newLeafNode(lv_name_3_2, grammarAccess.getResourceSettingInstanceAccess().getNameSTRINGTerminalRuleCall_3_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceSettingInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1182:2: (otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1182:4: otherlv_4= '=' ( (lv_staticValue_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleResourceSettingInstance2391); 

                        	newLeafNode(otherlv_4, grammarAccess.getResourceSettingInstanceAccess().getEqualsSignKeyword_4_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1186:1: ( (lv_staticValue_5_0= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1187:1: (lv_staticValue_5_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1187:1: (lv_staticValue_5_0= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1188:3: lv_staticValue_5_0= RULE_STRING
                    {
                    lv_staticValue_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2408); 

                    			newLeafNode(lv_staticValue_5_0, grammarAccess.getResourceSettingInstanceAccess().getStaticValueSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceSettingInstanceRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"staticValue",
                            		lv_staticValue_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1204:4: (otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1204:6: otherlv_6= 'assign' ( (otherlv_7= RULE_STRING ) ) (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleResourceSettingInstance2428); 

                        	newLeafNode(otherlv_6, grammarAccess.getResourceSettingInstanceAccess().getAssignKeyword_5_0());
                        
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1208:1: ( (otherlv_7= RULE_STRING ) )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1209:1: (otherlv_7= RULE_STRING )
                    {
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1209:1: (otherlv_7= RULE_STRING )
                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1210:3: otherlv_7= RULE_STRING
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getResourceSettingInstanceRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2448); 

                    		newLeafNode(otherlv_7, grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_1_0()); 
                    	

                    }


                    }

                    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1221:2: (otherlv_8= ',' ( (otherlv_9= RULE_STRING ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==38) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1221:4: otherlv_8= ',' ( (otherlv_9= RULE_STRING ) )
                    	    {
                    	    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleResourceSettingInstance2461); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getResourceSettingInstanceAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1225:1: ( (otherlv_9= RULE_STRING ) )
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1226:1: (otherlv_9= RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1226:1: (otherlv_9= RULE_STRING )
                    	    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1227:3: otherlv_9= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getResourceSettingInstanceRule());
                    	    	        }
                    	            
                    	    otherlv_9=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2481); 

                    	    		newLeafNode(otherlv_9, grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_2_1_0()); 
                    	    	

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
    // $ANTLR end "ruleResourceSettingInstance"


    // $ANTLR start "entryRuleEDate"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1246:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1247:2: (iv_ruleEDate= ruleEDate EOF )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1248:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_ruleEDate_in_entryRuleEDate2522);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDate2533); 

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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1255:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1258:28: (this_STRING_0= RULE_STRING )
            // ../gr.upatras.ece.nam.fsdl/src-gen/gr/upatras/ece/nam/fsdl/parser/antlr/internal/InternalFSDL.g:1259:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEDate2572); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleEDate"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRequestedFederationScenario_in_entryRuleRequestedFederationScenario75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestedFederationScenario85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRequestedFederationScenario131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestedFederationScenario148 = new BitSet(new long[]{0x000000800802F002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleRequestedFederationScenario174 = new BitSet(new long[]{0x000000800802F002L});
    public static final BitSet FOLLOW_12_in_ruleRequestedFederationScenario193 = new BitSet(new long[]{0x0000008008026002L});
    public static final BitSet FOLLOW_13_in_ruleRequestedFederationScenario220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequestedFederationScenario237 = new BitSet(new long[]{0x0000008008024002L});
    public static final BitSet FOLLOW_14_in_ruleRequestedFederationScenario257 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleCredentials_in_ruleRequestedFederationScenario278 = new BitSet(new long[]{0x0000008008020002L});
    public static final BitSet FOLLOW_ruleScheduledPlan_in_ruleRequestedFederationScenario301 = new BitSet(new long[]{0x0000008000020002L});
    public static final BitSet FOLLOW_ruleServicesRequest_in_ruleRequestedFederationScenario323 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureRequest_in_ruleRequestedFederationScenario345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport446 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImport463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicesRequest_in_entryRuleServicesRequest499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicesRequest509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleServicesRequest555 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleServicesRequest567 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleServiceRequest_in_ruleServicesRequest588 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleServicesRequest601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceRequest_in_entryRuleServiceRequest637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceRequest647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleServiceRequest693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceRequest713 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleServiceRequest725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceRequest742 = new BitSet(new long[]{0x0000000005400002L});
    public static final BitSet FOLLOW_22_in_ruleServiceRequest760 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceRequest777 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleServiceRequest794 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_24_in_ruleServiceRequest809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceRequest829 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleServiceRequest842 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleServiceRequest859 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleServiceRequest871 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_ruleServiceSettingInstance_in_ruleServiceRequest892 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleServiceRequest905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheduledPlan_in_entryRuleScheduledPlan943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheduledPlan953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleScheduledPlan999 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleScheduledPlan1011 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_28_in_ruleScheduledPlan1024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEDate_in_ruleScheduledPlan1045 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleScheduledPlan1060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEDate_in_ruleScheduledPlan1081 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScheduledPlan1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCredentials_in_entryRuleCredentials1131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCredentials1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCredentials1187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCredentials1204 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCredentials1221 = new BitSet(new long[]{0x00000003C0080000L});
    public static final BitSet FOLLOW_30_in_ruleCredentials1234 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCredentials1251 = new BitSet(new long[]{0x0000000380080000L});
    public static final BitSet FOLLOW_31_in_ruleCredentials1271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCredentials1288 = new BitSet(new long[]{0x0000000300080000L});
    public static final BitSet FOLLOW_32_in_ruleCredentials1308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCredentials1325 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_33_in_ruleCredentials1345 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCredentials1362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCredentials1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceSettingInstance_in_entryRuleServiceSettingInstance1417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceSettingInstance1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleServiceSettingInstance1464 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1484 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleServiceSettingInstance1496 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceSettingInstance1515 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1535 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleServiceSettingInstance1556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1573 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleServiceSettingInstance1593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1613 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleServiceSettingInstance1626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1646 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureRequest_in_entryRuleInfrastructureRequest1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfrastructureRequest1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInfrastructureRequest1742 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInfrastructureRequest1754 = new BitSet(new long[]{0x0000030000080000L});
    public static final BitSet FOLLOW_ruleResourceRequest_in_ruleInfrastructureRequest1775 = new BitSet(new long[]{0x0000030000080000L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_ruleInfrastructureRequest1797 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureRequest1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceRequest_in_entryRuleResourceRequest1846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceRequest1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleResourceRequest1893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceRequest1913 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResourceRequest1925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceRequest1942 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleResourceRequest1960 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceRequest1972 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_ruleResourceSettingInstance_in_ruleResourceRequest1993 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleResourceRequest2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup2044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceGroup2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleResourceGroup2100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceGroup2117 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleResourceGroup2134 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceGroup2146 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceGroup2167 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_38_in_ruleResourceGroup2180 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceGroup2200 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_19_in_ruleResourceGroup2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceSettingInstance_in_entryRuleResourceSettingInstance2252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceSettingInstance2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleResourceSettingInstance2299 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2319 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleResourceSettingInstance2331 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceSettingInstance2350 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2370 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleResourceSettingInstance2391 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2408 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleResourceSettingInstance2428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2448 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleResourceSettingInstance2461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2481 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleEDate_in_entryRuleEDate2522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDate2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEDate2572 = new BitSet(new long[]{0x0000000000000002L});

}