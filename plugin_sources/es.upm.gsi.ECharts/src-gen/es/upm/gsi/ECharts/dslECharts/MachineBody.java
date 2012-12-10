/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getHostBlock <em>Host Block</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getMachineConstructor <em>Machine Constructor</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getStates <em>States</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineBody()
 * @model
 * @generated
 */
public interface MachineBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Host Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Host Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Host Block</em>' containment reference.
   * @see #setHostBlock(HostBlock)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineBody_HostBlock()
   * @model containment="true"
   * @generated
   */
  HostBlock getHostBlock();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getHostBlock <em>Host Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Host Block</em>' containment reference.
   * @see #getHostBlock()
   * @generated
   */
  void setHostBlock(HostBlock value);

  /**
   * Returns the value of the '<em><b>Machine Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine Constructor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine Constructor</em>' containment reference.
   * @see #setMachineConstructor(MachineConstructor)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineBody_MachineConstructor()
   * @model containment="true"
   * @generated
   */
  MachineConstructor getMachineConstructor();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getMachineConstructor <em>Machine Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine Constructor</em>' containment reference.
   * @see #getMachineConstructor()
   * @generated
   */
  void setMachineConstructor(MachineConstructor value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference.
   * @see #setStates(States)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineBody_States()
   * @model containment="true"
   * @generated
   */
  States getStates();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getStates <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>States</em>' containment reference.
   * @see #getStates()
   * @generated
   */
  void setStates(States value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference.
   * @see #setTransition(Transition)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineBody_Transition()
   * @model containment="true"
   * @generated
   */
  Transition getTransition();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getTransition <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transition</em>' containment reference.
   * @see #getTransition()
   * @generated
   */
  void setTransition(Transition value);

} // MachineBody
