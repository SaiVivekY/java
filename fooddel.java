class FoodDeliveryApp {
    String restaurant = "Pizza Hub";

    class Order {
        int orderId;
        String foodItem;
        double price;

        Order(int orderId, String foodItem, double price) {
            this.orderId = orderId;
            this.foodItem = foodItem;
            this.price = price;
        }

        void displayOrder() {
            System.out.println("Restaurant : " + restaurant);
            System.out.println("Order ID   : " + orderId);
            System.out.println("Food Item  : " + foodItem);
            System.out.println("Price      : ₹" + price);
        }
    }

    interface DeliveryStatus {
        void updateStatus();
    }

    public static void main(String[] args) {

        FoodDeliveryApp app = new FoodDeliveryApp();
        FoodDeliveryApp.Order order = app.new Order(101, "Veg Burger", 199.0);

        System.out.println("----- Order Details -----");
        order.displayOrder();
        DeliveryStatus confirmed = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status: Order Confirmed.");
            }
        };

        DeliveryStatus prepared = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status: Food is being Prepared.");
            }
        };
        DeliveryStatus outForDelivery = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status: Out for Delivery.");
            }
        };


        DeliveryStatus delivered = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Status: Delivered Successfully!");
            }
        };

        System.out.println("\n----- Delivery Updates -----");
        confirmed.updateStatus();
        prepared.updateStatus();
        outForDelivery.updateStatus();
        delivered.updateStatus();
    }
}
