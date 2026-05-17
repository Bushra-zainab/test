package looping;

import java.util.Scanner;

public class PalindromeNumber2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		boolean result = isPalindrome(number);
		
		   if (result) {
	            System.out.println(number + " is a palindrome number");
	        } else {
	            System.out.println(number + " is not a palindrome number");
	        }

	        sc.close();
	}
	
	/*------------------------------------------------------------------*/

	/*
	 * public static boolean isPalindrome(int number) {
	 * 
	 * if (number < 0) {
	 * 
	 * number = -number; }
	 * 
	 * int reverseNumber = 0;
	 * 
	 * int lastDigit;
	 * 
	 * int i = number;
	 * 
	 * while (i > 0) {
	 * 
	 * lastDigit = i % 10;
	 * 
	 * reverseNumber = (reverseNumber * 10) + lastDigit;
	 * 
	 * i /= 10; }
	 * 
	 * return reverseNumber == number;
	 * 
	 * }
	 */
	
	/*-----------------------------------------------------------------------*/
	
	/*
	 * public static boolean isPalindrome(int number)
	 * 
	 * { 
	 * 
	 * // if (number < 0) 
	 * 
	 * { 
	 * 
	 * number = - number; //
	 *  }
	 *   int reverseNumber = 0;
	 *   
	 *   int lastDigit; int i = number;
	 *   
	 * // while (i > 0)
	 * 
	 * { 
	 * while (i != 0)
	 * 
	 * { // handles negative and positive values
	 * 
	 * lastDigit = i % 10; reverseNumber = (reverseNumber * 10) + lastDigit; i = i /10;
	 * 
	 *  } 
	 *  
	 *  return reverseNumber == number; 
	 *  
	 *  }
	 */
	
	/*----------------------------------------------------------------*/
	
	/*
	 * public static boolean isPalindrome(int number)
	 * 
	 * { 
	 * 
	 * int reverseNumber = 0;  
	 *   // int lastDigit;// unnecessary exposure
	 *  
	 *   int i = number; 
	 *   while (i != 0)
	 *   { 
	 *   //lastDigit = i % 10; 
	 *   int lastDigit = i % 10; // narrow scope 
	 * reverseNumber =(reverseNumber * 10) + lastDigit; i = i / 10;
	 * 
	 *  }
	 *   return reverseNumber == number;
	 *  }
	 */
	
	/*----------------------------------------------------------------------*/
	
	/*
	 * public static boolean isPalindrome(int number)
	 * 
	 * {
	 *  
	 * int reverseNumber = 0; 
	 * int i = number;
	 * 
	 *  while (i != 0)
	 *  {
	 *   // int lastDigit = i % 10;
	 *   
	 *   // reverseNumber = (reverseNumber * 10) + lastDigit;
	 *   
	 *  reverseNumber = reverseNumber * 10 + i % 10;
	 *  
	 *  // i = i / 10;
	 *  
	 *  i /= 10; // shorthand 
	 *  
	 *  } 
	 *  
	 *  return reverseNumber == number; 
	 *  }
	 */
	
	/*---------------------------------------------------------------*/
	
	public static boolean isPalindrome(int number) {
		int reverseNumber = 0;
		for (int i = number; i != 0; i /= 10) {
			reverseNumber = reverseNumber * 10 + i % 10;
		}
		return reverseNumber == number;
	}
}
