package Generics;

import java.util.Arrays;

// Generic Class is used to create a class that can work with any data type.
public class Array <T>{
    // use Array<T extends Number> if you want to restrict T to Number and its subclasses only.
    // use Array<? extends Number> in methods if you want to accept any subclass of Number. It is WildCard.
    private T[] array;
    private int index;

    public Array() {
        array = (T[]) new Object[10];  // or we can directly use Object array instead of T[]
        index = 0;
    }

    public void add(T element) {
        if(isArrayFull()) {
            resizeArray();
        }
        array[index++] = element;
    }

    private void resizeArray() {
        Object newArray[] = new Object[array.length * 2];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = (T[]) newArray;
    }

    private boolean isArrayFull() {
        return index == array.length;
    }

    public T get(int i) {
        if(i < 0 || i >= index) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + index);
        }
        return array[i];
    }

    public int size() {
        return index;
    }

    public void removeAtIndex(int i) {
        if(i < 0 || i >= index) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + index);
        }
        for(int j = i; j < index - 1; j++) {
            array[j] = array[j + 1];
        }
        array[--index] = null; // Clear the last element
    }

    public void remove(){
        if(index > 0) {
            array[--index] = null; // Clear the last element
        } else {
            throw new IndexOutOfBoundsException("Array is empty.");
        }
    }

    public void insertAtIndex(int i, T element) {
        if(i < 0 || i > index) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + index);
        }
        if(isArrayFull()) {
            resizeArray();
        }
        for(int j = index; j > i; j--) {
            array[j] = array[j - 1];
        }
        array[i] = element;
        index++;
    }


    public void showArray(){
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]);
            if(i != index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void sort(){
        Arrays.sort(array, 0, index);
    }

    // WildCard Example
    // we can directly use Array<T> instead of Array<?> (we can also restrict via <? extends Number>).
    // But if we give T , it replaces all with T only.
    // we don't know what type of Array will be passed. It can be Array<Integer>, Array<Double> etc. So we use WildCard.
    public void copyFrom(Array<?> source) {
        for (int i = 0; i < source.size(); i++) {
            this.add((T) source.get(i));
        }
    }

    static  <T> boolean contians(Array<T> arr, T element) {
        // static methods cannot use generic type T directly.
        // because static methods belong to class, not to instance.
        // and generic type T is associated with instance of class. so we use <T> before return type.

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equals(element)) {
                return true;
            }
        }
        return false;
    }
}
