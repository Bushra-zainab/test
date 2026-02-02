package variable;

public class VariableExampleProgram {

	//variable is the name of memory location which can hold data
	
	/*
	 * A variable declared inside the class but outside the body of the method, is
	 * called an instance variable. It is not declared as static.
	 * when object is created variable allocates memory when object destroyed variable releses memory
	 * instance variables stores in heap memory
	 * default value depend on datatype
	 * access modifiers can be use with instance variable
	 * it can be called directly
	 * It is called an instance variable because its value is instance-specific and
	 * is not shared among instances.
	 */
	int a = 25;

	/*
	 * A variable that is declared as static is called a static variable. 
	 * It cannot  be local.
	 * stores in static memory.
	 * You can create a single copy of the static variable and share it
	 * among all the instances of the class. Memory allocation for static variables
	 * happens only once when the class is loaded in the memory.
	 * access modifiers can be used
	 * we can call directly or by using claas name, by using objects reference name
	 */	
	static String schoolName = "Greenwood school";

	public void display() {

		/*
		 * local variable : A variable declared inside the body method
		 * scope of local variable inside the method, constructors and blocks
		 * when method, constructors and blocks execute variable allocates memory when gets exit variable destroyed
		 * stored in stack memory
		 * doesnt have any default value value should provided before use
		 * access modifiers cannot be used with local variable except final keyword 
		 */
		String name = "umaima";

		System.out.println("Name " + name);
		System.out.println("Age " + a);
		System.out.println("School " + schoolName);
	}

	public static void main(String[] args) {

		VariableExampleProgram variableExampleProgram = new VariableExampleProgram();
		variableExampleProgram.display();

	}

}
