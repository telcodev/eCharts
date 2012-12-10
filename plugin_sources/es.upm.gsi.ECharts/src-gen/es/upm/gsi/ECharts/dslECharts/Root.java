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
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Root#getPackage <em>Package</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Root#getImports <em>Imports</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Root#getMachine <em>Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' containment reference.
   * @see #setPackage(es.upm.gsi.ECharts.dslECharts.Package)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getRoot_Package()
   * @model containment="true"
   * @generated
   */
  es.upm.gsi.ECharts.dslECharts.Package getPackage();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Root#getPackage <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' containment reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(es.upm.gsi.ECharts.dslECharts.Package value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link es.upm.gsi.ECharts.dslECharts.Imports}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getRoot_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Imports> getImports();

  /**
   * Returns the value of the '<em><b>Machine</b></em>' containment reference list.
   * The list contents are of type {@link es.upm.gsi.ECharts.dslECharts.Machine}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine</em>' containment reference list.
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getRoot_Machine()
   * @model containment="true"
   * @generated
   */
  EList<Machine> getMachine();

} // Root
