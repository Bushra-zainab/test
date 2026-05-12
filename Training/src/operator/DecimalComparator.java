package operator;

import java.util.Scanner;

public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide first number");
		double firstNumber = sc.nextDouble();

		System.out.println("Provide second number");
		double secondNumber = sc.nextDouble();
		boolean threeDecimalPlaces = areEqualByThreeDecimalPlaces(firstNumber , secondNumber);
		System.out.println(threeDecimalPlaces);
	}
	
	 public static boolean areEqualByThreeDecimalPlaces(double firstNumber , double secondNumber){
	        
	        int first = (int)(firstNumber * 1000);
	        int second = (int) (secondNumber * 1000);
	        
	        return first == second;
	    }

}
