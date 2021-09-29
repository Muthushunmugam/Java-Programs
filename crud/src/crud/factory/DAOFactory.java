package crud.factory;

import crud.dao.*;
import crud.service.Service;

public class DAOFactory {
	
	private static Dao dao;
	
	static
	{
		dao = new DaoImpl();
	}
	
	public static Dao getDao() {
		return dao;
	}

}
