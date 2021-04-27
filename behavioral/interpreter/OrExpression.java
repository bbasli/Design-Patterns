package behavioral.interpreter;

public class OrExpression extends NonTerminalExpression {
    public OrExpression(Expression e1, Expression e2) {
        super(e1, e2);
    }

    public boolean interpreter(Student s) {
        return expr1.interpreter(s) || expr2.interpreter(s);
    }
}
