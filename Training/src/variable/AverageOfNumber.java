package variable;

import java.util.Scanner;

public class AverageOfNumber {

	
	public static void main(String[] args) {

		/*
		 * int a = 10; int b = 20; int c = 30;
		 * 
		 * float average = (a + b + c) / 3.0f;
		 * 
		 * System.out.println("Average : "+ average);
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first Number : ");
		float number1 = scanner.nextFloat();
		
		System.out.println("Enter second Number : ");
		float number2 = scanner.nextFloat();
		
		System.out.println("Enter third Number : ");
		float number3 = scanner.nextFloat();
		
		float average = (number1 + number2 + number3) / 3;
		
		System.out.println("\nAverage : "+ average);
		
		scanner.close();
		
		
		
	}

}
