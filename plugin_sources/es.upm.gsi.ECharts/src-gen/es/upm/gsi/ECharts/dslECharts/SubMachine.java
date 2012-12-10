/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.SubMachine#getMachineModifier <em>Machine Modifier</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.SubMachine#getMachineBody <em>Machine Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getSubMachine()
 * @model
 * @generated
 */
public interface SubMachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Machine Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine Modifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine Modifier</em>' containment reference.
   * @see #setMachineModifier(MachineModifier)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getSubMachine_MachineModifier()
   * @model containment="true"
   * @generated
   */
  MachineModifier getMachineModifier();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.SubMachine#getMachineModifier <em>Machine Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine Modifier</em>' containment reference.
   * @see #getMachineModifier()
   * @generated
   */
  void setMachineModifier(MachineModifier value);

  /**
   * Returns the value of the '<em><b>Machine Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine Body</em>' containment reference.
   * @see #setMachineBody(MachineBody)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getSubMachine_MachineBody()
   * @model containment="true"
   * @generated
   */
  MachineBody getMachineBody();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.SubMachine#getMachineBody <em>Machine Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine Body</em>' containment reference.
   * @see #getMachineBody()
   * @generated
   */
  void setMachineBody(MachineBody value);

} // SubMachine
