import java.util.Scanner;

public class Q1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x;
		double y;
		y = 0;

		System.out.println("Enter x");
		x = input.nextInt();

		for (int i = 1; i <= 10; i++)
		{
			y += (double) pow(x, i) / fact(i);
		}

		System.out.printf("Y = %f", y);
	}
	public static int pow(int a, int n)
	{
		int r = 1;

		for (int i = 0; i < n; i++)
			r *= a;

		return (r);
	}
	public static int fact(int n)
	{
		if (n <= 1)
			return (1);
		else
			return (n * fact(n - 1));
	}
}
