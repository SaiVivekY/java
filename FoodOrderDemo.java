abstract class FoodOrder{
    double amount;

    FoodOrder(double amount) {
        this.amount = amount;
    }

    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {

    DineInOrder(double amount) {
        super(amount);
    }

    @Override
    void calculateBill() {
        double total = amount + (amount * 0.10); //10% service charge
        System.out.println("Dine-In Bill = " + total);
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double amount) {
        super(amount);
    }

    @Override
    void calculateBill() {
        double total = amount + 30; //packing charge
        System.out.println("Take-Away Bill = " + total);
    }
}

public class FoodOrderDemo {
    public static void main(String[] args) {

        FoodOrder f1 = new DineInOrder(500);
        FoodOrder f2 = new TakeAwayOrder(500);

        f1.calculateBill();
        f2.calculateBill();
    }
}