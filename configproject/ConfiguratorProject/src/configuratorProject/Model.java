/**
 */
package configuratorProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Model#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link configuratorProject.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see configuratorProject.ConfiguratorProjectPackage#getModel_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<configuratorProject.Object> getContains();

} // Model
