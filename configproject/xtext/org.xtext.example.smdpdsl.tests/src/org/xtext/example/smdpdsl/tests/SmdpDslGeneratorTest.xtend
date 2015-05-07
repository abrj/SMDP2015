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

class SmdpDslGeneratorTest {
	/*
	 * Test af Java gen og JS gen
	 * Test de forskellige metoder, f.eks. fjernelse af valgmuligheder.
	 * Test 
	 * 
	 */
	
}