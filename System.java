import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

public class System {

    List<Course> courses;
    List<CourseInSemester> coursesInSemester;
    List<Student> students;
    List<HeadLecturer> headLecturers;
    List<Lecturer> lecturers;
    List<InstructionEmployee> instructionEmployees;
    List<Test> tests;
    List<Question> questions;
    List<Semester> semesters;
    List<Answer> answers;
    List<Comment> comments;
    List<Option> options;
    List<OptionAnswer> optionAnswers;
    List<CourseStaff> courseStaffs;
    List<TestAnswer> testAnswers;

    public List<Course> getCourses() {
        throw new NotImplementedException();
    }

    public Question getQuestion(String questionId){
        throw new NotImplementedException();
    }

    public void addToTest(Question question){}

    public void setPoints(String questionId, double points){}

    public Course getCourse(String courseId){
        throw new NotImplementedException();
    }

    public TestAnswer selectTestAnswer(Student student, CourseInSemester courseInSemester, Test.moed moed){
        throw new NotImplementedException();
    }

    public Test selectTest(CourseInSemester courseInSemester, Test.moed moed){
        throw new NotImplementedException();
    }

    public void createTestDate(Date date, Test.moed moed, CourseInSemester courseInSemester){}

    public void showQuestions(){}

    public void showQuestionForm(){}

    public void createQuestion(){}

    public void createOption(String option){}

    public void deleteQuestion(){}

    public Semester getSemester(int year, Semester.season season){
        throw new NotImplementedException();
    }

    public CourseInSemester getCourseInSemester(Semester semester, String courseId){
        throw new NotImplementedException();
    }

    public Student getStudent(String studentId){
        throw new NotImplementedException();
    }

    public void addStudentToCourse(Student student){}

    public void setCourses(List<Course> courses) {}

    public void submitComment(String commentText){}

    public void openCourseInSemester(Semester semester, Course course){}

    public List<CourseInSemester> getCoursesInSemester() {
        throw new NotImplementedException();
    }

    public void setCoursesInSemester(List<CourseInSemester> coursesInSemester) {}

    public List<Student> getStudents() {
        throw new NotImplementedException();
    }

    public void setStudents(List<Student> students) {}

    public List<HeadLecturer> getHeadLecturers() {
        throw new NotImplementedException();
    }

    public void setHeadLecturers(List<HeadLecturer> headLecturers) {}

    public List<Lecturer> getLecturers() {
        throw new NotImplementedException();
    }

    public void setLecturers(List<Lecturer> lecturers) {}

    public List<InstructionEmployee> getInstructionEmployees() {
        throw new NotImplementedException();
    }

    public void setInstructionEmployees(List<InstructionEmployee> instructionEmployees) {}

    public List<Test> getTests() {
        throw new NotImplementedException();
    }

    public void setTests(List<Test> tests) {}

    public List<Question> getQuestions() {
        throw new NotImplementedException();
    }

    public void setQuestions(List<Question> questions) {}

    public List<Semester> getSemesters() {
        throw new NotImplementedException();
    }

    public void setSemesters(List<Semester> semesters) {}

    public List<Answer> getAnswers() {
        throw new NotImplementedException();
    }

    public void setAnswers(List<Answer> answers) {}

    public List<Comment> getComments() {
        throw new NotImplementedException();
    }

    public void setComments(List<Comment> comments) {}

    public List<Option> getOptions() {
        throw new NotImplementedException();
    }

    public void setOptions(List<Option> options) {}

    public List<OptionAnswer> getOptionAnswers() {
        throw new NotImplementedException();
    }

    public void setOptionAnswers(List<OptionAnswer> optionAnswers) {}

    public List<CourseStaff> getCourseStaffs() {
        throw new NotImplementedException();
    }

    public void setCourseStaffs(List<CourseStaff> courseStaffs) {}

    public List<TestAnswer> getTestAnswers() {
        throw new NotImplementedException();
    }

    public void setTestAnswers(List<TestAnswer> testAnswers) {}
}
