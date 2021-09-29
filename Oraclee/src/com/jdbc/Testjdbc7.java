package com.jdbc;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class Testjdbc7 {
	
	static Statement st;
	static ResultSet rs;
	static Connection con;
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		
        int rows;
		
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
		st = con.createStatement();
		rs = st.executeQuery("select * from mobile");
		
		String data = "<html><body><center>";
		data = data + "<table border ='1' bgcolor = 'cyan'>";
		data = data + "<tr><th>No</th><th>Brand</th><th>Model</th></tr>";
		
		while(rs.next())
		{
			data = data + "<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString("Brand")+"</td><td>"+rs.getString("Model")+"</td></tr>";
		}
		
		data = data + "</table></center></body></html>";
		
		/*File f1 = new File("abc.txt");
		f1.createNewFile();*/
		
		byte b[] = data.getBytes();
		FileOutputStream f = new FileOutputStream("Mobiles.html");
		f.write(b);
		System.out.println("Records moved from DB to HTML file");
		
		
		
		// TODO Auto-generated method stub

	}

}
