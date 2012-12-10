/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Machine#getAccessAndMachineModifier <em>Access And Machine Modifier</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Machine#getName <em>Name</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.Machine#getMachineBody <em>Machine Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject
{
  /**
   * Returns the value of the '<em><b>Access And Machine Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access And Machine Modifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access And Machine Modifier</em>' containment reference.
   * @see #setAccessAndMachineModifier(AccessAndMachineModifiers)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachine_AccessAndMachineModifier()
   * @model containment="true"
   * @generated
   */
  AccessAndMachineModifiers getAccessAndMachineModifier();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Machine#getAccessAndMachineModifier <em>Access And Machine Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access And Machine Modifier</em>' containment reference.
   * @see #getAccessAndMachineModifier()
   * @generated
   */
  void setAccessAndMachineModifier(AccessAndMachineModifiers value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Machine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachine_MachineBody()
   * @model containment="true"
   * @generated
   */
  MachineBody getMachineBody();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.Machine#getMachineBody <em>Machine Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine Body</em>' containment reference.
   * @see #getMachineBody()
   * @generated
   */
  void setMachineBody(MachineBody value);

} // Machine
