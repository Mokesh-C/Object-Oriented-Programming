package Inheritance;

public class Employee {
    String name;
    int id;
    int salary;

    Employee() {
        // super() is called here implicitly
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0;
    }

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    Employee (Employee other) {
        this.name = other.name;
        this.id = other.id;
        this.salary = other.salary;
    }

}


class Manager extends Employee {
    int teamSize;
    int salary = super.salary + 10000;
    Manager() {
        super(); // even we don't mention super(), it will be called by default
        this.teamSize = 0;
    }

    Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    Manager (Manager other) {
        super(other); // other is of type Manager, but it sent to Employee reference type // Employee (Employee other).
        this.teamSize = other.teamSize;
    }

    void displaySalary() {
        System.out.println("\nEmployee Salary from Employee class: " + super.salary);
        System.out.println("Manager Salary: " + this.salary);
    }

}

class SeniorManager extends Manager {
    int stockOptions;

    SeniorManager() {
        super();
        this.stockOptions = 0;
    }

    SeniorManager(String name, int id, int salary, int teamSize, int stockOptions) {
        super(name, id, salary, teamSize);
        this.stockOptions = stockOptions;
    }

    SeniorManager (SeniorManager other) {
        super(other);
        this.stockOptions = other.stockOptions;
    }

    void displayDetails() {
        System.out.println("\nName: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Team Size: " + this.teamSize);
        System.out.println("Stock Options: " + this.stockOptions);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }

    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    Developer (Developer other) {
        super(other);
        this.programmingLanguage = other.programmingLanguage;
    }

    void displayDetails() {
        System.out.println("\nName: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Programming Language: " + this.programmingLanguage);
    }
}