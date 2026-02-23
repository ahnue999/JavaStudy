import java.util.Scanner;

public class As1
{
	public static void main(String[] ags)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		int x = input.nextInt();
		System.out.println("Enter a second number");
		int y = input.nextInt();

		int z = 0;
		z = x + y;

		System.out.printf("The sum is: %d\n", z);
	}
}
