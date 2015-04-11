/*
* generated by Xtext
*/
grammar InternalSmdpDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SmdpDslGrammarAccess;

}

@parser::members {

 	private SmdpDslGrammarAccess grammarAccess;
 	
    public InternalSmdpDslParser(TokenStream input, SmdpDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "myModel";	
   	}
   	
   	@Override
   	protected SmdpDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRulemyModel
entryRulemyModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyModelRule()); }
	 iv_rulemyModel=rulemyModel 
	 { $current=$iv_rulemyModel.current; } 
	 EOF 
;

// Rule myModel
rulemyModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getMyModelAccess().getMyModelAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMyModelAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyModelRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMyModelAccess().getLeftCurlyBracketKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_1_0()); 
	    }
		lv_myModelContains_3_0=rulemyObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyModelRule());
	        }
       		add(
       			$current, 
       			"myModelContains",
        		lv_myModelContains_3_0, 
        		"myObject");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMyModelAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyModelAccess().getMyModelContainsMyObjectParserRuleCall_2_2_1_0()); 
	    }
		lv_myModelContains_5_0=rulemyObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyModelRule());
	        }
       		add(
       			$current, 
       			"myModelContains",
        		lv_myModelContains_5_0, 
        		"myObject");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMyModelAccess().getRightCurlyBracketKeyword_2_3());
    }
)?)
;





// Entry rule entryRulemyValue
entryRulemyValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyValueRule()); }
	 iv_rulemyValue=rulemyValue 
	 { $current=$iv_rulemyValue.current; } 
	 EOF 
;

// Rule myValue
rulemyValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMyValueAccess().getMyBooleanParserRuleCall_0()); 
    }
    this_myBoolean_0=rulemyBoolean
    { 
        $current = $this_myBoolean_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyValueAccess().getMyRangeParserRuleCall_1()); 
    }
    this_myRange_1=rulemyRange
    { 
        $current = $this_myRange_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyValueAccess().getMyStringEnumParserRuleCall_2()); 
    }
    this_myStringEnum_2=rulemyStringEnum
    { 
        $current = $this_myStringEnum_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyValueAccess().getMyNumberEnumParserRuleCall_3()); 
    }
    this_myNumberEnum_3=rulemyNumberEnum
    { 
        $current = $this_myNumberEnum_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulemyExpression
entryRulemyExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyExpressionRule()); }
	 iv_rulemyExpression=rulemyExpression 
	 { $current=$iv_rulemyExpression.current; } 
	 EOF 
;

// Rule myExpression
rulemyExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMyExpressionAccess().getMyBinaryParserRuleCall_0()); 
    }
    this_myBinary_0=rulemyBinary
    { 
        $current = $this_myBinary_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyExpressionAccess().getMyUnaryParserRuleCall_1()); 
    }
    this_myUnary_1=rulemyUnary
    { 
        $current = $this_myUnary_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyExpressionAccess().getMyBooleanParserRuleCall_2()); 
    }
    this_myBoolean_2=rulemyBoolean
    { 
        $current = $this_myBoolean_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyExpressionAccess().getMyRangeParserRuleCall_3()); 
    }
    this_myRange_3=rulemyRange
    { 
        $current = $this_myRange_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyExpressionAccess().getMyStringEnumParserRuleCall_4()); 
    }
    this_myStringEnum_4=rulemyStringEnum
    { 
        $current = $this_myStringEnum_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyExpressionAccess().getMyNumberEnumParserRuleCall_5()); 
    }
    this_myNumberEnum_5=rulemyNumberEnum
    { 
        $current = $this_myNumberEnum_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getMyExpressionAccess().getMyIdentifierParserRuleCall_6()); 
    }
    this_myIdentifier_6=rulemyIdentifier
    { 
        $current = $this_myIdentifier_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRulemyObject
entryRulemyObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyObjectRule()); }
	 iv_rulemyObject=rulemyObject 
	 { $current=$iv_rulemyObject.current; } 
	 EOF 
;

// Rule myObject
rulemyObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getMyObjectAccess().getMyObjectAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMyObjectAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyObjectRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMyObjectAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='has' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMyObjectAccess().getHasKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_1_0()); 
	    }
		lv_myAttributeContains_4_0=rulemyAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyObjectRule());
	        }
       		add(
       			$current, 
       			"myAttributeContains",
        		lv_myAttributeContains_4_0, 
        		"myAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMyObjectAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyAttributeContainsMyAttributeParserRuleCall_3_2_1_0()); 
	    }
		lv_myAttributeContains_6_0=rulemyAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyObjectRule());
	        }
       		add(
       			$current, 
       			"myAttributeContains",
        		lv_myAttributeContains_6_0, 
        		"myAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?(	otherlv_7='Constrained by' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMyObjectAccess().getConstrainedByKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_1_0()); 
	    }
		lv_myObjectHas_8_0=rulemyConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyObjectRule());
	        }
       		add(
       			$current, 
       			"myObjectHas",
        		lv_myObjectHas_8_0, 
        		"myConstraint");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMyObjectAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyObjectAccess().getMyObjectHasMyConstraintParserRuleCall_4_2_1_0()); 
	    }
		lv_myObjectHas_10_0=rulemyConstraint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyObjectRule());
	        }
       		add(
       			$current, 
       			"myObjectHas",
        		lv_myObjectHas_10_0, 
        		"myConstraint");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMyObjectAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRulemyConstraint
