/**
 */
package configuratorProject.impl;

import configuratorProject.BoolLiteral;
import configuratorProject.BooleanValue;
import configuratorProject.ConfiguratorProjectFactory;
import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myAttribute;
import configuratorProject.myBinary;
import configuratorProject.myBinaryOparators;
import configuratorProject.myConstraint;
import configuratorProject.myEnum;
import configuratorProject.myExpression;
import configuratorProject.myIdentifier;
import configuratorProject.myInt;
import configuratorProject.myLiteral;
import configuratorProject.myModel;
import configuratorProject.myNamedElement;
import configuratorProject.myObject;
import configuratorProject.myRange;
import configuratorProject.myString;
import configuratorProject.myUnary;
import configuratorProject.myUnaryOparators;
import configuratorProject.myValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguratorProjectPackageImpl extends EPackageImpl implements ConfiguratorProjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myBinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myUnaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass myRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum myBinaryOparatorsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum myUnaryOparatorsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see configuratorProject.ConfiguratorProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfiguratorProjectPackageImpl() {
		super(eNS_URI, ConfiguratorProjectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConfiguratorProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfiguratorProjectPackage init() {
		if (isInited) return (ConfiguratorProjectPackage)EPackage.Registry.INSTANCE.getEPackage(ConfiguratorProjectPackage.eNS_URI);

		// Obtain or create and register package
		ConfiguratorProjectPackageImpl theConfiguratorProjectPackage = (ConfiguratorProjectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfiguratorProjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfiguratorProjectPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfiguratorProjectPackage.createPackageContents();

		// Initialize created meta-data
		theConfiguratorProjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfiguratorProjectPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfiguratorProjectPackage.eNS_URI, theConfiguratorProjectPackage);
		return theConfiguratorProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyModel() {
		return myModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyModel_MyModelContains() {
		return (EReference)myModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyObject() {
		return myObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyObject_MyObjectHas() {
		return (EReference)myObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyObject_MyAttributeContains() {
		return (EReference)myObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyConstraint() {
		return myConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyConstraint_MyConstraintContains() {
		return (EReference)myConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyAttribute() {
		return myAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyAttribute_MyAttributeContains() {
		return (EReference)myAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyExpression() {
		return myExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyBinary() {
		return myBinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmyBinary_Oparand() {
		return (EAttribute)myBinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyBinary_MyBinaryLeft() {
		return (EReference)myBinaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyBinary_MyBinaryRight() {
		return (EReference)myBinaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyUnary() {
		return myUnaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmyUnary_Oparand() {
		return (EAttribute)myUnaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyUnary_MyUnaryExpression() {
		return (EReference)myUnaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyLiteral() {
		return myLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyString() {
		return myStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmyString_Value() {
		return (EAttribute)myStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyInt() {
		return myIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmyInt_Value() {
		return (EAttribute)myIntEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolLiteral() {
		return boolLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolLiteral_Value() {
		return (EAttribute)boolLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyValue() {
		return myValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyEnum() {
		return myEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmyEnum_Values() {
		return (EAttribute)myEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_TrueValue() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanValue_FalseValue() {
		return (EAttribute)booleanValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyNamedElement() {
		return myNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmyNamedElement_Name() {
		return (EAttribute)myNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyIdentifier() {
		return myIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getmyIdentifier_MyIntentifierIs() {
		return (EReference)myIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmyRange() {
		return myRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getmyRange_Range() {
		return (EAttribute)myRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getmyBinaryOparators() {
		return myBinaryOparatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getmyUnaryOparators() {
		return myUnaryOparatorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorProjectFactory getConfiguratorProjectFactory() {
		return (ConfiguratorProjectFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		myModelEClass = createEClass(MY_MODEL);
		createEReference(myModelEClass, MY_MODEL__MY_MODEL_CONTAINS);

		myObjectEClass = createEClass(MY_OBJECT);
		createEReference(myObjectEClass, MY_OBJECT__MY_OBJECT_HAS);
		createEReference(myObjectEClass, MY_OBJECT__MY_ATTRIBUTE_CONTAINS);

		myConstraintEClass = createEClass(MY_CONSTRAINT);
		createEReference(myConstraintEClass, MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS);

		myAttributeEClass = createEClass(MY_ATTRIBUTE);
		createEReference(myAttributeEClass, MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS);

		myExpressionEClass = createEClass(MY_EXPRESSION);

		myBinaryEClass = createEClass(MY_BINARY);
		createEAttribute(myBinaryEClass, MY_BINARY__OPARAND);
		createEReference(myBinaryEClass, MY_BINARY__MY_BINARY_LEFT);
		createEReference(myBinaryEClass, MY_BINARY__MY_BINARY_RIGHT);

		myUnaryEClass = createEClass(MY_UNARY);
		createEAttribute(myUnaryEClass, MY_UNARY__OPARAND);
		createEReference(myUnaryEClass, MY_UNARY__MY_UNARY_EXPRESSION);

		myLiteralEClass = createEClass(MY_LITERAL);

		myStringEClass = createEClass(MY_STRING);
		createEAttribute(myStringEClass, MY_STRING__VALUE);

		myIntEClass = createEClass(MY_INT);
		createEAttribute(myIntEClass, MY_INT__VALUE);

		boolLiteralEClass = createEClass(BOOL_LITERAL);
		createEAttribute(boolLiteralEClass, BOOL_LITERAL__VALUE);

		myValueEClass = createEClass(MY_VALUE);

		myEnumEClass = createEClass(MY_ENUM);
		createEAttribute(myEnumEClass, MY_ENUM__VALUES);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__TRUE_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__FALSE_VALUE);

		myNamedElementEClass = createEClass(MY_NAMED_ELEMENT);
		createEAttribute(myNamedElementEClass, MY_NAMED_ELEMENT__NAME);

		myIdentifierEClass = createEClass(MY_IDENTIFIER);
		createEReference(myIdentifierEClass, MY_IDENTIFIER__MY_INTENTIFIER_IS);

		myRangeEClass = createEClass(MY_RANGE);
		createEAttribute(myRangeEClass, MY_RANGE__RANGE);

		// Create enums
		myBinaryOparatorsEEnum = createEEnum(MY_BINARY_OPARATORS);
		myUnaryOparatorsEEnum = createEEnum(MY_UNARY_OPARATORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		myModelEClass.getESuperTypes().add(this.getmyNamedElement());
		myObjectEClass.getESuperTypes().add(this.getmyNamedElement());
		myAttributeEClass.getESuperTypes().add(this.getmyNamedElement());
		myBinaryEClass.getESuperTypes().add(this.getmyExpression());
		myUnaryEClass.getESuperTypes().add(this.getmyExpression());
		myLiteralEClass.getESuperTypes().add(this.getmyExpression());
		myStringEClass.getESuperTypes().add(this.getmyLiteral());
		myIntEClass.getESuperTypes().add(this.getmyLiteral());
		boolLiteralEClass.getESuperTypes().add(this.getmyLiteral());
		myEnumEClass.getESuperTypes().add(this.getmyValue());
		booleanValueEClass.getESuperTypes().add(this.getmyValue());
		myIdentifierEClass.getESuperTypes().add(this.getmyExpression());
		myRangeEClass.getESuperTypes().add(this.getmyValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(myModelEClass, myModel.class, "myModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmyModel_MyModelContains(), this.getmyObject(), null, "myModelContains", null, 0, -1, myModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myObjectEClass, myObject.class, "myObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmyObject_MyObjectHas(), this.getmyConstraint(), null, "myObjectHas", null, 0, -1, myObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmyObject_MyAttributeContains(), this.getmyAttribute(), null, "myAttributeContains", null, 0, -1, myObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myConstraintEClass, myConstraint.class, "myConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmyConstraint_MyConstraintContains(), this.getmyExpression(), null, "myConstraintContains", null, 1, 1, myConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myAttributeEClass, myAttribute.class, "myAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmyAttribute_MyAttributeContains(), this.getmyValue(), null, "myAttributeContains", null, 1, 1, myAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myExpressionEClass, myExpression.class, "myExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(myBinaryEClass, myBinary.class, "myBinary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmyBinary_Oparand(), this.getmyBinaryOparators(), "Oparand", "if", 0, 1, myBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmyBinary_MyBinaryLeft(), this.getmyExpression(), null, "myBinaryLeft", null, 1, 1, myBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmyBinary_MyBinaryRight(), this.getmyExpression(), null, "myBinaryRight", null, 1, 1, myBinary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myUnaryEClass, myUnary.class, "myUnary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmyUnary_Oparand(), this.getmyUnaryOparators(), "Oparand", null, 0, 1, myUnary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getmyUnary_MyUnaryExpression(), this.getmyExpression(), null, "myUnaryExpression", null, 1, 1, myUnary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myLiteralEClass, myLiteral.class, "myLiteral", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(myStringEClass, myString.class, "myString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmyString_Value(), theXMLTypePackage.getAnyURI(), "value", null, 1, 1, myString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myIntEClass, myInt.class, "myInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmyInt_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1, myInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolLiteralEClass, BoolLiteral.class, "BoolLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolLiteral_Value(), theXMLTypePackage.getBoolean(), "value", null, 1, 1, BoolLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myValueEClass, myValue.class, "myValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(myEnumEClass, myEnum.class, "myEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmyEnum_Values(), theXMLTypePackage.getAnySimpleType(), "values", null, 1, -1, myEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_TrueValue(), theXMLTypePackage.getAnyURI(), "trueValue", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanValue_FalseValue(), theXMLTypePackage.getAnyURI(), "falseValue", null, 1, 1, BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myNamedElementEClass, myNamedElement.class, "myNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmyNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, myNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myIdentifierEClass, myIdentifier.class, "myIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getmyIdentifier_MyIntentifierIs(), this.getmyAttribute(), null, "myIntentifierIs", null, 1, 1, myIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(myRangeEClass, myRange.class, "myRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getmyRange_Range(), theXMLTypePackage.getAnySimpleType(), "range", null, 1, 1, myRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(myBinaryOparatorsEEnum, myBinaryOparators.class, "myBinaryOparators");
		addEEnumLiteral(myBinaryOparatorsEEnum, myBinaryOparators.AND);
		addEEnumLiteral(myBinaryOparatorsEEnum, myBinaryOparators.OR);
		addEEnumLiteral(myBinaryOparatorsEEnum, myBinaryOparators.GT);
		addEEnumLiteral(myBinaryOparatorsEEnum, myBinaryOparators.LT);
		addEEnumLiteral(myBinaryOparatorsEEnum, myBinaryOparators.EQ);
		addEEnumLiteral(myBinaryOparatorsEEnum, myBinaryOparators.IS);
		addEEnumLiteral(myBinaryOparatorsEEnum, myBinaryOparators.IF);
		addEEnumLiteral(myBinaryOparatorsEEnum, myBinaryOparators.THEN);

		initEEnum(myUnaryOparatorsEEnum, myUnaryOparators.class, "myUnaryOparators");
		addEEnumLiteral(myUnaryOparatorsEEnum, myUnaryOparators.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //ConfiguratorProjectPackageImpl
