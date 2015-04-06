/**
 */
package configuratorProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Unary#getOparand <em>Oparand</em>}</li>
 *   <li>{@link configuratorProject.Unary#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getUnary()
 * @model
 * @generated
 */
public interface Unary extends Expression {
	/**
	 * Returns the value of the '<em><b>Oparand</b></em>' attribute.
	 * The literals are from the enumeration {@link configuratorProject.UnaryOparators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oparand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oparand</em>' attribute.
	 * @see configuratorProject.UnaryOparators
	 * @see #setOparand(UnaryOparators)
	 * @see configuratorProject.ConfiguratorProjectPackage#getUnary_Oparand()
	 * @model
	 * @generated
	 */
	UnaryOparators getOparand();

	/**
	 * Sets the value of the '{@link configuratorProject.Unary#getOparand <em>Oparand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oparand</em>' attribute.
	 * @see configuratorProject.UnaryOparators
	 * @see #getOparand()
	 * @generated
	 */
	void setOparand(UnaryOparators value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getUnary_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link configuratorProject.Unary#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Unary
