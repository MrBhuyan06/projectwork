package projectwork;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.sql.*;

public class LoginPAge extends JFrame{
	private JPanel contentpanel;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email ;
	private JTextField username;
	private JTextField mob;
	private JPasswordField psw;
	private JButton btnNewButton;
	public LoginPAge(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentpanel = new JPanel();
        contentpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentpanel);
        contentpanel.setLayout(null);
        
        
        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentpanel.add(lblNewUserRegister);
        
        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentpanel.add(lblName);
        
        
        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentpanel.add(lblNewLabel);
        
        
        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentpanel.add(lblEmailAddress);
		
        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        firstname.setBounds(214, 151, 228, 50);
        contentpanel.add(firstname);
        firstname.setColumns(10);
        
        
        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lastname.setBounds(214, 235, 228, 50);
        contentpanel.add(lastname);
        lastname.setColumns(10);
        
        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentpanel.add(email);
        email.setColumns(10);
        
        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(707, 151, 228, 50);
        contentpanel.add(username);
        username.setColumns(10);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        contentpanel.add(lblUsername);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 99, 24);
        contentpanel.add(lblPassword);
        
        
        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentpanel.add(lblMobileNumber);
        
        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(707, 320, 228, 50);
        contentpanel.add(mob);
        mob.setColumns(10);
        
        psw = new JPasswordField();
        psw.setFont(new Font("Tahoma", Font.PLAIN, 32));
        psw.setBounds(707, 235, 228, 50);
        contentpanel.add(psw);
        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
               String password = new String(psw.getPassword());
               String msg = "" + firstName;
               msg += " \n";
               if (len != 10) {
                   JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
               }
               try {
               Class.forName("com.mysql.cj.jdbc.Driver");
  		     Connection   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root","abhi4411");
  		   String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
                   password + "','" + emailId + "','" + mobileNumber + "')";
  		 Statement sta = con.createStatement();
  		 int x = sta.executeUpdate(query);
  	   if (x == 0) {
           JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
       } else {
           JOptionPane.showMessageDialog(btnNewButton,
               "Welcome, " + msg + "Your account is sucessfully created");
       }
       con.close();
               }
               catch (Exception em) {
				// TODO: handle exception
//            	   System.out.println(e);
            	   em.printStackTrace();
			}
			}
		});
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentpanel.add(btnNewButton);
	}
	
public static void main(String[] args) {
	LoginPAge obj=new LoginPAge();
	obj.setVisible(true);
}
}
