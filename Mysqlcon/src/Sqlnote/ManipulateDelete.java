package Sqlnote;
import java.sql.*;

public class ManipulateDelete {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/sonoo";
	static final String USER = "root";
	static final String PASS = "Admin@123";
	static final String QUERY = "SELECT * FROM Record";
	
	public static void main(String[]args) {
		
		
		 try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		         String sql = "DELETE FROM Record " +
		            "WHERE id = 2";
		         stmt.executeUpdate(sql);
		         ResultSet rs = stmt.executeQuery(QUERY);
		         while(rs.next())
		            //Display values
		            System.out.println("ID: " + rs.getInt(1)+" Name: " + rs.getString(2)+"; Shift: " + rs.getString(3));
		            conn.close();
		      } catch (Exception e) {
		         System.out.println(e);
		      } 
		}
	

}