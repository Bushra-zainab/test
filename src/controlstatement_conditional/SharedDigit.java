package controlstatement_conditional;

import java.util.Scanner;

public class SharedDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int number1 = sc.nextInt();

		System.out.print("Enter second number: ");
		int number2 = sc.nextInt();

		boolean sharedDigit = hasSharedDigit(number1, number2);
		System.out.println(sharedDigit);
	}

	public static boolean hasSharedDigit(int num1, int num2) {

		// Check if both numbers are in the range 10 to 99
		if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
			return false;
		}

		int num1First = num1 / 10;
		int num1Last = num1 % 10;
		int num2First = num2 / 10;
		int num2Last = num2 % 10;

		return (num1Last == num2Last || num1Last == num2First || num1First == num2Last || num1First == num2First);
	}

	
	/*------------------------------------------------------------------------------------------*/
	//Alternative solution without loops or variables for conciseness:
	
	/*
	 * public static boolean hasSharedDigit(int num1, int num2)
	 *     { 
	 *     
	 *  if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) 
	 *       
	 *       { 
	 *       
	 *       return false;
	 *           } 
	 * 
	 * return (num1 % 10 == num2 % 10 || num1 % 10 == num2 / 10 || num1 / 10 ==
	 * num2 % 10 || num1 / 10 == num2 / 10); } }
	 * 
	 * 
	 */
	
	/*-----------------------------------------------------------------------------------------*/
	//Alternative solution as single-line return statement (impacts readability):

		
	/*
	 * public static boolean hasSharedDigit(int num1, int num2)
	 * 
	 * {
	 * 
	 * return
	 * 
	 * num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99 && (num1 % 10 == num2 %
	 * 10 || num1 && num1 <= 99 && num2 >= 10 && num2 <= 99 && (num1 % 10 == num2 %
	 * 10 || num1 % 10 == num2 / 10 || num1 / 10 == num2 % 10 || num1 / 10 == num2 /
	 * 10); }
	 */
		
}
