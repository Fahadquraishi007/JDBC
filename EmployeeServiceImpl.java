package com.te.service;

import com.te.Bean.EmployeeData;
import com.te.DAO.EmployeeDAO;
import com.te.DAO.GetDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	GetDaoImpl daoImpl=new GetDaoImpl();
	EmployeeDAO dao=daoImpl.getDaoImpl();

	@Override
	public EmployeeData getSingleRecord(int id) {
		if(id<0) {
			return null;
		}else {
			System.out.println("employee service layer");
			return dao.getSingleRecord(id);
		}
		
	}

	@Override
	public void getAllRecord() {
		System.out.println("fetching records");
		
	}

	@Override
	public void insertRecord(EmployeeData a) {
		System.out.println("insert records");
		
	}

}
