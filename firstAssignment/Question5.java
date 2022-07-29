package firstAssignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String args[]) {
		  Scanner inp = new Scanner(System.in);
		   System.out.print("Enter the number- ");  
		   int n = inp.nextInt(); 
		   for(int i=0;i<n;i++) {
			   for(int j=0;j<n;j++) {
				   if(i==0 || j==0 || i==n-1 || ((i+j) <= (n-1)/2) || (i-j) >= (n-1)/2) {
					   System.out.print("*");
				   }
				   else {
					   System.out.print(" ");
				   }
			   }
			   System.out.println();
		   }
	}	
}
