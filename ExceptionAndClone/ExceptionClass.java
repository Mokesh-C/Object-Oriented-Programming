package ExceptionAndClone;

import java.io.File;
import java.io.FileReader;

public class ExceptionClass {

    // throws is used when method may an exception to the caller method instead of handling it.
    // so what caller method has to handle that exception.(try-catch or throws)
    public void canVote(int age) throws Exception{
        checkCanVote(age);
    }

    public void checkCanVote(int age) throws Exception{
        if(age < 18) {
            throw new Exception("Age is less than 18, cannot vote."); // throwing exception explicitly
        } else {
            System.out.println("You can vote.");
        }
    }


    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
            String str = null; // This will cause NullPointerException
            System.out.println(str.length()); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught a null pointer exception: " + e.getMessage());
        } finally { // finally block always executes
            System.out.println("This Block is always executed.");
        }

        try {
            ExceptionClass obj = new ExceptionClass();
            obj.canVote(16); // This will throw exception
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Custom Exception
        try{
            throw new CustomException("This is a custom exception message.");
            // throw new CustomException("This is a custom exception message.", new Throwable("Cause of the exception."));
            // throwable is root class of all errors and exceptions
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }


        int divideByZero = 1/0; // This is Unchecked Exception, so don't show compile time error.
        // this allows without try-catch. but at runtime it will crash the program.

        System.out.println("Program continues after exception handling.");


        // FileReader fr = new FileReader("file.txt"); // this is Checked Exception, so show compile time error.
        // it forces to handle exception using try-catch or throws.
    }
}
