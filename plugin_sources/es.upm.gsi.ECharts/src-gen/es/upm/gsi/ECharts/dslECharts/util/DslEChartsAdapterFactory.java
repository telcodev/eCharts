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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsPackage
 * @generated
 */
public class DslEChartsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DslEChartsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslEChartsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DslEChartsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DslEChartsSwitch<Adapter> modelSwitch =
    new DslEChartsSwitch<Adapter>()
    {
      @Override
      public Adapter caseRoot(Root object)
      {
        return createRootAdapter();
      }
      @Override
      public Adapter casePackage(es.upm.gsi.ECharts.dslECharts.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseImports(Imports object)
      {
        return createImportsAdapter();
      }
      @Override
      public Adapter caseMachine(Machine object)
      {
        return createMachineAdapter();
      }
      @Override
      public Adapter caseMachineBody(MachineBody object)
      {
        return createMachineBodyAdapter();
      }
      @Override
      public Adapter caseAccessAndMachineModifiers(AccessAndMachineModifiers object)
      {
        return createAccessAndMachineModifiersAdapter();
      }
      @Override
      public Adapter caseMachineModifier(MachineModifier object)
      {
        return createMachineModifierAdapter();
      }
      @Override
      public Adapter caseStates(States object)
      {
        return createStatesAdapter();
      }
      @Override
      public Adapter caseEntry(Entry object)
      {
        return createEntryAdapter();
      }
      @Override
      public Adapter caseExit(Exit object)
      {
        return createExitAdapter();
      }
      @Override
      public Adapter caseMachineConstructor(MachineConstructor object)
      {
        return createMachineConstructorAdapter();
      }
      @Override
      public Adapter caseMachineInvocation(MachineInvocation object)
      {
        return createMachineInvocationAdapter();
      }
      @Override
      public Adapter caseparamsDeclaration(paramsDeclaration object)
      {
        return createparamsDeclarationAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAssingExpression(AssingExpression object)
      {
        return createAssingExpressionAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseActionBlock(ActionBlock object)
      {
        return createActionBlockAdapter();
      }
      @Override
      public Adapter caseActionStatement(ActionStatement object)
      {
        return createActionStatementAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseTargetTrn(TargetTrn object)
      {
        return createTargetTrnAdapter();
      }
      @Override
      public Adapter caseSingleState(SingleState object)
      {
        return createSingleStateAdapter();
      }
      @Override
      public Adapter caseListStates(ListStates object)
      {
        return createListStatesAdapter();
      }
      @Override
      public Adapter caseHostBlock(HostBlock object)
      {
        return createHostBlockAdapter();
      }
      @Override
      public Adapter caseSubMachine(SubMachine object)
      {
        return createSubMachineAdapter();
      }
      @Override
      public Adapter caseInnerMachine(InnerMachine object)
      {
        return createInnerMachineAdapter();
      }
      @Override
      public Adapter caseExternalMachine(ExternalMachine object)
      {
        return createExternalMachineAdapter();
      }
      @Override
      public Adapter caseReflectMachine(ReflectMachine object)
      {
        return createReflectMachineAdapter();
      }
      @Override
      public Adapter caseVariableMachine(VariableMachine object)
      {
        return createVariableMachineAdapter();
      }
      @Override
      public Adapter caseUno(Uno object)
      {
        return createUnoAdapter();
      }
      @Override
      public Adapter caseAddtion(Addtion object)
      {
        return createAddtionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Root
   * @generated
   */
  public Adapter createRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Imports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Imports
   * @generated
   */
  public Adapter createImportsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Machine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Machine
   * @generated
   */
  public Adapter createMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.MachineBody <em>Machine Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.MachineBody
   * @generated
   */
  public Adapter createMachineBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers <em>Access And Machine Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers
   * @generated
   */
  public Adapter createAccessAndMachineModifiersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.MachineModifier <em>Machine Modifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.MachineModifier
   * @generated
   */
  public Adapter createMachineModifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.States
   * @generated
   */
  public Adapter createStatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Entry
   * @generated
   */
  public Adapter createEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Exit
   * @generated
   */
  public Adapter createExitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor <em>Machine Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.MachineConstructor
   * @generated
   */
  public Adapter createMachineConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.MachineInvocation <em>Machine Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.MachineInvocation
   * @generated
   */
  public Adapter createMachineInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.paramsDeclaration <em>params Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.paramsDeclaration
   * @generated
   */
  public Adapter createparamsDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.AssingExpression <em>Assing Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.AssingExpression
   * @generated
   */
  public Adapter createAssingExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.ActionBlock <em>Action Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.ActionBlock
   * @generated
   */
  public Adapter createActionBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.ActionStatement
   * @generated
   */
  public Adapter createActionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.TargetTrn <em>Target Trn</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.TargetTrn
   * @generated
   */
  public Adapter createTargetTrnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.SingleState <em>Single State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.SingleState
   * @generated
   */
  public Adapter createSingleStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.ListStates <em>List States</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.ListStates
   * @generated
   */
  public Adapter createListStatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.HostBlock <em>Host Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.HostBlock
   * @generated
   */
  public Adapter createHostBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.SubMachine <em>Sub Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.SubMachine
   * @generated
   */
  public Adapter createSubMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.InnerMachine <em>Inner Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.InnerMachine
   * @generated
   */
  public Adapter createInnerMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.ExternalMachine <em>External Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.ExternalMachine
   * @generated
   */
  public Adapter createExternalMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.ReflectMachine <em>Reflect Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.ReflectMachine
   * @generated
   */
  public Adapter createReflectMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.VariableMachine <em>Variable Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.VariableMachine
   * @generated
   */
  public Adapter createVariableMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Uno <em>Uno</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Uno
   * @generated
   */
  public Adapter createUnoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Addtion <em>Addtion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Addtion
   * @generated
   */
  public Adapter createAddtionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link es.upm.gsi.ECharts.dslECharts.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see es.upm.gsi.ECharts.dslECharts.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DslEChartsAdapterFactory
