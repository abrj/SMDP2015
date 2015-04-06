/**
 */
package configuratorProject.impl;

import configuratorProject.BooleanValue;
import configuratorProject.ConfiguratorProjectPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link configuratorProject.impl.BooleanValueImpl#getTrueValue <em>True Value</em>}</li>
 *   <li>{@link configuratorProject.impl.BooleanValueImpl#getFalseValue <em>False Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanValueImpl extends myValueImpl implements BooleanValue {
	/**
	 * The default value of the '{@link #getTrueValue() <em>True Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueValue()
	 * @generated
	 * @ordered
	 */
	protected static final String TRUE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrueValue() <em>True Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueValue()
	 * @generated
	 * @ordered
	 */
	protected String trueValue = TRUE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFalseValue() <em>False Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseValue()
	 * @generated
	 * @ordered
	 */
	protected static final String FALSE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFalseValue() <em>False Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseValue()
	 * @generated
	 * @ordered
	 */
	protected String falseValue = FALSE_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfiguratorProjectPackage.Literals.BOOLEAN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrueValue() {
		return trueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueValue(String newTrueValue) {
		String oldTrueValue = trueValue;
		trueValue = newTrueValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.BOOLEAN_VALUE__TRUE_VALUE, oldTrueValue, trueValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFalseValue() {
		return falseValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseValue(String newFalseValue) {
		String oldFalseValue = falseValue;
		falseValue = newFalseValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfiguratorProjectPackage.BOOLEAN_VALUE__FALSE_VALUE, oldFalseValue, falseValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfiguratorProjectPackage.BOOLEAN_VALUE__TRUE_VALUE:
				return getTrueValue();
			case ConfiguratorProjectPackage.BOOLEAN_VALUE__FALSE_VALUE:
				return getFalseValue();
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
			case ConfiguratorProjectPackage.BOOLEAN_VALUE__TRUE_VALUE:
				setTrueValue((String)newValue);
				return;
			case ConfiguratorProjectPackage.BOOLEAN_VALUE__FALSE_VALUE:
				setFalseValue((String)newValue);
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
			case ConfiguratorProjectPackage.BOOLEAN_VALUE__TRUE_VALUE:
				setTrueValue(TRUE_VALUE_EDEFAULT);
				return;
			case ConfiguratorProjectPackage.BOOLEAN_VALUE__FALSE_VALUE:
				setFalseValue(FALSE_VALUE_EDEFAULT);
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
			case ConfiguratorProjectPackage.BOOLEAN_VALUE__TRUE_VALUE:
				return TRUE_VALUE_EDEFAULT == null ? trueValue != null : !TRUE_VALUE_EDEFAULT.equals(trueValue);
			case ConfiguratorProjectPackage.BOOLEAN_VALUE__FALSE_VALUE:
				return FALSE_VALUE_EDEFAULT == null ? falseValue != null : !FALSE_VALUE_EDEFAULT.equals(falseValue);
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
		result.append(" (trueValue: ");
		result.append(trueValue);
		result.append(", falseValue: ");
		result.append(falseValue);
		result.append(')');
		return result.toString();
	}

} //BooleanValueImpl
