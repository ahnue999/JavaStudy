import java.util.Scanner;

public class Ex3_2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String name, number;
		double balance, amount;
		int choice;

		System.out.println("Enter Account Name");
		name = input.nextLine();
		System.out.println("Enter Account Number");
		number = input.nextLine();
		System.out.println("Enter Account Balance");
		balance = input.nextDouble();

		BankAccount acc1 = new BankAccount(name, number, balance);

		while (true)
		{
			System.out.println("");
			System.out.printf("[1] Deposit\n[2] Withdraw\n[3] Check Account\n[4] Exit\n");
			choice = input.nextInt();
			switch (choice)
			{
				case 1:
					System.out.println("Enter the amount to deposit");
					amount = input.nextDouble();
					cls();
					acc1.deposit(amount);
					break;
				case 2:
					System.out.println("Enter the amount to withdraw");
					amount = input.nextDouble();
					cls();
					acc1.withdraw(amount);
					break;
				case 3:
					cls();
					acc1.check();
					break;
				case 4:
					cls();
					System.out.println("Thanks for using our service");
					System.out.println("See You Next Time");
					return;
				default:
					cls();
					System.out.println("Please enter a valid choice");
			}
		}

	}
	public static class BankAccount
	{
		private String name;
		private String number;
		private double balance;

		// Setters
		public void setName(String name)
		{
			this.name = name;
		}
		public void setNumber(String number)
		{
			this.number = number;
		}
		public void setBalance(double balance)
		{
			this.balance = balance;
		}

		// Getters
		public String getName()
		{
			return (this.name); }
		public String getnumber()
		{
			return (this.number);
		}
		public double getBalance()
		{
			return (this.balance);
		}

		public BankAccount(String name, String number, double Balance)
		{
			setName(name);
			setNumber(number);
			setBalance(balance);
		}

		public void BankAccount(String name, String number)
		{
			setName(name);
			setNumber(number);
			setBalance(0);
		}

		public void deposit(double amount)
		{
			if (amount < 0)
			{
				System.out.println("ERROR: Unable to deposit a negative value");
				System.out.printf("CURRENT BALANCE: %.2f%n", getBalance());
				return;
			}
			setBalance(getBalance() + amount);
			System.out.printf("DEPOSIT SUCCECEFUL, CURRENT BALANCE IS: %.2f%n", getBalance());
		}

		public double withdraw(double amount)
		{
			if (amount > getBalance())
			{
				System.out.println("ERROR: Account balance is insufficient");
				System.out.printf("CURRENT BALANCE: %.2f%n", getBalance());
				return (0);
			}
			setBalance(getBalance() - amount);
			System.out.printf("WITHDRAW SUCCECEFUL, CURRENT BALANCE IS: %.2f%n", getBalance());
			return (amount);
		}
		public double check()
		{
			System.out.printf("\t###ACCOUNT DETAILS###\n");
			System.out.printf("Account Name: %s%n", getName());
			System.out.printf("Account Number: %s%n", getnumber());
			System.out.printf("CURRENT BALANCE IS: %.2f%n", getBalance());
			return (getBalance());
		}

	}
	public static void cls()
	{
		// (optional) to Clear screen
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
