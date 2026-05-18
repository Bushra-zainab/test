package controlstatement_conditional;

import java.util.Scanner;

public class LastDigitChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int number3 = sc.nextInt();
		
		boolean sharedDigit = hasSameLastDigit(number1, number2 , number3);
		System.out.println(sharedDigit);
		
	}

	public static boolean hasSameLastDigit(int num1, int num2, int num3) {

		if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {

			return false;
		}

		if (num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10) {

			return true;
		}

		return false;

	}

	private static boolean isValid(int num) {

		if (num >= 10 && num <= 1000) {

			return true;
		}

		return false;
	}
	
	/*-------------------------------------------------------------------------------------------------*/
	
	//Alternative solution using shorthand:
	
	/*public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        
        return num1%10 == num2%10 || num1%10 == num3%10 || num2%10 == num3%10;
    }
    
    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }   */
}
