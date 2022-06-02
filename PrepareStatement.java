import java.sql.*;
public class PrepareStatement {
	static Connection getConnection() {
		Connection con=null;
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root","abhi4411");
		}
		catch(ClassNotFoundException | SQLException e) {
			 e.printStackTrace();
			
		}
		return con;
	}
	public static void main(String[] args) throws SQLException {
		Connection con=null;
        PreparedStatement st=null;
        ResultSet rs=null;

      try{
    	  con=getConnection();
          st=con.prepareStatement("select * from employe where name =? ");
          st.setString(1, "Abhi");
          
          rs=st.executeQuery();
          if(rs.getInt()) {
        	  System.out.println("Result not found");
          }
          else {
        	  rs.next();
        	  System.out.println("Name: "+rs.getString("name")+"\nSalary:"+rs.getLong("salary"));
          }

          while(rs.next())

              System.out.println("Name: "+rs.getString("name")+"\nSalary:"+rs.getLong("salary"));


      
      }catch(SQLException sql){
          sql.printStackTrace();
      }
      finally {
          rs.close();
          st.close();
          con.close();
      }
		
	}
	
	

}
