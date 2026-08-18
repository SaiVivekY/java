package exp14;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new Exception("Invalid quantity! Quantity must be greater than zero.");
            }

            sc.nextLine();
            System.out.print("Enter the product name: ");
            String productName = sc.nextLine();

            System.out.print("Enter product price: ");
            double productPrice = sc.nextDouble();

            System.out.println("\nOrder Details:");
            System.out.println("Product quantity: " + quantity);
            System.out.println("Product name: " + productName);
            System.out.println("Product price: " + productPrice);
            System.out.println("Total cost: " + (quantity * productPrice));
            System.out.println("Order placed successfully!");

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

