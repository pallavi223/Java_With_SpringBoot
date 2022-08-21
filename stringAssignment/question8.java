package stringAssignment;

import java.util.Scanner;

//WAP to count number of special characters.
public class question8 {

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		char[] chrArray = str.toCharArray();
		int specCount = 0;
		int upperCount=0;
		int lowerCount = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if( ch >= 'A' &&  ch <= 'Z') {
				upperCount++;
			}
			else if( ch >= 'a' &&  ch <= 'z') {
				lowerCount++;
			}
			else if( ch >= '0' &&  ch <= '9') {
				lowerCount++;
			}
			else {
				specCount++;
			}
		}
		
		System.out.println(specCount);
	}
}

