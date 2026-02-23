import java.util.Scanner;

public class Exponentiation
{
	public static void main(String[] args)
	{
		int base, exp;
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the base");
		base = input.nextInt();
		System.out.println("Enter the exponent");
		exp = input.nextInt();

		System.out.printf("%d ^ %d = %d%n", base, exp, integerPower(base, exp));
	}
	public static int integerPower(int base, int exponent)
	{
		int result = 1;

		while (exponent > 0)
		{
			result *= base;
			exponent--;
		}

		return (result);
	}
}
