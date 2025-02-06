package DSA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LinkedListFrame extends JFrame {
    private LinkedList list;
    private JTextField inputField;
    private JTextArea displayArea;

    public LinkedListFrame() {
        list = new LinkedList();
        setTitle("LinkedList GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblEnterNumber = new JLabel("Enter number:");
        lblEnterNumber.setBounds(10, 20, 100, 25);
        add(lblEnterNumber);

        inputField = new JTextField();
        inputField.setBounds(120, 20, 150, 25);
        add(inputField);

        JButton addButton = new JButton("Add");
        addButton.setBounds(280, 20, 80, 25);
        add(addButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(10, 60, 100, 25);
        add(deleteButton);

        displayArea = new JTextArea();
        displayArea.setBounds(10, 100, 350, 150);
        displayArea.setEditable(false);
        add(displayArea);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int data = Integer.parseInt(inputField.getText());
                list.add(data);
                inputField.setText("");
                displayArea.setText(list.display());
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int data = Integer.parseInt(inputField.getText());
                list.delete(data);
                inputField.setText("");
                displayArea.setText(list.display());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	LinkedListFrame app = new LinkedListFrame();
            app.setVisible(true);
        });
    }
}

