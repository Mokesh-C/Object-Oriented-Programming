package AccessModifiers;

public class Student extends College{
    String studentName; // default access modifier
    private String studentID;
    protected int enrollmentYear;
    public String major;

    public Student(String collegeName, String collegeAddress, int establishedYear, int numberOfStudents,
                   String studentName, String studentID, int enrollmentYear, String major) {
        super(collegeName, collegeAddress, establishedYear, numberOfStudents);
        this.studentName = studentName;
        this.studentID = studentID;
        this.enrollmentYear = enrollmentYear;
        this.major = major;
    }

    private void displayStudentInfo() {
        System.out.println("Student Name: " + studentName + ", Student ID: " + studentID +
                           ", Enrollment Year: " + enrollmentYear + ", Major: " + major);
    }

    public void showStudentDetails() {
        displayStudentInfo();
        showDetails(); // Calling College's public method to show college details
    }
}
