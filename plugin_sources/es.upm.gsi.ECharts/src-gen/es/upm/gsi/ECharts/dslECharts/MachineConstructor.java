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
 * A representation of the model object '<em><b>Machine Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor#getMachineName <em>Machine Name</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor#getParamsMachine <em>Params Machine</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineConstructor()
 * @model
 * @generated
 */
public interface MachineConstructor extends EObject
{
  /**
   * Returns the value of the '<em><b>Machine Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine Name</em>' reference.
   * @see #setMachineName(Machine)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineConstructor_MachineName()
   * @model
   * @generated
   */
  Machine getMachineName();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor#getMachineName <em>Machine Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine Name</em>' reference.
   * @see #getMachineName()
   * @generated
   */
  void setMachineName(Machine value);

  /**
   * Returns the value of the '<em><b>Params Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params Machine</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params Machine</em>' containment reference.
   * @see #setParamsMachine(paramsDeclaration)
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineConstructor_ParamsMachine()
   * @model containment="true"
   * @generated
   */
  paramsDeclaration getParamsMachine();

  /**
   * Sets the value of the '{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor#getParamsMachine <em>Params Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Params Machine</em>' containment reference.
   * @see #getParamsMachine()
   * @generated
   */
  void setParamsMachine(paramsDeclaration value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link es.upm.gsi.ECharts.dslECharts.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage#getMachineConstructor_Expr()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExpr();

} // MachineConstructor
