package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreatestCommonDivisor4 {

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
        if (first >= 10 && second >= 10) {
            for (int i = Math.min(first, second); i > 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }
}
