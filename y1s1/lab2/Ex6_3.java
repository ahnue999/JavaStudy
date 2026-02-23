import java.util.Scanner;
import java.lang.Math;

public class Ex6_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double num;

		System.out.println("Enter a number:");
		num = input.nextFloat();

		System.out.printf("Original Value: %f\n", num);
		System.out.printf("Integer: %d\n", roundToInteger(num));
		System.out.printf("To Tenths: %.1f\n", roundToTenths(num));
		System.out.printf("To Hundredths: %.2f\n", roundToHundredths(num));
		System.out.printf("To Thousandths: %.3f\n", roundToThousandths(num));
	}

	public static int roundToInteger(double n)
	{
		return ((int) Math.floor(n + 0.5));
	}

	public static double roundToTenths(double n)
	{
		return (Math.floor(n * 10 + 0.5) / 10);
	}

	public static double roundToHundredths(double n)
	{
		return (Math.floor(n * 100 + 0.5) / 100);
	}

	public static double roundToThousandths(double n)
	{
		return (Math.floor(n * 1000 + 0.5) / 1000);
	}
}
