package Static;

public class StaticMethod {
    static  int count = 0; // Used when all objects share a common property

    // static variables and methods belong to the class rather than any specific instance
    // static variables and methods can be accessed within static methods or static blocks directly without creating an instance of the class.
    // To access non-static members inside static, you need to create an instance of the class.

    StaticMethod(){
        StaticMethod.count++; //
        System.out.println("Number of objects created: " + count);
    }

    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod();
        StaticMethod s2 = new StaticMethod();

        System.out.println(s1.count); // Accessing static variable using instance
        System.out.println(s2.count); // both s1 and s2 will show same value
        System.out.println(StaticMethod.count); // Accessing static variable using class name

        // static method can be called without creating an instance
        StaticMethod.displayCount();


        Hospital h1 = new Hospital("City Hospital", "New York");
        Hospital.patientCount = 150; // Incrementing patient count

        h1.displayInfo(); // Calling non-static method using instance

        Hospital.patientCount(); // Calling static method
    }

}

// Outer class cannot be static, Since static is always dependent on class
class Hospital {
    String name;
    String location;
    static int patientCount = 0; // Shared among all Hospital objects

    Hospital(String name, String location) {
        this.name = name;
        this.location = location;
    }

    static void patientCount(){
       // displayInfo(); // Cannot call non-static method directly.
        Hospital h = new Hospital("Default", "Default");
        h.displayInfo(); // Creating an instance to call non-static method
    }


    void displayInfo() {
        System.out.println("Total Patients: " + patientCount);
    }

}
