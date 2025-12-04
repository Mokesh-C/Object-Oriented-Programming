package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Parent reference to child object
        Employee emp1 = new Manager("Hanna", 101, 80000, 5);
        // emp1 can only access members of Employee class
        // which method to call is decided by the object type at runtime.

        emp1.work(); // Calls overridden method in Manager class. this is runtime polymorphism.
        // this is decided at runtime based on object type.

        Employee.displaySalary(emp1); // Calls static method in Employee class. this is compile-time polymorphism.

        Employee emp2 = new Developer("Elsa", 102, 85000, "Python");
        emp2.work(); // Calls overridden method in Developer class.

        Employee emp3 = new SeniorManager("Mack", 103, 120000, 10, 5000);
        emp3.work(); // Calls overridden method in SeniorManager class.
    }
}
