package lessons;

class Person {
	
	//user
	String name;
	String email;
	String phone;
	
	//methods
	
	public void eat() {
		System.out.println(name + " is eating...");
		
	}
	public void txt() {
		System.out.println(name + " is texting...and using his email: " + email);
		
	}
	public void walk() {
		System.out.println(name + " is walking...");
		
	}
	public void talk() {
		System.out.println(name + " is talking on his number: " + phone);
		
	}
	

}

public class Demo{
	public static void main(String[] args) {
		Person user1 = new Person();
		user1.name = "Joe";
		user1.email = "joe@test.com";
		user1.phone = "0742006539";
		
		
		Person user2 = new Person();
		user2.name = "Melanie";
		user2.email = "Melanie@test.com";
		user2.phone = "0955632180";
		
		user1.eat();
		user1.txt();
		user1.walk();
		user1.talk();
		
		user2.eat();
		user2.txt();
		user2.walk();
		user2.talk();
		
	}
	
}

