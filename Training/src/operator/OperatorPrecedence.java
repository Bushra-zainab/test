package operator;

public class OperatorPrecedence {

	public static void main(String[] args) {

        // https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
		double myFirstValue = 20.00d;
		double mySecondValue = 30.00d;
		double MyValuesTotal = myFirstValue + mySecondValue * 100.00d;
		System.out.println("My Total Values : " + MyValuesTotal);
		double remainder = MyValuesTotal % 40.00d;
		System.out.println("The Remainder Value : " + remainder);
		boolean isNoRemainder = (remainder == 0) ? true : false;
		System.out.println("isNoRemainder : " + isNoRemainder);
		if (!isNoRemainder) {
		System.out.println("Got Some Remainder");

	}

}

}
