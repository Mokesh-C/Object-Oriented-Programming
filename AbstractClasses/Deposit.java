package AbstractClasses;

public class Deposit extends Transaction{
    public Deposit(String accountNumber, double amount) {
        super(accountNumber, amount);
    }

    @Override
    String process() {
        return "Deposited " + amount + " to account " + accountNumber;
    }
    
    @Override
    String description() {
        return "This is a deposit transaction.";
    }

}
