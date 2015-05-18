package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import configuratorProject.myAttribute;
import configuratorProject.myBinary;
import configuratorProject.myBinaryOparators;
import configuratorProject.myBoolean;
import configuratorProject.myConstraint;
import configuratorProject.myExpression;
import configuratorProject.myIdentifier;
import configuratorProject.myNumberEnum;
import configuratorProject.myRange;
import configuratorProject.myStringEnum;
import configuratorProject.myValue;
import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class JavaScriptCodeGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<myAttribute> _filter = Iterators.<myAttribute>filter(_allContents, myAttribute.class);
    final List<myAttribute> attributes = IteratorExtensions.<myAttribute>toList(_filter);
    TreeIterator<EObject> _allContents_1 = resource.getAllContents();
    Iterator<myConstraint> _filter_1 = Iterators.<myConstraint>filter(_allContents_1, myConstraint.class);
    final List<myConstraint> constraints = IteratorExtensions.<myConstraint>toList(_filter_1);
    final String javaScriptCode = this.generateCode(attributes, constraints);
    final String filePath = "generated/web/CodeGen.html";
    fsa.generateFile(filePath, javaScriptCode);
  }
  
  public String generateCode(final List<myAttribute> attributes, final List<myConstraint> constraints) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!doctype html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>Configurator</title>");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function clone(obj) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (null == obj || \"object\" != typeof obj) return obj;");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.append("var copy = obj.constructor();");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.append("for (var attr in obj) {");
    _builder.newLine();
    _builder.append("        \t\t\t");
    _builder.append("if (obj.hasOwnProperty(attr)) copy[attr] = clone(obj[attr]);");
    _builder.newLine();
    _builder.append("    \t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.append("return copy;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var Attributes = {};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var AttributeTypeMap = {};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var ConstraintMap = {};");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("function generateInitialAttributes() {");
    _builder.newLine();
    CharSequence _generateInitializeAttributes = this.generateInitializeAttributes(attributes);
    String _plus = (_builder.toString() + _generateInitializeAttributes);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\t");
    _builder_1.append("ConstraintMap = clone(Attributes);");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("function generateBuildConstraints() {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("ConstraintMap = clone(Attributes);");
    _builder_1.newLine();
    String _plus_1 = (_plus + _builder_1);
    CharSequence _generateBuildConstraints = this.generateBuildConstraints(constraints);
    String _plus_2 = (_plus_1 + _generateBuildConstraints);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("function generateCheckConstraints() {");
    _builder_2.newLine();
    String _plus_3 = (_plus_2 + _builder_2);
    CharSequence _generateCheckConstraints = this.generateCheckConstraints(attributes);
    String _plus_4 = (_plus_3 + _generateCheckConstraints);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    String _plus_5 = (_plus_4 + _builder_3);
    CharSequence _genereateTextOutput = this.genereateTextOutput();
    String _plus_6 = (_plus_5 + _genereateTextOutput);
    StringConcatenation _builder_4 = new StringConcatenation();
    String _plus_7 = (_plus_6 + _builder_4);
    CharSequence _generateStaticMethods = this.generateStaticMethods();
    String _plus_8 = (_plus_7 + _generateStaticMethods);
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("\t");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("document.addEventListener(\'DOMContentLoaded\', function() {");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("generateInitialAttributes();");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("});");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("</script>");
    _builder_5.newLine();
    _builder_5.append("  ");
    _builder_5.newLine();
    _builder_5.append("  ");
    _builder_5.newLine();
    _builder_5.append("  ");
    _builder_5.newLine();
    _builder_5.append("</head>");
    _builder_5.newLine();
    _builder_5.append("<body>");
    _builder_5.newLine();
    _builder_5.newLine();
    String _plus_9 = (_plus_8 + _builder_5);
    CharSequence _generateDropDown = this.generateDropDown(attributes);
    String _plus_10 = (_plus_9 + _generateDropDown);
    StringConcatenation _builder_6 = new StringConcatenation();
    _builder_6.newLine();
    _builder_6.append("<button onclick=\"generateBuildConstraints(),generateCheckConstraints()\">Check</button>");
    _builder_6.newLine();
    _builder_6.append("<button onclick=\"save()\">Save</button>");
    _builder_6.newLine();
    _builder_6.append("</body>");
    _builder_6.newLine();
    _builder_6.append("</html>");
    _builder_6.newLine();
    return (_plus_10 + _builder_6);
  }
  
  public CharSequence generateDropDown(final List<myAttribute> attributes) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final myAttribute attr : attributes) {
        _builder.append("<p>");
        String _name = attr.getName();
        _builder.append(_name, "");
        _builder.append(":</p> <select id=\"");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "");
        _builder.append("\"\">");
        _builder.newLineIfNotEmpty();
        {
          myValue _myAttributeContains = attr.getMyAttributeContains();
          if ((_myAttributeContains instanceof myStringEnum)) {
            {
              myValue _myAttributeContains_1 = attr.getMyAttributeContains();
              EList<String> _values = ((myStringEnum) _myAttributeContains_1).getValues();
              for(final String v : _values) {
                _builder.append("<option value=\"");
                _builder.append(v, "");
                _builder.append("\">");
                _builder.append(v, "");
                _builder.append("</option>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
        {
          myValue _myAttributeContains_2 = attr.getMyAttributeContains();
          if ((_myAttributeContains_2 instanceof myNumberEnum)) {
            {
              myValue _myAttributeContains_3 = attr.getMyAttributeContains();
              EList<Double> _values_1 = ((myNumberEnum) _myAttributeContains_3).getValues();
              for(final Double v_1 : _values_1) {
                _builder.append("<option value=\"");
                _builder.append(v_1, "");
                _builder.append("\">");
                _builder.append(v_1, "");
                _builder.append("</option>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
        {
          myValue _myAttributeContains_4 = attr.getMyAttributeContains();
          if ((_myAttributeContains_4 instanceof myRange)) {
            {
              myValue _myAttributeContains_5 = attr.getMyAttributeContains();
              int _from = ((myRange) _myAttributeContains_5).getFrom();
              myValue _myAttributeContains_6 = attr.getMyAttributeContains();
              int _to = ((myRange) _myAttributeContains_6).getTo();
              IntegerRange _upTo = new IntegerRange(_from, _to);
              for(final Integer v_2 : _upTo) {
                _builder.append("<option value=\"");
                _builder.append(v_2, "");
                _builder.append("\">");
                _builder.append(v_2, "");
                _builder.append("</option>");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        _builder.newLine();
        {
          myValue _myAttributeContains_7 = attr.getMyAttributeContains();
          if ((_myAttributeContains_7 instanceof myBoolean)) {
            _builder.append("<option value=\"");
            myValue _myAttributeContains_8 = attr.getMyAttributeContains();
            String _trueValue = ((myBoolean) _myAttributeContains_8).getTrueValue();
            _builder.append(_trueValue, "");
            _builder.append("\">");
            myValue _myAttributeContains_9 = attr.getMyAttributeContains();
            String _trueValue_1 = ((myBoolean) _myAttributeContains_9).getTrueValue();
            _builder.append(_trueValue_1, "");
            _builder.append("</option>");
            _builder.newLineIfNotEmpty();
            _builder.append("<option value=\"");
            myValue _myAttributeContains_10 = attr.getMyAttributeContains();
            String _falseValue = ((myBoolean) _myAttributeContains_10).getFalseValue();
            _builder.append(_falseValue, "");
            _builder.append("\">");
            myValue _myAttributeContains_11 = attr.getMyAttributeContains();
            String _falseValue_1 = ((myBoolean) _myAttributeContains_11).getFalseValue();
            _builder.append(_falseValue_1, "");
            _builder.append("</option>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("</select>");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateInitializeAttributes(final List<myAttribute> attributes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      for(final myAttribute a : attributes) {
        {
          myValue _myAttributeContains = a.getMyAttributeContains();
          if ((_myAttributeContains instanceof myStringEnum)) {
            _builder.append("var attributeValues = [];");
            _builder.newLine();
            _builder.append("var i = 0;");
            _builder.newLine();
            {
              myValue _myAttributeContains_1 = a.getMyAttributeContains();
              EList<String> _values = ((myStringEnum) _myAttributeContains_1).getValues();
              for(final String v : _values) {
                _builder.append("attributeValues[i] = \"");
                _builder.append(v, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("i++;");
                _builder.newLine();
              }
            }
            _builder.append("Attributes[\"");
            String _name = a.getName();
            _builder.append(_name, "");
            _builder.append("\"] = attributeValues;");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          myValue _myAttributeContains_2 = a.getMyAttributeContains();
          if ((_myAttributeContains_2 instanceof myNumberEnum)) {
            _builder.append("var attributeValues = [];");
            _builder.newLine();
            _builder.append("var i = 0;");
            _builder.newLine();
            {
              myValue _myAttributeContains_3 = a.getMyAttributeContains();
              EList<Double> _values_1 = ((myNumberEnum) _myAttributeContains_3).getValues();
              for(final Double v_1 : _values_1) {
                _builder.append("attributeValues[i] = \"");
                _builder.append(v_1, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("i++;");
                _builder.newLine();
              }
            }
            _builder.append("Attributes[\"");
            String _name_1 = a.getName();
            _builder.append(_name_1, "");
            _builder.append("\"] = attributeValues;");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          myValue _myAttributeContains_4 = a.getMyAttributeContains();
          if ((_myAttributeContains_4 instanceof myBoolean)) {
            _builder.append("var attributeValues = [];");
            _builder.newLine();
            _builder.append("attributeValues[0] = \"");
            myValue _myAttributeContains_5 = a.getMyAttributeContains();
            String _trueValue = ((myBoolean) _myAttributeContains_5).getTrueValue();
            _builder.append(_trueValue, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("attributeValues[1] = \"");
            myValue _myAttributeContains_6 = a.getMyAttributeContains();
            String _falseValue = ((myBoolean) _myAttributeContains_6).getFalseValue();
            _builder.append(_falseValue, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("Attributes[\"");
            String _name_2 = a.getName();
            _builder.append(_name_2, "");
            _builder.append("\"] = attributeValues;");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.newLine();
        {
          myValue _myAttributeContains_7 = a.getMyAttributeContains();
          if ((_myAttributeContains_7 instanceof myRange)) {
            _builder.append("var attributeValues = [];");
            _builder.newLine();
            myValue _myAttributeContains_8 = a.getMyAttributeContains();
            int from = ((myRange) _myAttributeContains_8).getFrom();
            _builder.newLineIfNotEmpty();
            myValue _myAttributeContains_9 = a.getMyAttributeContains();
            int to = ((myRange) _myAttributeContains_9).getTo();
            _builder.newLineIfNotEmpty();
            {
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(from, (to + 1), true);
              for(final Integer i : _doubleDotLessThan) {
                _builder.append("attributeValues[");
                _builder.append(((i).intValue() - from), "");
                _builder.append("] = ");
                _builder.append(((double) (i).intValue()), "");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("Attributes[\"");
            String _name_3 = a.getName();
            _builder.append(_name_3, "");
            _builder.append("\"] = attributeValues;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence genereateTextOutput() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("function download(filename, text) {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("var pom = document.createElement(\'a\');");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("pom.setAttribute(\'href\', \'data:text/plain;charset=utf-8,\' + encodeURIComponent(text));");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("pom.setAttribute(\'download\', filename);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("pom.style.display = \'none\';");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("document.body.appendChild(pom);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("pom.click();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("document.body.removeChild(pom);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("function save() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("dropdowns = document.body.querySelectorAll(\'select\');");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("result = \"\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (i = 0; i < dropdowns.length; i++) { ");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.append("result += dropdowns[i].id + \": \" + dropdowns[i].value + \"\\r\\n\";");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("download(\"results.txt\", result);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateBuildConstraints(final List<myConstraint> constraints) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final myConstraint con : constraints) {
        myExpression _myIfConstraint = con.getMyIfConstraint();
        final myBinary exprIf = ((myBinary) _myIfConstraint);
        _builder.newLineIfNotEmpty();
        myExpression _myThenConstraint = con.getMyThenConstraint();
        final myBinary exprThen = ((myBinary) _myThenConstraint);
        _builder.newLineIfNotEmpty();
        _builder.append("if ");
        String _generateIfConstraintString = this.generateIfConstraintString(exprIf, null, null);
        _builder.append(_generateIfConstraintString, "");
        _builder.append("{");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generateThenConstraintString = this.generateThenConstraintString(exprThen, null);
        _builder.append(_generateThenConstraintString, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public String generateIfConstraintString(final myBinary it, final myIdentifier attribute, final myBinaryOparators parentOperand) {
    myIdentifier att = null;
    myBinaryOparators pOpe = null;
    myExpression _myBinaryLeft = it.getMyBinaryLeft();
    if ((_myBinaryLeft instanceof myIdentifier)) {
      myExpression _myBinaryLeft_1 = it.getMyBinaryLeft();
      att = ((myIdentifier) _myBinaryLeft_1);
      myBinaryOparators _oparand = it.getOparand();
      pOpe = _oparand;
    } else {
      att = attribute;
      pOpe = parentOperand;
    }
    boolean _and = false;
    myExpression _myBinaryLeft_2 = it.getMyBinaryLeft();
    if (!(_myBinaryLeft_2 instanceof myBinary)) {
      _and = false;
    } else {
      myExpression _myBinaryRight = it.getMyBinaryRight();
      _and = (_myBinaryRight instanceof myBinary);
    }
    if (_and) {
      myExpression _myBinaryLeft_3 = it.getMyBinaryLeft();
      String _generateIfConstraintString = this.generateIfConstraintString(((myBinary) _myBinaryLeft_3), att, pOpe);
      String _plus = ("(" + _generateIfConstraintString);
      String _plus_1 = (_plus + " ");
      myBinaryOparators _oparand_1 = it.getOparand();
      String _convertOperand = this.convertOperand(_oparand_1);
      String _plus_2 = (_plus_1 + _convertOperand);
      String _plus_3 = (_plus_2 + " ");
      myExpression _myBinaryRight_1 = it.getMyBinaryRight();
      String _generateIfConstraintString_1 = this.generateIfConstraintString(((myBinary) _myBinaryRight_1), att, pOpe);
      String _plus_4 = (_plus_3 + _generateIfConstraintString_1);
      return (_plus_4 + ")");
    }
    boolean _and_1 = false;
    myExpression _myBinaryLeft_4 = it.getMyBinaryLeft();
    if (!(_myBinaryLeft_4 instanceof myIdentifier)) {
      _and_1 = false;
    } else {
      myExpression _myBinaryRight_2 = it.getMyBinaryRight();
      _and_1 = (_myBinaryRight_2 instanceof myBinary);
    }
    if (_and_1) {
      myExpression _myBinaryRight_3 = it.getMyBinaryRight();
      return this.generateIfConstraintString(((myBinary) _myBinaryRight_3), att, pOpe);
    }
    boolean _and_2 = false;
    myExpression _myBinaryLeft_5 = it.getMyBinaryLeft();
    if (!(_myBinaryLeft_5 instanceof myValue)) {
      _and_2 = false;
    } else {
      myExpression _myBinaryRight_4 = it.getMyBinaryRight();
      _and_2 = (_myBinaryRight_4 instanceof myValue);
    }
    if (_and_2) {
      myAttribute _myIntentifierIs = att.getMyIntentifierIs();
      myValue _myAttributeContains = _myIntentifierIs.getMyAttributeContains();
      if ((_myAttributeContains instanceof myNumberEnum)) {
        myAttribute _myIntentifierIs_1 = att.getMyIntentifierIs();
        String _name = _myIntentifierIs_1.getName();
        myAttribute _myIntentifierIs_2 = att.getMyIntentifierIs();
        myValue _myAttributeContains_1 = _myIntentifierIs_2.getMyAttributeContains();
        String _ConvertAttributeName = this.ConvertAttributeName(_name, _myAttributeContains_1);
        String _plus_5 = ("(" + _ConvertAttributeName);
        String _plus_6 = (_plus_5 + " ");
        String _convertOperand_1 = this.convertOperand(pOpe);
        String _plus_7 = (_plus_6 + _convertOperand_1);
        String _plus_8 = (_plus_7 + " ");
        myExpression _myBinaryLeft_6 = it.getMyBinaryLeft();
        EList<Double> _values = ((myNumberEnum) _myBinaryLeft_6).getValues();
        Double _get = _values.get(0);
        String _plus_9 = (_plus_8 + _get);
        String _plus_10 = (_plus_9 + " || ");
        myAttribute _myIntentifierIs_3 = att.getMyIntentifierIs();
        String _name_1 = _myIntentifierIs_3.getName();
        myAttribute _myIntentifierIs_4 = att.getMyIntentifierIs();
        myValue _myAttributeContains_2 = _myIntentifierIs_4.getMyAttributeContains();
        String _ConvertAttributeName_1 = this.ConvertAttributeName(_name_1, _myAttributeContains_2);
        String _plus_11 = (_plus_10 + _ConvertAttributeName_1);
        String _plus_12 = (_plus_11 + " ");
        String _convertOperand_2 = this.convertOperand(pOpe);
        String _plus_13 = (_plus_12 + _convertOperand_2);
        String _plus_14 = (_plus_13 + " ");
        myExpression _myBinaryRight_5 = it.getMyBinaryRight();
        EList<Double> _values_1 = ((myNumberEnum) _myBinaryRight_5).getValues();
        Double _get_1 = _values_1.get(0);
        String _plus_15 = (_plus_14 + _get_1);
        return (_plus_15 + ")");
      }
      myAttribute _myIntentifierIs_5 = att.getMyIntentifierIs();
      myValue _myAttributeContains_3 = _myIntentifierIs_5.getMyAttributeContains();
      if ((_myAttributeContains_3 instanceof myStringEnum)) {
        myAttribute _myIntentifierIs_6 = att.getMyIntentifierIs();
        String _name_2 = _myIntentifierIs_6.getName();
        myAttribute _myIntentifierIs_7 = att.getMyIntentifierIs();
        myValue _myAttributeContains_4 = _myIntentifierIs_7.getMyAttributeContains();
        String _ConvertAttributeName_2 = this.ConvertAttributeName(_name_2, _myAttributeContains_4);
        String _plus_16 = ("(" + _ConvertAttributeName_2);
        String _plus_17 = (_plus_16 + " ");
        String _convertOperand_3 = this.convertOperand(pOpe);
        String _plus_18 = (_plus_17 + _convertOperand_3);
        String _plus_19 = (_plus_18 + "  \"");
        myExpression _myBinaryLeft_7 = it.getMyBinaryLeft();
        EList<String> _values_2 = ((myStringEnum) _myBinaryLeft_7).getValues();
        String _get_2 = _values_2.get(0);
        String _plus_20 = (_plus_19 + _get_2);
        String _plus_21 = (_plus_20 + "\" || ");
        myAttribute _myIntentifierIs_8 = att.getMyIntentifierIs();
        String _name_3 = _myIntentifierIs_8.getName();
        myAttribute _myIntentifierIs_9 = att.getMyIntentifierIs();
        myValue _myAttributeContains_5 = _myIntentifierIs_9.getMyAttributeContains();
        String _ConvertAttributeName_3 = this.ConvertAttributeName(_name_3, _myAttributeContains_5);
        String _plus_22 = (_plus_21 + _ConvertAttributeName_3);
        String _plus_23 = (_plus_22 + " ");
        String _convertOperand_4 = this.convertOperand(pOpe);
        String _plus_24 = (_plus_23 + _convertOperand_4);
        String _plus_25 = (_plus_24 + " \"");
        myExpression _myBinaryRight_6 = it.getMyBinaryRight();
        EList<String> _values_3 = ((myStringEnum) _myBinaryRight_6).getValues();
        String _get_3 = _values_3.get(0);
        String _plus_26 = (_plus_25 + _get_3);
        return (_plus_26 + "\")");
      }
    }
    boolean _and_3 = false;
    myExpression _myBinaryLeft_8 = it.getMyBinaryLeft();
    if (!(_myBinaryLeft_8 instanceof myValue)) {
      _and_3 = false;
    } else {
      myExpression _myBinaryRight_7 = it.getMyBinaryRight();
      _and_3 = (_myBinaryRight_7 instanceof myBinary);
    }
    if (_and_3) {
      myAttribute _myIntentifierIs_10 = att.getMyIntentifierIs();
      myValue _myAttributeContains_6 = _myIntentifierIs_10.getMyAttributeContains();
      if ((_myAttributeContains_6 instanceof myNumberEnum)) {
        myAttribute _myIntentifierIs_11 = att.getMyIntentifierIs();
        String _name_4 = _myIntentifierIs_11.getName();
        myAttribute _myIntentifierIs_12 = att.getMyIntentifierIs();
        myValue _myAttributeContains_7 = _myIntentifierIs_12.getMyAttributeContains();
        String _ConvertAttributeName_4 = this.ConvertAttributeName(_name_4, _myAttributeContains_7);
        String _plus_27 = ("(" + _ConvertAttributeName_4);
        String _plus_28 = (_plus_27 + " ");
        String _convertOperand_5 = this.convertOperand(pOpe);
        String _plus_29 = (_plus_28 + _convertOperand_5);
        String _plus_30 = (_plus_29 + " ");
        myExpression _myBinaryLeft_9 = it.getMyBinaryLeft();
        EList<Double> _values_4 = ((myNumberEnum) _myBinaryLeft_9).getValues();
        Double _get_4 = _values_4.get(0);
        String _plus_31 = (_plus_30 + _get_4);
        String _plus_32 = (_plus_31 + " || ");
        myExpression _myBinaryRight_8 = it.getMyBinaryRight();
        String _generateIfConstraintString_2 = this.generateIfConstraintString(((myBinary) _myBinaryRight_8), att, pOpe);
        String _plus_33 = (_plus_32 + _generateIfConstraintString_2);
        return (_plus_33 + ")");
      }
      myAttribute _myIntentifierIs_13 = att.getMyIntentifierIs();
      myValue _myAttributeContains_8 = _myIntentifierIs_13.getMyAttributeContains();
      if ((_myAttributeContains_8 instanceof myStringEnum)) {
        myAttribute _myIntentifierIs_14 = att.getMyIntentifierIs();
        String _name_5 = _myIntentifierIs_14.getName();
        myAttribute _myIntentifierIs_15 = att.getMyIntentifierIs();
        myValue _myAttributeContains_9 = _myIntentifierIs_15.getMyAttributeContains();
        String _ConvertAttributeName_5 = this.ConvertAttributeName(_name_5, _myAttributeContains_9);
        String _plus_34 = ("(" + _ConvertAttributeName_5);
        String _plus_35 = (_plus_34 + " ");
        String _convertOperand_6 = this.convertOperand(pOpe);
        String _plus_36 = (_plus_35 + _convertOperand_6);
        String _plus_37 = (_plus_36 + " \"");
        myExpression _myBinaryLeft_10 = it.getMyBinaryLeft();
        EList<String> _values_5 = ((myStringEnum) _myBinaryLeft_10).getValues();
        String _get_5 = _values_5.get(0);
        String _plus_38 = (_plus_37 + _get_5);
        String _plus_39 = (_plus_38 + "\" || ");
        myExpression _myBinaryRight_9 = it.getMyBinaryRight();
        String _generateIfConstraintString_3 = this.generateIfConstraintString(((myBinary) _myBinaryRight_9), att, pOpe);
        String _plus_40 = (_plus_39 + _generateIfConstraintString_3);
        return (_plus_40 + ")");
      }
    }
    boolean _and_4 = false;
    myExpression _myBinaryLeft_11 = it.getMyBinaryLeft();
    if (!(_myBinaryLeft_11 instanceof myIdentifier)) {
      _and_4 = false;
    } else {
      myExpression _myBinaryRight_10 = it.getMyBinaryRight();
      _and_4 = (_myBinaryRight_10 instanceof myValue);
    }
    if (_and_4) {
      myAttribute _myIntentifierIs_16 = att.getMyIntentifierIs();
      myValue _myAttributeContains_10 = _myIntentifierIs_16.getMyAttributeContains();
      if ((_myAttributeContains_10 instanceof myNumberEnum)) {
        myAttribute _myIntentifierIs_17 = att.getMyIntentifierIs();
        String _name_6 = _myIntentifierIs_17.getName();
        myAttribute _myIntentifierIs_18 = att.getMyIntentifierIs();
        myValue _myAttributeContains_11 = _myIntentifierIs_18.getMyAttributeContains();
        String _ConvertAttributeName_6 = this.ConvertAttributeName(_name_6, _myAttributeContains_11);
        String _plus_41 = ("(" + _ConvertAttributeName_6);
        String _plus_42 = (_plus_41 + " ");
        myBinaryOparators _oparand_2 = it.getOparand();
        String _convertOperand_7 = this.convertOperand(_oparand_2);
        String _plus_43 = (_plus_42 + _convertOperand_7);
        String _plus_44 = (_plus_43 + " ");
        myExpression _myBinaryRight_11 = it.getMyBinaryRight();
        EList<Double> _values_6 = ((myNumberEnum) _myBinaryRight_11).getValues();
        Double _get_6 = _values_6.get(0);
        String _plus_45 = (_plus_44 + _get_6);
        return (_plus_45 + ")");
      }
      myAttribute _myIntentifierIs_19 = att.getMyIntentifierIs();
      myValue _myAttributeContains_12 = _myIntentifierIs_19.getMyAttributeContains();
      if ((_myAttributeContains_12 instanceof myStringEnum)) {
        myAttribute _myIntentifierIs_20 = att.getMyIntentifierIs();
        String _name_7 = _myIntentifierIs_20.getName();
        myAttribute _myIntentifierIs_21 = att.getMyIntentifierIs();
        myValue _myAttributeContains_13 = _myIntentifierIs_21.getMyAttributeContains();
        String _ConvertAttributeName_7 = this.ConvertAttributeName(_name_7, _myAttributeContains_13);
        String _plus_46 = ("(" + _ConvertAttributeName_7);
        String _plus_47 = (_plus_46 + " ");
        myBinaryOparators _oparand_3 = it.getOparand();
        String _convertOperand_8 = this.convertOperand(_oparand_3);
        String _plus_48 = (_plus_47 + _convertOperand_8);
        String _plus_49 = (_plus_48 + " \"");
        myExpression _myBinaryRight_12 = it.getMyBinaryRight();
        EList<String> _values_7 = ((myStringEnum) _myBinaryRight_12).getValues();
        String _get_7 = _values_7.get(0);
        String _plus_50 = (_plus_49 + _get_7);
        return (_plus_50 + "\")");
      }
      myAttribute _myIntentifierIs_22 = att.getMyIntentifierIs();
      myValue _myAttributeContains_14 = _myIntentifierIs_22.getMyAttributeContains();
      if ((_myAttributeContains_14 instanceof myRange)) {
        myAttribute _myIntentifierIs_23 = att.getMyIntentifierIs();
        myValue _myAttributeContains_15 = _myIntentifierIs_23.getMyAttributeContains();
        int _from = ((myRange) _myAttributeContains_15).getFrom();
        String _plus_51 = ("(" + Integer.valueOf(_from));
        String _plus_52 = (_plus_51 + " <= ");
        myAttribute _myIntentifierIs_24 = att.getMyIntentifierIs();
        String _name_8 = _myIntentifierIs_24.getName();
        myAttribute _myIntentifierIs_25 = att.getMyIntentifierIs();
        myValue _myAttributeContains_16 = _myIntentifierIs_25.getMyAttributeContains();
        String _ConvertAttributeName_8 = this.ConvertAttributeName(_name_8, _myAttributeContains_16);
        String _plus_53 = (_plus_52 + _ConvertAttributeName_8);
        String _plus_54 = (_plus_53 + " && ");
        myAttribute _myIntentifierIs_26 = att.getMyIntentifierIs();
        myValue _myAttributeContains_17 = _myIntentifierIs_26.getMyAttributeContains();
        int _to = ((myRange) _myAttributeContains_17).getTo();
        String _plus_55 = (_plus_54 + Integer.valueOf(_to));
        String _plus_56 = (_plus_55 + " >= ");
        myAttribute _myIntentifierIs_27 = att.getMyIntentifierIs();
        String _name_9 = _myIntentifierIs_27.getName();
        myAttribute _myIntentifierIs_28 = att.getMyIntentifierIs();
        myValue _myAttributeContains_18 = _myIntentifierIs_28.getMyAttributeContains();
        String _ConvertAttributeName_9 = this.ConvertAttributeName(_name_9, _myAttributeContains_18);
        String _plus_57 = (_plus_56 + _ConvertAttributeName_9);
        return (_plus_57 + ")");
      }
      myAttribute _myIntentifierIs_29 = att.getMyIntentifierIs();
      myValue _myAttributeContains_19 = _myIntentifierIs_29.getMyAttributeContains();
      if ((_myAttributeContains_19 instanceof myBoolean)) {
        myAttribute _myIntentifierIs_30 = att.getMyIntentifierIs();
        String _name_10 = _myIntentifierIs_30.getName();
        myAttribute _myIntentifierIs_31 = att.getMyIntentifierIs();
        myValue _myAttributeContains_20 = _myIntentifierIs_31.getMyAttributeContains();
        String _ConvertAttributeName_10 = this.ConvertAttributeName(_name_10, _myAttributeContains_20);
        String _plus_58 = ("(" + _ConvertAttributeName_10);
        String _plus_59 = (_plus_58 + " ");
        myBinaryOparators _oparand_4 = it.getOparand();
        String _convertOperand_9 = this.convertOperand(_oparand_4);
        String _plus_60 = (_plus_59 + _convertOperand_9);
        String _plus_61 = (_plus_60 + " \"");
        myExpression _myBinaryRight_13 = it.getMyBinaryRight();
        EList<String> _values_8 = ((myStringEnum) _myBinaryRight_13).getValues();
        String _get_8 = _values_8.get(0);
        String _plus_62 = (_plus_61 + _get_8);
        return (_plus_62 + "\")");
      }
    }
    return "FUCKED!";
  }
  
  public String generateThenConstraintString(final myBinary it, final myIdentifier attribute) {
    boolean _and = false;
    myExpression _myBinaryLeft = it.getMyBinaryLeft();
    if (!(_myBinaryLeft instanceof myBinary)) {
      _and = false;
    } else {
      myExpression _myBinaryRight = it.getMyBinaryRight();
      _and = (_myBinaryRight instanceof myBinary);
    }
    if (_and) {
      myExpression _myBinaryLeft_1 = it.getMyBinaryLeft();
      String _generateThenConstraintString = this.generateThenConstraintString(((myBinary) _myBinaryLeft_1), null);
      myExpression _myBinaryRight_1 = it.getMyBinaryRight();
      String _generateThenConstraintString_1 = this.generateThenConstraintString(((myBinary) _myBinaryRight_1), null);
      return (_generateThenConstraintString + _generateThenConstraintString_1);
    }
    myIdentifier att = null;
    myExpression _myBinaryLeft_2 = it.getMyBinaryLeft();
    if ((_myBinaryLeft_2 instanceof myIdentifier)) {
      myExpression _myBinaryLeft_3 = it.getMyBinaryLeft();
      att = ((myIdentifier) _myBinaryLeft_3);
    } else {
      att = attribute;
    }
    boolean _and_1 = false;
    myExpression _myBinaryLeft_4 = it.getMyBinaryLeft();
    if (!(_myBinaryLeft_4 instanceof myIdentifier)) {
      _and_1 = false;
    } else {
      myExpression _myBinaryRight_2 = it.getMyBinaryRight();
      _and_1 = (_myBinaryRight_2 instanceof myValue);
    }
    if (_and_1) {
      StringBuilder sb = new StringBuilder();
      myExpression _myBinaryRight_3 = it.getMyBinaryRight();
      if ((_myBinaryRight_3 instanceof myStringEnum)) {
        myExpression _myBinaryRight_4 = it.getMyBinaryRight();
        EList<String> _values = ((myStringEnum) _myBinaryRight_4).getValues();
        for (final String v : _values) {
          sb.append((("\"" + v) + "\","));
        }
        myAttribute _myIntentifierIs = att.getMyIntentifierIs();
        String _name = _myIntentifierIs.getName();
        String _plus = ("removeNonPossibleValuesFromAttribute(\"" + _name);
        String _plus_1 = (_plus + "\", [");
        String _string = sb.toString();
        String _plus_2 = (_plus_1 + _string);
        String _plus_3 = (_plus_2 + "], \"");
        myBinaryOparators _oparand = it.getOparand();
        String _plus_4 = (_plus_3 + _oparand);
        return (_plus_4 + "\");");
      }
      myExpression _myBinaryRight_5 = it.getMyBinaryRight();
      if ((_myBinaryRight_5 instanceof myNumberEnum)) {
        myExpression _myBinaryRight_6 = it.getMyBinaryRight();
        EList<Double> _values_1 = ((myNumberEnum) _myBinaryRight_6).getValues();
        for (final Double v_1 : _values_1) {
          sb.append((("" + v_1) + ","));
        }
        myAttribute _myIntentifierIs_1 = att.getMyIntentifierIs();
        String _name_1 = _myIntentifierIs_1.getName();
        String _plus_5 = ("removeNonPossibleValuesFromAttributeNumber(\"" + _name_1);
        String _plus_6 = (_plus_5 + "\", [");
        String _string_1 = sb.toString();
        String _plus_7 = (_plus_6 + _string_1);
        String _plus_8 = (_plus_7 + "], \"");
        myBinaryOparators _oparand_1 = it.getOparand();
        String _plus_9 = (_plus_8 + _oparand_1);
        return (_plus_9 + "\");");
      }
    }
    return "";
  }
  
  public String ConvertAttributeName(final String name, final myValue type) {
    boolean _or = false;
    if ((type instanceof myRange)) {
      _or = true;
    } else {
      _or = (type instanceof myNumberEnum);
    }
    if (_or) {
      return (("parseInt(document.querySelector(\"#" + name) + "\").value)");
    }
    return (("document.querySelector(\"#" + name) + "\").value");
  }
  
  public String convertOperand(final myBinaryOparators operand) {
    boolean _equals = Objects.equal(operand, myBinaryOparators.EQ);
    if (_equals) {
      return "==";
    }
    boolean _equals_1 = Objects.equal(operand, myBinaryOparators.AND);
    if (_equals_1) {
      return "&&";
    }
    boolean _equals_2 = Objects.equal(operand, myBinaryOparators.OR);
    if (_equals_2) {
      return "||";
    }
    boolean _equals_3 = Objects.equal(operand, myBinaryOparators.LT);
    if (_equals_3) {
      return ">";
    }
    boolean _equals_4 = Objects.equal(operand, myBinaryOparators.GT);
    if (_equals_4) {
      return "<";
    }
    boolean _equals_5 = Objects.equal(operand, myBinaryOparators.IS);
    if (_equals_5) {
      return "==";
    }
    return null;
  }
  
  public CharSequence generateCheckConstraints(final List<myAttribute> attributes) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("values = [];");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("var value;");
    _builder.newLine();
    {
      for(final myAttribute a : attributes) {
        _builder.append("\t  ");
        _builder.append("values = ConstraintMap[\"");
        String _name = a.getName();
        _builder.append(_name, "\t  ");
        _builder.append("\"];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t  ");
        _builder.append("value = ");
        String _name_1 = a.getName();
        myValue _myAttributeContains = a.getMyAttributeContains();
        String _ConvertAttributeName = this.ConvertAttributeName(_name_1, _myAttributeContains);
        _builder.append(_ConvertAttributeName, "\t  ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t  ");
        _builder.append("if (values.length > 0) {");
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("if (values.indexOf(value)==-1) {");
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("alert(\"");
        String _name_2 = a.getName();
        _builder.append(_name_2, "\t  ");
        _builder.append(" does not contain a valid value\");\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t  ");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("} else {");
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("alert(\"");
        String _name_3 = a.getName();
        _builder.append(_name_3, "\t  ");
        _builder.append(" does not contain a valid value\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t  ");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("\t  ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("alert(\"true\");");
    _builder.newLine();
    _builder.append("return true;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateStaticMethods() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function removeNonPossibleValuesFromAttribute(attr, possibleValues, operator){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("values = ConstraintMap[attr];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(i = values.length-1; i >= 0; i--){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("currentValue = values[i];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(operator == \"is\"){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(possibleValues.indexOf(currentValue)==-1){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("values.splice(i,1);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ConstraintMap[attr] = values;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function removeNonPossibleValuesFromAttributeNumber(attr, possibleValues, operator){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("values = ConstraintMap[attr];");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(i = values.length-1; i >= 0; i--){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("doubleValue = values[i];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(operator == \"is\"){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(possibleValues.indexOf(doubleValue)==-1){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("values.splice(i,1);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(operator == \"lt\"){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(doubleValue < possibleValues[0]){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("values.splice(i,1);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(operator == \"gt\"){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(doubleValue > possibleValues[0]){");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("values.splice(i,1);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ConstraintMap[attr] = values;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
