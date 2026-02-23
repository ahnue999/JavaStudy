import java.util.Scanner;

public class ABC
{
	public static void main(String[] args)
	{
		int size = 10;
		int payment = 200;

		float commission;
		float percentage = .09f;

		int[] sales = new int[size];
		int[] pay = new int[size];

		Scanner input = new Scanner(System.in);

		// Fill data
		for (int i = 0; i < size; i++)
		{
			System.out.printf("Enter the weekly sales for salesperson No.%d%n", i+1);
			sales[i] = input.nextInt();
			input.nextLine();
			pay[i] = payment;
		}

		// Calculate payroll
		for (int i = 0; i < size; i++)
		{
			pay[i] += percentage * sales[i];
		}

		list (pay);
		tabular(pay);
	}

	public static void tabular(int[] pay)
	{
		int max = 10;
		int[] range = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		for (int num : pay)
		{
			if (num >= 1000)
				range[10]++;
			else
				++range[num/100];
		}

		for (int i = 0; i <= max; i++)
		{
			if (i == max)
				System.out.printf("1000$ and over: ");
			else
				System.out.printf("%s-%s$: ", i*100, i*100+99);
			for (int j = 0; j < range[i]; j++)
			{
				System.out.printf("*");
			}
			System.out.printf("%n");
		}
	}
	public static void list(int[] pay)
	{
		System.out.println("________________________________________");
		System.out.printf("%2s| %-25s| Pay%n", "ID", "Name");
		System.out.println("________________________________________");
		for (int num : pay)
		{
			System.out.printf("%d%n", num);
		}
		System.out.println("________________________________________");
	}
}
