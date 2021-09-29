package Sqlnote;
import java.sql.Connection;
import java.sql.DriverManager;

public class JavaMysqlTest {
public static void main(String[] args) throws Exception {
String url="jdbc:mysql://localhost:3306/sonoo";
String username = "root";
   String password = "Admin@123";
   
   Connection con = DriverManager.getConnection(url, username, password);
   if (con == null) {
        System.out.println("JDBC connection is not established");
        return;
     } else
        System.out.println("Congratulations," +
             " JDBC connection is established successfully.\n");

     
     con.close();
	
	
	
		}
	}


