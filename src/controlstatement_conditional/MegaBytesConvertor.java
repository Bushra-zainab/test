package controlstatement_conditional;

import java.util.Scanner;

public class MegaBytesConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Number");
		int kiloBytes = sc.nextInt();

		printMegaBytesAndKiloBytes(kiloBytes);
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		if (kiloBytes < 0) {

			System.out.println("Invalid Value");
		} else {
			int megaBytes = kiloBytes / 1024;
			int remainingKiloBytes = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
			
		}

	}

}