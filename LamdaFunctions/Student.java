package LamdaFunctions;

public class Student implements Comparable<Student>{
    String name;
    int age;
    float cgpa;
    public Student(String name, int age, float cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    // Comparable interface has abstract method compareTo which we need to override
    // Compare is used to compare two Student objects based on age, name or cgpa
    // If any class has compareTo method, we can use Collections.sort() method to sort the list of that class objects.
    // It uses compareTo method internally to sort the objects.

    @Override
    public int compareTo(Student other) {
//        return Float.compare(this.cgpa, other.cgpa); // Using Float.compare to avoid manual subtraction
//        return (int) (this.cgpa-other.cgpa); // Using subtraction to compare cgpa
        return  this.compare(other); // Using custom compare method to compare age
    }

    int compare(Student other){
        return this.cgpa < other.cgpa ? -1 : (this.cgpa == other.cgpa ? 0 : 1);

    }

    @Override
    public String toString() {
        return "Age: "+ this.age +" CGPA: " + this.cgpa ;
    }
}
