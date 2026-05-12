package variable;

public class SwapNumbeWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 20;
		int b = 50;
		
		a = a + b; //  20 + 50 = 70
		b = a - b;  // 70-50 = 20
		a = a - b;   // 70 - 20 = 50
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);


	}

}
