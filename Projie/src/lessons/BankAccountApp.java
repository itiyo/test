package lessons;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		
		//BankAccount acc1 = new BankAccount();
		//BankAccount acc2 = new BankAccount("Saver Account");
		BankAccount acc3 = new BankAccount("Saver Account", 3000);
		BankAccount acc4 = new BankAccount();
		acc4.routingno = "12345";
		System.out.println(acc4.routingno);
				
		
	}

}
