package datatype;

public class OverFlowDemo {

	public static void main(String[] args) {
		
		int max = Integer.MAX_VALUE;
		
		System.out.println("Maximum integer value : " + max);
		
		max = max + 1;
		
		System.out.println("After Overflow" + max);

	}

}
