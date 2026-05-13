package Controlstatement;

import java.util.Scanner;

public class greaterThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int firstNumber = sc.nextInt();

		System.out.println("enter second number");
		int secondNumber = sc.nextInt();

		System.out.println("enter third number");
		int thirdNumber = sc.nextInt();

		greaterThree2(firstNumber, secondNumber, thirdNumber);
		sc.close();

	}

	private static void greaterThree2(int firstNumber, int secondNumber, int thirdNumber) {

		if (firstNumber > secondNumber) {

			if (firstNumber > thirdNumber) {

				System.out.println("first number is greater");
			} else {
				System.out.println("third number is greater");
			}
		} else if (secondNumber > thirdNumber) {
			System.out.println("second number is greater");
		} else {
			System.out.println("Third number is greater");
		}

	}

}
