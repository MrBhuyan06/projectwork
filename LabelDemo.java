package sWINGeXAMPLE;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LabelDemo extends JFrame {

	private JPanel contentPane;
	private JTextField TxtMsg;
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabelDemo frame = new LabelDemo();
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
	public LabelDemo() {
		setTitle("Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 34, 71, 36);
		contentPane.add(lblNewLabel);
		
		TxtMsg = new JTextField();
		TxtMsg.setBounds(162, 45, 96, 19);
		contentPane.add(TxtMsg);
		TxtMsg.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(135, 45, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(76, 138, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(252, 138, 85, 21);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(48, 70, 45, 13);
		contentPane.add(lblNewLabel_1);
	}
}
