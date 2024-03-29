/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Access Modifiers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getAccessModifiers()
 * @model
 * @generated
 */
public enum AccessModifiers implements Enumerator
{
  /**
   * The '<em><b>PRIVATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRIVATE_VALUE
   * @generated
   * @ordered
   */
  PRIVATE(0, "PRIVATE", "private"),

  /**
   * The '<em><b>PUBLIC</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PUBLIC_VALUE
   * @generated
   * @ordered
   */
  PUBLIC(1, "PUBLIC", "public"),

  /**
   * The '<em><b>PROTECTED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROTECTED_VALUE
   * @generated
   * @ordered
   */
  PROTECTED(2, "PROTECTED", "protected"),

  /**
   * The '<em><b>FINAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FINAL_VALUE
   * @generated
   * @ordered
   */
  FINAL(3, "FINAL", "final"),

  /**
   * The '<em><b>ABSTRACT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABSTRACT_VALUE
   * @generated
   * @ordered
   */
  ABSTRACT(4, "ABSTRACT", "abstract");

  /**
   * The '<em><b>PRIVATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRIVATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRIVATE
   * @model literal="private"
   * @generated
   * @ordered
   */
  public static final int PRIVATE_VALUE = 0;

  /**
   * The '<em><b>PUBLIC</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PUBLIC</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PUBLIC
   * @model literal="public"
   * @generated
   * @ordered
   */
  public static final int PUBLIC_VALUE = 1;

  /**
   * The '<em><b>PROTECTED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROTECTED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROTECTED
   * @model literal="protected"
   * @generated
   * @ordered
   */
  public static final int PROTECTED_VALUE = 2;

  /**
   * The '<em><b>FINAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FINAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FINAL
   * @model literal="final"
   * @generated
   * @ordered
   */
  public static final int FINAL_VALUE = 3;

  /**
   * The '<em><b>ABSTRACT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ABSTRACT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABSTRACT
   * @model literal="abstract"
   * @generated
   * @ordered
   */
  public static final int ABSTRACT_VALUE = 4;

  /**
   * An array of all the '<em><b>Access Modifiers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AccessModifiers[] VALUES_ARRAY =
    new AccessModifiers[]
    {
      PRIVATE,
      PUBLIC,
      PROTECTED,
      FINAL,
      ABSTRACT,
    };

  /**
   * A public read-only list of all the '<em><b>Access Modifiers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AccessModifiers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Access Modifiers</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AccessModifiers get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AccessModifiers result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Access Modifiers</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AccessModifiers getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AccessModifiers result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Access Modifiers</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AccessModifiers get(int value)
  {
    switch (value)
    {
      case PRIVATE_VALUE: return PRIVATE;
      case PUBLIC_VALUE: return PUBLIC;
      case PROTECTED_VALUE: return PROTECTED;
      case FINAL_VALUE: return FINAL;
      case ABSTRACT_VALUE: return ABSTRACT;
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
  private AccessModifiers(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //AccessModifiers
