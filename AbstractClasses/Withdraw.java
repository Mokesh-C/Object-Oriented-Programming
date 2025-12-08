package AbstractClasses;

public class Withdraw extends Transaction{
    public Withdraw(String accountNumber, double amount) {
        super(accountNumber, amount);
    }

    @Override
    String process() {
        return "Withdrew " + amount + " from account " + accountNumber;
    }

    @Override
    String description() {
        return "This is a withdrawal transaction.";
    }
}
