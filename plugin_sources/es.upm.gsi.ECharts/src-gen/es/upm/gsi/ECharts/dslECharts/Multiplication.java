/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Multiplication#getLeft <em>Left</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Multiplication#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMultiplication()
 * @model
 * @generated
 */
public interface Multiplication extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMultiplication_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Multiplication#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMultiplication_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Multiplication#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Multiplication
