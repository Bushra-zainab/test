package operator;

public class DemoUnaryOperator {

	public static void main(String[] args) {

		int result = 10;
		
		result = result -= 70;
		//result = result -=5.5;
		//is actually result = (int) (result - 5.5); 
		System.out.println(result);
	}

}
