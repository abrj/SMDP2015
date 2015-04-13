/**
 */
package configuratorProject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see configuratorProject.ConfiguratorProjectPackage
 * @generated
 */
public interface ConfiguratorProjectFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfiguratorProjectFactory eINSTANCE = configuratorProject.impl.ConfiguratorProjectFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>my Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Model</em>'.
	 * @generated
	 */
	myModel createmyModel();

	/**
	 * Returns a new object of class '<em>my Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Object</em>'.
	 * @generated
	 */
	myObject createmyObject();

	/**
	 * Returns a new object of class '<em>my Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Constraint</em>'.
	 * @generated
	 */
	myConstraint createmyConstraint();

	/**
	 * Returns a new object of class '<em>my Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Attribute</em>'.
	 * @generated
	 */
	myAttribute createmyAttribute();

	/**
	 * Returns a new object of class '<em>my Binary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Binary</em>'.
	 * @generated
	 */
	myBinary createmyBinary();

	/**
	 * Returns a new object of class '<em>my Unary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Unary</em>'.
	 * @generated
	 */
	myUnary createmyUnary();

	/**
	 * Returns a new object of class '<em>My Bool Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>My Bool Literal</em>'.
	 * @generated
	 */
	MyBoolLiteral createMyBoolLiteral();

	/**
	 * Returns a new object of class '<em>my Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Boolean</em>'.
	 * @generated
	 */
	myBoolean createmyBoolean();

	/**
	 * Returns a new object of class '<em>my Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Identifier</em>'.
	 * @generated
	 */
	myIdentifier createmyIdentifier();

	/**
	 * Returns a new object of class '<em>my Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Range</em>'.
	 * @generated
	 */
	myRange createmyRange();

	/**
	 * Returns a new object of class '<em>my String Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my String Enum</em>'.
	 * @generated
	 */
	myStringEnum createmyStringEnum();

	/**
	 * Returns a new object of class '<em>my Number Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>my Number Enum</em>'.
	 * @generated
	 */
	myNumberEnum createmyNumberEnum();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfiguratorProjectPackage getConfiguratorProjectPackage();

} //ConfiguratorProjectFactory
