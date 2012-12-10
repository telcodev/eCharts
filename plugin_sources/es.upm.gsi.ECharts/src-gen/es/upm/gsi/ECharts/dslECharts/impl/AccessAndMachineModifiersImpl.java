/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers;
import es.upm.gsi.ECharts.dslECharts.AccessModifiers;
import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.MachineModifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access And Machine Modifiers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.AccessAndMachineModifiersImpl#getAccessModifier <em>Access Modifier</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.AccessAndMachineModifiersImpl#getMachineModifier <em>Machine Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessAndMachineModifiersImpl extends MinimalEObjectImpl.Container implements AccessAndMachineModifiers
{
  /**
   * The default value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessModifier()
   * @generated
   * @ordered
   */
  protected static final AccessModifiers ACCESS_MODIFIER_EDEFAULT = AccessModifiers.PRIVATE;

  /**
   * The cached value of the '{@link #getAccessModifier() <em>Access Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessModifier()
   * @generated
   * @ordered
   */
  protected AccessModifiers accessModifier = ACCESS_MODIFIER_EDEFAULT;

  /**
   * The cached value of the '{@link #getMachineModifier() <em>Machine Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachineModifier()
   * @generated
   * @ordered
   */
  protected MachineModifier machineModifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccessAndMachineModifiersImpl()
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
    return DslEChartsPackage.Literals.ACCESS_AND_MACHINE_MODIFIERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessModifiers getAccessModifier()
  {
    return accessModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessModifier(AccessModifiers newAccessModifier)
  {
    AccessModifiers oldAccessModifier = accessModifier;
    accessModifier = newAccessModifier == null ? ACCESS_MODIFIER_EDEFAULT : newAccessModifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__ACCESS_MODIFIER, oldAccessModifier, accessModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineModifier getMachineModifier()
  {
    return machineModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMachineModifier(MachineModifier newMachineModifier, NotificationChain msgs)
  {
    MachineModifier oldMachineModifier = machineModifier;
    machineModifier = newMachineModifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER, oldMachineModifier, newMachineModifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachineModifier(MachineModifier newMachineModifier)
  {
    if (newMachineModifier != machineModifier)
    {
      NotificationChain msgs = null;
      if (machineModifier != null)
        msgs = ((InternalEObject)machineModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER, null, msgs);
      if (newMachineModifier != null)
        msgs = ((InternalEObject)newMachineModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER, null, msgs);
      msgs = basicSetMachineModifier(newMachineModifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER, newMachineModifier, newMachineModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER:
        return basicSetMachineModifier(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__ACCESS_MODIFIER:
        return getAccessModifier();
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER:
        return getMachineModifier();
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
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__ACCESS_MODIFIER:
        setAccessModifier((AccessModifiers)newValue);
        return;
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER:
        setMachineModifier((MachineModifier)newValue);
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
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__ACCESS_MODIFIER:
        setAccessModifier(ACCESS_MODIFIER_EDEFAULT);
        return;
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER:
        setMachineModifier((MachineModifier)null);
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
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__ACCESS_MODIFIER:
        return accessModifier != ACCESS_MODIFIER_EDEFAULT;
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER:
        return machineModifier != null;
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
    result.append(" (accessModifier: ");
    result.append(accessModifier);
    result.append(')');
    return result.toString();
  }

} //AccessAndMachineModifiersImpl
