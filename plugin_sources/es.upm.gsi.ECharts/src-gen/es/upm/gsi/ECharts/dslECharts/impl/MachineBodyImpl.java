/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.HostBlock;
import es.upm.gsi.ECharts.dslECharts.MachineBody;
import es.upm.gsi.ECharts.dslECharts.MachineConstructor;
import es.upm.gsi.ECharts.dslECharts.States;
import es.upm.gsi.ECharts.dslECharts.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineBodyImpl#getHostBlock <em>Host Block</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineBodyImpl#getMachineConstructor <em>Machine Constructor</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineBodyImpl#getStates <em>States</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineBodyImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineBodyImpl extends MinimalEObjectImpl.Container implements MachineBody
{
  /**
   * The cached value of the '{@link #getHostBlock() <em>Host Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostBlock()
   * @generated
   * @ordered
   */
  protected HostBlock hostBlock;

  /**
   * The cached value of the '{@link #getMachineConstructor() <em>Machine Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachineConstructor()
   * @generated
   * @ordered
   */
  protected MachineConstructor machineConstructor;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected States states;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected Transition transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MachineBodyImpl()
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
    return DslEChartsPackage.Literals.MACHINE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostBlock getHostBlock()
  {
    return hostBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHostBlock(HostBlock newHostBlock, NotificationChain msgs)
  {
    HostBlock oldHostBlock = hostBlock;
    hostBlock = newHostBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_BODY__HOST_BLOCK, oldHostBlock, newHostBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHostBlock(HostBlock newHostBlock)
  {
    if (newHostBlock != hostBlock)
    {
      NotificationChain msgs = null;
      if (hostBlock != null)
        msgs = ((InternalEObject)hostBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_BODY__HOST_BLOCK, null, msgs);
      if (newHostBlock != null)
        msgs = ((InternalEObject)newHostBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_BODY__HOST_BLOCK, null, msgs);
      msgs = basicSetHostBlock(newHostBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_BODY__HOST_BLOCK, newHostBlock, newHostBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineConstructor getMachineConstructor()
  {
    return machineConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMachineConstructor(MachineConstructor newMachineConstructor, NotificationChain msgs)
  {
    MachineConstructor oldMachineConstructor = machineConstructor;
    machineConstructor = newMachineConstructor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR, oldMachineConstructor, newMachineConstructor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachineConstructor(MachineConstructor newMachineConstructor)
  {
    if (newMachineConstructor != machineConstructor)
    {
      NotificationChain msgs = null;
      if (machineConstructor != null)
        msgs = ((InternalEObject)machineConstructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR, null, msgs);
      if (newMachineConstructor != null)
        msgs = ((InternalEObject)newMachineConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR, null, msgs);
      msgs = basicSetMachineConstructor(newMachineConstructor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR, newMachineConstructor, newMachineConstructor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States getStates()
  {
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStates(States newStates, NotificationChain msgs)
  {
    States oldStates = states;
    states = newStates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_BODY__STATES, oldStates, newStates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStates(States newStates)
  {
    if (newStates != states)
    {
      NotificationChain msgs = null;
      if (states != null)
        msgs = ((InternalEObject)states).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_BODY__STATES, null, msgs);
      if (newStates != null)
        msgs = ((InternalEObject)newStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_BODY__STATES, null, msgs);
      msgs = basicSetStates(newStates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_BODY__STATES, newStates, newStates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition getTransition()
  {
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs)
  {
    Transition oldTransition = transition;
    transition = newTransition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_BODY__TRANSITION, oldTransition, newTransition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransition(Transition newTransition)
  {
    if (newTransition != transition)
    {
      NotificationChain msgs = null;
      if (transition != null)
        msgs = ((InternalEObject)transition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_BODY__TRANSITION, null, msgs);
      if (newTransition != null)
        msgs = ((InternalEObject)newTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_BODY__TRANSITION, null, msgs);
      msgs = basicSetTransition(newTransition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_BODY__TRANSITION, newTransition, newTransition));
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
      case DslEChartsPackage.MACHINE_BODY__HOST_BLOCK:
        return basicSetHostBlock(null, msgs);
      case DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR:
        return basicSetMachineConstructor(null, msgs);
      case DslEChartsPackage.MACHINE_BODY__STATES:
        return basicSetStates(null, msgs);
      case DslEChartsPackage.MACHINE_BODY__TRANSITION:
        return basicSetTransition(null, msgs);
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
      case DslEChartsPackage.MACHINE_BODY__HOST_BLOCK:
        return getHostBlock();
      case DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR:
        return getMachineConstructor();
      case DslEChartsPackage.MACHINE_BODY__STATES:
        return getStates();
      case DslEChartsPackage.MACHINE_BODY__TRANSITION:
        return getTransition();
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
      case DslEChartsPackage.MACHINE_BODY__HOST_BLOCK:
        setHostBlock((HostBlock)newValue);
        return;
      case DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR:
        setMachineConstructor((MachineConstructor)newValue);
        return;
      case DslEChartsPackage.MACHINE_BODY__STATES:
        setStates((States)newValue);
        return;
      case DslEChartsPackage.MACHINE_BODY__TRANSITION:
        setTransition((Transition)newValue);
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
      case DslEChartsPackage.MACHINE_BODY__HOST_BLOCK:
        setHostBlock((HostBlock)null);
        return;
      case DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR:
        setMachineConstructor((MachineConstructor)null);
        return;
      case DslEChartsPackage.MACHINE_BODY__STATES:
        setStates((States)null);
        return;
      case DslEChartsPackage.MACHINE_BODY__TRANSITION:
        setTransition((Transition)null);
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
      case DslEChartsPackage.MACHINE_BODY__HOST_BLOCK:
        return hostBlock != null;
      case DslEChartsPackage.MACHINE_BODY__MACHINE_CONSTRUCTOR:
        return machineConstructor != null;
      case DslEChartsPackage.MACHINE_BODY__STATES:
        return states != null;
      case DslEChartsPackage.MACHINE_BODY__TRANSITION:
        return transition != null;
    }
    return super.eIsSet(featureID);
  }

} //MachineBodyImpl
