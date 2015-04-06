/**
 */
package configuratorProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>my Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.myModel#getMyModelContains <em>My Model Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getmyModel()
 * @model
 * @generated
 */
public interface myModel extends myNamedElement {
	/**
	 * Returns the value of the '<em><b>My Model Contains</b></em>' containment reference list.
	 * The list contents are of type {@link configuratorProject.myObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>My Model Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>My Model Contains</em>' containment reference list.
	 * @see configuratorProject.ConfiguratorProjectPackage#getmyModel_MyModelContains()
	 * @model containment="true"
	 * @generated
	 */
	EList<myObject> getMyModelContains();

} // myModel
