/**
 */
package configuratorProject;

import java.lang.Object;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link configuratorProject.Range#getRange <em>Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see configuratorProject.ConfiguratorProjectPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends Value {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(Object)
	 * @see configuratorProject.ConfiguratorProjectPackage#getRange_Range()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
	 * @generated
	 */
	Object getRange();

	/**
	 * Sets the value of the '{@link configuratorProject.Range#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Object value);

} // Range
