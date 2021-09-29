package crud.dao;

import crud.controller.*;
import crud.factory.*;
import crud.service.*;

import java.sql.*;

public class DaoImpl implements Dao {

	@Override
	public String create(Details stud) {
		// TODO Auto-generated method stub
		
		Connection con = ConnectionFactory.getConnection();
		String status = null;
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from cit where id = '"+stud.getsId()+"'");
			boolean ref = rs.next();
			
			if(ref == true)
			{
				status = "Record "+stud.getsId()+" already exists !";
			}
			else
			{
				int row = st.executeUpdate("insert into cit values('"+stud.getsId()+"','"+stud.getsName()+"','"+stud.getsDept()+"')");
				if(row>0) {
					status = "Insertion Successfull";
				}
				else {
					status = "Insertion Fail";
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}

	@Override
	public Details read(String roll) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String update(Details stud) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Delete(String roll) {
		// TODO Auto-generated method stub
		return null;
	}

}
