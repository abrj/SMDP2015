/**
 */
package configuratorProject;

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
	 * The meta object id for the '{@link configuratorProject.impl.myNamedElementImpl <em>my Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myNamedElementImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyNamedElement()
	 * @generated
	 */
	int MY_NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>my Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>my Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myModelImpl <em>my Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myModelImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyModel()
	 * @generated
	 */
	int MY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MODEL__NAME = MY_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>My Model Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MODEL__MY_MODEL_CONTAINS = MY_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>my Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MODEL_FEATURE_COUNT = MY_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>my Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_MODEL_OPERATION_COUNT = MY_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myObjectImpl <em>my Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myObjectImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyObject()
	 * @generated
	 */
	int MY_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_OBJECT__NAME = MY_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>My Object Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_OBJECT__MY_OBJECT_HAS = MY_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>My Attribute Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_OBJECT__MY_ATTRIBUTE_CONTAINS = MY_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>my Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_OBJECT_FEATURE_COUNT = MY_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>my Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_OBJECT_OPERATION_COUNT = MY_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myConstraintImpl <em>my Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myConstraintImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyConstraint()
	 * @generated
	 */
	int MY_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>My Constraint Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS = 0;

	/**
	 * The number of structural features of the '<em>my Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>my Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myAttributeImpl <em>my Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myAttributeImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyAttribute()
	 * @generated
	 */
	int MY_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ATTRIBUTE__NAME = MY_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>My Attribute Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS = MY_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>my Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ATTRIBUTE_FEATURE_COUNT = MY_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>my Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ATTRIBUTE_OPERATION_COUNT = MY_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myExpressionImpl <em>my Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myExpressionImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyExpression()
	 * @generated
	 */
	int MY_EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>my Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>my Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myBinaryImpl <em>my Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myBinaryImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyBinary()
	 * @generated
	 */
	int MY_BINARY = 5;

	/**
	 * The feature id for the '<em><b>Oparand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BINARY__OPARAND = MY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>My Binary Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BINARY__MY_BINARY_LEFT = MY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>My Binary Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BINARY__MY_BINARY_RIGHT = MY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>my Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BINARY_FEATURE_COUNT = MY_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>my Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_BINARY_OPERATION_COUNT = MY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myUnaryImpl <em>my Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myUnaryImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyUnary()
	 * @generated
	 */
	int MY_UNARY = 6;

	/**
	 * The feature id for the '<em><b>Oparand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_UNARY__OPARAND = MY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>My Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_UNARY__MY_UNARY_EXPRESSION = MY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>my Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_UNARY_FEATURE_COUNT = MY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>my Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_UNARY_OPERATION_COUNT = MY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myLiteralImpl <em>my Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myLiteralImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyLiteral()
	 * @generated
	 */
	int MY_LITERAL = 7;

	/**
	 * The number of structural features of the '<em>my Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_LITERAL_FEATURE_COUNT = MY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>my Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_LITERAL_OPERATION_COUNT = MY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myStringImpl <em>my String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myStringImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyString()
	 * @generated
	 */
	int MY_STRING = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING__VALUE = MY_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>my String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING_FEATURE_COUNT = MY_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>my String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_STRING_OPERATION_COUNT = MY_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myIntImpl <em>my Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myIntImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyInt()
	 * @generated
	 */
	int MY_INT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_INT__VALUE = MY_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>my Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_INT_FEATURE_COUNT = MY_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>my Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_INT_OPERATION_COUNT = MY_LITERAL_OPERATION_COUNT + 0;

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
	int BOOL_LITERAL__VALUE = MY_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_FEATURE_COUNT = MY_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_OPERATION_COUNT = MY_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myValueImpl <em>my Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myValueImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyValue()
	 * @generated
	 */
	int MY_VALUE = 11;

	/**
	 * The number of structural features of the '<em>my Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>my Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myEnumImpl <em>my Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myEnumImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyEnum()
	 * @generated
	 */
	int MY_ENUM = 12;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ENUM__VALUES = MY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>my Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ENUM_FEATURE_COUNT = MY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>my Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_ENUM_OPERATION_COUNT = MY_VALUE_OPERATION_COUNT + 0;

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
	int BOOLEAN_VALUE__TRUE_VALUE = MY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>False Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__FALSE_VALUE = MY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = MY_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = MY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myIdentifierImpl <em>my Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myIdentifierImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyIdentifier()
	 * @generated
	 */
	int MY_IDENTIFIER = 15;

	/**
	 * The feature id for the '<em><b>My Intentifier Is</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IDENTIFIER__MY_INTENTIFIER_IS = MY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>my Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IDENTIFIER_FEATURE_COUNT = MY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>my Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_IDENTIFIER_OPERATION_COUNT = MY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.impl.myRangeImpl <em>my Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.impl.myRangeImpl
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyRange()
	 * @generated
	 */
	int MY_RANGE = 16;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_RANGE__RANGE = MY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>my Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_RANGE_FEATURE_COUNT = MY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>my Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_RANGE_OPERATION_COUNT = MY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link configuratorProject.myBinaryOparators <em>my Binary Oparators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.myBinaryOparators
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyBinaryOparators()
	 * @generated
	 */
	int MY_BINARY_OPARATORS = 17;

	/**
	 * The meta object id for the '{@link configuratorProject.myUnaryOparators <em>my Unary Oparators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see configuratorProject.myUnaryOparators
	 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyUnaryOparators()
	 * @generated
	 */
	int MY_UNARY_OPARATORS = 18;


	/**
	 * Returns the meta object for class '{@link configuratorProject.myModel <em>my Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Model</em>'.
	 * @see configuratorProject.myModel
	 * @generated
	 */
	EClass getmyModel();

	/**
	 * Returns the meta object for the containment reference list '{@link configuratorProject.myModel#getMyModelContains <em>My Model Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Model Contains</em>'.
	 * @see configuratorProject.myModel#getMyModelContains()
	 * @see #getmyModel()
	 * @generated
	 */
	EReference getmyModel_MyModelContains();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myObject <em>my Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Object</em>'.
	 * @see configuratorProject.myObject
	 * @generated
	 */
	EClass getmyObject();

	/**
	 * Returns the meta object for the containment reference list '{@link configuratorProject.myObject#getMyObjectHas <em>My Object Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Object Has</em>'.
	 * @see configuratorProject.myObject#getMyObjectHas()
	 * @see #getmyObject()
	 * @generated
	 */
	EReference getmyObject_MyObjectHas();

	/**
	 * Returns the meta object for the containment reference list '{@link configuratorProject.myObject#getMyAttributeContains <em>My Attribute Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>My Attribute Contains</em>'.
	 * @see configuratorProject.myObject#getMyAttributeContains()
	 * @see #getmyObject()
	 * @generated
	 */
	EReference getmyObject_MyAttributeContains();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myConstraint <em>my Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Constraint</em>'.
	 * @see configuratorProject.myConstraint
	 * @generated
	 */
	EClass getmyConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.myConstraint#getMyConstraintContains <em>My Constraint Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Constraint Contains</em>'.
	 * @see configuratorProject.myConstraint#getMyConstraintContains()
	 * @see #getmyConstraint()
	 * @generated
	 */
	EReference getmyConstraint_MyConstraintContains();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myAttribute <em>my Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Attribute</em>'.
	 * @see configuratorProject.myAttribute
	 * @generated
	 */
	EClass getmyAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.myAttribute#getMyAttributeContains <em>My Attribute Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Attribute Contains</em>'.
	 * @see configuratorProject.myAttribute#getMyAttributeContains()
	 * @see #getmyAttribute()
	 * @generated
	 */
	EReference getmyAttribute_MyAttributeContains();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myExpression <em>my Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Expression</em>'.
	 * @see configuratorProject.myExpression
	 * @generated
	 */
	EClass getmyExpression();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myBinary <em>my Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Binary</em>'.
	 * @see configuratorProject.myBinary
	 * @generated
	 */
	EClass getmyBinary();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.myBinary#getOparand <em>Oparand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oparand</em>'.
	 * @see configuratorProject.myBinary#getOparand()
	 * @see #getmyBinary()
	 * @generated
	 */
	EAttribute getmyBinary_Oparand();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.myBinary#getMyBinaryLeft <em>My Binary Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Binary Left</em>'.
	 * @see configuratorProject.myBinary#getMyBinaryLeft()
	 * @see #getmyBinary()
	 * @generated
	 */
	EReference getmyBinary_MyBinaryLeft();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.myBinary#getMyBinaryRight <em>My Binary Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Binary Right</em>'.
	 * @see configuratorProject.myBinary#getMyBinaryRight()
	 * @see #getmyBinary()
	 * @generated
	 */
	EReference getmyBinary_MyBinaryRight();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myUnary <em>my Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Unary</em>'.
	 * @see configuratorProject.myUnary
	 * @generated
	 */
	EClass getmyUnary();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.myUnary#getOparand <em>Oparand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oparand</em>'.
	 * @see configuratorProject.myUnary#getOparand()
	 * @see #getmyUnary()
	 * @generated
	 */
	EAttribute getmyUnary_Oparand();

	/**
	 * Returns the meta object for the containment reference '{@link configuratorProject.myUnary#getMyUnaryExpression <em>My Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>My Unary Expression</em>'.
	 * @see configuratorProject.myUnary#getMyUnaryExpression()
	 * @see #getmyUnary()
	 * @generated
	 */
	EReference getmyUnary_MyUnaryExpression();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myLiteral <em>my Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Literal</em>'.
	 * @see configuratorProject.myLiteral
	 * @generated
	 */
	EClass getmyLiteral();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myString <em>my String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my String</em>'.
	 * @see configuratorProject.myString
	 * @generated
	 */
	EClass getmyString();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.myString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see configuratorProject.myString#getValue()
	 * @see #getmyString()
	 * @generated
	 */
	EAttribute getmyString_Value();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myInt <em>my Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Int</em>'.
	 * @see configuratorProject.myInt
	 * @generated
	 */
	EClass getmyInt();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.myInt#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see configuratorProject.myInt#getValue()
	 * @see #getmyInt()
	 * @generated
	 */
	EAttribute getmyInt_Value();

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
	 * Returns the meta object for class '{@link configuratorProject.myValue <em>my Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Value</em>'.
	 * @see configuratorProject.myValue
	 * @generated
	 */
	EClass getmyValue();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myEnum <em>my Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Enum</em>'.
	 * @see configuratorProject.myEnum
	 * @generated
	 */
	EClass getmyEnum();

	/**
	 * Returns the meta object for the attribute list '{@link configuratorProject.myEnum#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see configuratorProject.myEnum#getValues()
	 * @see #getmyEnum()
	 * @generated
	 */
	EAttribute getmyEnum_Values();

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
	 * Returns the meta object for class '{@link configuratorProject.myNamedElement <em>my Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Named Element</em>'.
	 * @see configuratorProject.myNamedElement
	 * @generated
	 */
	EClass getmyNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.myNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see configuratorProject.myNamedElement#getName()
	 * @see #getmyNamedElement()
	 * @generated
	 */
	EAttribute getmyNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myIdentifier <em>my Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Identifier</em>'.
	 * @see configuratorProject.myIdentifier
	 * @generated
	 */
	EClass getmyIdentifier();

	/**
	 * Returns the meta object for the reference '{@link configuratorProject.myIdentifier#getMyIntentifierIs <em>My Intentifier Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>My Intentifier Is</em>'.
	 * @see configuratorProject.myIdentifier#getMyIntentifierIs()
	 * @see #getmyIdentifier()
	 * @generated
	 */
	EReference getmyIdentifier_MyIntentifierIs();

	/**
	 * Returns the meta object for class '{@link configuratorProject.myRange <em>my Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>my Range</em>'.
	 * @see configuratorProject.myRange
	 * @generated
	 */
	EClass getmyRange();

	/**
	 * Returns the meta object for the attribute '{@link configuratorProject.myRange#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see configuratorProject.myRange#getRange()
	 * @see #getmyRange()
	 * @generated
	 */
	EAttribute getmyRange_Range();

	/**
	 * Returns the meta object for enum '{@link configuratorProject.myBinaryOparators <em>my Binary Oparators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>my Binary Oparators</em>'.
	 * @see configuratorProject.myBinaryOparators
	 * @generated
	 */
	EEnum getmyBinaryOparators();

	/**
	 * Returns the meta object for enum '{@link configuratorProject.myUnaryOparators <em>my Unary Oparators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>my Unary Oparators</em>'.
	 * @see configuratorProject.myUnaryOparators
	 * @generated
	 */
	EEnum getmyUnaryOparators();

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
		 * The meta object literal for the '{@link configuratorProject.impl.myModelImpl <em>my Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myModelImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyModel()
		 * @generated
		 */
		EClass MY_MODEL = eINSTANCE.getmyModel();

		/**
		 * The meta object literal for the '<em><b>My Model Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_MODEL__MY_MODEL_CONTAINS = eINSTANCE.getmyModel_MyModelContains();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myObjectImpl <em>my Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myObjectImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyObject()
		 * @generated
		 */
		EClass MY_OBJECT = eINSTANCE.getmyObject();

		/**
		 * The meta object literal for the '<em><b>My Object Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_OBJECT__MY_OBJECT_HAS = eINSTANCE.getmyObject_MyObjectHas();

		/**
		 * The meta object literal for the '<em><b>My Attribute Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_OBJECT__MY_ATTRIBUTE_CONTAINS = eINSTANCE.getmyObject_MyAttributeContains();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myConstraintImpl <em>my Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myConstraintImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyConstraint()
		 * @generated
		 */
		EClass MY_CONSTRAINT = eINSTANCE.getmyConstraint();

		/**
		 * The meta object literal for the '<em><b>My Constraint Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS = eINSTANCE.getmyConstraint_MyConstraintContains();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myAttributeImpl <em>my Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myAttributeImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyAttribute()
		 * @generated
		 */
		EClass MY_ATTRIBUTE = eINSTANCE.getmyAttribute();

		/**
		 * The meta object literal for the '<em><b>My Attribute Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS = eINSTANCE.getmyAttribute_MyAttributeContains();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myExpressionImpl <em>my Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myExpressionImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyExpression()
		 * @generated
		 */
		EClass MY_EXPRESSION = eINSTANCE.getmyExpression();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myBinaryImpl <em>my Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myBinaryImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyBinary()
		 * @generated
		 */
		EClass MY_BINARY = eINSTANCE.getmyBinary();

		/**
		 * The meta object literal for the '<em><b>Oparand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_BINARY__OPARAND = eINSTANCE.getmyBinary_Oparand();

		/**
		 * The meta object literal for the '<em><b>My Binary Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_BINARY__MY_BINARY_LEFT = eINSTANCE.getmyBinary_MyBinaryLeft();

		/**
		 * The meta object literal for the '<em><b>My Binary Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_BINARY__MY_BINARY_RIGHT = eINSTANCE.getmyBinary_MyBinaryRight();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myUnaryImpl <em>my Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myUnaryImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyUnary()
		 * @generated
		 */
		EClass MY_UNARY = eINSTANCE.getmyUnary();

		/**
		 * The meta object literal for the '<em><b>Oparand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_UNARY__OPARAND = eINSTANCE.getmyUnary_Oparand();

		/**
		 * The meta object literal for the '<em><b>My Unary Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_UNARY__MY_UNARY_EXPRESSION = eINSTANCE.getmyUnary_MyUnaryExpression();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myLiteralImpl <em>my Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myLiteralImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyLiteral()
		 * @generated
		 */
		EClass MY_LITERAL = eINSTANCE.getmyLiteral();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myStringImpl <em>my String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myStringImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyString()
		 * @generated
		 */
		EClass MY_STRING = eINSTANCE.getmyString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_STRING__VALUE = eINSTANCE.getmyString_Value();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myIntImpl <em>my Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myIntImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyInt()
		 * @generated
		 */
		EClass MY_INT = eINSTANCE.getmyInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_INT__VALUE = eINSTANCE.getmyInt_Value();

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
		 * The meta object literal for the '{@link configuratorProject.impl.myValueImpl <em>my Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myValueImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyValue()
		 * @generated
		 */
		EClass MY_VALUE = eINSTANCE.getmyValue();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myEnumImpl <em>my Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myEnumImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyEnum()
		 * @generated
		 */
		EClass MY_ENUM = eINSTANCE.getmyEnum();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_ENUM__VALUES = eINSTANCE.getmyEnum_Values();

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
		 * The meta object literal for the '{@link configuratorProject.impl.myNamedElementImpl <em>my Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myNamedElementImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyNamedElement()
		 * @generated
		 */
		EClass MY_NAMED_ELEMENT = eINSTANCE.getmyNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_NAMED_ELEMENT__NAME = eINSTANCE.getmyNamedElement_Name();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myIdentifierImpl <em>my Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myIdentifierImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyIdentifier()
		 * @generated
		 */
		EClass MY_IDENTIFIER = eINSTANCE.getmyIdentifier();

		/**
		 * The meta object literal for the '<em><b>My Intentifier Is</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_IDENTIFIER__MY_INTENTIFIER_IS = eINSTANCE.getmyIdentifier_MyIntentifierIs();

		/**
		 * The meta object literal for the '{@link configuratorProject.impl.myRangeImpl <em>my Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.impl.myRangeImpl
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyRange()
		 * @generated
		 */
		EClass MY_RANGE = eINSTANCE.getmyRange();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_RANGE__RANGE = eINSTANCE.getmyRange_Range();

		/**
		 * The meta object literal for the '{@link configuratorProject.myBinaryOparators <em>my Binary Oparators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.myBinaryOparators
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyBinaryOparators()
		 * @generated
		 */
		EEnum MY_BINARY_OPARATORS = eINSTANCE.getmyBinaryOparators();

		/**
		 * The meta object literal for the '{@link configuratorProject.myUnaryOparators <em>my Unary Oparators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see configuratorProject.myUnaryOparators
		 * @see configuratorProject.impl.ConfiguratorProjectPackageImpl#getmyUnaryOparators()
		 * @generated
		 */
		EEnum MY_UNARY_OPARATORS = eINSTANCE.getmyUnaryOparators();

	}

} //ConfiguratorProjectPackage
