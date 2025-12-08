package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Transaction deposit = new Deposit("123456", 500.0);
        System.out.println(deposit.process());  // parent class reference to child class object is allowed.

        //Transaction t1 =  new Transaction("123445", 600); // abstract class object creation is not allowed.

        Withdraw withdraw = new Withdraw("654321", 200.0);
        System.out.println(withdraw.process());

        Transfer transfer = new Transfer("112233", 150.0, "445566");
        transfer.receipt();

        // All the child class has same process method but different implementation.
        // the abstract class forces the child class to implement the abstract methods.

        Transaction.info(); // static method can be called using class name.

        // why abstract classes?
        // 1. To provide a common interface for all the child classes.
        // 2. To enforce a contract for the child classes to implement specific methods.
        // 3. To achieve abstraction and hide implementation details.


    }
}
