/**
 */
package configuratorProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>my Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.myConstraint#getMyConstraintContains <em>My Constraint Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyConstraint()
 * @model
 * @generated
 */
public interface myConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>My Constraint Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Constraint Contains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Constraint Contains</em>' containment reference.
	 * @see #setMyConstraintContains(myExpression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyConstraint_MyConstraintContains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	myExpression getMyConstraintContains();

	/**
	 * Sets the value of the '{@link configuratorProject.myConstraint#getMyConstraintContains <em>My Constraint Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Constraint Contains</em>' containment reference.
	 * @see #getMyConstraintContains()
	 * @generated
	 */
	void setMyConstraintContains(myExpression value);

} // myConstraint
