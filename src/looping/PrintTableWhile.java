package looping;

public class PrintTableWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;

		while (i <= 20) {

			int j = 1;
			while (j <= 20) {

				System.out.print(i * j + " ");
				
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
