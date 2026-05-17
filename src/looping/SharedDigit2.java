package looping;

public class SharedDigit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasSharedDigit(int number1, int number2) {

	    // Check if both numbers are between 10 and 99
	    if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
	        return false;
	    }

	    // Check each digit of number1 against each digit of number2
	    while (number1 > 0) {
	        int digit1 = number1 % 10;
	        int temp = number2;

	        while (temp > 0) {
	            int digit2 = temp % 10;

	            if (digit1 == digit2) {
	                return true;
	            }

	            temp = temp / 10;
	        }

	        number1 = number1 / 10;
	    }

	    return false;
	}

}
