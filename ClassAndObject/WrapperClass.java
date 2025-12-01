package ClassAndObject;

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = new Integer(20);
        // Both a and b are Integer objects

        // Now try to swap a and b and check their values
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);
        // Both a and b will remain unchanged after the swap attempt
        // This is because Integer is immutable ( due to wrapper class are final class)
        // Immutable means once created, the value cannot be changed. but we can create new object with new value

    }
    static void swap(Integer x, Integer y) {
        Integer temp = x;
        x = y;
        y = temp;
    }
}
