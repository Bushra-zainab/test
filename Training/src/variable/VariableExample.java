package variable;

public class VariableExample {

	int a = 10;
	static int b = 20;

	public void add() {

		int c = 30, d;
		d = a + b + c;
		System.out.println(d);
	}

	void multiply() {

		int e = 40, f;
		f = a * b * e;
		System.out.println(f);
	}

	public static void main(String[] args) {
		
		VariableExample variableExample = new VariableExample();
		variableExample.add();
		variableExample.multiply();

	}

}
