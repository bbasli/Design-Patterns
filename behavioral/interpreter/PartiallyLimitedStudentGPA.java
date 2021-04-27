package behavioral.interpreter;

public class PartiallyLimitedStudentGPA extends TerminalExpression {
    @Override
    public boolean interpreter(Student s) {
        return s.getGpa() < 2.5 && s.getGpa() >= 1.5;
    }
}
