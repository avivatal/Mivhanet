import java.util.Date;
import java.util.List;

public class Reception extends User {

    public void openCourseInSemester(String courseId, Semester semester, List<Student> registeredStudents, CourseStaff courseStaff){}

    public void addStudentToCourse(String courseId, Student studentToAdd){}

    public void setTestDate(String coureseId, Semester semester, Test.moed testMoed, Date testDate){}

    public void manageCourseStaff(String courseId, List<InstructionEmployee> courseStaffList){}

    public void viewGrades(String studentId){}

    public void createUser(String FirstName, String LastName, String phoneNumber, String email, String userName,
                           String ID, String address, Class<? extends User> userType){}
}
