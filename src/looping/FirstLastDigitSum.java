package looping;

import java.util.Scanner;

public class FirstLastDigitSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int number = sc.nextInt();
		int sumFirstAndLastDigit = sumFirstAndLastDigit(number);
		System.out.println(sumFirstAndLastDigit);
	}

	public static int sumFirstAndLastDigit(int number) {

		if (number < 0) {

			return -1;
		}

		int lastDigit = number % 10;

		int firstDigit = number;

		while (firstDigit >= 10) {

			firstDigit /= 10;
		}

		return firstDigit + lastDigit;

	}

}
