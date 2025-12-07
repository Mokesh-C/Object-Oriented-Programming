package SimplePackage;

public class Employee {
    protected String empId;
    protected int salary;


    public Employee(String empId, int salary) {
        this.empId = empId;
        this.salary = salary;
    }

    protected void displayInfo() {
        System.out.println("Employee ID: " + empId + ", Salary: " + salary);
    }
}
