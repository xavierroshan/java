import java.util.Scanner;
import java.util.Arrays;

public class javaSearchArray {
    public static void main (String[] args){
        int [] numbers = {1,2,4,6,8,10};
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Select a number from the Array %s: ", Arrays.toString(numbers));
        int target = scanner.nextInt();
        System.out.println(numbers.length);
        boolean found = false;
        for (int i=0; i <numbers.length; i++){
            if (target == numbers[i]){
                System.out.printf("Number found in the array \n ");
                found=true;
                break;
            }

        }
        if (!found) {
            System.out.println("Number not found in the array.");
        }

        scanner.close();

    }
}
