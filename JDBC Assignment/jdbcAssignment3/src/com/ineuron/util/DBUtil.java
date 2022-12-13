package com.ineuron.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static Connection con = null;
	public static Connection getConn() throws SQLException {

	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		//create the connection 
		String url = "jdbc:mysql://localhost:3306/students";
		String user = "root";
		String password = "root";
		
		con = DriverManager.getConnection(url, user, password);
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
	return con;
	}
}
