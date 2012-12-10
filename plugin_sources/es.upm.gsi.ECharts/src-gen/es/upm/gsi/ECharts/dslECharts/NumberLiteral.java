/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getValueINT <em>Value INT</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getValueID <em>Value ID</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getRefValue <em>Ref Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getNumberLiteral()
 * @model
 * @generated
 */
public interface NumberLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Value INT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value INT</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value INT</em>' attribute.
   * @see #setValueINT(int)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getNumberLiteral_ValueINT()
   * @model
   * @generated
   */
  int getValueINT();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getValueINT <em>Value INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value INT</em>' attribute.
   * @see #getValueINT()
   * @generated
   */
  void setValueINT(int value);

  /**
   * Returns the value of the '<em><b>Value ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value ID</em>' attribute.
   * @see #setValueID(String)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getNumberLiteral_ValueID()
   * @model
   * @generated
   */
  String getValueID();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getValueID <em>Value ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value ID</em>' attribute.
   * @see #getValueID()
   * @generated
   */
  void setValueID(String value);

  /**
   * Returns the value of the '<em><b>Ref Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Value</em>' reference.
   * @see #setRefValue(Expression)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getNumberLiteral_RefValue()
   * @model
   * @generated
   */
  Expression getRefValue();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getRefValue <em>Ref Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Value</em>' reference.
   * @see #getRefValue()
   * @generated
   */
  void setRefValue(Expression value);

} // NumberLiteral
