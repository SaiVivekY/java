package exp14;
import java.util.Scanner;

 public class q1 {
    public static void main(String[] args) {
        int balance = 5000;

        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("Enter withdrawal amount: ");
                int amount = sc.nextInt();

                if (amount <= 0) {
                    throw new Exception("Invalid withdrawal amount!");
                }

                if (amount > balance) {
                    throw new Exception("Insufficient balance!");
                }

                balance = balance - amount;

                System.out.println("Withdrawal successful!");
                System.out.println("Remaining balance: " + balance);
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

