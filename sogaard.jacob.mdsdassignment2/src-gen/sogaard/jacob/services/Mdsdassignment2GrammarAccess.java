/*
 * generated by Xtext 2.20.0
 */
package sogaard.jacob.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Mdsdassignment2GrammarAccess extends AbstractGrammarElementFinder {
	
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sogaard.jacob.Mdsdassignment2.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cResultKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cIsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		private final Keyword cEndKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//MathExp:
		//	'result' 'is' exp=Exp 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'result' 'is' exp=Exp 'end'
		public Group getGroup() { return cGroup; }
		
		//'result'
		public Keyword getResultKeyword_0() { return cResultKeyword_0; }
		
		//'is'
		public Keyword getIsKeyword_1() { return cIsKeyword_1; }
		
		//exp=Exp
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_2_0() { return cExpExpParserRuleCall_2_0; }
		
		//'end'
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sogaard.jacob.Mdsdassignment2.Exp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftExpOpParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cOperatorAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cOperatorExpOpParserRuleCall_1_0_0 = (RuleCall)cOperatorAssignment_1_0.eContents().get(0);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightExpParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//Exp:
		//	left=ExpOp (operator=ExpOp right=Exp)?;
		@Override public ParserRule getRule() { return rule; }
		
		//// Illegal due to left recursion (Is fixed, Primary was Exp before.)
		//left=ExpOp (operator=ExpOp right=Exp)?
		public Group getGroup() { return cGroup; }
		
		//// Illegal due to left recursion (Is fixed, Primary was Exp before.)
		//left=ExpOp
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//ExpOp
		public RuleCall getLeftExpOpParserRuleCall_0_0() { return cLeftExpOpParserRuleCall_0_0; }
		
		//(operator=ExpOp right=Exp)?
		public Group getGroup_1() { return cGroup_1; }
		
		//operator=ExpOp
		public Assignment getOperatorAssignment_1_0() { return cOperatorAssignment_1_0; }
		
		//ExpOp
		public RuleCall getOperatorExpOpParserRuleCall_1_0_0() { return cOperatorExpOpParserRuleCall_1_0_0; }
		
		//right=Exp
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Exp
		public RuleCall getRightExpParserRuleCall_1_1_0() { return cRightExpParserRuleCall_1_1_0; }
	}
	public class ExpOpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sogaard.jacob.Mdsdassignment2.ExpOp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFactorParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cAddLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightFactorParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cSubLeftAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRightFactorParserRuleCall_1_1_2_0 = (RuleCall)cRightAssignment_1_1_2.eContents().get(0);
		
		//ExpOp:
		//	Factor ({Add.left=current} '+' right=Factor | {Sub.left=current} '-' right=Factor)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Factor ({Add.left=current} '+' right=Factor | {Sub.left=current} '-' right=Factor)*
		public Group getGroup() { return cGroup; }
		
		//Factor
		public RuleCall getFactorParserRuleCall_0() { return cFactorParserRuleCall_0; }
		
		//({Add.left=current} '+' right=Factor | {Sub.left=current} '-' right=Factor)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{Add.left=current} '+' right=Factor
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{Add.left=current}
		public Action getAddLeftAction_1_0_0() { return cAddLeftAction_1_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_1() { return cPlusSignKeyword_1_0_1; }
		
		//right=Factor
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//Factor
		public RuleCall getRightFactorParserRuleCall_1_0_2_0() { return cRightFactorParserRuleCall_1_0_2_0; }
		
		//{Sub.left=current} '-' right=Factor
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{Sub.left=current}
		public Action getSubLeftAction_1_1_0() { return cSubLeftAction_1_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_1_1() { return cHyphenMinusKeyword_1_1_1; }
		
		//right=Factor
		public Assignment getRightAssignment_1_1_2() { return cRightAssignment_1_1_2; }
		
		//Factor
		public RuleCall getRightFactorParserRuleCall_1_1_2_0() { return cRightFactorParserRuleCall_1_1_2_0; }
	}
	public class FactorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sogaard.jacob.Mdsdassignment2.Factor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cMultLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cDivLeftAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_2_0 = (RuleCall)cRightAssignment_1_1_2.eContents().get(0);
		
		//Factor ExpOp:
		//	Primary ({Mult.left=current} '*' right=Primary | {Div.left=current} '/' right=Primary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary ({Mult.left=current} '*' right=Primary | {Div.left=current} '/' right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//({Mult.left=current} '*' right=Primary | {Div.left=current} '/' right=Primary)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{Mult.left=current} '*' right=Primary
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0_0() { return cMultLeftAction_1_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_1() { return cAsteriskKeyword_1_0_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_0_2_0() { return cRightPrimaryParserRuleCall_1_0_2_0; }
		
		//{Div.left=current} '/' right=Primary
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_1_0() { return cDivLeftAction_1_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_1_1() { return cSolidusKeyword_1_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1_2() { return cRightAssignment_1_1_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_2_0() { return cRightPrimaryParserRuleCall_1_1_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sogaard.jacob.Mdsdassignment2.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesisParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Primary ExpOp:
		//	Num | Parenthesis;
		@Override public ParserRule getRule() { return rule; }
		
		//Num | Parenthesis
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Num
		public RuleCall getNumParserRuleCall_0() { return cNumParserRuleCall_0; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_1() { return cParenthesisParserRuleCall_1; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sogaard.jacob.Mdsdassignment2.Parenthesis");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_0 = (RuleCall)cExpAssignment_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Parenthesis:
		//	'(' exp=Exp ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' exp=Exp ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1() { return cExpAssignment_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_0() { return cExpExpParserRuleCall_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class NumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "sogaard.jacob.Mdsdassignment2.Num");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Num:
		//	value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	
	
	private final MathExpElements pMathExp;
	private final ExpElements pExp;
	private final ExpOpElements pExpOp;
	private final FactorElements pFactor;
	private final PrimaryElements pPrimary;
	private final ParenthesisElements pParenthesis;
	private final NumElements pNum;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Mdsdassignment2GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMathExp = new MathExpElements();
		this.pExp = new ExpElements();
		this.pExpOp = new ExpOpElements();
		this.pFactor = new FactorElements();
		this.pPrimary = new PrimaryElements();
		this.pParenthesis = new ParenthesisElements();
		this.pNum = new NumElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("sogaard.jacob.Mdsdassignment2".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MathExp:
	//	'result' 'is' exp=Exp 'end';
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//Exp:
	//	left=ExpOp (operator=ExpOp right=Exp)?;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//ExpOp:
	//	Factor ({Add.left=current} '+' right=Factor | {Sub.left=current} '-' right=Factor)*;
	public ExpOpElements getExpOpAccess() {
		return pExpOp;
	}
	
	public ParserRule getExpOpRule() {
		return getExpOpAccess().getRule();
	}
	
	//Factor ExpOp:
	//	Primary ({Mult.left=current} '*' right=Primary | {Div.left=current} '/' right=Primary)*;
	public FactorElements getFactorAccess() {
		return pFactor;
	}
	
	public ParserRule getFactorRule() {
		return getFactorAccess().getRule();
	}
	
	//Primary ExpOp:
	//	Num | Parenthesis;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Parenthesis:
	//	'(' exp=Exp ')';
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//Num:
	//	value=INT;
	public NumElements getNumAccess() {
		return pNum;
	}
	
	public ParserRule getNumRule() {
		return getNumAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
