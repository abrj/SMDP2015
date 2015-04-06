/**
 */
package configuratorProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Attribute#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(Value)
	 * @see configuratorProject.ConfiguratorProjectPackage#getAttribute_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getContains();

	/**
	 * Sets the value of the '{@link configuratorProject.Attribute#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Value value);

} // Attribute
