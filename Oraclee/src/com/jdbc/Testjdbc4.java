package com.jdbc;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import java.sql.*;
public class Testjdbc4 {
	
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Muthu123");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from emp");
		
		String data = "<html><body><center>";
		data = data + "<table border ='1' bgcolor = 'yellow'>";
		data = data + "<tr><th>Emp ID</th><th>Name</th><th>Salary</th></tr>";
		
		while(rs.next())
		{
			data = data + "<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString("Name")+"</td><td>"+rs.getInt(3)+"</td></tr>";
		}
		
		data = data + "</table></center></body></html>";
		
		/*File f1 = new File("abc.txt");
		f1.createNewFile();*/
		
		byte b[] = data.getBytes();
		FileOutputStream f = new FileOutputStream("Employee.html");
		f.write(b);
		System.out.println("Records moved from DB to HTML file");
		
	}}