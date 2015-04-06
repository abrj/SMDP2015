/**
 */
package configuratorProject.impl;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myAttribute;
import configuratorProject.myValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>my Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.myAttributeImpl#getMyAttributeContains <em>My Attribute Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class myAttributeImpl extends myNamedElementImpl implements myAttribute {
	/**
	 * The cached value of the '{@link #getMyAttributeContains() <em>My Attribute Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyAttributeContains()
	 * @generated
	 * @ordered
	 */
	protected myValue myAttributeContains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected myAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.MY_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myValue getMyAttributeContains() {
		return myAttributeContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyAttributeContains(myValue newMyAttributeContains, NotificationChain msgs) {
		myValue oldMyAttributeContains = myAttributeContains;
		myAttributeContains = newMyAttributeContains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS, oldMyAttributeContains, newMyAttributeContains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyAttributeContains(myValue newMyAttributeContains) {
		if (newMyAttributeContains != myAttributeContains) {
			NotificationChain msgs = null;
			if (myAttributeContains != null)
				msgs = ((InternalEObject)myAttributeContains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS, null, msgs);
			if (newMyAttributeContains != null)
				msgs = ((InternalEObject)newMyAttributeContains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS, null, msgs);
			msgs = basicSetMyAttributeContains(newMyAttributeContains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS, newMyAttributeContains, newMyAttributeContains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS:
				return basicSetMyAttributeContains(null, msgs);
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
			case ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS:
				return getMyAttributeContains();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS:
				setMyAttributeContains((myValue)newValue);
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
			case ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS:
				setMyAttributeContains((myValue)null);
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
			case ConfiguratorProjectPackage.MY_ATTRIBUTE__MY_ATTRIBUTE_CONTAINS:
				return myAttributeContains != null;
		}
		return super.eIsSet(featureID);
	}

} //myAttributeImpl
