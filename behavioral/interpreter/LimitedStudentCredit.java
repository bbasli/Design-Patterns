package behavioral.interpreter;

import behavioral.interpreter.Expression;
import behavioral.interpreter.Student;

public class LimitedStudentCredit extends TerminalExpression {
    @Override
    public boolean interpreter(Student s) {
        return s.getCreditLimit() == 12;
    }
}
