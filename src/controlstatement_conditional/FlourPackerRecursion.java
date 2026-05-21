package controlstatement_conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlourPackerRecursion {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter count 1: ");
		int bigCount = Integer.parseInt(br.readLine());
		
		System.out.print("Enter count 2: ");
		int smallCount = Integer.parseInt(br.readLine());
		
		System.out.print("Enter goal: ");
		int goal = Integer.parseInt(br.readLine());
		
		boolean canPack = canPack(bigCount, smallCount, goal);
		System.out.println(canPack);
		
		
	}

	  public static boolean canPack(int bigCount, int smallCount, int goal){
	        if (bigCount < 0 || smallCount < 0 || goal < 0) {
	            return false;
	        }
	        return goal == 0 || canPack(bigCount-1, smallCount, goal-5) || canPack(0, smallCount-1, goal-1);
	    }
	
}
