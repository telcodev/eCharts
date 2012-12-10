/**
 * <copyright>
 * </copyright>
 *
 */
package es.upm.gsi.ECharts.dslECharts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.upm.gsi.ECharts.dslECharts.DslEChartsFactory
 * @model kind="package"
 * @generated
 */
public interface DslEChartsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dslECharts";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.upm.es/gsi/ECharts/DslECharts";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dslECharts";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslEChartsPackage eINSTANCE = es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl.init();

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.RootImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Machine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__MACHINE = 2;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.PackageImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ImportsImpl <em>Imports</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ImportsImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getImports()
   * @generated
   */
  int IMPORTS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS__NAME = 0;

  /**
   * The number of structural features of the '<em>Imports</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineImpl <em>Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.MachineImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachine()
   * @generated
   */
  int MACHINE = 3;

  /**
   * The feature id for the '<em><b>Access And Machine Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE__ACCESS_AND_MACHINE_MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE__NAME = 1;

  /**
   * The feature id for the '<em><b>Machine Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE__MACHINE_BODY = 2;

  /**
   * The number of structural features of the '<em>Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineBodyImpl <em>Machine Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.MachineBodyImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachineBody()
   * @generated
   */
  int MACHINE_BODY = 4;

  /**
   * The feature id for the '<em><b>Host Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__HOST_BLOCK = 0;

  /**
   * The feature id for the '<em><b>Machine Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__MACHINE_CONSTRUCTOR = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__STATES = 2;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__TRANSITION = 3;

  /**
   * The number of structural features of the '<em>Machine Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.AccessAndMachineModifiersImpl <em>Access And Machine Modifiers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.AccessAndMachineModifiersImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAccessAndMachineModifiers()
   * @generated
   */
  int ACCESS_AND_MACHINE_MODIFIERS = 5;

  /**
   * The feature id for the '<em><b>Access Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_AND_MACHINE_MODIFIERS__ACCESS_MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Machine Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER = 1;

  /**
   * The number of structural features of the '<em>Access And Machine Modifiers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_AND_MACHINE_MODIFIERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineModifierImpl <em>Machine Modifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.MachineModifierImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachineModifier()
   * @generated
   */
  int MACHINE_MODIFIER = 6;

  /**
   * The feature id for the '<em><b>Concurrent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_MODIFIER__CONCURRENT = 0;

  /**
   * The number of structural features of the '<em>Machine Modifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_MODIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.StatesImpl <em>States</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.StatesImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getStates()
   * @generated
   */
  int STATES = 7;

  /**
   * The feature id for the '<em><b>State Mods</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__STATE_MODS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__NAME = 1;

  /**
   * The feature id for the '<em><b>En</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__EN = 2;

  /**
   * The feature id for the '<em><b>Ex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__EX = 3;

  /**
   * The feature id for the '<em><b>Submachine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__SUBMACHINE = 4;

  /**
   * The feature id for the '<em><b>Machine Invocations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__MACHINE_INVOCATIONS = 5;

  /**
   * The number of structural features of the '<em>States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.EntryImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 8;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__A = 0;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ExitImpl <em>Exit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ExitImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getExit()
   * @generated
   */
  int EXIT = 9;

  /**
   * The feature id for the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT__A = 0;

  /**
   * The number of structural features of the '<em>Exit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXIT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineConstructorImpl <em>Machine Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.MachineConstructorImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachineConstructor()
   * @generated
   */
  int MACHINE_CONSTRUCTOR = 10;

  /**
   * The feature id for the '<em><b>Machine Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_CONSTRUCTOR__MACHINE_NAME = 0;

  /**
   * The feature id for the '<em><b>Params Machine</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_CONSTRUCTOR__PARAMS_MACHINE = 1;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_CONSTRUCTOR__EXPR = 2;

  /**
   * The number of structural features of the '<em>Machine Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_CONSTRUCTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineInvocationImpl <em>Machine Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.MachineInvocationImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachineInvocation()
   * @generated
   */
  int MACHINE_INVOCATION = 11;

  /**
   * The number of structural features of the '<em>Machine Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_INVOCATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.paramsDeclarationImpl <em>params Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.paramsDeclarationImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getparamsDeclaration()
   * @generated
   */
  int PARAMS_DECLARATION = 12;

  /**
   * The feature id for the '<em><b>Paramtype</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_DECLARATION__PARAMTYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>params Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.AssingExpressionImpl <em>Assing Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.AssingExpressionImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAssingExpression()
   * @generated
   */
  int ASSING_EXPRESSION = 14;

  /**
   * The number of structural features of the '<em>Assing Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSING_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ExpressionImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME = ASSING_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SECOND = ASSING_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = ASSING_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.NumberLiteralImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__NAME = EXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__SECOND = EXPRESSION__SECOND;

  /**
   * The feature id for the '<em><b>Value INT</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE_INT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE_ID = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Ref Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__REF_VALUE = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ActionImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAction()
   * @generated
   */
  int ACTION = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ActionBlockImpl <em>Action Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ActionBlockImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getActionBlock()
   * @generated
   */
  int ACTION_BLOCK = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_BLOCK__NAME = ACTION__NAME;

  /**
   * The number of structural features of the '<em>Action Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_BLOCK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ActionStatementImpl <em>Action Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ActionStatementImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getActionStatement()
   * @generated
   */
  int ACTION_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT__NAME = ACTION__NAME;

  /**
   * The number of structural features of the '<em>Action Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_STATEMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.TransitionImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 19;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__FROM = 0;

  /**
   * The feature id for the '<em><b>At</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__AT = 1;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TO = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.TargetTrnImpl <em>Target Trn</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.TargetTrnImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getTargetTrn()
   * @generated
   */
  int TARGET_TRN = 20;

  /**
   * The feature id for the '<em><b>From To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TRN__FROM_TO = 0;

  /**
   * The feature id for the '<em><b>From To List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TRN__FROM_TO_LIST = 1;

  /**
   * The number of structural features of the '<em>Target Trn</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_TRN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.SingleStateImpl <em>Single State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.SingleStateImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getSingleState()
   * @generated
   */
  int SINGLE_STATE = 21;

  /**
   * The feature id for the '<em><b>From To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATE__FROM_TO = 0;

  /**
   * The number of structural features of the '<em>Single State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ListStatesImpl <em>List States</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ListStatesImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getListStates()
   * @generated
   */
  int LIST_STATES = 22;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_STATES__LIST = 0;

  /**
   * The number of structural features of the '<em>List States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_STATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.HostBlockImpl <em>Host Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.HostBlockImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getHostBlock()
   * @generated
   */
  int HOST_BLOCK = 23;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_BLOCK__TEXT = 0;

  /**
   * The number of structural features of the '<em>Host Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.SubMachineImpl <em>Sub Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.SubMachineImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getSubMachine()
   * @generated
   */
  int SUB_MACHINE = 24;

  /**
   * The feature id for the '<em><b>Machine Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MACHINE__MACHINE_MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Machine Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MACHINE__MACHINE_BODY = 1;

  /**
   * The number of structural features of the '<em>Sub Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MACHINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.InnerMachineImpl <em>Inner Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.InnerMachineImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getInnerMachine()
   * @generated
   */
  int INNER_MACHINE = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_MACHINE__NAME = 0;

  /**
   * The number of structural features of the '<em>Inner Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INNER_MACHINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ExternalMachineImpl <em>External Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ExternalMachineImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getExternalMachine()
   * @generated
   */
  int EXTERNAL_MACHINE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_MACHINE__NAME = 0;

  /**
   * The number of structural features of the '<em>External Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_MACHINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ReflectMachineImpl <em>Reflect Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.ReflectMachineImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getReflectMachine()
   * @generated
   */
  int REFLECT_MACHINE = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECT_MACHINE__NAME = 0;

  /**
   * The number of structural features of the '<em>Reflect Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLECT_MACHINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.VariableMachineImpl <em>Variable Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.VariableMachineImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getVariableMachine()
   * @generated
   */
  int VARIABLE_MACHINE = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MACHINE__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_MACHINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.UnoImpl <em>Uno</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.UnoImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getUno()
   * @generated
   */
  int UNO = 29;

  /**
   * The feature id for the '<em><b>Host Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__HOST_BLOCK = MACHINE_BODY__HOST_BLOCK;

  /**
   * The feature id for the '<em><b>Machine Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__MACHINE_CONSTRUCTOR = MACHINE_BODY__MACHINE_CONSTRUCTOR;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__STATES = MACHINE_BODY__STATES;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__TRANSITION = MACHINE_BODY__TRANSITION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__LEFT = MACHINE_BODY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO__RIGHT = MACHINE_BODY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Uno</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNO_FEATURE_COUNT = MACHINE_BODY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.AddtionImpl <em>Addtion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.AddtionImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAddtion()
   * @generated
   */
  int ADDTION = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDTION__NAME = EXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDTION__SECOND = EXPRESSION__SECOND;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDTION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDTION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Addtion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.impl.MultiplicationImpl
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__NAME = EXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Second</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__SECOND = EXPRESSION__SECOND;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.AccessModifiers <em>Access Modifiers</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.AccessModifiers
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAccessModifiers()
   * @generated
   */
  int ACCESS_MODIFIERS = 32;

  /**
   * The meta object id for the '{@link es.upm.gsi.ECharts.dslECharts.StateModifiers <em>State Modifiers</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see es.upm.gsi.ECharts.dslECharts.StateModifiers
   * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getStateModifiers()
   * @generated
   */
  int STATE_MODIFIERS = 33;


  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Root#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Root#getPackage()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Package();

  /**
   * Returns the meta object for the containment reference list '{@link es.upm.gsi.ECharts.dslECharts.Root#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Root#getImports()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link es.upm.gsi.ECharts.dslECharts.Root#getMachine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Machine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Root#getMachine()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Machine();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Imports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Imports</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Imports
   * @generated
   */
  EClass getImports();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.Imports#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Imports#getName()
   * @see #getImports()
   * @generated
   */
  EAttribute getImports_Name();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Machine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Machine
   * @generated
   */
  EClass getMachine();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Machine#getAccessAndMachineModifier <em>Access And Machine Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access And Machine Modifier</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Machine#getAccessAndMachineModifier()
   * @see #getMachine()
   * @generated
   */
  EReference getMachine_AccessAndMachineModifier();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.Machine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Machine#getName()
   * @see #getMachine()
   * @generated
   */
  EAttribute getMachine_Name();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Machine#getMachineBody <em>Machine Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Machine Body</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Machine#getMachineBody()
   * @see #getMachine()
   * @generated
   */
  EReference getMachine_MachineBody();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.MachineBody <em>Machine Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Body</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineBody
   * @generated
   */
  EClass getMachineBody();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getHostBlock <em>Host Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Host Block</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineBody#getHostBlock()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_HostBlock();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getMachineConstructor <em>Machine Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Machine Constructor</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineBody#getMachineConstructor()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_MachineConstructor();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>States</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineBody#getStates()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_States();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.MachineBody#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transition</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineBody#getTransition()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_Transition();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers <em>Access And Machine Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Access And Machine Modifiers</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers
   * @generated
   */
  EClass getAccessAndMachineModifiers();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers#getAccessModifier <em>Access Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access Modifier</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers#getAccessModifier()
   * @see #getAccessAndMachineModifiers()
   * @generated
   */
  EAttribute getAccessAndMachineModifiers_AccessModifier();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers#getMachineModifier <em>Machine Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Machine Modifier</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.AccessAndMachineModifiers#getMachineModifier()
   * @see #getAccessAndMachineModifiers()
   * @generated
   */
  EReference getAccessAndMachineModifiers_MachineModifier();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.MachineModifier <em>Machine Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Modifier</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineModifier
   * @generated
   */
  EClass getMachineModifier();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.MachineModifier#getConcurrent <em>Concurrent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Concurrent</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineModifier#getConcurrent()
   * @see #getMachineModifier()
   * @generated
   */
  EAttribute getMachineModifier_Concurrent();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.States
   * @generated
   */
  EClass getStates();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.States#getStateMods <em>State Mods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Mods</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.States#getStateMods()
   * @see #getStates()
   * @generated
   */
  EAttribute getStates_StateMods();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.States#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.States#getName()
   * @see #getStates()
   * @generated
   */
  EAttribute getStates_Name();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.States#getEn <em>En</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>En</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.States#getEn()
   * @see #getStates()
   * @generated
   */
  EReference getStates_En();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.States#getEx <em>Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ex</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.States#getEx()
   * @see #getStates()
   * @generated
   */
  EReference getStates_Ex();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.States#getSubmachine <em>Submachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Submachine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.States#getSubmachine()
   * @see #getStates()
   * @generated
   */
  EReference getStates_Submachine();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.States#getMachineInvocations <em>Machine Invocations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Machine Invocations</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.States#getMachineInvocations()
   * @see #getStates()
   * @generated
   */
  EReference getStates_MachineInvocations();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Entry#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Entry#getA()
   * @see #getEntry()
   * @generated
   */
  EReference getEntry_A();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Exit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exit</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Exit
   * @generated
   */
  EClass getExit();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Exit#getA <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>A</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Exit#getA()
   * @see #getExit()
   * @generated
   */
  EReference getExit_A();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor <em>Machine Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Constructor</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineConstructor
   * @generated
   */
  EClass getMachineConstructor();

  /**
   * Returns the meta object for the reference '{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor#getMachineName <em>Machine Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Machine Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineConstructor#getMachineName()
   * @see #getMachineConstructor()
   * @generated
   */
  EReference getMachineConstructor_MachineName();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor#getParamsMachine <em>Params Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Params Machine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineConstructor#getParamsMachine()
   * @see #getMachineConstructor()
   * @generated
   */
  EReference getMachineConstructor_ParamsMachine();

  /**
   * Returns the meta object for the containment reference list '{@link es.upm.gsi.ECharts.dslECharts.MachineConstructor#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineConstructor#getExpr()
   * @see #getMachineConstructor()
   * @generated
   */
  EReference getMachineConstructor_Expr();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.MachineInvocation <em>Machine Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Invocation</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.MachineInvocation
   * @generated
   */
  EClass getMachineInvocation();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.paramsDeclaration <em>params Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>params Declaration</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.paramsDeclaration
   * @generated
   */
  EClass getparamsDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link es.upm.gsi.ECharts.dslECharts.paramsDeclaration#getParamtype <em>Paramtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Paramtype</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.paramsDeclaration#getParamtype()
   * @see #getparamsDeclaration()
   * @generated
   */
  EAttribute getparamsDeclaration_Paramtype();

  /**
   * Returns the meta object for the attribute list '{@link es.upm.gsi.ECharts.dslECharts.paramsDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.paramsDeclaration#getName()
   * @see #getparamsDeclaration()
   * @generated
   */
  EAttribute getparamsDeclaration_Name();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.Expression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Expression#getName()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Name();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Expression#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Expression#getSecond()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Second();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.AssingExpression <em>Assing Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assing Expression</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.AssingExpression
   * @generated
   */
  EClass getAssingExpression();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getValueINT <em>Value INT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value INT</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.NumberLiteral#getValueINT()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_ValueINT();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getValueID <em>Value ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value ID</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.NumberLiteral#getValueID()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_ValueID();

  /**
   * Returns the meta object for the reference '{@link es.upm.gsi.ECharts.dslECharts.NumberLiteral#getRefValue <em>Ref Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref Value</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.NumberLiteral#getRefValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EReference getNumberLiteral_RefValue();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.ActionBlock <em>Action Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Block</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.ActionBlock
   * @generated
   */
  EClass getActionBlock();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Statement</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.ActionStatement
   * @generated
   */
  EClass getActionStatement();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Transition#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Transition#getFrom()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_From();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.Transition#getAt <em>At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>At</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Transition#getAt()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_At();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Transition#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Transition#getTo()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_To();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.TargetTrn <em>Target Trn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Trn</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.TargetTrn
   * @generated
   */
  EClass getTargetTrn();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.TargetTrn#getFromTo <em>From To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From To</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.TargetTrn#getFromTo()
   * @see #getTargetTrn()
   * @generated
   */
  EReference getTargetTrn_FromTo();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.TargetTrn#getFromToList <em>From To List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From To List</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.TargetTrn#getFromToList()
   * @see #getTargetTrn()
   * @generated
   */
  EReference getTargetTrn_FromToList();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.SingleState <em>Single State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single State</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.SingleState
   * @generated
   */
  EClass getSingleState();

  /**
   * Returns the meta object for the reference '{@link es.upm.gsi.ECharts.dslECharts.SingleState#getFromTo <em>From To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From To</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.SingleState#getFromTo()
   * @see #getSingleState()
   * @generated
   */
  EReference getSingleState_FromTo();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.ListStates <em>List States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List States</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.ListStates
   * @generated
   */
  EClass getListStates();

  /**
   * Returns the meta object for the containment reference list '{@link es.upm.gsi.ECharts.dslECharts.ListStates#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.ListStates#getList()
   * @see #getListStates()
   * @generated
   */
  EReference getListStates_List();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.HostBlock <em>Host Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Host Block</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.HostBlock
   * @generated
   */
  EClass getHostBlock();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.HostBlock#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.HostBlock#getText()
   * @see #getHostBlock()
   * @generated
   */
  EAttribute getHostBlock_Text();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.SubMachine <em>Sub Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Machine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.SubMachine
   * @generated
   */
  EClass getSubMachine();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.SubMachine#getMachineModifier <em>Machine Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Machine Modifier</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.SubMachine#getMachineModifier()
   * @see #getSubMachine()
   * @generated
   */
  EReference getSubMachine_MachineModifier();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.SubMachine#getMachineBody <em>Machine Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Machine Body</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.SubMachine#getMachineBody()
   * @see #getSubMachine()
   * @generated
   */
  EReference getSubMachine_MachineBody();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.InnerMachine <em>Inner Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inner Machine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.InnerMachine
   * @generated
   */
  EClass getInnerMachine();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.InnerMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.InnerMachine#getName()
   * @see #getInnerMachine()
   * @generated
   */
  EAttribute getInnerMachine_Name();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.ExternalMachine <em>External Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Machine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.ExternalMachine
   * @generated
   */
  EClass getExternalMachine();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.ExternalMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.ExternalMachine#getName()
   * @see #getExternalMachine()
   * @generated
   */
  EAttribute getExternalMachine_Name();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.ReflectMachine <em>Reflect Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflect Machine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.ReflectMachine
   * @generated
   */
  EClass getReflectMachine();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.ReflectMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.ReflectMachine#getName()
   * @see #getReflectMachine()
   * @generated
   */
  EAttribute getReflectMachine_Name();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.VariableMachine <em>Variable Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Machine</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.VariableMachine
   * @generated
   */
  EClass getVariableMachine();

  /**
   * Returns the meta object for the attribute '{@link es.upm.gsi.ECharts.dslECharts.VariableMachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.VariableMachine#getName()
   * @see #getVariableMachine()
   * @generated
   */
  EAttribute getVariableMachine_Name();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Uno <em>Uno</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uno</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Uno
   * @generated
   */
  EClass getUno();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Uno#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Uno#getLeft()
   * @see #getUno()
   * @generated
   */
  EReference getUno_Left();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Uno#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Uno#getRight()
   * @see #getUno()
   * @generated
   */
  EReference getUno_Right();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Addtion <em>Addtion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Addtion</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Addtion
   * @generated
   */
  EClass getAddtion();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Addtion#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Addtion#getLeft()
   * @see #getAddtion()
   * @generated
   */
  EReference getAddtion_Left();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Addtion#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Addtion#getRight()
   * @see #getAddtion()
   * @generated
   */
  EReference getAddtion_Right();

  /**
   * Returns the meta object for class '{@link es.upm.gsi.ECharts.dslECharts.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Multiplication#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Multiplication#getLeft()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Left();

  /**
   * Returns the meta object for the containment reference '{@link es.upm.gsi.ECharts.dslECharts.Multiplication#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.Multiplication#getRight()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_Right();

  /**
   * Returns the meta object for enum '{@link es.upm.gsi.ECharts.dslECharts.AccessModifiers <em>Access Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Modifiers</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.AccessModifiers
   * @generated
   */
  EEnum getAccessModifiers();

  /**
   * Returns the meta object for enum '{@link es.upm.gsi.ECharts.dslECharts.StateModifiers <em>State Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State Modifiers</em>'.
   * @see es.upm.gsi.ECharts.dslECharts.StateModifiers
   * @generated
   */
  EEnum getStateModifiers();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslEChartsFactory getDslEChartsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.RootImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__PACKAGE = eINSTANCE.getRoot_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__IMPORTS = eINSTANCE.getRoot_Imports();

    /**
     * The meta object literal for the '<em><b>Machine</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__MACHINE = eINSTANCE.getRoot_Machine();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.PackageImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ImportsImpl <em>Imports</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ImportsImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getImports()
     * @generated
     */
    EClass IMPORTS = eINSTANCE.getImports();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORTS__NAME = eINSTANCE.getImports_Name();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineImpl <em>Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.MachineImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachine()
     * @generated
     */
    EClass MACHINE = eINSTANCE.getMachine();

    /**
     * The meta object literal for the '<em><b>Access And Machine Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE__ACCESS_AND_MACHINE_MODIFIER = eINSTANCE.getMachine_AccessAndMachineModifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MACHINE__NAME = eINSTANCE.getMachine_Name();

    /**
     * The meta object literal for the '<em><b>Machine Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE__MACHINE_BODY = eINSTANCE.getMachine_MachineBody();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineBodyImpl <em>Machine Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.MachineBodyImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachineBody()
     * @generated
     */
    EClass MACHINE_BODY = eINSTANCE.getMachineBody();

    /**
     * The meta object literal for the '<em><b>Host Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__HOST_BLOCK = eINSTANCE.getMachineBody_HostBlock();

    /**
     * The meta object literal for the '<em><b>Machine Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__MACHINE_CONSTRUCTOR = eINSTANCE.getMachineBody_MachineConstructor();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__STATES = eINSTANCE.getMachineBody_States();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__TRANSITION = eINSTANCE.getMachineBody_Transition();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.AccessAndMachineModifiersImpl <em>Access And Machine Modifiers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.AccessAndMachineModifiersImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAccessAndMachineModifiers()
     * @generated
     */
    EClass ACCESS_AND_MACHINE_MODIFIERS = eINSTANCE.getAccessAndMachineModifiers();

    /**
     * The meta object literal for the '<em><b>Access Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCESS_AND_MACHINE_MODIFIERS__ACCESS_MODIFIER = eINSTANCE.getAccessAndMachineModifiers_AccessModifier();

    /**
     * The meta object literal for the '<em><b>Machine Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCESS_AND_MACHINE_MODIFIERS__MACHINE_MODIFIER = eINSTANCE.getAccessAndMachineModifiers_MachineModifier();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineModifierImpl <em>Machine Modifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.MachineModifierImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachineModifier()
     * @generated
     */
    EClass MACHINE_MODIFIER = eINSTANCE.getMachineModifier();

    /**
     * The meta object literal for the '<em><b>Concurrent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MACHINE_MODIFIER__CONCURRENT = eINSTANCE.getMachineModifier_Concurrent();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.StatesImpl <em>States</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.StatesImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getStates()
     * @generated
     */
    EClass STATES = eINSTANCE.getStates();

    /**
     * The meta object literal for the '<em><b>State Mods</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATES__STATE_MODS = eINSTANCE.getStates_StateMods();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATES__NAME = eINSTANCE.getStates_Name();

    /**
     * The meta object literal for the '<em><b>En</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__EN = eINSTANCE.getStates_En();

    /**
     * The meta object literal for the '<em><b>Ex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__EX = eINSTANCE.getStates_Ex();

    /**
     * The meta object literal for the '<em><b>Submachine</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__SUBMACHINE = eINSTANCE.getStates_Submachine();

    /**
     * The meta object literal for the '<em><b>Machine Invocations</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__MACHINE_INVOCATIONS = eINSTANCE.getStates_MachineInvocations();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.EntryImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTRY__A = eINSTANCE.getEntry_A();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ExitImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getExit()
     * @generated
     */
    EClass EXIT = eINSTANCE.getExit();

    /**
     * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXIT__A = eINSTANCE.getExit_A();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineConstructorImpl <em>Machine Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.MachineConstructorImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachineConstructor()
     * @generated
     */
    EClass MACHINE_CONSTRUCTOR = eINSTANCE.getMachineConstructor();

    /**
     * The meta object literal for the '<em><b>Machine Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_CONSTRUCTOR__MACHINE_NAME = eINSTANCE.getMachineConstructor_MachineName();

    /**
     * The meta object literal for the '<em><b>Params Machine</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_CONSTRUCTOR__PARAMS_MACHINE = eINSTANCE.getMachineConstructor_ParamsMachine();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_CONSTRUCTOR__EXPR = eINSTANCE.getMachineConstructor_Expr();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MachineInvocationImpl <em>Machine Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.MachineInvocationImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMachineInvocation()
     * @generated
     */
    EClass MACHINE_INVOCATION = eINSTANCE.getMachineInvocation();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.paramsDeclarationImpl <em>params Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.paramsDeclarationImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getparamsDeclaration()
     * @generated
     */
    EClass PARAMS_DECLARATION = eINSTANCE.getparamsDeclaration();

    /**
     * The meta object literal for the '<em><b>Paramtype</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS_DECLARATION__PARAMTYPE = eINSTANCE.getparamsDeclaration_Paramtype();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMS_DECLARATION__NAME = eINSTANCE.getparamsDeclaration_Name();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ExpressionImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

    /**
     * The meta object literal for the '<em><b>Second</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__SECOND = eINSTANCE.getExpression_Second();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.AssingExpressionImpl <em>Assing Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.AssingExpressionImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAssingExpression()
     * @generated
     */
    EClass ASSING_EXPRESSION = eINSTANCE.getAssingExpression();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.NumberLiteralImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value INT</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE_INT = eINSTANCE.getNumberLiteral_ValueINT();

    /**
     * The meta object literal for the '<em><b>Value ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE_ID = eINSTANCE.getNumberLiteral_ValueID();

    /**
     * The meta object literal for the '<em><b>Ref Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_LITERAL__REF_VALUE = eINSTANCE.getNumberLiteral_RefValue();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ActionImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ActionBlockImpl <em>Action Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ActionBlockImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getActionBlock()
     * @generated
     */
    EClass ACTION_BLOCK = eINSTANCE.getActionBlock();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ActionStatementImpl <em>Action Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ActionStatementImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getActionStatement()
     * @generated
     */
    EClass ACTION_STATEMENT = eINSTANCE.getActionStatement();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.TransitionImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

    /**
     * The meta object literal for the '<em><b>At</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__AT = eINSTANCE.getTransition_At();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TO = eINSTANCE.getTransition_To();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.TargetTrnImpl <em>Target Trn</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.TargetTrnImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getTargetTrn()
     * @generated
     */
    EClass TARGET_TRN = eINSTANCE.getTargetTrn();

    /**
     * The meta object literal for the '<em><b>From To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_TRN__FROM_TO = eINSTANCE.getTargetTrn_FromTo();

    /**
     * The meta object literal for the '<em><b>From To List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TARGET_TRN__FROM_TO_LIST = eINSTANCE.getTargetTrn_FromToList();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.SingleStateImpl <em>Single State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.SingleStateImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getSingleState()
     * @generated
     */
    EClass SINGLE_STATE = eINSTANCE.getSingleState();

    /**
     * The meta object literal for the '<em><b>From To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STATE__FROM_TO = eINSTANCE.getSingleState_FromTo();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ListStatesImpl <em>List States</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ListStatesImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getListStates()
     * @generated
     */
    EClass LIST_STATES = eINSTANCE.getListStates();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_STATES__LIST = eINSTANCE.getListStates_List();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.HostBlockImpl <em>Host Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.HostBlockImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getHostBlock()
     * @generated
     */
    EClass HOST_BLOCK = eINSTANCE.getHostBlock();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOST_BLOCK__TEXT = eINSTANCE.getHostBlock_Text();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.SubMachineImpl <em>Sub Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.SubMachineImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getSubMachine()
     * @generated
     */
    EClass SUB_MACHINE = eINSTANCE.getSubMachine();

    /**
     * The meta object literal for the '<em><b>Machine Modifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_MACHINE__MACHINE_MODIFIER = eINSTANCE.getSubMachine_MachineModifier();

    /**
     * The meta object literal for the '<em><b>Machine Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_MACHINE__MACHINE_BODY = eINSTANCE.getSubMachine_MachineBody();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.InnerMachineImpl <em>Inner Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.InnerMachineImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getInnerMachine()
     * @generated
     */
    EClass INNER_MACHINE = eINSTANCE.getInnerMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INNER_MACHINE__NAME = eINSTANCE.getInnerMachine_Name();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ExternalMachineImpl <em>External Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ExternalMachineImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getExternalMachine()
     * @generated
     */
    EClass EXTERNAL_MACHINE = eINSTANCE.getExternalMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_MACHINE__NAME = eINSTANCE.getExternalMachine_Name();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.ReflectMachineImpl <em>Reflect Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.ReflectMachineImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getReflectMachine()
     * @generated
     */
    EClass REFLECT_MACHINE = eINSTANCE.getReflectMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFLECT_MACHINE__NAME = eINSTANCE.getReflectMachine_Name();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.VariableMachineImpl <em>Variable Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.VariableMachineImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getVariableMachine()
     * @generated
     */
    EClass VARIABLE_MACHINE = eINSTANCE.getVariableMachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_MACHINE__NAME = eINSTANCE.getVariableMachine_Name();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.UnoImpl <em>Uno</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.UnoImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getUno()
     * @generated
     */
    EClass UNO = eINSTANCE.getUno();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNO__LEFT = eINSTANCE.getUno_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNO__RIGHT = eINSTANCE.getUno_Right();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.AddtionImpl <em>Addtion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.AddtionImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAddtion()
     * @generated
     */
    EClass ADDTION = eINSTANCE.getAddtion();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDTION__LEFT = eINSTANCE.getAddtion_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDTION__RIGHT = eINSTANCE.getAddtion_Right();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.impl.MultiplicationImpl
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT = eINSTANCE.getMultiplication_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT = eINSTANCE.getMultiplication_Right();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.AccessModifiers <em>Access Modifiers</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.AccessModifiers
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getAccessModifiers()
     * @generated
     */
    EEnum ACCESS_MODIFIERS = eINSTANCE.getAccessModifiers();

    /**
     * The meta object literal for the '{@link es.upm.gsi.ECharts.dslECharts.StateModifiers <em>State Modifiers</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see es.upm.gsi.ECharts.dslECharts.StateModifiers
     * @see es.upm.gsi.ECharts.dslECharts.impl.DslEChartsPackageImpl#getStateModifiers()
     * @generated
     */
    EEnum STATE_MODIFIERS = eINSTANCE.getStateModifiers();

  }

} //DslEChartsPackage
