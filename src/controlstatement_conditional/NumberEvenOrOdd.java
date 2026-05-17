package controlstatement_conditional;

import java.util.Scanner;

public class NumberEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int Number = sc.nextInt();

		evenOrOdd(Number);

	}

	private static void evenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}

	}

}
