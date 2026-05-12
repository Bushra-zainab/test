package variable;

import java.util.Scanner;

public class UserInputVariable {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          
          System.out.println("Enter Your Name : ");
          String name = scanner.nextLine();
          
          System.out.println("Enter Your Age : ");
          int age = scanner.nextInt();
          
          System.out.println("Hello " + name + " , Age = " + age);
	}

}
