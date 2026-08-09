class BankAccountDetails {
    // Final variable
    final int accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccountDetails(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance         : " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccountDetails acc = new BankAccountDetails(1001, "Sai Vivek", 25000);

        acc.displayDetails();

        // Uncommenting the next line will cause a compilation error
        // acc.accountNumber = 2002;
    }
}