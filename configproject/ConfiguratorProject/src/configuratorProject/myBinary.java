/**
 */
package configuratorProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>my Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.myBinary#getOparand <em>Oparand</em>}</li>
 *   <li>{@link configuratorProject.myBinary#getMyBinaryLeft <em>My Binary Left</em>}</li>
 *   <li>{@link configuratorProject.myBinary#getMyBinaryRight <em>My Binary Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyBinary()
 * @model
 * @generated
 */
public interface myBinary extends myExpression {
	/**
	 * Returns the value of the '<em><b>Oparand</b></em>' attribute.
	 * The default value is <code>"if"</code>.
	 * The literals are from the enumeration {@link configuratorProject.myBinaryOparators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oparand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oparand</em>' attribute.
	 * @see configuratorProject.myBinaryOparators
	 * @see #setOparand(myBinaryOparators)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyBinary_Oparand()
	 * @model default="if"
	 * @generated
	 */
	myBinaryOparators getOparand();

	/**
	 * Sets the value of the '{@link configuratorProject.myBinary#getOparand <em>Oparand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oparand</em>' attribute.
	 * @see configuratorProject.myBinaryOparators
	 * @see #getOparand()
	 * @generated
	 */
	void setOparand(myBinaryOparators value);

	/**
	 * Returns the value of the '<em><b>My Binary Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Binary Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Binary Left</em>' containment reference.
	 * @see #setMyBinaryLeft(myConcreteExpression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyBinary_MyBinaryLeft()
	 * @model containment="true" required="true"
	 * @generated
	 */
	myConcreteExpression getMyBinaryLeft();

	/**
	 * Sets the value of the '{@link configuratorProject.myBinary#getMyBinaryLeft <em>My Binary Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Binary Left</em>' containment reference.
	 * @see #getMyBinaryLeft()
	 * @generated
	 */
	void setMyBinaryLeft(myConcreteExpression value);

	/**
	 * Returns the value of the '<em><b>My Binary Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Binary Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Binary Right</em>' containment reference.
	 * @see #setMyBinaryRight(myConcreteExpression)
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyBinary_MyBinaryRight()
	 * @model containment="true" required="true"
	 * @generated
	 */
	myConcreteExpression getMyBinaryRight();

	/**
	 * Sets the value of the '{@link configuratorProject.myBinary#getMyBinaryRight <em>My Binary Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>My Binary Right</em>' containment reference.
	 * @see #getMyBinaryRight()
	 * @generated
	 */
	void setMyBinaryRight(myConcreteExpression value);

} // myBinary
