package Controlstatement;

import java.util.Scanner;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Is Dog Barking? (true/false)");
        boolean barking  = sc.nextBoolean();
        
        System.out.println("Enter hour of day (0-23):");
        int hourOfDay = sc.nextInt();
        
        shouldWakeUp(barking, hourOfDay);
        
        
	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

		if (hourOfDay < 0 || hourOfDay > 23) {

			return false;
		}
		if (barking && (hourOfDay < 8 || hourOfDay > 22)) {

			return true;
		}

		return false;
	}

}
