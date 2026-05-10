package operator;

public class TeenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasTeen(13, 14, 15));
	}

	public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

		return (firstNumber >= 13 && firstNumber <= 19) || (secondNumber >= 13 && secondNumber <= 19)
				|| (thirdNumber >= 13 && thirdNumber <= 19);

	}

}
