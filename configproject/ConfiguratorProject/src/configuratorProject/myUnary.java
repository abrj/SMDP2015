/**
 */
package configuratorProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>my Unary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.myUnary#getOparand <em>Oparand</em>}</li>
 *   <li>{@link configuratorProject.myUnary#getMyUnaryExpression <em>My Unary Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyUnary()
 * @model
 * @generated
 */
public interface myUnary extends myExpression {
	/**
	 * Returns the value of the '<em><b>Oparand</b></em>' attribute.
	 * The literals are from the enumeration {@link configuratorProject.myUnaryOparators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oparand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oparand</em>' attribute.
	 * @see configuratorProject.myUnaryOparators
	 * @see #setOparand(myUnaryOparators)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyUnary_Oparand()
	 * @model
	 * @generated
	 */
	myUnaryOparators getOparand();

	/**
	 * Sets the value of the '{@link configuratorProject.myUnary#getOparand <em>Oparand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oparand</em>' attribute.
	 * @see configuratorProject.myUnaryOparators
	 * @see #getOparand()
	 * @generated
	 */
	void setOparand(myUnaryOparators value);

	/**
	 * Returns the value of the '<em><b>My Unary Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Unary Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Unary Expression</em>' containment reference.
	 * @see #setMyUnaryExpression(myExpression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyUnary_MyUnaryExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	myExpression getMyUnaryExpression();

	/**
	 * Sets the value of the '{@link configuratorProject.myUnary#getMyUnaryExpression <em>My Unary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Unary Expression</em>' containment reference.
	 * @see #getMyUnaryExpression()
	 * @generated
	 */
	void setMyUnaryExpression(myExpression value);

} // myUnary
