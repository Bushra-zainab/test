package datatype;

public class PrimitiveDataType {

	public static void main(String[] args) {

		// integer types
		byte b = 10;
		/*
		 * default size 1 byte = 8bits 
		 * It has a range of values from -128 to 127. 
		 * Its default value is 0.
		 */
		int i = 5000;
		/*
		 * default size 4 bytes = 32 bits 
		 * It has a range of values from -2,147,483,648 to 2,147,483,647.
		 *Its default value is 0.
		 */
		short s = 2000;
		/*
		 * default size  2 bytes = 16 bits 
		 *Its range of values is -32,768 to 32,767. 
		 * Its default value is 0.
		 */
		 
		long l = 15000000000000000L;
		/*
		 * default size 8 bytes = 64 bits 
		 * It has a wider range of values than int, ranging from -
		 * 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. 
		 * Its default value is 0.0L or 0.0l.
		 */
		// floating types
		float f = 5.75f; // 4 bytes = 32 bits
		double d = 19.99; // 8 bytes = 64 bits

		// charecter type
		char c = 'a'; // 2 bytes = 16 bits

		// boolean type
		//
		boolean isJavaFun = true; // false , but precisely not defined (JVM decides)

		System.out.println("Byte Value " + b);
		System.out.println("int Value " + i);
		System.out.println("short Value " + s);
		System.out.println("long Value " + l);
		System.out.println("float Value " + f);
		System.out.println("double Value " + d);
		System.out.println("char Value " + c);
		System.out.println("boolean Value " + isJavaFun);

	}

}
