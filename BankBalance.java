package exp18;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankBalance extends JFrame implements ActionListener {

    JTextField initialBalance, transactionAmount, balance;
    JButton deposit, withdraw;

    BankBalance() {
        setTitle("Bank Balance Calculator");
        setSize(450, 300);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Initial Balance:"));
        initialBalance = new JTextField();
        add(initialBalance);

        add(new JLabel("Transaction Amount:"));
        transactionAmount = new JTextField();
        add(transactionAmount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");

        add(deposit);
        add(withdraw);

        add(new JLabel("Updated Balance:"));
        balance = new JTextField();
        balance.setEditable(false);
        add(balance);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double currentBalance =
                Double.parseDouble(initialBalance.getText());

        double amount =
                Double.parseDouble(transactionAmount.getText());

        if (e.getSource() == deposit) {
            currentBalance = currentBalance + amount;
        }
        else if (e.getSource() == withdraw) {
            currentBalance = currentBalance - amount;
        }

        balance.setText(String.valueOf(currentBalance));
        initialBalance.setText(String.valueOf(currentBalance));
    }

    public static void main(String[] args) {
        new BankBalance();
    }
}
