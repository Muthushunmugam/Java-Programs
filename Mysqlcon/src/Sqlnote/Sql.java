package Sqlnote;
import java.sql.*;  
class MysqlConn{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/sonoo","root","Admin@123");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select names from Album");  
while(rs.next())  
System.out.println(rs.getString(1));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  }