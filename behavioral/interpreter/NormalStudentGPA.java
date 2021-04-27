package behavioral.interpreter;

import behavioral.interpreter.Expression;
import behavioral.interpreter.Student;

public class NormalStudentGPA extends TerminalExpression {
    @Override
    public boolean interpreter(Student s) {
        return s.getGpa() >= 2.5;
    }
}
