package variable;

import java.util.Scanner;

public class BMICalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * int weight = 80; float height = 1.61544f;
		 * 
		 * float bmi = weight / (height * height);
		 * 
		 * System.out.println("Weight: " + weight); System.out.println("Height: " +
		 * height); System.out.println("BMI: " + bmi);
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter weight in kilograms : " );
		int weight = scanner.nextInt();
		
		System.out.println("Enter height in meters : ");
		float height = scanner.nextFloat();
		
		float bmi = weight / (height * height);
		
		System.out.println("\nYour BMI = " + bmi);
		
		scanner.close();
		
	}

}
