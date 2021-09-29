package crud.service;

import crud.controller.*;
import crud.dao.*;
import crud.factory.*;

public class ServiceImpl implements Service {
	
	

	@Override
	public String create(Details stud) {
		// TODO Auto-generated method stub
		
		Dao ref = DAOFactory.getDao();
		String status = ref.create(stud);
		
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
