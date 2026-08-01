class Restaurant {

    static int totalOrders = 0;

    // Method for dine-in order
    void calculateBill(double foodPrice) {
        totalOrders++;
        System.out.println("Dine-in Bill: Rs." + foodPrice);
    }

    // Method for takeaway order
    void calculateBill(double foodPrice, double packingCharge) {
        totalOrders++;
        System.out.println("Takeaway Bill: Rs." + (foodPrice + packingCharge));
    }

    // Method for delivery order
    void calculateBill(double foodPrice, double deliveryCharge, double tax) {
        totalOrders++;
        System.out.println("Delivery Bill: Rs." + (foodPrice + deliveryCharge + tax));
    }

    // Static method
    static void showTotalOrders() {
        System.out.println("Total Orders: " + totalOrders);
    }
}

public class restaurantbillingsystem{

    public static void main(String args[]) {

        Restaurant r = new Restaurant();

        r.calculateBill(500);              // Dine-in
        r.calculateBill(400, 50);           // Takeaway
        r.calculateBill(600, 100, 30);      // Delivery

        Restaurant.showTotalOrders();
    }
}