/*
* generated by Xtext
*/
package org.xtext.example.mydsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SmdpDslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.example.mydsl.ui.internal.SmdpDslActivator.getInstance().getInjector("org.xtext.example.mydsl.SmdpDsl");
	}
	
}