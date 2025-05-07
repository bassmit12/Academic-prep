import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class EvalListener extends ExprBaseListener {
    private ParseTreeProperty<Double> values = new ParseTreeProperty<>();

    private void setValue(ParseTree node, double value) {
        values.put(node, value);
    }

    public double getValue(ParseTree node) {
        return values.get(node);
    }

    private double factorial(int n) {
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public void exitMulDiv(ExprParser.MulDivContext ctx) {
        double left = getValue(ctx.expr(0));
        double right = getValue(ctx.expr(1));
        if (ctx.op.getType() == ExprParser.MUL) {
            setValue(ctx, left * right);
        } else {
            setValue(ctx, left / right);
        }
    }

    @Override
    public void exitAddSubi(ExprParser.AddSubiContext ctx) {
        double left = getValue(ctx.expr(0));
        double right = getValue(ctx.expr(1));
        if (ctx.op.getType() == ExprParser.ADD) {
            setValue(ctx, left + right);
        } else {
            setValue(ctx, left - right);
        }
    }

    @Override
    public void exitInt(ExprParser.IntContext ctx) {
        setValue(ctx, Double.parseDouble(ctx.INT().getText()));
    }

    @Override
public void exitFactorial(ExprParser.FactorialContext ctx) {
    double value = getValue(ctx.expr()); // Get the evaluated result of the expression inside the factorial
    setValue(ctx, factorial((int)value)); // Calculate the factorial of the evaluated result
}

    @Override
    public void exitPower(ExprParser.PowerContext ctx) {
        double left = getValue(ctx.expr(0));
        double right = getValue(ctx.expr(1));
        setValue(ctx, Math.pow(left, right));
    }

    @Override
    public void exitParens(ExprParser.ParensContext ctx) {
        setValue(ctx, getValue(ctx.expr()));
    }
}
