import java.util.Scanner;

public class As4
{
	public static void main(String[] ags)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
		int x = input.nextInt();
		
		int z = x % 2;

		if (z == 1) {
			System.out.printf("%d is an Odd numebr%n", x);
		}
		else {
			System.out.printf("%d is an Even numebr%n", x);
		}
	}
}
