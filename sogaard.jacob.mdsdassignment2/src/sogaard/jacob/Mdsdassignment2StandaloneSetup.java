/*
 * generated by Xtext 2.20.0
 */
package sogaard.jacob;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Mdsdassignment2StandaloneSetup extends Mdsdassignment2StandaloneSetupGenerated {

	public static void doSetup() {
		new Mdsdassignment2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
