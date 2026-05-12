package operator;

public class LogicalOR {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		//The logical || operator does not check the second condition if the first condition is true. 
		//It checks the second condition only if the first one is false.
		
		System.out.println(a > b || a++ < c);
		System.out.println("The value of a is: " + a);
		
		System.out.println(a < b || a++ < c);   
		System.out.println("The value of a is: " + a);  

	}

}
