package DSA;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StackFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField insertField; // Text field for inputting values to push onto the stack
    private JTextArea displayArea;   // Text area to display the stack contents
    private Stacks stack;              // Instance of the Stack class

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StackFrame frame = new StackFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Create the frame
    public StackFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Initialize the stack with a size of 5
        stack = new Stacks(5);

        JLabel lblInsert = new JLabel("Insert:");
        lblInsert.setBounds(10, 10, 100, 25);
        contentPane.add(lblInsert);

        insertField = new JTextField();
        insertField.setBounds(70, 10, 100, 25);
        contentPane.add(insertField);
        insertField.setColumns(10);

        JButton pushButton = new JButton("Push");
        pushButton.setBounds(180, 10, 80, 25);
        contentPane.add(pushButton);
        pushButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int item = Integer.parseInt(insertField.getText());
                    stack.push(item); // Push the item onto the stack
                    insertField.setText(""); // Clear the input field
                    displayStack(); // Update the display area
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid integer.");
                }
            }
        });

        JButton popButton = new JButton("Pop");
        popButton.setBounds(270, 10, 80, 25);
        contentPane.add(popButton);
        popButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Integer poppedValue = stack.pop(); // Pop an item from the stack
                if (poppedValue != null) {
                    JOptionPane.showMessageDialog(null, "Popped: " + poppedValue);
                }
                displayStack(); // Update the display area
            }
        });

        JButton displayButton = new JButton("Display");
        displayButton.setBounds(360, 10, 80, 25);
        contentPane.add(displayButton);
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayStack(); // Update the display area
            }
        });

        displayArea = new JTextArea();
        displayArea.setBounds(10, 50, 400, 200);
        contentPane.add(displayArea);
    }

    // Method to display the current stack contents in the text area
    private void displayStack() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack contents:\n");
        if (stack == null) {
            sb.append("Stack is empty.");
        } else {
            for (int i = 0; i <= stack.top; i++) {
                sb.append(stack.stack[i]).append("\n"); // Access the stack's internal array directly
            }
        }
        displayArea.setText(sb.toString());
    }
}
