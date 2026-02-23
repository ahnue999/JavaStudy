import java.util.Scanner;

public class ReversingDigits
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number to reverse");
		reverse(input.nextInt());
	}
	public static void reverse(int num)
	{
		while (num != 0)
		{
			System.out.printf("%d", num % 10);
			num /= 10;
		}
		System.out.printf("%n");
	}
}
