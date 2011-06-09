package org.panlab.software.fsdl.parser.antlr.internal; 

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
import org.panlab.software.fsdl.services.FSDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RequestedFederationScenario'", "'isShared'", "'Description'", "'Credentials'", "'import office'", "';'", "'RequestServices'", "'{'", "'}'", "'Service'", "'as'", "'[1..'", "']'", "'offered by'", "'optional'", "'settings'", "'ScheduledPlan'", "'ValidFrom'", "'ValidUntil'", "'id'", "'description'", "'UserName'", "'PassWord'", "'Setting'", "':'", "'='", "'assign'", "','", "'RequestInfrastructure'", "'Resource'", "'ResourceGroup'", "'refersResources'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalFSDLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g"; }



     	private FSDLGrammarAccess grammarAccess;
     	
        public InternalFSDLParser(TokenStream input, IAstFactory factory, FSDLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RequestedFederationScenario";	
       	}
       	
       	@Override
       	protected FSDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleRequestedFederationScenario
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:77:1: entryRuleRequestedFederationScenario returns [EObject current=null] : iv_ruleRequestedFederationScenario= ruleRequestedFederationScenario EOF ;
    public final EObject entryRuleRequestedFederationScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequestedFederationScenario = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:78:2: (iv_ruleRequestedFederationScenario= ruleRequestedFederationScenario EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:79:2: iv_ruleRequestedFederationScenario= ruleRequestedFederationScenario EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRequestedFederationScenarioRule(), currentNode); 
            pushFollow(FOLLOW_ruleRequestedFederationScenario_in_entryRuleRequestedFederationScenario75);
            iv_ruleRequestedFederationScenario=ruleRequestedFederationScenario();
            _fsp--;

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
    // $ANTLR end entryRuleRequestedFederationScenario


    // $ANTLR start ruleRequestedFederationScenario
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:86:1: ruleRequestedFederationScenario returns [EObject current=null] : ( () 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? ( 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? ( 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )? ) ;
    public final EObject ruleRequestedFederationScenario() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_isShared_4_0=null;
        Token lv_description_6_0=null;
        EObject lv_imports_3_0 = null;

        EObject lv_VTCredentials_8_0 = null;

        EObject lv_scheduledPlan_9_0 = null;

        EObject lv_servicesRequest_10_0 = null;

        EObject lv_infrastructureRequest_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:91:6: ( ( () 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? ( 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? ( 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )? ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:92:1: ( () 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? ( 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? ( 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )? )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:92:1: ( () 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? ( 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? ( 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )? )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:92:2: () 'RequestedFederationScenario' ( (lv_name_2_0= RULE_ID ) ) ( (lv_imports_3_0= ruleImport ) )* ( (lv_isShared_4_0= 'isShared' ) )? ( 'Description' ( (lv_description_6_0= RULE_STRING ) ) )? ( 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )? ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )? ( (lv_servicesRequest_10_0= ruleServicesRequest ) )? ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )?
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:92:2: ()
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:93:5: 
            {
             
                    temp=factory.create(grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,11,FOLLOW_11_in_ruleRequestedFederationScenario129); 

                    createLeafNode(grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioKeyword_1(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:107:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:108:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:108:1: (lv_name_2_0= RULE_ID )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:109:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequestedFederationScenario146); 

            			createLeafNode(grammarAccess.getRequestedFederationScenarioAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRequestedFederationScenarioRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:131:2: ( (lv_imports_3_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:132:1: (lv_imports_3_0= ruleImport )
            	    {
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:132:1: (lv_imports_3_0= ruleImport )
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:133:3: lv_imports_3_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getImportsImportParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleRequestedFederationScenario172);
            	    lv_imports_3_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRequestedFederationScenarioRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_3_0, 
            	    	        		"Import", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:155:3: ( (lv_isShared_4_0= 'isShared' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:156:1: (lv_isShared_4_0= 'isShared' )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:156:1: (lv_isShared_4_0= 'isShared' )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:157:3: lv_isShared_4_0= 'isShared'
                    {
                    lv_isShared_4_0=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleRequestedFederationScenario191); 

                            createLeafNode(grammarAccess.getRequestedFederationScenarioAccess().getIsSharedIsSharedKeyword_4_0(), "isShared"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestedFederationScenarioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isShared", true, "isShared", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:176:3: ( 'Description' ( (lv_description_6_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:176:5: 'Description' ( (lv_description_6_0= RULE_STRING ) )
                    {
                    match(input,13,FOLLOW_13_in_ruleRequestedFederationScenario216); 

                            createLeafNode(grammarAccess.getRequestedFederationScenarioAccess().getDescriptionKeyword_5_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:180:1: ( (lv_description_6_0= RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:181:1: (lv_description_6_0= RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:181:1: (lv_description_6_0= RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:182:3: lv_description_6_0= RULE_STRING
                    {
                    lv_description_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequestedFederationScenario233); 

                    			createLeafNode(grammarAccess.getRequestedFederationScenarioAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestedFederationScenarioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_6_0, 
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

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:204:4: ( 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:204:6: 'Credentials' ( (lv_VTCredentials_8_0= ruleCredentials ) )
                    {
                    match(input,14,FOLLOW_14_in_ruleRequestedFederationScenario251); 

                            createLeafNode(grammarAccess.getRequestedFederationScenarioAccess().getCredentialsKeyword_6_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:208:1: ( (lv_VTCredentials_8_0= ruleCredentials ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:209:1: (lv_VTCredentials_8_0= ruleCredentials )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:209:1: (lv_VTCredentials_8_0= ruleCredentials )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:210:3: lv_VTCredentials_8_0= ruleCredentials
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getVTCredentialsCredentialsParserRuleCall_6_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleCredentials_in_ruleRequestedFederationScenario272);
                    lv_VTCredentials_8_0=ruleCredentials();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestedFederationScenarioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"VTCredentials",
                    	        		lv_VTCredentials_8_0, 
                    	        		"Credentials", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:232:4: ( (lv_scheduledPlan_9_0= ruleScheduledPlan ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:233:1: (lv_scheduledPlan_9_0= ruleScheduledPlan )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:233:1: (lv_scheduledPlan_9_0= ruleScheduledPlan )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:234:3: lv_scheduledPlan_9_0= ruleScheduledPlan
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getScheduledPlanScheduledPlanParserRuleCall_7_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleScheduledPlan_in_ruleRequestedFederationScenario295);
                    lv_scheduledPlan_9_0=ruleScheduledPlan();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestedFederationScenarioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"scheduledPlan",
                    	        		lv_scheduledPlan_9_0, 
                    	        		"ScheduledPlan", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:256:3: ( (lv_servicesRequest_10_0= ruleServicesRequest ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:257:1: (lv_servicesRequest_10_0= ruleServicesRequest )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:257:1: (lv_servicesRequest_10_0= ruleServicesRequest )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:258:3: lv_servicesRequest_10_0= ruleServicesRequest
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getServicesRequestServicesRequestParserRuleCall_8_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleServicesRequest_in_ruleRequestedFederationScenario317);
                    lv_servicesRequest_10_0=ruleServicesRequest();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestedFederationScenarioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"servicesRequest",
                    	        		lv_servicesRequest_10_0, 
                    	        		"ServicesRequest", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:280:3: ( (lv_infrastructureRequest_11_0= ruleInfrastructureRequest ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==39) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:281:1: (lv_infrastructureRequest_11_0= ruleInfrastructureRequest )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:281:1: (lv_infrastructureRequest_11_0= ruleInfrastructureRequest )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:282:3: lv_infrastructureRequest_11_0= ruleInfrastructureRequest
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRequestedFederationScenarioAccess().getInfrastructureRequestInfrastructureRequestParserRuleCall_9_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleInfrastructureRequest_in_ruleRequestedFederationScenario339);
                    lv_infrastructureRequest_11_0=ruleInfrastructureRequest();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRequestedFederationScenarioRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"infrastructureRequest",
                    	        		lv_infrastructureRequest_11_0, 
                    	        		"InfrastructureRequest", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


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
    // $ANTLR end ruleRequestedFederationScenario


    // $ANTLR start entryRuleImport
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:312:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:313:2: (iv_ruleImport= ruleImport EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:314:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport376);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport386); 

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
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:321:1: ruleImport returns [EObject current=null] : ( 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:326:6: ( ( 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:327:1: ( 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:327:1: ( 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:327:3: 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';'
            {
            match(input,15,FOLLOW_15_in_ruleImport421); 

                    createLeafNode(grammarAccess.getImportAccess().getImportOfficeKeyword_0(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:331:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:332:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:332:1: (lv_importURI_1_0= RULE_STRING )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:333:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport438); 

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

            match(input,16,FOLLOW_16_in_ruleImport453); 

                    createLeafNode(grammarAccess.getImportAccess().getSemicolonKeyword_2(), null); 
                

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


    // $ANTLR start entryRuleServicesRequest
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:367:1: entryRuleServicesRequest returns [EObject current=null] : iv_ruleServicesRequest= ruleServicesRequest EOF ;
    public final EObject entryRuleServicesRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServicesRequest = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:368:2: (iv_ruleServicesRequest= ruleServicesRequest EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:369:2: iv_ruleServicesRequest= ruleServicesRequest EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServicesRequestRule(), currentNode); 
            pushFollow(FOLLOW_ruleServicesRequest_in_entryRuleServicesRequest489);
            iv_ruleServicesRequest=ruleServicesRequest();
            _fsp--;

             current =iv_ruleServicesRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicesRequest499); 

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
    // $ANTLR end entryRuleServicesRequest


    // $ANTLR start ruleServicesRequest
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:376:1: ruleServicesRequest returns [EObject current=null] : ( () 'RequestServices' '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* '}' ) ;
    public final EObject ruleServicesRequest() throws RecognitionException {
        EObject current = null;

        EObject lv_serviceRequestList_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:381:6: ( ( () 'RequestServices' '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* '}' ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:382:1: ( () 'RequestServices' '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* '}' )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:382:1: ( () 'RequestServices' '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* '}' )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:382:2: () 'RequestServices' '{' ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )* '}'
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:382:2: ()
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:383:5: 
            {
             
                    temp=factory.create(grammarAccess.getServicesRequestAccess().getServicesRequestAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getServicesRequestAccess().getServicesRequestAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,17,FOLLOW_17_in_ruleServicesRequest543); 

                    createLeafNode(grammarAccess.getServicesRequestAccess().getRequestServicesKeyword_1(), null); 
                
            match(input,18,FOLLOW_18_in_ruleServicesRequest553); 

                    createLeafNode(grammarAccess.getServicesRequestAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:401:1: ( (lv_serviceRequestList_3_0= ruleServiceRequest ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:402:1: (lv_serviceRequestList_3_0= ruleServiceRequest )
            	    {
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:402:1: (lv_serviceRequestList_3_0= ruleServiceRequest )
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:403:3: lv_serviceRequestList_3_0= ruleServiceRequest
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServicesRequestAccess().getServiceRequestListServiceRequestParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceRequest_in_ruleServicesRequest574);
            	    lv_serviceRequestList_3_0=ruleServiceRequest();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getServicesRequestRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"serviceRequestList",
            	    	        		lv_serviceRequestList_3_0, 
            	    	        		"ServiceRequest", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleServicesRequest585); 

                    createLeafNode(grammarAccess.getServicesRequestAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruleServicesRequest


    // $ANTLR start entryRuleServiceRequest
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:437:1: entryRuleServiceRequest returns [EObject current=null] : iv_ruleServiceRequest= ruleServiceRequest EOF ;
    public final EObject entryRuleServiceRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRequest = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:438:2: (iv_ruleServiceRequest= ruleServiceRequest EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:439:2: iv_ruleServiceRequest= ruleServiceRequest EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceRequestRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceRequest_in_entryRuleServiceRequest621);
            iv_ruleServiceRequest=ruleServiceRequest();
            _fsp--;

             current =iv_ruleServiceRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceRequest631); 

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
    // $ANTLR end entryRuleServiceRequest


    // $ANTLR start ruleServiceRequest
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:446:1: ruleServiceRequest returns [EObject current=null] : ( () 'Service' ( ( RULE_STRING ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) ']' )? ( 'offered by' ( ( RULE_STRING ) ) ( 'optional' )? )? ( 'settings' '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* '}' )? ) ;
    public final EObject ruleServiceRequest() throws RecognitionException {
        EObject current = null;

        Token lv_name_4_0=null;
        Token lv_numOfServices_6_0=null;
        EObject lv_reqServiceSettings_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:451:6: ( ( () 'Service' ( ( RULE_STRING ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) ']' )? ( 'offered by' ( ( RULE_STRING ) ) ( 'optional' )? )? ( 'settings' '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* '}' )? ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:452:1: ( () 'Service' ( ( RULE_STRING ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) ']' )? ( 'offered by' ( ( RULE_STRING ) ) ( 'optional' )? )? ( 'settings' '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* '}' )? )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:452:1: ( () 'Service' ( ( RULE_STRING ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) ']' )? ( 'offered by' ( ( RULE_STRING ) ) ( 'optional' )? )? ( 'settings' '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* '}' )? )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:452:2: () 'Service' ( ( RULE_STRING ) ) 'as' ( (lv_name_4_0= RULE_ID ) ) ( '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) ']' )? ( 'offered by' ( ( RULE_STRING ) ) ( 'optional' )? )? ( 'settings' '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* '}' )?
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:452:2: ()
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:453:5: 
            {
             
                    temp=factory.create(grammarAccess.getServiceRequestAccess().getServiceRequestAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getServiceRequestAccess().getServiceRequestAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,20,FOLLOW_20_in_ruleServiceRequest675); 

                    createLeafNode(grammarAccess.getServiceRequestAccess().getServiceKeyword_1(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:467:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:468:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:468:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:469:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getServiceRequestRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceRequest693); 

            		createLeafNode(grammarAccess.getServiceRequestAccess().getRefServiceServiceCrossReference_2_0(), "refService"); 
            	

            }


            }

            match(input,21,FOLLOW_21_in_ruleServiceRequest703); 

                    createLeafNode(grammarAccess.getServiceRequestAccess().getAsKeyword_3(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:485:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:486:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:486:1: (lv_name_4_0= RULE_ID )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:487:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceRequest720); 

            			createLeafNode(grammarAccess.getServiceRequestAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceRequestRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_4_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:509:2: ( '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:509:4: '[1..' ( (lv_numOfServices_6_0= RULE_INT ) ) ']'
                    {
                    match(input,22,FOLLOW_22_in_ruleServiceRequest736); 

                            createLeafNode(grammarAccess.getServiceRequestAccess().getLeftSquareBracketDigitOneFullStopFullStopKeyword_5_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:513:1: ( (lv_numOfServices_6_0= RULE_INT ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:514:1: (lv_numOfServices_6_0= RULE_INT )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:514:1: (lv_numOfServices_6_0= RULE_INT )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:515:3: lv_numOfServices_6_0= RULE_INT
                    {
                    lv_numOfServices_6_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleServiceRequest753); 

                    			createLeafNode(grammarAccess.getServiceRequestAccess().getNumOfServicesINTTerminalRuleCall_5_1_0(), "numOfServices"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceRequestRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"numOfServices",
                    	        		lv_numOfServices_6_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,23,FOLLOW_23_in_ruleServiceRequest768); 

                            createLeafNode(grammarAccess.getServiceRequestAccess().getRightSquareBracketKeyword_5_2(), null); 
                        

                    }
                    break;

            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:541:3: ( 'offered by' ( ( RULE_STRING ) ) ( 'optional' )? )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:541:5: 'offered by' ( ( RULE_STRING ) ) ( 'optional' )?
                    {
                    match(input,24,FOLLOW_24_in_ruleServiceRequest781); 

                            createLeafNode(grammarAccess.getServiceRequestAccess().getOfferedByKeyword_6_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:545:1: ( ( RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:546:1: ( RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:546:1: ( RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:547:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceRequestRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceRequest799); 

                    		createLeafNode(grammarAccess.getServiceRequestAccess().getOfferedByProvidersResourcesProviderCrossReference_6_1_0(), "OfferedByProviders"); 
                    	

                    }


                    }

                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:559:2: ( 'optional' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:559:4: 'optional'
                            {
                            match(input,25,FOLLOW_25_in_ruleServiceRequest810); 

                                    createLeafNode(grammarAccess.getServiceRequestAccess().getOptionalKeyword_6_2(), null); 
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:563:5: ( 'settings' '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:563:7: 'settings' '{' ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )* '}'
                    {
                    match(input,26,FOLLOW_26_in_ruleServiceRequest825); 

                            createLeafNode(grammarAccess.getServiceRequestAccess().getSettingsKeyword_7_0(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleServiceRequest835); 

                            createLeafNode(grammarAccess.getServiceRequestAccess().getLeftCurlyBracketKeyword_7_1(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:571:1: ( (lv_reqServiceSettings_13_0= ruleServiceSettingInstance ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==34) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:572:1: (lv_reqServiceSettings_13_0= ruleServiceSettingInstance )
                    	    {
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:572:1: (lv_reqServiceSettings_13_0= ruleServiceSettingInstance )
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:573:3: lv_reqServiceSettings_13_0= ruleServiceSettingInstance
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getServiceRequestAccess().getReqServiceSettingsServiceSettingInstanceParserRuleCall_7_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleServiceSettingInstance_in_ruleServiceRequest856);
                    	    lv_reqServiceSettings_13_0=ruleServiceSettingInstance();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getServiceRequestRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"reqServiceSettings",
                    	    	        		lv_reqServiceSettings_13_0, 
                    	    	        		"ServiceSettingInstance", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleServiceRequest867); 

                            createLeafNode(grammarAccess.getServiceRequestAccess().getRightCurlyBracketKeyword_7_3(), null); 
                        

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
    // $ANTLR end ruleServiceRequest


    // $ANTLR start entryRuleScheduledPlan
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:607:1: entryRuleScheduledPlan returns [EObject current=null] : iv_ruleScheduledPlan= ruleScheduledPlan EOF ;
    public final EObject entryRuleScheduledPlan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduledPlan = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:608:2: (iv_ruleScheduledPlan= ruleScheduledPlan EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:609:2: iv_ruleScheduledPlan= ruleScheduledPlan EOF
            {
             currentNode = createCompositeNode(grammarAccess.getScheduledPlanRule(), currentNode); 
            pushFollow(FOLLOW_ruleScheduledPlan_in_entryRuleScheduledPlan905);
            iv_ruleScheduledPlan=ruleScheduledPlan();
            _fsp--;

             current =iv_ruleScheduledPlan; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheduledPlan915); 

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
    // $ANTLR end entryRuleScheduledPlan


    // $ANTLR start ruleScheduledPlan
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:616:1: ruleScheduledPlan returns [EObject current=null] : ( () 'ScheduledPlan' '{' ( 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? ( 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? '}' ) ;
    public final EObject ruleScheduledPlan() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_ValidFrom_4_0 = null;

        AntlrDatatypeRuleToken lv_ValidUntil_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:621:6: ( ( () 'ScheduledPlan' '{' ( 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? ( 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? '}' ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:622:1: ( () 'ScheduledPlan' '{' ( 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? ( 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? '}' )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:622:1: ( () 'ScheduledPlan' '{' ( 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? ( 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? '}' )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:622:2: () 'ScheduledPlan' '{' ( 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )? ( 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )? '}'
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:622:2: ()
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:623:5: 
            {
             
                    temp=factory.create(grammarAccess.getScheduledPlanAccess().getScheduledPlanAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getScheduledPlanAccess().getScheduledPlanAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,27,FOLLOW_27_in_ruleScheduledPlan959); 

                    createLeafNode(grammarAccess.getScheduledPlanAccess().getScheduledPlanKeyword_1(), null); 
                
            match(input,18,FOLLOW_18_in_ruleScheduledPlan969); 

                    createLeafNode(grammarAccess.getScheduledPlanAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:641:1: ( 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:641:3: 'ValidFrom' ( (lv_ValidFrom_4_0= ruleEDate ) )
                    {
                    match(input,28,FOLLOW_28_in_ruleScheduledPlan980); 

                            createLeafNode(grammarAccess.getScheduledPlanAccess().getValidFromKeyword_3_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:645:1: ( (lv_ValidFrom_4_0= ruleEDate ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:646:1: (lv_ValidFrom_4_0= ruleEDate )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:646:1: (lv_ValidFrom_4_0= ruleEDate )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:647:3: lv_ValidFrom_4_0= ruleEDate
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getScheduledPlanAccess().getValidFromEDateParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEDate_in_ruleScheduledPlan1001);
                    lv_ValidFrom_4_0=ruleEDate();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getScheduledPlanRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ValidFrom",
                    	        		lv_ValidFrom_4_0, 
                    	        		"EDate", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:669:4: ( 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:669:6: 'ValidUntil' ( (lv_ValidUntil_6_0= ruleEDate ) )
                    {
                    match(input,29,FOLLOW_29_in_ruleScheduledPlan1014); 

                            createLeafNode(grammarAccess.getScheduledPlanAccess().getValidUntilKeyword_4_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:673:1: ( (lv_ValidUntil_6_0= ruleEDate ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:674:1: (lv_ValidUntil_6_0= ruleEDate )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:674:1: (lv_ValidUntil_6_0= ruleEDate )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:675:3: lv_ValidUntil_6_0= ruleEDate
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getScheduledPlanAccess().getValidUntilEDateParserRuleCall_4_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleEDate_in_ruleScheduledPlan1035);
                    lv_ValidUntil_6_0=ruleEDate();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getScheduledPlanRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ValidUntil",
                    	        		lv_ValidUntil_6_0, 
                    	        		"EDate", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleScheduledPlan1047); 

                    createLeafNode(grammarAccess.getScheduledPlanAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleScheduledPlan


    // $ANTLR start entryRuleCredentials
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:709:1: entryRuleCredentials returns [EObject current=null] : iv_ruleCredentials= ruleCredentials EOF ;
    public final EObject entryRuleCredentials() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCredentials = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:710:2: (iv_ruleCredentials= ruleCredentials EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:711:2: iv_ruleCredentials= ruleCredentials EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCredentialsRule(), currentNode); 
            pushFollow(FOLLOW_ruleCredentials_in_entryRuleCredentials1083);
            iv_ruleCredentials=ruleCredentials();
            _fsp--;

             current =iv_ruleCredentials; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCredentials1093); 

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
    // $ANTLR end entryRuleCredentials


    // $ANTLR start ruleCredentials
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:718:1: ruleCredentials returns [EObject current=null] : ( () 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_5_0= RULE_INT ) ) )? ( 'description' ( (lv_description_7_0= RULE_STRING ) ) )? ( 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? ( 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? '}' ) ;
    public final EObject ruleCredentials() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_id_5_0=null;
        Token lv_description_7_0=null;
        Token lv_username_9_0=null;
        Token lv_password_11_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:723:6: ( ( () 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_5_0= RULE_INT ) ) )? ( 'description' ( (lv_description_7_0= RULE_STRING ) ) )? ( 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? ( 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? '}' ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:724:1: ( () 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_5_0= RULE_INT ) ) )? ( 'description' ( (lv_description_7_0= RULE_STRING ) ) )? ( 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? ( 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? '}' )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:724:1: ( () 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_5_0= RULE_INT ) ) )? ( 'description' ( (lv_description_7_0= RULE_STRING ) ) )? ( 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? ( 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? '}' )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:724:2: () 'Credentials' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_5_0= RULE_INT ) ) )? ( 'description' ( (lv_description_7_0= RULE_STRING ) ) )? ( 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )? ( 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )? '}'
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:724:2: ()
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:725:5: 
            {
             
                    temp=factory.create(grammarAccess.getCredentialsAccess().getCredentialsAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCredentialsAccess().getCredentialsAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,14,FOLLOW_14_in_ruleCredentials1137); 

                    createLeafNode(grammarAccess.getCredentialsAccess().getCredentialsKeyword_1(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:739:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:740:1: (lv_name_2_0= RULE_STRING )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:740:1: (lv_name_2_0= RULE_STRING )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:741:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCredentials1154); 

            			createLeafNode(grammarAccess.getCredentialsAccess().getNameSTRINGTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getCredentialsRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleCredentials1169); 

                    createLeafNode(grammarAccess.getCredentialsAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:767:1: ( 'id' ( (lv_id_5_0= RULE_INT ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:767:3: 'id' ( (lv_id_5_0= RULE_INT ) )
                    {
                    match(input,30,FOLLOW_30_in_ruleCredentials1180); 

                            createLeafNode(grammarAccess.getCredentialsAccess().getIdKeyword_4_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:771:1: ( (lv_id_5_0= RULE_INT ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:772:1: (lv_id_5_0= RULE_INT )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:772:1: (lv_id_5_0= RULE_INT )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:773:3: lv_id_5_0= RULE_INT
                    {
                    lv_id_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCredentials1197); 

                    			createLeafNode(grammarAccess.getCredentialsAccess().getIdINTTerminalRuleCall_4_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCredentialsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_5_0, 
                    	        		"INT", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:795:4: ( 'description' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:795:6: 'description' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    match(input,31,FOLLOW_31_in_ruleCredentials1215); 

                            createLeafNode(grammarAccess.getCredentialsAccess().getDescriptionKeyword_5_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:799:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:800:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:800:1: (lv_description_7_0= RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:801:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCredentials1232); 

                    			createLeafNode(grammarAccess.getCredentialsAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCredentialsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_7_0, 
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

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:823:4: ( 'UserName' ( (lv_username_9_0= RULE_STRING ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:823:6: 'UserName' ( (lv_username_9_0= RULE_STRING ) )
                    {
                    match(input,32,FOLLOW_32_in_ruleCredentials1250); 

                            createLeafNode(grammarAccess.getCredentialsAccess().getUserNameKeyword_6_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:827:1: ( (lv_username_9_0= RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:828:1: (lv_username_9_0= RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:828:1: (lv_username_9_0= RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:829:3: lv_username_9_0= RULE_STRING
                    {
                    lv_username_9_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCredentials1267); 

                    			createLeafNode(grammarAccess.getCredentialsAccess().getUsernameSTRINGTerminalRuleCall_6_1_0(), "username"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCredentialsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"username",
                    	        		lv_username_9_0, 
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

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:851:4: ( 'PassWord' ( (lv_password_11_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:851:6: 'PassWord' ( (lv_password_11_0= RULE_STRING ) )
                    {
                    match(input,33,FOLLOW_33_in_ruleCredentials1285); 

                            createLeafNode(grammarAccess.getCredentialsAccess().getPassWordKeyword_7_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:855:1: ( (lv_password_11_0= RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:856:1: (lv_password_11_0= RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:856:1: (lv_password_11_0= RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:857:3: lv_password_11_0= RULE_STRING
                    {
                    lv_password_11_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCredentials1302); 

                    			createLeafNode(grammarAccess.getCredentialsAccess().getPasswordSTRINGTerminalRuleCall_7_1_0(), "password"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCredentialsRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"password",
                    	        		lv_password_11_0, 
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

            match(input,19,FOLLOW_19_in_ruleCredentials1319); 

                    createLeafNode(grammarAccess.getCredentialsAccess().getRightCurlyBracketKeyword_8(), null); 
                

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
    // $ANTLR end ruleCredentials


    // $ANTLR start entryRuleServiceSettingInstance
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:891:1: entryRuleServiceSettingInstance returns [EObject current=null] : iv_ruleServiceSettingInstance= ruleServiceSettingInstance EOF ;
    public final EObject entryRuleServiceSettingInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSettingInstance = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:892:2: (iv_ruleServiceSettingInstance= ruleServiceSettingInstance EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:893:2: iv_ruleServiceSettingInstance= ruleServiceSettingInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceSettingInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleServiceSettingInstance_in_entryRuleServiceSettingInstance1355);
            iv_ruleServiceSettingInstance=ruleServiceSettingInstance();
            _fsp--;

             current =iv_ruleServiceSettingInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceSettingInstance1365); 

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
    // $ANTLR end entryRuleServiceSettingInstance


    // $ANTLR start ruleServiceSettingInstance
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:900:1: ruleServiceSettingInstance returns [EObject current=null] : ( 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? ) ;
    public final EObject ruleServiceSettingInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token lv_staticValue_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:905:6: ( ( 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:906:1: ( 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:906:1: ( 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:906:3: 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )?
            {
            match(input,34,FOLLOW_34_in_ruleServiceSettingInstance1400); 

                    createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getSettingKeyword_0(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:910:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:911:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:911:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:912:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getServiceSettingInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1418); 

            		createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getRefServiceSettingServiceSettingCrossReference_1_0(), "refServiceSetting"); 
            	

            }


            }

            match(input,35,FOLLOW_35_in_ruleServiceSettingInstance1428); 

                    createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getColonKeyword_2(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:928:1: ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:929:1: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:929:1: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:930:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:930:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
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
                    new NoViableAltException("930:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:931:3: lv_name_3_1= RULE_ID
                    {
                    lv_name_3_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceSettingInstance1447); 

                    			createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getNameIDTerminalRuleCall_3_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_3_1, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:952:8: lv_name_3_2= RULE_STRING
                    {
                    lv_name_3_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1467); 

                    			createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getNameSTRINGTerminalRuleCall_3_0_1(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_3_2, 
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

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:976:2: ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:976:4: '=' ( (lv_staticValue_5_0= RULE_STRING ) )
                    {
                    match(input,36,FOLLOW_36_in_ruleServiceSettingInstance1486); 

                            createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getEqualsSignKeyword_4_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:980:1: ( (lv_staticValue_5_0= RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:981:1: (lv_staticValue_5_0= RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:981:1: (lv_staticValue_5_0= RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:982:3: lv_staticValue_5_0= RULE_STRING
                    {
                    lv_staticValue_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1503); 

                    			createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getStaticValueSTRINGTerminalRuleCall_4_1_0(), "staticValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"staticValue",
                    	        		lv_staticValue_5_0, 
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

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1004:4: ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1004:6: 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )*
                    {
                    match(input,37,FOLLOW_37_in_ruleServiceSettingInstance1521); 

                            createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getAssignKeyword_5_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1008:1: ( ( RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1009:1: ( RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1009:1: ( RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1010:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1539); 

                    		createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_1_0(), "assignSetting"); 
                    	

                    }


                    }

                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1022:2: ( ',' ( ( RULE_STRING ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==38) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1022:4: ',' ( ( RULE_STRING ) )
                    	    {
                    	    match(input,38,FOLLOW_38_in_ruleServiceSettingInstance1550); 

                    	            createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getCommaKeyword_5_2_0(), null); 
                    	        
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1026:1: ( ( RULE_STRING ) )
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1027:1: ( RULE_STRING )
                    	    {
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1027:1: ( RULE_STRING )
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1028:3: RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getServiceSettingInstanceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1568); 

                    	    		createLeafNode(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_2_1_0(), "assignSetting"); 
                    	    	

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
    // $ANTLR end ruleServiceSettingInstance


    // $ANTLR start entryRuleInfrastructureRequest
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1048:1: entryRuleInfrastructureRequest returns [EObject current=null] : iv_ruleInfrastructureRequest= ruleInfrastructureRequest EOF ;
    public final EObject entryRuleInfrastructureRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfrastructureRequest = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1049:2: (iv_ruleInfrastructureRequest= ruleInfrastructureRequest EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1050:2: iv_ruleInfrastructureRequest= ruleInfrastructureRequest EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInfrastructureRequestRule(), currentNode); 
            pushFollow(FOLLOW_ruleInfrastructureRequest_in_entryRuleInfrastructureRequest1608);
            iv_ruleInfrastructureRequest=ruleInfrastructureRequest();
            _fsp--;

             current =iv_ruleInfrastructureRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfrastructureRequest1618); 

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
    // $ANTLR end entryRuleInfrastructureRequest


    // $ANTLR start ruleInfrastructureRequest
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1057:1: ruleInfrastructureRequest returns [EObject current=null] : ( () 'RequestInfrastructure' '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* '}' ) ;
    public final EObject ruleInfrastructureRequest() throws RecognitionException {
        EObject current = null;

        EObject lv_reqOfferedResources_3_0 = null;

        EObject lv_resourceGroups_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1062:6: ( ( () 'RequestInfrastructure' '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* '}' ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1063:1: ( () 'RequestInfrastructure' '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* '}' )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1063:1: ( () 'RequestInfrastructure' '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* '}' )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1063:2: () 'RequestInfrastructure' '{' ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )* ( (lv_resourceGroups_4_0= ruleResourceGroup ) )* '}'
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1063:2: ()
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1064:5: 
            {
             
                    temp=factory.create(grammarAccess.getInfrastructureRequestAccess().getInfrastructureRequestAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getInfrastructureRequestAccess().getInfrastructureRequestAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,39,FOLLOW_39_in_ruleInfrastructureRequest1662); 

                    createLeafNode(grammarAccess.getInfrastructureRequestAccess().getRequestInfrastructureKeyword_1(), null); 
                
            match(input,18,FOLLOW_18_in_ruleInfrastructureRequest1672); 

                    createLeafNode(grammarAccess.getInfrastructureRequestAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1082:1: ( (lv_reqOfferedResources_3_0= ruleResourceRequest ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1083:1: (lv_reqOfferedResources_3_0= ruleResourceRequest )
            	    {
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1083:1: (lv_reqOfferedResources_3_0= ruleResourceRequest )
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1084:3: lv_reqOfferedResources_3_0= ruleResourceRequest
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInfrastructureRequestAccess().getReqOfferedResourcesResourceRequestParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceRequest_in_ruleInfrastructureRequest1693);
            	    lv_reqOfferedResources_3_0=ruleResourceRequest();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInfrastructureRequestRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"reqOfferedResources",
            	    	        		lv_reqOfferedResources_3_0, 
            	    	        		"ResourceRequest", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1106:3: ( (lv_resourceGroups_4_0= ruleResourceGroup ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1107:1: (lv_resourceGroups_4_0= ruleResourceGroup )
            	    {
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1107:1: (lv_resourceGroups_4_0= ruleResourceGroup )
            	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1108:3: lv_resourceGroups_4_0= ruleResourceGroup
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInfrastructureRequestAccess().getResourceGroupsResourceGroupParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceGroup_in_ruleInfrastructureRequest1715);
            	    lv_resourceGroups_4_0=ruleResourceGroup();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInfrastructureRequestRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"resourceGroups",
            	    	        		lv_resourceGroups_4_0, 
            	    	        		"ResourceGroup", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match(input,19,FOLLOW_19_in_ruleInfrastructureRequest1726); 

                    createLeafNode(grammarAccess.getInfrastructureRequestAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleInfrastructureRequest


    // $ANTLR start entryRuleResourceRequest
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1142:1: entryRuleResourceRequest returns [EObject current=null] : iv_ruleResourceRequest= ruleResourceRequest EOF ;
    public final EObject entryRuleResourceRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRequest = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1143:2: (iv_ruleResourceRequest= ruleResourceRequest EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1144:2: iv_ruleResourceRequest= ruleResourceRequest EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceRequestRule(), currentNode); 
            pushFollow(FOLLOW_ruleResourceRequest_in_entryRuleResourceRequest1762);
            iv_ruleResourceRequest=ruleResourceRequest();
            _fsp--;

             current =iv_ruleResourceRequest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceRequest1772); 

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
    // $ANTLR end entryRuleResourceRequest


    // $ANTLR start ruleResourceRequest
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1151:1: ruleResourceRequest returns [EObject current=null] : ( 'Resource' ( ( RULE_STRING ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ( 'settings' '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* '}' )? ) ;
    public final EObject ruleResourceRequest() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        EObject lv_reqResourceSettings_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1156:6: ( ( 'Resource' ( ( RULE_STRING ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ( 'settings' '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* '}' )? ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1157:1: ( 'Resource' ( ( RULE_STRING ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ( 'settings' '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* '}' )? )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1157:1: ( 'Resource' ( ( RULE_STRING ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ( 'settings' '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* '}' )? )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1157:3: 'Resource' ( ( RULE_STRING ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ( 'settings' '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* '}' )?
            {
            match(input,40,FOLLOW_40_in_ruleResourceRequest1807); 

                    createLeafNode(grammarAccess.getResourceRequestAccess().getResourceKeyword_0(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1161:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1162:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1162:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1163:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getResourceRequestRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceRequest1825); 

            		createLeafNode(grammarAccess.getResourceRequestAccess().getRefOfferedResourceOfferedResourceCrossReference_1_0(), "refOfferedResource"); 
            	

            }


            }

            match(input,21,FOLLOW_21_in_ruleResourceRequest1835); 

                    createLeafNode(grammarAccess.getResourceRequestAccess().getAsKeyword_2(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1179:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1180:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1180:1: (lv_name_3_0= RULE_ID )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1181:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceRequest1852); 

            			createLeafNode(grammarAccess.getResourceRequestAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceRequestRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1203:2: ( 'settings' '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1203:4: 'settings' '{' ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )* '}'
                    {
                    match(input,26,FOLLOW_26_in_ruleResourceRequest1868); 

                            createLeafNode(grammarAccess.getResourceRequestAccess().getSettingsKeyword_4_0(), null); 
                        
                    match(input,18,FOLLOW_18_in_ruleResourceRequest1878); 

                            createLeafNode(grammarAccess.getResourceRequestAccess().getLeftCurlyBracketKeyword_4_1(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1211:1: ( (lv_reqResourceSettings_6_0= ruleResourceSettingInstance ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==34) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1212:1: (lv_reqResourceSettings_6_0= ruleResourceSettingInstance )
                    	    {
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1212:1: (lv_reqResourceSettings_6_0= ruleResourceSettingInstance )
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1213:3: lv_reqResourceSettings_6_0= ruleResourceSettingInstance
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getResourceRequestAccess().getReqResourceSettingsResourceSettingInstanceParserRuleCall_4_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleResourceSettingInstance_in_ruleResourceRequest1899);
                    	    lv_reqResourceSettings_6_0=ruleResourceSettingInstance();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getResourceRequestRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"reqResourceSettings",
                    	    	        		lv_reqResourceSettings_6_0, 
                    	    	        		"ResourceSettingInstance", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,19,FOLLOW_19_in_ruleResourceRequest1910); 

                            createLeafNode(grammarAccess.getResourceRequestAccess().getRightCurlyBracketKeyword_4_3(), null); 
                        

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
    // $ANTLR end ruleResourceRequest


    // $ANTLR start entryRuleResourceGroup
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1247:1: entryRuleResourceGroup returns [EObject current=null] : iv_ruleResourceGroup= ruleResourceGroup EOF ;
    public final EObject entryRuleResourceGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceGroup = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1248:2: (iv_ruleResourceGroup= ruleResourceGroup EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1249:2: iv_ruleResourceGroup= ruleResourceGroup EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceGroupRule(), currentNode); 
            pushFollow(FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup1948);
            iv_ruleResourceGroup=ruleResourceGroup();
            _fsp--;

             current =iv_ruleResourceGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceGroup1958); 

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
    // $ANTLR end entryRuleResourceGroup


    // $ANTLR start ruleResourceGroup
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1256:1: ruleResourceGroup returns [EObject current=null] : ( () 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) 'refersResources' '{' ( ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? '}' ) ;
    public final EObject ruleResourceGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1261:6: ( ( () 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) 'refersResources' '{' ( ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? '}' ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1262:1: ( () 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) 'refersResources' '{' ( ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? '}' )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1262:1: ( () 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) 'refersResources' '{' ( ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? '}' )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1262:2: () 'ResourceGroup' ( (lv_name_2_0= RULE_ID ) ) 'refersResources' '{' ( ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? '}'
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1262:2: ()
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1263:5: 
            {
             
                    temp=factory.create(grammarAccess.getResourceGroupAccess().getResourceGroupAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getResourceGroupAccess().getResourceGroupAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,41,FOLLOW_41_in_ruleResourceGroup2002); 

                    createLeafNode(grammarAccess.getResourceGroupAccess().getResourceGroupKeyword_1(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1277:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1278:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1278:1: (lv_name_2_0= RULE_ID )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1279:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceGroup2019); 

            			createLeafNode(grammarAccess.getResourceGroupAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getResourceGroupRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,42,FOLLOW_42_in_ruleResourceGroup2034); 

                    createLeafNode(grammarAccess.getResourceGroupAccess().getRefersResourcesKeyword_3(), null); 
                
            match(input,18,FOLLOW_18_in_ruleResourceGroup2044); 

                    createLeafNode(grammarAccess.getResourceGroupAccess().getLeftCurlyBracketKeyword_4(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1309:1: ( ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1309:2: ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )*
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1309:2: ( ( RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1310:1: ( RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1310:1: ( RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1311:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceGroupRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceGroup2063); 

                    		createLeafNode(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestCrossReference_5_0_0(), "groupedResources"); 
                    	

                    }


                    }

                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1323:2: ( ',' ( ( RULE_STRING ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==38) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1323:4: ',' ( ( RULE_STRING ) )
                    	    {
                    	    match(input,38,FOLLOW_38_in_ruleResourceGroup2074); 

                    	            createLeafNode(grammarAccess.getResourceGroupAccess().getCommaKeyword_5_1_0(), null); 
                    	        
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1327:1: ( ( RULE_STRING ) )
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1328:1: ( RULE_STRING )
                    	    {
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1328:1: ( RULE_STRING )
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1329:3: RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getResourceGroupRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceGroup2092); 

                    	    		createLeafNode(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestCrossReference_5_1_1_0(), "groupedResources"); 
                    	    	

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

            match(input,19,FOLLOW_19_in_ruleResourceGroup2106); 

                    createLeafNode(grammarAccess.getResourceGroupAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruleResourceGroup


    // $ANTLR start entryRuleResourceSettingInstance
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1353:1: entryRuleResourceSettingInstance returns [EObject current=null] : iv_ruleResourceSettingInstance= ruleResourceSettingInstance EOF ;
    public final EObject entryRuleResourceSettingInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceSettingInstance = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1354:2: (iv_ruleResourceSettingInstance= ruleResourceSettingInstance EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1355:2: iv_ruleResourceSettingInstance= ruleResourceSettingInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getResourceSettingInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleResourceSettingInstance_in_entryRuleResourceSettingInstance2142);
            iv_ruleResourceSettingInstance=ruleResourceSettingInstance();
            _fsp--;

             current =iv_ruleResourceSettingInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceSettingInstance2152); 

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
    // $ANTLR end entryRuleResourceSettingInstance


    // $ANTLR start ruleResourceSettingInstance
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1362:1: ruleResourceSettingInstance returns [EObject current=null] : ( 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? ) ;
    public final EObject ruleResourceSettingInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token lv_staticValue_5_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1367:6: ( ( 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1368:1: ( 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1368:1: ( 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )? )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1368:3: 'Setting' ( ( RULE_STRING ) ) ':' ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) ) ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )? ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )?
            {
            match(input,34,FOLLOW_34_in_ruleResourceSettingInstance2187); 

                    createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getSettingKeyword_0(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1372:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1373:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1373:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1374:3: RULE_STRING
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getResourceSettingInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2205); 

            		createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getRefResourceSettingResourceSettingCrossReference_1_0(), "refResourceSetting"); 
            	

            }


            }

            match(input,35,FOLLOW_35_in_ruleResourceSettingInstance2215); 

                    createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getColonKeyword_2(), null); 
                
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1390:1: ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1391:1: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1391:1: ( (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING ) )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1392:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
            {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1392:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )
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
                    new NoViableAltException("1392:1: (lv_name_3_1= RULE_ID | lv_name_3_2= RULE_STRING )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1393:3: lv_name_3_1= RULE_ID
                    {
                    lv_name_3_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceSettingInstance2234); 

                    			createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getNameIDTerminalRuleCall_3_0_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceSettingInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_3_1, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;
                case 2 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1414:8: lv_name_3_2= RULE_STRING
                    {
                    lv_name_3_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2254); 

                    			createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getNameSTRINGTerminalRuleCall_3_0_1(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceSettingInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_3_2, 
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

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1438:2: ( '=' ( (lv_staticValue_5_0= RULE_STRING ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1438:4: '=' ( (lv_staticValue_5_0= RULE_STRING ) )
                    {
                    match(input,36,FOLLOW_36_in_ruleResourceSettingInstance2273); 

                            createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getEqualsSignKeyword_4_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1442:1: ( (lv_staticValue_5_0= RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1443:1: (lv_staticValue_5_0= RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1443:1: (lv_staticValue_5_0= RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1444:3: lv_staticValue_5_0= RULE_STRING
                    {
                    lv_staticValue_5_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2290); 

                    			createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getStaticValueSTRINGTerminalRuleCall_4_1_0(), "staticValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceSettingInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"staticValue",
                    	        		lv_staticValue_5_0, 
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

            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1466:4: ( 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1466:6: 'assign' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )*
                    {
                    match(input,37,FOLLOW_37_in_ruleResourceSettingInstance2308); 

                            createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getAssignKeyword_5_0(), null); 
                        
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1470:1: ( ( RULE_STRING ) )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1471:1: ( RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1471:1: ( RULE_STRING )
                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1472:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getResourceSettingInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2326); 

                    		createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_1_0(), "assignSetting"); 
                    	

                    }


                    }

                    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1484:2: ( ',' ( ( RULE_STRING ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==38) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1484:4: ',' ( ( RULE_STRING ) )
                    	    {
                    	    match(input,38,FOLLOW_38_in_ruleResourceSettingInstance2337); 

                    	            createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getCommaKeyword_5_2_0(), null); 
                    	        
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1488:1: ( ( RULE_STRING ) )
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1489:1: ( RULE_STRING )
                    	    {
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1489:1: ( RULE_STRING )
                    	    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1490:3: RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getResourceSettingInstanceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2355); 

                    	    		createLeafNode(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_2_1_0(), "assignSetting"); 
                    	    	

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
    // $ANTLR end ruleResourceSettingInstance


    // $ANTLR start entryRuleEDate
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1510:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1511:2: (iv_ruleEDate= ruleEDate EOF )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1512:2: iv_ruleEDate= ruleEDate EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEDateRule(), currentNode); 
            pushFollow(FOLLOW_ruleEDate_in_entryRuleEDate2396);
            iv_ruleEDate=ruleEDate();
            _fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDate2407); 

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
    // $ANTLR end entryRuleEDate


    // $ANTLR start ruleEDate
    // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1519:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1524:6: (this_STRING_0= RULE_STRING )
            // ../org.panlab.software.fsdl/src-gen/org/panlab/software/fsdl/parser/antlr/internal/InternalFSDL.g:1525:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEDate2446); 

            		current.merge(this_STRING_0);
                
             
                createLeafNode(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall(), null); 
                

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
    // $ANTLR end ruleEDate


 

    public static final BitSet FOLLOW_ruleRequestedFederationScenario_in_entryRuleRequestedFederationScenario75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestedFederationScenario85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRequestedFederationScenario129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequestedFederationScenario146 = new BitSet(new long[]{0x000000800802F002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleRequestedFederationScenario172 = new BitSet(new long[]{0x000000800802F002L});
    public static final BitSet FOLLOW_12_in_ruleRequestedFederationScenario191 = new BitSet(new long[]{0x0000008008026002L});
    public static final BitSet FOLLOW_13_in_ruleRequestedFederationScenario216 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequestedFederationScenario233 = new BitSet(new long[]{0x0000008008024002L});
    public static final BitSet FOLLOW_14_in_ruleRequestedFederationScenario251 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleCredentials_in_ruleRequestedFederationScenario272 = new BitSet(new long[]{0x0000008008020002L});
    public static final BitSet FOLLOW_ruleScheduledPlan_in_ruleRequestedFederationScenario295 = new BitSet(new long[]{0x0000008000020002L});
    public static final BitSet FOLLOW_ruleServicesRequest_in_ruleRequestedFederationScenario317 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureRequest_in_ruleRequestedFederationScenario339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImport421 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport438 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImport453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicesRequest_in_entryRuleServicesRequest489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicesRequest499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleServicesRequest543 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleServicesRequest553 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleServiceRequest_in_ruleServicesRequest574 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleServicesRequest585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceRequest_in_entryRuleServiceRequest621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceRequest631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleServiceRequest675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceRequest693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleServiceRequest703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceRequest720 = new BitSet(new long[]{0x0000000005400002L});
    public static final BitSet FOLLOW_22_in_ruleServiceRequest736 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleServiceRequest753 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleServiceRequest768 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_24_in_ruleServiceRequest781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceRequest799 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_25_in_ruleServiceRequest810 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleServiceRequest825 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleServiceRequest835 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_ruleServiceSettingInstance_in_ruleServiceRequest856 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleServiceRequest867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheduledPlan_in_entryRuleScheduledPlan905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheduledPlan915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleScheduledPlan959 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleScheduledPlan969 = new BitSet(new long[]{0x0000000030080000L});
    public static final BitSet FOLLOW_28_in_ruleScheduledPlan980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEDate_in_ruleScheduledPlan1001 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleScheduledPlan1014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleEDate_in_ruleScheduledPlan1035 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleScheduledPlan1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCredentials_in_entryRuleCredentials1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCredentials1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleCredentials1137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCredentials1154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCredentials1169 = new BitSet(new long[]{0x00000003C0080000L});
    public static final BitSet FOLLOW_30_in_ruleCredentials1180 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCredentials1197 = new BitSet(new long[]{0x0000000380080000L});
    public static final BitSet FOLLOW_31_in_ruleCredentials1215 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCredentials1232 = new BitSet(new long[]{0x0000000300080000L});
    public static final BitSet FOLLOW_32_in_ruleCredentials1250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCredentials1267 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_33_in_ruleCredentials1285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCredentials1302 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCredentials1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceSettingInstance_in_entryRuleServiceSettingInstance1355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceSettingInstance1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleServiceSettingInstance1400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1418 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleServiceSettingInstance1428 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceSettingInstance1447 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1467 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleServiceSettingInstance1486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1503 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleServiceSettingInstance1521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1539 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleServiceSettingInstance1550 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSettingInstance1568 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureRequest_in_entryRuleInfrastructureRequest1608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfrastructureRequest1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInfrastructureRequest1662 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInfrastructureRequest1672 = new BitSet(new long[]{0x0000030000080000L});
    public static final BitSet FOLLOW_ruleResourceRequest_in_ruleInfrastructureRequest1693 = new BitSet(new long[]{0x0000030000080000L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_ruleInfrastructureRequest1715 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_19_in_ruleInfrastructureRequest1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceRequest_in_entryRuleResourceRequest1762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceRequest1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleResourceRequest1807 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceRequest1825 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResourceRequest1835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceRequest1852 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleResourceRequest1868 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceRequest1878 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_ruleResourceSettingInstance_in_ruleResourceRequest1899 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_19_in_ruleResourceRequest1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup1948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceGroup1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleResourceGroup2002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceGroup2019 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleResourceGroup2034 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResourceGroup2044 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceGroup2063 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_38_in_ruleResourceGroup2074 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceGroup2092 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_19_in_ruleResourceGroup2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceSettingInstance_in_entryRuleResourceSettingInstance2142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceSettingInstance2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleResourceSettingInstance2187 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2205 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleResourceSettingInstance2215 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceSettingInstance2234 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2254 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleResourceSettingInstance2273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2290 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleResourceSettingInstance2308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2326 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleResourceSettingInstance2337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResourceSettingInstance2355 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleEDate_in_entryRuleEDate2396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDate2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEDate2446 = new BitSet(new long[]{0x0000000000000002L});

}