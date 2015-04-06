/**
 */
package configuratorProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Constraint#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(Expression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getConstraint_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getContains();

	/**
	 * Sets the value of the '{@link configuratorProject.Constraint#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Expression value);

} // Constraint