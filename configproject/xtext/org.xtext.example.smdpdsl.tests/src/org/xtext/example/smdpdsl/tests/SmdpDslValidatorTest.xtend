package org.xtext.example.smdpdsl.tests

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert
import org.xtext.example.mydsl.SmdpDslInjectorProvider
import configuratorProject.ConfiguratorProjectPackage
import configuratorProject.myBinary
import configuratorProject.myStringEnum
import configuratorProject.myModel
import configuratorProject.myAttribute
import configuratorProject.*
import javax.inject.Inject
import org.xtext.example.mydsl.validation.SmdpDslValidator
import org.junit.Before

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SmdpDslInjectorProvider))

class SmdpDslValidatorTest {
	@Inject extension ParseHelper<myModel>;
	/*
	 * Test af alle værdi for attribute typer som har en valideringsregl
	 * Test af myValue check (Sammen med constaints) motherfucker klam metode
	 * 
	 */
	 
	 val validator = new SmdpDslValidator();
	  
	 @Test
	 def void WithEmptyString(){
	 	//ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		CarFactory {
			BMW {
				has 
 					carType ["sports", ""]
			}
		}
		'''.parse;
		
		val myObject = model.myModelContains.get(0);
		
		var attribute = myObject.myAttributeContains.get(0) as myAttribute
		var values = attribute.myAttributeContains as myStringEnum;
		
		Assert::assertFalse(validator.constraint(values))
	}
	
		 @Test
	 def void WithString(){
		val model = '''
		CarFactory {
			BMW {
				has 
 					carType ["sportscar", "SUV"]
			}
		}
		'''.parse;
		
		val myObject = model.myModelContains.get(0);
		
		var attribute = myObject.myAttributeContains.get(0) as myAttribute
		var values = attribute.myAttributeContains as myStringEnum;
		
		Assert::assertTrue(validator.constraint(values))
	}
	
		 @Test
	 def void DublicateAttributesName(){
	 	//ConfiguratorProjectPackage.eINSTANCE.eClass()
		val model = '''
		CarFactory {
			BMW {
				has 
 					carType ["sportscar", "SUV"],
 					carType ["sportscar", "SUV"]
			}
		}
		'''.parse;
		
		val myObject = model.myModelContains.get(0);
		Assert::assertFalse(validator.constraint(myObject))
	}
	
	 @Test
	 def void CorrectRangeConstraint(){
	 	val model = '''
		carFactory {
 	BMW {
 		has 
 			seatHeat ["Seat Heat":"No Seat Heat"],
 			wheel [14-28]					
 		
 		Constrained by					 			
 			if seatHeat = "Seat Heat"
 			then wheel can 14,15
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myObjectHas.get(0);
		Assert::assertTrue(validator.constraint(myCon))
	}
	
		 @Test
	 def void WrongRangeConstraint(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			seatHeat ["Seat Heat":"No Seat Heat"],
 			wheel [14-28]					
 		
 		Constrained by					 			
 			if seatHeat = "Seat Heat"
 			then wheel can 14,29
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myObjectHas.get(0);
		Assert::assertFalse(validator.constraint(myCon))
	}
	
		 @Test
	 def void CorrectNumberEnumConstraint(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			seatHeat ["Seat Heat":"No Seat Heat"],
 			wheel [14,28]					
 		
 		Constrained by					 			
 			if seatHeat = "Seat Heat"
 			then wheel can 14
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myObjectHas.get(0);
		Assert::assertTrue(validator.constraint(myCon))
	}
	
	 @Test
	 def void WrongNumberEnumConstraint(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			seatHeat ["Seat Heat":"No Seat Heat"],
 			wheel [14,28]					
 		
 		Constrained by					 			
 			if seatHeat = "Seat Heat"
 			then wheel can 15
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myObjectHas.get(0);
		Assert::assertFalse(validator.constraint(myCon))
	}
	
	 @Test
	 def void WrongStringEnumConstraint(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			seatHeat ["Seat Heat":"No Seat Heat"],
 			wheel ["4-wheel","two-wheel"]					
 		
 		Constrained by					 			
 			if seatHeat = "Seat Heat"
 			then wheel can "wrong"
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myObjectHas.get(0);
		Assert::assertFalse(validator.constraint(myCon))
	}
	
	 @Test
	 def void CorrectStringEnumConstraint(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			seatHeat ["Seat Heat":"No Seat Heat"],
 			wheel ["4-wheel","two-wheel"]					
 		
 		Constrained by					 			
 			if seatHeat = "Seat Heat"
 			then wheel can "4-wheel"
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myObjectHas.get(0);
		Assert::assertTrue(validator.constraint(myCon))
	}
	
		 @Test
	 def void CorrectBooleanConstraint(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			seatHeat ["Seat Heat":"No Seat Heat"],
 			wheel ["4-wheel":"two-wheel"]					
 		
 		Constrained by					 			
 			if seatHeat = "Seat Heat"
 			then wheel can "4-wheel"
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myObjectHas.get(0);
		Assert::assertTrue(validator.constraint(myCon))
	}
	
		 @Test
	 def void WrongBooleanConstraint(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			seatHeat ["Seat Heat":"No Seat Heat"],
 			wheel ["4-wheel":"two-wheel"]					
 		
 		Constrained by					 			
 			if seatHeat = "Seat Heat"
 			then wheel can "wrong"
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myObjectHas.get(0);
		Assert::assertFalse(validator.constraint(myCon))
	}
	
	
	
		 @Test
	 def void AttributesName(){
		val model = '''
		CarFactory {
			BMW {
				has 
 					carType ["sportscar", "SUV"],
 					car ["sportscar", "SUV"]
			}
		}
		'''.parse;
		
		val myObject = model.myModelContains.get(0);
		Assert::assertTrue(validator.constraint(myObject))
	}
	
	@Test
	def void CorrectRangeValue(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			wheel [14-28]					
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myAttributeContains.get(0).myAttributeContains as myRange;
		Assert::assertTrue(validator.constraint(myCon))
	}	
	
	@Test
	def void WrongRangeValue(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			wheel [14-13]					
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myAttributeContains.get(0).myAttributeContains as myRange;
		Assert::assertFalse(validator.constraint(myCon))
	}
	
	@Test
	def void CorrectNumberValue(){
		val model = '''
		carFactory {
 	BMW {
 		has 
 			wheel [12,13,14,15]					
 	}	
}'''.parse;
		val myObject = model.myModelContains.get(0);
		val myCon = myObject.myAttributeContains.get(0).myAttributeContains as myNumberEnum;
		Assert::assertTrue(validator.constraint(myCon))
	}		
	
}