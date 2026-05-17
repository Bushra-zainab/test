package looping;

public class DoFactorialWhile {

	public static void main(String[] args) {

		int number = 7;
		int fact = 1;
		int i = 1;

		do {

			fact *= i;
			i++;
		} while (i <= number);

		System.out.println("Factorial of " + number + " is : " + fact);

	}

}
