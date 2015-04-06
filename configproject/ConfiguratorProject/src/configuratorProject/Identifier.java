/**
 */
package configuratorProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Identifier#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getIdentifier()
 * @model
 * @generated
 */
public interface Identifier extends Expression {
	/**
	 * Returns the value of the '<em><b>Is</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' reference.
	 * @see #setIs(Attribute)
	 * @see configuratorProject.ConfiguratorProjectPackage#getIdentifier_Is()
	 * @model required="true"
	 * @generated
	 */
	Attribute getIs();

	/**
	 * Sets the value of the '{@link configuratorProject.Identifier#getIs <em>Is</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Attribute value);

} // Identifier
