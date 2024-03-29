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
import org.junit.Before

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmdpDslInjectorProvider))

class SmdpDslParserTest {
	@Inject extension ParseHelper<myModel>;
	
	
	@Before
	def void setup(){
		ConfiguratorProjectPackage.eINSTANCE.eClass()	
	}
	
	//Model with empty name
	@Test
	def void testMyModelWithoutName(){
		val model = '''
		 {

		 }
		'''.parse;
		Assert::assertNull(model.name)
	}
	
	//Model with name "CarFactory"
	@Test
	def void testMyModelWithName(){
		val model = '''
		 CarFactory{

		 }
		'''.parse;
		Assert::assertEquals("CarFactory", model.name)	
	}	
	//Model with name in quotes
	@Test
	def void testMyModelWithNameInQuotes(){
		val model = '''
		"CarFactory Berlin"{
			
		}
		'''.parse;
		Assert::assertEquals("CarFactory Berlin", model.name);
	}
	
	//Model with whitespace separated name
	@Test
	def void testMyModelWithWhitespaceSeparatedName(){
		val model = '''
		CarFactory Berlin{
			
		}
		'''.parse;
		Assert::assertNotEquals("CarFactory Berlin", model.name);
		Assert::assertEquals("CarFactory", model.name);
	}
		
	
	
	//Model with 0 myObjects
	@Test
	def void testMyModelWithoutMyObjects(){
		val model = '''
		 CarFactory{

		 }
		'''.parse;
		Assert::assertEquals(null, model.myModelContains.get(0).name);	
	}
	
	//Model with one myObject without name
	@Test
	def void testMyModelWithMyObjectsWithoutName(){
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
	def void testMyModelWithOneMyObjects(){
		val model = '''
		 CarFactory{
			BMW{
				
			}
		 }
		'''.parse;
		Assert::assertEquals("BMW", model.myModelContains.get(0).name);	
		Assert::assertEquals(1, model.myModelContains.size());
	}
	
		
	//Model with many myObjects 
	@Test
	def void testMyModelWithManyMyObjects(){
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
		Assert::assertEquals(1, model.myModelContains.size());			
	}
	
		
	//Model with myObjects without attributes
	@Test
	def void testMyObjectsWithoutAttributes(){
		val model = '''
		 CarFactory{
		 	BMW{
		 
		 	}
		}
		'''.parse;
		Assert::assertEquals(0, model.myModelContains.get(0).myAttributeContains.size());	
	}	

	//Model with myObjects empty attributes list
	@Test
	def void testMyObjectsWithEmptyAttributesList(){
		val model = '''
		 CarFactory{
			BMW{
				has
			}
		 }
		'''.parse;
		Assert::assertEquals(1, model.myModelContains.get(0).myAttributeContains.size());	//Should have size of 0, there is a parse error
		Assert::assertEquals(null, model.myModelContains.get(0).myAttributeContains.get(0).name)	
	}
	
	
	//Model with myObjects with 1 attribute without name
	@Test
	def void testMyObjectsWithOneMyAttributesWithoutName(){
		val model = '''
		 CarFactory{
			BMW{
				has
					[]
				
			}
		 }
		'''.parse;
		Assert::assertEquals(1, model.myModelContains.get(0).myAttributeContains.size());
		Assert::assertEquals(null, model.myModelContains.get(0).myAttributeContains.get(0).name);	
	}	
	
			
	//Model with myObjects with 1 attribute
	@Test
	def void testMyObjectsWithOneMyAttributes(){
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
	//Model with myObjects with many attributes
	@Test
	def void testMyObjectsWithManyMyAttributes(){
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
	//Model with myObjects with many attributes without comma - Negative test
	@Test
	def void testMyObjectWithManyMyAttributesWithoutComma(){
		//ConfiguratorProjectPackage.eINSTANCE.eClass()
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
	
	//Model with myObject without myConstraint
	@Test
	def void testMyObjectsWithoutConstraints(){
		val model = '''
		CarFactory{
			BWM{
				has
					carType["SUV","Pickup"],
					engineType["Diesel","Gas","Electric"],
					wheel[14-28]
					
				Constrained by
									
		}
		'''.parse;
		Assert::assertEquals(0, model.myModelContains.get(0).myObjectHas.size());
		
	}
	//Model with myObject with 1 myConstraint
	@Test
	def void testMyObjectWithOneConstraints(){
		val model = '''
		CarFactory{
			BWM{
				has
					carType["SUV","Pickup"],
					engineType["Diesel","Gas","Electric"],
					wheel[14-28]
					
				Constrained by
					if carType="SUV"
					then wheel can 20		
		}
		'''.parse;
		Assert::assertEquals(1, model.myModelContains.get(0).myObjectHas.size());
		
		
	}	
	//Model with myObject with many myConstraint
	@Test
	def void testMyObjectsWithManyConstraints(){
		val model = '''
		CarFactory{
			BWM{
				has
					carType["SUV","Pickup"],
					engineType["Diesel","Gas","Electric"],
					wheel[14-28]
					
				Constrained by
					if carType= "SUV"
					then wheel can 20
					
					if engineType = "Diesel"
					then carType can "SUV"		
		}
		'''.parse;
		Assert::assertEquals(2, model.myModelContains.get(0).myObjectHas.size());
		}	
}
