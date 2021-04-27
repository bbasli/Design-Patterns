package behavioral.interpreter;

import behavioral.interpreter.Expression;
import behavioral.interpreter.Student;

public class PartiallyLimitedStudentCredit extends TerminalExpression {
    @Override
    public boolean interpreter(Student s) {
        return s.getCreditLimit() == 15;
    }
}
