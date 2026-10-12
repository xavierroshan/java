public class classInterface {
    public static void main (String[] args) {
        CreditCardPayment payment1 = new CreditCardPayment();
        payment1.pay(100);
        InteracPayment payment2 = new InteracPayment();
        payment2.pay(200);

    }
}

interface payment {
    void pay(double amount);
}

class CreditCardPayment implements payment {
    @Override
    public void pay(double amount){
        System.out.printf("Paid %2f by Credit Card", amount);
        System.out.println();
    }
}

class InteracPayment implements payment {
    @Override
    public void pay(double amount){
        System.out.printf("Paid %2f by interac", amount);
        System.out.println();
    }
}