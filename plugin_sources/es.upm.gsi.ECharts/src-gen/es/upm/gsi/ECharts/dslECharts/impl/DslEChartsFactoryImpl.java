/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts.impl;

import es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers;
import es.upm.gsi.ECharts.dslECharts.AccessModifiers;
import es.upm.gsi.ECharts.dslECharts.Action;
import es.upm.gsi.ECharts.dslECharts.ActionBlock;
import es.upm.gsi.ECharts.dslECharts.ActionStatement;
import es.upm.gsi.ECharts.dslECharts.Addtion;
import es.upm.gsi.ECharts.dslECharts.AssingExpression;
import es.upm.gsi.ECharts.dslECharts.DslEChartsFactory;
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
import es.upm.gsi.ECharts.dslECharts.StateModifiers;
import es.upm.gsi.ECharts.dslECharts.States;
import es.upm.gsi.ECharts.dslECharts.SubMachine;
import es.upm.gsi.ECharts.dslECharts.TargetTrn;
import es.upm.gsi.ECharts.dslECharts.Transition;
import es.upm.gsi.ECharts.dslECharts.Uno;
import es.upm.gsi.ECharts.dslECharts.VariableMachine;
import es.upm.gsi.ECharts.dslECharts.paramsDeclaration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslEChartsFactoryImpl extends EFactoryImpl implements DslEChartsFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DslEChartsFactory init()
  {
    try
    {
      DslEChartsFactory theDslEChartsFactory = (DslEChartsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.upm.es/gsi/ECharts/DslECharts"); 
      if (theDslEChartsFactory != null)
      {
        return theDslEChartsFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DslEChartsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslEChartsFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DslEChartsPackage.ROOT: return createRoot();
      case DslEChartsPackage.PACKAGE: return createPackage();
      case DslEChartsPackage.IMPORTS: return createImports();
      case DslEChartsPackage.MACHINE: return createMachine();
      case DslEChartsPackage.MACHINE_BODY: return createMachineBody();
      case DslEChartsPackage.ACCESS_AND_MACHINE_MODIFIERS: return createAccessAndMachineModifiers();
      case DslEChartsPackage.MACHINE_MODIFIER: return createMachineModifier();
      case DslEChartsPackage.STATES: return createStates();
      case DslEChartsPackage.ENTRY: return createEntry();
      case DslEChartsPackage.EXIT: return createExit();
      case DslEChartsPackage.MACHINE_CONSTRUCTOR: return createMachineConstructor();
      case DslEChartsPackage.MACHINE_INVOCATION: return createMachineInvocation();
      case DslEChartsPackage.PARAMS_DECLARATION: return createparamsDeclaration();
      case DslEChartsPackage.EXPRESSION: return createExpression();
      case DslEChartsPackage.ASSING_EXPRESSION: return createAssingExpression();
      case DslEChartsPackage.NUMBER_LITERAL: return createNumberLiteral();
      case DslEChartsPackage.ACTION: return createAction();
      case DslEChartsPackage.ACTION_BLOCK: return createActionBlock();
      case DslEChartsPackage.ACTION_STATEMENT: return createActionStatement();
      case DslEChartsPackage.TRANSITION: return createTransition();
      case DslEChartsPackage.TARGET_TRN: return createTargetTrn();
      case DslEChartsPackage.SINGLE_STATE: return createSingleState();
      case DslEChartsPackage.LIST_STATES: return createListStates();
      case DslEChartsPackage.HOST_BLOCK: return createHostBlock();
      case DslEChartsPackage.SUB_MACHINE: return createSubMachine();
      case DslEChartsPackage.INNER_MACHINE: return createInnerMachine();
      case DslEChartsPackage.EXTERNAL_MACHINE: return createExternalMachine();
      case DslEChartsPackage.REFLECT_MACHINE: return createReflectMachine();
      case DslEChartsPackage.VARIABLE_MACHINE: return createVariableMachine();
      case DslEChartsPackage.UNO: return createUno();
      case DslEChartsPackage.ADDTION: return createAddtion();
      case DslEChartsPackage.MULTIPLICATION: return createMultiplication();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DslEChartsPackage.ACCESS_MODIFIERS:
        return createAccessModifiersFromString(eDataType, initialValue);
      case DslEChartsPackage.STATE_MODIFIERS:
        return createStateModifiersFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DslEChartsPackage.ACCESS_MODIFIERS:
        return convertAccessModifiersToString(eDataType, instanceValue);
      case DslEChartsPackage.STATE_MODIFIERS:
        return convertStateModifiersToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Root createRoot()
  {
    RootImpl root = new RootImpl();
    return root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public es.upm.gsi.ECharts.dslECharts.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imports createImports()
  {
    ImportsImpl imports = new ImportsImpl();
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Machine createMachine()
  {
    MachineImpl machine = new MachineImpl();
    return machine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineBody createMachineBody()
  {
    MachineBodyImpl machineBody = new MachineBodyImpl();
    return machineBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessAndMachineModifiers createAccessAndMachineModifiers()
  {
    AccessAndMachineModifiersImpl accessAndMachineModifiers = new AccessAndMachineModifiersImpl();
    return accessAndMachineModifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineModifier createMachineModifier()
  {
    MachineModifierImpl machineModifier = new MachineModifierImpl();
    return machineModifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States createStates()
  {
    StatesImpl states = new StatesImpl();
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entry createEntry()
  {
    EntryImpl entry = new EntryImpl();
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exit createExit()
  {
    ExitImpl exit = new ExitImpl();
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineConstructor createMachineConstructor()
  {
    MachineConstructorImpl machineConstructor = new MachineConstructorImpl();
    return machineConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineInvocation createMachineInvocation()
  {
    MachineInvocationImpl machineInvocation = new MachineInvocationImpl();
    return machineInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public paramsDeclaration createparamsDeclaration()
  {
    paramsDeclarationImpl paramsDeclaration = new paramsDeclarationImpl();
    return paramsDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssingExpression createAssingExpression()
  {
    AssingExpressionImpl assingExpression = new AssingExpressionImpl();
    return assingExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionBlock createActionBlock()
  {
    ActionBlockImpl actionBlock = new ActionBlockImpl();
    return actionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionStatement createActionStatement()
  {
    ActionStatementImpl actionStatement = new ActionStatementImpl();
    return actionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TargetTrn createTargetTrn()
  {
    TargetTrnImpl targetTrn = new TargetTrnImpl();
    return targetTrn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleState createSingleState()
  {
    SingleStateImpl singleState = new SingleStateImpl();
    return singleState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListStates createListStates()
  {
    ListStatesImpl listStates = new ListStatesImpl();
    return listStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostBlock createHostBlock()
  {
    HostBlockImpl hostBlock = new HostBlockImpl();
    return hostBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubMachine createSubMachine()
  {
    SubMachineImpl subMachine = new SubMachineImpl();
    return subMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InnerMachine createInnerMachine()
  {
    InnerMachineImpl innerMachine = new InnerMachineImpl();
    return innerMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalMachine createExternalMachine()
  {
    ExternalMachineImpl externalMachine = new ExternalMachineImpl();
    return externalMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReflectMachine createReflectMachine()
  {
    ReflectMachineImpl reflectMachine = new ReflectMachineImpl();
    return reflectMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableMachine createVariableMachine()
  {
    VariableMachineImpl variableMachine = new VariableMachineImpl();
    return variableMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Uno createUno()
  {
    UnoImpl uno = new UnoImpl();
    return uno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Addtion createAddtion()
  {
    AddtionImpl addtion = new AddtionImpl();
    return addtion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessModifiers createAccessModifiersFromString(EDataType eDataType, String initialValue)
  {
    AccessModifiers result = AccessModifiers.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAccessModifiersToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateModifiers createStateModifiersFromString(EDataType eDataType, String initialValue)
  {
    StateModifiers result = StateModifiers.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStateModifiersToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslEChartsPackage getDslEChartsPackage()
  {
    return (DslEChartsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DslEChartsPackage getPackage()
  {
    return DslEChartsPackage.eINSTANCE;
  }

} //DslEChartsFactoryImpl
