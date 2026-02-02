package operator;

public class LogicalOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		boolean result1 = (a < b) && (b > 15); // AND
		boolean result2 = (a > b) || (b > 15); // OR
		boolean result3 = !(a > b); // NOT

		System.out.println("a < b AND b > 15 : " + result1);
		System.out.println("a > b OR b > 15  : " + result2);
		System.out.println("NOT (a > b)      : " + result3);

	}

}
