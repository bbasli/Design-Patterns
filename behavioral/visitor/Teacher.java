package behavioral.visitor;

import behavioral.visitor.User;
import behavioral.visitor.Visitor;

public class Teacher extends User {
    public Teacher(int id, String name, int workingOur, double salary) {
        super(id, name, workingOur, salary);
    }

    public double accept(Visitor visitor) {
        return visitor.visitTeacher(this);
    }
}
