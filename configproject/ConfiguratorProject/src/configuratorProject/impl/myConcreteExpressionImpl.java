/**
 */
package configuratorProject.impl;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myConcreteExpression;
import configuratorProject.myExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>my Concrete Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.myConcreteExpressionImpl#getMyConcreteEx <em>My Concrete Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class myConcreteExpressionImpl extends MinimalEObjectImpl.Container implements myConcreteExpression {
	/**
	 * The cached value of the '{@link #getMyConcreteEx() <em>My Concrete Ex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyConcreteEx()
	 * @generated
	 * @ordered
	 */
	protected myExpression myConcreteEx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected myConcreteExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.MY_CONCRETE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myExpression getMyConcreteEx() {
		return myConcreteEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyConcreteEx(myExpression newMyConcreteEx, NotificationChain msgs) {
		myExpression oldMyConcreteEx = myConcreteEx;
		myConcreteEx = newMyConcreteEx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX, oldMyConcreteEx, newMyConcreteEx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyConcreteEx(myExpression newMyConcreteEx) {
		if (newMyConcreteEx != myConcreteEx) {
			NotificationChain msgs = null;
			if (myConcreteEx != null)
				msgs = ((InternalEObject)myConcreteEx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX, null, msgs);
			if (newMyConcreteEx != null)
				msgs = ((InternalEObject)newMyConcreteEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX, null, msgs);
			msgs = basicSetMyConcreteEx(newMyConcreteEx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX, newMyConcreteEx, newMyConcreteEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX:
				return basicSetMyConcreteEx(null, msgs);
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
			case ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX:
				return getMyConcreteEx();
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
			case ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX:
				setMyConcreteEx((myExpression)newValue);
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
			case ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX:
				setMyConcreteEx((myExpression)null);
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
			case ConfiguratorProjectPackage.MY_CONCRETE_EXPRESSION__MY_CONCRETE_EX:
				return myConcreteEx != null;
		}
		return super.eIsSet(featureID);
	}

} //myConcreteExpressionImpl
