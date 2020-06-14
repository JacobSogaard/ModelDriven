/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.dslproject.ui.internal.DslprojectActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslprojectExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(DslprojectActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		DslprojectActivator activator = DslprojectActivator.getInstance();
		return activator != null ? activator.getInjector(DslprojectActivator.ORG_XTEXT_EXAMPLE_DSLPROJECT) : null;
	}

}