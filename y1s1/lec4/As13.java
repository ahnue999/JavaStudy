import java.util.Scanner;

public class As13 {
	public static void main(String[] args)
	{
		int largest, smallest;
		int[] n = new int[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++)
		{
			System.out.println("Enter a number");
			n[i] = input.nextInt();
		}

		largest = smallest = n[0];

		for (int i = 0; i < 5; i++)
		{
			if (n[i] > largest)
				largest = n[i];
			if (n[i] < smallest)
				smallest = n[i];
		}

		System.out.printf("The largest number is: %d%n", largest);
		System.out.printf("The smallest number is: %d%n", smallest);
	}
}
