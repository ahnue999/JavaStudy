import java.util.Scanner;

public class Ex8_2
{
	public static void main(String[] args)
	{
		int size;
		int[] distribution = new int[11];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of salespeople");
		size = input.nextInt();

		int[] pay = new int[size];
		int[] sales = new int[size];

		for (int i = 0; i < size; i++)
		{
			System.out.printf("Enter person no.%d sales\n", i + 1);
			sales[i] = input.nextInt();
			pay[i] += 200 + (sales[i] * .09);
		}

		for (int p : pay)
		{
			if (p < 1000)
				++distribution[p/100];
			else
				++distribution[10];
		}
		tabular(distribution);
	}

	public static void tabular(int[] dist)
	{
		for (int i = 2; i < 10; i++)
		{
			System.out.printf("$%d-%d: ", i*100, i*100+99);
			for (int j = 0; j < dist[i]; j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}

		System.out.printf("$1000 and over: ");
		for (int j = 0; j < dist[10]; j++)
		{
			System.out.printf("*");
		}
		System.out.printf("\n");
	}
}
