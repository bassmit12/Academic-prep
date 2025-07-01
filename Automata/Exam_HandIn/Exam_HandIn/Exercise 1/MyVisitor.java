import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

// TreeNode class to represent binary tree structure
class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;
    
    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    
    // Getters and setters
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
    public TreeNode getLeft() { return left; }
    public void setLeft(TreeNode left) { this.left = left; }
    public TreeNode getRight() { return right; }
    public void setRight(TreeNode right) { this.right = right; }
    
    // Helper method to print the tree structure
    public void printTree(String prefix, boolean isLast) {
        System.out.println(prefix + (isLast ? "└── " : "├── ") + value);
        
        if (left != null || right != null) {
            if (left != null) {
                left.printTree(prefix + (isLast ? "    " : "│   "), right == null);
            }
            if (right != null) {
                right.printTree(prefix + (isLast ? "    " : "│   "), true);
            }
        }
    }
}

// Updated visitor that builds binary tree structure and returns TreeNode
class MyVisitor extends ExamGrammarBaseVisitor<TreeNode> {
    
    @Override
    public TreeNode visitProg(ExamGrammarParser.ProgContext ctx) {
        System.err.println("visitProg() - Building tree");
        // For program, visit the first statement and return its tree
        if (ctx.stmt() != null && ctx.stmt().size() > 0) {
            return visit(ctx.stmt(0));
        }
        return null;
    }
    
    @Override
    public TreeNode visitExprStat(ExamGrammarParser.ExprStatContext ctx) {
        // For expression statements, just return the expression tree
        return visit(ctx.expr());
    }
    
    @Override
    public TreeNode visitAddSub(ExamGrammarParser.AddSubContext ctx) {
        // Get the left and right subtrees
        TreeNode left = visit(ctx.expr(0));
        TreeNode right = visit(ctx.expr(1));
        
        // Get the operator by accessing child node
        String op = ((org.antlr.v4.runtime.tree.ParseTree)ctx).getChild(1).getText();
        int result;
        if (op.equals("+")) {
            result = left.getValue() + right.getValue();
        } else {
            result = left.getValue() - right.getValue();
        }
        
        // Create a new tree node with the evaluated result and subtrees
        return new TreeNode(result, left, right);
    }
    
    @Override
    public TreeNode visitMulDiv(ExamGrammarParser.MulDivContext ctx) {
        TreeNode left = visit(ctx.expr(0));
        TreeNode right = visit(ctx.expr(1));
        
        String op = ((org.antlr.v4.runtime.tree.ParseTree)ctx).getChild(1).getText();
        int result;
        if (op.equals("*")) {
            result = left.getValue() * right.getValue();
        } else {
            result = left.getValue() / right.getValue();
        }
        
        return new TreeNode(result, left, right);
    }
    
    @Override
    public TreeNode visitUnary(ExamGrammarParser.UnaryContext ctx) {
        TreeNode child = visit(ctx.expr());
        String op = ((org.antlr.v4.runtime.tree.ParseTree)ctx).getChild(0).getText();
        
        int result;
        if (op.equals("-")) {
            result = -child.getValue();
        } else {
            result = child.getValue(); // Plus operator
        }
        
        // For unary operations, create a node with only a left child
        return new TreeNode(result, child, null);
    }
    
    @Override
    public TreeNode visitInt(ExamGrammarParser.IntContext ctx) {
        int value = Integer.valueOf(ctx.INT().getText());
        // Leaf nodes have no children
        return new TreeNode(value);
    }
    
    @Override
    public TreeNode visitExprBase(ExamGrammarParser.ExprBaseContext ctx) {
        return visit(ctx.primaryExpr());
    }
    
    @Override
    public TreeNode visitParens(ExamGrammarParser.ParensContext ctx) {
        // Parentheses don't create new nodes, just return the inner expression
        return visit(ctx.expr());
    }
    
    @Override
    public TreeNode visitId(ExamGrammarParser.IdContext ctx) {
        // For variables, you might want to look up their values
        // For now, we'll assume they're stored somewhere or return 0
        String varName = ctx.ID().getText();
        System.err.println("Warning: Variable " + varName + " not implemented, using value 0");
        return new TreeNode(0);
    }
}

