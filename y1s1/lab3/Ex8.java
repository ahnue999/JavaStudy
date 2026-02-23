import java.util.Scanner;

public class Ex8
{
	public static void main(String[] args)
	{
		int size;
		int[] dist = new int[11];
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of salespeople");
		size = input.nextInt();

		int[] pay = new int[size];
		int[] sales = new int[size];

		for (int i = 0; i < size; i++)
		{
			System.out.printf("Sales for person no.%d\n", i + 1);
			sales[i] = input.nextInt();
			pay[i] = 200 + (int) (sales[i] * 0.09);
		}

		for (int p : pay)
		{
			if (p < 1000)
				++dist[p/100];
			else
				++dist[10];
		}

		tabular(dist);
	}

	public static void tabular(int[] dist)
	{
		for (int i = 2; i < 10; i++)
		{
			System.out.printf("$%d-%d: ", i*100, i*100+99);
			for (int j = 0; j < dist[i]; j++)
			{
				System.out.print("*");
			}
			System.out.printf("\n");
		}

		System.out.printf("$1000 and over: ");
		for (int j = 0; j < dist[10]; j++)
		{
			System.out.print("*");
		}
		System.out.printf("\n");
	}
}
