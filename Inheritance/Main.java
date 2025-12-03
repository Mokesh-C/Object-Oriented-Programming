package Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Cruz", 51, 78000);

        System.out.println("Employee 1: " + emp1.name + ", ID: " + emp1.id + ", Salary: " + emp1.salary);
        System.out.println("Employee 2: " + emp2.name + ", ID: " + emp2.id + ", Salary: " + emp2.salary);

        Manager mgr1 = new Manager();
        Manager mgr2 = new Manager("Mack", 36, 95000, 5);
        Manager mgr3 = new Manager(mgr2); // Copy constructor

        System.out.println("\nManager 1: " + mgr1.name + ", ID: " + mgr1.id + ", Salary: " + mgr1.salary + ", Team Size: " + mgr1.teamSize);
        System.out.println("Manager 3 (Copy of Manager 2): " + mgr3.name + ", ID: " + mgr3.id + ", Salary: " + mgr3.salary + ", Team Size: " + mgr3.teamSize);

        // Trying parent reference to child object
        Employee emp3 = new Manager("Smoky",48 , 88000, 10);
        System.out.println("\nEmployee 3 (Manager): " + emp3.name + ", ID: " + emp3.id + ", Salary: " + emp3.salary);
        // System.out.println(emp3.teamSize); // This line will cause a compile-time error
        // Because emp3 is of type Employee, which doesn't have teamSize attribute
        // So the reference type decides what members can be accessed, not the object type

        // Manager mgr4 = new Employee(); // This line will cause a compile-time error
        // Because a parent class object cannot be assigned to a child class reference. i.e Employee is not a Manager. but Manager is an Employee.
        // Simple Logic: child class reference type cannot find the child class members in parent class object. so it is not allowed.

        Manager mgr4 = new Manager("Elsa", 29, 99000, 8);
        mgr4.displaySalary();

        // Multilevel Inheritance
        SeniorManager srMgr1 = new SeniorManager();
        SeniorManager srMgr2 = new SeniorManager("Hudson", 53, 120000, 12, 5000);
        srMgr1.displayDetails();
        srMgr2.displayDetails();

        Developer dev1 = new Developer();
        Developer dev2 = new Developer("McQueen", 95, 95000, "Java");
        dev1.displayDetails();
        dev2.displayDetails();

    }
}
