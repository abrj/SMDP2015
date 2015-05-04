package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import configuratorProject.myAttribute
import configuratorProject.myConstraint
import configuratorProject.myBinary;
import configuratorProject.myIdentifier;
import configuratorProject.*;

import java.util.*;

import configuratorProject.myStringEnum

class JavaCodeGenerator implements IGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		//Getting the attributes and constraints
		val attributes = resource.allContents.filter(typeof(myAttribute)).toList();
		val constraints = resource.allContents.filter(typeof(myConstraint)).toList();
		
		// Generate java code
		val javaCode = generateJavaCode(attributes, constraints);
   	  	val javaFile = "generated/martinjava/JavaCodeGen.java"
   	  	fsa.generateFile(javaFile, javaCode);
	}	
	
	def generateJavaCode(List<myAttribute> attributes, List<myConstraint> constraints) {
	'''
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Scanner;
	import java.io.FileWriter;
	import java.text.SimpleDateFormat;
	import java.io.IOException;
	import java.util.Date;
	
	
	public class JavaCodeGen {
		
		public static HashMap<String, List<String>> Attributes;
		public static HashMap<String, String> AttributeTypeMap;
		public static HashMap<String, List<String>> ConstraintMap;
		public static HashMap<String, String> ChosenValues;
		
		public static void main(String[] args) {
			Attributes = new HashMap<String, List<String>>();
			AttributeTypeMap = new HashMap<String, String>();
			ChosenValues = new HashMap<String, String>();
			
			InitializeAttribute();
			ConstraintMap = new HashMap<String, List<String>>(Attributes);
			
			run();
			buildContrains();
			System.out.println("Valid? " + checkConstraints());
			if (checkConstraints()) {
				writeToFile();
			}
		}
		
		public static void InitializeAttribute(){
		''' + generateInitializeAttribute(attributes) + '''
		}
		
		public static void buildContrains() {
		'''+ generateBuildConstraints(constraints) +'''	
		}
		
		public static boolean checkConstraints() {
		'''+ generateCheckConstraints(attributes)+ '''
		}
		
		public static void writeToFile() {
			'''+ generateTxtFile + '''
		}
		
		public static void run() {
		'''+genereateRunCommand()+'''	
		}
		
		'''+ generateStaticMethods() + '''
	}
	'''
	}
	
	def genereateRunCommand(){
		'''
		Scanner in = new Scanner(System.in);
		
		for (String attr : Attributes.keySet() ) {
			boolean accepted = false;
			String selectedValue = "";
			do {
			int input = -1;
			System.out.println("Attribute: "+ attr);
			
			if (AttributeTypeMap.get(attr) == "myRange") {
				Double to = Double.parseDouble(Attributes.get(attr).get(Attributes.get(attr).size()-1));
				Double from = Double.parseDouble(Attributes.get(attr).get(0));
				
				System.out.println("Choose a value that is between: " + from.intValue()  + " and " + to.intValue());
				input = in.nextInt();
				if ((from <= input) && (input <= to)) {
					accepted = true;
					selectedValue = input +".0";
				} else {
					System.out.println("Invalid");
				}
			} else {
				int i = 0;
				for(String s : Attributes.get(attr)) {
					System.out.println(i + ": " + s);
					i++;	
				}
				input = in.nextInt();
				if ((0 <= input) && (input < i)) {
					accepted = true;
					selectedValue = Attributes.get(attr).get(input);
				} else {
					System.out.println("Invalid");
				}
			}
			} while (!accepted);
			System.out.println(selectedValue + " is selected for " + attr);
			ChosenValues.put(attr, selectedValue);
		}
		'''
	}
	
	def generateBuildConstraints(List<myConstraint> constraints) {
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
	
	def generateInitializeAttribute(List<myAttribute> attributes){
		'''
		List<String> attributeValues;
		«FOR a:attributes»
		    «IF a.myAttributeContains instanceof myStringEnum»
		    attributeValues = new ArrayList<String>();
			«FOR v:(a.myAttributeContains as myStringEnum).values»
			attributeValues.add("«v»");
			«ENDFOR»
			Attributes.put("«a.name»", attributeValues);
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myNumberEnum»
			attributeValues = new ArrayList<String>();
			«FOR v:(a.myAttributeContains as myNumberEnum).values»
			attributeValues.add("«v»");
			«ENDFOR»
			Attributes.put("«a.name»", attributeValues);
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myBoolean»
			attributeValues = new ArrayList<String>();
			attributeValues.add("«(a.myAttributeContains as myBoolean).trueValue»");
			attributeValues.add("«(a.myAttributeContains as myBoolean).falseValue»");
			Attributes.put("«a.name»", attributeValues);
			«ENDIF»
			
			«IF a.myAttributeContains instanceof myRange»
			attributeValues = new ArrayList<String>();
			«var from = (a.myAttributeContains as myRange).from»
			«var to = (a.myAttributeContains as myRange).to»
			for (int i = «from»; i <= «to»;i++) {
				attributeValues.add(i +".0");
				}
			Attributes.put("«a.name»", attributeValues);
			«ENDIF»
				AttributeTypeMap.put("«a.name»","«a.myAttributeContains.eClass.name»");
		«ENDFOR»
		'''	
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

	def generateCheckConstraints(List<myAttribute> attributes) {
		'''List<String> values;
  		String value;
	  «FOR a:attributes»
	   values = ConstraintMap.get("«a.name»");
	   value = ChosenValues.get("«a.name»");
	   if (values.size() > 0) {
	   System.out.println(value);
	   if (!values.contains(value)) {
	   System.out.println("«a.name» does not contain a valid value");	
	   return false;
	   }
	   } else {
	   System.out.println("«a.name» does not contain a valid value");
	   return false;
	   }
		«ENDFOR»
		return true;
	'''
	}

	// Helper methods

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
		  				sb.append("add(\""+ v +"\");");
		  			}
		  			return "removeNonPossibleValuesFromAttribute(\""+ att.myIntentifierIs.name  +"\", new ArrayList<String>(){{" + sb.toString +"}}, \"" + it.oparand + "\");"
		  		}
		  		if (it.myBinaryRight instanceof myNumberEnum) {
		  			for(v: (it.myBinaryRight as myNumberEnum).values) {
		  				sb.append("add("+ v +");");
		  			}
		  			return "removeNonPossibleValuesFromAttributeNumber(\""+ att.myIntentifierIs.name  +"\", new ArrayList<Double>(){{" + sb.toString +"}}, \"" + it.oparand + "\");"
		  		}
		  	}
		  	return "";
	}

	def String ConvertAttributeName(String name, myValue type) {
		if (type instanceof myRange || type instanceof myNumberEnum) {
			return "Double.parseDouble(ChosenValues.get(\"" + name + "\"))";
		}
		return "ChosenValues.get(\"" + name + "\")"
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

	def generateTxtFile() {
		'''
		String fileName = new SimpleDateFormat("'result-'yyyyMMddhhmm'.txt'").format(new Date());
		FileWriter writer;
try {
	writer = new FileWriter(fileName);
	for (String entry : ChosenValues.keySet()) {
		String key = entry;
		String value = ChosenValues.get(key);
		writer.append(key + ": " + value +"\r\n");
	}
	writer.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		'''
	}
}