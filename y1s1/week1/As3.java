import java.util.Scanner;

public class As3
{
	public static void main(String[] ags)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the temperature in Fahrenheit");
		float f = input.nextFloat();

		float c = (5.0f/9) * (f-32);


		System.out.printf("The temperature in Celsius is: %.2f%n", c);
	}
}
