package DSA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DsaFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DsaFrame frame = new DsaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DsaFrame() {
		setTitle("DSA IMPLEMENTATION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnArraysButton = new JButton("ARRAYS");
		btnArraysButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrayframe frame = new Arrayframe();
                frame.setVisible(true);
			}
		});
		btnArraysButton.setBounds(71, 48, 127, 53);
		contentPane.add(btnArraysButton);
		
		JButton btnLLButton = new JButton("LINKEDLIST");
		btnLLButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkedListFrame llframe = new LinkedListFrame();
				llframe.setVisible(true);
			}
		});
		btnLLButton.setBounds(254, 48, 127, 53);
		contentPane.add(btnLLButton);
		
		JButton btnStackButton = new JButton("STACK");
		btnStackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StackFrame frame = new StackFrame();
				frame.setVisible(true);
			}
		});
		btnStackButton.setBounds(71, 135, 127, 53);
		contentPane.add(btnStackButton);
		
		JButton btnQueueButton = new JButton("QUEUE");
		btnQueueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QueueFrame Qframe = new QueueFrame();
				Qframe.setVisible(true);
			}
		});
		btnQueueButton.setBounds(254, 135, 127, 53);
		contentPane.add(btnQueueButton);
		
		JLabel lblNewLabel = new JLabel("DATASTRUCTURE AND ALGORITHMS");
		lblNewLabel.setBounds(127, 11, 254, 14);
		contentPane.add(lblNewLabel);
	}
}
