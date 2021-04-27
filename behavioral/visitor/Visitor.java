package behavioral.visitor;

public class Visitor {
    public double visitTeacher(Teacher teacher) {
        return -1;
    }

    public double visitTeachingAssistant(TeachingAssistant teachingAssistant) {
        return -1;
    }

    public double visitProgrammeMentor(ProgrammeMentor programmeMentor) {
        return -1;
    }

    public double visitStudyAdvisor(StudyAdvisor studyAdvisor) {
        return -1;
    }
}
