/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Trn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.TargetTrn#getFromTo <em>From To</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.TargetTrn#getFromToList <em>From To List</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getTargetTrn()
 * @model
 * @generated
 */
public interface TargetTrn extends EObject
{
  /**
   * Returns the value of the '<em><b>From To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From To</em>' containment reference.
   * @see #setFromTo(SingleState)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getTargetTrn_FromTo()
   * @model containment="true"
   * @generated
   */
  SingleState getFromTo();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.TargetTrn#getFromTo <em>From To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From To</em>' containment reference.
   * @see #getFromTo()
   * @generated
   */
  void setFromTo(SingleState value);

  /**
   * Returns the value of the '<em><b>From To List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From To List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From To List</em>' containment reference.
   * @see #setFromToList(ListStates)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getTargetTrn_FromToList()
   * @model containment="true"
   * @generated
   */
  ListStates getFromToList();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.TargetTrn#getFromToList <em>From To List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From To List</em>' containment reference.
   * @see #getFromToList()
   * @generated
   */
  void setFromToList(ListStates value);

} // TargetTrn
