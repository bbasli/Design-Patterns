package behavioral.interpreter;

public class NonTerminalExpression extends Expression {
    Expression expr1;
    Expression expr2;

    public NonTerminalExpression(Expression e1, Expression e2) {
        this.expr1 = e1;
        this.expr2 = e2;
    }
}
