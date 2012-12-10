/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.Expression;
import es.upm.gsi.ECharts.dslECharts.NumberLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.NumberLiteralImpl#getValueINT <em>Value INT</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.NumberLiteralImpl#getValueID <em>Value ID</em>}</li>
 *   <li>{@link es.upm.gsi.ECharts.dslECharts.impl.NumberLiteralImpl#getRefValue <em>Ref Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberLiteralImpl extends ExpressionImpl implements NumberLiteral
{
  /**
   * The default value of the '{@link #getValueINT() <em>Value INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueINT()
   * @generated
   * @ordered
   */
  protected static final int VALUE_INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueINT() <em>Value INT</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueINT()
   * @generated
   * @ordered
   */
  protected int valueINT = VALUE_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getValueID() <em>Value ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueID()
   * @generated
   * @ordered
   */
  protected static final String VALUE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValueID() <em>Value ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueID()
   * @generated
   * @ordered
   */
  protected String valueID = VALUE_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getRefValue() <em>Ref Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefValue()
   * @generated
   * @ordered
   */
  protected Expression refValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberLiteralImpl()
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
    return DslEChartsPackage.Literals.NUMBER_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValueINT()
  {
    return valueINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueINT(int newValueINT)
  {
    int oldValueINT = valueINT;
    valueINT = newValueINT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.NUMBER_LITERAL__VALUE_INT, oldValueINT, valueINT));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValueID()
  {
    return valueID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueID(String newValueID)
  {
    String oldValueID = valueID;
    valueID = newValueID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.NUMBER_LITERAL__VALUE_ID, oldValueID, valueID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRefValue()
  {
    if (refValue != null && refValue.eIsProxy())
    {
      InternalEObject oldRefValue = (InternalEObject)refValue;
      refValue = (Expression)eResolveProxy(oldRefValue);
      if (refValue != oldRefValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DslEChartsPackage.NUMBER_LITERAL__REF_VALUE, oldRefValue, refValue));
      }
    }
    return refValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression basicGetRefValue()
  {
    return refValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefValue(Expression newRefValue)
  {
    Expression oldRefValue = refValue;
    refValue = newRefValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslEChartsPackage.NUMBER_LITERAL__REF_VALUE, oldRefValue, refValue));
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
      case DslEChartsPackage.NUMBER_LITERAL__VALUE_INT:
        return getValueINT();
      case DslEChartsPackage.NUMBER_LITERAL__VALUE_ID:
        return getValueID();
      case DslEChartsPackage.NUMBER_LITERAL__REF_VALUE:
        if (resolve) return getRefValue();
        return basicGetRefValue();
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
      case DslEChartsPackage.NUMBER_LITERAL__VALUE_INT:
        setValueINT((Integer)newValue);
        return;
      case DslEChartsPackage.NUMBER_LITERAL__VALUE_ID:
        setValueID((String)newValue);
        return;
      case DslEChartsPackage.NUMBER_LITERAL__REF_VALUE:
        setRefValue((Expression)newValue);
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
      case DslEChartsPackage.NUMBER_LITERAL__VALUE_INT:
        setValueINT(VALUE_INT_EDEFAULT);
        return;
      case DslEChartsPackage.NUMBER_LITERAL__VALUE_ID:
        setValueID(VALUE_ID_EDEFAULT);
        return;
      case DslEChartsPackage.NUMBER_LITERAL__REF_VALUE:
        setRefValue((Expression)null);
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
      case DslEChartsPackage.NUMBER_LITERAL__VALUE_INT:
        return valueINT != VALUE_INT_EDEFAULT;
      case DslEChartsPackage.NUMBER_LITERAL__VALUE_ID:
        return VALUE_ID_EDEFAULT == null ? valueID != null : !VALUE_ID_EDEFAULT.equals(valueID);
      case DslEChartsPackage.NUMBER_LITERAL__REF_VALUE:
        return refValue != null;
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
    result.append(" (valueINT: ");
    result.append(valueINT);
    result.append(", valueID: ");
    result.append(valueID);
    result.append(')');
    return result.toString();
  }

} //NumberLiteralImpl
