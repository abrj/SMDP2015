/**
 */
package configuratorProject.util;

import configuratorProject.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see configuratorProject.ConfiguratorProjectPackage
 * @generated
 */
public class ConfiguratorProjectSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfiguratorProjectPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorProjectSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfiguratorProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConfiguratorProjectPackage.MY_MODEL: {
				myModel myModel = (myModel)theEObject;
				T result = casemyModel(myModel);
				if (result == null) result = casemyNamedElement(myModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_OBJECT: {
				myObject myObject = (myObject)theEObject;
				T result = casemyObject(myObject);
				if (result == null) result = casemyNamedElement(myObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_CONSTRAINT: {
				myConstraint myConstraint = (myConstraint)theEObject;
				T result = casemyConstraint(myConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_ATTRIBUTE: {
				myAttribute myAttribute = (myAttribute)theEObject;
				T result = casemyAttribute(myAttribute);
				if (result == null) result = casemyNamedElement(myAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_EXPRESSION: {
				myExpression myExpression = (myExpression)theEObject;
				T result = casemyExpression(myExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_BINARY: {
				myBinary myBinary = (myBinary)theEObject;
				T result = casemyBinary(myBinary);
				if (result == null) result = casemyExpression(myBinary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_UNARY: {
				myUnary myUnary = (myUnary)theEObject;
				T result = casemyUnary(myUnary);
				if (result == null) result = casemyExpression(myUnary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_LITERAL: {
				myLiteral myLiteral = (myLiteral)theEObject;
				T result = casemyLiteral(myLiteral);
				if (result == null) result = casemyExpression(myLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_BOOL_LITERAL: {
				MyBoolLiteral myBoolLiteral = (MyBoolLiteral)theEObject;
				T result = caseMyBoolLiteral(myBoolLiteral);
				if (result == null) result = casemyLiteral(myBoolLiteral);
				if (result == null) result = casemyExpression(myBoolLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_VALUE: {
				myValue myValue = (myValue)theEObject;
				T result = casemyValue(myValue);
				if (result == null) result = casemyLiteral(myValue);
				if (result == null) result = casemyExpression(myValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_ENUM: {
				myEnum myEnum = (myEnum)theEObject;
				T result = casemyEnum(myEnum);
				if (result == null) result = casemyValue(myEnum);
				if (result == null) result = casemyLiteral(myEnum);
				if (result == null) result = casemyExpression(myEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_BOOLEAN: {
				myBoolean myBoolean = (myBoolean)theEObject;
				T result = casemyBoolean(myBoolean);
				if (result == null) result = casemyValue(myBoolean);
				if (result == null) result = casemyLiteral(myBoolean);
				if (result == null) result = casemyExpression(myBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_NAMED_ELEMENT: {
				myNamedElement myNamedElement = (myNamedElement)theEObject;
				T result = casemyNamedElement(myNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_IDENTIFIER: {
				myIdentifier myIdentifier = (myIdentifier)theEObject;
				T result = casemyIdentifier(myIdentifier);
				if (result == null) result = casemyExpression(myIdentifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_RANGE: {
				myRange myRange = (myRange)theEObject;
				T result = casemyRange(myRange);
				if (result == null) result = casemyValue(myRange);
				if (result == null) result = casemyLiteral(myRange);
				if (result == null) result = casemyExpression(myRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_STRING_ENUM: {
				myStringEnum myStringEnum = (myStringEnum)theEObject;
				T result = casemyStringEnum(myStringEnum);
				if (result == null) result = casemyEnum(myStringEnum);
				if (result == null) result = casemyValue(myStringEnum);
				if (result == null) result = casemyLiteral(myStringEnum);
				if (result == null) result = casemyExpression(myStringEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_NUMBER_ENUM: {
				myNumberEnum myNumberEnum = (myNumberEnum)theEObject;
				T result = casemyNumberEnum(myNumberEnum);
				if (result == null) result = casemyEnum(myNumberEnum);
				if (result == null) result = casemyValue(myNumberEnum);
				if (result == null) result = casemyLiteral(myNumberEnum);
				if (result == null) result = casemyExpression(myNumberEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION: {
				myConcreteExpression myConcreteExpression = (myConcreteExpression)theEObject;
				T result = casemyConcreteExpression(myConcreteExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyModel(myModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyObject(myObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyConstraint(myConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyAttribute(myAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyExpression(myExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyBinary(myBinary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Unary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Unary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyUnary(myUnary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyLiteral(myLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>My Bool Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>My Bool Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMyBoolLiteral(MyBoolLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyValue(myValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyEnum(myEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyBoolean(myBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyNamedElement(myNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyIdentifier(myIdentifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyRange(myRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my String Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my String Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyStringEnum(myStringEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Number Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Number Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyNumberEnum(myNumberEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>my Concrete Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>my Concrete Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casemyConcreteExpression(myConcreteExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConfiguratorProjectSwitch
