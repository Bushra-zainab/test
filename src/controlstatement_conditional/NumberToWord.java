package controlstatement_conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberToWord {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter first number: ");
		int number = Integer.parseInt(br.readLine());

		numberToWords(number);

	}

	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}
		int reversedNumber = reverse(number);
		int numDigitCount = getDigitCount(number);

		while (numDigitCount > 0) {
			switch (reversedNumber % 10) {
			case 0:
				System.out.println("Zero");
			case 1:
				System.out.println("One");
			case 2:
				System.out.println("Two");
			case 3:
				System.out.println("Three");
			case 4:
				System.out.println("Four");
			case 5:
				System.out.println("Five");
			case 6:
				System.out.println("Six");
			case 7:
				System.out.println("Seven");
			case 8:
				System.out.println("Eight");
			case 9:
				System.out.println("Nine");
			}
			reversedNumber /= 10;
			numDigitCount--;
		}
	}

	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		int count = 0;
		do {
			count++;
			number /= 10;
		} while (number > 0);
		return count;
	}
}
