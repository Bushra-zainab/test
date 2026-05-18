package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestCommonDivisor5While {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number1 = 0;
		int number2 = 0;

		try {
			System.out.print("Enter first number: ");
			number1 = Integer.parseInt(br.readLine());

			System.out.print("Enter second number: ");
			number2 = Integer.parseInt(br.readLine());

			int commonDivisor = getGreatestCommonDivisor(number1, number2);
			System.out.println(commonDivisor);

		} catch (NumberFormatException e) {
			System.out.println("Please enter valid integers.");
		} catch (IOException e) {
			System.out.println("Error reading input.");
		}

	}

	public static int getGreatestCommonDivisor(int first, int second) {
		if ((first < 10) || (second < 10)) {
			return -1;
		}

		while (first != second) {
			if (first > second) {
				first -= second;
			} else {
				second -= first;
			}
		}
		return first;
	}

}
