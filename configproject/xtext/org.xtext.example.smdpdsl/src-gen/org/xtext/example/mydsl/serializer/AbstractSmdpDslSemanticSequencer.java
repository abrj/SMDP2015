package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myAttribute;
import configuratorProject.myBinary;
import configuratorProject.myBoolean;
import configuratorProject.myConcreteExpression;
import configuratorProject.myConstraint;
import configuratorProject.myIdentifier;
import configuratorProject.myModel;
import configuratorProject.myNumberEnum;
import configuratorProject.myObject;
import configuratorProject.myRange;
import configuratorProject.myStringEnum;
import configuratorProject.myUnary;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.SmdpDslGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractSmdpDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmdpDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConfiguratorProjectPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfiguratorProjectPackage.MY_ATTRIBUTE:
				if(context == grammarAccess.getMyAttributeRule()) {
					sequence_myAttribute(context, (myAttribute) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_BINARY:
				if(context == grammarAccess.getMyBinaryRule() ||
				   context == grammarAccess.getMyExpressionRule()) {
					sequence_myBinary(context, (myBinary) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_BOOLEAN:
				if(context == grammarAccess.getMyBooleanRule() ||
				   context == grammarAccess.getMyExpressionRule() ||
				   context == grammarAccess.getMyValueRule()) {
					sequence_myBoolean(context, (myBoolean) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION:
				if(context == grammarAccess.getMyConcreteExpressionRule()) {
					sequence_myConcreteExpression(context, (myConcreteExpression) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_CONSTRAINT:
				if(context == grammarAccess.getMyConstraintRule()) {
					sequence_myConstraint(context, (myConstraint) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_IDENTIFIER:
				if(context == grammarAccess.getMyExpressionRule() ||
				   context == grammarAccess.getMyIdentifierRule()) {
					sequence_myIdentifier(context, (myIdentifier) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_MODEL:
				if(context == grammarAccess.getMyModelRule()) {
					sequence_myModel(context, (myModel) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_NUMBER_ENUM:
				if(context == grammarAccess.getMyExpressionRule() ||
				   context == grammarAccess.getMyNumberEnumRule() ||
				   context == grammarAccess.getMyValueRule()) {
					sequence_myNumberEnum(context, (myNumberEnum) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_OBJECT:
				if(context == grammarAccess.getMyObjectRule()) {
					sequence_myObject(context, (myObject) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_RANGE:
				if(context == grammarAccess.getMyExpressionRule() ||
				   context == grammarAccess.getMyRangeRule() ||
				   context == grammarAccess.getMyValueRule()) {
					sequence_myRange(context, (myRange) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_STRING_ENUM:
				if(context == grammarAccess.getMyExpressionRule() ||
				   context == grammarAccess.getMyStringEnumRule() ||
				   context == grammarAccess.getMyValueRule()) {
					sequence_myStringEnum(context, (myStringEnum) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_UNARY:
				if(context == grammarAccess.getMyExpressionRule() ||
				   context == grammarAccess.getMyUnaryRule()) {
					sequence_myUnary(context, (myUnary) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString myAttributeContains=myValue)
	 */
	protected void sequence_myAttribute(EObject context, myAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyAttributeAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMyAttributeAccess().getMyAttributeContainsMyValueParserRuleCall_2_0(), semanticObject.getMyAttributeContains());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (myBinaryLeft=myConcreteExpression Oparand=myBinaryOparators myBinaryRight=myConcreteExpression)
	 */
	protected void sequence_myBinary(EObject context, myBinary semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_BINARY__OPARAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_BINARY__OPARAND));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_BINARY__MY_BINARY_LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_BINARY__MY_BINARY_LEFT));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_BINARY__MY_BINARY_RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_BINARY__MY_BINARY_RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyBinaryAccess().getMyBinaryLeftMyConcreteExpressionParserRuleCall_1_0(), semanticObject.getMyBinaryLeft());
		feeder.accept(grammarAccess.getMyBinaryAccess().getOparandMyBinaryOparatorsEnumRuleCall_2_0(), semanticObject.getOparand());
		feeder.accept(grammarAccess.getMyBinaryAccess().getMyBinaryRightMyConcreteExpressionParserRuleCall_3_0(), semanticObject.getMyBinaryRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (trueValue=EString falseValue=EString)
	 */
	protected void sequence_myBoolean(EObject context, myBoolean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_BOOLEAN__TRUE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_BOOLEAN__TRUE_VALUE));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_BOOLEAN__FALSE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_BOOLEAN__FALSE_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyBooleanAccess().getTrueValueEStringParserRuleCall_0_0(), semanticObject.getTrueValue());
		feeder.accept(grammarAccess.getMyBooleanAccess().getFalseValueEStringParserRuleCall_2_0(), semanticObject.getFalseValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     myConcreteEx=myExpression
	 */
	protected void sequence_myConcreteExpression(EObject context, myConcreteExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyConcreteExpressionAccess().getMyConcreteExMyExpressionParserRuleCall_0(), semanticObject.getMyConcreteEx());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (myIfConstraint=myConcreteExpression myThenConstraint=myConcreteExpression)
	 */
	protected void sequence_myConstraint(EObject context, myConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_CONSTRAINT__MY_IF_CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_CONSTRAINT__MY_IF_CONSTRAINT));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_CONSTRAINT__MY_THEN_CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_CONSTRAINT__MY_THEN_CONSTRAINT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyConstraintAccess().getMyIfConstraintMyConcreteExpressionParserRuleCall_1_0(), semanticObject.getMyIfConstraint());
		feeder.accept(grammarAccess.getMyConstraintAccess().getMyThenConstraintMyConcreteExpressionParserRuleCall_3_0(), semanticObject.getMyThenConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     myIntentifierIs=[myAttribute|EString]
	 */
	protected void sequence_myIdentifier(EObject context, myIdentifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_IDENTIFIER__MY_INTENTIFIER_IS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_IDENTIFIER__MY_INTENTIFIER_IS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_1_0_1(), semanticObject.getMyIntentifierIs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (myModelContains+=myObject myModelContains+=myObject*)?)
	 */
	protected void sequence_myModel(EObject context, myModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=EDouble values+=EDouble*)
	 */
	protected void sequence_myNumberEnum(EObject context, myNumberEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (myAttributeContains+=myAttribute myAttributeContains+=myAttribute*)? (myObjectHas+=myConstraint myObjectHas+=myConstraint*)?)
	 */
	protected void sequence_myObject(EObject context, myObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=INT to=INT)
	 */
	protected void sequence_myRange(EObject context, myRange semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_RANGE__FROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_RANGE__FROM));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_RANGE__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_RANGE__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyRangeAccess().getFromINTTerminalRuleCall_0_0(), semanticObject.getFrom());
		feeder.accept(grammarAccess.getMyRangeAccess().getToINTTerminalRuleCall_2_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=EString values+=EString*)
	 */
	protected void sequence_myStringEnum(EObject context, myStringEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Oparand=myUnaryOparators myUnaryExpression=myConcreteExpression)
	 */
	protected void sequence_myUnary(EObject context, myUnary semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_UNARY__OPARAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_UNARY__OPARAND));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_UNARY__MY_UNARY_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_UNARY__MY_UNARY_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyUnaryAccess().getOparandMyUnaryOparatorsEnumRuleCall_0_0(), semanticObject.getOparand());
		feeder.accept(grammarAccess.getMyUnaryAccess().getMyUnaryExpressionMyConcreteExpressionParserRuleCall_1_0(), semanticObject.getMyUnaryExpression());
		feeder.finish();
	}
}
