package com.student.manage;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import inureon.com.Student;
import inureon.com.StudentDao;

public class StartApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
   System.out.println("welcome to student mgmt app");
     
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
   while(true) {
	   System.out.println("Press 1 to add students");
	   System.out.println("Press 2 to delete students");
	   System.out.println("Press 3 to display students");
	   System.out.println("Press 4 to Update students");
	   System.out.println("Press 5 to exit app ");
	   
	   int c = Integer.parseInt(br.readLine());
	   
	   if(c == 1) {
		   //add student
		   System.out.println("Enter student id :");
		   int id = Integer.parseInt(br.readLine());
		   
		   System.out.println("Enter user name :");
		   String name = br.readLine();
		   	   
		   System.out.println("Enter user phone :");
		   String phone = br.readLine();
		   
		   System.out.println("Enter user city :");
		   String city = br.readLine();
		   
		   //create student object to store student
		   Student st = new Student(id, name, phone , city);
		   boolean ans = StudentDao.insertStudentToDB(st);
		   if(ans) {
			   System.out.println("Student added successfully...");
		   } else {
			   System.out.println("Something wnet wrong try again...");
		   }
		  
		   System.out.println(st);
		   
	   }
	   else if(c==2) {
		   //delete student
		   System.out.println("Enter user Id to delete");
		   int userId = Integer.parseInt(br.readLine());
		   
		   boolean ans = StudentDao.deleteStudent(userId);
		   if(ans) {
			   System.out.println("Student deleted successfully...");
		   }
		   else {
			   System.out.println("Something wnet wrong try again...");
		   }
	   }
	   else if(c==3) {
		   //display student.
		   StudentDao.showAllStudents();
	   }
	   
	   else if(c == 4) {
		   //update students
		   System.out.println("Enter user Id to update");
		   int userId = Integer.parseInt(br.readLine());
		   
		   System.out.println("Enter user name to update");
		   String name = br.readLine();
		   boolean ans = StudentDao.updateStudent(userId, name);
		   if(ans) {
			   System.out.println("Student updated successfully...");
		   }
		   else {
			   System.out.println("Something wnet wrong try again...");
		   }
	   }
	   else if(c==5) {
		   //exit 
		   break;
	   } else {
		   
	   }
   }
   
   System.out.println("Thank you for using my application");
   System.out.println("See you soon, Bye Bye!!");
   }

}

