package string;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void numberToWords(int number) {
		String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
				"Invalid Value" };
		if (number < 0) {
			System.out.println(words[10]);
		}
		int reversedNumber = reverse(number);
		int numDigitCount = getDigitCount(number);

		while (numDigitCount > 0) {
			System.out.println(words[reversedNumber % 10]);
			reversedNumber /= 10;
			numDigitCount--;
		}
	}

	public static int getDigitCount(int number) {
		if (number < 0) {
			return -1;
		}
		String str = Integer.toString(number);
		return str.length();
	}

	public static int reverse(int number) {
		StringBuilder forward = new StringBuilder("" + Math.abs(number));
		StringBuilder reverse = forward.reverse();
		int result = Integer.valueOf(reverse.toString());
		return (number < 0) ? result * -1 : result;
	}
}
