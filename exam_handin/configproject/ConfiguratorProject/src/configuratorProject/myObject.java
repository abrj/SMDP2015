/**
 */
package configuratorProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>my Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.myObject#getMyObjectHas <em>My Object Has</em>}</li>
 *   <li>{@link configuratorProject.myObject#getMyAttributeContains <em>My Attribute Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyObject()
 * @model
 * @generated
 */
public interface myObject extends myNamedElement {
	/**
	 * Returns the value of the '<em><b>My Object Has</b></em>' containment reference list.
	 * The list contents are of type {@link configuratorProject.myConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Object Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Object Has</em>' containment reference list.
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyObject_MyObjectHas()
	 * @model containment="true"
	 * @generated
	 */
	EList<myConstraint> getMyObjectHas();

	/**
	 * Returns the value of the '<em><b>My Attribute Contains</b></em>' containment reference list.
	 * The list contents are of type {@link configuratorProject.myAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Attribute Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Attribute Contains</em>' containment reference list.
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyObject_MyAttributeContains()
	 * @model containment="true"
	 * @generated
	 */
	EList<myAttribute> getMyAttributeContains();

} // myObject
