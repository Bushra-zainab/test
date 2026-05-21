package controlstatement_conditional;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(7);
	}

	public static void printSquareStar(int number) {

		if (number < 5) {

			System.out.println("Invalid Value");

		}

		else

		{
			for (int i = 1; i <= number; i++) // where i is the currentRow

			{

				for (int j = 1; j <= number; j++) // where j is the rowCount or "column"
				{
					if (i == 1) {
						System.out.print("T"); // TOP

					}

					else if (i == number)

					{
						System.out.print("B"); // BOTTTOM

					}

					else if (j == 1)

					{
						System.out.print("L"); // LEFT

					}

					else if (j == number)

					{
						System.out.print("R"); // RIGHT

					}

					else if (i == j)

					{
						System.out.print("D"); // diagonal left DOWN to right

					}

					else if (j == number - i + 1) {

						System.out.print("U"); // diagonal left UP to right

					}

					else

					{
						System.out.print(" "); // print space in pattern
					}
				}

				System.out.println();
			}
		}
	}
}
