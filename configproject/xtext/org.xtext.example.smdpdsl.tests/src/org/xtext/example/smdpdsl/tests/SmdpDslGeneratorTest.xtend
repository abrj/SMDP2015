package org.xtext.example.smdpdsl.tests

import org.eclipse.xtext.junit4.*
import org.junit.*
import org.xtext.example.mydsl.SmdpDslInjectorProvider
import configuratorProject.ConfiguratorProjectPackage
import configuratorProject.myModel
import javax.inject.Inject
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.runner.RunWith
import static extension org.junit.Assert.*
import java.util.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmdpDslInjectorProvider))


class SmdpDslGeneratorTest {
	@Inject extension CompilationTestHelper;
	@Inject extension ReflectExtensions;
	
	
	String[] params
	
	@Test 
	
	def void testGeneratedJava(){
	ConfiguratorProjectPackage.eINSTANCE.eClass()
	'''
	CarFactory {
			BMW {
				
			}
		}
	'''.compile[getCompiledClass.newInstance =>
		[
			val att = it.get("Attributes")
			println("att:" + att)
			assertNull(it.invoke("InitializeAttribute"))
			it.invoke("main", params)
			val att1 = it.get("Attributes") as HashMap<String, List<String>>
			print(att1.size())
			
		]]
	}
	
	
	/*
	 * Test af Java gen og JS gen
	 * Test de forskellige metoder, f.eks. fjernelse af valgmuligheder.
	 * Test 
	 * 
	 */
	
}