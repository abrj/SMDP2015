package configuratorProject.cpdsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import configuratorProject.Attribute;
import configuratorProject.Binary;
import configuratorProject.BoolLiteral;
import configuratorProject.BooleanValue;
import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.Constraint;
import configuratorProject.Identifier;
import configuratorProject.Int;
import configuratorProject.Model;
import configuratorProject.Range;
import configuratorProject.Unary;
import configuratorProject.cpdsl.services.CpdslGrammarAccess;
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

@SuppressWarnings("all")
public abstract class AbstractCpdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CpdslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConfiguratorProjectPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfiguratorProjectPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.BINARY:
				if(context == grammarAccess.getBinaryRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_Binary(context, (Binary) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.BOOL_LITERAL:
				if(context == grammarAccess.getBoolLiteralRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_BoolLiteral(context, (BoolLiteral) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.ENUM:
				if(context == grammarAccess.getEnumRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Enum(context, (configuratorProject.Enum) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.IDENTIFIER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIdentifierRule()) {
					sequence_Identifier(context, (Identifier) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.INT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getInt0Rule()) {
					sequence_Int0(context, (Int) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.OBJECT:
				if(context == grammarAccess.getObjectRule()) {
					sequence_Object(context, (configuratorProject.Object) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.RANGE:
				if(context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Range(context, (Range) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.STRING:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getString0Rule()) {
					sequence_String0(context, (configuratorProject.String) semanticObject); 
					return; 
				}
				else break;
			case ConfiguratorProjectPackage.UNARY:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getUnaryRule()) {
					sequence_Unary(context, (Unary) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString Contains=Value)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.ATTRIBUTE__CONTAINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.ATTRIBUTE__CONTAINS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getContainsValueParserRuleCall_4_0(), semanticObject.getContains());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (Oparand=BinaryOparators? Left=Expression Right=Expression)
	 */
	protected void sequence_Binary(EObject context, Binary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
		feeder.accept(grammarAccess.getBoolLiteralAccess().getValueBooleanParserRuleCall_3_0(), semanticObject.isValue());
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
		feeder.accept(grammarAccess.getBooleanValueAccess().getTrueValueAnyURIParserRuleCall_3_0(), semanticObject.getTrueValue());
		feeder.accept(grammarAccess.getBooleanValueAccess().getFalseValueAnyURIParserRuleCall_5_0(), semanticObject.getFalseValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     Contains=Expression
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.CONSTRAINT__CONTAINS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.CONSTRAINT__CONTAINS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintAccess().getContainsExpressionParserRuleCall_3_0(), semanticObject.getContains());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=AnySimpleType values+=AnySimpleType*)
	 */
	protected void sequence_Enum(EObject context, configuratorProject.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     Is=[Attribute|EString]
	 */
	protected void sequence_Identifier(EObject context, Identifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.IDENTIFIER__IS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.IDENTIFIER__IS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIdentifierAccess().getIsAttributeEStringParserRuleCall_3_0_1(), semanticObject.getIs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Int1
	 */
	protected void sequence_Int0(EObject context, Int semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.INT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.INT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInt0Access().getValueInt1ParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((Contains+=Object Contains+=Object*)?)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (Has+=Constraint Has+=Constraint*)? (Contains+=Attribute Contains+=Attribute*)?)
	 */
	protected void sequence_Object(EObject context, configuratorProject.Object semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     range=AnySimpleType
	 */
	protected void sequence_Range(EObject context, Range semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.RANGE__RANGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.RANGE__RANGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRangeAccess().getRangeAnySimpleTypeParserRuleCall_3_0(), semanticObject.getRange());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=AnyURI
	 */
	protected void sequence_String0(EObject context, configuratorProject.String semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ConfiguratorProjectPackage.Literals.STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConfiguratorProjectPackage.Literals.STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getString0Access().getValueAnyURIParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (Oparand=UnaryOparators? Expression=Expression)
	 */
	protected void sequence_Unary(EObject context, Unary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
