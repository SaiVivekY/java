package exp15;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a pin number to save: ");
        int savedPin = sc.nextInt();
        System.out.println("Pin saved successfully!");
        System.out.println("Pin verification system: ");
        try {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin != savedPin) {
                throw new Exception("Invalid PIN");
            }
            System.out.println("PIN Verified Successfully");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("PIN Verification Process Completed");
        }

        sc.close();
    }
}
