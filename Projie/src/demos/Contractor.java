package demos;

public class Contractor {
	public static void main(String[] args) {
		
		Comp user1 = new Comp();
		user1.setSsn("123");
		String mySsn = user1.getSsn();
		System.out.println(mySsn);
		System.out.println("");
		
		Comp user2 = new Comp();
		user2.setSsn("987");
		System.out.println(user2.getSsn());
		System.out.println("");
		user2.setRate();
		user2.increaseRate();

		
		/*
		 Comp user3 = new Comp();
		 
		user3.name = "test";
		user3.work();
		System.out.println("");
		*/
		
		
		//System.out.println(user2.getSsn());
		
		/*
		Comp user1 = new Comp();
		user1.name = "Gabbie";
		user1.email = "gabbie@msn.com";
		user1.phone = "0794569908";
		user1.ssn = "123456";
		
		
		
		
		Comp user2 = new Comp("Mal", 3900);
		user2.name = "mo";
		user2.email = "mo@msn.com";
		user2.phone = "0694569908";
		user2.ssn = "123456";
		
		
		*/
		
		//System.out.println(user2.name, 5000);
		//user2.checkbal();
	}

}
