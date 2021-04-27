package behavioral.interpreter;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private int creditLimit;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        creditLimit = 23;
    }

    public Student(int id, String name, double gpa, int limit) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.creditLimit = limit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        System.out.println(this.getName() + "'s credit limit fixed correctly as " + creditLimit + ".");
        this.creditLimit = creditLimit;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Name: " + this.name + "\nGpa: " + this.gpa +
                "\nCredit Limit: " + this.creditLimit;
    }
}