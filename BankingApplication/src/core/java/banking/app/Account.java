package core.java.banking.app;

//this is one of the example of Encapsulation
public class Account {
      
	private int accNo;
	private  static int accountNo = 1001; //we want to automatically popluate accNo isliye first digit will be of 4no
	private String accHolderName;
	private String accHolderCity;
	private int balance;
	
	//create constructor to initialize values
	Account(String accHolderName, String accHolderCity, int balance){
		this.accNo = accountNo++;  //accNo will generate automatically hum ni dnge
		this.accHolderName = accHolderName;
		this.accHolderCity = accHolderCity;
		this.balance = balance;
			
	}
	
	//Create getters and setters to get and set values of private members

	public void setName(String accHolderName) {
		 this.accHolderName = accHolderName;
	}
	

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getAccNo() {
		return accNo;
	}


	public String getName() {
		return accHolderName;
	}
	
	public void setCity(String accHolderCity) {
	   this.accHolderCity = accHolderCity;	
	}
	
	public String getCity() {
		return accHolderCity;
	}
	
	public void setBal(int balance) {
		this.balance = balance;
	}
	public int getBal() {
		return balance;
	}
	
	
	//toString method
	@Override
	public String toString() {
		return " [accNo=" + accNo + ", accHolderName=" + accHolderName + ", accHolderCity=" + accHolderCity
				+ ", balance=" + balance + "]";
	}

	
}
