package controlstatement_conditional;

import java.util.Scanner;

public class IntEqualityPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number:");
		int firstNumber = sc.nextInt();

		System.out.println("Enter second Number:");
		int secondNumber = sc.nextInt();

		System.out.println("Enter third Number:");
		int thirdNumber = sc.nextInt();

		printEqual(firstNumber, secondNumber, thirdNumber);

		sc.close();
	}

	public static void printEqual(int number1, int number2, int number3) {

		if (number1 < 0 || number2 < 0 || number3 < 0) {

			System.out.println("Invalid Value");
		} else if (number1 == number2 && number2 == number3) {
			System.out.println("All numbers are equal");
		} else if (number1 != number2 && number1 != number3 && number2 != number3) {
			System.out.println("All numbers are different");

		} else {
			System.out.println("Neither all are equal or different");
		}
	}
}
