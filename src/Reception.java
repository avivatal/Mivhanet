import java.util.Date;
import java.util.List;

public class Reception extends User {

    public void openCourse(String courseId, Enum semester, String year, List<Student> registersStudents){}

    public void setTestDate(String coureseId, Test.moed testMoed, Date testDate){}

    public void manageCourseStaff(String courseId, List<InstructionEmployee> courseStaffList){}

    public void viewGrades(String studentId){}

    public void createUser(String FirstName, String LastName, String phoneNumber, String email, String userName,
                           String ID, String address, Class<? extends User> userType){}
}
