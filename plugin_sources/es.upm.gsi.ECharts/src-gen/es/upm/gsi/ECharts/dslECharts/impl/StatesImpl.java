/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.Entry;
import es.upm.gsi.ECharts.dslECharts.Exit;
import es.upm.gsi.ECharts.dslECharts.MachineInvocation;
import es.upm.gsi.ECharts.dslECharts.StateModifiers;
import es.upm.gsi.ECharts.dslECharts.States;
import es.upm.gsi.ECharts.dslECharts.SubMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>States</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.StatesImpl#getStateMods <em>State Mods</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.StatesImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.StatesImpl#getEn <em>En</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.StatesImpl#getEx <em>Ex</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.StatesImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.StatesImpl#getMachineInvocations <em>Machine Invocations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatesImpl extends MinimalEObjectImpl.Container implements States
{
  /**
   * The default value of the '{@link #getStateMods() <em>State Mods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateMods()
   * @generated
   * @ordered
   */
  protected static final StateModifiers STATE_MODS_EDEFAULT = StateModifiers.INITIAL;

  /**
   * The cached value of the '{@link #getStateMods() <em>State Mods</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateMods()
   * @generated
   * @ordered
   */
  protected StateModifiers stateMods = STATE_MODS_EDEFAULT;

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
   * The cached value of the '{@link #getEn() <em>En</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEn()
   * @generated
   * @ordered
   */
  protected Entry en;

  /**
   * The cached value of the '{@link #getEx() <em>Ex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEx()
   * @generated
   * @ordered
   */
  protected Exit ex;

  /**
   * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubmachine()
   * @generated
   * @ordered
   */
  protected SubMachine submachine;

  /**
   * The cached value of the '{@link #getMachineInvocations() <em>Machine Invocations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachineInvocations()
   * @generated
   * @ordered
   */
  protected MachineInvocation machineInvocations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatesImpl()
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
    return DslEChartsPackage.Literals.STATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateModifiers getStateMods()
  {
    return stateMods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateMods(StateModifiers newStateMods)
  {
    StateModifiers oldStateMods = stateMods;
    stateMods = newStateMods == null ? STATE_MODS_EDEFAULT : newStateMods;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__STATE_MODS, oldStateMods, stateMods));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entry getEn()
  {
    return en;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEn(Entry newEn, NotificationChain msgs)
  {
    Entry oldEn = en;
    en = newEn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__EN, oldEn, newEn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEn(Entry newEn)
  {
    if (newEn != en)
    {
      NotificationChain msgs = null;
      if (en != null)
        msgs = ((InternalEObject)en).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.STATES__EN, null, msgs);
      if (newEn != null)
        msgs = ((InternalEObject)newEn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.STATES__EN, null, msgs);
      msgs = basicSetEn(newEn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__EN, newEn, newEn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exit getEx()
  {
    return ex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEx(Exit newEx, NotificationChain msgs)
  {
    Exit oldEx = ex;
    ex = newEx;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__EX, oldEx, newEx);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEx(Exit newEx)
  {
    if (newEx != ex)
    {
      NotificationChain msgs = null;
      if (ex != null)
        msgs = ((InternalEObject)ex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.STATES__EX, null, msgs);
      if (newEx != null)
        msgs = ((InternalEObject)newEx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.STATES__EX, null, msgs);
      msgs = basicSetEx(newEx, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__EX, newEx, newEx));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubMachine getSubmachine()
  {
    return submachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubmachine(SubMachine newSubmachine, NotificationChain msgs)
  {
    SubMachine oldSubmachine = submachine;
    submachine = newSubmachine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__SUBMACHINE, oldSubmachine, newSubmachine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubmachine(SubMachine newSubmachine)
  {
    if (newSubmachine != submachine)
    {
      NotificationChain msgs = null;
      if (submachine != null)
        msgs = ((InternalEObject)submachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.STATES__SUBMACHINE, null, msgs);
      if (newSubmachine != null)
        msgs = ((InternalEObject)newSubmachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.STATES__SUBMACHINE, null, msgs);
      msgs = basicSetSubmachine(newSubmachine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__SUBMACHINE, newSubmachine, newSubmachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineInvocation getMachineInvocations()
  {
    return machineInvocations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMachineInvocations(MachineInvocation newMachineInvocations, NotificationChain msgs)
  {
    MachineInvocation oldMachineInvocations = machineInvocations;
    machineInvocations = newMachineInvocations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__MACHINE_INVOCATIONS, oldMachineInvocations, newMachineInvocations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachineInvocations(MachineInvocation newMachineInvocations)
  {
    if (newMachineInvocations != machineInvocations)
    {
      NotificationChain msgs = null;
      if (machineInvocations != null)
        msgs = ((InternalEObject)machineInvocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.STATES__MACHINE_INVOCATIONS, null, msgs);
      if (newMachineInvocations != null)
        msgs = ((InternalEObject)newMachineInvocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.STATES__MACHINE_INVOCATIONS, null, msgs);
      msgs = basicSetMachineInvocations(newMachineInvocations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.STATES__MACHINE_INVOCATIONS, newMachineInvocations, newMachineInvocations));
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
      case DslEChartsPackage.STATES__EN:
        return basicSetEn(null, msgs);
      case DslEChartsPackage.STATES__EX:
        return basicSetEx(null, msgs);
      case DslEChartsPackage.STATES__SUBMACHINE:
        return basicSetSubmachine(null, msgs);
      case DslEChartsPackage.STATES__MACHINE_INVOCATIONS:
        return basicSetMachineInvocations(null, msgs);
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
      case DslEChartsPackage.STATES__STATE_MODS:
        return getStateMods();
      case DslEChartsPackage.STATES__NAME:
        return getName();
      case DslEChartsPackage.STATES__EN:
        return getEn();
      case DslEChartsPackage.STATES__EX:
        return getEx();
      case DslEChartsPackage.STATES__SUBMACHINE:
        return getSubmachine();
      case DslEChartsPackage.STATES__MACHINE_INVOCATIONS:
        return getMachineInvocations();
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
      case DslEChartsPackage.STATES__STATE_MODS:
        setStateMods((StateModifiers)newValue);
        return;
      case DslEChartsPackage.STATES__NAME:
        setName((String)newValue);
        return;
      case DslEChartsPackage.STATES__EN:
        setEn((Entry)newValue);
        return;
      case DslEChartsPackage.STATES__EX:
        setEx((Exit)newValue);
        return;
      case DslEChartsPackage.STATES__SUBMACHINE:
        setSubmachine((SubMachine)newValue);
        return;
      case DslEChartsPackage.STATES__MACHINE_INVOCATIONS:
        setMachineInvocations((MachineInvocation)newValue);
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
      case DslEChartsPackage.STATES__STATE_MODS:
        setStateMods(STATE_MODS_EDEFAULT);
        return;
      case DslEChartsPackage.STATES__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DslEChartsPackage.STATES__EN:
        setEn((Entry)null);
        return;
      case DslEChartsPackage.STATES__EX:
        setEx((Exit)null);
        return;
      case DslEChartsPackage.STATES__SUBMACHINE:
        setSubmachine((SubMachine)null);
        return;
      case DslEChartsPackage.STATES__MACHINE_INVOCATIONS:
        setMachineInvocations((MachineInvocation)null);
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
      case DslEChartsPackage.STATES__STATE_MODS:
        return stateMods != STATE_MODS_EDEFAULT;
      case DslEChartsPackage.STATES__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DslEChartsPackage.STATES__EN:
        return en != null;
      case DslEChartsPackage.STATES__EX:
        return ex != null;
      case DslEChartsPackage.STATES__SUBMACHINE:
        return submachine != null;
      case DslEChartsPackage.STATES__MACHINE_INVOCATIONS:
        return machineInvocations != null;
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
    result.append(" (stateMods: ");
    result.append(stateMods);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StatesImpl
