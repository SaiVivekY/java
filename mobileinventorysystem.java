class Mobile {

    String brand;
    String model;
    double price;

    // Default Constructor
    Mobile() {
        brand = "Unknown";
        model = "Not Available";
        price = 0;
    }

    // Parameterized Constructor
    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    // Copy Constructor
    Mobile(Mobile mob) {
        brand = mob.brand;
        model = mob.model;
        price = mob.price;
    }

    // Method to display mobile details
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class ass2 {

    public static void main(String args[]) {

        // Default constructor
        Mobile m1 = new Mobile();

        // Parameterized constructor
        Mobile m2 = new Mobile("Oneplus", "13r", 35000);

        // Copy constructor (duplicate object)
        Mobile m3 = new Mobile(m2);

        System.out.println("Default Constructor:");
        m1.display();

        System.out.println("\nOriginal Mobile Details:");
        m2.display();

        System.out.println("\nDuplicate Mobile Details:");
        m3.display();
    }
}