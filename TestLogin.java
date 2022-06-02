package projectwork;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class TestLogin extends JFrame implements ActionListener  {
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton button;
	Container container;
   TestLogin() {
	// TODO Auto-generated constructor stub
	   setSize(400,200);
	   setLayout(new FlowLayout());
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   l1 =new JLabel("Enter username:");
	   l1.setBounds(50, 60, 100, 30);
	   l2 =new JLabel("Enter password:");
	   l2.setBounds(50, 110, 100, 30);
	   t1 =new JTextField(20);
	   t1.setBounds(130, 60, 200, 30);
	   t2=new JPasswordField(20);
	   t2.setBounds(150, 120, 200, 30);
	   button=new JButton("Login");
	   button.setBounds(130, 550, 200, 30);
	   
	   button.addActionListener(this);
	   
	   
	   container = getContentPane();
	   container.setLayout(null);
	   container.add(l1);
       container.add(l2);
       container.add(t1);
       container.add(t2);
       container.add(button);
       
	   
	   
	  
	   
} 
   
   
public void actionPerformed(ActionEvent ae) 
   {
	 String userName = t1.getText();
     String password = t2.getText();
	   try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root","abhi4411");
	     System.out.println("Connection successfull");
	     Statement st=con.createStatement();
	     String query="select password from login where username='"+t1.getText()+"'";
//	     st.executeQuery(query);
	     ResultSet rs=st.executeQuery(query);
	     String get_password="";
	     while(rs.next()) {
	    	 get_password=rs.getString(1);
	     }
	     if(get_password.equals(t2.getPassword()) {
	    	 JOptionPane.showConfirmDialog(null,"Login sucesfulll");
	    	 
	     }
	     
	   }
	   catch (Exception e) {
		// TODO: handle exception
		   System.out.println(e);
	}
   }
   public static void main(String[] args) {
	TestLogin test=new TestLogin();
	 test.setTitle("Student Register Form");
     test.setVisible(true);
     test.setBounds(500, 100, 500, 700);
     test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     test.setResizable(true);
}
   
   
}
