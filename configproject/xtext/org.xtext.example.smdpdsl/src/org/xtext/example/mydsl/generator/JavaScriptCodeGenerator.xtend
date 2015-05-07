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
			
			
			</script>
		  
		  
		  
		</head>
		<body onload="generateInitialAttributes()">
		
		''' + generateDropDown(attributes) + '''
		
		</body>
		</html>
		'''
		
	}
	
	def generateDropDown(List<myAttribute> attributes) '''
	«FOR attr:attributes»
	<p>«attr.name»:</p> <select >
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
		  			return "removeNonPossibleValuesFromAttribute(\""+ att.myIntentifierIs.name  +"\", {" + sb.toString +"}, \"" + it.oparand + "\");"
		  		}
		  		if (it.myBinaryRight instanceof myNumberEnum) {
		  			for(v: (it.myBinaryRight as myNumberEnum).values) {
		  				sb.append("add("+ v +");");
		  			}
		  			return "removeNonPossibleValuesFromAttributeNumber(\""+ att.myIntentifierIs.name  +"\", {" + sb.toString +"}, \"" + it.oparand + "\");"
		  		}
		  	}
		  	return "";
	}

	def String ConvertAttributeName(String name, myValue type) {
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
	
	def generateStaticMethods(){
	'''
	  public static void removeNonPossibleValuesFromAttribute(String attr, List<String> possibleValues, String operator){
	  	List<String> values = ConstraintMap.get(attr);
	  	for(int i = values.size()-1; i >= 0; i--){
	  		String currentValue = values.get(i);
	  		if(operator == "is"){
	  			if(!possibleValues.contains(currentValue)){
	  			values.remove(i);
	  			}
	  		}
	  		
	  	}
	  	ConstraintMap.put(attr,values);
	  }
	  
	  public static void removeNonPossibleValuesFromAttributeNumber(String attr, List<Double> possibleValues, String operator){
	  	List<String> values = ConstraintMap.get(attr);
	  	for(int i = values.size()-1; i >= 0; i--){
	  		String currentValue = values.get(i);
	  		double doubleValue = Double.parseDouble(currentValue);
	  		if(operator == "is"){
	  			if(!possibleValues.contains(doubleValue)){
	  			values.remove(i);
	  			}
	  		}
	  		if(operator == "lt"){
	  			if(doubleValue < possibleValues.get(0)){
	  				values.remove(i);
	  			}
	  		}
	  		
	  		if(operator == "gt"){
	  			if(doubleValue > possibleValues.get(0)){
	  				values.remove(i);
	  			}
	  		}
	  	}
	  	ConstraintMap.put(attr,values);
	  }
	'''
	}
	

	
}