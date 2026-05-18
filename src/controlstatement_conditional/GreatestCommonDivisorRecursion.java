package controlstatement_conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestCommonDivisorRecursion {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter first number: ");
		int number1 = Integer.parseInt(br.readLine());

		System.out.print("Enter second number: ");
		int number2 = Integer.parseInt(br.readLine());

		int commonDivisor = getGreatestCommonDivisor(number1, number2);
		System.out.println(commonDivisor);

	}

	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) { // note: required validation prevents recursion from functioning as expected
			return -1;
		}

		if (second == 0) {
			return first;
		} else {
			return getGreatestCommonDivisor(second, first % second);
		}
	}

}
