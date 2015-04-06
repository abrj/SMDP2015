/**
 */
package configuratorProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Object#getHas <em>Has</em>}</li>
 *   <li>{@link configuratorProject.Object#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link configuratorProject.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see configuratorProject.ConfiguratorProjectPackage#getObject_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getHas();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link configuratorProject.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see configuratorProject.ConfiguratorProjectPackage#getObject_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getContains();

} // Object
