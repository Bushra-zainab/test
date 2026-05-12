package datatype;

public class DataTypeNonPrimitive {

	public static void main(String[] args) {

		// String reference type
		String name = "Non Primitive Example";

		// Array
		int[] numbers = { 1, 2, 3, 4, 5 };

		// class object
		Student student = new Student(18, "bushra");

		// printing values
		System.out.println("String " + name);

		System.out.println("Array Values : ");

		for (int num : numbers) {
			System.out.println(num);

		}

		System.out.println("Student Age: " + student.age);
		System.out.println("Student name: " + student.name);

		Animal animal = Animal.CAT;
		System.out.println(animal);

	}

}

class Student {

	int age;
	String name;

	Student(int age, String name) {

		this.age = age;
		this.name = name;

	}
}

enum Animal {

	CAT, DOG, COW;

}
