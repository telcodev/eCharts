/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.Imports;
import es.upm.gsi.ECharts.dslECharts.Machine;
import es.upm.gsi.ECharts.dslECharts.Root;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.RootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.RootImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.RootImpl#getMachine <em>Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root
{
  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected es.upm.gsi.ECharts.dslECharts.Package package_;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Imports> imports;

  /**
   * The cached value of the '{@link #getMachine() <em>Machine</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachine()
   * @generated
   * @ordered
   */
  protected EList<Machine> machine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RootImpl()
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
    return DslEChartsPackage.Literals.ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public es.upm.gsi.ECharts.dslECharts.Package getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(es.upm.gsi.ECharts.dslECharts.Package newPackage, NotificationChain msgs)
  {
    es.upm.gsi.ECharts.dslECharts.Package oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.ROOT__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackage(es.upm.gsi.ECharts.dslECharts.Package newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.ROOT__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.ROOT__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.ROOT__PACKAGE, newPackage, newPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Imports> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Imports>(Imports.class, this, DslEChartsPackage.ROOT__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Machine> getMachine()
  {
    if (machine == null)
    {
      machine = new EObjectContainmentEList<Machine>(Machine.class, this, DslEChartsPackage.ROOT__MACHINE);
    }
    return machine;
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
      case DslEChartsPackage.ROOT__PACKAGE:
        return basicSetPackage(null, msgs);
      case DslEChartsPackage.ROOT__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case DslEChartsPackage.ROOT__MACHINE:
        return ((InternalEList<?>)getMachine()).basicRemove(otherEnd, msgs);
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
      case DslEChartsPackage.ROOT__PACKAGE:
        return getPackage();
      case DslEChartsPackage.ROOT__IMPORTS:
        return getImports();
      case DslEChartsPackage.ROOT__MACHINE:
        return getMachine();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslEChartsPackage.ROOT__PACKAGE:
        setPackage((es.upm.gsi.ECharts.dslECharts.Package)newValue);
        return;
      case DslEChartsPackage.ROOT__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Imports>)newValue);
        return;
      case DslEChartsPackage.ROOT__MACHINE:
        getMachine().clear();
        getMachine().addAll((Collection<? extends Machine>)newValue);
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
      case DslEChartsPackage.ROOT__PACKAGE:
        setPackage((es.upm.gsi.ECharts.dslECharts.Package)null);
        return;
      case DslEChartsPackage.ROOT__IMPORTS:
        getImports().clear();
        return;
      case DslEChartsPackage.ROOT__MACHINE:
        getMachine().clear();
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
      case DslEChartsPackage.ROOT__PACKAGE:
        return package_ != null;
      case DslEChartsPackage.ROOT__IMPORTS:
        return imports != null && !imports.isEmpty();
      case DslEChartsPackage.ROOT__MACHINE:
        return machine != null && !machine.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RootImpl
