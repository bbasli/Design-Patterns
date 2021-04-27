package behavioral.visitor;

public class OvertimeVisitor extends Visitor {
    public double visitTeacher(Teacher teacher) {
        int overtime = teacher.getWorkingOur() - 40;

        double overtimePay = overtime * 22.99;
        double newSalary = teacher.getSalary() + overtimePay;
        teacher.setSalary(newSalary);

        return newSalary;
    }

    public double visitTeachingAssistant(TeachingAssistant teachingAssistant) {
        int overtime = teachingAssistant.getWorkingOur() - 30;

        double overtimePay = overtime * 15.99;
        double newSalary = teachingAssistant.getSalary() + overtimePay;
        teachingAssistant.setSalary(newSalary);

        return newSalary;
    }

    public double visitProgrammeMentor(ProgrammeMentor programmeMentor) {
        int overtime = programmeMentor.getWorkingOur() - 35;

        double overtimePay = overtime * 17.99;
        double newSalary = programmeMentor.getSalary() + overtimePay;
        programmeMentor.setSalary(newSalary);

        return newSalary;
    }

    public double visitStudyAdvisor(StudyAdvisor studyAdvisor) {
        int overtime = studyAdvisor.getWorkingOur() - 40;

        double overtimePay = overtime * 20.99;
        double newSalary = studyAdvisor.getSalary() + overtimePay;
        studyAdvisor.setSalary(newSalary);

        return newSalary;
    }
}
