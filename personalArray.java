//
//Level 1: Classes, encapsulation, generics
//1. Build your own DynamicArray<T>
//Implement add, get(index), remove(index), size, and contains. Back it with a private Object[] that doubles in size when full.
//OOP: encapsulation (keep the array private and expose only safe methods), generics, throwing IndexOutOfBoundsException.
//DSA: amortized O(1) append. Work out why doubling gives amortized O(1) while growing by +10 each time gives O(n).
//Stretch: shrink the array when it falls to ¼ full. Why ¼ and not ½?



public class personalArray {

    public static class DynamicArray <T>{
        private static final int DEFAULT_CAPACITY = 4;
        private Object[] data;
        private int size;

        public DynamicArray(){
            data = new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        public void add(T value){

        }

    }

    public static void main(String[] args){
        DynamicArray<String> myArray = new DynamicArray<>();
        System.out.println(myArray);

    }
}
