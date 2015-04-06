/**
 */
package configuratorProject.impl;

import configuratorProject.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfiguratorProjectFactoryImpl extends EFactoryImpl implements ConfiguratorProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConfiguratorProjectFactory init() {
		try {
			ConfiguratorProjectFactory theConfiguratorProjectFactory = (ConfiguratorProjectFactory)EPackage.Registry.INSTANCE.getEFactory(ConfiguratorProjectPackage.eNS_URI);
			if (theConfiguratorProjectFactory != null) {
				return theConfiguratorProjectFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConfiguratorProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorProjectFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConfiguratorProjectPackage.MY_MODEL: return createmyModel();
			case ConfiguratorProjectPackage.MY_OBJECT: return createmyObject();
			case ConfiguratorProjectPackage.MY_CONSTRAINT: return createmyConstraint();
			case ConfiguratorProjectPackage.MY_ATTRIBUTE: return createmyAttribute();
			case ConfiguratorProjectPackage.MY_BINARY: return createmyBinary();
			case ConfiguratorProjectPackage.MY_UNARY: return createmyUnary();
			case ConfiguratorProjectPackage.MY_STRING: return createmyString();
			case ConfiguratorProjectPackage.MY_INT: return createmyInt();
			case ConfiguratorProjectPackage.BOOL_LITERAL: return createBoolLiteral();
			case ConfiguratorProjectPackage.MY_ENUM: return createmyEnum();
			case ConfiguratorProjectPackage.BOOLEAN_VALUE: return createBooleanValue();
			case ConfiguratorProjectPackage.MY_IDENTIFIER: return createmyIdentifier();
			case ConfiguratorProjectPackage.MY_RANGE: return createmyRange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConfiguratorProjectPackage.MY_BINARY_OPARATORS:
				return createmyBinaryOparatorsFromString(eDataType, initialValue);
			case ConfiguratorProjectPackage.MY_UNARY_OPARATORS:
				return createmyUnaryOparatorsFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConfiguratorProjectPackage.MY_BINARY_OPARATORS:
				return convertmyBinaryOparatorsToString(eDataType, instanceValue);
			case ConfiguratorProjectPackage.MY_UNARY_OPARATORS:
				return convertmyUnaryOparatorsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myModel createmyModel() {
		myModelImpl myModel = new myModelImpl();
		return myModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myObject createmyObject() {
		myObjectImpl myObject = new myObjectImpl();
		return myObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myConstraint createmyConstraint() {
		myConstraintImpl myConstraint = new myConstraintImpl();
		return myConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myAttribute createmyAttribute() {
		myAttributeImpl myAttribute = new myAttributeImpl();
		return myAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myBinary createmyBinary() {
		myBinaryImpl myBinary = new myBinaryImpl();
		return myBinary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myUnary createmyUnary() {
		myUnaryImpl myUnary = new myUnaryImpl();
		return myUnary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myString createmyString() {
		myStringImpl myString = new myStringImpl();
		return myString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myInt createmyInt() {
		myIntImpl myInt = new myIntImpl();
		return myInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolLiteral createBoolLiteral() {
		BoolLiteralImpl boolLiteral = new BoolLiteralImpl();
		return boolLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myEnum createmyEnum() {
		myEnumImpl myEnum = new myEnumImpl();
		return myEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myIdentifier createmyIdentifier() {
		myIdentifierImpl myIdentifier = new myIdentifierImpl();
		return myIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myRange createmyRange() {
		myRangeImpl myRange = new myRangeImpl();
		return myRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myBinaryOparators createmyBinaryOparatorsFromString(EDataType eDataType, String initialValue) {
		myBinaryOparators result = myBinaryOparators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmyBinaryOparatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myUnaryOparators createmyUnaryOparatorsFromString(EDataType eDataType, String initialValue) {
		myUnaryOparators result = myUnaryOparators.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmyUnaryOparatorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorProjectPackage getConfiguratorProjectPackage() {
		return (ConfiguratorProjectPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConfiguratorProjectPackage getPackage() {
		return ConfiguratorProjectPackage.eINSTANCE;
	}

} //ConfiguratorProjectFactoryImpl
