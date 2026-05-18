package looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorPrint {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a number: ");
		int number = Integer.parseInt(br.readLine());

		printFactors(number);
	}

	public static void printFactors(int number) {

		if (number < 1) {
			System.out.println("Invalid Value");
		}

		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	/*---------------------------------------------------------------------------------------------------*/
	
	//Alternative solution printing on one line separated by a space optimized loop:
	
	/*public static void printFactors(int number) {
        String str = "";
        if (number < 1) {
            str += "Invalid Value";
        } else {
            for(int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    str += i + " ";
                }
            }
            str += number;
        }
        System.out.println(str);
    } */
}
