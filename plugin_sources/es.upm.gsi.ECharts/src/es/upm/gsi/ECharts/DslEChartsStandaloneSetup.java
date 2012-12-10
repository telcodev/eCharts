
package es.upm.gsi.ECharts;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DslEChartsStandaloneSetup extends DslEChartsStandaloneSetupGenerated{

	public static void doSetup() {
		new DslEChartsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

