/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.ListStates#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getListStates()
 * @model
 * @generated
 */
public interface ListStates extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference list.
   * The list contents are of type {@link es.upm.gsi.ECharts.dslECharts.SingleState}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference list.
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getListStates_List()
   * @model containment="true"
   * @generated
   */
  EList<SingleState> getList();

} // ListStates
