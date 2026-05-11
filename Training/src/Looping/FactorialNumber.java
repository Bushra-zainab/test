package Looping;

public class FactorialNumber {

	static int no = 6;
	static int fact = 1;

	public static void main(String[] args) {

		for (int i = 1; i <= no; i++) {

			fact = fact * i;

		}

		System.out.println(fact);
	}

}
