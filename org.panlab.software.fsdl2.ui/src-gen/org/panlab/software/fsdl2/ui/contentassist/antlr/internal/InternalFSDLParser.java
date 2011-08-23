package org.panlab.software.fsdl2.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.panlab.software.fsdl2.services.FSDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RequestedFederationScenario'", "'Description'", "'Credentials'", "'import office'", "';'", "'RequestServices'", "'{'", "'}'", "'Service'", "'as'", "'[1..'", "']'", "'offered by'", "'optional'", "'settings'", "'ScheduledPlan'", "'ValidFrom'", "'ValidUntil'", "'id'", "'description'", "'UserName'", "'PassWord'", "'Setting'", "':'", "'='", "'assign'", "','", "'RequestInfrastructure'", "'Resource'", "'ResourceGroup'", "'refersResources'", "'isShared'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g"; }


     
     	private FSDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FSDLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleRequestedFederationScenario"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:60:1: entryRuleRequestedFederationScenario : ruleRequestedFederationScenario EOF ;
    public final void entryRuleRequestedFederationScenario() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:61:1: ( ruleRequestedFederationScenario EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:62:1: ruleRequestedFederationScenario EOF
            {
             before(grammarAccess.getRequestedFederationScenarioRule()); 
            pushFollow(FOLLOW_ruleRequestedFederationScenario_in_entryRuleRequestedFederationScenario61);
            ruleRequestedFederationScenario();

            state._fsp--;

             after(grammarAccess.getRequestedFederationScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequestedFederationScenario68); 

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
    // $ANTLR end "entryRuleRequestedFederationScenario"


    // $ANTLR start "ruleRequestedFederationScenario"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:69:1: ruleRequestedFederationScenario : ( ( rule__RequestedFederationScenario__Group__0 ) ) ;
    public final void ruleRequestedFederationScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:73:2: ( ( ( rule__RequestedFederationScenario__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:74:1: ( ( rule__RequestedFederationScenario__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:74:1: ( ( rule__RequestedFederationScenario__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:75:1: ( rule__RequestedFederationScenario__Group__0 )
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:76:1: ( rule__RequestedFederationScenario__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:76:2: rule__RequestedFederationScenario__Group__0
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__0_in_ruleRequestedFederationScenario94);
            rule__RequestedFederationScenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleRequestedFederationScenario"


    // $ANTLR start "entryRuleImport"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:89:1: ( ruleImport EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:102:1: ( ( rule__Import__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:104:1: ( rule__Import__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
            rule__Import__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleServicesRequest"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:116:1: entryRuleServicesRequest : ruleServicesRequest EOF ;
    public final void entryRuleServicesRequest() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:117:1: ( ruleServicesRequest EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:118:1: ruleServicesRequest EOF
            {
             before(grammarAccess.getServicesRequestRule()); 
            pushFollow(FOLLOW_ruleServicesRequest_in_entryRuleServicesRequest181);
            ruleServicesRequest();

            state._fsp--;

             after(grammarAccess.getServicesRequestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServicesRequest188); 

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
    // $ANTLR end "entryRuleServicesRequest"


    // $ANTLR start "ruleServicesRequest"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:125:1: ruleServicesRequest : ( ( rule__ServicesRequest__Group__0 ) ) ;
    public final void ruleServicesRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:129:2: ( ( ( rule__ServicesRequest__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:130:1: ( ( rule__ServicesRequest__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:130:1: ( ( rule__ServicesRequest__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:131:1: ( rule__ServicesRequest__Group__0 )
            {
             before(grammarAccess.getServicesRequestAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:132:1: ( rule__ServicesRequest__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:132:2: rule__ServicesRequest__Group__0
            {
            pushFollow(FOLLOW_rule__ServicesRequest__Group__0_in_ruleServicesRequest214);
            rule__ServicesRequest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServicesRequestAccess().getGroup()); 

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
    // $ANTLR end "ruleServicesRequest"


    // $ANTLR start "entryRuleServiceRequest"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:144:1: entryRuleServiceRequest : ruleServiceRequest EOF ;
    public final void entryRuleServiceRequest() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:145:1: ( ruleServiceRequest EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:146:1: ruleServiceRequest EOF
            {
             before(grammarAccess.getServiceRequestRule()); 
            pushFollow(FOLLOW_ruleServiceRequest_in_entryRuleServiceRequest241);
            ruleServiceRequest();

            state._fsp--;

             after(grammarAccess.getServiceRequestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceRequest248); 

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
    // $ANTLR end "entryRuleServiceRequest"


    // $ANTLR start "ruleServiceRequest"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:153:1: ruleServiceRequest : ( ( rule__ServiceRequest__Group__0 ) ) ;
    public final void ruleServiceRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:157:2: ( ( ( rule__ServiceRequest__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:158:1: ( ( rule__ServiceRequest__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:158:1: ( ( rule__ServiceRequest__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:159:1: ( rule__ServiceRequest__Group__0 )
            {
             before(grammarAccess.getServiceRequestAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:160:1: ( rule__ServiceRequest__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:160:2: rule__ServiceRequest__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__0_in_ruleServiceRequest274);
            rule__ServiceRequest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceRequestAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceRequest"


    // $ANTLR start "entryRuleScheduledPlan"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:172:1: entryRuleScheduledPlan : ruleScheduledPlan EOF ;
    public final void entryRuleScheduledPlan() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:173:1: ( ruleScheduledPlan EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:174:1: ruleScheduledPlan EOF
            {
             before(grammarAccess.getScheduledPlanRule()); 
            pushFollow(FOLLOW_ruleScheduledPlan_in_entryRuleScheduledPlan301);
            ruleScheduledPlan();

            state._fsp--;

             after(grammarAccess.getScheduledPlanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheduledPlan308); 

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
    // $ANTLR end "entryRuleScheduledPlan"


    // $ANTLR start "ruleScheduledPlan"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:181:1: ruleScheduledPlan : ( ( rule__ScheduledPlan__Group__0 ) ) ;
    public final void ruleScheduledPlan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:185:2: ( ( ( rule__ScheduledPlan__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:186:1: ( ( rule__ScheduledPlan__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:186:1: ( ( rule__ScheduledPlan__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:187:1: ( rule__ScheduledPlan__Group__0 )
            {
             before(grammarAccess.getScheduledPlanAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:188:1: ( rule__ScheduledPlan__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:188:2: rule__ScheduledPlan__Group__0
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group__0_in_ruleScheduledPlan334);
            rule__ScheduledPlan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScheduledPlanAccess().getGroup()); 

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
    // $ANTLR end "ruleScheduledPlan"


    // $ANTLR start "entryRuleCredentials"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:200:1: entryRuleCredentials : ruleCredentials EOF ;
    public final void entryRuleCredentials() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:201:1: ( ruleCredentials EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:202:1: ruleCredentials EOF
            {
             before(grammarAccess.getCredentialsRule()); 
            pushFollow(FOLLOW_ruleCredentials_in_entryRuleCredentials361);
            ruleCredentials();

            state._fsp--;

             after(grammarAccess.getCredentialsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCredentials368); 

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
    // $ANTLR end "entryRuleCredentials"


    // $ANTLR start "ruleCredentials"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:209:1: ruleCredentials : ( ( rule__Credentials__Group__0 ) ) ;
    public final void ruleCredentials() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:213:2: ( ( ( rule__Credentials__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:214:1: ( ( rule__Credentials__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:214:1: ( ( rule__Credentials__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:215:1: ( rule__Credentials__Group__0 )
            {
             before(grammarAccess.getCredentialsAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:216:1: ( rule__Credentials__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:216:2: rule__Credentials__Group__0
            {
            pushFollow(FOLLOW_rule__Credentials__Group__0_in_ruleCredentials394);
            rule__Credentials__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCredentialsAccess().getGroup()); 

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
    // $ANTLR end "ruleCredentials"


    // $ANTLR start "entryRuleServiceSettingInstance"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:228:1: entryRuleServiceSettingInstance : ruleServiceSettingInstance EOF ;
    public final void entryRuleServiceSettingInstance() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:229:1: ( ruleServiceSettingInstance EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:230:1: ruleServiceSettingInstance EOF
            {
             before(grammarAccess.getServiceSettingInstanceRule()); 
            pushFollow(FOLLOW_ruleServiceSettingInstance_in_entryRuleServiceSettingInstance421);
            ruleServiceSettingInstance();

            state._fsp--;

             after(grammarAccess.getServiceSettingInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceSettingInstance428); 

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
    // $ANTLR end "entryRuleServiceSettingInstance"


    // $ANTLR start "ruleServiceSettingInstance"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:237:1: ruleServiceSettingInstance : ( ( rule__ServiceSettingInstance__Group__0 ) ) ;
    public final void ruleServiceSettingInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:241:2: ( ( ( rule__ServiceSettingInstance__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:242:1: ( ( rule__ServiceSettingInstance__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:242:1: ( ( rule__ServiceSettingInstance__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:243:1: ( rule__ServiceSettingInstance__Group__0 )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:244:1: ( rule__ServiceSettingInstance__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:244:2: rule__ServiceSettingInstance__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__0_in_ruleServiceSettingInstance454);
            rule__ServiceSettingInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceSettingInstanceAccess().getGroup()); 

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
    // $ANTLR end "ruleServiceSettingInstance"


    // $ANTLR start "entryRuleInfrastructureRequest"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:256:1: entryRuleInfrastructureRequest : ruleInfrastructureRequest EOF ;
    public final void entryRuleInfrastructureRequest() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:257:1: ( ruleInfrastructureRequest EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:258:1: ruleInfrastructureRequest EOF
            {
             before(grammarAccess.getInfrastructureRequestRule()); 
            pushFollow(FOLLOW_ruleInfrastructureRequest_in_entryRuleInfrastructureRequest481);
            ruleInfrastructureRequest();

            state._fsp--;

             after(grammarAccess.getInfrastructureRequestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInfrastructureRequest488); 

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
    // $ANTLR end "entryRuleInfrastructureRequest"


    // $ANTLR start "ruleInfrastructureRequest"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:265:1: ruleInfrastructureRequest : ( ( rule__InfrastructureRequest__Group__0 ) ) ;
    public final void ruleInfrastructureRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:269:2: ( ( ( rule__InfrastructureRequest__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:270:1: ( ( rule__InfrastructureRequest__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:270:1: ( ( rule__InfrastructureRequest__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:271:1: ( rule__InfrastructureRequest__Group__0 )
            {
             before(grammarAccess.getInfrastructureRequestAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:272:1: ( rule__InfrastructureRequest__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:272:2: rule__InfrastructureRequest__Group__0
            {
            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__0_in_ruleInfrastructureRequest514);
            rule__InfrastructureRequest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfrastructureRequestAccess().getGroup()); 

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
    // $ANTLR end "ruleInfrastructureRequest"


    // $ANTLR start "entryRuleResourceRequest"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:284:1: entryRuleResourceRequest : ruleResourceRequest EOF ;
    public final void entryRuleResourceRequest() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:285:1: ( ruleResourceRequest EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:286:1: ruleResourceRequest EOF
            {
             before(grammarAccess.getResourceRequestRule()); 
            pushFollow(FOLLOW_ruleResourceRequest_in_entryRuleResourceRequest541);
            ruleResourceRequest();

            state._fsp--;

             after(grammarAccess.getResourceRequestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceRequest548); 

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
    // $ANTLR end "entryRuleResourceRequest"


    // $ANTLR start "ruleResourceRequest"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:293:1: ruleResourceRequest : ( ( rule__ResourceRequest__Group__0 ) ) ;
    public final void ruleResourceRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:297:2: ( ( ( rule__ResourceRequest__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:298:1: ( ( rule__ResourceRequest__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:298:1: ( ( rule__ResourceRequest__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:299:1: ( rule__ResourceRequest__Group__0 )
            {
             before(grammarAccess.getResourceRequestAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:300:1: ( rule__ResourceRequest__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:300:2: rule__ResourceRequest__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group__0_in_ruleResourceRequest574);
            rule__ResourceRequest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceRequestAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceRequest"


    // $ANTLR start "entryRuleResourceGroup"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:312:1: entryRuleResourceGroup : ruleResourceGroup EOF ;
    public final void entryRuleResourceGroup() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:313:1: ( ruleResourceGroup EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:314:1: ruleResourceGroup EOF
            {
             before(grammarAccess.getResourceGroupRule()); 
            pushFollow(FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup601);
            ruleResourceGroup();

            state._fsp--;

             after(grammarAccess.getResourceGroupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceGroup608); 

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
    // $ANTLR end "entryRuleResourceGroup"


    // $ANTLR start "ruleResourceGroup"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:321:1: ruleResourceGroup : ( ( rule__ResourceGroup__Group__0 ) ) ;
    public final void ruleResourceGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:325:2: ( ( ( rule__ResourceGroup__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:326:1: ( ( rule__ResourceGroup__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:326:1: ( ( rule__ResourceGroup__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:327:1: ( rule__ResourceGroup__Group__0 )
            {
             before(grammarAccess.getResourceGroupAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:328:1: ( rule__ResourceGroup__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:328:2: rule__ResourceGroup__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__0_in_ruleResourceGroup634);
            rule__ResourceGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceGroup"


    // $ANTLR start "entryRuleResourceSettingInstance"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:340:1: entryRuleResourceSettingInstance : ruleResourceSettingInstance EOF ;
    public final void entryRuleResourceSettingInstance() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:341:1: ( ruleResourceSettingInstance EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:342:1: ruleResourceSettingInstance EOF
            {
             before(grammarAccess.getResourceSettingInstanceRule()); 
            pushFollow(FOLLOW_ruleResourceSettingInstance_in_entryRuleResourceSettingInstance661);
            ruleResourceSettingInstance();

            state._fsp--;

             after(grammarAccess.getResourceSettingInstanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceSettingInstance668); 

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
    // $ANTLR end "entryRuleResourceSettingInstance"


    // $ANTLR start "ruleResourceSettingInstance"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:349:1: ruleResourceSettingInstance : ( ( rule__ResourceSettingInstance__Group__0 ) ) ;
    public final void ruleResourceSettingInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:353:2: ( ( ( rule__ResourceSettingInstance__Group__0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:354:1: ( ( rule__ResourceSettingInstance__Group__0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:354:1: ( ( rule__ResourceSettingInstance__Group__0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:355:1: ( rule__ResourceSettingInstance__Group__0 )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getGroup()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:356:1: ( rule__ResourceSettingInstance__Group__0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:356:2: rule__ResourceSettingInstance__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__0_in_ruleResourceSettingInstance694);
            rule__ResourceSettingInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceSettingInstanceAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceSettingInstance"


    // $ANTLR start "entryRuleEDate"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:368:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:369:1: ( ruleEDate EOF )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:370:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_ruleEDate_in_entryRuleEDate721);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDate728); 

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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:377:1: ruleEDate : ( RULE_STRING ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:381:2: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:382:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:382:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:383:1: RULE_STRING
            {
             before(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEDate754); 
             after(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "rule__ServiceSettingInstance__NameAlternatives_3_0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:396:1: rule__ServiceSettingInstance__NameAlternatives_3_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ServiceSettingInstance__NameAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:400:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:401:1: ( RULE_ID )
                    {
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:401:1: ( RULE_ID )
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:402:1: RULE_ID
                    {
                     before(grammarAccess.getServiceSettingInstanceAccess().getNameIDTerminalRuleCall_3_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceSettingInstance__NameAlternatives_3_0789); 
                     after(grammarAccess.getServiceSettingInstanceAccess().getNameIDTerminalRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:407:6: ( RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:407:6: ( RULE_STRING )
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:408:1: RULE_STRING
                    {
                     before(grammarAccess.getServiceSettingInstanceAccess().getNameSTRINGTerminalRuleCall_3_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__NameAlternatives_3_0806); 
                     after(grammarAccess.getServiceSettingInstanceAccess().getNameSTRINGTerminalRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__NameAlternatives_3_0"


    // $ANTLR start "rule__ResourceSettingInstance__NameAlternatives_3_0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:418:1: rule__ResourceSettingInstance__NameAlternatives_3_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ResourceSettingInstance__NameAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:422:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:423:1: ( RULE_ID )
                    {
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:423:1: ( RULE_ID )
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:424:1: RULE_ID
                    {
                     before(grammarAccess.getResourceSettingInstanceAccess().getNameIDTerminalRuleCall_3_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceSettingInstance__NameAlternatives_3_0838); 
                     after(grammarAccess.getResourceSettingInstanceAccess().getNameIDTerminalRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:429:6: ( RULE_STRING )
                    {
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:429:6: ( RULE_STRING )
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:430:1: RULE_STRING
                    {
                     before(grammarAccess.getResourceSettingInstanceAccess().getNameSTRINGTerminalRuleCall_3_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__NameAlternatives_3_0855); 
                     after(grammarAccess.getResourceSettingInstanceAccess().getNameSTRINGTerminalRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__NameAlternatives_3_0"


    // $ANTLR start "rule__RequestedFederationScenario__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:442:1: rule__RequestedFederationScenario__Group__0 : rule__RequestedFederationScenario__Group__0__Impl rule__RequestedFederationScenario__Group__1 ;
    public final void rule__RequestedFederationScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:446:1: ( rule__RequestedFederationScenario__Group__0__Impl rule__RequestedFederationScenario__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:447:2: rule__RequestedFederationScenario__Group__0__Impl rule__RequestedFederationScenario__Group__1
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__0__Impl_in_rule__RequestedFederationScenario__Group__0885);
            rule__RequestedFederationScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__1_in_rule__RequestedFederationScenario__Group__0888);
            rule__RequestedFederationScenario__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__0"


    // $ANTLR start "rule__RequestedFederationScenario__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:454:1: rule__RequestedFederationScenario__Group__0__Impl : ( () ) ;
    public final void rule__RequestedFederationScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:458:1: ( ( () ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:459:1: ( () )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:459:1: ( () )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:460:1: ()
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioAction_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:461:1: ()
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:463:1: 
            {
            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestedFederationScenario__Group__0__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:473:1: rule__RequestedFederationScenario__Group__1 : rule__RequestedFederationScenario__Group__1__Impl rule__RequestedFederationScenario__Group__2 ;
    public final void rule__RequestedFederationScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:477:1: ( rule__RequestedFederationScenario__Group__1__Impl rule__RequestedFederationScenario__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:478:2: rule__RequestedFederationScenario__Group__1__Impl rule__RequestedFederationScenario__Group__2
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__1__Impl_in_rule__RequestedFederationScenario__Group__1946);
            rule__RequestedFederationScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__2_in_rule__RequestedFederationScenario__Group__1949);
            rule__RequestedFederationScenario__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__1"


    // $ANTLR start "rule__RequestedFederationScenario__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:485:1: rule__RequestedFederationScenario__Group__1__Impl : ( 'RequestedFederationScenario' ) ;
    public final void rule__RequestedFederationScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:489:1: ( ( 'RequestedFederationScenario' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:490:1: ( 'RequestedFederationScenario' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:490:1: ( 'RequestedFederationScenario' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:491:1: 'RequestedFederationScenario'
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__RequestedFederationScenario__Group__1__Impl977); 
             after(grammarAccess.getRequestedFederationScenarioAccess().getRequestedFederationScenarioKeyword_1()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__1__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:504:1: rule__RequestedFederationScenario__Group__2 : rule__RequestedFederationScenario__Group__2__Impl rule__RequestedFederationScenario__Group__3 ;
    public final void rule__RequestedFederationScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:508:1: ( rule__RequestedFederationScenario__Group__2__Impl rule__RequestedFederationScenario__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:509:2: rule__RequestedFederationScenario__Group__2__Impl rule__RequestedFederationScenario__Group__3
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__2__Impl_in_rule__RequestedFederationScenario__Group__21008);
            rule__RequestedFederationScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__3_in_rule__RequestedFederationScenario__Group__21011);
            rule__RequestedFederationScenario__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__2"


    // $ANTLR start "rule__RequestedFederationScenario__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:516:1: rule__RequestedFederationScenario__Group__2__Impl : ( ( rule__RequestedFederationScenario__NameAssignment_2 ) ) ;
    public final void rule__RequestedFederationScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:520:1: ( ( ( rule__RequestedFederationScenario__NameAssignment_2 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:521:1: ( ( rule__RequestedFederationScenario__NameAssignment_2 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:521:1: ( ( rule__RequestedFederationScenario__NameAssignment_2 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:522:1: ( rule__RequestedFederationScenario__NameAssignment_2 )
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getNameAssignment_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:523:1: ( rule__RequestedFederationScenario__NameAssignment_2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:523:2: rule__RequestedFederationScenario__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__NameAssignment_2_in_rule__RequestedFederationScenario__Group__2__Impl1038);
            rule__RequestedFederationScenario__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__2__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:533:1: rule__RequestedFederationScenario__Group__3 : rule__RequestedFederationScenario__Group__3__Impl rule__RequestedFederationScenario__Group__4 ;
    public final void rule__RequestedFederationScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:537:1: ( rule__RequestedFederationScenario__Group__3__Impl rule__RequestedFederationScenario__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:538:2: rule__RequestedFederationScenario__Group__3__Impl rule__RequestedFederationScenario__Group__4
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__3__Impl_in_rule__RequestedFederationScenario__Group__31068);
            rule__RequestedFederationScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__4_in_rule__RequestedFederationScenario__Group__31071);
            rule__RequestedFederationScenario__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__3"


    // $ANTLR start "rule__RequestedFederationScenario__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:545:1: rule__RequestedFederationScenario__Group__3__Impl : ( ( rule__RequestedFederationScenario__ImportsAssignment_3 )* ) ;
    public final void rule__RequestedFederationScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:549:1: ( ( ( rule__RequestedFederationScenario__ImportsAssignment_3 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:550:1: ( ( rule__RequestedFederationScenario__ImportsAssignment_3 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:550:1: ( ( rule__RequestedFederationScenario__ImportsAssignment_3 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:551:1: ( rule__RequestedFederationScenario__ImportsAssignment_3 )*
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getImportsAssignment_3()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:552:1: ( rule__RequestedFederationScenario__ImportsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:552:2: rule__RequestedFederationScenario__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__RequestedFederationScenario__ImportsAssignment_3_in_rule__RequestedFederationScenario__Group__3__Impl1098);
            	    rule__RequestedFederationScenario__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRequestedFederationScenarioAccess().getImportsAssignment_3()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__3__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:562:1: rule__RequestedFederationScenario__Group__4 : rule__RequestedFederationScenario__Group__4__Impl rule__RequestedFederationScenario__Group__5 ;
    public final void rule__RequestedFederationScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:566:1: ( rule__RequestedFederationScenario__Group__4__Impl rule__RequestedFederationScenario__Group__5 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:567:2: rule__RequestedFederationScenario__Group__4__Impl rule__RequestedFederationScenario__Group__5
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__4__Impl_in_rule__RequestedFederationScenario__Group__41129);
            rule__RequestedFederationScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__5_in_rule__RequestedFederationScenario__Group__41132);
            rule__RequestedFederationScenario__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__4"


    // $ANTLR start "rule__RequestedFederationScenario__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:574:1: rule__RequestedFederationScenario__Group__4__Impl : ( ( rule__RequestedFederationScenario__IsSharedAssignment_4 )? ) ;
    public final void rule__RequestedFederationScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:578:1: ( ( ( rule__RequestedFederationScenario__IsSharedAssignment_4 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:579:1: ( ( rule__RequestedFederationScenario__IsSharedAssignment_4 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:579:1: ( ( rule__RequestedFederationScenario__IsSharedAssignment_4 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:580:1: ( rule__RequestedFederationScenario__IsSharedAssignment_4 )?
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getIsSharedAssignment_4()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:581:1: ( rule__RequestedFederationScenario__IsSharedAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==42) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:581:2: rule__RequestedFederationScenario__IsSharedAssignment_4
                    {
                    pushFollow(FOLLOW_rule__RequestedFederationScenario__IsSharedAssignment_4_in_rule__RequestedFederationScenario__Group__4__Impl1159);
                    rule__RequestedFederationScenario__IsSharedAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getIsSharedAssignment_4()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__4__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__5"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:591:1: rule__RequestedFederationScenario__Group__5 : rule__RequestedFederationScenario__Group__5__Impl rule__RequestedFederationScenario__Group__6 ;
    public final void rule__RequestedFederationScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:595:1: ( rule__RequestedFederationScenario__Group__5__Impl rule__RequestedFederationScenario__Group__6 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:596:2: rule__RequestedFederationScenario__Group__5__Impl rule__RequestedFederationScenario__Group__6
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__5__Impl_in_rule__RequestedFederationScenario__Group__51190);
            rule__RequestedFederationScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__6_in_rule__RequestedFederationScenario__Group__51193);
            rule__RequestedFederationScenario__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__5"


    // $ANTLR start "rule__RequestedFederationScenario__Group__5__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:603:1: rule__RequestedFederationScenario__Group__5__Impl : ( ( rule__RequestedFederationScenario__Group_5__0 )? ) ;
    public final void rule__RequestedFederationScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:607:1: ( ( ( rule__RequestedFederationScenario__Group_5__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:608:1: ( ( rule__RequestedFederationScenario__Group_5__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:608:1: ( ( rule__RequestedFederationScenario__Group_5__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:609:1: ( rule__RequestedFederationScenario__Group_5__0 )?
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getGroup_5()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:610:1: ( rule__RequestedFederationScenario__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:610:2: rule__RequestedFederationScenario__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RequestedFederationScenario__Group_5__0_in_rule__RequestedFederationScenario__Group__5__Impl1220);
                    rule__RequestedFederationScenario__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getGroup_5()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__5__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__6"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:620:1: rule__RequestedFederationScenario__Group__6 : rule__RequestedFederationScenario__Group__6__Impl rule__RequestedFederationScenario__Group__7 ;
    public final void rule__RequestedFederationScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:624:1: ( rule__RequestedFederationScenario__Group__6__Impl rule__RequestedFederationScenario__Group__7 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:625:2: rule__RequestedFederationScenario__Group__6__Impl rule__RequestedFederationScenario__Group__7
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__6__Impl_in_rule__RequestedFederationScenario__Group__61251);
            rule__RequestedFederationScenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__7_in_rule__RequestedFederationScenario__Group__61254);
            rule__RequestedFederationScenario__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__6"


    // $ANTLR start "rule__RequestedFederationScenario__Group__6__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:632:1: rule__RequestedFederationScenario__Group__6__Impl : ( ( rule__RequestedFederationScenario__Group_6__0 )? ) ;
    public final void rule__RequestedFederationScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:636:1: ( ( ( rule__RequestedFederationScenario__Group_6__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:637:1: ( ( rule__RequestedFederationScenario__Group_6__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:637:1: ( ( rule__RequestedFederationScenario__Group_6__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:638:1: ( rule__RequestedFederationScenario__Group_6__0 )?
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getGroup_6()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:639:1: ( rule__RequestedFederationScenario__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:639:2: rule__RequestedFederationScenario__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RequestedFederationScenario__Group_6__0_in_rule__RequestedFederationScenario__Group__6__Impl1281);
                    rule__RequestedFederationScenario__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getGroup_6()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__6__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__7"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:649:1: rule__RequestedFederationScenario__Group__7 : rule__RequestedFederationScenario__Group__7__Impl rule__RequestedFederationScenario__Group__8 ;
    public final void rule__RequestedFederationScenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:653:1: ( rule__RequestedFederationScenario__Group__7__Impl rule__RequestedFederationScenario__Group__8 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:654:2: rule__RequestedFederationScenario__Group__7__Impl rule__RequestedFederationScenario__Group__8
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__7__Impl_in_rule__RequestedFederationScenario__Group__71312);
            rule__RequestedFederationScenario__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__8_in_rule__RequestedFederationScenario__Group__71315);
            rule__RequestedFederationScenario__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__7"


    // $ANTLR start "rule__RequestedFederationScenario__Group__7__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:661:1: rule__RequestedFederationScenario__Group__7__Impl : ( ( rule__RequestedFederationScenario__ScheduledPlanAssignment_7 )? ) ;
    public final void rule__RequestedFederationScenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:665:1: ( ( ( rule__RequestedFederationScenario__ScheduledPlanAssignment_7 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:666:1: ( ( rule__RequestedFederationScenario__ScheduledPlanAssignment_7 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:666:1: ( ( rule__RequestedFederationScenario__ScheduledPlanAssignment_7 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:667:1: ( rule__RequestedFederationScenario__ScheduledPlanAssignment_7 )?
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getScheduledPlanAssignment_7()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:668:1: ( rule__RequestedFederationScenario__ScheduledPlanAssignment_7 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:668:2: rule__RequestedFederationScenario__ScheduledPlanAssignment_7
                    {
                    pushFollow(FOLLOW_rule__RequestedFederationScenario__ScheduledPlanAssignment_7_in_rule__RequestedFederationScenario__Group__7__Impl1342);
                    rule__RequestedFederationScenario__ScheduledPlanAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getScheduledPlanAssignment_7()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__7__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__8"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:678:1: rule__RequestedFederationScenario__Group__8 : rule__RequestedFederationScenario__Group__8__Impl rule__RequestedFederationScenario__Group__9 ;
    public final void rule__RequestedFederationScenario__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:682:1: ( rule__RequestedFederationScenario__Group__8__Impl rule__RequestedFederationScenario__Group__9 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:683:2: rule__RequestedFederationScenario__Group__8__Impl rule__RequestedFederationScenario__Group__9
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__8__Impl_in_rule__RequestedFederationScenario__Group__81373);
            rule__RequestedFederationScenario__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__9_in_rule__RequestedFederationScenario__Group__81376);
            rule__RequestedFederationScenario__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__8"


    // $ANTLR start "rule__RequestedFederationScenario__Group__8__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:690:1: rule__RequestedFederationScenario__Group__8__Impl : ( ( rule__RequestedFederationScenario__ServicesRequestAssignment_8 )? ) ;
    public final void rule__RequestedFederationScenario__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:694:1: ( ( ( rule__RequestedFederationScenario__ServicesRequestAssignment_8 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:695:1: ( ( rule__RequestedFederationScenario__ServicesRequestAssignment_8 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:695:1: ( ( rule__RequestedFederationScenario__ServicesRequestAssignment_8 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:696:1: ( rule__RequestedFederationScenario__ServicesRequestAssignment_8 )?
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getServicesRequestAssignment_8()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:697:1: ( rule__RequestedFederationScenario__ServicesRequestAssignment_8 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:697:2: rule__RequestedFederationScenario__ServicesRequestAssignment_8
                    {
                    pushFollow(FOLLOW_rule__RequestedFederationScenario__ServicesRequestAssignment_8_in_rule__RequestedFederationScenario__Group__8__Impl1403);
                    rule__RequestedFederationScenario__ServicesRequestAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getServicesRequestAssignment_8()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__8__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group__9"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:707:1: rule__RequestedFederationScenario__Group__9 : rule__RequestedFederationScenario__Group__9__Impl ;
    public final void rule__RequestedFederationScenario__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:711:1: ( rule__RequestedFederationScenario__Group__9__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:712:2: rule__RequestedFederationScenario__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group__9__Impl_in_rule__RequestedFederationScenario__Group__91434);
            rule__RequestedFederationScenario__Group__9__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group__9"


    // $ANTLR start "rule__RequestedFederationScenario__Group__9__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:718:1: rule__RequestedFederationScenario__Group__9__Impl : ( ( rule__RequestedFederationScenario__InfrastructureRequestAssignment_9 )? ) ;
    public final void rule__RequestedFederationScenario__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:722:1: ( ( ( rule__RequestedFederationScenario__InfrastructureRequestAssignment_9 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:723:1: ( ( rule__RequestedFederationScenario__InfrastructureRequestAssignment_9 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:723:1: ( ( rule__RequestedFederationScenario__InfrastructureRequestAssignment_9 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:724:1: ( rule__RequestedFederationScenario__InfrastructureRequestAssignment_9 )?
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getInfrastructureRequestAssignment_9()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:725:1: ( rule__RequestedFederationScenario__InfrastructureRequestAssignment_9 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:725:2: rule__RequestedFederationScenario__InfrastructureRequestAssignment_9
                    {
                    pushFollow(FOLLOW_rule__RequestedFederationScenario__InfrastructureRequestAssignment_9_in_rule__RequestedFederationScenario__Group__9__Impl1461);
                    rule__RequestedFederationScenario__InfrastructureRequestAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getInfrastructureRequestAssignment_9()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group__9__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group_5__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:755:1: rule__RequestedFederationScenario__Group_5__0 : rule__RequestedFederationScenario__Group_5__0__Impl rule__RequestedFederationScenario__Group_5__1 ;
    public final void rule__RequestedFederationScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:759:1: ( rule__RequestedFederationScenario__Group_5__0__Impl rule__RequestedFederationScenario__Group_5__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:760:2: rule__RequestedFederationScenario__Group_5__0__Impl rule__RequestedFederationScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group_5__0__Impl_in_rule__RequestedFederationScenario__Group_5__01512);
            rule__RequestedFederationScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group_5__1_in_rule__RequestedFederationScenario__Group_5__01515);
            rule__RequestedFederationScenario__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group_5__0"


    // $ANTLR start "rule__RequestedFederationScenario__Group_5__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:767:1: rule__RequestedFederationScenario__Group_5__0__Impl : ( 'Description' ) ;
    public final void rule__RequestedFederationScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:771:1: ( ( 'Description' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:772:1: ( 'Description' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:772:1: ( 'Description' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:773:1: 'Description'
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getDescriptionKeyword_5_0()); 
            match(input,12,FOLLOW_12_in_rule__RequestedFederationScenario__Group_5__0__Impl1543); 
             after(grammarAccess.getRequestedFederationScenarioAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group_5__0__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group_5__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:786:1: rule__RequestedFederationScenario__Group_5__1 : rule__RequestedFederationScenario__Group_5__1__Impl ;
    public final void rule__RequestedFederationScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:790:1: ( rule__RequestedFederationScenario__Group_5__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:791:2: rule__RequestedFederationScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group_5__1__Impl_in_rule__RequestedFederationScenario__Group_5__11574);
            rule__RequestedFederationScenario__Group_5__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group_5__1"


    // $ANTLR start "rule__RequestedFederationScenario__Group_5__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:797:1: rule__RequestedFederationScenario__Group_5__1__Impl : ( ( rule__RequestedFederationScenario__DescriptionAssignment_5_1 ) ) ;
    public final void rule__RequestedFederationScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:801:1: ( ( ( rule__RequestedFederationScenario__DescriptionAssignment_5_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:802:1: ( ( rule__RequestedFederationScenario__DescriptionAssignment_5_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:802:1: ( ( rule__RequestedFederationScenario__DescriptionAssignment_5_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:803:1: ( rule__RequestedFederationScenario__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getDescriptionAssignment_5_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:804:1: ( rule__RequestedFederationScenario__DescriptionAssignment_5_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:804:2: rule__RequestedFederationScenario__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__DescriptionAssignment_5_1_in_rule__RequestedFederationScenario__Group_5__1__Impl1601);
            rule__RequestedFederationScenario__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group_5__1__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group_6__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:818:1: rule__RequestedFederationScenario__Group_6__0 : rule__RequestedFederationScenario__Group_6__0__Impl rule__RequestedFederationScenario__Group_6__1 ;
    public final void rule__RequestedFederationScenario__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:822:1: ( rule__RequestedFederationScenario__Group_6__0__Impl rule__RequestedFederationScenario__Group_6__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:823:2: rule__RequestedFederationScenario__Group_6__0__Impl rule__RequestedFederationScenario__Group_6__1
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group_6__0__Impl_in_rule__RequestedFederationScenario__Group_6__01635);
            rule__RequestedFederationScenario__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group_6__1_in_rule__RequestedFederationScenario__Group_6__01638);
            rule__RequestedFederationScenario__Group_6__1();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group_6__0"


    // $ANTLR start "rule__RequestedFederationScenario__Group_6__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:830:1: rule__RequestedFederationScenario__Group_6__0__Impl : ( 'Credentials' ) ;
    public final void rule__RequestedFederationScenario__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:834:1: ( ( 'Credentials' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:835:1: ( 'Credentials' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:835:1: ( 'Credentials' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:836:1: 'Credentials'
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getCredentialsKeyword_6_0()); 
            match(input,13,FOLLOW_13_in_rule__RequestedFederationScenario__Group_6__0__Impl1666); 
             after(grammarAccess.getRequestedFederationScenarioAccess().getCredentialsKeyword_6_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group_6__0__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__Group_6__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:849:1: rule__RequestedFederationScenario__Group_6__1 : rule__RequestedFederationScenario__Group_6__1__Impl ;
    public final void rule__RequestedFederationScenario__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:853:1: ( rule__RequestedFederationScenario__Group_6__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:854:2: rule__RequestedFederationScenario__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__Group_6__1__Impl_in_rule__RequestedFederationScenario__Group_6__11697);
            rule__RequestedFederationScenario__Group_6__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__RequestedFederationScenario__Group_6__1"


    // $ANTLR start "rule__RequestedFederationScenario__Group_6__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:860:1: rule__RequestedFederationScenario__Group_6__1__Impl : ( ( rule__RequestedFederationScenario__VTCredentialsAssignment_6_1 ) ) ;
    public final void rule__RequestedFederationScenario__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:864:1: ( ( ( rule__RequestedFederationScenario__VTCredentialsAssignment_6_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:865:1: ( ( rule__RequestedFederationScenario__VTCredentialsAssignment_6_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:865:1: ( ( rule__RequestedFederationScenario__VTCredentialsAssignment_6_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:866:1: ( rule__RequestedFederationScenario__VTCredentialsAssignment_6_1 )
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getVTCredentialsAssignment_6_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:867:1: ( rule__RequestedFederationScenario__VTCredentialsAssignment_6_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:867:2: rule__RequestedFederationScenario__VTCredentialsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__RequestedFederationScenario__VTCredentialsAssignment_6_1_in_rule__RequestedFederationScenario__Group_6__1__Impl1724);
            rule__RequestedFederationScenario__VTCredentialsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getVTCredentialsAssignment_6_1()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__Group_6__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:881:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:885:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:886:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01758);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01761);
            rule__Import__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:893:1: rule__Import__Group__0__Impl : ( 'import office' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:897:1: ( ( 'import office' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:898:1: ( 'import office' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:898:1: ( 'import office' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:899:1: 'import office'
            {
             before(grammarAccess.getImportAccess().getImportOfficeKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Import__Group__0__Impl1789); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:912:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:916:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:917:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11820);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__2_in_rule__Import__Group__11823);
            rule__Import__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:924:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:928:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:929:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:929:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:930:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:931:1: ( rule__Import__ImportURIAssignment_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:931:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1850);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:941:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:945:1: ( rule__Import__Group__2__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:946:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21880);
            rule__Import__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:952:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:956:1: ( ( ';' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:957:1: ( ';' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:957:1: ( ';' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:958:1: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Import__Group__2__Impl1908); 
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
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__ServicesRequest__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:977:1: rule__ServicesRequest__Group__0 : rule__ServicesRequest__Group__0__Impl rule__ServicesRequest__Group__1 ;
    public final void rule__ServicesRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:981:1: ( rule__ServicesRequest__Group__0__Impl rule__ServicesRequest__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:982:2: rule__ServicesRequest__Group__0__Impl rule__ServicesRequest__Group__1
            {
            pushFollow(FOLLOW_rule__ServicesRequest__Group__0__Impl_in_rule__ServicesRequest__Group__01945);
            rule__ServicesRequest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServicesRequest__Group__1_in_rule__ServicesRequest__Group__01948);
            rule__ServicesRequest__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServicesRequest__Group__0"


    // $ANTLR start "rule__ServicesRequest__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:989:1: rule__ServicesRequest__Group__0__Impl : ( () ) ;
    public final void rule__ServicesRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:993:1: ( ( () ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:994:1: ( () )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:994:1: ( () )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:995:1: ()
            {
             before(grammarAccess.getServicesRequestAccess().getServicesRequestAction_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:996:1: ()
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:998:1: 
            {
            }

             after(grammarAccess.getServicesRequestAccess().getServicesRequestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicesRequest__Group__0__Impl"


    // $ANTLR start "rule__ServicesRequest__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1008:1: rule__ServicesRequest__Group__1 : rule__ServicesRequest__Group__1__Impl rule__ServicesRequest__Group__2 ;
    public final void rule__ServicesRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1012:1: ( rule__ServicesRequest__Group__1__Impl rule__ServicesRequest__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1013:2: rule__ServicesRequest__Group__1__Impl rule__ServicesRequest__Group__2
            {
            pushFollow(FOLLOW_rule__ServicesRequest__Group__1__Impl_in_rule__ServicesRequest__Group__12006);
            rule__ServicesRequest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServicesRequest__Group__2_in_rule__ServicesRequest__Group__12009);
            rule__ServicesRequest__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ServicesRequest__Group__1"


    // $ANTLR start "rule__ServicesRequest__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1020:1: rule__ServicesRequest__Group__1__Impl : ( 'RequestServices' ) ;
    public final void rule__ServicesRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1024:1: ( ( 'RequestServices' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1025:1: ( 'RequestServices' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1025:1: ( 'RequestServices' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1026:1: 'RequestServices'
            {
             before(grammarAccess.getServicesRequestAccess().getRequestServicesKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__ServicesRequest__Group__1__Impl2037); 
             after(grammarAccess.getServicesRequestAccess().getRequestServicesKeyword_1()); 

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
    // $ANTLR end "rule__ServicesRequest__Group__1__Impl"


    // $ANTLR start "rule__ServicesRequest__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1039:1: rule__ServicesRequest__Group__2 : rule__ServicesRequest__Group__2__Impl rule__ServicesRequest__Group__3 ;
    public final void rule__ServicesRequest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1043:1: ( rule__ServicesRequest__Group__2__Impl rule__ServicesRequest__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1044:2: rule__ServicesRequest__Group__2__Impl rule__ServicesRequest__Group__3
            {
            pushFollow(FOLLOW_rule__ServicesRequest__Group__2__Impl_in_rule__ServicesRequest__Group__22068);
            rule__ServicesRequest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServicesRequest__Group__3_in_rule__ServicesRequest__Group__22071);
            rule__ServicesRequest__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ServicesRequest__Group__2"


    // $ANTLR start "rule__ServicesRequest__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1051:1: rule__ServicesRequest__Group__2__Impl : ( '{' ) ;
    public final void rule__ServicesRequest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1055:1: ( ( '{' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1056:1: ( '{' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1056:1: ( '{' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1057:1: '{'
            {
             before(grammarAccess.getServicesRequestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__ServicesRequest__Group__2__Impl2099); 
             after(grammarAccess.getServicesRequestAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ServicesRequest__Group__2__Impl"


    // $ANTLR start "rule__ServicesRequest__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1070:1: rule__ServicesRequest__Group__3 : rule__ServicesRequest__Group__3__Impl rule__ServicesRequest__Group__4 ;
    public final void rule__ServicesRequest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1074:1: ( rule__ServicesRequest__Group__3__Impl rule__ServicesRequest__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1075:2: rule__ServicesRequest__Group__3__Impl rule__ServicesRequest__Group__4
            {
            pushFollow(FOLLOW_rule__ServicesRequest__Group__3__Impl_in_rule__ServicesRequest__Group__32130);
            rule__ServicesRequest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServicesRequest__Group__4_in_rule__ServicesRequest__Group__32133);
            rule__ServicesRequest__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ServicesRequest__Group__3"


    // $ANTLR start "rule__ServicesRequest__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1082:1: rule__ServicesRequest__Group__3__Impl : ( ( rule__ServicesRequest__ServiceRequestListAssignment_3 )* ) ;
    public final void rule__ServicesRequest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1086:1: ( ( ( rule__ServicesRequest__ServiceRequestListAssignment_3 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1087:1: ( ( rule__ServicesRequest__ServiceRequestListAssignment_3 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1087:1: ( ( rule__ServicesRequest__ServiceRequestListAssignment_3 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1088:1: ( rule__ServicesRequest__ServiceRequestListAssignment_3 )*
            {
             before(grammarAccess.getServicesRequestAccess().getServiceRequestListAssignment_3()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1089:1: ( rule__ServicesRequest__ServiceRequestListAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1089:2: rule__ServicesRequest__ServiceRequestListAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ServicesRequest__ServiceRequestListAssignment_3_in_rule__ServicesRequest__Group__3__Impl2160);
            	    rule__ServicesRequest__ServiceRequestListAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getServicesRequestAccess().getServiceRequestListAssignment_3()); 

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
    // $ANTLR end "rule__ServicesRequest__Group__3__Impl"


    // $ANTLR start "rule__ServicesRequest__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1099:1: rule__ServicesRequest__Group__4 : rule__ServicesRequest__Group__4__Impl ;
    public final void rule__ServicesRequest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1103:1: ( rule__ServicesRequest__Group__4__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1104:2: rule__ServicesRequest__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ServicesRequest__Group__4__Impl_in_rule__ServicesRequest__Group__42191);
            rule__ServicesRequest__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServicesRequest__Group__4"


    // $ANTLR start "rule__ServicesRequest__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1110:1: rule__ServicesRequest__Group__4__Impl : ( '}' ) ;
    public final void rule__ServicesRequest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1114:1: ( ( '}' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1115:1: ( '}' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1115:1: ( '}' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1116:1: '}'
            {
             before(grammarAccess.getServicesRequestAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__ServicesRequest__Group__4__Impl2219); 
             after(grammarAccess.getServicesRequestAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ServicesRequest__Group__4__Impl"


    // $ANTLR start "rule__ServiceRequest__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1139:1: rule__ServiceRequest__Group__0 : rule__ServiceRequest__Group__0__Impl rule__ServiceRequest__Group__1 ;
    public final void rule__ServiceRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1143:1: ( rule__ServiceRequest__Group__0__Impl rule__ServiceRequest__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1144:2: rule__ServiceRequest__Group__0__Impl rule__ServiceRequest__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__0__Impl_in_rule__ServiceRequest__Group__02260);
            rule__ServiceRequest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group__1_in_rule__ServiceRequest__Group__02263);
            rule__ServiceRequest__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group__0"


    // $ANTLR start "rule__ServiceRequest__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1151:1: rule__ServiceRequest__Group__0__Impl : ( () ) ;
    public final void rule__ServiceRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1155:1: ( ( () ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1156:1: ( () )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1156:1: ( () )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1157:1: ()
            {
             before(grammarAccess.getServiceRequestAccess().getServiceRequestAction_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1158:1: ()
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1160:1: 
            {
            }

             after(grammarAccess.getServiceRequestAccess().getServiceRequestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRequest__Group__0__Impl"


    // $ANTLR start "rule__ServiceRequest__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1170:1: rule__ServiceRequest__Group__1 : rule__ServiceRequest__Group__1__Impl rule__ServiceRequest__Group__2 ;
    public final void rule__ServiceRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1174:1: ( rule__ServiceRequest__Group__1__Impl rule__ServiceRequest__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1175:2: rule__ServiceRequest__Group__1__Impl rule__ServiceRequest__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__1__Impl_in_rule__ServiceRequest__Group__12321);
            rule__ServiceRequest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group__2_in_rule__ServiceRequest__Group__12324);
            rule__ServiceRequest__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group__1"


    // $ANTLR start "rule__ServiceRequest__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1182:1: rule__ServiceRequest__Group__1__Impl : ( 'Service' ) ;
    public final void rule__ServiceRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1186:1: ( ( 'Service' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1187:1: ( 'Service' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1187:1: ( 'Service' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1188:1: 'Service'
            {
             before(grammarAccess.getServiceRequestAccess().getServiceKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ServiceRequest__Group__1__Impl2352); 
             after(grammarAccess.getServiceRequestAccess().getServiceKeyword_1()); 

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
    // $ANTLR end "rule__ServiceRequest__Group__1__Impl"


    // $ANTLR start "rule__ServiceRequest__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1201:1: rule__ServiceRequest__Group__2 : rule__ServiceRequest__Group__2__Impl rule__ServiceRequest__Group__3 ;
    public final void rule__ServiceRequest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1205:1: ( rule__ServiceRequest__Group__2__Impl rule__ServiceRequest__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1206:2: rule__ServiceRequest__Group__2__Impl rule__ServiceRequest__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__2__Impl_in_rule__ServiceRequest__Group__22383);
            rule__ServiceRequest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group__3_in_rule__ServiceRequest__Group__22386);
            rule__ServiceRequest__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group__2"


    // $ANTLR start "rule__ServiceRequest__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1213:1: rule__ServiceRequest__Group__2__Impl : ( ( rule__ServiceRequest__RefServiceAssignment_2 ) ) ;
    public final void rule__ServiceRequest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1217:1: ( ( ( rule__ServiceRequest__RefServiceAssignment_2 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1218:1: ( ( rule__ServiceRequest__RefServiceAssignment_2 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1218:1: ( ( rule__ServiceRequest__RefServiceAssignment_2 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1219:1: ( rule__ServiceRequest__RefServiceAssignment_2 )
            {
             before(grammarAccess.getServiceRequestAccess().getRefServiceAssignment_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1220:1: ( rule__ServiceRequest__RefServiceAssignment_2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1220:2: rule__ServiceRequest__RefServiceAssignment_2
            {
            pushFollow(FOLLOW_rule__ServiceRequest__RefServiceAssignment_2_in_rule__ServiceRequest__Group__2__Impl2413);
            rule__ServiceRequest__RefServiceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceRequestAccess().getRefServiceAssignment_2()); 

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
    // $ANTLR end "rule__ServiceRequest__Group__2__Impl"


    // $ANTLR start "rule__ServiceRequest__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1230:1: rule__ServiceRequest__Group__3 : rule__ServiceRequest__Group__3__Impl rule__ServiceRequest__Group__4 ;
    public final void rule__ServiceRequest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1234:1: ( rule__ServiceRequest__Group__3__Impl rule__ServiceRequest__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1235:2: rule__ServiceRequest__Group__3__Impl rule__ServiceRequest__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__3__Impl_in_rule__ServiceRequest__Group__32443);
            rule__ServiceRequest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group__4_in_rule__ServiceRequest__Group__32446);
            rule__ServiceRequest__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group__3"


    // $ANTLR start "rule__ServiceRequest__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1242:1: rule__ServiceRequest__Group__3__Impl : ( 'as' ) ;
    public final void rule__ServiceRequest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1246:1: ( ( 'as' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1247:1: ( 'as' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1247:1: ( 'as' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1248:1: 'as'
            {
             before(grammarAccess.getServiceRequestAccess().getAsKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__ServiceRequest__Group__3__Impl2474); 
             after(grammarAccess.getServiceRequestAccess().getAsKeyword_3()); 

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
    // $ANTLR end "rule__ServiceRequest__Group__3__Impl"


    // $ANTLR start "rule__ServiceRequest__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1261:1: rule__ServiceRequest__Group__4 : rule__ServiceRequest__Group__4__Impl rule__ServiceRequest__Group__5 ;
    public final void rule__ServiceRequest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1265:1: ( rule__ServiceRequest__Group__4__Impl rule__ServiceRequest__Group__5 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1266:2: rule__ServiceRequest__Group__4__Impl rule__ServiceRequest__Group__5
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__4__Impl_in_rule__ServiceRequest__Group__42505);
            rule__ServiceRequest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group__5_in_rule__ServiceRequest__Group__42508);
            rule__ServiceRequest__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group__4"


    // $ANTLR start "rule__ServiceRequest__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1273:1: rule__ServiceRequest__Group__4__Impl : ( ( rule__ServiceRequest__NameAssignment_4 ) ) ;
    public final void rule__ServiceRequest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1277:1: ( ( ( rule__ServiceRequest__NameAssignment_4 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1278:1: ( ( rule__ServiceRequest__NameAssignment_4 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1278:1: ( ( rule__ServiceRequest__NameAssignment_4 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1279:1: ( rule__ServiceRequest__NameAssignment_4 )
            {
             before(grammarAccess.getServiceRequestAccess().getNameAssignment_4()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1280:1: ( rule__ServiceRequest__NameAssignment_4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1280:2: rule__ServiceRequest__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__ServiceRequest__NameAssignment_4_in_rule__ServiceRequest__Group__4__Impl2535);
            rule__ServiceRequest__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceRequestAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__ServiceRequest__Group__4__Impl"


    // $ANTLR start "rule__ServiceRequest__Group__5"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1290:1: rule__ServiceRequest__Group__5 : rule__ServiceRequest__Group__5__Impl rule__ServiceRequest__Group__6 ;
    public final void rule__ServiceRequest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1294:1: ( rule__ServiceRequest__Group__5__Impl rule__ServiceRequest__Group__6 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1295:2: rule__ServiceRequest__Group__5__Impl rule__ServiceRequest__Group__6
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__5__Impl_in_rule__ServiceRequest__Group__52565);
            rule__ServiceRequest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group__6_in_rule__ServiceRequest__Group__52568);
            rule__ServiceRequest__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group__5"


    // $ANTLR start "rule__ServiceRequest__Group__5__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1302:1: rule__ServiceRequest__Group__5__Impl : ( ( rule__ServiceRequest__Group_5__0 )? ) ;
    public final void rule__ServiceRequest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1306:1: ( ( ( rule__ServiceRequest__Group_5__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1307:1: ( ( rule__ServiceRequest__Group_5__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1307:1: ( ( rule__ServiceRequest__Group_5__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1308:1: ( rule__ServiceRequest__Group_5__0 )?
            {
             before(grammarAccess.getServiceRequestAccess().getGroup_5()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1309:1: ( rule__ServiceRequest__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1309:2: rule__ServiceRequest__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ServiceRequest__Group_5__0_in_rule__ServiceRequest__Group__5__Impl2595);
                    rule__ServiceRequest__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceRequestAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ServiceRequest__Group__5__Impl"


    // $ANTLR start "rule__ServiceRequest__Group__6"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1319:1: rule__ServiceRequest__Group__6 : rule__ServiceRequest__Group__6__Impl rule__ServiceRequest__Group__7 ;
    public final void rule__ServiceRequest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1323:1: ( rule__ServiceRequest__Group__6__Impl rule__ServiceRequest__Group__7 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1324:2: rule__ServiceRequest__Group__6__Impl rule__ServiceRequest__Group__7
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__6__Impl_in_rule__ServiceRequest__Group__62626);
            rule__ServiceRequest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group__7_in_rule__ServiceRequest__Group__62629);
            rule__ServiceRequest__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group__6"


    // $ANTLR start "rule__ServiceRequest__Group__6__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1331:1: rule__ServiceRequest__Group__6__Impl : ( ( rule__ServiceRequest__Group_6__0 )? ) ;
    public final void rule__ServiceRequest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1335:1: ( ( ( rule__ServiceRequest__Group_6__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1336:1: ( ( rule__ServiceRequest__Group_6__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1336:1: ( ( rule__ServiceRequest__Group_6__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1337:1: ( rule__ServiceRequest__Group_6__0 )?
            {
             before(grammarAccess.getServiceRequestAccess().getGroup_6()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1338:1: ( rule__ServiceRequest__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1338:2: rule__ServiceRequest__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__ServiceRequest__Group_6__0_in_rule__ServiceRequest__Group__6__Impl2656);
                    rule__ServiceRequest__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceRequestAccess().getGroup_6()); 

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
    // $ANTLR end "rule__ServiceRequest__Group__6__Impl"


    // $ANTLR start "rule__ServiceRequest__Group__7"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1348:1: rule__ServiceRequest__Group__7 : rule__ServiceRequest__Group__7__Impl ;
    public final void rule__ServiceRequest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1352:1: ( rule__ServiceRequest__Group__7__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1353:2: rule__ServiceRequest__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group__7__Impl_in_rule__ServiceRequest__Group__72687);
            rule__ServiceRequest__Group__7__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group__7"


    // $ANTLR start "rule__ServiceRequest__Group__7__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1359:1: rule__ServiceRequest__Group__7__Impl : ( ( rule__ServiceRequest__Group_7__0 )? ) ;
    public final void rule__ServiceRequest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1363:1: ( ( ( rule__ServiceRequest__Group_7__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1364:1: ( ( rule__ServiceRequest__Group_7__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1364:1: ( ( rule__ServiceRequest__Group_7__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1365:1: ( rule__ServiceRequest__Group_7__0 )?
            {
             before(grammarAccess.getServiceRequestAccess().getGroup_7()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1366:1: ( rule__ServiceRequest__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1366:2: rule__ServiceRequest__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__ServiceRequest__Group_7__0_in_rule__ServiceRequest__Group__7__Impl2714);
                    rule__ServiceRequest__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceRequestAccess().getGroup_7()); 

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
    // $ANTLR end "rule__ServiceRequest__Group__7__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_5__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1392:1: rule__ServiceRequest__Group_5__0 : rule__ServiceRequest__Group_5__0__Impl rule__ServiceRequest__Group_5__1 ;
    public final void rule__ServiceRequest__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1396:1: ( rule__ServiceRequest__Group_5__0__Impl rule__ServiceRequest__Group_5__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1397:2: rule__ServiceRequest__Group_5__0__Impl rule__ServiceRequest__Group_5__1
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_5__0__Impl_in_rule__ServiceRequest__Group_5__02761);
            rule__ServiceRequest__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group_5__1_in_rule__ServiceRequest__Group_5__02764);
            rule__ServiceRequest__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_5__0"


    // $ANTLR start "rule__ServiceRequest__Group_5__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1404:1: rule__ServiceRequest__Group_5__0__Impl : ( '[1..' ) ;
    public final void rule__ServiceRequest__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1408:1: ( ( '[1..' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1409:1: ( '[1..' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1409:1: ( '[1..' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1410:1: '[1..'
            {
             before(grammarAccess.getServiceRequestAccess().getLeftSquareBracketDigitOneFullStopFullStopKeyword_5_0()); 
            match(input,21,FOLLOW_21_in_rule__ServiceRequest__Group_5__0__Impl2792); 
             after(grammarAccess.getServiceRequestAccess().getLeftSquareBracketDigitOneFullStopFullStopKeyword_5_0()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_5__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1423:1: rule__ServiceRequest__Group_5__1 : rule__ServiceRequest__Group_5__1__Impl rule__ServiceRequest__Group_5__2 ;
    public final void rule__ServiceRequest__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1427:1: ( rule__ServiceRequest__Group_5__1__Impl rule__ServiceRequest__Group_5__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1428:2: rule__ServiceRequest__Group_5__1__Impl rule__ServiceRequest__Group_5__2
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_5__1__Impl_in_rule__ServiceRequest__Group_5__12823);
            rule__ServiceRequest__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group_5__2_in_rule__ServiceRequest__Group_5__12826);
            rule__ServiceRequest__Group_5__2();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_5__1"


    // $ANTLR start "rule__ServiceRequest__Group_5__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1435:1: rule__ServiceRequest__Group_5__1__Impl : ( ( rule__ServiceRequest__NumOfServicesAssignment_5_1 ) ) ;
    public final void rule__ServiceRequest__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1439:1: ( ( ( rule__ServiceRequest__NumOfServicesAssignment_5_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1440:1: ( ( rule__ServiceRequest__NumOfServicesAssignment_5_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1440:1: ( ( rule__ServiceRequest__NumOfServicesAssignment_5_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1441:1: ( rule__ServiceRequest__NumOfServicesAssignment_5_1 )
            {
             before(grammarAccess.getServiceRequestAccess().getNumOfServicesAssignment_5_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1442:1: ( rule__ServiceRequest__NumOfServicesAssignment_5_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1442:2: rule__ServiceRequest__NumOfServicesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ServiceRequest__NumOfServicesAssignment_5_1_in_rule__ServiceRequest__Group_5__1__Impl2853);
            rule__ServiceRequest__NumOfServicesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceRequestAccess().getNumOfServicesAssignment_5_1()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_5__1__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_5__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1452:1: rule__ServiceRequest__Group_5__2 : rule__ServiceRequest__Group_5__2__Impl ;
    public final void rule__ServiceRequest__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1456:1: ( rule__ServiceRequest__Group_5__2__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1457:2: rule__ServiceRequest__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_5__2__Impl_in_rule__ServiceRequest__Group_5__22883);
            rule__ServiceRequest__Group_5__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_5__2"


    // $ANTLR start "rule__ServiceRequest__Group_5__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1463:1: rule__ServiceRequest__Group_5__2__Impl : ( ']' ) ;
    public final void rule__ServiceRequest__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1467:1: ( ( ']' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1468:1: ( ']' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1468:1: ( ']' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1469:1: ']'
            {
             before(grammarAccess.getServiceRequestAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,22,FOLLOW_22_in_rule__ServiceRequest__Group_5__2__Impl2911); 
             after(grammarAccess.getServiceRequestAccess().getRightSquareBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_5__2__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_6__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1488:1: rule__ServiceRequest__Group_6__0 : rule__ServiceRequest__Group_6__0__Impl rule__ServiceRequest__Group_6__1 ;
    public final void rule__ServiceRequest__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1492:1: ( rule__ServiceRequest__Group_6__0__Impl rule__ServiceRequest__Group_6__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1493:2: rule__ServiceRequest__Group_6__0__Impl rule__ServiceRequest__Group_6__1
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_6__0__Impl_in_rule__ServiceRequest__Group_6__02948);
            rule__ServiceRequest__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group_6__1_in_rule__ServiceRequest__Group_6__02951);
            rule__ServiceRequest__Group_6__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_6__0"


    // $ANTLR start "rule__ServiceRequest__Group_6__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1500:1: rule__ServiceRequest__Group_6__0__Impl : ( 'offered by' ) ;
    public final void rule__ServiceRequest__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1504:1: ( ( 'offered by' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1505:1: ( 'offered by' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1505:1: ( 'offered by' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1506:1: 'offered by'
            {
             before(grammarAccess.getServiceRequestAccess().getOfferedByKeyword_6_0()); 
            match(input,23,FOLLOW_23_in_rule__ServiceRequest__Group_6__0__Impl2979); 
             after(grammarAccess.getServiceRequestAccess().getOfferedByKeyword_6_0()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_6__0__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_6__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1519:1: rule__ServiceRequest__Group_6__1 : rule__ServiceRequest__Group_6__1__Impl rule__ServiceRequest__Group_6__2 ;
    public final void rule__ServiceRequest__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1523:1: ( rule__ServiceRequest__Group_6__1__Impl rule__ServiceRequest__Group_6__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1524:2: rule__ServiceRequest__Group_6__1__Impl rule__ServiceRequest__Group_6__2
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_6__1__Impl_in_rule__ServiceRequest__Group_6__13010);
            rule__ServiceRequest__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group_6__2_in_rule__ServiceRequest__Group_6__13013);
            rule__ServiceRequest__Group_6__2();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_6__1"


    // $ANTLR start "rule__ServiceRequest__Group_6__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1531:1: rule__ServiceRequest__Group_6__1__Impl : ( ( rule__ServiceRequest__OfferedByProvidersAssignment_6_1 ) ) ;
    public final void rule__ServiceRequest__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1535:1: ( ( ( rule__ServiceRequest__OfferedByProvidersAssignment_6_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1536:1: ( ( rule__ServiceRequest__OfferedByProvidersAssignment_6_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1536:1: ( ( rule__ServiceRequest__OfferedByProvidersAssignment_6_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1537:1: ( rule__ServiceRequest__OfferedByProvidersAssignment_6_1 )
            {
             before(grammarAccess.getServiceRequestAccess().getOfferedByProvidersAssignment_6_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1538:1: ( rule__ServiceRequest__OfferedByProvidersAssignment_6_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1538:2: rule__ServiceRequest__OfferedByProvidersAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ServiceRequest__OfferedByProvidersAssignment_6_1_in_rule__ServiceRequest__Group_6__1__Impl3040);
            rule__ServiceRequest__OfferedByProvidersAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceRequestAccess().getOfferedByProvidersAssignment_6_1()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_6__1__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_6__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1548:1: rule__ServiceRequest__Group_6__2 : rule__ServiceRequest__Group_6__2__Impl ;
    public final void rule__ServiceRequest__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1552:1: ( rule__ServiceRequest__Group_6__2__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1553:2: rule__ServiceRequest__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_6__2__Impl_in_rule__ServiceRequest__Group_6__23070);
            rule__ServiceRequest__Group_6__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_6__2"


    // $ANTLR start "rule__ServiceRequest__Group_6__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1559:1: rule__ServiceRequest__Group_6__2__Impl : ( ( 'optional' )? ) ;
    public final void rule__ServiceRequest__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1563:1: ( ( ( 'optional' )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1564:1: ( ( 'optional' )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1564:1: ( ( 'optional' )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1565:1: ( 'optional' )?
            {
             before(grammarAccess.getServiceRequestAccess().getOptionalKeyword_6_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1566:1: ( 'optional' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1567:2: 'optional'
                    {
                    match(input,24,FOLLOW_24_in_rule__ServiceRequest__Group_6__2__Impl3099); 

                    }
                    break;

            }

             after(grammarAccess.getServiceRequestAccess().getOptionalKeyword_6_2()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_6__2__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_7__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1584:1: rule__ServiceRequest__Group_7__0 : rule__ServiceRequest__Group_7__0__Impl rule__ServiceRequest__Group_7__1 ;
    public final void rule__ServiceRequest__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1588:1: ( rule__ServiceRequest__Group_7__0__Impl rule__ServiceRequest__Group_7__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1589:2: rule__ServiceRequest__Group_7__0__Impl rule__ServiceRequest__Group_7__1
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_7__0__Impl_in_rule__ServiceRequest__Group_7__03138);
            rule__ServiceRequest__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group_7__1_in_rule__ServiceRequest__Group_7__03141);
            rule__ServiceRequest__Group_7__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_7__0"


    // $ANTLR start "rule__ServiceRequest__Group_7__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1596:1: rule__ServiceRequest__Group_7__0__Impl : ( 'settings' ) ;
    public final void rule__ServiceRequest__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1600:1: ( ( 'settings' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1601:1: ( 'settings' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1601:1: ( 'settings' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1602:1: 'settings'
            {
             before(grammarAccess.getServiceRequestAccess().getSettingsKeyword_7_0()); 
            match(input,25,FOLLOW_25_in_rule__ServiceRequest__Group_7__0__Impl3169); 
             after(grammarAccess.getServiceRequestAccess().getSettingsKeyword_7_0()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_7__0__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_7__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1615:1: rule__ServiceRequest__Group_7__1 : rule__ServiceRequest__Group_7__1__Impl rule__ServiceRequest__Group_7__2 ;
    public final void rule__ServiceRequest__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1619:1: ( rule__ServiceRequest__Group_7__1__Impl rule__ServiceRequest__Group_7__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1620:2: rule__ServiceRequest__Group_7__1__Impl rule__ServiceRequest__Group_7__2
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_7__1__Impl_in_rule__ServiceRequest__Group_7__13200);
            rule__ServiceRequest__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group_7__2_in_rule__ServiceRequest__Group_7__13203);
            rule__ServiceRequest__Group_7__2();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_7__1"


    // $ANTLR start "rule__ServiceRequest__Group_7__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1627:1: rule__ServiceRequest__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ServiceRequest__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1631:1: ( ( '{' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1632:1: ( '{' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1632:1: ( '{' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1633:1: '{'
            {
             before(grammarAccess.getServiceRequestAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,17,FOLLOW_17_in_rule__ServiceRequest__Group_7__1__Impl3231); 
             after(grammarAccess.getServiceRequestAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_7__1__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_7__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1646:1: rule__ServiceRequest__Group_7__2 : rule__ServiceRequest__Group_7__2__Impl rule__ServiceRequest__Group_7__3 ;
    public final void rule__ServiceRequest__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1650:1: ( rule__ServiceRequest__Group_7__2__Impl rule__ServiceRequest__Group_7__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1651:2: rule__ServiceRequest__Group_7__2__Impl rule__ServiceRequest__Group_7__3
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_7__2__Impl_in_rule__ServiceRequest__Group_7__23262);
            rule__ServiceRequest__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceRequest__Group_7__3_in_rule__ServiceRequest__Group_7__23265);
            rule__ServiceRequest__Group_7__3();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_7__2"


    // $ANTLR start "rule__ServiceRequest__Group_7__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1658:1: rule__ServiceRequest__Group_7__2__Impl : ( ( rule__ServiceRequest__ReqServiceSettingsAssignment_7_2 )* ) ;
    public final void rule__ServiceRequest__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1662:1: ( ( ( rule__ServiceRequest__ReqServiceSettingsAssignment_7_2 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1663:1: ( ( rule__ServiceRequest__ReqServiceSettingsAssignment_7_2 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1663:1: ( ( rule__ServiceRequest__ReqServiceSettingsAssignment_7_2 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1664:1: ( rule__ServiceRequest__ReqServiceSettingsAssignment_7_2 )*
            {
             before(grammarAccess.getServiceRequestAccess().getReqServiceSettingsAssignment_7_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1665:1: ( rule__ServiceRequest__ReqServiceSettingsAssignment_7_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1665:2: rule__ServiceRequest__ReqServiceSettingsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_rule__ServiceRequest__ReqServiceSettingsAssignment_7_2_in_rule__ServiceRequest__Group_7__2__Impl3292);
            	    rule__ServiceRequest__ReqServiceSettingsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getServiceRequestAccess().getReqServiceSettingsAssignment_7_2()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_7__2__Impl"


    // $ANTLR start "rule__ServiceRequest__Group_7__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1675:1: rule__ServiceRequest__Group_7__3 : rule__ServiceRequest__Group_7__3__Impl ;
    public final void rule__ServiceRequest__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1679:1: ( rule__ServiceRequest__Group_7__3__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1680:2: rule__ServiceRequest__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__ServiceRequest__Group_7__3__Impl_in_rule__ServiceRequest__Group_7__33323);
            rule__ServiceRequest__Group_7__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceRequest__Group_7__3"


    // $ANTLR start "rule__ServiceRequest__Group_7__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1686:1: rule__ServiceRequest__Group_7__3__Impl : ( '}' ) ;
    public final void rule__ServiceRequest__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1690:1: ( ( '}' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1691:1: ( '}' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1691:1: ( '}' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1692:1: '}'
            {
             before(grammarAccess.getServiceRequestAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,18,FOLLOW_18_in_rule__ServiceRequest__Group_7__3__Impl3351); 
             after(grammarAccess.getServiceRequestAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__ServiceRequest__Group_7__3__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1713:1: rule__ScheduledPlan__Group__0 : rule__ScheduledPlan__Group__0__Impl rule__ScheduledPlan__Group__1 ;
    public final void rule__ScheduledPlan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1717:1: ( rule__ScheduledPlan__Group__0__Impl rule__ScheduledPlan__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1718:2: rule__ScheduledPlan__Group__0__Impl rule__ScheduledPlan__Group__1
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group__0__Impl_in_rule__ScheduledPlan__Group__03390);
            rule__ScheduledPlan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScheduledPlan__Group__1_in_rule__ScheduledPlan__Group__03393);
            rule__ScheduledPlan__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group__0"


    // $ANTLR start "rule__ScheduledPlan__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1725:1: rule__ScheduledPlan__Group__0__Impl : ( () ) ;
    public final void rule__ScheduledPlan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1729:1: ( ( () ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1730:1: ( () )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1730:1: ( () )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1731:1: ()
            {
             before(grammarAccess.getScheduledPlanAccess().getScheduledPlanAction_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1732:1: ()
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1734:1: 
            {
            }

             after(grammarAccess.getScheduledPlanAccess().getScheduledPlanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScheduledPlan__Group__0__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1744:1: rule__ScheduledPlan__Group__1 : rule__ScheduledPlan__Group__1__Impl rule__ScheduledPlan__Group__2 ;
    public final void rule__ScheduledPlan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1748:1: ( rule__ScheduledPlan__Group__1__Impl rule__ScheduledPlan__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1749:2: rule__ScheduledPlan__Group__1__Impl rule__ScheduledPlan__Group__2
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group__1__Impl_in_rule__ScheduledPlan__Group__13451);
            rule__ScheduledPlan__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScheduledPlan__Group__2_in_rule__ScheduledPlan__Group__13454);
            rule__ScheduledPlan__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group__1"


    // $ANTLR start "rule__ScheduledPlan__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1756:1: rule__ScheduledPlan__Group__1__Impl : ( 'ScheduledPlan' ) ;
    public final void rule__ScheduledPlan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1760:1: ( ( 'ScheduledPlan' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1761:1: ( 'ScheduledPlan' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1761:1: ( 'ScheduledPlan' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1762:1: 'ScheduledPlan'
            {
             before(grammarAccess.getScheduledPlanAccess().getScheduledPlanKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__ScheduledPlan__Group__1__Impl3482); 
             after(grammarAccess.getScheduledPlanAccess().getScheduledPlanKeyword_1()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group__1__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1775:1: rule__ScheduledPlan__Group__2 : rule__ScheduledPlan__Group__2__Impl rule__ScheduledPlan__Group__3 ;
    public final void rule__ScheduledPlan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1779:1: ( rule__ScheduledPlan__Group__2__Impl rule__ScheduledPlan__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1780:2: rule__ScheduledPlan__Group__2__Impl rule__ScheduledPlan__Group__3
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group__2__Impl_in_rule__ScheduledPlan__Group__23513);
            rule__ScheduledPlan__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScheduledPlan__Group__3_in_rule__ScheduledPlan__Group__23516);
            rule__ScheduledPlan__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group__2"


    // $ANTLR start "rule__ScheduledPlan__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1787:1: rule__ScheduledPlan__Group__2__Impl : ( '{' ) ;
    public final void rule__ScheduledPlan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1791:1: ( ( '{' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1792:1: ( '{' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1792:1: ( '{' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1793:1: '{'
            {
             before(grammarAccess.getScheduledPlanAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__ScheduledPlan__Group__2__Impl3544); 
             after(grammarAccess.getScheduledPlanAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group__2__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1806:1: rule__ScheduledPlan__Group__3 : rule__ScheduledPlan__Group__3__Impl rule__ScheduledPlan__Group__4 ;
    public final void rule__ScheduledPlan__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1810:1: ( rule__ScheduledPlan__Group__3__Impl rule__ScheduledPlan__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1811:2: rule__ScheduledPlan__Group__3__Impl rule__ScheduledPlan__Group__4
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group__3__Impl_in_rule__ScheduledPlan__Group__33575);
            rule__ScheduledPlan__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScheduledPlan__Group__4_in_rule__ScheduledPlan__Group__33578);
            rule__ScheduledPlan__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group__3"


    // $ANTLR start "rule__ScheduledPlan__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1818:1: rule__ScheduledPlan__Group__3__Impl : ( ( rule__ScheduledPlan__Group_3__0 )? ) ;
    public final void rule__ScheduledPlan__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1822:1: ( ( ( rule__ScheduledPlan__Group_3__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1823:1: ( ( rule__ScheduledPlan__Group_3__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1823:1: ( ( rule__ScheduledPlan__Group_3__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1824:1: ( rule__ScheduledPlan__Group_3__0 )?
            {
             before(grammarAccess.getScheduledPlanAccess().getGroup_3()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1825:1: ( rule__ScheduledPlan__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1825:2: rule__ScheduledPlan__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ScheduledPlan__Group_3__0_in_rule__ScheduledPlan__Group__3__Impl3605);
                    rule__ScheduledPlan__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScheduledPlanAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group__3__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1835:1: rule__ScheduledPlan__Group__4 : rule__ScheduledPlan__Group__4__Impl rule__ScheduledPlan__Group__5 ;
    public final void rule__ScheduledPlan__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1839:1: ( rule__ScheduledPlan__Group__4__Impl rule__ScheduledPlan__Group__5 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1840:2: rule__ScheduledPlan__Group__4__Impl rule__ScheduledPlan__Group__5
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group__4__Impl_in_rule__ScheduledPlan__Group__43636);
            rule__ScheduledPlan__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScheduledPlan__Group__5_in_rule__ScheduledPlan__Group__43639);
            rule__ScheduledPlan__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group__4"


    // $ANTLR start "rule__ScheduledPlan__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1847:1: rule__ScheduledPlan__Group__4__Impl : ( ( rule__ScheduledPlan__Group_4__0 )? ) ;
    public final void rule__ScheduledPlan__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1851:1: ( ( ( rule__ScheduledPlan__Group_4__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1852:1: ( ( rule__ScheduledPlan__Group_4__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1852:1: ( ( rule__ScheduledPlan__Group_4__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1853:1: ( rule__ScheduledPlan__Group_4__0 )?
            {
             before(grammarAccess.getScheduledPlanAccess().getGroup_4()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1854:1: ( rule__ScheduledPlan__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1854:2: rule__ScheduledPlan__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ScheduledPlan__Group_4__0_in_rule__ScheduledPlan__Group__4__Impl3666);
                    rule__ScheduledPlan__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScheduledPlanAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group__4__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group__5"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1864:1: rule__ScheduledPlan__Group__5 : rule__ScheduledPlan__Group__5__Impl ;
    public final void rule__ScheduledPlan__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1868:1: ( rule__ScheduledPlan__Group__5__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1869:2: rule__ScheduledPlan__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group__5__Impl_in_rule__ScheduledPlan__Group__53697);
            rule__ScheduledPlan__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group__5"


    // $ANTLR start "rule__ScheduledPlan__Group__5__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1875:1: rule__ScheduledPlan__Group__5__Impl : ( '}' ) ;
    public final void rule__ScheduledPlan__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1879:1: ( ( '}' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1880:1: ( '}' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1880:1: ( '}' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1881:1: '}'
            {
             before(grammarAccess.getScheduledPlanAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__ScheduledPlan__Group__5__Impl3725); 
             after(grammarAccess.getScheduledPlanAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group__5__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group_3__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1906:1: rule__ScheduledPlan__Group_3__0 : rule__ScheduledPlan__Group_3__0__Impl rule__ScheduledPlan__Group_3__1 ;
    public final void rule__ScheduledPlan__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1910:1: ( rule__ScheduledPlan__Group_3__0__Impl rule__ScheduledPlan__Group_3__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1911:2: rule__ScheduledPlan__Group_3__0__Impl rule__ScheduledPlan__Group_3__1
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group_3__0__Impl_in_rule__ScheduledPlan__Group_3__03768);
            rule__ScheduledPlan__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScheduledPlan__Group_3__1_in_rule__ScheduledPlan__Group_3__03771);
            rule__ScheduledPlan__Group_3__1();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group_3__0"


    // $ANTLR start "rule__ScheduledPlan__Group_3__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1918:1: rule__ScheduledPlan__Group_3__0__Impl : ( 'ValidFrom' ) ;
    public final void rule__ScheduledPlan__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1922:1: ( ( 'ValidFrom' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1923:1: ( 'ValidFrom' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1923:1: ( 'ValidFrom' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1924:1: 'ValidFrom'
            {
             before(grammarAccess.getScheduledPlanAccess().getValidFromKeyword_3_0()); 
            match(input,27,FOLLOW_27_in_rule__ScheduledPlan__Group_3__0__Impl3799); 
             after(grammarAccess.getScheduledPlanAccess().getValidFromKeyword_3_0()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group_3__0__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group_3__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1937:1: rule__ScheduledPlan__Group_3__1 : rule__ScheduledPlan__Group_3__1__Impl ;
    public final void rule__ScheduledPlan__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1941:1: ( rule__ScheduledPlan__Group_3__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1942:2: rule__ScheduledPlan__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group_3__1__Impl_in_rule__ScheduledPlan__Group_3__13830);
            rule__ScheduledPlan__Group_3__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group_3__1"


    // $ANTLR start "rule__ScheduledPlan__Group_3__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1948:1: rule__ScheduledPlan__Group_3__1__Impl : ( ( rule__ScheduledPlan__ValidFromAssignment_3_1 ) ) ;
    public final void rule__ScheduledPlan__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1952:1: ( ( ( rule__ScheduledPlan__ValidFromAssignment_3_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1953:1: ( ( rule__ScheduledPlan__ValidFromAssignment_3_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1953:1: ( ( rule__ScheduledPlan__ValidFromAssignment_3_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1954:1: ( rule__ScheduledPlan__ValidFromAssignment_3_1 )
            {
             before(grammarAccess.getScheduledPlanAccess().getValidFromAssignment_3_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1955:1: ( rule__ScheduledPlan__ValidFromAssignment_3_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1955:2: rule__ScheduledPlan__ValidFromAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__ValidFromAssignment_3_1_in_rule__ScheduledPlan__Group_3__1__Impl3857);
            rule__ScheduledPlan__ValidFromAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getScheduledPlanAccess().getValidFromAssignment_3_1()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group_3__1__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group_4__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1969:1: rule__ScheduledPlan__Group_4__0 : rule__ScheduledPlan__Group_4__0__Impl rule__ScheduledPlan__Group_4__1 ;
    public final void rule__ScheduledPlan__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1973:1: ( rule__ScheduledPlan__Group_4__0__Impl rule__ScheduledPlan__Group_4__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1974:2: rule__ScheduledPlan__Group_4__0__Impl rule__ScheduledPlan__Group_4__1
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group_4__0__Impl_in_rule__ScheduledPlan__Group_4__03891);
            rule__ScheduledPlan__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScheduledPlan__Group_4__1_in_rule__ScheduledPlan__Group_4__03894);
            rule__ScheduledPlan__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group_4__0"


    // $ANTLR start "rule__ScheduledPlan__Group_4__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1981:1: rule__ScheduledPlan__Group_4__0__Impl : ( 'ValidUntil' ) ;
    public final void rule__ScheduledPlan__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1985:1: ( ( 'ValidUntil' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1986:1: ( 'ValidUntil' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1986:1: ( 'ValidUntil' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:1987:1: 'ValidUntil'
            {
             before(grammarAccess.getScheduledPlanAccess().getValidUntilKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__ScheduledPlan__Group_4__0__Impl3922); 
             after(grammarAccess.getScheduledPlanAccess().getValidUntilKeyword_4_0()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group_4__0__Impl"


    // $ANTLR start "rule__ScheduledPlan__Group_4__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2000:1: rule__ScheduledPlan__Group_4__1 : rule__ScheduledPlan__Group_4__1__Impl ;
    public final void rule__ScheduledPlan__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2004:1: ( rule__ScheduledPlan__Group_4__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2005:2: rule__ScheduledPlan__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__Group_4__1__Impl_in_rule__ScheduledPlan__Group_4__13953);
            rule__ScheduledPlan__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ScheduledPlan__Group_4__1"


    // $ANTLR start "rule__ScheduledPlan__Group_4__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2011:1: rule__ScheduledPlan__Group_4__1__Impl : ( ( rule__ScheduledPlan__ValidUntilAssignment_4_1 ) ) ;
    public final void rule__ScheduledPlan__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2015:1: ( ( ( rule__ScheduledPlan__ValidUntilAssignment_4_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2016:1: ( ( rule__ScheduledPlan__ValidUntilAssignment_4_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2016:1: ( ( rule__ScheduledPlan__ValidUntilAssignment_4_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2017:1: ( rule__ScheduledPlan__ValidUntilAssignment_4_1 )
            {
             before(grammarAccess.getScheduledPlanAccess().getValidUntilAssignment_4_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2018:1: ( rule__ScheduledPlan__ValidUntilAssignment_4_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2018:2: rule__ScheduledPlan__ValidUntilAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ScheduledPlan__ValidUntilAssignment_4_1_in_rule__ScheduledPlan__Group_4__1__Impl3980);
            rule__ScheduledPlan__ValidUntilAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getScheduledPlanAccess().getValidUntilAssignment_4_1()); 

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
    // $ANTLR end "rule__ScheduledPlan__Group_4__1__Impl"


    // $ANTLR start "rule__Credentials__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2032:1: rule__Credentials__Group__0 : rule__Credentials__Group__0__Impl rule__Credentials__Group__1 ;
    public final void rule__Credentials__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2036:1: ( rule__Credentials__Group__0__Impl rule__Credentials__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2037:2: rule__Credentials__Group__0__Impl rule__Credentials__Group__1
            {
            pushFollow(FOLLOW_rule__Credentials__Group__0__Impl_in_rule__Credentials__Group__04014);
            rule__Credentials__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group__1_in_rule__Credentials__Group__04017);
            rule__Credentials__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__0"


    // $ANTLR start "rule__Credentials__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2044:1: rule__Credentials__Group__0__Impl : ( () ) ;
    public final void rule__Credentials__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2048:1: ( ( () ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2049:1: ( () )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2049:1: ( () )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2050:1: ()
            {
             before(grammarAccess.getCredentialsAccess().getCredentialsAction_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2051:1: ()
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2053:1: 
            {
            }

             after(grammarAccess.getCredentialsAccess().getCredentialsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Credentials__Group__0__Impl"


    // $ANTLR start "rule__Credentials__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2063:1: rule__Credentials__Group__1 : rule__Credentials__Group__1__Impl rule__Credentials__Group__2 ;
    public final void rule__Credentials__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2067:1: ( rule__Credentials__Group__1__Impl rule__Credentials__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2068:2: rule__Credentials__Group__1__Impl rule__Credentials__Group__2
            {
            pushFollow(FOLLOW_rule__Credentials__Group__1__Impl_in_rule__Credentials__Group__14075);
            rule__Credentials__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group__2_in_rule__Credentials__Group__14078);
            rule__Credentials__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__1"


    // $ANTLR start "rule__Credentials__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2075:1: rule__Credentials__Group__1__Impl : ( 'Credentials' ) ;
    public final void rule__Credentials__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2079:1: ( ( 'Credentials' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2080:1: ( 'Credentials' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2080:1: ( 'Credentials' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2081:1: 'Credentials'
            {
             before(grammarAccess.getCredentialsAccess().getCredentialsKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Credentials__Group__1__Impl4106); 
             after(grammarAccess.getCredentialsAccess().getCredentialsKeyword_1()); 

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
    // $ANTLR end "rule__Credentials__Group__1__Impl"


    // $ANTLR start "rule__Credentials__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2094:1: rule__Credentials__Group__2 : rule__Credentials__Group__2__Impl rule__Credentials__Group__3 ;
    public final void rule__Credentials__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2098:1: ( rule__Credentials__Group__2__Impl rule__Credentials__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2099:2: rule__Credentials__Group__2__Impl rule__Credentials__Group__3
            {
            pushFollow(FOLLOW_rule__Credentials__Group__2__Impl_in_rule__Credentials__Group__24137);
            rule__Credentials__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group__3_in_rule__Credentials__Group__24140);
            rule__Credentials__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__2"


    // $ANTLR start "rule__Credentials__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2106:1: rule__Credentials__Group__2__Impl : ( ( rule__Credentials__NameAssignment_2 ) ) ;
    public final void rule__Credentials__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2110:1: ( ( ( rule__Credentials__NameAssignment_2 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2111:1: ( ( rule__Credentials__NameAssignment_2 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2111:1: ( ( rule__Credentials__NameAssignment_2 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2112:1: ( rule__Credentials__NameAssignment_2 )
            {
             before(grammarAccess.getCredentialsAccess().getNameAssignment_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2113:1: ( rule__Credentials__NameAssignment_2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2113:2: rule__Credentials__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Credentials__NameAssignment_2_in_rule__Credentials__Group__2__Impl4167);
            rule__Credentials__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCredentialsAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Credentials__Group__2__Impl"


    // $ANTLR start "rule__Credentials__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2123:1: rule__Credentials__Group__3 : rule__Credentials__Group__3__Impl rule__Credentials__Group__4 ;
    public final void rule__Credentials__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2127:1: ( rule__Credentials__Group__3__Impl rule__Credentials__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2128:2: rule__Credentials__Group__3__Impl rule__Credentials__Group__4
            {
            pushFollow(FOLLOW_rule__Credentials__Group__3__Impl_in_rule__Credentials__Group__34197);
            rule__Credentials__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group__4_in_rule__Credentials__Group__34200);
            rule__Credentials__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__3"


    // $ANTLR start "rule__Credentials__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2135:1: rule__Credentials__Group__3__Impl : ( '{' ) ;
    public final void rule__Credentials__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2139:1: ( ( '{' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2140:1: ( '{' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2140:1: ( '{' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2141:1: '{'
            {
             before(grammarAccess.getCredentialsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Credentials__Group__3__Impl4228); 
             after(grammarAccess.getCredentialsAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Credentials__Group__3__Impl"


    // $ANTLR start "rule__Credentials__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2154:1: rule__Credentials__Group__4 : rule__Credentials__Group__4__Impl rule__Credentials__Group__5 ;
    public final void rule__Credentials__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2158:1: ( rule__Credentials__Group__4__Impl rule__Credentials__Group__5 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2159:2: rule__Credentials__Group__4__Impl rule__Credentials__Group__5
            {
            pushFollow(FOLLOW_rule__Credentials__Group__4__Impl_in_rule__Credentials__Group__44259);
            rule__Credentials__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group__5_in_rule__Credentials__Group__44262);
            rule__Credentials__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__4"


    // $ANTLR start "rule__Credentials__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2166:1: rule__Credentials__Group__4__Impl : ( ( rule__Credentials__Group_4__0 )? ) ;
    public final void rule__Credentials__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2170:1: ( ( ( rule__Credentials__Group_4__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2171:1: ( ( rule__Credentials__Group_4__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2171:1: ( ( rule__Credentials__Group_4__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2172:1: ( rule__Credentials__Group_4__0 )?
            {
             before(grammarAccess.getCredentialsAccess().getGroup_4()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2173:1: ( rule__Credentials__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2173:2: rule__Credentials__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Credentials__Group_4__0_in_rule__Credentials__Group__4__Impl4289);
                    rule__Credentials__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCredentialsAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Credentials__Group__4__Impl"


    // $ANTLR start "rule__Credentials__Group__5"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2183:1: rule__Credentials__Group__5 : rule__Credentials__Group__5__Impl rule__Credentials__Group__6 ;
    public final void rule__Credentials__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2187:1: ( rule__Credentials__Group__5__Impl rule__Credentials__Group__6 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2188:2: rule__Credentials__Group__5__Impl rule__Credentials__Group__6
            {
            pushFollow(FOLLOW_rule__Credentials__Group__5__Impl_in_rule__Credentials__Group__54320);
            rule__Credentials__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group__6_in_rule__Credentials__Group__54323);
            rule__Credentials__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__5"


    // $ANTLR start "rule__Credentials__Group__5__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2195:1: rule__Credentials__Group__5__Impl : ( ( rule__Credentials__Group_5__0 )? ) ;
    public final void rule__Credentials__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2199:1: ( ( ( rule__Credentials__Group_5__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2200:1: ( ( rule__Credentials__Group_5__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2200:1: ( ( rule__Credentials__Group_5__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2201:1: ( rule__Credentials__Group_5__0 )?
            {
             before(grammarAccess.getCredentialsAccess().getGroup_5()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2202:1: ( rule__Credentials__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2202:2: rule__Credentials__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Credentials__Group_5__0_in_rule__Credentials__Group__5__Impl4350);
                    rule__Credentials__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCredentialsAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Credentials__Group__5__Impl"


    // $ANTLR start "rule__Credentials__Group__6"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2212:1: rule__Credentials__Group__6 : rule__Credentials__Group__6__Impl rule__Credentials__Group__7 ;
    public final void rule__Credentials__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2216:1: ( rule__Credentials__Group__6__Impl rule__Credentials__Group__7 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2217:2: rule__Credentials__Group__6__Impl rule__Credentials__Group__7
            {
            pushFollow(FOLLOW_rule__Credentials__Group__6__Impl_in_rule__Credentials__Group__64381);
            rule__Credentials__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group__7_in_rule__Credentials__Group__64384);
            rule__Credentials__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__6"


    // $ANTLR start "rule__Credentials__Group__6__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2224:1: rule__Credentials__Group__6__Impl : ( ( rule__Credentials__Group_6__0 )? ) ;
    public final void rule__Credentials__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2228:1: ( ( ( rule__Credentials__Group_6__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2229:1: ( ( rule__Credentials__Group_6__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2229:1: ( ( rule__Credentials__Group_6__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2230:1: ( rule__Credentials__Group_6__0 )?
            {
             before(grammarAccess.getCredentialsAccess().getGroup_6()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2231:1: ( rule__Credentials__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2231:2: rule__Credentials__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Credentials__Group_6__0_in_rule__Credentials__Group__6__Impl4411);
                    rule__Credentials__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCredentialsAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Credentials__Group__6__Impl"


    // $ANTLR start "rule__Credentials__Group__7"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2241:1: rule__Credentials__Group__7 : rule__Credentials__Group__7__Impl rule__Credentials__Group__8 ;
    public final void rule__Credentials__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2245:1: ( rule__Credentials__Group__7__Impl rule__Credentials__Group__8 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2246:2: rule__Credentials__Group__7__Impl rule__Credentials__Group__8
            {
            pushFollow(FOLLOW_rule__Credentials__Group__7__Impl_in_rule__Credentials__Group__74442);
            rule__Credentials__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group__8_in_rule__Credentials__Group__74445);
            rule__Credentials__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__7"


    // $ANTLR start "rule__Credentials__Group__7__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2253:1: rule__Credentials__Group__7__Impl : ( ( rule__Credentials__Group_7__0 )? ) ;
    public final void rule__Credentials__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2257:1: ( ( ( rule__Credentials__Group_7__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2258:1: ( ( rule__Credentials__Group_7__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2258:1: ( ( rule__Credentials__Group_7__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2259:1: ( rule__Credentials__Group_7__0 )?
            {
             before(grammarAccess.getCredentialsAccess().getGroup_7()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2260:1: ( rule__Credentials__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2260:2: rule__Credentials__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Credentials__Group_7__0_in_rule__Credentials__Group__7__Impl4472);
                    rule__Credentials__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCredentialsAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Credentials__Group__7__Impl"


    // $ANTLR start "rule__Credentials__Group__8"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2270:1: rule__Credentials__Group__8 : rule__Credentials__Group__8__Impl ;
    public final void rule__Credentials__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2274:1: ( rule__Credentials__Group__8__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2275:2: rule__Credentials__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Credentials__Group__8__Impl_in_rule__Credentials__Group__84503);
            rule__Credentials__Group__8__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group__8"


    // $ANTLR start "rule__Credentials__Group__8__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2281:1: rule__Credentials__Group__8__Impl : ( '}' ) ;
    public final void rule__Credentials__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2285:1: ( ( '}' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2286:1: ( '}' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2286:1: ( '}' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2287:1: '}'
            {
             before(grammarAccess.getCredentialsAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_18_in_rule__Credentials__Group__8__Impl4531); 
             after(grammarAccess.getCredentialsAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Credentials__Group__8__Impl"


    // $ANTLR start "rule__Credentials__Group_4__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2318:1: rule__Credentials__Group_4__0 : rule__Credentials__Group_4__0__Impl rule__Credentials__Group_4__1 ;
    public final void rule__Credentials__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2322:1: ( rule__Credentials__Group_4__0__Impl rule__Credentials__Group_4__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2323:2: rule__Credentials__Group_4__0__Impl rule__Credentials__Group_4__1
            {
            pushFollow(FOLLOW_rule__Credentials__Group_4__0__Impl_in_rule__Credentials__Group_4__04580);
            rule__Credentials__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group_4__1_in_rule__Credentials__Group_4__04583);
            rule__Credentials__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group_4__0"


    // $ANTLR start "rule__Credentials__Group_4__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2330:1: rule__Credentials__Group_4__0__Impl : ( 'id' ) ;
    public final void rule__Credentials__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2334:1: ( ( 'id' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2335:1: ( 'id' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2335:1: ( 'id' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2336:1: 'id'
            {
             before(grammarAccess.getCredentialsAccess().getIdKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__Credentials__Group_4__0__Impl4611); 
             after(grammarAccess.getCredentialsAccess().getIdKeyword_4_0()); 

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
    // $ANTLR end "rule__Credentials__Group_4__0__Impl"


    // $ANTLR start "rule__Credentials__Group_4__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2349:1: rule__Credentials__Group_4__1 : rule__Credentials__Group_4__1__Impl ;
    public final void rule__Credentials__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2353:1: ( rule__Credentials__Group_4__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2354:2: rule__Credentials__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Credentials__Group_4__1__Impl_in_rule__Credentials__Group_4__14642);
            rule__Credentials__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group_4__1"


    // $ANTLR start "rule__Credentials__Group_4__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2360:1: rule__Credentials__Group_4__1__Impl : ( ( rule__Credentials__IdAssignment_4_1 ) ) ;
    public final void rule__Credentials__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2364:1: ( ( ( rule__Credentials__IdAssignment_4_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2365:1: ( ( rule__Credentials__IdAssignment_4_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2365:1: ( ( rule__Credentials__IdAssignment_4_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2366:1: ( rule__Credentials__IdAssignment_4_1 )
            {
             before(grammarAccess.getCredentialsAccess().getIdAssignment_4_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2367:1: ( rule__Credentials__IdAssignment_4_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2367:2: rule__Credentials__IdAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Credentials__IdAssignment_4_1_in_rule__Credentials__Group_4__1__Impl4669);
            rule__Credentials__IdAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCredentialsAccess().getIdAssignment_4_1()); 

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
    // $ANTLR end "rule__Credentials__Group_4__1__Impl"


    // $ANTLR start "rule__Credentials__Group_5__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2381:1: rule__Credentials__Group_5__0 : rule__Credentials__Group_5__0__Impl rule__Credentials__Group_5__1 ;
    public final void rule__Credentials__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2385:1: ( rule__Credentials__Group_5__0__Impl rule__Credentials__Group_5__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2386:2: rule__Credentials__Group_5__0__Impl rule__Credentials__Group_5__1
            {
            pushFollow(FOLLOW_rule__Credentials__Group_5__0__Impl_in_rule__Credentials__Group_5__04703);
            rule__Credentials__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group_5__1_in_rule__Credentials__Group_5__04706);
            rule__Credentials__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group_5__0"


    // $ANTLR start "rule__Credentials__Group_5__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2393:1: rule__Credentials__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Credentials__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2397:1: ( ( 'description' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2398:1: ( 'description' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2398:1: ( 'description' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2399:1: 'description'
            {
             before(grammarAccess.getCredentialsAccess().getDescriptionKeyword_5_0()); 
            match(input,30,FOLLOW_30_in_rule__Credentials__Group_5__0__Impl4734); 
             after(grammarAccess.getCredentialsAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__Credentials__Group_5__0__Impl"


    // $ANTLR start "rule__Credentials__Group_5__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2412:1: rule__Credentials__Group_5__1 : rule__Credentials__Group_5__1__Impl ;
    public final void rule__Credentials__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2416:1: ( rule__Credentials__Group_5__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2417:2: rule__Credentials__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Credentials__Group_5__1__Impl_in_rule__Credentials__Group_5__14765);
            rule__Credentials__Group_5__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group_5__1"


    // $ANTLR start "rule__Credentials__Group_5__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2423:1: rule__Credentials__Group_5__1__Impl : ( ( rule__Credentials__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Credentials__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2427:1: ( ( ( rule__Credentials__DescriptionAssignment_5_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2428:1: ( ( rule__Credentials__DescriptionAssignment_5_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2428:1: ( ( rule__Credentials__DescriptionAssignment_5_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2429:1: ( rule__Credentials__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getCredentialsAccess().getDescriptionAssignment_5_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2430:1: ( rule__Credentials__DescriptionAssignment_5_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2430:2: rule__Credentials__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Credentials__DescriptionAssignment_5_1_in_rule__Credentials__Group_5__1__Impl4792);
            rule__Credentials__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCredentialsAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__Credentials__Group_5__1__Impl"


    // $ANTLR start "rule__Credentials__Group_6__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2444:1: rule__Credentials__Group_6__0 : rule__Credentials__Group_6__0__Impl rule__Credentials__Group_6__1 ;
    public final void rule__Credentials__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2448:1: ( rule__Credentials__Group_6__0__Impl rule__Credentials__Group_6__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2449:2: rule__Credentials__Group_6__0__Impl rule__Credentials__Group_6__1
            {
            pushFollow(FOLLOW_rule__Credentials__Group_6__0__Impl_in_rule__Credentials__Group_6__04826);
            rule__Credentials__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group_6__1_in_rule__Credentials__Group_6__04829);
            rule__Credentials__Group_6__1();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group_6__0"


    // $ANTLR start "rule__Credentials__Group_6__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2456:1: rule__Credentials__Group_6__0__Impl : ( 'UserName' ) ;
    public final void rule__Credentials__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2460:1: ( ( 'UserName' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2461:1: ( 'UserName' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2461:1: ( 'UserName' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2462:1: 'UserName'
            {
             before(grammarAccess.getCredentialsAccess().getUserNameKeyword_6_0()); 
            match(input,31,FOLLOW_31_in_rule__Credentials__Group_6__0__Impl4857); 
             after(grammarAccess.getCredentialsAccess().getUserNameKeyword_6_0()); 

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
    // $ANTLR end "rule__Credentials__Group_6__0__Impl"


    // $ANTLR start "rule__Credentials__Group_6__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2475:1: rule__Credentials__Group_6__1 : rule__Credentials__Group_6__1__Impl ;
    public final void rule__Credentials__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2479:1: ( rule__Credentials__Group_6__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2480:2: rule__Credentials__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Credentials__Group_6__1__Impl_in_rule__Credentials__Group_6__14888);
            rule__Credentials__Group_6__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group_6__1"


    // $ANTLR start "rule__Credentials__Group_6__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2486:1: rule__Credentials__Group_6__1__Impl : ( ( rule__Credentials__UsernameAssignment_6_1 ) ) ;
    public final void rule__Credentials__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2490:1: ( ( ( rule__Credentials__UsernameAssignment_6_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2491:1: ( ( rule__Credentials__UsernameAssignment_6_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2491:1: ( ( rule__Credentials__UsernameAssignment_6_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2492:1: ( rule__Credentials__UsernameAssignment_6_1 )
            {
             before(grammarAccess.getCredentialsAccess().getUsernameAssignment_6_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2493:1: ( rule__Credentials__UsernameAssignment_6_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2493:2: rule__Credentials__UsernameAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Credentials__UsernameAssignment_6_1_in_rule__Credentials__Group_6__1__Impl4915);
            rule__Credentials__UsernameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCredentialsAccess().getUsernameAssignment_6_1()); 

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
    // $ANTLR end "rule__Credentials__Group_6__1__Impl"


    // $ANTLR start "rule__Credentials__Group_7__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2507:1: rule__Credentials__Group_7__0 : rule__Credentials__Group_7__0__Impl rule__Credentials__Group_7__1 ;
    public final void rule__Credentials__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2511:1: ( rule__Credentials__Group_7__0__Impl rule__Credentials__Group_7__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2512:2: rule__Credentials__Group_7__0__Impl rule__Credentials__Group_7__1
            {
            pushFollow(FOLLOW_rule__Credentials__Group_7__0__Impl_in_rule__Credentials__Group_7__04949);
            rule__Credentials__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Credentials__Group_7__1_in_rule__Credentials__Group_7__04952);
            rule__Credentials__Group_7__1();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group_7__0"


    // $ANTLR start "rule__Credentials__Group_7__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2519:1: rule__Credentials__Group_7__0__Impl : ( 'PassWord' ) ;
    public final void rule__Credentials__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2523:1: ( ( 'PassWord' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2524:1: ( 'PassWord' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2524:1: ( 'PassWord' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2525:1: 'PassWord'
            {
             before(grammarAccess.getCredentialsAccess().getPassWordKeyword_7_0()); 
            match(input,32,FOLLOW_32_in_rule__Credentials__Group_7__0__Impl4980); 
             after(grammarAccess.getCredentialsAccess().getPassWordKeyword_7_0()); 

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
    // $ANTLR end "rule__Credentials__Group_7__0__Impl"


    // $ANTLR start "rule__Credentials__Group_7__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2538:1: rule__Credentials__Group_7__1 : rule__Credentials__Group_7__1__Impl ;
    public final void rule__Credentials__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2542:1: ( rule__Credentials__Group_7__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2543:2: rule__Credentials__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Credentials__Group_7__1__Impl_in_rule__Credentials__Group_7__15011);
            rule__Credentials__Group_7__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Credentials__Group_7__1"


    // $ANTLR start "rule__Credentials__Group_7__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2549:1: rule__Credentials__Group_7__1__Impl : ( ( rule__Credentials__PasswordAssignment_7_1 ) ) ;
    public final void rule__Credentials__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2553:1: ( ( ( rule__Credentials__PasswordAssignment_7_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2554:1: ( ( rule__Credentials__PasswordAssignment_7_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2554:1: ( ( rule__Credentials__PasswordAssignment_7_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2555:1: ( rule__Credentials__PasswordAssignment_7_1 )
            {
             before(grammarAccess.getCredentialsAccess().getPasswordAssignment_7_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2556:1: ( rule__Credentials__PasswordAssignment_7_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2556:2: rule__Credentials__PasswordAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Credentials__PasswordAssignment_7_1_in_rule__Credentials__Group_7__1__Impl5038);
            rule__Credentials__PasswordAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCredentialsAccess().getPasswordAssignment_7_1()); 

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
    // $ANTLR end "rule__Credentials__Group_7__1__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2570:1: rule__ServiceSettingInstance__Group__0 : rule__ServiceSettingInstance__Group__0__Impl rule__ServiceSettingInstance__Group__1 ;
    public final void rule__ServiceSettingInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2574:1: ( rule__ServiceSettingInstance__Group__0__Impl rule__ServiceSettingInstance__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2575:2: rule__ServiceSettingInstance__Group__0__Impl rule__ServiceSettingInstance__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__0__Impl_in_rule__ServiceSettingInstance__Group__05072);
            rule__ServiceSettingInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__1_in_rule__ServiceSettingInstance__Group__05075);
            rule__ServiceSettingInstance__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group__0"


    // $ANTLR start "rule__ServiceSettingInstance__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2582:1: rule__ServiceSettingInstance__Group__0__Impl : ( 'Setting' ) ;
    public final void rule__ServiceSettingInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2586:1: ( ( 'Setting' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2587:1: ( 'Setting' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2587:1: ( 'Setting' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2588:1: 'Setting'
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getSettingKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ServiceSettingInstance__Group__0__Impl5103); 
             after(grammarAccess.getServiceSettingInstanceAccess().getSettingKeyword_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group__0__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2601:1: rule__ServiceSettingInstance__Group__1 : rule__ServiceSettingInstance__Group__1__Impl rule__ServiceSettingInstance__Group__2 ;
    public final void rule__ServiceSettingInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2605:1: ( rule__ServiceSettingInstance__Group__1__Impl rule__ServiceSettingInstance__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2606:2: rule__ServiceSettingInstance__Group__1__Impl rule__ServiceSettingInstance__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__1__Impl_in_rule__ServiceSettingInstance__Group__15134);
            rule__ServiceSettingInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__2_in_rule__ServiceSettingInstance__Group__15137);
            rule__ServiceSettingInstance__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group__1"


    // $ANTLR start "rule__ServiceSettingInstance__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2613:1: rule__ServiceSettingInstance__Group__1__Impl : ( ( rule__ServiceSettingInstance__RefServiceSettingAssignment_1 ) ) ;
    public final void rule__ServiceSettingInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2617:1: ( ( ( rule__ServiceSettingInstance__RefServiceSettingAssignment_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2618:1: ( ( rule__ServiceSettingInstance__RefServiceSettingAssignment_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2618:1: ( ( rule__ServiceSettingInstance__RefServiceSettingAssignment_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2619:1: ( rule__ServiceSettingInstance__RefServiceSettingAssignment_1 )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getRefServiceSettingAssignment_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2620:1: ( rule__ServiceSettingInstance__RefServiceSettingAssignment_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2620:2: rule__ServiceSettingInstance__RefServiceSettingAssignment_1
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__RefServiceSettingAssignment_1_in_rule__ServiceSettingInstance__Group__1__Impl5164);
            rule__ServiceSettingInstance__RefServiceSettingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceSettingInstanceAccess().getRefServiceSettingAssignment_1()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group__1__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2630:1: rule__ServiceSettingInstance__Group__2 : rule__ServiceSettingInstance__Group__2__Impl rule__ServiceSettingInstance__Group__3 ;
    public final void rule__ServiceSettingInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2634:1: ( rule__ServiceSettingInstance__Group__2__Impl rule__ServiceSettingInstance__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2635:2: rule__ServiceSettingInstance__Group__2__Impl rule__ServiceSettingInstance__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__2__Impl_in_rule__ServiceSettingInstance__Group__25194);
            rule__ServiceSettingInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__3_in_rule__ServiceSettingInstance__Group__25197);
            rule__ServiceSettingInstance__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group__2"


    // $ANTLR start "rule__ServiceSettingInstance__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2642:1: rule__ServiceSettingInstance__Group__2__Impl : ( ':' ) ;
    public final void rule__ServiceSettingInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2646:1: ( ( ':' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2647:1: ( ':' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2647:1: ( ':' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2648:1: ':'
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__ServiceSettingInstance__Group__2__Impl5225); 
             after(grammarAccess.getServiceSettingInstanceAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group__2__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2661:1: rule__ServiceSettingInstance__Group__3 : rule__ServiceSettingInstance__Group__3__Impl rule__ServiceSettingInstance__Group__4 ;
    public final void rule__ServiceSettingInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2665:1: ( rule__ServiceSettingInstance__Group__3__Impl rule__ServiceSettingInstance__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2666:2: rule__ServiceSettingInstance__Group__3__Impl rule__ServiceSettingInstance__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__3__Impl_in_rule__ServiceSettingInstance__Group__35256);
            rule__ServiceSettingInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__4_in_rule__ServiceSettingInstance__Group__35259);
            rule__ServiceSettingInstance__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group__3"


    // $ANTLR start "rule__ServiceSettingInstance__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2673:1: rule__ServiceSettingInstance__Group__3__Impl : ( ( rule__ServiceSettingInstance__NameAssignment_3 ) ) ;
    public final void rule__ServiceSettingInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2677:1: ( ( ( rule__ServiceSettingInstance__NameAssignment_3 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2678:1: ( ( rule__ServiceSettingInstance__NameAssignment_3 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2678:1: ( ( rule__ServiceSettingInstance__NameAssignment_3 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2679:1: ( rule__ServiceSettingInstance__NameAssignment_3 )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getNameAssignment_3()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2680:1: ( rule__ServiceSettingInstance__NameAssignment_3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2680:2: rule__ServiceSettingInstance__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__NameAssignment_3_in_rule__ServiceSettingInstance__Group__3__Impl5286);
            rule__ServiceSettingInstance__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceSettingInstanceAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group__3__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2690:1: rule__ServiceSettingInstance__Group__4 : rule__ServiceSettingInstance__Group__4__Impl rule__ServiceSettingInstance__Group__5 ;
    public final void rule__ServiceSettingInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2694:1: ( rule__ServiceSettingInstance__Group__4__Impl rule__ServiceSettingInstance__Group__5 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2695:2: rule__ServiceSettingInstance__Group__4__Impl rule__ServiceSettingInstance__Group__5
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__4__Impl_in_rule__ServiceSettingInstance__Group__45316);
            rule__ServiceSettingInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__5_in_rule__ServiceSettingInstance__Group__45319);
            rule__ServiceSettingInstance__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group__4"


    // $ANTLR start "rule__ServiceSettingInstance__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2702:1: rule__ServiceSettingInstance__Group__4__Impl : ( ( rule__ServiceSettingInstance__Group_4__0 )? ) ;
    public final void rule__ServiceSettingInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2706:1: ( ( ( rule__ServiceSettingInstance__Group_4__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2707:1: ( ( rule__ServiceSettingInstance__Group_4__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2707:1: ( ( rule__ServiceSettingInstance__Group_4__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2708:1: ( rule__ServiceSettingInstance__Group_4__0 )?
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getGroup_4()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2709:1: ( rule__ServiceSettingInstance__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2709:2: rule__ServiceSettingInstance__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_4__0_in_rule__ServiceSettingInstance__Group__4__Impl5346);
                    rule__ServiceSettingInstance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingInstanceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group__4__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group__5"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2719:1: rule__ServiceSettingInstance__Group__5 : rule__ServiceSettingInstance__Group__5__Impl ;
    public final void rule__ServiceSettingInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2723:1: ( rule__ServiceSettingInstance__Group__5__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2724:2: rule__ServiceSettingInstance__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group__5__Impl_in_rule__ServiceSettingInstance__Group__55377);
            rule__ServiceSettingInstance__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group__5"


    // $ANTLR start "rule__ServiceSettingInstance__Group__5__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2730:1: rule__ServiceSettingInstance__Group__5__Impl : ( ( rule__ServiceSettingInstance__Group_5__0 )? ) ;
    public final void rule__ServiceSettingInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2734:1: ( ( ( rule__ServiceSettingInstance__Group_5__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2735:1: ( ( rule__ServiceSettingInstance__Group_5__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2735:1: ( ( rule__ServiceSettingInstance__Group_5__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2736:1: ( rule__ServiceSettingInstance__Group_5__0 )?
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getGroup_5()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2737:1: ( rule__ServiceSettingInstance__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2737:2: rule__ServiceSettingInstance__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5__0_in_rule__ServiceSettingInstance__Group__5__Impl5404);
                    rule__ServiceSettingInstance__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceSettingInstanceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group__5__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group_4__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2759:1: rule__ServiceSettingInstance__Group_4__0 : rule__ServiceSettingInstance__Group_4__0__Impl rule__ServiceSettingInstance__Group_4__1 ;
    public final void rule__ServiceSettingInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2763:1: ( rule__ServiceSettingInstance__Group_4__0__Impl rule__ServiceSettingInstance__Group_4__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2764:2: rule__ServiceSettingInstance__Group_4__0__Impl rule__ServiceSettingInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_4__0__Impl_in_rule__ServiceSettingInstance__Group_4__05447);
            rule__ServiceSettingInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_4__1_in_rule__ServiceSettingInstance__Group_4__05450);
            rule__ServiceSettingInstance__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group_4__0"


    // $ANTLR start "rule__ServiceSettingInstance__Group_4__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2771:1: rule__ServiceSettingInstance__Group_4__0__Impl : ( '=' ) ;
    public final void rule__ServiceSettingInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2775:1: ( ( '=' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2776:1: ( '=' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2776:1: ( '=' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2777:1: '='
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getEqualsSignKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__ServiceSettingInstance__Group_4__0__Impl5478); 
             after(grammarAccess.getServiceSettingInstanceAccess().getEqualsSignKeyword_4_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group_4__0__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group_4__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2790:1: rule__ServiceSettingInstance__Group_4__1 : rule__ServiceSettingInstance__Group_4__1__Impl ;
    public final void rule__ServiceSettingInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2794:1: ( rule__ServiceSettingInstance__Group_4__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2795:2: rule__ServiceSettingInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_4__1__Impl_in_rule__ServiceSettingInstance__Group_4__15509);
            rule__ServiceSettingInstance__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group_4__1"


    // $ANTLR start "rule__ServiceSettingInstance__Group_4__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2801:1: rule__ServiceSettingInstance__Group_4__1__Impl : ( ( rule__ServiceSettingInstance__StaticValueAssignment_4_1 ) ) ;
    public final void rule__ServiceSettingInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2805:1: ( ( ( rule__ServiceSettingInstance__StaticValueAssignment_4_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2806:1: ( ( rule__ServiceSettingInstance__StaticValueAssignment_4_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2806:1: ( ( rule__ServiceSettingInstance__StaticValueAssignment_4_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2807:1: ( rule__ServiceSettingInstance__StaticValueAssignment_4_1 )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getStaticValueAssignment_4_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2808:1: ( rule__ServiceSettingInstance__StaticValueAssignment_4_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2808:2: rule__ServiceSettingInstance__StaticValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__StaticValueAssignment_4_1_in_rule__ServiceSettingInstance__Group_4__1__Impl5536);
            rule__ServiceSettingInstance__StaticValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceSettingInstanceAccess().getStaticValueAssignment_4_1()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group_4__1__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2822:1: rule__ServiceSettingInstance__Group_5__0 : rule__ServiceSettingInstance__Group_5__0__Impl rule__ServiceSettingInstance__Group_5__1 ;
    public final void rule__ServiceSettingInstance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2826:1: ( rule__ServiceSettingInstance__Group_5__0__Impl rule__ServiceSettingInstance__Group_5__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2827:2: rule__ServiceSettingInstance__Group_5__0__Impl rule__ServiceSettingInstance__Group_5__1
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5__0__Impl_in_rule__ServiceSettingInstance__Group_5__05570);
            rule__ServiceSettingInstance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5__1_in_rule__ServiceSettingInstance__Group_5__05573);
            rule__ServiceSettingInstance__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5__0"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2834:1: rule__ServiceSettingInstance__Group_5__0__Impl : ( 'assign' ) ;
    public final void rule__ServiceSettingInstance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2838:1: ( ( 'assign' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2839:1: ( 'assign' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2839:1: ( 'assign' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2840:1: 'assign'
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getAssignKeyword_5_0()); 
            match(input,36,FOLLOW_36_in_rule__ServiceSettingInstance__Group_5__0__Impl5601); 
             after(grammarAccess.getServiceSettingInstanceAccess().getAssignKeyword_5_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5__0__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2853:1: rule__ServiceSettingInstance__Group_5__1 : rule__ServiceSettingInstance__Group_5__1__Impl rule__ServiceSettingInstance__Group_5__2 ;
    public final void rule__ServiceSettingInstance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2857:1: ( rule__ServiceSettingInstance__Group_5__1__Impl rule__ServiceSettingInstance__Group_5__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2858:2: rule__ServiceSettingInstance__Group_5__1__Impl rule__ServiceSettingInstance__Group_5__2
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5__1__Impl_in_rule__ServiceSettingInstance__Group_5__15632);
            rule__ServiceSettingInstance__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5__2_in_rule__ServiceSettingInstance__Group_5__15635);
            rule__ServiceSettingInstance__Group_5__2();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5__1"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2865:1: rule__ServiceSettingInstance__Group_5__1__Impl : ( ( rule__ServiceSettingInstance__AssignSettingAssignment_5_1 ) ) ;
    public final void rule__ServiceSettingInstance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2869:1: ( ( ( rule__ServiceSettingInstance__AssignSettingAssignment_5_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2870:1: ( ( rule__ServiceSettingInstance__AssignSettingAssignment_5_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2870:1: ( ( rule__ServiceSettingInstance__AssignSettingAssignment_5_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2871:1: ( rule__ServiceSettingInstance__AssignSettingAssignment_5_1 )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingAssignment_5_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2872:1: ( rule__ServiceSettingInstance__AssignSettingAssignment_5_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2872:2: rule__ServiceSettingInstance__AssignSettingAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__AssignSettingAssignment_5_1_in_rule__ServiceSettingInstance__Group_5__1__Impl5662);
            rule__ServiceSettingInstance__AssignSettingAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingAssignment_5_1()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5__1__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2882:1: rule__ServiceSettingInstance__Group_5__2 : rule__ServiceSettingInstance__Group_5__2__Impl ;
    public final void rule__ServiceSettingInstance__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2886:1: ( rule__ServiceSettingInstance__Group_5__2__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2887:2: rule__ServiceSettingInstance__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5__2__Impl_in_rule__ServiceSettingInstance__Group_5__25692);
            rule__ServiceSettingInstance__Group_5__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5__2"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2893:1: rule__ServiceSettingInstance__Group_5__2__Impl : ( ( rule__ServiceSettingInstance__Group_5_2__0 )* ) ;
    public final void rule__ServiceSettingInstance__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2897:1: ( ( ( rule__ServiceSettingInstance__Group_5_2__0 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2898:1: ( ( rule__ServiceSettingInstance__Group_5_2__0 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2898:1: ( ( rule__ServiceSettingInstance__Group_5_2__0 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2899:1: ( rule__ServiceSettingInstance__Group_5_2__0 )*
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getGroup_5_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2900:1: ( rule__ServiceSettingInstance__Group_5_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2900:2: rule__ServiceSettingInstance__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5_2__0_in_rule__ServiceSettingInstance__Group_5__2__Impl5719);
            	    rule__ServiceSettingInstance__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getServiceSettingInstanceAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5__2__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5_2__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2916:1: rule__ServiceSettingInstance__Group_5_2__0 : rule__ServiceSettingInstance__Group_5_2__0__Impl rule__ServiceSettingInstance__Group_5_2__1 ;
    public final void rule__ServiceSettingInstance__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2920:1: ( rule__ServiceSettingInstance__Group_5_2__0__Impl rule__ServiceSettingInstance__Group_5_2__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2921:2: rule__ServiceSettingInstance__Group_5_2__0__Impl rule__ServiceSettingInstance__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5_2__0__Impl_in_rule__ServiceSettingInstance__Group_5_2__05756);
            rule__ServiceSettingInstance__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5_2__1_in_rule__ServiceSettingInstance__Group_5_2__05759);
            rule__ServiceSettingInstance__Group_5_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5_2__0"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5_2__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2928:1: rule__ServiceSettingInstance__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ServiceSettingInstance__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2932:1: ( ( ',' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2933:1: ( ',' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2933:1: ( ',' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2934:1: ','
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getCommaKeyword_5_2_0()); 
            match(input,37,FOLLOW_37_in_rule__ServiceSettingInstance__Group_5_2__0__Impl5787); 
             after(grammarAccess.getServiceSettingInstanceAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5_2__0__Impl"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5_2__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2947:1: rule__ServiceSettingInstance__Group_5_2__1 : rule__ServiceSettingInstance__Group_5_2__1__Impl ;
    public final void rule__ServiceSettingInstance__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2951:1: ( rule__ServiceSettingInstance__Group_5_2__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2952:2: rule__ServiceSettingInstance__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__Group_5_2__1__Impl_in_rule__ServiceSettingInstance__Group_5_2__15818);
            rule__ServiceSettingInstance__Group_5_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5_2__1"


    // $ANTLR start "rule__ServiceSettingInstance__Group_5_2__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2958:1: rule__ServiceSettingInstance__Group_5_2__1__Impl : ( ( rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1 ) ) ;
    public final void rule__ServiceSettingInstance__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2962:1: ( ( ( rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2963:1: ( ( rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2963:1: ( ( rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2964:1: ( rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1 )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingAssignment_5_2_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2965:1: ( rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2965:2: rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1_in_rule__ServiceSettingInstance__Group_5_2__1__Impl5845);
            rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingAssignment_5_2_1()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__Group_5_2__1__Impl"


    // $ANTLR start "rule__InfrastructureRequest__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2979:1: rule__InfrastructureRequest__Group__0 : rule__InfrastructureRequest__Group__0__Impl rule__InfrastructureRequest__Group__1 ;
    public final void rule__InfrastructureRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2983:1: ( rule__InfrastructureRequest__Group__0__Impl rule__InfrastructureRequest__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2984:2: rule__InfrastructureRequest__Group__0__Impl rule__InfrastructureRequest__Group__1
            {
            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__0__Impl_in_rule__InfrastructureRequest__Group__05879);
            rule__InfrastructureRequest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__1_in_rule__InfrastructureRequest__Group__05882);
            rule__InfrastructureRequest__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__InfrastructureRequest__Group__0"


    // $ANTLR start "rule__InfrastructureRequest__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2991:1: rule__InfrastructureRequest__Group__0__Impl : ( () ) ;
    public final void rule__InfrastructureRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2995:1: ( ( () ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2996:1: ( () )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2996:1: ( () )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2997:1: ()
            {
             before(grammarAccess.getInfrastructureRequestAccess().getInfrastructureRequestAction_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:2998:1: ()
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3000:1: 
            {
            }

             after(grammarAccess.getInfrastructureRequestAccess().getInfrastructureRequestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InfrastructureRequest__Group__0__Impl"


    // $ANTLR start "rule__InfrastructureRequest__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3010:1: rule__InfrastructureRequest__Group__1 : rule__InfrastructureRequest__Group__1__Impl rule__InfrastructureRequest__Group__2 ;
    public final void rule__InfrastructureRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3014:1: ( rule__InfrastructureRequest__Group__1__Impl rule__InfrastructureRequest__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3015:2: rule__InfrastructureRequest__Group__1__Impl rule__InfrastructureRequest__Group__2
            {
            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__1__Impl_in_rule__InfrastructureRequest__Group__15940);
            rule__InfrastructureRequest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__2_in_rule__InfrastructureRequest__Group__15943);
            rule__InfrastructureRequest__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__InfrastructureRequest__Group__1"


    // $ANTLR start "rule__InfrastructureRequest__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3022:1: rule__InfrastructureRequest__Group__1__Impl : ( 'RequestInfrastructure' ) ;
    public final void rule__InfrastructureRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3026:1: ( ( 'RequestInfrastructure' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3027:1: ( 'RequestInfrastructure' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3027:1: ( 'RequestInfrastructure' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3028:1: 'RequestInfrastructure'
            {
             before(grammarAccess.getInfrastructureRequestAccess().getRequestInfrastructureKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__InfrastructureRequest__Group__1__Impl5971); 
             after(grammarAccess.getInfrastructureRequestAccess().getRequestInfrastructureKeyword_1()); 

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
    // $ANTLR end "rule__InfrastructureRequest__Group__1__Impl"


    // $ANTLR start "rule__InfrastructureRequest__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3041:1: rule__InfrastructureRequest__Group__2 : rule__InfrastructureRequest__Group__2__Impl rule__InfrastructureRequest__Group__3 ;
    public final void rule__InfrastructureRequest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3045:1: ( rule__InfrastructureRequest__Group__2__Impl rule__InfrastructureRequest__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3046:2: rule__InfrastructureRequest__Group__2__Impl rule__InfrastructureRequest__Group__3
            {
            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__2__Impl_in_rule__InfrastructureRequest__Group__26002);
            rule__InfrastructureRequest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__3_in_rule__InfrastructureRequest__Group__26005);
            rule__InfrastructureRequest__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__InfrastructureRequest__Group__2"


    // $ANTLR start "rule__InfrastructureRequest__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3053:1: rule__InfrastructureRequest__Group__2__Impl : ( '{' ) ;
    public final void rule__InfrastructureRequest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3057:1: ( ( '{' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3058:1: ( '{' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3058:1: ( '{' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3059:1: '{'
            {
             before(grammarAccess.getInfrastructureRequestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__InfrastructureRequest__Group__2__Impl6033); 
             after(grammarAccess.getInfrastructureRequestAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__InfrastructureRequest__Group__2__Impl"


    // $ANTLR start "rule__InfrastructureRequest__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3072:1: rule__InfrastructureRequest__Group__3 : rule__InfrastructureRequest__Group__3__Impl rule__InfrastructureRequest__Group__4 ;
    public final void rule__InfrastructureRequest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3076:1: ( rule__InfrastructureRequest__Group__3__Impl rule__InfrastructureRequest__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3077:2: rule__InfrastructureRequest__Group__3__Impl rule__InfrastructureRequest__Group__4
            {
            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__3__Impl_in_rule__InfrastructureRequest__Group__36064);
            rule__InfrastructureRequest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__4_in_rule__InfrastructureRequest__Group__36067);
            rule__InfrastructureRequest__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__InfrastructureRequest__Group__3"


    // $ANTLR start "rule__InfrastructureRequest__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3084:1: rule__InfrastructureRequest__Group__3__Impl : ( ( rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3 )* ) ;
    public final void rule__InfrastructureRequest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3088:1: ( ( ( rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3089:1: ( ( rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3089:1: ( ( rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3090:1: ( rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3 )*
            {
             before(grammarAccess.getInfrastructureRequestAccess().getReqOfferedResourcesAssignment_3()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3091:1: ( rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==39) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3091:2: rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3_in_rule__InfrastructureRequest__Group__3__Impl6094);
            	    rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getInfrastructureRequestAccess().getReqOfferedResourcesAssignment_3()); 

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
    // $ANTLR end "rule__InfrastructureRequest__Group__3__Impl"


    // $ANTLR start "rule__InfrastructureRequest__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3101:1: rule__InfrastructureRequest__Group__4 : rule__InfrastructureRequest__Group__4__Impl rule__InfrastructureRequest__Group__5 ;
    public final void rule__InfrastructureRequest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3105:1: ( rule__InfrastructureRequest__Group__4__Impl rule__InfrastructureRequest__Group__5 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3106:2: rule__InfrastructureRequest__Group__4__Impl rule__InfrastructureRequest__Group__5
            {
            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__4__Impl_in_rule__InfrastructureRequest__Group__46125);
            rule__InfrastructureRequest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__5_in_rule__InfrastructureRequest__Group__46128);
            rule__InfrastructureRequest__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__InfrastructureRequest__Group__4"


    // $ANTLR start "rule__InfrastructureRequest__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3113:1: rule__InfrastructureRequest__Group__4__Impl : ( ( rule__InfrastructureRequest__ResourceGroupsAssignment_4 )* ) ;
    public final void rule__InfrastructureRequest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3117:1: ( ( ( rule__InfrastructureRequest__ResourceGroupsAssignment_4 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3118:1: ( ( rule__InfrastructureRequest__ResourceGroupsAssignment_4 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3118:1: ( ( rule__InfrastructureRequest__ResourceGroupsAssignment_4 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3119:1: ( rule__InfrastructureRequest__ResourceGroupsAssignment_4 )*
            {
             before(grammarAccess.getInfrastructureRequestAccess().getResourceGroupsAssignment_4()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3120:1: ( rule__InfrastructureRequest__ResourceGroupsAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3120:2: rule__InfrastructureRequest__ResourceGroupsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__InfrastructureRequest__ResourceGroupsAssignment_4_in_rule__InfrastructureRequest__Group__4__Impl6155);
            	    rule__InfrastructureRequest__ResourceGroupsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInfrastructureRequestAccess().getResourceGroupsAssignment_4()); 

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
    // $ANTLR end "rule__InfrastructureRequest__Group__4__Impl"


    // $ANTLR start "rule__InfrastructureRequest__Group__5"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3130:1: rule__InfrastructureRequest__Group__5 : rule__InfrastructureRequest__Group__5__Impl ;
    public final void rule__InfrastructureRequest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3134:1: ( rule__InfrastructureRequest__Group__5__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3135:2: rule__InfrastructureRequest__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__InfrastructureRequest__Group__5__Impl_in_rule__InfrastructureRequest__Group__56186);
            rule__InfrastructureRequest__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__InfrastructureRequest__Group__5"


    // $ANTLR start "rule__InfrastructureRequest__Group__5__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3141:1: rule__InfrastructureRequest__Group__5__Impl : ( '}' ) ;
    public final void rule__InfrastructureRequest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3145:1: ( ( '}' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3146:1: ( '}' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3146:1: ( '}' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3147:1: '}'
            {
             before(grammarAccess.getInfrastructureRequestAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__InfrastructureRequest__Group__5__Impl6214); 
             after(grammarAccess.getInfrastructureRequestAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__InfrastructureRequest__Group__5__Impl"


    // $ANTLR start "rule__ResourceRequest__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3172:1: rule__ResourceRequest__Group__0 : rule__ResourceRequest__Group__0__Impl rule__ResourceRequest__Group__1 ;
    public final void rule__ResourceRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3176:1: ( rule__ResourceRequest__Group__0__Impl rule__ResourceRequest__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3177:2: rule__ResourceRequest__Group__0__Impl rule__ResourceRequest__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group__0__Impl_in_rule__ResourceRequest__Group__06257);
            rule__ResourceRequest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRequest__Group__1_in_rule__ResourceRequest__Group__06260);
            rule__ResourceRequest__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group__0"


    // $ANTLR start "rule__ResourceRequest__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3184:1: rule__ResourceRequest__Group__0__Impl : ( 'Resource' ) ;
    public final void rule__ResourceRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3188:1: ( ( 'Resource' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3189:1: ( 'Resource' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3189:1: ( 'Resource' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3190:1: 'Resource'
            {
             before(grammarAccess.getResourceRequestAccess().getResourceKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ResourceRequest__Group__0__Impl6288); 
             after(grammarAccess.getResourceRequestAccess().getResourceKeyword_0()); 

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
    // $ANTLR end "rule__ResourceRequest__Group__0__Impl"


    // $ANTLR start "rule__ResourceRequest__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3203:1: rule__ResourceRequest__Group__1 : rule__ResourceRequest__Group__1__Impl rule__ResourceRequest__Group__2 ;
    public final void rule__ResourceRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3207:1: ( rule__ResourceRequest__Group__1__Impl rule__ResourceRequest__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3208:2: rule__ResourceRequest__Group__1__Impl rule__ResourceRequest__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group__1__Impl_in_rule__ResourceRequest__Group__16319);
            rule__ResourceRequest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRequest__Group__2_in_rule__ResourceRequest__Group__16322);
            rule__ResourceRequest__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group__1"


    // $ANTLR start "rule__ResourceRequest__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3215:1: rule__ResourceRequest__Group__1__Impl : ( ( rule__ResourceRequest__RefOfferedResourceAssignment_1 ) ) ;
    public final void rule__ResourceRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3219:1: ( ( ( rule__ResourceRequest__RefOfferedResourceAssignment_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3220:1: ( ( rule__ResourceRequest__RefOfferedResourceAssignment_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3220:1: ( ( rule__ResourceRequest__RefOfferedResourceAssignment_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3221:1: ( rule__ResourceRequest__RefOfferedResourceAssignment_1 )
            {
             before(grammarAccess.getResourceRequestAccess().getRefOfferedResourceAssignment_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3222:1: ( rule__ResourceRequest__RefOfferedResourceAssignment_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3222:2: rule__ResourceRequest__RefOfferedResourceAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourceRequest__RefOfferedResourceAssignment_1_in_rule__ResourceRequest__Group__1__Impl6349);
            rule__ResourceRequest__RefOfferedResourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceRequestAccess().getRefOfferedResourceAssignment_1()); 

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
    // $ANTLR end "rule__ResourceRequest__Group__1__Impl"


    // $ANTLR start "rule__ResourceRequest__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3232:1: rule__ResourceRequest__Group__2 : rule__ResourceRequest__Group__2__Impl rule__ResourceRequest__Group__3 ;
    public final void rule__ResourceRequest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3236:1: ( rule__ResourceRequest__Group__2__Impl rule__ResourceRequest__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3237:2: rule__ResourceRequest__Group__2__Impl rule__ResourceRequest__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group__2__Impl_in_rule__ResourceRequest__Group__26379);
            rule__ResourceRequest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRequest__Group__3_in_rule__ResourceRequest__Group__26382);
            rule__ResourceRequest__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group__2"


    // $ANTLR start "rule__ResourceRequest__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3244:1: rule__ResourceRequest__Group__2__Impl : ( 'as' ) ;
    public final void rule__ResourceRequest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3248:1: ( ( 'as' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3249:1: ( 'as' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3249:1: ( 'as' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3250:1: 'as'
            {
             before(grammarAccess.getResourceRequestAccess().getAsKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__ResourceRequest__Group__2__Impl6410); 
             after(grammarAccess.getResourceRequestAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__ResourceRequest__Group__2__Impl"


    // $ANTLR start "rule__ResourceRequest__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3263:1: rule__ResourceRequest__Group__3 : rule__ResourceRequest__Group__3__Impl rule__ResourceRequest__Group__4 ;
    public final void rule__ResourceRequest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3267:1: ( rule__ResourceRequest__Group__3__Impl rule__ResourceRequest__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3268:2: rule__ResourceRequest__Group__3__Impl rule__ResourceRequest__Group__4
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group__3__Impl_in_rule__ResourceRequest__Group__36441);
            rule__ResourceRequest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRequest__Group__4_in_rule__ResourceRequest__Group__36444);
            rule__ResourceRequest__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group__3"


    // $ANTLR start "rule__ResourceRequest__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3275:1: rule__ResourceRequest__Group__3__Impl : ( ( rule__ResourceRequest__NameAssignment_3 ) ) ;
    public final void rule__ResourceRequest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3279:1: ( ( ( rule__ResourceRequest__NameAssignment_3 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3280:1: ( ( rule__ResourceRequest__NameAssignment_3 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3280:1: ( ( rule__ResourceRequest__NameAssignment_3 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3281:1: ( rule__ResourceRequest__NameAssignment_3 )
            {
             before(grammarAccess.getResourceRequestAccess().getNameAssignment_3()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3282:1: ( rule__ResourceRequest__NameAssignment_3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3282:2: rule__ResourceRequest__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ResourceRequest__NameAssignment_3_in_rule__ResourceRequest__Group__3__Impl6471);
            rule__ResourceRequest__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourceRequestAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__ResourceRequest__Group__3__Impl"


    // $ANTLR start "rule__ResourceRequest__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3292:1: rule__ResourceRequest__Group__4 : rule__ResourceRequest__Group__4__Impl ;
    public final void rule__ResourceRequest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3296:1: ( rule__ResourceRequest__Group__4__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3297:2: rule__ResourceRequest__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group__4__Impl_in_rule__ResourceRequest__Group__46501);
            rule__ResourceRequest__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group__4"


    // $ANTLR start "rule__ResourceRequest__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3303:1: rule__ResourceRequest__Group__4__Impl : ( ( rule__ResourceRequest__Group_4__0 )? ) ;
    public final void rule__ResourceRequest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3307:1: ( ( ( rule__ResourceRequest__Group_4__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3308:1: ( ( rule__ResourceRequest__Group_4__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3308:1: ( ( rule__ResourceRequest__Group_4__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3309:1: ( rule__ResourceRequest__Group_4__0 )?
            {
             before(grammarAccess.getResourceRequestAccess().getGroup_4()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3310:1: ( rule__ResourceRequest__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3310:2: rule__ResourceRequest__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ResourceRequest__Group_4__0_in_rule__ResourceRequest__Group__4__Impl6528);
                    rule__ResourceRequest__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceRequestAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ResourceRequest__Group__4__Impl"


    // $ANTLR start "rule__ResourceRequest__Group_4__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3330:1: rule__ResourceRequest__Group_4__0 : rule__ResourceRequest__Group_4__0__Impl rule__ResourceRequest__Group_4__1 ;
    public final void rule__ResourceRequest__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3334:1: ( rule__ResourceRequest__Group_4__0__Impl rule__ResourceRequest__Group_4__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3335:2: rule__ResourceRequest__Group_4__0__Impl rule__ResourceRequest__Group_4__1
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group_4__0__Impl_in_rule__ResourceRequest__Group_4__06569);
            rule__ResourceRequest__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRequest__Group_4__1_in_rule__ResourceRequest__Group_4__06572);
            rule__ResourceRequest__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group_4__0"


    // $ANTLR start "rule__ResourceRequest__Group_4__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3342:1: rule__ResourceRequest__Group_4__0__Impl : ( 'settings' ) ;
    public final void rule__ResourceRequest__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3346:1: ( ( 'settings' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3347:1: ( 'settings' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3347:1: ( 'settings' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3348:1: 'settings'
            {
             before(grammarAccess.getResourceRequestAccess().getSettingsKeyword_4_0()); 
            match(input,25,FOLLOW_25_in_rule__ResourceRequest__Group_4__0__Impl6600); 
             after(grammarAccess.getResourceRequestAccess().getSettingsKeyword_4_0()); 

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
    // $ANTLR end "rule__ResourceRequest__Group_4__0__Impl"


    // $ANTLR start "rule__ResourceRequest__Group_4__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3361:1: rule__ResourceRequest__Group_4__1 : rule__ResourceRequest__Group_4__1__Impl rule__ResourceRequest__Group_4__2 ;
    public final void rule__ResourceRequest__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3365:1: ( rule__ResourceRequest__Group_4__1__Impl rule__ResourceRequest__Group_4__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3366:2: rule__ResourceRequest__Group_4__1__Impl rule__ResourceRequest__Group_4__2
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group_4__1__Impl_in_rule__ResourceRequest__Group_4__16631);
            rule__ResourceRequest__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRequest__Group_4__2_in_rule__ResourceRequest__Group_4__16634);
            rule__ResourceRequest__Group_4__2();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group_4__1"


    // $ANTLR start "rule__ResourceRequest__Group_4__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3373:1: rule__ResourceRequest__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ResourceRequest__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3377:1: ( ( '{' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3378:1: ( '{' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3378:1: ( '{' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3379:1: '{'
            {
             before(grammarAccess.getResourceRequestAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,17,FOLLOW_17_in_rule__ResourceRequest__Group_4__1__Impl6662); 
             after(grammarAccess.getResourceRequestAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__ResourceRequest__Group_4__1__Impl"


    // $ANTLR start "rule__ResourceRequest__Group_4__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3392:1: rule__ResourceRequest__Group_4__2 : rule__ResourceRequest__Group_4__2__Impl rule__ResourceRequest__Group_4__3 ;
    public final void rule__ResourceRequest__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3396:1: ( rule__ResourceRequest__Group_4__2__Impl rule__ResourceRequest__Group_4__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3397:2: rule__ResourceRequest__Group_4__2__Impl rule__ResourceRequest__Group_4__3
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group_4__2__Impl_in_rule__ResourceRequest__Group_4__26693);
            rule__ResourceRequest__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRequest__Group_4__3_in_rule__ResourceRequest__Group_4__26696);
            rule__ResourceRequest__Group_4__3();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group_4__2"


    // $ANTLR start "rule__ResourceRequest__Group_4__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3404:1: rule__ResourceRequest__Group_4__2__Impl : ( ( rule__ResourceRequest__ReqResourceSettingsAssignment_4_2 )* ) ;
    public final void rule__ResourceRequest__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3408:1: ( ( ( rule__ResourceRequest__ReqResourceSettingsAssignment_4_2 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3409:1: ( ( rule__ResourceRequest__ReqResourceSettingsAssignment_4_2 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3409:1: ( ( rule__ResourceRequest__ReqResourceSettingsAssignment_4_2 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3410:1: ( rule__ResourceRequest__ReqResourceSettingsAssignment_4_2 )*
            {
             before(grammarAccess.getResourceRequestAccess().getReqResourceSettingsAssignment_4_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3411:1: ( rule__ResourceRequest__ReqResourceSettingsAssignment_4_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3411:2: rule__ResourceRequest__ReqResourceSettingsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__ResourceRequest__ReqResourceSettingsAssignment_4_2_in_rule__ResourceRequest__Group_4__2__Impl6723);
            	    rule__ResourceRequest__ReqResourceSettingsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getResourceRequestAccess().getReqResourceSettingsAssignment_4_2()); 

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
    // $ANTLR end "rule__ResourceRequest__Group_4__2__Impl"


    // $ANTLR start "rule__ResourceRequest__Group_4__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3421:1: rule__ResourceRequest__Group_4__3 : rule__ResourceRequest__Group_4__3__Impl ;
    public final void rule__ResourceRequest__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3425:1: ( rule__ResourceRequest__Group_4__3__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3426:2: rule__ResourceRequest__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__ResourceRequest__Group_4__3__Impl_in_rule__ResourceRequest__Group_4__36754);
            rule__ResourceRequest__Group_4__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceRequest__Group_4__3"


    // $ANTLR start "rule__ResourceRequest__Group_4__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3432:1: rule__ResourceRequest__Group_4__3__Impl : ( '}' ) ;
    public final void rule__ResourceRequest__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3436:1: ( ( '}' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3437:1: ( '}' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3437:1: ( '}' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3438:1: '}'
            {
             before(grammarAccess.getResourceRequestAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,18,FOLLOW_18_in_rule__ResourceRequest__Group_4__3__Impl6782); 
             after(grammarAccess.getResourceRequestAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__ResourceRequest__Group_4__3__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3459:1: rule__ResourceGroup__Group__0 : rule__ResourceGroup__Group__0__Impl rule__ResourceGroup__Group__1 ;
    public final void rule__ResourceGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3463:1: ( rule__ResourceGroup__Group__0__Impl rule__ResourceGroup__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3464:2: rule__ResourceGroup__Group__0__Impl rule__ResourceGroup__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__0__Impl_in_rule__ResourceGroup__Group__06821);
            rule__ResourceGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__1_in_rule__ResourceGroup__Group__06824);
            rule__ResourceGroup__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group__0"


    // $ANTLR start "rule__ResourceGroup__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3471:1: rule__ResourceGroup__Group__0__Impl : ( () ) ;
    public final void rule__ResourceGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3475:1: ( ( () ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3476:1: ( () )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3476:1: ( () )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3477:1: ()
            {
             before(grammarAccess.getResourceGroupAccess().getResourceGroupAction_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3478:1: ()
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3480:1: 
            {
            }

             after(grammarAccess.getResourceGroupAccess().getResourceGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ResourceGroup__Group__0__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3490:1: rule__ResourceGroup__Group__1 : rule__ResourceGroup__Group__1__Impl rule__ResourceGroup__Group__2 ;
    public final void rule__ResourceGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3494:1: ( rule__ResourceGroup__Group__1__Impl rule__ResourceGroup__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3495:2: rule__ResourceGroup__Group__1__Impl rule__ResourceGroup__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__1__Impl_in_rule__ResourceGroup__Group__16882);
            rule__ResourceGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__2_in_rule__ResourceGroup__Group__16885);
            rule__ResourceGroup__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group__1"


    // $ANTLR start "rule__ResourceGroup__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3502:1: rule__ResourceGroup__Group__1__Impl : ( 'ResourceGroup' ) ;
    public final void rule__ResourceGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3506:1: ( ( 'ResourceGroup' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3507:1: ( 'ResourceGroup' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3507:1: ( 'ResourceGroup' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3508:1: 'ResourceGroup'
            {
             before(grammarAccess.getResourceGroupAccess().getResourceGroupKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__ResourceGroup__Group__1__Impl6913); 
             after(grammarAccess.getResourceGroupAccess().getResourceGroupKeyword_1()); 

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
    // $ANTLR end "rule__ResourceGroup__Group__1__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3521:1: rule__ResourceGroup__Group__2 : rule__ResourceGroup__Group__2__Impl rule__ResourceGroup__Group__3 ;
    public final void rule__ResourceGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3525:1: ( rule__ResourceGroup__Group__2__Impl rule__ResourceGroup__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3526:2: rule__ResourceGroup__Group__2__Impl rule__ResourceGroup__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__2__Impl_in_rule__ResourceGroup__Group__26944);
            rule__ResourceGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__3_in_rule__ResourceGroup__Group__26947);
            rule__ResourceGroup__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group__2"


    // $ANTLR start "rule__ResourceGroup__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3533:1: rule__ResourceGroup__Group__2__Impl : ( ( rule__ResourceGroup__NameAssignment_2 ) ) ;
    public final void rule__ResourceGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3537:1: ( ( ( rule__ResourceGroup__NameAssignment_2 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3538:1: ( ( rule__ResourceGroup__NameAssignment_2 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3538:1: ( ( rule__ResourceGroup__NameAssignment_2 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3539:1: ( rule__ResourceGroup__NameAssignment_2 )
            {
             before(grammarAccess.getResourceGroupAccess().getNameAssignment_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3540:1: ( rule__ResourceGroup__NameAssignment_2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3540:2: rule__ResourceGroup__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ResourceGroup__NameAssignment_2_in_rule__ResourceGroup__Group__2__Impl6974);
            rule__ResourceGroup__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ResourceGroup__Group__2__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3550:1: rule__ResourceGroup__Group__3 : rule__ResourceGroup__Group__3__Impl rule__ResourceGroup__Group__4 ;
    public final void rule__ResourceGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3554:1: ( rule__ResourceGroup__Group__3__Impl rule__ResourceGroup__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3555:2: rule__ResourceGroup__Group__3__Impl rule__ResourceGroup__Group__4
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__3__Impl_in_rule__ResourceGroup__Group__37004);
            rule__ResourceGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__4_in_rule__ResourceGroup__Group__37007);
            rule__ResourceGroup__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group__3"


    // $ANTLR start "rule__ResourceGroup__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3562:1: rule__ResourceGroup__Group__3__Impl : ( 'refersResources' ) ;
    public final void rule__ResourceGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3566:1: ( ( 'refersResources' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3567:1: ( 'refersResources' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3567:1: ( 'refersResources' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3568:1: 'refersResources'
            {
             before(grammarAccess.getResourceGroupAccess().getRefersResourcesKeyword_3()); 
            match(input,41,FOLLOW_41_in_rule__ResourceGroup__Group__3__Impl7035); 
             after(grammarAccess.getResourceGroupAccess().getRefersResourcesKeyword_3()); 

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
    // $ANTLR end "rule__ResourceGroup__Group__3__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3581:1: rule__ResourceGroup__Group__4 : rule__ResourceGroup__Group__4__Impl rule__ResourceGroup__Group__5 ;
    public final void rule__ResourceGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3585:1: ( rule__ResourceGroup__Group__4__Impl rule__ResourceGroup__Group__5 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3586:2: rule__ResourceGroup__Group__4__Impl rule__ResourceGroup__Group__5
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__4__Impl_in_rule__ResourceGroup__Group__47066);
            rule__ResourceGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__5_in_rule__ResourceGroup__Group__47069);
            rule__ResourceGroup__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group__4"


    // $ANTLR start "rule__ResourceGroup__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3593:1: rule__ResourceGroup__Group__4__Impl : ( '{' ) ;
    public final void rule__ResourceGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3597:1: ( ( '{' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3598:1: ( '{' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3598:1: ( '{' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3599:1: '{'
            {
             before(grammarAccess.getResourceGroupAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__ResourceGroup__Group__4__Impl7097); 
             after(grammarAccess.getResourceGroupAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ResourceGroup__Group__4__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__5"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3612:1: rule__ResourceGroup__Group__5 : rule__ResourceGroup__Group__5__Impl rule__ResourceGroup__Group__6 ;
    public final void rule__ResourceGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3616:1: ( rule__ResourceGroup__Group__5__Impl rule__ResourceGroup__Group__6 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3617:2: rule__ResourceGroup__Group__5__Impl rule__ResourceGroup__Group__6
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__5__Impl_in_rule__ResourceGroup__Group__57128);
            rule__ResourceGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group__6_in_rule__ResourceGroup__Group__57131);
            rule__ResourceGroup__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group__5"


    // $ANTLR start "rule__ResourceGroup__Group__5__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3624:1: rule__ResourceGroup__Group__5__Impl : ( ( rule__ResourceGroup__Group_5__0 )? ) ;
    public final void rule__ResourceGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3628:1: ( ( ( rule__ResourceGroup__Group_5__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3629:1: ( ( rule__ResourceGroup__Group_5__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3629:1: ( ( rule__ResourceGroup__Group_5__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3630:1: ( rule__ResourceGroup__Group_5__0 )?
            {
             before(grammarAccess.getResourceGroupAccess().getGroup_5()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3631:1: ( rule__ResourceGroup__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3631:2: rule__ResourceGroup__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ResourceGroup__Group_5__0_in_rule__ResourceGroup__Group__5__Impl7158);
                    rule__ResourceGroup__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceGroupAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ResourceGroup__Group__5__Impl"


    // $ANTLR start "rule__ResourceGroup__Group__6"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3641:1: rule__ResourceGroup__Group__6 : rule__ResourceGroup__Group__6__Impl ;
    public final void rule__ResourceGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3645:1: ( rule__ResourceGroup__Group__6__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3646:2: rule__ResourceGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group__6__Impl_in_rule__ResourceGroup__Group__67189);
            rule__ResourceGroup__Group__6__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group__6"


    // $ANTLR start "rule__ResourceGroup__Group__6__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3652:1: rule__ResourceGroup__Group__6__Impl : ( '}' ) ;
    public final void rule__ResourceGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3656:1: ( ( '}' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3657:1: ( '}' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3657:1: ( '}' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3658:1: '}'
            {
             before(grammarAccess.getResourceGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__ResourceGroup__Group__6__Impl7217); 
             after(grammarAccess.getResourceGroupAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ResourceGroup__Group__6__Impl"


    // $ANTLR start "rule__ResourceGroup__Group_5__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3685:1: rule__ResourceGroup__Group_5__0 : rule__ResourceGroup__Group_5__0__Impl rule__ResourceGroup__Group_5__1 ;
    public final void rule__ResourceGroup__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3689:1: ( rule__ResourceGroup__Group_5__0__Impl rule__ResourceGroup__Group_5__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3690:2: rule__ResourceGroup__Group_5__0__Impl rule__ResourceGroup__Group_5__1
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group_5__0__Impl_in_rule__ResourceGroup__Group_5__07262);
            rule__ResourceGroup__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group_5__1_in_rule__ResourceGroup__Group_5__07265);
            rule__ResourceGroup__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group_5__0"


    // $ANTLR start "rule__ResourceGroup__Group_5__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3697:1: rule__ResourceGroup__Group_5__0__Impl : ( ( rule__ResourceGroup__GroupedResourcesAssignment_5_0 ) ) ;
    public final void rule__ResourceGroup__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3701:1: ( ( ( rule__ResourceGroup__GroupedResourcesAssignment_5_0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3702:1: ( ( rule__ResourceGroup__GroupedResourcesAssignment_5_0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3702:1: ( ( rule__ResourceGroup__GroupedResourcesAssignment_5_0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3703:1: ( rule__ResourceGroup__GroupedResourcesAssignment_5_0 )
            {
             before(grammarAccess.getResourceGroupAccess().getGroupedResourcesAssignment_5_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3704:1: ( rule__ResourceGroup__GroupedResourcesAssignment_5_0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3704:2: rule__ResourceGroup__GroupedResourcesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__ResourceGroup__GroupedResourcesAssignment_5_0_in_rule__ResourceGroup__Group_5__0__Impl7292);
            rule__ResourceGroup__GroupedResourcesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getGroupedResourcesAssignment_5_0()); 

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
    // $ANTLR end "rule__ResourceGroup__Group_5__0__Impl"


    // $ANTLR start "rule__ResourceGroup__Group_5__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3714:1: rule__ResourceGroup__Group_5__1 : rule__ResourceGroup__Group_5__1__Impl ;
    public final void rule__ResourceGroup__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3718:1: ( rule__ResourceGroup__Group_5__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3719:2: rule__ResourceGroup__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group_5__1__Impl_in_rule__ResourceGroup__Group_5__17322);
            rule__ResourceGroup__Group_5__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group_5__1"


    // $ANTLR start "rule__ResourceGroup__Group_5__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3725:1: rule__ResourceGroup__Group_5__1__Impl : ( ( rule__ResourceGroup__Group_5_1__0 )* ) ;
    public final void rule__ResourceGroup__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3729:1: ( ( ( rule__ResourceGroup__Group_5_1__0 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3730:1: ( ( rule__ResourceGroup__Group_5_1__0 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3730:1: ( ( rule__ResourceGroup__Group_5_1__0 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3731:1: ( rule__ResourceGroup__Group_5_1__0 )*
            {
             before(grammarAccess.getResourceGroupAccess().getGroup_5_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3732:1: ( rule__ResourceGroup__Group_5_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==37) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3732:2: rule__ResourceGroup__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ResourceGroup__Group_5_1__0_in_rule__ResourceGroup__Group_5__1__Impl7349);
            	    rule__ResourceGroup__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getResourceGroupAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__ResourceGroup__Group_5__1__Impl"


    // $ANTLR start "rule__ResourceGroup__Group_5_1__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3746:1: rule__ResourceGroup__Group_5_1__0 : rule__ResourceGroup__Group_5_1__0__Impl rule__ResourceGroup__Group_5_1__1 ;
    public final void rule__ResourceGroup__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3750:1: ( rule__ResourceGroup__Group_5_1__0__Impl rule__ResourceGroup__Group_5_1__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3751:2: rule__ResourceGroup__Group_5_1__0__Impl rule__ResourceGroup__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group_5_1__0__Impl_in_rule__ResourceGroup__Group_5_1__07384);
            rule__ResourceGroup__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceGroup__Group_5_1__1_in_rule__ResourceGroup__Group_5_1__07387);
            rule__ResourceGroup__Group_5_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group_5_1__0"


    // $ANTLR start "rule__ResourceGroup__Group_5_1__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3758:1: rule__ResourceGroup__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ResourceGroup__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3762:1: ( ( ',' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3763:1: ( ',' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3763:1: ( ',' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3764:1: ','
            {
             before(grammarAccess.getResourceGroupAccess().getCommaKeyword_5_1_0()); 
            match(input,37,FOLLOW_37_in_rule__ResourceGroup__Group_5_1__0__Impl7415); 
             after(grammarAccess.getResourceGroupAccess().getCommaKeyword_5_1_0()); 

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
    // $ANTLR end "rule__ResourceGroup__Group_5_1__0__Impl"


    // $ANTLR start "rule__ResourceGroup__Group_5_1__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3777:1: rule__ResourceGroup__Group_5_1__1 : rule__ResourceGroup__Group_5_1__1__Impl ;
    public final void rule__ResourceGroup__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3781:1: ( rule__ResourceGroup__Group_5_1__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3782:2: rule__ResourceGroup__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceGroup__Group_5_1__1__Impl_in_rule__ResourceGroup__Group_5_1__17446);
            rule__ResourceGroup__Group_5_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceGroup__Group_5_1__1"


    // $ANTLR start "rule__ResourceGroup__Group_5_1__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3788:1: rule__ResourceGroup__Group_5_1__1__Impl : ( ( rule__ResourceGroup__GroupedResourcesAssignment_5_1_1 ) ) ;
    public final void rule__ResourceGroup__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3792:1: ( ( ( rule__ResourceGroup__GroupedResourcesAssignment_5_1_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3793:1: ( ( rule__ResourceGroup__GroupedResourcesAssignment_5_1_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3793:1: ( ( rule__ResourceGroup__GroupedResourcesAssignment_5_1_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3794:1: ( rule__ResourceGroup__GroupedResourcesAssignment_5_1_1 )
            {
             before(grammarAccess.getResourceGroupAccess().getGroupedResourcesAssignment_5_1_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3795:1: ( rule__ResourceGroup__GroupedResourcesAssignment_5_1_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3795:2: rule__ResourceGroup__GroupedResourcesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__ResourceGroup__GroupedResourcesAssignment_5_1_1_in_rule__ResourceGroup__Group_5_1__1__Impl7473);
            rule__ResourceGroup__GroupedResourcesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceGroupAccess().getGroupedResourcesAssignment_5_1_1()); 

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
    // $ANTLR end "rule__ResourceGroup__Group_5_1__1__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3809:1: rule__ResourceSettingInstance__Group__0 : rule__ResourceSettingInstance__Group__0__Impl rule__ResourceSettingInstance__Group__1 ;
    public final void rule__ResourceSettingInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3813:1: ( rule__ResourceSettingInstance__Group__0__Impl rule__ResourceSettingInstance__Group__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3814:2: rule__ResourceSettingInstance__Group__0__Impl rule__ResourceSettingInstance__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__0__Impl_in_rule__ResourceSettingInstance__Group__07507);
            rule__ResourceSettingInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__1_in_rule__ResourceSettingInstance__Group__07510);
            rule__ResourceSettingInstance__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group__0"


    // $ANTLR start "rule__ResourceSettingInstance__Group__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3821:1: rule__ResourceSettingInstance__Group__0__Impl : ( 'Setting' ) ;
    public final void rule__ResourceSettingInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3825:1: ( ( 'Setting' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3826:1: ( 'Setting' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3826:1: ( 'Setting' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3827:1: 'Setting'
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getSettingKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__ResourceSettingInstance__Group__0__Impl7538); 
             after(grammarAccess.getResourceSettingInstanceAccess().getSettingKeyword_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group__0__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3840:1: rule__ResourceSettingInstance__Group__1 : rule__ResourceSettingInstance__Group__1__Impl rule__ResourceSettingInstance__Group__2 ;
    public final void rule__ResourceSettingInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3844:1: ( rule__ResourceSettingInstance__Group__1__Impl rule__ResourceSettingInstance__Group__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3845:2: rule__ResourceSettingInstance__Group__1__Impl rule__ResourceSettingInstance__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__1__Impl_in_rule__ResourceSettingInstance__Group__17569);
            rule__ResourceSettingInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__2_in_rule__ResourceSettingInstance__Group__17572);
            rule__ResourceSettingInstance__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group__1"


    // $ANTLR start "rule__ResourceSettingInstance__Group__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3852:1: rule__ResourceSettingInstance__Group__1__Impl : ( ( rule__ResourceSettingInstance__RefResourceSettingAssignment_1 ) ) ;
    public final void rule__ResourceSettingInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3856:1: ( ( ( rule__ResourceSettingInstance__RefResourceSettingAssignment_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3857:1: ( ( rule__ResourceSettingInstance__RefResourceSettingAssignment_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3857:1: ( ( rule__ResourceSettingInstance__RefResourceSettingAssignment_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3858:1: ( rule__ResourceSettingInstance__RefResourceSettingAssignment_1 )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getRefResourceSettingAssignment_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3859:1: ( rule__ResourceSettingInstance__RefResourceSettingAssignment_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3859:2: rule__ResourceSettingInstance__RefResourceSettingAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__RefResourceSettingAssignment_1_in_rule__ResourceSettingInstance__Group__1__Impl7599);
            rule__ResourceSettingInstance__RefResourceSettingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceSettingInstanceAccess().getRefResourceSettingAssignment_1()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group__1__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3869:1: rule__ResourceSettingInstance__Group__2 : rule__ResourceSettingInstance__Group__2__Impl rule__ResourceSettingInstance__Group__3 ;
    public final void rule__ResourceSettingInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3873:1: ( rule__ResourceSettingInstance__Group__2__Impl rule__ResourceSettingInstance__Group__3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3874:2: rule__ResourceSettingInstance__Group__2__Impl rule__ResourceSettingInstance__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__2__Impl_in_rule__ResourceSettingInstance__Group__27629);
            rule__ResourceSettingInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__3_in_rule__ResourceSettingInstance__Group__27632);
            rule__ResourceSettingInstance__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group__2"


    // $ANTLR start "rule__ResourceSettingInstance__Group__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3881:1: rule__ResourceSettingInstance__Group__2__Impl : ( ':' ) ;
    public final void rule__ResourceSettingInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3885:1: ( ( ':' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3886:1: ( ':' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3886:1: ( ':' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3887:1: ':'
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getColonKeyword_2()); 
            match(input,34,FOLLOW_34_in_rule__ResourceSettingInstance__Group__2__Impl7660); 
             after(grammarAccess.getResourceSettingInstanceAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group__2__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group__3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3900:1: rule__ResourceSettingInstance__Group__3 : rule__ResourceSettingInstance__Group__3__Impl rule__ResourceSettingInstance__Group__4 ;
    public final void rule__ResourceSettingInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3904:1: ( rule__ResourceSettingInstance__Group__3__Impl rule__ResourceSettingInstance__Group__4 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3905:2: rule__ResourceSettingInstance__Group__3__Impl rule__ResourceSettingInstance__Group__4
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__3__Impl_in_rule__ResourceSettingInstance__Group__37691);
            rule__ResourceSettingInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__4_in_rule__ResourceSettingInstance__Group__37694);
            rule__ResourceSettingInstance__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group__3"


    // $ANTLR start "rule__ResourceSettingInstance__Group__3__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3912:1: rule__ResourceSettingInstance__Group__3__Impl : ( ( rule__ResourceSettingInstance__NameAssignment_3 ) ) ;
    public final void rule__ResourceSettingInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3916:1: ( ( ( rule__ResourceSettingInstance__NameAssignment_3 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3917:1: ( ( rule__ResourceSettingInstance__NameAssignment_3 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3917:1: ( ( rule__ResourceSettingInstance__NameAssignment_3 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3918:1: ( rule__ResourceSettingInstance__NameAssignment_3 )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getNameAssignment_3()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3919:1: ( rule__ResourceSettingInstance__NameAssignment_3 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3919:2: rule__ResourceSettingInstance__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__NameAssignment_3_in_rule__ResourceSettingInstance__Group__3__Impl7721);
            rule__ResourceSettingInstance__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourceSettingInstanceAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group__3__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group__4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3929:1: rule__ResourceSettingInstance__Group__4 : rule__ResourceSettingInstance__Group__4__Impl rule__ResourceSettingInstance__Group__5 ;
    public final void rule__ResourceSettingInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3933:1: ( rule__ResourceSettingInstance__Group__4__Impl rule__ResourceSettingInstance__Group__5 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3934:2: rule__ResourceSettingInstance__Group__4__Impl rule__ResourceSettingInstance__Group__5
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__4__Impl_in_rule__ResourceSettingInstance__Group__47751);
            rule__ResourceSettingInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__5_in_rule__ResourceSettingInstance__Group__47754);
            rule__ResourceSettingInstance__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group__4"


    // $ANTLR start "rule__ResourceSettingInstance__Group__4__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3941:1: rule__ResourceSettingInstance__Group__4__Impl : ( ( rule__ResourceSettingInstance__Group_4__0 )? ) ;
    public final void rule__ResourceSettingInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3945:1: ( ( ( rule__ResourceSettingInstance__Group_4__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3946:1: ( ( rule__ResourceSettingInstance__Group_4__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3946:1: ( ( rule__ResourceSettingInstance__Group_4__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3947:1: ( rule__ResourceSettingInstance__Group_4__0 )?
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getGroup_4()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3948:1: ( rule__ResourceSettingInstance__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3948:2: rule__ResourceSettingInstance__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_4__0_in_rule__ResourceSettingInstance__Group__4__Impl7781);
                    rule__ResourceSettingInstance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceSettingInstanceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group__4__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group__5"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3958:1: rule__ResourceSettingInstance__Group__5 : rule__ResourceSettingInstance__Group__5__Impl ;
    public final void rule__ResourceSettingInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3962:1: ( rule__ResourceSettingInstance__Group__5__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3963:2: rule__ResourceSettingInstance__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group__5__Impl_in_rule__ResourceSettingInstance__Group__57812);
            rule__ResourceSettingInstance__Group__5__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group__5"


    // $ANTLR start "rule__ResourceSettingInstance__Group__5__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3969:1: rule__ResourceSettingInstance__Group__5__Impl : ( ( rule__ResourceSettingInstance__Group_5__0 )? ) ;
    public final void rule__ResourceSettingInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3973:1: ( ( ( rule__ResourceSettingInstance__Group_5__0 )? ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3974:1: ( ( rule__ResourceSettingInstance__Group_5__0 )? )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3974:1: ( ( rule__ResourceSettingInstance__Group_5__0 )? )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3975:1: ( rule__ResourceSettingInstance__Group_5__0 )?
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getGroup_5()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3976:1: ( rule__ResourceSettingInstance__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3976:2: rule__ResourceSettingInstance__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5__0_in_rule__ResourceSettingInstance__Group__5__Impl7839);
                    rule__ResourceSettingInstance__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceSettingInstanceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group__5__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group_4__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:3998:1: rule__ResourceSettingInstance__Group_4__0 : rule__ResourceSettingInstance__Group_4__0__Impl rule__ResourceSettingInstance__Group_4__1 ;
    public final void rule__ResourceSettingInstance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4002:1: ( rule__ResourceSettingInstance__Group_4__0__Impl rule__ResourceSettingInstance__Group_4__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4003:2: rule__ResourceSettingInstance__Group_4__0__Impl rule__ResourceSettingInstance__Group_4__1
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_4__0__Impl_in_rule__ResourceSettingInstance__Group_4__07882);
            rule__ResourceSettingInstance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_4__1_in_rule__ResourceSettingInstance__Group_4__07885);
            rule__ResourceSettingInstance__Group_4__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group_4__0"


    // $ANTLR start "rule__ResourceSettingInstance__Group_4__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4010:1: rule__ResourceSettingInstance__Group_4__0__Impl : ( '=' ) ;
    public final void rule__ResourceSettingInstance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4014:1: ( ( '=' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4015:1: ( '=' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4015:1: ( '=' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4016:1: '='
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getEqualsSignKeyword_4_0()); 
            match(input,35,FOLLOW_35_in_rule__ResourceSettingInstance__Group_4__0__Impl7913); 
             after(grammarAccess.getResourceSettingInstanceAccess().getEqualsSignKeyword_4_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group_4__0__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group_4__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4029:1: rule__ResourceSettingInstance__Group_4__1 : rule__ResourceSettingInstance__Group_4__1__Impl ;
    public final void rule__ResourceSettingInstance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4033:1: ( rule__ResourceSettingInstance__Group_4__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4034:2: rule__ResourceSettingInstance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_4__1__Impl_in_rule__ResourceSettingInstance__Group_4__17944);
            rule__ResourceSettingInstance__Group_4__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group_4__1"


    // $ANTLR start "rule__ResourceSettingInstance__Group_4__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4040:1: rule__ResourceSettingInstance__Group_4__1__Impl : ( ( rule__ResourceSettingInstance__StaticValueAssignment_4_1 ) ) ;
    public final void rule__ResourceSettingInstance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4044:1: ( ( ( rule__ResourceSettingInstance__StaticValueAssignment_4_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4045:1: ( ( rule__ResourceSettingInstance__StaticValueAssignment_4_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4045:1: ( ( rule__ResourceSettingInstance__StaticValueAssignment_4_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4046:1: ( rule__ResourceSettingInstance__StaticValueAssignment_4_1 )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getStaticValueAssignment_4_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4047:1: ( rule__ResourceSettingInstance__StaticValueAssignment_4_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4047:2: rule__ResourceSettingInstance__StaticValueAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__StaticValueAssignment_4_1_in_rule__ResourceSettingInstance__Group_4__1__Impl7971);
            rule__ResourceSettingInstance__StaticValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceSettingInstanceAccess().getStaticValueAssignment_4_1()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group_4__1__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4061:1: rule__ResourceSettingInstance__Group_5__0 : rule__ResourceSettingInstance__Group_5__0__Impl rule__ResourceSettingInstance__Group_5__1 ;
    public final void rule__ResourceSettingInstance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4065:1: ( rule__ResourceSettingInstance__Group_5__0__Impl rule__ResourceSettingInstance__Group_5__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4066:2: rule__ResourceSettingInstance__Group_5__0__Impl rule__ResourceSettingInstance__Group_5__1
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5__0__Impl_in_rule__ResourceSettingInstance__Group_5__08005);
            rule__ResourceSettingInstance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5__1_in_rule__ResourceSettingInstance__Group_5__08008);
            rule__ResourceSettingInstance__Group_5__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5__0"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4073:1: rule__ResourceSettingInstance__Group_5__0__Impl : ( 'assign' ) ;
    public final void rule__ResourceSettingInstance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4077:1: ( ( 'assign' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4078:1: ( 'assign' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4078:1: ( 'assign' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4079:1: 'assign'
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getAssignKeyword_5_0()); 
            match(input,36,FOLLOW_36_in_rule__ResourceSettingInstance__Group_5__0__Impl8036); 
             after(grammarAccess.getResourceSettingInstanceAccess().getAssignKeyword_5_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5__0__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4092:1: rule__ResourceSettingInstance__Group_5__1 : rule__ResourceSettingInstance__Group_5__1__Impl rule__ResourceSettingInstance__Group_5__2 ;
    public final void rule__ResourceSettingInstance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4096:1: ( rule__ResourceSettingInstance__Group_5__1__Impl rule__ResourceSettingInstance__Group_5__2 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4097:2: rule__ResourceSettingInstance__Group_5__1__Impl rule__ResourceSettingInstance__Group_5__2
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5__1__Impl_in_rule__ResourceSettingInstance__Group_5__18067);
            rule__ResourceSettingInstance__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5__2_in_rule__ResourceSettingInstance__Group_5__18070);
            rule__ResourceSettingInstance__Group_5__2();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5__1"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4104:1: rule__ResourceSettingInstance__Group_5__1__Impl : ( ( rule__ResourceSettingInstance__AssignSettingAssignment_5_1 ) ) ;
    public final void rule__ResourceSettingInstance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4108:1: ( ( ( rule__ResourceSettingInstance__AssignSettingAssignment_5_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4109:1: ( ( rule__ResourceSettingInstance__AssignSettingAssignment_5_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4109:1: ( ( rule__ResourceSettingInstance__AssignSettingAssignment_5_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4110:1: ( rule__ResourceSettingInstance__AssignSettingAssignment_5_1 )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingAssignment_5_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4111:1: ( rule__ResourceSettingInstance__AssignSettingAssignment_5_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4111:2: rule__ResourceSettingInstance__AssignSettingAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__AssignSettingAssignment_5_1_in_rule__ResourceSettingInstance__Group_5__1__Impl8097);
            rule__ResourceSettingInstance__AssignSettingAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingAssignment_5_1()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5__1__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5__2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4121:1: rule__ResourceSettingInstance__Group_5__2 : rule__ResourceSettingInstance__Group_5__2__Impl ;
    public final void rule__ResourceSettingInstance__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4125:1: ( rule__ResourceSettingInstance__Group_5__2__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4126:2: rule__ResourceSettingInstance__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5__2__Impl_in_rule__ResourceSettingInstance__Group_5__28127);
            rule__ResourceSettingInstance__Group_5__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5__2"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5__2__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4132:1: rule__ResourceSettingInstance__Group_5__2__Impl : ( ( rule__ResourceSettingInstance__Group_5_2__0 )* ) ;
    public final void rule__ResourceSettingInstance__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4136:1: ( ( ( rule__ResourceSettingInstance__Group_5_2__0 )* ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4137:1: ( ( rule__ResourceSettingInstance__Group_5_2__0 )* )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4137:1: ( ( rule__ResourceSettingInstance__Group_5_2__0 )* )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4138:1: ( rule__ResourceSettingInstance__Group_5_2__0 )*
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getGroup_5_2()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4139:1: ( rule__ResourceSettingInstance__Group_5_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==37) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4139:2: rule__ResourceSettingInstance__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5_2__0_in_rule__ResourceSettingInstance__Group_5__2__Impl8154);
            	    rule__ResourceSettingInstance__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getResourceSettingInstanceAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5__2__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5_2__0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4155:1: rule__ResourceSettingInstance__Group_5_2__0 : rule__ResourceSettingInstance__Group_5_2__0__Impl rule__ResourceSettingInstance__Group_5_2__1 ;
    public final void rule__ResourceSettingInstance__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4159:1: ( rule__ResourceSettingInstance__Group_5_2__0__Impl rule__ResourceSettingInstance__Group_5_2__1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4160:2: rule__ResourceSettingInstance__Group_5_2__0__Impl rule__ResourceSettingInstance__Group_5_2__1
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5_2__0__Impl_in_rule__ResourceSettingInstance__Group_5_2__08191);
            rule__ResourceSettingInstance__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5_2__1_in_rule__ResourceSettingInstance__Group_5_2__08194);
            rule__ResourceSettingInstance__Group_5_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5_2__0"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5_2__0__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4167:1: rule__ResourceSettingInstance__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ResourceSettingInstance__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4171:1: ( ( ',' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4172:1: ( ',' )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4172:1: ( ',' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4173:1: ','
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getCommaKeyword_5_2_0()); 
            match(input,37,FOLLOW_37_in_rule__ResourceSettingInstance__Group_5_2__0__Impl8222); 
             after(grammarAccess.getResourceSettingInstanceAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5_2__0__Impl"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5_2__1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4186:1: rule__ResourceSettingInstance__Group_5_2__1 : rule__ResourceSettingInstance__Group_5_2__1__Impl ;
    public final void rule__ResourceSettingInstance__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4190:1: ( rule__ResourceSettingInstance__Group_5_2__1__Impl )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4191:2: rule__ResourceSettingInstance__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__Group_5_2__1__Impl_in_rule__ResourceSettingInstance__Group_5_2__18253);
            rule__ResourceSettingInstance__Group_5_2__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5_2__1"


    // $ANTLR start "rule__ResourceSettingInstance__Group_5_2__1__Impl"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4197:1: rule__ResourceSettingInstance__Group_5_2__1__Impl : ( ( rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1 ) ) ;
    public final void rule__ResourceSettingInstance__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4201:1: ( ( ( rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4202:1: ( ( rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4202:1: ( ( rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4203:1: ( rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1 )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingAssignment_5_2_1()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4204:1: ( rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4204:2: rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1_in_rule__ResourceSettingInstance__Group_5_2__1__Impl8280);
            rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingAssignment_5_2_1()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__Group_5_2__1__Impl"


    // $ANTLR start "rule__RequestedFederationScenario__NameAssignment_2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4219:1: rule__RequestedFederationScenario__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RequestedFederationScenario__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4223:1: ( ( RULE_ID ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4224:1: ( RULE_ID )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4224:1: ( RULE_ID )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4225:1: RULE_ID
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RequestedFederationScenario__NameAssignment_28319); 
             after(grammarAccess.getRequestedFederationScenarioAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__NameAssignment_2"


    // $ANTLR start "rule__RequestedFederationScenario__ImportsAssignment_3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4234:1: rule__RequestedFederationScenario__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__RequestedFederationScenario__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4238:1: ( ( ruleImport ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4239:1: ( ruleImport )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4239:1: ( ruleImport )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4240:1: ruleImport
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__RequestedFederationScenario__ImportsAssignment_38350);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getRequestedFederationScenarioAccess().getImportsImportParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__ImportsAssignment_3"


    // $ANTLR start "rule__RequestedFederationScenario__IsSharedAssignment_4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4249:1: rule__RequestedFederationScenario__IsSharedAssignment_4 : ( ( 'isShared' ) ) ;
    public final void rule__RequestedFederationScenario__IsSharedAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4253:1: ( ( ( 'isShared' ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4254:1: ( ( 'isShared' ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4254:1: ( ( 'isShared' ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4255:1: ( 'isShared' )
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getIsSharedIsSharedKeyword_4_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4256:1: ( 'isShared' )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4257:1: 'isShared'
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getIsSharedIsSharedKeyword_4_0()); 
            match(input,42,FOLLOW_42_in_rule__RequestedFederationScenario__IsSharedAssignment_48386); 
             after(grammarAccess.getRequestedFederationScenarioAccess().getIsSharedIsSharedKeyword_4_0()); 

            }

             after(grammarAccess.getRequestedFederationScenarioAccess().getIsSharedIsSharedKeyword_4_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__IsSharedAssignment_4"


    // $ANTLR start "rule__RequestedFederationScenario__DescriptionAssignment_5_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4272:1: rule__RequestedFederationScenario__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__RequestedFederationScenario__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4276:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4277:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4277:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4278:1: RULE_STRING
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RequestedFederationScenario__DescriptionAssignment_5_18425); 
             after(grammarAccess.getRequestedFederationScenarioAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__DescriptionAssignment_5_1"


    // $ANTLR start "rule__RequestedFederationScenario__VTCredentialsAssignment_6_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4287:1: rule__RequestedFederationScenario__VTCredentialsAssignment_6_1 : ( ruleCredentials ) ;
    public final void rule__RequestedFederationScenario__VTCredentialsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4291:1: ( ( ruleCredentials ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4292:1: ( ruleCredentials )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4292:1: ( ruleCredentials )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4293:1: ruleCredentials
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getVTCredentialsCredentialsParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleCredentials_in_rule__RequestedFederationScenario__VTCredentialsAssignment_6_18456);
            ruleCredentials();

            state._fsp--;

             after(grammarAccess.getRequestedFederationScenarioAccess().getVTCredentialsCredentialsParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__VTCredentialsAssignment_6_1"


    // $ANTLR start "rule__RequestedFederationScenario__ScheduledPlanAssignment_7"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4302:1: rule__RequestedFederationScenario__ScheduledPlanAssignment_7 : ( ruleScheduledPlan ) ;
    public final void rule__RequestedFederationScenario__ScheduledPlanAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4306:1: ( ( ruleScheduledPlan ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4307:1: ( ruleScheduledPlan )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4307:1: ( ruleScheduledPlan )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4308:1: ruleScheduledPlan
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getScheduledPlanScheduledPlanParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleScheduledPlan_in_rule__RequestedFederationScenario__ScheduledPlanAssignment_78487);
            ruleScheduledPlan();

            state._fsp--;

             after(grammarAccess.getRequestedFederationScenarioAccess().getScheduledPlanScheduledPlanParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__ScheduledPlanAssignment_7"


    // $ANTLR start "rule__RequestedFederationScenario__ServicesRequestAssignment_8"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4317:1: rule__RequestedFederationScenario__ServicesRequestAssignment_8 : ( ruleServicesRequest ) ;
    public final void rule__RequestedFederationScenario__ServicesRequestAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4321:1: ( ( ruleServicesRequest ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4322:1: ( ruleServicesRequest )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4322:1: ( ruleServicesRequest )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4323:1: ruleServicesRequest
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getServicesRequestServicesRequestParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleServicesRequest_in_rule__RequestedFederationScenario__ServicesRequestAssignment_88518);
            ruleServicesRequest();

            state._fsp--;

             after(grammarAccess.getRequestedFederationScenarioAccess().getServicesRequestServicesRequestParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__ServicesRequestAssignment_8"


    // $ANTLR start "rule__RequestedFederationScenario__InfrastructureRequestAssignment_9"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4332:1: rule__RequestedFederationScenario__InfrastructureRequestAssignment_9 : ( ruleInfrastructureRequest ) ;
    public final void rule__RequestedFederationScenario__InfrastructureRequestAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4336:1: ( ( ruleInfrastructureRequest ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4337:1: ( ruleInfrastructureRequest )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4337:1: ( ruleInfrastructureRequest )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4338:1: ruleInfrastructureRequest
            {
             before(grammarAccess.getRequestedFederationScenarioAccess().getInfrastructureRequestInfrastructureRequestParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleInfrastructureRequest_in_rule__RequestedFederationScenario__InfrastructureRequestAssignment_98549);
            ruleInfrastructureRequest();

            state._fsp--;

             after(grammarAccess.getRequestedFederationScenarioAccess().getInfrastructureRequestInfrastructureRequestParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__RequestedFederationScenario__InfrastructureRequestAssignment_9"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4347:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4351:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4352:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4352:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4353:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_18580); 
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
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__ServicesRequest__ServiceRequestListAssignment_3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4362:1: rule__ServicesRequest__ServiceRequestListAssignment_3 : ( ruleServiceRequest ) ;
    public final void rule__ServicesRequest__ServiceRequestListAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4366:1: ( ( ruleServiceRequest ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4367:1: ( ruleServiceRequest )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4367:1: ( ruleServiceRequest )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4368:1: ruleServiceRequest
            {
             before(grammarAccess.getServicesRequestAccess().getServiceRequestListServiceRequestParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleServiceRequest_in_rule__ServicesRequest__ServiceRequestListAssignment_38611);
            ruleServiceRequest();

            state._fsp--;

             after(grammarAccess.getServicesRequestAccess().getServiceRequestListServiceRequestParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ServicesRequest__ServiceRequestListAssignment_3"


    // $ANTLR start "rule__ServiceRequest__RefServiceAssignment_2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4377:1: rule__ServiceRequest__RefServiceAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__ServiceRequest__RefServiceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4381:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4382:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4382:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4383:1: ( RULE_STRING )
            {
             before(grammarAccess.getServiceRequestAccess().getRefServiceServiceCrossReference_2_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4384:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4385:1: RULE_STRING
            {
             before(grammarAccess.getServiceRequestAccess().getRefServiceServiceSTRINGTerminalRuleCall_2_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceRequest__RefServiceAssignment_28646); 
             after(grammarAccess.getServiceRequestAccess().getRefServiceServiceSTRINGTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getServiceRequestAccess().getRefServiceServiceCrossReference_2_0()); 

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
    // $ANTLR end "rule__ServiceRequest__RefServiceAssignment_2"


    // $ANTLR start "rule__ServiceRequest__NameAssignment_4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4396:1: rule__ServiceRequest__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ServiceRequest__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4400:1: ( ( RULE_ID ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4401:1: ( RULE_ID )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4401:1: ( RULE_ID )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4402:1: RULE_ID
            {
             before(grammarAccess.getServiceRequestAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceRequest__NameAssignment_48681); 
             after(grammarAccess.getServiceRequestAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__ServiceRequest__NameAssignment_4"


    // $ANTLR start "rule__ServiceRequest__NumOfServicesAssignment_5_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4411:1: rule__ServiceRequest__NumOfServicesAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__ServiceRequest__NumOfServicesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4415:1: ( ( RULE_INT ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4416:1: ( RULE_INT )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4416:1: ( RULE_INT )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4417:1: RULE_INT
            {
             before(grammarAccess.getServiceRequestAccess().getNumOfServicesINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ServiceRequest__NumOfServicesAssignment_5_18712); 
             after(grammarAccess.getServiceRequestAccess().getNumOfServicesINTTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__ServiceRequest__NumOfServicesAssignment_5_1"


    // $ANTLR start "rule__ServiceRequest__OfferedByProvidersAssignment_6_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4426:1: rule__ServiceRequest__OfferedByProvidersAssignment_6_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ServiceRequest__OfferedByProvidersAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4430:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4431:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4431:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4432:1: ( RULE_STRING )
            {
             before(grammarAccess.getServiceRequestAccess().getOfferedByProvidersResourcesProviderCrossReference_6_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4433:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4434:1: RULE_STRING
            {
             before(grammarAccess.getServiceRequestAccess().getOfferedByProvidersResourcesProviderSTRINGTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceRequest__OfferedByProvidersAssignment_6_18747); 
             after(grammarAccess.getServiceRequestAccess().getOfferedByProvidersResourcesProviderSTRINGTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getServiceRequestAccess().getOfferedByProvidersResourcesProviderCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__ServiceRequest__OfferedByProvidersAssignment_6_1"


    // $ANTLR start "rule__ServiceRequest__ReqServiceSettingsAssignment_7_2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4445:1: rule__ServiceRequest__ReqServiceSettingsAssignment_7_2 : ( ruleServiceSettingInstance ) ;
    public final void rule__ServiceRequest__ReqServiceSettingsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4449:1: ( ( ruleServiceSettingInstance ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4450:1: ( ruleServiceSettingInstance )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4450:1: ( ruleServiceSettingInstance )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4451:1: ruleServiceSettingInstance
            {
             before(grammarAccess.getServiceRequestAccess().getReqServiceSettingsServiceSettingInstanceParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_ruleServiceSettingInstance_in_rule__ServiceRequest__ReqServiceSettingsAssignment_7_28782);
            ruleServiceSettingInstance();

            state._fsp--;

             after(grammarAccess.getServiceRequestAccess().getReqServiceSettingsServiceSettingInstanceParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__ServiceRequest__ReqServiceSettingsAssignment_7_2"


    // $ANTLR start "rule__ScheduledPlan__ValidFromAssignment_3_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4460:1: rule__ScheduledPlan__ValidFromAssignment_3_1 : ( ruleEDate ) ;
    public final void rule__ScheduledPlan__ValidFromAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4464:1: ( ( ruleEDate ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4465:1: ( ruleEDate )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4465:1: ( ruleEDate )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4466:1: ruleEDate
            {
             before(grammarAccess.getScheduledPlanAccess().getValidFromEDateParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEDate_in_rule__ScheduledPlan__ValidFromAssignment_3_18813);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getScheduledPlanAccess().getValidFromEDateParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ScheduledPlan__ValidFromAssignment_3_1"


    // $ANTLR start "rule__ScheduledPlan__ValidUntilAssignment_4_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4475:1: rule__ScheduledPlan__ValidUntilAssignment_4_1 : ( ruleEDate ) ;
    public final void rule__ScheduledPlan__ValidUntilAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4479:1: ( ( ruleEDate ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4480:1: ( ruleEDate )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4480:1: ( ruleEDate )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4481:1: ruleEDate
            {
             before(grammarAccess.getScheduledPlanAccess().getValidUntilEDateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleEDate_in_rule__ScheduledPlan__ValidUntilAssignment_4_18844);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getScheduledPlanAccess().getValidUntilEDateParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ScheduledPlan__ValidUntilAssignment_4_1"


    // $ANTLR start "rule__Credentials__NameAssignment_2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4490:1: rule__Credentials__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Credentials__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4494:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4495:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4495:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4496:1: RULE_STRING
            {
             before(grammarAccess.getCredentialsAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Credentials__NameAssignment_28875); 
             after(grammarAccess.getCredentialsAccess().getNameSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Credentials__NameAssignment_2"


    // $ANTLR start "rule__Credentials__IdAssignment_4_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4505:1: rule__Credentials__IdAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Credentials__IdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4509:1: ( ( RULE_INT ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4510:1: ( RULE_INT )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4510:1: ( RULE_INT )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4511:1: RULE_INT
            {
             before(grammarAccess.getCredentialsAccess().getIdINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Credentials__IdAssignment_4_18906); 
             after(grammarAccess.getCredentialsAccess().getIdINTTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Credentials__IdAssignment_4_1"


    // $ANTLR start "rule__Credentials__DescriptionAssignment_5_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4520:1: rule__Credentials__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Credentials__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4524:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4525:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4525:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4526:1: RULE_STRING
            {
             before(grammarAccess.getCredentialsAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Credentials__DescriptionAssignment_5_18937); 
             after(grammarAccess.getCredentialsAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Credentials__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Credentials__UsernameAssignment_6_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4535:1: rule__Credentials__UsernameAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Credentials__UsernameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4539:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4540:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4540:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4541:1: RULE_STRING
            {
             before(grammarAccess.getCredentialsAccess().getUsernameSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Credentials__UsernameAssignment_6_18968); 
             after(grammarAccess.getCredentialsAccess().getUsernameSTRINGTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Credentials__UsernameAssignment_6_1"


    // $ANTLR start "rule__Credentials__PasswordAssignment_7_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4550:1: rule__Credentials__PasswordAssignment_7_1 : ( RULE_STRING ) ;
    public final void rule__Credentials__PasswordAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4554:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4555:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4555:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4556:1: RULE_STRING
            {
             before(grammarAccess.getCredentialsAccess().getPasswordSTRINGTerminalRuleCall_7_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Credentials__PasswordAssignment_7_18999); 
             after(grammarAccess.getCredentialsAccess().getPasswordSTRINGTerminalRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Credentials__PasswordAssignment_7_1"


    // $ANTLR start "rule__ServiceSettingInstance__RefServiceSettingAssignment_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4565:1: rule__ServiceSettingInstance__RefServiceSettingAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ServiceSettingInstance__RefServiceSettingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4569:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4570:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4570:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4571:1: ( RULE_STRING )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getRefServiceSettingServiceSettingCrossReference_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4572:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4573:1: RULE_STRING
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getRefServiceSettingServiceSettingSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__RefServiceSettingAssignment_19034); 
             after(grammarAccess.getServiceSettingInstanceAccess().getRefServiceSettingServiceSettingSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getServiceSettingInstanceAccess().getRefServiceSettingServiceSettingCrossReference_1_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__RefServiceSettingAssignment_1"


    // $ANTLR start "rule__ServiceSettingInstance__NameAssignment_3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4584:1: rule__ServiceSettingInstance__NameAssignment_3 : ( ( rule__ServiceSettingInstance__NameAlternatives_3_0 ) ) ;
    public final void rule__ServiceSettingInstance__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4588:1: ( ( ( rule__ServiceSettingInstance__NameAlternatives_3_0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4589:1: ( ( rule__ServiceSettingInstance__NameAlternatives_3_0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4589:1: ( ( rule__ServiceSettingInstance__NameAlternatives_3_0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4590:1: ( rule__ServiceSettingInstance__NameAlternatives_3_0 )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getNameAlternatives_3_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4591:1: ( rule__ServiceSettingInstance__NameAlternatives_3_0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4591:2: rule__ServiceSettingInstance__NameAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__ServiceSettingInstance__NameAlternatives_3_0_in_rule__ServiceSettingInstance__NameAssignment_39069);
            rule__ServiceSettingInstance__NameAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getServiceSettingInstanceAccess().getNameAlternatives_3_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__NameAssignment_3"


    // $ANTLR start "rule__ServiceSettingInstance__StaticValueAssignment_4_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4600:1: rule__ServiceSettingInstance__StaticValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ServiceSettingInstance__StaticValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4604:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4605:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4605:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4606:1: RULE_STRING
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getStaticValueSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__StaticValueAssignment_4_19102); 
             after(grammarAccess.getServiceSettingInstanceAccess().getStaticValueSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__StaticValueAssignment_4_1"


    // $ANTLR start "rule__ServiceSettingInstance__AssignSettingAssignment_5_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4615:1: rule__ServiceSettingInstance__AssignSettingAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ServiceSettingInstance__AssignSettingAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4619:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4620:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4620:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4621:1: ( RULE_STRING )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4622:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4623:1: RULE_STRING
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceSTRINGTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__AssignSettingAssignment_5_19137); 
             after(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceSTRINGTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__AssignSettingAssignment_5_1"


    // $ANTLR start "rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4634:1: rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4638:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4639:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4639:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4640:1: ( RULE_STRING )
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_2_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4641:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4642:1: RULE_STRING
            {
             before(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceSTRINGTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__AssignSettingAssignment_5_2_19176); 
             after(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceSTRINGTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getServiceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1"


    // $ANTLR start "rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4653:1: rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3 : ( ruleResourceRequest ) ;
    public final void rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4657:1: ( ( ruleResourceRequest ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4658:1: ( ruleResourceRequest )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4658:1: ( ruleResourceRequest )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4659:1: ruleResourceRequest
            {
             before(grammarAccess.getInfrastructureRequestAccess().getReqOfferedResourcesResourceRequestParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleResourceRequest_in_rule__InfrastructureRequest__ReqOfferedResourcesAssignment_39211);
            ruleResourceRequest();

            state._fsp--;

             after(grammarAccess.getInfrastructureRequestAccess().getReqOfferedResourcesResourceRequestParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3"


    // $ANTLR start "rule__InfrastructureRequest__ResourceGroupsAssignment_4"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4668:1: rule__InfrastructureRequest__ResourceGroupsAssignment_4 : ( ruleResourceGroup ) ;
    public final void rule__InfrastructureRequest__ResourceGroupsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4672:1: ( ( ruleResourceGroup ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4673:1: ( ruleResourceGroup )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4673:1: ( ruleResourceGroup )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4674:1: ruleResourceGroup
            {
             before(grammarAccess.getInfrastructureRequestAccess().getResourceGroupsResourceGroupParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleResourceGroup_in_rule__InfrastructureRequest__ResourceGroupsAssignment_49242);
            ruleResourceGroup();

            state._fsp--;

             after(grammarAccess.getInfrastructureRequestAccess().getResourceGroupsResourceGroupParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__InfrastructureRequest__ResourceGroupsAssignment_4"


    // $ANTLR start "rule__ResourceRequest__RefOfferedResourceAssignment_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4683:1: rule__ResourceRequest__RefOfferedResourceAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ResourceRequest__RefOfferedResourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4687:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4688:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4688:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4689:1: ( RULE_STRING )
            {
             before(grammarAccess.getResourceRequestAccess().getRefOfferedResourceOfferedResourceCrossReference_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4690:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4691:1: RULE_STRING
            {
             before(grammarAccess.getResourceRequestAccess().getRefOfferedResourceOfferedResourceSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceRequest__RefOfferedResourceAssignment_19277); 
             after(grammarAccess.getResourceRequestAccess().getRefOfferedResourceOfferedResourceSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getResourceRequestAccess().getRefOfferedResourceOfferedResourceCrossReference_1_0()); 

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
    // $ANTLR end "rule__ResourceRequest__RefOfferedResourceAssignment_1"


    // $ANTLR start "rule__ResourceRequest__NameAssignment_3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4702:1: rule__ResourceRequest__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ResourceRequest__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4706:1: ( ( RULE_ID ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4707:1: ( RULE_ID )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4707:1: ( RULE_ID )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4708:1: RULE_ID
            {
             before(grammarAccess.getResourceRequestAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceRequest__NameAssignment_39312); 
             after(grammarAccess.getResourceRequestAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ResourceRequest__NameAssignment_3"


    // $ANTLR start "rule__ResourceRequest__ReqResourceSettingsAssignment_4_2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4717:1: rule__ResourceRequest__ReqResourceSettingsAssignment_4_2 : ( ruleResourceSettingInstance ) ;
    public final void rule__ResourceRequest__ReqResourceSettingsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4721:1: ( ( ruleResourceSettingInstance ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4722:1: ( ruleResourceSettingInstance )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4722:1: ( ruleResourceSettingInstance )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4723:1: ruleResourceSettingInstance
            {
             before(grammarAccess.getResourceRequestAccess().getReqResourceSettingsResourceSettingInstanceParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleResourceSettingInstance_in_rule__ResourceRequest__ReqResourceSettingsAssignment_4_29343);
            ruleResourceSettingInstance();

            state._fsp--;

             after(grammarAccess.getResourceRequestAccess().getReqResourceSettingsResourceSettingInstanceParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__ResourceRequest__ReqResourceSettingsAssignment_4_2"


    // $ANTLR start "rule__ResourceGroup__NameAssignment_2"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4732:1: rule__ResourceGroup__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ResourceGroup__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4736:1: ( ( RULE_ID ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4737:1: ( RULE_ID )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4737:1: ( RULE_ID )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4738:1: RULE_ID
            {
             before(grammarAccess.getResourceGroupAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceGroup__NameAssignment_29374); 
             after(grammarAccess.getResourceGroupAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ResourceGroup__NameAssignment_2"


    // $ANTLR start "rule__ResourceGroup__GroupedResourcesAssignment_5_0"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4747:1: rule__ResourceGroup__GroupedResourcesAssignment_5_0 : ( ( RULE_STRING ) ) ;
    public final void rule__ResourceGroup__GroupedResourcesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4751:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4752:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4752:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4753:1: ( RULE_STRING )
            {
             before(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestCrossReference_5_0_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4754:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4755:1: RULE_STRING
            {
             before(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestSTRINGTerminalRuleCall_5_0_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceGroup__GroupedResourcesAssignment_5_09409); 
             after(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestSTRINGTerminalRuleCall_5_0_0_1()); 

            }

             after(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestCrossReference_5_0_0()); 

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
    // $ANTLR end "rule__ResourceGroup__GroupedResourcesAssignment_5_0"


    // $ANTLR start "rule__ResourceGroup__GroupedResourcesAssignment_5_1_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4766:1: rule__ResourceGroup__GroupedResourcesAssignment_5_1_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ResourceGroup__GroupedResourcesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4770:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4771:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4771:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4772:1: ( RULE_STRING )
            {
             before(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestCrossReference_5_1_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4773:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4774:1: RULE_STRING
            {
             before(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestSTRINGTerminalRuleCall_5_1_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceGroup__GroupedResourcesAssignment_5_1_19448); 
             after(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestSTRINGTerminalRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getResourceGroupAccess().getGroupedResourcesResourceRequestCrossReference_5_1_1_0()); 

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
    // $ANTLR end "rule__ResourceGroup__GroupedResourcesAssignment_5_1_1"


    // $ANTLR start "rule__ResourceSettingInstance__RefResourceSettingAssignment_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4785:1: rule__ResourceSettingInstance__RefResourceSettingAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ResourceSettingInstance__RefResourceSettingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4789:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4790:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4790:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4791:1: ( RULE_STRING )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getRefResourceSettingResourceSettingCrossReference_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4792:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4793:1: RULE_STRING
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getRefResourceSettingResourceSettingSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__RefResourceSettingAssignment_19487); 
             after(grammarAccess.getResourceSettingInstanceAccess().getRefResourceSettingResourceSettingSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getResourceSettingInstanceAccess().getRefResourceSettingResourceSettingCrossReference_1_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__RefResourceSettingAssignment_1"


    // $ANTLR start "rule__ResourceSettingInstance__NameAssignment_3"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4804:1: rule__ResourceSettingInstance__NameAssignment_3 : ( ( rule__ResourceSettingInstance__NameAlternatives_3_0 ) ) ;
    public final void rule__ResourceSettingInstance__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4808:1: ( ( ( rule__ResourceSettingInstance__NameAlternatives_3_0 ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4809:1: ( ( rule__ResourceSettingInstance__NameAlternatives_3_0 ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4809:1: ( ( rule__ResourceSettingInstance__NameAlternatives_3_0 ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4810:1: ( rule__ResourceSettingInstance__NameAlternatives_3_0 )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getNameAlternatives_3_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4811:1: ( rule__ResourceSettingInstance__NameAlternatives_3_0 )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4811:2: rule__ResourceSettingInstance__NameAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__ResourceSettingInstance__NameAlternatives_3_0_in_rule__ResourceSettingInstance__NameAssignment_39522);
            rule__ResourceSettingInstance__NameAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceSettingInstanceAccess().getNameAlternatives_3_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__NameAssignment_3"


    // $ANTLR start "rule__ResourceSettingInstance__StaticValueAssignment_4_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4820:1: rule__ResourceSettingInstance__StaticValueAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__ResourceSettingInstance__StaticValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4824:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4825:1: ( RULE_STRING )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4825:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4826:1: RULE_STRING
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getStaticValueSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__StaticValueAssignment_4_19555); 
             after(grammarAccess.getResourceSettingInstanceAccess().getStaticValueSTRINGTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__StaticValueAssignment_4_1"


    // $ANTLR start "rule__ResourceSettingInstance__AssignSettingAssignment_5_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4835:1: rule__ResourceSettingInstance__AssignSettingAssignment_5_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ResourceSettingInstance__AssignSettingAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4839:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4840:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4840:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4841:1: ( RULE_STRING )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4842:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4843:1: RULE_STRING
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceSTRINGTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__AssignSettingAssignment_5_19590); 
             after(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceSTRINGTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__AssignSettingAssignment_5_1"


    // $ANTLR start "rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1"
    // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4854:1: rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1 : ( ( RULE_STRING ) ) ;
    public final void rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4858:1: ( ( ( RULE_STRING ) ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4859:1: ( ( RULE_STRING ) )
            {
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4859:1: ( ( RULE_STRING ) )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4860:1: ( RULE_STRING )
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_2_1_0()); 
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4861:1: ( RULE_STRING )
            // ../org.panlab.software.fsdl2.ui/src-gen/org/panlab/software/fsdl2/ui/contentassist/antlr/internal/InternalFSDL.g:4862:1: RULE_STRING
            {
             before(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceSTRINGTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__AssignSettingAssignment_5_2_19629); 
             after(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceSTRINGTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getResourceSettingInstanceAccess().getAssignSettingSettingInstanceCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRequestedFederationScenario_in_entryRuleRequestedFederationScenario61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequestedFederationScenario68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__0_in_ruleRequestedFederationScenario94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicesRequest_in_entryRuleServicesRequest181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServicesRequest188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__0_in_ruleServicesRequest214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceRequest_in_entryRuleServiceRequest241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceRequest248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__0_in_ruleServiceRequest274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheduledPlan_in_entryRuleScheduledPlan301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheduledPlan308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__0_in_ruleScheduledPlan334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCredentials_in_entryRuleCredentials361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCredentials368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__0_in_ruleCredentials394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceSettingInstance_in_entryRuleServiceSettingInstance421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceSettingInstance428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__0_in_ruleServiceSettingInstance454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureRequest_in_entryRuleInfrastructureRequest481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInfrastructureRequest488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__0_in_ruleInfrastructureRequest514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceRequest_in_entryRuleResourceRequest541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceRequest548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__0_in_ruleResourceRequest574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_entryRuleResourceGroup601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceGroup608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__0_in_ruleResourceGroup634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceSettingInstance_in_entryRuleResourceSettingInstance661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceSettingInstance668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__0_in_ruleResourceSettingInstance694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDate_in_entryRuleEDate721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDate728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEDate754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceSettingInstance__NameAlternatives_3_0789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__NameAlternatives_3_0806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceSettingInstance__NameAlternatives_3_0838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__NameAlternatives_3_0855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__0__Impl_in_rule__RequestedFederationScenario__Group__0885 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__1_in_rule__RequestedFederationScenario__Group__0888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__1__Impl_in_rule__RequestedFederationScenario__Group__1946 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__2_in_rule__RequestedFederationScenario__Group__1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RequestedFederationScenario__Group__1__Impl977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__2__Impl_in_rule__RequestedFederationScenario__Group__21008 = new BitSet(new long[]{0x0000044004017000L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__3_in_rule__RequestedFederationScenario__Group__21011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__NameAssignment_2_in_rule__RequestedFederationScenario__Group__2__Impl1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__3__Impl_in_rule__RequestedFederationScenario__Group__31068 = new BitSet(new long[]{0x0000044004017000L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__4_in_rule__RequestedFederationScenario__Group__31071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__ImportsAssignment_3_in_rule__RequestedFederationScenario__Group__3__Impl1098 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__4__Impl_in_rule__RequestedFederationScenario__Group__41129 = new BitSet(new long[]{0x0000044004017000L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__5_in_rule__RequestedFederationScenario__Group__41132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__IsSharedAssignment_4_in_rule__RequestedFederationScenario__Group__4__Impl1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__5__Impl_in_rule__RequestedFederationScenario__Group__51190 = new BitSet(new long[]{0x0000044004017000L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__6_in_rule__RequestedFederationScenario__Group__51193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group_5__0_in_rule__RequestedFederationScenario__Group__5__Impl1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__6__Impl_in_rule__RequestedFederationScenario__Group__61251 = new BitSet(new long[]{0x0000044004017000L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__7_in_rule__RequestedFederationScenario__Group__61254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group_6__0_in_rule__RequestedFederationScenario__Group__6__Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__7__Impl_in_rule__RequestedFederationScenario__Group__71312 = new BitSet(new long[]{0x0000044004017000L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__8_in_rule__RequestedFederationScenario__Group__71315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__ScheduledPlanAssignment_7_in_rule__RequestedFederationScenario__Group__7__Impl1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__8__Impl_in_rule__RequestedFederationScenario__Group__81373 = new BitSet(new long[]{0x0000044004017000L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__9_in_rule__RequestedFederationScenario__Group__81376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__ServicesRequestAssignment_8_in_rule__RequestedFederationScenario__Group__8__Impl1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group__9__Impl_in_rule__RequestedFederationScenario__Group__91434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__InfrastructureRequestAssignment_9_in_rule__RequestedFederationScenario__Group__9__Impl1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group_5__0__Impl_in_rule__RequestedFederationScenario__Group_5__01512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group_5__1_in_rule__RequestedFederationScenario__Group_5__01515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RequestedFederationScenario__Group_5__0__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group_5__1__Impl_in_rule__RequestedFederationScenario__Group_5__11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__DescriptionAssignment_5_1_in_rule__RequestedFederationScenario__Group_5__1__Impl1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group_6__0__Impl_in_rule__RequestedFederationScenario__Group_6__01635 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group_6__1_in_rule__RequestedFederationScenario__Group_6__01638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RequestedFederationScenario__Group_6__0__Impl1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__Group_6__1__Impl_in_rule__RequestedFederationScenario__Group_6__11697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequestedFederationScenario__VTCredentialsAssignment_6_1_in_rule__RequestedFederationScenario__Group_6__1__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Import__Group__0__Impl1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11820 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Import__Group__2_in_rule__Import__Group__11823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__2__Impl_in_rule__Import__Group__21880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Import__Group__2__Impl1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__0__Impl_in_rule__ServicesRequest__Group__01945 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__1_in_rule__ServicesRequest__Group__01948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__1__Impl_in_rule__ServicesRequest__Group__12006 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__2_in_rule__ServicesRequest__Group__12009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ServicesRequest__Group__1__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__2__Impl_in_rule__ServicesRequest__Group__22068 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__3_in_rule__ServicesRequest__Group__22071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ServicesRequest__Group__2__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__3__Impl_in_rule__ServicesRequest__Group__32130 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__4_in_rule__ServicesRequest__Group__32133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServicesRequest__ServiceRequestListAssignment_3_in_rule__ServicesRequest__Group__3__Impl2160 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ServicesRequest__Group__4__Impl_in_rule__ServicesRequest__Group__42191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ServicesRequest__Group__4__Impl2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__0__Impl_in_rule__ServiceRequest__Group__02260 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__1_in_rule__ServiceRequest__Group__02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__1__Impl_in_rule__ServiceRequest__Group__12321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__2_in_rule__ServiceRequest__Group__12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ServiceRequest__Group__1__Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__2__Impl_in_rule__ServiceRequest__Group__22383 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__3_in_rule__ServiceRequest__Group__22386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__RefServiceAssignment_2_in_rule__ServiceRequest__Group__2__Impl2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__3__Impl_in_rule__ServiceRequest__Group__32443 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__4_in_rule__ServiceRequest__Group__32446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ServiceRequest__Group__3__Impl2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__4__Impl_in_rule__ServiceRequest__Group__42505 = new BitSet(new long[]{0x0000000002A00000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__5_in_rule__ServiceRequest__Group__42508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__NameAssignment_4_in_rule__ServiceRequest__Group__4__Impl2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__5__Impl_in_rule__ServiceRequest__Group__52565 = new BitSet(new long[]{0x0000000002A00000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__6_in_rule__ServiceRequest__Group__52568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_5__0_in_rule__ServiceRequest__Group__5__Impl2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__6__Impl_in_rule__ServiceRequest__Group__62626 = new BitSet(new long[]{0x0000000002A00000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__7_in_rule__ServiceRequest__Group__62629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_6__0_in_rule__ServiceRequest__Group__6__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group__7__Impl_in_rule__ServiceRequest__Group__72687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_7__0_in_rule__ServiceRequest__Group__7__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_5__0__Impl_in_rule__ServiceRequest__Group_5__02761 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_5__1_in_rule__ServiceRequest__Group_5__02764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ServiceRequest__Group_5__0__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_5__1__Impl_in_rule__ServiceRequest__Group_5__12823 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_5__2_in_rule__ServiceRequest__Group_5__12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__NumOfServicesAssignment_5_1_in_rule__ServiceRequest__Group_5__1__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_5__2__Impl_in_rule__ServiceRequest__Group_5__22883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ServiceRequest__Group_5__2__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_6__0__Impl_in_rule__ServiceRequest__Group_6__02948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_6__1_in_rule__ServiceRequest__Group_6__02951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ServiceRequest__Group_6__0__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_6__1__Impl_in_rule__ServiceRequest__Group_6__13010 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_6__2_in_rule__ServiceRequest__Group_6__13013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__OfferedByProvidersAssignment_6_1_in_rule__ServiceRequest__Group_6__1__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_6__2__Impl_in_rule__ServiceRequest__Group_6__23070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ServiceRequest__Group_6__2__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_7__0__Impl_in_rule__ServiceRequest__Group_7__03138 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_7__1_in_rule__ServiceRequest__Group_7__03141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ServiceRequest__Group_7__0__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_7__1__Impl_in_rule__ServiceRequest__Group_7__13200 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_7__2_in_rule__ServiceRequest__Group_7__13203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ServiceRequest__Group_7__1__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_7__2__Impl_in_rule__ServiceRequest__Group_7__23262 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_7__3_in_rule__ServiceRequest__Group_7__23265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__ReqServiceSettingsAssignment_7_2_in_rule__ServiceRequest__Group_7__2__Impl3292 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ServiceRequest__Group_7__3__Impl_in_rule__ServiceRequest__Group_7__33323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ServiceRequest__Group_7__3__Impl3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__0__Impl_in_rule__ScheduledPlan__Group__03390 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__1_in_rule__ScheduledPlan__Group__03393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__1__Impl_in_rule__ScheduledPlan__Group__13451 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__2_in_rule__ScheduledPlan__Group__13454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ScheduledPlan__Group__1__Impl3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__2__Impl_in_rule__ScheduledPlan__Group__23513 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__3_in_rule__ScheduledPlan__Group__23516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ScheduledPlan__Group__2__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__3__Impl_in_rule__ScheduledPlan__Group__33575 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__4_in_rule__ScheduledPlan__Group__33578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group_3__0_in_rule__ScheduledPlan__Group__3__Impl3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__4__Impl_in_rule__ScheduledPlan__Group__43636 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__5_in_rule__ScheduledPlan__Group__43639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group_4__0_in_rule__ScheduledPlan__Group__4__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group__5__Impl_in_rule__ScheduledPlan__Group__53697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ScheduledPlan__Group__5__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group_3__0__Impl_in_rule__ScheduledPlan__Group_3__03768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group_3__1_in_rule__ScheduledPlan__Group_3__03771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ScheduledPlan__Group_3__0__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group_3__1__Impl_in_rule__ScheduledPlan__Group_3__13830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__ValidFromAssignment_3_1_in_rule__ScheduledPlan__Group_3__1__Impl3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group_4__0__Impl_in_rule__ScheduledPlan__Group_4__03891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group_4__1_in_rule__ScheduledPlan__Group_4__03894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ScheduledPlan__Group_4__0__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__Group_4__1__Impl_in_rule__ScheduledPlan__Group_4__13953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScheduledPlan__ValidUntilAssignment_4_1_in_rule__ScheduledPlan__Group_4__1__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__0__Impl_in_rule__Credentials__Group__04014 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Credentials__Group__1_in_rule__Credentials__Group__04017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__1__Impl_in_rule__Credentials__Group__14075 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Credentials__Group__2_in_rule__Credentials__Group__14078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Credentials__Group__1__Impl4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__2__Impl_in_rule__Credentials__Group__24137 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Credentials__Group__3_in_rule__Credentials__Group__24140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__NameAssignment_2_in_rule__Credentials__Group__2__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__3__Impl_in_rule__Credentials__Group__34197 = new BitSet(new long[]{0x00000001E0040000L});
    public static final BitSet FOLLOW_rule__Credentials__Group__4_in_rule__Credentials__Group__34200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Credentials__Group__3__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__4__Impl_in_rule__Credentials__Group__44259 = new BitSet(new long[]{0x00000001E0040000L});
    public static final BitSet FOLLOW_rule__Credentials__Group__5_in_rule__Credentials__Group__44262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_4__0_in_rule__Credentials__Group__4__Impl4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__5__Impl_in_rule__Credentials__Group__54320 = new BitSet(new long[]{0x00000001E0040000L});
    public static final BitSet FOLLOW_rule__Credentials__Group__6_in_rule__Credentials__Group__54323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_5__0_in_rule__Credentials__Group__5__Impl4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__6__Impl_in_rule__Credentials__Group__64381 = new BitSet(new long[]{0x00000001E0040000L});
    public static final BitSet FOLLOW_rule__Credentials__Group__7_in_rule__Credentials__Group__64384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_6__0_in_rule__Credentials__Group__6__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__7__Impl_in_rule__Credentials__Group__74442 = new BitSet(new long[]{0x00000001E0040000L});
    public static final BitSet FOLLOW_rule__Credentials__Group__8_in_rule__Credentials__Group__74445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_7__0_in_rule__Credentials__Group__7__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group__8__Impl_in_rule__Credentials__Group__84503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Credentials__Group__8__Impl4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_4__0__Impl_in_rule__Credentials__Group_4__04580 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Credentials__Group_4__1_in_rule__Credentials__Group_4__04583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Credentials__Group_4__0__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_4__1__Impl_in_rule__Credentials__Group_4__14642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__IdAssignment_4_1_in_rule__Credentials__Group_4__1__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_5__0__Impl_in_rule__Credentials__Group_5__04703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Credentials__Group_5__1_in_rule__Credentials__Group_5__04706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Credentials__Group_5__0__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_5__1__Impl_in_rule__Credentials__Group_5__14765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__DescriptionAssignment_5_1_in_rule__Credentials__Group_5__1__Impl4792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_6__0__Impl_in_rule__Credentials__Group_6__04826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Credentials__Group_6__1_in_rule__Credentials__Group_6__04829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Credentials__Group_6__0__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_6__1__Impl_in_rule__Credentials__Group_6__14888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__UsernameAssignment_6_1_in_rule__Credentials__Group_6__1__Impl4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_7__0__Impl_in_rule__Credentials__Group_7__04949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Credentials__Group_7__1_in_rule__Credentials__Group_7__04952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Credentials__Group_7__0__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__Group_7__1__Impl_in_rule__Credentials__Group_7__15011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Credentials__PasswordAssignment_7_1_in_rule__Credentials__Group_7__1__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__0__Impl_in_rule__ServiceSettingInstance__Group__05072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__1_in_rule__ServiceSettingInstance__Group__05075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ServiceSettingInstance__Group__0__Impl5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__1__Impl_in_rule__ServiceSettingInstance__Group__15134 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__2_in_rule__ServiceSettingInstance__Group__15137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__RefServiceSettingAssignment_1_in_rule__ServiceSettingInstance__Group__1__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__2__Impl_in_rule__ServiceSettingInstance__Group__25194 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__3_in_rule__ServiceSettingInstance__Group__25197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ServiceSettingInstance__Group__2__Impl5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__3__Impl_in_rule__ServiceSettingInstance__Group__35256 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__4_in_rule__ServiceSettingInstance__Group__35259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__NameAssignment_3_in_rule__ServiceSettingInstance__Group__3__Impl5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__4__Impl_in_rule__ServiceSettingInstance__Group__45316 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__5_in_rule__ServiceSettingInstance__Group__45319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_4__0_in_rule__ServiceSettingInstance__Group__4__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group__5__Impl_in_rule__ServiceSettingInstance__Group__55377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5__0_in_rule__ServiceSettingInstance__Group__5__Impl5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_4__0__Impl_in_rule__ServiceSettingInstance__Group_4__05447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_4__1_in_rule__ServiceSettingInstance__Group_4__05450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ServiceSettingInstance__Group_4__0__Impl5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_4__1__Impl_in_rule__ServiceSettingInstance__Group_4__15509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__StaticValueAssignment_4_1_in_rule__ServiceSettingInstance__Group_4__1__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5__0__Impl_in_rule__ServiceSettingInstance__Group_5__05570 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5__1_in_rule__ServiceSettingInstance__Group_5__05573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ServiceSettingInstance__Group_5__0__Impl5601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5__1__Impl_in_rule__ServiceSettingInstance__Group_5__15632 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5__2_in_rule__ServiceSettingInstance__Group_5__15635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__AssignSettingAssignment_5_1_in_rule__ServiceSettingInstance__Group_5__1__Impl5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5__2__Impl_in_rule__ServiceSettingInstance__Group_5__25692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5_2__0_in_rule__ServiceSettingInstance__Group_5__2__Impl5719 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5_2__0__Impl_in_rule__ServiceSettingInstance__Group_5_2__05756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5_2__1_in_rule__ServiceSettingInstance__Group_5_2__05759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ServiceSettingInstance__Group_5_2__0__Impl5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__Group_5_2__1__Impl_in_rule__ServiceSettingInstance__Group_5_2__15818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__AssignSettingAssignment_5_2_1_in_rule__ServiceSettingInstance__Group_5_2__1__Impl5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__0__Impl_in_rule__InfrastructureRequest__Group__05879 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__1_in_rule__InfrastructureRequest__Group__05882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__1__Impl_in_rule__InfrastructureRequest__Group__15940 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__2_in_rule__InfrastructureRequest__Group__15943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__InfrastructureRequest__Group__1__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__2__Impl_in_rule__InfrastructureRequest__Group__26002 = new BitSet(new long[]{0x0000018000040000L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__3_in_rule__InfrastructureRequest__Group__26005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InfrastructureRequest__Group__2__Impl6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__3__Impl_in_rule__InfrastructureRequest__Group__36064 = new BitSet(new long[]{0x0000018000040000L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__4_in_rule__InfrastructureRequest__Group__36067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__ReqOfferedResourcesAssignment_3_in_rule__InfrastructureRequest__Group__3__Impl6094 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__4__Impl_in_rule__InfrastructureRequest__Group__46125 = new BitSet(new long[]{0x0000018000040000L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__5_in_rule__InfrastructureRequest__Group__46128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__ResourceGroupsAssignment_4_in_rule__InfrastructureRequest__Group__4__Impl6155 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__InfrastructureRequest__Group__5__Impl_in_rule__InfrastructureRequest__Group__56186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__InfrastructureRequest__Group__5__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__0__Impl_in_rule__ResourceRequest__Group__06257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__1_in_rule__ResourceRequest__Group__06260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ResourceRequest__Group__0__Impl6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__1__Impl_in_rule__ResourceRequest__Group__16319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__2_in_rule__ResourceRequest__Group__16322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__RefOfferedResourceAssignment_1_in_rule__ResourceRequest__Group__1__Impl6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__2__Impl_in_rule__ResourceRequest__Group__26379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__3_in_rule__ResourceRequest__Group__26382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ResourceRequest__Group__2__Impl6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__3__Impl_in_rule__ResourceRequest__Group__36441 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__4_in_rule__ResourceRequest__Group__36444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__NameAssignment_3_in_rule__ResourceRequest__Group__3__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group__4__Impl_in_rule__ResourceRequest__Group__46501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group_4__0_in_rule__ResourceRequest__Group__4__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group_4__0__Impl_in_rule__ResourceRequest__Group_4__06569 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group_4__1_in_rule__ResourceRequest__Group_4__06572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ResourceRequest__Group_4__0__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group_4__1__Impl_in_rule__ResourceRequest__Group_4__16631 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group_4__2_in_rule__ResourceRequest__Group_4__16634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ResourceRequest__Group_4__1__Impl6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group_4__2__Impl_in_rule__ResourceRequest__Group_4__26693 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group_4__3_in_rule__ResourceRequest__Group_4__26696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__ReqResourceSettingsAssignment_4_2_in_rule__ResourceRequest__Group_4__2__Impl6723 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__ResourceRequest__Group_4__3__Impl_in_rule__ResourceRequest__Group_4__36754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ResourceRequest__Group_4__3__Impl6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__0__Impl_in_rule__ResourceGroup__Group__06821 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__1_in_rule__ResourceGroup__Group__06824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__1__Impl_in_rule__ResourceGroup__Group__16882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__2_in_rule__ResourceGroup__Group__16885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ResourceGroup__Group__1__Impl6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__2__Impl_in_rule__ResourceGroup__Group__26944 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__3_in_rule__ResourceGroup__Group__26947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__NameAssignment_2_in_rule__ResourceGroup__Group__2__Impl6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__3__Impl_in_rule__ResourceGroup__Group__37004 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__4_in_rule__ResourceGroup__Group__37007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ResourceGroup__Group__3__Impl7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__4__Impl_in_rule__ResourceGroup__Group__47066 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__5_in_rule__ResourceGroup__Group__47069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ResourceGroup__Group__4__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__5__Impl_in_rule__ResourceGroup__Group__57128 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__6_in_rule__ResourceGroup__Group__57131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group_5__0_in_rule__ResourceGroup__Group__5__Impl7158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group__6__Impl_in_rule__ResourceGroup__Group__67189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ResourceGroup__Group__6__Impl7217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group_5__0__Impl_in_rule__ResourceGroup__Group_5__07262 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group_5__1_in_rule__ResourceGroup__Group_5__07265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__GroupedResourcesAssignment_5_0_in_rule__ResourceGroup__Group_5__0__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group_5__1__Impl_in_rule__ResourceGroup__Group_5__17322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group_5_1__0_in_rule__ResourceGroup__Group_5__1__Impl7349 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group_5_1__0__Impl_in_rule__ResourceGroup__Group_5_1__07384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group_5_1__1_in_rule__ResourceGroup__Group_5_1__07387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ResourceGroup__Group_5_1__0__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__Group_5_1__1__Impl_in_rule__ResourceGroup__Group_5_1__17446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceGroup__GroupedResourcesAssignment_5_1_1_in_rule__ResourceGroup__Group_5_1__1__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__0__Impl_in_rule__ResourceSettingInstance__Group__07507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__1_in_rule__ResourceSettingInstance__Group__07510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ResourceSettingInstance__Group__0__Impl7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__1__Impl_in_rule__ResourceSettingInstance__Group__17569 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__2_in_rule__ResourceSettingInstance__Group__17572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__RefResourceSettingAssignment_1_in_rule__ResourceSettingInstance__Group__1__Impl7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__2__Impl_in_rule__ResourceSettingInstance__Group__27629 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__3_in_rule__ResourceSettingInstance__Group__27632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ResourceSettingInstance__Group__2__Impl7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__3__Impl_in_rule__ResourceSettingInstance__Group__37691 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__4_in_rule__ResourceSettingInstance__Group__37694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__NameAssignment_3_in_rule__ResourceSettingInstance__Group__3__Impl7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__4__Impl_in_rule__ResourceSettingInstance__Group__47751 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__5_in_rule__ResourceSettingInstance__Group__47754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_4__0_in_rule__ResourceSettingInstance__Group__4__Impl7781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group__5__Impl_in_rule__ResourceSettingInstance__Group__57812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5__0_in_rule__ResourceSettingInstance__Group__5__Impl7839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_4__0__Impl_in_rule__ResourceSettingInstance__Group_4__07882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_4__1_in_rule__ResourceSettingInstance__Group_4__07885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ResourceSettingInstance__Group_4__0__Impl7913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_4__1__Impl_in_rule__ResourceSettingInstance__Group_4__17944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__StaticValueAssignment_4_1_in_rule__ResourceSettingInstance__Group_4__1__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5__0__Impl_in_rule__ResourceSettingInstance__Group_5__08005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5__1_in_rule__ResourceSettingInstance__Group_5__08008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ResourceSettingInstance__Group_5__0__Impl8036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5__1__Impl_in_rule__ResourceSettingInstance__Group_5__18067 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5__2_in_rule__ResourceSettingInstance__Group_5__18070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__AssignSettingAssignment_5_1_in_rule__ResourceSettingInstance__Group_5__1__Impl8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5__2__Impl_in_rule__ResourceSettingInstance__Group_5__28127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5_2__0_in_rule__ResourceSettingInstance__Group_5__2__Impl8154 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5_2__0__Impl_in_rule__ResourceSettingInstance__Group_5_2__08191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5_2__1_in_rule__ResourceSettingInstance__Group_5_2__08194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ResourceSettingInstance__Group_5_2__0__Impl8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__Group_5_2__1__Impl_in_rule__ResourceSettingInstance__Group_5_2__18253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__AssignSettingAssignment_5_2_1_in_rule__ResourceSettingInstance__Group_5_2__1__Impl8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RequestedFederationScenario__NameAssignment_28319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__RequestedFederationScenario__ImportsAssignment_38350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__RequestedFederationScenario__IsSharedAssignment_48386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RequestedFederationScenario__DescriptionAssignment_5_18425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCredentials_in_rule__RequestedFederationScenario__VTCredentialsAssignment_6_18456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheduledPlan_in_rule__RequestedFederationScenario__ScheduledPlanAssignment_78487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServicesRequest_in_rule__RequestedFederationScenario__ServicesRequestAssignment_88518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInfrastructureRequest_in_rule__RequestedFederationScenario__InfrastructureRequestAssignment_98549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_18580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceRequest_in_rule__ServicesRequest__ServiceRequestListAssignment_38611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceRequest__RefServiceAssignment_28646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceRequest__NameAssignment_48681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ServiceRequest__NumOfServicesAssignment_5_18712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceRequest__OfferedByProvidersAssignment_6_18747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceSettingInstance_in_rule__ServiceRequest__ReqServiceSettingsAssignment_7_28782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDate_in_rule__ScheduledPlan__ValidFromAssignment_3_18813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDate_in_rule__ScheduledPlan__ValidUntilAssignment_4_18844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Credentials__NameAssignment_28875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Credentials__IdAssignment_4_18906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Credentials__DescriptionAssignment_5_18937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Credentials__UsernameAssignment_6_18968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Credentials__PasswordAssignment_7_18999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__RefServiceSettingAssignment_19034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceSettingInstance__NameAlternatives_3_0_in_rule__ServiceSettingInstance__NameAssignment_39069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__StaticValueAssignment_4_19102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__AssignSettingAssignment_5_19137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ServiceSettingInstance__AssignSettingAssignment_5_2_19176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceRequest_in_rule__InfrastructureRequest__ReqOfferedResourcesAssignment_39211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceGroup_in_rule__InfrastructureRequest__ResourceGroupsAssignment_49242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceRequest__RefOfferedResourceAssignment_19277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceRequest__NameAssignment_39312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceSettingInstance_in_rule__ResourceRequest__ReqResourceSettingsAssignment_4_29343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceGroup__NameAssignment_29374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceGroup__GroupedResourcesAssignment_5_09409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceGroup__GroupedResourcesAssignment_5_1_19448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__RefResourceSettingAssignment_19487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceSettingInstance__NameAlternatives_3_0_in_rule__ResourceSettingInstance__NameAssignment_39522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__StaticValueAssignment_4_19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__AssignSettingAssignment_5_19590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ResourceSettingInstance__AssignSettingAssignment_5_2_19629 = new BitSet(new long[]{0x0000000000000002L});

}