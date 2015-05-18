package org.xtext.example.smdpdsl.tests

import configuratorProject.ConfiguratorProjectPackage
import configuratorProject.myModel
import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.mydsl.SmdpDslInjectorProvider
import org.eclipse.emf.common.util.BasicEList;

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
		
		/*
		 * 1 test for korrekt model
		 * 1 test for tom model
		 * 1 tets for myObject
		 * 1 test for attributer
		 * 1 test for constraints
		 */	
	}
	
	//Model with empty name
	@Test
	def void testModelWithoutName(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 {

		 }
		'''.parse;
		Assert::assertNull(model.name)
	}
	
	//Model with name "CarFactory"
	@Test
	def void testModelWithName(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{

		 }
		'''.parse;
		Assert::assertEquals("CarFactory", model.name)	
	}	
	
	//Model with 0 myObjects
	@Test
	def void testModelWithoutMyObject(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{

		 }
		'''.parse;
		Assert::assertEquals(null, model.myModelContains.get(0).name);	
	}
	
	//Model with one myObject without name
	@Test
	def void testModelWithMyObjectWithoutName(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{
		 	{
		 		
		 	}

		 }
		'''.parse;
		Assert::assertEquals(null, model.myModelContains.get(0).name);	
	}
	
	//Model with 1 myObject
	@Test
	def void testModelWithOneMyObject(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{
			BMW{
				
			}
		 }
		'''.parse;
		Assert::assertEquals("BMW", model.myModelContains.get(0).name);	
	}
	
		
	//Model with n myObjects 
	@Test
	def void testModelWithManyMyObjects(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{
			BMW{
				
			}
			Lada{
				
			}
		 }
		'''.parse;
		Assert::assertEquals("BMW", model.myModelContains.get(0).name);
		//Only 1 myObject allowed
		try{
			val name = model.myModelContains.get(1).name;
		}
		catch(Exception e){
			Assert::assertTrue(e instanceof IndexOutOfBoundsException);
		}
		Assert::assertNotEquals(2, model.myModelContains.size());			
	}
	
		
	//Model without attributes
	@Test
	def void testMyObjectWithoutAttributes(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{
		 BMW{
		 
		 }
		}
		'''.parse;
		Assert::assertEquals(0, model.myModelContains.get(0).myAttributeContains.size());	
	}	

	//Model without attributes
	@Test
	def void testMyObjectWithEmptyAttributesList(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{
			BMW{
				has
			}
		 }
		'''.parse;
		Assert::assertEquals(1, model.myModelContains.get(0).myAttributeContains.size());	//Should have size of 0
		Assert::assertEquals(null, model.myModelContains.get(0).myAttributeContains.get(0).name)	
	}
			
	//Model with 1 attribute
	@Test
	def void testMyObjectWithOneMyAttributes(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{
			BMW{
				has
					carType[]
				
			}
		 }
		'''.parse;
		Assert::assertEquals(1, model.myModelContains.get(0).myAttributeContains.size());
		Assert::assertEquals("carType", model.myModelContains.get(0).myAttributeContains.get(0).name);	
	}		
	//Model with n attributes
	@Test
	def void testMyObjectWithManyMyAttributes(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{
			BMW{
				has
					carType[],
					engineType[],
					wheel[]
				
			}
		 }
		'''.parse;
		Assert::assertEquals(3, model.myModelContains.get(0).myAttributeContains.size());
		Assert::assertEquals("carType", model.myModelContains.get(0).myAttributeContains.get(0).name);
		Assert::assertEquals("engineType", model.myModelContains.get(0).myAttributeContains.get(1).name);
		Assert::assertEquals("wheel", model.myModelContains.get(0).myAttributeContains.get(2).name);	
	}
	//Model with n attributes
	@Test
	def void testMyObjectWithManyMyAttributesWithoutComma(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		 CarFactory{
			BMW{
				has
					carType[]
					engineType[]
					wheel[]
				
			}
		 }
		'''.parse;
		Assert::assertEquals(1, model.myModelContains.get(0).myAttributeContains.size());
		Assert::assertEquals("carType", model.myModelContains.get(0).myAttributeContains.get(0).name);
		//Must be separated with comma
		try{
			val attribute = model.myModelContains.get(0).myAttributeContains.get(1).name
		}
		catch(Exception e){
			Assert::assertTrue(e instanceof IndexOutOfBoundsException);
		}	
	}		
	
	
	//Model without myConstraint
	
	//Model with 1 myConstraint
	
	//Model with n myConstraint
}
