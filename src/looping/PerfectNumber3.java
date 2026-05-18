package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number: ");
		int number = Integer.parseInt(br.readLine());
		boolean perfectNumber = isPerfectNumber(number);
		System.out.println(perfectNumber);

	}

	public static boolean isPerfectNumber(int number) {
		int sum = 1;
		if (number < 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				sum += (i + number / i);
			}
		}
		return sum == number;
	}

}
