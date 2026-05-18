package collection.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class LastDigitChecker3 {

	public static void main(String[] args) throws IOException {
		
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
        return isValid(num1) && isValid(num2) && isValid(num3) && new HashSet<Integer> (Arrays.asList(num1%10, num2%10, num3%10)).size() != 3;
    }
    
    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
	
}
