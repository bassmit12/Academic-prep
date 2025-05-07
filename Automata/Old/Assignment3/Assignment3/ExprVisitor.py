
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete generic visitor for a parse tree produced by ExprParser.

class ExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ExprParser#prog.
    def visitProg(self, ctx:ExprParser.ProgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#printExpr.
    def visitPrintExpr(self, ctx:ExprParser.PrintExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#assign.
    def visitAssign(self, ctx:ExprParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#printCommand.
    def visitPrintCommand(self, ctx:ExprParser.PrintCommandContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#ifStatement.
    def visitIfStatement(self, ctx:ExprParser.IfStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#whileStatement.
    def visitWhileStatement(self, ctx:ExprParser.WhileStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#block.
    def visitBlock(self, ctx:ExprParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#Not.
    def visitNot(self, ctx:ExprParser.NotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#Number.
    def visitNumber(self, ctx:ExprParser.NumberContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#MulDiv.
    def visitMulDiv(self, ctx:ExprParser.MulDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#AddSub.
    def visitAddSub(self, ctx:ExprParser.AddSubContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#Parens.
    def visitParens(self, ctx:ExprParser.ParensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#Relational.
    def visitRelational(self, ctx:ExprParser.RelationalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#Logical.
    def visitLogical(self, ctx:ExprParser.LogicalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#Id.
    def visitId(self, ctx:ExprParser.IdContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#Boolean.
    def visitBoolean(self, ctx:ExprParser.BooleanContext):
        return self.visitChildren(ctx)



del ExprParser