/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers;
import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.Machine;
import es.upm.gsi.ECharts.dslECharts.MachineBody;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineImpl#getAccessAndMachineModifier <em>Access And Machine Modifier</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineImpl#getMachineBody <em>Machine Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends MinimalEObjectImpl.Container implements Machine
{
  /**
   * The cached value of the '{@link #getAccessAndMachineModifier() <em>Access And Machine Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccessAndMachineModifier()
   * @generated
   * @ordered
   */
  protected AccessAndMachineModifiers accessAndMachineModifier;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
  protected MachineImpl()
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
    return DslEChartsPackage.Literals.MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessAndMachineModifiers getAccessAndMachineModifier()
  {
    return accessAndMachineModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAccessAndMachineModifier(AccessAndMachineModifiers newAccessAndMachineModifier, NotificationChain msgs)
  {
    AccessAndMachineModifiers oldAccessAndMachineModifier = accessAndMachineModifier;
    accessAndMachineModifier = newAccessAndMachineModifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER, oldAccessAndMachineModifier, newAccessAndMachineModifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAccessAndMachineModifier(AccessAndMachineModifiers newAccessAndMachineModifier)
  {
    if (newAccessAndMachineModifier != accessAndMachineModifier)
    {
      NotificationChain msgs = null;
      if (accessAndMachineModifier != null)
        msgs = ((InternalEObject)accessAndMachineModifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER, null, msgs);
      if (newAccessAndMachineModifier != null)
        msgs = ((InternalEObject)newAccessAndMachineModifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER, null, msgs);
      msgs = basicSetAccessAndMachineModifier(newAccessAndMachineModifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER, newAccessAndMachineModifier, newAccessAndMachineModifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE__MACHINE_BODY, oldMachineBody, newMachineBody);
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
        msgs = ((InternalEObject)machineBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE__MACHINE_BODY, null, msgs);
      if (newMachineBody != null)
        msgs = ((InternalEObject)newMachineBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE__MACHINE_BODY, null, msgs);
      msgs = basicSetMachineBody(newMachineBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE__MACHINE_BODY, newMachineBody, newMachineBody));
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
      case DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER:
        return basicSetAccessAndMachineModifier(null, msgs);
      case DslEChartsPackage.MACHINE__MACHINE_BODY:
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
      case DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER:
        return getAccessAndMachineModifier();
      case DslEChartsPackage.MACHINE__NAME:
        return getName();
      case DslEChartsPackage.MACHINE__MACHINE_BODY:
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
      case DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER:
        setAccessAndMachineModifier((AccessAndMachineModifiers)newValue);
        return;
      case DslEChartsPackage.MACHINE__NAME:
        setName((String)newValue);
        return;
      case DslEChartsPackage.MACHINE__MACHINE_BODY:
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
      case DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER:
        setAccessAndMachineModifier((AccessAndMachineModifiers)null);
        return;
      case DslEChartsPackage.MACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslEChartsPackage.MACHINE__MACHINE_BODY:
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
      case DslEChartsPackage.MACHINE__ACCESS_AND_MACHINE_MODIFIER:
        return accessAndMachineModifier != null;
      case DslEChartsPackage.MACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslEChartsPackage.MACHINE__MACHINE_BODY:
        return machineBody != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MachineImpl
