import java.util.Scanner;

public class ABC
{
	public static void main(String[] args)
	{
		int size = 2;

		float commission;
		float lowmax = 500;
		float lowcommission = .1f;
		float highcommission = .15f;

		float[] sales = new float[size];
		float[] pay = new float[size];
		String[] names = new String[size];

		Scanner input = new Scanner(System.in);

		// Fill data
		for (int i = 0; i < size; i++)
		{
			System.out.printf("Enter the name and weekly sales for salesperson No.%d%n", i+1);
			names[i] = input.nextLine();
			sales[i] = input.nextFloat();
			input.nextLine();
			pay[i] = 300;
		}

		// Calculate payroll
		for (int i = 0; i < size; i++)
		{
			if ((commission = sales[i] - lowmax) >= 0)
			{
				pay[i] += lowcommission * lowmax + highcommission * commission;
			}
			else
			{
				pay[i] += lowcommission * sales[i];
			}
		}

		list(names, pay, size);
	}

	public static void list(String[] names, float[] pay, int size)
	{
		System.out.println("________________________________________");
		System.out.printf("%2s| %-25s| Pay%n", "ID", "Name");
		System.out.println("________________________________________");
		for (int i = 0; i < size; i++)
		{
			System.out.printf("%02d| %-25s| %.2f%n", i+1, names[i], pay[i]);
		}
		System.out.println("________________________________________");
	}
}
