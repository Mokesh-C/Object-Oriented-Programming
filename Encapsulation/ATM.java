package Encapsulation;

public class ATM{
    String pin;
    private double balance;

    ATM(String pin, double initialBalance){
        this.pin = pin;
        this.balance = initialBalance;
    }

    public double getBalance(String enteredPin){
        if(this.pin.equals(enteredPin)){
            return this.balance;
        } else {
            System.out.println("Incorrect PIN. Access denied.");
            return -1;
        }
    }
    // Here the deposit method encapsulates the logic of depositing money into the ATM account.
    // It checks if the entered PIN is correct before allowing the deposit.
    // Also, it ensures that the deposit amount is positive.
    public void deposit(String enteredPin, double amount){
        if(this.pin.equals(enteredPin)){
            if(amount > 0){
                this.balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }

    // This method ensures that the withdrawal amount is in multiples of 100.
    // It also checks for sufficient balance before allowing the withdrawal.
    // Here restricting the access of withdrawal amount to multiples of 100 only.
    public void withdraw(String enteredPin, double amount){
        if(this.pin.equals(enteredPin)){
            if (amount % 100 != 0) {
                System.out.println("Withdrawal amount must be in multiples of 100."); // we cannot withdraw amount like 232 rupees.
            } else if(amount > 0 && amount <= this.balance){
                this.balance -= amount;
                System.out.println("Withdrew: " + amount);
            }  else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }
    }
}
