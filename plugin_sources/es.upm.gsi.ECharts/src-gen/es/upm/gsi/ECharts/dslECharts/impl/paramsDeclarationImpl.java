/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.paramsDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>params Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.paramsDeclarationImpl#getParamtype <em>Paramtype</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.paramsDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class paramsDeclarationImpl extends MinimalEObjectImpl.Container implements paramsDeclaration
{
  /**
   * The cached value of the '{@link #getParamtype() <em>Paramtype</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamtype()
   * @generated
   * @ordered
   */
  protected EList<String> paramtype;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EList<String> name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected paramsDeclarationImpl()
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
    return DslEChartsPackage.Literals.PARAMS_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParamtype()
  {
    if (paramtype == null)
    {
      paramtype = new EDataTypeEList<String>(String.class, this, DslEChartsPackage.PARAMS_DECLARATION__PARAMTYPE);
    }
    return paramtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getName()
  {
    if (name == null)
    {
      name = new EDataTypeEList<String>(String.class, this, DslEChartsPackage.PARAMS_DECLARATION__NAME);
    }
    return name;
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
      case DslEChartsPackage.PARAMS_DECLARATION__PARAMTYPE:
        return getParamtype();
      case DslEChartsPackage.PARAMS_DECLARATION__NAME:
        return getName();
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
      case DslEChartsPackage.PARAMS_DECLARATION__PARAMTYPE:
        getParamtype().clear();
        getParamtype().addAll((Collection<? extends String>)newValue);
        return;
      case DslEChartsPackage.PARAMS_DECLARATION__NAME:
        getName().clear();
        getName().addAll((Collection<? extends String>)newValue);
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
      case DslEChartsPackage.PARAMS_DECLARATION__PARAMTYPE:
        getParamtype().clear();
        return;
      case DslEChartsPackage.PARAMS_DECLARATION__NAME:
        getName().clear();
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
      case DslEChartsPackage.PARAMS_DECLARATION__PARAMTYPE:
        return paramtype != null && !paramtype.isEmpty();
      case DslEChartsPackage.PARAMS_DECLARATION__NAME:
        return name != null && !name.isEmpty();
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
    result.append(" (paramtype: ");
    result.append(paramtype);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //paramsDeclarationImpl