entryRulemyConstraint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyConstraintRule()); }
	 iv_rulemyConstraint=rulemyConstraint 
	 { $current=$iv_rulemyConstraint.current; } 
	 EOF 
;

// Rule myConstraint
rulemyConstraint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMyConstraintAccess().getIfKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyConstraintAccess().getMyIfConstraintMyConcreteExpressionParserRuleCall_1_0()); 
	    }
		lv_myIfConstraint_1_0=rulemyConcreteExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyConstraintRule());
	        }
       		set(
       			$current, 
       			"myIfConstraint",
        		lv_myIfConstraint_1_0, 
        		"myConcreteExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='then' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMyConstraintAccess().getThenKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyConstraintAccess().getMyThenConstraintMyConcreteExpressionParserRuleCall_3_0()); 
	    }
		lv_myThenConstraint_3_0=rulemyConcreteExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyConstraintRule());
	        }
       		set(
       			$current, 
       			"myThenConstraint",
        		lv_myThenConstraint_3_0, 
        		"myConcreteExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulemyAttribute
entryRulemyAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyAttributeRule()); }
	 iv_rulemyAttribute=rulemyAttribute 
	 { $current=$iv_rulemyAttribute.current; } 
	 EOF 
;

// Rule myAttribute
rulemyAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyAttributeRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMyAttributeAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0()); 
	    }
		lv_myAttributeContains_2_0=rulemyValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyAttributeRule());
	        }
       		set(
       			$current, 
       			"myAttributeContains",
        		lv_myAttributeContains_2_0, 
        		"myValue");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=']' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMyAttributeAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRulemyConcreteExpression
entryRulemyConcreteExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyConcreteExpressionRule()); }
	 iv_rulemyConcreteExpression=rulemyConcreteExpression 
	 { $current=$iv_rulemyConcreteExpression.current; } 
	 EOF 
;

// Rule myConcreteExpression
rulemyConcreteExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyConcreteExpressionAccess().getMyConcreteExMyExpressionParserRuleCall_0()); 
	    }
		lv_myConcreteEx_0_0=rulemyExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyConcreteExpressionRule());
	        }
       		set(
       			$current, 
       			"myConcreteEx",
        		lv_myConcreteEx_0_0, 
        		"myExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRulemyBinary
entryRulemyBinary returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyBinaryRule()); }
	 iv_rulemyBinary=rulemyBinary 
	 { $current=$iv_rulemyBinary.current; } 
	 EOF 
;

// Rule myBinary
rulemyBinary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMyBinaryAccess().getLeftParenthesisKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyConcreteExpressionParserRuleCall_1_0()); 
	    }
		lv_myBinaryLeft_1_0=rulemyConcreteExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyBinaryRule());
	        }
       		set(
       			$current, 
       			"myBinaryLeft",
        		lv_myBinaryLeft_1_0, 
        		"myConcreteExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_0()); 
	    }
		lv_Oparand_2_0=rulemyBinaryOparators		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyBinaryRule());
	        }
       		set(
       			$current, 
       			"Oparand",
        		lv_Oparand_2_0, 
        		"myBinaryOparators");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyConcreteExpressionParserRuleCall_3_0()); 
	    }
		lv_myBinaryRight_3_0=rulemyConcreteExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyBinaryRule());
	        }
       		set(
       			$current, 
       			"myBinaryRight",
        		lv_myBinaryRight_3_0, 
        		"myConcreteExpression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=')' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMyBinaryAccess().getRightParenthesisKeyword_4());
    }
)
;





// Entry rule entryRulemyUnary
entryRulemyUnary returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyUnaryRule()); }
	 iv_rulemyUnary=rulemyUnary 
	 { $current=$iv_rulemyUnary.current; } 
	 EOF 
;

// Rule myUnary
rulemyUnary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_0_0()); 
	    }
		lv_Oparand_0_0=rulemyUnaryOparators		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyUnaryRule());
	        }
       		set(
       			$current, 
       			"Oparand",
        		lv_Oparand_0_0, 
        		"myUnaryOparators");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyConcreteExpressionParserRuleCall_1_0()); 
	    }
		lv_myUnaryExpression_1_0=rulemyConcreteExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyUnaryRule());
	        }
       		set(
       			$current, 
       			"myUnaryExpression",
        		lv_myUnaryExpression_1_0, 
        		"myConcreteExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulemyBoolean
entryRulemyBoolean returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyBooleanRule()); }
	 iv_rulemyBoolean=rulemyBoolean 
	 { $current=$iv_rulemyBoolean.current; } 
	 EOF 
;

