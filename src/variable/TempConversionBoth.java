package variable;

import java.util.Scanner;

public class TempConversionBoth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("----- Temperature Converter -----");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.print("Enter your choice (1 or 2): ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.print("Enter temperature in Celsius: ");
			float celsius = sc.nextFloat();
			float fahrenheit = (celsius * 9 / 5) + 32;
			System.out.println("Temperature in Fahrenheit: " + fahrenheit);
			break;

		case 2:
			System.out.print("Enter temperature in Fahrenheit: ");
			float f = sc.nextFloat();
			float c = (f - 32) * 5 / 9;
			System.out.println("Temperature in Celsius: " + c);
			break;

		default:
			System.out.println("Invalid choice! Please choose 1 or 2.");
		}

		sc.close();
	}

}
