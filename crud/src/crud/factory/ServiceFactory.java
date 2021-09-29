package crud.factory;

import crud.service.*;

public class ServiceFactory {
	
	private static Service service;
	
	static
	{
		service =  new ServiceImpl();
	}
	
	public static Service getService() {
		return service;
	}

}
