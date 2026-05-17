package looping;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int rem, rev = 0;
		int originalNumber = number;

		while (number != 0) {

			rem = number % 10;
			rev = rev * 10 + rem;
			number /= 10;
		}

		if (originalNumber == rev) {

			System.out.println(originalNumber + " is palindrome number");
		} else {

			System.out.println(originalNumber + " is not palindrome number");
		}

	}

}
