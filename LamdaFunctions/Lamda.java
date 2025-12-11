package LamdaFunctions;

import java.util.Arrays;
import java.util.Comparator;

public class Lamda {
    // Lamda function means an anonymous function, which can be used to implement functional interfaces
    // A functional interface is an interface with only one abstract method. It can have multiple default and static methods.
    // Lamda functions are used to provide the implementation of the abstract method of functional interface.
    // Lamda functions are used to write the code in a more concise and readable
    public static void main(String[] args) {
        Student[] std = new Student[5];
        std[0] = new Student("Hanna", 21, 8.7f);
        std[1] = new Student("Elsa", 22, 9.1f);
        std[2] = new Student("Mack", 25, 8.5f);
        std[3] = new Student("Anna", 20, 9.3f);
        std[4] = new Student("Olaf", 23, 7.9f);

        Arrays.sort(std, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return  Integer.compare(o1.age, o2.age); // sorting in ascending order of age
            }
        });

        // The above method can be replaced with lambda function as below
        Arrays.sort(std, (o1, o2) -> Integer.compare(o1.age, o2.age));
        System.out.println("Students sorted by age using lambda:");
        System.out.println(Arrays.toString(std));

        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("Addition: " + operate(10, 5, add));
        System.out.println("Subtraction: " + operate(10, 5, subtract));
        System.out.println("Multiplication: " + operate(10, 5, multiply));
        System.out.println("Direct addition: " + add.operation(15,34));

    }

    public static int operate(int a, int b, MathOperation MOp) {
        return MOp.operation(a, b);
    }
}

interface MathOperation {
    int operation(int a, int b);
}