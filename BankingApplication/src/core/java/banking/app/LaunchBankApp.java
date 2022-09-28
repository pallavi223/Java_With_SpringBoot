package core.java.banking.app;

import java.util.ArrayList;
import java.util.Scanner;

public class LaunchBankApp {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String name, city;
		int accNum, amount;
		
		//create arrayList to add some account in our app
		ArrayList<Account> list = new ArrayList<>();
		//now add accounts to the arraylist
		list.add(new Account("Pallavi Singh", "Lucknow", 3000));     //directly anonymous object ko call krdia
		list.add(new Account("Jatin singh", "Jaipur", 6000));
		list.add(new Account( "Shubhangi", "Pune", 8000));
		
       System.out.println("Select Operations...");
       System.out.println("1. Open Account.. ");
       System.out.println("2. Deposit Money.. ");
       System.out.println("3. Withdraw Money.. ");
       System.out.println("4. Balance Enquiry.. ");
       System.out.println("5. List All.. ");
       System.out.println("6. Exit.. ");
       
       
       Scanner sc = new Scanner(System.in);
       int choice;
       boolean found;
       do {
       System.out.println("Enter your choice here");
         choice = sc.nextInt();
        switch(choice) {
		        case 1:  	  
	                  System.out.println("------Account Open------");
	                  //to open account we need customer name, city, balance
	                  System.out.println("Enter your name ");
	                  name = sc.next();
	                  System.out.println("Enter your city ");
	                  city = sc.next();
	                  System.out.print("Enter amount ");
	                  amount = sc.nextInt();  
	                  //ab is account class ko open krne k liye hme uska object banan pdega 
	                   
	                  Account acount = new Account(name, city, amount);
	                  list.add(acount);
	                  System.out.println("Account Opened!!!  ");
		        	  break;
		        	
		        case 2:
		        	System.out.println("-------Account deposit-----");
		        	//deposit krne k liye we need account no
		        	System.out.print("Enter account number ");
		        	found = false;
		        	accNum = sc.nextInt();
		        	   //check if user enter acc no is equal to its stored accNo
		        	    for(Account ac: list) {
		        	    	if(accNum == ac.getAccNo()) {
		        	    		found = true;
		        	    		System.out.println("Customer name: "+ ac.getName());
		        	    		System.out.println("Customer city: " + ac.getCity());
		        	    		System.out.println("Customer account balance: " + ac.getBal());
		        	    		
		        	    		System.out.println("Enter amount to deposit..");
		        	    		amount = sc.nextInt();
		        	    		ac.setBal(ac.getBal() + amount); 
		        	    		System.out.println("Deposit successfully... !!");
		        	    		break;
		        	    	}
		        	    }
		        	    if(!found) {
		        	    	System.out.println("Invalid Account No... ");
		        	    }
		        	
		        	break;
		        	
		        case 3:
		        	 System.out.println("------Withdraw Money ----");
		        	 System.out.print("Enter account number ");
		        	 found = false;
			        	accNum = sc.nextInt();
			        	   //check if user enter acc no is equal to its stored accNo
			        	    for(Account ac: list) {
			        	    	if(accNum == ac.getAccNo()) {
			        	    		found = true;
			        	    		System.out.println("Customer name: "+ ac.getName());
			        	    		System.out.println("Customer city: " + ac.getCity());
			        	    		System.out.println("Customer account balance: " + ac.getBal());
			        	    		
			        	    		System.out.println("Enter amount to withdraw..");
			        	    		amount = sc.nextInt();
			        	    		if(amount <= ac.getBal()) {
			        	    		ac.setBal(ac.getBal() - amount); 
			        	    		System.out.println("Withdraw successfully... !!");
			        	    		}
			        	    		else {
			        	    			System.out.println("Insufficient Balance!!   ");
			        	    		}
			        	    		break;
			        	    	}
			        	    }
			        	    if(!found) {
			        	    	System.out.println("Invalid Account No... ");
			        	    }
		        	 break;
		        	 
		        case 4:
		        	 System.out.println("-------Balance Enquiry-----");
		        	 System.out.print("Enter account number ");
		        	 found = false;
			        	accNum = sc.nextInt();
			        	   //check if user enter acc no is equal to its stored accNo
			        	    for(Account ac: list) {
			        	    	if(accNum == ac.getAccNo()) {
			        	    		found = true;
			        	    		System.out.println("Customer name: "+ ac.getName());
			        	    		System.out.println("Customer city: " + ac.getCity());
			        	    		System.out.println("Customer account balance: " + ac.getBal());
			        	    		break;
			        	    	}
			        	    }
			        	    if(!found) {
			        	    	System.out.println("Invalid Account No... ");
			        	    }
		        	 break;
		        	 
		        case 5:
		        	 System.out.println("------List All-----");
		        	 for(Account ac: list) {
		        		 System.out.println(ac);
		        	 }
		        	
		        	 break;
		        	  
		        case 6:
		        	 System.out.println("Thanks for visiting us!!!!"); 
		        	 break;
		        	 
		        default:
		        	System.out.println("Invalid choice !!!");
		        	break;     					
	        }       
	} while(choice != 6);

}
}
