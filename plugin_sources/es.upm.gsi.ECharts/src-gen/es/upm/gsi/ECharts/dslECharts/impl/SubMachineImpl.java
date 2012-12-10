/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.MachineBody;
import es.upm.gsi.ECharts.dslECharts.MachineModifier;
import es.upm.gsi.ECharts.dslECharts.SubMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.SubMachineImpl#getMachineModifier <em>Machine Modifier</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.SubMachineImpl#getMachineBody <em>Machine Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubMachineImpl extends MinimalEObjectImpl.Container implements SubMachine
{
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
   * The cached value of the '{@link #getMachineBody() <em>Machine Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachineBody()
   * @generated
   * @ordered
   */
  protected MachineBody machineBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubMachineImpl()
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
    return DslEChartsPackage.Literals.SUB_MACHINE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER, oldMachineModifier, newMachineModifier);
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
        msgs = ((InternalEObject)machineModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER, null, msgs);
      if (newMachineModifier != null)
        msgs = ((InternalEObject)newMachineModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER, null, msgs);
      msgs = basicSetMachineModifier(newMachineModifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER, newMachineModifier, newMachineModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineBody getMachineBody()
  {
    return machineBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMachineBody(MachineBody newMachineBody, NotificationChain msgs)
  {
    MachineBody oldMachineBody = machineBody;
    machineBody = newMachineBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.SUB_MACHINE__MACHINE_BODY, oldMachineBody, newMachineBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachineBody(MachineBody newMachineBody)
  {
    if (newMachineBody != machineBody)
    {
      NotificationChain msgs = null;
      if (machineBody != null)
        msgs = ((InternalEObject)machineBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.SUB_MACHINE__MACHINE_BODY, null, msgs);
      if (newMachineBody != null)
        msgs = ((InternalEObject)newMachineBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.SUB_MACHINE__MACHINE_BODY, null, msgs);
      msgs = basicSetMachineBody(newMachineBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.SUB_MACHINE__MACHINE_BODY, newMachineBody, newMachineBody));
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
      case DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER:
        return basicSetMachineModifier(null, msgs);
      case DslEChartsPackage.SUB_MACHINE__MACHINE_BODY:
        return basicSetMachineBody(null, msgs);
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
      case DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER:
        return getMachineModifier();
      case DslEChartsPackage.SUB_MACHINE__MACHINE_BODY:
        return getMachineBody();
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
      case DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER:
        setMachineModifier((MachineModifier)newValue);
        return;
      case DslEChartsPackage.SUB_MACHINE__MACHINE_BODY:
        setMachineBody((MachineBody)newValue);
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
      case DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER:
        setMachineModifier((MachineModifier)null);
        return;
      case DslEChartsPackage.SUB_MACHINE__MACHINE_BODY:
        setMachineBody((MachineBody)null);
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
      case DslEChartsPackage.SUB_MACHINE__MACHINE_MODIFIER:
        return machineModifier != null;
      case DslEChartsPackage.SUB_MACHINE__MACHINE_BODY:
        return machineBody != null;
    }
    return super.eIsSet(featureID);
  }

} //SubMachineImpl
