package behavioral.visitor;

public class User extends Visitable {
    private int id;
    private String name;
    private int workingOur;
    private double salary;

    public User(int id, String name, int workingOur, double salary) {
        this.id = id;
        this.name = name;
        this.workingOur = workingOur;
        this.salary = salary;
    }

    public int getWorkingOur() {
        return workingOur;
    }

    public double getSalary() {
        return salary;
    }

    public double accept(Visitor visitor) {
        return -1;
    }

    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        String className = this.getClass().getName();
        className = className.substring(className.lastIndexOf(".") + 1);
        return className + " : { " +
                "id = " + id +
                ", name='" + name + '\'' +
                ", workingOur = " + workingOur +
                ", salary = " + salary +
                " }";
    }
}
