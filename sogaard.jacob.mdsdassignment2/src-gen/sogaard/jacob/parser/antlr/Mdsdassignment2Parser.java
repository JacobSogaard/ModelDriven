/*
 * generated by Xtext 2.20.0
 */
package sogaard.jacob.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import sogaard.jacob.parser.antlr.internal.InternalMdsdassignment2Parser;
import sogaard.jacob.services.Mdsdassignment2GrammarAccess;

public class Mdsdassignment2Parser extends AbstractAntlrParser {

	@Inject
	private Mdsdassignment2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMdsdassignment2Parser createParser(XtextTokenStream stream) {
		return new InternalMdsdassignment2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MathExp";
	}

	public Mdsdassignment2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Mdsdassignment2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
