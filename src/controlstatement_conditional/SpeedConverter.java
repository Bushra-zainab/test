package controlstatement_conditional;

import java.util.Scanner;

public class SpeedConverter {

	// static double toMilesPerHour = 1.5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Number");
		double toMilesPerHour = sc.nextDouble();

		printConversion(toMilesPerHour);

	}

	public static long toMilesPerHOur(double kiloMetersPerHour) {

		if (kiloMetersPerHour < 0) {
			return -1;
		}

		return Math.round(kiloMetersPerHour / 1.609);
	}

	public static void printConversion(double kilometersPerHour) {
		long milesPerHour = toMilesPerHOur(kilometersPerHour);
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
		}
	}

}
