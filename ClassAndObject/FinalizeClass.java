package ClassAndObject;

public class FinalizeClass {
    public static void main(String[] args) {
        // finalize method is called before the object is garbage collected (destroyed)
        // garbage collection automatically removes the objects when the object is no longer referenced
        // but there is no guarantee when it will be called

        for(int i = 0; i < 500000; i++) {
            new School();
        }
    }
}

class School {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("This object is being garbage collected");
    }
}
