package firstAssignment;

import java.util.Scanner;

public class Question2{
	
public static void main(String args[]){
	 Scanner inp = new Scanner(System.in);
	   System.out.print("Enter the number- ");  
	   int n = inp.nextInt(); 
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            System.out.print(i + " ");
	        }
	         System.out.println();
	    }
}
}
