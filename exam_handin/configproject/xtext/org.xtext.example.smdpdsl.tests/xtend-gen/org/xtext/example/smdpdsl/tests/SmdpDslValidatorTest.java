package org.xtext.example.smdpdsl.tests;

import configuratorProject.myAttribute;
import configuratorProject.myConstraint;
import configuratorProject.myModel;
import configuratorProject.myNumberEnum;
import configuratorProject.myObject;
import configuratorProject.myRange;
import configuratorProject.myStringEnum;
import configuratorProject.myValue;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.SmdpDslInjectorProvider;
import org.xtext.example.mydsl.validation.SmdpDslValidator;

@RunWith(XtextRunner.class)
@InjectWith(SmdpDslInjectorProvider.class)
@SuppressWarnings("all")
public class SmdpDslValidatorTest {
  @Inject
  @Extension
  private ParseHelper<myModel> _parseHelper;
  
  private final SmdpDslValidator validator = new SmdpDslValidator();
  
  @Test
  public void WithEmptyString() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t\t\t");
      _builder.append("carType [\"sports\", \"\"]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = myObject.getMyAttributeContains();
      myAttribute _get = _myAttributeContains.get(0);
      myAttribute attribute = ((myAttribute) _get);
      myValue _myAttributeContains_1 = attribute.getMyAttributeContains();
      myStringEnum values = ((myStringEnum) _myAttributeContains_1);
      boolean _constraint = this.validator.constraint(values);
      Assert.assertFalse(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void WithString() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t\t\t");
      _builder.append("carType [\"sportscar\", \"SUV\"]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = myObject.getMyAttributeContains();
      myAttribute _get = _myAttributeContains.get(0);
      myAttribute attribute = ((myAttribute) _get);
      myValue _myAttributeContains_1 = attribute.getMyAttributeContains();
      myStringEnum values = ((myStringEnum) _myAttributeContains_1);
      boolean _constraint = this.validator.constraint(values);
      Assert.assertTrue(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void DublicateAttributesName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t\t\t");
      _builder.append("carType [\"sportscar\", \"SUV\"],");
      _builder.newLine();
      _builder.append(" \t\t\t\t\t");
      _builder.append("carType [\"sportscar\", \"SUV\"]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      boolean _constraint = this.validator.constraint(myObject);
      Assert.assertFalse(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void CorrectRangeConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("seatHeat [\"Seat Heat\":\"No Seat Heat\"],");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [14-28]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Constrained by\t\t\t\t\t \t\t\t");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("if seatHeat = \"Seat Heat\"");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("then wheel can 14,15");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = myObject.getMyObjectHas();
      final myConstraint myCon = _myObjectHas.get(0);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertTrue(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void WrongRangeConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("seatHeat [\"Seat Heat\":\"No Seat Heat\"],");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [14-28]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Constrained by\t\t\t\t\t \t\t\t");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("if seatHeat = \"Seat Heat\"");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("then wheel can 14,29");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = myObject.getMyObjectHas();
      final myConstraint myCon = _myObjectHas.get(0);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertFalse(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void CorrectNumberEnumConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("seatHeat [\"Seat Heat\":\"No Seat Heat\"],");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [14,28]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Constrained by\t\t\t\t\t \t\t\t");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("if seatHeat = \"Seat Heat\"");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("then wheel can 14");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = myObject.getMyObjectHas();
      final myConstraint myCon = _myObjectHas.get(0);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertTrue(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void WrongNumberEnumConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("seatHeat [\"Seat Heat\":\"No Seat Heat\"],");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [14,28]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Constrained by\t\t\t\t\t \t\t\t");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("if seatHeat = \"Seat Heat\"");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("then wheel can 15");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = myObject.getMyObjectHas();
      final myConstraint myCon = _myObjectHas.get(0);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertFalse(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void WrongStringEnumConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("seatHeat [\"Seat Heat\":\"No Seat Heat\"],");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [\"4-wheel\",\"two-wheel\"]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Constrained by\t\t\t\t\t \t\t\t");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("if seatHeat = \"Seat Heat\"");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("then wheel can \"wrong\"");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = myObject.getMyObjectHas();
      final myConstraint myCon = _myObjectHas.get(0);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertFalse(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void CorrectStringEnumConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("seatHeat [\"Seat Heat\":\"No Seat Heat\"],");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [\"4-wheel\",\"two-wheel\"]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Constrained by\t\t\t\t\t \t\t\t");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("if seatHeat = \"Seat Heat\"");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("then wheel can \"4-wheel\"");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = myObject.getMyObjectHas();
      final myConstraint myCon = _myObjectHas.get(0);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertTrue(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void CorrectBooleanConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("seatHeat [\"Seat Heat\":\"No Seat Heat\"],");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [\"4-wheel\":\"two-wheel\"]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Constrained by\t\t\t\t\t \t\t\t");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("if seatHeat = \"Seat Heat\"");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("then wheel can \"4-wheel\"");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = myObject.getMyObjectHas();
      final myConstraint myCon = _myObjectHas.get(0);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertTrue(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void WrongBooleanConstraint() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("seatHeat [\"Seat Heat\":\"No Seat Heat\"],");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [\"4-wheel\":\"two-wheel\"]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Constrained by\t\t\t\t\t \t\t\t");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("if seatHeat = \"Seat Heat\"");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("then wheel can \"wrong\"");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = myObject.getMyObjectHas();
      final myConstraint myCon = _myObjectHas.get(0);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertFalse(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void AttributesName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t\t\t");
      _builder.append("carType [\"sportscar\", \"SUV\"],");
      _builder.newLine();
      _builder.append(" \t\t\t\t\t");
      _builder.append("car [\"sportscar\", \"SUV\"]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      boolean _constraint = this.validator.constraint(myObject);
      Assert.assertTrue(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void CorrectRangeValue() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [14-28]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = myObject.getMyAttributeContains();
      myAttribute _get = _myAttributeContains.get(0);
      myValue _myAttributeContains_1 = _get.getMyAttributeContains();
      final myRange myCon = ((myRange) _myAttributeContains_1);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertTrue(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void WrongRangeValue() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [14-13]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = myObject.getMyAttributeContains();
      myAttribute _get = _myAttributeContains.get(0);
      myValue _myAttributeContains_1 = _get.getMyAttributeContains();
      final myRange myCon = ((myRange) _myAttributeContains_1);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertFalse(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void CorrectNumberValue() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t\t");
      _builder.append("carFactory {");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("has ");
      _builder.newLine();
      _builder.append(" \t\t\t");
      _builder.append("wheel [12,13,14,15]\t\t\t\t\t");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}\t");
      _builder.newLine();
      _builder.append("}");
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      final myObject myObject = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = myObject.getMyAttributeContains();
      myAttribute _get = _myAttributeContains.get(0);
      myValue _myAttributeContains_1 = _get.getMyAttributeContains();
      final myNumberEnum myCon = ((myNumberEnum) _myAttributeContains_1);
      boolean _constraint = this.validator.constraint(myCon);
      Assert.assertTrue(_constraint);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
