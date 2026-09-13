package exp17;

import javax.swing.*;
import java.awt.*;

public class StudentRegistrationForm {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JLabel rollLabel = new JLabel("Roll Number:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel branchLabel = new JLabel("Branch:");

        JTextField nameField = new JTextField();
        JTextField rollField = new JTextField();
        JTextField emailField = new JTextField();

        JComboBox<String> branchBox = new JComboBox<>(
                new String[]{"CSE", "ECE", "Mechanical", "Civil", "AI & ML"}
        );

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(rollLabel);
        frame.add(rollField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(branchLabel);
        frame.add(branchBox);

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}