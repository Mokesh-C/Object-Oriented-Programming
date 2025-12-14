package Enumeration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Month month = Month.May; // creating one of the enum instances, JVM loads all enum instances, so the constructor we created  is called for all instances
        // Month m = new Month("CustomMonth", 13); // it is not allowed due to private constructor

        System.out.println("Month: " + month);
        month.displayMonth();
        System.out.println("Month Number : "+ month.ordinal() ); // ordinal() method gives the position of enum instance starting from 0
        System.out.println(month.name()); // name() method gives the name of enum instance as declared
        System.out.println(Month.valueOf("March")); // valueOf() method returns the enum instance for the given name

        System.out.println("Listing all the elements: "+Arrays.toString(month.values()));
        // iterating over all enum instances
        for(Month m : Month.values()) { // values() method returns an array of all enum instances
            System.out.println(m + " is month number " + (m.ordinal() + 1));
        }

        month.printDays(); // calling abstract method implemented in each enum instance
    }
}
