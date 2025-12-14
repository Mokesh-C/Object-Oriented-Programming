package Enumeration;

// enum can implement interfaces, but cannot extend classes
public enum Month implements getMonthInfo { // this is extended from java.lang.Enum by default
    January, February, March, April, May, June, July, August, September, October, November, December;
    // Each constant represents a month of the year
    // You can add methods and fields if needed

    // This is public, static and final by default
    // why so? because Enum uses private constructor to restrict instantiation inside the enum itself

    void displayMonth() {
        System.out.println("Month: " + this.name());
    }

    Month(){
        System.out.println("Constructor called for: " + this.name());
    }

    @Override
    public void printDays() {
        switch (this) {
            case January, March, May, July, August, October, December:
                System.out.println(this.name() + " has 31 days.");
                break;
            case April, June, September, November:
                System.out.println(this.name() + " has 30 days.");
                break;
            case February:
                System.out.println(this.name() + " has 28 or 29 days.");
                break;
        }
    }
}

// enum cannot be inherited
// class TestMonth extends Month {
//
//}

interface getMonthInfo {
    void printDays();
}