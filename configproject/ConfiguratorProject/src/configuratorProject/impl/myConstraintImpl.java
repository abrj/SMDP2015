/**
 */
package configuratorProject.impl;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myConstraint;
import configuratorProject.myExpression;

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
 *   <li>{@link configuratorProject.impl.myConstraintImpl#getMyConstraintContains <em>My Constraint Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class myConstraintImpl extends MinimalEObjectImpl.Container implements myConstraint {
	/**
	 * The cached value of the '{@link #getMyConstraintContains() <em>My Constraint Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyConstraintContains()
	 * @generated
	 * @ordered
	 */
	protected myExpression myConstraintContains;

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
	public myExpression getMyConstraintContains() {
		return myConstraintContains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMyConstraintContains(myExpression newMyConstraintContains, NotificationChain msgs) {
		myExpression oldMyConstraintContains = myConstraintContains;
		myConstraintContains = newMyConstraintContains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS, oldMyConstraintContains, newMyConstraintContains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMyConstraintContains(myExpression newMyConstraintContains) {
		if (newMyConstraintContains != myConstraintContains) {
			NotificationChain msgs = null;
			if (myConstraintContains != null)
				msgs = ((InternalEObject)myConstraintContains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS, null, msgs);
			if (newMyConstraintContains != null)
				msgs = ((InternalEObject)newMyConstraintContains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS, null, msgs);
			msgs = basicSetMyConstraintContains(newMyConstraintContains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS, newMyConstraintContains, newMyConstraintContains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS:
				return basicSetMyConstraintContains(null, msgs);
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS:
				return getMyConstraintContains();
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS:
				setMyConstraintContains((myExpression)newValue);
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS:
				setMyConstraintContains((myExpression)null);
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
			case ConfiguratorProjectPackage.MY_CONSTRAINT__MY_CONSTRAINT_CONTAINS:
				return myConstraintContains != null;
		}
		return super.eIsSet(featureID);
	}

} //myConstraintImpl
