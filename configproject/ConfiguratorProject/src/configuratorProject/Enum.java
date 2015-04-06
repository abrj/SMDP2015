/**
 */
package configuratorProject;

import java.lang.Object;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Enum#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Value {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see configuratorProject.ConfiguratorProjectPackage#getEnum_Values()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	EList<Object> getValues();

} // Enum
