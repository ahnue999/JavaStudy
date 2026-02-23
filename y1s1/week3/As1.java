import java.util.Scanner;

public class As1 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double result = 0;
		int base;

		System.out.println("Enter the base");
		base = input.nextInt();


		for (int counter = 1; counter <=10; counter++)
		{
			result = result + pow(base, counter)/fact(counter);
		}
		System.out.println(result);
	}
	
	public static double pow(int base, int power)
	{
		int i = 0;
		double result = 1;

		while (i < power)
		{
			result *= base;
			i++;
		}
		return(result);
	}

	public static double fact(int base)
	{
		double result = 1;

		while (base > 1)
		{
			result *= base;
			base--;
		}
		return(result);
	}
}
