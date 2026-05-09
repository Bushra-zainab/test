package datatype;

public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

		int first = (int) (firstNumber * 1000);
		int second = (int) (secondNumber * 1000);

		return first == second;

	}

	public static void main(String[] args) {

		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
	}

}
