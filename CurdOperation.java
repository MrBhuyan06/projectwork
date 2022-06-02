import java.sql.*;
import java.util.Scanner;
public class CurdOperation {
	
	public static void insert() {
		//load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root","abhi4411");
				 Statement st=con.createStatement();
				 String query ="INSERT INTO employe(id,name,salary) VALUES(3,'Subham',14000)";
				 int count=st.executeUpdate(query);
				 if(count==0) {
					 System.out.println("Record is not inserted ");
				 }
				 else {
					 System.out.println("Record is inserted Succesfully");
				 }
	}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
			se.printStackTrace();
		}
		catch(Exception se)
		{
			System.out.println(se.getMessage());
			se.printStackTrace();
		}
	}
	public static void delete() {
		//load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root","abhi4411");
				 Statement st=con.createStatement();
				 String query ="DELETE  FROM employe WHERE id=3";
				 int count=st.executeUpdate(query);
				 if(count==0) {
					 System.out.println(" Delete performance is not done ");
				 }
				 else {
					 System.out.println("Delete performane done successfully");
				 }
	}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
			se.printStackTrace();
		}
		catch(Exception se)
		{
			System.out.println(se.getMessage());
			se.printStackTrace();
		}
	}
	public static void update() {
		//load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root","abhi4411");
				 Statement st=con.createStatement();
				 String query ="UPDATE employe SET salary=2000 WHERE id=2";
				 int count=st.executeUpdate(query);
				 if(count==0) {
					 System.out.println("Record Not Update ");
				 }
				 else {
					 System.out.println("Record Update Sucessfully");
				 }
	}
		catch(SQLException se)
		{
			System.out.println(se.getMessage());
			se.printStackTrace();
		}
		catch(Exception se)
		{
			System.out.println(se.getMessage());
			se.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int ch=0;
		while(ch!=4) {
			System.out.println("1.For Insert");
			System.out.println("2.For Delete");
			System.out.println("3.For update");
			System.out.println("4.Exit");
		    ch=s.nextInt();
		    switch (ch)
	          {
	         case 1:
	            insert();

	            break;
	        case 2:
	            delete();
	            break;
	        case 3:
	            update();
	            break;
	        
	        case 4:
	            System.out.println("Bye");
	            break;
	        
	        default:
	           System.out.println("Invalid input please try later");
	            break;
	        }
			
			
		}

	}

}
