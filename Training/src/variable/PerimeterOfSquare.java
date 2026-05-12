package variable;

import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {
		

		/*
		 * int side = 5;
		 * 
		 * int perimeter = 4 * side;
		 * 
		 * System.out.println(perimeter);
		 */
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter the side length of square");
		 
		 double  side = scanner.nextDouble();
		 
		 double perimeter = 4 * side;
		 
		 System.out.println("Perimeter of square is : " + perimeter);
		 
		 scanner.close();
		 
		 
		

	}

}
