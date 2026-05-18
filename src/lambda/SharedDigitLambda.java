package lambda;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SharedDigitLambda {

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
		if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
			return false;
		}

		int[] arrNum1 = { num1 % 10, num1 / 10 };
		int[] arrNum2 = { num2 % 10, num2 / 10 };
		return IntStream.of(arrNum1).anyMatch(x -> x == arrNum2[0] || x == arrNum2[1]);
	}
	
	
	/*------------------------------------------------------------------------------------*/
	/*
	 * public static boolean hasSharedDigit(int num1, int num2) 
	 *       
	 *       { 
	 *       if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99)
	 *      
	 *       {
	 *       
	 *   return false;
	 *   
	 *    }
	 * 
	 * List<Integer> list1 = Arrays.asList(num1%10, num1/10); 
	 * List<Integer> list2 = Arrays.asList(num2%10, num2/10);
	 *  
	 *  return list1.stream().anyMatch(n1 -> list2.stream().anyMatch(n2 -> n1.equals(n2)));
	 *  }
	 */
	/*--------------------------------------------------------------------------*/
	
	/*
	 * public static boolean hasSharedDigit(int num1, int num2) 
	 * 
	 *      { 
	 *      if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99)
	 *         
	 *         { 
	 *         
	 *       return false;
	 *       
	 *        }
	 * 
	 * List<Integer> list1 = Arrays.asList(num1%10, num1/10);
	 * 
	 * List<Integer> list2 = Arrays.asList(num2%10, num2/10);
	 * 
	 *  return list1.stream().filter(list2::contains).toList().size() != 0;
	 * 
	 *          
	 *           }
	 */
}
