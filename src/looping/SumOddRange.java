package looping;

public class SumOddRange {

	public static void main(String[] args) {
		
		System.out.println(sumOdd(1, 100)); // 2500
		System.out.println(sumOdd(-1, 100)); // -1
		System.out.println(sumOdd(100, 100)); // 0
		System.out.println(sumOdd(13, 13)); // 13
		System.out.println(sumOdd(100, -100)); // -1
		System.out.println(sumOdd(100, 1000)); // 247500
	}

	public static boolean isOdd(int number) {

		if (number <= 0) {

			return false;
		}
		return number % 2 != 0;

	}

	public static int sumOdd(int start, int end) {
		
		int sum = 0;

		if (start <= 0 || end <= 0 || end < start) {

			return -1;
		}


	//	for (int i = start; i <= end; i++)
		
		for (int i = isOdd(start) ? start : start + 1; i <= end; i+=2)
		{

			if (isOdd(i)) {

				sum += i; // sum = sum + i;
			}

		}

		return sum;

	}
	
	/*
	 * public static boolean isOdd(int number) 
	 * 
	 *     { 
	 * return number > 0 && number % 2 != 0;
	 *  
	 *           }
	 * 
	 * public static int sumOdd(int start, int end)
	 *  
	 *     { 
	 *  int sum = 0; if (start < 0 || start > end) { return -1;
	 *           }
	 * 
	 *  int oddStart = isOdd(start) ? start : start + 1;
	 * x
	 *  for (int i = oddStart; i <= end; i += 2)
	 *  
	 *       { 
	 *           sum += i; 
	 *                       } 
	 *   
	 *   return sum;
	 *   
	 *    }
	 */
}
