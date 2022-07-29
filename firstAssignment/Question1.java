package firstAssignment;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String args[]) {
		 Scanner inp = new Scanner(System.in);
		   System.out.print("Enter the number- ");  
		   int n = inp.nextInt(); 
		
		for(int i=0;i<n;i++) {
			
			// I
			for(int j=0;j<n;j++) {
				if(i == 0 || i == n-1 || j == (n-1)/2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print("  ");
			
			//N 
			for(int j=0;j<n;j++) {
				if(j == 0 || j == n-1 || i==j)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.print("  ");
			
			//E 
			   for(int j=0;j<n;j++){
		            if(j==0 || i==0 || i==n-1 || i==(n-1)/2)
		             System.out.print("* ");
		            else 
						System.out.print("  ");	 
			   }  		 
			System.out.print("  ");
			
			//U
		     for(int j=0;j<n;j++){
		            if(j==0 || j==n-1|| i==n-1)
		             
		            	System.out.print("* ");
		            
		            else
		            	System.out.print("  ");
		             }
		     System.out.print("  ");
		     
		     //R
		     for(int j=0;j<n;j++){
		    	 if(j==0 && i>=0 || i==n/2 && j>=0 || i==0 && j>= 0 || j==n-1 && i<=n/2 || i>=n/2 && i==j)
		            
		            	System.out.print("* ");
		            
		            else
		            	System.out.print("  ");
		             }
		     System.out.print("  ");
		     
		     //O
		     for(int j=0;j<n;j++){
		    	 if(i==0 || j==0 || j==n-1 || i==n-1)
		            System.out.print("* ");
		            
		            else
		            	System.out.print("  ");
		             }
		     System.out.print("  ");
		     
		     //N
		 	for(int j=0;j<n;j++) {
				if(j == 0 || j == n-1 || i==j)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println("");
		     
			
		}
	}

}
