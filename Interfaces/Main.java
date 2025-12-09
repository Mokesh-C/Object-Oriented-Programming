package Interfaces;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Hanna", "Developer", 70000);
        emp.startWork();
        emp.calculateSalary();
        emp.showBasicDetails();
        emp.showDetailedInfo();

        Workable w1 = new Employee("Elsa", "Manager", 90000); // This is allowed. Upcasting to Workable
        w1.startWork();
        // w1.calculateSalary(); // Not allowed, as w1 is of type Workable
        w1.show(); // Calls Workable's default show() method

        Payable p1 = (Payable) w1; // Downcasting to Payable
        p1.calculateSalary();

        DetailedInfo d1 = (DetailedInfo) w1; // Downcasting to DetailedInfo
        d1.showDetailedInfo();

        // Calling static method from Workable interface
        Workable.isVaildWorkHour(7);
        Workable.isVaildWorkHour(9);
        Workable.isVaildWorkHour(-1);
    }
}
