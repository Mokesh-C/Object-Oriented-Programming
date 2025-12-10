package Generics;

public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        // try to trigger resize by adding more elements
        for (int i = 0; i < 25 ; i++) {
            arr.add(i*2);
        }
        System.out.println("Element at index 1: " + arr.get(1)); // Output: 20
        System.out.println("Size of array: " + arr.size()); // Output: 3
        arr.sort();
        System.out.print("Sorted array: ");
        arr.showArray();

        Array<Integer> arr2 = new Array<>();
        arr2.copyFrom(arr);
        System.out.print("Copied array: ");
        arr2.showArray();

        System.out.println("Removing element at index 2");
        arr.removeAtIndex(2);
        System.out.print("Array after removal: ");
        arr.showArray();

        // use of static method directly
        System.out.println(Array.contians(arr2, 70) == true ? "Array contains elements " + 30 : "Array does not contain element " + 30);
    }
}
