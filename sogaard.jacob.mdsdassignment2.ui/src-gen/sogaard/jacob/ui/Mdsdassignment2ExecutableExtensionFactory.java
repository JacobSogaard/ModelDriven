/*
 * generated by Xtext 2.20.0
 */
package sogaard.jacob.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import sogaard.jacob.mdsdassignment2.ui.internal.Mdsdassignment2Activator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Mdsdassignment2ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(Mdsdassignment2Activator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		Mdsdassignment2Activator activator = Mdsdassignment2Activator.getInstance();
		return activator != null ? activator.getInjector(Mdsdassignment2Activator.SOGAARD_JACOB_MDSDASSIGNMENT2) : null;
	}

}
