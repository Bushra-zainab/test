package controlstatement_conditional;

import java.util.Scanner;

public class NumberOfDaysInMonthSwitch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter month");
		int month = sc.nextInt();

		System.out.println("enter year");
		int year = sc.nextInt();

		int days = getDaysInMonth(month, year);

		if (days == -1) {
			System.out.println("Invalid Month Or Year");
		}

		System.out.println("Number Of Days = " + days);
	}

	public static boolean isLeapYear(int year) {

		if (year < 1 || year > 9999) {
			return false;
		}

		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	}

	public static int getDaysInMonth(int month, int year) {

		if (month < 1 || month > 12 || year < 1 || month > 9999) {

			return -1;
		}
		switch (month) {
		case 1: // January
		case 3: // March
		case 5: // May
		case 7: // July
		case 8: // August
		case 10: // October
		case 12: // December
			return 31;

		case 4: // April
		case 6: // June
		case 9: // September
		case 11: // November
			return 30;

		case 2: // February
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}

		default:
			return -1;

		}

	}
}
