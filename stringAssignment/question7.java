package stringAssignment;

import java.util.Scanner;

/*WAP to count the number of Vowels and Consonants of a String value.
input : inueron
Number of vowels are :4
Number of consonants are :3*/

public class question7 {
  
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int countVowel = 0;
		int countConsonants = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'||
					str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				countVowel++;
			}
			else {
				countConsonants++;
			}
		}
		System.out.println("Number of vowels are :" + countVowel);
		System.out.println("Number of consonants are :" + countConsonants);
		
	}
	
}
