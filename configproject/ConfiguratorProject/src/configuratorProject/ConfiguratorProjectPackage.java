/**
 */
package configuratorProject;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see configuratorProject.ConfiguratorProjectFactory
 * @model kind="package"
 * @generated
 */
public interface ConfiguratorProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuratorProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/configuratorProject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuratorProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfiguratorProjectPackage eINSTANCE = configuratorProject.impl.ConfiguratorProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link configuratorProject.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.ModelImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.NamedElementImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONTAINS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.ObjectImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__HAS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CONTAINS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.ConstraintImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTAINS = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.AttributeImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTAINS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.ExpressionImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.BinaryImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 5;

	/**
	 * The feature id for the '<em><b>Oparand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__OPARAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.UnaryImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 6;

	/**
	 * The feature id for the '<em><b>Oparand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__OPARAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.LiteralImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 7;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.StringImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getString()
	 * @generated
	 */
	int STRING = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.IntImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getInt()
	 * @generated
	 */
	int INT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.BoolLiteralImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getBoolLiteral()
	 * @generated
	 */
	int BOOL_LITERAL = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.ValueImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 11;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.EnumImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 12;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALUES = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.BooleanValueImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 13;

	/**
	 * The feature id for the '<em><b>True Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__TRUE_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__FALSE_VALUE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.IdentifierImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 15;

	/**
	 * The feature id for the '<em><b>Is</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__IS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.RangeImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 16;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__RANGE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.BinaryOparators <em>Binary Oparators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.BinaryOparators
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getBinaryOparators()
	 * @generated
	 */
	int BINARY_OPARATORS = 17;

	/**
	 * The meta object id for the '{@link configuratorProject.UnaryOparators <em>Unary Oparators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.UnaryOparators
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getUnaryOparators()
	 * @generated
	 */
	int UNARY_OPARATORS = 18;


	/**
	 * Returns the meta object for class '{@link configuratorProject.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see configuratorProject.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link configuratorProject.Model#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see configuratorProject.Model#getContains()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Contains();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see configuratorProject.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the containment reference list '{@link configuratorProject.Object#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see configuratorProject.Object#getHas()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link configuratorProject.Object#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see configuratorProject.Object#getContains()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Contains();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see configuratorProject.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.Constraint#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see configuratorProject.Constraint#getContains()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Contains();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see configuratorProject.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.Attribute#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see configuratorProject.Attribute#getContains()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Contains();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see configuratorProject.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see configuratorProject.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.Binary#getOparand <em>Oparand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oparand</em>'.
	 * @see configuratorProject.Binary#getOparand()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Oparand();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.Binary#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see configuratorProject.Binary#getLeft()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Left();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.Binary#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see configuratorProject.Binary#getRight()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Right();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see configuratorProject.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.Unary#getOparand <em>Oparand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oparand</em>'.
	 * @see configuratorProject.Unary#getOparand()
	 * @see #getUnary()
	 * @generated
	 */
	EAttribute getUnary_Oparand();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.Unary#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see configuratorProject.Unary#getExpression()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Expression();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see configuratorProject.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link configuratorProject.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see configuratorProject.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.String#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see configuratorProject.String#getValue()
	 * @see #getString()
	 * @generated
	 */
	EAttribute getString_Value();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see configuratorProject.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.Int#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see configuratorProject.Int#getValue()
	 * @see #getInt()
	 * @generated
	 */
	EAttribute getInt_Value();

	/**
	 * Returns the meta object for class '{@link configuratorProject.BoolLiteral <em>Bool Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Literal</em>'.
	 * @see configuratorProject.BoolLiteral
	 * @generated
	 */
	EClass getBoolLiteral();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.BoolLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see configuratorProject.BoolLiteral#isValue()
	 * @see #getBoolLiteral()
	 * @generated
	 */
	EAttribute getBoolLiteral_Value();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see configuratorProject.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see configuratorProject.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute list '{@link configuratorProject.Enum#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see configuratorProject.Enum#getValues()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Values();

	/**
	 * Returns the meta object for class '{@link configuratorProject.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see configuratorProject.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.BooleanValue#getTrueValue <em>True Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True Value</em>'.
	 * @see configuratorProject.BooleanValue#getTrueValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_TrueValue();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.BooleanValue#getFalseValue <em>False Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>False Value</em>'.
	 * @see configuratorProject.BooleanValue#getFalseValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_FalseValue();

	/**
	 * Returns the meta object for class '{@link configuratorProject.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see configuratorProject.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see configuratorProject.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see configuratorProject.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the reference '{@link configuratorProject.Identifier#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is</em>'.
	 * @see configuratorProject.Identifier#getIs()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Is();

	/**
	 * Returns the meta object for class '{@link configuratorProject.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see configuratorProject.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.Range#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see configuratorProject.Range#getRange()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Range();

	/**
	 * Returns the meta object for enum '{@link configuratorProject.BinaryOparators <em>Binary Oparators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Oparators</em>'.
	 * @see configuratorProject.BinaryOparators
	 * @generated
	 */
	EEnum getBinaryOparators();

	/**
	 * Returns the meta object for enum '{@link configuratorProject.UnaryOparators <em>Unary Oparators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Oparators</em>'.
	 * @see configuratorProject.UnaryOparators
	 * @generated
	 */
	EEnum getUnaryOparators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfiguratorProjectFactory getConfiguratorProjectFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link configuratorProject.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.ModelImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONTAINS = eINSTANCE.getModel_Contains();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.ObjectImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__HAS = eINSTANCE.getObject_Has();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__CONTAINS = eINSTANCE.getObject_Contains();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.ConstraintImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__CONTAINS = eINSTANCE.getConstraint_Contains();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.AttributeImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONTAINS = eINSTANCE.getAttribute_Contains();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.ExpressionImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.BinaryImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Oparand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__OPARAND = eINSTANCE.getBinary_Oparand();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__LEFT = eINSTANCE.getBinary_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__RIGHT = eINSTANCE.getBinary_Right();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.UnaryImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Oparand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY__OPARAND = eINSTANCE.getUnary_Oparand();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__EXPRESSION = eINSTANCE.getUnary_Expression();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.LiteralImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.StringImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING__VALUE = eINSTANCE.getString_Value();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.IntImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT__VALUE = eINSTANCE.getInt_Value();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.BoolLiteralImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getBoolLiteral()
		 * @generated
		 */
		EClass BOOL_LITERAL = eINSTANCE.getBoolLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_LITERAL__VALUE = eINSTANCE.getBoolLiteral_Value();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.ValueImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.EnumImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__VALUES = eINSTANCE.getEnum_Values();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.BooleanValueImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>True Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__TRUE_VALUE = eINSTANCE.getBooleanValue_TrueValue();

		/**
		 * The meta object literal for the '<em><b>False Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__FALSE_VALUE = eINSTANCE.getBooleanValue_FalseValue();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.NamedElementImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.IdentifierImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__IS = eINSTANCE.getIdentifier_Is();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.RangeImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__RANGE = eINSTANCE.getRange_Range();

		/**
		 * The meta object literal for the '{@link configuratorProject.BinaryOparators <em>Binary Oparators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.BinaryOparators
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getBinaryOparators()
		 * @generated
		 */
		EEnum BINARY_OPARATORS = eINSTANCE.getBinaryOparators();

		/**
		 * The meta object literal for the '{@link configuratorProject.UnaryOparators <em>Unary Oparators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.UnaryOparators
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getUnaryOparators()
		 * @generated
		 */
		EEnum UNARY_OPARATORS = eINSTANCE.getUnaryOparators();

	}

} //ConfiguratorProjectPackage
