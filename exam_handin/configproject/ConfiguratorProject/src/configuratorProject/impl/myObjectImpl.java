/**
 */
package configuratorProject.impl;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myAttribute;
import configuratorProject.myConstraint;
import configuratorProject.myObject;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>my Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.myObjectImpl#getMyObjectHas <em>My Object Has</em>}</li>
 *   <li>{@link configuratorProject.impl.myObjectImpl#getMyAttributeContains <em>My Attribute Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class myObjectImpl extends myNamedElementImpl implements myObject {
	/**
	 * The cached value of the '{@link #getMyObjectHas() <em>My Object Has</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyObjectHas()
	 * @generated
	 * @ordered
	 */
	protected EList<myConstraint> myObjectHas;

	/**
	 * The cached value of the '{@link #getMyAttributeContains() <em>My Attribute Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAttributeContains()
	 * @generated
	 * @ordered
	 */
	protected EList<myAttribute> myAttributeContains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected myObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.MY_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<myConstraint> getMyObjectHas() {
		if (myObjectHas == null) {
			myObjectHas = new EObjectContainmentEList<myConstraint>(myConstraint.class, this, ConfiguratorProjectPackage.MY_OBJECT__MY_OBJECT_HAS);
		}
		return myObjectHas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<myAttribute> getMyAttributeContains() {
		if (myAttributeContains == null) {
			myAttributeContains = new EObjectContainmentEList<myAttribute>(myAttribute.class, this, ConfiguratorProjectPackage.MY_OBJECT__MY_ATTRIBUTE_CONTAINS);
		}
		return myAttributeContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_OBJECT__MY_OBJECT_HAS:
				return ((InternalEList<?>)getMyObjectHas()).basicRemove(otherEnd, msgs);
			case ConfiguratorProjectPackage.MY_OBJECT__MY_ATTRIBUTE_CONTAINS:
				return ((InternalEList<?>)getMyAttributeContains()).basicRemove(otherEnd, msgs);
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
			case ConfiguratorProjectPackage.MY_OBJECT__MY_OBJECT_HAS:
				return getMyObjectHas();
			case ConfiguratorProjectPackage.MY_OBJECT__MY_ATTRIBUTE_CONTAINS:
				return getMyAttributeContains();
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
			case ConfiguratorProjectPackage.MY_OBJECT__MY_OBJECT_HAS:
				getMyObjectHas().clear();
				getMyObjectHas().addAll((Collection<? extends myConstraint>)newValue);
				return;
			case ConfiguratorProjectPackage.MY_OBJECT__MY_ATTRIBUTE_CONTAINS:
				getMyAttributeContains().clear();
				getMyAttributeContains().addAll((Collection<? extends myAttribute>)newValue);
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
			case ConfiguratorProjectPackage.MY_OBJECT__MY_OBJECT_HAS:
				getMyObjectHas().clear();
				return;
			case ConfiguratorProjectPackage.MY_OBJECT__MY_ATTRIBUTE_CONTAINS:
				getMyAttributeContains().clear();
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
			case ConfiguratorProjectPackage.MY_OBJECT__MY_OBJECT_HAS:
				return myObjectHas != null && !myObjectHas.isEmpty();
			case ConfiguratorProjectPackage.MY_OBJECT__MY_ATTRIBUTE_CONTAINS:
				return myAttributeContains != null && !myAttributeContains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //myObjectImpl
