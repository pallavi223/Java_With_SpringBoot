package stringAssignment;

import java.util.Scanner;

//WAP to check if the String is a pangram or not.

public class question4 {
	
	public static void main(String args[]) {
   String st = "The quick brown fox jumps over the lazy dog";
   boolean[] alpha = new boolean[26];
   int index = 0;
   int flag = 1;
   for(int i=0;i<st.length();i++) {
	   if(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
		   index = st.charAt(i)-'A';
		  
	   }
	   else if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
		   index = st.charAt(i)-'a';
	   }
	   alpha[index] = true;
   }
   
   
   for (int j = 0; j <= 25; j++) {
	      if (alpha[j] == false)
	      flag = 0;
	   }
	   System.out.print("String: " + st);
	   if (flag == 1)
	      System.out.println(" string is a pangram.");
	   else
	      System.out.println(" string is not a pangram.");
	   }
}
