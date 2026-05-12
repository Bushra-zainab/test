package datatype;

public class WrapperClassExample {

	public static void main(String[] args) {
		
		int a = 10;
		float f = 10.0f;
		double d = 25.5;
		char c = 'A';
		boolean b = true;
		
		//Autoboxing = Primitive -> Object 
		Integer intObj = a;
		Float floatObj = f;
		Double doubleObj = d;
		Character charObj = c;
		Boolean boolObj = b;
		
		System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Float object : " + floatObj);
        
       //Unboxing = Object  -> Primitive
        
        int x = intObj;
        double y = doubleObj;
        
        System.out.println("Unboxed int: " + x);
        System.out.println("Unboxed double: " + y);

	}

}
