package lessons;

public class Test{
	public static void main(String[] args) {
		String fn = "firstname";
		String ln = "lastname";
		String SSN = "12345";
		
		String sfn = fn.substring(0, 1);
		String sln = ln.substring(0, 1);
		String SSSN = SSN.substring(0);
		
		System.out.println(fn);
		//System.out.println("there are " + SSN.length() + " digits in your SSN number");
	}
	
}