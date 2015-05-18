package org.xtext.example.smdpdsl.tests;

import configuratorProject.ConfiguratorProjectPackage;
import configuratorProject.myAttribute;
import configuratorProject.myConstraint;
import configuratorProject.myModel;
import configuratorProject.myObject;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.SmdpDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(SmdpDslInjectorProvider.class)
@SuppressWarnings("all")
public class SmdpDslParserTest {
  @Inject
  @Extension
  private ParseHelper<myModel> _parseHelper;
  
  @Before
  public void setup() {
    ConfiguratorProjectPackage.eINSTANCE.eClass();
  }
  
  @Test
  public void testMyModelWithoutName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      String _name = model.getName();
      Assert.assertNull(_name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyModelWithName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      String _name = model.getName();
      Assert.assertEquals("CarFactory", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyModelWithNameInQuotes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"CarFactory Berlin\"{");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      String _name = model.getName();
      Assert.assertEquals("CarFactory Berlin", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyModelWithWhitespaceSeparatedName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory Berlin{");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      String _name = model.getName();
      Assert.assertNotEquals("CarFactory Berlin", _name);
      String _name_1 = model.getName();
      Assert.assertEquals("CarFactory", _name_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyModelWithoutMyObjects() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      String _name = _get.getName();
      Assert.assertEquals(null, _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyModelWithMyObjectsWithoutName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      String _name = _get.getName();
      Assert.assertEquals(null, _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyModelWithOneMyObjects() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("BMW{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      String _name = _get.getName();
      Assert.assertEquals("BMW", _name);
      EList<myObject> _myModelContains_1 = model.getMyModelContains();
      int _size = _myModelContains_1.size();
      Assert.assertEquals(1, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyModelWithManyMyObjects() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("BMW{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("Lada{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      String _name = _get.getName();
      Assert.assertEquals("BMW", _name);
      try {
        EList<myObject> _myModelContains_1 = model.getMyModelContains();
        myObject _get_1 = _myModelContains_1.get(1);
        final String name = _get_1.getName();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          Assert.assertTrue((e instanceof IndexOutOfBoundsException));
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      EList<myObject> _myModelContains_2 = model.getMyModelContains();
      int _size = _myModelContains_2.size();
      Assert.assertNotEquals(2, _size);
      EList<myObject> _myModelContains_3 = model.getMyModelContains();
      int _size_1 = _myModelContains_3.size();
      Assert.assertEquals(1, _size_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectsWithoutAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("BMW{");
      _builder.newLine();
      _builder.append(" ");
      _builder.newLine();
      _builder.append(" \t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = _get.getMyAttributeContains();
      int _size = _myAttributeContains.size();
      Assert.assertEquals(0, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectsWithEmptyAttributesList() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("BMW{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("has");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = _get.getMyAttributeContains();
      int _size = _myAttributeContains.size();
      Assert.assertEquals(1, _size);
      EList<myObject> _myModelContains_1 = model.getMyModelContains();
      myObject _get_1 = _myModelContains_1.get(0);
      EList<myAttribute> _myAttributeContains_1 = _get_1.getMyAttributeContains();
      myAttribute _get_2 = _myAttributeContains_1.get(0);
      String _name = _get_2.getName();
      Assert.assertEquals(null, _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectsWithOneMyAttributesWithoutName() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("BMW{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("has");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("[]");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = _get.getMyAttributeContains();
      int _size = _myAttributeContains.size();
      Assert.assertEquals(1, _size);
      EList<myObject> _myModelContains_1 = model.getMyModelContains();
      myObject _get_1 = _myModelContains_1.get(0);
      EList<myAttribute> _myAttributeContains_1 = _get_1.getMyAttributeContains();
      myAttribute _get_2 = _myAttributeContains_1.get(0);
      String _name = _get_2.getName();
      Assert.assertEquals(null, _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectsWithOneMyAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("BMW{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("has");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("carType[]");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = _get.getMyAttributeContains();
      int _size = _myAttributeContains.size();
      Assert.assertEquals(1, _size);
      EList<myObject> _myModelContains_1 = model.getMyModelContains();
      myObject _get_1 = _myModelContains_1.get(0);
      EList<myAttribute> _myAttributeContains_1 = _get_1.getMyAttributeContains();
      myAttribute _get_2 = _myAttributeContains_1.get(0);
      String _name = _get_2.getName();
      Assert.assertEquals("carType", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectsWithManyMyAttributes() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("BMW{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("has");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("carType[],");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("engineType[],");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("wheel[]");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = _get.getMyAttributeContains();
      int _size = _myAttributeContains.size();
      Assert.assertEquals(3, _size);
      EList<myObject> _myModelContains_1 = model.getMyModelContains();
      myObject _get_1 = _myModelContains_1.get(0);
      EList<myAttribute> _myAttributeContains_1 = _get_1.getMyAttributeContains();
      myAttribute _get_2 = _myAttributeContains_1.get(0);
      String _name = _get_2.getName();
      Assert.assertEquals("carType", _name);
      EList<myObject> _myModelContains_2 = model.getMyModelContains();
      myObject _get_3 = _myModelContains_2.get(0);
      EList<myAttribute> _myAttributeContains_2 = _get_3.getMyAttributeContains();
      myAttribute _get_4 = _myAttributeContains_2.get(1);
      String _name_1 = _get_4.getName();
      Assert.assertEquals("engineType", _name_1);
      EList<myObject> _myModelContains_3 = model.getMyModelContains();
      myObject _get_5 = _myModelContains_3.get(0);
      EList<myAttribute> _myAttributeContains_3 = _get_5.getMyAttributeContains();
      myAttribute _get_6 = _myAttributeContains_3.get(2);
      String _name_2 = _get_6.getName();
      Assert.assertEquals("wheel", _name_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectWithManyMyAttributesWithoutComma() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("BMW{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("has");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("carType[]");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("engineType[]");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("wheel[]");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myAttribute> _myAttributeContains = _get.getMyAttributeContains();
      int _size = _myAttributeContains.size();
      Assert.assertEquals(1, _size);
      EList<myObject> _myModelContains_1 = model.getMyModelContains();
      myObject _get_1 = _myModelContains_1.get(0);
      EList<myAttribute> _myAttributeContains_1 = _get_1.getMyAttributeContains();
      myAttribute _get_2 = _myAttributeContains_1.get(0);
      String _name = _get_2.getName();
      Assert.assertEquals("carType", _name);
      try {
        EList<myObject> _myModelContains_2 = model.getMyModelContains();
        myObject _get_3 = _myModelContains_2.get(0);
        EList<myAttribute> _myAttributeContains_2 = _get_3.getMyAttributeContains();
        myAttribute _get_4 = _myAttributeContains_2.get(1);
        final String attribute = _get_4.getName();
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          Assert.assertTrue((e instanceof IndexOutOfBoundsException));
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectsWithoutConstraints() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BWM{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("has");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("carType[\"SUV\",\"Pickup\"],");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("engineType[\"Diesel\",\"Gas\",\"Electric\"],");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("wheel[14-28]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Constrained by");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = _get.getMyObjectHas();
      int _size = _myObjectHas.size();
      Assert.assertEquals(0, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectWithOneConstraints() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BWM{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("has");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("carType[\"SUV\",\"Pickup\"],");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("engineType[\"Diesel\",\"Gas\",\"Electric\"],");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("wheel[14-28]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Constrained by");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if carType=\"SUV\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("then wheel can 20\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = _get.getMyObjectHas();
      int _size = _myObjectHas.size();
      Assert.assertEquals(1, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMyObjectsWithManyConstraints() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BWM{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("has");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("carType[\"SUV\",\"Pickup\"],");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("engineType[\"Diesel\",\"Gas\",\"Electric\"],");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("wheel[14-28]");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("Constrained by");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if carType= \"SUV\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("then wheel can 20");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("if engineType = \"Diesel\"");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("then carType can \"SUV\"\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final myModel model = this._parseHelper.parse(_builder);
      EList<myObject> _myModelContains = model.getMyModelContains();
      myObject _get = _myModelContains.get(0);
      EList<myConstraint> _myObjectHas = _get.getMyObjectHas();
      int _size = _myObjectHas.size();
      Assert.assertEquals(2, _size);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
