package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestCommonDivisor6While {

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
		if (first < 10 || second < 10) {
			return -1;
		}

		while (second != 0) {
			int temp = second;
			second = first % second;
			first = temp;
		}
		return first;
	}

}
