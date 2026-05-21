package controlstatement_conditional;

import java.util.Scanner;

public class LargestPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int number = sc.nextInt();
		int prime = getLargestPrime(number);
		System.out.println(prime);
		sc.close();

	}

	public static int getLargestPrime(int number) {
		if (number < 2) {
			return -1;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				number /= i;
				i--; // to negate i++
			}
		}
		return number;
	}
	
	/*------------------------------------------------------------------------------------------------*/
	
	 /*public static int getLargestPrime(int number) {
	        if (number < 2) {
	            return -1;
	        }
	 
	        for (int i = number; i > 1; i--) { // decrementing
	            if (number%i == 0) {
	                number = i; // set argument as the divisor
	            }
	        }
	        return number;
	    } */
	
	/*---------------------------------------------------------------------------------------------*/
	
	/*  public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
 
        for (int i = number/2; i >= 2; i--) { // optimized i = number/2
            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }   */

}
