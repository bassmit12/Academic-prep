import java.util.HashMap;

public class EvalVisitor extends CalculatorBaseVisitor<Integer> {
    private HashMap<String, Integer> memory = new HashMap<>();

    @Override
    public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());  // Evaluate the expression on the right-hand side.
        memory.put(id, value);          // Store it in the memory
        System.out.println("Assigned " + id + " = " + value);
        return value;                   // Return the evaluated value.
    }

    @Override
    public Integer visitPrintStat(CalculatorParser.PrintStatContext ctx) {
        int value = visit(ctx.expr());  // Evaluate the expression inside print()
        System.out.println(value);      // Print the result
        return 0;                       // The return value is not used here.
    }

    @Override
    public Integer visitExpr(CalculatorParser.ExprContext ctx) {
        if (ctx.NUM() != null) {
            return Integer.parseInt(ctx.NUM().getText());
        } else if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (memory.containsKey(id)) {
                return memory.get(id);
            }
            throw new RuntimeException("undefined variable: " + id);
        } else if (ctx.getChild(1).getText().equals("+")) {
            return visit(ctx.expr(0)) + visit(ctx.expr(1));
        } else if (ctx.getChild(1).getText().equals("-")) {
            return visit(ctx.expr(0)) - visit(ctx.expr(1));
        } else if (ctx.getChild(1).getText().equals("*")) {
            return visit(ctx.expr(0)) * visit(ctx.expr(1));
        } else if (ctx.getChild(1).getText().equals("/")) {
            return visit(ctx.expr(0)) / visit(ctx.expr(1));
        } else if (ctx.getChild(0).getText().equals("(") && ctx.getChild(2).getText().equals(")")) {
            return visit(ctx.expr(0));
        } else if (ctx.NOT() != null) {
            return visit(ctx.expr(0)) == 0 ? 1 : 0;
        } else if (ctx.getChild(1).getText().equals("&&")) {
            return (visit(ctx.expr(0)) != 0 && visit(ctx.expr(1)) != 0) ? 1 : 0;
        } else if (ctx.getChild(1).getText().equals("||")) {
            return (visit(ctx.expr(0)) != 0 || visit(ctx.expr(1)) != 0) ? 1 : 0;
        } else {
            throw new UnsupportedOperationException("Operation not supported yet");
        }
    }

    @Override
    public Integer visitIfStat(CalculatorParser.IfStatContext ctx) {
        if (visit(ctx.expr()) != 0) {
            return visit(ctx.stat(0));
        } else if (ctx.ELSE() != null) {
            return visit(ctx.stat(1));
        }
        return 0;
    }

    @Override
    public Integer visitWhileStat(CalculatorParser.WhileStatContext ctx) {
        while (visit(ctx.expr()) != 0) {
            visit(ctx.stat());
        }
        return 0;
    }

    @Override
    public Integer visitFunctionDecl(CalculatorParser.FunctionDeclContext ctx) {
        // Function declaration handling code can be added here
        String functionName = ctx.ID(0).getText();
        System.out.println("Function declaration: " + functionName);
        // To handle parameters and function body, more code would be needed here.
        throw new UnsupportedOperationException("Function declarations are not supported yet");
    }

    @Override
    public Integer visitFunctionCall(CalculatorParser.FunctionCallContext ctx) {
        // Function call handling code can be added here
        String functionName = ctx.ID().getText();
        System.out.println("Function call: " + functionName);
        // To handle parameters and call implementation, more code would be needed here.
        throw new UnsupportedOperationException("Function calls are not supported yet");
    }
}
