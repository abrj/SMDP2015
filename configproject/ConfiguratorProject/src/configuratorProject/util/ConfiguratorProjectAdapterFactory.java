/**
 */
package configuratorProject.util;

import configuratorProject.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see configuratorProject.ConfiguratorProjectPackage
 * @generated
 */
public class ConfiguratorProjectAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfiguratorProjectPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfiguratorProjectAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConfiguratorProjectPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfiguratorProjectSwitch<Adapter> modelSwitch =
		new ConfiguratorProjectSwitch<Adapter>() {
			@Override
			public Adapter casemyModel(myModel object) {
				return createmyModelAdapter();
			}
			@Override
			public Adapter casemyObject(myObject object) {
				return createmyObjectAdapter();
			}
			@Override
			public Adapter casemyConstraint(myConstraint object) {
				return createmyConstraintAdapter();
			}
			@Override
			public Adapter casemyAttribute(myAttribute object) {
				return createmyAttributeAdapter();
			}
			@Override
			public Adapter casemyExpression(myExpression object) {
				return createmyExpressionAdapter();
			}
			@Override
			public Adapter casemyBinary(myBinary object) {
				return createmyBinaryAdapter();
			}
			@Override
			public Adapter casemyUnary(myUnary object) {
				return createmyUnaryAdapter();
			}
			@Override
			public Adapter casemyLiteral(myLiteral object) {
				return createmyLiteralAdapter();
			}
			@Override
			public Adapter casemyString(myString object) {
				return createmyStringAdapter();
			}
			@Override
			public Adapter casemyInt(myInt object) {
				return createmyIntAdapter();
			}
			@Override
			public Adapter caseBoolLiteral(BoolLiteral object) {
				return createBoolLiteralAdapter();
			}
			@Override
			public Adapter casemyValue(myValue object) {
				return createmyValueAdapter();
			}
			@Override
			public Adapter casemyEnum(myEnum object) {
				return createmyEnumAdapter();
			}
			@Override
			public Adapter caseBooleanValue(BooleanValue object) {
				return createBooleanValueAdapter();
			}
			@Override
			public Adapter casemyNamedElement(myNamedElement object) {
				return createmyNamedElementAdapter();
			}
			@Override
			public Adapter casemyIdentifier(myIdentifier object) {
				return createmyIdentifierAdapter();
			}
			@Override
			public Adapter casemyRange(myRange object) {
				return createmyRangeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myModel <em>my Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myModel
	 * @generated
	 */
	public Adapter createmyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myObject <em>my Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myObject
	 * @generated
	 */
	public Adapter createmyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myConstraint <em>my Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myConstraint
	 * @generated
	 */
	public Adapter createmyConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myAttribute <em>my Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myAttribute
	 * @generated
	 */
	public Adapter createmyAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myExpression <em>my Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myExpression
	 * @generated
	 */
	public Adapter createmyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myBinary <em>my Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myBinary
	 * @generated
	 */
	public Adapter createmyBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myUnary <em>my Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myUnary
	 * @generated
	 */
	public Adapter createmyUnaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myLiteral <em>my Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myLiteral
	 * @generated
	 */
	public Adapter createmyLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myString <em>my String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myString
	 * @generated
	 */
	public Adapter createmyStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myInt <em>my Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myInt
	 * @generated
	 */
	public Adapter createmyIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.BoolLiteral <em>Bool Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.BoolLiteral
	 * @generated
	 */
	public Adapter createBoolLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myValue <em>my Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myValue
	 * @generated
	 */
	public Adapter createmyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myEnum <em>my Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myEnum
	 * @generated
	 */
	public Adapter createmyEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.BooleanValue
	 * @generated
	 */
	public Adapter createBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myNamedElement <em>my Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myNamedElement
	 * @generated
	 */
	public Adapter createmyNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myIdentifier <em>my Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myIdentifier
	 * @generated
	 */
	public Adapter createmyIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link configuratorProject.myRange <em>my Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see configuratorProject.myRange
	 * @generated
	 */
	public Adapter createmyRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConfiguratorProjectAdapterFactory
