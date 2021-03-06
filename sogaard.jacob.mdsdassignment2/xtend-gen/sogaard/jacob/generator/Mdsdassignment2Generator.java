/**
 * generated by Xtext 2.20.0
 */
package sogaard.jacob.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import sogaard.jacob.mdsdassignment2.Add;
import sogaard.jacob.mdsdassignment2.Div;
import sogaard.jacob.mdsdassignment2.Exp;
import sogaard.jacob.mdsdassignment2.ExpOp;
import sogaard.jacob.mdsdassignment2.MathExp;
import sogaard.jacob.mdsdassignment2.Mult;
import sogaard.jacob.mdsdassignment2.Num;
import sogaard.jacob.mdsdassignment2.Parenthesis;
import sogaard.jacob.mdsdassignment2.Sub;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class Mdsdassignment2Generator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final MathExp math = Iterators.<MathExp>filter(resource.getAllContents(), MathExp.class).next();
    final int result = this.compute(math);
    CharSequence _display = this.display(math);
    String _plus = ("Math expression = " + _display);
    System.out.println(_plus);
    JOptionPane.showMessageDialog(null, ("result = " + Integer.valueOf(result)), "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
  
  public int compute(final MathExp math) {
    return this.computeExp(math.getExp());
  }
  
  public int computeExp(final Exp exp) {
    int _xblockexpression = (int) 0;
    {
      final int left = this.computePrim(exp.getLeft());
      int _switchResult = (int) 0;
      ExpOp _operator = exp.getOperator();
      boolean _matched = false;
      if (_operator instanceof Add) {
        _matched=true;
        int _computeExp = this.computeExp(exp.getRight());
        _switchResult = (left + _computeExp);
      }
      if (!_matched) {
        if (_operator instanceof Sub) {
          _matched=true;
          int _computeExp = this.computeExp(exp.getRight());
          _switchResult = (left - _computeExp);
        }
      }
      if (!_matched) {
        if (_operator instanceof Mult) {
          _matched=true;
          int _computeExp = this.computeExp(exp.getRight());
          _switchResult = (left * _computeExp);
        }
      }
      if (!_matched) {
        if (_operator instanceof Div) {
          _matched=true;
          int _computeExp = this.computeExp(exp.getRight());
          _switchResult = (left / _computeExp);
        }
      }
      if (!_matched) {
        _switchResult = left;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  public int computePrim(final ExpOp factor) {
    return 0;
  }
  
  public CharSequence display(final MathExp math) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _displayExp = this.displayExp(math.getExp());
    _builder.append(_displayExp);
    return _builder;
  }
  
  public CharSequence displayExp(final Exp exp) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _displayOp = this.displayOp(exp.getLeft());
    _builder.append(_displayOp);
    ExpOp _operator = exp.getOperator();
    CharSequence _displayOp_1 = null;
    if (_operator!=null) {
      _displayOp_1=this.displayOp(_operator);
    }
    _builder.append(_displayOp_1);
    Exp _right = exp.getRight();
    CharSequence _displayExp = null;
    if (_right!=null) {
      _displayExp=this.displayExp(_right);
    }
    _builder.append(_displayExp);
    return _builder;
  }
  
  protected CharSequence _displayOp(final Add op) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _displayOp = this.displayOp(op.getLeft());
    _builder.append(_displayOp);
    _builder.append("+");
    CharSequence _displayOp_1 = this.displayOp(op.getRight());
    _builder.append(_displayOp_1);
    return _builder;
  }
  
  protected CharSequence _displayOp(final Sub op) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _displayOp = this.displayOp(op.getLeft());
    _builder.append(_displayOp);
    _builder.append("-");
    CharSequence _displayOp_1 = this.displayOp(op.getRight());
    _builder.append(_displayOp_1);
    return _builder;
  }
  
  protected CharSequence _displayOp(final Mult op) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _displayOp = this.displayOp(op.getLeft());
    _builder.append(_displayOp);
    _builder.append("*");
    CharSequence _displayOp_1 = this.displayOp(op.getRight());
    _builder.append(_displayOp_1);
    return _builder;
  }
  
  protected CharSequence _displayOp(final Div op) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _displayOp = this.displayOp(op.getLeft());
    _builder.append(_displayOp);
    _builder.append("/");
    CharSequence _displayOp_1 = this.displayOp(op.getRight());
    _builder.append(_displayOp_1);
    return _builder;
  }
  
  protected CharSequence _displayOp(final Num op) {
    StringConcatenation _builder = new StringConcatenation();
    int _value = op.getValue();
    _builder.append(_value);
    return _builder;
  }
  
  protected CharSequence _displayOp(final Parenthesis p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    CharSequence _displayExp = this.displayExp(p.getExp());
    _builder.append(_displayExp);
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence displayOp(final ExpOp op) {
    if (op instanceof Add) {
      return _displayOp((Add)op);
    } else if (op instanceof Div) {
      return _displayOp((Div)op);
    } else if (op instanceof Mult) {
      return _displayOp((Mult)op);
    } else if (op instanceof Num) {
      return _displayOp((Num)op);
    } else if (op instanceof Parenthesis) {
      return _displayOp((Parenthesis)op);
    } else if (op instanceof Sub) {
      return _displayOp((Sub)op);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(op).toString());
    }
  }
}
