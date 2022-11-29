package inureon.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {

	
	public static boolean insertStudentToDB(Student st) {
		
		boolean f= false;
		//jdbc code..
		try {
			Connection con = ConnectionProvider.createConn();
			
			//fire sql query
			String query = "insert into students(sid, sname, sphone, scity) values (?,?,?,?)";
            
			//we are firing dynamic query -> use prepared statement
			 PreparedStatement pstmt = con.prepareStatement(query);
			 //set the values of parameters
			 pstmt.setInt(1,st.getsId());
			 pstmt.setString(2, st.getsName());
			 pstmt.setString(3, st.getsPhone());
			 pstmt.setString(4, st.getsCity());
			 
			 //execute query -> student details sent to database
			 pstmt.executeUpdate();
			 f = true;
		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return f;
	}

	
	public static boolean deleteStudent(int userId) {
		
		boolean f= false;
		//jdbc code..
		try {
			Connection con = ConnectionProvider.createConn();
			
			//fire sql query
			String query = "delete from students where sid=?";
            
			//we are firing dynamic query -> use prepared statement
			 PreparedStatement pstmt = con.prepareStatement(query);
			 //set the values of parameters
			 pstmt.setInt(1,userId);

			 
			 //execute query -> student details sent to database
			 pstmt.executeUpdate();
			 f = true;
		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return f;
	}
	
	public static void showAllStudents() {
		
		
		//jdbc code..
		try {
			Connection con = ConnectionProvider.createConn();
			
			//fire sql query
			String query = "select * from students";
            
			Statement stmt = con.createStatement(); 
			 ResultSet set = stmt.executeQuery(query);
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
			
              System.out.println("ID : "+id);
              System.out.println("Name : "+name);
              System.out.println("Phone : "+phone);
              System.out.println("City : "+city);
              System.out.println("----------------------------------------");
       
			}
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
	
	}


	public static boolean updateStudent(int userId, String name) {
		boolean f = false;
		
		try {
			Connection con = ConnectionProvider.createConn();
			
			String query = "update students set sname=? where sid = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, userId);
			
			pstmt.executeUpdate();
			f = true;
		}
		 catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		return f;
		
	}
	

	}

