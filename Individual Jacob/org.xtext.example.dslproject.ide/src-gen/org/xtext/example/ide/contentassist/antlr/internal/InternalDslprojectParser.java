package org.xtext.example.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.DslprojectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslprojectParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'", "'Intent'", "'extends'", "'Entity'", "'['", "']'", "'='", "'with'", "'get'", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'->'", "'require'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslprojectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslprojectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslprojectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDslproject.g"; }


    	private DslprojectGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslprojectGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalDslproject.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDslproject.g:54:1: ( ruleModel EOF )
            // InternalDslproject.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDslproject.g:62:1: ruleModel : ( ( rule__Model__AgentAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:66:2: ( ( ( rule__Model__AgentAssignment )* ) )
            // InternalDslproject.g:67:2: ( ( rule__Model__AgentAssignment )* )
            {
            // InternalDslproject.g:67:2: ( ( rule__Model__AgentAssignment )* )
            // InternalDslproject.g:68:3: ( rule__Model__AgentAssignment )*
            {
             before(grammarAccess.getModelAccess().getAgentAssignment()); 
            // InternalDslproject.g:69:3: ( rule__Model__AgentAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24||LA1_0==26||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDslproject.g:69:4: rule__Model__AgentAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__AgentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAgentAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAgent"
    // InternalDslproject.g:78:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // InternalDslproject.g:79:1: ( ruleAgent EOF )
            // InternalDslproject.g:80:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalDslproject.g:87:1: ruleAgent : ( ( rule__Agent__Alternatives ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:91:2: ( ( ( rule__Agent__Alternatives ) ) )
            // InternalDslproject.g:92:2: ( ( rule__Agent__Alternatives ) )
            {
            // InternalDslproject.g:92:2: ( ( rule__Agent__Alternatives ) )
            // InternalDslproject.g:93:3: ( rule__Agent__Alternatives )
            {
             before(grammarAccess.getAgentAccess().getAlternatives()); 
            // InternalDslproject.g:94:3: ( rule__Agent__Alternatives )
            // InternalDslproject.g:94:4: rule__Agent__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Agent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAgentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleIntent"
    // InternalDslproject.g:103:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // InternalDslproject.g:104:1: ( ruleIntent EOF )
            // InternalDslproject.g:105:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalDslproject.g:112:1: ruleIntent : ( ( rule__Intent__Group__0 ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:116:2: ( ( ( rule__Intent__Group__0 ) ) )
            // InternalDslproject.g:117:2: ( ( rule__Intent__Group__0 ) )
            {
            // InternalDslproject.g:117:2: ( ( rule__Intent__Group__0 ) )
            // InternalDslproject.g:118:3: ( rule__Intent__Group__0 )
            {
             before(grammarAccess.getIntentAccess().getGroup()); 
            // InternalDslproject.g:119:3: ( rule__Intent__Group__0 )
            // InternalDslproject.g:119:4: rule__Intent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleEntity"
    // InternalDslproject.g:128:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDslproject.g:129:1: ( ruleEntity EOF )
            // InternalDslproject.g:130:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDslproject.g:137:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:141:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDslproject.g:142:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDslproject.g:142:2: ( ( rule__Entity__Group__0 ) )
            // InternalDslproject.g:143:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDslproject.g:144:3: ( rule__Entity__Group__0 )
            // InternalDslproject.g:144:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleQuestionRef"
    // InternalDslproject.g:153:1: entryRuleQuestionRef : ruleQuestionRef EOF ;
    public final void entryRuleQuestionRef() throws RecognitionException {
        try {
            // InternalDslproject.g:154:1: ( ruleQuestionRef EOF )
            // InternalDslproject.g:155:1: ruleQuestionRef EOF
            {
             before(grammarAccess.getQuestionRefRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionRef();

            state._fsp--;

             after(grammarAccess.getQuestionRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestionRef"


    // $ANTLR start "ruleQuestionRef"
    // InternalDslproject.g:162:1: ruleQuestionRef : ( ( rule__QuestionRef__Alternatives ) ) ;
    public final void ruleQuestionRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:166:2: ( ( ( rule__QuestionRef__Alternatives ) ) )
            // InternalDslproject.g:167:2: ( ( rule__QuestionRef__Alternatives ) )
            {
            // InternalDslproject.g:167:2: ( ( rule__QuestionRef__Alternatives ) )
            // InternalDslproject.g:168:3: ( rule__QuestionRef__Alternatives )
            {
             before(grammarAccess.getQuestionRefAccess().getAlternatives()); 
            // InternalDslproject.g:169:3: ( rule__QuestionRef__Alternatives )
            // InternalDslproject.g:169:4: rule__QuestionRef__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QuestionRef__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionRefAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionRef"


    // $ANTLR start "entryRuleQuestion"
    // InternalDslproject.g:178:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalDslproject.g:179:1: ( ruleQuestion EOF )
            // InternalDslproject.g:180:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalDslproject.g:187:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:191:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalDslproject.g:192:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalDslproject.g:192:2: ( ( rule__Question__Group__0 ) )
            // InternalDslproject.g:193:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalDslproject.g:194:3: ( rule__Question__Group__0 )
            // InternalDslproject.g:194:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleSuperQuestion"
    // InternalDslproject.g:203:1: entryRuleSuperQuestion : ruleSuperQuestion EOF ;
    public final void entryRuleSuperQuestion() throws RecognitionException {
        try {
            // InternalDslproject.g:204:1: ( ruleSuperQuestion EOF )
            // InternalDslproject.g:205:1: ruleSuperQuestion EOF
            {
             before(grammarAccess.getSuperQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperQuestion();

            state._fsp--;

             after(grammarAccess.getSuperQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSuperQuestion"


    // $ANTLR start "ruleSuperQuestion"
    // InternalDslproject.g:212:1: ruleSuperQuestion : ( ( rule__SuperQuestion__Group__0 ) ) ;
    public final void ruleSuperQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:216:2: ( ( ( rule__SuperQuestion__Group__0 ) ) )
            // InternalDslproject.g:217:2: ( ( rule__SuperQuestion__Group__0 ) )
            {
            // InternalDslproject.g:217:2: ( ( rule__SuperQuestion__Group__0 ) )
            // InternalDslproject.g:218:3: ( rule__SuperQuestion__Group__0 )
            {
             before(grammarAccess.getSuperQuestionAccess().getGroup()); 
            // InternalDslproject.g:219:3: ( rule__SuperQuestion__Group__0 )
            // InternalDslproject.g:219:4: rule__SuperQuestion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SuperQuestion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuperQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperQuestion"


    // $ANTLR start "entryRuleQuestionEntity"
    // InternalDslproject.g:228:1: entryRuleQuestionEntity : ruleQuestionEntity EOF ;
    public final void entryRuleQuestionEntity() throws RecognitionException {
        try {
            // InternalDslproject.g:229:1: ( ruleQuestionEntity EOF )
            // InternalDslproject.g:230:1: ruleQuestionEntity EOF
            {
             before(grammarAccess.getQuestionEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionEntity();

            state._fsp--;

             after(grammarAccess.getQuestionEntityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestionEntity"


    // $ANTLR start "ruleQuestionEntity"
    // InternalDslproject.g:237:1: ruleQuestionEntity : ( ( rule__QuestionEntity__WithEntityAssignment ) ) ;
    public final void ruleQuestionEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:241:2: ( ( ( rule__QuestionEntity__WithEntityAssignment ) ) )
            // InternalDslproject.g:242:2: ( ( rule__QuestionEntity__WithEntityAssignment ) )
            {
            // InternalDslproject.g:242:2: ( ( rule__QuestionEntity__WithEntityAssignment ) )
            // InternalDslproject.g:243:3: ( rule__QuestionEntity__WithEntityAssignment )
            {
             before(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); 
            // InternalDslproject.g:244:3: ( rule__QuestionEntity__WithEntityAssignment )
            // InternalDslproject.g:244:4: rule__QuestionEntity__WithEntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QuestionEntity__WithEntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQuestionEntityAccess().getWithEntityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionEntity"


    // $ANTLR start "entryRuleTraining"
    // InternalDslproject.g:253:1: entryRuleTraining : ruleTraining EOF ;
    public final void entryRuleTraining() throws RecognitionException {
        try {
            // InternalDslproject.g:254:1: ( ruleTraining EOF )
            // InternalDslproject.g:255:1: ruleTraining EOF
            {
             before(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getTrainingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalDslproject.g:262:1: ruleTraining : ( ( rule__Training__Group__0 ) ) ;
    public final void ruleTraining() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:266:2: ( ( ( rule__Training__Group__0 ) ) )
            // InternalDslproject.g:267:2: ( ( rule__Training__Group__0 ) )
            {
            // InternalDslproject.g:267:2: ( ( rule__Training__Group__0 ) )
            // InternalDslproject.g:268:3: ( rule__Training__Group__0 )
            {
             before(grammarAccess.getTrainingAccess().getGroup()); 
            // InternalDslproject.g:269:3: ( rule__Training__Group__0 )
            // InternalDslproject.g:269:4: rule__Training__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleTrainingRef"
    // InternalDslproject.g:278:1: entryRuleTrainingRef : ruleTrainingRef EOF ;
    public final void entryRuleTrainingRef() throws RecognitionException {
        try {
            // InternalDslproject.g:279:1: ( ruleTrainingRef EOF )
            // InternalDslproject.g:280:1: ruleTrainingRef EOF
            {
             before(grammarAccess.getTrainingRefRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingRef();

            state._fsp--;

             after(grammarAccess.getTrainingRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrainingRef"


    // $ANTLR start "ruleTrainingRef"
    // InternalDslproject.g:287:1: ruleTrainingRef : ( ( rule__TrainingRef__Group__0 ) ) ;
    public final void ruleTrainingRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:291:2: ( ( ( rule__TrainingRef__Group__0 ) ) )
            // InternalDslproject.g:292:2: ( ( rule__TrainingRef__Group__0 ) )
            {
            // InternalDslproject.g:292:2: ( ( rule__TrainingRef__Group__0 ) )
            // InternalDslproject.g:293:3: ( rule__TrainingRef__Group__0 )
            {
             before(grammarAccess.getTrainingRefAccess().getGroup()); 
            // InternalDslproject.g:294:3: ( rule__TrainingRef__Group__0 )
            // InternalDslproject.g:294:4: rule__TrainingRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainingRef"


    // $ANTLR start "entryRuleTrainingInput"
    // InternalDslproject.g:303:1: entryRuleTrainingInput : ruleTrainingInput EOF ;
    public final void entryRuleTrainingInput() throws RecognitionException {
        try {
            // InternalDslproject.g:304:1: ( ruleTrainingInput EOF )
            // InternalDslproject.g:305:1: ruleTrainingInput EOF
            {
             before(grammarAccess.getTrainingInputRule()); 
            pushFollow(FOLLOW_1);
            ruleTrainingInput();

            state._fsp--;

             after(grammarAccess.getTrainingInputRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrainingInput"


    // $ANTLR start "ruleTrainingInput"
    // InternalDslproject.g:312:1: ruleTrainingInput : ( ( rule__TrainingInput__Alternatives ) ) ;
    public final void ruleTrainingInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:316:2: ( ( ( rule__TrainingInput__Alternatives ) ) )
            // InternalDslproject.g:317:2: ( ( rule__TrainingInput__Alternatives ) )
            {
            // InternalDslproject.g:317:2: ( ( rule__TrainingInput__Alternatives ) )
            // InternalDslproject.g:318:3: ( rule__TrainingInput__Alternatives )
            {
             before(grammarAccess.getTrainingInputAccess().getAlternatives()); 
            // InternalDslproject.g:319:3: ( rule__TrainingInput__Alternatives )
            // InternalDslproject.g:319:4: rule__TrainingInput__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TrainingInput__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTrainingInputAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainingInput"


    // $ANTLR start "entryRuleDeclaration"
    // InternalDslproject.g:328:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalDslproject.g:329:1: ( ruleDeclaration EOF )
            // InternalDslproject.g:330:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDslproject.g:337:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:341:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // InternalDslproject.g:342:2: ( ( rule__Declaration__Group__0 ) )
            {
            // InternalDslproject.g:342:2: ( ( rule__Declaration__Group__0 ) )
            // InternalDslproject.g:343:3: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // InternalDslproject.g:344:3: ( rule__Declaration__Group__0 )
            // InternalDslproject.g:344:4: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntityExample"
    // InternalDslproject.g:353:1: entryRuleEntityExample : ruleEntityExample EOF ;
    public final void entryRuleEntityExample() throws RecognitionException {
        try {
            // InternalDslproject.g:354:1: ( ruleEntityExample EOF )
            // InternalDslproject.g:355:1: ruleEntityExample EOF
            {
             before(grammarAccess.getEntityExampleRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityExample();

            state._fsp--;

             after(grammarAccess.getEntityExampleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityExample"


    // $ANTLR start "ruleEntityExample"
    // InternalDslproject.g:362:1: ruleEntityExample : ( ( rule__EntityExample__Group__0 ) ) ;
    public final void ruleEntityExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:366:2: ( ( ( rule__EntityExample__Group__0 ) ) )
            // InternalDslproject.g:367:2: ( ( rule__EntityExample__Group__0 ) )
            {
            // InternalDslproject.g:367:2: ( ( rule__EntityExample__Group__0 ) )
            // InternalDslproject.g:368:3: ( rule__EntityExample__Group__0 )
            {
             before(grammarAccess.getEntityExampleAccess().getGroup()); 
            // InternalDslproject.g:369:3: ( rule__EntityExample__Group__0 )
            // InternalDslproject.g:369:4: rule__EntityExample__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityExampleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityExample"


    // $ANTLR start "entryRuleSysvariable"
    // InternalDslproject.g:378:1: entryRuleSysvariable : ruleSysvariable EOF ;
    public final void entryRuleSysvariable() throws RecognitionException {
        try {
            // InternalDslproject.g:379:1: ( ruleSysvariable EOF )
            // InternalDslproject.g:380:1: ruleSysvariable EOF
            {
             before(grammarAccess.getSysvariableRule()); 
            pushFollow(FOLLOW_1);
            ruleSysvariable();

            state._fsp--;

             after(grammarAccess.getSysvariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSysvariable"


    // $ANTLR start "ruleSysvariable"
    // InternalDslproject.g:387:1: ruleSysvariable : ( ( rule__Sysvariable__ValueAssignment ) ) ;
    public final void ruleSysvariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:391:2: ( ( ( rule__Sysvariable__ValueAssignment ) ) )
            // InternalDslproject.g:392:2: ( ( rule__Sysvariable__ValueAssignment ) )
            {
            // InternalDslproject.g:392:2: ( ( rule__Sysvariable__ValueAssignment ) )
            // InternalDslproject.g:393:3: ( rule__Sysvariable__ValueAssignment )
            {
             before(grammarAccess.getSysvariableAccess().getValueAssignment()); 
            // InternalDslproject.g:394:3: ( rule__Sysvariable__ValueAssignment )
            // InternalDslproject.g:394:4: rule__Sysvariable__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSysvariable"


    // $ANTLR start "entryRuleReference"
    // InternalDslproject.g:403:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalDslproject.g:404:1: ( ruleReference EOF )
            // InternalDslproject.g:405:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDslproject.g:412:1: ruleReference : ( ( rule__Reference__Alternatives ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:416:2: ( ( ( rule__Reference__Alternatives ) ) )
            // InternalDslproject.g:417:2: ( ( rule__Reference__Alternatives ) )
            {
            // InternalDslproject.g:417:2: ( ( rule__Reference__Alternatives ) )
            // InternalDslproject.g:418:3: ( rule__Reference__Alternatives )
            {
             before(grammarAccess.getReferenceAccess().getAlternatives()); 
            // InternalDslproject.g:419:3: ( rule__Reference__Alternatives )
            // InternalDslproject.g:419:4: rule__Reference__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleFollowRelation"
    // InternalDslproject.g:428:1: entryRuleFollowRelation : ruleFollowRelation EOF ;
    public final void entryRuleFollowRelation() throws RecognitionException {
        try {
            // InternalDslproject.g:429:1: ( ruleFollowRelation EOF )
            // InternalDslproject.g:430:1: ruleFollowRelation EOF
            {
             before(grammarAccess.getFollowRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleFollowRelation();

            state._fsp--;

             after(grammarAccess.getFollowRelationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFollowRelation"


    // $ANTLR start "ruleFollowRelation"
    // InternalDslproject.g:437:1: ruleFollowRelation : ( ( rule__FollowRelation__Group__0 ) ) ;
    public final void ruleFollowRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:441:2: ( ( ( rule__FollowRelation__Group__0 ) ) )
            // InternalDslproject.g:442:2: ( ( rule__FollowRelation__Group__0 ) )
            {
            // InternalDslproject.g:442:2: ( ( rule__FollowRelation__Group__0 ) )
            // InternalDslproject.g:443:3: ( rule__FollowRelation__Group__0 )
            {
             before(grammarAccess.getFollowRelationAccess().getGroup()); 
            // InternalDslproject.g:444:3: ( rule__FollowRelation__Group__0 )
            // InternalDslproject.g:444:4: rule__FollowRelation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FollowRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFollowRelation"


    // $ANTLR start "rule__Agent__Alternatives"
    // InternalDslproject.g:452:1: rule__Agent__Alternatives : ( ( ruleEntity ) | ( ruleIntent ) | ( ruleFollowRelation ) );
    public final void rule__Agent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:456:1: ( ( ruleEntity ) | ( ruleIntent ) | ( ruleFollowRelation ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDslproject.g:457:2: ( ruleEntity )
                    {
                    // InternalDslproject.g:457:2: ( ruleEntity )
                    // InternalDslproject.g:458:3: ruleEntity
                    {
                     before(grammarAccess.getAgentAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslproject.g:463:2: ( ruleIntent )
                    {
                    // InternalDslproject.g:463:2: ( ruleIntent )
                    // InternalDslproject.g:464:3: ruleIntent
                    {
                     before(grammarAccess.getAgentAccess().getIntentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntent();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getIntentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDslproject.g:469:2: ( ruleFollowRelation )
                    {
                    // InternalDslproject.g:469:2: ( ruleFollowRelation )
                    // InternalDslproject.g:470:3: ruleFollowRelation
                    {
                     before(grammarAccess.getAgentAccess().getFollowRelationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFollowRelation();

                    state._fsp--;

                     after(grammarAccess.getAgentAccess().getFollowRelationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Agent__Alternatives"


    // $ANTLR start "rule__QuestionRef__Alternatives"
    // InternalDslproject.g:479:1: rule__QuestionRef__Alternatives : ( ( ( rule__QuestionRef__QuestionAssignment_0 ) ) | ( ( rule__QuestionRef__SuperQuestionAssignment_1 ) ) );
    public final void rule__QuestionRef__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:483:1: ( ( ( rule__QuestionRef__QuestionAssignment_0 ) ) | ( ( rule__QuestionRef__SuperQuestionAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=11 && LA3_0<=23)||LA3_0==29||LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDslproject.g:484:2: ( ( rule__QuestionRef__QuestionAssignment_0 ) )
                    {
                    // InternalDslproject.g:484:2: ( ( rule__QuestionRef__QuestionAssignment_0 ) )
                    // InternalDslproject.g:485:3: ( rule__QuestionRef__QuestionAssignment_0 )
                    {
                     before(grammarAccess.getQuestionRefAccess().getQuestionAssignment_0()); 
                    // InternalDslproject.g:486:3: ( rule__QuestionRef__QuestionAssignment_0 )
                    // InternalDslproject.g:486:4: rule__QuestionRef__QuestionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionRef__QuestionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionRefAccess().getQuestionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslproject.g:490:2: ( ( rule__QuestionRef__SuperQuestionAssignment_1 ) )
                    {
                    // InternalDslproject.g:490:2: ( ( rule__QuestionRef__SuperQuestionAssignment_1 ) )
                    // InternalDslproject.g:491:3: ( rule__QuestionRef__SuperQuestionAssignment_1 )
                    {
                     before(grammarAccess.getQuestionRefAccess().getSuperQuestionAssignment_1()); 
                    // InternalDslproject.g:492:3: ( rule__QuestionRef__SuperQuestionAssignment_1 )
                    // InternalDslproject.g:492:4: rule__QuestionRef__SuperQuestionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuestionRef__SuperQuestionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQuestionRefAccess().getSuperQuestionAssignment_1()); 

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
    // $ANTLR end "rule__QuestionRef__Alternatives"


    // $ANTLR start "rule__TrainingInput__Alternatives"
    // InternalDslproject.g:500:1: rule__TrainingInput__Alternatives : ( ( ( rule__TrainingInput__Group_0__0 ) ) | ( ( rule__TrainingInput__Group_1__0 ) ) );
    public final void rule__TrainingInput__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:504:1: ( ( ( rule__TrainingInput__Group_0__0 ) ) | ( ( rule__TrainingInput__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDslproject.g:505:2: ( ( rule__TrainingInput__Group_0__0 ) )
                    {
                    // InternalDslproject.g:505:2: ( ( rule__TrainingInput__Group_0__0 ) )
                    // InternalDslproject.g:506:3: ( rule__TrainingInput__Group_0__0 )
                    {
                     before(grammarAccess.getTrainingInputAccess().getGroup_0()); 
                    // InternalDslproject.g:507:3: ( rule__TrainingInput__Group_0__0 )
                    // InternalDslproject.g:507:4: rule__TrainingInput__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrainingInput__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrainingInputAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslproject.g:511:2: ( ( rule__TrainingInput__Group_1__0 ) )
                    {
                    // InternalDslproject.g:511:2: ( ( rule__TrainingInput__Group_1__0 ) )
                    // InternalDslproject.g:512:3: ( rule__TrainingInput__Group_1__0 )
                    {
                     before(grammarAccess.getTrainingInputAccess().getGroup_1()); 
                    // InternalDslproject.g:513:3: ( rule__TrainingInput__Group_1__0 )
                    // InternalDslproject.g:513:4: rule__TrainingInput__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrainingInput__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTrainingInputAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TrainingInput__Alternatives"


    // $ANTLR start "rule__Sysvariable__ValueAlternatives_0"
    // InternalDslproject.g:521:1: rule__Sysvariable__ValueAlternatives_0 : ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) );
    public final void rule__Sysvariable__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:525:1: ( ( 'number' ) | ( 'date-time' ) | ( 'date' ) | ( 'duration' ) | ( 'address' ) | ( 'email' ) | ( 'phone-number' ) | ( 'date-period' ) | ( 'time-period' ) | ( 'url' ) | ( 'any' ) | ( 'color' ) | ( 'language' ) )
            int alt5=13;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            case 19:
                {
                alt5=9;
                }
                break;
            case 20:
                {
                alt5=10;
                }
                break;
            case 21:
                {
                alt5=11;
                }
                break;
            case 22:
                {
                alt5=12;
                }
                break;
            case 23:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDslproject.g:526:2: ( 'number' )
                    {
                    // InternalDslproject.g:526:2: ( 'number' )
                    // InternalDslproject.g:527:3: 'number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslproject.g:532:2: ( 'date-time' )
                    {
                    // InternalDslproject.g:532:2: ( 'date-time' )
                    // InternalDslproject.g:533:3: 'date-time'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDslproject.g:538:2: ( 'date' )
                    {
                    // InternalDslproject.g:538:2: ( 'date' )
                    // InternalDslproject.g:539:3: 'date'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDslproject.g:544:2: ( 'duration' )
                    {
                    // InternalDslproject.g:544:2: ( 'duration' )
                    // InternalDslproject.g:545:3: 'duration'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDslproject.g:550:2: ( 'address' )
                    {
                    // InternalDslproject.g:550:2: ( 'address' )
                    // InternalDslproject.g:551:3: 'address'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDslproject.g:556:2: ( 'email' )
                    {
                    // InternalDslproject.g:556:2: ( 'email' )
                    // InternalDslproject.g:557:3: 'email'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDslproject.g:562:2: ( 'phone-number' )
                    {
                    // InternalDslproject.g:562:2: ( 'phone-number' )
                    // InternalDslproject.g:563:3: 'phone-number'
                    {
                     before(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDslproject.g:568:2: ( 'date-period' )
                    {
                    // InternalDslproject.g:568:2: ( 'date-period' )
                    // InternalDslproject.g:569:3: 'date-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDslproject.g:574:2: ( 'time-period' )
                    {
                    // InternalDslproject.g:574:2: ( 'time-period' )
                    // InternalDslproject.g:575:3: 'time-period'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDslproject.g:580:2: ( 'url' )
                    {
                    // InternalDslproject.g:580:2: ( 'url' )
                    // InternalDslproject.g:581:3: 'url'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDslproject.g:586:2: ( 'any' )
                    {
                    // InternalDslproject.g:586:2: ( 'any' )
                    // InternalDslproject.g:587:3: 'any'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDslproject.g:592:2: ( 'color' )
                    {
                    // InternalDslproject.g:592:2: ( 'color' )
                    // InternalDslproject.g:593:3: 'color'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDslproject.g:598:2: ( 'language' )
                    {
                    // InternalDslproject.g:598:2: ( 'language' )
                    // InternalDslproject.g:599:3: 'language'
                    {
                     before(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12()); 

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
    // $ANTLR end "rule__Sysvariable__ValueAlternatives_0"


    // $ANTLR start "rule__Reference__Alternatives"
    // InternalDslproject.g:608:1: rule__Reference__Alternatives : ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) );
    public final void rule__Reference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:612:1: ( ( ( rule__Reference__EntityAssignment_0 ) ) | ( ( rule__Reference__SysvarAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=11 && LA6_0<=23)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDslproject.g:613:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    {
                    // InternalDslproject.g:613:2: ( ( rule__Reference__EntityAssignment_0 ) )
                    // InternalDslproject.g:614:3: ( rule__Reference__EntityAssignment_0 )
                    {
                     before(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 
                    // InternalDslproject.g:615:3: ( rule__Reference__EntityAssignment_0 )
                    // InternalDslproject.g:615:4: rule__Reference__EntityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__EntityAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getEntityAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslproject.g:619:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    {
                    // InternalDslproject.g:619:2: ( ( rule__Reference__SysvarAssignment_1 ) )
                    // InternalDslproject.g:620:3: ( rule__Reference__SysvarAssignment_1 )
                    {
                     before(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 
                    // InternalDslproject.g:621:3: ( rule__Reference__SysvarAssignment_1 )
                    // InternalDslproject.g:621:4: rule__Reference__SysvarAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__SysvarAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReferenceAccess().getSysvarAssignment_1()); 

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
    // $ANTLR end "rule__Reference__Alternatives"


    // $ANTLR start "rule__Intent__Group__0"
    // InternalDslproject.g:629:1: rule__Intent__Group__0 : rule__Intent__Group__0__Impl rule__Intent__Group__1 ;
    public final void rule__Intent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:633:1: ( rule__Intent__Group__0__Impl rule__Intent__Group__1 )
            // InternalDslproject.g:634:2: rule__Intent__Group__0__Impl rule__Intent__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Intent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__1();

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
    // $ANTLR end "rule__Intent__Group__0"


    // $ANTLR start "rule__Intent__Group__0__Impl"
    // InternalDslproject.g:641:1: rule__Intent__Group__0__Impl : ( 'Intent' ) ;
    public final void rule__Intent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:645:1: ( ( 'Intent' ) )
            // InternalDslproject.g:646:1: ( 'Intent' )
            {
            // InternalDslproject.g:646:1: ( 'Intent' )
            // InternalDslproject.g:647:2: 'Intent'
            {
             before(grammarAccess.getIntentAccess().getIntentKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getIntentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__0__Impl"


    // $ANTLR start "rule__Intent__Group__1"
    // InternalDslproject.g:656:1: rule__Intent__Group__1 : rule__Intent__Group__1__Impl rule__Intent__Group__2 ;
    public final void rule__Intent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:660:1: ( rule__Intent__Group__1__Impl rule__Intent__Group__2 )
            // InternalDslproject.g:661:2: rule__Intent__Group__1__Impl rule__Intent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Intent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__2();

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
    // $ANTLR end "rule__Intent__Group__1"


    // $ANTLR start "rule__Intent__Group__1__Impl"
    // InternalDslproject.g:668:1: rule__Intent__Group__1__Impl : ( ( rule__Intent__NameAssignment_1 ) ) ;
    public final void rule__Intent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:672:1: ( ( ( rule__Intent__NameAssignment_1 ) ) )
            // InternalDslproject.g:673:1: ( ( rule__Intent__NameAssignment_1 ) )
            {
            // InternalDslproject.g:673:1: ( ( rule__Intent__NameAssignment_1 ) )
            // InternalDslproject.g:674:2: ( rule__Intent__NameAssignment_1 )
            {
             before(grammarAccess.getIntentAccess().getNameAssignment_1()); 
            // InternalDslproject.g:675:2: ( rule__Intent__NameAssignment_1 )
            // InternalDslproject.g:675:3: rule__Intent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__1__Impl"


    // $ANTLR start "rule__Intent__Group__2"
    // InternalDslproject.g:683:1: rule__Intent__Group__2 : rule__Intent__Group__2__Impl rule__Intent__Group__3 ;
    public final void rule__Intent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:687:1: ( rule__Intent__Group__2__Impl rule__Intent__Group__3 )
            // InternalDslproject.g:688:2: rule__Intent__Group__2__Impl rule__Intent__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Intent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__3();

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
    // $ANTLR end "rule__Intent__Group__2"


    // $ANTLR start "rule__Intent__Group__2__Impl"
    // InternalDslproject.g:695:1: rule__Intent__Group__2__Impl : ( ( rule__Intent__Group_2__0 )? ) ;
    public final void rule__Intent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:699:1: ( ( ( rule__Intent__Group_2__0 )? ) )
            // InternalDslproject.g:700:1: ( ( rule__Intent__Group_2__0 )? )
            {
            // InternalDslproject.g:700:1: ( ( rule__Intent__Group_2__0 )? )
            // InternalDslproject.g:701:2: ( rule__Intent__Group_2__0 )?
            {
             before(grammarAccess.getIntentAccess().getGroup_2()); 
            // InternalDslproject.g:702:2: ( rule__Intent__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDslproject.g:702:3: rule__Intent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Intent__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__2__Impl"


    // $ANTLR start "rule__Intent__Group__3"
    // InternalDslproject.g:710:1: rule__Intent__Group__3 : rule__Intent__Group__3__Impl rule__Intent__Group__4 ;
    public final void rule__Intent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:714:1: ( rule__Intent__Group__3__Impl rule__Intent__Group__4 )
            // InternalDslproject.g:715:2: rule__Intent__Group__3__Impl rule__Intent__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Intent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group__4();

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
    // $ANTLR end "rule__Intent__Group__3"


    // $ANTLR start "rule__Intent__Group__3__Impl"
    // InternalDslproject.g:722:1: rule__Intent__Group__3__Impl : ( ( ( rule__Intent__QuestionAssignment_3 ) ) ( ( rule__Intent__QuestionAssignment_3 )* ) ) ;
    public final void rule__Intent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:726:1: ( ( ( ( rule__Intent__QuestionAssignment_3 ) ) ( ( rule__Intent__QuestionAssignment_3 )* ) ) )
            // InternalDslproject.g:727:1: ( ( ( rule__Intent__QuestionAssignment_3 ) ) ( ( rule__Intent__QuestionAssignment_3 )* ) )
            {
            // InternalDslproject.g:727:1: ( ( ( rule__Intent__QuestionAssignment_3 ) ) ( ( rule__Intent__QuestionAssignment_3 )* ) )
            // InternalDslproject.g:728:2: ( ( rule__Intent__QuestionAssignment_3 ) ) ( ( rule__Intent__QuestionAssignment_3 )* )
            {
            // InternalDslproject.g:728:2: ( ( rule__Intent__QuestionAssignment_3 ) )
            // InternalDslproject.g:729:3: ( rule__Intent__QuestionAssignment_3 )
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_3()); 
            // InternalDslproject.g:730:3: ( rule__Intent__QuestionAssignment_3 )
            // InternalDslproject.g:730:4: rule__Intent__QuestionAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Intent__QuestionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getQuestionAssignment_3()); 

            }

            // InternalDslproject.g:733:2: ( ( rule__Intent__QuestionAssignment_3 )* )
            // InternalDslproject.g:734:3: ( rule__Intent__QuestionAssignment_3 )*
            {
             before(grammarAccess.getIntentAccess().getQuestionAssignment_3()); 
            // InternalDslproject.g:735:3: ( rule__Intent__QuestionAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||(LA8_0>=11 && LA8_0<=23)||LA8_0==29||LA8_0==31||LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDslproject.g:735:4: rule__Intent__QuestionAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Intent__QuestionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getIntentAccess().getQuestionAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__3__Impl"


    // $ANTLR start "rule__Intent__Group__4"
    // InternalDslproject.g:744:1: rule__Intent__Group__4 : rule__Intent__Group__4__Impl ;
    public final void rule__Intent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:748:1: ( rule__Intent__Group__4__Impl )
            // InternalDslproject.g:749:2: rule__Intent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group__4__Impl();

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
    // $ANTLR end "rule__Intent__Group__4"


    // $ANTLR start "rule__Intent__Group__4__Impl"
    // InternalDslproject.g:755:1: rule__Intent__Group__4__Impl : ( ( rule__Intent__TrainingAssignment_4 ) ) ;
    public final void rule__Intent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:759:1: ( ( ( rule__Intent__TrainingAssignment_4 ) ) )
            // InternalDslproject.g:760:1: ( ( rule__Intent__TrainingAssignment_4 ) )
            {
            // InternalDslproject.g:760:1: ( ( rule__Intent__TrainingAssignment_4 ) )
            // InternalDslproject.g:761:2: ( rule__Intent__TrainingAssignment_4 )
            {
             before(grammarAccess.getIntentAccess().getTrainingAssignment_4()); 
            // InternalDslproject.g:762:2: ( rule__Intent__TrainingAssignment_4 )
            // InternalDslproject.g:762:3: rule__Intent__TrainingAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Intent__TrainingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getTrainingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group__4__Impl"


    // $ANTLR start "rule__Intent__Group_2__0"
    // InternalDslproject.g:771:1: rule__Intent__Group_2__0 : rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 ;
    public final void rule__Intent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:775:1: ( rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1 )
            // InternalDslproject.g:776:2: rule__Intent__Group_2__0__Impl rule__Intent__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Intent__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__1();

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
    // $ANTLR end "rule__Intent__Group_2__0"


    // $ANTLR start "rule__Intent__Group_2__0__Impl"
    // InternalDslproject.g:783:1: rule__Intent__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Intent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:787:1: ( ( 'extends' ) )
            // InternalDslproject.g:788:1: ( 'extends' )
            {
            // InternalDslproject.g:788:1: ( 'extends' )
            // InternalDslproject.g:789:2: 'extends'
            {
             before(grammarAccess.getIntentAccess().getExtendsKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__0__Impl"


    // $ANTLR start "rule__Intent__Group_2__1"
    // InternalDslproject.g:798:1: rule__Intent__Group_2__1 : rule__Intent__Group_2__1__Impl ;
    public final void rule__Intent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:802:1: ( rule__Intent__Group_2__1__Impl )
            // InternalDslproject.g:803:2: rule__Intent__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Intent__Group_2__1__Impl();

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
    // $ANTLR end "rule__Intent__Group_2__1"


    // $ANTLR start "rule__Intent__Group_2__1__Impl"
    // InternalDslproject.g:809:1: rule__Intent__Group_2__1__Impl : ( ( rule__Intent__ZuperAssignment_2_1 ) ) ;
    public final void rule__Intent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:813:1: ( ( ( rule__Intent__ZuperAssignment_2_1 ) ) )
            // InternalDslproject.g:814:1: ( ( rule__Intent__ZuperAssignment_2_1 ) )
            {
            // InternalDslproject.g:814:1: ( ( rule__Intent__ZuperAssignment_2_1 ) )
            // InternalDslproject.g:815:2: ( rule__Intent__ZuperAssignment_2_1 )
            {
             before(grammarAccess.getIntentAccess().getZuperAssignment_2_1()); 
            // InternalDslproject.g:816:2: ( rule__Intent__ZuperAssignment_2_1 )
            // InternalDslproject.g:816:3: rule__Intent__ZuperAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Intent__ZuperAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getZuperAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDslproject.g:825:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:829:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDslproject.g:830:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDslproject.g:837:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:841:1: ( ( 'Entity' ) )
            // InternalDslproject.g:842:1: ( 'Entity' )
            {
            // InternalDslproject.g:842:1: ( 'Entity' )
            // InternalDslproject.g:843:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDslproject.g:852:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:856:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDslproject.g:857:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDslproject.g:864:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:868:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDslproject.g:869:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDslproject.g:869:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDslproject.g:870:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDslproject.g:871:2: ( rule__Entity__NameAssignment_1 )
            // InternalDslproject.g:871:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDslproject.g:879:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:883:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDslproject.g:884:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDslproject.g:891:1: rule__Entity__Group__2__Impl : ( '[' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:895:1: ( ( '[' ) )
            // InternalDslproject.g:896:1: ( '[' )
            {
            // InternalDslproject.g:896:1: ( '[' )
            // InternalDslproject.g:897:2: '['
            {
             before(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDslproject.g:906:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:910:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDslproject.g:911:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDslproject.g:918:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:922:1: ( ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) ) )
            // InternalDslproject.g:923:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            {
            // InternalDslproject.g:923:1: ( ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* ) )
            // InternalDslproject.g:924:2: ( ( rule__Entity__ExampleAssignment_3 ) ) ( ( rule__Entity__ExampleAssignment_3 )* )
            {
            // InternalDslproject.g:924:2: ( ( rule__Entity__ExampleAssignment_3 ) )
            // InternalDslproject.g:925:3: ( rule__Entity__ExampleAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalDslproject.g:926:3: ( rule__Entity__ExampleAssignment_3 )
            // InternalDslproject.g:926:4: rule__Entity__ExampleAssignment_3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__ExampleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getExampleAssignment_3()); 

            }

            // InternalDslproject.g:929:2: ( ( rule__Entity__ExampleAssignment_3 )* )
            // InternalDslproject.g:930:3: ( rule__Entity__ExampleAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getExampleAssignment_3()); 
            // InternalDslproject.g:931:3: ( rule__Entity__ExampleAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDslproject.g:931:4: rule__Entity__ExampleAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Entity__ExampleAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getExampleAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDslproject.g:940:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:944:1: ( rule__Entity__Group__4__Impl )
            // InternalDslproject.g:945:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDslproject.g:951:1: rule__Entity__Group__4__Impl : ( ']' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:955:1: ( ( ']' ) )
            // InternalDslproject.g:956:1: ( ']' )
            {
            // InternalDslproject.g:956:1: ( ']' )
            // InternalDslproject.g:957:2: ']'
            {
             before(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalDslproject.g:967:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:971:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalDslproject.g:972:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalDslproject.g:979:1: rule__Question__Group__0__Impl : ( ( rule__Question__RequiredAssignment_0 )? ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:983:1: ( ( ( rule__Question__RequiredAssignment_0 )? ) )
            // InternalDslproject.g:984:1: ( ( rule__Question__RequiredAssignment_0 )? )
            {
            // InternalDslproject.g:984:1: ( ( rule__Question__RequiredAssignment_0 )? )
            // InternalDslproject.g:985:2: ( rule__Question__RequiredAssignment_0 )?
            {
             before(grammarAccess.getQuestionAccess().getRequiredAssignment_0()); 
            // InternalDslproject.g:986:2: ( rule__Question__RequiredAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==39) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDslproject.g:986:3: rule__Question__RequiredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__RequiredAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getRequiredAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalDslproject.g:994:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:998:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalDslproject.g:999:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalDslproject.g:1006:1: rule__Question__Group__1__Impl : ( ( rule__Question__NameAssignment_1 )? ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1010:1: ( ( ( rule__Question__NameAssignment_1 )? ) )
            // InternalDslproject.g:1011:1: ( ( rule__Question__NameAssignment_1 )? )
            {
            // InternalDslproject.g:1011:1: ( ( rule__Question__NameAssignment_1 )? )
            // InternalDslproject.g:1012:2: ( rule__Question__NameAssignment_1 )?
            {
             before(grammarAccess.getQuestionAccess().getNameAssignment_1()); 
            // InternalDslproject.g:1013:2: ( rule__Question__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_ID||(LA11_1>=11 && LA11_1<=23)||LA11_1==29) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalDslproject.g:1013:3: rule__Question__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalDslproject.g:1021:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1025:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalDslproject.g:1026:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalDslproject.g:1033:1: rule__Question__Group__2__Impl : ( ( '=' )? ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1037:1: ( ( ( '=' )? ) )
            // InternalDslproject.g:1038:1: ( ( '=' )? )
            {
            // InternalDslproject.g:1038:1: ( ( '=' )? )
            // InternalDslproject.g:1039:2: ( '=' )?
            {
             before(grammarAccess.getQuestionAccess().getEqualsSignKeyword_2()); 
            // InternalDslproject.g:1040:2: ( '=' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDslproject.g:1040:3: '='
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalDslproject.g:1048:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1052:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalDslproject.g:1053:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalDslproject.g:1060:1: rule__Question__Group__3__Impl : ( ( rule__Question__QuestionEntityAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1064:1: ( ( ( rule__Question__QuestionEntityAssignment_3 ) ) )
            // InternalDslproject.g:1065:1: ( ( rule__Question__QuestionEntityAssignment_3 ) )
            {
            // InternalDslproject.g:1065:1: ( ( rule__Question__QuestionEntityAssignment_3 ) )
            // InternalDslproject.g:1066:2: ( rule__Question__QuestionEntityAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_3()); 
            // InternalDslproject.g:1067:2: ( rule__Question__QuestionEntityAssignment_3 )
            // InternalDslproject.g:1067:3: rule__Question__QuestionEntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionEntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalDslproject.g:1075:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1079:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalDslproject.g:1080:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__5();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalDslproject.g:1087:1: rule__Question__Group__4__Impl : ( 'with' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1091:1: ( ( 'with' ) )
            // InternalDslproject.g:1092:1: ( 'with' )
            {
            // InternalDslproject.g:1092:1: ( 'with' )
            // InternalDslproject.g:1093:2: 'with'
            {
             before(grammarAccess.getQuestionAccess().getWithKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getWithKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // InternalDslproject.g:1102:1: rule__Question__Group__5 : rule__Question__Group__5__Impl ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1106:1: ( rule__Question__Group__5__Impl )
            // InternalDslproject.g:1107:2: rule__Question__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__5__Impl();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // InternalDslproject.g:1113:1: rule__Question__Group__5__Impl : ( ( rule__Question__PromptAssignment_5 ) ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1117:1: ( ( ( rule__Question__PromptAssignment_5 ) ) )
            // InternalDslproject.g:1118:1: ( ( rule__Question__PromptAssignment_5 ) )
            {
            // InternalDslproject.g:1118:1: ( ( rule__Question__PromptAssignment_5 ) )
            // InternalDslproject.g:1119:2: ( rule__Question__PromptAssignment_5 )
            {
             before(grammarAccess.getQuestionAccess().getPromptAssignment_5()); 
            // InternalDslproject.g:1120:2: ( rule__Question__PromptAssignment_5 )
            // InternalDslproject.g:1120:3: rule__Question__PromptAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Question__PromptAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getPromptAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__SuperQuestion__Group__0"
    // InternalDslproject.g:1129:1: rule__SuperQuestion__Group__0 : rule__SuperQuestion__Group__0__Impl rule__SuperQuestion__Group__1 ;
    public final void rule__SuperQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1133:1: ( rule__SuperQuestion__Group__0__Impl rule__SuperQuestion__Group__1 )
            // InternalDslproject.g:1134:2: rule__SuperQuestion__Group__0__Impl rule__SuperQuestion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SuperQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SuperQuestion__Group__1();

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
    // $ANTLR end "rule__SuperQuestion__Group__0"


    // $ANTLR start "rule__SuperQuestion__Group__0__Impl"
    // InternalDslproject.g:1141:1: rule__SuperQuestion__Group__0__Impl : ( 'get' ) ;
    public final void rule__SuperQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1145:1: ( ( 'get' ) )
            // InternalDslproject.g:1146:1: ( 'get' )
            {
            // InternalDslproject.g:1146:1: ( 'get' )
            // InternalDslproject.g:1147:2: 'get'
            {
             before(grammarAccess.getSuperQuestionAccess().getGetKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSuperQuestionAccess().getGetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperQuestion__Group__0__Impl"


    // $ANTLR start "rule__SuperQuestion__Group__1"
    // InternalDslproject.g:1156:1: rule__SuperQuestion__Group__1 : rule__SuperQuestion__Group__1__Impl ;
    public final void rule__SuperQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1160:1: ( rule__SuperQuestion__Group__1__Impl )
            // InternalDslproject.g:1161:2: rule__SuperQuestion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SuperQuestion__Group__1__Impl();

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
    // $ANTLR end "rule__SuperQuestion__Group__1"


    // $ANTLR start "rule__SuperQuestion__Group__1__Impl"
    // InternalDslproject.g:1167:1: rule__SuperQuestion__Group__1__Impl : ( ( rule__SuperQuestion__SuperQuestionAssignment_1 ) ) ;
    public final void rule__SuperQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1171:1: ( ( ( rule__SuperQuestion__SuperQuestionAssignment_1 ) ) )
            // InternalDslproject.g:1172:1: ( ( rule__SuperQuestion__SuperQuestionAssignment_1 ) )
            {
            // InternalDslproject.g:1172:1: ( ( rule__SuperQuestion__SuperQuestionAssignment_1 ) )
            // InternalDslproject.g:1173:2: ( rule__SuperQuestion__SuperQuestionAssignment_1 )
            {
             before(grammarAccess.getSuperQuestionAccess().getSuperQuestionAssignment_1()); 
            // InternalDslproject.g:1174:2: ( rule__SuperQuestion__SuperQuestionAssignment_1 )
            // InternalDslproject.g:1174:3: rule__SuperQuestion__SuperQuestionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SuperQuestion__SuperQuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperQuestionAccess().getSuperQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperQuestion__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__0"
    // InternalDslproject.g:1183:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1187:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalDslproject.g:1188:2: rule__Training__Group__0__Impl rule__Training__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Training__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__1();

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
    // $ANTLR end "rule__Training__Group__0"


    // $ANTLR start "rule__Training__Group__0__Impl"
    // InternalDslproject.g:1195:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1199:1: ( ( () ) )
            // InternalDslproject.g:1200:1: ( () )
            {
            // InternalDslproject.g:1200:1: ( () )
            // InternalDslproject.g:1201:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalDslproject.g:1202:2: ()
            // InternalDslproject.g:1202:3: 
            {
            }

             after(grammarAccess.getTrainingAccess().getTrainingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0__Impl"


    // $ANTLR start "rule__Training__Group__1"
    // InternalDslproject.g:1210:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1214:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalDslproject.g:1215:2: rule__Training__Group__1__Impl rule__Training__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Training__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__2();

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
    // $ANTLR end "rule__Training__Group__1"


    // $ANTLR start "rule__Training__Group__1__Impl"
    // InternalDslproject.g:1222:1: rule__Training__Group__1__Impl : ( 'Training:' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1226:1: ( ( 'Training:' ) )
            // InternalDslproject.g:1227:1: ( 'Training:' )
            {
            // InternalDslproject.g:1227:1: ( 'Training:' )
            // InternalDslproject.g:1228:2: 'Training:'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__2"
    // InternalDslproject.g:1237:1: rule__Training__Group__2 : rule__Training__Group__2__Impl ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1241:1: ( rule__Training__Group__2__Impl )
            // InternalDslproject.g:1242:2: rule__Training__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__2__Impl();

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
    // $ANTLR end "rule__Training__Group__2"


    // $ANTLR start "rule__Training__Group__2__Impl"
    // InternalDslproject.g:1248:1: rule__Training__Group__2__Impl : ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1252:1: ( ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) ) )
            // InternalDslproject.g:1253:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            {
            // InternalDslproject.g:1253:1: ( ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* ) )
            // InternalDslproject.g:1254:2: ( ( rule__Training__TrainingrefAssignment_2 ) ) ( ( rule__Training__TrainingrefAssignment_2 )* )
            {
            // InternalDslproject.g:1254:2: ( ( rule__Training__TrainingrefAssignment_2 ) )
            // InternalDslproject.g:1255:3: ( rule__Training__TrainingrefAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalDslproject.g:1256:3: ( rule__Training__TrainingrefAssignment_2 )
            // InternalDslproject.g:1256:4: rule__Training__TrainingrefAssignment_2
            {
            pushFollow(FOLLOW_15);
            rule__Training__TrainingrefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }

            // InternalDslproject.g:1259:2: ( ( rule__Training__TrainingrefAssignment_2 )* )
            // InternalDslproject.g:1260:3: ( rule__Training__TrainingrefAssignment_2 )*
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 
            // InternalDslproject.g:1261:3: ( rule__Training__TrainingrefAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==RULE_STRING) ) {
                        alt13=1;
                    }


                }
                else if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDslproject.g:1261:4: rule__Training__TrainingrefAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Training__TrainingrefAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTrainingAccess().getTrainingrefAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__2__Impl"


    // $ANTLR start "rule__TrainingRef__Group__0"
    // InternalDslproject.g:1271:1: rule__TrainingRef__Group__0 : rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 ;
    public final void rule__TrainingRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1275:1: ( rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1 )
            // InternalDslproject.g:1276:2: rule__TrainingRef__Group__0__Impl rule__TrainingRef__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TrainingRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__1();

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
    // $ANTLR end "rule__TrainingRef__Group__0"


    // $ANTLR start "rule__TrainingRef__Group__0__Impl"
    // InternalDslproject.g:1283:1: rule__TrainingRef__Group__0__Impl : ( ( ( rule__TrainingRef__InputAssignment_0 ) ) ( ( rule__TrainingRef__InputAssignment_0 )* ) ) ;
    public final void rule__TrainingRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1287:1: ( ( ( ( rule__TrainingRef__InputAssignment_0 ) ) ( ( rule__TrainingRef__InputAssignment_0 )* ) ) )
            // InternalDslproject.g:1288:1: ( ( ( rule__TrainingRef__InputAssignment_0 ) ) ( ( rule__TrainingRef__InputAssignment_0 )* ) )
            {
            // InternalDslproject.g:1288:1: ( ( ( rule__TrainingRef__InputAssignment_0 ) ) ( ( rule__TrainingRef__InputAssignment_0 )* ) )
            // InternalDslproject.g:1289:2: ( ( rule__TrainingRef__InputAssignment_0 ) ) ( ( rule__TrainingRef__InputAssignment_0 )* )
            {
            // InternalDslproject.g:1289:2: ( ( rule__TrainingRef__InputAssignment_0 ) )
            // InternalDslproject.g:1290:3: ( rule__TrainingRef__InputAssignment_0 )
            {
             before(grammarAccess.getTrainingRefAccess().getInputAssignment_0()); 
            // InternalDslproject.g:1291:3: ( rule__TrainingRef__InputAssignment_0 )
            // InternalDslproject.g:1291:4: rule__TrainingRef__InputAssignment_0
            {
            pushFollow(FOLLOW_15);
            rule__TrainingRef__InputAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingRefAccess().getInputAssignment_0()); 

            }

            // InternalDslproject.g:1294:2: ( ( rule__TrainingRef__InputAssignment_0 )* )
            // InternalDslproject.g:1295:3: ( rule__TrainingRef__InputAssignment_0 )*
            {
             before(grammarAccess.getTrainingRefAccess().getInputAssignment_0()); 
            // InternalDslproject.g:1296:3: ( rule__TrainingRef__InputAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING||LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDslproject.g:1296:4: rule__TrainingRef__InputAssignment_0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TrainingRef__InputAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTrainingRefAccess().getInputAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__0__Impl"


    // $ANTLR start "rule__TrainingRef__Group__1"
    // InternalDslproject.g:1305:1: rule__TrainingRef__Group__1 : rule__TrainingRef__Group__1__Impl ;
    public final void rule__TrainingRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1309:1: ( rule__TrainingRef__Group__1__Impl )
            // InternalDslproject.g:1310:2: rule__TrainingRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingRef__Group__1__Impl();

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
    // $ANTLR end "rule__TrainingRef__Group__1"


    // $ANTLR start "rule__TrainingRef__Group__1__Impl"
    // InternalDslproject.g:1316:1: rule__TrainingRef__Group__1__Impl : ( '.' ) ;
    public final void rule__TrainingRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1320:1: ( ( '.' ) )
            // InternalDslproject.g:1321:1: ( '.' )
            {
            // InternalDslproject.g:1321:1: ( '.' )
            // InternalDslproject.g:1322:2: '.'
            {
             before(grammarAccess.getTrainingRefAccess().getFullStopKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTrainingRefAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__Group__1__Impl"


    // $ANTLR start "rule__TrainingInput__Group_0__0"
    // InternalDslproject.g:1332:1: rule__TrainingInput__Group_0__0 : rule__TrainingInput__Group_0__0__Impl rule__TrainingInput__Group_0__1 ;
    public final void rule__TrainingInput__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1336:1: ( rule__TrainingInput__Group_0__0__Impl rule__TrainingInput__Group_0__1 )
            // InternalDslproject.g:1337:2: rule__TrainingInput__Group_0__0__Impl rule__TrainingInput__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__TrainingInput__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingInput__Group_0__1();

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
    // $ANTLR end "rule__TrainingInput__Group_0__0"


    // $ANTLR start "rule__TrainingInput__Group_0__0__Impl"
    // InternalDslproject.g:1344:1: rule__TrainingInput__Group_0__0__Impl : ( () ) ;
    public final void rule__TrainingInput__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1348:1: ( ( () ) )
            // InternalDslproject.g:1349:1: ( () )
            {
            // InternalDslproject.g:1349:1: ( () )
            // InternalDslproject.g:1350:2: ()
            {
             before(grammarAccess.getTrainingInputAccess().getSinAction_0_0()); 
            // InternalDslproject.g:1351:2: ()
            // InternalDslproject.g:1351:3: 
            {
            }

             after(grammarAccess.getTrainingInputAccess().getSinAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingInput__Group_0__0__Impl"


    // $ANTLR start "rule__TrainingInput__Group_0__1"
    // InternalDslproject.g:1359:1: rule__TrainingInput__Group_0__1 : rule__TrainingInput__Group_0__1__Impl ;
    public final void rule__TrainingInput__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1363:1: ( rule__TrainingInput__Group_0__1__Impl )
            // InternalDslproject.g:1364:2: rule__TrainingInput__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingInput__Group_0__1__Impl();

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
    // $ANTLR end "rule__TrainingInput__Group_0__1"


    // $ANTLR start "rule__TrainingInput__Group_0__1__Impl"
    // InternalDslproject.g:1370:1: rule__TrainingInput__Group_0__1__Impl : ( ( rule__TrainingInput__SAssignment_0_1 ) ) ;
    public final void rule__TrainingInput__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1374:1: ( ( ( rule__TrainingInput__SAssignment_0_1 ) ) )
            // InternalDslproject.g:1375:1: ( ( rule__TrainingInput__SAssignment_0_1 ) )
            {
            // InternalDslproject.g:1375:1: ( ( rule__TrainingInput__SAssignment_0_1 ) )
            // InternalDslproject.g:1376:2: ( rule__TrainingInput__SAssignment_0_1 )
            {
             before(grammarAccess.getTrainingInputAccess().getSAssignment_0_1()); 
            // InternalDslproject.g:1377:2: ( rule__TrainingInput__SAssignment_0_1 )
            // InternalDslproject.g:1377:3: rule__TrainingInput__SAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TrainingInput__SAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingInputAccess().getSAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingInput__Group_0__1__Impl"


    // $ANTLR start "rule__TrainingInput__Group_1__0"
    // InternalDslproject.g:1386:1: rule__TrainingInput__Group_1__0 : rule__TrainingInput__Group_1__0__Impl rule__TrainingInput__Group_1__1 ;
    public final void rule__TrainingInput__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1390:1: ( rule__TrainingInput__Group_1__0__Impl rule__TrainingInput__Group_1__1 )
            // InternalDslproject.g:1391:2: rule__TrainingInput__Group_1__0__Impl rule__TrainingInput__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__TrainingInput__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrainingInput__Group_1__1();

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
    // $ANTLR end "rule__TrainingInput__Group_1__0"


    // $ANTLR start "rule__TrainingInput__Group_1__0__Impl"
    // InternalDslproject.g:1398:1: rule__TrainingInput__Group_1__0__Impl : ( () ) ;
    public final void rule__TrainingInput__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1402:1: ( ( () ) )
            // InternalDslproject.g:1403:1: ( () )
            {
            // InternalDslproject.g:1403:1: ( () )
            // InternalDslproject.g:1404:2: ()
            {
             before(grammarAccess.getTrainingInputAccess().getDeclAction_1_0()); 
            // InternalDslproject.g:1405:2: ()
            // InternalDslproject.g:1405:3: 
            {
            }

             after(grammarAccess.getTrainingInputAccess().getDeclAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingInput__Group_1__0__Impl"


    // $ANTLR start "rule__TrainingInput__Group_1__1"
    // InternalDslproject.g:1413:1: rule__TrainingInput__Group_1__1 : rule__TrainingInput__Group_1__1__Impl ;
    public final void rule__TrainingInput__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1417:1: ( rule__TrainingInput__Group_1__1__Impl )
            // InternalDslproject.g:1418:2: rule__TrainingInput__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrainingInput__Group_1__1__Impl();

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
    // $ANTLR end "rule__TrainingInput__Group_1__1"


    // $ANTLR start "rule__TrainingInput__Group_1__1__Impl"
    // InternalDslproject.g:1424:1: rule__TrainingInput__Group_1__1__Impl : ( ( rule__TrainingInput__DeclarationsAssignment_1_1 ) ) ;
    public final void rule__TrainingInput__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1428:1: ( ( ( rule__TrainingInput__DeclarationsAssignment_1_1 ) ) )
            // InternalDslproject.g:1429:1: ( ( rule__TrainingInput__DeclarationsAssignment_1_1 ) )
            {
            // InternalDslproject.g:1429:1: ( ( rule__TrainingInput__DeclarationsAssignment_1_1 ) )
            // InternalDslproject.g:1430:2: ( rule__TrainingInput__DeclarationsAssignment_1_1 )
            {
             before(grammarAccess.getTrainingInputAccess().getDeclarationsAssignment_1_1()); 
            // InternalDslproject.g:1431:2: ( rule__TrainingInput__DeclarationsAssignment_1_1 )
            // InternalDslproject.g:1431:3: rule__TrainingInput__DeclarationsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TrainingInput__DeclarationsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingInputAccess().getDeclarationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingInput__Group_1__1__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // InternalDslproject.g:1440:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1444:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // InternalDslproject.g:1445:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__1();

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
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // InternalDslproject.g:1452:1: rule__Declaration__Group__0__Impl : ( '(' ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1456:1: ( ( '(' ) )
            // InternalDslproject.g:1457:1: ( '(' )
            {
            // InternalDslproject.g:1457:1: ( '(' )
            // InternalDslproject.g:1458:2: '('
            {
             before(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // InternalDslproject.g:1467:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1471:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // InternalDslproject.g:1472:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Declaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__2();

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
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // InternalDslproject.g:1479:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__TrainingstringAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1483:1: ( ( ( rule__Declaration__TrainingstringAssignment_1 ) ) )
            // InternalDslproject.g:1484:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            {
            // InternalDslproject.g:1484:1: ( ( rule__Declaration__TrainingstringAssignment_1 ) )
            // InternalDslproject.g:1485:2: ( rule__Declaration__TrainingstringAssignment_1 )
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 
            // InternalDslproject.g:1486:2: ( rule__Declaration__TrainingstringAssignment_1 )
            // InternalDslproject.g:1486:3: rule__Declaration__TrainingstringAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__TrainingstringAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getTrainingstringAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__Declaration__Group__2"
    // InternalDslproject.g:1494:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl rule__Declaration__Group__3 ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1498:1: ( rule__Declaration__Group__2__Impl rule__Declaration__Group__3 )
            // InternalDslproject.g:1499:2: rule__Declaration__Group__2__Impl rule__Declaration__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Declaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__3();

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
    // $ANTLR end "rule__Declaration__Group__2"


    // $ANTLR start "rule__Declaration__Group__2__Impl"
    // InternalDslproject.g:1506:1: rule__Declaration__Group__2__Impl : ( 'is' ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1510:1: ( ( 'is' ) )
            // InternalDslproject.g:1511:1: ( 'is' )
            {
            // InternalDslproject.g:1511:1: ( 'is' )
            // InternalDslproject.g:1512:2: 'is'
            {
             before(grammarAccess.getDeclarationAccess().getIsKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getIsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__2__Impl"


    // $ANTLR start "rule__Declaration__Group__3"
    // InternalDslproject.g:1521:1: rule__Declaration__Group__3 : rule__Declaration__Group__3__Impl rule__Declaration__Group__4 ;
    public final void rule__Declaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1525:1: ( rule__Declaration__Group__3__Impl rule__Declaration__Group__4 )
            // InternalDslproject.g:1526:2: rule__Declaration__Group__3__Impl rule__Declaration__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Declaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Declaration__Group__4();

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
    // $ANTLR end "rule__Declaration__Group__3"


    // $ANTLR start "rule__Declaration__Group__3__Impl"
    // InternalDslproject.g:1533:1: rule__Declaration__Group__3__Impl : ( ( rule__Declaration__ReferenceAssignment_3 ) ) ;
    public final void rule__Declaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1537:1: ( ( ( rule__Declaration__ReferenceAssignment_3 ) ) )
            // InternalDslproject.g:1538:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            {
            // InternalDslproject.g:1538:1: ( ( rule__Declaration__ReferenceAssignment_3 ) )
            // InternalDslproject.g:1539:2: ( rule__Declaration__ReferenceAssignment_3 )
            {
             before(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 
            // InternalDslproject.g:1540:2: ( rule__Declaration__ReferenceAssignment_3 )
            // InternalDslproject.g:1540:3: rule__Declaration__ReferenceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__ReferenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getReferenceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__3__Impl"


    // $ANTLR start "rule__Declaration__Group__4"
    // InternalDslproject.g:1548:1: rule__Declaration__Group__4 : rule__Declaration__Group__4__Impl ;
    public final void rule__Declaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1552:1: ( rule__Declaration__Group__4__Impl )
            // InternalDslproject.g:1553:2: rule__Declaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Group__4__Impl();

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
    // $ANTLR end "rule__Declaration__Group__4"


    // $ANTLR start "rule__Declaration__Group__4__Impl"
    // InternalDslproject.g:1559:1: rule__Declaration__Group__4__Impl : ( ')' ) ;
    public final void rule__Declaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1563:1: ( ( ')' ) )
            // InternalDslproject.g:1564:1: ( ')' )
            {
            // InternalDslproject.g:1564:1: ( ')' )
            // InternalDslproject.g:1565:2: ')'
            {
             before(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__Group__4__Impl"


    // $ANTLR start "rule__EntityExample__Group__0"
    // InternalDslproject.g:1575:1: rule__EntityExample__Group__0 : rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 ;
    public final void rule__EntityExample__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1579:1: ( rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1 )
            // InternalDslproject.g:1580:2: rule__EntityExample__Group__0__Impl rule__EntityExample__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EntityExample__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__1();

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
    // $ANTLR end "rule__EntityExample__Group__0"


    // $ANTLR start "rule__EntityExample__Group__0__Impl"
    // InternalDslproject.g:1587:1: rule__EntityExample__Group__0__Impl : ( ( rule__EntityExample__NameAssignment_0 ) ) ;
    public final void rule__EntityExample__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1591:1: ( ( ( rule__EntityExample__NameAssignment_0 ) ) )
            // InternalDslproject.g:1592:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            {
            // InternalDslproject.g:1592:1: ( ( rule__EntityExample__NameAssignment_0 ) )
            // InternalDslproject.g:1593:2: ( rule__EntityExample__NameAssignment_0 )
            {
             before(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 
            // InternalDslproject.g:1594:2: ( rule__EntityExample__NameAssignment_0 )
            // InternalDslproject.g:1594:3: rule__EntityExample__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityExampleAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__0__Impl"


    // $ANTLR start "rule__EntityExample__Group__1"
    // InternalDslproject.g:1602:1: rule__EntityExample__Group__1 : rule__EntityExample__Group__1__Impl ;
    public final void rule__EntityExample__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1606:1: ( rule__EntityExample__Group__1__Impl )
            // InternalDslproject.g:1607:2: rule__EntityExample__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityExample__Group__1__Impl();

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
    // $ANTLR end "rule__EntityExample__Group__1"


    // $ANTLR start "rule__EntityExample__Group__1__Impl"
    // InternalDslproject.g:1613:1: rule__EntityExample__Group__1__Impl : ( ( ',' )? ) ;
    public final void rule__EntityExample__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1617:1: ( ( ( ',' )? ) )
            // InternalDslproject.g:1618:1: ( ( ',' )? )
            {
            // InternalDslproject.g:1618:1: ( ( ',' )? )
            // InternalDslproject.g:1619:2: ( ',' )?
            {
             before(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 
            // InternalDslproject.g:1620:2: ( ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDslproject.g:1620:3: ','
                    {
                    match(input,37,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEntityExampleAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__Group__1__Impl"


    // $ANTLR start "rule__FollowRelation__Group__0"
    // InternalDslproject.g:1629:1: rule__FollowRelation__Group__0 : rule__FollowRelation__Group__0__Impl rule__FollowRelation__Group__1 ;
    public final void rule__FollowRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1633:1: ( rule__FollowRelation__Group__0__Impl rule__FollowRelation__Group__1 )
            // InternalDslproject.g:1634:2: rule__FollowRelation__Group__0__Impl rule__FollowRelation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FollowRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowRelation__Group__1();

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
    // $ANTLR end "rule__FollowRelation__Group__0"


    // $ANTLR start "rule__FollowRelation__Group__0__Impl"
    // InternalDslproject.g:1641:1: rule__FollowRelation__Group__0__Impl : ( '(' ) ;
    public final void rule__FollowRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1645:1: ( ( '(' ) )
            // InternalDslproject.g:1646:1: ( '(' )
            {
            // InternalDslproject.g:1646:1: ( '(' )
            // InternalDslproject.g:1647:2: '('
            {
             before(grammarAccess.getFollowRelationAccess().getLeftParenthesisKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFollowRelationAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRelation__Group__0__Impl"


    // $ANTLR start "rule__FollowRelation__Group__1"
    // InternalDslproject.g:1656:1: rule__FollowRelation__Group__1 : rule__FollowRelation__Group__1__Impl rule__FollowRelation__Group__2 ;
    public final void rule__FollowRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1660:1: ( rule__FollowRelation__Group__1__Impl rule__FollowRelation__Group__2 )
            // InternalDslproject.g:1661:2: rule__FollowRelation__Group__1__Impl rule__FollowRelation__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__FollowRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowRelation__Group__2();

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
    // $ANTLR end "rule__FollowRelation__Group__1"


    // $ANTLR start "rule__FollowRelation__Group__1__Impl"
    // InternalDslproject.g:1668:1: rule__FollowRelation__Group__1__Impl : ( ( rule__FollowRelation__ParentAssignment_1 ) ) ;
    public final void rule__FollowRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1672:1: ( ( ( rule__FollowRelation__ParentAssignment_1 ) ) )
            // InternalDslproject.g:1673:1: ( ( rule__FollowRelation__ParentAssignment_1 ) )
            {
            // InternalDslproject.g:1673:1: ( ( rule__FollowRelation__ParentAssignment_1 ) )
            // InternalDslproject.g:1674:2: ( rule__FollowRelation__ParentAssignment_1 )
            {
             before(grammarAccess.getFollowRelationAccess().getParentAssignment_1()); 
            // InternalDslproject.g:1675:2: ( rule__FollowRelation__ParentAssignment_1 )
            // InternalDslproject.g:1675:3: rule__FollowRelation__ParentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FollowRelation__ParentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFollowRelationAccess().getParentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRelation__Group__1__Impl"


    // $ANTLR start "rule__FollowRelation__Group__2"
    // InternalDslproject.g:1683:1: rule__FollowRelation__Group__2 : rule__FollowRelation__Group__2__Impl rule__FollowRelation__Group__3 ;
    public final void rule__FollowRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1687:1: ( rule__FollowRelation__Group__2__Impl rule__FollowRelation__Group__3 )
            // InternalDslproject.g:1688:2: rule__FollowRelation__Group__2__Impl rule__FollowRelation__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__FollowRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowRelation__Group__3();

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
    // $ANTLR end "rule__FollowRelation__Group__2"


    // $ANTLR start "rule__FollowRelation__Group__2__Impl"
    // InternalDslproject.g:1695:1: rule__FollowRelation__Group__2__Impl : ( '->' ) ;
    public final void rule__FollowRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1699:1: ( ( '->' ) )
            // InternalDslproject.g:1700:1: ( '->' )
            {
            // InternalDslproject.g:1700:1: ( '->' )
            // InternalDslproject.g:1701:2: '->'
            {
             before(grammarAccess.getFollowRelationAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFollowRelationAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRelation__Group__2__Impl"


    // $ANTLR start "rule__FollowRelation__Group__3"
    // InternalDslproject.g:1710:1: rule__FollowRelation__Group__3 : rule__FollowRelation__Group__3__Impl rule__FollowRelation__Group__4 ;
    public final void rule__FollowRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1714:1: ( rule__FollowRelation__Group__3__Impl rule__FollowRelation__Group__4 )
            // InternalDslproject.g:1715:2: rule__FollowRelation__Group__3__Impl rule__FollowRelation__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__FollowRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowRelation__Group__4();

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
    // $ANTLR end "rule__FollowRelation__Group__3"


    // $ANTLR start "rule__FollowRelation__Group__3__Impl"
    // InternalDslproject.g:1722:1: rule__FollowRelation__Group__3__Impl : ( ( rule__FollowRelation__ChildAssignment_3 ) ) ;
    public final void rule__FollowRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1726:1: ( ( ( rule__FollowRelation__ChildAssignment_3 ) ) )
            // InternalDslproject.g:1727:1: ( ( rule__FollowRelation__ChildAssignment_3 ) )
            {
            // InternalDslproject.g:1727:1: ( ( rule__FollowRelation__ChildAssignment_3 ) )
            // InternalDslproject.g:1728:2: ( rule__FollowRelation__ChildAssignment_3 )
            {
             before(grammarAccess.getFollowRelationAccess().getChildAssignment_3()); 
            // InternalDslproject.g:1729:2: ( rule__FollowRelation__ChildAssignment_3 )
            // InternalDslproject.g:1729:3: rule__FollowRelation__ChildAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FollowRelation__ChildAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFollowRelationAccess().getChildAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRelation__Group__3__Impl"


    // $ANTLR start "rule__FollowRelation__Group__4"
    // InternalDslproject.g:1737:1: rule__FollowRelation__Group__4 : rule__FollowRelation__Group__4__Impl ;
    public final void rule__FollowRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1741:1: ( rule__FollowRelation__Group__4__Impl )
            // InternalDslproject.g:1742:2: rule__FollowRelation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowRelation__Group__4__Impl();

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
    // $ANTLR end "rule__FollowRelation__Group__4"


    // $ANTLR start "rule__FollowRelation__Group__4__Impl"
    // InternalDslproject.g:1748:1: rule__FollowRelation__Group__4__Impl : ( ')' ) ;
    public final void rule__FollowRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1752:1: ( ( ')' ) )
            // InternalDslproject.g:1753:1: ( ')' )
            {
            // InternalDslproject.g:1753:1: ( ')' )
            // InternalDslproject.g:1754:2: ')'
            {
             before(grammarAccess.getFollowRelationAccess().getRightParenthesisKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFollowRelationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRelation__Group__4__Impl"


    // $ANTLR start "rule__Model__AgentAssignment"
    // InternalDslproject.g:1764:1: rule__Model__AgentAssignment : ( ruleAgent ) ;
    public final void rule__Model__AgentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1768:1: ( ( ruleAgent ) )
            // InternalDslproject.g:1769:2: ( ruleAgent )
            {
            // InternalDslproject.g:1769:2: ( ruleAgent )
            // InternalDslproject.g:1770:3: ruleAgent
            {
             before(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAgent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AgentAssignment"


    // $ANTLR start "rule__Intent__NameAssignment_1"
    // InternalDslproject.g:1779:1: rule__Intent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Intent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1783:1: ( ( RULE_ID ) )
            // InternalDslproject.g:1784:2: ( RULE_ID )
            {
            // InternalDslproject.g:1784:2: ( RULE_ID )
            // InternalDslproject.g:1785:3: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__NameAssignment_1"


    // $ANTLR start "rule__Intent__ZuperAssignment_2_1"
    // InternalDslproject.g:1794:1: rule__Intent__ZuperAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Intent__ZuperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1798:1: ( ( ( RULE_ID ) ) )
            // InternalDslproject.g:1799:2: ( ( RULE_ID ) )
            {
            // InternalDslproject.g:1799:2: ( ( RULE_ID ) )
            // InternalDslproject.g:1800:3: ( RULE_ID )
            {
             before(grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0()); 
            // InternalDslproject.g:1801:3: ( RULE_ID )
            // InternalDslproject.g:1802:4: RULE_ID
            {
             before(grammarAccess.getIntentAccess().getZuperIntentIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntentAccess().getZuperIntentIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__ZuperAssignment_2_1"


    // $ANTLR start "rule__Intent__QuestionAssignment_3"
    // InternalDslproject.g:1813:1: rule__Intent__QuestionAssignment_3 : ( ruleQuestionRef ) ;
    public final void rule__Intent__QuestionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1817:1: ( ( ruleQuestionRef ) )
            // InternalDslproject.g:1818:2: ( ruleQuestionRef )
            {
            // InternalDslproject.g:1818:2: ( ruleQuestionRef )
            // InternalDslproject.g:1819:3: ruleQuestionRef
            {
             before(grammarAccess.getIntentAccess().getQuestionQuestionRefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionRef();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getQuestionQuestionRefParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__QuestionAssignment_3"


    // $ANTLR start "rule__Intent__TrainingAssignment_4"
    // InternalDslproject.g:1828:1: rule__Intent__TrainingAssignment_4 : ( ruleTraining ) ;
    public final void rule__Intent__TrainingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1832:1: ( ( ruleTraining ) )
            // InternalDslproject.g:1833:2: ( ruleTraining )
            {
            // InternalDslproject.g:1833:2: ( ruleTraining )
            // InternalDslproject.g:1834:3: ruleTraining
            {
             before(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Intent__TrainingAssignment_4"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDslproject.g:1843:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1847:1: ( ( RULE_ID ) )
            // InternalDslproject.g:1848:2: ( RULE_ID )
            {
            // InternalDslproject.g:1848:2: ( RULE_ID )
            // InternalDslproject.g:1849:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ExampleAssignment_3"
    // InternalDslproject.g:1858:1: rule__Entity__ExampleAssignment_3 : ( ruleEntityExample ) ;
    public final void rule__Entity__ExampleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1862:1: ( ( ruleEntityExample ) )
            // InternalDslproject.g:1863:2: ( ruleEntityExample )
            {
            // InternalDslproject.g:1863:2: ( ruleEntityExample )
            // InternalDslproject.g:1864:3: ruleEntityExample
            {
             before(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityExample();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__ExampleAssignment_3"


    // $ANTLR start "rule__QuestionRef__QuestionAssignment_0"
    // InternalDslproject.g:1873:1: rule__QuestionRef__QuestionAssignment_0 : ( ruleQuestion ) ;
    public final void rule__QuestionRef__QuestionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1877:1: ( ( ruleQuestion ) )
            // InternalDslproject.g:1878:2: ( ruleQuestion )
            {
            // InternalDslproject.g:1878:2: ( ruleQuestion )
            // InternalDslproject.g:1879:3: ruleQuestion
            {
             before(grammarAccess.getQuestionRefAccess().getQuestionQuestionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRefAccess().getQuestionQuestionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionRef__QuestionAssignment_0"


    // $ANTLR start "rule__QuestionRef__SuperQuestionAssignment_1"
    // InternalDslproject.g:1888:1: rule__QuestionRef__SuperQuestionAssignment_1 : ( ruleSuperQuestion ) ;
    public final void rule__QuestionRef__SuperQuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1892:1: ( ( ruleSuperQuestion ) )
            // InternalDslproject.g:1893:2: ( ruleSuperQuestion )
            {
            // InternalDslproject.g:1893:2: ( ruleSuperQuestion )
            // InternalDslproject.g:1894:3: ruleSuperQuestion
            {
             before(grammarAccess.getQuestionRefAccess().getSuperQuestionSuperQuestionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRefAccess().getSuperQuestionSuperQuestionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionRef__SuperQuestionAssignment_1"


    // $ANTLR start "rule__Question__RequiredAssignment_0"
    // InternalDslproject.g:1903:1: rule__Question__RequiredAssignment_0 : ( ( 'require' ) ) ;
    public final void rule__Question__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1907:1: ( ( ( 'require' ) ) )
            // InternalDslproject.g:1908:2: ( ( 'require' ) )
            {
            // InternalDslproject.g:1908:2: ( ( 'require' ) )
            // InternalDslproject.g:1909:3: ( 'require' )
            {
             before(grammarAccess.getQuestionAccess().getRequiredRequireKeyword_0_0()); 
            // InternalDslproject.g:1910:3: ( 'require' )
            // InternalDslproject.g:1911:4: 'require'
            {
             before(grammarAccess.getQuestionAccess().getRequiredRequireKeyword_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRequiredRequireKeyword_0_0()); 

            }

             after(grammarAccess.getQuestionAccess().getRequiredRequireKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__RequiredAssignment_0"


    // $ANTLR start "rule__Question__NameAssignment_1"
    // InternalDslproject.g:1922:1: rule__Question__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Question__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1926:1: ( ( RULE_ID ) )
            // InternalDslproject.g:1927:2: ( RULE_ID )
            {
            // InternalDslproject.g:1927:2: ( RULE_ID )
            // InternalDslproject.g:1928:3: RULE_ID
            {
             before(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__NameAssignment_1"


    // $ANTLR start "rule__Question__QuestionEntityAssignment_3"
    // InternalDslproject.g:1937:1: rule__Question__QuestionEntityAssignment_3 : ( ruleQuestionEntity ) ;
    public final void rule__Question__QuestionEntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1941:1: ( ( ruleQuestionEntity ) )
            // InternalDslproject.g:1942:2: ( ruleQuestionEntity )
            {
            // InternalDslproject.g:1942:2: ( ruleQuestionEntity )
            // InternalDslproject.g:1943:3: ruleQuestionEntity
            {
             before(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestionEntity();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionEntityAssignment_3"


    // $ANTLR start "rule__Question__PromptAssignment_5"
    // InternalDslproject.g:1952:1: rule__Question__PromptAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Question__PromptAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1956:1: ( ( RULE_STRING ) )
            // InternalDslproject.g:1957:2: ( RULE_STRING )
            {
            // InternalDslproject.g:1957:2: ( RULE_STRING )
            // InternalDslproject.g:1958:3: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__PromptAssignment_5"


    // $ANTLR start "rule__SuperQuestion__SuperQuestionAssignment_1"
    // InternalDslproject.g:1967:1: rule__SuperQuestion__SuperQuestionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SuperQuestion__SuperQuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1971:1: ( ( ( RULE_ID ) ) )
            // InternalDslproject.g:1972:2: ( ( RULE_ID ) )
            {
            // InternalDslproject.g:1972:2: ( ( RULE_ID ) )
            // InternalDslproject.g:1973:3: ( RULE_ID )
            {
             before(grammarAccess.getSuperQuestionAccess().getSuperQuestionQuestionCrossReference_1_0()); 
            // InternalDslproject.g:1974:3: ( RULE_ID )
            // InternalDslproject.g:1975:4: RULE_ID
            {
             before(grammarAccess.getSuperQuestionAccess().getSuperQuestionQuestionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSuperQuestionAccess().getSuperQuestionQuestionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSuperQuestionAccess().getSuperQuestionQuestionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperQuestion__SuperQuestionAssignment_1"


    // $ANTLR start "rule__QuestionEntity__WithEntityAssignment"
    // InternalDslproject.g:1986:1: rule__QuestionEntity__WithEntityAssignment : ( ruleReference ) ;
    public final void rule__QuestionEntity__WithEntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:1990:1: ( ( ruleReference ) )
            // InternalDslproject.g:1991:2: ( ruleReference )
            {
            // InternalDslproject.g:1991:2: ( ruleReference )
            // InternalDslproject.g:1992:3: ruleReference
            {
             before(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionEntity__WithEntityAssignment"


    // $ANTLR start "rule__Training__TrainingrefAssignment_2"
    // InternalDslproject.g:2001:1: rule__Training__TrainingrefAssignment_2 : ( ruleTrainingRef ) ;
    public final void rule__Training__TrainingrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2005:1: ( ( ruleTrainingRef ) )
            // InternalDslproject.g:2006:2: ( ruleTrainingRef )
            {
            // InternalDslproject.g:2006:2: ( ruleTrainingRef )
            // InternalDslproject.g:2007:3: ruleTrainingRef
            {
             before(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainingRef();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__TrainingrefAssignment_2"


    // $ANTLR start "rule__TrainingRef__InputAssignment_0"
    // InternalDslproject.g:2016:1: rule__TrainingRef__InputAssignment_0 : ( ruleTrainingInput ) ;
    public final void rule__TrainingRef__InputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2020:1: ( ( ruleTrainingInput ) )
            // InternalDslproject.g:2021:2: ( ruleTrainingInput )
            {
            // InternalDslproject.g:2021:2: ( ruleTrainingInput )
            // InternalDslproject.g:2022:3: ruleTrainingInput
            {
             before(grammarAccess.getTrainingRefAccess().getInputTrainingInputParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTrainingInput();

            state._fsp--;

             after(grammarAccess.getTrainingRefAccess().getInputTrainingInputParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingRef__InputAssignment_0"


    // $ANTLR start "rule__TrainingInput__SAssignment_0_1"
    // InternalDslproject.g:2031:1: rule__TrainingInput__SAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TrainingInput__SAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2035:1: ( ( RULE_STRING ) )
            // InternalDslproject.g:2036:2: ( RULE_STRING )
            {
            // InternalDslproject.g:2036:2: ( RULE_STRING )
            // InternalDslproject.g:2037:3: RULE_STRING
            {
             before(grammarAccess.getTrainingInputAccess().getSSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTrainingInputAccess().getSSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingInput__SAssignment_0_1"


    // $ANTLR start "rule__TrainingInput__DeclarationsAssignment_1_1"
    // InternalDslproject.g:2046:1: rule__TrainingInput__DeclarationsAssignment_1_1 : ( ruleDeclaration ) ;
    public final void rule__TrainingInput__DeclarationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2050:1: ( ( ruleDeclaration ) )
            // InternalDslproject.g:2051:2: ( ruleDeclaration )
            {
            // InternalDslproject.g:2051:2: ( ruleDeclaration )
            // InternalDslproject.g:2052:3: ruleDeclaration
            {
             before(grammarAccess.getTrainingInputAccess().getDeclarationsDeclarationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getTrainingInputAccess().getDeclarationsDeclarationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainingInput__DeclarationsAssignment_1_1"


    // $ANTLR start "rule__Declaration__TrainingstringAssignment_1"
    // InternalDslproject.g:2061:1: rule__Declaration__TrainingstringAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Declaration__TrainingstringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2065:1: ( ( RULE_STRING ) )
            // InternalDslproject.g:2066:2: ( RULE_STRING )
            {
            // InternalDslproject.g:2066:2: ( RULE_STRING )
            // InternalDslproject.g:2067:3: RULE_STRING
            {
             before(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__TrainingstringAssignment_1"


    // $ANTLR start "rule__Declaration__ReferenceAssignment_3"
    // InternalDslproject.g:2076:1: rule__Declaration__ReferenceAssignment_3 : ( ruleReference ) ;
    public final void rule__Declaration__ReferenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2080:1: ( ( ruleReference ) )
            // InternalDslproject.g:2081:2: ( ruleReference )
            {
            // InternalDslproject.g:2081:2: ( ruleReference )
            // InternalDslproject.g:2082:3: ruleReference
            {
             before(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__ReferenceAssignment_3"


    // $ANTLR start "rule__EntityExample__NameAssignment_0"
    // InternalDslproject.g:2091:1: rule__EntityExample__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EntityExample__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2095:1: ( ( RULE_ID ) )
            // InternalDslproject.g:2096:2: ( RULE_ID )
            {
            // InternalDslproject.g:2096:2: ( RULE_ID )
            // InternalDslproject.g:2097:3: RULE_ID
            {
             before(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityExample__NameAssignment_0"


    // $ANTLR start "rule__Sysvariable__ValueAssignment"
    // InternalDslproject.g:2106:1: rule__Sysvariable__ValueAssignment : ( ( rule__Sysvariable__ValueAlternatives_0 ) ) ;
    public final void rule__Sysvariable__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2110:1: ( ( ( rule__Sysvariable__ValueAlternatives_0 ) ) )
            // InternalDslproject.g:2111:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            {
            // InternalDslproject.g:2111:2: ( ( rule__Sysvariable__ValueAlternatives_0 ) )
            // InternalDslproject.g:2112:3: ( rule__Sysvariable__ValueAlternatives_0 )
            {
             before(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); 
            // InternalDslproject.g:2113:3: ( rule__Sysvariable__ValueAlternatives_0 )
            // InternalDslproject.g:2113:4: rule__Sysvariable__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Sysvariable__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSysvariableAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sysvariable__ValueAssignment"


    // $ANTLR start "rule__Reference__EntityAssignment_0"
    // InternalDslproject.g:2121:1: rule__Reference__EntityAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__EntityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2125:1: ( ( ( RULE_ID ) ) )
            // InternalDslproject.g:2126:2: ( ( RULE_ID ) )
            {
            // InternalDslproject.g:2126:2: ( ( RULE_ID ) )
            // InternalDslproject.g:2127:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 
            // InternalDslproject.g:2128:3: ( RULE_ID )
            // InternalDslproject.g:2129:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getEntityEntityIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__EntityAssignment_0"


    // $ANTLR start "rule__Reference__SysvarAssignment_1"
    // InternalDslproject.g:2140:1: rule__Reference__SysvarAssignment_1 : ( ruleSysvariable ) ;
    public final void rule__Reference__SysvarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2144:1: ( ( ruleSysvariable ) )
            // InternalDslproject.g:2145:2: ( ruleSysvariable )
            {
            // InternalDslproject.g:2145:2: ( ruleSysvariable )
            // InternalDslproject.g:2146:3: ruleSysvariable
            {
             before(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSysvariable();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__SysvarAssignment_1"


    // $ANTLR start "rule__FollowRelation__ParentAssignment_1"
    // InternalDslproject.g:2155:1: rule__FollowRelation__ParentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FollowRelation__ParentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2159:1: ( ( ( RULE_ID ) ) )
            // InternalDslproject.g:2160:2: ( ( RULE_ID ) )
            {
            // InternalDslproject.g:2160:2: ( ( RULE_ID ) )
            // InternalDslproject.g:2161:3: ( RULE_ID )
            {
             before(grammarAccess.getFollowRelationAccess().getParentIntentCrossReference_1_0()); 
            // InternalDslproject.g:2162:3: ( RULE_ID )
            // InternalDslproject.g:2163:4: RULE_ID
            {
             before(grammarAccess.getFollowRelationAccess().getParentIntentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFollowRelationAccess().getParentIntentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFollowRelationAccess().getParentIntentCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRelation__ParentAssignment_1"


    // $ANTLR start "rule__FollowRelation__ChildAssignment_3"
    // InternalDslproject.g:2174:1: rule__FollowRelation__ChildAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__FollowRelation__ChildAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslproject.g:2178:1: ( ( ( RULE_ID ) ) )
            // InternalDslproject.g:2179:2: ( ( RULE_ID ) )
            {
            // InternalDslproject.g:2179:2: ( ( RULE_ID ) )
            // InternalDslproject.g:2180:3: ( RULE_ID )
            {
             before(grammarAccess.getFollowRelationAccess().getChildIntentCrossReference_3_0()); 
            // InternalDslproject.g:2181:3: ( RULE_ID )
            // InternalDslproject.g:2182:4: RULE_ID
            {
             before(grammarAccess.getFollowRelationAccess().getChildIntentIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFollowRelationAccess().getChildIntentIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFollowRelationAccess().getChildIntentCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowRelation__ChildAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000405000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000080A2FFF810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000080A2FFF812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008020FFF810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});

}