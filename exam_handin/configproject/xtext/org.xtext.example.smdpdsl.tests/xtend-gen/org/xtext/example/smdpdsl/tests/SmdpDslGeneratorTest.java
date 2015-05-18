package org.xtext.example.smdpdsl.tests;

import configuratorProject.ConfiguratorProjectPackage;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.mydsl.SmdpDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(SmdpDslInjectorProvider.class)
@SuppressWarnings("all")
public class SmdpDslGeneratorTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  private String[] params;
  
  @Test
  public void testGeneratedJava() {
    try {
      ConfiguratorProjectPackage.eINSTANCE.eClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CarFactory {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("BMW {");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        try {
          Class<?> _compiledClass = it.getCompiledClass();
          Object _newInstance = _compiledClass.newInstance();
          final Procedure1<Object> _function_1 = (Object it_1) -> {
            try {
              final String att = this._reflectExtensions.<String>get(it_1, "Attributes");
              InputOutput.<String>println(("att:" + att));
              Object _invoke = this._reflectExtensions.invoke(it_1, "InitializeAttribute");
              Assert.assertNull(_invoke);
              this._reflectExtensions.invoke(it_1, "main", this.params);
              Object _get = this._reflectExtensions.<Object>get(it_1, "Attributes");
              final HashMap<String, List<String>> att1 = ((HashMap<String, List<String>>) _get);
              int _size = att1.size();
              InputOutput.<Integer>print(Integer.valueOf(_size));
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          };
          ObjectExtensions.<Object>operator_doubleArrow(_newInstance, _function_1);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._compilationTestHelper.compile(_builder, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
