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
List<String> attributeValues;
		    attributeValues = new ArrayList<String>();
attributeValues.add("Wedding");
attributeValues.add("Valentine");
attributeValues.add("Mothers day");
attributeValues.add("I'm sorry");
attributeValues.add("Funeral");
attributeValues.add("Birthday");
Attributes.put("bouquetType", attributeValues);



	AttributeTypeMap.put("bouquetType","myStringEnum");



attributeValues = new ArrayList<String>();
for (int i = 2; i <= 30;i++) {
	attributeValues.add(i +".0");
	}
Attributes.put("flowerCount", attributeValues);
	AttributeTypeMap.put("flowerCount","myRange");
		    attributeValues = new ArrayList<String>();
attributeValues.add("Bright Yellow");
attributeValues.add("Pure White");
attributeValues.add("Romantic Red");
attributeValues.add("Stylish Blue");
attributeValues.add("Natural");
attributeValues.add("Earth");
attributeValues.add("Dark");
Attributes.put("colorTheme", attributeValues);



	AttributeTypeMap.put("colorTheme","myStringEnum");


attributeValues = new ArrayList<String>();
attributeValues.add("Paper");
attributeValues.add("Plastic");
Attributes.put("wrapping", attributeValues);

	AttributeTypeMap.put("wrapping","myBoolean");
		    attributeValues = new ArrayList<String>();
attributeValues.add("Brown");
attributeValues.add("Blue");
attributeValues.add("White");
attributeValues.add("Clear");
Attributes.put("wrappingColor", attributeValues);



	AttributeTypeMap.put("wrappingColor","myStringEnum");
		    attributeValues = new ArrayList<String>();
attributeValues.add("Clown");
attributeValues.add("Heart");
attributeValues.add("Simple White");
attributeValues.add("Cherubs");
attributeValues.add("Forest");
attributeValues.add("Water");
Attributes.put("greetingCard", attributeValues);



	AttributeTypeMap.put("greetingCard","myStringEnum");
}

public static void buildContrains() {
if (ChosenValues.get("bouquetType") == "Funeral"){
	removeNonPossibleValuesFromAttribute("colorTheme", new ArrayList<String>(){{add("Pure White");}}, "is");removeNonPossibleValuesFromAttribute("greetingCard", new ArrayList<String>(){{add("Simple White");}}, "is");
}
if (2 <= Double.parseDouble(ChosenValues.get("flowerCount")) && 30 >= Double.parseDouble(ChosenValues.get("flowerCount"))){
	removeNonPossibleValuesFromAttribute("bouquetType", new ArrayList<String>(){{add("Wedding");}}, "is");
}
if (((ChosenValues.get("bouquetType") ==  "Wedding" || ChosenValues.get("bouquetType") == "I'm sorry") && (ChosenValues.get("colorTheme") == "Pure White")) && (ChosenValues.get("greetingCard") == "Clown")){
	removeNonPossibleValuesFromAttributeNumber("flowerCount", new ArrayList<Double>(){{add(15.0);}}, "lt");
}
if (ChosenValues.get("colorTheme") == "Earth"){
	removeNonPossibleValuesFromAttribute("greetingCard", new ArrayList<String>(){{add("Forest");add("Water");}}, "is");
}
if (ChosenValues.get("wrapping") == "Paper"){
	removeNonPossibleValuesFromAttribute("wrappingColor", new ArrayList<String>(){{add("Brown");add("White");}}, "is");
}
if (ChosenValues.get("greetingCard") == "Clown"){
	removeNonPossibleValuesFromAttribute("bouquetType", new ArrayList<String>(){{add("I'm sorry");add("Birthday");}}, "is");
}
if (ChosenValues.get("bouquetType") == "Valentine"){
	removeNonPossibleValuesFromAttribute("colorTheme", new ArrayList<String>(){{add("Romantic Red");}}, "is");removeNonPossibleValuesFromAttribute("greetingCard", new ArrayList<String>(){{add("Heart");add("Simple White");add("Cherubs");}}, "is");removeNonPossibleValuesFromAttributeNumber("flowerCount", new ArrayList<Double>(){{add(29.0);}}, "lt");
}
}

public static boolean checkConstraints() {
List<String> values;
  		String value;
	  values = ConstraintMap.get("bouquetType");
	  value = ChosenValues.get("bouquetType");
	  if (values.size() > 0) {
	  System.out.println(value);
	  if (!values.contains(value)) {
	  System.out.println("bouquetType does not contain a valid value");	
	  return false;
	  }
	  } else {
	  System.out.println("bouquetType does not contain a valid value");
	  return false;
	  }
	  values = ConstraintMap.get("flowerCount");
	  value = ChosenValues.get("flowerCount");
	  if (values.size() > 0) {
	  System.out.println(value);
	  if (!values.contains(value)) {
	  System.out.println("flowerCount does not contain a valid value");	
	  return false;
	  }
	  } else {
	  System.out.println("flowerCount does not contain a valid value");
	  return false;
	  }
	  values = ConstraintMap.get("colorTheme");
	  value = ChosenValues.get("colorTheme");
	  if (values.size() > 0) {
	  System.out.println(value);
	  if (!values.contains(value)) {
	  System.out.println("colorTheme does not contain a valid value");	
	  return false;
	  }
	  } else {
	  System.out.println("colorTheme does not contain a valid value");
	  return false;
	  }
	  values = ConstraintMap.get("wrapping");
	  value = ChosenValues.get("wrapping");
	  if (values.size() > 0) {
	  System.out.println(value);
	  if (!values.contains(value)) {
	  System.out.println("wrapping does not contain a valid value");	
	  return false;
	  }
	  } else {
	  System.out.println("wrapping does not contain a valid value");
	  return false;
	  }
	  values = ConstraintMap.get("wrappingColor");
	  value = ChosenValues.get("wrappingColor");
	  if (values.size() > 0) {
	  System.out.println(value);
	  if (!values.contains(value)) {
	  System.out.println("wrappingColor does not contain a valid value");	
	  return false;
	  }
	  } else {
	  System.out.println("wrappingColor does not contain a valid value");
	  return false;
	  }
	  values = ConstraintMap.get("greetingCard");
	  value = ChosenValues.get("greetingCard");
	  if (values.size() > 0) {
	  System.out.println(value);
	  if (!values.contains(value)) {
	  System.out.println("greetingCard does not contain a valid value");	
	  return false;
	  }
	  } else {
	  System.out.println("greetingCard does not contain a valid value");
	  return false;
	  }
		return true;
}

public static void writeToFile() {
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
}

public static void run() {
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
}

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
}
