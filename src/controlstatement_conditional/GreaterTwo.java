package Controlstatement;

import java.util.Scanner;

public class GreaterTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int firstNumber = sc.nextInt();

		System.out.println("enter second number");
		int secondNumber = sc.nextInt();

		greaterTwo(firstNumber, secondNumber);
		sc.close();
	}

	private static void greaterTwo(int firstNumber, int secondNumber) {

		if (firstNumber > secondNumber) {

			System.out.println("first number is greater");
		} else {
			System.out.println("second number is greater");
		}

	}

}
