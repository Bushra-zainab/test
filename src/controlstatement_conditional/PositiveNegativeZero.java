package Controlstatement;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); 
        System.out.println("Provide Number");
        int i = sc.nextInt();
        checkNumber(i);
		
	}

	public static void checkNumber(int number) {

		if (number > 0) {
			System.out.println("Number is Positive");
		} else if (number < 0) {
			System.out.println("Number is Negative");
		} else {
			System.out.println("Its Zero");
		}
	}
}
