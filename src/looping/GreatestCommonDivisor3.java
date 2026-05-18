package looping;

public class GreatestCommonDivisor3 {

	static int first = 12;
	static int second = 30;
	
	public static void main(String[] args) {
		
		int commonDivisor = getGreatestCommonDivisor(first, second);
		System.out.println(commonDivisor);

	}

	private static int getGreatestCommonDivisor(int first, int second) {
		
		 if (first < 10 || second < 10) {
	            return -1;
	        }
		 
		 int gcd = 0;
	        for (int i = 1; i <= Math.min(first, second); i++) {
	            if (first % i == 0 && second % i == 0) {
	                gcd = i;
	            }
	        }
	        return gcd;
		
	}
}