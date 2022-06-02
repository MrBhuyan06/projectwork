package projectwork;


import java.awt.*;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AppInSwing extends JFrame {
	public static void main(String[] args) {
		JFrame f=new JFrame("Abhi");
		JLabel lb=new JLabel("Hello");
		JPasswordField psw =new JPasswordField();
		f.add(psw);
		psw.setBounds(100,30,100,120);
		
		
		JTextField tx=new JTextField();
		
		tx.setBounds(100, 50, 100, 120);
		tx.setText("Abhi");
		f.add(tx);
		
		tx.setForeground(Color.green);
		
		
		
//		lb.setText("hi");
//		lb.setBounds(100,50,100,30);
		f.add(lb);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,300,400);
		f.setTitle("Hello");
		f.setVisible(true);
//		Container c=f.getContentPane();
//		c.setBackground(Color.GRAY);

		f.setLayout(null);
//		f.setLayout(null);
	
	}
	


}
