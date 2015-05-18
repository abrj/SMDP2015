/**
 */
package configuratorProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>my Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.myAttribute#getMyAttributeContains <em>My Attribute Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyAttribute()
 * @model
 * @generated
 */
public interface myAttribute extends myNamedElement {
	/**
	 * Returns the value of the '<em><b>My Attribute Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Attribute Contains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Attribute Contains</em>' containment reference.
	 * @see #setMyAttributeContains(myValue)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyAttribute_MyAttributeContains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	myValue getMyAttributeContains();

	/**
	 * Sets the value of the '{@link configuratorProject.myAttribute#getMyAttributeContains <em>My Attribute Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Attribute Contains</em>' containment reference.
	 * @see #getMyAttributeContains()
	 * @generated
	 */
	void setMyAttributeContains(myValue value);

} // myAttribute
