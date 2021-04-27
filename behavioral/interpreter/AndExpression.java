package behavioral.interpreter;

import behavioral.interpreter.Expression;
import behavioral.interpreter.Student;

public class AndExpression extends NonTerminalExpression {
    public AndExpression(Expression e1, Expression e2) {
        super(e1, e2);
    }

    public boolean interpreter(Student s) {
        return expr1.interpreter(s) && expr2.interpreter(s);
    }
}
