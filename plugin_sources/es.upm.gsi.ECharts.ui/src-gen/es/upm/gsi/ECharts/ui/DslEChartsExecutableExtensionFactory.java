
/*
 * generated by Xtext
 */
 
package es.upm.gsi.ECharts.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class DslEChartsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return es.upm.gsi.ECharts.ui.internal.DslEChartsActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return es.upm.gsi.ECharts.ui.internal.DslEChartsActivator.getInstance().getInjector("es.upm.gsi.ECharts.DslECharts");
	}
	
}