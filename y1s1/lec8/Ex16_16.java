import java.util.Scanner;

public class Ex16_16
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String str;
		char toFind;

		System.out.println("Enter a line");
		str = input.nextLine();
		System.out.println("Enter a char to find first and last index of");
		toFind = input.next().charAt(0);

		System.out.printf("First at: %d%n", indexOf(str, toFind));
		System.out.printf("Last at: %d%n", lastIndexOf(str, toFind));
	}
	public static int indexOf(String str, char toFind)
	{

		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == toFind)
			{
				return (i);
			}
		}
		return (-1);
	}

	public static int lastIndexOf(String str, char toFind)
	{
		for (int i = str.length() - 1; i >= 0; i--)
		{
			if (str.charAt(i) == toFind)
			{
				return (i);
			}
		}
		return (-1);
	}
}
