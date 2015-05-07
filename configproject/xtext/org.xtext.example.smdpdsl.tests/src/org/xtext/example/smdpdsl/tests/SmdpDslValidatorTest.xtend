package org.xtext.example.smdpdsl.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert
import org.xtext.example.mydsl.SmdpDslInjectorProvider
import configuratorProject.ConfiguratorProjectPackage
import configuratorProject.myModel
import javax.inject.Inject

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmdpDslInjectorProvider))

class SmdpDslValidatorTest {
	
	/*
	 * Test af alle værdi for attribute typer som har en valideringsregl
	 * Test af myValue check (Sammen med constaints) motherfucker klam metode
	 * 
	 */
	
}