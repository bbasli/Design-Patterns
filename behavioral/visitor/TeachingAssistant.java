package behavioral.visitor;

import behavioral.visitor.User;
import behavioral.visitor.Visitor;

public class TeachingAssistant extends User {
    public TeachingAssistant(int id, String name, int workingOur, double salary) {
        super(id, name, workingOur, salary);
    }

    public double accept(Visitor visitor) {
        return visitor.visitTeachingAssistant(this);
    }
}
