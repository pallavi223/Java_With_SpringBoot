package stringAssignment;

import java.util.Scanner;

//WAP to reverse a String.

public class question1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:: ");
		String str = sc.nextLine(); //reads string    inp - iNeuron
		String newstr = "";
		
		int n = str.length();
		for(int i=0;i<n;i++) {
			char ch = str.charAt(i);
			newstr = ch+newstr;    //Add each character in in existing string
			
		}
		System.out.print(newstr);  //norueNi
		
	}
}


//################################################ Second approach using two pointer 

/*public static void reverse(String str) {
	
	//We use here two - pointer approach to get the reverse 
	int n = str.length();
	int start = 0;
	int end = n-1; 
	
	char[] st = str.toCharArray();   //this tochararray method convert string to character array
	
	while(start < end) {
		if(st[start] == ' ') {
			start++;
			continue;
		}
		else if(st[end] == ' ') {
			end--;
			continue;
		}
		else {
			//swap if not got space
			char temp = st[start];
			st[start] = st[end];
			st[end] = temp;
			start++;
			end--;
		}
	}
	
	
  System.out.print(st);
}

public static void main(String args[]) {

	//Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string::");
	//String str = sc.next();
	String str = "think";
	reverse(str);
	
}
*/