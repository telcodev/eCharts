package es.upm.gsi.ECharts.validation;

import org.eclipse.xtext.validation.Check;

import es.upm.gsi.ECharts.dslECharts.DslEChartsPackage;
import es.upm.gsi.ECharts.dslECharts.Transition;
 

public class DslEChartsJavaValidator extends AbstractDslEChartsJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
//		}
//	}
	
	/**
	 * Check and notify you if it appropriate with error when one transition has the same source as a target.
	 * 
	 * @param t - the transition you want to check it 
	 */
	@Check
	public void checkTransitionsNotFinishLikeBegining(Transition t){
		String left = t.getFrom().getFromTo().getFromTo().getName();
		String right = t.getTo().getFromTo().getFromTo().getName();
		if(left.equals(right)){
			error("Transition must change between differents states", DslEChartsPackage.TRANSITION);
		}
	}

}
