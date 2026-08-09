abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();
}

class CreditCard extends Payment {

    CreditCard(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Payment of" + amount + " made using Credit Card.");
    }
}

class UPI extends Payment {

    UPI(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Payment of" + amount + " made using UPI.");
    }
}

public class paymentsystem {
    public static void main(String[] args) {

        Payment p1 = new CreditCard(2500);
        Payment p2 = new UPI(800);

        p1.makePayment();
        p2.makePayment();
    }
}