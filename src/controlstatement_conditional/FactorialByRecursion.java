package controlstatement_conditional;

public class FactorialByRecursion {

	private static int no = 5;
	private static int fact = 1;

	public static void main(String[] args) {

		int returnFact = fact(no);
		System.out.println(returnFact);

	}

	private static int fact(int no) {
		// TODO Auto-generated method stub

		/*
		 * if (no > 1)
		 *  { fact = fact * no; fact(no - 1);
		 * 
		 * }
		 *  return fact;
		 */
		if (no >= 1) {
			return (no * fact(no - 1));
		}
		return 1;

	}

}
