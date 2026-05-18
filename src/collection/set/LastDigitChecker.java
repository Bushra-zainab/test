package collection.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LastDigitChecker {

	public static void main(String[] args) throws NumberFormatException , IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter first number: ");
		int number1 = Integer.parseInt(br.readLine());

		System.out.print("Enter second number: ");
		int number2 = Integer.parseInt(br.readLine());

		System.out.print("Enter third number: ");
		int number3 = Integer.parseInt(br.readLine());

		boolean sharedDigit = hasSameLastDigit(number1, number2, number3);
		System.out.println(sharedDigit);

	}

	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
			return false;
		}

		Set<Integer> set = new HashSet<>(Arrays.asList(num1 % 10, num2 % 10, num3 % 10));
		return set.size() != 3; // if size is 3, then no duplication
	}

	public static boolean isValid(int num) {
		return num >= 10 && num <= 1000;
	}

}
