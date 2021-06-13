package com.te.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStatic2 {
	public static void main(String[] args) {
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		Employee emp=new Employee();
		try {
			String dburl="jdbc:mysql://localhost:3306/employee_info";
			con=DriverManager.getConnection(dburl, "root", "root");

			String query="UPDATE EMPLOYEE SET GENDER=MALE WHERE EID IN(1,2);";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);

			while(rs.next()) {
				emp.setEmpid(rs.getInt("empid"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setDate(rs.getDate("doj"));

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(emp.empid+" "+emp.name+" "+emp.salary+" "+emp.doj);
	}
}
