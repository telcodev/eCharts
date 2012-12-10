/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.util;

import es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers;
import es.upm.gsi.ECharts.dslECharts.Action;
import es.upm.gsi.ECharts.dslECharts.ActionBlock;
import es.upm.gsi.ECharts.dslECharts.ActionStatement;
import es.upm.gsi.ECharts.dslECharts.Addtion;
import es.upm.gsi.ECharts.dslECharts.AssingExpression;
import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.Entry;
import es.upm.gsi.ECharts.dslECharts.Exit;
import es.upm.gsi.ECharts.dslECharts.Expression;
import es.upm.gsi.ECharts.dslECharts.ExternalMachine;
import es.upm.gsi.ECharts.dslECharts.HostBlock;
import es.upm.gsi.ECharts.dslECharts.Imports;
import es.upm.gsi.ECharts.dslECharts.InnerMachine;
import es.upm.gsi.ECharts.dslECharts.ListStates;
import es.upm.gsi.ECharts.dslECharts.Machine;
import es.upm.gsi.ECharts.dslECharts.MachineBody;
import es.upm.gsi.ECharts.dslECharts.MachineConstructor;
import es.upm.gsi.ECharts.dslECharts.MachineInvocation;
import es.upm.gsi.ECharts.dslECharts.MachineModifier;
import es.upm.gsi.ECharts.dslECharts.Multiplication;
import es.upm.gsi.ECharts.dslECharts.NumberLiteral;
import es.upm.gsi.ECharts.dslECharts.ReflectMachine;
import es.upm.gsi.ECharts.dslECharts.Root;
import es.upm.gsi.ECharts.dslECharts.SingleState;
import es.upm.gsi.ECharts.dslECharts.States;
import es.upm.gsi.ECharts.dslECharts.SubMachine;
import es.upm.gsi.ECharts.dslECharts.TargetTrn;
import es.upm.gsi.ECharts.dslECharts.Transition;
import es.upm.gsi.ECharts.dslECharts.Uno;
import es.upm.gsi.ECharts.dslECharts.VariableMachine;
import es.upm.gsi.ECharts.dslECharts.paramsDeclaration;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage
 * @generated
 */
public class DslEChartsSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslEChartsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslEChartsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DslEChartsPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DslEChartsPackage.ROOT:
      {
        Root root = (Root)theEObject;
        T result = caseRoot(root);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.PACKAGE:
      {
        es.upm.gsi.ECharts.dslECharts.Package package_ = (es.upm.gsi.ECharts.dslECharts.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.IMPORTS:
      {
        Imports imports = (Imports)theEObject;
        T result = caseImports(imports);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.MACHINE:
      {
        Machine machine = (Machine)theEObject;
        T result = caseMachine(machine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.MACHINE_BODY:
      {
        MachineBody machineBody = (MachineBody)theEObject;
        T result = caseMachineBody(machineBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS:
      {
        AccessAndMachineModifiers accessAndMachineModifiers = (AccessAndMachineModifiers)theEObject;
        T result = caseAccessAndMachineModifiers(accessAndMachineModifiers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.MACHINE_MODIFIER:
      {
        MachineModifier machineModifier = (MachineModifier)theEObject;
        T result = caseMachineModifier(machineModifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.STATES:
      {
        States states = (States)theEObject;
        T result = caseStates(states);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.ENTRY:
      {
        Entry entry = (Entry)theEObject;
        T result = caseEntry(entry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.EXIT:
      {
        Exit exit = (Exit)theEObject;
        T result = caseExit(exit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.MACHINE_CONSTRUCTOR:
      {
        MachineConstructor machineConstructor = (MachineConstructor)theEObject;
        T result = caseMachineConstructor(machineConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.MACHINE_INVOCATION:
      {
        MachineInvocation machineInvocation = (MachineInvocation)theEObject;
        T result = caseMachineInvocation(machineInvocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.PARAMS_DECLARATION:
      {
        paramsDeclaration paramsDeclaration = (paramsDeclaration)theEObject;
        T result = caseparamsDeclaration(paramsDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseAssingExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.ASSING_EXPRESSION:
      {
        AssingExpression assingExpression = (AssingExpression)theEObject;
        T result = caseAssingExpression(assingExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = caseAssingExpression(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.ACTION_BLOCK:
      {
        ActionBlock actionBlock = (ActionBlock)theEObject;
        T result = caseActionBlock(actionBlock);
        if (result == null) result = caseAction(actionBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.ACTION_STATEMENT:
      {
        ActionStatement actionStatement = (ActionStatement)theEObject;
        T result = caseActionStatement(actionStatement);
        if (result == null) result = caseAction(actionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.TARGET_TRN:
      {
        TargetTrn targetTrn = (TargetTrn)theEObject;
        T result = caseTargetTrn(targetTrn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.SINGLE_STATE:
      {
        SingleState singleState = (SingleState)theEObject;
        T result = caseSingleState(singleState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.LIST_STATES:
      {
        ListStates listStates = (ListStates)theEObject;
        T result = caseListStates(listStates);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.HOST_BLOCK:
      {
        HostBlock hostBlock = (HostBlock)theEObject;
        T result = caseHostBlock(hostBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.SUB_MACHINE:
      {
        SubMachine subMachine = (SubMachine)theEObject;
        T result = caseSubMachine(subMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.INNER_MACHINE:
      {
        InnerMachine innerMachine = (InnerMachine)theEObject;
        T result = caseInnerMachine(innerMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.EXTERNAL_MACHINE:
      {
        ExternalMachine externalMachine = (ExternalMachine)theEObject;
        T result = caseExternalMachine(externalMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.REFLECT_MACHINE:
      {
        ReflectMachine reflectMachine = (ReflectMachine)theEObject;
        T result = caseReflectMachine(reflectMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.VARIABLE_MACHINE:
      {
        VariableMachine variableMachine = (VariableMachine)theEObject;
        T result = caseVariableMachine(variableMachine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.UNO:
      {
        Uno uno = (Uno)theEObject;
        T result = caseUno(uno);
        if (result == null) result = caseMachineBody(uno);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.ADDTION:
      {
        Addtion addtion = (Addtion)theEObject;
        T result = caseAddtion(addtion);
        if (result == null) result = caseExpression(addtion);
        if (result == null) result = caseAssingExpression(addtion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DslEChartsPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = caseExpression(multiplication);
        if (result == null) result = caseAssingExpression(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRoot(Root object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(es.upm.gsi.ECharts.dslECharts.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImports(Imports object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMachine(Machine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Machine Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Machine Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMachineBody(MachineBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Access And Machine Modifiers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Access And Machine Modifiers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessAndMachineModifiers(AccessAndMachineModifiers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Machine Modifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Machine Modifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMachineModifier(MachineModifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>States</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>States</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStates(States object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntry(Entry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExit(Exit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Machine Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Machine Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMachineConstructor(MachineConstructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Machine Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Machine Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMachineInvocation(MachineInvocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>params Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>params Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparamsDeclaration(paramsDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assing Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assing Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssingExpression(AssingExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionBlock(ActionBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionStatement(ActionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Trn</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Trn</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetTrn(TargetTrn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleState(SingleState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List States</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List States</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListStates(ListStates object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Host Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Host Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHostBlock(HostBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubMachine(SubMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Inner Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inner Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInnerMachine(InnerMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalMachine(ExternalMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reflect Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reflect Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReflectMachine(ReflectMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Machine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Machine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableMachine(VariableMachine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uno</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uno</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUno(Uno object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Addtion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Addtion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddtion(Addtion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DslEChartsSwitch
