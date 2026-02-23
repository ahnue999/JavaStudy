import java.util.Scanner;

public class As5
{
	public static void main(String[] ags)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Three number to compere");
		System.out.println("The first number");
		int x = input.nextInt();
		System.out.println("The second number");
		int y = input.nextInt();
		System.out.println("The third number");
		int z = input.nextInt();

		if (x > y)
		{
			if (x > z) {
				System.out.printf("The largest number is: %d%n", x);
			}
			else {
				System.out.printf("The largest number is: %d%n", z);
			}
		}
		else if (y > z) {
			System.out.printf("The largest number is: %d%n", y);
		}
		else {
			System.out.printf("The largest number is: %d%n", z);
		}
	}
}
