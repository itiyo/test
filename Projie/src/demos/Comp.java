package demos;

public class Comp implements IRate{
	
	private String ssn;
	private String name;
	private String email;
	private String phone;
	private double deposit = 0;
	private double balance = 0;
	
	
	


	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = "SSN number is: " + ssn + "000";
	}

	// build a constructor
	Comp(){
		System.out.println("New User account has been created!");
	}
	
	Comp(String dept){
		System.out.println("New User account has been created in the " + dept + " department");
	}
	
	Comp(String name, double deposit)
	{
		String msg;
		
		if (deposit < 1000) 
		{
			msg = "Deposit must exceed �3000";
		}
		else 
		{
			msg = "Thank you Mr " + name + " for your �" + deposit + " deposit";			
		}
		
		System.out.println(msg);
		balance += deposit;
	}
	
	/*
	public void setRate() {
		System.out.println("Setting rate 1st");
	}
	public void increaseRate() {
		System.out.println("Increasing rate 1st");
	}
	*/
	
	
	 


	
	
	
	void work() {
		System.out.println(name + " is working with this \nemail: " + email);
	}
	void eat() {
		System.out.println(name + " is eating!!");
	}
	void meet() {
		System.out.println(name + " is in a meeting!!");
	}
	void checkbal() {
		//balance += deposit;
		System.out.println("Your current balance is � " + balance );
	}

	@Override
	public void setRate() {
		System.out.println("Setting rate .............");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Setting rate ................");
		
	}

	

}
