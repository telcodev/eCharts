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
 * A representation of the model object '<em><b>params Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.paramsDeclaration#getParamtype <em>Paramtype</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.paramsDeclaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getparamsDeclaration()
 * @model
 * @generated
 */
public interface paramsDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Paramtype</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paramtype</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paramtype</em>' attribute list.
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getparamsDeclaration_Paramtype()
   * @model unique="false"
   * @generated
   */
  EList<String> getParamtype();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getparamsDeclaration_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

} // paramsDeclaration
