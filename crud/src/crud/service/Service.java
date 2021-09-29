package crud.service;

import crud.controller.*;

public interface Service {
	
	String create(Details stud);
	Details read(String roll);
	String update(Details stud);
	String Delete(String roll);
	

}
