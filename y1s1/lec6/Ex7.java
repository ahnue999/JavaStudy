import java.util.Scanner;

public class Ex7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int productsCount = 5;
		int peopleCount = 4;

		int[][] data = new int[productsCount][peopleCount];
		int[] totalProduct = new int[productsCount];
		int[] totalPerson = new int[peopleCount];

		for (int i = 0; i < productsCount; i++)
		{
			for (int j = 0; j < peopleCount; j++)
			{
				System.out.printf("Enter sales of product %d for person %d%n", i+1, j+1);
				data[i][j] = input.nextInt();
			}
		}
		table(data);
	}

	public static void table (int[][] data)
	{
		int[] ctotal = {0, 0, 0, 0, 0};
		int rtotal;

		for (int i = 0; i < data.length; i++)
		{
			rtotal = 0;
			int j;
			for (j = 0; j < data[i].length; j++)
			{
				System.out.printf("|%-5d", data[i][j]);
				rtotal += data[i][j];
				ctotal[j] += data[i][j];
			}
			ctotal[j] += rtotal;
			System.out.printf("|%-5d|\n", rtotal);
		}
		for (int k = 0; k < ctotal.length; k++)
			System.out.printf("|%-5d", ctotal[k]);
		System.out.printf("|\n");
	}
}
