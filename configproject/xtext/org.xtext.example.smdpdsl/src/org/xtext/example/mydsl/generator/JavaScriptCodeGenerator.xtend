package org.xtext.example.mydsl.generator

import configuratorProject.*



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
			
			function clone(obj) {
				if (null == obj || "object" != typeof obj) return obj;
    			var copy = obj.constructor();
    			for (var attr in obj) {
        			if (obj.hasOwnProperty(attr)) copy[attr] = clone(obj[attr]);
    				}
    			return copy;
			}
			
			var Attributes = {};
			var AttributeTypeMap = {};
			var ConstraintMap = {};
			function generateInitialAttributes() {
				''' + generateInitializeAttributes(attributes) + '''
				ConstraintMap = clone(Attributes);
			}
			
			function generateBuildConstraints() {
				ConstraintMap = clone(Attributes);
				''' + generateBuildConstraints(constraints) + '''
			}
			function generateCheckConstraints() {
				''' + generateCheckConstraints(attributes) + '''
			}
			
			'''+ genereateTextOutput +'''
			'''+ generateStaticMethods +'''
			
			document.addEventListener('DOMContentLoaded', function() {
				generateInitialAttributes();
			});
			</script>
		  
		  
		  
		</head>
		<body>
		
		''' + generateDropDown(attributes) + '''
		
		<button onclick="generateBuildConstraints(),generateCheckConstraints()">Check</button>
		<button onclick="save()">Save</button>
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
			var attributeValues = [];
			var i = 0;
			«FOR v:(a.myAttributeContains as myStringEnum).values»
			attributeValues[i] = "«v»";
			i++;
			«ENDFOR»
			Attributes["«a.name»"] = attributeValues;
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myNumberEnum»
			var attributeValues = [];
			var i = 0;
			«FOR v:(a.myAttributeContains as myNumberEnum).values»
			attributeValues[i] = "«v»";
			i++;
			«ENDFOR»
			Attributes["«a.name»"] = attributeValues;
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myBoolean»
			var attributeValues = [];
			attributeValues[0] = "«(a.myAttributeContains as myBoolean).trueValue»";
			attributeValues[1] = "«(a.myAttributeContains as myBoolean).falseValue»";
			Attributes["«a.name»"] = attributeValues;
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myRange»
			var attributeValues = [];
			«var from = (a.myAttributeContains as myRange).from»
			«var to = (a.myAttributeContains as myRange).to»
			«FOR i : from ..< (to+1)»
				attributeValues[«i-from»] = «i as double»;
			«ENDFOR»
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
		«FOR con:constraints»
			«val exprIf = con.myIfConstraint as myBinary»
			«val exprThen = con.myThenConstraint as myBinary»
			if «generateIfConstraintString(exprIf, null, null)»{
				«generateThenConstraintString(exprThen, null)»
			}
		«ENDFOR»
		'''
	}
	
	def String generateIfConstraintString(myBinary it, myIdentifier attribute, myBinaryOparators parentOperand){
	  	var myIdentifier att;
	  	var myBinaryOparators pOpe;
	  	// If left is a identifier, get the attribute
	  	if (it.myBinaryLeft instanceof myIdentifier) {
	  		att = it.myBinaryLeft as myIdentifier;
	  		pOpe = it.oparand;
	  		
	  	} else {
	  		att = attribute;
	  		pOpe = parentOperand;
	  	}
	  	
	  	// If both left and right are binaries, then both sides must be true
	  	if (it.myBinaryLeft instanceof myBinary && it.myBinaryRight instanceof myBinary)	{
	  		return "(" + generateIfConstraintString(it.myBinaryLeft as myBinary, att, pOpe) + " " + convertOperand(oparand) + " " + generateIfConstraintString(it.myBinaryRight as myBinary, att, pOpe) +")"
	  	}
	  	
	  	if (it.myBinaryLeft instanceof myIdentifier && it.myBinaryRight instanceof myBinary) {
				return generateIfConstraintString(it.myBinaryRight as myBinary, att, pOpe)
	  	}

		if (it.myBinaryLeft instanceof myValue && it.myBinaryRight instanceof myValue) {
			if (att.myIntentifierIs.myAttributeContains instanceof myNumberEnum) {
			return "(" + ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(pOpe) + " " +  (myBinaryLeft as myNumberEnum).values.get(0) + " || " + ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(pOpe) + " " +  (myBinaryRight as myNumberEnum).values.get(0) + ")";
			}
			if (att.myIntentifierIs.myAttributeContains instanceof myStringEnum) {
			return "(" + ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(pOpe) + "  \"" +  (myBinaryLeft as myStringEnum).values.get(0) + "\" || " + ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(pOpe) + " \"" +  (myBinaryRight as myStringEnum).values.get(0) + "\")";
			}
		}
		
		if (it.myBinaryLeft instanceof myValue && it.myBinaryRight instanceof myBinary) {
			if (att.myIntentifierIs.myAttributeContains instanceof myNumberEnum) {
				return "(" + ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(pOpe) + " " +  (myBinaryLeft as myNumberEnum).values.get(0) + " || " + generateIfConstraintString(it.myBinaryRight as myBinary, att, pOpe) + ")"
			}
			if (att.myIntentifierIs.myAttributeContains instanceof myStringEnum) {
				return "(" + ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(pOpe) + " \"" +  (myBinaryLeft as myStringEnum).values.get(0) + "\" || " + generateIfConstraintString(it.myBinaryRight as myBinary, att, pOpe) + ")"
			}
		}
	  	
	  	if (it.myBinaryLeft instanceof myIdentifier && it.myBinaryRight instanceof myValue) {
	  		if (att.myIntentifierIs.myAttributeContains instanceof myNumberEnum) {
	  			return "("+ ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(oparand) + " " + (myBinaryRight as myNumberEnum).values.get(0) + ")";
	  		}
	  		
	  		if (att.myIntentifierIs.myAttributeContains instanceof myStringEnum) {
	  			return "("+ ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(oparand) + " \"" + (myBinaryRight as myStringEnum).values.get(0) + "\")";
	  		}
	  		
	  		if (att.myIntentifierIs.myAttributeContains instanceof myRange) {
	  			return "(" + (att.myIntentifierIs.myAttributeContains as myRange).from + " <= " + ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " && " + (att.myIntentifierIs.myAttributeContains as myRange).to + " >= " + ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + ")";
	  		}
	  		
	  		if (att.myIntentifierIs.myAttributeContains instanceof myBoolean) {
	  			return "("+ ConvertAttributeName(att.myIntentifierIs.name, att.myIntentifierIs.myAttributeContains) + " " + convertOperand(oparand) + " \"" + (myBinaryRight as myStringEnum).values.get(0) + "\")";
	  		}
	  		
	  	}
	  	return "FUCKED!"
	}
	
	def String generateThenConstraintString(myBinary it, myIdentifier attribute){
		if (it.myBinaryLeft instanceof myBinary && it.myBinaryRight instanceof myBinary){
		  		return generateThenConstraintString(it.myBinaryLeft as myBinary, null) + generateThenConstraintString(it.myBinaryRight as myBinary, null);
		  	}	
		
			var myIdentifier att;
		  	// If left is a identifier, get the attribute
		  	if (it.myBinaryLeft instanceof myIdentifier) {
		  		att = it.myBinaryLeft as myIdentifier;	  		
		  	} else {
		  		att = attribute;
		  	}
		  	
		  	if (it.myBinaryLeft instanceof myIdentifier && it.myBinaryRight instanceof myValue) {
		  		var StringBuilder sb = new StringBuilder();
		  		if (it.myBinaryRight instanceof myStringEnum) {
		  			for(v: (it.myBinaryRight as myStringEnum).values) {
		  				sb.append("\""+ v +"\",");
		  			}
		  			return "removeNonPossibleValuesFromAttribute(\""+ att.myIntentifierIs.name  +"\", [" + sb.toString +"], \"" + it.oparand + "\");"
		  		}
		  		if (it.myBinaryRight instanceof myNumberEnum) {
		  			for(v: (it.myBinaryRight as myNumberEnum).values) {
		  				sb.append(""+ v +",");
		  			}
		  			return "removeNonPossibleValuesFromAttributeNumber(\""+ att.myIntentifierIs.name  +"\", [" + sb.toString +"], \"" + it.oparand + "\");"
		  		}
		  	}
		  	return "";
	}

	def String ConvertAttributeName(String name, myValue type) {
		if (type instanceof myRange || type instanceof myNumberEnum) {
			return "parseInt(document.querySelector(\"#" + name + "\").value)";
		}
		return "document.querySelector(\"#" + name + "\").value"
	}
	
	def String convertOperand(myBinaryOparators operand) {
		if (operand == myBinaryOparators.EQ) {
			return "=="
		}
		
		if (operand == myBinaryOparators.AND) {
			return "&&"
		}
		
		if (operand == myBinaryOparators.OR) {
			return "||"
		}
		
		if (operand == myBinaryOparators.LT) {
			return ">"
		}
		if (operand == myBinaryOparators.GT) {
			return "<"
		}
		if (operand == myBinaryOparators.IS) {
			return "=="
		}
	}
	
	def generateCheckConstraints(List<myAttribute> attributes) {
		'''
		values = [];
  		var value;
	  «FOR a:attributes»
	   values = ConstraintMap["«a.name»"];
	   value = «ConvertAttributeName(a.name, a.myAttributeContains)»;
	   if (values.length > 0) {
	   if (values.indexOf(value)==-1) {
	   alert("«a.name» does not contain a valid value");	
	   return false;
	   }
	   } else {
	   alert("«a.name» does not contain a valid value");
	   return false;
	   }
		«ENDFOR»
		alert("true");
		return true;
	'''
	}
	
	def generateStaticMethods(){
	'''
	  function removeNonPossibleValuesFromAttribute(attr, possibleValues, operator){
	  	values = ConstraintMap[attr];
	  	for(i = values.length-1; i >= 0; i--){
	  		currentValue = values[i];
	  		if(operator == "is"){
	  			if(possibleValues.indexOf(currentValue)==-1){
	  			values.splice(i,1);
	  			}
	  		}
	  		
	  	}
	  	ConstraintMap[attr] = values;
	  }
	  
	  function removeNonPossibleValuesFromAttributeNumber(attr, possibleValues, operator){
	  	values = ConstraintMap[attr];
	  	for(i = values.length-1; i >= 0; i--){
	  		doubleValue = values[i];
	  		if(operator == "is"){
	  			if(possibleValues.indexOf(doubleValue)==-1){
	  			values.splice(i,1);
	  			}
	  		}
	  		if(operator == "lt"){
	  			if(doubleValue < possibleValues[0]){
	  				values.splice(i,1);
	  			}
	  		}
	  		
	  		if(operator == "gt"){
	  			if(doubleValue > possibleValues[0]){
	  				values.splice(i,1);
	  			}
	  		}
	  	}
	  	ConstraintMap[attr] = values;
	  }
	'''
	}
	

	
}