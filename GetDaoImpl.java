package com.te.DAO;

public class GetDaoImpl {
	String type="jdbc";
	
	public EmployeeDAO getDaoImpl() {
		if(type.equalsIgnoreCase("jdbc")) {
			return new EmployeeDAOJDBCImpl();
		}else if(type.equalsIgnoreCase("hibernate")) {
			return new EmployeeDOAHibernateImpl();
		}else if(type.equalsIgnoreCase("spring")) {
			return new EmployeeDAOSpringImpl();
		}
		return null;
	}
}
