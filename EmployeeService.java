package com.te.service;

import com.te.Bean.EmployeeData;

public interface EmployeeService {
	public EmployeeData getSingleRecord(int id);
	public void getAllRecord();
	public void insertRecord(EmployeeData a);
}
