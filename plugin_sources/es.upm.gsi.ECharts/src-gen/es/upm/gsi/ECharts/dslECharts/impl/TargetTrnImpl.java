/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.ListStates;
import es.upm.gsi.ECharts.dslECharts.SingleState;
import es.upm.gsi.ECharts.dslECharts.TargetTrn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Trn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.TargetTrnImpl#getFromTo <em>From To</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.TargetTrnImpl#getFromToList <em>From To List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetTrnImpl extends MinimalEObjectImpl.Container implements TargetTrn
{
  /**
   * The cached value of the '{@link #getFromTo() <em>From To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromTo()
   * @generated
   * @ordered
   */
  protected SingleState fromTo;

  /**
   * The cached value of the '{@link #getFromToList() <em>From To List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromToList()
   * @generated
   * @ordered
   */
  protected ListStates fromToList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TargetTrnImpl()
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
    return DslEChartsPackage.Literals.TARGET_TRN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleState getFromTo()
  {
    return fromTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromTo(SingleState newFromTo, NotificationChain msgs)
  {
    SingleState oldFromTo = fromTo;
    fromTo = newFromTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.TARGET_TRN__FROM_TO, oldFromTo, newFromTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromTo(SingleState newFromTo)
  {
    if (newFromTo != fromTo)
    {
      NotificationChain msgs = null;
      if (fromTo != null)
        msgs = ((InternalEObject)fromTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.TARGET_TRN__FROM_TO, null, msgs);
      if (newFromTo != null)
        msgs = ((InternalEObject)newFromTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.TARGET_TRN__FROM_TO, null, msgs);
      msgs = basicSetFromTo(newFromTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.TARGET_TRN__FROM_TO, newFromTo, newFromTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListStates getFromToList()
  {
    return fromToList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromToList(ListStates newFromToList, NotificationChain msgs)
  {
    ListStates oldFromToList = fromToList;
    fromToList = newFromToList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.TARGET_TRN__FROM_TO_LIST, oldFromToList, newFromToList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromToList(ListStates newFromToList)
  {
    if (newFromToList != fromToList)
    {
      NotificationChain msgs = null;
      if (fromToList != null)
        msgs = ((InternalEObject)fromToList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.TARGET_TRN__FROM_TO_LIST, null, msgs);
      if (newFromToList != null)
        msgs = ((InternalEObject)newFromToList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.TARGET_TRN__FROM_TO_LIST, null, msgs);
      msgs = basicSetFromToList(newFromToList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.TARGET_TRN__FROM_TO_LIST, newFromToList, newFromToList));
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
      case DslEChartsPackage.TARGET_TRN__FROM_TO:
        return basicSetFromTo(null, msgs);
      case DslEChartsPackage.TARGET_TRN__FROM_TO_LIST:
        return basicSetFromToList(null, msgs);
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
      case DslEChartsPackage.TARGET_TRN__FROM_TO:
        return getFromTo();
      case DslEChartsPackage.TARGET_TRN__FROM_TO_LIST:
        return getFromToList();
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
      case DslEChartsPackage.TARGET_TRN__FROM_TO:
        setFromTo((SingleState)newValue);
        return;
      case DslEChartsPackage.TARGET_TRN__FROM_TO_LIST:
        setFromToList((ListStates)newValue);
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
      case DslEChartsPackage.TARGET_TRN__FROM_TO:
        setFromTo((SingleState)null);
        return;
      case DslEChartsPackage.TARGET_TRN__FROM_TO_LIST:
        setFromToList((ListStates)null);
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
      case DslEChartsPackage.TARGET_TRN__FROM_TO:
        return fromTo != null;
      case DslEChartsPackage.TARGET_TRN__FROM_TO_LIST:
        return fromToList != null;
    }
    return super.eIsSet(featureID);
  }

} //TargetTrnImpl
