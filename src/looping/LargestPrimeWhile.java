package looping;

import java.util.Scanner;

public class LargestPrimeWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int number = sc.nextInt();
		int prime = getLargestPrime(number);
		System.out.println(prime);
		sc.close();

	}

	public static int getLargestPrime(int number) {
		if (number < 2) {
			return -1;
		}

		int i = 2;
		while (i < number) {
			if (number % i == 0) {
				number /= i;
				continue;
			}
			i++;
		}
		return number;
	}

}
