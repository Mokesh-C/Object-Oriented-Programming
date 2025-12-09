package Interfaces;

public interface Payable {
    void calculateSalary();
    default void show(){
        System.out.println("Payable interface default method.");
    }
}
