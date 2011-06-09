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
import gr.upatras.ece.wcl.services.SDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import office'", "';'", "'userExposed'", "'userEditable'", "'canBePublished'", "'ServiceSetting'", "'{'", "'id'", "'description'", "'Readable'", "'Writable'", "'requiresParams'", "'('", "','", "')'", "'settingType'", "'}'", "'OfferedService'", "'serviceSettings'", "'true'", "'false'", "'STRING'", "'defaultValue'", "'Enum'", "'tideEnumlist'", "'tideTypeEnumItem'", "'value'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalSDLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g"; }



     	private SDLGrammarAccess grammarAccess;
     	
        public InternalSDLParser(TokenStream input, IAstFactory factory, SDLGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ServiceRule";	
       	}
       	
       	@Override
       	protected SDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleServiceRule
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:77:1: entryRuleServiceRule returns [EObject current=null] : iv_ruleServiceRule= ruleServiceRule EOF ;
    public final EObject entryRuleServiceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceRule = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:78:2: (iv_ruleServiceRule= ruleServiceRule EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:79:2: iv_ruleServiceRule= ruleServiceRule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceRuleRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceRule_in_entryRuleServiceRule75);
            iv_ruleServiceRule=ruleServiceRule();
            _fsp--;

             current =iv_ruleServiceRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServiceRule85); 

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
    // $ANTLR end entryRuleServiceRule


    // $ANTLR start ruleServiceRule
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:86:1: ruleServiceRule returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_offeredService_2_0= ruleOfferedService ) ) ) ;
    public final EObject ruleServiceRule() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_offeredService_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:91:6: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_offeredService_2_0= ruleOfferedService ) ) ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:92:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_offeredService_2_0= ruleOfferedService ) ) )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:92:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_offeredService_2_0= ruleOfferedService ) ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:92:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_offeredService_2_0= ruleOfferedService ) )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:92:2: ()
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:93:5: 
            {
             
                    temp=factory.create(grammarAccess.getServiceRuleAccess().getServiceRuleAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getServiceRuleAccess().getServiceRuleAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:103:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:104:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:104:1: (lv_imports_1_0= ruleImport )
            	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:105:3: lv_imports_1_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getServiceRuleAccess().getImportsImportParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleImport_in_ruleServiceRule140);
            	    lv_imports_1_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getServiceRuleRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_1_0, 
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

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:127:3: ( (lv_offeredService_2_0= ruleOfferedService ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:128:1: (lv_offeredService_2_0= ruleOfferedService )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:128:1: (lv_offeredService_2_0= ruleOfferedService )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:129:3: lv_offeredService_2_0= ruleOfferedService
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getServiceRuleAccess().getOfferedServiceOfferedServiceParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOfferedService_in_ruleServiceRule162);
            lv_offeredService_2_0=ruleOfferedService();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceRuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"offeredService",
            	        		lv_offeredService_2_0, 
            	        		"OfferedService", 
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
    // $ANTLR end ruleServiceRule


    // $ANTLR start entryRuleImport
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:159:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:160:2: (iv_ruleImport= ruleImport EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:161:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport198);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport208); 

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
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:168:1: ruleImport returns [EObject current=null] : ( 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:173:6: ( ( 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';' ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:174:1: ( 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:174:1: ( 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';' )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:174:3: 'import office' ( (lv_importURI_1_0= RULE_STRING ) ) ';'
            {
            match(input,11,FollowSets000.FOLLOW_11_in_ruleImport243); 

                    createLeafNode(grammarAccess.getImportAccess().getImportOfficeKeyword_0(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:178:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:179:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:179:1: (lv_importURI_1_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:180:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImport260); 

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

            match(input,12,FollowSets000.FOLLOW_12_in_ruleImport275); 

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


    // $ANTLR start entryRuleSettingType
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:216:1: entryRuleSettingType returns [EObject current=null] : iv_ruleSettingType= ruleSettingType EOF ;
    public final EObject entryRuleSettingType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSettingType = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:217:2: (iv_ruleSettingType= ruleSettingType EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:218:2: iv_ruleSettingType= ruleSettingType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSettingTypeRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleSettingType_in_entryRuleSettingType313);
            iv_ruleSettingType=ruleSettingType();
            _fsp--;

             current =iv_ruleSettingType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSettingType323); 

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
    // $ANTLR end entryRuleSettingType


    // $ANTLR start ruleSettingType
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:225:1: ruleSettingType returns [EObject current=null] : (this_tideTypeSTRING_0= ruletideTypeSTRING | this_tideTypeEnum_1= ruletideTypeEnum ) ;
    public final EObject ruleSettingType() throws RecognitionException {
        EObject current = null;

        EObject this_tideTypeSTRING_0 = null;

        EObject this_tideTypeEnum_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:230:6: ( (this_tideTypeSTRING_0= ruletideTypeSTRING | this_tideTypeEnum_1= ruletideTypeEnum ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:231:1: (this_tideTypeSTRING_0= ruletideTypeSTRING | this_tideTypeEnum_1= ruletideTypeEnum )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:231:1: (this_tideTypeSTRING_0= ruletideTypeSTRING | this_tideTypeEnum_1= ruletideTypeEnum )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==32) ) {
                alt2=1;
            }
            else if ( (LA2_0==34) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("231:1: (this_tideTypeSTRING_0= ruletideTypeSTRING | this_tideTypeEnum_1= ruletideTypeEnum )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:232:5: this_tideTypeSTRING_0= ruletideTypeSTRING
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSettingTypeAccess().getTideTypeSTRINGParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruletideTypeSTRING_in_ruleSettingType370);
                    this_tideTypeSTRING_0=ruletideTypeSTRING();
                    _fsp--;

                     
                            current = this_tideTypeSTRING_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:242:5: this_tideTypeEnum_1= ruletideTypeEnum
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getSettingTypeAccess().getTideTypeEnumParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruletideTypeEnum_in_ruleSettingType397);
                    this_tideTypeEnum_1=ruletideTypeEnum();
                    _fsp--;

                     
                            current = this_tideTypeEnum_1; 
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
    // $ANTLR end ruleSettingType


    // $ANTLR start entryRuleServiceSetting
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:258:1: entryRuleServiceSetting returns [EObject current=null] : iv_ruleServiceSetting= ruleServiceSetting EOF ;
    public final EObject entryRuleServiceSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSetting = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:259:2: (iv_ruleServiceSetting= ruleServiceSetting EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:260:2: iv_ruleServiceSetting= ruleServiceSetting EOF
            {
             currentNode = createCompositeNode(grammarAccess.getServiceSettingRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceSetting_in_entryRuleServiceSetting432);
            iv_ruleServiceSetting=ruleServiceSetting();
            _fsp--;

             current =iv_ruleServiceSetting; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServiceSetting442); 

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
    // $ANTLR end entryRuleServiceSetting


    // $ANTLR start ruleServiceSetting
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:267:1: ruleServiceSetting returns [EObject current=null] : ( () ( (lv_userExposed_1_0= 'userExposed' ) )? ( (lv_userEditable_2_0= 'userEditable' ) )? ( (lv_canBePublished_3_0= 'canBePublished' ) )? 'ServiceSetting' ( (lv_name_5_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_8_0= RULE_INT ) ) )? ( 'description' ( (lv_description_10_0= RULE_STRING ) ) )? ( 'Readable' ( (lv_Readable_12_0= ruleEBoolean ) ) )? ( 'Writable' ( (lv_Writable_14_0= ruleEBoolean ) ) )? ( 'requiresParams' '(' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* ')' )? ( 'settingType' ( (lv_settingType_22_0= ruleSettingType ) ) )? '}' ) ;
    public final EObject ruleServiceSetting() throws RecognitionException {
        EObject current = null;

        Token lv_userExposed_1_0=null;
        Token lv_userEditable_2_0=null;
        Token lv_canBePublished_3_0=null;
        Token lv_name_5_0=null;
        Token lv_id_8_0=null;
        Token lv_description_10_0=null;
        AntlrDatatypeRuleToken lv_Readable_12_0 = null;

        AntlrDatatypeRuleToken lv_Writable_14_0 = null;

        EObject lv_settingType_22_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:272:6: ( ( () ( (lv_userExposed_1_0= 'userExposed' ) )? ( (lv_userEditable_2_0= 'userEditable' ) )? ( (lv_canBePublished_3_0= 'canBePublished' ) )? 'ServiceSetting' ( (lv_name_5_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_8_0= RULE_INT ) ) )? ( 'description' ( (lv_description_10_0= RULE_STRING ) ) )? ( 'Readable' ( (lv_Readable_12_0= ruleEBoolean ) ) )? ( 'Writable' ( (lv_Writable_14_0= ruleEBoolean ) ) )? ( 'requiresParams' '(' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* ')' )? ( 'settingType' ( (lv_settingType_22_0= ruleSettingType ) ) )? '}' ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:273:1: ( () ( (lv_userExposed_1_0= 'userExposed' ) )? ( (lv_userEditable_2_0= 'userEditable' ) )? ( (lv_canBePublished_3_0= 'canBePublished' ) )? 'ServiceSetting' ( (lv_name_5_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_8_0= RULE_INT ) ) )? ( 'description' ( (lv_description_10_0= RULE_STRING ) ) )? ( 'Readable' ( (lv_Readable_12_0= ruleEBoolean ) ) )? ( 'Writable' ( (lv_Writable_14_0= ruleEBoolean ) ) )? ( 'requiresParams' '(' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* ')' )? ( 'settingType' ( (lv_settingType_22_0= ruleSettingType ) ) )? '}' )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:273:1: ( () ( (lv_userExposed_1_0= 'userExposed' ) )? ( (lv_userEditable_2_0= 'userEditable' ) )? ( (lv_canBePublished_3_0= 'canBePublished' ) )? 'ServiceSetting' ( (lv_name_5_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_8_0= RULE_INT ) ) )? ( 'description' ( (lv_description_10_0= RULE_STRING ) ) )? ( 'Readable' ( (lv_Readable_12_0= ruleEBoolean ) ) )? ( 'Writable' ( (lv_Writable_14_0= ruleEBoolean ) ) )? ( 'requiresParams' '(' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* ')' )? ( 'settingType' ( (lv_settingType_22_0= ruleSettingType ) ) )? '}' )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:273:2: () ( (lv_userExposed_1_0= 'userExposed' ) )? ( (lv_userEditable_2_0= 'userEditable' ) )? ( (lv_canBePublished_3_0= 'canBePublished' ) )? 'ServiceSetting' ( (lv_name_5_0= RULE_STRING ) ) '{' ( 'id' ( (lv_id_8_0= RULE_INT ) ) )? ( 'description' ( (lv_description_10_0= RULE_STRING ) ) )? ( 'Readable' ( (lv_Readable_12_0= ruleEBoolean ) ) )? ( 'Writable' ( (lv_Writable_14_0= ruleEBoolean ) ) )? ( 'requiresParams' '(' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* ')' )? ( 'settingType' ( (lv_settingType_22_0= ruleSettingType ) ) )? '}'
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:273:2: ()
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:274:5: 
            {
             
                    temp=factory.create(grammarAccess.getServiceSettingAccess().getServiceSettingAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getServiceSettingAccess().getServiceSettingAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:284:2: ( (lv_userExposed_1_0= 'userExposed' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:285:1: (lv_userExposed_1_0= 'userExposed' )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:285:1: (lv_userExposed_1_0= 'userExposed' )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:286:3: lv_userExposed_1_0= 'userExposed'
                    {
                    lv_userExposed_1_0=(Token)input.LT(1);
                    match(input,13,FollowSets000.FOLLOW_13_in_ruleServiceSetting494); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getUserExposedUserExposedKeyword_1_0(), "userExposed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "userExposed", true, "userExposed", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:305:3: ( (lv_userEditable_2_0= 'userEditable' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:306:1: (lv_userEditable_2_0= 'userEditable' )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:306:1: (lv_userEditable_2_0= 'userEditable' )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:307:3: lv_userEditable_2_0= 'userEditable'
                    {
                    lv_userEditable_2_0=(Token)input.LT(1);
                    match(input,14,FollowSets000.FOLLOW_14_in_ruleServiceSetting526); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getUserEditableUserEditableKeyword_2_0(), "userEditable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "userEditable", true, "userEditable", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:326:3: ( (lv_canBePublished_3_0= 'canBePublished' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:327:1: (lv_canBePublished_3_0= 'canBePublished' )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:327:1: (lv_canBePublished_3_0= 'canBePublished' )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:328:3: lv_canBePublished_3_0= 'canBePublished'
                    {
                    lv_canBePublished_3_0=(Token)input.LT(1);
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleServiceSetting558); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getCanBePublishedCanBePublishedKeyword_3_0(), "canBePublished"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "canBePublished", true, "canBePublished", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleServiceSetting582); 

                    createLeafNode(grammarAccess.getServiceSettingAccess().getServiceSettingKeyword_4(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:351:1: ( (lv_name_5_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:352:1: (lv_name_5_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:352:1: (lv_name_5_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:353:3: lv_name_5_0= RULE_STRING
            {
            lv_name_5_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleServiceSetting599); 

            			createLeafNode(grammarAccess.getServiceSettingAccess().getNameSTRINGTerminalRuleCall_5_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_5_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,17,FollowSets000.FOLLOW_17_in_ruleServiceSetting614); 

                    createLeafNode(grammarAccess.getServiceSettingAccess().getLeftCurlyBracketKeyword_6(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:379:1: ( 'id' ( (lv_id_8_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:379:3: 'id' ( (lv_id_8_0= RULE_INT ) )
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleServiceSetting625); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getIdKeyword_7_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:383:1: ( (lv_id_8_0= RULE_INT ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:384:1: (lv_id_8_0= RULE_INT )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:384:1: (lv_id_8_0= RULE_INT )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:385:3: lv_id_8_0= RULE_INT
                    {
                    lv_id_8_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleServiceSetting642); 

                    			createLeafNode(grammarAccess.getServiceSettingAccess().getIdINTTerminalRuleCall_7_1_0(), "id"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"id",
                    	        		lv_id_8_0, 
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

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:407:4: ( 'description' ( (lv_description_10_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:407:6: 'description' ( (lv_description_10_0= RULE_STRING ) )
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleServiceSetting660); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getDescriptionKeyword_8_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:411:1: ( (lv_description_10_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:412:1: (lv_description_10_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:412:1: (lv_description_10_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:413:3: lv_description_10_0= RULE_STRING
                    {
                    lv_description_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleServiceSetting677); 

                    			createLeafNode(grammarAccess.getServiceSettingAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0(), "description"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"description",
                    	        		lv_description_10_0, 
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

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:435:4: ( 'Readable' ( (lv_Readable_12_0= ruleEBoolean ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:435:6: 'Readable' ( (lv_Readable_12_0= ruleEBoolean ) )
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_ruleServiceSetting695); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getReadableKeyword_9_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:439:1: ( (lv_Readable_12_0= ruleEBoolean ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:440:1: (lv_Readable_12_0= ruleEBoolean )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:440:1: (lv_Readable_12_0= ruleEBoolean )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:441:3: lv_Readable_12_0= ruleEBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getServiceSettingAccess().getReadableEBooleanParserRuleCall_9_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleServiceSetting716);
                    lv_Readable_12_0=ruleEBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"Readable",
                    	        		lv_Readable_12_0, 
                    	        		"EBoolean", 
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

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:463:4: ( 'Writable' ( (lv_Writable_14_0= ruleEBoolean ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:463:6: 'Writable' ( (lv_Writable_14_0= ruleEBoolean ) )
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleServiceSetting729); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getWritableKeyword_10_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:467:1: ( (lv_Writable_14_0= ruleEBoolean ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:468:1: (lv_Writable_14_0= ruleEBoolean )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:468:1: (lv_Writable_14_0= ruleEBoolean )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:469:3: lv_Writable_14_0= ruleEBoolean
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getServiceSettingAccess().getWritableEBooleanParserRuleCall_10_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleServiceSetting750);
                    lv_Writable_14_0=ruleEBoolean();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"Writable",
                    	        		lv_Writable_14_0, 
                    	        		"EBoolean", 
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

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:491:4: ( 'requiresParams' '(' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:491:6: 'requiresParams' '(' ( ( RULE_STRING ) ) ( ',' ( ( RULE_STRING ) ) )* ')'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleServiceSetting763); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getRequiresParamsKeyword_11_0(), null); 
                        
                    match(input,23,FollowSets000.FOLLOW_23_in_ruleServiceSetting773); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getLeftParenthesisKeyword_11_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:499:1: ( ( RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:500:1: ( RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:500:1: ( RULE_STRING )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:501:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleServiceSetting791); 

                    		createLeafNode(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingCrossReference_11_2_0(), "requiresParams"); 
                    	

                    }


                    }

                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:513:2: ( ',' ( ( RULE_STRING ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:513:4: ',' ( ( RULE_STRING ) )
                    	    {
                    	    match(input,24,FollowSets000.FOLLOW_24_in_ruleServiceSetting802); 

                    	            createLeafNode(grammarAccess.getServiceSettingAccess().getCommaKeyword_11_3_0(), null); 
                    	        
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:517:1: ( ( RULE_STRING ) )
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:518:1: ( RULE_STRING )
                    	    {
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:518:1: ( RULE_STRING )
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:519:3: RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	            
                    	    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleServiceSetting820); 

                    	    		createLeafNode(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingCrossReference_11_3_1_0(), "requiresParams"); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match(input,25,FollowSets000.FOLLOW_25_in_ruleServiceSetting832); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getRightParenthesisKeyword_11_4(), null); 
                        

                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:535:3: ( 'settingType' ( (lv_settingType_22_0= ruleSettingType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:535:5: 'settingType' ( (lv_settingType_22_0= ruleSettingType ) )
                    {
                    match(input,26,FollowSets000.FOLLOW_26_in_ruleServiceSetting845); 

                            createLeafNode(grammarAccess.getServiceSettingAccess().getSettingTypeKeyword_12_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:539:1: ( (lv_settingType_22_0= ruleSettingType ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:540:1: (lv_settingType_22_0= ruleSettingType )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:540:1: (lv_settingType_22_0= ruleSettingType )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:541:3: lv_settingType_22_0= ruleSettingType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getServiceSettingAccess().getSettingTypeSettingTypeParserRuleCall_12_1_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSettingType_in_ruleServiceSetting866);
                    lv_settingType_22_0=ruleSettingType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getServiceSettingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"settingType",
                    	        		lv_settingType_22_0, 
                    	        		"SettingType", 
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

            match(input,27,FollowSets000.FOLLOW_27_in_ruleServiceSetting878); 

                    createLeafNode(grammarAccess.getServiceSettingAccess().getRightCurlyBracketKeyword_13(), null); 
                

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
    // $ANTLR end ruleServiceSetting


    // $ANTLR start entryRuleOfferedService
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:575:1: entryRuleOfferedService returns [EObject current=null] : iv_ruleOfferedService= ruleOfferedService EOF ;
    public final EObject entryRuleOfferedService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOfferedService = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:576:2: (iv_ruleOfferedService= ruleOfferedService EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:577:2: iv_ruleOfferedService= ruleOfferedService EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOfferedServiceRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleOfferedService_in_entryRuleOfferedService914);
            iv_ruleOfferedService=ruleOfferedService();
            _fsp--;

             current =iv_ruleOfferedService; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOfferedService924); 

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
    // $ANTLR end entryRuleOfferedService


    // $ANTLR start ruleOfferedService
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:584:1: ruleOfferedService returns [EObject current=null] : ( () 'OfferedService' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'serviceSettings' '{' ( (lv_serviceSettings_6_0= ruleServiceSetting ) ) ( ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) ) )* '}' )? '}' ) ;
    public final EObject ruleOfferedService() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_serviceSettings_6_0 = null;

        EObject lv_serviceSettings_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:589:6: ( ( () 'OfferedService' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'serviceSettings' '{' ( (lv_serviceSettings_6_0= ruleServiceSetting ) ) ( ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) ) )* '}' )? '}' ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:590:1: ( () 'OfferedService' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'serviceSettings' '{' ( (lv_serviceSettings_6_0= ruleServiceSetting ) ) ( ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) ) )* '}' )? '}' )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:590:1: ( () 'OfferedService' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'serviceSettings' '{' ( (lv_serviceSettings_6_0= ruleServiceSetting ) ) ( ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) ) )* '}' )? '}' )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:590:2: () 'OfferedService' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'serviceSettings' '{' ( (lv_serviceSettings_6_0= ruleServiceSetting ) ) ( ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) ) )* '}' )? '}'
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:590:2: ()
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:591:5: 
            {
             
                    temp=factory.create(grammarAccess.getOfferedServiceAccess().getOfferedServiceAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getOfferedServiceAccess().getOfferedServiceAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,28,FollowSets000.FOLLOW_28_in_ruleOfferedService968); 

                    createLeafNode(grammarAccess.getOfferedServiceAccess().getOfferedServiceKeyword_1(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:605:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:606:1: (lv_name_2_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:606:1: (lv_name_2_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:607:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOfferedService985); 

            			createLeafNode(grammarAccess.getOfferedServiceAccess().getNameSTRINGTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOfferedServiceRule().getType().getClassifier());
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

            match(input,17,FollowSets000.FOLLOW_17_in_ruleOfferedService1000); 

                    createLeafNode(grammarAccess.getOfferedServiceAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:633:1: ( 'serviceSettings' '{' ( (lv_serviceSettings_6_0= ruleServiceSetting ) ) ( ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) ) )* '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:633:3: 'serviceSettings' '{' ( (lv_serviceSettings_6_0= ruleServiceSetting ) ) ( ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) ) )* '}'
                    {
                    match(input,29,FollowSets000.FOLLOW_29_in_ruleOfferedService1011); 

                            createLeafNode(grammarAccess.getOfferedServiceAccess().getServiceSettingsKeyword_4_0(), null); 
                        
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleOfferedService1021); 

                            createLeafNode(grammarAccess.getOfferedServiceAccess().getLeftCurlyBracketKeyword_4_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:641:1: ( (lv_serviceSettings_6_0= ruleServiceSetting ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:642:1: (lv_serviceSettings_6_0= ruleServiceSetting )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:642:1: (lv_serviceSettings_6_0= ruleServiceSetting )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:643:3: lv_serviceSettings_6_0= ruleServiceSetting
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOfferedServiceAccess().getServiceSettingsServiceSettingParserRuleCall_4_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleServiceSetting_in_ruleOfferedService1042);
                    lv_serviceSettings_6_0=ruleServiceSetting();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOfferedServiceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"serviceSettings",
                    	        		lv_serviceSettings_6_0, 
                    	        		"ServiceSetting", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:665:2: ( ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==24) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:665:4: ',' ( (lv_serviceSettings_8_0= ruleServiceSetting ) )
                    	    {
                    	    match(input,24,FollowSets000.FOLLOW_24_in_ruleOfferedService1053); 

                    	            createLeafNode(grammarAccess.getOfferedServiceAccess().getCommaKeyword_4_3_0(), null); 
                    	        
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:669:1: ( (lv_serviceSettings_8_0= ruleServiceSetting ) )
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:670:1: (lv_serviceSettings_8_0= ruleServiceSetting )
                    	    {
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:670:1: (lv_serviceSettings_8_0= ruleServiceSetting )
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:671:3: lv_serviceSettings_8_0= ruleServiceSetting
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getOfferedServiceAccess().getServiceSettingsServiceSettingParserRuleCall_4_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleServiceSetting_in_ruleOfferedService1074);
                    	    lv_serviceSettings_8_0=ruleServiceSetting();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getOfferedServiceRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"serviceSettings",
                    	    	        		lv_serviceSettings_8_0, 
                    	    	        		"ServiceSetting", 
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
                    	    break loop13;
                        }
                    } while (true);

                    match(input,27,FollowSets000.FOLLOW_27_in_ruleOfferedService1086); 

                            createLeafNode(grammarAccess.getOfferedServiceAccess().getRightCurlyBracketKeyword_4_4(), null); 
                        

                    }
                    break;

            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruleOfferedService1098); 

                    createLeafNode(grammarAccess.getOfferedServiceAccess().getRightCurlyBracketKeyword_5(), null); 
                

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
    // $ANTLR end ruleOfferedService


    // $ANTLR start entryRuleEBoolean
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:709:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:710:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:711:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEBooleanRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean1135);
            iv_ruleEBoolean=ruleEBoolean();
            _fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean1146); 

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
    // $ANTLR end entryRuleEBoolean


    // $ANTLR start ruleEBoolean
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:718:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:723:6: ( (kw= 'true' | kw= 'false' ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:724:1: (kw= 'true' | kw= 'false' )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:724:1: (kw= 'true' | kw= 'false' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==31) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("724:1: (kw= 'true' | kw= 'false' )", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:725:2: kw= 'true'
                    {
                    kw=(Token)input.LT(1);
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleEBoolean1184); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEBooleanAccess().getTrueKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:732:2: kw= 'false'
                    {
                    kw=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleEBoolean1203); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEBooleanAccess().getFalseKeyword_1(), null); 
                        

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
    // $ANTLR end ruleEBoolean


    // $ANTLR start entryRuletideTypeSTRING
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:745:1: entryRuletideTypeSTRING returns [EObject current=null] : iv_ruletideTypeSTRING= ruletideTypeSTRING EOF ;
    public final EObject entryRuletideTypeSTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletideTypeSTRING = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:746:2: (iv_ruletideTypeSTRING= ruletideTypeSTRING EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:747:2: iv_ruletideTypeSTRING= ruletideTypeSTRING EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTideTypeSTRINGRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruletideTypeSTRING_in_entryRuletideTypeSTRING1243);
            iv_ruletideTypeSTRING=ruletideTypeSTRING();
            _fsp--;

             current =iv_ruletideTypeSTRING; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletideTypeSTRING1253); 

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
    // $ANTLR end entryRuletideTypeSTRING


    // $ANTLR start ruletideTypeSTRING
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:754:1: ruletideTypeSTRING returns [EObject current=null] : ( () 'STRING' '{' ( 'defaultValue' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? '}' ) ;
    public final EObject ruletideTypeSTRING() throws RecognitionException {
        EObject current = null;

        Token lv_defaultValue_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:759:6: ( ( () 'STRING' '{' ( 'defaultValue' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? '}' ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:760:1: ( () 'STRING' '{' ( 'defaultValue' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? '}' )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:760:1: ( () 'STRING' '{' ( 'defaultValue' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? '}' )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:760:2: () 'STRING' '{' ( 'defaultValue' ( (lv_defaultValue_4_0= RULE_STRING ) ) )? '}'
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:760:2: ()
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:761:5: 
            {
             
                    temp=factory.create(grammarAccess.getTideTypeSTRINGAccess().getTideTypeStringAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTideTypeSTRINGAccess().getTideTypeStringAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruletideTypeSTRING1297); 

                    createLeafNode(grammarAccess.getTideTypeSTRINGAccess().getSTRINGKeyword_1(), null); 
                
            match(input,17,FollowSets000.FOLLOW_17_in_ruletideTypeSTRING1307); 

                    createLeafNode(grammarAccess.getTideTypeSTRINGAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:779:1: ( 'defaultValue' ( (lv_defaultValue_4_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:779:3: 'defaultValue' ( (lv_defaultValue_4_0= RULE_STRING ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruletideTypeSTRING1318); 

                            createLeafNode(grammarAccess.getTideTypeSTRINGAccess().getDefaultValueKeyword_3_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:783:1: ( (lv_defaultValue_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:784:1: (lv_defaultValue_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:784:1: (lv_defaultValue_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:785:3: lv_defaultValue_4_0= RULE_STRING
                    {
                    lv_defaultValue_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruletideTypeSTRING1335); 

                    			createLeafNode(grammarAccess.getTideTypeSTRINGAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0(), "defaultValue"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTideTypeSTRINGRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"defaultValue",
                    	        		lv_defaultValue_4_0, 
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

            match(input,27,FollowSets000.FOLLOW_27_in_ruletideTypeSTRING1352); 

                    createLeafNode(grammarAccess.getTideTypeSTRINGAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruletideTypeSTRING


    // $ANTLR start entryRuletideTypeEnum
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:819:1: entryRuletideTypeEnum returns [EObject current=null] : iv_ruletideTypeEnum= ruletideTypeEnum EOF ;
    public final EObject entryRuletideTypeEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletideTypeEnum = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:820:2: (iv_ruletideTypeEnum= ruletideTypeEnum EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:821:2: iv_ruletideTypeEnum= ruletideTypeEnum EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTideTypeEnumRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruletideTypeEnum_in_entryRuletideTypeEnum1388);
            iv_ruletideTypeEnum=ruletideTypeEnum();
            _fsp--;

             current =iv_ruletideTypeEnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletideTypeEnum1398); 

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
    // $ANTLR end entryRuletideTypeEnum


    // $ANTLR start ruletideTypeEnum
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:828:1: ruletideTypeEnum returns [EObject current=null] : ( () 'Enum' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'defaultValue' ( ( RULE_STRING ) ) )? ( 'tideEnumlist' '{' ( (lv_tideEnumlist_8_0= ruletideTypeEnumItem ) ) ( ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) ) )* '}' )? '}' ) ;
    public final EObject ruletideTypeEnum() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_tideEnumlist_8_0 = null;

        EObject lv_tideEnumlist_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:833:6: ( ( () 'Enum' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'defaultValue' ( ( RULE_STRING ) ) )? ( 'tideEnumlist' '{' ( (lv_tideEnumlist_8_0= ruletideTypeEnumItem ) ) ( ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) ) )* '}' )? '}' ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:834:1: ( () 'Enum' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'defaultValue' ( ( RULE_STRING ) ) )? ( 'tideEnumlist' '{' ( (lv_tideEnumlist_8_0= ruletideTypeEnumItem ) ) ( ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) ) )* '}' )? '}' )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:834:1: ( () 'Enum' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'defaultValue' ( ( RULE_STRING ) ) )? ( 'tideEnumlist' '{' ( (lv_tideEnumlist_8_0= ruletideTypeEnumItem ) ) ( ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) ) )* '}' )? '}' )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:834:2: () 'Enum' ( (lv_name_2_0= RULE_STRING ) ) '{' ( 'defaultValue' ( ( RULE_STRING ) ) )? ( 'tideEnumlist' '{' ( (lv_tideEnumlist_8_0= ruletideTypeEnumItem ) ) ( ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) ) )* '}' )? '}'
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:834:2: ()
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:835:5: 
            {
             
                    temp=factory.create(grammarAccess.getTideTypeEnumAccess().getTideTypeEnumAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTideTypeEnumAccess().getTideTypeEnumAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,34,FollowSets000.FOLLOW_34_in_ruletideTypeEnum1442); 

                    createLeafNode(grammarAccess.getTideTypeEnumAccess().getEnumKeyword_1(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:849:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:850:1: (lv_name_2_0= RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:850:1: (lv_name_2_0= RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:851:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruletideTypeEnum1459); 

            			createLeafNode(grammarAccess.getTideTypeEnumAccess().getNameSTRINGTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTideTypeEnumRule().getType().getClassifier());
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

            match(input,17,FollowSets000.FOLLOW_17_in_ruletideTypeEnum1474); 

                    createLeafNode(grammarAccess.getTideTypeEnumAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:877:1: ( 'defaultValue' ( ( RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:877:3: 'defaultValue' ( ( RULE_STRING ) )
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_ruletideTypeEnum1485); 

                            createLeafNode(grammarAccess.getTideTypeEnumAccess().getDefaultValueKeyword_4_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:881:1: ( ( RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:882:1: ( RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:882:1: ( RULE_STRING )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:883:3: RULE_STRING
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getTideTypeEnumRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruletideTypeEnum1503); 

                    		createLeafNode(grammarAccess.getTideTypeEnumAccess().getDefaultValueTideTypeEnumItemCrossReference_4_1_0(), "defaultValue"); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:895:4: ( 'tideEnumlist' '{' ( (lv_tideEnumlist_8_0= ruletideTypeEnumItem ) ) ( ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) ) )* '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:895:6: 'tideEnumlist' '{' ( (lv_tideEnumlist_8_0= ruletideTypeEnumItem ) ) ( ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) ) )* '}'
                    {
                    match(input,35,FollowSets000.FOLLOW_35_in_ruletideTypeEnum1516); 

                            createLeafNode(grammarAccess.getTideTypeEnumAccess().getTideEnumlistKeyword_5_0(), null); 
                        
                    match(input,17,FollowSets000.FOLLOW_17_in_ruletideTypeEnum1526); 

                            createLeafNode(grammarAccess.getTideTypeEnumAccess().getLeftCurlyBracketKeyword_5_1(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:903:1: ( (lv_tideEnumlist_8_0= ruletideTypeEnumItem ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:904:1: (lv_tideEnumlist_8_0= ruletideTypeEnumItem )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:904:1: (lv_tideEnumlist_8_0= ruletideTypeEnumItem )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:905:3: lv_tideEnumlist_8_0= ruletideTypeEnumItem
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTideTypeEnumAccess().getTideEnumlistTideTypeEnumItemParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruletideTypeEnumItem_in_ruletideTypeEnum1547);
                    lv_tideEnumlist_8_0=ruletideTypeEnumItem();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTideTypeEnumRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"tideEnumlist",
                    	        		lv_tideEnumlist_8_0, 
                    	        		"tideTypeEnumItem", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:927:2: ( ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:927:4: ',' ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) )
                    	    {
                    	    match(input,24,FollowSets000.FOLLOW_24_in_ruletideTypeEnum1558); 

                    	            createLeafNode(grammarAccess.getTideTypeEnumAccess().getCommaKeyword_5_3_0(), null); 
                    	        
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:931:1: ( (lv_tideEnumlist_10_0= ruletideTypeEnumItem ) )
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:932:1: (lv_tideEnumlist_10_0= ruletideTypeEnumItem )
                    	    {
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:932:1: (lv_tideEnumlist_10_0= ruletideTypeEnumItem )
                    	    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:933:3: lv_tideEnumlist_10_0= ruletideTypeEnumItem
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getTideTypeEnumAccess().getTideEnumlistTideTypeEnumItemParserRuleCall_5_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruletideTypeEnumItem_in_ruletideTypeEnum1579);
                    	    lv_tideEnumlist_10_0=ruletideTypeEnumItem();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getTideTypeEnumRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"tideEnumlist",
                    	    	        		lv_tideEnumlist_10_0, 
                    	    	        		"tideTypeEnumItem", 
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
                    	    break loop18;
                        }
                    } while (true);

                    match(input,27,FollowSets000.FOLLOW_27_in_ruletideTypeEnum1591); 

                            createLeafNode(grammarAccess.getTideTypeEnumAccess().getRightCurlyBracketKeyword_5_4(), null); 
                        

                    }
                    break;

            }

            match(input,27,FollowSets000.FOLLOW_27_in_ruletideTypeEnum1603); 

                    createLeafNode(grammarAccess.getTideTypeEnumAccess().getRightCurlyBracketKeyword_6(), null); 
                

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
    // $ANTLR end ruletideTypeEnum


    // $ANTLR start entryRuletideTypeEnumItem
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:971:1: entryRuletideTypeEnumItem returns [EObject current=null] : iv_ruletideTypeEnumItem= ruletideTypeEnumItem EOF ;
    public final EObject entryRuletideTypeEnumItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletideTypeEnumItem = null;


        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:972:2: (iv_ruletideTypeEnumItem= ruletideTypeEnumItem EOF )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:973:2: iv_ruletideTypeEnumItem= ruletideTypeEnumItem EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTideTypeEnumItemRule(), currentNode); 
            pushFollow(FollowSets000.FOLLOW_ruletideTypeEnumItem_in_entryRuletideTypeEnumItem1639);
            iv_ruletideTypeEnumItem=ruletideTypeEnumItem();
            _fsp--;

             current =iv_ruletideTypeEnumItem; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletideTypeEnumItem1649); 

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
    // $ANTLR end entryRuletideTypeEnumItem


    // $ANTLR start ruletideTypeEnumItem
    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:980:1: ruletideTypeEnumItem returns [EObject current=null] : ( () 'tideTypeEnumItem' '{' ( 'value' ( (lv_value_4_0= RULE_STRING ) ) )? '}' ) ;
    public final EObject ruletideTypeEnumItem() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:985:6: ( ( () 'tideTypeEnumItem' '{' ( 'value' ( (lv_value_4_0= RULE_STRING ) ) )? '}' ) )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:986:1: ( () 'tideTypeEnumItem' '{' ( 'value' ( (lv_value_4_0= RULE_STRING ) ) )? '}' )
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:986:1: ( () 'tideTypeEnumItem' '{' ( 'value' ( (lv_value_4_0= RULE_STRING ) ) )? '}' )
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:986:2: () 'tideTypeEnumItem' '{' ( 'value' ( (lv_value_4_0= RULE_STRING ) ) )? '}'
            {
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:986:2: ()
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:987:5: 
            {
             
                    temp=factory.create(grammarAccess.getTideTypeEnumItemAccess().getTideTypeEnumItemAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getTideTypeEnumItemAccess().getTideTypeEnumItemAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            match(input,36,FollowSets000.FOLLOW_36_in_ruletideTypeEnumItem1693); 

                    createLeafNode(grammarAccess.getTideTypeEnumItemAccess().getTideTypeEnumItemKeyword_1(), null); 
                
            match(input,17,FollowSets000.FOLLOW_17_in_ruletideTypeEnumItem1703); 

                    createLeafNode(grammarAccess.getTideTypeEnumItemAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:1005:1: ( 'value' ( (lv_value_4_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:1005:3: 'value' ( (lv_value_4_0= RULE_STRING ) )
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruletideTypeEnumItem1714); 

                            createLeafNode(grammarAccess.getTideTypeEnumItemAccess().getValueKeyword_3_0(), null); 
                        
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:1009:1: ( (lv_value_4_0= RULE_STRING ) )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:1010:1: (lv_value_4_0= RULE_STRING )
                    {
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:1010:1: (lv_value_4_0= RULE_STRING )
                    // ../gr.upatras.ece.wcl.sdl/src-gen/gr/upatras/ece/wcl/parser/antlr/internal/InternalSDL.g:1011:3: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruletideTypeEnumItem1731); 

                    			createLeafNode(grammarAccess.getTideTypeEnumItemAccess().getValueSTRINGTerminalRuleCall_3_1_0(), "value"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTideTypeEnumItemRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_4_0, 
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

            match(input,27,FollowSets000.FOLLOW_27_in_ruletideTypeEnumItem1748); 

                    createLeafNode(grammarAccess.getTideTypeEnumItemAccess().getRightCurlyBracketKeyword_4(), null); 
                

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
    // $ANTLR end ruletideTypeEnumItem


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleServiceRule_in_entryRuleServiceRule75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServiceRule85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_ruleServiceRule140 = new BitSet(new long[]{0x0000000010000800L});
        public static final BitSet FOLLOW_ruleOfferedService_in_ruleServiceRule162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleImport243 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImport260 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleImport275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSettingType_in_entryRuleSettingType313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSettingType323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeSTRING_in_ruleSettingType370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeEnum_in_ruleSettingType397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceSetting_in_entryRuleServiceSetting432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServiceSetting442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleServiceSetting494 = new BitSet(new long[]{0x000000000001C000L});
        public static final BitSet FOLLOW_14_in_ruleServiceSetting526 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleServiceSetting558 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleServiceSetting582 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSetting599 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleServiceSetting614 = new BitSet(new long[]{0x000000000C7C0000L});
        public static final BitSet FOLLOW_18_in_ruleServiceSetting625 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleServiceSetting642 = new BitSet(new long[]{0x000000000C780000L});
        public static final BitSet FOLLOW_19_in_ruleServiceSetting660 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSetting677 = new BitSet(new long[]{0x000000000C700000L});
        public static final BitSet FOLLOW_20_in_ruleServiceSetting695 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleServiceSetting716 = new BitSet(new long[]{0x000000000C600000L});
        public static final BitSet FOLLOW_21_in_ruleServiceSetting729 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleServiceSetting750 = new BitSet(new long[]{0x000000000C400000L});
        public static final BitSet FOLLOW_22_in_ruleServiceSetting763 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleServiceSetting773 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSetting791 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_24_in_ruleServiceSetting802 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleServiceSetting820 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_25_in_ruleServiceSetting832 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleServiceSetting845 = new BitSet(new long[]{0x0000000500000000L});
        public static final BitSet FOLLOW_ruleSettingType_in_ruleServiceSetting866 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleServiceSetting878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOfferedService_in_entryRuleOfferedService914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOfferedService924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleOfferedService968 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOfferedService985 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOfferedService1000 = new BitSet(new long[]{0x0000000028000000L});
        public static final BitSet FOLLOW_29_in_ruleOfferedService1011 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleOfferedService1021 = new BitSet(new long[]{0x000000000001E000L});
        public static final BitSet FOLLOW_ruleServiceSetting_in_ruleOfferedService1042 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_24_in_ruleOfferedService1053 = new BitSet(new long[]{0x000000000001E000L});
        public static final BitSet FOLLOW_ruleServiceSetting_in_ruleOfferedService1074 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_27_in_ruleOfferedService1086 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleOfferedService1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean1135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean1146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEBoolean1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEBoolean1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeSTRING_in_entryRuletideTypeSTRING1243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletideTypeSTRING1253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruletideTypeSTRING1297 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruletideTypeSTRING1307 = new BitSet(new long[]{0x0000000208000000L});
        public static final BitSet FOLLOW_33_in_ruletideTypeSTRING1318 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruletideTypeSTRING1335 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruletideTypeSTRING1352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeEnum_in_entryRuletideTypeEnum1388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletideTypeEnum1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruletideTypeEnum1442 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruletideTypeEnum1459 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruletideTypeEnum1474 = new BitSet(new long[]{0x0000000A08000000L});
        public static final BitSet FOLLOW_33_in_ruletideTypeEnum1485 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruletideTypeEnum1503 = new BitSet(new long[]{0x0000000808000000L});
        public static final BitSet FOLLOW_35_in_ruletideTypeEnum1516 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruletideTypeEnum1526 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruletideTypeEnumItem_in_ruletideTypeEnum1547 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_24_in_ruletideTypeEnum1558 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruletideTypeEnumItem_in_ruletideTypeEnum1579 = new BitSet(new long[]{0x0000000009000000L});
        public static final BitSet FOLLOW_27_in_ruletideTypeEnum1591 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruletideTypeEnum1603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeEnumItem_in_entryRuletideTypeEnumItem1639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletideTypeEnumItem1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruletideTypeEnumItem1693 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruletideTypeEnumItem1703 = new BitSet(new long[]{0x0000002008000000L});
        public static final BitSet FOLLOW_37_in_ruletideTypeEnumItem1714 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruletideTypeEnumItem1731 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruletideTypeEnumItem1748 = new BitSet(new long[]{0x0000000000000002L});
    }


}