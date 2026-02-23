import java.util.Scanner;

public class SalesApp
{
	public static void main(String[] args)
	{
		int size = 1;

		float commission;
		float lowmax = 500;
		float lowcommission = .1f;
		float highcommission = .15f;
		salesperson[] salepeople = new salesperson[size];

		Scanner input = new Scanner(System.in);

		// Fill data
		for (int i = 0; i < size; i++)
		{
			System.out.printf("Enter the name and weekly sales for salesperson No.%d%n", i+1);
			salepeople[i] = new salesperson(input.nextLine(), input.nextInt());

			input.nextLine();
		}

		// Calculate payroll
		for (int i = 0; i < size; i++)
		{
			if ((commission = salepeople[i].sales - lowmax) >= 0)
			{
				salepeople[i].pay += lowcommission * lowmax + highcommission * commission;
			}
			else
			{
				salepeople[i].pay += lowcommission * salepeople[i].sales;
			}
		}

		list(salepeople, size);
	}

	public static class salesperson
	{
		int ID;
		String name;
		float sales;
		float pay;

		public salesperson(String name, float sales)
		{
			this.name = name;
			this.sales = sales;
			this.pay = 300; // Base Pay
		}
	}

	public static void list(salesperson[] salepeople, int size)
	{
		System.out.println("________________________________________");
		System.out.printf("%2s| %-25s| Pay%n", "ID", "Name");
		System.out.println("________________________________________");

		for (int i = 0; i < size; i++)
		{
			System.out.printf("%02d| %-25s| %.2f%n", i+1, salepeople[i].name, salepeople[i].pay);
		}

		System.out.println("________________________________________");
	}
}
