/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.mymath.ui.internal.MymathActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyMathExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(MymathActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		MymathActivator activator = MymathActivator.getInstance();
		return activator != null ? activator.getInjector(MymathActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYMATH) : null;
	}

}
