package org.xtext.example.mydsl.generator

import configuratorProject.myAttribute
import configuratorProject.myConstraint
import configuratorProject.myStringEnum
import configuratorProject.myNumberEnum
import configuratorProject.myBoolean
import configuratorProject.myRange

import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class JavaScriptCodeGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa){
		//Getting the attributes and constraints
		val attributes = resource.allContents.filter(typeof(myAttribute)).toList();
		val constraints = resource.allContents.filter(typeof(myConstraint)).toList();
		
		//Generate HTML and JavaScript
		val javaScriptCode = generateCode(attributes, constraints);
   	  	val filePath = "generated/web/CodeGen.html"
   	  	fsa.generateFile(filePath, javaScriptCode);
		
	}
	
	def generateCode(List<myAttribute> attributes, List<myConstraint> constraints) {
		'''
		<!doctype html>
		<html lang="en">
		<head>
			<meta charset="utf-8">
			<title>Configurator</title>
		  
			<script type="text/javascript">
			var Attributes = {};
			var AttributeTypeMap = {};
			var ConstraintMap = {};
			function generateInitialAttributes() {
				''' + generateInitializeAttributes(attributes) + '''
				ConstraintMap = Attributes.slice();
			}
			
			function generateBuildConstraints() {
				''' + generateBuildConstraints(constraints) + '''
				console.log(Attributes);
			}
			
			'''+ genereateTextOutput +'''
			</script>
		  
		  
		  <button onclick="save()">Save</button>
		</head>
		<body onload="generateInitialAttributes()">
		
		''' + generateDropDown(attributes) + '''
		
		</body>
		</html>
		'''
		
	}
	
	def generateDropDown(List<myAttribute> attributes) '''
	«FOR attr:attributes»
	<p>«attr.name»:</p> <select id="«attr.name»"">
	«IF attr.myAttributeContains instanceof myStringEnum»
	«FOR v:(attr.myAttributeContains as myStringEnum).values»
	<option value="«v»">«v»</option>
	«ENDFOR»
	«ENDIF»
	
	«IF attr.myAttributeContains instanceof myNumberEnum»
	«FOR v:(attr.myAttributeContains as myNumberEnum).values»
		<option value="«v»">«v»</option>
	«ENDFOR»
	«ENDIF»
	
	«IF attr.myAttributeContains instanceof myRange»
	«FOR v:(attr.myAttributeContains as myRange).from..(attr.myAttributeContains as myRange).to»
		<option value="«v»">«v»</option>
	«ENDFOR»
	«ENDIF»
	
	«IF attr.myAttributeContains instanceof myBoolean»
	<option value="«(attr.myAttributeContains as myBoolean).trueValue»">«(attr.myAttributeContains as myBoolean).trueValue»</option>
	<option value="«(attr.myAttributeContains as myBoolean).falseValue»">«(attr.myAttributeContains as myBoolean).falseValue»</option>
	«ENDIF»
	</select>
	«ENDFOR»
	'''
	
	def generateInitializeAttributes(List<myAttribute> attributes){
		'''
		
		«FOR a:attributes»
		    «IF a.myAttributeContains instanceof myStringEnum»
			var attributeValues = {};
			«FOR v:(a.myAttributeContains as myStringEnum).values»
			attributeValues["«v»"] = "«v»";
			«ENDFOR»
			Attributes["«a.name»"] = attributeValues;
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myNumberEnum»
			var attributeValues = {};
			«FOR v:(a.myAttributeContains as myNumberEnum).values»
			attributeValues["«v»"] = "«v»";
			«ENDFOR»
			Attributes["«a.name»"] = attributeValues;
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myBoolean»
			var attributeValues = {};
			attributeValues["true"] = "«(a.myAttributeContains as myBoolean).trueValue»";
			attributeValues["false"] = "«(a.myAttributeContains as myBoolean).falseValue»";
			Attributes["«a.name»"] = attributeValues;
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myRange»
			var attributeValues = {};
			«var from = (a.myAttributeContains as myRange).from»
			«var to = (a.myAttributeContains as myRange).to»
			for ( i = «from»; i <= «to»;i++) {
				attributeValues[i] = (i +".0");
				}
			Attributes["«a.name»"] = attributeValues;
			«ENDIF»
		«ENDFOR»
		'''
	}

	def genereateTextOutput(){
		'''
		function download(filename, text) {
  var pom = document.createElement('a');
  pom.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(text));
  pom.setAttribute('download', filename);

  pom.style.display = 'none';
  document.body.appendChild(pom);

  pom.click();

  document.body.removeChild(pom);
}
		
		function save() {
		
		dropdowns = document.body.querySelectorAll('select');
		result = "";
		for (i = 0; i < dropdowns.length; i++) { 
    		result += dropdowns[i].id + ": " + dropdowns[i].value + "\r\n";
		}
		
		download("results.txt", result);
		}
		'''
	}
	
	def generateBuildConstraints(List<myConstraint> constraints){
		'''
		
		'''
	}
	

	
}