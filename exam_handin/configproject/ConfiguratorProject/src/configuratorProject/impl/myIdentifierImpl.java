/**
 */
package configuratorProject.impl;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myAttribute;
import configuratorProject.myIdentifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>my Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.myIdentifierImpl#getMyIntentifierIs <em>My Intentifier Is</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class myIdentifierImpl extends myExpressionImpl implements myIdentifier {
	/**
	 * The cached value of the '{@link #getMyIntentifierIs() <em>My Intentifier Is</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyIntentifierIs()
	 * @generated
	 * @ordered
	 */
	protected myAttribute myIntentifierIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected myIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.MY_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myAttribute getMyIntentifierIs() {
		if (myIntentifierIs != null && myIntentifierIs.eIsProxy()) {
			InternalEObject oldMyIntentifierIs = (InternalEObject)myIntentifierIs;
			myIntentifierIs = (myAttribute)eResolveProxy(oldMyIntentifierIs);
			if (myIntentifierIs != oldMyIntentifierIs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfiguratorProjectPackage.MY_IDENTIFIER__MY_INTENTIFIER_IS, oldMyIntentifierIs, myIntentifierIs));
			}
		}
		return myIntentifierIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myAttribute basicGetMyIntentifierIs() {
		return myIntentifierIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyIntentifierIs(myAttribute newMyIntentifierIs) {
		myAttribute oldMyIntentifierIs = myIntentifierIs;
		myIntentifierIs = newMyIntentifierIs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_IDENTIFIER__MY_INTENTIFIER_IS, oldMyIntentifierIs, myIntentifierIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_IDENTIFIER__MY_INTENTIFIER_IS:
				if (resolve) return getMyIntentifierIs();
				return basicGetMyIntentifierIs();
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
			case ConfiguratorProjectPackage.MY_IDENTIFIER__MY_INTENTIFIER_IS:
				setMyIntentifierIs((myAttribute)newValue);
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
			case ConfiguratorProjectPackage.MY_IDENTIFIER__MY_INTENTIFIER_IS:
				setMyIntentifierIs((myAttribute)null);
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
			case ConfiguratorProjectPackage.MY_IDENTIFIER__MY_INTENTIFIER_IS:
				return myIntentifierIs != null;
		}
		return super.eIsSet(featureID);
	}

} //myIdentifierImpl
