import java.util.Scanner;

public class javaArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What # of food do you want: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println(n);
        String[] foods =new String[n];
        for (int i=0; i < n; i++) {
            System.out.println("Enter the food:");
            foods[i]=scanner.nextLine();
        }

        for (String food: foods) {
            System.out.println(food);
        }

    }
}
