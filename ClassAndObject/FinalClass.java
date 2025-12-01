package ClassAndObject;

public class FinalClass {
    public static void main(String[] args) {
        // Final to the primitive data cannot change the value
        final int a = 10;
        // a = 20; // This will cause a compile-time error

        // Final to the object reference cannot change the reference. But the object's internal state can be modified
        final College clg = new College("PSG College of Technology", "Coimbatore", 1951);
        // clg = new College(); // This will cause a compile-time error

        clg.name = "PSG Tech"; // This is allowed, modifying the internal state
        System.out.println("College Name: " + clg.name);
    }
}
