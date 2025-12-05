package Encapsulation;

public class Main {
    public static void main(String[] args) {
        ATM myATM = new ATM("1234", 56000.0);

        System.out.println("Balance: " + myATM.getBalance("1234"));

        myATM.deposit("1234", 5000.0);
        System.out.println("Balance after deposit: " + myATM.getBalance("1234"));

        myATM.withdraw("1234", 3000.0);
        System.out.println("Balance after withdrawal: " + myATM.getBalance("1234"));

        // Try to withdraw an invalid amount
        myATM.withdraw("1234", 2050.0);

        // Try to get balance with incorrect PIN
        System.out.println("Balance: " + myATM.getBalance("0000"));

        // Now try with correct PIN
        System.out.println("Balance: " + myATM.getBalance("1234"));
    }
}
