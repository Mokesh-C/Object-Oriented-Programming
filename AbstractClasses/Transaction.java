package AbstractClasses;

public abstract class Transaction {
    // abstract class cannot be final. Because final class cannot be inherited.
    protected String accountNumber;
    protected double amount;

    public  Transaction (String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    // abstract method must be implemented by child classes
    abstract String process();

    abstract String description();

    public void receipt() {
        System.out.println("Transaction Receipt:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: $" + amount);
        System.out.println(description());
        System.out.println( process());
    }

    static void info() {
        System.out.println("This is an abstract class for bank transactions.");
    }
}
