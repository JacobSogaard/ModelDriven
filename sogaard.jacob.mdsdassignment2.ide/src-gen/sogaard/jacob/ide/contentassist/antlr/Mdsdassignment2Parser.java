/*
 * generated by Xtext 2.20.0
 */
package sogaard.jacob.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import sogaard.jacob.ide.contentassist.antlr.internal.InternalMdsdassignment2Parser;
import sogaard.jacob.services.Mdsdassignment2GrammarAccess;

public class Mdsdassignment2Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Mdsdassignment2GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Mdsdassignment2GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpOpAccess().getAlternatives_1(), "rule__ExpOp__Alternatives_1");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1(), "rule__Factor__Alternatives_1");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup(), "rule__ExpOp__Group__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup_1_0(), "rule__ExpOp__Group_1_0__0");
			builder.put(grammarAccess.getExpOpAccess().getGroup_1_1(), "rule__ExpOp__Group_1_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0(), "rule__Factor__Group_1_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_1(), "rule__Factor__Group_1_1__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getMathExpAccess().getExpAssignment_2(), "rule__MathExp__ExpAssignment_2");
			builder.put(grammarAccess.getExpAccess().getLeftAssignment_0(), "rule__Exp__LeftAssignment_0");
			builder.put(grammarAccess.getExpAccess().getOperatorAssignment_1_0(), "rule__Exp__OperatorAssignment_1_0");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getExpOpAccess().getRightAssignment_1_0_2(), "rule__ExpOp__RightAssignment_1_0_2");
			builder.put(grammarAccess.getExpOpAccess().getRightAssignment_1_1_2(), "rule__ExpOp__RightAssignment_1_1_2");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_0_2(), "rule__Factor__RightAssignment_1_0_2");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1_2(), "rule__Factor__RightAssignment_1_1_2");
			builder.put(grammarAccess.getParenthesisAccess().getExpAssignment_1(), "rule__Parenthesis__ExpAssignment_1");
			builder.put(grammarAccess.getNumAccess().getValueAssignment(), "rule__Num__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Mdsdassignment2GrammarAccess grammarAccess;

	@Override
	protected InternalMdsdassignment2Parser createParser() {
		InternalMdsdassignment2Parser result = new InternalMdsdassignment2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Mdsdassignment2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Mdsdassignment2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
