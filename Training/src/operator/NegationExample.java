package operator;

public class NegationExample {

	public static void main(String[] args) {

		int a = 100 , b = -2;
		boolean c = true;
		boolean d = false;
		
		System.out.println(~a); // ~x = - (x + 1)
		System.out.println(~b); // ~ works on bits, not values
		System.out.println(!c); // ! works on boolean only
		System.out.println(!d);
		
	}

}
