package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintFactor2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a number: ");
		int number = Integer.parseInt(br.readLine());

		printFactors(number);

	}

	 public static void printFactors(int number) {  
	        if (number < 1) {
	            System.out.println("Invalid Value");
	            return;
	        }
	        
	        for(int i = 1; i <= number/2; i++) {
	            if (number % i == 0) {
	                System.out.println(i);
	            }
	        }
	        System.out.println(number);
	    }
	
	 
	 /*-----------------------------------------------------------------------------------------------------*/
	 
	 //Alternative solution printing on one line separated by a space and trim whitespace at end:
	 
	 /*public static void printFactors(int number) {
	        String str = "";
	        if (number < 1) {
	            str += "Invalid Value";
	        } else {
	            for(int i = 1; i <= number; i++) {
	                if (number % i == 0) {
	                    str += i + " ";
	                }
	            }
	        }
	        System.out.println(str.trim());
	    }  */
}
