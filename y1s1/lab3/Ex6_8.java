import java.util.Scanner;

public class Ex6_8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int length;

		System.out.println("Enter the length of the square side");
		length = input.nextInt();

		squareOfAsterisks(length);
	}
	public static void squareOfAsterisks(int n)
	{
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				System.out.printf("%c", '*');
			}
			System.out.printf("\n");
		}
	}
}
