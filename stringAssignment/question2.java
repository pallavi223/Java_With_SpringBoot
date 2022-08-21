package stringAssignment;

import java.util.Scanner;


/*WAP to reverse a sentence while preserving the position.
Input : “Think Twice”
Output : “kniht eciwt”*/


public class question2 {
	
	public static void main(String args[]) {
		String s1 = "Think Twice";
		String b = "";
		
		String ch[] = s1.split(" ");
		for(int i=ch.length-1;i>=0;i--) {
			b += ch[i] + " ";
		}
		
		System.out.println(b);
	}
}
