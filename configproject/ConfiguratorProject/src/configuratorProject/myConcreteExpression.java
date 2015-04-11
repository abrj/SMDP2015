/**
 */
package configuratorProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>my Concrete Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.myConcreteExpression#getMyConcreteEx <em>My Concrete Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyConcreteExpression()
 * @model
 * @generated
 */
public interface myConcreteExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>My Concrete Ex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Concrete Ex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Concrete Ex</em>' containment reference.
	 * @see #setMyConcreteEx(myExpression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyConcreteExpression_MyConcreteEx()
	 * @model containment="true" required="true"
	 * @generated
	 */
	myExpression getMyConcreteEx();

	/**
	 * Sets the value of the '{@link configuratorProject.myConcreteExpression#getMyConcreteEx <em>My Concrete Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Concrete Ex</em>' containment reference.
	 * @see #getMyConcreteEx()
	 * @generated
	 */
	void setMyConcreteEx(myExpression value);

} // myConcreteExpression
