/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.MachineModifier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineModifierImpl#getConcurrent <em>Concurrent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineModifierImpl extends MinimalEObjectImpl.Container implements MachineModifier
{
  /**
   * The default value of the '{@link #getConcurrent() <em>Concurrent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcurrent()
   * @generated
   * @ordered
   */
  protected static final String CONCURRENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConcurrent() <em>Concurrent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConcurrent()
   * @generated
   * @ordered
   */
  protected String concurrent = CONCURRENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MachineModifierImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslEChartsPackage.Literals.MACHINE_MODIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConcurrent()
  {
    return concurrent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConcurrent(String newConcurrent)
  {
    String oldConcurrent = concurrent;
    concurrent = newConcurrent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_MODIFIER__CONCURRENT, oldConcurrent, concurrent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslEChartsPackage.MACHINE_MODIFIER__CONCURRENT:
        return getConcurrent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslEChartsPackage.MACHINE_MODIFIER__CONCURRENT:
        setConcurrent((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslEChartsPackage.MACHINE_MODIFIER__CONCURRENT:
        setConcurrent(CONCURRENT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslEChartsPackage.MACHINE_MODIFIER__CONCURRENT:
        return CONCURRENT_EDEFAULT == null ? concurrent != null : !CONCURRENT_EDEFAULT.equals(concurrent);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (concurrent: ");
    result.append(concurrent);
    result.append(')');
    return result.toString();
  }

} //MachineModifierImpl
