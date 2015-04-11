/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.SmdpDslGrammarAccess;

public class SmdpDslParser extends AbstractContentAssistParser {
	
	@Inject
	private SmdpDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalSmdpDslParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalSmdpDslParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalSmdpDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMyExpressionAccess().getAlternatives(), "rule__MyExpression__Alternatives");
					put(grammarAccess.getMyValueAccess().getAlternatives(), "rule__MyValue__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getMyEnumAccess().getAlternatives(), "rule__MyEnum__Alternatives");
					put(grammarAccess.getMyBinaryOparatorsAccess().getAlternatives(), "rule__MyBinaryOparators__Alternatives");
					put(grammarAccess.getMyModelAccess().getGroup(), "rule__MyModel__Group__0");
					put(grammarAccess.getMyModelAccess().getGroup_2(), "rule__MyModel__Group_2__0");
					put(grammarAccess.getMyModelAccess().getGroup_2_2(), "rule__MyModel__Group_2_2__0");
					put(grammarAccess.getMyObjectAccess().getGroup(), "rule__MyObject__Group__0");
					put(grammarAccess.getMyObjectAccess().getGroup_3(), "rule__MyObject__Group_3__0");
					put(grammarAccess.getMyObjectAccess().getGroup_3_2(), "rule__MyObject__Group_3_2__0");
					put(grammarAccess.getMyObjectAccess().getGroup_4(), "rule__MyObject__Group_4__0");
					put(grammarAccess.getMyObjectAccess().getGroup_4_2(), "rule__MyObject__Group_4_2__0");
					put(grammarAccess.getMyConstraintAccess().getGroup(), "rule__MyConstraint__Group__0");
					put(grammarAccess.getMyAttributeAccess().getGroup(), "rule__MyAttribute__Group__0");
					put(grammarAccess.getMyBinaryAccess().getGroup(), "rule__MyBinary__Group__0");
					put(grammarAccess.getMyUnaryAccess().getGroup(), "rule__MyUnary__Group__0");
					put(grammarAccess.getMyEnumAccess().getGroup_0(), "rule__MyEnum__Group_0__0");
					put(grammarAccess.getMyEnumAccess().getGroup_0_1(), "rule__MyEnum__Group_0_1__0");
					put(grammarAccess.getMyEnumAccess().getGroup_1(), "rule__MyEnum__Group_1__0");
					put(grammarAccess.getMyEnumAccess().getGroup_1_1(), "rule__MyEnum__Group_1_1__0");
					put(grammarAccess.getBooleanValueAccess().getGroup(), "rule__BooleanValue__Group__0");
					put(grammarAccess.getMyRangeAccess().getGroup(), "rule__MyRange__Group__0");
					put(grammarAccess.getMyModelAccess().getNameAssignment_1(), "rule__MyModel__NameAssignment_1");
					put(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_1(), "rule__MyModel__MyModelContainsAssignment_2_1");
					put(grammarAccess.getMyModelAccess().getMyModelContainsAssignment_2_2_1(), "rule__MyModel__MyModelContainsAssignment_2_2_1");
					put(grammarAccess.getMyObjectAccess().getNameAssignment_1(), "rule__MyObject__NameAssignment_1");
					put(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_1(), "rule__MyObject__MyAttributeContainsAssignment_3_1");
					put(grammarAccess.getMyObjectAccess().getMyAttributeContainsAssignment_3_2_1(), "rule__MyObject__MyAttributeContainsAssignment_3_2_1");
					put(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_1(), "rule__MyObject__MyObjectHasAssignment_4_1");
					put(grammarAccess.getMyObjectAccess().getMyObjectHasAssignment_4_2_1(), "rule__MyObject__MyObjectHasAssignment_4_2_1");
					put(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment_1(), "rule__MyConstraint__MyConstraintContainsAssignment_1");
					put(grammarAccess.getMyConstraintAccess().getMyConstraintContainsAssignment_3(), "rule__MyConstraint__MyConstraintContainsAssignment_3");
					put(grammarAccess.getMyAttributeAccess().getNameAssignment_0(), "rule__MyAttribute__NameAssignment_0");
					put(grammarAccess.getMyAttributeAccess().getMyAttributeContainsAssignment_2(), "rule__MyAttribute__MyAttributeContainsAssignment_2");
					put(grammarAccess.getMyBinaryAccess().getMyBinaryLeftAssignment_1(), "rule__MyBinary__MyBinaryLeftAssignment_1");
					put(grammarAccess.getMyBinaryAccess().getOparandAssignment_2(), "rule__MyBinary__OparandAssignment_2");
					put(grammarAccess.getMyBinaryAccess().getMyBinaryRightAssignment_4(), "rule__MyBinary__MyBinaryRightAssignment_4");
					put(grammarAccess.getMyUnaryAccess().getOparandAssignment_0(), "rule__MyUnary__OparandAssignment_0");
					put(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionAssignment_2(), "rule__MyUnary__MyUnaryExpressionAssignment_2");
					put(grammarAccess.getMyStringAccess().getValueAssignment(), "rule__MyString__ValueAssignment");
					put(grammarAccess.getMyIntAccess().getValueAssignment(), "rule__MyInt__ValueAssignment");
					put(grammarAccess.getBoolLiteralAccess().getValueAssignment(), "rule__BoolLiteral__ValueAssignment");
					put(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsAssignment(), "rule__MyIdentifier__MyIntentifierIsAssignment");
					put(grammarAccess.getMyEnumAccess().getValuesAssignment_0_0(), "rule__MyEnum__ValuesAssignment_0_0");
					put(grammarAccess.getMyEnumAccess().getValuesAssignment_0_1_1(), "rule__MyEnum__ValuesAssignment_0_1_1");
					put(grammarAccess.getMyEnumAccess().getValuesAssignment_1_0(), "rule__MyEnum__ValuesAssignment_1_0");
					put(grammarAccess.getMyEnumAccess().getValuesAssignment_1_1_1(), "rule__MyEnum__ValuesAssignment_1_1_1");
					put(grammarAccess.getBooleanValueAccess().getTrueValueAssignment_0(), "rule__BooleanValue__TrueValueAssignment_0");
					put(grammarAccess.getBooleanValueAccess().getFalseValueAssignment_2(), "rule__BooleanValue__FalseValueAssignment_2");
					put(grammarAccess.getMyRangeAccess().getFromAssignment_0(), "rule__MyRange__FromAssignment_0");
					put(grammarAccess.getMyRangeAccess().getToAssignment_2(), "rule__MyRange__ToAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalSmdpDslParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalSmdpDslParser) parser;
			typedParser.entryRulemyModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SmdpDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SmdpDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
