package com.ineuron.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ineruon.dao.EmployeeDao;
import com.ineuron.model.Employee;
import com.ineuron.util.DBUtil;

public  class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void createEmployee(Employee employee)  {
		String query = "insert into employee2(employee_name, email) values(?,?)";
		
		Connection con = null;
	
		try {
			con = DBUtil.getConn();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, employee.getEmployee_name());
			pstmt.setString(2, employee.getEmail());
			
			pstmt.executeUpdate();
			System.out.println("Record is added");
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
	Employee employee = null;
		String SQL = "SELECT *FROM employee2 WHERE employee_id=?";
		try {
		Connection connection = DBUtil.getConn();
		PreparedStatement ps = connection.prepareStatement(SQL); 
			
			ps.setInt(1, employeeId);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int empId = rs.getInt("employee_id");
				String eName = rs.getString("employee_name");
				String email = rs.getString("email");
			
				
				employee = new Employee();
				employee.setEmployee_name(eName);	
				employee.setEmail(email);
				employee.setEmployee_id(empId);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return employee;
	}
	@Override
	public void updateEmployeeEmailById(String newEmail, Integer employeeId) {
		
		String sql = "Update employee2 set email = ? where employee_id=?";
		
		try {
			Connection con = DBUtil.getConn();
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, newEmail);
			pstmt.setInt(2, employeeId);
			
			int exceUpdate = pstmt.executeUpdate();
			if(exceUpdate == 1){
				System.out.println("Employee email is updated..");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		String SQL = "DELETE FROM employee2 WHERE employee_id=?;";
		try {
		Connection connection = DBUtil.getConn();
		PreparedStatement ps = connection.prepareStatement(SQL) ;
			
			ps.setInt(1,employeeId);
			
			int executeUpdate = ps.executeUpdate();
			
			if(executeUpdate ==1){
				System.out.println("Employee is deleted with ID::"+employeeId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> getEmployeesInfo() {
		
	List<Employee> empList = new ArrayList<>();
	String sql = "SELECT *FROM employee2";
	
	try {
		Connection con = DBUtil.getConn();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int eId = rs.getInt("employee_id");
			String ename = rs.getString("employee_name");
			String email = rs.getString("email");
			
			Employee emp = new Employee();
			emp.setEmployee_name(ename);
			emp.setEmail(email);
			
			empList.add(emp);
			
		}
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	return empList;
	}
	
	
}


