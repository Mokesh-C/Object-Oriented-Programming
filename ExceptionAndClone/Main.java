package ExceptionAndClone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1, "Hanna",88.4f, new int[]{85, 90, 88, 92, 87});
        Student s2 = (Student) s1.clone();

        System.out.println(s1);
        System.out.println(s2);

        // shallow copy
//        s2.marks[0] = 100; // modifying marks of cloned object to see if it affects original object
//        System.out.println("After modifying cloned object's marks:");
//        System.out.println(s1); // original object also changed due to copying reference of marks array
//        System.out.println(s2);

        // Deep copy
        s2.name = "Elsa";
        s2.marks[0] = 100; // modifying marks of deep clone does not affect original object
        System.out.println("After modifying cloned object's name and marks:");
        System.out.println(s1);
        System.out.println(s2);
    }
}
