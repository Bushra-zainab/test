package looping;

public class FactorialWhile {

	public static void main(String[] args) {

		int number = 7;
		int fact = 1;

		int i = 1;

		while (i <= number) {

			fact *= i;
			i++;
		}
		
		System.out.println("Factorial of "+ number+" is : "+ fact);
	}

}
