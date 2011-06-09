package gr.upatras.ece.wcl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import gr.upatras.ece.wcl.services.SDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'import office'", "';'", "'ServiceSetting'", "'{'", "'}'", "'id'", "'description'", "'Readable'", "'Writable'", "'requiresParams'", "'('", "')'", "','", "'settingType'", "'OfferedService'", "'serviceSettings'", "'STRING'", "'defaultValue'", "'Enum'", "'tideEnumlist'", "'tideTypeEnumItem'", "'value'", "'userExposed'", "'userEditable'", "'canBePublished'"
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
    public String getGrammarFileName() { return "../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g"; }


     
     	private SDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SDLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleServiceRule
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:61:1: entryRuleServiceRule : ruleServiceRule EOF ;
    public final void entryRuleServiceRule() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:62:1: ( ruleServiceRule EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:63:1: ruleServiceRule EOF
            {
             before(grammarAccess.getServiceRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceRule_in_entryRuleServiceRule61);
            ruleServiceRule();
            _fsp--;

             after(grammarAccess.getServiceRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServiceRule68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleServiceRule


    // $ANTLR start ruleServiceRule
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:70:1: ruleServiceRule : ( ( rule__ServiceRule__Group__0 ) ) ;
    public final void ruleServiceRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:74:2: ( ( ( rule__ServiceRule__Group__0 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:75:1: ( ( rule__ServiceRule__Group__0 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:75:1: ( ( rule__ServiceRule__Group__0 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:76:1: ( rule__ServiceRule__Group__0 )
            {
             before(grammarAccess.getServiceRuleAccess().getGroup()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:77:1: ( rule__ServiceRule__Group__0 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:77:2: rule__ServiceRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceRule__Group__0_in_ruleServiceRule94);
            rule__ServiceRule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getServiceRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleServiceRule


    // $ANTLR start entryRuleImport
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:90:1: ( ruleImport EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:91:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImport128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:104:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:105:1: ( rule__Import__Group__0 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:105:2: rule__Import__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleSettingType
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:119:1: entryRuleSettingType : ruleSettingType EOF ;
    public final void entryRuleSettingType() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:120:1: ( ruleSettingType EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:121:1: ruleSettingType EOF
            {
             before(grammarAccess.getSettingTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSettingType_in_entryRuleSettingType183);
            ruleSettingType();
            _fsp--;

             after(grammarAccess.getSettingTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSettingType190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSettingType


    // $ANTLR start ruleSettingType
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:128:1: ruleSettingType : ( ( rule__SettingType__Alternatives ) ) ;
    public final void ruleSettingType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:132:2: ( ( ( rule__SettingType__Alternatives ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:133:1: ( ( rule__SettingType__Alternatives ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:133:1: ( ( rule__SettingType__Alternatives ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:134:1: ( rule__SettingType__Alternatives )
            {
             before(grammarAccess.getSettingTypeAccess().getAlternatives()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:135:1: ( rule__SettingType__Alternatives )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:135:2: rule__SettingType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__SettingType__Alternatives_in_ruleSettingType216);
            rule__SettingType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSettingTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSettingType


    // $ANTLR start entryRuleServiceSetting
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:147:1: entryRuleServiceSetting : ruleServiceSetting EOF ;
    public final void entryRuleServiceSetting() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:148:1: ( ruleServiceSetting EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:149:1: ruleServiceSetting EOF
            {
             before(grammarAccess.getServiceSettingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceSetting_in_entryRuleServiceSetting243);
            ruleServiceSetting();
            _fsp--;

             after(grammarAccess.getServiceSettingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleServiceSetting250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleServiceSetting


    // $ANTLR start ruleServiceSetting
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:156:1: ruleServiceSetting : ( ( rule__ServiceSetting__Group__0 ) ) ;
    public final void ruleServiceSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:160:2: ( ( ( rule__ServiceSetting__Group__0 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:161:1: ( ( rule__ServiceSetting__Group__0 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:161:1: ( ( rule__ServiceSetting__Group__0 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:162:1: ( rule__ServiceSetting__Group__0 )
            {
             before(grammarAccess.getServiceSettingAccess().getGroup()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:163:1: ( rule__ServiceSetting__Group__0 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:163:2: rule__ServiceSetting__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__0_in_ruleServiceSetting276);
            rule__ServiceSetting__Group__0();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleServiceSetting


    // $ANTLR start entryRuleOfferedService
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:175:1: entryRuleOfferedService : ruleOfferedService EOF ;
    public final void entryRuleOfferedService() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:176:1: ( ruleOfferedService EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:177:1: ruleOfferedService EOF
            {
             before(grammarAccess.getOfferedServiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOfferedService_in_entryRuleOfferedService303);
            ruleOfferedService();
            _fsp--;

             after(grammarAccess.getOfferedServiceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOfferedService310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleOfferedService


    // $ANTLR start ruleOfferedService
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:184:1: ruleOfferedService : ( ( rule__OfferedService__Group__0 ) ) ;
    public final void ruleOfferedService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:188:2: ( ( ( rule__OfferedService__Group__0 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:189:1: ( ( rule__OfferedService__Group__0 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:189:1: ( ( rule__OfferedService__Group__0 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:190:1: ( rule__OfferedService__Group__0 )
            {
             before(grammarAccess.getOfferedServiceAccess().getGroup()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:191:1: ( rule__OfferedService__Group__0 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:191:2: rule__OfferedService__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__0_in_ruleOfferedService336);
            rule__OfferedService__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOfferedServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOfferedService


    // $ANTLR start entryRuleEBoolean
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:203:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:204:1: ( ruleEBoolean EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:205:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean363);
            ruleEBoolean();
            _fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEBoolean


    // $ANTLR start ruleEBoolean
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:212:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:216:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:217:1: ( ( rule__EBoolean__Alternatives ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:217:1: ( ( rule__EBoolean__Alternatives ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:218:1: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:219:1: ( rule__EBoolean__Alternatives )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:219:2: rule__EBoolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean396);
            rule__EBoolean__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEBoolean


    // $ANTLR start entryRuletideTypeSTRING
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:231:1: entryRuletideTypeSTRING : ruletideTypeSTRING EOF ;
    public final void entryRuletideTypeSTRING() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:232:1: ( ruletideTypeSTRING EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:233:1: ruletideTypeSTRING EOF
            {
             before(grammarAccess.getTideTypeSTRINGRule()); 
            pushFollow(FollowSets000.FOLLOW_ruletideTypeSTRING_in_entryRuletideTypeSTRING423);
            ruletideTypeSTRING();
            _fsp--;

             after(grammarAccess.getTideTypeSTRINGRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletideTypeSTRING430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuletideTypeSTRING


    // $ANTLR start ruletideTypeSTRING
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:240:1: ruletideTypeSTRING : ( ( rule__TideTypeSTRING__Group__0 ) ) ;
    public final void ruletideTypeSTRING() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:244:2: ( ( ( rule__TideTypeSTRING__Group__0 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:245:1: ( ( rule__TideTypeSTRING__Group__0 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:245:1: ( ( rule__TideTypeSTRING__Group__0 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:246:1: ( rule__TideTypeSTRING__Group__0 )
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getGroup()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:247:1: ( rule__TideTypeSTRING__Group__0 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:247:2: rule__TideTypeSTRING__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__0_in_ruletideTypeSTRING456);
            rule__TideTypeSTRING__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTideTypeSTRINGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruletideTypeSTRING


    // $ANTLR start entryRuletideTypeEnum
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:259:1: entryRuletideTypeEnum : ruletideTypeEnum EOF ;
    public final void entryRuletideTypeEnum() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:260:1: ( ruletideTypeEnum EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:261:1: ruletideTypeEnum EOF
            {
             before(grammarAccess.getTideTypeEnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruletideTypeEnum_in_entryRuletideTypeEnum483);
            ruletideTypeEnum();
            _fsp--;

             after(grammarAccess.getTideTypeEnumRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletideTypeEnum490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuletideTypeEnum


    // $ANTLR start ruletideTypeEnum
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:268:1: ruletideTypeEnum : ( ( rule__TideTypeEnum__Group__0 ) ) ;
    public final void ruletideTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:272:2: ( ( ( rule__TideTypeEnum__Group__0 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:273:1: ( ( rule__TideTypeEnum__Group__0 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:273:1: ( ( rule__TideTypeEnum__Group__0 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:274:1: ( rule__TideTypeEnum__Group__0 )
            {
             before(grammarAccess.getTideTypeEnumAccess().getGroup()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:275:1: ( rule__TideTypeEnum__Group__0 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:275:2: rule__TideTypeEnum__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__0_in_ruletideTypeEnum516);
            rule__TideTypeEnum__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTideTypeEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruletideTypeEnum


    // $ANTLR start entryRuletideTypeEnumItem
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:287:1: entryRuletideTypeEnumItem : ruletideTypeEnumItem EOF ;
    public final void entryRuletideTypeEnumItem() throws RecognitionException {
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:288:1: ( ruletideTypeEnumItem EOF )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:289:1: ruletideTypeEnumItem EOF
            {
             before(grammarAccess.getTideTypeEnumItemRule()); 
            pushFollow(FollowSets000.FOLLOW_ruletideTypeEnumItem_in_entryRuletideTypeEnumItem543);
            ruletideTypeEnumItem();
            _fsp--;

             after(grammarAccess.getTideTypeEnumItemRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuletideTypeEnumItem550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuletideTypeEnumItem


    // $ANTLR start ruletideTypeEnumItem
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:296:1: ruletideTypeEnumItem : ( ( rule__TideTypeEnumItem__Group__0 ) ) ;
    public final void ruletideTypeEnumItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:300:2: ( ( ( rule__TideTypeEnumItem__Group__0 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:301:1: ( ( rule__TideTypeEnumItem__Group__0 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:301:1: ( ( rule__TideTypeEnumItem__Group__0 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:302:1: ( rule__TideTypeEnumItem__Group__0 )
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getGroup()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:303:1: ( rule__TideTypeEnumItem__Group__0 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:303:2: rule__TideTypeEnumItem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__0_in_ruletideTypeEnumItem576);
            rule__TideTypeEnumItem__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTideTypeEnumItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruletideTypeEnumItem


    // $ANTLR start rule__SettingType__Alternatives
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:315:1: rule__SettingType__Alternatives : ( ( ruletideTypeSTRING ) | ( ruletideTypeEnum ) );
    public final void rule__SettingType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:319:1: ( ( ruletideTypeSTRING ) | ( ruletideTypeEnum ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==31) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("315:1: rule__SettingType__Alternatives : ( ( ruletideTypeSTRING ) | ( ruletideTypeEnum ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:320:1: ( ruletideTypeSTRING )
                    {
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:320:1: ( ruletideTypeSTRING )
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:321:1: ruletideTypeSTRING
                    {
                     before(grammarAccess.getSettingTypeAccess().getTideTypeSTRINGParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruletideTypeSTRING_in_rule__SettingType__Alternatives612);
                    ruletideTypeSTRING();
                    _fsp--;

                     after(grammarAccess.getSettingTypeAccess().getTideTypeSTRINGParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:326:6: ( ruletideTypeEnum )
                    {
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:326:6: ( ruletideTypeEnum )
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:327:1: ruletideTypeEnum
                    {
                     before(grammarAccess.getSettingTypeAccess().getTideTypeEnumParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruletideTypeEnum_in_rule__SettingType__Alternatives629);
                    ruletideTypeEnum();
                    _fsp--;

                     after(grammarAccess.getSettingTypeAccess().getTideTypeEnumParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SettingType__Alternatives


    // $ANTLR start rule__EBoolean__Alternatives
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:337:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:341:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("337:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:342:1: ( 'true' )
                    {
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:342:1: ( 'true' )
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:343:1: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EBoolean__Alternatives662); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:350:6: ( 'false' )
                    {
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:350:6: ( 'false' )
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:351:1: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EBoolean__Alternatives682); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__EBoolean__Alternatives


    // $ANTLR start rule__ServiceRule__Group__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:365:1: rule__ServiceRule__Group__0 : rule__ServiceRule__Group__0__Impl rule__ServiceRule__Group__1 ;
    public final void rule__ServiceRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:369:1: ( rule__ServiceRule__Group__0__Impl rule__ServiceRule__Group__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:370:2: rule__ServiceRule__Group__0__Impl rule__ServiceRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceRule__Group__0__Impl_in_rule__ServiceRule__Group__0714);
            rule__ServiceRule__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceRule__Group__1_in_rule__ServiceRule__Group__0717);
            rule__ServiceRule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceRule__Group__0


    // $ANTLR start rule__ServiceRule__Group__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:377:1: rule__ServiceRule__Group__0__Impl : ( () ) ;
    public final void rule__ServiceRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:381:1: ( ( () ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:382:1: ( () )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:382:1: ( () )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:383:1: ()
            {
             before(grammarAccess.getServiceRuleAccess().getServiceRuleAction_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:384:1: ()
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:386:1: 
            {
            }

             after(grammarAccess.getServiceRuleAccess().getServiceRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceRule__Group__0__Impl


    // $ANTLR start rule__ServiceRule__Group__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:396:1: rule__ServiceRule__Group__1 : rule__ServiceRule__Group__1__Impl rule__ServiceRule__Group__2 ;
    public final void rule__ServiceRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:400:1: ( rule__ServiceRule__Group__1__Impl rule__ServiceRule__Group__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:401:2: rule__ServiceRule__Group__1__Impl rule__ServiceRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceRule__Group__1__Impl_in_rule__ServiceRule__Group__1775);
            rule__ServiceRule__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceRule__Group__2_in_rule__ServiceRule__Group__1778);
            rule__ServiceRule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceRule__Group__1


    // $ANTLR start rule__ServiceRule__Group__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:408:1: rule__ServiceRule__Group__1__Impl : ( ( rule__ServiceRule__ImportsAssignment_1 )* ) ;
    public final void rule__ServiceRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:412:1: ( ( ( rule__ServiceRule__ImportsAssignment_1 )* ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:413:1: ( ( rule__ServiceRule__ImportsAssignment_1 )* )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:413:1: ( ( rule__ServiceRule__ImportsAssignment_1 )* )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:414:1: ( rule__ServiceRule__ImportsAssignment_1 )*
            {
             before(grammarAccess.getServiceRuleAccess().getImportsAssignment_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:415:1: ( rule__ServiceRule__ImportsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:415:2: rule__ServiceRule__ImportsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ServiceRule__ImportsAssignment_1_in_rule__ServiceRule__Group__1__Impl805);
            	    rule__ServiceRule__ImportsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getServiceRuleAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceRule__Group__1__Impl


    // $ANTLR start rule__ServiceRule__Group__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:425:1: rule__ServiceRule__Group__2 : rule__ServiceRule__Group__2__Impl ;
    public final void rule__ServiceRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:429:1: ( rule__ServiceRule__Group__2__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:430:2: rule__ServiceRule__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceRule__Group__2__Impl_in_rule__ServiceRule__Group__2836);
            rule__ServiceRule__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceRule__Group__2


    // $ANTLR start rule__ServiceRule__Group__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:436:1: rule__ServiceRule__Group__2__Impl : ( ( rule__ServiceRule__OfferedServiceAssignment_2 ) ) ;
    public final void rule__ServiceRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:440:1: ( ( ( rule__ServiceRule__OfferedServiceAssignment_2 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:441:1: ( ( rule__ServiceRule__OfferedServiceAssignment_2 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:441:1: ( ( rule__ServiceRule__OfferedServiceAssignment_2 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:442:1: ( rule__ServiceRule__OfferedServiceAssignment_2 )
            {
             before(grammarAccess.getServiceRuleAccess().getOfferedServiceAssignment_2()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:443:1: ( rule__ServiceRule__OfferedServiceAssignment_2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:443:2: rule__ServiceRule__OfferedServiceAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceRule__OfferedServiceAssignment_2_in_rule__ServiceRule__Group__2__Impl863);
            rule__ServiceRule__OfferedServiceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getServiceRuleAccess().getOfferedServiceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceRule__Group__2__Impl


    // $ANTLR start rule__Import__Group__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:459:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:463:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:464:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0899);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0902);
            rule__Import__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__0


    // $ANTLR start rule__Import__Group__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:471:1: rule__Import__Group__0__Impl : ( 'import office' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:475:1: ( ( 'import office' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:476:1: ( 'import office' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:476:1: ( 'import office' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:477:1: 'import office'
            {
             before(grammarAccess.getImportAccess().getImportOfficeKeyword_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Import__Group__0__Impl930); 
             after(grammarAccess.getImportAccess().getImportOfficeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__0__Impl


    // $ANTLR start rule__Import__Group__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:490:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:494:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:495:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1961);
            rule__Import__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__2_in_rule__Import__Group__1964);
            rule__Import__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__1


    // $ANTLR start rule__Import__Group__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:502:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:506:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:507:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:507:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:508:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:509:1: ( rule__Import__ImportURIAssignment_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:509:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl991);
            rule__Import__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__1__Impl


    // $ANTLR start rule__Import__Group__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:519:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:523:1: ( rule__Import__Group__2__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:524:2: rule__Import__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21021);
            rule__Import__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__2


    // $ANTLR start rule__Import__Group__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:530:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:534:1: ( ( ';' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:535:1: ( ';' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:535:1: ( ';' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:536:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Import__Group__2__Impl1049); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__Group__2__Impl


    // $ANTLR start rule__ServiceSetting__Group__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:558:1: rule__ServiceSetting__Group__0 : rule__ServiceSetting__Group__0__Impl rule__ServiceSetting__Group__1 ;
    public final void rule__ServiceSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:562:1: ( rule__ServiceSetting__Group__0__Impl rule__ServiceSetting__Group__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:563:2: rule__ServiceSetting__Group__0__Impl rule__ServiceSetting__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__0__Impl_in_rule__ServiceSetting__Group__01089);
            rule__ServiceSetting__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__1_in_rule__ServiceSetting__Group__01092);
            rule__ServiceSetting__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__0


    // $ANTLR start rule__ServiceSetting__Group__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:570:1: rule__ServiceSetting__Group__0__Impl : ( () ) ;
    public final void rule__ServiceSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:574:1: ( ( () ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:575:1: ( () )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:575:1: ( () )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:576:1: ()
            {
             before(grammarAccess.getServiceSettingAccess().getServiceSettingAction_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:577:1: ()
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:579:1: 
            {
            }

             after(grammarAccess.getServiceSettingAccess().getServiceSettingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__0__Impl


    // $ANTLR start rule__ServiceSetting__Group__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:589:1: rule__ServiceSetting__Group__1 : rule__ServiceSetting__Group__1__Impl rule__ServiceSetting__Group__2 ;
    public final void rule__ServiceSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:593:1: ( rule__ServiceSetting__Group__1__Impl rule__ServiceSetting__Group__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:594:2: rule__ServiceSetting__Group__1__Impl rule__ServiceSetting__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__1__Impl_in_rule__ServiceSetting__Group__11150);
            rule__ServiceSetting__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__2_in_rule__ServiceSetting__Group__11153);
            rule__ServiceSetting__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__1


    // $ANTLR start rule__ServiceSetting__Group__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:601:1: rule__ServiceSetting__Group__1__Impl : ( ( rule__ServiceSetting__UserExposedAssignment_1 )? ) ;
    public final void rule__ServiceSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:605:1: ( ( ( rule__ServiceSetting__UserExposedAssignment_1 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:606:1: ( ( rule__ServiceSetting__UserExposedAssignment_1 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:606:1: ( ( rule__ServiceSetting__UserExposedAssignment_1 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:607:1: ( rule__ServiceSetting__UserExposedAssignment_1 )?
            {
             before(grammarAccess.getServiceSettingAccess().getUserExposedAssignment_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:608:1: ( rule__ServiceSetting__UserExposedAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:608:2: rule__ServiceSetting__UserExposedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__UserExposedAssignment_1_in_rule__ServiceSetting__Group__1__Impl1180);
                    rule__ServiceSetting__UserExposedAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getUserExposedAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__1__Impl


    // $ANTLR start rule__ServiceSetting__Group__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:618:1: rule__ServiceSetting__Group__2 : rule__ServiceSetting__Group__2__Impl rule__ServiceSetting__Group__3 ;
    public final void rule__ServiceSetting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:622:1: ( rule__ServiceSetting__Group__2__Impl rule__ServiceSetting__Group__3 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:623:2: rule__ServiceSetting__Group__2__Impl rule__ServiceSetting__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__2__Impl_in_rule__ServiceSetting__Group__21211);
            rule__ServiceSetting__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__3_in_rule__ServiceSetting__Group__21214);
            rule__ServiceSetting__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__2


    // $ANTLR start rule__ServiceSetting__Group__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:630:1: rule__ServiceSetting__Group__2__Impl : ( ( rule__ServiceSetting__UserEditableAssignment_2 )? ) ;
    public final void rule__ServiceSetting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:634:1: ( ( ( rule__ServiceSetting__UserEditableAssignment_2 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:635:1: ( ( rule__ServiceSetting__UserEditableAssignment_2 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:635:1: ( ( rule__ServiceSetting__UserEditableAssignment_2 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:636:1: ( rule__ServiceSetting__UserEditableAssignment_2 )?
            {
             before(grammarAccess.getServiceSettingAccess().getUserEditableAssignment_2()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:637:1: ( rule__ServiceSetting__UserEditableAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:637:2: rule__ServiceSetting__UserEditableAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__UserEditableAssignment_2_in_rule__ServiceSetting__Group__2__Impl1241);
                    rule__ServiceSetting__UserEditableAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getUserEditableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__2__Impl


    // $ANTLR start rule__ServiceSetting__Group__3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:647:1: rule__ServiceSetting__Group__3 : rule__ServiceSetting__Group__3__Impl rule__ServiceSetting__Group__4 ;
    public final void rule__ServiceSetting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:651:1: ( rule__ServiceSetting__Group__3__Impl rule__ServiceSetting__Group__4 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:652:2: rule__ServiceSetting__Group__3__Impl rule__ServiceSetting__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__3__Impl_in_rule__ServiceSetting__Group__31272);
            rule__ServiceSetting__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__4_in_rule__ServiceSetting__Group__31275);
            rule__ServiceSetting__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__3


    // $ANTLR start rule__ServiceSetting__Group__3__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:659:1: rule__ServiceSetting__Group__3__Impl : ( ( rule__ServiceSetting__CanBePublishedAssignment_3 )? ) ;
    public final void rule__ServiceSetting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:663:1: ( ( ( rule__ServiceSetting__CanBePublishedAssignment_3 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:664:1: ( ( rule__ServiceSetting__CanBePublishedAssignment_3 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:664:1: ( ( rule__ServiceSetting__CanBePublishedAssignment_3 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:665:1: ( rule__ServiceSetting__CanBePublishedAssignment_3 )?
            {
             before(grammarAccess.getServiceSettingAccess().getCanBePublishedAssignment_3()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:666:1: ( rule__ServiceSetting__CanBePublishedAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:666:2: rule__ServiceSetting__CanBePublishedAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__CanBePublishedAssignment_3_in_rule__ServiceSetting__Group__3__Impl1302);
                    rule__ServiceSetting__CanBePublishedAssignment_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getCanBePublishedAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__3__Impl


    // $ANTLR start rule__ServiceSetting__Group__4
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:676:1: rule__ServiceSetting__Group__4 : rule__ServiceSetting__Group__4__Impl rule__ServiceSetting__Group__5 ;
    public final void rule__ServiceSetting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:680:1: ( rule__ServiceSetting__Group__4__Impl rule__ServiceSetting__Group__5 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:681:2: rule__ServiceSetting__Group__4__Impl rule__ServiceSetting__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__4__Impl_in_rule__ServiceSetting__Group__41333);
            rule__ServiceSetting__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__5_in_rule__ServiceSetting__Group__41336);
            rule__ServiceSetting__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__4


    // $ANTLR start rule__ServiceSetting__Group__4__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:688:1: rule__ServiceSetting__Group__4__Impl : ( 'ServiceSetting' ) ;
    public final void rule__ServiceSetting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:692:1: ( ( 'ServiceSetting' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:693:1: ( 'ServiceSetting' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:693:1: ( 'ServiceSetting' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:694:1: 'ServiceSetting'
            {
             before(grammarAccess.getServiceSettingAccess().getServiceSettingKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__ServiceSetting__Group__4__Impl1364); 
             after(grammarAccess.getServiceSettingAccess().getServiceSettingKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__4__Impl


    // $ANTLR start rule__ServiceSetting__Group__5
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:707:1: rule__ServiceSetting__Group__5 : rule__ServiceSetting__Group__5__Impl rule__ServiceSetting__Group__6 ;
    public final void rule__ServiceSetting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:711:1: ( rule__ServiceSetting__Group__5__Impl rule__ServiceSetting__Group__6 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:712:2: rule__ServiceSetting__Group__5__Impl rule__ServiceSetting__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__5__Impl_in_rule__ServiceSetting__Group__51395);
            rule__ServiceSetting__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__6_in_rule__ServiceSetting__Group__51398);
            rule__ServiceSetting__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__5


    // $ANTLR start rule__ServiceSetting__Group__5__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:719:1: rule__ServiceSetting__Group__5__Impl : ( ( rule__ServiceSetting__NameAssignment_5 ) ) ;
    public final void rule__ServiceSetting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:723:1: ( ( ( rule__ServiceSetting__NameAssignment_5 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:724:1: ( ( rule__ServiceSetting__NameAssignment_5 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:724:1: ( ( rule__ServiceSetting__NameAssignment_5 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:725:1: ( rule__ServiceSetting__NameAssignment_5 )
            {
             before(grammarAccess.getServiceSettingAccess().getNameAssignment_5()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:726:1: ( rule__ServiceSetting__NameAssignment_5 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:726:2: rule__ServiceSetting__NameAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__NameAssignment_5_in_rule__ServiceSetting__Group__5__Impl1425);
            rule__ServiceSetting__NameAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__5__Impl


    // $ANTLR start rule__ServiceSetting__Group__6
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:736:1: rule__ServiceSetting__Group__6 : rule__ServiceSetting__Group__6__Impl rule__ServiceSetting__Group__7 ;
    public final void rule__ServiceSetting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:740:1: ( rule__ServiceSetting__Group__6__Impl rule__ServiceSetting__Group__7 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:741:2: rule__ServiceSetting__Group__6__Impl rule__ServiceSetting__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__6__Impl_in_rule__ServiceSetting__Group__61455);
            rule__ServiceSetting__Group__6__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__7_in_rule__ServiceSetting__Group__61458);
            rule__ServiceSetting__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__6


    // $ANTLR start rule__ServiceSetting__Group__6__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:748:1: rule__ServiceSetting__Group__6__Impl : ( '{' ) ;
    public final void rule__ServiceSetting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:752:1: ( ( '{' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:753:1: ( '{' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:753:1: ( '{' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:754:1: '{'
            {
             before(grammarAccess.getServiceSettingAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ServiceSetting__Group__6__Impl1486); 
             after(grammarAccess.getServiceSettingAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__6__Impl


    // $ANTLR start rule__ServiceSetting__Group__7
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:767:1: rule__ServiceSetting__Group__7 : rule__ServiceSetting__Group__7__Impl rule__ServiceSetting__Group__8 ;
    public final void rule__ServiceSetting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:771:1: ( rule__ServiceSetting__Group__7__Impl rule__ServiceSetting__Group__8 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:772:2: rule__ServiceSetting__Group__7__Impl rule__ServiceSetting__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__7__Impl_in_rule__ServiceSetting__Group__71517);
            rule__ServiceSetting__Group__7__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__8_in_rule__ServiceSetting__Group__71520);
            rule__ServiceSetting__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__7


    // $ANTLR start rule__ServiceSetting__Group__7__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:779:1: rule__ServiceSetting__Group__7__Impl : ( ( rule__ServiceSetting__Group_7__0 )? ) ;
    public final void rule__ServiceSetting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:783:1: ( ( ( rule__ServiceSetting__Group_7__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:784:1: ( ( rule__ServiceSetting__Group_7__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:784:1: ( ( rule__ServiceSetting__Group_7__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:785:1: ( rule__ServiceSetting__Group_7__0 )?
            {
             before(grammarAccess.getServiceSettingAccess().getGroup_7()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:786:1: ( rule__ServiceSetting__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:786:2: rule__ServiceSetting__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_7__0_in_rule__ServiceSetting__Group__7__Impl1547);
                    rule__ServiceSetting__Group_7__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__7__Impl


    // $ANTLR start rule__ServiceSetting__Group__8
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:796:1: rule__ServiceSetting__Group__8 : rule__ServiceSetting__Group__8__Impl rule__ServiceSetting__Group__9 ;
    public final void rule__ServiceSetting__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:800:1: ( rule__ServiceSetting__Group__8__Impl rule__ServiceSetting__Group__9 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:801:2: rule__ServiceSetting__Group__8__Impl rule__ServiceSetting__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__8__Impl_in_rule__ServiceSetting__Group__81578);
            rule__ServiceSetting__Group__8__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__9_in_rule__ServiceSetting__Group__81581);
            rule__ServiceSetting__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__8


    // $ANTLR start rule__ServiceSetting__Group__8__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:808:1: rule__ServiceSetting__Group__8__Impl : ( ( rule__ServiceSetting__Group_8__0 )? ) ;
    public final void rule__ServiceSetting__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:812:1: ( ( ( rule__ServiceSetting__Group_8__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:813:1: ( ( rule__ServiceSetting__Group_8__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:813:1: ( ( rule__ServiceSetting__Group_8__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:814:1: ( rule__ServiceSetting__Group_8__0 )?
            {
             before(grammarAccess.getServiceSettingAccess().getGroup_8()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:815:1: ( rule__ServiceSetting__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:815:2: rule__ServiceSetting__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_8__0_in_rule__ServiceSetting__Group__8__Impl1608);
                    rule__ServiceSetting__Group_8__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__8__Impl


    // $ANTLR start rule__ServiceSetting__Group__9
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:825:1: rule__ServiceSetting__Group__9 : rule__ServiceSetting__Group__9__Impl rule__ServiceSetting__Group__10 ;
    public final void rule__ServiceSetting__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:829:1: ( rule__ServiceSetting__Group__9__Impl rule__ServiceSetting__Group__10 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:830:2: rule__ServiceSetting__Group__9__Impl rule__ServiceSetting__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__9__Impl_in_rule__ServiceSetting__Group__91639);
            rule__ServiceSetting__Group__9__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__10_in_rule__ServiceSetting__Group__91642);
            rule__ServiceSetting__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__9


    // $ANTLR start rule__ServiceSetting__Group__9__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:837:1: rule__ServiceSetting__Group__9__Impl : ( ( rule__ServiceSetting__Group_9__0 )? ) ;
    public final void rule__ServiceSetting__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:841:1: ( ( ( rule__ServiceSetting__Group_9__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:842:1: ( ( rule__ServiceSetting__Group_9__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:842:1: ( ( rule__ServiceSetting__Group_9__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:843:1: ( rule__ServiceSetting__Group_9__0 )?
            {
             before(grammarAccess.getServiceSettingAccess().getGroup_9()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:844:1: ( rule__ServiceSetting__Group_9__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:844:2: rule__ServiceSetting__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_9__0_in_rule__ServiceSetting__Group__9__Impl1669);
                    rule__ServiceSetting__Group_9__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__9__Impl


    // $ANTLR start rule__ServiceSetting__Group__10
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:854:1: rule__ServiceSetting__Group__10 : rule__ServiceSetting__Group__10__Impl rule__ServiceSetting__Group__11 ;
    public final void rule__ServiceSetting__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:858:1: ( rule__ServiceSetting__Group__10__Impl rule__ServiceSetting__Group__11 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:859:2: rule__ServiceSetting__Group__10__Impl rule__ServiceSetting__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__10__Impl_in_rule__ServiceSetting__Group__101700);
            rule__ServiceSetting__Group__10__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__11_in_rule__ServiceSetting__Group__101703);
            rule__ServiceSetting__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__10


    // $ANTLR start rule__ServiceSetting__Group__10__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:866:1: rule__ServiceSetting__Group__10__Impl : ( ( rule__ServiceSetting__Group_10__0 )? ) ;
    public final void rule__ServiceSetting__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:870:1: ( ( ( rule__ServiceSetting__Group_10__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:871:1: ( ( rule__ServiceSetting__Group_10__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:871:1: ( ( rule__ServiceSetting__Group_10__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:872:1: ( rule__ServiceSetting__Group_10__0 )?
            {
             before(grammarAccess.getServiceSettingAccess().getGroup_10()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:873:1: ( rule__ServiceSetting__Group_10__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:873:2: rule__ServiceSetting__Group_10__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_10__0_in_rule__ServiceSetting__Group__10__Impl1730);
                    rule__ServiceSetting__Group_10__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__10__Impl


    // $ANTLR start rule__ServiceSetting__Group__11
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:883:1: rule__ServiceSetting__Group__11 : rule__ServiceSetting__Group__11__Impl rule__ServiceSetting__Group__12 ;
    public final void rule__ServiceSetting__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:887:1: ( rule__ServiceSetting__Group__11__Impl rule__ServiceSetting__Group__12 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:888:2: rule__ServiceSetting__Group__11__Impl rule__ServiceSetting__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__11__Impl_in_rule__ServiceSetting__Group__111761);
            rule__ServiceSetting__Group__11__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__12_in_rule__ServiceSetting__Group__111764);
            rule__ServiceSetting__Group__12();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__11


    // $ANTLR start rule__ServiceSetting__Group__11__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:895:1: rule__ServiceSetting__Group__11__Impl : ( ( rule__ServiceSetting__Group_11__0 )? ) ;
    public final void rule__ServiceSetting__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:899:1: ( ( ( rule__ServiceSetting__Group_11__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:900:1: ( ( rule__ServiceSetting__Group_11__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:900:1: ( ( rule__ServiceSetting__Group_11__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:901:1: ( rule__ServiceSetting__Group_11__0 )?
            {
             before(grammarAccess.getServiceSettingAccess().getGroup_11()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:902:1: ( rule__ServiceSetting__Group_11__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:902:2: rule__ServiceSetting__Group_11__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__0_in_rule__ServiceSetting__Group__11__Impl1791);
                    rule__ServiceSetting__Group_11__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__11__Impl


    // $ANTLR start rule__ServiceSetting__Group__12
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:912:1: rule__ServiceSetting__Group__12 : rule__ServiceSetting__Group__12__Impl rule__ServiceSetting__Group__13 ;
    public final void rule__ServiceSetting__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:916:1: ( rule__ServiceSetting__Group__12__Impl rule__ServiceSetting__Group__13 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:917:2: rule__ServiceSetting__Group__12__Impl rule__ServiceSetting__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__12__Impl_in_rule__ServiceSetting__Group__121822);
            rule__ServiceSetting__Group__12__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__13_in_rule__ServiceSetting__Group__121825);
            rule__ServiceSetting__Group__13();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__12


    // $ANTLR start rule__ServiceSetting__Group__12__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:924:1: rule__ServiceSetting__Group__12__Impl : ( ( rule__ServiceSetting__Group_12__0 )? ) ;
    public final void rule__ServiceSetting__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:928:1: ( ( ( rule__ServiceSetting__Group_12__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:929:1: ( ( rule__ServiceSetting__Group_12__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:929:1: ( ( rule__ServiceSetting__Group_12__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:930:1: ( rule__ServiceSetting__Group_12__0 )?
            {
             before(grammarAccess.getServiceSettingAccess().getGroup_12()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:931:1: ( rule__ServiceSetting__Group_12__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:931:2: rule__ServiceSetting__Group_12__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_12__0_in_rule__ServiceSetting__Group__12__Impl1852);
                    rule__ServiceSetting__Group_12__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__12__Impl


    // $ANTLR start rule__ServiceSetting__Group__13
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:941:1: rule__ServiceSetting__Group__13 : rule__ServiceSetting__Group__13__Impl ;
    public final void rule__ServiceSetting__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:945:1: ( rule__ServiceSetting__Group__13__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:946:2: rule__ServiceSetting__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group__13__Impl_in_rule__ServiceSetting__Group__131883);
            rule__ServiceSetting__Group__13__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__13


    // $ANTLR start rule__ServiceSetting__Group__13__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:952:1: rule__ServiceSetting__Group__13__Impl : ( '}' ) ;
    public final void rule__ServiceSetting__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:956:1: ( ( '}' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:957:1: ( '}' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:957:1: ( '}' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:958:1: '}'
            {
             before(grammarAccess.getServiceSettingAccess().getRightCurlyBracketKeyword_13()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ServiceSetting__Group__13__Impl1911); 
             after(grammarAccess.getServiceSettingAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group__13__Impl


    // $ANTLR start rule__ServiceSetting__Group_7__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:999:1: rule__ServiceSetting__Group_7__0 : rule__ServiceSetting__Group_7__0__Impl rule__ServiceSetting__Group_7__1 ;
    public final void rule__ServiceSetting__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1003:1: ( rule__ServiceSetting__Group_7__0__Impl rule__ServiceSetting__Group_7__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1004:2: rule__ServiceSetting__Group_7__0__Impl rule__ServiceSetting__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_7__0__Impl_in_rule__ServiceSetting__Group_7__01970);
            rule__ServiceSetting__Group_7__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_7__1_in_rule__ServiceSetting__Group_7__01973);
            rule__ServiceSetting__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_7__0


    // $ANTLR start rule__ServiceSetting__Group_7__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1011:1: rule__ServiceSetting__Group_7__0__Impl : ( 'id' ) ;
    public final void rule__ServiceSetting__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1015:1: ( ( 'id' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1016:1: ( 'id' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1016:1: ( 'id' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1017:1: 'id'
            {
             before(grammarAccess.getServiceSettingAccess().getIdKeyword_7_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ServiceSetting__Group_7__0__Impl2001); 
             after(grammarAccess.getServiceSettingAccess().getIdKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_7__0__Impl


    // $ANTLR start rule__ServiceSetting__Group_7__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1030:1: rule__ServiceSetting__Group_7__1 : rule__ServiceSetting__Group_7__1__Impl ;
    public final void rule__ServiceSetting__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1034:1: ( rule__ServiceSetting__Group_7__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1035:2: rule__ServiceSetting__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_7__1__Impl_in_rule__ServiceSetting__Group_7__12032);
            rule__ServiceSetting__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_7__1


    // $ANTLR start rule__ServiceSetting__Group_7__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1041:1: rule__ServiceSetting__Group_7__1__Impl : ( ( rule__ServiceSetting__IdAssignment_7_1 ) ) ;
    public final void rule__ServiceSetting__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1045:1: ( ( ( rule__ServiceSetting__IdAssignment_7_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1046:1: ( ( rule__ServiceSetting__IdAssignment_7_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1046:1: ( ( rule__ServiceSetting__IdAssignment_7_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1047:1: ( rule__ServiceSetting__IdAssignment_7_1 )
            {
             before(grammarAccess.getServiceSettingAccess().getIdAssignment_7_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1048:1: ( rule__ServiceSetting__IdAssignment_7_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1048:2: rule__ServiceSetting__IdAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__IdAssignment_7_1_in_rule__ServiceSetting__Group_7__1__Impl2059);
            rule__ServiceSetting__IdAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getIdAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_7__1__Impl


    // $ANTLR start rule__ServiceSetting__Group_8__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1062:1: rule__ServiceSetting__Group_8__0 : rule__ServiceSetting__Group_8__0__Impl rule__ServiceSetting__Group_8__1 ;
    public final void rule__ServiceSetting__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1066:1: ( rule__ServiceSetting__Group_8__0__Impl rule__ServiceSetting__Group_8__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1067:2: rule__ServiceSetting__Group_8__0__Impl rule__ServiceSetting__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_8__0__Impl_in_rule__ServiceSetting__Group_8__02093);
            rule__ServiceSetting__Group_8__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_8__1_in_rule__ServiceSetting__Group_8__02096);
            rule__ServiceSetting__Group_8__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_8__0


    // $ANTLR start rule__ServiceSetting__Group_8__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1074:1: rule__ServiceSetting__Group_8__0__Impl : ( 'description' ) ;
    public final void rule__ServiceSetting__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1078:1: ( ( 'description' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1079:1: ( 'description' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1079:1: ( 'description' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1080:1: 'description'
            {
             before(grammarAccess.getServiceSettingAccess().getDescriptionKeyword_8_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ServiceSetting__Group_8__0__Impl2124); 
             after(grammarAccess.getServiceSettingAccess().getDescriptionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_8__0__Impl


    // $ANTLR start rule__ServiceSetting__Group_8__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1093:1: rule__ServiceSetting__Group_8__1 : rule__ServiceSetting__Group_8__1__Impl ;
    public final void rule__ServiceSetting__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1097:1: ( rule__ServiceSetting__Group_8__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1098:2: rule__ServiceSetting__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_8__1__Impl_in_rule__ServiceSetting__Group_8__12155);
            rule__ServiceSetting__Group_8__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_8__1


    // $ANTLR start rule__ServiceSetting__Group_8__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1104:1: rule__ServiceSetting__Group_8__1__Impl : ( ( rule__ServiceSetting__DescriptionAssignment_8_1 ) ) ;
    public final void rule__ServiceSetting__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1108:1: ( ( ( rule__ServiceSetting__DescriptionAssignment_8_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1109:1: ( ( rule__ServiceSetting__DescriptionAssignment_8_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1109:1: ( ( rule__ServiceSetting__DescriptionAssignment_8_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1110:1: ( rule__ServiceSetting__DescriptionAssignment_8_1 )
            {
             before(grammarAccess.getServiceSettingAccess().getDescriptionAssignment_8_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1111:1: ( rule__ServiceSetting__DescriptionAssignment_8_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1111:2: rule__ServiceSetting__DescriptionAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__DescriptionAssignment_8_1_in_rule__ServiceSetting__Group_8__1__Impl2182);
            rule__ServiceSetting__DescriptionAssignment_8_1();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getDescriptionAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_8__1__Impl


    // $ANTLR start rule__ServiceSetting__Group_9__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1125:1: rule__ServiceSetting__Group_9__0 : rule__ServiceSetting__Group_9__0__Impl rule__ServiceSetting__Group_9__1 ;
    public final void rule__ServiceSetting__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1129:1: ( rule__ServiceSetting__Group_9__0__Impl rule__ServiceSetting__Group_9__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1130:2: rule__ServiceSetting__Group_9__0__Impl rule__ServiceSetting__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_9__0__Impl_in_rule__ServiceSetting__Group_9__02216);
            rule__ServiceSetting__Group_9__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_9__1_in_rule__ServiceSetting__Group_9__02219);
            rule__ServiceSetting__Group_9__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_9__0


    // $ANTLR start rule__ServiceSetting__Group_9__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1137:1: rule__ServiceSetting__Group_9__0__Impl : ( 'Readable' ) ;
    public final void rule__ServiceSetting__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1141:1: ( ( 'Readable' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1142:1: ( 'Readable' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1142:1: ( 'Readable' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1143:1: 'Readable'
            {
             before(grammarAccess.getServiceSettingAccess().getReadableKeyword_9_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ServiceSetting__Group_9__0__Impl2247); 
             after(grammarAccess.getServiceSettingAccess().getReadableKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_9__0__Impl


    // $ANTLR start rule__ServiceSetting__Group_9__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1156:1: rule__ServiceSetting__Group_9__1 : rule__ServiceSetting__Group_9__1__Impl ;
    public final void rule__ServiceSetting__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1160:1: ( rule__ServiceSetting__Group_9__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1161:2: rule__ServiceSetting__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_9__1__Impl_in_rule__ServiceSetting__Group_9__12278);
            rule__ServiceSetting__Group_9__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_9__1


    // $ANTLR start rule__ServiceSetting__Group_9__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1167:1: rule__ServiceSetting__Group_9__1__Impl : ( ( rule__ServiceSetting__ReadableAssignment_9_1 ) ) ;
    public final void rule__ServiceSetting__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1171:1: ( ( ( rule__ServiceSetting__ReadableAssignment_9_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1172:1: ( ( rule__ServiceSetting__ReadableAssignment_9_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1172:1: ( ( rule__ServiceSetting__ReadableAssignment_9_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1173:1: ( rule__ServiceSetting__ReadableAssignment_9_1 )
            {
             before(grammarAccess.getServiceSettingAccess().getReadableAssignment_9_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1174:1: ( rule__ServiceSetting__ReadableAssignment_9_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1174:2: rule__ServiceSetting__ReadableAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__ReadableAssignment_9_1_in_rule__ServiceSetting__Group_9__1__Impl2305);
            rule__ServiceSetting__ReadableAssignment_9_1();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getReadableAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_9__1__Impl


    // $ANTLR start rule__ServiceSetting__Group_10__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1188:1: rule__ServiceSetting__Group_10__0 : rule__ServiceSetting__Group_10__0__Impl rule__ServiceSetting__Group_10__1 ;
    public final void rule__ServiceSetting__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1192:1: ( rule__ServiceSetting__Group_10__0__Impl rule__ServiceSetting__Group_10__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1193:2: rule__ServiceSetting__Group_10__0__Impl rule__ServiceSetting__Group_10__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_10__0__Impl_in_rule__ServiceSetting__Group_10__02339);
            rule__ServiceSetting__Group_10__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_10__1_in_rule__ServiceSetting__Group_10__02342);
            rule__ServiceSetting__Group_10__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_10__0


    // $ANTLR start rule__ServiceSetting__Group_10__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1200:1: rule__ServiceSetting__Group_10__0__Impl : ( 'Writable' ) ;
    public final void rule__ServiceSetting__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1204:1: ( ( 'Writable' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1205:1: ( 'Writable' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1205:1: ( 'Writable' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1206:1: 'Writable'
            {
             before(grammarAccess.getServiceSettingAccess().getWritableKeyword_10_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__ServiceSetting__Group_10__0__Impl2370); 
             after(grammarAccess.getServiceSettingAccess().getWritableKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_10__0__Impl


    // $ANTLR start rule__ServiceSetting__Group_10__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1219:1: rule__ServiceSetting__Group_10__1 : rule__ServiceSetting__Group_10__1__Impl ;
    public final void rule__ServiceSetting__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1223:1: ( rule__ServiceSetting__Group_10__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1224:2: rule__ServiceSetting__Group_10__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_10__1__Impl_in_rule__ServiceSetting__Group_10__12401);
            rule__ServiceSetting__Group_10__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_10__1


    // $ANTLR start rule__ServiceSetting__Group_10__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1230:1: rule__ServiceSetting__Group_10__1__Impl : ( ( rule__ServiceSetting__WritableAssignment_10_1 ) ) ;
    public final void rule__ServiceSetting__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1234:1: ( ( ( rule__ServiceSetting__WritableAssignment_10_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1235:1: ( ( rule__ServiceSetting__WritableAssignment_10_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1235:1: ( ( rule__ServiceSetting__WritableAssignment_10_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1236:1: ( rule__ServiceSetting__WritableAssignment_10_1 )
            {
             before(grammarAccess.getServiceSettingAccess().getWritableAssignment_10_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1237:1: ( rule__ServiceSetting__WritableAssignment_10_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1237:2: rule__ServiceSetting__WritableAssignment_10_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__WritableAssignment_10_1_in_rule__ServiceSetting__Group_10__1__Impl2428);
            rule__ServiceSetting__WritableAssignment_10_1();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getWritableAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_10__1__Impl


    // $ANTLR start rule__ServiceSetting__Group_11__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1251:1: rule__ServiceSetting__Group_11__0 : rule__ServiceSetting__Group_11__0__Impl rule__ServiceSetting__Group_11__1 ;
    public final void rule__ServiceSetting__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1255:1: ( rule__ServiceSetting__Group_11__0__Impl rule__ServiceSetting__Group_11__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1256:2: rule__ServiceSetting__Group_11__0__Impl rule__ServiceSetting__Group_11__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__0__Impl_in_rule__ServiceSetting__Group_11__02462);
            rule__ServiceSetting__Group_11__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__1_in_rule__ServiceSetting__Group_11__02465);
            rule__ServiceSetting__Group_11__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__0


    // $ANTLR start rule__ServiceSetting__Group_11__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1263:1: rule__ServiceSetting__Group_11__0__Impl : ( 'requiresParams' ) ;
    public final void rule__ServiceSetting__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1267:1: ( ( 'requiresParams' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1268:1: ( 'requiresParams' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1268:1: ( 'requiresParams' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1269:1: 'requiresParams'
            {
             before(grammarAccess.getServiceSettingAccess().getRequiresParamsKeyword_11_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__ServiceSetting__Group_11__0__Impl2493); 
             after(grammarAccess.getServiceSettingAccess().getRequiresParamsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__0__Impl


    // $ANTLR start rule__ServiceSetting__Group_11__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1282:1: rule__ServiceSetting__Group_11__1 : rule__ServiceSetting__Group_11__1__Impl rule__ServiceSetting__Group_11__2 ;
    public final void rule__ServiceSetting__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1286:1: ( rule__ServiceSetting__Group_11__1__Impl rule__ServiceSetting__Group_11__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1287:2: rule__ServiceSetting__Group_11__1__Impl rule__ServiceSetting__Group_11__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__1__Impl_in_rule__ServiceSetting__Group_11__12524);
            rule__ServiceSetting__Group_11__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__2_in_rule__ServiceSetting__Group_11__12527);
            rule__ServiceSetting__Group_11__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__1


    // $ANTLR start rule__ServiceSetting__Group_11__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1294:1: rule__ServiceSetting__Group_11__1__Impl : ( '(' ) ;
    public final void rule__ServiceSetting__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1298:1: ( ( '(' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1299:1: ( '(' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1299:1: ( '(' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1300:1: '('
            {
             before(grammarAccess.getServiceSettingAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__ServiceSetting__Group_11__1__Impl2555); 
             after(grammarAccess.getServiceSettingAccess().getLeftParenthesisKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__1__Impl


    // $ANTLR start rule__ServiceSetting__Group_11__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1313:1: rule__ServiceSetting__Group_11__2 : rule__ServiceSetting__Group_11__2__Impl rule__ServiceSetting__Group_11__3 ;
    public final void rule__ServiceSetting__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1317:1: ( rule__ServiceSetting__Group_11__2__Impl rule__ServiceSetting__Group_11__3 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1318:2: rule__ServiceSetting__Group_11__2__Impl rule__ServiceSetting__Group_11__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__2__Impl_in_rule__ServiceSetting__Group_11__22586);
            rule__ServiceSetting__Group_11__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__3_in_rule__ServiceSetting__Group_11__22589);
            rule__ServiceSetting__Group_11__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__2


    // $ANTLR start rule__ServiceSetting__Group_11__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1325:1: rule__ServiceSetting__Group_11__2__Impl : ( ( rule__ServiceSetting__RequiresParamsAssignment_11_2 ) ) ;
    public final void rule__ServiceSetting__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1329:1: ( ( ( rule__ServiceSetting__RequiresParamsAssignment_11_2 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1330:1: ( ( rule__ServiceSetting__RequiresParamsAssignment_11_2 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1330:1: ( ( rule__ServiceSetting__RequiresParamsAssignment_11_2 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1331:1: ( rule__ServiceSetting__RequiresParamsAssignment_11_2 )
            {
             before(grammarAccess.getServiceSettingAccess().getRequiresParamsAssignment_11_2()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1332:1: ( rule__ServiceSetting__RequiresParamsAssignment_11_2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1332:2: rule__ServiceSetting__RequiresParamsAssignment_11_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__RequiresParamsAssignment_11_2_in_rule__ServiceSetting__Group_11__2__Impl2616);
            rule__ServiceSetting__RequiresParamsAssignment_11_2();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getRequiresParamsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__2__Impl


    // $ANTLR start rule__ServiceSetting__Group_11__3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1342:1: rule__ServiceSetting__Group_11__3 : rule__ServiceSetting__Group_11__3__Impl rule__ServiceSetting__Group_11__4 ;
    public final void rule__ServiceSetting__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1346:1: ( rule__ServiceSetting__Group_11__3__Impl rule__ServiceSetting__Group_11__4 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1347:2: rule__ServiceSetting__Group_11__3__Impl rule__ServiceSetting__Group_11__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__3__Impl_in_rule__ServiceSetting__Group_11__32646);
            rule__ServiceSetting__Group_11__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__4_in_rule__ServiceSetting__Group_11__32649);
            rule__ServiceSetting__Group_11__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__3


    // $ANTLR start rule__ServiceSetting__Group_11__3__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1354:1: rule__ServiceSetting__Group_11__3__Impl : ( ( rule__ServiceSetting__Group_11_3__0 )* ) ;
    public final void rule__ServiceSetting__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1358:1: ( ( ( rule__ServiceSetting__Group_11_3__0 )* ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1359:1: ( ( rule__ServiceSetting__Group_11_3__0 )* )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1359:1: ( ( rule__ServiceSetting__Group_11_3__0 )* )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1360:1: ( rule__ServiceSetting__Group_11_3__0 )*
            {
             before(grammarAccess.getServiceSettingAccess().getGroup_11_3()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1361:1: ( rule__ServiceSetting__Group_11_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1361:2: rule__ServiceSetting__Group_11_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11_3__0_in_rule__ServiceSetting__Group_11__3__Impl2676);
            	    rule__ServiceSetting__Group_11_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getServiceSettingAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__3__Impl


    // $ANTLR start rule__ServiceSetting__Group_11__4
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1371:1: rule__ServiceSetting__Group_11__4 : rule__ServiceSetting__Group_11__4__Impl ;
    public final void rule__ServiceSetting__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1375:1: ( rule__ServiceSetting__Group_11__4__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1376:2: rule__ServiceSetting__Group_11__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11__4__Impl_in_rule__ServiceSetting__Group_11__42707);
            rule__ServiceSetting__Group_11__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__4


    // $ANTLR start rule__ServiceSetting__Group_11__4__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1382:1: rule__ServiceSetting__Group_11__4__Impl : ( ')' ) ;
    public final void rule__ServiceSetting__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1386:1: ( ( ')' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1387:1: ( ')' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1387:1: ( ')' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1388:1: ')'
            {
             before(grammarAccess.getServiceSettingAccess().getRightParenthesisKeyword_11_4()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__ServiceSetting__Group_11__4__Impl2735); 
             after(grammarAccess.getServiceSettingAccess().getRightParenthesisKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11__4__Impl


    // $ANTLR start rule__ServiceSetting__Group_11_3__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1411:1: rule__ServiceSetting__Group_11_3__0 : rule__ServiceSetting__Group_11_3__0__Impl rule__ServiceSetting__Group_11_3__1 ;
    public final void rule__ServiceSetting__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1415:1: ( rule__ServiceSetting__Group_11_3__0__Impl rule__ServiceSetting__Group_11_3__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1416:2: rule__ServiceSetting__Group_11_3__0__Impl rule__ServiceSetting__Group_11_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11_3__0__Impl_in_rule__ServiceSetting__Group_11_3__02776);
            rule__ServiceSetting__Group_11_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11_3__1_in_rule__ServiceSetting__Group_11_3__02779);
            rule__ServiceSetting__Group_11_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11_3__0


    // $ANTLR start rule__ServiceSetting__Group_11_3__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1423:1: rule__ServiceSetting__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__ServiceSetting__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1427:1: ( ( ',' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1428:1: ( ',' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1428:1: ( ',' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1429:1: ','
            {
             before(grammarAccess.getServiceSettingAccess().getCommaKeyword_11_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__ServiceSetting__Group_11_3__0__Impl2807); 
             after(grammarAccess.getServiceSettingAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11_3__0__Impl


    // $ANTLR start rule__ServiceSetting__Group_11_3__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1442:1: rule__ServiceSetting__Group_11_3__1 : rule__ServiceSetting__Group_11_3__1__Impl ;
    public final void rule__ServiceSetting__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1446:1: ( rule__ServiceSetting__Group_11_3__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1447:2: rule__ServiceSetting__Group_11_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_11_3__1__Impl_in_rule__ServiceSetting__Group_11_3__12838);
            rule__ServiceSetting__Group_11_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11_3__1


    // $ANTLR start rule__ServiceSetting__Group_11_3__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1453:1: rule__ServiceSetting__Group_11_3__1__Impl : ( ( rule__ServiceSetting__RequiresParamsAssignment_11_3_1 ) ) ;
    public final void rule__ServiceSetting__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1457:1: ( ( ( rule__ServiceSetting__RequiresParamsAssignment_11_3_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1458:1: ( ( rule__ServiceSetting__RequiresParamsAssignment_11_3_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1458:1: ( ( rule__ServiceSetting__RequiresParamsAssignment_11_3_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1459:1: ( rule__ServiceSetting__RequiresParamsAssignment_11_3_1 )
            {
             before(grammarAccess.getServiceSettingAccess().getRequiresParamsAssignment_11_3_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1460:1: ( rule__ServiceSetting__RequiresParamsAssignment_11_3_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1460:2: rule__ServiceSetting__RequiresParamsAssignment_11_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__RequiresParamsAssignment_11_3_1_in_rule__ServiceSetting__Group_11_3__1__Impl2865);
            rule__ServiceSetting__RequiresParamsAssignment_11_3_1();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getRequiresParamsAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_11_3__1__Impl


    // $ANTLR start rule__ServiceSetting__Group_12__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1474:1: rule__ServiceSetting__Group_12__0 : rule__ServiceSetting__Group_12__0__Impl rule__ServiceSetting__Group_12__1 ;
    public final void rule__ServiceSetting__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1478:1: ( rule__ServiceSetting__Group_12__0__Impl rule__ServiceSetting__Group_12__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1479:2: rule__ServiceSetting__Group_12__0__Impl rule__ServiceSetting__Group_12__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_12__0__Impl_in_rule__ServiceSetting__Group_12__02899);
            rule__ServiceSetting__Group_12__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_12__1_in_rule__ServiceSetting__Group_12__02902);
            rule__ServiceSetting__Group_12__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_12__0


    // $ANTLR start rule__ServiceSetting__Group_12__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1486:1: rule__ServiceSetting__Group_12__0__Impl : ( 'settingType' ) ;
    public final void rule__ServiceSetting__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1490:1: ( ( 'settingType' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1491:1: ( 'settingType' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1491:1: ( 'settingType' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1492:1: 'settingType'
            {
             before(grammarAccess.getServiceSettingAccess().getSettingTypeKeyword_12_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__ServiceSetting__Group_12__0__Impl2930); 
             after(grammarAccess.getServiceSettingAccess().getSettingTypeKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_12__0__Impl


    // $ANTLR start rule__ServiceSetting__Group_12__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1505:1: rule__ServiceSetting__Group_12__1 : rule__ServiceSetting__Group_12__1__Impl ;
    public final void rule__ServiceSetting__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1509:1: ( rule__ServiceSetting__Group_12__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1510:2: rule__ServiceSetting__Group_12__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__Group_12__1__Impl_in_rule__ServiceSetting__Group_12__12961);
            rule__ServiceSetting__Group_12__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_12__1


    // $ANTLR start rule__ServiceSetting__Group_12__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1516:1: rule__ServiceSetting__Group_12__1__Impl : ( ( rule__ServiceSetting__SettingTypeAssignment_12_1 ) ) ;
    public final void rule__ServiceSetting__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1520:1: ( ( ( rule__ServiceSetting__SettingTypeAssignment_12_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1521:1: ( ( rule__ServiceSetting__SettingTypeAssignment_12_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1521:1: ( ( rule__ServiceSetting__SettingTypeAssignment_12_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1522:1: ( rule__ServiceSetting__SettingTypeAssignment_12_1 )
            {
             before(grammarAccess.getServiceSettingAccess().getSettingTypeAssignment_12_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1523:1: ( rule__ServiceSetting__SettingTypeAssignment_12_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1523:2: rule__ServiceSetting__SettingTypeAssignment_12_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ServiceSetting__SettingTypeAssignment_12_1_in_rule__ServiceSetting__Group_12__1__Impl2988);
            rule__ServiceSetting__SettingTypeAssignment_12_1();
            _fsp--;


            }

             after(grammarAccess.getServiceSettingAccess().getSettingTypeAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__Group_12__1__Impl


    // $ANTLR start rule__OfferedService__Group__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1537:1: rule__OfferedService__Group__0 : rule__OfferedService__Group__0__Impl rule__OfferedService__Group__1 ;
    public final void rule__OfferedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1541:1: ( rule__OfferedService__Group__0__Impl rule__OfferedService__Group__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1542:2: rule__OfferedService__Group__0__Impl rule__OfferedService__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__0__Impl_in_rule__OfferedService__Group__03022);
            rule__OfferedService__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__1_in_rule__OfferedService__Group__03025);
            rule__OfferedService__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__0


    // $ANTLR start rule__OfferedService__Group__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1549:1: rule__OfferedService__Group__0__Impl : ( () ) ;
    public final void rule__OfferedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1553:1: ( ( () ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1554:1: ( () )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1554:1: ( () )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1555:1: ()
            {
             before(grammarAccess.getOfferedServiceAccess().getOfferedServiceAction_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1556:1: ()
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1558:1: 
            {
            }

             after(grammarAccess.getOfferedServiceAccess().getOfferedServiceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__0__Impl


    // $ANTLR start rule__OfferedService__Group__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1568:1: rule__OfferedService__Group__1 : rule__OfferedService__Group__1__Impl rule__OfferedService__Group__2 ;
    public final void rule__OfferedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1572:1: ( rule__OfferedService__Group__1__Impl rule__OfferedService__Group__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1573:2: rule__OfferedService__Group__1__Impl rule__OfferedService__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__1__Impl_in_rule__OfferedService__Group__13083);
            rule__OfferedService__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__2_in_rule__OfferedService__Group__13086);
            rule__OfferedService__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__1


    // $ANTLR start rule__OfferedService__Group__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1580:1: rule__OfferedService__Group__1__Impl : ( 'OfferedService' ) ;
    public final void rule__OfferedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1584:1: ( ( 'OfferedService' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1585:1: ( 'OfferedService' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1585:1: ( 'OfferedService' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1586:1: 'OfferedService'
            {
             before(grammarAccess.getOfferedServiceAccess().getOfferedServiceKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__OfferedService__Group__1__Impl3114); 
             after(grammarAccess.getOfferedServiceAccess().getOfferedServiceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__1__Impl


    // $ANTLR start rule__OfferedService__Group__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1599:1: rule__OfferedService__Group__2 : rule__OfferedService__Group__2__Impl rule__OfferedService__Group__3 ;
    public final void rule__OfferedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1603:1: ( rule__OfferedService__Group__2__Impl rule__OfferedService__Group__3 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1604:2: rule__OfferedService__Group__2__Impl rule__OfferedService__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__2__Impl_in_rule__OfferedService__Group__23145);
            rule__OfferedService__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__3_in_rule__OfferedService__Group__23148);
            rule__OfferedService__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__2


    // $ANTLR start rule__OfferedService__Group__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1611:1: rule__OfferedService__Group__2__Impl : ( ( rule__OfferedService__NameAssignment_2 ) ) ;
    public final void rule__OfferedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1615:1: ( ( ( rule__OfferedService__NameAssignment_2 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1616:1: ( ( rule__OfferedService__NameAssignment_2 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1616:1: ( ( rule__OfferedService__NameAssignment_2 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1617:1: ( rule__OfferedService__NameAssignment_2 )
            {
             before(grammarAccess.getOfferedServiceAccess().getNameAssignment_2()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1618:1: ( rule__OfferedService__NameAssignment_2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1618:2: rule__OfferedService__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__NameAssignment_2_in_rule__OfferedService__Group__2__Impl3175);
            rule__OfferedService__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getOfferedServiceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__2__Impl


    // $ANTLR start rule__OfferedService__Group__3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1628:1: rule__OfferedService__Group__3 : rule__OfferedService__Group__3__Impl rule__OfferedService__Group__4 ;
    public final void rule__OfferedService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1632:1: ( rule__OfferedService__Group__3__Impl rule__OfferedService__Group__4 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1633:2: rule__OfferedService__Group__3__Impl rule__OfferedService__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__3__Impl_in_rule__OfferedService__Group__33205);
            rule__OfferedService__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__4_in_rule__OfferedService__Group__33208);
            rule__OfferedService__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__3


    // $ANTLR start rule__OfferedService__Group__3__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1640:1: rule__OfferedService__Group__3__Impl : ( '{' ) ;
    public final void rule__OfferedService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1644:1: ( ( '{' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1645:1: ( '{' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1645:1: ( '{' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1646:1: '{'
            {
             before(grammarAccess.getOfferedServiceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__OfferedService__Group__3__Impl3236); 
             after(grammarAccess.getOfferedServiceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__3__Impl


    // $ANTLR start rule__OfferedService__Group__4
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1659:1: rule__OfferedService__Group__4 : rule__OfferedService__Group__4__Impl rule__OfferedService__Group__5 ;
    public final void rule__OfferedService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1663:1: ( rule__OfferedService__Group__4__Impl rule__OfferedService__Group__5 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1664:2: rule__OfferedService__Group__4__Impl rule__OfferedService__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__4__Impl_in_rule__OfferedService__Group__43267);
            rule__OfferedService__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__5_in_rule__OfferedService__Group__43270);
            rule__OfferedService__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__4


    // $ANTLR start rule__OfferedService__Group__4__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1671:1: rule__OfferedService__Group__4__Impl : ( ( rule__OfferedService__Group_4__0 )? ) ;
    public final void rule__OfferedService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1675:1: ( ( ( rule__OfferedService__Group_4__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1676:1: ( ( rule__OfferedService__Group_4__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1676:1: ( ( rule__OfferedService__Group_4__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1677:1: ( rule__OfferedService__Group_4__0 )?
            {
             before(grammarAccess.getOfferedServiceAccess().getGroup_4()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1678:1: ( rule__OfferedService__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1678:2: rule__OfferedService__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__0_in_rule__OfferedService__Group__4__Impl3297);
                    rule__OfferedService__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOfferedServiceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__4__Impl


    // $ANTLR start rule__OfferedService__Group__5
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1688:1: rule__OfferedService__Group__5 : rule__OfferedService__Group__5__Impl ;
    public final void rule__OfferedService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1692:1: ( rule__OfferedService__Group__5__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1693:2: rule__OfferedService__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group__5__Impl_in_rule__OfferedService__Group__53328);
            rule__OfferedService__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__5


    // $ANTLR start rule__OfferedService__Group__5__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1699:1: rule__OfferedService__Group__5__Impl : ( '}' ) ;
    public final void rule__OfferedService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1703:1: ( ( '}' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1704:1: ( '}' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1704:1: ( '}' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1705:1: '}'
            {
             before(grammarAccess.getOfferedServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__OfferedService__Group__5__Impl3356); 
             after(grammarAccess.getOfferedServiceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group__5__Impl


    // $ANTLR start rule__OfferedService__Group_4__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1730:1: rule__OfferedService__Group_4__0 : rule__OfferedService__Group_4__0__Impl rule__OfferedService__Group_4__1 ;
    public final void rule__OfferedService__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1734:1: ( rule__OfferedService__Group_4__0__Impl rule__OfferedService__Group_4__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1735:2: rule__OfferedService__Group_4__0__Impl rule__OfferedService__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__0__Impl_in_rule__OfferedService__Group_4__03399);
            rule__OfferedService__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__1_in_rule__OfferedService__Group_4__03402);
            rule__OfferedService__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__0


    // $ANTLR start rule__OfferedService__Group_4__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1742:1: rule__OfferedService__Group_4__0__Impl : ( 'serviceSettings' ) ;
    public final void rule__OfferedService__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1746:1: ( ( 'serviceSettings' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1747:1: ( 'serviceSettings' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1747:1: ( 'serviceSettings' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1748:1: 'serviceSettings'
            {
             before(grammarAccess.getOfferedServiceAccess().getServiceSettingsKeyword_4_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__OfferedService__Group_4__0__Impl3430); 
             after(grammarAccess.getOfferedServiceAccess().getServiceSettingsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__0__Impl


    // $ANTLR start rule__OfferedService__Group_4__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1761:1: rule__OfferedService__Group_4__1 : rule__OfferedService__Group_4__1__Impl rule__OfferedService__Group_4__2 ;
    public final void rule__OfferedService__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1765:1: ( rule__OfferedService__Group_4__1__Impl rule__OfferedService__Group_4__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1766:2: rule__OfferedService__Group_4__1__Impl rule__OfferedService__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__1__Impl_in_rule__OfferedService__Group_4__13461);
            rule__OfferedService__Group_4__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__2_in_rule__OfferedService__Group_4__13464);
            rule__OfferedService__Group_4__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__1


    // $ANTLR start rule__OfferedService__Group_4__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1773:1: rule__OfferedService__Group_4__1__Impl : ( '{' ) ;
    public final void rule__OfferedService__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1777:1: ( ( '{' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1778:1: ( '{' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1778:1: ( '{' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1779:1: '{'
            {
             before(grammarAccess.getOfferedServiceAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__OfferedService__Group_4__1__Impl3492); 
             after(grammarAccess.getOfferedServiceAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__1__Impl


    // $ANTLR start rule__OfferedService__Group_4__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1792:1: rule__OfferedService__Group_4__2 : rule__OfferedService__Group_4__2__Impl rule__OfferedService__Group_4__3 ;
    public final void rule__OfferedService__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1796:1: ( rule__OfferedService__Group_4__2__Impl rule__OfferedService__Group_4__3 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1797:2: rule__OfferedService__Group_4__2__Impl rule__OfferedService__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__2__Impl_in_rule__OfferedService__Group_4__23523);
            rule__OfferedService__Group_4__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__3_in_rule__OfferedService__Group_4__23526);
            rule__OfferedService__Group_4__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__2


    // $ANTLR start rule__OfferedService__Group_4__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1804:1: rule__OfferedService__Group_4__2__Impl : ( ( rule__OfferedService__ServiceSettingsAssignment_4_2 ) ) ;
    public final void rule__OfferedService__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1808:1: ( ( ( rule__OfferedService__ServiceSettingsAssignment_4_2 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1809:1: ( ( rule__OfferedService__ServiceSettingsAssignment_4_2 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1809:1: ( ( rule__OfferedService__ServiceSettingsAssignment_4_2 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1810:1: ( rule__OfferedService__ServiceSettingsAssignment_4_2 )
            {
             before(grammarAccess.getOfferedServiceAccess().getServiceSettingsAssignment_4_2()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1811:1: ( rule__OfferedService__ServiceSettingsAssignment_4_2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1811:2: rule__OfferedService__ServiceSettingsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__ServiceSettingsAssignment_4_2_in_rule__OfferedService__Group_4__2__Impl3553);
            rule__OfferedService__ServiceSettingsAssignment_4_2();
            _fsp--;


            }

             after(grammarAccess.getOfferedServiceAccess().getServiceSettingsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__2__Impl


    // $ANTLR start rule__OfferedService__Group_4__3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1821:1: rule__OfferedService__Group_4__3 : rule__OfferedService__Group_4__3__Impl rule__OfferedService__Group_4__4 ;
    public final void rule__OfferedService__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1825:1: ( rule__OfferedService__Group_4__3__Impl rule__OfferedService__Group_4__4 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1826:2: rule__OfferedService__Group_4__3__Impl rule__OfferedService__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__3__Impl_in_rule__OfferedService__Group_4__33583);
            rule__OfferedService__Group_4__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__4_in_rule__OfferedService__Group_4__33586);
            rule__OfferedService__Group_4__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__3


    // $ANTLR start rule__OfferedService__Group_4__3__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1833:1: rule__OfferedService__Group_4__3__Impl : ( ( rule__OfferedService__Group_4_3__0 )* ) ;
    public final void rule__OfferedService__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1837:1: ( ( ( rule__OfferedService__Group_4_3__0 )* ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1838:1: ( ( rule__OfferedService__Group_4_3__0 )* )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1838:1: ( ( rule__OfferedService__Group_4_3__0 )* )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1839:1: ( rule__OfferedService__Group_4_3__0 )*
            {
             before(grammarAccess.getOfferedServiceAccess().getGroup_4_3()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1840:1: ( rule__OfferedService__Group_4_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1840:2: rule__OfferedService__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4_3__0_in_rule__OfferedService__Group_4__3__Impl3613);
            	    rule__OfferedService__Group_4_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getOfferedServiceAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__3__Impl


    // $ANTLR start rule__OfferedService__Group_4__4
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1850:1: rule__OfferedService__Group_4__4 : rule__OfferedService__Group_4__4__Impl ;
    public final void rule__OfferedService__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1854:1: ( rule__OfferedService__Group_4__4__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1855:2: rule__OfferedService__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4__4__Impl_in_rule__OfferedService__Group_4__43644);
            rule__OfferedService__Group_4__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__4


    // $ANTLR start rule__OfferedService__Group_4__4__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1861:1: rule__OfferedService__Group_4__4__Impl : ( '}' ) ;
    public final void rule__OfferedService__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1865:1: ( ( '}' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1866:1: ( '}' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1866:1: ( '}' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1867:1: '}'
            {
             before(grammarAccess.getOfferedServiceAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__OfferedService__Group_4__4__Impl3672); 
             after(grammarAccess.getOfferedServiceAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4__4__Impl


    // $ANTLR start rule__OfferedService__Group_4_3__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1890:1: rule__OfferedService__Group_4_3__0 : rule__OfferedService__Group_4_3__0__Impl rule__OfferedService__Group_4_3__1 ;
    public final void rule__OfferedService__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1894:1: ( rule__OfferedService__Group_4_3__0__Impl rule__OfferedService__Group_4_3__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1895:2: rule__OfferedService__Group_4_3__0__Impl rule__OfferedService__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4_3__0__Impl_in_rule__OfferedService__Group_4_3__03713);
            rule__OfferedService__Group_4_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4_3__1_in_rule__OfferedService__Group_4_3__03716);
            rule__OfferedService__Group_4_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4_3__0


    // $ANTLR start rule__OfferedService__Group_4_3__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1902:1: rule__OfferedService__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__OfferedService__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1906:1: ( ( ',' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1907:1: ( ',' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1907:1: ( ',' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1908:1: ','
            {
             before(grammarAccess.getOfferedServiceAccess().getCommaKeyword_4_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__OfferedService__Group_4_3__0__Impl3744); 
             after(grammarAccess.getOfferedServiceAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4_3__0__Impl


    // $ANTLR start rule__OfferedService__Group_4_3__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1921:1: rule__OfferedService__Group_4_3__1 : rule__OfferedService__Group_4_3__1__Impl ;
    public final void rule__OfferedService__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1925:1: ( rule__OfferedService__Group_4_3__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1926:2: rule__OfferedService__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__Group_4_3__1__Impl_in_rule__OfferedService__Group_4_3__13775);
            rule__OfferedService__Group_4_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4_3__1


    // $ANTLR start rule__OfferedService__Group_4_3__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1932:1: rule__OfferedService__Group_4_3__1__Impl : ( ( rule__OfferedService__ServiceSettingsAssignment_4_3_1 ) ) ;
    public final void rule__OfferedService__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1936:1: ( ( ( rule__OfferedService__ServiceSettingsAssignment_4_3_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1937:1: ( ( rule__OfferedService__ServiceSettingsAssignment_4_3_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1937:1: ( ( rule__OfferedService__ServiceSettingsAssignment_4_3_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1938:1: ( rule__OfferedService__ServiceSettingsAssignment_4_3_1 )
            {
             before(grammarAccess.getOfferedServiceAccess().getServiceSettingsAssignment_4_3_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1939:1: ( rule__OfferedService__ServiceSettingsAssignment_4_3_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1939:2: rule__OfferedService__ServiceSettingsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__OfferedService__ServiceSettingsAssignment_4_3_1_in_rule__OfferedService__Group_4_3__1__Impl3802);
            rule__OfferedService__ServiceSettingsAssignment_4_3_1();
            _fsp--;


            }

             after(grammarAccess.getOfferedServiceAccess().getServiceSettingsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__Group_4_3__1__Impl


    // $ANTLR start rule__TideTypeSTRING__Group__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1953:1: rule__TideTypeSTRING__Group__0 : rule__TideTypeSTRING__Group__0__Impl rule__TideTypeSTRING__Group__1 ;
    public final void rule__TideTypeSTRING__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1957:1: ( rule__TideTypeSTRING__Group__0__Impl rule__TideTypeSTRING__Group__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1958:2: rule__TideTypeSTRING__Group__0__Impl rule__TideTypeSTRING__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__0__Impl_in_rule__TideTypeSTRING__Group__03836);
            rule__TideTypeSTRING__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__1_in_rule__TideTypeSTRING__Group__03839);
            rule__TideTypeSTRING__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__0


    // $ANTLR start rule__TideTypeSTRING__Group__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1965:1: rule__TideTypeSTRING__Group__0__Impl : ( () ) ;
    public final void rule__TideTypeSTRING__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1969:1: ( ( () ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1970:1: ( () )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1970:1: ( () )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1971:1: ()
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getTideTypeStringAction_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1972:1: ()
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1974:1: 
            {
            }

             after(grammarAccess.getTideTypeSTRINGAccess().getTideTypeStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__0__Impl


    // $ANTLR start rule__TideTypeSTRING__Group__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1984:1: rule__TideTypeSTRING__Group__1 : rule__TideTypeSTRING__Group__1__Impl rule__TideTypeSTRING__Group__2 ;
    public final void rule__TideTypeSTRING__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1988:1: ( rule__TideTypeSTRING__Group__1__Impl rule__TideTypeSTRING__Group__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1989:2: rule__TideTypeSTRING__Group__1__Impl rule__TideTypeSTRING__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__1__Impl_in_rule__TideTypeSTRING__Group__13897);
            rule__TideTypeSTRING__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__2_in_rule__TideTypeSTRING__Group__13900);
            rule__TideTypeSTRING__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__1


    // $ANTLR start rule__TideTypeSTRING__Group__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:1996:1: rule__TideTypeSTRING__Group__1__Impl : ( 'STRING' ) ;
    public final void rule__TideTypeSTRING__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2000:1: ( ( 'STRING' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2001:1: ( 'STRING' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2001:1: ( 'STRING' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2002:1: 'STRING'
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getSTRINGKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__TideTypeSTRING__Group__1__Impl3928); 
             after(grammarAccess.getTideTypeSTRINGAccess().getSTRINGKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__1__Impl


    // $ANTLR start rule__TideTypeSTRING__Group__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2015:1: rule__TideTypeSTRING__Group__2 : rule__TideTypeSTRING__Group__2__Impl rule__TideTypeSTRING__Group__3 ;
    public final void rule__TideTypeSTRING__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2019:1: ( rule__TideTypeSTRING__Group__2__Impl rule__TideTypeSTRING__Group__3 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2020:2: rule__TideTypeSTRING__Group__2__Impl rule__TideTypeSTRING__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__2__Impl_in_rule__TideTypeSTRING__Group__23959);
            rule__TideTypeSTRING__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__3_in_rule__TideTypeSTRING__Group__23962);
            rule__TideTypeSTRING__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__2


    // $ANTLR start rule__TideTypeSTRING__Group__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2027:1: rule__TideTypeSTRING__Group__2__Impl : ( '{' ) ;
    public final void rule__TideTypeSTRING__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2031:1: ( ( '{' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2032:1: ( '{' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2032:1: ( '{' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2033:1: '{'
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TideTypeSTRING__Group__2__Impl3990); 
             after(grammarAccess.getTideTypeSTRINGAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__2__Impl


    // $ANTLR start rule__TideTypeSTRING__Group__3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2046:1: rule__TideTypeSTRING__Group__3 : rule__TideTypeSTRING__Group__3__Impl rule__TideTypeSTRING__Group__4 ;
    public final void rule__TideTypeSTRING__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2050:1: ( rule__TideTypeSTRING__Group__3__Impl rule__TideTypeSTRING__Group__4 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2051:2: rule__TideTypeSTRING__Group__3__Impl rule__TideTypeSTRING__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__3__Impl_in_rule__TideTypeSTRING__Group__34021);
            rule__TideTypeSTRING__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__4_in_rule__TideTypeSTRING__Group__34024);
            rule__TideTypeSTRING__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__3


    // $ANTLR start rule__TideTypeSTRING__Group__3__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2058:1: rule__TideTypeSTRING__Group__3__Impl : ( ( rule__TideTypeSTRING__Group_3__0 )? ) ;
    public final void rule__TideTypeSTRING__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2062:1: ( ( ( rule__TideTypeSTRING__Group_3__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2063:1: ( ( rule__TideTypeSTRING__Group_3__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2063:1: ( ( rule__TideTypeSTRING__Group_3__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2064:1: ( rule__TideTypeSTRING__Group_3__0 )?
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getGroup_3()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2065:1: ( rule__TideTypeSTRING__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2065:2: rule__TideTypeSTRING__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group_3__0_in_rule__TideTypeSTRING__Group__3__Impl4051);
                    rule__TideTypeSTRING__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTideTypeSTRINGAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__3__Impl


    // $ANTLR start rule__TideTypeSTRING__Group__4
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2075:1: rule__TideTypeSTRING__Group__4 : rule__TideTypeSTRING__Group__4__Impl ;
    public final void rule__TideTypeSTRING__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2079:1: ( rule__TideTypeSTRING__Group__4__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2080:2: rule__TideTypeSTRING__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group__4__Impl_in_rule__TideTypeSTRING__Group__44082);
            rule__TideTypeSTRING__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__4


    // $ANTLR start rule__TideTypeSTRING__Group__4__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2086:1: rule__TideTypeSTRING__Group__4__Impl : ( '}' ) ;
    public final void rule__TideTypeSTRING__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2090:1: ( ( '}' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2091:1: ( '}' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2091:1: ( '}' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2092:1: '}'
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TideTypeSTRING__Group__4__Impl4110); 
             after(grammarAccess.getTideTypeSTRINGAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group__4__Impl


    // $ANTLR start rule__TideTypeSTRING__Group_3__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2115:1: rule__TideTypeSTRING__Group_3__0 : rule__TideTypeSTRING__Group_3__0__Impl rule__TideTypeSTRING__Group_3__1 ;
    public final void rule__TideTypeSTRING__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2119:1: ( rule__TideTypeSTRING__Group_3__0__Impl rule__TideTypeSTRING__Group_3__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2120:2: rule__TideTypeSTRING__Group_3__0__Impl rule__TideTypeSTRING__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group_3__0__Impl_in_rule__TideTypeSTRING__Group_3__04151);
            rule__TideTypeSTRING__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group_3__1_in_rule__TideTypeSTRING__Group_3__04154);
            rule__TideTypeSTRING__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group_3__0


    // $ANTLR start rule__TideTypeSTRING__Group_3__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2127:1: rule__TideTypeSTRING__Group_3__0__Impl : ( 'defaultValue' ) ;
    public final void rule__TideTypeSTRING__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2131:1: ( ( 'defaultValue' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2132:1: ( 'defaultValue' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2132:1: ( 'defaultValue' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2133:1: 'defaultValue'
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getDefaultValueKeyword_3_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TideTypeSTRING__Group_3__0__Impl4182); 
             after(grammarAccess.getTideTypeSTRINGAccess().getDefaultValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group_3__0__Impl


    // $ANTLR start rule__TideTypeSTRING__Group_3__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2146:1: rule__TideTypeSTRING__Group_3__1 : rule__TideTypeSTRING__Group_3__1__Impl ;
    public final void rule__TideTypeSTRING__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2150:1: ( rule__TideTypeSTRING__Group_3__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2151:2: rule__TideTypeSTRING__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__Group_3__1__Impl_in_rule__TideTypeSTRING__Group_3__14213);
            rule__TideTypeSTRING__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group_3__1


    // $ANTLR start rule__TideTypeSTRING__Group_3__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2157:1: rule__TideTypeSTRING__Group_3__1__Impl : ( ( rule__TideTypeSTRING__DefaultValueAssignment_3_1 ) ) ;
    public final void rule__TideTypeSTRING__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2161:1: ( ( ( rule__TideTypeSTRING__DefaultValueAssignment_3_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2162:1: ( ( rule__TideTypeSTRING__DefaultValueAssignment_3_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2162:1: ( ( rule__TideTypeSTRING__DefaultValueAssignment_3_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2163:1: ( rule__TideTypeSTRING__DefaultValueAssignment_3_1 )
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getDefaultValueAssignment_3_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2164:1: ( rule__TideTypeSTRING__DefaultValueAssignment_3_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2164:2: rule__TideTypeSTRING__DefaultValueAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeSTRING__DefaultValueAssignment_3_1_in_rule__TideTypeSTRING__Group_3__1__Impl4240);
            rule__TideTypeSTRING__DefaultValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getTideTypeSTRINGAccess().getDefaultValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__Group_3__1__Impl


    // $ANTLR start rule__TideTypeEnum__Group__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2178:1: rule__TideTypeEnum__Group__0 : rule__TideTypeEnum__Group__0__Impl rule__TideTypeEnum__Group__1 ;
    public final void rule__TideTypeEnum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2182:1: ( rule__TideTypeEnum__Group__0__Impl rule__TideTypeEnum__Group__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2183:2: rule__TideTypeEnum__Group__0__Impl rule__TideTypeEnum__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__0__Impl_in_rule__TideTypeEnum__Group__04274);
            rule__TideTypeEnum__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__1_in_rule__TideTypeEnum__Group__04277);
            rule__TideTypeEnum__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__0


    // $ANTLR start rule__TideTypeEnum__Group__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2190:1: rule__TideTypeEnum__Group__0__Impl : ( () ) ;
    public final void rule__TideTypeEnum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2194:1: ( ( () ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2195:1: ( () )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2195:1: ( () )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2196:1: ()
            {
             before(grammarAccess.getTideTypeEnumAccess().getTideTypeEnumAction_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2197:1: ()
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2199:1: 
            {
            }

             after(grammarAccess.getTideTypeEnumAccess().getTideTypeEnumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__0__Impl


    // $ANTLR start rule__TideTypeEnum__Group__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2209:1: rule__TideTypeEnum__Group__1 : rule__TideTypeEnum__Group__1__Impl rule__TideTypeEnum__Group__2 ;
    public final void rule__TideTypeEnum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2213:1: ( rule__TideTypeEnum__Group__1__Impl rule__TideTypeEnum__Group__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2214:2: rule__TideTypeEnum__Group__1__Impl rule__TideTypeEnum__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__1__Impl_in_rule__TideTypeEnum__Group__14335);
            rule__TideTypeEnum__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__2_in_rule__TideTypeEnum__Group__14338);
            rule__TideTypeEnum__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__1


    // $ANTLR start rule__TideTypeEnum__Group__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2221:1: rule__TideTypeEnum__Group__1__Impl : ( 'Enum' ) ;
    public final void rule__TideTypeEnum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2225:1: ( ( 'Enum' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2226:1: ( 'Enum' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2226:1: ( 'Enum' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2227:1: 'Enum'
            {
             before(grammarAccess.getTideTypeEnumAccess().getEnumKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__TideTypeEnum__Group__1__Impl4366); 
             after(grammarAccess.getTideTypeEnumAccess().getEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__1__Impl


    // $ANTLR start rule__TideTypeEnum__Group__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2240:1: rule__TideTypeEnum__Group__2 : rule__TideTypeEnum__Group__2__Impl rule__TideTypeEnum__Group__3 ;
    public final void rule__TideTypeEnum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2244:1: ( rule__TideTypeEnum__Group__2__Impl rule__TideTypeEnum__Group__3 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2245:2: rule__TideTypeEnum__Group__2__Impl rule__TideTypeEnum__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__2__Impl_in_rule__TideTypeEnum__Group__24397);
            rule__TideTypeEnum__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__3_in_rule__TideTypeEnum__Group__24400);
            rule__TideTypeEnum__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__2


    // $ANTLR start rule__TideTypeEnum__Group__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2252:1: rule__TideTypeEnum__Group__2__Impl : ( ( rule__TideTypeEnum__NameAssignment_2 ) ) ;
    public final void rule__TideTypeEnum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2256:1: ( ( ( rule__TideTypeEnum__NameAssignment_2 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2257:1: ( ( rule__TideTypeEnum__NameAssignment_2 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2257:1: ( ( rule__TideTypeEnum__NameAssignment_2 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2258:1: ( rule__TideTypeEnum__NameAssignment_2 )
            {
             before(grammarAccess.getTideTypeEnumAccess().getNameAssignment_2()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2259:1: ( rule__TideTypeEnum__NameAssignment_2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2259:2: rule__TideTypeEnum__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__NameAssignment_2_in_rule__TideTypeEnum__Group__2__Impl4427);
            rule__TideTypeEnum__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTideTypeEnumAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__2__Impl


    // $ANTLR start rule__TideTypeEnum__Group__3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2269:1: rule__TideTypeEnum__Group__3 : rule__TideTypeEnum__Group__3__Impl rule__TideTypeEnum__Group__4 ;
    public final void rule__TideTypeEnum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2273:1: ( rule__TideTypeEnum__Group__3__Impl rule__TideTypeEnum__Group__4 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2274:2: rule__TideTypeEnum__Group__3__Impl rule__TideTypeEnum__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__3__Impl_in_rule__TideTypeEnum__Group__34457);
            rule__TideTypeEnum__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__4_in_rule__TideTypeEnum__Group__34460);
            rule__TideTypeEnum__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__3


    // $ANTLR start rule__TideTypeEnum__Group__3__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2281:1: rule__TideTypeEnum__Group__3__Impl : ( '{' ) ;
    public final void rule__TideTypeEnum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2285:1: ( ( '{' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2286:1: ( '{' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2286:1: ( '{' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2287:1: '{'
            {
             before(grammarAccess.getTideTypeEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TideTypeEnum__Group__3__Impl4488); 
             after(grammarAccess.getTideTypeEnumAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__3__Impl


    // $ANTLR start rule__TideTypeEnum__Group__4
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2300:1: rule__TideTypeEnum__Group__4 : rule__TideTypeEnum__Group__4__Impl rule__TideTypeEnum__Group__5 ;
    public final void rule__TideTypeEnum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2304:1: ( rule__TideTypeEnum__Group__4__Impl rule__TideTypeEnum__Group__5 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2305:2: rule__TideTypeEnum__Group__4__Impl rule__TideTypeEnum__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__4__Impl_in_rule__TideTypeEnum__Group__44519);
            rule__TideTypeEnum__Group__4__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__5_in_rule__TideTypeEnum__Group__44522);
            rule__TideTypeEnum__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__4


    // $ANTLR start rule__TideTypeEnum__Group__4__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2312:1: rule__TideTypeEnum__Group__4__Impl : ( ( rule__TideTypeEnum__Group_4__0 )? ) ;
    public final void rule__TideTypeEnum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2316:1: ( ( ( rule__TideTypeEnum__Group_4__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2317:1: ( ( rule__TideTypeEnum__Group_4__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2317:1: ( ( rule__TideTypeEnum__Group_4__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2318:1: ( rule__TideTypeEnum__Group_4__0 )?
            {
             before(grammarAccess.getTideTypeEnumAccess().getGroup_4()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2319:1: ( rule__TideTypeEnum__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2319:2: rule__TideTypeEnum__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_4__0_in_rule__TideTypeEnum__Group__4__Impl4549);
                    rule__TideTypeEnum__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTideTypeEnumAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__4__Impl


    // $ANTLR start rule__TideTypeEnum__Group__5
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2329:1: rule__TideTypeEnum__Group__5 : rule__TideTypeEnum__Group__5__Impl rule__TideTypeEnum__Group__6 ;
    public final void rule__TideTypeEnum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2333:1: ( rule__TideTypeEnum__Group__5__Impl rule__TideTypeEnum__Group__6 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2334:2: rule__TideTypeEnum__Group__5__Impl rule__TideTypeEnum__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__5__Impl_in_rule__TideTypeEnum__Group__54580);
            rule__TideTypeEnum__Group__5__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__6_in_rule__TideTypeEnum__Group__54583);
            rule__TideTypeEnum__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__5


    // $ANTLR start rule__TideTypeEnum__Group__5__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2341:1: rule__TideTypeEnum__Group__5__Impl : ( ( rule__TideTypeEnum__Group_5__0 )? ) ;
    public final void rule__TideTypeEnum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2345:1: ( ( ( rule__TideTypeEnum__Group_5__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2346:1: ( ( rule__TideTypeEnum__Group_5__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2346:1: ( ( rule__TideTypeEnum__Group_5__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2347:1: ( rule__TideTypeEnum__Group_5__0 )?
            {
             before(grammarAccess.getTideTypeEnumAccess().getGroup_5()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2348:1: ( rule__TideTypeEnum__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2348:2: rule__TideTypeEnum__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__0_in_rule__TideTypeEnum__Group__5__Impl4610);
                    rule__TideTypeEnum__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTideTypeEnumAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__5__Impl


    // $ANTLR start rule__TideTypeEnum__Group__6
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2358:1: rule__TideTypeEnum__Group__6 : rule__TideTypeEnum__Group__6__Impl ;
    public final void rule__TideTypeEnum__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2362:1: ( rule__TideTypeEnum__Group__6__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2363:2: rule__TideTypeEnum__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group__6__Impl_in_rule__TideTypeEnum__Group__64641);
            rule__TideTypeEnum__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__6


    // $ANTLR start rule__TideTypeEnum__Group__6__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2369:1: rule__TideTypeEnum__Group__6__Impl : ( '}' ) ;
    public final void rule__TideTypeEnum__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2373:1: ( ( '}' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2374:1: ( '}' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2374:1: ( '}' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2375:1: '}'
            {
             before(grammarAccess.getTideTypeEnumAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TideTypeEnum__Group__6__Impl4669); 
             after(grammarAccess.getTideTypeEnumAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group__6__Impl


    // $ANTLR start rule__TideTypeEnum__Group_4__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2402:1: rule__TideTypeEnum__Group_4__0 : rule__TideTypeEnum__Group_4__0__Impl rule__TideTypeEnum__Group_4__1 ;
    public final void rule__TideTypeEnum__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2406:1: ( rule__TideTypeEnum__Group_4__0__Impl rule__TideTypeEnum__Group_4__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2407:2: rule__TideTypeEnum__Group_4__0__Impl rule__TideTypeEnum__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_4__0__Impl_in_rule__TideTypeEnum__Group_4__04714);
            rule__TideTypeEnum__Group_4__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_4__1_in_rule__TideTypeEnum__Group_4__04717);
            rule__TideTypeEnum__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_4__0


    // $ANTLR start rule__TideTypeEnum__Group_4__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2414:1: rule__TideTypeEnum__Group_4__0__Impl : ( 'defaultValue' ) ;
    public final void rule__TideTypeEnum__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2418:1: ( ( 'defaultValue' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2419:1: ( 'defaultValue' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2419:1: ( 'defaultValue' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2420:1: 'defaultValue'
            {
             before(grammarAccess.getTideTypeEnumAccess().getDefaultValueKeyword_4_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__TideTypeEnum__Group_4__0__Impl4745); 
             after(grammarAccess.getTideTypeEnumAccess().getDefaultValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_4__0__Impl


    // $ANTLR start rule__TideTypeEnum__Group_4__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2433:1: rule__TideTypeEnum__Group_4__1 : rule__TideTypeEnum__Group_4__1__Impl ;
    public final void rule__TideTypeEnum__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2437:1: ( rule__TideTypeEnum__Group_4__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2438:2: rule__TideTypeEnum__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_4__1__Impl_in_rule__TideTypeEnum__Group_4__14776);
            rule__TideTypeEnum__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_4__1


    // $ANTLR start rule__TideTypeEnum__Group_4__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2444:1: rule__TideTypeEnum__Group_4__1__Impl : ( ( rule__TideTypeEnum__DefaultValueAssignment_4_1 ) ) ;
    public final void rule__TideTypeEnum__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2448:1: ( ( ( rule__TideTypeEnum__DefaultValueAssignment_4_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2449:1: ( ( rule__TideTypeEnum__DefaultValueAssignment_4_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2449:1: ( ( rule__TideTypeEnum__DefaultValueAssignment_4_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2450:1: ( rule__TideTypeEnum__DefaultValueAssignment_4_1 )
            {
             before(grammarAccess.getTideTypeEnumAccess().getDefaultValueAssignment_4_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2451:1: ( rule__TideTypeEnum__DefaultValueAssignment_4_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2451:2: rule__TideTypeEnum__DefaultValueAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__DefaultValueAssignment_4_1_in_rule__TideTypeEnum__Group_4__1__Impl4803);
            rule__TideTypeEnum__DefaultValueAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getTideTypeEnumAccess().getDefaultValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_4__1__Impl


    // $ANTLR start rule__TideTypeEnum__Group_5__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2465:1: rule__TideTypeEnum__Group_5__0 : rule__TideTypeEnum__Group_5__0__Impl rule__TideTypeEnum__Group_5__1 ;
    public final void rule__TideTypeEnum__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2469:1: ( rule__TideTypeEnum__Group_5__0__Impl rule__TideTypeEnum__Group_5__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2470:2: rule__TideTypeEnum__Group_5__0__Impl rule__TideTypeEnum__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__0__Impl_in_rule__TideTypeEnum__Group_5__04837);
            rule__TideTypeEnum__Group_5__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__1_in_rule__TideTypeEnum__Group_5__04840);
            rule__TideTypeEnum__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__0


    // $ANTLR start rule__TideTypeEnum__Group_5__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2477:1: rule__TideTypeEnum__Group_5__0__Impl : ( 'tideEnumlist' ) ;
    public final void rule__TideTypeEnum__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2481:1: ( ( 'tideEnumlist' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2482:1: ( 'tideEnumlist' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2482:1: ( 'tideEnumlist' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2483:1: 'tideEnumlist'
            {
             before(grammarAccess.getTideTypeEnumAccess().getTideEnumlistKeyword_5_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__TideTypeEnum__Group_5__0__Impl4868); 
             after(grammarAccess.getTideTypeEnumAccess().getTideEnumlistKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__0__Impl


    // $ANTLR start rule__TideTypeEnum__Group_5__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2496:1: rule__TideTypeEnum__Group_5__1 : rule__TideTypeEnum__Group_5__1__Impl rule__TideTypeEnum__Group_5__2 ;
    public final void rule__TideTypeEnum__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2500:1: ( rule__TideTypeEnum__Group_5__1__Impl rule__TideTypeEnum__Group_5__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2501:2: rule__TideTypeEnum__Group_5__1__Impl rule__TideTypeEnum__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__1__Impl_in_rule__TideTypeEnum__Group_5__14899);
            rule__TideTypeEnum__Group_5__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__2_in_rule__TideTypeEnum__Group_5__14902);
            rule__TideTypeEnum__Group_5__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__1


    // $ANTLR start rule__TideTypeEnum__Group_5__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2508:1: rule__TideTypeEnum__Group_5__1__Impl : ( '{' ) ;
    public final void rule__TideTypeEnum__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2512:1: ( ( '{' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2513:1: ( '{' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2513:1: ( '{' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2514:1: '{'
            {
             before(grammarAccess.getTideTypeEnumAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TideTypeEnum__Group_5__1__Impl4930); 
             after(grammarAccess.getTideTypeEnumAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__1__Impl


    // $ANTLR start rule__TideTypeEnum__Group_5__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2527:1: rule__TideTypeEnum__Group_5__2 : rule__TideTypeEnum__Group_5__2__Impl rule__TideTypeEnum__Group_5__3 ;
    public final void rule__TideTypeEnum__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2531:1: ( rule__TideTypeEnum__Group_5__2__Impl rule__TideTypeEnum__Group_5__3 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2532:2: rule__TideTypeEnum__Group_5__2__Impl rule__TideTypeEnum__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__2__Impl_in_rule__TideTypeEnum__Group_5__24961);
            rule__TideTypeEnum__Group_5__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__3_in_rule__TideTypeEnum__Group_5__24964);
            rule__TideTypeEnum__Group_5__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__2


    // $ANTLR start rule__TideTypeEnum__Group_5__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2539:1: rule__TideTypeEnum__Group_5__2__Impl : ( ( rule__TideTypeEnum__TideEnumlistAssignment_5_2 ) ) ;
    public final void rule__TideTypeEnum__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2543:1: ( ( ( rule__TideTypeEnum__TideEnumlistAssignment_5_2 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2544:1: ( ( rule__TideTypeEnum__TideEnumlistAssignment_5_2 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2544:1: ( ( rule__TideTypeEnum__TideEnumlistAssignment_5_2 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2545:1: ( rule__TideTypeEnum__TideEnumlistAssignment_5_2 )
            {
             before(grammarAccess.getTideTypeEnumAccess().getTideEnumlistAssignment_5_2()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2546:1: ( rule__TideTypeEnum__TideEnumlistAssignment_5_2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2546:2: rule__TideTypeEnum__TideEnumlistAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__TideEnumlistAssignment_5_2_in_rule__TideTypeEnum__Group_5__2__Impl4991);
            rule__TideTypeEnum__TideEnumlistAssignment_5_2();
            _fsp--;


            }

             after(grammarAccess.getTideTypeEnumAccess().getTideEnumlistAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__2__Impl


    // $ANTLR start rule__TideTypeEnum__Group_5__3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2556:1: rule__TideTypeEnum__Group_5__3 : rule__TideTypeEnum__Group_5__3__Impl rule__TideTypeEnum__Group_5__4 ;
    public final void rule__TideTypeEnum__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2560:1: ( rule__TideTypeEnum__Group_5__3__Impl rule__TideTypeEnum__Group_5__4 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2561:2: rule__TideTypeEnum__Group_5__3__Impl rule__TideTypeEnum__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__3__Impl_in_rule__TideTypeEnum__Group_5__35021);
            rule__TideTypeEnum__Group_5__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__4_in_rule__TideTypeEnum__Group_5__35024);
            rule__TideTypeEnum__Group_5__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__3


    // $ANTLR start rule__TideTypeEnum__Group_5__3__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2568:1: rule__TideTypeEnum__Group_5__3__Impl : ( ( rule__TideTypeEnum__Group_5_3__0 )* ) ;
    public final void rule__TideTypeEnum__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2572:1: ( ( ( rule__TideTypeEnum__Group_5_3__0 )* ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2573:1: ( ( rule__TideTypeEnum__Group_5_3__0 )* )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2573:1: ( ( rule__TideTypeEnum__Group_5_3__0 )* )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2574:1: ( rule__TideTypeEnum__Group_5_3__0 )*
            {
             before(grammarAccess.getTideTypeEnumAccess().getGroup_5_3()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2575:1: ( rule__TideTypeEnum__Group_5_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2575:2: rule__TideTypeEnum__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5_3__0_in_rule__TideTypeEnum__Group_5__3__Impl5051);
            	    rule__TideTypeEnum__Group_5_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getTideTypeEnumAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__3__Impl


    // $ANTLR start rule__TideTypeEnum__Group_5__4
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2585:1: rule__TideTypeEnum__Group_5__4 : rule__TideTypeEnum__Group_5__4__Impl ;
    public final void rule__TideTypeEnum__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2589:1: ( rule__TideTypeEnum__Group_5__4__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2590:2: rule__TideTypeEnum__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5__4__Impl_in_rule__TideTypeEnum__Group_5__45082);
            rule__TideTypeEnum__Group_5__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__4


    // $ANTLR start rule__TideTypeEnum__Group_5__4__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2596:1: rule__TideTypeEnum__Group_5__4__Impl : ( '}' ) ;
    public final void rule__TideTypeEnum__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2600:1: ( ( '}' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2601:1: ( '}' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2601:1: ( '}' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2602:1: '}'
            {
             before(grammarAccess.getTideTypeEnumAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TideTypeEnum__Group_5__4__Impl5110); 
             after(grammarAccess.getTideTypeEnumAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5__4__Impl


    // $ANTLR start rule__TideTypeEnum__Group_5_3__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2625:1: rule__TideTypeEnum__Group_5_3__0 : rule__TideTypeEnum__Group_5_3__0__Impl rule__TideTypeEnum__Group_5_3__1 ;
    public final void rule__TideTypeEnum__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2629:1: ( rule__TideTypeEnum__Group_5_3__0__Impl rule__TideTypeEnum__Group_5_3__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2630:2: rule__TideTypeEnum__Group_5_3__0__Impl rule__TideTypeEnum__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5_3__0__Impl_in_rule__TideTypeEnum__Group_5_3__05151);
            rule__TideTypeEnum__Group_5_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5_3__1_in_rule__TideTypeEnum__Group_5_3__05154);
            rule__TideTypeEnum__Group_5_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5_3__0


    // $ANTLR start rule__TideTypeEnum__Group_5_3__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2637:1: rule__TideTypeEnum__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__TideTypeEnum__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2641:1: ( ( ',' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2642:1: ( ',' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2642:1: ( ',' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2643:1: ','
            {
             before(grammarAccess.getTideTypeEnumAccess().getCommaKeyword_5_3_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__TideTypeEnum__Group_5_3__0__Impl5182); 
             after(grammarAccess.getTideTypeEnumAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5_3__0__Impl


    // $ANTLR start rule__TideTypeEnum__Group_5_3__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2656:1: rule__TideTypeEnum__Group_5_3__1 : rule__TideTypeEnum__Group_5_3__1__Impl ;
    public final void rule__TideTypeEnum__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2660:1: ( rule__TideTypeEnum__Group_5_3__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2661:2: rule__TideTypeEnum__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__Group_5_3__1__Impl_in_rule__TideTypeEnum__Group_5_3__15213);
            rule__TideTypeEnum__Group_5_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5_3__1


    // $ANTLR start rule__TideTypeEnum__Group_5_3__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2667:1: rule__TideTypeEnum__Group_5_3__1__Impl : ( ( rule__TideTypeEnum__TideEnumlistAssignment_5_3_1 ) ) ;
    public final void rule__TideTypeEnum__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2671:1: ( ( ( rule__TideTypeEnum__TideEnumlistAssignment_5_3_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2672:1: ( ( rule__TideTypeEnum__TideEnumlistAssignment_5_3_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2672:1: ( ( rule__TideTypeEnum__TideEnumlistAssignment_5_3_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2673:1: ( rule__TideTypeEnum__TideEnumlistAssignment_5_3_1 )
            {
             before(grammarAccess.getTideTypeEnumAccess().getTideEnumlistAssignment_5_3_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2674:1: ( rule__TideTypeEnum__TideEnumlistAssignment_5_3_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2674:2: rule__TideTypeEnum__TideEnumlistAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnum__TideEnumlistAssignment_5_3_1_in_rule__TideTypeEnum__Group_5_3__1__Impl5240);
            rule__TideTypeEnum__TideEnumlistAssignment_5_3_1();
            _fsp--;


            }

             after(grammarAccess.getTideTypeEnumAccess().getTideEnumlistAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__Group_5_3__1__Impl


    // $ANTLR start rule__TideTypeEnumItem__Group__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2688:1: rule__TideTypeEnumItem__Group__0 : rule__TideTypeEnumItem__Group__0__Impl rule__TideTypeEnumItem__Group__1 ;
    public final void rule__TideTypeEnumItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2692:1: ( rule__TideTypeEnumItem__Group__0__Impl rule__TideTypeEnumItem__Group__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2693:2: rule__TideTypeEnumItem__Group__0__Impl rule__TideTypeEnumItem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__0__Impl_in_rule__TideTypeEnumItem__Group__05274);
            rule__TideTypeEnumItem__Group__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__1_in_rule__TideTypeEnumItem__Group__05277);
            rule__TideTypeEnumItem__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__0


    // $ANTLR start rule__TideTypeEnumItem__Group__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2700:1: rule__TideTypeEnumItem__Group__0__Impl : ( () ) ;
    public final void rule__TideTypeEnumItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2704:1: ( ( () ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2705:1: ( () )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2705:1: ( () )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2706:1: ()
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getTideTypeEnumItemAction_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2707:1: ()
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2709:1: 
            {
            }

             after(grammarAccess.getTideTypeEnumItemAccess().getTideTypeEnumItemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__0__Impl


    // $ANTLR start rule__TideTypeEnumItem__Group__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2719:1: rule__TideTypeEnumItem__Group__1 : rule__TideTypeEnumItem__Group__1__Impl rule__TideTypeEnumItem__Group__2 ;
    public final void rule__TideTypeEnumItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2723:1: ( rule__TideTypeEnumItem__Group__1__Impl rule__TideTypeEnumItem__Group__2 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2724:2: rule__TideTypeEnumItem__Group__1__Impl rule__TideTypeEnumItem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__1__Impl_in_rule__TideTypeEnumItem__Group__15335);
            rule__TideTypeEnumItem__Group__1__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__2_in_rule__TideTypeEnumItem__Group__15338);
            rule__TideTypeEnumItem__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__1


    // $ANTLR start rule__TideTypeEnumItem__Group__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2731:1: rule__TideTypeEnumItem__Group__1__Impl : ( 'tideTypeEnumItem' ) ;
    public final void rule__TideTypeEnumItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2735:1: ( ( 'tideTypeEnumItem' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2736:1: ( 'tideTypeEnumItem' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2736:1: ( 'tideTypeEnumItem' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2737:1: 'tideTypeEnumItem'
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getTideTypeEnumItemKeyword_1()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__TideTypeEnumItem__Group__1__Impl5366); 
             after(grammarAccess.getTideTypeEnumItemAccess().getTideTypeEnumItemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__1__Impl


    // $ANTLR start rule__TideTypeEnumItem__Group__2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2750:1: rule__TideTypeEnumItem__Group__2 : rule__TideTypeEnumItem__Group__2__Impl rule__TideTypeEnumItem__Group__3 ;
    public final void rule__TideTypeEnumItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2754:1: ( rule__TideTypeEnumItem__Group__2__Impl rule__TideTypeEnumItem__Group__3 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2755:2: rule__TideTypeEnumItem__Group__2__Impl rule__TideTypeEnumItem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__2__Impl_in_rule__TideTypeEnumItem__Group__25397);
            rule__TideTypeEnumItem__Group__2__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__3_in_rule__TideTypeEnumItem__Group__25400);
            rule__TideTypeEnumItem__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__2


    // $ANTLR start rule__TideTypeEnumItem__Group__2__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2762:1: rule__TideTypeEnumItem__Group__2__Impl : ( '{' ) ;
    public final void rule__TideTypeEnumItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2766:1: ( ( '{' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2767:1: ( '{' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2767:1: ( '{' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2768:1: '{'
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__TideTypeEnumItem__Group__2__Impl5428); 
             after(grammarAccess.getTideTypeEnumItemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__2__Impl


    // $ANTLR start rule__TideTypeEnumItem__Group__3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2781:1: rule__TideTypeEnumItem__Group__3 : rule__TideTypeEnumItem__Group__3__Impl rule__TideTypeEnumItem__Group__4 ;
    public final void rule__TideTypeEnumItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2785:1: ( rule__TideTypeEnumItem__Group__3__Impl rule__TideTypeEnumItem__Group__4 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2786:2: rule__TideTypeEnumItem__Group__3__Impl rule__TideTypeEnumItem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__3__Impl_in_rule__TideTypeEnumItem__Group__35459);
            rule__TideTypeEnumItem__Group__3__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__4_in_rule__TideTypeEnumItem__Group__35462);
            rule__TideTypeEnumItem__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__3


    // $ANTLR start rule__TideTypeEnumItem__Group__3__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2793:1: rule__TideTypeEnumItem__Group__3__Impl : ( ( rule__TideTypeEnumItem__Group_3__0 )? ) ;
    public final void rule__TideTypeEnumItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2797:1: ( ( ( rule__TideTypeEnumItem__Group_3__0 )? ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2798:1: ( ( rule__TideTypeEnumItem__Group_3__0 )? )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2798:1: ( ( rule__TideTypeEnumItem__Group_3__0 )? )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2799:1: ( rule__TideTypeEnumItem__Group_3__0 )?
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getGroup_3()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2800:1: ( rule__TideTypeEnumItem__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2800:2: rule__TideTypeEnumItem__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group_3__0_in_rule__TideTypeEnumItem__Group__3__Impl5489);
                    rule__TideTypeEnumItem__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTideTypeEnumItemAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__3__Impl


    // $ANTLR start rule__TideTypeEnumItem__Group__4
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2810:1: rule__TideTypeEnumItem__Group__4 : rule__TideTypeEnumItem__Group__4__Impl ;
    public final void rule__TideTypeEnumItem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2814:1: ( rule__TideTypeEnumItem__Group__4__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2815:2: rule__TideTypeEnumItem__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group__4__Impl_in_rule__TideTypeEnumItem__Group__45520);
            rule__TideTypeEnumItem__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__4


    // $ANTLR start rule__TideTypeEnumItem__Group__4__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2821:1: rule__TideTypeEnumItem__Group__4__Impl : ( '}' ) ;
    public final void rule__TideTypeEnumItem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2825:1: ( ( '}' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2826:1: ( '}' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2826:1: ( '}' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2827:1: '}'
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__TideTypeEnumItem__Group__4__Impl5548); 
             after(grammarAccess.getTideTypeEnumItemAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group__4__Impl


    // $ANTLR start rule__TideTypeEnumItem__Group_3__0
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2850:1: rule__TideTypeEnumItem__Group_3__0 : rule__TideTypeEnumItem__Group_3__0__Impl rule__TideTypeEnumItem__Group_3__1 ;
    public final void rule__TideTypeEnumItem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2854:1: ( rule__TideTypeEnumItem__Group_3__0__Impl rule__TideTypeEnumItem__Group_3__1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2855:2: rule__TideTypeEnumItem__Group_3__0__Impl rule__TideTypeEnumItem__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group_3__0__Impl_in_rule__TideTypeEnumItem__Group_3__05589);
            rule__TideTypeEnumItem__Group_3__0__Impl();
            _fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group_3__1_in_rule__TideTypeEnumItem__Group_3__05592);
            rule__TideTypeEnumItem__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group_3__0


    // $ANTLR start rule__TideTypeEnumItem__Group_3__0__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2862:1: rule__TideTypeEnumItem__Group_3__0__Impl : ( 'value' ) ;
    public final void rule__TideTypeEnumItem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2866:1: ( ( 'value' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2867:1: ( 'value' )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2867:1: ( 'value' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2868:1: 'value'
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getValueKeyword_3_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__TideTypeEnumItem__Group_3__0__Impl5620); 
             after(grammarAccess.getTideTypeEnumItemAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group_3__0__Impl


    // $ANTLR start rule__TideTypeEnumItem__Group_3__1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2881:1: rule__TideTypeEnumItem__Group_3__1 : rule__TideTypeEnumItem__Group_3__1__Impl ;
    public final void rule__TideTypeEnumItem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2885:1: ( rule__TideTypeEnumItem__Group_3__1__Impl )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2886:2: rule__TideTypeEnumItem__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__Group_3__1__Impl_in_rule__TideTypeEnumItem__Group_3__15651);
            rule__TideTypeEnumItem__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group_3__1


    // $ANTLR start rule__TideTypeEnumItem__Group_3__1__Impl
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2892:1: rule__TideTypeEnumItem__Group_3__1__Impl : ( ( rule__TideTypeEnumItem__ValueAssignment_3_1 ) ) ;
    public final void rule__TideTypeEnumItem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2896:1: ( ( ( rule__TideTypeEnumItem__ValueAssignment_3_1 ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2897:1: ( ( rule__TideTypeEnumItem__ValueAssignment_3_1 ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2897:1: ( ( rule__TideTypeEnumItem__ValueAssignment_3_1 ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2898:1: ( rule__TideTypeEnumItem__ValueAssignment_3_1 )
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getValueAssignment_3_1()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2899:1: ( rule__TideTypeEnumItem__ValueAssignment_3_1 )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2899:2: rule__TideTypeEnumItem__ValueAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TideTypeEnumItem__ValueAssignment_3_1_in_rule__TideTypeEnumItem__Group_3__1__Impl5678);
            rule__TideTypeEnumItem__ValueAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getTideTypeEnumItemAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__Group_3__1__Impl


    // $ANTLR start rule__ServiceRule__ImportsAssignment_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2914:1: rule__ServiceRule__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__ServiceRule__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2918:1: ( ( ruleImport ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2919:1: ( ruleImport )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2919:1: ( ruleImport )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2920:1: ruleImport
            {
             before(grammarAccess.getServiceRuleAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleImport_in_rule__ServiceRule__ImportsAssignment_15717);
            ruleImport();
            _fsp--;

             after(grammarAccess.getServiceRuleAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceRule__ImportsAssignment_1


    // $ANTLR start rule__ServiceRule__OfferedServiceAssignment_2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2929:1: rule__ServiceRule__OfferedServiceAssignment_2 : ( ruleOfferedService ) ;
    public final void rule__ServiceRule__OfferedServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2933:1: ( ( ruleOfferedService ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2934:1: ( ruleOfferedService )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2934:1: ( ruleOfferedService )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2935:1: ruleOfferedService
            {
             before(grammarAccess.getServiceRuleAccess().getOfferedServiceOfferedServiceParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOfferedService_in_rule__ServiceRule__OfferedServiceAssignment_25748);
            ruleOfferedService();
            _fsp--;

             after(grammarAccess.getServiceRuleAccess().getOfferedServiceOfferedServiceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceRule__OfferedServiceAssignment_2


    // $ANTLR start rule__Import__ImportURIAssignment_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2944:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2948:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2949:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2949:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2950:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15779); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__ImportURIAssignment_1


    // $ANTLR start rule__ServiceSetting__UserExposedAssignment_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2962:1: rule__ServiceSetting__UserExposedAssignment_1 : ( ( 'userExposed' ) ) ;
    public final void rule__ServiceSetting__UserExposedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2966:1: ( ( ( 'userExposed' ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2967:1: ( ( 'userExposed' ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2967:1: ( ( 'userExposed' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2968:1: ( 'userExposed' )
            {
             before(grammarAccess.getServiceSettingAccess().getUserExposedUserExposedKeyword_1_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2969:1: ( 'userExposed' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2970:1: 'userExposed'
            {
             before(grammarAccess.getServiceSettingAccess().getUserExposedUserExposedKeyword_1_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__ServiceSetting__UserExposedAssignment_15818); 
             after(grammarAccess.getServiceSettingAccess().getUserExposedUserExposedKeyword_1_0()); 

            }

             after(grammarAccess.getServiceSettingAccess().getUserExposedUserExposedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__UserExposedAssignment_1


    // $ANTLR start rule__ServiceSetting__UserEditableAssignment_2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2985:1: rule__ServiceSetting__UserEditableAssignment_2 : ( ( 'userEditable' ) ) ;
    public final void rule__ServiceSetting__UserEditableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2989:1: ( ( ( 'userEditable' ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2990:1: ( ( 'userEditable' ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2990:1: ( ( 'userEditable' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2991:1: ( 'userEditable' )
            {
             before(grammarAccess.getServiceSettingAccess().getUserEditableUserEditableKeyword_2_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2992:1: ( 'userEditable' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:2993:1: 'userEditable'
            {
             before(grammarAccess.getServiceSettingAccess().getUserEditableUserEditableKeyword_2_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__ServiceSetting__UserEditableAssignment_25862); 
             after(grammarAccess.getServiceSettingAccess().getUserEditableUserEditableKeyword_2_0()); 

            }

             after(grammarAccess.getServiceSettingAccess().getUserEditableUserEditableKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__UserEditableAssignment_2


    // $ANTLR start rule__ServiceSetting__CanBePublishedAssignment_3
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3008:1: rule__ServiceSetting__CanBePublishedAssignment_3 : ( ( 'canBePublished' ) ) ;
    public final void rule__ServiceSetting__CanBePublishedAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3012:1: ( ( ( 'canBePublished' ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3013:1: ( ( 'canBePublished' ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3013:1: ( ( 'canBePublished' ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3014:1: ( 'canBePublished' )
            {
             before(grammarAccess.getServiceSettingAccess().getCanBePublishedCanBePublishedKeyword_3_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3015:1: ( 'canBePublished' )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3016:1: 'canBePublished'
            {
             before(grammarAccess.getServiceSettingAccess().getCanBePublishedCanBePublishedKeyword_3_0()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ServiceSetting__CanBePublishedAssignment_35906); 
             after(grammarAccess.getServiceSettingAccess().getCanBePublishedCanBePublishedKeyword_3_0()); 

            }

             after(grammarAccess.getServiceSettingAccess().getCanBePublishedCanBePublishedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__CanBePublishedAssignment_3


    // $ANTLR start rule__ServiceSetting__NameAssignment_5
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3031:1: rule__ServiceSetting__NameAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ServiceSetting__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3035:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3036:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3036:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3037:1: RULE_STRING
            {
             before(grammarAccess.getServiceSettingAccess().getNameSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ServiceSetting__NameAssignment_55945); 
             after(grammarAccess.getServiceSettingAccess().getNameSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__NameAssignment_5


    // $ANTLR start rule__ServiceSetting__IdAssignment_7_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3046:1: rule__ServiceSetting__IdAssignment_7_1 : ( RULE_INT ) ;
    public final void rule__ServiceSetting__IdAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3050:1: ( ( RULE_INT ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3051:1: ( RULE_INT )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3051:1: ( RULE_INT )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3052:1: RULE_INT
            {
             before(grammarAccess.getServiceSettingAccess().getIdINTTerminalRuleCall_7_1_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__ServiceSetting__IdAssignment_7_15976); 
             after(grammarAccess.getServiceSettingAccess().getIdINTTerminalRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__IdAssignment_7_1


    // $ANTLR start rule__ServiceSetting__DescriptionAssignment_8_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3061:1: rule__ServiceSetting__DescriptionAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__ServiceSetting__DescriptionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3065:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3066:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3066:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3067:1: RULE_STRING
            {
             before(grammarAccess.getServiceSettingAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ServiceSetting__DescriptionAssignment_8_16007); 
             after(grammarAccess.getServiceSettingAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__DescriptionAssignment_8_1


    // $ANTLR start rule__ServiceSetting__ReadableAssignment_9_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3076:1: rule__ServiceSetting__ReadableAssignment_9_1 : ( ruleEBoolean ) ;
    public final void rule__ServiceSetting__ReadableAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3080:1: ( ( ruleEBoolean ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3081:1: ( ruleEBoolean )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3081:1: ( ruleEBoolean )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3082:1: ruleEBoolean
            {
             before(grammarAccess.getServiceSettingAccess().getReadableEBooleanParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__ServiceSetting__ReadableAssignment_9_16038);
            ruleEBoolean();
            _fsp--;

             after(grammarAccess.getServiceSettingAccess().getReadableEBooleanParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__ReadableAssignment_9_1


    // $ANTLR start rule__ServiceSetting__WritableAssignment_10_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3091:1: rule__ServiceSetting__WritableAssignment_10_1 : ( ruleEBoolean ) ;
    public final void rule__ServiceSetting__WritableAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3095:1: ( ( ruleEBoolean ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3096:1: ( ruleEBoolean )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3096:1: ( ruleEBoolean )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3097:1: ruleEBoolean
            {
             before(grammarAccess.getServiceSettingAccess().getWritableEBooleanParserRuleCall_10_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_rule__ServiceSetting__WritableAssignment_10_16069);
            ruleEBoolean();
            _fsp--;

             after(grammarAccess.getServiceSettingAccess().getWritableEBooleanParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__WritableAssignment_10_1


    // $ANTLR start rule__ServiceSetting__RequiresParamsAssignment_11_2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3106:1: rule__ServiceSetting__RequiresParamsAssignment_11_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ServiceSetting__RequiresParamsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3110:1: ( ( ( RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3111:1: ( ( RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3111:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3112:1: ( RULE_STRING )
            {
             before(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingCrossReference_11_2_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3113:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3114:1: RULE_STRING
            {
             before(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingSTRINGTerminalRuleCall_11_2_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ServiceSetting__RequiresParamsAssignment_11_26104); 
             after(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingSTRINGTerminalRuleCall_11_2_0_1()); 

            }

             after(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingCrossReference_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__RequiresParamsAssignment_11_2


    // $ANTLR start rule__ServiceSetting__RequiresParamsAssignment_11_3_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3125:1: rule__ServiceSetting__RequiresParamsAssignment_11_3_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ServiceSetting__RequiresParamsAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3129:1: ( ( ( RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3130:1: ( ( RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3130:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3131:1: ( RULE_STRING )
            {
             before(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingCrossReference_11_3_1_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3132:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3133:1: RULE_STRING
            {
             before(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingSTRINGTerminalRuleCall_11_3_1_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__ServiceSetting__RequiresParamsAssignment_11_3_16143); 
             after(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingSTRINGTerminalRuleCall_11_3_1_0_1()); 

            }

             after(grammarAccess.getServiceSettingAccess().getRequiresParamsAbstractSettingCrossReference_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__RequiresParamsAssignment_11_3_1


    // $ANTLR start rule__ServiceSetting__SettingTypeAssignment_12_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3144:1: rule__ServiceSetting__SettingTypeAssignment_12_1 : ( ruleSettingType ) ;
    public final void rule__ServiceSetting__SettingTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3148:1: ( ( ruleSettingType ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3149:1: ( ruleSettingType )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3149:1: ( ruleSettingType )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3150:1: ruleSettingType
            {
             before(grammarAccess.getServiceSettingAccess().getSettingTypeSettingTypeParserRuleCall_12_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSettingType_in_rule__ServiceSetting__SettingTypeAssignment_12_16178);
            ruleSettingType();
            _fsp--;

             after(grammarAccess.getServiceSettingAccess().getSettingTypeSettingTypeParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ServiceSetting__SettingTypeAssignment_12_1


    // $ANTLR start rule__OfferedService__NameAssignment_2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3159:1: rule__OfferedService__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__OfferedService__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3163:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3164:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3164:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3165:1: RULE_STRING
            {
             before(grammarAccess.getOfferedServiceAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__OfferedService__NameAssignment_26209); 
             after(grammarAccess.getOfferedServiceAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__NameAssignment_2


    // $ANTLR start rule__OfferedService__ServiceSettingsAssignment_4_2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3174:1: rule__OfferedService__ServiceSettingsAssignment_4_2 : ( ruleServiceSetting ) ;
    public final void rule__OfferedService__ServiceSettingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3178:1: ( ( ruleServiceSetting ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3179:1: ( ruleServiceSetting )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3179:1: ( ruleServiceSetting )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3180:1: ruleServiceSetting
            {
             before(grammarAccess.getOfferedServiceAccess().getServiceSettingsServiceSettingParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceSetting_in_rule__OfferedService__ServiceSettingsAssignment_4_26240);
            ruleServiceSetting();
            _fsp--;

             after(grammarAccess.getOfferedServiceAccess().getServiceSettingsServiceSettingParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__ServiceSettingsAssignment_4_2


    // $ANTLR start rule__OfferedService__ServiceSettingsAssignment_4_3_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3189:1: rule__OfferedService__ServiceSettingsAssignment_4_3_1 : ( ruleServiceSetting ) ;
    public final void rule__OfferedService__ServiceSettingsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3193:1: ( ( ruleServiceSetting ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3194:1: ( ruleServiceSetting )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3194:1: ( ruleServiceSetting )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3195:1: ruleServiceSetting
            {
             before(grammarAccess.getOfferedServiceAccess().getServiceSettingsServiceSettingParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleServiceSetting_in_rule__OfferedService__ServiceSettingsAssignment_4_3_16271);
            ruleServiceSetting();
            _fsp--;

             after(grammarAccess.getOfferedServiceAccess().getServiceSettingsServiceSettingParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OfferedService__ServiceSettingsAssignment_4_3_1


    // $ANTLR start rule__TideTypeSTRING__DefaultValueAssignment_3_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3204:1: rule__TideTypeSTRING__DefaultValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TideTypeSTRING__DefaultValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3208:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3209:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3209:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3210:1: RULE_STRING
            {
             before(grammarAccess.getTideTypeSTRINGAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TideTypeSTRING__DefaultValueAssignment_3_16302); 
             after(grammarAccess.getTideTypeSTRINGAccess().getDefaultValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeSTRING__DefaultValueAssignment_3_1


    // $ANTLR start rule__TideTypeEnum__NameAssignment_2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3219:1: rule__TideTypeEnum__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TideTypeEnum__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3223:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3224:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3224:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3225:1: RULE_STRING
            {
             before(grammarAccess.getTideTypeEnumAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TideTypeEnum__NameAssignment_26333); 
             after(grammarAccess.getTideTypeEnumAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__NameAssignment_2


    // $ANTLR start rule__TideTypeEnum__DefaultValueAssignment_4_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3234:1: rule__TideTypeEnum__DefaultValueAssignment_4_1 : ( ( RULE_STRING ) ) ;
    public final void rule__TideTypeEnum__DefaultValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3238:1: ( ( ( RULE_STRING ) ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3239:1: ( ( RULE_STRING ) )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3239:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3240:1: ( RULE_STRING )
            {
             before(grammarAccess.getTideTypeEnumAccess().getDefaultValueTideTypeEnumItemCrossReference_4_1_0()); 
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3241:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3242:1: RULE_STRING
            {
             before(grammarAccess.getTideTypeEnumAccess().getDefaultValueTideTypeEnumItemSTRINGTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TideTypeEnum__DefaultValueAssignment_4_16368); 
             after(grammarAccess.getTideTypeEnumAccess().getDefaultValueTideTypeEnumItemSTRINGTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getTideTypeEnumAccess().getDefaultValueTideTypeEnumItemCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__DefaultValueAssignment_4_1


    // $ANTLR start rule__TideTypeEnum__TideEnumlistAssignment_5_2
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3253:1: rule__TideTypeEnum__TideEnumlistAssignment_5_2 : ( ruletideTypeEnumItem ) ;
    public final void rule__TideTypeEnum__TideEnumlistAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3257:1: ( ( ruletideTypeEnumItem ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3258:1: ( ruletideTypeEnumItem )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3258:1: ( ruletideTypeEnumItem )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3259:1: ruletideTypeEnumItem
            {
             before(grammarAccess.getTideTypeEnumAccess().getTideEnumlistTideTypeEnumItemParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruletideTypeEnumItem_in_rule__TideTypeEnum__TideEnumlistAssignment_5_26403);
            ruletideTypeEnumItem();
            _fsp--;

             after(grammarAccess.getTideTypeEnumAccess().getTideEnumlistTideTypeEnumItemParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__TideEnumlistAssignment_5_2


    // $ANTLR start rule__TideTypeEnum__TideEnumlistAssignment_5_3_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3268:1: rule__TideTypeEnum__TideEnumlistAssignment_5_3_1 : ( ruletideTypeEnumItem ) ;
    public final void rule__TideTypeEnum__TideEnumlistAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3272:1: ( ( ruletideTypeEnumItem ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3273:1: ( ruletideTypeEnumItem )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3273:1: ( ruletideTypeEnumItem )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3274:1: ruletideTypeEnumItem
            {
             before(grammarAccess.getTideTypeEnumAccess().getTideEnumlistTideTypeEnumItemParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruletideTypeEnumItem_in_rule__TideTypeEnum__TideEnumlistAssignment_5_3_16434);
            ruletideTypeEnumItem();
            _fsp--;

             after(grammarAccess.getTideTypeEnumAccess().getTideEnumlistTideTypeEnumItemParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnum__TideEnumlistAssignment_5_3_1


    // $ANTLR start rule__TideTypeEnumItem__ValueAssignment_3_1
    // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3283:1: rule__TideTypeEnumItem__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__TideTypeEnumItem__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3287:1: ( ( RULE_STRING ) )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3288:1: ( RULE_STRING )
            {
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3288:1: ( RULE_STRING )
            // ../gr.upatras.ece.wcl.sdl.ui/src-gen/gr/upatras/ece/wcl/ui/contentassist/antlr/internal/InternalSDL.g:3289:1: RULE_STRING
            {
             before(grammarAccess.getTideTypeEnumItemAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__TideTypeEnumItem__ValueAssignment_3_16465); 
             after(grammarAccess.getTideTypeEnumItemAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__TideTypeEnumItem__ValueAssignment_3_1


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleServiceRule_in_entryRuleServiceRule61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServiceRule68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceRule__Group__0_in_ruleServiceRule94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSettingType_in_entryRuleSettingType183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSettingType190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SettingType__Alternatives_in_ruleSettingType216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceSetting_in_entryRuleServiceSetting243 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleServiceSetting250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__0_in_ruleServiceSetting276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOfferedService_in_entryRuleOfferedService303 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOfferedService310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__0_in_ruleOfferedService336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBoolean__Alternatives_in_ruleEBoolean396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeSTRING_in_entryRuletideTypeSTRING423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletideTypeSTRING430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__0_in_ruletideTypeSTRING456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeEnum_in_entryRuletideTypeEnum483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletideTypeEnum490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__0_in_ruletideTypeEnum516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeEnumItem_in_entryRuletideTypeEnumItem543 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuletideTypeEnumItem550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__0_in_ruletideTypeEnumItem576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeSTRING_in_rule__SettingType__Alternatives612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeEnum_in_rule__SettingType__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EBoolean__Alternatives662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EBoolean__Alternatives682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceRule__Group__0__Impl_in_rule__ServiceRule__Group__0714 = new BitSet(new long[]{0x0000000008002000L});
        public static final BitSet FOLLOW_rule__ServiceRule__Group__1_in_rule__ServiceRule__Group__0717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceRule__Group__1__Impl_in_rule__ServiceRule__Group__1775 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__ServiceRule__Group__2_in_rule__ServiceRule__Group__1778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceRule__ImportsAssignment_1_in_rule__ServiceRule__Group__1__Impl805 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_rule__ServiceRule__Group__2__Impl_in_rule__ServiceRule__Group__2836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceRule__OfferedServiceAssignment_2_in_rule__ServiceRule__Group__2__Impl863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__0899 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__0902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Import__Group__0__Impl930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__1961 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Import__Group__2__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__0__Impl_in_rule__ServiceSetting__Group__01089 = new BitSet(new long[]{0x0000003800008000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__1_in_rule__ServiceSetting__Group__01092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__1__Impl_in_rule__ServiceSetting__Group__11150 = new BitSet(new long[]{0x0000003000008000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__2_in_rule__ServiceSetting__Group__11153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__UserExposedAssignment_1_in_rule__ServiceSetting__Group__1__Impl1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__2__Impl_in_rule__ServiceSetting__Group__21211 = new BitSet(new long[]{0x0000002000008000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__3_in_rule__ServiceSetting__Group__21214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__UserEditableAssignment_2_in_rule__ServiceSetting__Group__2__Impl1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__3__Impl_in_rule__ServiceSetting__Group__31272 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__4_in_rule__ServiceSetting__Group__31275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__CanBePublishedAssignment_3_in_rule__ServiceSetting__Group__3__Impl1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__4__Impl_in_rule__ServiceSetting__Group__41333 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__5_in_rule__ServiceSetting__Group__41336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ServiceSetting__Group__4__Impl1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__5__Impl_in_rule__ServiceSetting__Group__51395 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__6_in_rule__ServiceSetting__Group__51398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__NameAssignment_5_in_rule__ServiceSetting__Group__5__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__6__Impl_in_rule__ServiceSetting__Group__61455 = new BitSet(new long[]{0x00000000047E0000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__7_in_rule__ServiceSetting__Group__61458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ServiceSetting__Group__6__Impl1486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__7__Impl_in_rule__ServiceSetting__Group__71517 = new BitSet(new long[]{0x00000000047A0000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__8_in_rule__ServiceSetting__Group__71520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_7__0_in_rule__ServiceSetting__Group__7__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__8__Impl_in_rule__ServiceSetting__Group__81578 = new BitSet(new long[]{0x0000000004720000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__9_in_rule__ServiceSetting__Group__81581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_8__0_in_rule__ServiceSetting__Group__8__Impl1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__9__Impl_in_rule__ServiceSetting__Group__91639 = new BitSet(new long[]{0x0000000004620000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__10_in_rule__ServiceSetting__Group__91642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_9__0_in_rule__ServiceSetting__Group__9__Impl1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__10__Impl_in_rule__ServiceSetting__Group__101700 = new BitSet(new long[]{0x0000000004420000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__11_in_rule__ServiceSetting__Group__101703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_10__0_in_rule__ServiceSetting__Group__10__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__11__Impl_in_rule__ServiceSetting__Group__111761 = new BitSet(new long[]{0x0000000004020000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__12_in_rule__ServiceSetting__Group__111764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__0_in_rule__ServiceSetting__Group__11__Impl1791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__12__Impl_in_rule__ServiceSetting__Group__121822 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__13_in_rule__ServiceSetting__Group__121825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_12__0_in_rule__ServiceSetting__Group__12__Impl1852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group__13__Impl_in_rule__ServiceSetting__Group__131883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ServiceSetting__Group__13__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_7__0__Impl_in_rule__ServiceSetting__Group_7__01970 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_7__1_in_rule__ServiceSetting__Group_7__01973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ServiceSetting__Group_7__0__Impl2001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_7__1__Impl_in_rule__ServiceSetting__Group_7__12032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__IdAssignment_7_1_in_rule__ServiceSetting__Group_7__1__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_8__0__Impl_in_rule__ServiceSetting__Group_8__02093 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_8__1_in_rule__ServiceSetting__Group_8__02096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ServiceSetting__Group_8__0__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_8__1__Impl_in_rule__ServiceSetting__Group_8__12155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__DescriptionAssignment_8_1_in_rule__ServiceSetting__Group_8__1__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_9__0__Impl_in_rule__ServiceSetting__Group_9__02216 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_9__1_in_rule__ServiceSetting__Group_9__02219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ServiceSetting__Group_9__0__Impl2247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_9__1__Impl_in_rule__ServiceSetting__Group_9__12278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__ReadableAssignment_9_1_in_rule__ServiceSetting__Group_9__1__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_10__0__Impl_in_rule__ServiceSetting__Group_10__02339 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_10__1_in_rule__ServiceSetting__Group_10__02342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__ServiceSetting__Group_10__0__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_10__1__Impl_in_rule__ServiceSetting__Group_10__12401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__WritableAssignment_10_1_in_rule__ServiceSetting__Group_10__1__Impl2428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__0__Impl_in_rule__ServiceSetting__Group_11__02462 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__1_in_rule__ServiceSetting__Group_11__02465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__ServiceSetting__Group_11__0__Impl2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__1__Impl_in_rule__ServiceSetting__Group_11__12524 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__2_in_rule__ServiceSetting__Group_11__12527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__ServiceSetting__Group_11__1__Impl2555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__2__Impl_in_rule__ServiceSetting__Group_11__22586 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__3_in_rule__ServiceSetting__Group_11__22589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__RequiresParamsAssignment_11_2_in_rule__ServiceSetting__Group_11__2__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__3__Impl_in_rule__ServiceSetting__Group_11__32646 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__4_in_rule__ServiceSetting__Group_11__32649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11_3__0_in_rule__ServiceSetting__Group_11__3__Impl2676 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11__4__Impl_in_rule__ServiceSetting__Group_11__42707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__ServiceSetting__Group_11__4__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11_3__0__Impl_in_rule__ServiceSetting__Group_11_3__02776 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11_3__1_in_rule__ServiceSetting__Group_11_3__02779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__ServiceSetting__Group_11_3__0__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_11_3__1__Impl_in_rule__ServiceSetting__Group_11_3__12838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__RequiresParamsAssignment_11_3_1_in_rule__ServiceSetting__Group_11_3__1__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_12__0__Impl_in_rule__ServiceSetting__Group_12__02899 = new BitSet(new long[]{0x00000000A0000000L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_12__1_in_rule__ServiceSetting__Group_12__02902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__ServiceSetting__Group_12__0__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__Group_12__1__Impl_in_rule__ServiceSetting__Group_12__12961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ServiceSetting__SettingTypeAssignment_12_1_in_rule__ServiceSetting__Group_12__1__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__0__Impl_in_rule__OfferedService__Group__03022 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__1_in_rule__OfferedService__Group__03025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__1__Impl_in_rule__OfferedService__Group__13083 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__2_in_rule__OfferedService__Group__13086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__OfferedService__Group__1__Impl3114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__2__Impl_in_rule__OfferedService__Group__23145 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__3_in_rule__OfferedService__Group__23148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__NameAssignment_2_in_rule__OfferedService__Group__2__Impl3175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__3__Impl_in_rule__OfferedService__Group__33205 = new BitSet(new long[]{0x0000000010020000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__4_in_rule__OfferedService__Group__33208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__OfferedService__Group__3__Impl3236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__4__Impl_in_rule__OfferedService__Group__43267 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__5_in_rule__OfferedService__Group__43270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__0_in_rule__OfferedService__Group__4__Impl3297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group__5__Impl_in_rule__OfferedService__Group__53328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__OfferedService__Group__5__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__0__Impl_in_rule__OfferedService__Group_4__03399 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__1_in_rule__OfferedService__Group_4__03402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__OfferedService__Group_4__0__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__1__Impl_in_rule__OfferedService__Group_4__13461 = new BitSet(new long[]{0x0000003800008000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__2_in_rule__OfferedService__Group_4__13464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__OfferedService__Group_4__1__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__2__Impl_in_rule__OfferedService__Group_4__23523 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__3_in_rule__OfferedService__Group_4__23526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__ServiceSettingsAssignment_4_2_in_rule__OfferedService__Group_4__2__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__3__Impl_in_rule__OfferedService__Group_4__33583 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__4_in_rule__OfferedService__Group_4__33586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4_3__0_in_rule__OfferedService__Group_4__3__Impl3613 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4__4__Impl_in_rule__OfferedService__Group_4__43644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__OfferedService__Group_4__4__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4_3__0__Impl_in_rule__OfferedService__Group_4_3__03713 = new BitSet(new long[]{0x0000003800008000L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4_3__1_in_rule__OfferedService__Group_4_3__03716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__OfferedService__Group_4_3__0__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__Group_4_3__1__Impl_in_rule__OfferedService__Group_4_3__13775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__OfferedService__ServiceSettingsAssignment_4_3_1_in_rule__OfferedService__Group_4_3__1__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__0__Impl_in_rule__TideTypeSTRING__Group__03836 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__1_in_rule__TideTypeSTRING__Group__03839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__1__Impl_in_rule__TideTypeSTRING__Group__13897 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__2_in_rule__TideTypeSTRING__Group__13900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__TideTypeSTRING__Group__1__Impl3928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__2__Impl_in_rule__TideTypeSTRING__Group__23959 = new BitSet(new long[]{0x0000000040020000L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__3_in_rule__TideTypeSTRING__Group__23962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TideTypeSTRING__Group__2__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__3__Impl_in_rule__TideTypeSTRING__Group__34021 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__4_in_rule__TideTypeSTRING__Group__34024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group_3__0_in_rule__TideTypeSTRING__Group__3__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group__4__Impl_in_rule__TideTypeSTRING__Group__44082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TideTypeSTRING__Group__4__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group_3__0__Impl_in_rule__TideTypeSTRING__Group_3__04151 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group_3__1_in_rule__TideTypeSTRING__Group_3__04154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TideTypeSTRING__Group_3__0__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__Group_3__1__Impl_in_rule__TideTypeSTRING__Group_3__14213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeSTRING__DefaultValueAssignment_3_1_in_rule__TideTypeSTRING__Group_3__1__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__0__Impl_in_rule__TideTypeEnum__Group__04274 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__1_in_rule__TideTypeEnum__Group__04277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__1__Impl_in_rule__TideTypeEnum__Group__14335 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__2_in_rule__TideTypeEnum__Group__14338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__TideTypeEnum__Group__1__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__2__Impl_in_rule__TideTypeEnum__Group__24397 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__3_in_rule__TideTypeEnum__Group__24400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__NameAssignment_2_in_rule__TideTypeEnum__Group__2__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__3__Impl_in_rule__TideTypeEnum__Group__34457 = new BitSet(new long[]{0x0000000140020000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__4_in_rule__TideTypeEnum__Group__34460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TideTypeEnum__Group__3__Impl4488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__4__Impl_in_rule__TideTypeEnum__Group__44519 = new BitSet(new long[]{0x0000000100020000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__5_in_rule__TideTypeEnum__Group__44522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_4__0_in_rule__TideTypeEnum__Group__4__Impl4549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__5__Impl_in_rule__TideTypeEnum__Group__54580 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__6_in_rule__TideTypeEnum__Group__54583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__0_in_rule__TideTypeEnum__Group__5__Impl4610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group__6__Impl_in_rule__TideTypeEnum__Group__64641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TideTypeEnum__Group__6__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_4__0__Impl_in_rule__TideTypeEnum__Group_4__04714 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_4__1_in_rule__TideTypeEnum__Group_4__04717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__TideTypeEnum__Group_4__0__Impl4745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_4__1__Impl_in_rule__TideTypeEnum__Group_4__14776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__DefaultValueAssignment_4_1_in_rule__TideTypeEnum__Group_4__1__Impl4803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__0__Impl_in_rule__TideTypeEnum__Group_5__04837 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__1_in_rule__TideTypeEnum__Group_5__04840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__TideTypeEnum__Group_5__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__1__Impl_in_rule__TideTypeEnum__Group_5__14899 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__2_in_rule__TideTypeEnum__Group_5__14902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TideTypeEnum__Group_5__1__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__2__Impl_in_rule__TideTypeEnum__Group_5__24961 = new BitSet(new long[]{0x0000000002020000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__3_in_rule__TideTypeEnum__Group_5__24964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__TideEnumlistAssignment_5_2_in_rule__TideTypeEnum__Group_5__2__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__3__Impl_in_rule__TideTypeEnum__Group_5__35021 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__4_in_rule__TideTypeEnum__Group_5__35024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5_3__0_in_rule__TideTypeEnum__Group_5__3__Impl5051 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5__4__Impl_in_rule__TideTypeEnum__Group_5__45082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TideTypeEnum__Group_5__4__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5_3__0__Impl_in_rule__TideTypeEnum__Group_5_3__05151 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5_3__1_in_rule__TideTypeEnum__Group_5_3__05154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__TideTypeEnum__Group_5_3__0__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__Group_5_3__1__Impl_in_rule__TideTypeEnum__Group_5_3__15213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnum__TideEnumlistAssignment_5_3_1_in_rule__TideTypeEnum__Group_5_3__1__Impl5240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__0__Impl_in_rule__TideTypeEnumItem__Group__05274 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__1_in_rule__TideTypeEnumItem__Group__05277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__1__Impl_in_rule__TideTypeEnumItem__Group__15335 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__2_in_rule__TideTypeEnumItem__Group__15338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__TideTypeEnumItem__Group__1__Impl5366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__2__Impl_in_rule__TideTypeEnumItem__Group__25397 = new BitSet(new long[]{0x0000000400020000L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__3_in_rule__TideTypeEnumItem__Group__25400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__TideTypeEnumItem__Group__2__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__3__Impl_in_rule__TideTypeEnumItem__Group__35459 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__4_in_rule__TideTypeEnumItem__Group__35462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group_3__0_in_rule__TideTypeEnumItem__Group__3__Impl5489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group__4__Impl_in_rule__TideTypeEnumItem__Group__45520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__TideTypeEnumItem__Group__4__Impl5548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group_3__0__Impl_in_rule__TideTypeEnumItem__Group_3__05589 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group_3__1_in_rule__TideTypeEnumItem__Group_3__05592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__TideTypeEnumItem__Group_3__0__Impl5620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__Group_3__1__Impl_in_rule__TideTypeEnumItem__Group_3__15651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TideTypeEnumItem__ValueAssignment_3_1_in_rule__TideTypeEnumItem__Group_3__1__Impl5678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImport_in_rule__ServiceRule__ImportsAssignment_15717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOfferedService_in_rule__ServiceRule__OfferedServiceAssignment_25748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__ServiceSetting__UserExposedAssignment_15818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__ServiceSetting__UserEditableAssignment_25862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ServiceSetting__CanBePublishedAssignment_35906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSetting__NameAssignment_55945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__ServiceSetting__IdAssignment_7_15976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSetting__DescriptionAssignment_8_16007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__ServiceSetting__ReadableAssignment_9_16038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_rule__ServiceSetting__WritableAssignment_10_16069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSetting__RequiresParamsAssignment_11_26104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSetting__RequiresParamsAssignment_11_3_16143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSettingType_in_rule__ServiceSetting__SettingTypeAssignment_12_16178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__OfferedService__NameAssignment_26209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceSetting_in_rule__OfferedService__ServiceSettingsAssignment_4_26240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleServiceSetting_in_rule__OfferedService__ServiceSettingsAssignment_4_3_16271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TideTypeSTRING__DefaultValueAssignment_3_16302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TideTypeEnum__NameAssignment_26333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TideTypeEnum__DefaultValueAssignment_4_16368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeEnumItem_in_rule__TideTypeEnum__TideEnumlistAssignment_5_26403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruletideTypeEnumItem_in_rule__TideTypeEnum__TideEnumlistAssignment_5_3_16434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__TideTypeEnumItem__ValueAssignment_3_16465 = new BitSet(new long[]{0x0000000000000002L});
    }


}