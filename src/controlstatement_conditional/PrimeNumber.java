package controlstatement_conditional;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		int temp = 0;

		for (int i = 2; i <= number - 1; i++) {

			if (number % i == 0) {

				temp += 1;
			}

		}
		if (temp == 0) {

			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

		sc.close();
	}

}
