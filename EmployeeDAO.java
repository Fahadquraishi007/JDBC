package com.te.DAO;

import com.te.Bean.EmployeeData;

public interface EmployeeDAO {
	public EmployeeData getSingleRecord(int id);
	public void getAllRecord();
	public void insertRecord(EmployeeData a);
}
