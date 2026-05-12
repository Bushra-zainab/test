package variable;

public class VariableLowerRype {

	public static void main(String[] args) {

		byte a = 10;
		byte b = 20;

		// byte a = a + b; compile time error

		// int c = (a+b);
		byte c = (byte) (a + b);
		
		System.out.println(c);

	}

}
