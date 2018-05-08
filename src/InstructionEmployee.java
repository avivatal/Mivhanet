import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class InstructionEmployee extends User{
    private ArrayList<Question> myQuestions;

    public void createQuestion(Question question, String courseId){}

    public void editQuestion(Question originalQuestion, Question editedQuestion){}

    public void estimateQuestionSolutionTime(Question question, double timeEstimation){}

    public void estimateQuestionDifficulty(Question question, int difficultyEstimation){}

    public void commentQuestion(Question question, String comment){}

    public void submitStudentsTestAnswer(String courseid, Semester semester, Test.moed moed, List<Answer> studentsAnswers, String studentId){}

    public List<Question> viewQuestionsRepository(String courseId){ throw new NotImplementedException(); }
}
