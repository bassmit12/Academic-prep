import gen.*;

public class EvalVisitor extends CalculatorBaseVisitor<Integer> {
    
    @Override
    public Integer visitMulDiv(CalculatorParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        
        if (ctx.getChild(1).getText().equals("*")) {
            return left * right;
        } else {
            return left / right;
        }
    }
    
    @Override
    public Integer visitAddSub(CalculatorParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        
        if (ctx.getChild(1).getText().equals("+")) {
            return left + right;
        } else {
            return left - right;
        }
    }
    
    @Override
    public Integer visitInt(CalculatorParser.IntContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }
    
    @Override
    public Integer visitParens(CalculatorParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}