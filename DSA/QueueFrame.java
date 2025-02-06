package DSA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QueueFrame extends JFrame {
    private Queues queue;
    private JTextField inputField;
    private JTextArea displayArea;

    public QueueFrame() {
        queue = new Queues();
        setTitle("Queue GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblEnterNumber = new JLabel("Enter number:");
        lblEnterNumber.setBounds(10, 20, 100, 25);
        add(lblEnterNumber);

        inputField = new JTextField();
        inputField.setBounds(120, 20, 150, 25);
        add(inputField);

        JButton enqueueButton = new JButton("Enqueue");
        enqueueButton.setBounds(280, 20, 100, 25);
        add(enqueueButton);

        JButton dequeueButton = new JButton("Dequeue");
        dequeueButton.setBounds(10, 60, 100, 25);
        add(dequeueButton);

        displayArea = new JTextArea();
        displayArea.setBounds(10, 100, 350, 150);
        displayArea.setEditable(false);
        add(displayArea);

        enqueueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int data = Integer.parseInt(inputField.getText());
                queue.enqueue(data);
                inputField.setText("");
                displayArea.setText(queue.display());
            }
        });

        dequeueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                queue.dequeue();
                displayArea.setText(queue.display());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	QueueFrame app = new QueueFrame();
            app.setVisible(true);
        });
    }
}
