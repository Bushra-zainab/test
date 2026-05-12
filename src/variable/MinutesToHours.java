package variable;

import java.util.Scanner;

public class MinutesToHours {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter minutes: ");
		int minutes = sc.nextInt();

		int hours = minutes / 60; // total hours
		int remainingMinutes = minutes % 60; // leftover minutes

		System.out.println(minutes + " minutes = " + hours + " hours " + remainingMinutes + " minutes");

		sc.close();
	}

}
