//
//public class classObjectsBank {
//    public static void main (String[] args){
//        Account account = new Account();
//        account.name = "Roshan Xavier";
//        account.accountId = "20917";
//        account.balance = 5000;
//        account.deposit = 50;
//        account.putMoney();
//        System.out.println(account.balance);
//        account.withdraw = 25;
//        account.takeMoney();
//        System.out.println(account.balance);
//
//
//
//    }
//}
//
//class Account {
//    String name;
//    String accountId;
//    double balance;
//    String accountType;
//    double deposit =0;
//    double withdraw=0;
//
//    public void putMoney(){
//        balance = balance+deposit;
//    }
//
//    public void takeMoney(){
//        if (balance < withdraw) {
//            throw new IllegalArgumentException("Your withdrawal amount should be less than the balance !");
//        }
//        else {
//            balance = balance-withdraw;
//        }
//    }
//
//    public double getBalance(){
//        return balance;
//    }
//
//
//}

//next approach

//public class classObjectsBank {
//    public static void main (String[] args){
//        Account account = new Account();
//        account.createAccount("Roshan Xavier","20917", 5000, "checking");
//        System.out.println();
//        account.putMoney(4000);
//        System.out.println();
//        System.out.printf("Balance in the account is %.2f", account.getBalance());
//        account.withdraw = 2000;
//        System.out.println();
//        account.takeMoney();
//        System.out.println();
//        System.out.printf("Balance in the account is %.2f", account.getBalance());
//
//
//
//    }
//}
//
//class Account {
//    String name;
//    String accountId;
//    double balance;
//    String accountType;
//    double deposit;
//    double withdraw;
//
//
//    public void createAccount (String name, String accountId, double balance, String accountType) {
//        this.name = name;
//        this.accountId = accountId;
//        this.balance = balance;
//        this.accountType = accountType;
//        System.out.printf("The %s account for %s has been created and the account number is %s and balance in the account is %.2f", this.accountType, this.name, this.accountId, this.balance);
//    }
//
//
//    public void putMoney(double deposit){
//        this.deposit=deposit;
//        System.out.printf("Making a deposit of %.2f: ", this.deposit);
//        balance = balance+this.deposit;
//        System.out.println();
//        System.out.printf("Deposited: %.2f", this.deposit);
//    }
//
//    public void takeMoney(){
//        if (balance < withdraw) {
//            throw new IllegalArgumentException("Your withdrawal amount should be less than the balance !");
//        }
//        else {
//            System.out.printf("Making a withdrawal of %.2f: ", this.withdraw);
//            balance = balance-this.withdraw;
//            System.out.println();
//            System.out.printf("Withdrawn: %.2f", this.withdraw);
//
//
//        }
//    }
//
//    public double getBalance(){
//        return balance;
//    }
//
//
//}

//next approach - Extending the code to add more functionality


import java.util.Scanner;

public class classObjectsBank {
    public static void main (String[] args){
        Account account = new Account();
        account.createAccount();
        System.out.println();
        account.putMoney();
        System.out.println();
        System.out.printf("Balance in the account is %.2f", account.getBalance());
        System.out.println();
        account.takeMoney();
        System.out.println();
        System.out.printf("Balance in the account is %.2f", account.getBalance());



    }
}

class Account {
    String name;
    String accountId;
    double balance;
    String accountType;
    double deposit;
    double withdraw;
    Scanner scanner = new Scanner(System.in);



    public void createAccount () {
        System.out.println("Enter the name of the person: ");
        this.name = scanner.nextLine();
        System.out.println("Enter the account number: ");
        this.accountId = scanner.nextLine();
        System.out.println("Enter the opening balance: ");
        this.balance = scanner.nextDouble();
        System.out.println("Enter the account type: ");
        scanner.nextLine();
        this.accountType = scanner.nextLine();
        System.out.printf("The %s account for %s has been created and the account number is %s and balance in the account is %.2f", this.accountType, this.name, this.accountId, this.balance);
    }


    public void putMoney(){
        System.out.println("Enter the deposit amount: ");
        this.deposit= scanner.nextDouble();
        System.out.printf("Making a deposit of %.2f: ", this.deposit);
        balance = balance+this.deposit;
        System.out.println();
        System.out.printf("Deposited: %.2f", this.deposit);
    }

    public void takeMoney(){
        if (balance < withdraw) {
            throw new IllegalArgumentException("Your withdrawal amount should be less than the balance !");
        }
        else {
            System.out.println("Enter the withdrawal amount: ");
            this.withdraw= scanner.nextDouble();
            System.out.printf("Making a withdrawal of %.2f: ", this.withdraw);
            balance = balance-this.withdraw;
            System.out.println();
            System.out.printf("Withdrawn: %.2f", this.withdraw);


        }
    }

    public double getBalance(){
        return this.balance;
    }


}


