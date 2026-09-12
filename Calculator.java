package exp18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField num1, num2, result;
    JButton add, subtract;

    Calculator() {
        setTitle("Simple Calculator");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Enter Number 1:"));
        num1 = new JTextField();
        add(num1);

        add(new JLabel("Enter Number 2:"));
        num2 = new JTextField();
        add(num2);

        add = new JButton("Add");
        subtract = new JButton("Subtract");

        add(add);
        add(subtract);

        add(new JLabel("Result:"));
        result = new JTextField();
        result.setEditable(false);
        add(result);

        add.addActionListener(this);
        subtract.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double n1 = Double.parseDouble(num1.getText());
        double n2 = Double.parseDouble(num2.getText());

        if (e.getSource() == add) {
            result.setText(String.valueOf(n1 + n2));
        } 
        else if (e.getSource() == subtract) {
            result.setText(String.valueOf(n1 - n2));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}