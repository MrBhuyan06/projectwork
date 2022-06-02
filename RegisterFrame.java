package projectwork;

import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame {
	JLabel message;
    JLabel nameLabel, dobLabel, genderLabel, dobFormat;
    JTextField nameField;
    JTextField dobField;
    JRadioButton genderMale, genderFemale;
    ButtonGroup genderGroup;
    JButton registerButton;
    Container container;

    public RegisterFrame() {
    	 message = new JLabel("Register a new Student");
         message.setFont(new Font("Courier", Font.BOLD, 20));
         nameLabel = new JLabel("Name");
         nameField = new JTextField();
         dobField = new JTextField();
  
         dobLabel = new JLabel("DOB");
         dobField = new JTextField();
  
         genderLabel = new JLabel("Gender");
         genderMale = new JRadioButton("Male", true);
         genderFemale = new JRadioButton("Female");
         genderGroup = new ButtonGroup();
         genderGroup.add(genderMale);
         genderGroup.add(genderFemale);
        
         registerButton = new JButton("Register");
         container = getContentPane();
         container.setLayout(null);
         setBounds();
         addComponents();
 
    }
 
    public void setBounds() {
    	message.setBounds(50, 10, 600, 30);
        nameLabel.setBounds(50, 60, 100, 30);
        nameField.setBounds(130, 60, 200, 30);
        dobField.setBounds(130, 60, 200, 30);
 
        dobLabel.setBounds(50, 110, 100, 30);
 
        genderLabel.setBounds(50, 160, 100, 30);
        genderMale.setBounds(130, 160, 100, 30);
        genderFemale.setBounds(240, 160, 100, 30);

        registerButton.setBounds(130, 550, 200, 30);
    }
 
    public void addComponents() {
    	 container.add(message);
         container.add(nameLabel);
         container.add(nameField);
         container.add(dobField);
         container.add(dobLabel);
         container.add(genderLabel);
         container.add(genderMale);
         container.add(genderFemale);
         container.add(registerButton);
 
    }
 
    
    
 
    public static void main(String[] args) {
        RegisterFrame frame = new RegisterFrame();
        frame.setTitle("Student Register Form");
        frame.setVisible(true);
        frame.setBounds(500, 100, 500, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
 
    }
 
}