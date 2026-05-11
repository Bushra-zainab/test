package Looping;

public class FactorialByDecre {

	static int no = 7;
	static int fact = 1;

	public static void main(String[] args) {

		for (int i = no; i >= 1; i--) {

			fact = fact * i	;
		}
		System.out.println(fact);
	}

}
