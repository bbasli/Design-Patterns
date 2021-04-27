package behavioral.interpreter;


public class App {
    public static void main(String[] args) {
        Student student = new Student(123456, "Bugra", 1.2);

        // to check gpa >= 2.5 AND credit limit == 23
        Expression normalCreditExp = new NormalStudentCredit();
        Expression normalGpaExp = new NormalStudentGPA();
        Expression isNormal = new AndExpression(normalCreditExp, normalGpaExp);

        // to check gpa < 2.5 AND credit limit == 15
        Expression partiallyLimitedCreditExp = new PartiallyLimitedStudentCredit();
        Expression partiallyLimitedGpaExp = new PartiallyLimitedStudentGPA();
        Expression isPartiallyLimited = new AndExpression(partiallyLimitedCreditExp, partiallyLimitedGpaExp);

        // to check gpa < 1.5 AND credit limit == 12
        Expression limitedCreditExp = new LimitedStudentCredit();
        Expression limitedGpaExp = new LimitedStudentGPA();
        Expression isLimited = new AndExpression(limitedCreditExp, limitedGpaExp);

        // to check student is limited OR partially limited OR normal
        Expression isOkay = new OrExpression(isLimited, isNormal);
        isOkay = new OrExpression(isOkay, isPartiallyLimited);

        if (!isOkay.interpreter(student))
            System.out.println("Kredi limiti hatalı!");
        else
            System.out.println("Kredi limiti doğru.");
    }
}
