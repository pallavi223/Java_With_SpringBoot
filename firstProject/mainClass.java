package firstProject;

public class mainClass {
	    final static int tries = 2;
		   public static void main(String args[]) {
			   
              Umpire u = new Umpire();
			   u.collectNumFromGuesser();
			  
			   //this will gave each player 2 attempts to guess the right number
			   for(int i=1;i<=tries;i++) {
				   u.collectNumFromPlayers();
				   u.compare();
				  
			   }
			  
			   }
			 
		   }


//Still more modifications is required in this code, need your valuable comments & suggestions for improvement