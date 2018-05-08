import java.util.List;

public class HeadLecturer extends Lecturer {

    public void createCourseSyllabus(String courseId, String syllabus){}

    public void approveTest(Test testToApprove){}

    public void deleteQuestion(Question questionToDelete){}

    public void updateSingleTestGrade(Test test, double newScore){}

    public void updateMultipleGrades(List<Test> tests, double factorToAddToScores){}

}
