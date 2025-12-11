package LamdaFunctions;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hanna", 20, 9.1f);
        Student s2 = new Student("Elsa", 22, 9.1f);

        if(s1.compare(s2) < 0){
            System.out.println(s1.name + " has lower CGPA");
            System.out.println(s2.name + " has higher CGPA");
        } else if(s1.compare(s2) > 0){
            System.out.println(s2.name + " has lower CGPA");
            System.out.println(s1.name + " has higher CGPA");
        } else {
            System.out.println(s1.name + ", " + s2.name + " have same CGPA");
        }

        Student[] std = new Student[7];
        for (int i = 0; i < 7; i++) {
            std[i] = new Student("Std" + (i+1), 28 - i, 9.0f - i);
        }

        System.out.println(Arrays.toString(std));
        Arrays.sort(std); // This will use compareTo method of Student class to sort the array
        System.out.println("After sorting based on CGPA:");
        System.out.println(Arrays.toString(std));

        // now see the comparator in action

        Arrays.sort(std, new Comparator<Student>() {
            @Override // comapre method to compare two Student objects whereas compareTo compares current object with another object
            public int compare(Student o1, Student o2) {
                return (int) (o2.cgpa - o1.cgpa); // sorting in descending order of cgpa
            }
        });

        System.out.println(Arrays.toString(std));

        Comparator<Student> lst = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age; // sorting in ascending order of age
            }
        };

        Arrays.sort(std, lst); // can we use in this way also
        System.out.println("After sorting based on Age:");
        System.out.println(Arrays.toString(std));
    }
}
