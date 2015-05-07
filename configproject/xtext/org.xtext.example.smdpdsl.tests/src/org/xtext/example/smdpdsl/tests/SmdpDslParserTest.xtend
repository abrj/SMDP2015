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

class SmdpDslParserTest {
	@Inject extension ParseHelper<myModel>;
	
	@Test
	def void testParsing() {
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		CarFactory {
			BMW {
			}
		}
		'''.parse;
		
		val myModel = model
		Assert::assertEquals("CarFactory", myModel.name)
		
		val myObject = model.myModelContains.get(0)
		Assert::assertEquals("BMW", myObject.name)
		
		
	}
}
