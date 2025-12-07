package SimplePackage;

import AccessModifiers.Manager;

public class SeniorManger extends Manager {
    private int stockOptions;

    public SeniorManger(String empId, int salary, int teamSize, int stockOptions) {
        super(empId, salary, teamSize);
        this.stockOptions = stockOptions;
    }

    public void displaySeniorManagerInfo() {
        displayInfo(); // Accessing protected method from superclass
        System.out.println("Stock Options: " + stockOptions);
    }

    public static void main(String[] args) {
        SeniorManger seniorMgr = new SeniorManger("E789", 90000, 15, 1000);
        System.out.println(seniorMgr.salary);
        // Accessing protected member from superclass. it's allowed because SeniorManger is a subclass of Manager, where manager is in another package.
        // No matter what protected member can be accessed in subclass even if they are in different packages.
        // but creating object of that subclass in other package and try to access protected member will give error.
    }
}
