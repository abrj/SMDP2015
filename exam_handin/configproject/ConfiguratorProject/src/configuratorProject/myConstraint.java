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
 *   <li>{@link configuratorProject.myConstraint#getMyIfConstraint <em>My If Constraint</em>}</li>
 *   <li>{@link configuratorProject.myConstraint#getMyThenConstraint <em>My Then Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyConstraint()
 * @model
 * @generated
 */
public interface myConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>My If Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My If Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My If Constraint</em>' containment reference.
	 * @see #setMyIfConstraint(myExpression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyConstraint_MyIfConstraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	myExpression getMyIfConstraint();

	/**
	 * Sets the value of the '{@link configuratorProject.myConstraint#getMyIfConstraint <em>My If Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My If Constraint</em>' containment reference.
	 * @see #getMyIfConstraint()
	 * @generated
	 */
	void setMyIfConstraint(myExpression value);

	/**
	 * Returns the value of the '<em><b>My Then Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Then Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Then Constraint</em>' containment reference.
	 * @see #setMyThenConstraint(myExpression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyConstraint_MyThenConstraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	myExpression getMyThenConstraint();

	/**
	 * Sets the value of the '{@link configuratorProject.myConstraint#getMyThenConstraint <em>My Then Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Then Constraint</em>' containment reference.
	 * @see #getMyThenConstraint()
	 * @generated
	 */
	void setMyThenConstraint(myExpression value);

} // myConstraint
