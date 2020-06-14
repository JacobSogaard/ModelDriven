package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.DslprojectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslprojectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Intent'", "'extends'", "'Entity'", "'['", "']'", "'require'", "'='", "'with'", "'get'", "'Training:'", "'.'", "'('", "'is'", "')'", "','", "'number'", "'date-time'", "'date'", "'duration'", "'address'", "'email'", "'phone-number'", "'date-period'", "'time-period'", "'url'", "'any'", "'color'", "'language'", "'->'"
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

        public InternalDslprojectParser(TokenStream input, DslprojectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslprojectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDslproject.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDslproject.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDslproject.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDslproject.g:71:1: ruleModel returns [EObject current=null] : ( (lv_agent_0_0= ruleAgent ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_agent_0_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:77:2: ( ( (lv_agent_0_0= ruleAgent ) )* )
            // InternalDslproject.g:78:2: ( (lv_agent_0_0= ruleAgent ) )*
            {
            // InternalDslproject.g:78:2: ( (lv_agent_0_0= ruleAgent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDslproject.g:79:3: (lv_agent_0_0= ruleAgent )
            	    {
            	    // InternalDslproject.g:79:3: (lv_agent_0_0= ruleAgent )
            	    // InternalDslproject.g:80:4: lv_agent_0_0= ruleAgent
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getAgentAgentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_agent_0_0=ruleAgent();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"agent",
            	    					lv_agent_0_0,
            	    					"org.xtext.example.Dslproject.Agent");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAgent"
    // InternalDslproject.g:100:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalDslproject.g:100:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalDslproject.g:101:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalDslproject.g:107:1: ruleAgent returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Intent_1= ruleIntent | this_FollowRelation_2= ruleFollowRelation ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Intent_1 = null;

        EObject this_FollowRelation_2 = null;



        	enterRule();

        try {
            // InternalDslproject.g:113:2: ( (this_Entity_0= ruleEntity | this_Intent_1= ruleIntent | this_FollowRelation_2= ruleFollowRelation ) )
            // InternalDslproject.g:114:2: (this_Entity_0= ruleEntity | this_Intent_1= ruleIntent | this_FollowRelation_2= ruleFollowRelation )
            {
            // InternalDslproject.g:114:2: (this_Entity_0= ruleEntity | this_Intent_1= ruleIntent | this_FollowRelation_2= ruleFollowRelation )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 22:
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
                    // InternalDslproject.g:115:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDslproject.g:124:3: this_Intent_1= ruleIntent
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getIntentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Intent_1=ruleIntent();

                    state._fsp--;


                    			current = this_Intent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDslproject.g:133:3: this_FollowRelation_2= ruleFollowRelation
                    {

                    			newCompositeNode(grammarAccess.getAgentAccess().getFollowRelationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FollowRelation_2=ruleFollowRelation();

                    state._fsp--;


                    			current = this_FollowRelation_2;
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
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleIntent"
    // InternalDslproject.g:145:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // InternalDslproject.g:145:47: (iv_ruleIntent= ruleIntent EOF )
            // InternalDslproject.g:146:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // InternalDslproject.g:152:1: ruleIntent returns [EObject current=null] : (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_question_4_0= ruleQuestionRef ) )+ ( (lv_training_5_0= ruleTraining ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_question_4_0 = null;

        EObject lv_training_5_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:158:2: ( (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_question_4_0= ruleQuestionRef ) )+ ( (lv_training_5_0= ruleTraining ) ) ) )
            // InternalDslproject.g:159:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_question_4_0= ruleQuestionRef ) )+ ( (lv_training_5_0= ruleTraining ) ) )
            {
            // InternalDslproject.g:159:2: (otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_question_4_0= ruleQuestionRef ) )+ ( (lv_training_5_0= ruleTraining ) ) )
            // InternalDslproject.g:160:3: otherlv_0= 'Intent' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( (lv_question_4_0= ruleQuestionRef ) )+ ( (lv_training_5_0= ruleTraining ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIntentAccess().getIntentKeyword_0());
            		
            // InternalDslproject.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDslproject.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDslproject.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalDslproject.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIntentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDslproject.g:182:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDslproject.g:183:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntentAccess().getExtendsKeyword_2_0());
                    			
                    // InternalDslproject.g:187:4: ( (otherlv_3= RULE_ID ) )
                    // InternalDslproject.g:188:5: (otherlv_3= RULE_ID )
                    {
                    // InternalDslproject.g:188:5: (otherlv_3= RULE_ID )
                    // InternalDslproject.g:189:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntentRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_3, grammarAccess.getIntentAccess().getZuperIntentCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDslproject.g:201:3: ( (lv_question_4_0= ruleQuestionRef ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||(LA4_0>=16 && LA4_0<=17)||LA4_0==19||(LA4_0>=26 && LA4_0<=38)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDslproject.g:202:4: (lv_question_4_0= ruleQuestionRef )
            	    {
            	    // InternalDslproject.g:202:4: (lv_question_4_0= ruleQuestionRef )
            	    // InternalDslproject.g:203:5: lv_question_4_0= ruleQuestionRef
            	    {

            	    					newCompositeNode(grammarAccess.getIntentAccess().getQuestionQuestionRefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_question_4_0=ruleQuestionRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIntentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"question",
            	    						lv_question_4_0,
            	    						"org.xtext.example.Dslproject.QuestionRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalDslproject.g:220:3: ( (lv_training_5_0= ruleTraining ) )
            // InternalDslproject.g:221:4: (lv_training_5_0= ruleTraining )
            {
            // InternalDslproject.g:221:4: (lv_training_5_0= ruleTraining )
            // InternalDslproject.g:222:5: lv_training_5_0= ruleTraining
            {

            					newCompositeNode(grammarAccess.getIntentAccess().getTrainingTrainingParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_training_5_0=ruleTraining();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntentRule());
            					}
            					set(
            						current,
            						"training",
            						lv_training_5_0,
            						"org.xtext.example.Dslproject.Training");
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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleEntity"
    // InternalDslproject.g:243:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDslproject.g:243:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDslproject.g:244:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDslproject.g:250:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_example_3_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:256:2: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']' ) )
            // InternalDslproject.g:257:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']' )
            {
            // InternalDslproject.g:257:2: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']' )
            // InternalDslproject.g:258:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_example_3_0= ruleEntityExample ) )+ otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDslproject.g:262:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDslproject.g:263:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDslproject.g:263:4: (lv_name_1_0= RULE_ID )
            // InternalDslproject.g:264:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDslproject.g:284:3: ( (lv_example_3_0= ruleEntityExample ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDslproject.g:285:4: (lv_example_3_0= ruleEntityExample )
            	    {
            	    // InternalDslproject.g:285:4: (lv_example_3_0= ruleEntityExample )
            	    // InternalDslproject.g:286:5: lv_example_3_0= ruleEntityExample
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getExampleEntityExampleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_example_3_0=ruleEntityExample();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"example",
            	    						lv_example_3_0,
            	    						"org.xtext.example.Dslproject.EntityExample");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleQuestionRef"
    // InternalDslproject.g:311:1: entryRuleQuestionRef returns [EObject current=null] : iv_ruleQuestionRef= ruleQuestionRef EOF ;
    public final EObject entryRuleQuestionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionRef = null;


        try {
            // InternalDslproject.g:311:52: (iv_ruleQuestionRef= ruleQuestionRef EOF )
            // InternalDslproject.g:312:2: iv_ruleQuestionRef= ruleQuestionRef EOF
            {
             newCompositeNode(grammarAccess.getQuestionRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionRef=ruleQuestionRef();

            state._fsp--;

             current =iv_ruleQuestionRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestionRef"


    // $ANTLR start "ruleQuestionRef"
    // InternalDslproject.g:318:1: ruleQuestionRef returns [EObject current=null] : ( ( (lv_question_0_0= ruleQuestion ) ) | ( (lv_superQuestion_1_0= ruleSuperQuestion ) ) ) ;
    public final EObject ruleQuestionRef() throws RecognitionException {
        EObject current = null;

        EObject lv_question_0_0 = null;

        EObject lv_superQuestion_1_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:324:2: ( ( ( (lv_question_0_0= ruleQuestion ) ) | ( (lv_superQuestion_1_0= ruleSuperQuestion ) ) ) )
            // InternalDslproject.g:325:2: ( ( (lv_question_0_0= ruleQuestion ) ) | ( (lv_superQuestion_1_0= ruleSuperQuestion ) ) )
            {
            // InternalDslproject.g:325:2: ( ( (lv_question_0_0= ruleQuestion ) ) | ( (lv_superQuestion_1_0= ruleSuperQuestion ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=16 && LA6_0<=17)||(LA6_0>=26 && LA6_0<=38)) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDslproject.g:326:3: ( (lv_question_0_0= ruleQuestion ) )
                    {
                    // InternalDslproject.g:326:3: ( (lv_question_0_0= ruleQuestion ) )
                    // InternalDslproject.g:327:4: (lv_question_0_0= ruleQuestion )
                    {
                    // InternalDslproject.g:327:4: (lv_question_0_0= ruleQuestion )
                    // InternalDslproject.g:328:5: lv_question_0_0= ruleQuestion
                    {

                    					newCompositeNode(grammarAccess.getQuestionRefAccess().getQuestionQuestionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_question_0_0=ruleQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuestionRefRule());
                    					}
                    					set(
                    						current,
                    						"question",
                    						lv_question_0_0,
                    						"org.xtext.example.Dslproject.Question");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDslproject.g:346:3: ( (lv_superQuestion_1_0= ruleSuperQuestion ) )
                    {
                    // InternalDslproject.g:346:3: ( (lv_superQuestion_1_0= ruleSuperQuestion ) )
                    // InternalDslproject.g:347:4: (lv_superQuestion_1_0= ruleSuperQuestion )
                    {
                    // InternalDslproject.g:347:4: (lv_superQuestion_1_0= ruleSuperQuestion )
                    // InternalDslproject.g:348:5: lv_superQuestion_1_0= ruleSuperQuestion
                    {

                    					newCompositeNode(grammarAccess.getQuestionRefAccess().getSuperQuestionSuperQuestionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_superQuestion_1_0=ruleSuperQuestion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuestionRefRule());
                    					}
                    					set(
                    						current,
                    						"superQuestion",
                    						lv_superQuestion_1_0,
                    						"org.xtext.example.Dslproject.SuperQuestion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleQuestionRef"


    // $ANTLR start "entryRuleQuestion"
    // InternalDslproject.g:369:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalDslproject.g:369:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalDslproject.g:370:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalDslproject.g:376:1: ruleQuestion returns [EObject current=null] : ( ( (lv_required_0_0= 'require' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '=' )? ( (lv_questionEntity_3_0= ruleQuestionEntity ) ) otherlv_4= 'with' ( (lv_prompt_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_prompt_5_0=null;
        EObject lv_questionEntity_3_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:382:2: ( ( ( (lv_required_0_0= 'require' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '=' )? ( (lv_questionEntity_3_0= ruleQuestionEntity ) ) otherlv_4= 'with' ( (lv_prompt_5_0= RULE_STRING ) ) ) )
            // InternalDslproject.g:383:2: ( ( (lv_required_0_0= 'require' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '=' )? ( (lv_questionEntity_3_0= ruleQuestionEntity ) ) otherlv_4= 'with' ( (lv_prompt_5_0= RULE_STRING ) ) )
            {
            // InternalDslproject.g:383:2: ( ( (lv_required_0_0= 'require' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '=' )? ( (lv_questionEntity_3_0= ruleQuestionEntity ) ) otherlv_4= 'with' ( (lv_prompt_5_0= RULE_STRING ) ) )
            // InternalDslproject.g:384:3: ( (lv_required_0_0= 'require' ) )? ( (lv_name_1_0= RULE_ID ) )? (otherlv_2= '=' )? ( (lv_questionEntity_3_0= ruleQuestionEntity ) ) otherlv_4= 'with' ( (lv_prompt_5_0= RULE_STRING ) )
            {
            // InternalDslproject.g:384:3: ( (lv_required_0_0= 'require' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDslproject.g:385:4: (lv_required_0_0= 'require' )
                    {
                    // InternalDslproject.g:385:4: (lv_required_0_0= 'require' )
                    // InternalDslproject.g:386:5: lv_required_0_0= 'require'
                    {
                    lv_required_0_0=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(lv_required_0_0, grammarAccess.getQuestionAccess().getRequiredRequireKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionRule());
                    					}
                    					setWithLastConsumed(current, "required", lv_required_0_0, "require");
                    				

                    }


                    }
                    break;

            }

            // InternalDslproject.g:398:3: ( (lv_name_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID||LA8_1==17||(LA8_1>=26 && LA8_1<=38)) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalDslproject.g:399:4: (lv_name_1_0= RULE_ID )
                    {
                    // InternalDslproject.g:399:4: (lv_name_1_0= RULE_ID )
                    // InternalDslproject.g:400:5: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getQuestionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalDslproject.g:416:3: (otherlv_2= '=' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDslproject.g:417:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getEqualsSignKeyword_2());
                    			

                    }
                    break;

            }

            // InternalDslproject.g:422:3: ( (lv_questionEntity_3_0= ruleQuestionEntity ) )
            // InternalDslproject.g:423:4: (lv_questionEntity_3_0= ruleQuestionEntity )
            {
            // InternalDslproject.g:423:4: (lv_questionEntity_3_0= ruleQuestionEntity )
            // InternalDslproject.g:424:5: lv_questionEntity_3_0= ruleQuestionEntity
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getQuestionEntityQuestionEntityParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_questionEntity_3_0=ruleQuestionEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"questionEntity",
            						lv_questionEntity_3_0,
            						"org.xtext.example.Dslproject.QuestionEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getWithKeyword_4());
            		
            // InternalDslproject.g:445:3: ( (lv_prompt_5_0= RULE_STRING ) )
            // InternalDslproject.g:446:4: (lv_prompt_5_0= RULE_STRING )
            {
            // InternalDslproject.g:446:4: (lv_prompt_5_0= RULE_STRING )
            // InternalDslproject.g:447:5: lv_prompt_5_0= RULE_STRING
            {
            lv_prompt_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_prompt_5_0, grammarAccess.getQuestionAccess().getPromptSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prompt",
            						lv_prompt_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleSuperQuestion"
    // InternalDslproject.g:467:1: entryRuleSuperQuestion returns [EObject current=null] : iv_ruleSuperQuestion= ruleSuperQuestion EOF ;
    public final EObject entryRuleSuperQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperQuestion = null;


        try {
            // InternalDslproject.g:467:54: (iv_ruleSuperQuestion= ruleSuperQuestion EOF )
            // InternalDslproject.g:468:2: iv_ruleSuperQuestion= ruleSuperQuestion EOF
            {
             newCompositeNode(grammarAccess.getSuperQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperQuestion=ruleSuperQuestion();

            state._fsp--;

             current =iv_ruleSuperQuestion; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSuperQuestion"


    // $ANTLR start "ruleSuperQuestion"
    // InternalDslproject.g:474:1: ruleSuperQuestion returns [EObject current=null] : (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSuperQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDslproject.g:480:2: ( (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDslproject.g:481:2: (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDslproject.g:481:2: (otherlv_0= 'get' ( (otherlv_1= RULE_ID ) ) )
            // InternalDslproject.g:482:3: otherlv_0= 'get' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperQuestionAccess().getGetKeyword_0());
            		
            // InternalDslproject.g:486:3: ( (otherlv_1= RULE_ID ) )
            // InternalDslproject.g:487:4: (otherlv_1= RULE_ID )
            {
            // InternalDslproject.g:487:4: (otherlv_1= RULE_ID )
            // InternalDslproject.g:488:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperQuestionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getSuperQuestionAccess().getSuperQuestionQuestionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleSuperQuestion"


    // $ANTLR start "entryRuleQuestionEntity"
    // InternalDslproject.g:503:1: entryRuleQuestionEntity returns [EObject current=null] : iv_ruleQuestionEntity= ruleQuestionEntity EOF ;
    public final EObject entryRuleQuestionEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionEntity = null;


        try {
            // InternalDslproject.g:503:55: (iv_ruleQuestionEntity= ruleQuestionEntity EOF )
            // InternalDslproject.g:504:2: iv_ruleQuestionEntity= ruleQuestionEntity EOF
            {
             newCompositeNode(grammarAccess.getQuestionEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionEntity=ruleQuestionEntity();

            state._fsp--;

             current =iv_ruleQuestionEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestionEntity"


    // $ANTLR start "ruleQuestionEntity"
    // InternalDslproject.g:510:1: ruleQuestionEntity returns [EObject current=null] : ( (lv_withEntity_0_0= ruleReference ) ) ;
    public final EObject ruleQuestionEntity() throws RecognitionException {
        EObject current = null;

        EObject lv_withEntity_0_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:516:2: ( ( (lv_withEntity_0_0= ruleReference ) ) )
            // InternalDslproject.g:517:2: ( (lv_withEntity_0_0= ruleReference ) )
            {
            // InternalDslproject.g:517:2: ( (lv_withEntity_0_0= ruleReference ) )
            // InternalDslproject.g:518:3: (lv_withEntity_0_0= ruleReference )
            {
            // InternalDslproject.g:518:3: (lv_withEntity_0_0= ruleReference )
            // InternalDslproject.g:519:4: lv_withEntity_0_0= ruleReference
            {

            				newCompositeNode(grammarAccess.getQuestionEntityAccess().getWithEntityReferenceParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_withEntity_0_0=ruleReference();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getQuestionEntityRule());
            				}
            				set(
            					current,
            					"withEntity",
            					lv_withEntity_0_0,
            					"org.xtext.example.Dslproject.Reference");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleQuestionEntity"


    // $ANTLR start "entryRuleTraining"
    // InternalDslproject.g:539:1: entryRuleTraining returns [EObject current=null] : iv_ruleTraining= ruleTraining EOF ;
    public final EObject entryRuleTraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraining = null;


        try {
            // InternalDslproject.g:539:49: (iv_ruleTraining= ruleTraining EOF )
            // InternalDslproject.g:540:2: iv_ruleTraining= ruleTraining EOF
            {
             newCompositeNode(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTraining=ruleTraining();

            state._fsp--;

             current =iv_ruleTraining; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalDslproject.g:546:1: ruleTraining returns [EObject current=null] : ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ ) ;
    public final EObject ruleTraining() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_trainingref_2_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:552:2: ( ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ ) )
            // InternalDslproject.g:553:2: ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ )
            {
            // InternalDslproject.g:553:2: ( () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+ )
            // InternalDslproject.g:554:3: () otherlv_1= 'Training:' ( (lv_trainingref_2_0= ruleTrainingRef ) )+
            {
            // InternalDslproject.g:554:3: ()
            // InternalDslproject.g:555:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrainingAccess().getTrainingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingAccess().getTrainingKeyword_1());
            		
            // InternalDslproject.g:565:3: ( (lv_trainingref_2_0= ruleTrainingRef ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_STRING) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDslproject.g:566:4: (lv_trainingref_2_0= ruleTrainingRef )
            	    {
            	    // InternalDslproject.g:566:4: (lv_trainingref_2_0= ruleTrainingRef )
            	    // InternalDslproject.g:567:5: lv_trainingref_2_0= ruleTrainingRef
            	    {

            	    					newCompositeNode(grammarAccess.getTrainingAccess().getTrainingrefTrainingRefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_trainingref_2_0=ruleTrainingRef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTrainingRule());
            	    					}
            	    					add(
            	    						current,
            	    						"trainingref",
            	    						lv_trainingref_2_0,
            	    						"org.xtext.example.Dslproject.TrainingRef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


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
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleTrainingRef"
    // InternalDslproject.g:588:1: entryRuleTrainingRef returns [EObject current=null] : iv_ruleTrainingRef= ruleTrainingRef EOF ;
    public final EObject entryRuleTrainingRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingRef = null;


        try {
            // InternalDslproject.g:588:52: (iv_ruleTrainingRef= ruleTrainingRef EOF )
            // InternalDslproject.g:589:2: iv_ruleTrainingRef= ruleTrainingRef EOF
            {
             newCompositeNode(grammarAccess.getTrainingRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingRef=ruleTrainingRef();

            state._fsp--;

             current =iv_ruleTrainingRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrainingRef"


    // $ANTLR start "ruleTrainingRef"
    // InternalDslproject.g:595:1: ruleTrainingRef returns [EObject current=null] : ( ( (lv_input_0_0= ruleTrainingInput ) )+ otherlv_1= '.' ) ;
    public final EObject ruleTrainingRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_input_0_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:601:2: ( ( ( (lv_input_0_0= ruleTrainingInput ) )+ otherlv_1= '.' ) )
            // InternalDslproject.g:602:2: ( ( (lv_input_0_0= ruleTrainingInput ) )+ otherlv_1= '.' )
            {
            // InternalDslproject.g:602:2: ( ( (lv_input_0_0= ruleTrainingInput ) )+ otherlv_1= '.' )
            // InternalDslproject.g:603:3: ( (lv_input_0_0= ruleTrainingInput ) )+ otherlv_1= '.'
            {
            // InternalDslproject.g:603:3: ( (lv_input_0_0= ruleTrainingInput ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDslproject.g:604:4: (lv_input_0_0= ruleTrainingInput )
            	    {
            	    // InternalDslproject.g:604:4: (lv_input_0_0= ruleTrainingInput )
            	    // InternalDslproject.g:605:5: lv_input_0_0= ruleTrainingInput
            	    {

            	    					newCompositeNode(grammarAccess.getTrainingRefAccess().getInputTrainingInputParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_input_0_0=ruleTrainingInput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTrainingRefRule());
            	    					}
            	    					add(
            	    						current,
            	    						"input",
            	    						lv_input_0_0,
            	    						"org.xtext.example.Dslproject.TrainingInput");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTrainingRefAccess().getFullStopKeyword_1());
            		

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
    // $ANTLR end "ruleTrainingRef"


    // $ANTLR start "entryRuleTrainingInput"
    // InternalDslproject.g:630:1: entryRuleTrainingInput returns [EObject current=null] : iv_ruleTrainingInput= ruleTrainingInput EOF ;
    public final EObject entryRuleTrainingInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainingInput = null;


        try {
            // InternalDslproject.g:630:54: (iv_ruleTrainingInput= ruleTrainingInput EOF )
            // InternalDslproject.g:631:2: iv_ruleTrainingInput= ruleTrainingInput EOF
            {
             newCompositeNode(grammarAccess.getTrainingInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrainingInput=ruleTrainingInput();

            state._fsp--;

             current =iv_ruleTrainingInput; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrainingInput"


    // $ANTLR start "ruleTrainingInput"
    // InternalDslproject.g:637:1: ruleTrainingInput returns [EObject current=null] : ( ( () ( (lv_s_1_0= RULE_STRING ) ) ) | ( () ( (lv_declarations_3_0= ruleDeclaration ) ) ) ) ;
    public final EObject ruleTrainingInput() throws RecognitionException {
        EObject current = null;

        Token lv_s_1_0=null;
        EObject lv_declarations_3_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:643:2: ( ( ( () ( (lv_s_1_0= RULE_STRING ) ) ) | ( () ( (lv_declarations_3_0= ruleDeclaration ) ) ) ) )
            // InternalDslproject.g:644:2: ( ( () ( (lv_s_1_0= RULE_STRING ) ) ) | ( () ( (lv_declarations_3_0= ruleDeclaration ) ) ) )
            {
            // InternalDslproject.g:644:2: ( ( () ( (lv_s_1_0= RULE_STRING ) ) ) | ( () ( (lv_declarations_3_0= ruleDeclaration ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==22) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDslproject.g:645:3: ( () ( (lv_s_1_0= RULE_STRING ) ) )
                    {
                    // InternalDslproject.g:645:3: ( () ( (lv_s_1_0= RULE_STRING ) ) )
                    // InternalDslproject.g:646:4: () ( (lv_s_1_0= RULE_STRING ) )
                    {
                    // InternalDslproject.g:646:4: ()
                    // InternalDslproject.g:647:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTrainingInputAccess().getSinAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDslproject.g:653:4: ( (lv_s_1_0= RULE_STRING ) )
                    // InternalDslproject.g:654:5: (lv_s_1_0= RULE_STRING )
                    {
                    // InternalDslproject.g:654:5: (lv_s_1_0= RULE_STRING )
                    // InternalDslproject.g:655:6: lv_s_1_0= RULE_STRING
                    {
                    lv_s_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_s_1_0, grammarAccess.getTrainingInputAccess().getSSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTrainingInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"s",
                    							lv_s_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDslproject.g:673:3: ( () ( (lv_declarations_3_0= ruleDeclaration ) ) )
                    {
                    // InternalDslproject.g:673:3: ( () ( (lv_declarations_3_0= ruleDeclaration ) ) )
                    // InternalDslproject.g:674:4: () ( (lv_declarations_3_0= ruleDeclaration ) )
                    {
                    // InternalDslproject.g:674:4: ()
                    // InternalDslproject.g:675:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTrainingInputAccess().getDeclAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDslproject.g:681:4: ( (lv_declarations_3_0= ruleDeclaration ) )
                    // InternalDslproject.g:682:5: (lv_declarations_3_0= ruleDeclaration )
                    {
                    // InternalDslproject.g:682:5: (lv_declarations_3_0= ruleDeclaration )
                    // InternalDslproject.g:683:6: lv_declarations_3_0= ruleDeclaration
                    {

                    						newCompositeNode(grammarAccess.getTrainingInputAccess().getDeclarationsDeclarationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_declarations_3_0=ruleDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrainingInputRule());
                    						}
                    						set(
                    							current,
                    							"declarations",
                    							lv_declarations_3_0,
                    							"org.xtext.example.Dslproject.Declaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleTrainingInput"


    // $ANTLR start "entryRuleDeclaration"
    // InternalDslproject.g:705:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalDslproject.g:705:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalDslproject.g:706:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalDslproject.g:712:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_trainingstring_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:718:2: ( (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' ) )
            // InternalDslproject.g:719:2: (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' )
            {
            // InternalDslproject.g:719:2: (otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')' )
            // InternalDslproject.g:720:3: otherlv_0= '(' ( (lv_trainingstring_1_0= RULE_STRING ) ) otherlv_2= 'is' ( (lv_reference_3_0= ruleReference ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDslproject.g:724:3: ( (lv_trainingstring_1_0= RULE_STRING ) )
            // InternalDslproject.g:725:4: (lv_trainingstring_1_0= RULE_STRING )
            {
            // InternalDslproject.g:725:4: (lv_trainingstring_1_0= RULE_STRING )
            // InternalDslproject.g:726:5: lv_trainingstring_1_0= RULE_STRING
            {
            lv_trainingstring_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_trainingstring_1_0, grammarAccess.getDeclarationAccess().getTrainingstringSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"trainingstring",
            						lv_trainingstring_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getIsKeyword_2());
            		
            // InternalDslproject.g:746:3: ( (lv_reference_3_0= ruleReference ) )
            // InternalDslproject.g:747:4: (lv_reference_3_0= ruleReference )
            {
            // InternalDslproject.g:747:4: (lv_reference_3_0= ruleReference )
            // InternalDslproject.g:748:5: lv_reference_3_0= ruleReference
            {

            					newCompositeNode(grammarAccess.getDeclarationAccess().getReferenceReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_reference_3_0=ruleReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarationRule());
            					}
            					set(
            						current,
            						"reference",
            						lv_reference_3_0,
            						"org.xtext.example.Dslproject.Reference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeclarationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntityExample"
    // InternalDslproject.g:773:1: entryRuleEntityExample returns [EObject current=null] : iv_ruleEntityExample= ruleEntityExample EOF ;
    public final EObject entryRuleEntityExample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityExample = null;


        try {
            // InternalDslproject.g:773:54: (iv_ruleEntityExample= ruleEntityExample EOF )
            // InternalDslproject.g:774:2: iv_ruleEntityExample= ruleEntityExample EOF
            {
             newCompositeNode(grammarAccess.getEntityExampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityExample=ruleEntityExample();

            state._fsp--;

             current =iv_ruleEntityExample; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityExample"


    // $ANTLR start "ruleEntityExample"
    // InternalDslproject.g:780:1: ruleEntityExample returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) ;
    public final EObject ruleEntityExample() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDslproject.g:786:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? ) )
            // InternalDslproject.g:787:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            {
            // InternalDslproject.g:787:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )? )
            // InternalDslproject.g:788:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= ',' )?
            {
            // InternalDslproject.g:788:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDslproject.g:789:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDslproject.g:789:4: (lv_name_0_0= RULE_ID )
            // InternalDslproject.g:790:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEntityExampleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityExampleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDslproject.g:806:3: (otherlv_1= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDslproject.g:807:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityExampleAccess().getCommaKeyword_1());
                    			

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
    // $ANTLR end "ruleEntityExample"


    // $ANTLR start "entryRuleSysvariable"
    // InternalDslproject.g:816:1: entryRuleSysvariable returns [EObject current=null] : iv_ruleSysvariable= ruleSysvariable EOF ;
    public final EObject entryRuleSysvariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSysvariable = null;


        try {
            // InternalDslproject.g:816:52: (iv_ruleSysvariable= ruleSysvariable EOF )
            // InternalDslproject.g:817:2: iv_ruleSysvariable= ruleSysvariable EOF
            {
             newCompositeNode(grammarAccess.getSysvariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSysvariable=ruleSysvariable();

            state._fsp--;

             current =iv_ruleSysvariable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSysvariable"


    // $ANTLR start "ruleSysvariable"
    // InternalDslproject.g:823:1: ruleSysvariable returns [EObject current=null] : ( ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) ) ) ;
    public final EObject ruleSysvariable() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;
        Token lv_value_0_7=null;
        Token lv_value_0_8=null;
        Token lv_value_0_9=null;
        Token lv_value_0_10=null;
        Token lv_value_0_11=null;
        Token lv_value_0_12=null;
        Token lv_value_0_13=null;


        	enterRule();

        try {
            // InternalDslproject.g:829:2: ( ( ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) ) ) )
            // InternalDslproject.g:830:2: ( ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) ) )
            {
            // InternalDslproject.g:830:2: ( ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) ) )
            // InternalDslproject.g:831:3: ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) )
            {
            // InternalDslproject.g:831:3: ( (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' ) )
            // InternalDslproject.g:832:4: (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' )
            {
            // InternalDslproject.g:832:4: (lv_value_0_1= 'number' | lv_value_0_2= 'date-time' | lv_value_0_3= 'date' | lv_value_0_4= 'duration' | lv_value_0_5= 'address' | lv_value_0_6= 'email' | lv_value_0_7= 'phone-number' | lv_value_0_8= 'date-period' | lv_value_0_9= 'time-period' | lv_value_0_10= 'url' | lv_value_0_11= 'any' | lv_value_0_12= 'color' | lv_value_0_13= 'language' )
            int alt14=13;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 29:
                {
                alt14=4;
                }
                break;
            case 30:
                {
                alt14=5;
                }
                break;
            case 31:
                {
                alt14=6;
                }
                break;
            case 32:
                {
                alt14=7;
                }
                break;
            case 33:
                {
                alt14=8;
                }
                break;
            case 34:
                {
                alt14=9;
                }
                break;
            case 35:
                {
                alt14=10;
                }
                break;
            case 36:
                {
                alt14=11;
                }
                break;
            case 37:
                {
                alt14=12;
                }
                break;
            case 38:
                {
                alt14=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDslproject.g:833:5: lv_value_0_1= 'number'
                    {
                    lv_value_0_1=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getSysvariableAccess().getValueNumberKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalDslproject.g:844:5: lv_value_0_2= 'date-time'
                    {
                    lv_value_0_2=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getSysvariableAccess().getValueDateTimeKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalDslproject.g:855:5: lv_value_0_3= 'date'
                    {
                    lv_value_0_3=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getSysvariableAccess().getValueDateKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalDslproject.g:866:5: lv_value_0_4= 'duration'
                    {
                    lv_value_0_4=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getSysvariableAccess().getValueDurationKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalDslproject.g:877:5: lv_value_0_5= 'address'
                    {
                    lv_value_0_5=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getSysvariableAccess().getValueAddressKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalDslproject.g:888:5: lv_value_0_6= 'email'
                    {
                    lv_value_0_6=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getSysvariableAccess().getValueEmailKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalDslproject.g:899:5: lv_value_0_7= 'phone-number'
                    {
                    lv_value_0_7=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_value_0_7, grammarAccess.getSysvariableAccess().getValuePhoneNumberKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalDslproject.g:910:5: lv_value_0_8= 'date-period'
                    {
                    lv_value_0_8=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_value_0_8, grammarAccess.getSysvariableAccess().getValueDatePeriodKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalDslproject.g:921:5: lv_value_0_9= 'time-period'
                    {
                    lv_value_0_9=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_0_9, grammarAccess.getSysvariableAccess().getValueTimePeriodKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalDslproject.g:932:5: lv_value_0_10= 'url'
                    {
                    lv_value_0_10=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_value_0_10, grammarAccess.getSysvariableAccess().getValueUrlKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_10, null);
                    				

                    }
                    break;
                case 11 :
                    // InternalDslproject.g:943:5: lv_value_0_11= 'any'
                    {
                    lv_value_0_11=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_value_0_11, grammarAccess.getSysvariableAccess().getValueAnyKeyword_0_10());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_11, null);
                    				

                    }
                    break;
                case 12 :
                    // InternalDslproject.g:954:5: lv_value_0_12= 'color'
                    {
                    lv_value_0_12=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_value_0_12, grammarAccess.getSysvariableAccess().getValueColorKeyword_0_11());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_12, null);
                    				

                    }
                    break;
                case 13 :
                    // InternalDslproject.g:965:5: lv_value_0_13= 'language'
                    {
                    lv_value_0_13=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_value_0_13, grammarAccess.getSysvariableAccess().getValueLanguageKeyword_0_12());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSysvariableRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_13, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleSysvariable"


    // $ANTLR start "entryRuleReference"
    // InternalDslproject.g:981:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalDslproject.g:981:50: (iv_ruleReference= ruleReference EOF )
            // InternalDslproject.g:982:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDslproject.g:988:1: ruleReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sysvar_1_0 = null;



        	enterRule();

        try {
            // InternalDslproject.g:994:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) ) )
            // InternalDslproject.g:995:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) )
            {
            // InternalDslproject.g:995:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_sysvar_1_0= ruleSysvariable ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=26 && LA15_0<=38)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDslproject.g:996:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalDslproject.g:996:3: ( (otherlv_0= RULE_ID ) )
                    // InternalDslproject.g:997:4: (otherlv_0= RULE_ID )
                    {
                    // InternalDslproject.g:997:4: (otherlv_0= RULE_ID )
                    // InternalDslproject.g:998:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getReferenceRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getEntityEntityCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDslproject.g:1010:3: ( (lv_sysvar_1_0= ruleSysvariable ) )
                    {
                    // InternalDslproject.g:1010:3: ( (lv_sysvar_1_0= ruleSysvariable ) )
                    // InternalDslproject.g:1011:4: (lv_sysvar_1_0= ruleSysvariable )
                    {
                    // InternalDslproject.g:1011:4: (lv_sysvar_1_0= ruleSysvariable )
                    // InternalDslproject.g:1012:5: lv_sysvar_1_0= ruleSysvariable
                    {

                    					newCompositeNode(grammarAccess.getReferenceAccess().getSysvarSysvariableParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_sysvar_1_0=ruleSysvariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReferenceRule());
                    					}
                    					set(
                    						current,
                    						"sysvar",
                    						lv_sysvar_1_0,
                    						"org.xtext.example.Dslproject.Sysvariable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleFollowRelation"
    // InternalDslproject.g:1033:1: entryRuleFollowRelation returns [EObject current=null] : iv_ruleFollowRelation= ruleFollowRelation EOF ;
    public final EObject entryRuleFollowRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowRelation = null;


        try {
            // InternalDslproject.g:1033:55: (iv_ruleFollowRelation= ruleFollowRelation EOF )
            // InternalDslproject.g:1034:2: iv_ruleFollowRelation= ruleFollowRelation EOF
            {
             newCompositeNode(grammarAccess.getFollowRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFollowRelation=ruleFollowRelation();

            state._fsp--;

             current =iv_ruleFollowRelation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFollowRelation"


    // $ANTLR start "ruleFollowRelation"
    // InternalDslproject.g:1040:1: ruleFollowRelation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleFollowRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalDslproject.g:1046:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalDslproject.g:1047:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalDslproject.g:1047:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalDslproject.g:1048:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFollowRelationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDslproject.g:1052:3: ( (otherlv_1= RULE_ID ) )
            // InternalDslproject.g:1053:4: (otherlv_1= RULE_ID )
            {
            // InternalDslproject.g:1053:4: (otherlv_1= RULE_ID )
            // InternalDslproject.g:1054:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFollowRelationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getFollowRelationAccess().getParentIntentCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFollowRelationAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalDslproject.g:1069:3: ( (otherlv_3= RULE_ID ) )
            // InternalDslproject.g:1070:4: (otherlv_3= RULE_ID )
            {
            // InternalDslproject.g:1070:4: (otherlv_3= RULE_ID )
            // InternalDslproject.g:1071:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFollowRelationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getFollowRelationAccess().getChildIntentCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFollowRelationAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleFollowRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000402802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007FFC0B1010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000007FFC1B1010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000007FFC030010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400022L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});

}