package com.te.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.te.Bean.EmployeeData;

public class EmployeeDAOJDBCImpl implements EmployeeDAO{

	@Override
	public EmployeeData getSingleRecord(int id) {
		EmployeeData empdata=new EmployeeData();
		try {
			String dburl="jdbc:mysql://localhost:3306/employee_info";
			Connection con=DriverManager.getConnection(dburl,"root","root");
			Statement stmt=con.createStatement();
			String query="select * from employeedata where empid="+id;;
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				empdata.setEmpid(rs.getInt("empid"));
				empdata.setName(rs.getString("name"));
				empdata.setSalary(rs.getInt("salary"));
				empdata.setDoj(rs.getDate("doj"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return empdata;
		
	}

	@Override
	public void getAllRecord() {
		System.out.println("getting all record");
		
	}

	@Override
	public void insertRecord(EmployeeData a) {
		System.out.println("inserting record");
		
	}

}
