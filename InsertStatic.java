package com.te.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatic {
	public static void main(String[] args) {
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//create connection
		
		try {
			String dburl="jdbc:mysql://localhost:3306/employee_info";
			con=DriverManager.getConnection(dburl, "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			String query="insert into employeedata values(1,'Mohan',23000,'2019/09/21');";
			stmt=con.createStatement();
			int n=stmt.executeUpdate(query);
			System.out.println(n+" no of row affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
