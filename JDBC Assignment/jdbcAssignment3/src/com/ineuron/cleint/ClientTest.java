package com.ineuron.cleint;

import java.util.List;

import com.ineruon.dao.EmployeeDao;
import com.ineuron.dao.impl.EmployeeDaoImpl;
import com.ineuron.model.Employee;


/*Question3
perform CRUD operation using preparedStatement
1. insert 2. update 3. select 4. delete*/
public class ClientTest {


		public static void main(String args[]) {
			
			EmployeeDao employeeDao = new EmployeeDaoImpl();
		     
			Employee emp = getEmployee();
			employeeDao.createEmployee(emp);
			getEmployeeById(employeeDao);
			employeeDao.updateEmployeeEmailById("sam.cs2014@gmail.com", 4);
			employeeDao.deleteEmployeeById(4);
			getAllEmployeeInfo(employeeDao);
			
		}
		public static void getEmployeeById(EmployeeDao employeeDao) {
		
			Employee emp2 = employeeDao.getEmployeeById(3);
			if(emp2 != null) {
				System.out.println(emp2);
			}
			else {
				System.out.println("No Record Found");
			}
		}
		
     public static void getAllEmployeeInfo(EmployeeDao employeeDao) {
    	 List<Employee> empList = employeeDao.getEmployeesInfo();
    	 for(Employee emp: empList) {
    		 System.out.println(emp);
    	 }
     }
		private static Employee getEmployee() {
			Employee employee = new Employee();
		
			employee.setEmployee_id(2);
			employee.setEmployee_name("Jack");
			employee.setEmail("jack.cs@google.com");
			
			return employee;
		}
	}

