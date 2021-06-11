package com.te.DAO;

import com.te.Bean.EmployeeData;

public class EmployeeDOAHibernateImpl implements EmployeeDAO{

	@Override
	public EmployeeData getSingleRecord(int id) {
		System.out.println("hibernate impl");
		return null;
	}

	@Override
	public void getAllRecord() {
		System.out.println("hibernate impl");
		
	}

	@Override
	public void insertRecord(EmployeeData a) {
		System.out.println("hibernate impl");
		
	}

}
