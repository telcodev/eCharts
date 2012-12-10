/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.SingleState#getFromTo <em>From To</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getSingleState()
 * @model
 * @generated
 */
public interface SingleState extends EObject
{
  /**
   * Returns the value of the '<em><b>From To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From To</em>' reference.
   * @see #setFromTo(States)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getSingleState_FromTo()
   * @model
   * @generated
   */
  States getFromTo();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.SingleState#getFromTo <em>From To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From To</em>' reference.
   * @see #getFromTo()
   * @generated
   */
  void setFromTo(States value);

} // SingleState
