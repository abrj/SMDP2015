/**
 */
package configuratorProject.impl;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myConcreteExpression;
import configuratorProject.myConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>my Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.myConstraintImpl#getMyIfConstraint <em>My If Constraint</em>}</li>
 *   <li>{@link configuratorProject.impl.myConstraintImpl#getMyThenConstraint <em>My Then Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class myConstraintImpl extends MinimalEObjectImpl.Container implements myConstraint {
	/**
	 * The cached value of the '{@link #getMyIfConstraint() <em>My If Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyIfConstraint()
	 * @generated
	 * @ordered
	 */
	protected myConcreteExpression myIfConstraint;

	/**
	 * The cached value of the '{@link #getMyThenConstraint() <em>My Then Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyThenConstraint()
	 * @generated
	 * @ordered
	 */
	protected myConcreteExpression myThenConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected myConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.MY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myConcreteExpression getMyIfConstraint() {
		return myIfConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyIfConstraint(myConcreteExpression newMyIfConstraint, NotificationChain msgs) {
		myConcreteExpression oldMyIfConstraint = myIfConstraint;
		myIfConstraint = newMyIfConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT, oldMyIfConstraint, newMyIfConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyIfConstraint(myConcreteExpression newMyIfConstraint) {
		if (newMyIfConstraint != myIfConstraint) {
			NotificationChain msgs = null;
			if (myIfConstraint != null)
				msgs = ((InternalEObject)myIfConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT, null, msgs);
			if (newMyIfConstraint != null)
				msgs = ((InternalEObject)newMyIfConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT, null, msgs);
			msgs = basicSetMyIfConstraint(newMyIfConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT, newMyIfConstraint, newMyIfConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public myConcreteExpression getMyThenConstraint() {
		return myThenConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyThenConstraint(myConcreteExpression newMyThenConstraint, NotificationChain msgs) {
		myConcreteExpression oldMyThenConstraint = myThenConstraint;
		myThenConstraint = newMyThenConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT, oldMyThenConstraint, newMyThenConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyThenConstraint(myConcreteExpression newMyThenConstraint) {
		if (newMyThenConstraint != myThenConstraint) {
			NotificationChain msgs = null;
			if (myThenConstraint != null)
				msgs = ((InternalEObject)myThenConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT, null, msgs);
			if (newMyThenConstraint != null)
				msgs = ((InternalEObject)newMyThenConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT, null, msgs);
			msgs = basicSetMyThenConstraint(newMyThenConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT, newMyThenConstraint, newMyThenConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT:
				return basicSetMyIfConstraint(null, msgs);
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT:
				return basicSetMyThenConstraint(null, msgs);
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT:
				return getMyIfConstraint();
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT:
				return getMyThenConstraint();
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT:
				setMyIfConstraint((myConcreteExpression)newValue);
				return;
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT:
				setMyThenConstraint((myConcreteExpression)newValue);
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT:
				setMyIfConstraint((myConcreteExpression)null);
				return;
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT:
				setMyThenConstraint((myConcreteExpression)null);
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_IF_CONSTRAINT:
				return myIfConstraint != null;
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_THEN_CONSTRAINT:
				return myThenConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //myConstraintImpl
