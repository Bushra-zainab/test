package variable;

public class InstanceVariable {

	public String name;
	public int age = 20;
	
	//creating constructor to initialize variable name
	public InstanceVariable() {
		
		this.name ="bushra";
	}

	
	
	public static void main(String[] args) {
		
		InstanceVariable instanceVariable = new InstanceVariable();
		System.out.println("Student Age " + instanceVariable.age);
		System.out.println("Student Name " + instanceVariable.name);



	}

	
}
