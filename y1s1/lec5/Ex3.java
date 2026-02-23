import java.util.Scanner;

public class Ex3
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		Coins coin1 = new Coins();
		int choice;

		while (true)
		{
			System.out.printf("[1] Add Coins\n[2] Check Coins\n[3] Exit\n");
			choice = input.nextInt();
			switch (choice)
			{
				case 1:
					cls();
					coin1.add();
					break;
				case 2:
					cls();
					coin1.total();
					break;
				case 3:
					System.out.println("Thanks For Using Our Service");
					System.out.println("See You Next Time");
					return;
				default:
					cls();
					System.out.println("Enter a valid choice");
			}
		}
	}
	public static class Coins
	{
		Scanner input = new Scanner(System.in);
		double total = 0;

		int penny = 0;
		int nickel = 0;
		int dime = 0;
		int quarter = 0;

		public void add()
		{
			int p, n, d, q;

			System.out.println("Enter you coins!");
			System.out.println("How many pennies?");
			p = input.nextInt();
			System.out.println("How many nickels?");
			n = input.nextInt();
			System.out.println("How many dimes?");
			d = input.nextInt();
			System.out.println("How many quarters?");
			q = input.nextInt();

			this.penny += p;
			this.nickel += n;
			this.dime += d;
			this.quarter += q;

			System.out.println("Coins Added!");
		}

		public double total()
		{
			total = total + 0.01 * penny + 0.05 * nickel + 0.1 * dime + 0.25 * quarter;

			System.out.printf("Your Coins Amount To: %.2f%n", total);
			return (total);
		}
	}
	public static void cls()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