// Rule myBoolean
rulemyBoolean returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMyBooleanAccess().getTrueValueEStringParserRuleCall_0_0()); 
	    }
		lv_trueValue_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyBooleanRule());
	        }
       		set(
       			$current, 
       			"trueValue",
        		lv_trueValue_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMyBooleanAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyBooleanAccess().getFalseValueEStringParserRuleCall_2_0()); 
	    }
		lv_falseValue_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyBooleanRule());
	        }
       		set(
       			$current, 
       			"falseValue",
        		lv_falseValue_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulemyIdentifier
entryRulemyIdentifier returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyIdentifierRule()); }
	 iv_rulemyIdentifier=rulemyIdentifier 
	 { $current=$iv_rulemyIdentifier.current; } 
	 EOF 
;

// Rule myIdentifier
rulemyIdentifier returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='*' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMyIdentifierAccess().getAsteriskKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getMyIdentifierRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeCrossReference_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulemyRange
entryRulemyRange returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyRangeRule()); }
	 iv_rulemyRange=rulemyRange 
	 { $current=$iv_rulemyRange.current; } 
	 EOF 
;

// Rule myRange
rulemyRange returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_from_0_0=RULE_INT
		{
			newLeafNode(lv_from_0_0, grammarAccess.getMyRangeAccess().getFromINTTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMyRangeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"from",
        		lv_from_0_0, 
        		"INT");
	    }

)
)	otherlv_1='-' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMyRangeAccess().getHyphenMinusKeyword_1());
    }
(
(
		lv_to_2_0=RULE_INT
		{
			newLeafNode(lv_to_2_0, grammarAccess.getMyRangeAccess().getToINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMyRangeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"to",
        		lv_to_2_0, 
        		"INT");
	    }

)
))
;





// Entry rule entryRulemyStringEnum
entryRulemyStringEnum returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyStringEnumRule()); }
	 iv_rulemyStringEnum=rulemyStringEnum 
	 { $current=$iv_rulemyStringEnum.current; } 
	 EOF 
;

// Rule myStringEnum
rulemyStringEnum returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMyStringEnumAccess().getValuesEStringParserRuleCall_0_0()); 
	    }
		lv_values_0_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyStringEnumRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_0_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMyStringEnumAccess().getCommaKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyStringEnumAccess().getValuesEStringParserRuleCall_1_1_0()); 
	    }
		lv_values_2_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyStringEnumRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_2_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulemyNumberEnum
entryRulemyNumberEnum returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyNumberEnumRule()); }
	 iv_rulemyNumberEnum=rulemyNumberEnum 
	 { $current=$iv_rulemyNumberEnum.current; } 
	 EOF 
;

// Rule myNumberEnum
rulemyNumberEnum returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_0_0()); 
	    }
		lv_values_0_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyNumberEnumRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_0_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMyNumberEnumAccess().getCommaKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyNumberEnumAccess().getValuesEDoubleParserRuleCall_1_1_0()); 
	    }
		lv_values_2_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyNumberEnumRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_2_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;







// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); } 
	 iv_ruleEDouble=ruleEDouble 
	 { $current=$iv_ruleEDouble.current.getText(); }  
	 EOF 
;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_0()); 
    }
)?(    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_1()); 
    }
)?
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_0_2()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_3()); 
    }
((
	kw='E' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_0()); 
    }

    |
	kw='e' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_0_4_0_1()); 
    }
)(
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0_4_1()); 
    }
)?    this_INT_7=RULE_INT    {
		$current.merge(this_INT_7);
    }

    { 
    newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0_4_2()); 
    }
)?)
    |
    { 
        newCompositeNode(grammarAccess.getEDoubleAccess().getEIntParserRuleCall_1()); 
    }
    this_EInt_8=ruleEInt    {
		$current.merge(this_EInt_8);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Rule myBinaryOparators
rulemyBinaryOparators returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='&&' 
	{
        $current = grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMyBinaryOparatorsAccess().getAndEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='|' 
	{
        $current = grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getMyBinaryOparatorsAccess().getOrEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='<' 
	{
        $current = grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getMyBinaryOparatorsAccess().getGtEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='>' 
	{
        $current = grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getMyBinaryOparatorsAccess().getLtEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='=' 
	{
        $current = grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getMyBinaryOparatorsAccess().getEqEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='can' 
	{
        $current = grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getMyBinaryOparatorsAccess().getIsEnumLiteralDeclaration_5()); 
    }
)
    |(	enumLiteral_6='if' 
	{
        $current = grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_6, grammarAccess.getMyBinaryOparatorsAccess().getIfEnumLiteralDeclaration_6()); 
    }
)
    |(	enumLiteral_7='then' 
	{
        $current = grammarAccess.getMyBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_7, grammarAccess.getMyBinaryOparatorsAccess().getThenEnumLiteralDeclaration_7()); 
    }
));



// Rule myUnaryOparators
rulemyUnaryOparators returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
(	enumLiteral_0='not' 
	{
        $current = grammarAccess.getMyUnaryOparatorsAccess().getNotEnumLiteralDeclaration().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getMyUnaryOparatorsAccess().getNotEnumLiteralDeclaration()); 
    }
);



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


