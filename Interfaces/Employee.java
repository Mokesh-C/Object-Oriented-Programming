package Interfaces;

public class Employee implements Workable, Payable, DetailedInfo { // Class implementing multiple interfaces
    // Multiple inheritance of type via interfaces, but not multiple inheritance of implementation
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void startWork() {
        System.out.println(name + " has started working as a " + position + ".");
    }

    @Override
    public void show() { // Since both interfaces have default show() methods.
        // Since it does not know which one to inherit,we must override it here.
        // We call one of them using super

        Workable.super.show();
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for " + name + ": $" + salary);
    }

    @Override
    public void showBasicDetails() {
        System.out.println("Employee Name: " + name + ", Position: " + position);
    }

    @Override
    public void showDetailedInfo() {
        System.out.println("Employee Name: " + name + ", Position: " + position + ", Salary: $" + salary);
    }

}
