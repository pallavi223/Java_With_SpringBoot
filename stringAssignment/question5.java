package stringAssignment;

import java.util.Scanner;

//WAP to print repeatedly occurring characters in the given String.

public class question5 {

	
	   static  int ASCII_SIZE = 256; 
	    static char repeatOccuringChar(String str) 
	    { 
	        // Create array to keep the count of individual 
	        // characters and initialize the array as 0 
	        int count[] = new int[ASCII_SIZE]; 
	       
	      
	        int len = str.length(); 
	        for (int i=0; i<len; i++) 
	            count[str.charAt(i)]++; 
	       
	        int max = -1;  // Initialize max count 
	        char ans = ' ';   // Initialize result 
	       
	        // Traversing through the string and maintain
	        // the count of each character 
	        for (int i = 0; i < len; i++) { 
	            if (max < count[str.charAt(i)]) { 
	                max = count[str.charAt(i)]; 
	                ans = str.charAt(i); 
	            } 
	        } 
	       
	        return ans; 
	    } 
	 
	 public static void main(String[] args) {
	  String str = "testttt";
	  System.out.println("The given string is: " + str);
	  System.out.println("Max occurring character in the given string is: " + repeatOccuringChar(str));
	 }
	

}