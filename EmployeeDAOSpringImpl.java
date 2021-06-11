package com.te.DAO;

import com.te.Bean.EmployeeData;

public class EmployeeDAOSpringImpl implements EmployeeDAO {

	@Override
	public EmployeeData getSingleRecord(int id) {
		System.out.println("Spring impl");
		return null;
	}

	@Override
	public void getAllRecord() {
		System.out.println("Spring impl");
		
	}

	@Override
	public void insertRecord(EmployeeData a) {
		System.out.println("Spring impl");
		
	}

}
