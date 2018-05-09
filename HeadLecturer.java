import java.util.List;

public class HeadLecturer extends Lecturer {

    public void approveTest(Test testToApprove){}

    public void deleteQuestion(Question questionToDelete){}

    public void updateSingleTestGrade(String studentId, TestAnswer testAnswer, double newScore){}

    public void updateMultipleGrades(List<Test> tests, double factorToAddToScores){}

}
