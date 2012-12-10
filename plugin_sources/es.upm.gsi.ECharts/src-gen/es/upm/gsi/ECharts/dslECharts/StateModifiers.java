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
 * A representation of the literals of the enumeration '<em><b>State Modifiers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getStateModifiers()
 * @model
 * @generated
 */
public enum StateModifiers implements Enumerator
{
  /**
   * The '<em><b>INITIAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INITIAL_VALUE
   * @generated
   * @ordered
   */
  INITIAL(0, "INITIAL", "initial"),

  /**
   * The '<em><b>NONTERMINAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONTERMINAL_VALUE
   * @generated
   * @ordered
   */
  NONTERMINAL(1, "NONTERMINAL", "nonterminal"),

  /**
   * The '<em><b>CONCURRENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONCURRENT_VALUE
   * @generated
   * @ordered
   */
  CONCURRENT(2, "CONCURRENT", "concurent");

  /**
   * The '<em><b>INITIAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INITIAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INITIAL
   * @model literal="initial"
   * @generated
   * @ordered
   */
  public static final int INITIAL_VALUE = 0;

  /**
   * The '<em><b>NONTERMINAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONTERMINAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONTERMINAL
   * @model literal="nonterminal"
   * @generated
   * @ordered
   */
  public static final int NONTERMINAL_VALUE = 1;

  /**
   * The '<em><b>CONCURRENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONCURRENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONCURRENT
   * @model literal="concurent"
   * @generated
   * @ordered
   */
  public static final int CONCURRENT_VALUE = 2;

  /**
   * An array of all the '<em><b>State Modifiers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final StateModifiers[] VALUES_ARRAY =
    new StateModifiers[]
    {
      INITIAL,
      NONTERMINAL,
      CONCURRENT,
    };

  /**
   * A public read-only list of all the '<em><b>State Modifiers</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<StateModifiers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>State Modifiers</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StateModifiers get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StateModifiers result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>State Modifiers</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StateModifiers getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StateModifiers result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>State Modifiers</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static StateModifiers get(int value)
  {
    switch (value)
    {
      case INITIAL_VALUE: return INITIAL;
      case NONTERMINAL_VALUE: return NONTERMINAL;
      case CONCURRENT_VALUE: return CONCURRENT;
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
  private StateModifiers(int value, String name, String literal)
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
  
} //StateModifiers
