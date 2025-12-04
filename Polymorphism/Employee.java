package Polymorphism;

public class Employee {
    String name;
    int id;
    int salary;

    // method overloading
    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0;
    }

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    Employee(Employee other) {
        this.name = other.name;
        this.id = other.id;
        this.salary = other.salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }

    static void displaySalary(Employee emp) {
        System.out.println("Salary of " + emp.name + " is: " + emp.salary);
    }

    final void displayDetails() {
        System.out.println("Employee Details: Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }

}

class Manager extends Employee {
    int teamSize;
    int salary = super.salary + 10000;

    Manager() {
        super();
        this.teamSize = 0;
    }

    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // method overriding
    @Override
    void work() {
        System.out.println(name + " is managing a team of size " + teamSize + ".");
    }

    // static method hiding. static methods are not overridden, they are hidden.
    // static is dependent on class type, not object type. so reference type decides which static method to call.
    static void displaySalary(Manager mgr) {
        System.out.println("Salary of Manager " + mgr.name + " is: " + mgr.salary);
    }

    // final method cannot be overridden in child class
//    void displayDetails() {
//        System.out.println("Manager Details: Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Team Size: " + teamSize);
//    }

}

class Developer extends Employee {
    String programmingLanguage;
    int salary = super.salary + 5000;

    Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }

    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    //method overriding
    @Override
    void work() {
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }

    static void displaySalary(Developer dev) {
        System.out.println("Salary of Developer " + dev.name + " is: " + dev.salary);
    }

}

class SeniorManager extends Manager {
    int bonus;

    SeniorManager() {
        super();
        this.bonus = 0;
    }

    SeniorManager(String name, int id, int salary, int teamSize, int bonus) {
        super(name, id, salary, teamSize);
        this.bonus = bonus;
    }

    void work() {
        System.out.println(name + " is managing a large team of size " + teamSize + " with a bonus of " + bonus + ".");
    }

}
