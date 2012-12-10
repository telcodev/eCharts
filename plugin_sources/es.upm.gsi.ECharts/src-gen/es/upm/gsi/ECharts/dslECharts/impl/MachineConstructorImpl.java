/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.Expression;
import es.upm.gsi.ECharts.dslECharts.Machine;
import es.upm.gsi.ECharts.dslECharts.MachineConstructor;
import es.upm.gsi.ECharts.dslECharts.paramsDeclaration;

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
 * An implementation of the model object '<em><b>Machine Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineConstructorImpl#getMachineName <em>Machine Name</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineConstructorImpl#getParamsMachine <em>Params Machine</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.MachineConstructorImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineConstructorImpl extends MinimalEObjectImpl.Container implements MachineConstructor
{
  /**
   * The cached value of the '{@link #getMachineName() <em>Machine Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachineName()
   * @generated
   * @ordered
   */
  protected Machine machineName;

  /**
   * The cached value of the '{@link #getParamsMachine() <em>Params Machine</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamsMachine()
   * @generated
   * @ordered
   */
  protected paramsDeclaration paramsMachine;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<Expression> expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MachineConstructorImpl()
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
    return DslEChartsPackage.Literals.MACHINE_CONSTRUCTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Machine getMachineName()
  {
    if (machineName != null && machineName.eIsProxy())
    {
      InternalEObject oldMachineName = (InternalEObject)machineName;
      machineName = (Machine)eResolveProxy(oldMachineName);
      if (machineName != oldMachineName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslEChartsPackage.MACHINE_CONSTRUCTOR__MACHINE_NAME, oldMachineName, machineName));
      }
    }
    return machineName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Machine basicGetMachineName()
  {
    return machineName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachineName(Machine newMachineName)
  {
    Machine oldMachineName = machineName;
    machineName = newMachineName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_CONSTRUCTOR__MACHINE_NAME, oldMachineName, machineName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public paramsDeclaration getParamsMachine()
  {
    return paramsMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParamsMachine(paramsDeclaration newParamsMachine, NotificationChain msgs)
  {
    paramsDeclaration oldParamsMachine = paramsMachine;
    paramsMachine = newParamsMachine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE, oldParamsMachine, newParamsMachine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamsMachine(paramsDeclaration newParamsMachine)
  {
    if (newParamsMachine != paramsMachine)
    {
      NotificationChain msgs = null;
      if (paramsMachine != null)
        msgs = ((InternalEObject)paramsMachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE, null, msgs);
      if (newParamsMachine != null)
        msgs = ((InternalEObject)newParamsMachine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE, null, msgs);
      msgs = basicSetParamsMachine(newParamsMachine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE, newParamsMachine, newParamsMachine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<Expression>(Expression.class, this, DslEChartsPackage.MACHINE_CONSTRUCTOR__EXPR);
    }
    return expr;
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
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE:
        return basicSetParamsMachine(null, msgs);
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
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
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__MACHINE_NAME:
        if (resolve) return getMachineName();
        return basicGetMachineName();
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE:
        return getParamsMachine();
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__EXPR:
        return getExpr();
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
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__MACHINE_NAME:
        setMachineName((Machine)newValue);
        return;
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE:
        setParamsMachine((paramsDeclaration)newValue);
        return;
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends Expression>)newValue);
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
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__MACHINE_NAME:
        setMachineName((Machine)null);
        return;
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE:
        setParamsMachine((paramsDeclaration)null);
        return;
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__EXPR:
        getExpr().clear();
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
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__MACHINE_NAME:
        return machineName != null;
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__PARAMS_MACHINE:
        return paramsMachine != null;
      case DslEChartsPackage.MACHINE_CONSTRUCTOR__EXPR:
        return expr != null && !expr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MachineConstructorImpl
