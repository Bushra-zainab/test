package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number: ");
		int number = Integer.parseInt(br.readLine());
		boolean perfectNumber = isPerfectNumber(number);
		System.out.println(perfectNumber);
		
		

	}

	 public static boolean isPerfectNumber(int number) {
	        int sum = 0;
	        if (number < 1) {
	            return false;
	        }
	        for(int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }
	        return sum == number;
	    }
	
}
