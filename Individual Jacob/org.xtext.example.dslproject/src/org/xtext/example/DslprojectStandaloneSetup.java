/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DslprojectStandaloneSetup extends DslprojectStandaloneSetupGenerated {

	public static void doSetup() {
		new DslprojectStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
