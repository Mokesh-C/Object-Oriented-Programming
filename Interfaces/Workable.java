package Interfaces;

public interface Workable {
    int WORK_HOURS = 8; // public, static, final by default

    void startWork(); // public and abstract by default

    default void show(){
        System.out.println("Workable interface default method. Work hours: " + WORK_HOURS);
    }

    static void isVaildWorkHour(int hours) {
        if(hours <= WORK_HOURS && hours >=0) {
            System.out.println("Valid work hours.");
        } else if(hours < 0) {
            System.out.println("Work hours cannot be negative.");
        } else {
            System.out.println("Exceeds standard work hours.");
        }
    }
}
