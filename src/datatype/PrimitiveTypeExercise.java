package datatype;

public class PrimitiveTypeExercise {

	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 30;
		int intValue = 50;
		//long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		
		int sumOfThree = (byteValue + shortValue + intValue);
		
		long longTotal = 50000L + (10 * sumOfThree);
		
		short shortTotal = (short) (1000 + 10 * (sumOfThree));
		
		System.out.println(longTotal);
		System.out.println(shortTotal);
		
		
		

	}

}
