package operator;

import java.util.Scanner;

public class SharedDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();
		
		boolean sharedDigit = hasShared(number1, number2);
		System.out.println(sharedDigit);
	}

	public static boolean hasShared(int num1, int num2) {

		if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {

			return false;
		}

		for (int i = num1; i > 0; i /= 10) {

			for (int j = num2; j > 0; j /= 10) {

				if (j % 10 == i % 10) {
					return true;
				}
			}
		}
		return false;

	}
}
