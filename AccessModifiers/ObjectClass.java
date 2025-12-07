package AccessModifiers;

public class ObjectClass {
    // Every class in Java implicitly extends the Object class
    // Now some methods of Object class
    int data;
    String value;


    public ObjectClass(int data, String value) {
        super();
        this.data = data;
        this.value = value;
    }

    // we can override these methods as per our requirement
    @Override
    public int hashCode() {
        //return super.hashCode(); // default implementation returns integer representation of memory address
        return Integer.hashCode(data); // custom implementation
    }

    @Override
    public boolean equals(Object obj) {
        // return super.equals(obj); // default implementation returns (this == obj)
        return this.data == ((ObjectClass)obj).data; // custom implementation
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // default implementation performs shallow copy
        // shallow copy means only primitive data types are copied, reference types point to same object
    }

    @Override
    public String toString() {
        // return super.toString();// default implementation returns className@hashcode
        return "ObjectClass [data=" + data + ", value=" + value + "]"; // custom implementation
    }

    @Override
    protected void finalize() throws Throwable { // this is deprecated in Java 9 and later
        System.out.println("ObjectClass is being garbage collected"); // called before object is destroyed
        super.finalize(); // default implementation
    }

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass(8, "Hello");
        ObjectClass obj2 = new ObjectClass(8, "World");
        ObjectClass obj3 = new ObjectClass(10, "Java");

        System.out.println("obj1 hashCode: " + obj1.hashCode());
        System.out.println("obj2 hashCode: " + obj2.hashCode());

        System.out.println("obj1 equals obj2: " + obj1.equals(obj2)); // true
        System.out.println("obj1 equals obj3: " + obj1.equals(obj3)); // false

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
