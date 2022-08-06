package firstProject;

import java.util.Scanner;

 
   class Guesser{
	   
	   int gNum;
	   public int guessNum(int start, int end) {
		System.out.println("Guesser!! Kindly guess a number between 1 to 100");
		Scanner sc = new Scanner(System.in);
		gNum = sc.nextInt();
		if(gNum >= start && gNum <= end) {
			return gNum;
		}
		else {
			System.out.println("Please guess a valid number within the given range");
			return guessNum(start,end);
		}
	   }
   }
   
   class Players{
	   int pNum;
	   public int predictNum(int start, int end) {
		   System.out.println("Player!! Kindly predict a numbers between 1 to 100 (you have a 2 tries):  ");
		   Scanner sc = new Scanner(System.in);
		   pNum = sc.nextInt();
		   if(pNum >= start && pNum <= end) {
			   return pNum;
		   }
		   else {
			   System.out.println("Player please predict a valid number within the given range");
			   return predictNum(start,end);
		   }
		  
	   }
   }
   
   class Umpire
   {
	   int numFromGuesser;
	   int numFromPlayer1;
	   int numFromPlayer2;
	   int numFromPlayer3;
	   
	   //method to collect a number from guesser
	   public void collectNumFromGuesser() {
		   Guesser g = new Guesser();
		   numFromGuesser = g.guessNum(1,200);
	   }
	   
	 //method to collect a number from players
	   public void collectNumFromPlayers() {
		   Players p1 = new Players();
		   Players p2 = new Players();
		   Players p3 = new Players();
		   	   
		   numFromPlayer1 = p1.predictNum(1,200);
		   numFromPlayer2 = p2.predictNum(1,200);
		   numFromPlayer3 = p3.predictNum(1,200);
		   
	   }
	   
	   //method to compare which player guessed correct
	   public void compare() 
	   {
		if(numFromGuesser == numFromPlayer1) 
		 {
			if(numFromGuesser == numFromPlayer2 && numFromGuesser ==  numFromPlayer3)
			{
				System.out.println("It's a tie!! All players guessed correctly");
			}
			else if(numFromGuesser ==  numFromPlayer2) 
			{
				System.out.println("Player1 & Player2 won the game!!!");
			}
			else if(numFromGuesser == numFromPlayer3) 
			{
				System.out.println("Player1 & Player3 won the game!!!");
			}
	   	   else 
	   	   {
	   		System.out.println("Player1 won the game!!!");
	   	   }
		}
		
		else if(numFromGuesser == numFromPlayer2) 
		{
			  if(numFromGuesser ==  numFromPlayer3) 
			  {
			
		          System.out.println("Player2 & Player3 won the game!!!");
	           }
		   else 
		   {
			      System.out.println("Player2 won the game!!!");
		    }
	   }
		
		
		else if(numFromGuesser ==  numFromPlayer3) 
		{
			System.out.println("Player3 won the game!!!");
		}
		else 
		{
			System.out.println("Game lost!! Try Again");
		 }
	   }
   }    
   