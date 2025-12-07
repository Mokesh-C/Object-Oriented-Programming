package AccessModifiers;


public class Main {
    public static void main(String[] args) {
        College clg = new College("PSG Tech", "456 College Rd", 1951, 10000);
        clg.showDetails(); // Accessing private method via public method
        clg.collegeInfo(); // Accessing protected method within the same package

        Student std = new Student("PSG Tech", "456 College Rd", 1951, 10000,
                                  "Hanna", "S123", 2022, "Computer Science");
        std.showStudentDetails(); // Accessing private method via public method in Student class
        std.collegeInfo(); // Accessing protected method inherited from College class


    }
}
