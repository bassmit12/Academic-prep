import javax.swing.tree.TreeNode;

import org.antlr.v4.runtime.*;

import gen.ExamGrammarBaseVisitor;

// Updated visitor that builds binary tree structure and returns TreeNode
class MyVisitor extends ExamGrammarBaseVisitor {
    
    @Override
    public Integer visitProg(ExamGrammarParser.ProgContext ctx) {
        System.err.println("visitProg() - Building tree");
        // For program, visit the first statement and return its list
        if (ctx.stmt() != null && ctx.stmt().size() > 0) {
            return visit(ctx.stmt(0));
        }
        return null;
    }

    @Override
    public String printList(String prefix, boolean isLast) {
        //
    }

    @Override
    public void visitUnary(ExamGrammarParser.UnaryContext ctx) {
        //
    }

    @Override
    public void listLength(ExamGrammarParser.UnaryContext ctx) {
        //
    }
    
    @Override
    public Integer visitExprStat(ExamGrammarParser.ExprStatContext ctx) {
        // For expression statements, just return the expression
        return visit(ctx.expr());
    }
    
    @Override
    public Integer plusMinus(ExamGrammarParser.plusMinusContext ctx) {
        // Get the left and right value
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        
        // Get the operator by accessing child node
        String op = ctx.expr().getChild(1).getText();
        int result;
        if (op.equals("+")) {
            result = left + right;
        } else {
            result = left - right;
        }
        
        return result;
    }
    
    @Override
    public Integer visitExprBase(ExamGrammarParser.ExprBaseContext ctx) {
        return visit(ctx.primaryExpr());
    }
    
    @Override
    public Integer visitParens(ExamGrammarParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
    S
}

