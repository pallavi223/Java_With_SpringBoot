package com.ineruon.dao;



import java.sql.SQLException;
import java.util.List;

import com.ineuron.model.Employee;

public interface EmployeeDao {

	public abstract void createEmployee(Employee employee) ;
	
	public abstract Employee getEmployeeById(Integer employeeId);
	
	public abstract void updateEmployeeEmailById(String newEmail, Integer employeeId);
	
	public abstract void deleteEmployeeById(Integer employeeId);
	
	public abstract List<Employee> getEmployeesInfo();
	
}
