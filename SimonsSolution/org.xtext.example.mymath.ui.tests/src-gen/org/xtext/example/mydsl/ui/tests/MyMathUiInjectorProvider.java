/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.mymath.ui.internal.MymathActivator;

public class MyMathUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MymathActivator.getInstance().getInjector("org.xtext.example.mydsl.MyMath");
	}

}
