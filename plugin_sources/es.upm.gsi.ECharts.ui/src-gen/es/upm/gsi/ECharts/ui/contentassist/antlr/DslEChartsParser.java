/*
* generated by Xtext
*/
package es.upm.gsi.ECharts.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import es.upm.gsi.ECharts.services.DslEChartsGrammarAccess;

public class DslEChartsParser extends AbstractContentAssistParser {
	
	@Inject
	private DslEChartsGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected es.upm.gsi.ECharts.ui.contentassist.antlr.internal.InternalDslEChartsParser createParser() {
		es.upm.gsi.ECharts.ui.contentassist.antlr.internal.InternalDslEChartsParser result = new es.upm.gsi.ECharts.ui.contentassist.antlr.internal.InternalDslEChartsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDosAccess().getAlternatives(), "rule__Dos__Alternatives");
					put(grammarAccess.getStatesAccess().getAlternatives_5(), "rule__States__Alternatives_5");
					put(grammarAccess.getStatesAccess().getAlternatives_5_0_1(), "rule__States__Alternatives_5_0_1");
					put(grammarAccess.getMachineConstructorAccess().getAlternatives_6_1(), "rule__MachineConstructor__Alternatives_6_1");
					put(grammarAccess.getMachineInvocationAccess().getAlternatives_2(), "rule__MachineInvocation__Alternatives_2");
					put(grammarAccess.getParamsDeclarationAccess().getAlternatives(), "rule__ParamsDeclaration__Alternatives");
					put(grammarAccess.getParamsInvocationAccess().getAlternatives(), "rule__ParamsInvocation__Alternatives");
					put(grammarAccess.getExpressionAccess().getSecondAlternatives_2_0(), "rule__Expression__SecondAlternatives_2_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getNumberLiteralAccess().getAlternatives(), "rule__NumberLiteral__Alternatives");
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getTargetTrnAccess().getAlternatives(), "rule__TargetTrn__Alternatives");
					put(grammarAccess.getAccessModifiersAccess().getAlternatives(), "rule__AccessModifiers__Alternatives");
					put(grammarAccess.getStateModifiersAccess().getAlternatives(), "rule__StateModifiers__Alternatives");
					put(grammarAccess.getRootAccess().getGroup(), "rule__Root__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getImportsAccess().getGroup(), "rule__Imports__Group__0");
					put(grammarAccess.getMachineAccess().getGroup(), "rule__Machine__Group__0");
					put(grammarAccess.getUnoAccess().getGroup(), "rule__Uno__Group__0");
					put(grammarAccess.getUnoAccess().getGroup_1(), "rule__Uno__Group_1__0");
					put(grammarAccess.getAccessAndMachineModifiersAccess().getGroup(), "rule__AccessAndMachineModifiers__Group__0");
					put(grammarAccess.getStatesAccess().getGroup(), "rule__States__Group__0");
					put(grammarAccess.getStatesAccess().getGroup_5_0(), "rule__States__Group_5_0__0");
					put(grammarAccess.getEntryAccess().getGroup(), "rule__Entry__Group__0");
					put(grammarAccess.getExitAccess().getGroup(), "rule__Exit__Group__0");
					put(grammarAccess.getMachineConstructorAccess().getGroup(), "rule__MachineConstructor__Group__0");
					put(grammarAccess.getMachineConstructorAccess().getGroup_6(), "rule__MachineConstructor__Group_6__0");
					put(grammarAccess.getMachineConstructorAccess().getGroup_6_1_0(), "rule__MachineConstructor__Group_6_1_0__0");
					put(grammarAccess.getMachineInvocationAccess().getGroup(), "rule__MachineInvocation__Group__0");
					put(grammarAccess.getMachineInvocationAccess().getGroup_2_0(), "rule__MachineInvocation__Group_2_0__0");
					put(grammarAccess.getParamsDeclarationAccess().getGroup_0(), "rule__ParamsDeclaration__Group_0__0");
					put(grammarAccess.getParamsDeclarationAccess().getGroup_1(), "rule__ParamsDeclaration__Group_1__0");
					put(grammarAccess.getParamsDeclarationAccess().getGroup_1_0(), "rule__ParamsDeclaration__Group_1_0__0");
					put(grammarAccess.getParamsInvocationAccess().getGroup_1(), "rule__ParamsInvocation__Group_1__0");
					put(grammarAccess.getParamsInvocationAccess().getGroup_1_0(), "rule__ParamsInvocation__Group_1_0__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getAssingExpressionAccess().getGroup(), "rule__AssingExpression__Group__0");
					put(grammarAccess.getAdmiredExpressionAccess().getGroup(), "rule__AdmiredExpression__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTargetTrnAccess().getGroup_1(), "rule__TargetTrn__Group_1__0");
					put(grammarAccess.getListStatesAccess().getGroup(), "rule__ListStates__Group__0");
					put(grammarAccess.getListStatesAccess().getGroup_0(), "rule__ListStates__Group_0__0");
					put(grammarAccess.getSubMachineAccess().getGroup(), "rule__SubMachine__Group__0");
					put(grammarAccess.getRootAccess().getPackageAssignment_0(), "rule__Root__PackageAssignment_0");
					put(grammarAccess.getRootAccess().getImportsAssignment_1(), "rule__Root__ImportsAssignment_1");
					put(grammarAccess.getRootAccess().getMachineAssignment_2(), "rule__Root__MachineAssignment_2");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getImportsAccess().getNameAssignment_1(), "rule__Imports__NameAssignment_1");
					put(grammarAccess.getMachineAccess().getAccessAndMachineModifierAssignment_0(), "rule__Machine__AccessAndMachineModifierAssignment_0");
					put(grammarAccess.getMachineAccess().getNameAssignment_2(), "rule__Machine__NameAssignment_2");
					put(grammarAccess.getMachineAccess().getMachineBodyAssignment_4(), "rule__Machine__MachineBodyAssignment_4");
					put(grammarAccess.getUnoAccess().getRightAssignment_1_1(), "rule__Uno__RightAssignment_1_1");
					put(grammarAccess.getDosAccess().getHostBlockAssignment_0(), "rule__Dos__HostBlockAssignment_0");
					put(grammarAccess.getDosAccess().getMachineConstructorAssignment_1(), "rule__Dos__MachineConstructorAssignment_1");
					put(grammarAccess.getDosAccess().getStatesAssignment_2(), "rule__Dos__StatesAssignment_2");
					put(grammarAccess.getDosAccess().getTransitionAssignment_3(), "rule__Dos__TransitionAssignment_3");
					put(grammarAccess.getAccessAndMachineModifiersAccess().getAccessModifierAssignment_0(), "rule__AccessAndMachineModifiers__AccessModifierAssignment_0");
					put(grammarAccess.getAccessAndMachineModifiersAccess().getMachineModifierAssignment_1(), "rule__AccessAndMachineModifiers__MachineModifierAssignment_1");
					put(grammarAccess.getMachineModifierAccess().getConcurrentAssignment(), "rule__MachineModifier__ConcurrentAssignment");
					put(grammarAccess.getStatesAccess().getStateModsAssignment_0(), "rule__States__StateModsAssignment_0");
					put(grammarAccess.getStatesAccess().getNameAssignment_2(), "rule__States__NameAssignment_2");
					put(grammarAccess.getStatesAccess().getEnAssignment_3(), "rule__States__EnAssignment_3");
					put(grammarAccess.getStatesAccess().getExAssignment_4(), "rule__States__ExAssignment_4");
					put(grammarAccess.getStatesAccess().getSubmachineAssignment_5_0_1_0(), "rule__States__SubmachineAssignment_5_0_1_0");
					put(grammarAccess.getStatesAccess().getMachineInvocationsAssignment_5_0_1_1(), "rule__States__MachineInvocationsAssignment_5_0_1_1");
					put(grammarAccess.getEntryAccess().getAAssignment_1(), "rule__Entry__AAssignment_1");
					put(grammarAccess.getExitAccess().getAAssignment_1(), "rule__Exit__AAssignment_1");
					put(grammarAccess.getMachineConstructorAccess().getMachineNameAssignment_1(), "rule__MachineConstructor__MachineNameAssignment_1");
					put(grammarAccess.getMachineConstructorAccess().getParamsMachineAssignment_3(), "rule__MachineConstructor__ParamsMachineAssignment_3");
					put(grammarAccess.getMachineConstructorAccess().getExprAssignment_6_0(), "rule__MachineConstructor__ExprAssignment_6_0");
					put(grammarAccess.getParamsDeclarationAccess().getParamtypeAssignment_0_0(), "rule__ParamsDeclaration__ParamtypeAssignment_0_0");
					put(grammarAccess.getParamsDeclarationAccess().getNameAssignment_0_1(), "rule__ParamsDeclaration__NameAssignment_0_1");
					put(grammarAccess.getParamsDeclarationAccess().getParamtypeAssignment_1_0_0(), "rule__ParamsDeclaration__ParamtypeAssignment_1_0_0");
					put(grammarAccess.getParamsDeclarationAccess().getNameAssignment_1_0_1(), "rule__ParamsDeclaration__NameAssignment_1_0_1");
					put(grammarAccess.getParamsDeclarationAccess().getParamtypeAssignment_1_1(), "rule__ParamsDeclaration__ParamtypeAssignment_1_1");
					put(grammarAccess.getParamsDeclarationAccess().getNameAssignment_1_2(), "rule__ParamsDeclaration__NameAssignment_1_2");
					put(grammarAccess.getExpressionAccess().getNameAssignment_1(), "rule__Expression__NameAssignment_1");
					put(grammarAccess.getExpressionAccess().getSecondAssignment_2(), "rule__Expression__SecondAssignment_2");
					put(grammarAccess.getAdditionAccess().getRightAssignment_1_2(), "rule__Addition__RightAssignment_1_2");
					put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_2(), "rule__Multiplication__RightAssignment_1_2");
					put(grammarAccess.getNumberLiteralAccess().getValueINTAssignment_0(), "rule__NumberLiteral__ValueINTAssignment_0");
					put(grammarAccess.getNumberLiteralAccess().getValueIDAssignment_1(), "rule__NumberLiteral__ValueIDAssignment_1");
					put(grammarAccess.getNumberLiteralAccess().getRefValueAssignment_2(), "rule__NumberLiteral__RefValueAssignment_2");
					put(grammarAccess.getActionBlockAccess().getNameAssignment(), "rule__ActionBlock__NameAssignment");
					put(grammarAccess.getActionStatementAccess().getNameAssignment(), "rule__ActionStatement__NameAssignment");
					put(grammarAccess.getTransitionAccess().getFromAssignment_1(), "rule__Transition__FromAssignment_1");
					put(grammarAccess.getTransitionAccess().getAtAssignment_2(), "rule__Transition__AtAssignment_2");
					put(grammarAccess.getTransitionAccess().getToAssignment_3(), "rule__Transition__ToAssignment_3");
					put(grammarAccess.getTargetTrnAccess().getFromToAssignment_0(), "rule__TargetTrn__FromToAssignment_0");
					put(grammarAccess.getTargetTrnAccess().getFromToListAssignment_1_1(), "rule__TargetTrn__FromToListAssignment_1_1");
					put(grammarAccess.getSingleStateAccess().getFromToAssignment(), "rule__SingleState__FromToAssignment");
					put(grammarAccess.getListStatesAccess().getListAssignment_0_0(), "rule__ListStates__ListAssignment_0_0");
					put(grammarAccess.getListStatesAccess().getListAssignment_1(), "rule__ListStates__ListAssignment_1");
					put(grammarAccess.getHostBlockAccess().getTextAssignment(), "rule__HostBlock__TextAssignment");
					put(grammarAccess.getSubMachineAccess().getMachineModifierAssignment_1(), "rule__SubMachine__MachineModifierAssignment_1");
					put(grammarAccess.getSubMachineAccess().getMachineBodyAssignment_2(), "rule__SubMachine__MachineBodyAssignment_2");
					put(grammarAccess.getInnerMachineAccess().getNameAssignment(), "rule__InnerMachine__NameAssignment");
					put(grammarAccess.getExternalMachineAccess().getNameAssignment(), "rule__ExternalMachine__NameAssignment");
					put(grammarAccess.getReflectMachineAccess().getNameAssignment(), "rule__ReflectMachine__NameAssignment");
					put(grammarAccess.getVariableMachineAccess().getNameAssignment(), "rule__VariableMachine__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			es.upm.gsi.ECharts.ui.contentassist.antlr.internal.InternalDslEChartsParser typedParser = (es.upm.gsi.ECharts.ui.contentassist.antlr.internal.InternalDslEChartsParser) parser;
			typedParser.entryRuleRoot();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public DslEChartsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DslEChartsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
