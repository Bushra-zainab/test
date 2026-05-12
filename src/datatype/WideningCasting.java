package datatype;

public class WideningCasting {

	public static void main(String[] args) {
		
		int a = 10;
		long b = a;  // int  ->  long
		float c = b; // long  -> float
		double d = c; // float  -> double
		
		System.out.println("int value: " + a);
        System.out.println("long value: " + b);
        System.out.println("float value: " + c);
        System.out.println("double value: " + d);
		

	}

}
