/**
 */
package configuratorProject.impl;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myConcreteExpression;
import configuratorProject.myUnary;
import configuratorProject.myUnaryOparators;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>my Unary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.myUnaryImpl#getOparand <em>Oparand</em>}</li>
 *   <li>{@link configuratorProject.impl.myUnaryImpl#getMyUnaryExpression <em>My Unary Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class myUnaryImpl extends myExpressionImpl implements myUnary {
	/**
	 * The default value of the '{@link #getOparand() <em>Oparand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOparand()
	 * @generated
	 * @ordered
	 */
	protected static final myUnaryOparators OPARAND_EDEFAULT = myUnaryOparators.NOT;

	/**
	 * The cached value of the '{@link #getOparand() <em>Oparand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOparand()
	 * @generated
	 * @ordered
	 */
	protected myUnaryOparators oparand = OPARAND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMyUnaryExpression() <em>My Unary Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyUnaryExpression()
	 * @generated
	 * @ordered
	 */
	protected myConcreteExpression myUnaryExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected myUnaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.MY_UNARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myUnaryOparators getOparand() {
		return oparand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOparand(myUnaryOparators newOparand) {
		myUnaryOparators oldOparand = oparand;
		oparand = newOparand == null ? OPARAND_EDEFAULT : newOparand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_UNARY__OPARAND, oldOparand, oparand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myConcreteExpression getMyUnaryExpression() {
		return myUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyUnaryExpression(myConcreteExpression newMyUnaryExpression, NotificationChain msgs) {
		myConcreteExpression oldMyUnaryExpression = myUnaryExpression;
		myUnaryExpression = newMyUnaryExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION, oldMyUnaryExpression, newMyUnaryExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyUnaryExpression(myConcreteExpression newMyUnaryExpression) {
		if (newMyUnaryExpression != myUnaryExpression) {
			NotificationChain msgs = null;
			if (myUnaryExpression != null)
				msgs = ((InternalEObject)myUnaryExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION, null, msgs);
			if (newMyUnaryExpression != null)
				msgs = ((InternalEObject)newMyUnaryExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION, null, msgs);
			msgs = basicSetMyUnaryExpression(newMyUnaryExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION, newMyUnaryExpression, newMyUnaryExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION:
				return basicSetMyUnaryExpression(null, msgs);
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
			case ConfiguratorProjectPackage.MY_UNARY__OPARAND:
				return getOparand();
			case ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION:
				return getMyUnaryExpression();
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
			case ConfiguratorProjectPackage.MY_UNARY__OPARAND:
				setOparand((myUnaryOparators)newValue);
				return;
			case ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION:
				setMyUnaryExpression((myConcreteExpression)newValue);
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
			case ConfiguratorProjectPackage.MY_UNARY__OPARAND:
				setOparand(OPARAND_EDEFAULT);
				return;
			case ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION:
				setMyUnaryExpression((myConcreteExpression)null);
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
			case ConfiguratorProjectPackage.MY_UNARY__OPARAND:
				return oparand != OPARAND_EDEFAULT;
			case ConfiguratorProjectPackage.MY_UNARY__MY_UNARY_EXPRESSION:
				return myUnaryExpression != null;
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

} //myUnaryImpl
