package controlstatement_conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOrEven {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		int number = Integer.parseInt(br.readLine());
		
		switch (number % 2 ) {
		case 0:
			System.out.println(number + " is even" );
			break;

		default:
			System.out.println(number +" is odd");
			
		}
	}

}
