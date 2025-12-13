package ExceptionAndClone;

import java.util.Arrays;

public class Student implements Cloneable {
    int id;
    String name;
    float percentage;
    int[] marks;

    public Student(int id, String name, float percentage, int[] marks) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + '\'' +", percentage=" + percentage +", marks=" + Arrays.toString(marks);
    }

    // Shallow copy - copies primitive fields and references of objects
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    // Deep Copy - copies primitive fields and creates new copies of objects. modifications in one object do not affect the other.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone(); // Shallow copy
        cloned.marks = new int[this.marks.length]; // Create new array for marks
        for (int i = 0; i < marks.length; i++) {
            cloned.marks[i] = this.marks[i]; // Deep copy of marks array
        }
        // cloned.marks = this.marks.clone(); // this is another way to deep copy the array. clone() method of array class
        // but for custom objects array we need to clone each object individually as done above.
        return cloned;
    }
}
