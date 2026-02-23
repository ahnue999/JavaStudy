import java.util.Scanner;

public class As2
{
	public static void main(String [] ags)
	{
		int base;
		int counter = 1;
		long result = 1;

		Scanner input = new Scanner(System.in);


		System.out.println("Enter a number to find it's power up to the 10nth");
		base = input.nextInt();

		while (counter <= 10)
		{
			result = result * base;
			System.out.println(result);
			counter += 1;
		}
	}
}
