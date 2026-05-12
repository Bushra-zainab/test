package Controlstatement;

import java.util.Scanner;

public class MinutesToYearsDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter minutes:");
		long minutes = sc.nextLong();

		printYearsAndDays(minutes);

		sc.close();
	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		} else {
			long years = minutes / 525600;
			long days = (minutes % 525600) / 1440;
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}

}
