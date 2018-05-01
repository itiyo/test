package lessons;

public class People {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking and using\n" + phone + " number");
	}
	void eat() {
		System.out.println(name + " is eating and using\n" + email + " email aadress");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}
