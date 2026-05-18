package looping;

public class GreatestCommonDivisor {

	static int first = 25;
	static int second = 15;

	public static void main(String[] args) {

		int commonDivisor = getGreatestCommonDivisor(first, second);
		System.out.println(commonDivisor);

	}

	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) {
			return -1;
		}

		int gcd = 0;
		for (int i = 1; i <= first; i++) {
			if (first % i == 0 && second % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

}
