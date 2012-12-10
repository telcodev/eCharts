/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.States#getStateMods <em>State Mods</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.States#getName <em>Name</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.States#getEn <em>En</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.States#getEx <em>Ex</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.States#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.States#getMachineInvocations <em>Machine Invocations</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getStates()
 * @model
 * @generated
 */
public interface States extends EObject
{
  /**
   * Returns the value of the '<em><b>State Mods</b></em>' attribute.
   * The literals are from the enumeration {@link es.upm.gsi.ECharts.dslECharts.StateModifiers}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Mods</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Mods</em>' attribute.
   * @see es.upm.gsi.ECharts.dslECharts.StateModifiers
   * @see #setStateMods(StateModifiers)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getStates_StateMods()
   * @model
   * @generated
   */
  StateModifiers getStateMods();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.States#getStateMods <em>State Mods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Mods</em>' attribute.
   * @see es.upm.gsi.ECharts.dslECharts.StateModifiers
   * @see #getStateMods()
   * @generated
   */
  void setStateMods(StateModifiers value);

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
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getStates_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.States#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>En</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>En</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>En</em>' containment reference.
   * @see #setEn(Entry)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getStates_En()
   * @model containment="true"
   * @generated
   */
  Entry getEn();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.States#getEn <em>En</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>En</em>' containment reference.
   * @see #getEn()
   * @generated
   */
  void setEn(Entry value);

  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference.
   * @see #setEx(Exit)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getStates_Ex()
   * @model containment="true"
   * @generated
   */
  Exit getEx();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.States#getEx <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ex</em>' containment reference.
   * @see #getEx()
   * @generated
   */
  void setEx(Exit value);

  /**
   * Returns the value of the '<em><b>Submachine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Submachine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Submachine</em>' containment reference.
   * @see #setSubmachine(SubMachine)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getStates_Submachine()
   * @model containment="true"
   * @generated
   */
  SubMachine getSubmachine();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.States#getSubmachine <em>Submachine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Submachine</em>' containment reference.
   * @see #getSubmachine()
   * @generated
   */
  void setSubmachine(SubMachine value);

  /**
   * Returns the value of the '<em><b>Machine Invocations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine Invocations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine Invocations</em>' containment reference.
   * @see #setMachineInvocations(MachineInvocation)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getStates_MachineInvocations()
   * @model containment="true"
   * @generated
   */
  MachineInvocation getMachineInvocations();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.States#getMachineInvocations <em>Machine Invocations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine Invocations</em>' containment reference.
   * @see #getMachineInvocations()
   * @generated
   */
  void setMachineInvocations(MachineInvocation value);

} // States
