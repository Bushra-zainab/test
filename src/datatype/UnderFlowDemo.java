package datatype;

public class UnderFlowDemo {

	public static void main(String[] args) {
		
		int min = Integer.MIN_VALUE;
		
		System.out.println("Integer Minimum Value : " + min);
		
		min = min - 1;
		
		System.out.println("After Underflow : " + min);

	}

}
