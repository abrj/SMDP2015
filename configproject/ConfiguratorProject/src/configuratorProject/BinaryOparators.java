/**
 */
package configuratorProject;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Binary Oparators</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see configuratorProject.ConfiguratorProjectPackage#getBinaryOparators()
 * @model
 * @generated
 */
public enum BinaryOparators implements Enumerator {
	/**
	 * The '<em><b>And</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(0, "and", "and"),

	/**
	 * The '<em><b>Or</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(1, "or", "or"),

	/**
	 * The '<em><b>Gt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(2, "gt", "gt"),

	/**
	 * The '<em><b>Lt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(3, "lt", "lt"),

	/**
	 * The '<em><b>Eq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(4, "eq", "eq"),

	/**
	 * The '<em><b>Is</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_VALUE
	 * @generated
	 * @ordered
	 */
	IS(5, "is", "is"),

	/**
	 * The '<em><b>If</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IF_VALUE
	 * @generated
	 * @ordered
	 */
	IF(6, "if", "if"),

	/**
	 * The '<em><b>Then</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THEN_VALUE
	 * @generated
	 * @ordered
	 */
	THEN(7, "then", "then");

	/**
	 * The '<em><b>And</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>And</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model name="and"
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 0;

	/**
	 * The '<em><b>Or</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Or</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model name="or"
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 1;

	/**
	 * The '<em><b>Gt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model name="gt"
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 2;

	/**
	 * The '<em><b>Lt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model name="lt"
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 3;

	/**
	 * The '<em><b>Eq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model name="eq"
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 4;

	/**
	 * The '<em><b>Is</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Is</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS
	 * @model name="is"
	 * @generated
	 * @ordered
	 */
	public static final int IS_VALUE = 5;

	/**
	 * The '<em><b>If</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>If</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IF
	 * @model name="if"
	 * @generated
	 * @ordered
	 */
	public static final int IF_VALUE = 6;

	/**
	 * The '<em><b>Then</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Then</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THEN
	 * @model name="then"
	 * @generated
	 * @ordered
	 */
	public static final int THEN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Binary Oparators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BinaryOparators[] VALUES_ARRAY =
		new BinaryOparators[] {
			AND,
			OR,
			GT,
			LT,
			EQ,
			IS,
			IF,
			THEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Binary Oparators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BinaryOparators> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Binary Oparators</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryOparators get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryOparators result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Oparators</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryOparators getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BinaryOparators result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Binary Oparators</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BinaryOparators get(int value) {
		switch (value) {
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
			case GT_VALUE: return GT;
			case LT_VALUE: return LT;
			case EQ_VALUE: return EQ;
			case IS_VALUE: return IS;
			case IF_VALUE: return IF;
			case THEN_VALUE: return THEN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BinaryOparators(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BinaryOparators
