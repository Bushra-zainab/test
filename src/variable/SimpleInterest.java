package variable;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		/*
		 * //Simple Interest (SI)=P×R×T/100
		 * 
		 * float principal = 1000; float rate = 50; float time = 20;
		 * 
		 * float simpleInterest =(principal * rate * time)/100;
		 * 
		 * System.out.println("simple interest : " + simpleInterest);
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Enter Principal amount : ");
		float principalAmount = scanner.nextFloat();
		
		System.out.println("Enter Rate of interest : ");
		float rateOfInterest = scanner.nextFloat();
		
		System.out.println("enter time in years : ");
		float time = scanner.nextFloat();
		
		float simpleInterest =(principalAmount * rateOfInterest * time) / 100;
		
		System.out.println("\nSimple Interest = " + simpleInterest);
		
		scanner.close();
		
		
		

	}

}
