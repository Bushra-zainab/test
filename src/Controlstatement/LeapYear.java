package Controlstatement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide year");
		int year = sc.nextInt();

		if (isLeapYear(year)) {
			System.out.println("Year Is Leap");
		} else {
			System.out.println("this is not leap year");
		}
	}

	public static boolean isLeapYear(int year) {

		if (year < 1 || year > 9999) {
			return false;
		}

		// Divisible by 4?
		if (year % 4 == 0) {

			// Divisible by 100?
			if (year % 100 == 0) {

				// Divisible by 400?
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}

			} else {
				return true;
			}

		} else {
			return false;
		}
	}
}
