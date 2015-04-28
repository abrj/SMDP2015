/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import configuratorProject.myAttribute
import configuratorProject.*;

import java.util.*;

import configuratorProject.myStringEnum


/**
 * Generates code from your model files on save.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SmdpDslGenerator implements IGenerator {


    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        val attributes = resource.allContents.filter(typeof(myAttribute)).toList();
        val xhtmlFileName = "generated/pages/asdf.html"
        fsa.generateFile(xhtmlFileName, generateHtmlMarkup(generateDropDown(attributes)))


        //Generate Java code
        val javaCode = generateJavaCode(attributes);
        val javaFile = "generated/java/HelloWorld.java"
        fsa.generateFile(javaFile, javaCode);


    }

    def generateDropDown(List<myAttribute> attributes) '''
            «FOR attr:attributes»
    <p>«attr.name»:</p> <select>
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



    def generateHtmlMarkup(CharSequence content)'''
    <!doctype html>
    <html lang="en">
    <head>
    <meta charset="utf-8">
    <title>The HTML5 Herald</title>
    <meta name="description" content="The HTML5 Herald">
    <meta name="author" content="SitePoint">
    </head>
    <body>
    «content»
    </body>
    </html>'''

    def generateJavaCode(List<myAttribute> attributes)'''
            import org.eclipse.xtext.xbase.lib.InputOutput;
    import java.util.*;
    //XML parsing imports below
    import java.io.File;
    import javax.xml.parsers.DocumentBuilder;
    import javax.xml.parsers.DocumentBuilderFactory;
    import javax.xml.parsers.ParserConfigurationException;
    import javax.xml.transform.Transformer;
    import javax.xml.transform.TransformerException;
    import javax.xml.transform.TransformerFactory;
    import javax.xml.transform.dom.DOMSource;
    import javax.xml.transform.stream.StreamResult;

    import org.w3c.dom.Attr;
    import org.w3c.dom.Document;
    import org.w3c.dom.Element;


    public class HelloWorld {
        public static Integer rangeInt = 0;
        public static void main(final String[] args) {
            InputOutput.<String>println("LETS GET TO IT..");
            List<String> l;
            HashMap<String, List<String>> hm = new HashMap<String, List<String>>();


            «FOR a:attributes»
            «IF a.myAttributeContains instanceof myStringEnum»
            l = new ArrayList<String>();
            «FOR v:(a.myAttributeContains as myStringEnum).values»
            l.add("«v»");
            «ENDFOR»
            hm.put("«a.name»,string", l);
            «ENDIF»

            «IF a.myAttributeContains instanceof myNumberEnum»
            l = new ArrayList<String>();
            «FOR v:(a.myAttributeContains as myNumberEnum).values»
            l.add("«v»");
            «ENDFOR»
            hm.put("«a.name»,number", l);
            «ENDIF»

            «IF a.myAttributeContains instanceof myRange»
            l = new ArrayList<String>();
            «FOR v:(a.myAttributeContains as myRange).from..(a.myAttributeContains as myRange).to»
            l.add("«v»");
            «ENDFOR»
            hm.put("«a.name»,range", l);
            «ENDIF»

            «IF a.myAttributeContains instanceof myBoolean»
            l = new ArrayList<String>();
            l.add("«(a.myAttributeContains as myBoolean).trueValue»");
            l.add("«(a.myAttributeContains as myBoolean).falseValue»");
            hm.put("«a.name»,boolean", l);
            «ENDIF»
            «ENDFOR»

            String[] attrSelection = new String[hm.size()];
            String[] valueSelection = new String[hm.values().size()];

            run(hm, attrSelection, valueSelection);
            goXML(attrSelection, valueSelection);
        }

        public static void run(HashMap<String, List<String>> hm, String[] attrSelection, String[] valueSelection){
            String[] split;
            String type;
            String attrName;
            Scanner in = new Scanner(System.in);
            int userchoice;
            List<String> stringValues;

            int j = 0;

            for (String attr : hm.keySet() ) {
                //Splits the datatype from the attribute string and sets the attrName to the attribute name without the datatype
                split = attr.split(",");
                attrName = split[0];
                type = split[1];
                System.out.println(attrName + "\n");
                stringValues = hm.get(attr);
                int i = 0;
                //checks if the datatype is "range", if it is rangeInt variable saves the first number of the range and later subtracts it from the number
                //entered by the user to make sure the number held in the arrayList and the number entered by the user is the same
                if (type.equals("range")){
                    rangeInt = Integer.parseInt(stringValues.get(0));
                    System.out.println("Select a range from " + stringValues.get(0) + " to " + stringValues.get(stringValues.size()-1));
                }else {
                    for(String s : stringValues){

                        System.out.println(i + " : " + s);
                        i++;
                    }
                }

                System.out.println("Select a number for " + attrName + "\n");
                System.out.println("Type of data " + type + "\n");
                //saves the selected attribute for xml parsing
                attrSelection[j] = attrName;

                userchoice = Integer.parseInt(in.nextLine())-rangeInt;
                System.out.println("you choose " + stringValues.get(userchoice));
                //saves the selected value for xml parsing
                valueSelection[j] = stringValues.get(userchoice);
                ++j;
            }

        }
        public static void goXML(String[] as, String[] vs ) {
            System.out.println("Attribute: " + Arrays.toString(as) + "Value: " + Arrays.toString(vs));
            try {

                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                // root elements
                Document doc = docBuilder.newDocument();
                Element rootElement = doc.createElement("Attributes");
                doc.appendChild(rootElement);

                // attribute elements
                for (int i = 0; i < as.length; i++) {
                    Element attribute = doc.createElement(as[i]);
                    rootElement.appendChild(attribute);
                    Element value = doc.createElement("value");
                    value.appendChild(doc.createTextNode(vs[i]));
                    attribute.appendChild(value);
                }


                // write the content into xml file
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("C:\\Users\\Rune\\Desktop\\YESSS.xml"));

                // Output to console for testing
                // StreamResult result = new StreamResult(System.out);

                transformer.transform(source, result);

                System.out.println("FILE SAVED TO DESKTOP #YOLO");

            } catch (ParserConfigurationException pce) {
                pce.printStackTrace();
            } catch (TransformerException tfe) {
                tfe.printStackTrace();
            }

        }
    }    '''

}
