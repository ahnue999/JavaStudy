import java.util.Scanner;

public class Ex6_4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int base, exponent;
		boolean cont = true;


		while(cont)
		{
			System.out.println("Enter the base:        (-99 to quit)");
			base = input.nextInt();

			if (base == -99)
			{
				System.out.println("Thanks for using our service");
				break;
			}

			exponent = -1;

			while (exponent <= 0)
			{
				System.out.println("Enter the exponent:");
				exponent = input.nextInt();
				if (exponent <= 0)
					System.out.println("ERROR: Please Input a Positive Exponent!");
			}
			System.out.printf("%d ^ %d = %d%n", base, exponent, integerPower(base, exponent));
		}


	}
	public static int integerPower(int base, int exponent)
	{
		int result = 1;

		for (int i = 0; i < exponent; i++)
			result *= base;

		return result;
	}
}
