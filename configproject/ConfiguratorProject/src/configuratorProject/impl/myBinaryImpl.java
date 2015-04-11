/**
 */
package configuratorProject.impl;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myBinary;
import configuratorProject.myBinaryOparators;
import configuratorProject.myConcreteExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>my Binary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.myBinaryImpl#getOparand <em>Oparand</em>}</li>
 *   <li>{@link configuratorProject.impl.myBinaryImpl#getMyBinaryLeft <em>My Binary Left</em>}</li>
 *   <li>{@link configuratorProject.impl.myBinaryImpl#getMyBinaryRight <em>My Binary Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class myBinaryImpl extends myExpressionImpl implements myBinary {
	/**
	 * The default value of the '{@link #getOparand() <em>Oparand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOparand()
	 * @generated
	 * @ordered
	 */
	protected static final myBinaryOparators OPARAND_EDEFAULT = myBinaryOparators.IF;

	/**
	 * The cached value of the '{@link #getOparand() <em>Oparand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOparand()
	 * @generated
	 * @ordered
	 */
	protected myBinaryOparators oparand = OPARAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMyBinaryLeft() <em>My Binary Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyBinaryLeft()
	 * @generated
	 * @ordered
	 */
	protected myConcreteExpression myBinaryLeft;

	/**
	 * The cached value of the '{@link #getMyBinaryRight() <em>My Binary Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyBinaryRight()
	 * @generated
	 * @ordered
	 */
	protected myConcreteExpression myBinaryRight;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected myBinaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.MY_BINARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myBinaryOparators getOparand() {
		return oparand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOparand(myBinaryOparators newOparand) {
		myBinaryOparators oldOparand = oparand;
		oparand = newOparand == null ? OPARAND_EDEFAULT : newOparand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_BINARY__OPARAND, oldOparand, oparand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myConcreteExpression getMyBinaryLeft() {
		return myBinaryLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyBinaryLeft(myConcreteExpression newMyBinaryLeft, NotificationChain msgs) {
		myConcreteExpression oldMyBinaryLeft = myBinaryLeft;
		myBinaryLeft = newMyBinaryLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT, oldMyBinaryLeft, newMyBinaryLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyBinaryLeft(myConcreteExpression newMyBinaryLeft) {
		if (newMyBinaryLeft != myBinaryLeft) {
			NotificationChain msgs = null;
			if (myBinaryLeft != null)
				msgs = ((InternalEObject)myBinaryLeft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT, null, msgs);
			if (newMyBinaryLeft != null)
				msgs = ((InternalEObject)newMyBinaryLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT, null, msgs);
			msgs = basicSetMyBinaryLeft(newMyBinaryLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT, newMyBinaryLeft, newMyBinaryLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myConcreteExpression getMyBinaryRight() {
		return myBinaryRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyBinaryRight(myConcreteExpression newMyBinaryRight, NotificationChain msgs) {
		myConcreteExpression oldMyBinaryRight = myBinaryRight;
		myBinaryRight = newMyBinaryRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT, oldMyBinaryRight, newMyBinaryRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyBinaryRight(myConcreteExpression newMyBinaryRight) {
		if (newMyBinaryRight != myBinaryRight) {
			NotificationChain msgs = null;
			if (myBinaryRight != null)
				msgs = ((InternalEObject)myBinaryRight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT, null, msgs);
			if (newMyBinaryRight != null)
				msgs = ((InternalEObject)newMyBinaryRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT, null, msgs);
			msgs = basicSetMyBinaryRight(newMyBinaryRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT, newMyBinaryRight, newMyBinaryRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT:
				return basicSetMyBinaryLeft(null, msgs);
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT:
				return basicSetMyBinaryRight(null, msgs);
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
			case ConfiguratorProjectPackage.MY_BINARY__OPARAND:
				return getOparand();
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT:
				return getMyBinaryLeft();
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT:
				return getMyBinaryRight();
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
			case ConfiguratorProjectPackage.MY_BINARY__OPARAND:
				setOparand((myBinaryOparators)newValue);
				return;
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT:
				setMyBinaryLeft((myConcreteExpression)newValue);
				return;
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT:
				setMyBinaryRight((myConcreteExpression)newValue);
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
			case ConfiguratorProjectPackage.MY_BINARY__OPARAND:
				setOparand(OPARAND_EDEFAULT);
				return;
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT:
				setMyBinaryLeft((myConcreteExpression)null);
				return;
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT:
				setMyBinaryRight((myConcreteExpression)null);
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
			case ConfiguratorProjectPackage.MY_BINARY__OPARAND:
				return oparand != OPARAND_EDEFAULT;
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_LEFT:
				return myBinaryLeft != null;
			case ConfiguratorProjectPackage.MY_BINARY__MY_BINARY_RIGHT:
				return myBinaryRight != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Oparand: ");
		result.append(oparand);
		result.append(')');
		return result.toString();
	}

} //myBinaryImpl
