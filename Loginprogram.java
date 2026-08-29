package exp15;

import java.util.Scanner;

public class Loginprogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            System.out.print("Re-enter Password: ");
            String confirmPassword = sc.nextLine();

            if (!password.equals(confirmPassword)) {
                throw new Exception("Passwords do not match");
            }

            System.out.println("Login Successful");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Login Process Completed");
        }

        sc.close();
    }
}