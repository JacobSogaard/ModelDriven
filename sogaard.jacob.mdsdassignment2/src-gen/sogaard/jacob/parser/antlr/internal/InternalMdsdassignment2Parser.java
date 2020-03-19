package sogaard.jacob.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sogaard.jacob.services.Mdsdassignment2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMdsdassignment2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'end'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMdsdassignment2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMdsdassignment2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMdsdassignment2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalMdsdassignment2.g"; }



     	private Mdsdassignment2GrammarAccess grammarAccess;

        public InternalMdsdassignment2Parser(TokenStream input, Mdsdassignment2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected Mdsdassignment2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMdsdassignment2.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMdsdassignment2.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMdsdassignment2.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMdsdassignment2.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= 'end' ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMdsdassignment2.g:77:2: ( (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= 'end' ) )
            // InternalMdsdassignment2.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= 'end' )
            {
            // InternalMdsdassignment2.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= 'end' )
            // InternalMdsdassignment2.g:79:3: otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= 'end'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
            		
            // InternalMdsdassignment2.g:87:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMdsdassignment2.g:88:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMdsdassignment2.g:88:4: (lv_exp_2_0= ruleExp )
            // InternalMdsdassignment2.g:89:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"sogaard.jacob.Mdsdassignment2.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMathExpAccess().getEndKeyword_3());
            		

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMdsdassignment2.g:114:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMdsdassignment2.g:114:44: (iv_ruleExp= ruleExp EOF )
            // InternalMdsdassignment2.g:115:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMdsdassignment2.g:121:1: ruleExp returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpOp ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalMdsdassignment2.g:127:2: ( ( ( (lv_left_0_0= ruleExpOp ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? ) )
            // InternalMdsdassignment2.g:128:2: ( ( (lv_left_0_0= ruleExpOp ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? )
            {
            // InternalMdsdassignment2.g:128:2: ( ( (lv_left_0_0= ruleExpOp ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )? )
            // InternalMdsdassignment2.g:129:3: ( (lv_left_0_0= ruleExpOp ) ) ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )?
            {
            // InternalMdsdassignment2.g:129:3: ( (lv_left_0_0= ruleExpOp ) )
            // InternalMdsdassignment2.g:130:4: (lv_left_0_0= ruleExpOp )
            {
            // InternalMdsdassignment2.g:130:4: (lv_left_0_0= ruleExpOp )
            // InternalMdsdassignment2.g:131:5: lv_left_0_0= ruleExpOp
            {

            					newCompositeNode(grammarAccess.getExpAccess().getLeftExpOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_left_0_0=ruleExpOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"sogaard.jacob.Mdsdassignment2.ExpOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMdsdassignment2.g:148:3: ( ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT||LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMdsdassignment2.g:149:4: ( (lv_operator_1_0= ruleExpOp ) ) ( (lv_right_2_0= ruleExp ) )
                    {
                    // InternalMdsdassignment2.g:149:4: ( (lv_operator_1_0= ruleExpOp ) )
                    // InternalMdsdassignment2.g:150:5: (lv_operator_1_0= ruleExpOp )
                    {
                    // InternalMdsdassignment2.g:150:5: (lv_operator_1_0= ruleExpOp )
                    // InternalMdsdassignment2.g:151:6: lv_operator_1_0= ruleExpOp
                    {

                    						newCompositeNode(grammarAccess.getExpAccess().getOperatorExpOpParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_operator_1_0=ruleExpOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_1_0,
                    							"sogaard.jacob.Mdsdassignment2.ExpOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMdsdassignment2.g:168:4: ( (lv_right_2_0= ruleExp ) )
                    // InternalMdsdassignment2.g:169:5: (lv_right_2_0= ruleExp )
                    {
                    // InternalMdsdassignment2.g:169:5: (lv_right_2_0= ruleExp )
                    // InternalMdsdassignment2.g:170:6: lv_right_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getExpAccess().getRightExpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"sogaard.jacob.Mdsdassignment2.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleExpOp"
    // InternalMdsdassignment2.g:192:1: entryRuleExpOp returns [EObject current=null] : iv_ruleExpOp= ruleExpOp EOF ;
    public final EObject entryRuleExpOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpOp = null;


        try {
            // InternalMdsdassignment2.g:192:46: (iv_ruleExpOp= ruleExpOp EOF )
            // InternalMdsdassignment2.g:193:2: iv_ruleExpOp= ruleExpOp EOF
            {
             newCompositeNode(grammarAccess.getExpOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpOp=ruleExpOp();

            state._fsp--;

             current =iv_ruleExpOp; 
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
    // $ANTLR end "entryRuleExpOp"


    // $ANTLR start "ruleExpOp"
    // InternalMdsdassignment2.g:199:1: ruleExpOp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )* ) ;
    public final EObject ruleExpOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Factor_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMdsdassignment2.g:205:2: ( (this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )* ) )
            // InternalMdsdassignment2.g:206:2: (this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )* )
            {
            // InternalMdsdassignment2.g:206:2: (this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )* )
            // InternalMdsdassignment2.g:207:3: this_Factor_0= ruleFactor ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpOpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMdsdassignment2.g:215:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }
                else if ( (LA2_0==15) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMdsdassignment2.g:216:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) )
            	    {
            	    // InternalMdsdassignment2.g:216:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) ) )
            	    // InternalMdsdassignment2.g:217:5: () otherlv_2= '+' ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalMdsdassignment2.g:217:5: ()
            	    // InternalMdsdassignment2.g:218:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpOpAccess().getAddLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getExpOpAccess().getPlusSignKeyword_1_0_1());
            	    				
            	    // InternalMdsdassignment2.g:228:5: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalMdsdassignment2.g:229:6: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalMdsdassignment2.g:229:6: (lv_right_3_0= ruleFactor )
            	    // InternalMdsdassignment2.g:230:7: lv_right_3_0= ruleFactor
            	    {

            	    							newCompositeNode(grammarAccess.getExpOpAccess().getRightFactorParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpOpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"sogaard.jacob.Mdsdassignment2.Factor");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMdsdassignment2.g:249:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) )
            	    {
            	    // InternalMdsdassignment2.g:249:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) ) )
            	    // InternalMdsdassignment2.g:250:5: () otherlv_5= '-' ( (lv_right_6_0= ruleFactor ) )
            	    {
            	    // InternalMdsdassignment2.g:250:5: ()
            	    // InternalMdsdassignment2.g:251:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getExpOpAccess().getSubLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExpOpAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalMdsdassignment2.g:261:5: ( (lv_right_6_0= ruleFactor ) )
            	    // InternalMdsdassignment2.g:262:6: (lv_right_6_0= ruleFactor )
            	    {
            	    // InternalMdsdassignment2.g:262:6: (lv_right_6_0= ruleFactor )
            	    // InternalMdsdassignment2.g:263:7: lv_right_6_0= ruleFactor
            	    {

            	    							newCompositeNode(grammarAccess.getExpOpAccess().getRightFactorParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    lv_right_6_0=ruleFactor();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getExpOpRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"sogaard.jacob.Mdsdassignment2.Factor");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "ruleExpOp"


    // $ANTLR start "entryRuleFactor"
    // InternalMdsdassignment2.g:286:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMdsdassignment2.g:286:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMdsdassignment2.g:287:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMdsdassignment2.g:293:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMdsdassignment2.g:299:2: ( (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* ) )
            // InternalMdsdassignment2.g:300:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            {
            // InternalMdsdassignment2.g:300:2: (this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )* )
            // InternalMdsdassignment2.g:301:3: this_Primary_0= rulePrimary ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMdsdassignment2.g:309:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }
                else if ( (LA3_0==17) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMdsdassignment2.g:310:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    {
            	    // InternalMdsdassignment2.g:310:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) ) )
            	    // InternalMdsdassignment2.g:311:5: () otherlv_2= '*' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMdsdassignment2.g:311:5: ()
            	    // InternalMdsdassignment2.g:312:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getFactorAccess().getMultLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalMdsdassignment2.g:322:5: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMdsdassignment2.g:323:6: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMdsdassignment2.g:323:6: (lv_right_3_0= rulePrimary )
            	    // InternalMdsdassignment2.g:324:7: lv_right_3_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFactorRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"sogaard.jacob.Mdsdassignment2.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMdsdassignment2.g:343:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    {
            	    // InternalMdsdassignment2.g:343:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) ) )
            	    // InternalMdsdassignment2.g:344:5: () otherlv_5= '/' ( (lv_right_6_0= rulePrimary ) )
            	    {
            	    // InternalMdsdassignment2.g:344:5: ()
            	    // InternalMdsdassignment2.g:345:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getFactorAccess().getDivLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalMdsdassignment2.g:355:5: ( (lv_right_6_0= rulePrimary ) )
            	    // InternalMdsdassignment2.g:356:6: (lv_right_6_0= rulePrimary )
            	    {
            	    // InternalMdsdassignment2.g:356:6: (lv_right_6_0= rulePrimary )
            	    // InternalMdsdassignment2.g:357:7: lv_right_6_0= rulePrimary
            	    {

            	    							newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_right_6_0=rulePrimary();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFactorRule());
            	    							}
            	    							set(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"sogaard.jacob.Mdsdassignment2.Primary");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMdsdassignment2.g:380:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMdsdassignment2.g:380:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMdsdassignment2.g:381:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMdsdassignment2.g:387:1: rulePrimary returns [EObject current=null] : (this_Num_0= ruleNum | this_Parenthesis_1= ruleParenthesis ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Num_0 = null;

        EObject this_Parenthesis_1 = null;



        	enterRule();

        try {
            // InternalMdsdassignment2.g:393:2: ( (this_Num_0= ruleNum | this_Parenthesis_1= ruleParenthesis ) )
            // InternalMdsdassignment2.g:394:2: (this_Num_0= ruleNum | this_Parenthesis_1= ruleParenthesis )
            {
            // InternalMdsdassignment2.g:394:2: (this_Num_0= ruleNum | this_Parenthesis_1= ruleParenthesis )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMdsdassignment2.g:395:3: this_Num_0= ruleNum
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Num_0=ruleNum();

                    state._fsp--;


                    			current = this_Num_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMdsdassignment2.g:404:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMdsdassignment2.g:416:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMdsdassignment2.g:416:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMdsdassignment2.g:417:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMdsdassignment2.g:423:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMdsdassignment2.g:429:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMdsdassignment2.g:430:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMdsdassignment2.g:430:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMdsdassignment2.g:431:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMdsdassignment2.g:435:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMdsdassignment2.g:436:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMdsdassignment2.g:436:4: (lv_exp_1_0= ruleExp )
            // InternalMdsdassignment2.g:437:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"sogaard.jacob.Mdsdassignment2.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNum"
    // InternalMdsdassignment2.g:462:1: entryRuleNum returns [EObject current=null] : iv_ruleNum= ruleNum EOF ;
    public final EObject entryRuleNum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNum = null;


        try {
            // InternalMdsdassignment2.g:462:44: (iv_ruleNum= ruleNum EOF )
            // InternalMdsdassignment2.g:463:2: iv_ruleNum= ruleNum EOF
            {
             newCompositeNode(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNum=ruleNum();

            state._fsp--;

             current =iv_ruleNum; 
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
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // InternalMdsdassignment2.g:469:1: ruleNum returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNum() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMdsdassignment2.g:475:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMdsdassignment2.g:476:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMdsdassignment2.g:476:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMdsdassignment2.g:477:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMdsdassignment2.g:477:3: (lv_value_0_0= RULE_INT )
            // InternalMdsdassignment2.g:478:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});

}