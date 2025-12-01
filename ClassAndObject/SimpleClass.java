package ClassAndObject;

public class SimpleClass {
    public static void main(String[] args) {
        College c1 = new College();
        System.out.println("College Name: " + c1.name);
        System.out.println("Location: " + c1.location);
        System.out.println("Establishment Year: " + c1.establishmentYear);

        College c2;
        c2 = new College();
        c2.name = "Loyola College";
        c2.location = "Chennai";
        c2.establishmentYear = 1925;

        System.out.println("\nCollege Name: " + c2.name);
        System.out.println("Location: " + c2.location);

        c1 = new College("PSG College of Technology", "Coimbatore", 1951);
        System.out.println("\nCollege Name: " + c1.name);
        System.out.println("Location: " + c1.location);

        College c3 = c2;
        System.out.println("\nCollege Name: " + c3.name);

        // Modifying c3 will also modify c2 as both refer to the same object
        c3.name = "Loyola College, Chennai";
        System.out.println("\nAfter modifying c3: " + c3.name);
        System.out.println("c2 College Name: " + c2.name);


        // Using Copy Constructor
        College c4 = new College(c1);
        System.out.println("\nCollege Name (c4 - copy of c1): " + c4.name);

        // Displaying information using method
        System.out.println("\nDisplaying c4 Info:");
        c4.displayInfo();

    }
}

class College{
    String name;
    String location;
    int establishmentYear;

//    College(){
//        name = "PSG College of Technology";
//        location = "Coimbatore";
//        establishmentYear = 1951;
//    }

    // Another way to call the default constructor
    College(){
        this("PSG College of Technology", "Coimbatore", 1951);
    }

    College(String name, String location, int year) {
        this.name = name;
        this.location = location;
        this.establishmentYear = year;
    }

    // Copy Constructor
    College (College c) {
        this.name = c.name;
        this.location = c.location;
        this.establishmentYear = c.establishmentYear;
    }

    void displayInfo() {
        System.out.println("College Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Establishment Year: " + establishmentYear);
    }
}