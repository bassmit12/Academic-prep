import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends MyGrammarBaseVisitor<Integer> {

    // Memory for variables
    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssign(MyGrammarParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitPrintExpr(MyGrammarParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        return 0;
    }

    @Override
    public Integer visitPrintCmd(MyGrammarParser.PrintCmdContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        return 0;
    }

    @Override
    public Integer visitId(MyGrammarParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitInt(MyGrammarParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitAddSub(MyGrammarParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == MyGrammarParser.ADD) {
            return left + right;
        }
        return left - right;
    }

    @Override
    public Integer visitMulDiv(MyGrammarParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == MyGrammarParser.MUL) {
            return left * right;
        }
        return left / right;
    }

    @Override
    public Integer visitParens(MyGrammarParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
