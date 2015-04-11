/**
 */
package configuratorProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>my Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.myBoolean#getTrueValue <em>True Value</em>}</li>
 *   <li>{@link configuratorProject.myBoolean#getFalseValue <em>False Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyBoolean()
 * @model
 * @generated
 */
public interface myBoolean extends myValue {
	/**
	 * Returns the value of the '<em><b>True Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Value</em>' attribute.
	 * @see #setTrueValue(String)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyBoolean_TrueValue()
	 * @model required="true"
	 * @generated
	 */
	String getTrueValue();

	/**
	 * Sets the value of the '{@link configuratorProject.myBoolean#getTrueValue <em>True Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Value</em>' attribute.
	 * @see #getTrueValue()
	 * @generated
	 */
	void setTrueValue(String value);

	/**
	 * Returns the value of the '<em><b>False Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Value</em>' attribute.
	 * @see #setFalseValue(String)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyBoolean_FalseValue()
	 * @model required="true"
	 * @generated
	 */
	String getFalseValue();

	/**
	 * Sets the value of the '{@link configuratorProject.myBoolean#getFalseValue <em>False Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Value</em>' attribute.
	 * @see #getFalseValue()
	 * @generated
	 */
	void setFalseValue(String value);

} // myBoolean
