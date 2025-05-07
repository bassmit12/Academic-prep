# Generated from Expr.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#prog.
    def enterProg(self, ctx:ExprParser.ProgContext):
        pass

    # Exit a parse tree produced by ExprParser#prog.
    def exitProg(self, ctx:ExprParser.ProgContext):
        pass


    # Enter a parse tree produced by ExprParser#printExpr.
    def enterPrintExpr(self, ctx:ExprParser.PrintExprContext):
        pass

    # Exit a parse tree produced by ExprParser#printExpr.
    def exitPrintExpr(self, ctx:ExprParser.PrintExprContext):
        pass


    # Enter a parse tree produced by ExprParser#assign.
    def enterAssign(self, ctx:ExprParser.AssignContext):
        pass

    # Exit a parse tree produced by ExprParser#assign.
    def exitAssign(self, ctx:ExprParser.AssignContext):
        pass


    # Enter a parse tree produced by ExprParser#printCommand.
    def enterPrintCommand(self, ctx:ExprParser.PrintCommandContext):
        pass

    # Exit a parse tree produced by ExprParser#printCommand.
    def exitPrintCommand(self, ctx:ExprParser.PrintCommandContext):
        pass


    # Enter a parse tree produced by ExprParser#ifStatement.
    def enterIfStatement(self, ctx:ExprParser.IfStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#ifStatement.
    def exitIfStatement(self, ctx:ExprParser.IfStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#whileStatement.
    def enterWhileStatement(self, ctx:ExprParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#whileStatement.
    def exitWhileStatement(self, ctx:ExprParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#block.
    def enterBlock(self, ctx:ExprParser.BlockContext):
        pass

    # Exit a parse tree produced by ExprParser#block.
    def exitBlock(self, ctx:ExprParser.BlockContext):
        pass


    # Enter a parse tree produced by ExprParser#Not.
    def enterNot(self, ctx:ExprParser.NotContext):
        pass

    # Exit a parse tree produced by ExprParser#Not.
    def exitNot(self, ctx:ExprParser.NotContext):
        pass


    # Enter a parse tree produced by ExprParser#Number.
    def enterNumber(self, ctx:ExprParser.NumberContext):
        pass

    # Exit a parse tree produced by ExprParser#Number.
    def exitNumber(self, ctx:ExprParser.NumberContext):
        pass


    # Enter a parse tree produced by ExprParser#MulDiv.
    def enterMulDiv(self, ctx:ExprParser.MulDivContext):
        pass

    # Exit a parse tree produced by ExprParser#MulDiv.
    def exitMulDiv(self, ctx:ExprParser.MulDivContext):
        pass


    # Enter a parse tree produced by ExprParser#AddSub.
    def enterAddSub(self, ctx:ExprParser.AddSubContext):
        pass

    # Exit a parse tree produced by ExprParser#AddSub.
    def exitAddSub(self, ctx:ExprParser.AddSubContext):
        pass


    # Enter a parse tree produced by ExprParser#Parens.
    def enterParens(self, ctx:ExprParser.ParensContext):
        pass

    # Exit a parse tree produced by ExprParser#Parens.
    def exitParens(self, ctx:ExprParser.ParensContext):
        pass


    # Enter a parse tree produced by ExprParser#Relational.
    def enterRelational(self, ctx:ExprParser.RelationalContext):
        pass

    # Exit a parse tree produced by ExprParser#Relational.
    def exitRelational(self, ctx:ExprParser.RelationalContext):
        pass


    # Enter a parse tree produced by ExprParser#Logical.
    def enterLogical(self, ctx:ExprParser.LogicalContext):
        pass

    # Exit a parse tree produced by ExprParser#Logical.
    def exitLogical(self, ctx:ExprParser.LogicalContext):
        pass


    # Enter a parse tree produced by ExprParser#Id.
    def enterId(self, ctx:ExprParser.IdContext):
        pass

    # Exit a parse tree produced by ExprParser#Id.
    def exitId(self, ctx:ExprParser.IdContext):
        pass


    # Enter a parse tree produced by ExprParser#Boolean.
    def enterBoolean(self, ctx:ExprParser.BooleanContext):
        pass

    # Exit a parse tree produced by ExprParser#Boolean.
    def exitBoolean(self, ctx:ExprParser.BooleanContext):
        pass



del ExprParser