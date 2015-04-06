package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import configuratorProject.BoolLiteral;
import configuratorProject.BooleanValue;
import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myAttribute;
import configuratorProject.myBinary;
import configuratorProject.myConstraint;
import configuratorProject.myEnum;
import configuratorProject.myIdentifier;
import configuratorProject.myInt;
import configuratorProject.myModel;
import configuratorProject.myObject;
import configuratorProject.myRange;
import configuratorProject.myString;
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
			case ConfiguratorProjectPackage.BOOL_LITERAL:
				if(context == grammarAccess.getBoolLiteralRule() ||
				   context == grammarAccess.getMyExpressionRule()) {
					sequence_BoolLiteral(context, (BoolLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getMyValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT:
				if(context == grammarAccess.getMyConstraintRule()) {
					sequence_myConstraint(context, (myConstraint) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_ENUM:
				if(context == grammarAccess.getMyEnumRule() ||
				   context == grammarAccess.getMyValueRule()) {
					sequence_myEnum(context, (myEnum) semanticObject); 
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
			case ConfiguratorProjectPackage.MY_INT:
				if(context == grammarAccess.getMyExpressionRule() ||
				   context == grammarAccess.getMyIntRule()) {
					sequence_myInt(context, (myInt) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_MODEL:
				if(context == grammarAccess.getMyModelRule()) {
					sequence_myModel(context, (myModel) semanticObject); 
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
				if(context == grammarAccess.getMyRangeRule() ||
				   context == grammarAccess.getMyValueRule()) {
					sequence_myRange(context, (myRange) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MY_STRING:
				if(context == grammarAccess.getMyExpressionRule() ||
				   context == grammarAccess.getMyStringRule()) {
					sequence_myString(context, (myString) semanticObject); 
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
	 *     value=Boolean
	 */
	protected void sequence_BoolLiteral(EObject context, BoolLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.BOOL_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.BOOL_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (trueValue=AnyURI falseValue=AnyURI)
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.BOOLEAN_VALUE__TRUE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.BOOLEAN_VALUE__TRUE_VALUE));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.BOOLEAN_VALUE__FALSE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.BOOLEAN_VALUE__FALSE_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_0_0(), semanticObject.getTrueValue());
		feeder.accept(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_2_0(), semanticObject.getFalseValue());
		feeder.finish();
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
	 *     (myBinaryLeft=myExpression Oparand=myBinaryOparators? myBinaryRight=myExpression)
	 */
	protected void sequence_myBinary(EObject context, myBinary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     myConstraintContains=myExpression
	 */
	protected void sequence_myConstraint(EObject context, myConstraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyConstraintAccess().getMyConstraintContainsMyExpressionParserRuleCall_0(), semanticObject.getMyConstraintContains());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=AnySimpleType values+=AnySimpleType*)
	 */
	protected void sequence_myEnum(EObject context, myEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
		feeder.accept(grammarAccess.getMyIdentifierAccess().getMyIntentifierIsMyAttributeEStringParserRuleCall_0_1(), semanticObject.getMyIntentifierIs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Int0
	 */
	protected void sequence_myInt(EObject context, myInt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_INT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_INT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyIntAccess().getValueInt0ParserRuleCall_0(), semanticObject.getValue());
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
	 *     (name=EString (myAttributeContains+=myAttribute myAttributeContains+=myAttribute*)? (myObjectHas+=myConstraint myObjectHas+=myConstraint*)?)
	 */
	protected void sequence_myObject(EObject context, myObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (range=AnySimpleType range=AnySimpleType)
	 */
	protected void sequence_myRange(EObject context, myRange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=AnyURI
	 */
	protected void sequence_myString(EObject context, myString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.MY_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.MY_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMyStringAccess().getValueAnyURIParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (Oparand=myUnaryOparators? myUnaryExpression=myExpression)
	 */
	protected void sequence_myUnary(EObject context, myUnary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
