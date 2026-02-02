package operator;

import java.util.Scanner;

public class UserInputTernary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();

		String grade = (marks >= 90) ? "A" 
				     : (marks >= 75) ? "B" 
				     : (marks >= 60) ? "C" 
				     : (marks >= 40) ? "D" 
				     : "Fail";

		System.out.println(grade);

	}

}
