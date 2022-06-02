package projectwork;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
class DemoPage extends JFrame implements ActionListener {
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton button;
	JButton button1;
	Container container;
	public DemoPage() {
		// TODO Auto-generated constructor stub
		
//		 setSize(400,200);
//		   setLayout(new FlowLayout());
//		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		

	
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
		   
		   button1=new JButton("Reset");
		   button1.setBounds(200, 550, 200, 30);
		   button1.addActionListener(this);
		   
		   
		   container = getContentPane();
		   container.setLayout(null);
		   container.add(l1);
	       container.add(l2);
	       container.add(t1);
	       container.add(t2);
	       container.add(button);
	       container.add(button1);
	}
//	public void actionPerformed1(ActionEvent a) {
//		t1.setText("");
//		t2.setText("");
//		
//	}
	
	
	
	public void actionPerformed(ActionEvent ea) {
//		String value=t2.getPassword();
		if(ea.getSource()==button1) {
       	 t1.setText("");
    		t2.setText("");
        }
	   
		try 
		{
			 Class.forName("com.mysql.cj.jdbc.Driver");
		     Connection   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root","abhi4411");
		     System.out.println("Connection successfull");
//		     PreparedStatement st = (PreparedStatement) con
//                     .prepareStatement("Select name, password from login where username=? and password=?");
//		     st.SetString(1, userName);
////             String password;
//			st.setString(2, password);
		     Statement st=con.createStatement();
		     String query="select * from login where username='"+t1.getText()+"'";
//		     st.executeQuery(query);
		     ResultSet rs=st.executeQuery(query);
		     String userName="";
		     String pwd="";
		     String fpsw=String.valueOf(t2.getPassword());
//            
             while(rs.next()) {
            	 userName=rs.getString("username");
            	 pwd=rs.getString("password");
             }
             if(userName.equals(t1.getText()) && pwd.equals(fpsw)) {
            	 JOptionPane.showMessageDialog(button, "You have successfully logged in");
//            	 DemoPage2();
            	 DemoPage2 test1=new DemoPage2();
            	 test1.setVisible(true);
            	 test1.setTitle("Student Register Form");
//        	     test1.setVisible(true);
        	     test1.setBounds(500, 100, 500, 700);
        	     test1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	     test1.setResizable(true);
        	     DemoPage test=new DemoPage();
        	     test.setVisible(false);
        	     
             }
             
             else {
            	  JOptionPane.showMessageDialog(button1, "Wrong Username & Password");
             }
             if(ea.getSource()==button1) {
            	 t1.setText("");
         		t2.setText("");
             }
		}
		catch (Exception e) {
			// TODO: handle exception
		System.out.println(e);
		}
		finally {
			if(ea.getSource()==button1) {
           	 t1.setText("");
        		t2.setText("");
            }
		}
		
		
		
		
	   }

	 public static void main(String[] args) {
			DemoPage test=new DemoPage();
			 test.setTitle("Student Register Form");
		     test.setVisible(true);
		     test.setBounds(500, 100, 500, 700);
		     test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     test.setResizable(true);
		}
		   
		   
}
