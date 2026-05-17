package controlstatement_conditional;

import java.util.Scanner;

public class IsCatPlaying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter is it summer");
		boolean boolean1 = sc.nextBoolean();

		System.out.println("enter is it temprature");
		int boolean2 = sc.nextInt();
		isCatPlaying(boolean1, boolean2);

		sc.close();

	}

	public static boolean isCatPlaying(boolean summer, int temprature) {

		if (summer) {

			if (temprature >= 25 && temprature <= 45) {
				return true;
			} else {

				return false;
			}
		} else {

			if (temprature >= 25 && temprature <= 35) {
				return true;
			} else {
				return false;
			}
		}

	}

}
