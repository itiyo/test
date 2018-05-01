package lessons;

public class BankAccount {
	//define variables
	String accountno;
	static String routingno = "123456";
	String name;
	String ssn;
	String accountType;
	
	
	
	//constructor
	
	BankAccount(){
		System.out.println("Account has been created.");
	}
	
	BankAccount(String accountType){
		System.out.println("New Account has been created: " + accountType);
	}
	
	BankAccount(String accountType, double deposit){
		System.out.println("New Account has been created: " + accountType);
		System.out.println(" Deposit: £" + deposit);
	}
	
	
	//define methods
	
	void deposit() {
		
	}
	void draft() {
		
	}
	void checkBalance() {
		
	}
	void checkStatus() {
		
	}

}
