package variable;

import java.util.Scanner;

public class TempConvertor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter temperature in celsius : ");
		float celsius = scanner.nextFloat();
		
		//System.out.print("Enter temperature in Fahrenheit: ");
        //float fahrenheit = scanner.nextFloat();

		float fahrenheit = (celsius * 9 / 5) + 32;
		//float celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println("Temperature in Fahrenheit: " + fahrenheit);
		//System.out.println("Temperature in Celsius: " + celsius);

		scanner.close();

	}

}
