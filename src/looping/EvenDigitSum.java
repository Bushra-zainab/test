package looping;

import java.util.Scanner;

public class EvenDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int number = sc.nextInt();
		int getEvenDigitSum = getEvenDigitSum(number);
		System.out.println(getEvenDigitSum);
	}

	public static int getEvenDigitSum(int number) {

		if (number < 0) {

			return -1;
		}

		int sum = 0;

		while (number > 0) {

			int digit = number % 10; // Get last digit

			// Check if the digit is even
			if (digit % 2 == 0) {
				sum += digit;
			}
		}

		return sum;
	}

}
