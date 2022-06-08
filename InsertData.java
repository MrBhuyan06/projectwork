package dbdemoframe;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
public class InsertData extends JFrame {
    Connection con;
    PreparedStatement ps;
	private JPanel Registtration;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertData frame = new InsertData();
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
	public InsertData() {
		con=DbManager.ConnectDatabase();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 564);
		Registtration = new JPanel();
		Registtration.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Registtration);
		Registtration.setLayout(null);
		
		JPanel pane = new JPanel();
		pane.setBounds(61, 10, 665, 63);
		Registtration.add(pane);
		pane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Data Base Creation ");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 38));
		lbl1.setForeground(new Color(0, 128, 128));
		lbl1.setBounds(141, 10, 389, 43);
		pane.add(lbl1);
		
		JLabel lbl2 = new JLabel("UserId");
		lbl2.setFont(new Font("Arial", Font.BOLD, 17));
		lbl2.setBounds(102, 193, 125, 27);
		Registtration.add(lbl2);
		
		JLabel lbl3 = new JLabel("username");
		lbl3.setFont(new Font("Arial", Font.BOLD, 17));
		lbl3.setBounds(102, 263, 125, 13);
		Registtration.add(lbl3);
		
		t1 = new JTextField();
		t1.setBounds(298, 193, 187, 27);
		Registtration.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(298, 254, 187, 27);
		Registtration.add(t2);
		t2.setColumns(10);
		
		JButton btn1 = new JButton("Insert");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String q,id,s_name;
				id=t1.getText();
				s_name=t2.getText();
				q="insert into test values('"+id+"','"+s_name+"')";
				try {
					ps=con.prepareStatement(q);
					int n=ps.executeUpdate();
					if(n>0) {
						 JOptionPane.showMessageDialog(btn1, "You have successfully logged in");
					}
					else {
						JOptionPane.showMessageDialog(btn1, "Data base error");
					}
				} 
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		btn1.setFont(new Font("Arial", Font.PLAIN, 24));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(294, 402, 125, 44);
		Registtration.add(btn1);
	}
}
