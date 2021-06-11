package com.te.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcSample {
	public static void main(String[] args) {
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		
		//load and register the driver
		
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//connection via driver
		
		try {
			String dburl="jdbc:mysql://localhost:3306/employee_info?user=root&password=root";
			con=DriverManager.getConnection(dburl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//issue sql queries via connection
		
		
		try {
			String query="select * from employee;" ;
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//get resultset and fetch data using resultset
		try {
			while(rs.next()) {
				System.out.println(rs.getInt("eid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 {
				try {
					if(con!=null)
					con.close();
					if(stmt!=null) {
						stmt.close();
					}
					if(rs!=null) {
						rs.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//close all the resources
	}
}
