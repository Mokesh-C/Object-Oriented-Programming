package AccessModifiers;

public class College {
    String CollegeName; // default access modifier
    private String CollegeAddress;
    protected int EstablishedYear;
    public int NumberOfStudents;

    public College(String name, String address, int year, int students) {
        this.CollegeName = name;
        this.CollegeAddress = address;
        this.EstablishedYear = year;
        this.NumberOfStudents = students;
    }
    private void studentDetails() {
        System.out.println("College: " + CollegeName + ", Address: " + CollegeAddress + ", Established: " + EstablishedYear + ", Students: " + NumberOfStudents);
    }

    public void showDetails() {
        studentDetails();
    }
    protected void collegeInfo() {
        System.out.println("College Name: " + CollegeName + ", Established Year: " + EstablishedYear);
    }

}

