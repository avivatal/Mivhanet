import java.util.*;

public class Lecturer extends InstructionEmployee {

    public void createTest(String courseId, Semester semester, Test.moed testMoed, Dictionary<Question,Double> questionsAndPoints){}

    public void addOptionsToQuestion(Question question, List<Option> optionsToAdd){}

    public void editQuestionOption(Question question, Option oldOption, Option newOption){}
}
