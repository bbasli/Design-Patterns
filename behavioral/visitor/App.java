package behavioral.visitor;

public class App {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(123, "Mehmet", 45, 5000);
        TeachingAssistant assistant = new TeachingAssistant(641, "Ali", 50, 3000);
        StudyAdvisor studyAdvisor = new StudyAdvisor(572, "Beril", 25, 3350);

        System.out.println("Before the visitor visit the staff");
        System.out.println(teacher);
        System.out.println(assistant);
        System.out.println(studyAdvisor);

        System.out.println("**********************************");

        OvertimeVisitor visitor = new OvertimeVisitor();
        teacher.accept(visitor);
        assistant.accept(visitor);
        studyAdvisor.accept(visitor);

        System.out.println("After the visitor visit the staff");
        System.out.println(teacher);
        System.out.println(assistant);
        System.out.println(studyAdvisor);
    }
}
