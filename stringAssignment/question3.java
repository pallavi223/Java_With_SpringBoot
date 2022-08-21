package stringAssignment;

import java.util.Arrays;
import java.util.Scanner;

/*WAP to check if the String is Anagram or not.
An anagram of a string is another string that contains the same characters, 
only the order of characters can be different. For example, “silent” and “listen” are an anagram of each other.*/

public class question3 {
	
	public static  boolean isAnagram(char[] strArray1, char[] strArray2) {
	
		int n1 = strArray1.length;
		int n2 = strArray2.length;
			// If length of both strings is not same,
		   // then they cannot be anagram
				if(n1 != n2) {
					return false;
				}
				
				Arrays.sort(strArray1);
				Arrays.sort(strArray2);
				
				for(int i=0;i<n1;i++) 
				 if(strArray1[i] != strArray2[i]) 
					return false;
				 
				 return true;
				
				
}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str1 = sc.nextLine();  
		String str2 = sc.nextLine(); 
		char[] strArray1 = str1.toCharArray();
		char[] strArray2 = str2.toCharArray();
		if(isAnagram(strArray1,strArray2)) {
		System.out.println(" String are anagram");
		}
		else {
			System.out.print("String are not anagram");
		}
		
	}
}
