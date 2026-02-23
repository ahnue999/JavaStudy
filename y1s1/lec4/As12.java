import java.util.Scanner;

public class As12 {
	public static void main(String[] args)
	{
		int largest, smallest, sum, mult, r;
		int[] n = new int[3];
		Scanner input = new Scanner(System.in);
		sum = 0;
		mult = 1;

		for (int i = 0; i < 3; i++)
		{
			System.out.println("Enter a number");
			n[i] = input.nextInt();
			sum += n[i];
			mult *= n[i];
		}

		System.out.printf("The sum is: %d %n", sum);
		System.out.printf("The average is: %d %n", sum/3);
		System.out.printf("The product is: %d %n", mult);

		largest = smallest = n[0];

		for (int i = 0; i < 3; i++)
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
