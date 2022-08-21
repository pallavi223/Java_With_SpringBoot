package stringAssignment;

import java.util.Scanner;

//WAP to sort a String Alphabetically.

public class question6 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();   //bbccdefbbaa
		char charArray[] = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
					
		}
		System.out.print(charArray);    //aabbbbccdef
		
		
	}

}
