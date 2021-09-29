package crud.dao;

import crud.controller.*;

public interface Dao {
	
	String create(Details stud);
	Details read(String roll);
	String update(Details stud);
	String Delete(String roll);
	
	

}
