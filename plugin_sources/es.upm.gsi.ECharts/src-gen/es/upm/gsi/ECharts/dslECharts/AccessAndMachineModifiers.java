/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access And Machine Modifiers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers#getMachineModifier <em>Machine Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getAccessAndMachineModifiers()
 * @model
 * @generated
 */
public interface AccessAndMachineModifiers extends EObject
{
  /**
   * Returns the value of the '<em><b>Access Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link es.upm.gsi.ECharts.dslECharts.AccessModifiers}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Modifier</em>' attribute.
   * @see es.upm.gsi.ECharts.dslECharts.AccessModifiers
   * @see #setAccessModifier(AccessModifiers)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getAccessAndMachineModifiers_AccessModifier()
   * @model
   * @generated
   */
  AccessModifiers getAccessModifier();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers#getAccessModifier <em>Access Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Modifier</em>' attribute.
   * @see es.upm.gsi.ECharts.dslECharts.AccessModifiers
   * @see #getAccessModifier()
   * @generated
   */
  void setAccessModifier(AccessModifiers value);

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
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getAccessAndMachineModifiers_MachineModifier()
   * @model containment="true"
   * @generated
   */
  MachineModifier getMachineModifier();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers#getMachineModifier <em>Machine Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine Modifier</em>' containment reference.
   * @see #getMachineModifier()
   * @generated
   */
  void setMachineModifier(MachineModifier value);

} // AccessAndMachineModifiers
