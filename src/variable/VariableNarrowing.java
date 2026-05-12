package variable;

public class VariableNarrowing {

	public static void main(String[] args) {

		float f = 10.5f;
		// int a = f; it will give compile time error

		int a = (int) f;

		System.out.println(a);
		System.out.println(f);
	}

}
