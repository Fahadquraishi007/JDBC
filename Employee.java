package com.te.jdbcdemo;

import java.io.Serializable;
import java.sql.Date;

public class Employee implements Serializable{
	int empid;
	String name;
	int salary;
	Date doj;
	
	public Employee() {
		super();
	}
	public Employee(int empid, String name, int salary, Date doj) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Date getDate() {
		return doj;
	}
	public void setDate(Date doj) {
		this.doj = doj;
	}
	
}
