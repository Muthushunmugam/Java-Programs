package crud.factory;
import java.sql.*;

public class ConnectionFactory {
	
	private static Connection con;
	
	static
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection()
	{
		return con;
	}

}
