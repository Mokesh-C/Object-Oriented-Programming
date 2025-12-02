package Static;

public class SingletonClass {
    // only one instance of the class is allowed
    private static SingletonClass instance;
    public String data;

    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
            instance.data = "Initial Data";
        }
        return instance;
    }
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        System.out.println("Object 1 Data: " + obj1.data);
        System.out.println("Object 2 Data: " + obj2.data);

        obj1.data = "Modified Data";

        System.out.println("\nAfter modifying obj1 data:");
        System.out.println("Object 1 Data: " + obj1.data);
        System.out.println("Object 2 Data: " + obj2.data);

        // Both obj1 and obj2 will reflect the same data since they point to the same instance
    }
}
