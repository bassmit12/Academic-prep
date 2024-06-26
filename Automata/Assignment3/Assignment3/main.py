import sys
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprVisitor import ExprVisitor

class EvalVisitor(ExprVisitor):
    def __init__(self):
        self.memory = {}

    def visitAssign(self, ctx:ExprParser.AssignContext):
        id = ctx.ID().getText()
        value = self.visit(ctx.expr())
        self.memory[id] = value
        return value

    def visitPrintExpr(self, ctx:ExprParser.PrintExprContext):
        value = self.visit(ctx.expr())
        print(value)
        return value

    def visitPrintCommand(self, ctx:ExprParser.PrintCommandContext):
        value = self.visit(ctx.expr())
        print(value)
        return value

    def visitIfStatement(self, ctx:ExprParser.IfStatementContext):
        condition = self.visit(ctx.expr())
        if condition:
            self.visit(ctx.block(0))
        elif ctx.block(1) is not None:
            self.visit(ctx.block(1))
        return None

    def visitBlock(self, ctx:ExprParser.BlockContext):
        for stat in ctx.stat():
            self.visit(stat)
        return None

    def visitMulDiv(self, ctx:ExprParser.MulDivContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if ctx.op.text == '*':
            return left * right
        else:
            return left / right

    def visitAddSub(self, ctx:ExprParser.AddSubContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if ctx.op.text == '+':
            return left + right
        else:
            return left - right

    def visitRelational(self, ctx:ExprParser.RelationalContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if ctx.op.text == '==':
            return left == right
        elif ctx.op.text == '!=':
            return left != right
        elif ctx.op.text == '<':
            return left < right
        elif ctx.op.text == '>':
            return left > right
        elif ctx.op.text == '<=':
            return left <= right
        elif ctx.op.text == '>=':
            return left >= right

    def visitLogical(self, ctx:ExprParser.LogicalContext):
        left = self.visit(ctx.expr(0))
        right = self.visit(ctx.expr(1))
        if ctx.op.text == '&&':
            return left and right
        else:
            return left or right

    def visitNot(self, ctx:ExprParser.NotContext):
        value = self.visit(ctx.expr())
        return not value

    def visitParens(self, ctx:ExprParser.ParensContext):
        return self.visit(ctx.expr())

    def visitNumber(self, ctx:ExprParser.NumberContext):
        return float(ctx.NUMBER().getText())

    def visitBoolean(self, ctx:ExprParser.BooleanContext):
        return ctx.BOOLEAN().getText() == 'true'

    def visitId(self, ctx:ExprParser.IdContext):
        id = ctx.ID().getText()
        if id in self.memory:
            return self.memory[id]
        return False  # Default to False if variable is not found

    def visitWhileStatement(self, ctx:ExprParser.WhileStatementContext):
        # Re-evaluate the condition before each iteration
        while True:
            condition = self.visit(ctx.expr())  # This should fetch the current value of x from self.memory
            if not condition:
                break
            self.visit(ctx.block())
        return None

def main():
    if len(sys.argv) != 2:
        print("Usage: python main.py <inputfile>")
        sys.exit(1)

    file_name = sys.argv[1]
    try:
        with open(file_name, 'r') as file:
            input_stream = InputStream(file.read())
    except FileNotFoundError:
        print(f"Error: File '{file_name}' not found.")
        sys.exit(1)

    lexer = ExprLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ExprParser(stream)
    tree = parser.prog()
    visitor = EvalVisitor()
    visitor.visit(tree)

if __name__ == '__main__':
    main()
