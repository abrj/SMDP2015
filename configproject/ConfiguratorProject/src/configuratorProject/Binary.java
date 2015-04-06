/**
 */
package configuratorProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Binary#getOparand <em>Oparand</em>}</li>
 *   <li>{@link configuratorProject.Binary#getLeft <em>Left</em>}</li>
 *   <li>{@link configuratorProject.Binary#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends Expression {
	/**
	 * Returns the value of the '<em><b>Oparand</b></em>' attribute.
	 * The default value is <code>"if"</code>.
	 * The literals are from the enumeration {@link configuratorProject.BinaryOparators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oparand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oparand</em>' attribute.
	 * @see configuratorProject.BinaryOparators
	 * @see #setOparand(BinaryOparators)
	 * @see configuratorProject.ConfiguratorProjectPackage#getBinary_Oparand()
	 * @model default="if"
	 * @generated
	 */
	BinaryOparators getOparand();

	/**
	 * Sets the value of the '{@link configuratorProject.Binary#getOparand <em>Oparand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oparand</em>' attribute.
	 * @see configuratorProject.BinaryOparators
	 * @see #getOparand()
	 * @generated
	 */
	void setOparand(BinaryOparators value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getBinary_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link configuratorProject.Binary#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getBinary_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link configuratorProject.Binary#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

} // Binary
