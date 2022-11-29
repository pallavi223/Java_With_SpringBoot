package inureon.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	static Connection con; 
	   
	//method to create connection
	public static Connection createConn() throws SQLException {
		
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection....
			
			String url = "jdbc:mysql://localhost:3306/student_manage";
			String user = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}
