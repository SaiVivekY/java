package exp16;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("You are not eligible for voting");
            }

            System.out.println("You are eligible for voting");

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}