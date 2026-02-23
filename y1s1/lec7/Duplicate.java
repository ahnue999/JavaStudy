import java.util.Scanner;

public class Duplicate
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int x;
		int count = 0;

		System.out.println("Enter 5 numbers");
		for (int i = 0; i < 5; i++)
		{
			x = input.nextInt();
			if (!isFound(x, arr, i))
			{
				arr[count] = x;
				count++;
			}
			printarray(arr, count);
		}
	}
	public static Boolean isFound(int n, int[] arr, int length)
	{
		for (int i = 0; i < length; i++)
		{
			if (n == arr[i])
				return (true);
		}
		return (false);
	}
	public static void printarray(int[] arr, int length)
	{
		for (int i = 0; i < length; i++)
			System.out.printf("%d ", arr[i]);
		System.out.printf("%n");
	}
}
