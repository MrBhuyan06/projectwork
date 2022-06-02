package projectwork;

import java.awt.Container;

import javax.swing.*;

public class DemoPage2 extends JFrame{
	JButton button;
	Container container;
	public DemoPage2() {
		// TODO Auto-generated constructor stub
		button=new JButton("New page");
		   button.setBounds(130, 550, 200, 30);
		   container = getContentPane();
		   container.setLayout(null);
		   container.add(button);

	}
	public static void main(String[] args) {
		DemoPage2 test1=new DemoPage2();
		 test1.setTitle("Student Register Form");
	     test1.setVisible(true);
	     test1.setBounds(500, 100, 500, 700);
	     test1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     test1.setResizable(true);
	}

}
