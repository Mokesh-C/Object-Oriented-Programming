package AbstractClasses;

public class Transfer extends Transaction{
    private String targetAccountNumber;

    public Transfer(String accountNumber, double amount, String targetAccountNumber) {
        super(accountNumber, amount);
        this.targetAccountNumber = targetAccountNumber;
    }

    @Override
    String process() {
        return "Transferred " + amount + " from account " + accountNumber + " to account " + targetAccountNumber;
    }

    @Override
    String description() {
        return "This is a transfer transaction.";
    }
}
