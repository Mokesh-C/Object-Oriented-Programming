package Static;

public class StaticBlock {

    static int count;
    int num;

    // static blocks are executed when the class is loaded, before any objects are created
    static {
        count = 100;
        System.out.println("Static Block Executed. Count initialized to " + count);
        //num = 50; // Error. Only static members can be accessed in static block
    }

     static class InnerClass{
        void display(){
            System.out.println("Static Inner class");
        }
    }


    public static void main(String[] args) {
        System.out.println("Count value: " + StaticBlock.count);

        count =  460;
        System.out.println("Updated Count value: " + StaticBlock.count);

//        InnerClass i1 = new StaticBlock().new InnerClass(); // For non-static inner class
//        i1.display();

        InnerClass i1 = new InnerClass(); // For static inner class
        i1.display();


       // To create object of inner class, we need to create object of outer class first
//        Vehicle v1 = new Vehicle();
//        Engine e1 = v1.new Engine();
//        e1.display();

        // Another way to create inner class object directly is making inner class static
        Vehicle.Engine e1 = new Vehicle.Engine();
        e1.display();
    }
}

// Outer class cannot be static, Since static is always dependent on class
class Vehicle{

    // Inner class can be static or non-static. Since it is dependent on outer class
    static class Engine{

        void display(){
            System.out.println("Engine class inside vehicle class");
        }
    }

}
