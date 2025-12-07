package AccessModifiers;

import SimplePackage.Employee;
public class Manager extends Employee{
    private int teamSize;

    public Manager(String empId, int salary, int teamSize) {
        super(empId, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerInfo() {
        displayInfo(); // Accessing protected method from superclass
        System.out.println("Team Size: " + teamSize);
    }

    public static void main(String[] args) {
        Manager mgr = new Manager("E123", 75000, 10);
        Employee emp = new Employee("E456", 60000);
        //System.out.println(emp.salary); // Cannot access protected member from another package. Only inherited classes can access it.
        System.out.println(mgr.salary); // Accessing protected member from superclass

        mgr.displayManagerInfo();
    }
}
