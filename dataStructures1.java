import java.util.Scanner;

public class dataStructures1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        System.out.println(nums[0]);
        int[][] arr = new int[3][3];
        System.out.println(arr[0][0]);
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr[i].length; j++) {
                System.out.println("Enter the number: ");
                arr[i][j]= scanner.nextInt();

            }

        }
        System.out.println("The array is: " + arr);
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }

        }
    }
}
