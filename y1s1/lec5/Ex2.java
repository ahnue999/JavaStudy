import java.util.Scanner;

public class Ex2
{
	public static void main(String [] args)
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
		String name;
		String No;
		double balance;

		// Setters
		public void setName(String s)
		{
			this.name = s;
		}
		public void setNo(String s)
		{
			this.No = s;
		}
		public void setBalance(double d)
		{
			this.balance = d;
		}

		// Getters
		public String getName()
		{
			return (this.name); }
		public String getNo()
		{
			return (this.No);
		}
		public double getBalance()
		{
			return (this.balance);
		}

		public BankAccount(String Name, String number, double Balance)
		{
			this.name = Name;
			this.No = number;
			this.balance = Balance;
		}
		public void BankAccount(String n, String number)
		{
			this.name = n;
			this.No = number;
			this.balance = 0;
		}

		public void deposit(double amount)
		{
			if (amount < 0)
			{
				System.out.printf("UNABLE TO DEPOSIT A MINUS VALUE, CURRENT ACCOUNT BALANCE IS: %.2f%n", getBalance());
				return;
			}
			this.balance += amount;
			System.out.printf("DEPOSIT SUCCECEFUL, CURRENT BALANCE IS: %.2f%n", getBalance());
		}

		public double withdraw(double amount)
		{
			if (amount > getBalance())
			{
				System.out.printf("UNABLE TO WITHDRAW, CURRENT ACCOUNT BALANCE IS: %.2f%n", getBalance());
				return (0);
			}
			this.balance -= amount;
			System.out.printf("WITHDRAW SUCCECEFUL, CURRENT BALANCE IS: %.2f%n", getBalance());
			return (amount);
		}
		public double check()
		{
			System.out.printf("\t###ACCOUNT DETAILS###\n");
			System.out.printf("Account Name: %s%n", getName());
			System.out.printf("Account Number: %s%n", getNo());
			System.out.printf("CURRENT BALANCE IS: %.2f%n", getBalance());
			return (getBalance());
		}

	}
	public static void cls()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
