import java.math.BigDecimal;
import java.util.Scanner;

class BankAccount {
    public double balance = 5000.00;
    public void putMoney(double deposit){
        balance += deposit;
    }
    public void takeMoney(double withdraw){
        if (balance < withdraw) {
            System.out.println("Balance is insufficent to withdraw");
        }
        else {
            balance -= withdraw;
        }
    }
    public double getBalance() {
        return  balance;

    }
}

public class Hacker {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        double deposit = scanner.nextDouble();
        System.out.println("Enter the amount to withdraw: ");
        double withdraw = scanner.nextDouble();
        BankAccount account = new BankAccount();
        System.out.printf("Current account balance: %f", account.getBalance());
        System.out.println(deposit);
        System.out.println(withdraw);
        account.putMoney(deposit);
        account.takeMoney(withdraw);
        System.out.printf("Current account balance: %f", account.getBalance());

    }
}





