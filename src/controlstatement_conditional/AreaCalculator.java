package Controlstatement;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Circle
		System.out.println("Enter radius:");
		double radius = sc.nextDouble();
		System.out.println("Area of circle = " + area(radius));

		// Rectangle
		System.out.println("Enter length:");
		double x = sc.nextDouble();

		System.out.println("Enter width:");
		double y = sc.nextDouble();

		System.out.println("Area of rectangle = " + area(x, y));

		sc.close();
	}

	private static double area(double x, double y) {
		
		if (x < 0 || y < 0) {
			return -1.0;
		}

		return x * y;
	}

	private static double area(double radius) {
		
		if (radius < 0) {
			return -1.0;
		}

		return Math.PI * radius * radius;
	}

}
