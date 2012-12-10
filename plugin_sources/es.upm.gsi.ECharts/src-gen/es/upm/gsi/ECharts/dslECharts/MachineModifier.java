/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.MachineModifier#getConcurrent <em>Concurrent</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineModifier()
 * @model
 * @generated
 */
public interface MachineModifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Concurrent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concurrent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concurrent</em>' attribute.
   * @see #setConcurrent(String)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineModifier_Concurrent()
   * @model
   * @generated
   */
  String getConcurrent();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.MachineModifier#getConcurrent <em>Concurrent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concurrent</em>' attribute.
   * @see #getConcurrent()
   * @generated
   */
  void setConcurrent(String value);

} // MachineModifier
