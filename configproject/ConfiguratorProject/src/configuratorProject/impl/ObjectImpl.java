/**
 */
package configuratorProject.impl;

import configuratorProject.Attribute;
import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.Constraint;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.ObjectImpl#getHas <em>Has</em>}</li>
 *   <li>{@link configuratorProject.impl.ObjectImpl#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends NamedElementImpl implements configuratorProject.Object {
	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> has;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getHas() {
		if (has == null) {
			has = new EObjectContainmentEList<Constraint>(Constraint.class, this, ConfiguratorProjectPackage.OBJECT__HAS);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Attribute>(Attribute.class, this, ConfiguratorProjectPackage.OBJECT__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorProjectPackage.OBJECT__HAS:
				return ((InternalEList<?>)getHas()).basicRemove(otherEnd, msgs);
			case ConfiguratorProjectPackage.OBJECT__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfiguratorProjectPackage.OBJECT__HAS:
				return getHas();
			case ConfiguratorProjectPackage.OBJECT__CONTAINS:
				return getContains();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfiguratorProjectPackage.OBJECT__HAS:
				getHas().clear();
				getHas().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ConfiguratorProjectPackage.OBJECT__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Attribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfiguratorProjectPackage.OBJECT__HAS:
				getHas().clear();
				return;
			case ConfiguratorProjectPackage.OBJECT__CONTAINS:
				getContains().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfiguratorProjectPackage.OBJECT__HAS:
				return has != null && !has.isEmpty();
			case ConfiguratorProjectPackage.OBJECT__CONTAINS:
				return contains != null && !contains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectImpl
