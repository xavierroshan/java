import java.util.Arrays;

public class javaArray {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        System.out.println(fruits);
        for (int i =0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("\n");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        Arrays.sort(fruits);
        System.out.println(fruits);
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        Arrays.fill(fruits, "pineapples");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }


    }
}
