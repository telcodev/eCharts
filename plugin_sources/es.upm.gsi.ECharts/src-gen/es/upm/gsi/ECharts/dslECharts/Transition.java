/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Transition#getAt <em>At</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Transition#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' containment reference.
   * @see #setFrom(TargetTrn)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getTransition_From()
   * @model containment="true"
   * @generated
   */
  TargetTrn getFrom();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Transition#getFrom <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' containment reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(TargetTrn value);

  /**
   * Returns the value of the '<em><b>At</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At</em>' attribute.
   * @see #setAt(String)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getTransition_At()
   * @model
   * @generated
   */
  String getAt();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Transition#getAt <em>At</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At</em>' attribute.
   * @see #getAt()
   * @generated
   */
  void setAt(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(TargetTrn)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getTransition_To()
   * @model containment="true"
   * @generated
   */
  TargetTrn getTo();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Transition#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(TargetTrn value);

} // Transition
