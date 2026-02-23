import java.util.Scanner;

public class As1
{
	public static void main(String [] ags)
	{
		int x;
		int y = 1;
		Scanner input = new Scanner(System.in);


		do {
			System.out.println("Enter a non-negative number to find it's factorial");
			x = input.nextInt();
		} while (x < 0);

		while (x > 0)
		{
			y = y * x;
			x -= 1;
		}
		System.out.println(y);
	}
}
