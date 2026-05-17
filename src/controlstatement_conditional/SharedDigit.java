package controlstatement_conditional;

public class SharedDigit {

	public static void main(String[] args) {

	}

	public static boolean hasSharedDigit(int number1, int number2) {

		// Check if both numbers are in the range 10 to 99
		if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
			return false;
		}

		// Extract digits of the first number
		int firstDigit1 = number1 / 10;
		int lastDigit1 = number1 % 10;

		// Extract digits of the second number
		int firstDigit2 = number2 / 10;
		int lastDigit2 = number2 % 10;

		// Compare all possible combinations
		if (firstDigit1 == firstDigit2 || firstDigit1 == lastDigit2 || lastDigit1 == firstDigit2
				|| lastDigit1 == lastDigit2) {
			return true;
		}

		return false;
	}

}
