package datatype;

public class NarrowingCasting {

	public static void main(String[] args) {
		
		double x = 45.78 ;
		int y = (int) x;   //double  -> int
		
		long p = 1000;
		short q = (short) p;      //long  -> short
		
		System.out.println("double value: " + x);
        System.out.println("int value after casting: " + y);

        System.out.println("long value: " + p);
        System.out.println("short value after casting: " + q);
		
		

	}

}
