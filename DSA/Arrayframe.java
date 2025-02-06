package DSA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arrayframe extends JFrame {
    private JPanel contentPane; // Main panel of the frame
    private JTextField insertField, deleteField; // Input fields
    private JTextArea displayArea; // Area to display array contents
    private Array array1; // Instance of ArrayManager

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Arrayframe frame = new Arrayframe();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Arrayframe() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        array1 = new Array(5); // Create an array manager with size 5

        JLabel lblInsert = new JLabel("Insert:");
        lblInsert.setBounds(10, 10, 100, 25);
        contentPane.add(lblInsert);

        insertField = new JTextField();
        insertField.setBounds(70, 10, 100, 25);
        contentPane.add(insertField);

        JButton insertButton = new JButton("Insert");
        insertButton.setBounds(180, 10, 80, 25);
        contentPane.add(insertButton);
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int item = Integer.parseInt(insertField.getText()); // Get input
                    array1.insert(item); // Insert into array
                    insertField.setText(""); // Clear the input field
                    displayArray(); // Update display
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
                }
            }
        });

        JLabel lblDelete = new JLabel("Delete Index:");
        lblDelete.setBounds(10, 50, 100, 25);
        contentPane.add(lblDelete);

        deleteField = new JTextField();
        deleteField.setBounds(100, 50, 50, 25);
        contentPane.add(deleteField);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(160, 50, 80, 25);
        contentPane.add(deleteButton);
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int index = Integer.parseInt(deleteField.getText()); // Get index
                    array1.delete(index); // Delete from array
                    deleteField.setText(""); // Clear the input field
                    displayArray(); // Update display
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid index.");
                }
            }
        });

        displayArea = new JTextArea();
        displayArea.setBounds(10, 90, 400, 160);
        contentPane.add(displayArea);
    }

    // Method to display the current array contents in the text area
    private void displayArray() {
        displayArea.setText(array1.display()); // Update the display area
    }
}
